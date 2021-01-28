import java.io.IOException;

public class main {

   public static void main(String[] args) throws IOException {
   	// declaracion de variables del menu, bucle, etc.
      int opcion;
      ArchivoDeEnteros archent;
   	
   	
      archent = new ArchivoDeEnteros("enteros17.txt");
   	
      do{
         System.out.println("1: Agregar enteros");
      
         System.out.println("2: Mostrar enteros");
      
         System.out.println("3: Buscar un entero");
      
         System.out.println("4: Promedio enteros");
         
         System.out.println("5: Ordenar menor a mayor");
         
         System.out.println("6: Cerrar");
      
         opcion = Console.readInt("OPCION: ");
      
         switch (opcion)
         {
            case 1: 
               {
               //comienzo bucle
               //leer entero por teclado o generar random
               //archent.guardar(entero)
                  int a=Console.readInt("Entero:");
                  archent.agregarEntero(a);
               
               //fin bucle
               }
               break;
            case 2: 
               {
                  archent.getArchivo().seek(0);
                  while(archent.getArchivo().getFilePointer()<archent.getArchivo().length()) {
                     System.out.println(archent.leerEntero());}
               }
               break;
            case 3: 
               {
                  int a=Console.readInt("Ingrese entero a buscar");
                  System.out.println(archent.buscarEntero(a));
               }
               break;
            case 4: 
            {
               System.out.println(archent.calcularPromedio());
            }
            break;
            case 5: 
               {
               
                  archent.ordenarMenorAMayor();
               }
               break;
            case 6: 
               {
               
                  archent.cerrar();
               }
               break;
         
         }
      }while(opcion!=-1);	
   
   }
}


