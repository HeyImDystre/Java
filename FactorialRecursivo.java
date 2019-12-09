import java.util.Scanner;
 
public class FactorialRecursivo 
{
     
    public static void main(String[] args) 
    {
    int num,opcion; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        System.out.print("Elige una opcion: 2:iterativa 1:recursiva");
     
        opcion=sc.nextInt();
        if(opcion==1)
     {System.out.println("solucion recursiva" +factorial(num));
        }else
         {System.out.println("solucion iterativa"+factorialIT(num));}
            
         if(opcion==3)   
          
            {System.exit(3);
            }
    }

   public static int factorial(int num)
   
   { System.out.println( "Solucion recursiva= ");
        
         if(num == 0){
            return 1;
        }
        else
        {
            {return num * factorial(num-1);
         }
    }
}
    

public static int factorialIT(int num)
    {
      
        for(int i=1;i<=num;i++)
        {
            num=num+i;
        }
    return num;
}
{
    System.exit(3);
}
}
