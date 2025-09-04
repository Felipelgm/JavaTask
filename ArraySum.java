package assignment.CodingTasks1;

public class ArraySum {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60};
        int sum = numbers [0];

        for (int i = 1 ; i< numbers.length; i++ ) {

            if (numbers[i] > numbers.length) {
                sum = (numbers[i]+sum);
            }
        }

        System.out.println("The sum of all array elements is = "+sum);



    }
}
