/**
* MLingkaran.java 29/03/2023
* Penulis : Vanesya F. W.
* Deskripsi : implementasi cara menghitung luas lingkaran
*
*/


import java.util.Scanner;

public class MLingkaran{
	public static void main(String[] args) {
		
		double jari2;		

		Scanner userInput = new Scanner(System.in);
		System.out.print("Masukkan jejari lingkaran : ");
		jari2 = userInput.nextDouble();

		Lingkaran lingkaran = new Lingkaran(jari2);

		System.out.println("Luas lingkaran : " + lingkaran.hitungLuas());
	} 
}

/**
Apa yang terjadi apabila kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar? Jelaskan!
Jawab : database tidak bisa digunakan karena belum, sebaiknya dibuat menjadi abstrak agar tidak bisa digunakan untuk membuat objek.
*/