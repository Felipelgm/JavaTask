package assignment.CodingTasks1;

public class swapNumbers {
    public static void main(String[] args) {


        int i = 37;
        int x = 53;

        System.out.println("Before swap: i = " + i + ", x = " + x);

        i = i + x;
        x = i - x;
        i = i - x;

        System.out.println("After swap: i = " + i + ", x = " + x);




    }
}
