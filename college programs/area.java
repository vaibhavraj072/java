import java.util.Scanner;
class Areas{

int s;
int f;
int tri(int i, int j)
{
    s=i;
    f=j;
    int c = (s * f) / 2;
   // System.out.println(c);
   return c;
}

int rect(int i, int j)
{
    s=i;
    f=j;
    int c = (s * f);
   // System.out.println(c);
   return c;
}

int sq(int i)
{
    s=i;
    int c = (s * s);
   // System.out.println(c);
   return c;
}

}
public class area {
        public static void main(String args[]){
        
            Scanner sc = new Scanner(System.in); 
            System.out.print("Enter number 1: ");
            int a = sc.nextInt();
            System.out.print("Enter number 2: ");
            int b = sc.nextInt();
            Areas sf = new Areas();
            int c = sf.tri(a,b);
            int d = sf.rect(a,b);
            int e = sf.sq(a);
            System.out.println("Area of Triangle = " + c);
            System.out.println("Area of Rectangle = " + d);
            System.out.println("Area of Square = " + e);
        
    }
}