package factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        //4! = 1*2*3*4
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number:");
        int n = input.nextInt();
        //int result = getFactorialRecursive(n);
        System.out.println(getFactorialRecursive(n));
    }
    
    static int getFactorial(int number){
        int result = 1;
        for(int i = 1;i <= number; i++){
            result = result * i;
        }
        return result;
    }
    
    static int getFactorialRecursive(int number){
        if(number == 0){
            return 1;
        }else{
            //Θα πολλαπλασιάζει το number με number - 1 μέχρι o number να μηδενιστεί.
            //Με αυτή την ακολουθία, θα έχουμε (έστω number = 4), 4*3*2*1
            return number * getFactorialRecursive(number-1);
        }
    }
    

}
