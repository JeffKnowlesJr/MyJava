public class Pythagorean {
  public double CalculateHypotenuse (int legA, int legB) {
    // the hypotenuse is the side across the right angle.
    // calculate the value of c given legA and legB
    double sqA = Math.pow(legA, 2);
    double sqB = Math.pow(legB, 2);
    double sqC = sqA + sqB;
    // calling the sqrt static method of the Math class
    double legC = Math.sqrt(sqC); // C
    return legC;
  }
}
