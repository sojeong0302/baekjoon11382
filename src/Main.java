import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        long A;
        long B;
        long C;
        Scanner sc = new Scanner(System.in);
        A=sc.nextLong(); //long형으로 받아야함
        B=sc.nextLong();
        C=sc.nextLong();
        double D=Math.pow(10,12); //int형 불가

        if (A>=1)
        {
            if((C<=D) && (B<=D)) {
                System.out.println(A + B + C);
            }
        }
    }
}