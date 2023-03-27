import java.io.*;
class Calculator
{
public static void main(String args[])throws IOException
{
float add,subs,multi,divi,val1,val2;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the first value =");
val1 = Float.parseFloat(br.readLine());
System.out.println("Enter the second value =");
val2 = Float.parseFloat(br.readLine());
add = val1 + val2;
subs = val1 - val2;
multi = val1 * val2;
divi = val1 / val2;
System.out.println("Addition ="+add+"\nsubstraction ="+subs+"\nmultiplication ="+multi+"\ndivision ="+divi);
}
}