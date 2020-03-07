package Supermercado;

public class Empleado {

   private String nombre;
   private String departamento;
   private String cargo;
   private double salario;
   
   
   public Empleado() {
	   
   nombre = "";
   departamento = "";
   cargo= "";
   salario = 0;
   }

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDepartamento() {
	return departamento;
}
public void setDepartamento(String departamento) {
	this.departamento = departamento;
}
public String getCargo() {
	return cargo;
}
public void setCargo(String cargo) {
	this.cargo = cargo;
}
public double getSalario() {
	return salario;
}
public void setSalario(double d) {
	this.salario = d;
}
   
 public Empleado (String nombre,String departamento,String cargo,int salario) {
	 this.nombre = nombre;
	 this.departamento = departamento;
	 this.cargo = cargo;
	 this.salario = salario;
	 
 }

 }
   
	 


    


