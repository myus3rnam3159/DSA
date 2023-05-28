class Pangrams{
    public static String pangrams(String s){

        boolean[] alphabet = new boolean[26];
        s = s.toLowerCase();

        int count = 0;
        for(int i = 0; i < s.length(); ++i){

            char c = s.charAt(i);
            if(Character.isLetter(c)){

                int enumChar = c - 'a';
                if(!alphabet[enumChar]){

                    alphabet[enumChar] = true;
                    ++count;
                }

                if(count == 26){
                    return "pangram";
                }
            }
        }
        return "not pangram";
    }
}