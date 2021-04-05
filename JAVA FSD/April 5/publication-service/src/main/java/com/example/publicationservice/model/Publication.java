package com.example.publicationservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "publication_id")
    private Integer pId;
    @Column(name = "publication_name")
    private String pName;
    @Column(name = "book_name")
    private String bname;
    @Column(name = "author_name")
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
