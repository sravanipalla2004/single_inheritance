import java.lang.*;
import java.util.Scanner; 
Scanner src=new Scanner(System.in);
class teacher {
    int x;
    void getx(){
       System.out.println("enter x value:");
       x=src.nextInt();
       System.out.println(x);
    }
}
class student {
    int y.total;
    void gety(){
       System.out.println("enter y value:");
       y=src.nextInt();
       System.out.println(y);
    }
    void sum(){
        total=x+y;
        System.out.println("the sum "+x+" and "+y+" is "+total);
    }
}
public class singleinheritance{
    public static void main(String args[]){
        student obj=new student();
        obj.getx();
        obj.gety();
        obj.sum();  
    }
}

