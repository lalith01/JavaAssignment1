package test;

import java.util.Scanner;

public class assignment1 {
    interface add{
        public int add(int x,int y);
    }
    interface difference {
        public int difference(int x,int y);
    }
    interface product{
        public int product(int x,int y);
    }
    interface safeDivision{
        public float safeDivision(float x, float y);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        add add = (int x,int y)-> x+y;
        difference difference = (int x,int y) -> x-y;
        product product = (int x,int y)->x*y;
        safeDivision division = (float x, float y)->{
            try{
                if(y == 0){
                    throw new ArithmeticException(); //Throwing The exception

                }
                return x/y;
            }catch (ArithmeticException e)/*catching the exception opbject "e"*/{
                System.out.println("Denominator cannot be zero");
                e.printStackTrace();
            }
            return 0;
        };

        System.out.println(division.safeDivision(15,5));
        System.out.println(add.add(5,7));
        System.out.println(difference.difference(5,7));
        System.out.println(product.product(5,5));
    }
}
