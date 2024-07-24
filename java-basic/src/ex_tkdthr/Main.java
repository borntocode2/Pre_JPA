package ex_tkdthr;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("이방인", 10000, "알베르 카뮈", "12345");
        Album album = new Album("AAA", 10020, "Huckoh");
        Movie movie = new Movie("바람과 함꼐 사라지다", 30000, "정상화", "이지원");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("sum은 "+sum);

    }
}
