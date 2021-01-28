public class PruebasPrinter {

	public static void main(String[] args) 
	{
		
		Document d=new Document(20);
		Document d2=new Document(40);
		Document d3=new Document(20);
		
		
		
		ColaDeImpresion ci= new ColaDeImpresion();
		ci.ponerEnCola(d);
		ci.ponerEnCola(d2);
		ci.ponerEnCola(d3);

		ci.ponerEnCola(d2);
		ci.ponerEnCola(d2);
		ci.ponerEnCola(d2);
		
		
		ci.mostrar();
		
		ci.enviarImprimir();
		
		ci.mostrar();
	}
}