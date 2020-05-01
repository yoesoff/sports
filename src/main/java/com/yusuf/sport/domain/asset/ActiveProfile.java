package com.yusuf.sport.domain.asset;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.yusuf.sport.domain.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity(name="active_profiles")
public class ActiveProfile extends BaseEntity{

	private static final long serialVersionUID = 1764060651591573968L;

	@Column
    private String name;
	
	@ManyToOne
    @JoinColumn(name="profile_info_id", nullable=true)
    private ProfileInfo profileInfo;
}
