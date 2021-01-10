package com.ThopTv.MovieInfo.Entites;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<EntityUser, Integer>, JpaSpecificationExecutor<EntityUser> {

    public EntityUser findByEmail(String email);

}
