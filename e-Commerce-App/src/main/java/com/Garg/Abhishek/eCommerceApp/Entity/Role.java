package com.Garg.Abhishek.eCommerceApp.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

//@Entity
//@Getter
//@Setter
public class Role {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "ID")
//    private long rid;
//
//    @Column(name = "Role")
//    private String role;
//
//    public Role() {
//    }
//
//    public Role(long id, String role) {
//        this.rid = id;
//        this.role = role;
//
//    }
//        @ManyToMany
//        @JoinColumn(name = "User_Id")
//    @JoinTable(name = "User_Role"
//            ,joinColumns = @JoinColumn(name = "User_id", referencedColumnName = "id")
//            ,inverseJoinColumns = @JoinColumn(name = "Role_id", referencedColumnName = "id"))
//    private Set<User> users;

//    @OneToOne
//    @JoinTable(name = "User_Role"
//            ,joinColumns = @JoinColumn(name = "User_id", referencedColumnName = "id")
//            ,inverseJoinColumns = @JoinColumn(name = "Role_id", referencedColumnName = "rid"))
//    private Customer customer;
}
