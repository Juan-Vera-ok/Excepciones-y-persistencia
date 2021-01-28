
public class ColaDeImpresion {
	
	class ColaDeImpresion {

		 Vector cola;

		 Printer HP;

		 ColaDeImpresion () {

		  cola = new Vector ();

		  Printer HP = new Printer();

		}

		 void ponerEnCola (Documento d)

		  { cola.addElement(d);}

		 

		void enviarImprimir() {

		  Document doc = (Document) cola.elementAt(0);

		  cola.remove(0);

		  HP.print (doc);

		 }


		}
	
	

}
