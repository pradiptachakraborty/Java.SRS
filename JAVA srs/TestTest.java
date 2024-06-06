//Exception Propagation
//=+=+=+=+=+=+=+=+=+=+=+==+=+=+=+==+=+=+=+=+=+=+=+=+=+=+=+==+=+=+=+=+=+=+=
/*class Test{
    public static void doMoreStuff(){
        int x=50/0;
    }
    public static void doStuff(){
        doMoreStuff();
    }
    public static void main(String[] args){
        try{
            doStuff();
        }catch(ArithmeticException ae){
            System.out.println("Caught");
            
        }
        System.out.println("normal flow");
    }
}*/
/*import java.io.*;
class Test{
    public static void main(String[] args){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    }
}*/
/*import java.util.*;
class Intro{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        Collections.addAll(list,30,40,50);
        System.out.println(list);
    }
}*/
/*import java.io.*;
class Test{
    public static void doMoreStuff(){
        throw new IOException("Device Error");
    }
    public static void doStuff(){
        try{
            doMoreStuff();
        }catch(IOException ie){
            System.out.println("Caught");
        }
    }
    public static void main(String[] args){
        doStuff();
        System.out.println("normal flow");
    }
}*/
import java.util.*;
class Intro{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        Collections.addAll(list,30,40,50);
        System.out.println(list);
        list.add(2,60);
        System.out.println(list);
        System.out.println(list.get(1));
        list.set(0,50);
        System.out.println(list);
        list.remove(2);
        System.out.println(list.get(3));
        list.clear();
        System.out.println(list);
    }
}