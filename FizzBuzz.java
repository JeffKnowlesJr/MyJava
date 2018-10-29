public class FizzBuzz {
  public String FizzBuzzLogic(int numbers) {
    // fizzbuzz logic here
    double testDouble = numbers;
    if ((testDouble / 3) % 1 == 0 && (testDouble / 5) % 1 == 0) {
      System.out.println(testDouble + " / 3) % 1 == " + (testDouble / 3) % 1);
      return "FizzBuzz";
    }
    else if ((testDouble / 3) % 1 == 0) {
      return "Fizz";
    }
    else if ((testDouble / 5) % 1 == 0) {
      return "Buzz";
    }
    else {
      String stringified = "" + numbers;
      return stringified;
    }
  }
}
