import java.io.*;

public class Serializator {

    private static final String path = "data.bin";

    public static void serialize(Student student) {
        FileOutputStream fos = null;
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Student deserialize() throws InvalidObjectException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            Student deserializableStudent = (Student) ois.readObject();
            return deserializableStudent;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        throw new InvalidObjectException("Invalid data");
    }

}
