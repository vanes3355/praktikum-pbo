/**
* Titik.java 01/03/2023
* Penulis : Vanesya F. W.
* Deskripsi : kelas yang berisi program utama dari Titik
*
*/

class Titik{

	private double absis;
	private double ordinat;
	static int counterTitik;

	Titik(){
 		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	Titik(double x, double y){
		absis = x;
		ordinat = y;
		counterTitik++;
	}

	public double getAbsis(){
		return absis;
	}

	public double getOrdinat(){
		return ordinat;
	}

	public void setAbsis(double x){
		absis = x;
	}

	public void setOrdinat(double y){
		ordinat = y;
	}

	static int getCounterTitik(){
		return counterTitik;
	}
}