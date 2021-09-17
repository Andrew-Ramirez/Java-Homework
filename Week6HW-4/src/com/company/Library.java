package com.company;

public class Library {
    String address;
    Book[] libraryCatalogue;
    int numBooks;

    // Creates a new Book
    public Library(String address) {
        this.address = address;
        libraryCatalogue = new Book[10];
        numBooks = 0;
    }

    public void addBook(Book newBook) {
        libraryCatalogue[numBooks] = newBook;
        numBooks += 1;
    }

    // Marks the book as rented
    public void borrowBook(String title) {
        for (int i = 0; i < numBooks; i++) {
            if (libraryCatalogue[i].getTitle().equals(title)) {
                if (libraryCatalogue[i].isBorrowed()) {
                    System.out.println("Sorry, the book is already borrowed");
                    return;
                } else {
                    System.out.println("You successfully borrowed " + title);
                    libraryCatalogue[i].borrowed();
                    return;
                }
            }
        }
        System.out.println("Sorry, this book is not in our catalogue");
    }

    public void returnBook(String title) {
        for (int i = 0; i < numBooks; i++) {
            if (libraryCatalogue[i].getTitle().equals(title)) {
                if (libraryCatalogue[i].isBorrowed()) {
                    System.out.println("You successfully returned " + title);
                    libraryCatalogue[i].returned();
                    return;
                } else {
                    System.out.println("This title is not currently being borrowed");
                    return;
                }
            }
        }
        System.out.println("Sorry, this book is not in our catalogue");
    }

    public void printAddress() {
        System.out.println(this.address);
    }

    public void printAvailableBooks() {
        if(numBooks == 0) {
            System.out.println("No books in catalogue");
        }
        else{
            for(int i=0; i<numBooks; i++)
                if(!libraryCatalogue[i].isBorrowed()) {
                    System.out.println(libraryCatalogue[i].getTitle());
                }
        }
    }
}