import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Enter student name:");
      String name = reader.readLine();
      System.out.println("Enter student age:");
      int age = Integer.parseInt(reader.readLine());

      s.addStudent(new Student(name, age));

      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }

      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}