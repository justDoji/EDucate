package presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Answer;
import model.Question;

public class SimpleQuizGame {

	private static final int CORRECT_SCORE_REWARD = 5;
	private static final int INCORRECT_SCORE_REWARD = 0;
	
	public static void main(String[] args) {
		int score = 0;
		List<Question> questions = createQuestions();
		for(Question question : questions) {
			pollForAnswer(question);
			score +=  question.isAnsweredCorrectly()? CORRECT_SCORE_REWARD :INCORRECT_SCORE_REWARD;
		}
		System.out.println("You finished the game.");
		System.out.println("Your final score is:");
		printScore(score);
		
	}

	private static List<Question> createQuestions() {
		List<Question> questions = new ArrayList<>();
		// TODO Create some questions and answers here
		Question easyQuestion = new Question("What is the first leter of the roman alphabet?");
		easyQuestion.addAnswer("a", true);
		easyQuestion.addAnswer("b", false);
		easyQuestion.addAnswer("c", false);
		easyQuestion.addAnswer("d", false);
		questions.add(easyQuestion);
		return questions;
	}
	
	private static void pollForAnswer(Question question) {
		System.out.println("Your question is:");
		System.out.println(question.getQuestion());
		System.out.println("--------------------");
		System.out.println("The possible answers are:");
		List<Answer> possibleAnswers = question.getPossibleAnswers();
		for(int i = 0; i < possibleAnswers.size(); i++) {
			System.out.println("Option " + (i +1) + ": " + possibleAnswers.get(i).getAnswerText());
		}
		System.out.println("Please type in your answer:");
		Scanner scanner = new Scanner(System.in);
		int selectedAnswer = scanner.nextInt() -1;
		possibleAnswers.get(selectedAnswer).select();
		scanner.close();
	}
	
	private static void printScore(int score) {
		String scoreDisplayText = "| " + score + " |";
		String dashes = "";
		for(; dashes.length() < scoreDisplayText.length(); dashes = dashes + "-");
		System.out.println(dashes);
		System.out.println(scoreDisplayText);
		System.out.println(dashes);
	}

}
