package com.kenzie.examples.library;
import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;
    ArrayList<String> checkedOutBooks;

    public Library() {
        books = new ArrayList<>();
        checkedOutBooks = new ArrayList<>();
    }

    /**public void addBook(Book book)
     *
     * adds a copy of the given book to the library and makes it available for checkout
     *
     * @param book the Book to be added to the library
     */
    public void addBook(Book book){
        if(books.size() == 0){
            books.add(book);
            return; //there's nothing in the library thus no need to sort;
        }

        //declare outside so not declaring over and over
        String bookTitle = book.getTitle();
        String libraryBookTitle;

        //make sure the book gets added in lexographical order

        for(int i = 0; i < books.size();i++){
            //get the title of the book we're currently looking at
            libraryBookTitle = books.get(i).getTitle();


            //s1.compareTo(s2) => s1 - s2 => neg if s2 greater, pos if s1 greater
            //if booktitle is grater we keep moving, if not put it in.
            if(bookTitle.compareTo(libraryBookTitle) > 0){
                continue; //for clarity
            } else{
                books.add(i,book);
                return;
            }
        }
        //if we got here, it is the lexically greatest, thus put it in at the end
        books.add(book);
        return;
    }

    /** public String[] listBooks()
     *
     * returns a String array of the book titles the library owns in lexical order by title
     *
     * @return The array of book titles in lexical order
     */
    public String[] listBooks(){
        //make a new array of the right size
        String[] returnArray = new String[books.size()];

        //get all the titles for the books in order
        for(int i = 0; i < books.size(); i++){
            returnArray[i] = books.get(i).getTitle();
        }

        return returnArray;
    }

    /** public String[] listBooks(Genre genre)
     *
     * returns a String array of the book titles of the specified genre the library owns in lexical order by title
     *
     * @param genre the genre of books to look for
     * @return The array of book titles of the specified genre in lexical order
     */
    public String[] listBooks(Genre genre){
        //make an array to hold just the genre books
        ArrayList<Book> tempBooks = new ArrayList<>();

        //filter out the genre books
        for(Book book:books){
            if(book.getGenre() == genre){
                tempBooks.add(book);
            }
        }

        //make the array to return the titles
        String[] returnArray = new String[tempBooks.size()];

        //copy over the titles in order
        for(int i = 0; i < tempBooks.size(); i++){
            returnArray[i] = tempBooks.get(i).getTitle();
        }

        return returnArray;
    }

    /** public String[] listAvailableBooks()
     *
     * returns a String array of the book titles currently available in lexical order by title
     *
     * @return The array of available book titles in lexical order
     */
    public String[] listAvailableBooks(){
        //make list to filter out the available books
        ArrayList<String> tempBooks = new ArrayList<>();

        //copy all the book titles into it
        for(Book book:books){
            tempBooks.add(book.getTitle());
        }

        //remove every book that is unavailable
        for(String title:checkedOutBooks){
            tempBooks.remove(title);
        }

        //make the array now that we know the right size
        String[] returnArray = new String[tempBooks.size()];

        //copy over all the book titles
        for(int i = 0; i < tempBooks.size(); i++){
            returnArray[i] = tempBooks.get(i);
        }

        return returnArray;
    }


    /** public String[] listAvailableBooks(Genre genre)
     *
     * returns a String array of the book titles of the specified genre that are available in lexical order by title
     *
     * @param genre the genre of books to look for
     * @return The array of available book titles of the specified genre in lexical order
     */
    public String[] listAvailableBooks(Genre genre){
        //make a list to filter out the availability and genre
        ArrayList<String> tempBooks = new ArrayList<>();

        //filter out the genre and just take the titles
        for(Book book:books){
            if(book.getGenre() == genre) {
                tempBooks.add(book.getTitle());
            }
        }

        //filter out the unavailable ones
        for(String title:checkedOutBooks){
            tempBooks.remove(title);
        }

        //now make the array since we know the right size
        String[] returnArray = new String[tempBooks.size()];

        //now copy over the titles
        for(int i = 0; i < tempBooks.size(); i++){
            returnArray[i] = tempBooks.get(i);
        }

        return returnArray;
    }

    /**public boolean hasBook(String bookTitle)
     *
     * checks if the library owns the book in question
     *
     * @param bookTitle the book title to check for
     * @return true if the library owns the book, false otherwise
     */
    public boolean hasBook(String bookTitle){
        int i = 0;
        String tempTitle;

        //go through all the books and find it if there, stop looking otherwise
        //could have used a better finding algorithm, particularly binary search
        // but I only just thought about it when putting in the comments, too tired to implement now
        while(i < books.size()){
            tempTitle = books.get(i).getTitle();

            if(bookTitle.equals(tempTitle))
                return true;

            i++;
        }
        return false;
    }


    private boolean hasAvailableBook(String bookTitle){
        int i = 0;
        String tempTitle;

        //get the available books
        String[] availableBooks = listAvailableBooks();

        //then do the exact same thing as above
        //could have turned this into a helper method
        // but didn't think about it, then had to help students for three hours.
        while(i < availableBooks.length){
            tempTitle = availableBooks[i];

            if(bookTitle.equals(tempTitle))
                return true;

            i++;
        }
        return false;
    }

    /**public Book checkoutBook(String bookTitle)
     *
     * attempts to check out a book,
     * returns the book if it is available and makes that copy unavailable
     * if not available throws BookNotAvailableExcetion,
     * if the library does not own that book throws BookNotFoundException
     *
     * @param bookTitle the book to be checked out
     * @return the book that was checked out
     * @throws BookNotAvailableException if the book has no available copies
     * @throws BookNotFoundException if the book is not owned by the library
     */
    public Book checkoutBook(String bookTitle) throws BookNotAvailableException,BookNotFoundException{
        //sanity check to make sure we have the book and that it's available
        if(!hasBook(bookTitle)){
            throw new BookNotFoundException(bookTitle);
        } else if(!hasAvailableBook(bookTitle)){
            throw new BookNotAvailableException(bookTitle);
        }

        //make that copy unavailable
        checkedOutBooks.add(bookTitle);

        //find and return the first copy of the book found
        //could have made this more robust but was running out of steam
        // and was not necessary for the project
        for(Book book:books){
            if(book.getTitle().equals(bookTitle)){
                return book;
            }
        }

        //should be impossible to ever get here
        return null;

    }


    /** public void returnBook(Book book)
     *
     * returns the book to the library, makes a copy of the book available
     *
     * @param book the book to be returned
     */
    public void returnBook(Book book){
        //not robust to multiple copies of the same book,
        // but I doubt that was necessary in the first place
        // as there is no way to distinguish between which one is being returned
        checkedOutBooks.remove(book.getTitle());
    }

}