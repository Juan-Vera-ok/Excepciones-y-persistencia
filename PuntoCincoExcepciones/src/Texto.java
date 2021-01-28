
public class Texto extends Archivo
{
	protected String contenido;

	public Texto(String nombre, String extension, int tama�o_bytes, String fecha_ultima_modificacion,
			boolean lectura_escritura, String contenido) {
		super(nombre, extension, tama�o_bytes, fecha_ultima_modificacion, lectura_escritura);
		this.contenido = contenido;
	}

	protected String getContenido() {
		return contenido;
	}

	protected void setContenido(String contenido) {
		this.contenido = contenido;
	}
	

}
