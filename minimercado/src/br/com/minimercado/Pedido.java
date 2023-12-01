package br.com.minimercado;

import java.util.Date;

public class Pedido {
    private int numeroPedido;
    private Date dataHoraPedido;
    private double precoTotal;
    private int statusPedido;
    public String inserirPedido;
    public int alterarStatus;
    public boolean consultarPedido;
    public double calcularTotalpagar;


    public Pedido(int numeroPedido, Date dataHoraPedido, double precoTotal, int statusPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.precoTotal = precoTotal;
        this.statusPedido = statusPedido;
    }

    public void alterarStatus(int novoStatus) {
        this.statusPedido = novoStatus;
    }
    public boolean consultarPedido(Pedido pedidoParaConsultar) {
        return this.numeroPedido == pedidoParaConsultar.getNumPedido();


    }

    




}
