package Supermercado;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

static Scanner tec = new Scanner (System.in);
public static void main(String[] args) {
	
	int opc =0;
	ArrayList<Empleado>list=new ArrayList<>();



	
do {
	System.out.println("BIENVENIDO");
	System.out.println("MENÚ");
	System.out.println("1 - Agregar empleado");
	System.out.println("2 - Lista empleados");
	System.out.println("3 - Departamentos");
	System.out.println("4 - Aumentos");
	System.out.println("5 - Total salarios");
	System.out.println("6 - SALIR");
	opc = tec.nextInt();

switch (opc) {
	
case 1:
	tec.nextLine();
	
	Empleado emp = new Empleado();
	
    System.out.println("Ingrese nombre del empleado");
    emp.setNombre(tec.nextLine().toLowerCase());
    
    System.out.println("Ingrese departamento");
    emp.setDepartamento(tec.nextLine().toLowerCase());
    
    System.out.println("Ingrese Cargo");
    emp.setCargo(tec.nextLine().toLowerCase());
    
    System.out.println("Ingrese Salario");
    emp.setSalario(tec.nextInt());
	
    list.add(emp);
  
 break;
 
case 2:
	
	System.out.println("                                LISTA DE EMPLEADOS  ");
	if(list.size() == 0) {
		
		System.out.println();
		System.out.println("No se encuentran empleados registrado");
		
	}else {
		
		System.out.println("                            LISTA DE EMPLEADOS = ");
		for(Empleado empleado : list) {
			
			System.out.println();
			System.out.println("Nombre: " + empleado.getNombre().substring(0,1).toUpperCase()+empleado.getNombre().substring(1));
			System.out.println("Departamento: "+ empleado.getDepartamento().substring(0,1).toUpperCase()+empleado.getDepartamento().substring(1));
			System.out.println("Cargo: "+ empleado.getCargo().substring(0,1).toUpperCase()+empleado.getCargo().substring(1));
			System.out.println("Salario: "+empleado.getSalario());
			System.out.println();
			
		}
  break;	
	}
	
case 3:
	
	int total=0;
	
	tec.nextLine();
	
	System.out.println("Ingrese el nombre del departamento del cual desea realizar la busqueda");
	String depa = tec.nextLine().toLowerCase();
	
	for(Empleado empleado : list) {
		
	if(empleado.getDepartamento().equals(depa)) {
		 total++;
	}
	}
	
	System.out.println("Total de empleado en ese departamento = " +total);
	
	
	break;

case 4:
	
    System.out.println("Salario actual");
    
	for(Empleado empleado:list) {
		System.out.println("Nombre: " + empleado.getNombre().substring(0,1).toUpperCase()+empleado.getNombre().substring(1));
		System.out.println("Salario: "+empleado.getSalario());
		System.out.println("");
	}
	
	
	for(Empleado empleado:list) {
		
		empleado.setSalario(empleado.getSalario()+(empleado.getSalario()*0.10));
	}
	
	System.out.println("Se realizo un aumento del 10% al salario de los empleados");
	System.out.println("");
	System.out.println("Salario Actualizado");
	System.out.println("");
	for(Empleado empleado:list) {
		System.out.println("Nombre: " + empleado.getNombre().substring(0,1).toUpperCase()+empleado.getNombre().substring(1));
		System.out.println("Salario: "+empleado.getSalario());
		System.out.println("");
	}
	
	
	break;
	
case 5:
	double tsalario = 0;
	
	for(Empleado empleado: list) {
		
		tsalario=tsalario+empleado.getSalario();
		
	}
	
	System.out.println("Salario de cada empleado");
	System.out.println("");
	for (Empleado empleado:list) {
		System.out.println("Nombre: " + empleado.getNombre().substring(0,1).toUpperCase()+empleado.getNombre().substring(1));
		System.out.println("Salario: "+empleado.getSalario());
		System.out.println("");
	}
	
	System.out.println("Suma de todos los Salarios"+tsalario);
	
break;

case 6:
	System.out.println("Fin de aplicación");
	
break;
}
}while(opc!=6);

}
}
