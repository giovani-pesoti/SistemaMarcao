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
public class GpfCompras {
    private int gpfIdCompra;
    private Date gpfDataCompra;
    private int gpfIdFornecedor;
    private int gpfIdUsuario;
    private double gpfTotal;
    private String gpfNumeroNotaFiscal;
    private String gpfStatus;

    public int getGpfIdCompra() {
        return gpfIdCompra;
    }

    public void setGpfIdCompra(int gpfIdCompra) {
        this.gpfIdCompra = gpfIdCompra;
    }

    public Date getGpfDataCompra() {
        return gpfDataCompra;
    }

    public void setGpfDataCompra(Date gpfDataCompra) {
        this.gpfDataCompra = gpfDataCompra;
    }

    public int getGpfIdFornecedor() {
        return gpfIdFornecedor;
    }

    public void setGpfIdFornecedor(int gpfIdFornecedor) {
        this.gpfIdFornecedor = gpfIdFornecedor;
    }

    public int getGpfIdUsuario() {
        return gpfIdUsuario;
    }

    public void setGpfIdUsuario(int gpfIdUsuario) {
        this.gpfIdUsuario = gpfIdUsuario;
    }

    public double getGpfTotal() {
        return gpfTotal;
    }

    public void setGpfTotal(double gpfTotal) {
        this.gpfTotal = gpfTotal;
    }

    public String getGpfNumeroNotaFiscal() {
        return gpfNumeroNotaFiscal;
    }

    public void setGpfNumeroNotaFiscal(String gpfNumeroNotaFiscal) {
        this.gpfNumeroNotaFiscal = gpfNumeroNotaFiscal;
    }

    public String getGpfStatus() {
        return gpfStatus;
    }

    public void setGpfStatus(String gpfStatus) {
        this.gpfStatus = gpfStatus;
    }
}
