

public class Bet {

    private Match match;
    private User better;
    private TeamScore homePrediction = null;
    private TeamScore awayPrediction = null;

    public Bet(Match match, User better){
        this.match = match;
        this.better = better;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Bet)) return false;
        Bet other = (Bet) obj;
        return this.better == other.better && this.match == other.match;
    }

    public void createPrediction(int homeScore, int awayScore){
        if(homePrediction == null ) homePrediction = new TeamScore(match.getHome().getTeam(), homeScore);
        else { homePrediction.setScore(homeScore); }
        if(awayPrediction == null ) awayPrediction = new TeamScore(match.getAway().getTeam(), awayScore);
        else { awayPrediction.setScore(awayScore); }
    }

    @Override
    public String toString() {
        return String.format("{1} prediction for {0} is {2}:{3}",better, match, homePrediction.getScore(), awayPrediction.getScore());
    }
}