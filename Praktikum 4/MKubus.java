/**
* MKubus.java 01/04/2023
* Penulis : Vanesya F. W.
* Deskripsi : kelas yang mengimplementasikan cara menghitung volume kubus
*
*/

import java.util.Scanner;

class MKubus{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Kubus bs = new Kubus();
		System.out.print("Masukkan sisi kubus : ");
		double sisi = scan.nextDouble();
		System.out.println("Volume kubus dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));
	}
}