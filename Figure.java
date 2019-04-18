public abstract class Figure 
{
   public Figure()
   {
      System.out.println("Creating a figure with no parameters.");
   }
  public abstract double area();
   public void erase()
   {
      System.out.println("Call to Figure's erase method.");
   }
   public void draw()
   {
      System.out.println("Call to Figure's draw method.");
    }

   public void center()
   {
      System.out.println("Calling Figure's center method.");
      this.erase();
      this.draw();
   }
}
