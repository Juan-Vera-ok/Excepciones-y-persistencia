
public class PrinterException extends Exception
{	
	int paginasImpresas;
	
	int getPaginasImpresas()
	{
		return this.paginasImpresas;
	}
	
	public PrinterException(String a) 
	{
		super(a);
	}
	
	public PrinterException(String a, int b) 
	{
		super(a);
		System.out.println("Se imprimio hasta la hoja "+b);
		this.paginasImpresas=b;
	}
	
	
	
	
	
	
	
}

