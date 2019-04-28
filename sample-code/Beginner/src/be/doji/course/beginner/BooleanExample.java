package be.doji.course.beginner;

public class BooleanExample {

  public static void main(String[] args) {
    int number = 5;
    boolean isGreaterThanThree = number > 3;

    boolean isGreaterThanThreeOrEven = number > 3 || number % 2 == 0;
    boolean isGreaterThanThreeAndEven = number > 3 && number % 2 == 0;
    boolean isNotGreaterThanThree = !(number > 3);

    System.out.println(isGreaterThanThree);
    System.out.println(isGreaterThanThreeOrEven);
    System.out.println(isGreaterThanThreeAndEven);
    System.out.println(isNotGreaterThanThree);
  }
}
