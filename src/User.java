import java.util.HashMap;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private int score;
    private HashMap<Integer, Bet> bets;
    private static Bookie BOOKIE;

    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        score = 0;
        this.bets = new HashMap<>();
    }

    public User(String firstName, String lastName, String email){
        this(firstName, lastName);
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getScore() {
        return score;
    }

    public HashMap<Integer, Bet> getBets() {
        return bets;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
