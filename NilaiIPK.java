import java.util.Scanner;

	public class  NilaiIPK {

		public static void main (String [] args){
		Scanner masukan = new Scanner(System.in);
		System.out.print("Masukkan nilai IPK Mahasiswa = ");
		double nilaiIPK = masukan.nextDouble();

		if (nilaiIPK<4.01 && nilaiIPK>3.50)
		System.out.println("Sangat Memuaskan");
		else if(nilaiIPK<3.51 && nilaiIPK>2.75)
		System.out.println("Memuaskan");
		else if(nilaiIPK<2.76&& nilaiIPK>1.99)
		System.out.println("Baik");
		else if(nilaiIPK<2.00)
		System.out.println("Kurang");
	}
}