package com.example.BooksCrud.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Books {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private int quantity;
    private String bookName;
    private String genre;
	public Books() {

	}
	public Books(Long id, int quantity, String bookName, String genre) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.bookName = bookName;
		this.genre = genre;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	

}