package simplilearn.java.core.classes;

public class Cuboid
{
   // note - default access modifier is package-private
   // This means that classes inside the same package can access these
   // variables
   int width;
   int height;
   int depth;
   
   public Cuboid(int w, int h, int d)
   {
	   width = w;
	   height = h;
	   depth = d;
   }
   
   public Cuboid(int w, int h)
   {
	   width = w;
	   height = h;
	   depth = 10;
   }
   
   public Cuboid(int dimension)
   {
	   width = dimension;
	   height = dimension;
	   depth = dimension;  
   }
   
   Cuboid()
   {
	   width = 10;
	   height = 10;
	   depth = 10;
   }
   
   int volume()
   {
	   return width *  height * depth;
   }
}
