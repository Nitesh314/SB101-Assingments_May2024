package Evaluation1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main3 {
	
//	   ADD BOOK METHOD
	
	public static List<Book> bList=new ArrayList<>();
	
	public static void addBook(Book book)throws BookException{
		
		if(bList.stream().anyMatch(b->b.getIsbn()==book.getIsbn())) {
			throw new BookException("Book already exists");
		}else {
			bList.add(book);
		}
	  		
	}

//*****************************VIEW ALL BOOKS METHOD*************************************************
	
	public static List<Book> viewAllBooks()throws BookException{
		
		if(bList.isEmpty()) {
			throw new BookException("Library closed because we arrange the book...");
		}else {
			
			return bList;
		}
		
		
		
	}
	
//***********************************VIEW BOOKS BY AUTHOR METHOD**********************************************	
	
	public static List viewBooksByAuthor(String author)throws BookException{
		
		List<Book> aList= bList.stream().filter(b->b.getAuthor().equalsIgnoreCase(author)).collect(Collectors.toList());
		
		if(aList.isEmpty()) {
			throw new BookException("None of the book published by the author "+author);
		}else{
			return aList;
		}
		
	}

//************************************GET BOOK BY ISBN METHOD******************************************************8	
	
	public static Book getBookByISBN(int isbn)throws BookException{
		
		Book book=new Book();
		
		List<Book> newBook= bList.stream().filter(b->b.getIsbn()==isbn).collect(Collectors.toList());
		
		
		if(newBook.isEmpty()) {
			throw new BookException("None of the book published by the isbn "+isbn);
		}else {
		    for(Book b:newBook) {
		    	book.setIsbn(b.getIsbn());
		    	book.setAuthor(b.getAuthor());
		    	book.setBookName(b.getBookName());
		    }
		}
		
		
		return book;
	}
	
//*********************************MAIN METHOD************************************************	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		
		
		
		while(true) {
			
			System.out.println("1. Add Book\r\n"
					+ "2. Display all book details\r\n"
					+ "3. Search Book by author\r\n"
					+ "4. Search book by ISBN\r\n"
					+ "5. Exit");
			int choice=sc.nextInt();
			
			
			switch (choice) {
			
			case 1:
				System.out.print("Enter the Isbn : ");
				int isbn=sc.nextInt();
				
				System.out.print("Enter the BookName : ");
				String bookName=sc.next();
				
				System.out.print("Enter the Author : ");
				String author=sc.next();
				
				Book book =new Book(isbn, bookName, author);
				
				try {
					addBook(book);
					System.out.println("Book added successFully...");
				}catch(BookException be) {
					System.out.println(be.getMessage());
				}
				
			break;
			
			case 2:
				
				try {
					List<Book> bList= viewAllBooks();
					
					bList.forEach(b->System.out.println("Book isbn : "+b.getIsbn()+"\n"
	                +"Book Name : "+b.getBookName()+"\n"
	                +"Book Author : "+b.getAuthor()+"\n"
	                +"**********************************"));
					
					
				}catch (BookException be) {
					System.out.println(be.getMessage());
				}
				
			break;
			
			case 3:
				
				try {
					System.out.print("Enter the Author : ");
					String Author=sc.next();
					
					List<Book> bList= viewBooksByAuthor(Author);
					
					bList.forEach(b->System.out.println("Book isbn : "+b.getIsbn()+"\n"
			                +"Book Name : "+b.getBookName()+"\n"
			                +"Book Author : "+b.getAuthor()+"\n"
			                +"**********************************"));
					
				} catch (BookException be) {
					System.out.println(be.getMessage());
					
				}
			
			break;
			
			case 4:	
				System.out.print("Enter the Isbn : ");
				int Isbn=sc.nextInt();
				   try {
					Book b=getBookByISBN(Isbn);
					
					System.out.println("Book isbn : "+b.getIsbn()+"\n"
			                +"Book Name : "+b.getBookName()+"\n"
			                +"Book Author : "+b.getAuthor()+"\n"
			                +"**********************************");
					
					
				} catch (BookException be) {
					System.out.println(be.getMessage());
				}
				
			break;
			
			case 5:	
				System.out.println("Thank You..!!");
				System.exit(0);
			break;	
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
		}
		
		
	}
	

}
