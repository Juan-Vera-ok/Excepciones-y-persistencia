
public class InterfazGrafica 
{
	
	
		public static void mostrar (Archivo f) throws Error1, Error2{
		// Muestra un archivo por la pantalla
			
			if(f instanceof Texto) 
				{
				Texto a=(Texto)f;
				System.out.println(a.getNombre());
				System.out.println(a.getContenido());
				System.out.println("------------------");
				} 
			else {f=(Binario)f;}
			if(f instanceof Binario)
			{InterfazGrafica.mensajeError("Error1");
				throw new Error1("No es posible leer Binario");}
			if(!f.isLectura_escritura()) 
			{
				InterfazGrafica.mensajeError("Error2");
				throw new Error2("No tiene permisos de lectura/escritura en el archivo "+f.getNombre());}
			
		// Lanza la excepción Error1 cuando el archivo que se pretende
		//mostrar es binario
		// Lanza la excepción Error2 cuando no puede seguir mostrando
		//archivos
		//...
		}
		public static void mensajeError (String s) 
		{
			System.out.println("Error del tipo " + s);
		}
		
}
