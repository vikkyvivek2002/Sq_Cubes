import java.util.Scanner;
class Sq_Cubes
{
 static boolean sq(int n)
{ int a =  (int)Math.sqrt(n);
  return(a*a) == n;
}
 static boolean cu(int n)
{ int b = (int)Math.cbrt(n);
  return (b*b*b) == n;
}
static int result(int n)
{
  int count =0;
for(int i=1;i<= n ;i++)
{  if(sq(i))
    {count++;
    System.out.println(i);}
    else if(cu(i))
{   count++;
   System.out.println(i);}
}
return count;
}

public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("enter a number");
int n = s.nextInt();
System.out.println("The sq and cu of the given number = ");
System.out.println("and the no of sq and cu = " +(result(n)));
}
}