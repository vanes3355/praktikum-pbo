/**
* LambdaHashmap.java 06/06/2023
* Penulis : Vanesya F. W.
* Deskripsi : program untuk serialisasi objek Map berisi key (NIM) dan value (nama mhs)
*
*/

import java.util.Map;
import java.util.HashMap;

public class LambdaHashmap {
	public static void main(String[] args) {
		//key sebagai NIM dan value sebagai nama mahasiswa
		Map<String, String> mapmhs = new HashMap<>();
		mapmhs.put("12345", "Adi");
		mapmhs.put("12354", "Nia");
		mapmhs.put("12355", "Dina");

		//lambda digunakan sebagai parameter untuk menampilkan key dan value
		mapmhs.forEach((nim, nama) -> System.out.println("NIM: "+nim+", Nama: "+nama));
	}
}