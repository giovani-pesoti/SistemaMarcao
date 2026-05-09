/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Giovani
 */
public class GpfProduto {
    private int gpfIdProduto;
    private String gpfNome;
    private String gpfDescricao;
    private double gpfPrecoVenda;
    private double gpfPrecoCusto;
    private int gpfIdFornecedor;
    private String gpfAtivo;

    public int getGpfIdProduto() {
        return gpfIdProduto;
    }

    public void setGpfIdProduto(int gpfIdProduto) {
        this.gpfIdProduto = gpfIdProduto;
    }

    public String getGpfNome() {
        return gpfNome;
    }

    public void setGpfNome(String gpfNome) {
        this.gpfNome = gpfNome;
    }

    public String getGpfDescricao() {
        return gpfDescricao;
    }

    public void setGpfDescricao(String gpfDescricao) {
        this.gpfDescricao = gpfDescricao;
    }

    public double getGpfPrecoVenda() {
        return gpfPrecoVenda;
    }

    public void setGpfPrecoVenda(double gpfPrecoVenda) {
        this.gpfPrecoVenda = gpfPrecoVenda;
    }

    public double getGpfPrecoCusto() {
        return gpfPrecoCusto;
    }

    public void setGpfPrecoCusto(double gpfPrecoCusto) {
        this.gpfPrecoCusto = gpfPrecoCusto;
    }

    public int getGpfIdFornecedor() {
        return gpfIdFornecedor;
    }

    public void setGpfIdFornecedor(int gpfIdFornecedor) {
        this.gpfIdFornecedor = gpfIdFornecedor;
    }

    public String getGpfAtivo() {
        return gpfAtivo;
    }

    public void setGpfAtivo(String gpfAtivo) {
        this.gpfAtivo = gpfAtivo;
    }
}
