import java.util.Scanner;
public class Cau5 {
    public static int n;
    public static double giaithua(int n){
        double tmp=1;
        if (n>1) {
            for (int i = 2; i <= n; i++) {
                tmp *= i;
            }
        }
        return tmp;
    }
    public static void main(String[] args) {
        float tong = 0.0f;
        Scanner reader = new Scanner(System.in);
        System.out.print("Nhập n = ");
        n = reader.nextInt();
        for (int i = 1; i <= n; i++) {
            tong+= i/giaithua(i);
        }
        System.out.println("Kết quả của phép tính là: " + tong);
    }
}