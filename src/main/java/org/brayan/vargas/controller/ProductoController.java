package org.brayan.vargas.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.brayan.vargas.model.Producto;
import org.brayan.vargas.service.IntProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view/productos")
public class ProductoController {
	
@Autowired
private IntProductosService productosService;

@GetMapping("/editar/{id}")
public String editar(@PathVariable("id") int idProducto, Model model){
	Producto producto = productosService.buscarporId(idProducto);
	model.addAttribute("producto", producto);
	return "view/productos/formProducto";
	}

	@GetMapping("/crear")
	public String crear(Producto producto) {
	return"view/productos/formProducto";
	}
	
	@PostMapping("/guardar")
    public String guardar(Producto producto) {
        //guardamos el registro
        productosService.guardar(producto);
        //una peticion
        return "redirect:/view/productos/index";
    }

/*@PostMapping("/guardar")
public String guardar(@RequestParam("nombre") String nombre,
		@RequestParam("descripcion") String descripcion,
		@RequestParam("fecha") Date fecha,
		@RequestParam("precio") double precio,
		@RequestParam("imagen") String imagen,
		@RequestParam("marca") String marca,
		@RequestParam("detalles") String detalles) { 
	
	Producto p= new Producto();
	p.setNombre(nombre);
	p.setDescripcion(descripcion);
	p.setFecha(fecha);
	p.setPrecio(precio);
	p.setImagen(imagen);
	p.setMarca(marca);
	p.setDetalles(detalles);
	//save the form
	//one petition
	productosService.guardar(p);
	return "redirect:/view/productos/index";
}
*/
//for el format the date
@InitBinder
public void initBinder(WebDataBinder webDataBinder) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
}



@GetMapping("/eliminar/{id}")
public String eliminar(@PathVariable("id")int idProducto ) {
productosService.eliminar(idProducto);
System.out.println("Producto eliminado con el id: " +idProducto);
return "redirect:/view/productos/index";
}
@GetMapping("/index")
public String mostrarIndex(Model model) {
	List<Producto> productos = productosService.obtenerTodos();
	/*for (Producto p : productos) {
		System.out.println(p);
}*/
model.addAttribute("productos", productos);
return "view/productos/listaProducto";
}
}



