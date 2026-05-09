/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Giovani
 */
public class GpfComprasProduto {
    private int gpfIdCompraProduto;
    private int gpfIdCompra;
    private int gpfIdProduto;
    private int gpfQuantidade;
    private double gpfValorUnitario;
    private double gpfSubtotal;
    private String gpfLote;

    public int getGpfIdCompraProduto() {
        return gpfIdCompraProduto;
    }

    public void setGpfIdCompraProduto(int gpfIdCompraProduto) {
        this.gpfIdCompraProduto = gpfIdCompraProduto;
    }

    public int getGpfIdCompra() {
        return gpfIdCompra;
    }

    public void setGpfIdCompra(int gpfIdCompra) {
        this.gpfIdCompra = gpfIdCompra;
    }

    public int getGpfIdProduto() {
        return gpfIdProduto;
    }

    public void setGpfIdProduto(int gpfIdProduto) {
        this.gpfIdProduto = gpfIdProduto;
    }

    public int getGpfQuantidade() {
        return gpfQuantidade;
    }

    public void setGpfQuantidade(int gpfQuantidade) {
        this.gpfQuantidade = gpfQuantidade;
    }

    public double getGpfValorUnitario() {
        return gpfValorUnitario;
    }

    public void setGpfValorUnitario(double gpfValorUnitario) {
        this.gpfValorUnitario = gpfValorUnitario;
    }

    public double getGpfSubtotal() {
        return gpfSubtotal;
    }

    public void setGpfSubtotal(double gpfSubtotal) {
        this.gpfSubtotal = gpfSubtotal;
    }

    public String getGpfLote() {
        return gpfLote;
    }

    public void setGpfLote(String gpfLote) {
        this.gpfLote = gpfLote;
    }
}
