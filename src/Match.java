import java.util.Calendar;

public class Match {

    private TeamScore home;
    private TeamScore away;
    private Calendar kickOff;

    public Match(Team home, Team away, Calendar kickOff){
        this.home = new TeamScore(home);
        this.away = new TeamScore(away);
        this.kickOff = kickOff;
    }

    public Calendar getKickOff() {
        return kickOff;
    }

    public void setKickOff(Calendar kickOff) {
        this.kickOff = kickOff;
    }

    public TeamScore getHome() {
        return home;
    }

    public TeamScore getAway() {
        return away;
    }

    public String getScore(){
        return home.getTeam().getName() + " " + home.getScore() + ":" + away.getScore() + " " + away.getTeam().getName();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Match)) return false;
        Match m = (Match) obj;
        return home.getTeam().equals(m.home.getTeam()) && home.getTeam().equals(m.home.getTeam()) && kickOff.equals(m.getKickOff());
    }

    @Override
    public String toString() {
        return String.format("Home: {0}, Away: {1}, KickOff: {2}", home, away, kickOff);
    }
}
