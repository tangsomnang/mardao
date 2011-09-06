package net.sf.mardao.test.jdbc.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import net.sf.mardao.api.Parent;
import net.sf.mardao.api.domain.JDBCLongEntity;

import net.sf.mardao.api.jdbc.Key;

@Entity
public class Footnote extends JDBCLongEntity {
    private static final long serialVersionUID = 1L;

    @Id
    private Long              key;

    private String            name;

    @Parent(kind = "Page")
    private Key               page;

    @Override
    public Long getSimpleKey() {
        return key;
    }

    @Override
    public Key getParentKey() {
        return page;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public Key getPage() {
        return page;
    }

    public void setPage(Key page) {
        this.page = page;
    }

}
