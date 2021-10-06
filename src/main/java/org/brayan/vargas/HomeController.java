package org.brayan.vargas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/registro")
	public String registro(){
		return "registro";
	}
	
	@GetMapping("login")
	public String login() {
		return "formLogin";
	}
	
	@GetMapping("servicios")
	public String servicios() {
		return "servicios";
	}
	
	@GetMapping("/acercaDe")
	public String acerca() {
			return "acercaDe";
		}
	
		@GetMapping("/")
		public String mostrarIndex() {
			return "home";
		}
		@GetMapping("formLogin")
		public String formLogin() {
			return "formLogin";
		}
		
		@GetMapping("/contactos2")
		public String contactos2() {
			return "contactos2";
		}
		@GetMapping("/descripcion")
		public String descripcion() {
			return "descripcion";
		}

		@GetMapping("/descripcion2")
		public String descripcion2() {
			return "descripcion2";
		}
		
		@GetMapping("/descripcion3")
		public String descripcion3() {
			return "descripcion3";
		}
		
		@GetMapping("/descripcion4")
		public String descripcion4() {
			return "descripcion4";
		}
		
}
