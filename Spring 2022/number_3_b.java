
import java.lang.Override;

class Book{
    void description(){
        System.out.println("Books are awesome!");
    }
}

class PaperBackBook extends Book{
    void putPageMarker (int pageNo){
        System.out.println("Page marker was " +
                "put on page no: " + pageNo);
    }


    @Override
    void description() {
        System.out.println("Paperback books are good for your eyes!");
    }

}

class Test {
    public static void main(String[] args) {
        Book book1, book2;
        book1 = new Book();
        book2 = new PaperBackBook();

        book1.description();
        book2.description();
        ((PaperBackBook) book2).putPageMarker(50);
    }
}