/**
* MapTest.java 17/05/2023
* Penulis : Vanesya F. W.
* Deskripsi : program yang menggunakan Generic untuk pasangan Kunci-Nilai
*
*/
import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		//kunci -> integer, nilai -> string
		Map<Integer,String> map = new HashMap<Integer,String>();
		//menempatkan elemen kunci dan nilai
		map.put(1, "satu");
		map.put(3, "tiga");
		map.put(10, "sepuluh");
		map.put(14, "empat belas");
		//mengambil elemen-elemen
		System.out.println("1 = "+map.get(1));
		System.out.println("3 = "+map.get(3));
		System.out.println("10 = "+map.get(10));
		System.out.println("14 = "+map.get(14));
		//mengambil keseluruhan kunci sebagai objek collection set
		Set<Integer> key = map.keySet();
		//bagaimana iterasi untuk mengambil keseluruhan nilai dari kunci? tulis pada laporan
		//petunjuk : gunakan iterasi seperti program ArrayListTest
	}
}

//Tugas:
// 1 = satu
// 3 = tiga
// 10 = sepuluh
// 14 = empat belas