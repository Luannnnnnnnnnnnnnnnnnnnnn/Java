import static java.lang.Math.*;
import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        double a,b,c,delta;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập a: ");
        a=input.nextDouble();
        System.out.print("Nhập b: ");
        b=input.nextDouble();
        System.out.print("Nhập c: ");
        c= input.nextDouble();
        delta = b*b-4*a*c;
        if (delta<0) {
            System.out.println(" Phương trình vô nghiệm! ");
        } else if(delta==0){
            System.out.println(" Phương trình có nghiệm kép! ");
            System.out.println("x= " +(-b/(2*a)));
        }
        else{
            System.out.println(" Phương trình có 2 nghiệm phân biệt! ");
            System.out.println("x1=" + (-b+sqrt(delta))/(2*a));
            System.out.println("x2=" +(-b-sqrt(delta))/(2*a));
        }
    }
}