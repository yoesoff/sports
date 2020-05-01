package com.yusuf.sport.restdata;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.yusuf.sport.domain.asset.EventUser;

@RepositoryRestResource(collectionResourceRel = "event-users", path = "event-users")
public interface EventUserRepository extends PagingAndSortingRepository<EventUser, Long>{

}
