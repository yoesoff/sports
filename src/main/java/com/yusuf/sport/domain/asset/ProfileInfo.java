package com.yusuf.sport.domain.asset;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.yusuf.sport.domain.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity(name="profile_infos")
public class ProfileInfo extends BaseEntity{

	private static final long serialVersionUID = 1947772189534947959L;

	@Column
    private String ribbonEnv;
	
	@OneToMany(mappedBy="profileInfo")
    private Set<ActiveProfile> activeProfiles;
}
