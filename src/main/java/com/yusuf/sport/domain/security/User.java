package com.yusuf.sport.domain.security;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import com.yusuf.sport.domain.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity(name="users")
public class User extends BaseEntity{

	private static final long serialVersionUID = 3008316685718045567L;
	
    @Column(name = "activated")
    private Boolean activated;
	
    @Column
    private String email;

	@Column
    private String firstName;
	
	@Column
    private String password;
	
	@Transient
	private String passwordConfirm;
    
	@Column
    private String imageUrl;

	@Column
    private String langKey;
	
	@Column
    private String login;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_authorities",
    joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "authority_id", referencedColumnName = "id"))
    private Set<Authority> authorities;

}
