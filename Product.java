public class Product
{
   public int prodcode;
   public String prodname;
   public String proddate;
   public boolean status;
  Product(){
  }
  public Product(int prodcode, String proddate, String prodname)
  {
   this.prodcode = prodcode;
   this.proddate = proddate;
   this.prodname = prodname;
  }
  public void setProdcode(int prodcode)
  {
   this.prodcode=prodcode;
  }
  public void setProddate(String proddate)
  {
   this.proddate=proddate;
  }    
  public void setProdname(String prodname)
  {
   this.prodname=prodname;
  }
  public int getProdcode()
  {
   return prodcode;
  }
  public String getProddate()
  {
   return proddate;
  }
  public String getProdname()
  {
  return prodname;
  } 
  public void setStatus(boolean status){
  this.status = status;
  }
  public boolean getStatus()
   {
      return status;

   }
  
  
  
  
  
  public void display()
  {
   System.out.println("Product Code: "+prodcode);
   System.out.println("Product Name: "+prodname);
   System.out.println("Product Date: "+proddate);
   if(status = true){
   System.out.println("Available");
   }else{
   System.out.println("Unavailble");
   }
  }
  
}