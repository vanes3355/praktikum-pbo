/**
* MPoligon.java 08/03/2023
* Penulis : Vanesya F. W.
* Deskripsi : driver class untuk poligon dan persegi panjang 
*/

package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args) {
		PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		Segitiga segitiga = new Segitiga(5,5,3);
		persegi.printInfo();
		segitiga.printInfo();
		System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
		System.out.println("Luas Segitiga : "+segitiga.hitungLuas());
	}
}