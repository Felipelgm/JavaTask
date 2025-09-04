package assignment.CodingTasks1;

public class twoDSumEvenOdd {

    public static void main(String[] args) {

        int [][] sums = {
                 {1, 2, 3, 4},
                 {5, 6, 7, 8},
                {9, 10, 11, 12},
        };

        int sumEven = 0;
        int sumOdd = 0;


        for (int i = 0; i<sums.length ; i++ ) {
            for (int x = 0; x< sums[i].length; x++) {

                if (sums [i][x] %2==0)
                {
                    sumEven += sums[i][x];

                }else{
                sumOdd += sums[i][x];
                }

            }
        }
            System.out.println("The sum of even number are " + sumEven);
            System.out.println( "The sum of odds number are " + sumOdd);

    }
}
