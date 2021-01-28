import java.util.Vector;
public class SistemaDeArchivo 
{
	/*ATRIBUTOS*/
	Vector archivos;
	int Capacidad_disco_duro;
	char Identificador_disco_duro;
	
	
	public void Capacidad_disco_duro(int a) 
	{this.Capacidad_disco_duro=a;}
	
	public void Identificador_disco_duro(char b)
	{this.Identificador_disco_duro=b;}
	
	
	public SistemaDeArchivo(int a){
		this.archivos=new Vector(a);
	}
	public void agregarArchivo(Archivo f)
	{this.archivos.addElement(f);}
	public boolean eliminarArchivo(String id)
	{
		boolean bandera=false;
		for(int i=0;i<archivos.size();i=i+1) 
		{
			Archivo a=(Archivo)archivos.elementAt(i);
			if(a.getNombre().equals(id))
			{this.archivos.removeElementAt(i);
			bandera=true;}
		}
		return bandera;
	
	}
	public void listarArchivo()
	{
	/*			por cada archivo f en archivos*/
		for(int j=0;j<archivos.size();j=j+1) 
		{
			Archivo f=(Archivo)archivos.elementAt(j);
			try {
			InterfazGrafica.mostrar(f);
			}catch(Error1 e1)
				{System.out.println(e1.getMessage());}
			
		}
	}
		
	

	
	
}
