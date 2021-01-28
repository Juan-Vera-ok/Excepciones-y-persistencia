
public class Document 
{
	public Document(int cantidadHojas) {
		CantidadHojas = cantidadHojas;
	}

	protected int CantidadHojas;

	public int getCantidadHojas() {
		return this.CantidadHojas;
	}

	protected void setCantidadHojas(int cantidadHojas) {
		CantidadHojas = cantidadHojas;
	}
	
}
