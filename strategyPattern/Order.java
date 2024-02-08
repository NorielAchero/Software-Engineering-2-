package strategyPattern;
public class Order{


    private Double orderAmount;
    private PaymentType paymentType;

    public Order(Double orderamount, PaymentType paymentType){
        this.orderAmount = orderamount;
        this.paymentType = paymentType;
    }

    public String calculatePayment(){
        return "Your your amount is " + orderAmount + "\n" + paymentType.calculatePayment();
    }

    // public Order (Double orderAmount, String paymentType){
    //     this.orderAmount = orderAmount;
    //     this.paymentType = paymentType;
    // }


    // // Three types of payment: GCash, Maya, Cash

    // public String calculatePayment(){
    //     String output = "";
    //     if(paymentType.equals("GCash")){
    //         output += "Payment is GCash\n";
    //         output += "Energy for trees: 10 points"; 
    //     }
    //     else if(paymentType.equals("Mata")){
    //         output += "Payment is Maya\n";
    //         output += "You will receive additional 1% interest of Savings"; 
    //     }
    //     else{
    //         output += "Payment is Cash\n";
    //         output += "No incentives"; 
    //     }

    //     return "Your your amount is " + orderAmount + "\n" + 
    //             output;
    // }

}