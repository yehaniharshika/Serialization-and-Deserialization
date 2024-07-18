package lk.ijse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

// Deserialization
public class deserializationExample {
    public static void main(String[] args) {
        Student student = null;

        try {
            // Reading the object from a file
            FileInputStream fileInputStream = new FileInputStream("student.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // Method for deserialization of object
            student = (Student) objectInputStream.readObject();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException i) {
            throw new RuntimeException(i);

        } catch (ClassNotFoundException e) {
            System.out.println("Student class not found");
            e.printStackTrace();
        }

        System.out.println("deserialized student");
        System.out.println("student data - " + student);
    }
}
