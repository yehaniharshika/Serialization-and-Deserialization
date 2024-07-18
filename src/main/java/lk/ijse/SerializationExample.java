package lk.ijse;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args) {
        Student student = new Student("Yehani",12,"A");
        String filename = "student.ser";

        //serialization
        try {
            //Saving of object in a file
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // Method for serialization of object
            objectOutputStream.writeObject(student);
            System.out.println("Serialized data is saved in student.ser");
            System.out.println(student);
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
