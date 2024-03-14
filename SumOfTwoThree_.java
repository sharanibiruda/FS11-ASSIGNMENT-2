import java.util.Arrays;

public class SumOfTwoThree {
    public static void main(String[] args) {
        int[] values = {15, 21, 43, 57, 84, 20, 21};
        Arrays.sort(values);
        int secondLargest = values[values.length - 2];
        int thirdLargest = values[values.length - 3];
        int sum = secondLargest + thirdLargest;
        System.out.println("The sum is" + sum);
    }
}
