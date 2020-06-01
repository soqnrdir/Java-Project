package exam8;

public abstract class Book {
	
	private int number;
	private String title;
	private String author;
	private static int countOfBooks = 1;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.number = countOfBooks;
		countOfBooks++;
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
	public boolean equals(Object obj) {
		if((((Book) obj).getTitle().equals(title)) && (((Book) obj).getAuthor().equals(author))) {
			return true;
		} else {
			return false;
		}
		
	}	
	@Override
	public String toString() {
		return "관리번호" +number+"번, 제목: " + title + ", 작가: " + author + "(일주일 연체로: " + getLateFee(7) + "원)";
	}


}
