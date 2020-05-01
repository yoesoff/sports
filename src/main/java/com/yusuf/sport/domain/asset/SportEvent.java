package com.yusuf.sport.domain.asset;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.yusuf.sport.domain.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity(name="sport_events")
public class SportEvent extends BaseEntity{

	private static final long serialVersionUID = -5306921188285824999L;

	@Column
	private Date eventDateTime;

    @Column
    private String eventName;
    @Column
    private String eventType;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "organizer_id", referencedColumnName = "id")
    private Organizer organizer;
}
