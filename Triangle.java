
/**
 * Write a description of class lab6part1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangle
{
    private String name;//-name:String
    private double base;//-base: double
    private double height;

    /**
     * Constructor for objects of class triangle
     */
    public Triangle(){//+methood Triangle
        name = "Unknown";//sets name to Unknown
        base = 0.0; //base to 0.0
        height = 0.0; //height to 0.0
    }

    /**
     * Constructor for objects of class triangle
     */
    public Triangle(String inName,double inBase, double inHeight){//+ Triangle(inName:String,inBase:double,inHeight:double)
        name = inName; // these have to be set to what is in the method that was given above
        base = inBase;
        height = inHeight;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void writeOutput(){//+ writeOutput(): void

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void readInput(){//+ readInput(): void
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setName(String newName){//+ setName(newName:String): void
        name = newName;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setBase(double newBase){//+ setBase(newBase:double): void
        base = newBase;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setHeight(double newHeight){//+ setHeight(newHeight:double): void
        height = newHeight;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    private double getArea(){//- getArea(): double�// instance variables - replace the example below with your own}
        return base*height/2;
    }
    
}
