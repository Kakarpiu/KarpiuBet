import java.io.*;
import java.util.Hashtable;
import java.util.Vector;

public abstract class Recorder implements Serializable {


    private static Hashtable<String, Vector> RECORDS = new Hashtable<>();
    private static File RECORDS_FILE;
    private String subClass;

    public Recorder(){
        Vector record = null;
        subClass = this.getClass().getName();

        if(RECORDS.containsKey(subClass))
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

    public static void removeFromRecord(Class key, Object val){
        Vector record = RECORDS.get(key.getName());
        record.remove(val);
    }

    public static void printRecord(){
        for(String s : RECORDS.keySet()) {
            for(Object obj : RECORDS.get(s)){
                System.out.println(obj);
            }
        }
    }

    public static void printRecord(Class c){
        for(Object obj : RECORDS.get(c.getName())){
            System.out.println(obj);
        }
    }

    public static Vector getClassRecord(Class c){
        return RECORDS.get(c.getName());
    }
}
