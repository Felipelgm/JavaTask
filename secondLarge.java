package assignment.CodingTasks1;

public class secondLarge {
    public static void main(String[] args) {

        int [] nuns = {10, 25, 15, 34, 80, 28, 5, 50, 18};

        int largest = 1;
        int secondLarge = 0;

        for (int nun : nuns ) {
            if (nun > largest ) {
                secondLarge = largest;
                largest = nun;

            } else if (nun > secondLarge && nun != largest) {
                secondLarge=nun;

            }


        }
        System.out.println("Largest number is "+largest);
        System.out.println("Second Largest number is "+secondLarge);
    }
}
