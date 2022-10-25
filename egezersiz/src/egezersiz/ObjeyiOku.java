package egezersiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjeyiOku {
	public static void main(String[] args) {
		
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"));
			
			
			��renci ogrenci1 = (��renci)in.readObject();
			��renci ogrenci2 = (��renci)in.readObject();
					
			
			System.out.println("**********************");
			System.out.println(ogrenci1);
			System.out.println("**********************");
			System.out.println("**********************");
			System.out.println(ogrenci2);

			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamad�");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException olu�tu");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("S�n�f bulunamad�");
			e.printStackTrace();
			
		}
	}

}
