package com.Xworkz.External;

import com.Xworkz.Internal.Book;

public class BookDetails extends Book {
    public BookDetails(){

        System.out.println("No Args Book Details Constructor");
    }
    public void price(){
        this.page();
        System.out.println("Book Price");
    }
}
