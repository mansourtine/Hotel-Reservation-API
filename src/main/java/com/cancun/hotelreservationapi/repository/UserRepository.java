package com.cancun.hotelreservationapi.repository;

import com.cancun.hotelreservationapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the User entity.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
