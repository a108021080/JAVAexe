

public class Book3 {
    private String name;
    private String writer;
    private String publishhouse;
    private String publishday;
    private String ISBN;
    private String pagenumber;

    public Book3() {
    }
    public void Book() {
        System.out.println("Book object has created");
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public String getName() {
        return this.name;
    }
    public void setWriter(String newwriter) {
        this.writer = newWriter;
    }
    public Object getWriter() {
        return this.writer;
    }
    public void setPublishhouse(String newpublishhouse) {
        this.publishhouse = newPublishhouse;
    }
    public String getPublishhouse() {
        return this.publishhouse;
    }
    public void setPublishday(String newpublishday) {
        this.publishday = newPublishday;
    }
    public String getPublishday() {
        return this.publishday;
    }
    public void setISBN(String newISBN) {
        this.ISBN = newISBN;
    }
    public String getISBN() {
        return  this.ISBN;
    }
    public void setPagenumber(String newpagenumber) {
        this.pagenumber = newPagenumber;
    }
    public String getPagenumber() {
        return  this.pagenumber;
    }
    public void openbook(){
    }
    public void flipbook(){
    }
    public void closebook(){
    }
    public void showInfo(){
        System.out.println("Book Name:"+this.name+","+"Writer Name: "+this.writer+","+"Publishhouse: "+this.publishhouse+","+"Publishday: "+this.publishday+","+"ISBN code: "+this.ISBN+","+"Pagenumber: "+this.pagenumber );
    }
}
