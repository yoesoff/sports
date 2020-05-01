package com.yusuf.sport.domain.security;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;
import org.hibernate.validator.constraints.UniqueElements;

import com.yusuf.sport.domain.BaseEntity;
import com.yusuf.sport.domain.asset.Account;
import com.yusuf.sport.domain.asset.EventUser;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity(name = "authorities")
public class Authority extends BaseEntity{

	private static final long serialVersionUID = 8454595129644237788L;

	@Column
	@UniqueElements
    private String name;
	
	
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "authorities")
    private Set<Account> accounts;
	
	
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "authorities")
    private Set<User> users;
    
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "authorities")
    private Set<EventUser> event_users;
}