package assignment.CodingTasks1;

public class fibonacciSeries {
    public static void main(String[] args) {

        int number = 10;
        int first = 0;
        int second = 1;

        for ( int x = 1; x <= number; x++) {
            System.out.print(first+" ");

            int next = first + second;
            first = second;
            second = next;
        }


    }
}
