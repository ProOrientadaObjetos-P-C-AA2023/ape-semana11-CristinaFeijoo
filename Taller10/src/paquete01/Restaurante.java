package paquete01;
import java.util.ArrayList;
import java.util.List;

abstract class Menu{
    protected String nomPlato;
    protected double valorMenu;
    protected double valorInicio;

    public double getSubtotal(){
        return valorMenu;
    }

    @Override
    public String toString(){
        return nomPlato + ": $" + valorMenu;
    }
}

class MenuAcarta extends Menu{
    private double precioGuarnicion;
    private double precioBebida;
    private double porcentajeServicio;

    public MenuAcarta(String nomPlato, double valorMenu, double valorInicio, double precioGuarnicion, double precioBebida, double porcentajeServicio) {
        this.nomPlato = nomPlato;
        this.valorMenu = valorMenu;
        this.valorInicio = valorInicio;
        this.precioGuarnicion = precioGuarnicion;
        this.precioBebida = precioBebida;
        this.porcentajeServicio = porcentajeServicio;
    }

    public double getSubtotal(){
        double subtotal1 = valorMenu + precioGuarnicion + precioBebida;
        double servicio1 = (valorInicio * porcentajeServicio) / 100;
        return subtotal1 + servicio1;
    }

    @Override
    public String toString(){
        return super.toString() + " a la carta";
    }
}

class MenuDia extends Menu{
    private double precioPostre;
    private double precioBebida;

    public MenuDia(String nomPlato, double valorMenu, double valorInicio, double precioPostre, double precioBebida) {
        this.nomPlato = nomPlato;
        this.valorMenu = valorMenu;
        this.valorInicio = valorInicio;
        this.precioPostre = precioPostre;
        this.precioBebida = precioBebida;
    }

    public double getSubtotal(){
        return valorMenu + precioPostre + precioBebida;
    }

    @Override
    public String toString(){
        return super.toString() + " Menu especial del dia";
    }
}

class MenuNinos extends Menu{
    private double precioHelado;
    private double precioPastel;

    public MenuNinos(String nomPlato, double valorMenu, double valorInicio, double precioHelado, double precioPastel) {
        this.nomPlato = nomPlato;
        this.valorMenu = valorMenu;
        this.valorInicio = valorInicio;
        this.precioHelado = precioHelado;
        this.precioPastel = precioPastel;
    }

    public double getSubtotal(){
        return valorMenu + precioHelado + precioPastel;
    }

    @Override
    public String toString(){
        return super.toString() + " (Menú de Niños)";
    }
}

class MenuEconomico extends Menu{
    private double descuento;

    public MenuEconomico(String nomPlato, double valorMenu, double valorInicio, double descuento) {
        this.nomPlato = nomPlato;
        this.valorMenu = valorMenu;
        this.valorInicio = valorInicio;
        this.descuento = descuento;
    }

    public double getSubtotal(){
        double descuentoAplicado = (valorInicio * descuento) / 100;
        return valorMenu - descuentoAplicado;
    }

    @Override
    public String toString(){
        return super.toString() + " (Menú Económico)";
    }
}

abstract class Cuenta{
    private String cliente;
    private List<Menu> menuList;
    private double iva;

    public Cuenta(String cliente, double iva) {
        this.cliente = cliente;
        this.menuList = new ArrayList<>();
        this.iva = iva;
    }

    public void agregarMenu(Menu menu){
        menuList.add(menu);
    }

    public double calcularTotal(){
        double subtotal = 0.0;
        for (Menu menu : menuList) {
            subtotal += menu.getSubtotal();
        }
        return subtotal + (subtotal * iva / 100);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(cliente).append("\n");
        sb.append("Subtotal: $").append(calcularTotal() / (1 + iva / 100)).append("\n");
        sb.append("IVA: ").append(iva).append("%").append("\n");
        sb.append("Menús: ").append("\n");
        for (Menu menu : menuList) {
            sb.append("- ").append(menu).append("\n");
        }
        sb.append("Total a Cancelar: $").append(calcularTotal()).append("\n");
        return sb.toString();
    }
}



