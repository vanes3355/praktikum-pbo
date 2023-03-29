/**
* Asersi1.java 22/02/2023
* Penulis : Vanesya F. W.
* Deskripsi : program untuk menunjukkan asersi
*
*/

public class Asersi1{
	public static void main(String[] args) {
		int x=0;
		if(x>0) {
			System.out.println("x bilangan positif");
		} else {
			assert(x<0):"ada kesalahan kode";
			System.out.println("x bilangan negatif");
		}
	}
}