public class Bet {

    private int id;
    private TeamScore home;
    private TeamScore away;

    public Bet(int id, TeamScore home, TeamScore away){
        this.id = id;
        this.home = home;
        this.away = away;
    }
}