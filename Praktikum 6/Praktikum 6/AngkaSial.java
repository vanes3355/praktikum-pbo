/**
* AngkaSial.java 29/02/2023
* Penulis : Vanesya F. W.
* Deskripsi : program penggunaan eksepsi menggunakan class library Java
*
*/

public class AngkaSial{

	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13) {
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial ");
	}
	
	public static void main(String[] args) {
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase) {
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}	
}


/**
1) Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? 
Jawab : Ya
2) Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
Jawab : Ya
*/