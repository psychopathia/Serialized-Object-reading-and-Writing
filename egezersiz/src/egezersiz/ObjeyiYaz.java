package egezersiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {

	public static void main(String[] args) {

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin")) ;
			
			��renci ogrenci1 = new ��renci("Tu�berk Varo�lu",1234,"Bilgisayar M�hendisli�i");
			��renci ogrenci2 = new ��renci ( "Ahmet K�ran", 12345,"Matematik");
			
			out.writeObject(ogrenci1);
			out.writeObject(ogrenci2);

			
		} catch (FileNotFoundException e) {
			System.out.println("dosya bulunamad�");
			
		} catch (IOException e) {
			System.out.println("IOexception olu�tu");
			
		}
			
			
		
	
	}

}
