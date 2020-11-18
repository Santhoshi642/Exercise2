public class Rectangle extends Shape {
    private static String name="Rectangle";

    Rectangle() {
        System.out.println("The shape is "+name);
    }


    public void displayArea(){
        System.out.println("Area of Rectangle " + (a*b));
    }



    public void shape(){
        System.out.println("Rectangle");
    }

}
