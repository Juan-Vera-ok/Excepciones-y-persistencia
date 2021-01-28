
public class Archivo 
{
	protected String Nombre;
	protected String Extension;
	protected int Tamaño_bytes;
	protected String Fecha_ultima_modificacion;
	protected boolean lectura_escritura;
	
	public Archivo(String nombre, String extension, int tamaño_bytes, String fecha_ultima_modificacion,
			boolean lectura_escritura) {
		super();
		Nombre = nombre;
		Extension = extension;
		Tamaño_bytes = tamaño_bytes;
		Fecha_ultima_modificacion = fecha_ultima_modificacion;
		this.lectura_escritura = lectura_escritura;
	}

	protected String getNombre() {
		return Nombre;
	}

	protected void setNombre(String nombre) {
		Nombre = nombre;
	}

	protected String getExtension() {
		return Extension;
	}

	protected void setExtension(String extension) {
		Extension = extension;
	}

	protected int getTamaño_bytes() {
		return Tamaño_bytes;
	}

	protected void setTamaño_bytes(int tamaño_bytes) {
		Tamaño_bytes = tamaño_bytes;
	}

	protected String getFecha_ultima_modificacion() {
		return Fecha_ultima_modificacion;
	}

	protected void setFecha_ultima_modificacion(String fecha_ultima_modificacion) {
		Fecha_ultima_modificacion = fecha_ultima_modificacion;
	}

	protected boolean isLectura_escritura() {
		return lectura_escritura;
	}

	protected void setLectura_escritura(boolean lectura_escritura) {
		this.lectura_escritura = lectura_escritura;
	}
	
	
	
	
}
