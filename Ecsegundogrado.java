
import java.util.Scanner;

public class segundogrado
{
    public static void main( String[] args )
    {       
            float a, b, c;
          double x1, x2, aux1;
          x1=0;
          x2=0;
          aux1=0;
          
          Scanner teclado = new Scanner( System.in );

          System.out.print( "Introduzca primer número: " );
          a = teclado.nextFloat();
  
          System.out.print( "Introduzca segundo número: " );
          b = teclado.nextFloat();

          System.out.print( "Introduzca tercer número: " );
          c = teclado.nextFloat();
          
            if ((b*b)-(4*a*c)<0)
               {System.out.print("No se puede realizar la operacion");
          }
           else {aux1= Math.sqrt((b*b)-(4*a*c));
               x1= (-b+aux1)/(2*a);
               x2= (-b-aux1)/(2*a);
           }
          if(a==0 ) 

            System.out.print("No se puede realizar la operacion");

            else if (aux1<0)
              System.out.print("No se puede realizar la operacion");
            else {System.out.println("X1= "+x1);
                 System.out.println("X2="+x2);
                }
         
         
         
         
        
    }


}