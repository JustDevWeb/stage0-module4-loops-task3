package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String number = t < 0 ? -t + "0" : t + "0";
        int result = 0;

        for (int i = 0; i < number.length() ; i++){
            result += number.charAt(i) - '0';
        }

        System.out.println(result);
    }
}
