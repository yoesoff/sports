package com.yusuf.sport.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class BaseEntity implements Serializable {

	private static final long serialVersionUID = 6701635601151576699L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "DataChange_CreatedBy", nullable = true)
    private String createdBy;

    @Column(name = "DataChange_CreatedTime", nullable = true)
    private Date createdDate;

    @Column(name = "DataChange_LastModifiedBy", nullable = true)
    private String lastModifiedBy;

    @Column(name = "DataChange_LastTime", nullable = true)
    private Date lastModifiedDate;

    @PrePersist
    protected void prePersist() {
        if (this.createdDate == null) this.createdDate = new Date();
        if (this.lastModifiedDate == null) lastModifiedDate = new Date();
    }

    @PreUpdate
    protected void preUpdate() {
        this.lastModifiedDate = new Date();
    }

    @PreRemove
    protected void preRemove() {
        this.lastModifiedDate = new Date();
    }
}