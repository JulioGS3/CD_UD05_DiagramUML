public class Main {
    public static void main(String[] args) {

        //TODO: Crear los siguientes pasos para comprobar el funcionamiento del programa 
        // Crear una veterinaria
        Veterinaria vete1= new Veterinaria();
        // Crear dos clientes
        Cliente cli1= new Cliente("manolo", "Santiago", "981252525");
        Cliente cli2= new Cliente("manola", "Santiago", "981252525");
        // Agregar clientes a la veterinaria
        vete1.agregarCliente(cli1);
        vete1.agregarCliente(cli2);
        // Crear dos animales
        Animal ani1 = new Animal("trosky", "canido", "labrador", cli1);
        Animal ani2 = new Animal("Lia", "canido", "labrador", cli2);

        // Agregar animales a la veterinaria
        vete1.agregarAnimal(ani1);
        vete1.agregarAnimal(ani2);
        //Crear un veterinario 
        Veterinario veteri1 = new Veterinario("paco", "rumiantes");
        // Crear una consulta
        Consulta consu1 = new Consulta("12-02-2024", "cagarela", "empacho", "dieta", veteri1);
        // Asignar la consulta a un animal
        ani1.agregarConsulta(consu1);
        //Imprimir todas las consultas de los animales de la clínica 
        vete1.imprimirConsultas();
    }

}