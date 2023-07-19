
public class Main {
    public static void main(String[] args) {
      Circle circle=new Circle("Circle");
        System.out.println(circle);

        System.out.println(area(8.0));

    }
    public static double area(double radius){
        double area;
        double Pi=3.142;
        area=Pi=radius*radius;
        return area;
    }
}