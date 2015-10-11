package nolan.s.shapes;

public class circle extends Shape implements Printable {

   private int radius;

   public circle(int radius){
       this.radius = radius;

       setShapeType("Circle");
       setShapeName("Circle");
   }

   @Override
   public void printDescription(){

       super.printDescription();
       System.out.println("Radius is " + radius + " units");
   }

  @Override
  public double getArea(){

      return Math.PI * radius * radius;
  }
}
