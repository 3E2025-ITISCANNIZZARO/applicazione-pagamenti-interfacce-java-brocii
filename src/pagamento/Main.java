package pagamento;

public class Main {
    public static void main(String[] args){
        Carrello c1=new Carrello(new carta(21456,"mario rossi"));  //creo due oggetti carrello assegnando i diversi pagamenti
        Carrello c2= new Carrello(new Paypal(6328682));
        Carrello c3= new Carrello(new Paypal(6328, "luca verdi"));
        c1.pagamento();                          //effettuo i diversi pagamenti
        c2.pagamento();
        c3.pagamento();


    }
}
