import java.util.Scanner;

public class InputOutput{
	public static void main(String [] args){
Scanner scanner = new Scanner(System.in);
String nama;
int ID;
int jmlhDigimon;

System.out.println("Masukan nama anda:  ");
nama = scanner.nextLine();
System.out.println("HAI!!, "+nama);

System.out.println("masukan nomor ID Tamer anda : ");
ID = scanner.nextInt();

System.out.println("Masukan jumlah Digimon: ");
jmlhDigimon = scanner.nextInt();

System.out.println("====Selamat datang di Battleroyal====");
System.out.println("  =============Biodata============"); 
System.out.println("Nama		: "+nama);
System.out.println("ID		: "+ID);
System.out.println("Jumlah Digimon	: "+jmlhDigimon);
System.out.println("=====================================");

}
}