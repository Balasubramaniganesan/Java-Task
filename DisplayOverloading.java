package JavaOopsPrograms;

public class DisplayOverloading {
void disp(int num,char c)
{
System.out.println(num+" "+c);
}
void disp(char c, int num)  
{
System.out.println(c + " "+num);
}
}
class Sample
{
public static void main(String args[])
{
DisplayOverloading obj = new DisplayOverloading();
obj.disp(10,'a');
obj.disp('a',10);
}
}
