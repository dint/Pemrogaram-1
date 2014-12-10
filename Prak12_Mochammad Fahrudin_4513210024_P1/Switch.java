import java.util.Scanner;
	public class Switch{
	public static void main(String[] args){
	int nilai;
		Scanner in = new Scanner(System.in);
		//Menampilkan Menu pilihan
		System.out.println("Menu Mahasiswa");
		System.out.println("______________________");
		System.out.println("1. Masukkan Nilai UTS Pemrograman");
		System.out.println("2. Mencetak Nilai UTS Proyek");
		System.out.println("______________________");
		System.out.println(" ");
		
		//Pengguna masukkan nomor pilihan
		System.out.printf("Masukkan Nomer Pilihan : ");
		int Menu = in.nextInt();
		System.out.println("________________________");
		switch(Menu){
		case 1 : System.out.println("Anda memilih nomer 1");
				 System.out.println("Masukkan nilai UTS :");
			     nilai = in.nextInt();
				 if (nilai >75){
				 System.out.println("Ujian Anda lulus");
				 }
				 else{
				 System.out.println("Ujian Anda tidak lulus");
				 }
		break;
		case 2 : System.out.println("Anda memilih nomer 2");
				 System.out.println("Masukkan nilai UTS :");
			     nilai = in.nextInt();
				 if (nilai >65){
				 System.out.println("Ujian Anda lulus");
				 }
				 else{
				 System.out.println("Ujian Anda tidak lulus");
				 }
		default : System.out.println("Menu yang anda pilih tidak ada");
		break;
		}
		
	} 
}