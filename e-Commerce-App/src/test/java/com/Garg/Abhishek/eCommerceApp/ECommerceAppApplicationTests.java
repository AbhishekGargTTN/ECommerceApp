package com.Garg.Abhishek.eCommerceApp;

import com.Garg.Abhishek.eCommerceApp.Entity.Address;
import com.Garg.Abhishek.eCommerceApp.Entity.Customer;
import com.Garg.Abhishek.eCommerceApp.Entity.Role;
import com.Garg.Abhishek.eCommerceApp.Entity.Seller;
import com.Garg.Abhishek.eCommerceApp.Repository.RoleRepo;
import com.Garg.Abhishek.eCommerceApp.Repository.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest
class ECommerceAppApplicationTests {

	@Autowired
	UserRepo userRepository;

//	@Autowired
//	RoleRepo roleRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void addCustomer(){

		Customer customer= new Customer();
		customer.setEmail("abhishek@gmail.com");
		customer.setFirstName("Abhishek");
		customer.setMiddleName("Ab");
		customer.setLastName("Garg");
		customer.setPassword("1234");
		customer.setContact(1234567890);
		Set<Address> addresses= new HashSet<>();
		Address address1= new Address();
		address1.setCity("Shastri Nagar");
		address1.setState("Delhi");
		address1.setZipCode(110052);
		address1.setAddressLine("749");
		address1.setLabel("Home");
		address1.setCountry("India");
		address1.setCustomer(customer);
		addresses.add(address1);

		Address address2= new Address();
		address2.setCity("Rohini");
		address2.setState("Delhi");
		address2.setZipCode(110039);
		address2.setAddressLine("1234");
		address2.setLabel("Office");
		address2.setCountry("India");
		address2.setCustomer(customer);
		addresses.add(address2);

		customer.setAddresses(addresses);

//		System.out.println(role.getRole());
//		Set<Role> roles = new HashSet<>();
////		role.getRole();
//		Role role= roleRepo.findByRole("Customer");
//		roles.add(role);
//		customer.setRoles(roles);
		userRepository.save(customer);
	}

	@Test
	public void addSeller(){

		Seller seller= new Seller();
		seller.setEmail("tarun@gmail.com");
		seller.setFirstName("Tarun");
		seller.setMiddleName("K");
		seller.setLastName("Singh");
		seller.setPassword("1234");
		seller.setGst("abcgst123");
		seller.setCompanyName("TTN");
		seller.setCompanyContact(12345678);
//		Set<Address> addresses= new HashSet<>();
		Address address1= new Address();
		address1.setCity("Noida");
		address1.setState("UP");
		address1.setZipCode(121032);
		address1.setAddressLine("7987");
		address1.setLabel("Office");
		address1.setCountry("India");
//		address1.setCustomer(seller);
//		addresses.add(address1);
		seller.setAddress(address1);
		userRepository.save(seller);
	}

//	@Test
//	public void addRole(){
//		Role role1= new Role();
//		role1.setRole("Admin");
//		roleRepo.save(role1);
//
//		Role role2= new Role();
//		role2.setRole("Customer");
//		roleRepo.save(role2);
//
//		Role role3= new Role();
//		role3.setRole("Seller");
//		roleRepo.save(role3);
//	}
}
