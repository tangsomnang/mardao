package net.sf.mardao.test.jdbc.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import net.sf.mardao.api.domain.JDBCStringEntity;

@Entity
public class Book extends JDBCStringEntity {
    private static final long serialVersionUID = -5236891128669604072L;

    @Id
    private String            ISBN;

    private String            title;

    @Override
    public String getSimpleKey() {
        return ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String name) {
        this.ISBN = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}