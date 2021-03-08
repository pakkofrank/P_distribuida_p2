package problema1;

public class App
{
    public static void main( String[] args )
    {
        Polygon myRect = new Rectangle(3.5f, 2.2f);
        Polygon myCircle = new Circle(2.7f);
        Polygon mySquare = new Square(3.6f);


        System.out.println("-RECTANGLE- " + "sides: " + myRect.getSides() + " ," + " area: " + myRect.getArea());
        System.out.println("-CIRCLE- " +  "sides: " + myCircle.getSides() + " ," + " area: " + myCircle.getArea());
        System.out.println("-SQUARE- " +  "sides: " + mySquare.getSides() + " ," +  " area: " + mySquare.getArea());


    }
}