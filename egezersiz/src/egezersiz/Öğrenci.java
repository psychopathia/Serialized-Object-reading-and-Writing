package egezersiz;

import java.io.Serializable;

public class ��renci implements Serializable{
	private String isim;
	private int numara;
	private String b�l�m;
	public ��renci(String isim, int numara, String b�l�m) {
		super();
		this.isim = isim;
		this.numara = numara;
		this.b�l�m = b�l�m;
	}
	@Override
	public String toString() {
		String bilgiler="��renci ismi : " +isim +
				"\n��renci numaras� : "+ numara +
				"\n��rencinin b�l�m� : "+ b�l�m;
		return bilgiler ;
		
	}
	
	

}
