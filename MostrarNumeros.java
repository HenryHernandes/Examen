import java.util.*;
public class MostrarNumeros {
public static void main(String [] args){
Scanner n=new Scanner(System.in);

int n1,n2;
System.out.println("introdusca el primer numero");
n1=n.nextInt();
System.out.println("introdusca el segundo numero");
n2=n.nextInt();

while (n1<n2){ 
n1++;
System.out.println(n1+"");
}

}
}