package exam8;

import java.util.Objects;

public abstract class Book {
	
	private int number;
	private String title;
	private String author;
	public static int countOfBooks;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.number = countOfBooks++;

	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public abstract int getLateFee(int lateDays);
	

	@Override
	public int hashCode() {
		return Objects.hash(author, title); //해쉬코드
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) { //주소값 비교
			return true;
		}
		if (!(obj instanceof Book)) {
			return false;
		}
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "관리번호" +(number+1)+"번, 제목: " + title + ", 작가: " + author + "(일주일 연체로: " +String.format("%,d", getLateFee(7)) + "원)";
	}


}
