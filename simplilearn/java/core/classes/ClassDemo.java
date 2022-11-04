package simplilearn.java.core.classes;

public class ClassDemo
{
   public static void classDemoMain()
   {
	   
	   
	   enrollStudent();
	   printCubeVolumes();
	  
	   
   }
   
   public static void printCubeVolumes()
   {
	   
	   
	   Cuboid stdCuboid = new Cuboid(10, 20, 15);
	   System.out.println("User Defined Cube: - Volume: " + stdCuboid.volume());
	   
	   Cuboid defaultDepthCuboid  = new Cuboid(10, 20);
	   // see how we directly access depth - which has the default 
	   // modifier of package-private
	   System.out.println("Cube Default Depth Is: " + defaultDepthCuboid.depth); 
	   System.out.println("User Defined Cube: - Volume: " + defaultDepthCuboid.volume());
	   
	   
	   Cuboid cube10 = new Cuboid(10);
	   System.out.println("User Defined Cube: - Volume: " + cube10.volume());

	   Cuboid defaultCuboid = new Cuboid();
	   System.out.println("CLASS Defined Default Cube: - Volume: " + defaultCuboid.volume());

	   
   }
   
   public static void enrollStudent()
   {
	   
	   Student testStudent = new Student();
	   
	   // demonstrates the fact that in java, an int is automatically initialized to Zero!
       System.out.println(testStudent.age);
	   
	   Student john = new Student("John Smith",  22,  "192 Short Horse, Miami, Florida");
	   //System.out.println(john.toString());

       System.out.println(john.getName() + " from " + john.getAddress() + ", age " + john.getAge() + " - has been enrolled!" );
       john.setAddress("The Dorms Closet To the Brickyard,  NC State");
       System.out.println("John now lives at: " + john.getAddress());
       
       
   }
}
