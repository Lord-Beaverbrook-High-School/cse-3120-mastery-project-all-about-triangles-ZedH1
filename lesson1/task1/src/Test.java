public class Test {

  public static void main(String[] args) {
    System.out.println("Test");
    Triangle tri = new Triangle();
    Triangle tri2 = new Triangle(27, 12, 13.5);
    Triangle tri3 = new Triangle(9, 7.5, 3.1);
    Triangle tri4 = new Triangle(8.54, 3, 8);
    Triangle tri5 = new Triangle(4, 7.25, 4);
    tri.displayTriangle();
    System.out.println(tri.isTriangle());
    tri2.displayTriangle();
    System.out.println(tri2.isTriangle());
    tri2.setLarge(2 + tri2.getMedium());
    System.out.println(tri2.isTriangle());
    tri2.displayTriangle(); // TEST
    System.out.println("Tri #3 Perimeter: " + tri3.perimeter());
    System.out.println("Tri #3 Area: " + tri3.area());
    System.out.println(tri4.isRightTriangle());
    tri5.displayTriangle();
  }
}
