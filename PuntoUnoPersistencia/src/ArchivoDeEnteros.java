import java.io.*;
public class ArchivoDeEnteros 
{
	RandomAccessFile archivo;
	
	public ArchivoDeEnteros(String a) 
	{
		archivoEnteros(a);
	}
	
	
	
	public void archivoEnteros(String nombre)
	{
		try 
		{
			this.archivo=new RandomAccessFile(nombre,"rw");

		}catch(IOException e)
		{System.out.println("No se encuentra el archivo");}
	}
	
	public void agregarEntero(int a) 
	{
		try 
		{
			if(this.archivo.length()>0) 
			{this.archivo.seek(archivo.length());}
				
				this.archivo.writeInt(a);
			
		}catch(IOException e)
		{System.out.println("Error de E/S");
		e.printStackTrace();}
	}
	
	public int leerEntero() 
	{
		int b=0;
		try 
		{
				this.archivo.seek(this.archivo.getFilePointer());
				b=this.archivo.readInt();			
		}catch(IOException e)
		{System.out.println("Error de E/S");}
		return b;
	}
	public long buscarEntero2(int buscado) 
	{
		long b=0;
		long c=0;
		try 
		{
			this.archivo.seek(0);
			while(this.archivo.getFilePointer()<this.archivo.length()) {
				
				b=this.archivo.readInt();
				if(b==buscado) 
				{c=this.archivo.getFilePointer();}
				}
		}catch(IOException e)
		{System.out.println("Error de E/S");}
		
		
		
		return c;}

	public long buscarEntero(int enteroBuscado) 
	{
		long aux=0;
		boolean enc=false;
		try 
		{
			
		this.archivo.seek(0);
		while(this.archivo.getFilePointer()<this.archivo.length()&&enc==false) 
		{
			System.out.println("Entro al bucle while");
			if(enteroBuscado==this.archivo.readInt()) 
			{
				System.out.println("Entro al if");
				aux=(this.archivo.getFilePointer())-4;
				enc=true;
				}else 
					System.out.println("skipeo 4 bytes");
				this.archivo.skipBytes(0);
		}
		}catch(IOException e) 
		{System.out.println("Error de E/S");
			e.printStackTrace();}
		
		if(enc==false) 
		{aux=-1;}
		
		return aux;
	}

	public int calcularPromedio() 
	{
		int promedio=0;
		int count=0;
		try {
			this.archivo.seek(0);
			while(this.archivo.getFilePointer()<this.archivo.length()) 
			{
				promedio=promedio+this.archivo.readInt();
				count=count+1;
			}
			promedio=promedio/count;
		}catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return promedio;
	}
	
	public RandomAccessFile ordenarMenorAMayor() 
	{
		
		try {
			this.archivo.seek(0);
			int dim=(int) (this.archivo.length()/4);
			 int [] a=new int[dim];
			    int temporal = 0;
			    int i=0;
			while (this.archivo.getFilePointer() < this.archivo.length()) {
				
	            a[i]=this.archivo.readInt();
	            i=i+1;
	        }
			System.out.println("Vector numeros");
			for (i = 0; i < dim; i=i+1) 
			{
				System.out.println(a[i]);
			}
			
		
		 
			   

			    for (i = 0; i < a.length; i++) {
			        for (int j = 1; j < (a.length - i); j++) {
			            if (a[j - 1] > a[j]) {
			                temporal = a[j - 1];
			                a[j - 1] = a[j];
			                a[j] = temporal;
			            }
			        }
			    
			}
		        System.out.println("Vector numeros ordenado");
		        for (int i2 = 0; i2 < a.length; i2=i2+1) 
				{
					System.out.println(a[i2]);
				}
			
			
			System.out.println("------------------");
			
			
			this.archivo.seek(0);
			for (int i3 = 0; i3 < a.length; i3=i3+1) 
			{
				this.archivo.writeInt(a[i3]);
			}
			
		}catch (IOException e) 
		{
			System.out.println(e.getCause());
		e.printStackTrace();
		}
		
			return this.archivo;
		}
	
	void cerrar() 
	{
		try {
			this.archivo.close();
		} catch (IOException e) {
			System.out.println("Error de E/S");
			e.printStackTrace();
		}
	}
	protected RandomAccessFile getArchivo() {
		return archivo;
	}



	protected void setArchivo(RandomAccessFile archivo) {
		this.archivo = archivo;
	}

}
