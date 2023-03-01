/**
* OperasiTitik.java 01/03/2023
* Penulis : Vanesya F. W.
* Deskripsi : kelas yang berisi program dari Titik
*
*/

class OperasiTitik {
	private void refleksiSumbuX(Titik titik) {
		double ordinat = titik.getOrdinat();
		ordinat = ordinat *-1;
		titik.setOrdinat(ordinat);
	}
	
	private void refleksiSumbuY(Titik titik) {
		double absis = titik.getAbsis();
		absis = absis *-1;
		titik.setAbsis(absis);
	}

	public Titik refleksiX(Titik titik) {
		refleksiSumbuX(titik);
		return titik;
	}

	public Titik refleksiY(Titik titik) {
		refleksiSumbuY(titik);
		return titik;
	}

}