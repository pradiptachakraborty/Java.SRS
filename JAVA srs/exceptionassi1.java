//Q#1.Define an exception called NotEqualException that is thrown when a float value is not equals 
//to 3.14 write a program that uses that user defined exception.

import java.util.Scanner;
class NotEqualException extends Exception{
    NotEqualException(String str){
        super(str);
    }
}
class Test1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        float f=sc.nextFloat();
        try{
            if(f!=3.14f){
                throw new NotEqualException("customized exception");
            }
            else{
                System.out.println("Value is equal to 3.14");
            }
        }catch(NotEqualException ne){
            System.out.println(ne);
            System.out.println("Value is not equal to 3.14");
            System.out.println(ne.getMessage());
        }
    }
}