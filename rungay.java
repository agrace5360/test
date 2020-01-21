import java.util.*;
public class rungay{
   

   static Scanner s = new Scanner(System.in); 
   public static void main(String[]args)
   {  
   int quantity,stockid,menu,pc;
   String pn,pd;
   

    Product firstObj = new Product();
    //Product secondObj;
    //Product thirdObj;
    Stocks sfirstObj = new Stocks();
    //Stocks ssecondObj;
   // Stocks sthirdObj;
    Reports rfirstObj = new Reports();
   // Reports rsecondObj;
    //Reports rthirdObj; t
  do{    
      System.out.print("*******************************\n");
      System.out.print("\tSTOCK MANAGEMENT SYSTEM\n");
      System.out.print("*******************************\n");
      System.out.print("1. ADD PRODUCT\n");
      System.out.print("2. ADD STOCK\n");
      System.out.print("3. View Product\n");
      System.out.print("4. View Stock\n");
      System.out.print("5. View Available Products\n");
      System.out.print("6. Exit\n");     
      System.out.print("Choose a number:");
      menu=s.nextInt();
 
      switch(menu){
      case 1:
      System.out.print("******************\n");
      System.out.print("\tADD PRODUCT\n");
      System.out.print("******************\n");
      System.out.print("Enter Product Code:\n");
      pc=s.nextInt();
      s.nextLine();
      System.out.print("Enter Product Date:\n");
      pd=s.nextLine();
      System.out.print("Enter Product Name:\n");
      pn=s.nextLine();
      firstObj = new Product(pc,pd,pn);
      //secondObj= new Product(2,"1/16/2020","Safeguard"); 
      //thirdObj= new Product(3,"1/16/2020","Colgate");
      System.out.print("Product added Successfully!\n");    
      break;
      case 2:
      System.out.print("******************\n");
      System.out.print("\tADD STOCK\n");
      System.out.print("******************\n");
      System.out.print("Enter Stock ID:\n");
      stockid=s.nextInt();
      System.out.print("Enter Quantity:\n");
      quantity=s.nextInt();
      s.nextLine();
      System.out.print("Encoded by:");
      String encodedby = s.nextLine();
      sfirstObj = new Stocks(stockid,quantity,encodedby);
     // ssecondObj = new Stocks(2,7,encode);
     // sthirdObj = new Stocks(3,3,encode);
      break;
      case 3://view product
       
      firstObj.display();
      //secondObj.display();
      //thirdObj.display();
      break;
      
      case 4://view stock
       
      sfirstObj.display();

      //ssecondObj.display();

      //sthirdObj.display();
      break;
      
      case 5://view available products
     
         rfirstObj.display();
     
      break;
      }        
   }while(menu!=6);
   {
      System.out.print("Goodbye!");
   }
}

}//run