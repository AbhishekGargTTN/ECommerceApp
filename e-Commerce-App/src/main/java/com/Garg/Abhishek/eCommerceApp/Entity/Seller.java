package com.Garg.Abhishek.eCommerceApp.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "User_ID")
public class Seller extends User{

    @Column(name = "GST")
    private String gst;

    @Column(name = "Company_Contact")
    private long companyContact;

    @Column(name = "Company_Name")
    private String companyName;

    @OneToOne(mappedBy = "seller", cascade = CascadeType.ALL)
    private Address address;
}
