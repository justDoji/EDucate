package be.doji.course.conditionals;

public class Hosed {

//  public static void main(String[] args) {
//
//    boolean isWorking = doesItWork();
//
//    if (isWorking) {
//      // It works!
//      System.out.println("> Don't mess with it!");
//      System.out.println("> No Problem :)");
//    } else {
//      // It doesn't work
//      boolean youBrokeIt = didYouBreakIt();
//      if (youBrokeIt) {
//        // you broke it
//        System.out.println("> You are HOSED!");
//      } else {
//        // You didn't break it
//        System.out.println("> No Problem :)");
//      }
//    }
//
//    System.out.println("Every time....");
//  }

  public static void main(String[] args) {

    if (doesItWork()) {
      // It works!
      System.out.println("> Don't mess with it!");
      System.out.println("> No Problem :)");
    } else if (didYouBreakIt()) {
      // You broke it
      System.out.println("> You are HOSED!");
    } else {
      // You didn't break it
      System.out.println("> No Problem :)");
    }

    System.out.println("Every time....");
  }

  private static boolean didYouBreakIt() {
    return true;
  }

  private static boolean doesItWork() {
    return false;
  }

}
