import java.io.Serializable;

public class Team extends Recorder{

    private static final long serialVersionUID = 00002;
    private String name;
    private boolean eliminated;

    public Team(String name){
        super();
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
        if(!(obj instanceof Team)) return false;
        Team other = (Team) obj;
        return this.name == other.name;
    }

    @Override
    public String toString() {
        return name;
    }
}
