import java.math.*;

class Biodata{ //nama kelas
//deklarasi variabel
	String Nama;//mendeklarasikan variabel Nama yang bertipe data string
	String Alamat;//mendeklarasikan variabel Alamat yang bertipe data string
	BigInteger Npm;//mendeklarasikan variabel Umur yang bertipe data integer
	Integer Umur;//mendeklarasikan variabel Umur yang bertipe data integer
	
	public String getNama(){ //inisialisasi nilai Nama
		return Nama; //mengembalikan nilai Nama	
	}
	public String getAlamat(){ //inisialisasi nilai Nama
		return Alamat;	//mengembalikan nilai Alamat
	}
	public BigInteger getNpm(){ //inisialisasi nilai Nama
		return Npm;	//mengembalikan nilai Npm
	}
	public Integer getUmur(){ //inisialisasi nilai Nama
		return Umur; //mengembalikan nilai Umur
	}
	
	public void setNama(String a){ //deklarasi set untuk atribut Nama 
		this.Nama=a;	
	}
	public void setAlamat(String b){  //deklarasi set untuk atribut Alamat
		this.Alamat=b;	
	}
	public void setNpm(BigInteger x){ //deklarasi set untuk atribut Npm
		this.Npm=x;	
	}
	public void setUmur(Integer y){ //deklarasi set untuk atribut Umur
		this.Umur=y;	
	}
	
	
	public static void main(String[] args){
	Biodata biodatasaya= new Biodata();
	biodatasaya.setNama("Mochammad Fahrudin"); //mengisi nilai setter Nama
	System.out.print("Nama Anda Adalah :"); //output kalimat
	System.out.println(biodatasaya.getNama()); //memanggil setter Nama dengan getter
	
	biodatasaya.setUmur(15); //mengisi nilai setter Umur
	System.out.print("Umur Anda Adalah :"); //output kalimat
	System.out.println(biodatasaya.getUmur()); //memanggil setter Umur dengan getter
	
	biodatasaya.setAlamat("Depok Timur "); //mengisi nilai setter Alamat
	System.out.print("Alamat Anda Adalah :");//output kalimat
	System.out.println(biodatasaya.getAlamat()); //memanggil setter Alamat dengan getter
	
	biodatasaya.setNpm(new BigInteger("4513210024")); //mengisi nilai setter Npm
	System.out.print("Npm Anda yaitu :");//output kalimat
	System.out.print(biodatasaya.getNpm());	//memanggil setter Npm dengan getter
	}
}