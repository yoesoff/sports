package com.yusuf.sport.restdata;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.yusuf.sport.domain.asset.ProfileInfo;

@RepositoryRestResource(collectionResourceRel = "profile-info", path = "profile-info")
public interface ProfileInfoRepository extends PagingAndSortingRepository<ProfileInfo, Long>{

}
