package udemy.shop.applications;

import java.util.Locale;
import java.util.Scanner;

import udemy.shop.entities.Product;
public class Program{
    public static void main(String[] args){
        
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       Product product = new Product();

       System.out.println("Enter product data: ");
       System.out.print("Name: ");
       product.name = sc.nextLine();
       System.out.print("Price: ");
       product.price = sc.nextDouble();
       System.out.print("Quantity in stock: ");
       product.quantity = sc.nextInt();

       sc.close();
    }
}