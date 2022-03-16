package com.wissen;

import java.util.Scanner;

class Book {
	
	private String bookName;
	private int bookId;
	private String authorName;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookId=" + bookId + ", authorName=" + authorName + "]";
	}
	
}

public class LibraryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Book book1 = new Book();
		System.out.println("Enter Book ID : ");
book1.setBookId(sc.nextInt());			
		System.out.println("Enter Book Name : ");
		book1.setBookName(sc.next());
		
		System.out.println("Enter Book Author name : ");
		book1.setAuthorName(sc.next());
		
		System.out.println("Book details  are "+ book1.toString());

	}

}
