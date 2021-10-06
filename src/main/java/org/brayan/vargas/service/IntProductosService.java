package org.brayan.vargas.service;


import org.brayan.vargas.model.Producto;
import java.util.List;

public interface IntProductosService {
//operaciones a realizar
public List<Producto> obtenerTodos();
public void guardar(Producto producto);
public void eliminar(Integer idProducto);
public Producto buscarporId(Integer idProducto);

}