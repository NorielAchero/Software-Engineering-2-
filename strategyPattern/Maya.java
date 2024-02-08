package strategyPattern;
public class Maya implements PaymentType {
    
    public String calculatePayment(){
        String output = "";
        
        output += "Payment is Maya\n";
        output += "You will receive additional 1% interest of Savings"; 
        return output;
    }

}

