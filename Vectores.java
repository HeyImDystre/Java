  
import java.util.*;
class Gvector{
  public static void main(String arg[]){
   Scanner in = new Scanner(System.in);
   final int ELEMENTOS = 1000;
   boolean encontrado;
   encontrado = false;
   int tamaño, opcion, elemento, contador,patata;
   int [] mivector;
   int aux;
   contador=0;
   
   opcion=12;
   System.out.println("indique el tamaño");
   tamaño = Integer.parseInt(in.next());
   //elemento = Integer.parseInt(in.next());
   mivector = new int[ELEMENTOS];
   while (opcion !=10){
        System.out.println("gestion del vector");
         mostrarMenu();
       opcion = Integer.parseInt(in.next());
       
   if (opcion==1){
       for (int i = 0;i < tamaño;i++){
           System.out.println("introduzca valor:");
           mivector[i]=Integer.parseInt(in.next());
        }
  }
  if (opcion==2){
      for (int i = 0;i < tamaño; i++){
           System.out.print(mivector[i]+",");
        }
  }
  if (opcion==3) {
    tamaño++;
    System.out.println("insertar elemento");
    mivector[tamaño-1]=Integer.parseInt(in.next());
    System.out.println("Elemento insertado");
  }
   if (opcion==4) {
       borrarVector(tamaño);
       //tamaño=0;
          
    }
    if (opcion==5) {
      if (tamaño==0) {
          System.out.println("El vector esta vacio");
        }else System.out.println("El vector no esta vacio");
       } 
    
    if (opcion==6) {
    
      System.out.println("introduzca elemento a buscar");
      elemento = Integer.parseInt(in.next());
       contador=0;
      while (!(encontrado) & (contador <tamaño)){
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
      if (opcion==7)
      {System.out.println("ordenacion en burbuja");
          if (tamaño<2)
          {System.out.println("vector ordenado");
            }else{
            for (int i=0;i<tamaño;i++){
                for  (int j=0;j<tamaño;j++){
                    if (mivector[j]>mivector [j+1]){
                        aux=mivector[j];
                           mivector[j]=j+1;
           }
         }
       }
      }
    }
    
     if (opcion==8){
         System.out.println("Procedimiento de borrar un elemento");
         System.out.println("Introduzca elemento a borrar: ");
         elemento = Integer.parseInt(in.next());
         while (!(encontrado) & (contador <tamaño)){
           if (mivector[contador]==elemento){
        
            encontrado=true;
           }
            contador++;
            //elemento=0;
            
        }
        if (!encontrado){
                System.out.println("El elemento no esta");
            }else{
                System.out.println("El elemento esta");
                while(contador<tamaño){
                    //mivector[contador]=mivector[contador+1];
                    contador++;
                }
                tamaño --;
                int nuevoelemento=elemento-1;
                nuevoelemento=0;
                
                //mivector[contador-1]=0;
            }            
    }
 }
}
      

  
  private static void mostrarMenu()  
  {
     System.out.println("1:introducir datos");
      System.out.println("2:mostrar datos por pantalla");
       System.out.println("3:insertar un nuevo elemento");
       System.out.println("4:borrar vector");
       System.out.println("5:comprobar si el vector esta vacio");
      System.out.println("6:buscar elemento");
      System.out.println("7: ordenar elemento");
      System.out.println("8: borrar un elemento");
       System.out.println("10:salir");
    }     
  private static void borrarVector(int talla)
     { talla=0;
    }
}
