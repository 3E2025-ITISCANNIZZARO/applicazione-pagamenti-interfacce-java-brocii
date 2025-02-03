package pagamento;

public class Paypal implements PaymentStrategy{  //strategy 2
    int iban=0;
    int numero=0;
    String titolare;

    public Paypal(int iban){
        this.iban=iban;

    }
    public Paypal(int numero, String nome){
        this.numero=numero;
        this.titolare=titolare;
    }
    @Override
    public void pagamento() {//sovrascrivo il metodo dell'interfaccia
        if(iban!=0)
        System.out.println("pagamento effettuato tramite PayPal\nnumero iban: "+iban+"\n\n");
        else {
            System.out.println("pagamento effettuato tramite PayPal\n numero carta: "+iban+" \ntitolare carta: "+numero+"\n\n");
        }
    }
}
