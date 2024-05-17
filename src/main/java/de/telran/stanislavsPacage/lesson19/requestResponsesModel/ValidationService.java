package de.telran.stanislavsPacage.lesson19.requestResponsesModel;

import de.telran.stanislavsPacage.lesson19.lessoncode.Product;
import de.telran.stanislavsPacage.lesson19.lessoncode.ProductValidationException;

public class ValidationService {

    /*
  проверка на:

 - продукт name не null
 - длина названия продукта меньше 3 символов
 - цена не null
 - цена продукта меньше 0

   */
    public void validation(Product product) {

        if (product.getName() == null) {
            throw  new ProductValidationException("Product name is null");
        }if (product.getName().length() < 3) {
            throw  new ProductValidationException("Product name langht less than 3 characters");
        }if (product.getPrice() == null) {
            throw  new ProductValidationException("Product price is null");
        }if (product.getPrice() < 0 ){
            throw  new ProductValidationException("Product price less than 0");
        }

    }
}
