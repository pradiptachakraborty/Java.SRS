/*class MyThread extends Thread{
    int total=0;
    public void run(){
        for(int i=0;i<=100;i++){
            total=total+i;
        }
    }
}
class Test{
    public static void main(String[] args) throws InterruptedException {
        MyThread t=new MyThread();
        t.start();
        Thread.sleep(1000);
        //t.join();
        System.out.println(t.total);
    }
}*/
/*import java.util.Scanner;

public class Roni {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1[i]=sc.next();
                int x[i]=sc.nextInt();
                //Complete this line
            }
            for(int i=0;i<3;i++)
            {
                System.out.println(s1[i]);
            }
            System.out.println("================================");
    }
}*/
// class Test{

// 	/*static method*/
// 	public static void msg(){
// 		System.out.println("Inside msg() method"); //3

// 	}
// 	/*non-static method*/
// 	public void display(){
// 		this.show(); // Dont we need obj and . 
// 		System.out.println("Inside display() method");  // 2
// 		/* I want to call msg() method*/
// 		// How ?
// 		this.msg();

// 	}
// 	/*non-static method*/
// 	public void show(){
// 		System.out.println("Inside show() method");  // 1
// 	}

// 	/*static method*/
// 	public static void main(String[] args){
// 		Test t=new Test();
// 		t.display();
	
// 	}
// }
class Test{
	
	/* non-static method*/
	public void m2(Test x){ 
		System.out.println("Inside m2() method");
	}

	/* non-static method*/
	public void m1(){ 
		System.out.println("Inside m1() method");
		/* I want to call m2()n*/
		m2(this);
	}
	
	/*static method*/
	public static void main(String[] args){
		Test t=new Test();
		t.m1(); 
	}
}


