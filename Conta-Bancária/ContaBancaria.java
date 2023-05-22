public class ContaBancaria {
    
    private String nomeCliente, repetirOperacao = "r";
    private long numeroContaBancaria;
    private double saldoContaBancaria = 0, historicoUltimoDeposito, realizarSaque;
    private byte operacaoEscolhida;

    public void setregistrarNomeCliente(String novoNomeCliente) {
        nomeCliente = novoNomeCliente;
    }

    public void setregistrarNumeroContaBancaria(long novoNumeroContaBancaria) {
        numeroContaBancaria = novoNumeroContaBancaria;
    }

    public void setdepositarNovoValor(double novoDepositoBancario) {
        saldoContaBancaria += novoDepositoBancario;
        historicoUltimoDeposito = novoDepositoBancario;
    }

    public void setrealizarOperacaoEscolhida(byte novobyteOperacaoEscolhida) {
        operacaoEscolhida = novobyteOperacaoEscolhida;
    }

    public byte getoperacaoEscolhida() {
        return operacaoEscolhida;
    }

    public double getsaldoContaBancaria() {
        return saldoContaBancaria;
    }

    public double gethistoricoUltimoDeposito() {
        return historicoUltimoDeposito;
    } 

    public void setrealizarSaque(double valorSaque) {
        realizarSaque = valorSaque;
        saldoContaBancaria -= valorSaque;
    }

    public double getrealizarSaque() {
        return realizarSaque;
    }

    public String getnomeCliente() {
        return nomeCliente;
    }
    public long getnumeroContaBancaria() {
        return numeroContaBancaria;
    }

    public void setrepetirOperacao(String realizarOutraOperacao) {
        repetirOperacao = realizarOutraOperacao;
    }

    public String getrepetirOperacao() {
        return repetirOperacao;
    }
}
