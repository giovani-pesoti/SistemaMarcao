/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;
import java.util.Date;

/**
 *
 * @author Giovani
 */
public class GpfVendas {
    private int gpfIdVenda;
    private Date gpfDataVenda;
    private int gpfIdCliente;
    private int gpfIdUsuario;
    private int gpfIdFormaPagamento;
    private double gpfTotal;
    private String gpfStatus;

    public int getGpfIdVenda() {
        return gpfIdVenda;
    }

    public void setGpfIdVenda(int gpfIdVenda) {
        this.gpfIdVenda = gpfIdVenda;
    }

    public Date getGpfDataVenda() {
        return gpfDataVenda;
    }

    public void setGpfDataVenda(Date gpfDataVenda) {
        this.gpfDataVenda = gpfDataVenda;
    }

    public int getGpfIdCliente() {
        return gpfIdCliente;
    }

    public void setGpfIdCliente(int gpfIdCliente) {
        this.gpfIdCliente = gpfIdCliente;
    }

    public int getGpfIdUsuario() {
        return gpfIdUsuario;
    }

    public void setGpfIdUsuario(int gpfIdUsuario) {
        this.gpfIdUsuario = gpfIdUsuario;
    }

    public int getGpfIdFormaPagamento() {
        return gpfIdFormaPagamento;
    }

    public void setGpfIdFormaPagamento(int gpfIdFormaPagamento) {
        this.gpfIdFormaPagamento = gpfIdFormaPagamento;
    }

    public double getGpfTotal() {
        return gpfTotal;
    }

    public void setGpfTotal(double gpfTotal) {
        this.gpfTotal = gpfTotal;
    }

    public String getGpfStatus() {
        return gpfStatus;
    }

    public void setGpfStatus(String gpfStatus) {
        this.gpfStatus = gpfStatus;
    }
}
