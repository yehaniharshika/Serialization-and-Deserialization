<h2>Serialization And Deserialization In Java</h2>

<b>Introduction</b>

Serialization is a mechanism of converting the state of an object into a byte stream, allowing the object to be easily saved to a file, transmitted over a network, or stored in memory. 
Deserialization is the reverse process, converting the byte stream back into a copy of the original object. These processes are fundamental in Java for enabling object persistence and data interchange.


<b>Benefits</b>

1.	Communication - It is mainly used to travel object's state on the network.
2.	Persistence - Objects can be stored in a persistent storage like files or databases.
3.	Caching - Serialized objects can be cached for later use, improving application performance.
4.	Deep copy - Serialization and deserialization can be used to create deep copies of objects.

<b>Mechanism of Serialization and Deserialization</b>

Serialization in Java is implemented using the Serializable interface. 
Classes that need to support serialization must implement this interface. 
The ObjectOutputStream and ObjectInputStream classes are used to perform the actual serialization and deserialization.

•	Serialization steps

I.	Implement Serializable interface<br>
II.	Create ObjectOutputStream - An ObjectOutputStream is created to write the object to an output stream.<br>
III.	Serialize object - The writeObject() method of ObjectOutputStream is used to serialize the object.

•	Deserialization steps

I.	Create ObjectInputStream: An ObjectInputStream is created to read the object from an input stream.<br>
II.	Deserialize object – use readObject() method

<b>Example Code Snippet and Hypothetical Scenario</b>

considering the case of saving student records to a file and later retrieve them. The Student class represents the student records, which include the student's name, age, and grade. We will serialize a Student object to a file and then deserialize it to demonstrate the mechanism.

As first, Create the Student Class and implements  serializable interface.

![Screenshot (19)](https://github.com/user-attachments/assets/0704c109-7d5f-4e01-8e6e-79f55ef510e9)


As second Serialize the Student Object - In this, A Student object is created and serialized to a file named "student.ser".
For this,
-	A FileOutputStream is created to write to the file student.ser.
-	An ObjectOutputStream is created to handle the serialization.
-	The writeObject() method of ObjectOutputStream serializes the student object and writes it to the file "student.ser".



  
As third, Deserialize the Student Object - In this step, the Student object is deserialized from the file "student.ser".
For this,
-	A FileInputStream is created to read from the file student.ser.
-	An ObjectInputStream is created to handle the deserialization.
-	The readObject() method of ObjectInputStream deserializes the student object from the file student.ser.

For the complete code and further details, visit the GitHub repository. I implement Serialization and Deserialization completely.
https://github.com/yehaniharshika/Serialization-and-Deserialization.git


