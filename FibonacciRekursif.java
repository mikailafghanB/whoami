import java.util.Scanner;
public class FibonacciRekursif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Berikan Batas Deret Fibbonaci: ");
        int deret = in.nextInt();
        for(int i = 0; i <= deret; i++) {
            int x = countFibbo(i);
            System.out.print(x+" ");
        }
    }
    public static int countFibbo(int n){
        int hitung;
        if (n==0)
            return 0;
        if (n==1)
            return(1);
        else
            hitung = countFibbo(n-1) + countFibbo(n-2);
        return hitung;
    }   
}