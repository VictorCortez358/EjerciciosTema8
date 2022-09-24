public class EjercicioTema8 {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Carlos");
        persona.setEdad(15);
        persona.setTelefono(7859948);
        System.out.println(persona.getNombre() + "," + persona.getEdad() + "," + persona.getTelefono());
    }
}

class Persona{
    private String nombre;
    private int telefono;
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }


}

