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

    @Override
    public boolean equals(Object obj){
        if(obj==null || !(obj instanceof Team)) return false;
        Team other = (Team) obj;
        return this.name == other.name;
    }
}
