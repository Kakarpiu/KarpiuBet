public class TeamScore {

    private Team team;
    private int score;

    public TeamScore(Team team){
        this.team = team;
        score = -1;
    }

    public TeamScore(Team team, int score){
        this.team = team;
        this.score = score;
    }

    public Team getTeam() {
        return team;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("{0} score: {1}", team, score);
    }
}
