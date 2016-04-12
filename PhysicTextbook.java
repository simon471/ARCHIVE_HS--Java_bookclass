public class PhysicTextbook extends Textbook{
  
  private String formular;
  private Boolean experiment;
  
  public PhysicTextbook(String title, String lang, int price, int pages, Sub sub, Boolean ex, String formular, Boolean experiment){
    super(title,lang,price,pages,sub,ex);
    this.formular = formular;
    this.experiment = experiment;
  }
  public String getFormular(){return this.formular;}
  public String getExperiment(){
    if(this.experiment ){
      return "it includes experiment examples.";}
    else{
      return "it doesn't have experiment examples.";}
  }
  
  public void intro(){
    System.out.println("The title of the book is "+ this.getTitle() + ". The language is " + this.getLang() + ". It is "+ this.getPrice()+" dollars and have "+this.getPages()+" pages. It is a physic textbook, "+getFormular()+" is one of the formular inside and "+getExperiment());
    
  }
  
  public static void main(String[] ar){
    PhysicTextbook a = new PhysicTextbook("physic", "English", 100, 1032, Textbook.Sub.SCIENCE, true, "f=ma", true);
    a.intro();
}
}
