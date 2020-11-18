public class Square extends Shape {
    private static String name="Square";

    Square() {
        System.out.println("The shape is "+name);
    }
   public void displayArea(){
        System.out.println("Area of Square " + (a*a));
    }

    //Override
    public void weight(){
        System.out.println("overriding example: 4pound");
    }
}
