import java.util.HashMap;

public class Team {

    private String name;
    private boolean eliminated;

    public Team(String name){
        this.name = name;
        eliminated = false;
    }

    public String getName() {
        return name;
    }

    public boolean isEliminated() {
        return eliminated;
    }

    public void setEliminated(boolean eliminated) {
        this.eliminated = eliminated;
    }
}
