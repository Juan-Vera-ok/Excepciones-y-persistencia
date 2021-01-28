import java.lang.*;
public class PruebasPrinter {

	public static void main(String[] args) 
	{
		Printer p=new Printer(0.008,5,true,true);
		Document d=new Document(1);
		Document d2=new Document(4);
		Document d3=new Document(2);
		
		
		
		ColaDeImpresion ci= new ColaDeImpresion();
		ci.ponerEnCola(d);
		ci.ponerEnCola(d2);
		ci.ponerEnCola(d3);

		ci.ponerEnCola(d2);
		ci.ponerEnCola(d2);
		ci.ponerEnCola(d2);
		
		
		
		ci.enviarImprimir();
	}
}