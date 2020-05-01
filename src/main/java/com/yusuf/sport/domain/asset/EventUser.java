package com.yusuf.sport.domain.asset;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.yusuf.sport.domain.BaseEntity;
import com.yusuf.sport.domain.security.Authority;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity(name="event_users")
public class EventUser extends BaseEntity{

	private static final long serialVersionUID = -8424975992343987961L;
	
    @Column(name = "activated")
    private Boolean activated;

    @Column
    private String email;

    @Column
    private String firstName;

    @Column
    private String imageUrl;

    @Column
    private String langKey;

    @Column
    private String lastName;

    @Column
    private String login;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "event_users_authorities",
    joinColumns = @JoinColumn(name = "event_user_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "authority_id", referencedColumnName = "id"))
    private Set<Authority> authorities;
    
}
