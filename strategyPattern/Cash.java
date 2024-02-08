package strategyPattern;
public class Cash implements PaymentType{

        public String calculatePayment(){
            String output = "";
            
            output += "Payment is Cash\n";
            output += "No incentives"; 
            return output;
        }
    
    
}
