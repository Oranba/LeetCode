package oran.practice.easy;

public class FizzBuzz {
    /**
     * Prints numbers from 1 to n, but for multiples of three prints "Fizz" instead of the number,
     * and for multiples of five prints "Buzz". For numbers which are multiples of both three and five,
     * prints "FizzBuzz".
     *
     * @param n the upper
     *
        * @return void
        */


    private static void fizzBuzz(int n)
    {
        for( int i = 1; i <= n; i++)
        {
            printFizzBuzz(i);
        }
    }

    private static void printFizzBuzz(int i) {
        if( i % 3 == 0 && i % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else if( i % 3 == 0 ){
            System.out.println("Fizz");
        }
        else if( i % 5 == 0 ){
            System.out.println("Buzz");
        }
        else{
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        fizzBuzz(15);
    }

}
