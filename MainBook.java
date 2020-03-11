

public class MainBook {
    public static void main(String[] args) {
        Book book1= new Book();
        Book book2 = new Book();
        Book book3= new Book();
        book1.setName("Harry potter");
        book1.setWriter("Rowling,J.K.");
        book1.setPublishhouse("Bloomsbury");
        book1.setPublishday("1997/06/26");
        book1.setISBN("9573317249");
        book1.setPagenumber("223");
        book2.setName("The Adventures of Pinocchio");
        book2.setWriter(" Carlo Collodi,MinaLima ");
        book2.setPublishhouse("Harper Design");
        book2.setPublishday("2020/04/14");
        book2.setISBN("9780062905277");
        book2.setPagenumber("331"); 
        book3.setName("Alice’s Adventures in Wonderland");
        book3.setWriter("Lewis Carroll,MinaLima");
        book3.setPublishhouse("Harper Design");
        book3.setPublishday("2019/10/29");
        book3.setISBN("2019/10/29");
        book3.setPagenumber("293");
        System.out.println("Book1 for Harry potter ");
        book1.showInfo();
        System.out.println("Book2 for The Adventures of Pinocchio ");
        book2.showInfo();
        System.out.println("Book3 for Alice’s Adventures in Wonderland ");
        book3.showInfo();
  }
}
    }
}

