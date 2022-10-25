package egezersiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjeyiOku {
	public static void main(String[] args) {
		
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"));
			
			
			Öðrenci ogrenci1 = (Öðrenci)in.readObject();
			Öðrenci ogrenci2 = (Öðrenci)in.readObject();
					
			
			System.out.println("**********************");
			System.out.println(ogrenci1);
			System.out.println("**********************");
			System.out.println("**********************");
			System.out.println(ogrenci2);

			
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya bulunamadý");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException oluþtu");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Sýnýf bulunamadý");
			e.printStackTrace();
			
		}
	}

}
