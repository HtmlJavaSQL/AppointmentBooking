package com.example.demo.interfaces;

import java.util.HashMap;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BookingInfoTable;

@Repository
public interface BookingRepo extends MongoRepository<BookingInfoTable, Integer> {
	
	@Query(value="{'date':?0 , '_id':?1}", fields ="{'_id':1}")
	Optional<HashMap<String,Integer>> FindUserBooking(String date,int userId);
	
}
