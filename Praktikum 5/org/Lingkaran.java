/**
* Lingkaran.java 29/03/2023
* Penulis : Vanesya F. W.
* Deskripsi : kelas implementasi IArea berupa cara menghitung luas lingkaran
*
*/



/**
mengambil konstanta yang ada di kelas java.lang.Math
*/
import static java.lang.Math.PI;

public class Lingkaran {
	private double jejari;

	public Lingkaran(double r){
		jejari = r;
	}

	public double hitungLuas(){
		return PI*jejari*jejari;
	}
}
