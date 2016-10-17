import java.util.Scanner;
public class Jankenpon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String user = null;
        String cpu = null;
        String hasil = null;
        boolean lanjut=true;
		String cpu1="-";
        
        while(lanjut==true){
        System.out.printf("%s\n%s\n%s\n%s\n%s\n",
                "=======================================",
                "JANKENPON KERTAS - BATU - GUNTING",
                "1. KERTAS  2. BATU  3. GUNTING 4. Exit",
                "=======================================",
                "Pilihan Anda : ");
        try{
            int pilihan = input.nextInt();
            switch(pilihan){
                case 1:
                    user = "KERTAS";
                    break;
                case 2:
                    user = "BATU";
                    break;
                case 3:
                    user = "GUNTING";
                    break;
                case 4:
                    System.exit(0);
                default:
					user = "-";
                    break;
            }
            
            int generate = (int) (Math.random()*3+1);
            switch(generate){
                case 1:
                    cpu = "KERTAS";
                    break;
                case 2:
                    cpu = "BATU";
                    break;
                case 3:
                    cpu = "GUNTING";
                    break;
                default:
                    break;
            }
            
            if(pilihan<1 || pilihan>4)
                System.out.println("Mohon Ulangi!");
            
            else if(user.equals(cpu)){
                hasil = "DRAW";
            } else if(user=="KERTAS" && cpu=="BATU"){
				cpu1= "batu";
                hasil = "Anda Menang";
            } else if(user=="GUNTING" && cpu=="BATU"){
				cpu1= "batu";
                hasil = "Anda Kalah";
            } else if(user=="BATU" && cpu=="KERTAS"){
				cpu1= "KERTAS";
                hasil = "Anda Kalah";
            } else if(user=="GUNTING" && cpu=="KERTAS"){
				cpu1= "KERTAS";
                hasil = "Anda Menang";
            } else if(user=="KERTAS" && cpu=="GUNTING"){
				cpu1= "GUNTING";
                hasil = "Anda Kalah";
            } else if(user=="BATU" && cpu=="GUNTING"){
				cpu1= "GUNTING";
                hasil = "Anda Menang";
            } else if (user=="-"){
				cpu1 = "-";
			}
            
            System.out.printf("%s %s %s %s %s %s",
                        "USER =",user,"CPU =",cpu1,"HASIL =",hasil.toUpperCase());
            System.out.println("");
            System.out.println("");
        }catch(Exception e){
            System.out.println("Input yang anda masukkan Salah");
            break;
        }
        }
    }
}
