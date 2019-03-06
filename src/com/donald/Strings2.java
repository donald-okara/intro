package com.donald;

public class Strings2 {
    public static void main(String[] args) {
        String mpesa="NBS12MTPK Confirmed, Ksh 60.00 sent to Tom Matata"+"+254711574108 on 28/2/19 at 6.10PM. new balance is Ksh3400. Transaction cost, Ksh 15.00";

        int pos_ksh = mpesa.indexOf("Ksh");
        int pos_sent = mpesa.indexOf("sent");
        String amount = mpesa.substring(pos_ksh, pos_sent);
        System.out.println(amount);
        int pos_on = mpesa.indexOf(" on ")+3;
        int pos_at = mpesa.indexOf(" at ");
        String date = mpesa.substring(pos_on, pos_at);
        System.out.println(date);

        int pos_is = mpesa.indexOf(" is ")+3;
        int pos_transaction = mpesa.indexOf("Transaction");
        String amount2 = mpesa.substring(pos_is, pos_transaction);
        System.out.println(amount2);


    }

}
