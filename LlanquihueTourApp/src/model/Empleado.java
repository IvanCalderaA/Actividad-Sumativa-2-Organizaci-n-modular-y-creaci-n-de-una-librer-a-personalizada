package model;

import util.Validaciones;

/** Empleado de la agencia. */
public class Empleado extends Persona {
    private String cargo;
    private double salario;
    private String fechaIngreso;

    public Empleado(String rut, String nombre, String apellido, String telefono, String email,
                    Direccion direccion, String cargo, double salario, String fechaIngreso) {
        super(rut, nombre, apellido, telefono, email, direccion);
        setCargo(cargo); setSalario(salario); setFechaIngreso(fechaIngreso);
    }
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = Validaciones.textoObligatorio(cargo, "cargo"); }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = Validaciones.numeroNoNegativo(salario, "salario"); }
    public String getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(String fechaIngreso) { this.fechaIngreso = Validaciones.textoObligatorio(fechaIngreso, "fecha de ingreso"); }
    @Override public String toString() {
        return "Tipo: Empleado | " + super.toString() + " | Cargo: " + cargo
                + " | Salario: $" + String.format(java.util.Locale.US, "%.0f", salario) + " | Fecha ingreso: " + fechaIngreso;
    }
}
