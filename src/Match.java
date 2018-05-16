import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

public class Match extends Recorder{

    private TeamScore home;
    private TeamScore away;
    private LocalDateTime kickOff;

    public Match(Team home, Team away, LocalDateTime kickOff){
        super();
        this.home = new TeamScore(home);
        this.away = new TeamScore(away);
        this.kickOff = kickOff;
    }

    public LocalDateTime getKickOff() {
        return kickOff;
    }

    public void setKickOff(LocalDateTime kickOff) {
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
        return home + " " + away + " " + kickOff.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm"));
    }
}
