import java.util.Scanner;


public class vectores {


   public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

      final int ELEMENTOS = 1000;

      boolean encontrado;

      encontrado = false;

      int tamanyo, opcion, elemento, contador,patata;

      int [] mivector;

      int aux;

      contador=0;

         

      opcion=12;

      System.out.println("indique el tamaño:");

      tamanyo = Integer.parseInt(in.next());

      

      mivector = new int[ELEMENTOS];

      while (opcion !=10){

          System.out.println("gestion del vector");

          mostrarMenu();

          opcion = Integer.parseInt(in.next());

             

           if (opcion==1){

               for (int i = 0;i < tamanyo;i++){

                  System.out.print("introduzca valor para el índice["+i+"]: ");

                  mivector[i]=Integer.parseInt(in.next());

                

               }

           }

     

           if (opcion==2){

               for (int i = 0;i < tamanyo; i++){

                   System.out.print(mivector[i]+",");

               }

             System.out.println("\n");   

           }

         

         if (opcion==3) {

           tamanyo++;

           System.out.println("insertar elemento");

           mivector[tamanyo-1]=Integer.parseInt(in.next());

           System.out.println("Elemento insertado");

         }

        

         if (opcion==4) {

            
             for (int i=0;i<mivector.length;i++) {

                 mivector[i]=0;

             }

             tamanyo=0;

             System.out.println("El vector se ha borrado.");

         }

        

         if (opcion==5) {

             if (tamanyo==0) {

                 System.out.println("El vector esta vacio");

             } else {

                 System.out.println("El vector no esta vacio");

             }

         }

          

         if (opcion==6) {

             System.out.println("introduzca elemento a buscar");

             elemento = Integer.parseInt(in.next());

             contador=0;

             while (!(encontrado) & (contador <tamanyo)){

                  if (mivector[contador]==elemento){

                      encontrado=true;

                      System.out.println("elemento encontrado");

                      System.out.println("posicion:" +contador);

                  }

                  contador++;

             }

             if (encontrado==false){

                 System.out.println("no esta el elemento");

             }

         }

        

         if (opcion==7){

             System.out.println("ordenacion en burbuja");

             if (tamanyo<2){

                 System.out.println("vector ordenado");

             }

             else{

                 for (int i=0;i<tamanyo-1;i++){

                    for  (int j=0;j<tamanyo-1;j++){

                         if (mivector[j]>mivector [j+1]){

                               
                               aux=mivector[j+1];
                               mivector[j+1]=mivector[j];
                               mivector[j]=aux;
                               

                         }

                    }

                }
                for(int i = 0;i < tamanyo; i++)
                {
                    System.out.print(mivector[i]+"\n");
                }

             }

           }

          

           if (opcion==8){
               
                  
                   System.out.println("introduzca elemento a borrar");

             elemento = Integer.parseInt(in.next());

             contador=0;
             encontrado=false;
             while (!(encontrado) & (contador <tamanyo)){

                  if (mivector[contador]==elemento){

                      encontrado=true;

                      System.out.println("elemento encontrado");

                      mivector[contador]=0;

                  }

                  contador++;

             }

             

           }

        }

       }

            

 

        

         private static void mostrarMenu() 

         {

            System.out.println("1:Introducir datos");

             System.out.println("2:Mostrar datos por pantalla");

              System.out.println("3:Insertar un nuevo elemento");

              System.out.println("4:Borrar vector");

              System.out.println("5:Comprobar si el vector esta vacio");

             System.out.println("6:Buscar elemento");

             System.out.println("7:Ordenar vector");

             System.out.println("8:Borrar un elemento");

              System.out.println("10:Salir");

           }    
 }