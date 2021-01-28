
public class Binario extends Archivo 
{
	protected int contenido;

	public Binario(String nombre, String extension, int tamaño_bytes, String fecha_ultima_modificacion,
			boolean lectura_escritura, int contenido) {
		super(nombre, extension, tamaño_bytes, fecha_ultima_modificacion, lectura_escritura);
		this.contenido = contenido;
	}

	protected int getContenido() {
		return contenido;
	}

	protected void setContenido(int contenido) {
		this.contenido = contenido;
	}
	
	

}
