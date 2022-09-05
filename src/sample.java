import javax.management.ValueExp;

public class sample {

    public static void main(String[] args) {
        calculate();
    }

    public static boolean swapValue(boolean value){
        if (value){
            value = false;
            return value;
        }
        value = true;
        return value;
    }

    private static void calculate() {

        boolean onValue[] = new boolean[100];


        // Initialize bulbs and values
        for (int i = 0; i < 100; i++) {
            onValue[i] = false;
        }

        //for (int i = 0; i < 100; i++) {

        int i = 1;
            for (int j = 0; j < 100; j++) {
                if ( ((j+1)%(i+1)) == 0){
                    swapValue(onValue[j]);
                }
            }
        //}

        int tally = 0;

        for (int k = 0; k < 100; k++) {
            if (onValue[k]){
                tally++;
            }
        }
        System.out.println(tally);

        }

    }


