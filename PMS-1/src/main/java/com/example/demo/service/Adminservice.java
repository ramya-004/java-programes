package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Admin;
import com.example.demo.repository.Adrepository;
import java.util.List; 

@Service
public class Adminservice {
	
	@Autowired
	public Adrepository adrepo;
	
	 public Admin addAdmin(Admin ad)
	 {
		 
		 return adrepo.save(ad);
	 }
	 public List<Admin> getAdmin()
	 {
		 return adrepo.findAll();
	 }
	 public void deleteAdmin(int id)
	 {
		 adrepo.deleteById(id);
	 }
	public Admin updateAdmin(Admin ad)
	{
		Integer adid=(int) ad.getAdID();
		Admin ad1 = adrepo.findById(adid).get();
		ad1.setAdName(ad.getAdName());
		return adrepo.save(ad1);
	}
}
