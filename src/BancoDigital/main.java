package BancoDigital;

public class main {

    public static void main(String[] args) {
        Cliente tibio = new Cliente();
        tibio.setNome("Tíbio");
        tibio.setId("123.456.789/10");


        Conta cc = new ContaCorrente(tibio);


        Cliente peronio = new Cliente();
        peronio.setNome("Perônio");
        peronio.setId("987.654.321/00");

        Conta poupanca = new ContaPoupanca(peronio);

        cc.depositar(7000);
        cc.transferir(3500, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
