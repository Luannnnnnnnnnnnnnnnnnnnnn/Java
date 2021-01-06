import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số b: ");
        int b = sc.nextInt();
        System.out.print("Nhập số c: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a + " là só lớn nhất");
        } else if (b >= c) {
            System.out.println(b + " là só lớn nhất" );
        } else {
            System.out.println(c + " là só lớn nhất" );
        }

    }
}