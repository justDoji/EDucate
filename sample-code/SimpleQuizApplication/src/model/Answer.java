package model;

public class Answer {
	
	private String answerText;
	private boolean isCorrect;
	private boolean isSelected;
	
	public Answer(String answerText) {
		this.answerText = answerText;
		this.isCorrect = false;
	}
	
	public Answer(String answerText, boolean isCorrect) {
		this.answerText = answerText;
		this.isCorrect = isCorrect;
	}

	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	
	public boolean isSelected() {
		return this.isSelected;
	}
	
	public void select() {
		this.isSelected = true;
	}
	
	public void unselect() {
		this.isSelected = false;
	}

	public boolean isAnsweredCorrectly() {
		return (isCorrect() && isSelected()) || (!isCorrect() && !isSelected());
	}
}
