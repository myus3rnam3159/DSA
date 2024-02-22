package Java;

import java.util.Scanner;

public class OneDimesionArray2 {
    public static boolean canWin(int leap, int[] game) {
        return canWin(leap, game, 0);
    }
    
    private static boolean canWin(int leap, int[] game, int i) {
        // Kiểm tra điều kiện dừng
        if (i >= game.length) {
            return true; // Đã đến cuối mảng
        } else if (i < 0 || game[i] == 1) {
            return false; // Quay lại hoặc gặp chướng ngại vật
        }
        game[i] = 1; // Đánh dấu đã thăm để tránh lặp
    
        // Kiểm tra các bước tiếp theo có thể
        return canWin(leap, game, i + leap) || canWin(leap, game, i + 1) || canWin(leap, game, i - 1);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();

        while(q-- > 0){
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for(int i = 0; i < n; ++i){
                game[i] = scan.nextInt();
            }
            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
    
}
