//Q#2:Define a customized exception class which checks the age of person. If age is not
//withing 18-60 years, it will throw an exception.
import java.util.Scanner;
class AgeNotMatchedException extends Throwable{
    AgeNotMatchedException(String str){
        super(str);
    }
}
class Test2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        try{
            if(age<18 || age>60){
                throw new AgeNotMatchedException("Age must be between 18 to 60 years.");
            }
            System.out.println("Age saved successfully");
        }catch(AgeNotMatchedException anm){
            System.out.println(anm);
        }
    }
}