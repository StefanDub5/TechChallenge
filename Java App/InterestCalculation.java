package interestcalculation;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Stefan du Bruyn
 */
public class InterestCalculation {
    
    public static void main(String[] args)throws ParseException {
        Scanner input = new Scanner(System.in);
        
        //Starting Amount
        System.out.print("Enter your Start Amount: ");
        double StartAmount = input.nextDouble();
        
        //Starting Date
        Date StartDate = null;
        SimpleDateFormat startformat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Please select your Start Date(Day/Month/Year): ");
        String StartInput = input.nextLine();
        if(null != StartInput && StartInput.trim().length() > 0){
             StartDate = startformat.parse(StartInput);
        }
        
        input.next();
        
        //End Date
        Date EndDate = null;
        SimpleDateFormat endformat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Please select your End Date(Day/Month/Year): ");
        String EndIput = input.nextLine();
        if(null != EndIput && EndIput.trim().length() > 0){
             EndDate = endformat.parse(EndIput);
        }
         
        input.next();
        
        //Difference between Start & End Dates
        //Date SubDate = new Date(EndDate.getTime() - StartDate.getTime());
        
        //Repo Rate (var RR)
        System.out.print("Enter your Repo Rate: ");
        double RR = input.nextDouble();
        
        //Interest Agreement Type
        System.out.println("Select your Agreement Type: ");
        System.out.println("1. Mortgage agreements");
        System.out.println("2. Credit facilities");
        System.out.println("3. Unsecured credit transactions");
        System.out.println("4. Developmental credit agreements For development of a small business");
        System.out.println("5. Developmental credit agreements For low income housing (unsecured)");
        System.out.println("6. Short term credit transactions");
        System.out.println("7. Other credit agreements");
        System.out.println("8. Incidental credit agreements");
        
        double result;
        char Agreement;
        Agreement = input.next().charAt(0);
        
        //I decided to use a switch case for the different Agreement Types
        
        switch (Agreement) {
            
            case '1':
                result = ((RR * 2.2) + (5/100));
                System.out.println(result);
                break;
                
            case '2':
                result = ((RR * 2.2) + (10/100));
                System.out.println(result);
                break;
               
             case '3':
                result = ((RR * 2.2) + (20/100));
                System.out.println(result);
                break;
                
            case '4':
                result = ((RR * 2.2) + (20/100));
                System.out.println(result);
                break;
            
            case '5':
                result = ((RR * 2.2) + (20/100));
                System.out.println(result);
                break;
                
            case '6':
                result = (5/100);
                System.out.println(result);
                break;
                
            case '7':
                result = ((RR * 2.2) + (10/100));
                System.out.println(result);
                break;
                
            case '8':
                result = (2/100);
                System.out.println(result);
                break;
        }
        
        //Set variables so that I can do the calculation
        double a = (StartAmount * result/100);
        Date b = new Date(EndDate.getTime() - StartDate.getTime());
        long c = b;
        
        //Calculate the total Interest Amount
        double InterestAmount = a * b;
        System.out.print("Based upon your inputs, here is your interest amount: " + InterestAmount);
    }   
}
