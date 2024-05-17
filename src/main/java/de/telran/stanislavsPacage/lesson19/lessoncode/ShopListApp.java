package de.telran.stanislavsPacage.lesson19.lessoncode;

import de.telran.stanislavsPacage.lesson19.requestResponsesModel.ValidationService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShopListApp {
    public static void main(String[] args) {
        ValidationService validationService = new ValidationService();
        ProductService productService = new ProductService( validationService);

        while (true) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Enter product name: ");
                String name = scanner.nextLine();

                System.out.println("Enter product price: ");
                Double price = scanner.nextDouble();

                Product product = new Product(name, price);
                productService.add(product);

            } catch (ProductValidationException exception) {
                System.out.println("Validation failed ");
                System.out.println(exception.getMessage());
            } catch (NumberFormatException exception) {
                System.out.println("Incorrect number entered");
            } catch (InputMismatchException exception) {
                System.out.println("Incorrect input type entered");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
