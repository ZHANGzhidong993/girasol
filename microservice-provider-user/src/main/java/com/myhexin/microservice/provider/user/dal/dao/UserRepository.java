package com.myhexin.microservice.provider.user.dal.dao;


import com.myhexin.microservice.provider.user.dal.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
