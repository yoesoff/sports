package com.yusuf.sport.domain.asset;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.yusuf.sport.domain.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity(name="organizers")
public class Organizer extends BaseEntity{
	private static final long serialVersionUID = 5301963896955011876L;

	@Column
    private String imageLocation;

	@Column
    private String organizerName;
	
    @OneToOne(mappedBy = "organizer")
    private SportEvent sportEvent;
}
