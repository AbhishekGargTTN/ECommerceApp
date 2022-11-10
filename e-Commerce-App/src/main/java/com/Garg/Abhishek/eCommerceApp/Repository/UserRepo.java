package com.Garg.Abhishek.eCommerceApp.Repository;

import com.Garg.Abhishek.eCommerceApp.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
