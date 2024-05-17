package de.telran.stanislavsPacage.lesson19.lessoncode;

import de.telran.stanislavsPacage.lesson19.requestResponsesModel.ValidationService;

public class ProductService {

    private final ValidationService validationService;

    public ProductService(ValidationService validationService) {
        this.validationService = validationService;
    }
    public void  add(Product product) {
        validationService.validation(product);
        System.out.println("SUCCES ADD NEW PRODUCT");
    }
}
