import java.util.Scanner;
public class Lingkaran{

public static void main(String args[])
{
	Scanner in = new Scanner (System.in);
	double phi, r, luasLingkaran;
	System.out.print ("Masukkan angka a =");
	phi = in.nextDouble();
	System.out.print ("Masukkan angka b =");
	r = in.nextDouble();
	luasLingkaran = phi*r*r;
	System.out.println ("Luas Lingkaran = " + luasLingkaran);
}
}