public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        System.out.println("Persona 1");
        System.out.println(person1.toString());
        System.out.println("IMC: " + person1.calcularIMC());
        System.out.println("Es mayor de edad: " + person1.esMayorDeEdad());
        System.out.println();


        Person person2 = new Person("Laura", 30, "1234567890", 'H', 70, 1.75);
        System.out.println("Persona 2");
        System.out.println(person2.toString());
        System.out.println("IMC: " + person2.calcularIMC());
        System.out.println("Es mayor de edad: " + person1.esMayorDeEdad());
        System.out.println();

        Person person3 = new Person("Leonel", 10, "19135412", 'H', 45, 1.55);
        System.out.println("Persona 3");
        System.out.println(person3.toString());
        System.out.println("IMC: " + person3.calcularIMC());
        System.out.println("Es mayor de edad: " + person3.esMayorDeEdad());
        System.out.println();



    }
}
