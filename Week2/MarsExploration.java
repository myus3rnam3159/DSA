public class MarsExploration {
    public static int marsExploration(String s){
        int changedLetters = 0;
        for (int i = 0; i < s.length(); i += 3) {
            if (s.charAt(i) != 'S') {
                changedLetters++;
            }
            if (s.charAt(i + 1) != 'O') {
                changedLetters++;
            }
            if (s.charAt(i + 2) != 'S') {
                changedLetters++;
            }
        }
        return changedLetters;
    }
}
