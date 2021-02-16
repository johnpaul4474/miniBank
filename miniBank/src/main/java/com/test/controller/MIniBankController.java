package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.dao.MiniBankDao;
import com.test.model.MiniBankModel;

@RestController
@RequestMapping("/miniBank")
public class MIniBankController {
	@Autowired
	private MiniBankDao miniBankDao;
	
	@GetMapping("/totalUsers")
	public int  getTotalUsers() {		
		return  (int) miniBankDao.count();
	}
	
	@GetMapping("/history/{user}")
	public List<MiniBankModel>getUserHistory(@PathVariable("user") Iterable<Integer> user) {		
		return (List<MiniBankModel>) miniBankDao.findAllById(user);
	}
	
	//to-do 
	@GetMapping("/withdraw/{user}")
	public String withdraw(@RequestBody List<MiniBankModel> withdraw) {
		
		return null;
	}
	
	@PostMapping("/transfer/{user}")
	public String transfer(@RequestBody List<MiniBankModel> deposit) {
		return null;
	}
	
	
	@PostMapping("/deposit/{user}")
	public String deposit(@RequestBody List<MiniBankModel> transfer) {
		
		return null;
	}
}
