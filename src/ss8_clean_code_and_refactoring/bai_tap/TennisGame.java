package ss8_clean_code_and_refactoring.bai_tap;

public class TennisGame {
    public static final int ZERO_POINT = 0;
    public static final int ONE_POINT = 1;
    public static final int TWO_POINT = 2;
    public static final int THREE_POINT = 3;
    public static final int FOUR_POINT = 4;

    public static String showScoreAll(int scorePlayer1) {
        String score;
        switch (scorePlayer1) {
            case ZERO_POINT:
                score = "Love-All";
                break;
            case ONE_POINT:
                score = "Fifteen-All";
                break;
            case TWO_POINT:
                score = "Thirty-All";
                break;
            case THREE_POINT:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }

    public static String showAdvantageOrWin(int scorePlayer1, int scorePlayer2) {
        String score;
        int minusResult = scorePlayer1 - scorePlayer2;
        if (minusResult == ONE_POINT) {
            score = "Advantage player1";
        } else if (minusResult == -ONE_POINT) {
            score = "Advantage player2";
        } else if (minusResult >= TWO_POINT) {
            score = "Win for player1";
        } else {
            score = "Win for player2";
        }
        return score;
    }

    public static String showCoreOf1Player(int scorePlayer1, int scorePlayer2) {
        String score= "";
        int tempScore;
        for (int i = ONE_POINT; i < THREE_POINT; i++) {
            if (i == ONE_POINT) tempScore = scorePlayer1;
            else {
                score += "-";
                tempScore = scorePlayer2;
            }
            switch (tempScore) {
                case ZERO_POINT:
                    score += "Love";
                    break;
                case ONE_POINT:
                    score += "Fifteen";
                    break;
                case TWO_POINT:
                    score += "Thirty";
                    break;
                case THREE_POINT:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }


    public static String showResult(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        if (scorePlayer1 == scorePlayer2) {
            score = showScoreAll(scorePlayer1);
        } else {
            boolean score1 = scorePlayer1 >= FOUR_POINT;
            boolean score2 = scorePlayer2 >= FOUR_POINT;
            if (score1 || score2) {
                score = showAdvantageOrWin(scorePlayer1, scorePlayer2);
            } else {
                score = showCoreOf1Player(scorePlayer1, scorePlayer2);
            }
        }
        return score;
    }
}


