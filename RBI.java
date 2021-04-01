package JavaOopsPrograms;

public class RBI {  
int getRateOfInterest(){
return 4;}  
}  
class SBI extends RBI{  
int getRateOfInterest()
{
return 7;}  
}  
class ICICI extends RBI{  
int getRateOfInterest(){
return 8;}  
}  
class PNB  extends RBI{  
int getRateOfInterest(){
return 9;}  
}  
class Customer
{
private String name;
public String getName() {
return this.name;
}
}  
class Account
{
private int num;
public int getNum() {
return this.num;
}
}
class Test2{  
public static void main(String args[]){  
RBI r=new RBI();
SBI s=new SBI();  
ICICI i=new ICICI();  
PNB  p=new PNB ();  
Customer c=new Customer();
Account ac=new Account();
System.out.println("RBI Rate of Interest: "+r.getRateOfInterest());
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
System.out.println("PNB  Rate of Interest: "+p.getRateOfInterest());  
System.out.println("Customer Name:"+c.getName());  
System.out.println("Account Number :"+ac.getNum());
}  
}
