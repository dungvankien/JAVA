package exerxiseRefactoring;

public class TennisGame {
    public static String getScore(String playerPeopleOne, String playerPeopleTwo, int peopleScoreOne, int peopleScoreTwo) {
        String score = "";
        int tempScore=0;
        if (peopleScoreOne==peopleScoreTwo)
        {
            switch (peopleScoreOne)
            {
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
        else if (peopleScoreOne>=4 || peopleScoreTwo>=4)
        {
            int minusResult = peopleScoreOne-peopleScoreTwo;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = peopleScoreOne;
                else { score+="-"; tempScore = peopleScoreTwo;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}
