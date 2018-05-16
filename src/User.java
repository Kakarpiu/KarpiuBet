import java.util.HashMap;

public class User extends Recorder{

    private static final long serialVersionUID = 00001;
    private String firstName;
    private String lastName;
    private String email;
    private int score;
    private HashMap<Integer, Bet> bets;
    private static Bookie BOOKIE;

    public User(String firstName, String lastName){
        super();
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

    @Override
    public String toString() {
        return firstName + " " + lastName + " email: " + email + " score: " + score;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof User)) return false;
        User u = (User)obj;
        return firstName.equals(u.firstName) & lastName.equals(u.lastName);
    }
}
