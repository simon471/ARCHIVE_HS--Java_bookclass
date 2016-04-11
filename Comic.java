public class Comic extends Book{
  
  public enum Style{MANGA,WESTERN};
  private Style style;
  private Boolean colour ;
  
  public Comic(String title, String lang, int price, int pages, Style style, Boolean colour){
    super(title,lang,price,pages);
    this.style = style;
    this.colour = colour;
  }
  public Style getStyle(){return this.style;}
  public String getColour(){
    if(this.colour ){
      return "it is a color comic.";}
    else{
      return "it is black and white.";}
  }
  
  public void intro(){
    System.out.println("The title of the book is "+ this.getTitle() + ". The language is " + this.getLang() + ". It is "+ this.getPrice()+" dollars and have "+this.getPages()+" pages. It is a comic and its style is " + getStyle()+" also " + getColour());
    
  }
}