import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable{
    int id;
    String name;

    public Employee(int id,String name){
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {
        try {
            Employee emp=new Employee(1,"Rahul");

            FileOutputStream file=new FileOutputStream("employee data.txt");
            ObjectOutputStream out=new ObjectOutputStream(file);
            out.writeObject(emp);
            out.flush();

            out.close();

            System.out.println("Data has been read from the file");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
