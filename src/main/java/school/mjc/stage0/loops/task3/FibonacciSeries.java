package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int fibonacci = 0;
        int swap = 0;
        int previous = 0;

        for(int i = 0; i < lastFibonacci; i++){
            if(i <= 1) {
               fibonacci = i;
            }else {
                swap = fibonacci;
                fibonacci = fibonacci + previous;
                previous = swap;
            }
        System.out.println(fibonacci);
        }
    }
}
