package com.rpm.web.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    public User findByUseridAndPasswd(String id, String pw);


public interface UserRepository extends CrudRepository<User,Long> {

}
