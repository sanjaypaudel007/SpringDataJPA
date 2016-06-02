package com.guitar.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guitar.db.model.Location;

@Repository
public interface LocationJpaRepository extends JpaRepository<Location, Long> {
	List<Location> findByStateLikeIgnoreCaseOrderByStateAsc(String state);
	List<Location> findByStateNotLike(String state);
	

	List<Location> findByStateStartingWith(String state);	// parameter = "new%"
	List<Location> findByStateEndingWith(String state);	// parameter = "%new"
	List<Location> findByStateContaining(String state);	// parameter = "%new%"
	
	List<Location> findByStateAndCountry(String value1, String value2);
	List<Location> findByStateOrCountry(String value1, String value2);
	
	List<Location> findByStateIs(String value1);
	List<Location> findByStateEquals(String value1);
	List<Location> findByStateNot(String value1);

}
