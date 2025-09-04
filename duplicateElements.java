package assignment.CodingTasks1;

public class duplicateElements {
    public static void main(String[] args) {

        String [] cars = {"Corolla", "Civic", "Mustang", "Camaro", "Camaro", "Audi", "Golf", "Civic", "Elantra", "Audi"};

        for (int a = 0 ; a < cars.length ; a++) {

            for (int b = a + 1 ; b < cars.length ; b++) {
                if (cars[a].equals(cars[b])) {
                    System.out.println(cars[a]);
                }

            }
        }


    }
}
