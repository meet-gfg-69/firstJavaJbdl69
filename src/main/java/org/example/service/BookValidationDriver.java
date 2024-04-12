package org.example.service;

import org.example.domain.Book;

public class BookValidationDriver {

    public static void main(String[] args) {

        BookValidationService bookValidationService=new BookValidationService();
        Book book=new Book();

//        bookValidationService.bookValidation(book, true);
//        bookValidationService.bookValidation(book, false);
//
//        bookValidationService.bookValidation(book, true);
//
//
//        bookValidationService.bookValidationWithDI(book,new TitleValidator());
//        bookValidationService.bookValidationWithDI(book,new IndexValidator());

        //client 1

        bookValidationService.bookValidationWithDI(book,new TitleValidator(),new SpellValidator2());
        //client 2
        bookValidationService.bookValidationWithDI(book,new TitleValidator(),new IndexValidator(),new SpellValidator2());
    }
}
