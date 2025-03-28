package com.example.demospring.repositories;

import com.example.demospring.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HibernateRepo extends JpaRepository<User, Long> {
    @Override
    Optional<User> findById(Long aLong);
    List<User> findTop5ByIdOrderByIdDesc(Long id);
    long countByName(String name);
    boolean existsByName(String name);

    @Query("SELECT u FROM User u WHERE u.name LIKE %:characters%")
    List<User> nameIncludeCharacters(@Param("characters") String characters);
}
