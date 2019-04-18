public class Triangle extends Figure
{
   private int _base;
   private int _height;
   public Triangle()
   {
      System.out.println("Creating Triangle Class with no parameters.");
      _base = 0;
      _height = 0;
   }
   public Triangle(Triangle other)
   {
      System.out.println("Creating Triangle Class from another Triangle.");
      _base = other._base;
      _height = other._height;
   }
   public Triangle(int base, int height)
   {
      System.out.println("Creating Triangle Class given base and height.");
      _base = base;
      _height = height;
   }
   public void draw()
   {
      System.out.println("Calling Triangle's draw method.");
   }
   public void erase()
   {
      System.out.println("Calling Triangle's erase method.");
   }
}
 