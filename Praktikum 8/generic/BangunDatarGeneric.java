/**
* BangunDatarGeneric.java 17/05/2023
* Penulis : Vanesya F. W.
* Deskripsi : kelas konstruksi generic untuk BangunDatar
*
*/

public class BangunDatarGeneric<T1234 extends BangunDatar>{
	private T1234 bangunDatar;

	public void set(T1234 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T1234 get(){
		return bangunDatar;
	}

	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}

//Kesimpulan:
//Apabila 'T' diganti dengan karakter lain seperti 'T1' maka hasilnya sama saja
//Sama dengan 'T' diganti dengan karakter lain seperti 'T1234' maka hasilnya sama dengan 'T'
//Simpulan dari hal yang dilakukan, yaitu T hanya untuk memanggil BangunDatar tersebut
//sehingga apabila diganti hasilnya tetap sama, asalkan konsisten penggunaannya