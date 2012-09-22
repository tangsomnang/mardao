package net.sf.mardao.test.jdbc.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import net.sf.mardao.api.Parent;
import net.sf.mardao.api.domain.JDBCLongEntity;

@Entity
public class Chapter extends JDBCLongEntity {
    private static final long serialVersionUID = -7257544633020164506L;

    @Id
    private Long              id;

    private String            name;

    /** References the book's ISBN */
    @Parent(kind = "Book")
    private String            book;

    @Override
    public Long getSimpleKey() {
        return id;
    }

    @Override
    public String getParentKey() {
        return book;
    }

    @Override
    public String _getNameCreatedDate() {
        return null;
    }

    @Override
    public String _getNameUpdatedDate() {
        return "chapterUpdatedDate";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

}