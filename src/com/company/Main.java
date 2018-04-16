package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Book> books = new ArrayList<>();
        Book aBook = new Book();
        aBook.setTitle("Book 1");
        aBook.setAvail("Available");


        Book bBook = new Book();
        aBook.setTitle("Book 2");
        aBook.setAvail("Borrowed");

        Book cBook = new Book();
        aBook.setTitle("Book 3");
        aBook.setAvail("Borrowed");

        books.add(aBook);
        books.add(bBook);
        books.add(cBook);

        for(Book eachBook:books){
            System.out.println(eachBook.getTitle());
            System.out.println(eachBook.getAvail());
            System.out.println();
        }
        for(Book eachBook:books){
            if(eachBook.getAvail().equalsIgnoreCase("Available")) {
                //eachBook.setTitle("");
                eachBook.setTitle(eachBook.getTitle());
                eachBook.setAvail("Borrowed");
                books.set(books.indexOf(eachBook), eachBook);


            }

        }
        for(Book eachBook:books){
            System.out.println(eachBook.getTitle());
            System.out.println(eachBook.getAvail());
            System.out.println();
        }
    }
}
