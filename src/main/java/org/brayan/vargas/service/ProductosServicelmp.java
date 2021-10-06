package org.brayan.vargas.service;

import java.util.List;
import java.util.Optional;

import org.brayan.vargas.model.Producto;
import org.brayan.vargas.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductosServicelmp implements IntProductosService {
@Autowired
private ProductosRepository repoProductos;
@Override
public List<Producto> obtenerTodos() {
// TODO Auto-generated method stub
//consultar para recuperar todos los prodcutos
List<Producto> lista = repoProductos.findAll();
return lista;
}

 @Override
public void guardar(Producto producto) {
// TODO Auto-generated method stub
//insertar un registro de tipo producto
repoProductos.save(producto);
}

 @Override
public void eliminar(Integer idProducto) {
// TODO Auto-generated method stub
//eliminar un registro
repoProductos.deleteById(idProducto);
}

 @Override
public Producto buscarporId(Integer idProducto) {
// TODO Auto-generated method stub
//buscar producto en especifico
Optional<Producto> optional = repoProductos.findById(idProducto);
if (optional.isPresent()) {
return optional.get();
}
return null;
}


}
