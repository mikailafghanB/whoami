public class Ahuruf{
public static void main(String[] args){
for (int barisx=1; barisx<7; barisx++){
for(int kolomx=1; kolomx<7-barisx; kolomx++){
System.out.print(" ");
}for (int kolomx=1;kolomx<=(barisx*2)-1; kolomx++){
if(kolomx==1||kolomx==(barisx*2)-1||barisx==4){
System.out.print("A");
}else {System.out.print("");}
}System.out.println();
}System.out.println("");
}
}

