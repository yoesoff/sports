package com.yusuf.sport.restdata;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.yusuf.sport.domain.asset.Organizer;

@RepositoryRestResource(collectionResourceRel = "organizers", path = "organizers")
public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long>{

}
