class Book {
    String title;
    String author;
    int price;

    Book( String title, String author, int price ) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
public class Book_1111_11 {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        Book[] arr2 = new Book[3];

        Book book1 = new Book("Java", "홍길동", 1000);
        Book book2 = new Book("JSP", "박문수", 2000);
        Book book3 = new Book("Spring", "이몽룡", 3000);

        arr2[0] = book1;
        arr2[1] = book2;
        arr2[2] = book3;

        System.out.println( arr2.length );

        for( int i=0; i<arr2.length ; i++ ){

            Book book = arr2[i];
            System.out.println( book.title);
            System.out.println( book.author);
            System.out.println( book.price);
        }
    }
}