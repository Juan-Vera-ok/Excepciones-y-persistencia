
public class Pruebas {
	
	public static void main(String[] args) 
	{
		SistemaDeArchivo s1=new SistemaDeArchivo(7);
		Texto t1=new Texto("Password",".txt",8,"2 de Mayo",true,"asdf1234");
		Binario b1=new Binario("config", ".bat", 4,"1 de mayo", true, 010100010001);
		Texto t2=new Texto("Contraseña",".txt",8,"2 de Mayo",true,"asdf54321");
		Texto t3=new Texto("email",".txt",8,"2 de Mayo",true,"dododo@gmail.com");
		Texto t4=new Texto("Password",".txt",8,"2 de Mayo",false,"65431qreqwe");
		Texto t5=new Texto("Correo electronico",".txt",8,"2 de Mayo",true,"qwerty@hotmail.com");
		s1.agregarArchivo(t1);
		s1.agregarArchivo(b1);
		s1.agregarArchivo(t2);
		s1.agregarArchivo(t3);
		s1.agregarArchivo(t4);
		s1.agregarArchivo(t5);
		
		try {
		s1.listarArchivo();
		}
		catch(Error2 e) 
		{
			e.printStackTrace();
		}
	}

}
