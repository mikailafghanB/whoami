public class Akhirnya {
		public static void main(String[] args) {
			//Perulangan M
			int nilai=6;
			for (int barisx = 1; barisx <= nilai; barisx++) {
				for(int kolomx=1;kolomx<=nilai;kolomx++){
					if (kolomx==1 || kolomx==6 || (barisx==kolomx&&barisx<4) ||kolomx+barisx==7&&barisx<4)
						System.out.print("M ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			System.out.println();
			//Perulangan Huruf I
			for (int barisx = 1; barisx <= nilai; barisx++) {
				for(int kolomx=1;kolomx<=nilai*2;kolomx++){
					if (kolomx==nilai*2/2 || kolomx==nilai*2/2+1 || barisx==6&&kolomx>=5&&kolomx<=8 || barisx==1&&kolomx>=5&&kolomx<=8)
						System.out.print("I");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
			System.out.println();
			//Perulangan Huruf K
			System.out.println();
			for (int barisx = 1; barisx <= nilai; barisx++) {
				for(int kolomx=1;kolomx<=nilai;kolomx++){
					if (kolomx==1 || kolomx+barisx==5 || kolomx==2&&barisx==4||kolomx==3&&barisx==5||kolomx==4&&barisx==6)
						System.out.print("K ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			//Perulangan Huruf A
			System.out.println();
			for (int barisA = 1; barisA <= 6; barisA++) {
				for(int kolomA=1;kolomA<=11;kolomA++){
					if((barisA==1&&(kolomA>=1&&kolomA<=5)) || (barisA==1&&(kolomA>=7&&kolomA<=11)))
						System.out.print(" ");
					else if((barisA==2&&(kolomA>=1&&kolomA<=4)) || barisA==2&&kolomA==6 || (barisA==2&&(kolomA>=8&&kolomA<=11)))
						System.out.print(" ");
					else if((barisA==3&&(kolomA>=1&&kolomA<=3)) || barisA==3&&(kolomA>=5&&kolomA<=7) || (barisA==3&&(kolomA>=9&&kolomA<=11)))
						System.out.print(" ");
					else if((barisA==4&&(kolomA>=1&&kolomA<=2)) || (barisA==4&&(kolomA>=10&&kolomA<=11)))
						System.out.print(" ");
					else if((barisA==5&&(kolomA>=1&&kolomA<=1)) || barisA==5&&(kolomA>=3&&kolomA<=9) || (barisA==5&&(kolomA>=11&&kolomA<=11)))
						System.out.print(" ");
					else if(barisA==6&&(kolomA>1&&kolomA<11))
						System.out.print(" ");
					else System.out.print("A");
					System.out.print("");
				}
				System.out.println("");
			}
			System.out.print("\n");
        
			//Perulangan Huruf I
			for (int barisx = 1; barisx <= nilai; barisx++) {
				for(int kolomx=1;kolomx<=nilai*2;kolomx++){
					if (kolomx==nilai*2/2 || kolomx==nilai*2/2+1 || barisx==6&&kolomx>=5&&kolomx<=8 || barisx==1&&kolomx>=5&&kolomx<=8)
						System.out.print("I");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
			//Perulangan Huruf L
			System.out.println();
			for (int barisx = 1; barisx <= nilai; barisx++) {
				for(int kolomx=1;kolomx<=nilai;kolomx++){
					if (kolomx==1 || barisx==6 )
						System.out.print("L ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			System.out.println();			
		}    
	}
