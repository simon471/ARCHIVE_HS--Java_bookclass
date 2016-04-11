public class Book{
  private int price, pages;
  private String title, lang;
  
  public Book(String title, String lang, int price, int pages){
    this.title=title;
    this.lang=lang;
    this.price=price;
    this.pages=pages;
  }
  
  public String getTitle(){return this.title;}
  public String getLang(){return this.lang;}
  public int getPrice(){return this.price;}
  public int getPages(){return this.pages;}
  
  public void intro(){
    System.out.println("The title of the book is "+ this.getTitle() + ". The language is " + this.getLang() + ". It is "+ this.getPrice()+"dollars and have "+this.getPages()+" pages.");
  }
}
