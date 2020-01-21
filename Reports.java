public class Reports extends Stocks
{   
   Reports(){
   super();
   }
   /*public void setId(int id){
   this.id = id;
   }
   public int getId(){
   return id;
   }
   public void setProdcode(int prodcodi
   this.prodcode = prodcode;
   }
   public int getProdcode(){
   return prodcode;
   }
*/
   public void viewdisplay()
   {
   System.out.println("Stock ID: "+stockid);
   System.out.println("Product Code: "+prodcode);
   System.out.println("Product Name: "+prodname);
   System.out.println("Product Date: "+proddate);
   System.out.println("Quantity: "+quantity);
   System.out.println("Encoded by: "+encodedby);
   }
   
 } 