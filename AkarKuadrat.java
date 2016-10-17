import java.util.Scanner;
public class AkarKuadrat{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Masukkan angka: ");
		int angka = in.nextInt();
		double kuadrat = akarKuadrat(angka);
		System.out.println (" Akar kuadrat dari " + angka + " adalah " + kuadrat);
	}
	public static double akarKuadrat(int angka){
		double kuadrat = Math.sqrt(angka);
		return kuadrat;
	}	
}