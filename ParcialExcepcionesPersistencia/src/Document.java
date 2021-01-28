
public class Document 
{
	public Document(int cantidadHojas) {
		CantidadHojas = cantidadHojas;
	}

	protected int CantidadHojas;

	public int getCantidadHojas() {
		return CantidadHojas;
	}

	protected void setCantidadHojas(int cantidadHojas) {
		CantidadHojas = cantidadHojas;
	}
	
}
