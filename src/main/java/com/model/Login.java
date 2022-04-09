package com.model;

public class Login {

	private String uname;    
	private String pass;   
	
	private String bname;
	private String bauthor;
	private int bprice;
	
	public void setBprice(int bprice) {
		this.bprice = bprice;
	}
	public String getUname() {    
	    return uname;    
	}    
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public int getBprice() {
		return bprice;
	}
	
	public void setUname(String uname) {    
	    this.uname = uname;    
	}

	@Override
	public String toString() {
		return "Login [bname=" + bname + ", bauthor=" + bauthor + ", bprice=" + bprice + "]";
	}
	public String getPass() {    	
	    return  pass;    
	}    
	public void setPass(String pass) {    
	    this.pass = pass;    
	}
	
}
