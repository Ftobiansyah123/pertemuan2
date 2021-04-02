import koneksi.Database;
import model.Digimon;
import model.Tamer;
import model.Agen;

public class Main{
	public static void main(String [] args){
		System.out.println("ini progam main");
		Database.hubungkan();
		Digimon.tampilaninfo();
		Tamer.tampilaninfo();
		Agen.tampilaninfo();
}
}