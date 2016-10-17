import java.util.Scanner;
public class NilaiUjian{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	String[] matkul = {"Progdas","Sisdig","B.Indo","PTIIK","Matkom"};
	String[] nama = new String[6];
	double[][] nilai = new double[12][5];
	int j=0,k=0;
	
		
		for(j=0;j<nilai.length;j++){
			if(j%2==0){
				int a=j/2;
				int b=a+1;
				System.out.print("Input Nama Siswa ke "+b+" Anda : ");
				nama[a]=input.next();
				System.out.println("Input nilai UTS Siswa");
			}else{
				System.out.println("Input nilai UAS Siswa");
			}
			for(k=0;k<nilai[j].length;k++){
				System.out.print("\t"+matkul[k]+" "+j+" "+k+" : " );
				nilai[j][k]=input.nextDouble();
			}
		}
		
		System.out.println("Nama\tMapel\tUTS\tUAS");

		for(j=0;j<nilai.length;j+=2){
			int a=j/2;
			int b=a+1;
			System.out.print(b+"."+nama[a]);
			System.out.println(" ");
			for(k=0;k<nilai[j].length;k++){
				System.out.println("\t"+matkul[k]+"\t"+nilai[j][k]+"\t"+nilai[j+1][k]);
			}
			System.out.println(" ");
		}

	
}

}