import java.io.*;

//public class Student extends Person implements Externalizable {
public class Student extends Person {

    private double gpa;
    protected Book book;

//    static final long serialVersionUID = 1L;


    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gpa=" + gpa +
                ", book=" + (book == null ? "" : book.getBookName()) +
                '}';
    }

//    private void readObject(java.io.ObjectInputStream stream) throws IOException, ClassNotFoundException {
//        stream.defaultReadObject();
//        this.setName((String) stream.readObject());
//        this.setAge(stream.readInt());
//    }
//
//    private void writeObject(java.io.ObjectOutputStream stream) throws IOException {
//        stream.defaultWriteObject();
//        stream.writeObject(getName());
//        stream.writeInt(getAge());
//    }

//    @Override
//    public void writeExternal(ObjectOutput out) throws IOException {
//        out.writeObject(getName());
//        out.writeInt(getAge());
//        out.writeDouble(gpa);
//        out.writeObject(book);
//    }
//
//    @Override
//    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//        this.setName((String) in.readObject());
//        this.setAge(in.readInt());
//        this.gpa = in.readDouble();
//        this.book = (Book) in.readObject();
//    }
}
