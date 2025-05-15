
package Modelo;


import java.util.Date;
/**
 *
 * @author welvi
 */
public class Compra {
    private int idCompra;
    private int idEmpleado; // Relación con Empleado
    private Date fechaCompra;
    private float totalCompra;

    public Compra() {
    }

    public Compra(int idCompra, int idEmpleado, Date fechaCompra, float totalCompra) {
        this.idCompra = idCompra;
        this.idEmpleado = idEmpleado;
        this.fechaCompra = fechaCompra;
        this.totalCompra = totalCompra;
  
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public float getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(float totalCompra) {
        this.totalCompra = totalCompra;
    }

    
 }
