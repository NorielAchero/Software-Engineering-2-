package strategyPattern;
public class GCash implements PaymentType{
    public String calculatePayment(){
        String output = "";
        
            output += "Payment is GCash\n";
            output += "Energy for trees: 10 points"; 
        return output;
    }

}