package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booksmodel

{
@Id

private int bno;
private String bname;
private int bprice;



public Booksmodel() {
	super();
	
}
public Booksmodel(int bno, String bname, int bprice) {
	super();
	this.bno = bno;
	this.bname = bname;
	this.bprice = bprice;
}
public int getBno() {
	return bno;
}
public void setBno(int bno) {
	this.bno = bno;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public int getBprice() {
	return bprice;
}
public void setBprice(int bprice) {
	this.bprice = bprice;
}
@Override
public String toString() {
	return "Booksmodel [bno=" + bno + ", bname=" + bname + ", bprice=" + bprice + "]";
}




}
