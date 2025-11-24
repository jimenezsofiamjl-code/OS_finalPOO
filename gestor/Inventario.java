package gestor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventario {

    Map<Insumo, Double> inventario = new HashMap<>();

    public void agregarInsumo(Insumo insumo, Double cantidad) {
        inventario.put(insumo, cantidad);
    }

    public void eliminarInsumo(Insumo insumo) {
        inventario.remove(insumo);
    }

    // si no tiene nada en cantidad devuelve 0
    public Double consultarCantidadInsumo(Insumo insumo) {
        return inventario.getOrDefault(insumo, 0.0);
    }

    public Insumo buscarInsumo(String nombre) {
        for (Insumo insumo : inventario.keySet()) {
            if (insumo.getNombre().equalsIgnoreCase(nombre)) {
                return insumo;
            }
        }
        return null; // No encontrado
    }

    public void modificarCantidad(Insumo insumo, Double nuevaCantidad) {
        if (inventario.containsKey(insumo)) {
            inventario.put(insumo, nuevaCantidad);
        }
    }

    public Boolean existeInsumo(Insumo insumo) {
        if (inventario.containsKey(insumo)) {
            return true;
        } else
            return false;
    }

    public List<String> mostrarLista() {
        List<String> lista = new ArrayList<>();

        for (Map.Entry<Insumo, Double> entry : inventario.entrySet()) {
            lista.add(entry.getKey().getNombre() + ": " + entry.getValue());
        }
        return lista;
    }

    public void eliminarInventario() {
        inventario.clear();
    }

}
