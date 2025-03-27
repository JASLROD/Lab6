import java.util.Scanner;
/**
 * The {@code Triangle} class represents a geometric triangle with attributes 
 * for its name, base, and height. It includes methods to modify and retrieve 
 * these values, as well as a method to calculate the area.
 * 
 * <p>This class provides:
 * <ul>
 *   <li>Constructors for creating triangles with default and custom values</li>
 *   <li>Methods to read and write triangle data</li>
 *   <li>Setters for modifying triangle attributes</li>
 *   <li>A method to calculate the triangle's area</li>
 * </ul>
 *
 * @author Jasmin Leonrodriguez
 * @version v1.0
 * @since 3/24/2025
 */
public class Triangle
{
    private String name;//-name:String
    private double base;//-base: double
    private double height;

    /**
     * Constructor for objects of class triangle with default values.
     * The name is set to "Unknown", and both the base and height are set to 0.0.
     */
    public Triangle(){//+methood Triangle
        name = "Unknown";//sets name to Unknown
        base = 0.0; //base to 0.0
        height = 0.0; //height to 0.0
    }

    /**
     * Constructor for objects of class triangle with specified values.
     * 
     * @param inName  the name of the triangle
     * @param inBase  the base length of the triangle
     * @param inHeight  the height of the triangle
     */
    public Triangle(String inName,double inBase, double inHeight){//+ Triangle(inName:String,inBase:double,inHeight:double)
        name = inName; // these have to be set to what is in the method that was given above
        base = inBase;
        height = inHeight;
    }

    /**
     * Outputs relevant information about the object.
     * 
     * to print or display the state of the object to the console or another output stream.
     */
    public void writeOutput(){//+ writeOutput(): void
        System.out.println("\nTriangle name is: " + name);
        System.out.println("Triangle base is: " + base);
        System.out.println("Triangle height is: " + height);
        System.out.printf("Triangle area is: %.1f\n\n", getArea());
    }

    /**
     * Reads input data and assigns it to the object's fields.
     *
     * This method is currently not implemented, but is intended
     * to gather input from the user or another input source.
     */
    public void readInput(){//+ readInput(): void
        
      System.out.print("What is the triangle's name: ");
      Scanner keyboard = new Scanner (System.in);
      name = keyboard.nextLine();
      
      System.out.print("What is the triangle's base: ");
      base = keyboard.nextDouble();
      
      System.out.print("What is the triangle's height: ");
      height = keyboard.nextDouble();
      
    }

    /**
     * Sets the name of the object to the specified value.
     *
     * @param newName The new name to assign to the object.
     */
    public void setName(String newName){//+ setName(newName:String): void
        name = newName;
    }

    /**
     * Sets the base length of the triangle.
     * 
     * @param newBase the new base length of the triangle.
     */
    public void setBase(double newBase){//+ setBase(newBase:double): void
        base = newBase;
    }

    /**
     * Sets the height of the triangle.
     *
     * @param  newHeight the new height of the triangle.
     */
    public void setHeight(double newHeight){//+ setHeight(newHeight:double): void
        height = newHeight;
    }

    /**
     * Calculates and returns the area of a triangle
     * using the formula (base × height) / 2.
     *
     * @return The area of the triangle.
     */
    private double getArea(){//- getArea(): double�// instance variables - replace the example below with your own}
        return base*height/2;
    }

}
