import java.util.Scanner;

class percabangan{
		public static void main(String arg[]){
			//Mempersiapkan variabel inputan
			Scanner in = new Scanner(System.in);
			//Menampilkan keterangan untuk menginput 
			System.out.print("Masukkan nilai UTS :");
			//Memasukkan nilai yang diinput ke variabel nilai
			int nilai=in.nextInt();
			//jika nilai lebih besar dari 75
			if(nilai >75){
				//Menampilkan keterangan lulus
				System.out.print("Anda lulus ujian");
			}
			//Jika nilai tidak lebih besar dari 75
			else{
					//Menanpilkan keterangan tidak lulus
					System.out.print("Anda tidak lulus ujian");
			}
		}
}