import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EmployeeDesirlization {
    public static void main(String[] args) {
        try {
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("employee data.txt"));
            Employee emp=(Employee)in.readObject();
            System.out.println("Employee id: "+emp.id+" Employee name: "+emp.name);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
