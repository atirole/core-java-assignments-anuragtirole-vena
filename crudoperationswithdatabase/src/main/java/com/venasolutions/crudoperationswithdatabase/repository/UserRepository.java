package com.venasolutions.crudoperationswithdatabase.repository;

import com.venasolutions.crudoperationswithdatabase.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
    // No need to define findById(), save(), etc. because w are extending JpaRepository it will provide all methods
}
