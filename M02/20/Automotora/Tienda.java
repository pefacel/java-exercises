package Automotora;

public class Tienda {
    private Vendedor vendedor;
    private Cliente cliente;
    private String nombreTienda;
    private Integer stock;

    public Tienda(Vendedor vendedor, Cliente cliente, String nombreTienda, Integer stock) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.nombreTienda = nombreTienda;
        this.stock = stock;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String existeStock() {
        return "La cantidad de stock es:" + stock;

    }

    @Override
    public String toString() {
        return "Tienda [vendedor=" + vendedor + ", cliente=" + cliente + ", nombreTienda=" + nombreTienda + ", stock="
                + stock + ", existeStock()=" + existeStock() + "]";
    };

}
