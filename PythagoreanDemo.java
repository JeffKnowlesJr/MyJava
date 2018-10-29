public class PythagoreanDemo {
  public static void main(String[] args) {
    Pythagorean triangle = new Pythagorean();
    double lengthC = triangle.CalculateHypotenuse(4,9);
    System.out.println("Leg C is " + lengthC);
  }
}
