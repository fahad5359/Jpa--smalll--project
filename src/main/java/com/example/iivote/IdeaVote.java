package com.example.iivote;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IdeaVote extends CrudRepository <Personn,Long> {
//    List<Personn> findByUserNem(String USER_NEM);

//    List<Personn>findAllBy();
//    List<Personn> findByUserNem(String usrNem);
   Personn findById(long id);

}
