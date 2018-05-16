public class TeamScore extends Recorder{

    private static final long serialVersionUID = 00005;

    private Team team;
    private int score;

    public TeamScore(Team team){
        super();
        this.team = team;
        score = -1;
    }

    public TeamScore(Team team, int score){
        super();
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
        return team + " score: " + score;
    }
}
