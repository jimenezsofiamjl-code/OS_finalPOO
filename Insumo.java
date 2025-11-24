package gestor;

public class Insumo {
    /*
     * Los modificadores de visibilidad pueden cambiar, no sé qué tanto acceso deba
     * haber a ellos
     */
    public String nombre;
    public double cantidadDisponible;
    public String unidad;
    public double costoPorUnidad;

    // Getters & setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(double cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public double getCostoPorUnidad() {
        return costoPorUnidad;
    }

    public void setCostoPorUnidad(double costoPorUnidad) {
        this.costoPorUnidad = costoPorUnidad;
    }

    // constructores
    public Insumo(String nombre) {
        setNombre(nombre);
    }

    public Insumo(String nombre, double cantidadDisponible) {
        this(nombre);
        setCantidadDisponible(cantidadDisponible);
    }

    public Insumo(String nombre, double cantidadDisponible, String unidad, double costoPorUnidad) {
        this(nombre, cantidadDisponible);
        setCostoPorUnidad(costoPorUnidad);
        setUnidad(unidad);
    }

    // Métodos propios
    /*
     * Algunos de estos métodos podrían funcionar mejor como interfaces,
     * pero aún no estoy seguro del enfoque
     */
    public void aumentarCantidad(double cantidad) {
        cantidadDisponible += cantidad;
    }

    public void disminuirCantidad(double cantidad) {
        cantidadDisponible -= cantidad;
    }

    public double calcularCostoTotal(double cantidad) {
        return cantidad * costoPorUnidad;
    }

    // Para funcionalidad de HashMap

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Insumo))
            return false;

        Insumo insumo = (Insumo) o;
        return this.nombre.equalsIgnoreCase(insumo.nombre);
    }


    public int hashCode() {
        return nombre.toLowerCase().hashCode();
    }
}
