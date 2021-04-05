package com.example.authorservice.model;


public class Publication {

    private Integer pId;

    private String pName;

    private String bname;

    private String authorName;

    public Publication() {
        super();
    }

    public Publication(Integer pId, String pName, String bname, String authorName) {
        super();
        this.pId = pId;
        this.pName = pName;
        this.bname = bname;
        this.authorName = authorName;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
