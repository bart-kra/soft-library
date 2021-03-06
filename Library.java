class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.4";

        // Records creator
        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010, 296, "Greg",
                                "9788373271890");
        Book book2 = new Book("Wesele", "Stanisław Wyspiański", 2017, 210, "Siedmioróg",
                                "9788377915899");
        Book book3 = new Book("Kordian", "Juliusz Słowacki", 1895, 194, "Polskija Wydawnica");
        Book book4 = new Book("O dwóch takich co ukradli księżyc", "ks. Jan Twardowski", 2010,
                423, "Arka Noego", "952377915811");
		Book book5 = new Book("Harry Potter i Czara Ognia", "J. K. Rowling", 2016, 768, "Media i Rodzina");

        // Program core
        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:\n");
        book1.booksInfo();
        book2.booksInfo();
        book3.booksInfo();
        book4.booksInfo();
    }
}