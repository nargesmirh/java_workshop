package com.company;

public class Note {
    private long id;

    public void setId(long id) {
        this.id = id;
    }

    public void setNote(String note) {
        this.note = note;
    }

    private String note;

    public long getId() {
        return id;
    }

    public String getNote() {
        return note;
    }
}
