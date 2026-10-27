package com.pluralsight;

public class Book {
    private int id;
    private String isBn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id ,String isBn ,String title ,boolean isCheckedOut ,String checkedOutTo){
        this.id = id;
        this.isBn = isBn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }
}

