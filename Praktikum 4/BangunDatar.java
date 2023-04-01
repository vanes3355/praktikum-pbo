/**
* BangunDatar.java 29/03/2023
* Penulis : Vanesya F. W.
* Deskripsi : kelas abstrak berisi abstraksi bangun datar
*
*/

public abstract class BangunDatar{
	protected double luas;

	public abstract double hitungLuas(double sisi);

	public void setLuas(double l){
		luas = l;
	}
	
	public double getLuas(){
		return luas;
	}
}
