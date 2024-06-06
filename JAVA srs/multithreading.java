/*class MyThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }
}
class Main{
    public static void main(String[] args){
        MyThread t=new MyThread();
        //t.start();
        t.run();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}*/
/*class  MyThread extends Thread{
    public void start(){
        super.start();
        System.out.println("Start method");//1 1 2
    }
    public void run(){
        System.out.println("Run Method()");//3 2 1
    }
}
class Main{
    public static void main(String[] args){
        MyThread t=new MyThread();
        t.start();
        System.out.println("Main method");//2 3 3
    }
}*/
/*class MyThread extends Thread{
    public void start(int x){
        super.start();
        System.out.println("int arg start method");
    }
    public void run(){
        System.out.println("Run method");
    }
}
class Main{
    public static void main(String[] args){
        MyThread t=new MyThread();
        t.start(5);
        System.out.println("Main method");
    }
}*/
/*class MyRunnable implements Runnable{
   public void run() {
	   for(int i=0;i<50;i++) {
		   System.out.println("MyRunnable.run()");
	   }
   }
}
class Test{
    public static void main(String[] args) {
    	MyRunnable r=new MyRunnable();
    	
    	Thread t=new Thread(r);
    	t.start();
    	for(int i=0;i<50;i++) {
 		   System.out.println("Main method");
 	   }
    }
}*/
/*class MyRunnable implements Runnable{
    public void run(){
        System.out.println("Child thread");
    }
}
class Main{
    public static void main(String[] args){
        System.out.println()
    }
}*/
//change thread name from main to Pradipta
//=================================================================
/*class MyThread extends Thread{

}
class Main{
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Pradipta");
        System.out.println(Thread.currentThread().getName());
        Thread t=new Thread();
        System.out.println(t.getName());
        Thread t1=new Thread();
        System.out.println(t1.getName());
    }
}*/
//Set priorities of Thread
//=================================================
class MyThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Kohli Thread");
        }
    }
}
class Main{
    public static void main(String[] args){
        //System.out.println(Thread.currentThread().getPriority());
        MyThread t= new MyThread();
        t.setPriority(10);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Dhoni thread");
        }
        
        //System.out.println(t.getPriority());
    }
}