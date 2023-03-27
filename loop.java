import java.util.Scanner;
class loop
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n,i,add=0;
System.out.println("Enter value");
n = sc.nextInt();
i = 1;
while(i<=n)
{
add = add + i;
i = i + 1;
}
System.out.println("Addition : "+add);
}
}