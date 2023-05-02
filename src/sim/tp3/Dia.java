package sim.tp3;

import java.util.ArrayList;
import java.util.List;

public class Dia {

    private int nroDia;
    private NumeroRNDTable rndCantidadClientes;
    private Long cantidadClientes;
    private List<Cliente> clientes;
    private Long cantidadVendida;
    private Long cantidadVendidaAC;
    private Long sobrante;
    private Long sobranteAC;
    private Long utilidad;
    private Long utilidadAC;

    public Dia(int nroDia, NumeroRNDTable rndCantidadClientes, ArrayList<Cliente> clientes, Long cantidadVendida, Long cantidadVendidaAC,
            Long sobrante, Long sobranteAC, Long utilidad, Long utilidadAC, Long cantidadClientes) {
        this.nroDia = nroDia;
        this.rndCantidadClientes = rndCantidadClientes;
        this.clientes = clientes;
        this.cantidadVendida = cantidadVendida;
        this.cantidadVendidaAC = cantidadVendidaAC;
        this.sobrante = sobrante;
        this.sobranteAC = sobranteAC;
        this.utilidad = utilidad;
        this.utilidadAC = utilidadAC;
        this.cantidadClientes = cantidadClientes;
    }

    Dia() {
    }

    public Long getCantidadClientes() {
        return cantidadClientes;
    }

    public void setCantidadClientes(Long cantidadClientes) {
        this.cantidadClientes = cantidadClientes;
    }

    public int getNroDia() {
        return nroDia;
    }

    public void setNroDia(int nroDia) {
        this.nroDia = nroDia;
    }

    public NumeroRNDTable getRndCantidadClientes() {
        return rndCantidadClientes;
    }

    public void setRndCantidadClientes(NumeroRNDTable rndCantidadClientes) {
        this.rndCantidadClientes = rndCantidadClientes;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Long getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(Long cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public Long getCantidadVendidaAC() {
        return cantidadVendidaAC;
    }

    public void setCantidadVendidaAC(Long cantidadVendidaAC) {
        this.cantidadVendidaAC = cantidadVendidaAC;
    }

    public Long getSobrante() {
        return sobrante;
    }

    public void setSobrante(Long sobrante) {
        this.sobrante = sobrante;
    }

    public Long getSobranteAC() {
        return sobranteAC;
    }

    public void setSobranteAC(Long sobranteAC) {
        this.sobranteAC = sobranteAC;
    }

    public Long getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(Long utilidad) {
        this.utilidad = utilidad;
    }

    public Long getUtilidadAC() {
        return utilidadAC;
    }

    public void setUtilidadAC(Long utilidadAC) {
        this.utilidadAC = utilidadAC;
    }

}
