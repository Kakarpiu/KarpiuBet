import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Vector;

public class Main {

    public static void main(String[] args){
        Recorder.setRecorderFile(new File("Records"));
//
//        User markar = new User("Marcin", "Karp", "markar@markark.com");
//        User marszc = new User("Marek", "Szcz", "marszc@marszc.com");
//
//        Team polska = new Team("Polska");
//        Team anglia = new Team("Anglia");
//        Team francja = new Team("Francja");
//
//        Calendar match1KickOff = Calendar.getInstance();
//        match1KickOff.set(2018,06,01,20,45);
//        Calendar match2KickOff = Calendar.getInstance();
//        match2KickOff.set(2018,05,01,20,45);
//
//        Match polang = new Match(polska, anglia, LocalDateTime.of(2018,06,01,20,45));
//        Match angfra = new Match(anglia, francja, LocalDateTime.of(2018,05,01,20,45));
//
//        try {
//            Recorder.saveRecords();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Recorder.printRecord(User.class);
//        Recorder.printRecord(Team.class);
//        Recorder.printRecord(Match.class);
//
//        try {
//            Recorder.retriveRecords();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

//        Recorder.printRecord();
//        Vector v = Recorder.getClassRecord(User.class);
//        Recorder.removeFromRecord(User.class, v.get(1));
//
//        try {
//            Recorder.saveRecords();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            Recorder.retriveRecords();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Recorder.printRecord(User.class);

    }
}
