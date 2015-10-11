package nolan.s.shapes;

public abstract class shape implements Printable {
   private String shapeType;
   private String shapeName;

    public String getshapeType(){
        return shapeType;
    }
    public void setshapeType(String type) {
           shapeType = type;
    }
    public String getshapeName(){
       return shapeName;
    }

    public void setshapeName(String name){
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
