/**
* Payroll.java 09/05/2023
* Penulis : Vanesya F. W.
* Deskripsi : mainclass
*
*/

public class Payroll {
	public static void main(String[] args) {
		Pegawai manajer = new Manajer();
		Pegawai programmer = new Programmer();
		manajer.cetakGaji("Mira", 5000000, 700000);
		programmer.cetakGaji2("Joko", 5000000, 450000);
		manajer.cetakGaji("Argo", 5000000, 700000);
	}
}