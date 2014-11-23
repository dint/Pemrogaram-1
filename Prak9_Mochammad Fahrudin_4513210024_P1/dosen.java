//perintah Class & Object - Dosen
import java.util.*;

public class dosen
{
	String nama;
	String email;
	
	public dosen (String nama, String email)
	{
		this.nama = nama;
		this.email = email;
	}
	
	public dosen () {}
	
	public void info()
	{
	System.out.println("Nama Dosen : "+nama);
	System.out.println("Email : "+email);
	System.out.println("");
	System.out.println("");
	}
}