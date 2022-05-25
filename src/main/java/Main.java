import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.reflect.Modifier.*;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student();

        student.setName(null);
        student.setAge(27);
        student.setGpa(4.5);
        student.setBook(null);

        Student student2 = new Student();

        student2.setName("Den");
        student2.setAge(21);
        student2.setGpa(4.1);
        student2.setBook(new Book("MyBook"));

        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student2);

//        System.out.println("Before serialization");
//        System.out.println(student);
//        Serializator.serialize(student);
//
//        Student deserializableStudent = Serializator.deserialize();
//        System.out.println("After serialization");
//        System.out.println(deserializableStudent);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .excludeFieldsWithModifiers(PUBLIC)
//                .disableInnerClassSerialization()
                .serializeNulls()
                .create();

        String jsonStudent = gson.toJson(list);
        System.out.println(jsonStudent);

        ArrayList<Student> fromJson = gson.fromJson(jsonStudent, ArrayList.class);
        System.out.println(fromJson);
    }
}
