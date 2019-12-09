import java.util.Scanner;
public class menu
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner (System.in);
      
        int opcion;
    System.out.println("1-Ver la Zubia 2-Ver Cajar 3-Salir   ");
    System.out.println("   Introduzca opcion(1,2,3)");
    opcion=sc.nextInt();
    while(opcion!=3)
    {
        if(opcion==1)
    {System.out.println("  La Zubia Welcome  ");
    }
    if(opcion==2)
    {
        System.out.println("  Cajar Welcome  ");
    }
       System.out.println("  1-La Zubia 2-Cajar 3-Salir  ");
       System.out.println("  Introduzca opcion=");
      
        opcion=sc.nextInt();
    }
}
}
        
       
 