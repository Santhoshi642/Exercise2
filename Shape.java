abstract public class Shape {


   protected double a=2.1,b=3.5,c=5.5;
   private static String name;

    //abstract method   
    public abstract void displayArea();

    //overloading Polymorphism
        public void displayPerimeter(int l, int b){
            System.out.println("Perimeter of the rectangle is "+((2*l)+(2*b)));
        }

        public void displayPerimeter(int r,double pi){
            System.out.println("Perimeter of the circle is "+(2*pi*r));
        }

        public void displayPerimeter(int l){
            System.out.println("Perimeter of the Square is "+(4*l));
        }

        public void displayPerimeter(int l,int b,int h){
            System.out.println("Perimeter of the triangle is "+(l+b+h));
        }

    //override
    public void shape() {
        System.out.println("shape of base class");
    }

    public void weight(){

        System.out.println("XYZ");
    }


    public static void main(String[] args) {
        Triangle t=new Triangle();
        Rectangle r=new Rectangle();
        Circle c=new Circle();
        Square s=new Square();
        t.shape();
        s.weight();

        t.displayArea(); t.displayPerimeter(4,5,6);
        r.displayArea(); r.displayPerimeter(4,3);
        c.displayArea(); c.displayPerimeter(7,3.14);
        s.displayArea(); s.displayPerimeter(6);


    }

}
