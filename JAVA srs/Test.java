//Method creates the exception object aqnd hand over to jvm
class Test{
    public static void main(String[] args){
        System.out.println(10/0);
    }
}
//Programmar created the exception object and hand over to jvm
/*class arithmeticException extends Exception{
    arithmeticException(){

    }
    public static void main(String[] args){
        throw new arithmeticException();
    }
}*/

//============================================================
/*class MyException extends Exception{
    MyException(String str){
        //super(str);
    }
}
class Test{
    public static void main(String[] args){
        try{
            throw new MyException("MyException occured");

        }catch(MyException mye){
            System.out.println("caught");
            System.out.println(mye);
            System.out.println(mye.getMessage());
            System.out.println(mye.toString());
        }
    }
}*/
//=====================================================================
//ArrayIndexOutOfBoundsException
//===================================================
/*class Test{
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        int[] arr=new int[5];
        System.out.println(arr[5]);
        
    }
}*/