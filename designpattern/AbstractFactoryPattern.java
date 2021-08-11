//AbstractFactoryPattern.java
//Step 1: Create a Bank interface

import java.io.*;
     
interface Bank{  
        String getBankName();  
}  

//Step 2: Create concrete classes for Bank interface.

class HNB implements Bank{  
   private final String bankname;  
        
   public HNB(){  
                bankname="Hatton National Bank";  
   }  
   public String getBankName() {  
                  return bankname;  
   }  
}  

class BOC implements Bank{  
  private final String bankname;  
  BOC(){  
   bankname="Bank of Ceylon";  
        }  
        public String getBankName() {  
           return bankname;  
       }  
}  

class DFCC implements Bank{  
  private final String bankname;  
  DFCC(){  
  	bankname="DFCC Bank";  
        }  
        public String getBankName() {  
           return bankname;  
       }  
}  

//Step 3: Create the Loan abstract class.

abstract class Loan{  
   protected double rate;  
   abstract void getInterestRate(double rate);  
   public void calculateLoanPayment(double loanamount, int years)  
   {  
        /* 
              to calculate the monthly loan payment i.e. EMI   
              rate=annual interest rate/12*100; 
              n=number of monthly installments;            
              1year=12 months. 
              so, n=years*12; 
 
            */  
                
         double EMI;  
         int n;  
  
         n=years*12;  
         rate=rate/1200;  
         EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamount;  
  
System.out.println("your monthly EMI is "+ EMI +" for the amount "+loanamount+" you have borrowed");     
 }  
}
  
// Step 4: Create concrete classes extending the Loan abstract class..

class HomeLoan extends Loan{  
     public void getInterestRate(double r){  
         rate=r;  
    }  
}
  
class BussinessLoan extends Loan{  
    public void getInterestRate(double r){  
          rate=r;  
     }  
  
}
  
class EducationLoan extends Loan{  
     public void getInterestRate(double r){  
       rate=r;  
 }  
}
  
//Step 5: Create an abstract class to get the factories for Bank and Loan Objects.

abstract class AbstractFactory{  
  public abstract Bank getBank(String bank);  
  public abstract Loan getLoan(String loan);  
}  

/*
Step 6: Create the factory classes that inherit AbstractFactory class to generate the object of concrete class based on given information.
*/

class BankFactory extends AbstractFactory{  
   public Bank getBank(String bank){  
      if(bank == null){  
         return null;  
      }  
      if(bank.equalsIgnoreCase("HNB")){  
         return new HNB();  
      } else if(bank.equalsIgnoreCase("BOC")){  
         return new BOC();  
      } else if(bank.equalsIgnoreCase("DFCC")){  
         return new DFCC();  
      }  
      return null;  
   }  

  public Loan getLoan(String loan) {  
      return null;  
   }  
}
 
class LoanFactory extends AbstractFactory{  
     public Bank getBank(String bank){  
                return null;  
     }  
        
     public Loan getLoan(String loan){  
      if(loan == null){  
         return null;  
      }  
      if(loan.equalsIgnoreCase("Home")){  
         return new HomeLoan();  
      } else if(loan.equalsIgnoreCase("Business")){  
         return new BussinessLoan();  
      } else if(loan.equalsIgnoreCase("Education")){  
         return new EducationLoan();  
      }  
      return null;  
   }       
}  

/*
Step 7: Create a FactoryCreator class to get the factories by passing an information such as Bank or Loan.
*/

class FactoryCreator {  
     public static AbstractFactory getFactory(String choice){  
      if(choice.equalsIgnoreCase("Bank")){  
         return new BankFactory();  
      } else if(choice.equalsIgnoreCase("Loan")){  
         return new LoanFactory();  
      }  
      return null;  
   }  
}

/*  
Step 8: Use the FactoryCreator to get AbstractFactory in order to get factories of concrete classes by passing an information such as type.
*/

  
public class AbstractFactoryPattern {  
      public static void main(String args[])throws IOException {  
       
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
      System.out.print("Enter the name of Bank from where you want to take loan amount: ");  
      String bankName=br.readLine();  
  
System.out.print("\n");  
System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");  
  
String loanName=br.readLine();  
AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");  
Bank b=bankFactory.getBank(bankName);  
  
System.out.print("\n");  
System.out.print("Enter the interest rate for "+b.getBankName()+ ": ");  
  
double rate=Double.parseDouble(br.readLine());  
System.out.print("\n");  
System.out.print("Enter the loan amount you want to take: ");  
  
double loanAmount=Double.parseDouble(br.readLine());  
System.out.print("\n");  
System.out.print("Enter the number of years to pay your entire loan amount: ");  
int years=Integer.parseInt(br.readLine());  
  
System.out.print("\n");  
System.out.println("you are taking the loan from "+ b.getBankName());  
  
 AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");  
           Loan l=loanFactory.getLoan(loanName);  
           l.getInterestRate(rate);  
           l.calculateLoanPayment(loanAmount,years);  
 }  
}
