//RectangleComputation
public class RectangleComputation{
    public static void main(String[] args) {
        double height = Integer.parseInt(args[0]);
        double width = Integer.parseInt(args[1]);

        //calc area
        double area = height * width;

        //calc perimeter
        double perimeter = (2*height) + (2*width);

        System.out.println("shape: rectangle");
        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);

        boolean isSquare;

        if (height==width) {
            isSquare = true;
        } else {
            isSquare = false;
        }

        System.out.println("isSquare: " + isSquare);

    }
}