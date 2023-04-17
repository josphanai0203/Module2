package refactoring;

public class TennisGame {
    private String score = "";
    private int tempScore = 0;

    public String equalScore(String playerName1, String playerName2, int score1, int score2) {
        if (score1 == score2) {
            switch (score1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        }
        return score;
    }

    public String scoreOneToThree(String playerName1, String playerName2, int score1, int score2) {
        for (int point = 1; point < 3; point++) {
            if (point == 1)
                tempScore = score1;
            else {
                score += "-";
                tempScore = score2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    public String scoreThanFour(String playerName1, String playerName2, int score1, int score2) {
        if (score1 >= 4 || score2 >= 4) {
            int minusResult = score1 - score2;
            if (minusResult == 1)
                score = "Advantage player1";
            else if (minusResult == -1)
                score = "Advantage player2";
            else if (minusResult >= 2)
                score = "Win for player1";
            else
                score = "Win for player2";
        }
        return score;
    }

    public String gameOn(String playerName1, String playerName2, int score1, int score2) {

        String pointThanFour = equalScore(playerName1, playerName2, score1, score2);
        String pointOnetoThree = scoreOneToThree(playerName1, playerName2, score1, score2);
        String pointEqual = scoreThanFour(playerName1, playerName2, score1, score2);

        if (score1 == score2) {
            return pointEqual;
        } else if (score1 >= 4 && score2 >= 4) {
            return pointThanFour;
        } else {
            return pointOnetoThree;
        }
    }
    public static void main(String[] args) {
        TennisGame tennis = new TennisGame();
        System.out.println("The Game On is :" + tennis.gameOn("Nam", "Long", 6,
                4));

    }
}
