/*
Nota: evidentemente este no es mio, lo adjunto por si a caso
ya que no estoy seguro de si habia que enviarlo tambien :)
*/
import java.util.*;

public class palindromo {

public static void main(String[] args) {
 String s;
 int ini,fin;
 boolean espalin;
 Scanner sc= new Scanner(System.in);
 System.out.print("Introduce una frase (puede tener puntos, comas y espacios): ");
  s=sc.nextLine();

 s=s.replace(" ", "");
 s=s.replace(",", "");
 s=s.replace(".", "");
 s=s.replace(";", "");
 System.out.print(s);
  fin = s.length()-1;
  ini=0;
 espalin=true;

 while((ini < fin)&(espalin))
 {
 if(s.charAt(ini)!=s.charAt(fin)){
 espalin=false;
}
System.out.print("ver espalin:" +espalin);
ini++;
 fin--;
}
 if(espalin)
 System.out.print("\nEs palindromo.");
 else
 System.out.print("\nNo es palindromo.");

}
}