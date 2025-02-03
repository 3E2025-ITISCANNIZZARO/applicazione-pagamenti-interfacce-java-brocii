package pagamento;

public class Carrello {   //classe contesto
    PaymentStrategy tipo;   //tipo di pagamento

    public Carrello(PaymentStrategy tipo){  //costruttore
        this.tipo=tipo;
    }
    public void pagamento(){   //metodo per il pagamento
        tipo.pagamento();
    }
}
