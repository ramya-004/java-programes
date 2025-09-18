package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Admin;
import com.example.demo.service.Adminservice;

import java.util.List;

@RestController
public class Adcontroller {

    @Autowired
    private Adminservice adser;

    @PostMapping("/addad")
    public Admin regAdmin(@RequestBody Admin ad) {
        return adser.addAdmin(ad);
    }

    @GetMapping("/getad")
    public List<Admin> getad() {
        return adser.getAdmin();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAdmin(@PathVariable Integer id) {
        adser.deleteAdmin(id);
    }
    @PostMapping("/updatead")
    public Admin updateAdmin(@RequestBody Admin ad)
    {
    	return adser.updateAdmin(ad);
    }
}
