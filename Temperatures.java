package assignment.CodingTasks1;

public class Temperatures {
    public static void main(String[] args) {



        int[] temperatures = {85, 97, 84, 89, 101, 94, 97};


        int highest = temperatures[0];
        int lowest = temperatures[0];


        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > highest) {
                highest = temperatures[i];
            }
            if (temperatures[i] < lowest) {
                lowest = temperatures[i];
            }
        }


        System.out.println("Highest temperature of the week: " + highest);
        System.out.println("Lowest temperature of the week: " + lowest);
    }
}

