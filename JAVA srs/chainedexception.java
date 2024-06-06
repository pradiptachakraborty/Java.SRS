import java.io.IOException;
class ChEx{
    public static void main(String[] args){
        try{
            ArithmeticException ae=new ArithmeticException("/by zero");
            ae.initCause(new IOException("IOException is the actual Cause"));
            throw ae;
        }catch(ArithmeticException ae){
            System.out.println(ae);
            System.out.println("Actual Cause: "+ae.getCause());
        }
    }
}