package com.kenzie.examples.mutable;

import java.util.ArrayList;
import java.util.List;

public final class BookShelf {
        public static final String LIBRARY_NAME="XYZ Library";
        private  final int shelfNumber;
        private final List<String> books;


    /**
         * constructor.
         * @param shelfNumber - the shelf identifier
         * @param books - list of books initially on shelf
         */
        public BookShelf(int shelfNumber, List<String> books) {
            this.books = new ArrayList<>();
            addBook("Harry Potter");
            this.shelfNumber = shelfNumber;
         }

        /**
         * Add a book to the shelf.
         * @param book - book to add.
         */
        public void addBook( final String book) {
               books.add(book);
        }

    public static void main(String[] args)
    {
            BookShelf shelf1 = new BookShelf(1,new ArrayList<>());
            System.out.println(shelf1.LIBRARY_NAME);
            BookShelf shelf2 = new BookShelf(2,new ArrayList<>());
            System.out.println(shelf2.LIBRARY_NAME);
            System.out.println("Done");
    }
}
