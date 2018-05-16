import java.io.*;
import java.util.Hashtable;
import java.util.Vector;

public class Recorder implements Serializable {

    private static Hashtable<Class, Vector> RECORDS;
    private static File RECORDS_FILE;
    private Class subClass;

    public Recorder(String filePath){
        Vector record = null;
        subClass = this.getClass();

        if(RECORDS.contains(subClass))
            record = RECORDS.get(subClass);
        else {
            record = new Vector();
            RECORDS.put(subClass, record);
        }

        record.add(this);
    }

    public static File getRecorderFile() {
        return RECORDS_FILE;
    }

    public static void setRecorderFile(File recorderFile) {
        RECORDS_FILE = recorderFile;
    }

    public static void saveRecords() throws IOException{
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(RECORDS_FILE)
        );
        out.writeObject(RECORDS);
    }

    public static void retriveRecords() throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(RECORDS_FILE)
        );
        RECORDS = (Hashtable) in.readObject();
    }

    public void removeFromRecords(Object o){
        Vector record = RECORDS.get(subClass);
    }
}
