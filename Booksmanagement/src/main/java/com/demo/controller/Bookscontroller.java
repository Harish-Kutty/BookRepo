package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Booksmodel;
import com.demo.repository.Booksinterface;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class Bookscontroller
{

	@Autowired
	private Booksinterface einterface;
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("insert")
	public Booksmodel insert(@RequestBody Booksmodel em)
	{
		return this.einterface.save(em);
	}
    
	@CrossOrigin(origins="http://localhost:4200")
    @GetMapping("view")
	public List<Booksmodel> view()
	{
		return einterface.findAll();
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("update")
	public Booksmodel update(@RequestBody Booksmodel em)
	{
	    return einterface.save(em);	
	}
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("delete")
	public void  delete(@RequestBody Booksmodel em)
	{
		this.einterface.delete(em);
	}
	
}
