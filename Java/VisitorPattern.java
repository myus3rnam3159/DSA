package Java;

import java.util.*;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<Tree>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis {
    public abstract int getResult();

    public abstract void visitNode(TreeNode node);

    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    private int leaveValueSum = 0;

    public int getResult() {
        
        return this.leaveValueSum;
    }

    public void visitNode(TreeNode node) {
        return;
        
    }

    public void visitLeaf(TreeLeaf leaf) {
        // implement this
        this.leaveValueSum += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {

    private long redNodeProduct = 1;
    private final int computedModulo = (int) Math.pow(10, 9) + 7;

    public int getResult() {
        return (int) this.redNodeProduct;
    }

    public void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED) {
            this.redNodeProduct = this.redNodeProduct * node.getValue() % this.computedModulo;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.RED) {
            this.redNodeProduct = this.redNodeProduct * leaf.getValue() % this.computedModulo;
        }
    }
}

class FancyVisitor extends TreeVis {

    private int evenDepthNodeSum = 0;
    private int greenLeafSum = 0;

    public int getResult() {
        
        return Math.abs(this.evenDepthNodeSum - this.greenLeafSum);
    }

    public void visitNode(TreeNode node) {
        
        if (node.getDepth() % 2 == 0) {
            this.evenDepthNodeSum += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        
        if (leaf.getColor() == Color.GREEN) {
            this.greenLeafSum += leaf.getValue();
        }
    }
}

public class VisitorPattern {

    private static int [] values;
    private static Color [] colors;
    private static Map<Integer, Set<Integer>> map;

    public static Tree solve() {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        values = new int[n];
        colors = new Color[n];
        map = new HashMap<Integer, Set<Integer>>(n);

        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            colors[i] = scanner.nextInt() == 0 ? Color.RED : Color.GREEN;
        }
        for (int i = 0; i < n - 1; ++i) {

            int u = scanner.nextInt();
            int v = scanner.nextInt();

             Set<Integer> uNeighbors = map.get(u);
            if (uNeighbors == null) {                
                uNeighbors = new HashSet<Integer>();
                map.put(u, uNeighbors);
            }
            uNeighbors.add(v);
            
            /* Edges are undirected: Add 2nd direction */
            Set<Integer> vNeighbors = map.get(v);
            if (vNeighbors == null) {
                vNeighbors = new HashSet<Integer>();
                map.put(v, vNeighbors);
            }
            vNeighbors.add(u);
            
        }
        scanner.close();
        if(n == 1) return new TreeLeaf(values[n-1], colors[n-1], 0);

        TreeNode root = new TreeNode(values[0], colors[0], 0);
        addChildren(root, 1);

        return root;

    }

    private static void addChildren(TreeNode parent, Integer parentNum) {
        /* Get HashSet of children and loop through them */
        for (Integer treeNum : map.get(parentNum)) {
            map.get(treeNum).remove(parentNum); // removes the opposite arrow direction
            
            /* Add child */
            Set<Integer> grandChildren = map.get(treeNum);
            boolean childHasChild = (grandChildren != null && !grandChildren.isEmpty());
            Tree tree;
            if (childHasChild) {
                tree = new TreeNode(values[treeNum - 1], colors[treeNum - 1], parent.getDepth() + 1);
            } else {
                tree = new TreeLeaf(values[treeNum - 1], colors[treeNum - 1], parent.getDepth() + 1);
            }
            parent.addChild(tree);

            /* Recurse if necessary */
            if (tree instanceof TreeNode) {
                addChildren((TreeNode) tree, treeNum);
            }
        }
    }

    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);
        

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
