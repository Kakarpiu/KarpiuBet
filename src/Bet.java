import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Bet {

    private int id;
    private Match match;
    private User better;

    public Bet(int id, Match match, User better){
        this.id = id;
        this.match = match;
        this.better = better;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Bet)) return false;
        Bet other = (Bet) obj;
        return this.better == other.better && this.match == other.match;
    }
}