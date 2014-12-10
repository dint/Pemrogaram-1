import java.util.Scanner;
import java.util.*;

class perulangan{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Masukkan banyak mahasiswa : ");
		int jumlahMhs = in.nextInt();
		in.nextLine();
		List<String> nama = new ArrayList<String>();
		for(int i=0;i<jumlahMhs;i++){
			System.out.print("Masukkan nama :");
			String inputNama = in.nextLine();
			nama.add(inputNama);
		}
		System.out.println("Daftar-daftar nama Mahasiswa");
		for(int i=0;i<jumlahMhs;i++){
			System.out.println((i+1)+" - "+nama.get(i));
		}	
	}
}