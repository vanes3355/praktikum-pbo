/**
* Pegawai.java 09/05/2023
* Penulis : Vanesya F. W.
* Deskripsi : super class
*
*/

public class Pegawai {
	void cetakGaji(String name, double gajiPokok, double tunjangan) {
		String nama=name;
		double gaji = gajiPokok;
		double tunj = tunjangan;
		System.out.println("Nama : "+ name + " , " + "Gaji Pokok : " + gajiPokok + " , " + "Tunjangan : " + tunjangan );
	}

	void cetakGaji2(String name, double gajiPokok, double bonus) {
		String nama=name;
		double gaji = gajiPokok;
		double bns = bonus;
		System.out.println("Nama : "+ name + " , " + "Gaji Pokok : " + gajiPokok + " , " + "Bonus : " + bonus );
	}

}