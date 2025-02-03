package pagamento;

public class carta implements PaymentStrategy { //strategy 1
    int numero;
    String titolare;

    public carta(int numero,String nome){
        this.numero=numero;
        this.titolare=nome;
    }
    @Override
    public void pagamento() {                    //sovrascrivo il metodo dell'interfaccia
        System.out.println("pagamento effettuato tramite carta di credito\n numero carta: "+numero+"\n titolare carta: "+titolare+"\n\n");
    }
}
