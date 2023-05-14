package case_study;

import java.util.ArrayList;

public class Word {
	private String nameWord;
	private String pronoun;
	private ArrayList<String> noun;
	private ArrayList<String> adjective;
	private ArrayList<String> synonymous;
	private ArrayList<String> verb;

	public Word(String nameWord) {
		super();
		this.nameWord = nameWord;
		this.noun = new ArrayList<>();
		this.adjective = new ArrayList<>();
		this.synonymous = new ArrayList<>();
		this.verb = new ArrayList<>();
	}

	public String getNameWord() {
		return nameWord;
	}

	public void setNameWord(String nameWord) {
		this.nameWord = nameWord;
	}

	public String getPronoun() {
		return pronoun;
	}

	public void setPronoun(String pronoun) {
		this.pronoun = pronoun;
	}

	public ArrayList<String> getNoun() {
		return noun;
	}

	public void setNoun(String modify) {
		this.noun.add(modify);
	}

	public ArrayList<String> getAdjective() {
		return adjective;
	}

	public void setAdjective(String modify) {
		this.adjective.add(modify);
	}

	public ArrayList<String> getSynonymous() {
		return synonymous;
	}

	public void setSynonymous(String modify) {
		this.synonymous.add(modify);
	}

	public ArrayList<String> getVerb() {
		return verb;
	}

	public void setVerb(String modify) {
		this.verb.add(modify);
	}

	public static String arrayToString(ArrayList<String> arr) {
		String result = "";
		boolean checkSentence = false;
		for (String element : arr) {
			if (element == "-s") {
				checkSentence = true;
				continue;
			}
			if (checkSentence) {
				result += "= ";
				checkSentence = false;
			} else {
				result += "- ";

			}
			result += element + "\n";
		}
		return result;

	}

	@Override
	public String toString() {
		String result = "@" + nameWord;
		if (pronoun != null) {
			result += " " + pronoun + "\n";
		} else {
			result += "\n";
		}

		if (noun.size() != 0) {
			String nounResult = arrayToString(noun);
			result += "* Danh từ \n" + nounResult + "\n";
		}
		if (adjective.size() != 0) {
			String adjectiveResult = arrayToString(adjective);
			result += "* Tính từ \n" + adjectiveResult + "\n";
		}
		if (verb.size() != 0) {
			String verbResult = arrayToString(verb);
			result += "* Động từ \n" + verbResult + "\n";
		}
		if (synonymous.size() != 0) {
			String synonymousResult = arrayToString(synonymous);
			result += "* Tương đồng \n" + synonymousResult + "\n";
		}
		return result;
	}

}
