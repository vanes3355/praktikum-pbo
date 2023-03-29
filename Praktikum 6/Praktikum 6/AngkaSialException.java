/**
* AngkaSialException.java 29/02/2023
* Penulis : Vanesya F. W.
* Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
*
*/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan masukkan angka 13 karena angka sial !!!");
	}
}