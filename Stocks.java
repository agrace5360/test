public class Stocks extends Product
{  
   public int stockid;
   public int quantity;
   public String encodedby;
  
   
   Stocks(){
   }
   public Stocks(int stockid,int quantity,String encodedby)
   {  super();
      this.stockid = stockid;     
      this.quantity = quantity;
      this.encodedby = encodedby; 
    }
   public void setProdcode(int prodcode)
  {
   this.prodcode=prodcode;
  }
  public int getProdcode()
  {
   return prodcode;
  }


   public void setstockid(int stockid)
   {
      this.stockid=stockid;
   }
   public void setquantity(int quantity)
   {
      this.quantity=quantity;
   }
   public void setencodedby(String encodedby)
   {
      this.encodedby=encodedby;
   }
   
      
   public int getstockid()
   {
      return stockid;
   }
   public int getquantity()
   {
      return quantity;
   }
   public String getencodedby()
   {
      return encodedby;
   }
   public void display()
   {
      System.out.println("Stock ID: "+stockid);
      System.out.println("Product Code: "+ getProdcode());
      System.out.println("Quantity: "+quantity);
      System.out.println("Encoded by: "+encodedby);
   }
   public boolean statusDisplay()
   {
     if(quantity > 0)
     { status = true;
      }else{
      status = false;
      }       
      return status;
   }
}//try na