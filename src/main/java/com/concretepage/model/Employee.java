package com.concretepage.model;

public class Employee {
	 
    private String id;
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTenbh() {
		return tenbh;
	}

	public void setTenbh(String tenbh) {
		this.tenbh = tenbh;
	}

	public String getCasi() {
		return casi;
	}

	public void setCasi(String casi) {
		this.casi = casi;
	}

	public String getTheloai() {
		return theloai;
	}

	public void setTheloai(String theloai) {
		this.theloai = theloai;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Employee(String id, String tenbh, String casi, String theloai, String link) {
		super();
		this.id = id;
		this.tenbh = tenbh;
		this.casi = casi;
		this.theloai = theloai;
		this.link = link;
	}

	private String tenbh;
    private String casi;
    private String theloai;
    private String link;
 
    public Employee() {
 
    }
 
   
 
}
