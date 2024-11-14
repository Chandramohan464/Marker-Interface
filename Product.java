import java.util.Scanner;

public class Product implements Cloneable{
    int pid;
    String pname;
    double pcost;

    public Product(int pid,String pname,double pcost){
        this.pid=pid;
        this.pname=pname;
        this.pcost=pcost;
    }

    public void showDetails(){
        System.out.println("Product ID: "+pid);
        System.out.println("Product Name: "+pname);
        System.out.println("Product Cost: "+pcost);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Product Id: ");
        int pid=scan.nextInt();
        System.out.print("Enter the Product Name: ");
        String pname=scan.next();
        System.out.print("Enter the Product Cost: ");
        double pcost=scan.nextDouble();

        Product product=new Product(pid, pname, pcost);
        Product product2=(Product)product.clone();
        
        product2.showDetails();

        scan.close();
    }
}