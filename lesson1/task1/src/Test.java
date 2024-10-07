public class Test {

  public static void main(String[] args) {
    System.out.println("Test");
    Triangle tri = new Triangle();
    Triangle tri2 = new Triangle(27, 12, 13.5);
    Triangle tri3 = new Triangle(9, 7.5, 3.1);
    Triangle tri4 = new Triangle(8.54, 3, 8);
    Triangle tri5 = new Triangle(4, 7.25, 4);
    tri.displayTriangle();
    tri2.displayTriangle();
  }
}
