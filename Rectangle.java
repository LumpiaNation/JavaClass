public class Rectangle extends Figure
{
   private int _width;
   private int _height;
   public Rectangle ()
   {
      System.out.println("Creating Rectangle Class with no parameters.");
      _width = 0;
      _height = 0;
   }
   public Rectangle(Rectangle other)
   {
      System.out.println("Creating Rectangle Class from another " 
			 + "Rectangle.");
      _width = other._width;
      _height = other._height; 
   }

   public Rectangle(int width, int height)
   {
      System.out.println("Creating Rectangle Class given width and " +
			 "height.");
      _width = width;
      _height = height;
   }
public double area()
   {
		return (_height * _width);
	}
   public void draw()
   {
      System.out.println("Calling Rectangle's draw method.");
   }
   public void erase()
   {
      System.out.println("Calling Rectangle's erase method.");
   }

}
