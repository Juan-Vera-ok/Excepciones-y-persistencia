import java.util.*;
public class ColaDeImpresion 
{

	
	 Vector cola;

	 Printer HP;

	public ColaDeImpresion () 
	 {

	  this.cola = new Vector ();

	  this.HP = new Printer(10, 19,true , true);
	 }
	

	

	void ponerEnCola (Document d)

	  { this.cola.addElement(d);}

	 void mostrar() {
		 for(int i=0;i<cola.size();i=i+1) {
		 System.out.println(this.cola.elementAt(i));
		 }
		 }
		 
		 
		 
		 void enviarImprimir() 
		 {
			 int diez=0;
			  Document doc = (Document) cola.elementAt(0);
			  diez=(int) (doc.getCantidadHojas()*0.1);
			  this.cola.remove(0);
			  try {
				  
			  this.HP.print (doc);  
			  }
			  catch(PrinterException p)
			  {
				  if(p.getPaginasImpresas()<diez) 
				  {
					  this.cola.addElement(doc);
				  }
				  p.getMessage();
				  p.printStackTrace();
			  }
			 }
		 
	 }

