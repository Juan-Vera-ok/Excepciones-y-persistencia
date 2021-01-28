import java.util.Vector;
public class ColaDeImpresion 
{

	 Vector cola;

	 Printer HP;

	 ColaDeImpresion () {

	  this.cola = new Vector ();

	  this.HP = new Printer(10, 7,true , true);

	}

	 void ponerEnCola (Document d)

	  { this.cola.addElement(d);}

	 void mostrar() {
		 for(int i=0;i<cola.size();i=i+1) {
		 System.out.println(this.cola.elementAt(i));
		 }
		 
	 }
	 

	void enviarImprimir() {
		
		while(!cola.isEmpty()) {
		
		Document doc = (Document) this.cola.elementAt(0);
		
		  

		  this.cola.remove(0);
		
		
		
	  try {
		  this.HP.print(doc);
	} catch (PrinterException e) {
		e.printStackTrace();
		Vector log = new Vector();
		
		int dim=cola.size();
			
		Document logAux[]=new Document[dim];
		
		for(int i=0;i<dim;i=i+1) 
		{
			logAux[i]= (Document) cola.elementAt(i);
		}
		
		for(int i=0;i<dim;i=i+1) 
		{
			log.addElement(logAux[i]);
			System.out.println("Documento "+i+" guardado");
			System.out.println(log.elementAt(i));
		}
	}
		
		//log=(Vector) cola.clone();
		
		
		}

	 }}


