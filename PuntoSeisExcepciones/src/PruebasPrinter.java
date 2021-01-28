import java.lang.*;
public class PruebasPrinter {

	public static void main(String[] args) 
	{
		Printer p=new Printer(0.008,5,true,true);
		Document d=new Document(5);
		
		try {
			p.print(d);
			}
		catch(PrinterException pr)
		{
			System.out.println("Se produjo un error del tipo "+ pr.getClass().getName());
			System.out.println(pr.getMessage());
		
		}
		
		
		/*csaldivia@uarg.unpa.edu.ar

		 * 
		 * 
		 * public static void burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
		}*/
		
	}

}
