package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if(first != 0 && second != 0){
            int divisor = 0;
            for(int i = 1; i <= first && i <= second; i++){
                if(first % i == 0 && second % i == 0){
                    divisor = i;
                }
            }
            System.out.println(divisor);
        }else {
            System.out.println(first + second);
        }
    }
}
