package com.riri.springsecuritybasic;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{
    User findByUsername(String username);
    User findByEmail(String username);
    Long countByEmail(String email);
    Long countByUsername(String username);
}
