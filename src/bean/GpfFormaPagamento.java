/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Giovani
 */
public class GpfFormaPagamento {
    private int gpfIdFormaPagamento;
    private String gpfDescricao;
    private int gpfNumeroParcelas;
    private double gpfTaxaJuros;
    private int gpfPrazoDias;
    private String gpfAtivo;
    private String gpfTipo;

    public int getGpfIdFormaPagamento() {
        return gpfIdFormaPagamento;
    }

    public void setGpfIdFormaPagamento(int gpfIdFormaPagamento) {
        this.gpfIdFormaPagamento = gpfIdFormaPagamento;
    }

    public String getGpfDescricao() {
        return gpfDescricao;
    }

    public void setGpfDescricao(String gpfDescricao) {
        this.gpfDescricao = gpfDescricao;
    }

    public int getGpfNumeroParcelas() {
        return gpfNumeroParcelas;
    }

    public void setGpfNumeroParcelas(int gpfNumeroParcelas) {
        this.gpfNumeroParcelas = gpfNumeroParcelas;
    }

    public double getGpfTaxaJuros() {
        return gpfTaxaJuros;
    }

    public void setGpfTaxaJuros(double gpfTaxaJuros) {
        this.gpfTaxaJuros = gpfTaxaJuros;
    }

    public int getGpfPrazoDias() {
        return gpfPrazoDias;
    }

    public void setGpfPrazoDias(int gpfPrazoDias) {
        this.gpfPrazoDias = gpfPrazoDias;
    }

    public String getGpfAtivo() {
        return gpfAtivo;
    }

    public void setGpfAtivo(String gpfAtivo) {
        this.gpfAtivo = gpfAtivo;
    }

    public String getGpfTipo() {
        return gpfTipo;
    }

    public void setGpfTipo(String gpfTipo) {
        this.gpfTipo = gpfTipo;
    }
}
