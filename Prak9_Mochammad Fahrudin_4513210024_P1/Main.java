//perintah Class & Object - DemoClassObject1
import java.util.*;

	public class Main
	{
	public static void main(String[]args)
	{
	Mahasiswa.jumlah = 0;
	//Mahasiswa.nim = "999"; 
	//error, instance variabel harus ada objectnya terlebih dahulu
		System.out.println("Jumlah Mahasiswa : "+Mahasiswa.jumlah);
		
		Mahasiswa m1 = new Mahasiswa();
		m1.nim = "123";
		m1.nama = "Mochammad ";
		m1.jumlah = 1;
		
		Mahasiswa m2 = new Mahasiswa ();
		m2.nim = "456";
		m2.nama = "Fahrudin";
		m2.jumlah = 2;
		
		tampilkanMahasiswa(m1);
		tampilkanMahasiswa(m2);
		System.out.println("Jumlah Mahasiswa	: "+Mahasiswa.jumlah);
		}
		
		public static void tampilkanMahasiswa(Mahasiswa m)
		{
			System.out.println("NIM		: "+m.nim);
			System.out.println("Nama		: "+m.nama);
			System.out.println("Jumlah		: "+m.jumlah);
			System.out.println("");
			System.out.println("");
		}
	
	}
