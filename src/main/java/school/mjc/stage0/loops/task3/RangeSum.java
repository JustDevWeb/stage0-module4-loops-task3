package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
        for(int iterator = firstBoarder; iterator <= secondBoarder; iterator++){
            sum += iterator;
        }
        System.out.println(sum);
    }
}
