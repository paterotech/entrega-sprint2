package edu.udea.main;

import edu.udea.main.modelos.Empleado;
import edu.udea.main.modelos.Empresa;
import edu.udea.main.modelos.Movimiento;
import edu.udea.main.modelos.Role;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EntregaSprint2Application {

	public static void main(String[] args) {
		//SpringApplication.run(EntregaSprint2Application.class, args);
		Empresa empresa1 = new Empresa("Tragona","Calle 25 # 12-55","7541245","100236-9");
		Empleado empleado1 = new Empleado("Michaela","micha@correo.com","Tragona", Role.ADMINISTRATIVO);
		Movimiento mov1 = new Movimiento("Compra alimento para gatos",10500f,"Michaela");

		System.out.println("*****EMPRESA*****");
		System.out.println("Nombre empresa: "+empresa1.getNombre());
		empresa1.setNombre("Comelona");
		System.out.println("Nombre modificado: "+empresa1.getNombre());
		System.out.println();

		System.out.println("*****EMPLEADO*****");
		System.out.println("Rol: "+empleado1.getRol());
		empleado1.setRol(Role.OPERATIVO);
		System.out.println("Rol modificado: "+empleado1.getRol());
		System.out.println();

		System.out.println("*****MOVIMIENTO*****");
		System.out.println("Usuario: "+mov1.getUsuario());
		mov1.setUsuario("Micha");
		System.out.println("Usuario modificado: "+mov1.getUsuario());


	}

}
