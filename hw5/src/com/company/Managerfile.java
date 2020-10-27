package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Managerfile<fileformat,virus,filecontent,filetype> {
    public  String filename ;
    public fileformat format;
    public virus virus;
    public filecontent content;
    public filetype type;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public fileformat getFormat() {
        return format;
    }

    public void setFormat(fileformat format) {
        this.format = format;
    }

    public virus getVirus() {
        return  virus;
    }

    public void setVirus(virus virus) {
        this.virus = virus;
    }

    public filecontent getContent() {
        return content;
    }

    public void setContent(filecontent content) {
        this.content = content;
    }

    public filetype getType() {
        return type;
    }

    public void setType(filetype type) {
        this.type = type;
    }
    }

