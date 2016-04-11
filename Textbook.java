public class Textbook extends Book{
  
  public enum Sub{ENGLISH, MATH, SCIENCE};
  private Sub sub;
  private Boolean ex;
  
  public Textbook(String title, String lang, int price, int pages, Sub sub, Boolean ex){
    super(title,lang,price,pages);
    this.sub = sub;
    this.ex = ex;
  }
  public Sub getSub(){return this.sub;}
  public String getEx(){
    if(this.ex){
      return "it have exercise.";}
    else{
      return "it doesn't have exercise.";}
  }
  
  public void intro(){
    System.out.println("The title of the book is "+ this.getTitle() + ". The language is " + this.getLang() + ". It is "+ this.getPrice()+" dollars and have "+this.getPages()+" pages. It is a textbook for " + getSub()+" and " + getEx());
    
  }
}