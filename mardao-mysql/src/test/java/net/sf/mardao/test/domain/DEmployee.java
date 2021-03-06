package net.sf.mardao.test.domain;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import net.sf.mardao.core.GeoLocation;
import net.sf.mardao.core.Parent;
import net.sf.mardao.core.domain.AbstractLongEntity;
import net.sf.mardao.core.geo.DLocation;

/**
 *
 * @author os
 */
@Entity
@Table(uniqueConstraints=@UniqueConstraint(columnNames={"fingerprint"}))
public class DEmployee extends AbstractLongEntity {

    @Parent(kind="DOrganization")
    private Serializable organizationKey;
    
    @Basic
    private String fingerprint;
    
    @Basic
    private String nickname;
    
    @Basic
    @GeoLocation
    private DLocation officeLocation;
    
    @ManyToOne
    private DEmployee manager;
    
    @ManyToMany(mappedBy="members", targetEntity=DGroup.class)
    private Collection<DGroup> groups;
    
    @Override
    public String toString() {
        return String.format("%s,fingerprint:%s}", super.toString(), fingerprint);
    }
    
    public Object getOrganizationKey() {
        return organizationKey;
    }

    public void setOrganizationKey(Serializable organizationKey) {
        this.organizationKey = organizationKey;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public DEmployee getManager() {
        return manager;
    }

    public void setManager(DEmployee manager) {
        this.manager = manager;
    }

    public Collection<DGroup> getGroups() {
        return groups;
    }

    public void setGroups(Collection<DGroup> groups) {
        this.groups = groups;
    }

    public DLocation getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(DLocation officeLocation) {
        this.officeLocation = officeLocation;
    }

}
