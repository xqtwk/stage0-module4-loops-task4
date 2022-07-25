package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        for (int i = 1, counter = 1; i <= lastPrinted; i++, counter++){
            if (counter == 3){
                counter = 0;
            }
            System.out.println(i);
        }
    }
}
