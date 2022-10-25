package egezersiz;

import java.io.Serializable;

public class Öðrenci implements Serializable{
	private String isim;
	private int numara;
	private String bölüm;
	public Öðrenci(String isim, int numara, String bölüm) {
		super();
		this.isim = isim;
		this.numara = numara;
		this.bölüm = bölüm;
	}
	@Override
	public String toString() {
		String bilgiler="Öðrenci ismi : " +isim +
				"\nÖðrenci numarasý : "+ numara +
				"\nÖðrencinin bölümü : "+ bölüm;
		return bilgiler ;
		
	}
	
	

}
