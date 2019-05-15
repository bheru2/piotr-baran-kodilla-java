package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<>();
        if (titleFragment.length() < 3) {
            return bookList;
        }
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) {
            for (Book book : resultList) {
                bookList.add(book);
                if (bookList.size() == 20) {
                    break;
                }
            }
            return bookList;
        }
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        return this.libraryDatabase.listBooksInHandsOf(libraryUser);
    }
}
