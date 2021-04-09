/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registration.demo.appUser;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author danielramirez
 */
@Repository
@Transactional(readOnly=true)
public interface AppUserRepository extends JpaRepository<AppUser, Long>{
    
    Optional<AppUser> findByEmail(String email); 
}
