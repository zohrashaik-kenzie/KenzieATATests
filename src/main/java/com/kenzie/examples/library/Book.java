package com.kenzie.examples.library;

import java.util.ArrayList;
import java.util.Arrays;

public class Book {
    private String title;
    private String author;
    private Genre genre;
    private ArrayList<String> pages;
    private int currentPageNumber;


    //would normally put in default constructor but was told the class had to match exactly on public functions.

    public Book(String title, String author, Genre genre, String[] pages) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        //get the passed in array as a list then turn that list into an arrayList
        this.pages = new ArrayList<String>(Arrays.asList(pages));
        this.currentPageNumber = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getCurrentPageNumber() {
        return currentPageNumber;
    }

    public int getNumPages() {
        return pages.size();
    }

    /**
     * public String nextPage()
     * <p>
     * if possible increments the currentPageNumber and returns the new page
     * if not possible (at the end of the book) does not increment the page number and returns null
     *
     * @return either the next page or null if there are no more pages to return
     */
    public String nextPage() {
        //considered throwing an exception for trying to read past the end of the book
        // but as I'm not supposed to add any more public facing classes, went for returning null instead.
        //And apparently the tests expect null as the correct solution

        if (currentPageNumber >= pages.size() - 1) {
            return null;
        }

        currentPageNumber++;
        return pages.get(currentPageNumber);
    }

    /**
     * public String nextPage()
     * <p>
     * if possible decrements the currentPageNumber and returns the new page
     * if not possible (at the beginning of the book) does not decrement the page number and returns null
     *
     * @return either the previous page or null if there are no more pages to return
     */
    public String prevPage() {
        if (currentPageNumber <= 0) {
            return null;
        }

        currentPageNumber--;
        return pages.get(currentPageNumber);
    }


    /**
     * public String openPage(int pageNumber)
     * <p>
     * if pageNumber is valid sets currentPageNumber to pageNumber and returns the page specified by pageNumber
     * returns null if the specified page does not exist for this book.
     *
     * @param pageNumber the page number to open. Should be positive and less than the number of pages
     * @return returns the specified page if valid for the book, null otherwise
     */
    public String openPage(int pageNumber) {
        if (pageNumber < 0 || pageNumber >= pages.size()) {
            return null;
        }

        currentPageNumber = pageNumber;
        return pages.get(currentPageNumber);
    }

    /**
     * public String tearOutCurrentPage()
     * <p>
     * tears out the current page if there is one to tear out.
     * removes the current page if valid and rearranges the pages to the new page order
     * currentPageNumber will point to the next valid page or will be set to the previous page if no next exists
     * returns the page ripped out or null if the book has no pages
     *
     * @return the current page or null if there are no pages to tear out
     */
    public String tearOutCurrentPage() {
        if (pages.size() == 0) {
            return null;
        }

        //get the page that will no longer exist
        String pageToReturn = pages.get(currentPageNumber);

        //remove the page from the book
        pages.remove(currentPageNumber);

        //check if we're past the new end of the book, if so decrement the currentPageNumber
        if (currentPageNumber == pages.size()) {
            //only decrement if we're not pointing to the first page (the only page)
            if (currentPageNumber > 0) {
                currentPageNumber--;
            }
        }

        return pageToReturn;
    }


    /**
     * public int getPercentComplete()
     * <p>
     * returns the percent of the book that the current page is,
     * returns percent 0 to 100, floors to the nearest percent
     * if there are no pages in the book, returns 100
     *
     * @return the int percent that the current page is of the book
     */
    public int getPercentComplete() {
        if (pages.size() == 0) {
            return 100;
        }

        //this is what the test cases are expecting,
        //even though it is not correct math for percents as it is not
        // consistent with normal calculations
        return (100 * currentPageNumber) / (pages.size() - 1);

        //the correct way would be one of the following
        //  return (100 * currentPageNumber)/pages.size();
        //  or
        //  return (100 * (currentPageNumber+1))/pages.size();
        //the first accounting for the reader being at the beginning of the page
        //and the second accounting for the reader being at the end of the page

        //the only way the expected result makes sense is if the first page (page 0) is discounted
        //either as a title page or some other "non-readable" page

    }
}