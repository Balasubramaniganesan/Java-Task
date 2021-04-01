package JavaOopsPrograms;

class Area {
void calculateArea(float x)
{
System.out.println("Area of the square: "+x*x+" sq units");
}
void calculateArea(float x, float y)
{
System.out.println("Area of the rectangle: "+x*y+" sq units");
}
public static void main(String args[]){
Area obj = new Area();
obj.calculateArea(6.1f);
obj.calculateArea(10,22);
}
}

