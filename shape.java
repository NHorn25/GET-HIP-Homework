package nolan.s.shapes;

public abstract class Shape implements Printable {
   private String shapeType;
   private String shapeName;

    public String getShapeType(){
        return shapeType;
    }
    public void setShapeType(String type) {
           shapeType = type;
    }
    public String getShapeName(){
       return shapeName;
    }

    public void setShapeName(String name){
       shapeName = name;
    }
    public void printDescription(){
       System.out.println("Type is " + shapeType);
    }
  public abstract double getArea();
}
  package nolan.s.shapes;

public interface Printable {

   public void printDescription();

}
