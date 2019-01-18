package labs;

/**
 * A program that computes and displays the area and circumference of a circle given the radius
 */
public class Radius {
    //A method that computes the circumference of a circle
    public static double computeCircumference(double radius){
        double pi = 22/7.0;
        double circleCircumference = 2*radius*pi;
        return circleCircumference;
    }
    //A method that computes the area of a circle
    public static double computeArea(double radius){
        double pi = 22/7.0;
        double circleArea = pi*Math.pow(radius,2.0);
        return circleArea;
    }

    public static void main(String[] args) {
        double computation_1 = computeCircumference(5); //Given a radius to find circumference
        double computation_2 = computeArea(5); //Given a radius to find area
        System.out.printf("\nThe circumference of the circle is %.2f %n",computation_1); //Printing the circumference
        System.out.printf("The area of the circle is %.2f %n",computation_2); //Printing the area
    }
}