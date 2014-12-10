import java.util.Scanner;
import java.util.*;

class dowhile{
	public static void main(String args[]){
	int i=0;
		Scanner in = new Scanner(System.in);
		System.out.print("Masukkan banyak mahasiswa : ");
		int jumlahMhs = in.nextInt();
		in.nextLine();
		List<String> nama = new ArrayList<String>();
		do{
			System.out.print("Masukkan nama :");
			String inputNama = in.nextLine();
			nama.add(inputNama);
			i++;
		}while(i<jumlahMhs);
		
		i=0;
		System.out.println("Daftar-daftar nama Mahasiswa");
		do{
			System.out.println((i+1)+" - "+nama.get(i));
			i++;
		}while(i< jumlahMhs);		
	}
}