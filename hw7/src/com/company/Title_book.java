package com.company;

public class Title_book {
    public static long getId;
    public static Object getName;
    public static Object getNasher;

    public  Object setId;

    public  Object setName;
    public Object setChap;
    private  String name,nasher,chap,title;
    private int id ;

    public static Title_book gettitle() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNasher(){
        return nasher;
    }
    public void setNasher(String nasher){
        this.nasher = nasher;
    }
    public  String getChap(){
        return chap;
    }
    public void setChap(String chap){
        this.chap = chap;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String  title){this.title = title;}

    public String setChap() {
        return null;
    }
}
