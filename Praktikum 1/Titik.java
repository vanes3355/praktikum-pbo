/**
* Titik.java 22/02/2023
* Penulis : Vanesya F. W.
* Deskripsi : kelas yang berisi program utama dari Titik
*
*/

class Titik{

	double absis;
	double ordinat;
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

	double getAbsis(){
		return absis;
	}

	double getOrdinat(){
		return ordinat;
	}

	void setAbsis(double a){
		absis = a;
	}

	void setOrdinat(double o){
		ordinat = o;
	}

	static int getCounterTitik(){
		return counterTitik;
	}
}