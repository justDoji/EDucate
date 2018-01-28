package model;

import java.util.ArrayList;
import java.util.List;

public class Question {
	
	private List<Answer> possibleAnswers;
	private String question;
	
	public Question(String questionToAsk) {
		this.question = questionToAsk;
		this.possibleAnswers = new ArrayList<>();
	}
	
	public Question(String questionToAsk, List<Answer> answerOptions) {
		this(questionToAsk);
		this.possibleAnswers = new ArrayList<>(answerOptions);
	}
	
	public String getQuestion() {
		return this.question;
	}
	
	public List<Answer> getPossibleAnswers() {
		return new ArrayList<>(this.possibleAnswers);
	}
	
	public boolean isAnsweredCorrectly() {
		boolean allAnsweredCorrectly = true;
		for(Answer answer : possibleAnswers) {
			allAnsweredCorrectly = allAnsweredCorrectly && answer.isAnsweredCorrectly();
		}
		return allAnsweredCorrectly;
	}

	public void addAnswer(String response, boolean isCorrect) {
		this.possibleAnswers.add(new Answer(response, isCorrect));
	}
}
