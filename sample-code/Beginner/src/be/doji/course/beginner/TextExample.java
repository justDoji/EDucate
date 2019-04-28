package be.doji.course.beginner;

public class TextExample {

  public static void main(String[] args) {
    String someText = "Well, hello there!";

    System.out.println("Our text is: " + someText);

    char oneCharacter = 'h';

    int indexOfOurCharacter = someText.indexOf(oneCharacter);
    System.out.println("The index of 'h' is: " + indexOfOurCharacter);
    System.out.println("The character at this index is: " + someText.charAt(indexOfOurCharacter));

    System.out.println("Our text contains \"hello\"? " + someText.contains("hello"));
  }
}
