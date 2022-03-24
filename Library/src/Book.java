public class Book {
   String title;
   String author;
   int releaseDate;
   int pages;
   String publisher;
   String isbn;

   Book(String title, String author, int releaseDate, int pages, String publisher) {
      this.title = title;
      this.author = author;
      this.releaseDate = releaseDate;
      this.pages = pages;
      this.publisher = publisher;
   }

   Book(String title, String author, int releaseDate, int pages, String publisher, String isbn) {
      this(title, author, releaseDate, pages, publisher);
      this.isbn = isbn;
   }

   void booksInfo() {
      System.out.println("Tytuł: " + title);
      System.out.println("Autor: " + author);
      System.out.println("Data wydania: " + releaseDate);
      System.out.println("Liczba stron: " + pages);
      System.out.println("Wydawca: " + publisher);
      System.out.println("ISBN: " + isbn + " \n");
   }

}
