class CountingValleys{

public static int countingValleys(int steps, String path){
        int level = 0;

        int valleyCount = 0;
        boolean inValley = false;

        for(int i = 0; i < steps; i++){
            char step = path.charAt(i);

            if(step == 'U'){
                ++level;
            }
            else if (step == 'D'){
                --level;
            }

            if(level < 0 && !inValley){
                inValley = true;
            }

            if(level == 0 && inValley){
                ++valleyCount;
                inValley = false;
            }
        }

        return valleyCount;

    }
}