package com.Garg.Abhishek.eCommerceApp.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "User_ID")
public class Customer extends User{

    @Column(name = "Contact")
    private long contact;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<Address> addresses;

//    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
//    private Role role;
}
