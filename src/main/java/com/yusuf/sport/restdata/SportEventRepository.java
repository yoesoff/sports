package com.yusuf.sport.restdata;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.yusuf.sport.domain.asset.SportEvent;

@RepositoryRestResource(collectionResourceRel = "sport-events", path = "sport-events")
public interface SportEventRepository extends PagingAndSortingRepository<SportEvent, Long>{

}