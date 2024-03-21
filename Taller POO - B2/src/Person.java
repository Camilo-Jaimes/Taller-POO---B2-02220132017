
public class Person {

    private String nombre;
    private int edad;
    private String cedula;
    private char sexo; 
    private double peso;
    private double altura;
    
    private static final char sexoDefecto = 'H';

    public Person(){
        this.nombre = "";
        this.edad = 0;
        this.cedula = "";
        this.sexo = sexoDefecto;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Person(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = "";
        this.sexo = sexo;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Person(String nombre, int edad, String cedula, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getCedula(){
        return cedula;
    }

    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public char getSexo(){
        return sexo;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public static char getSexodefecto(){
        return sexoDefecto;
    }
    public int calcularIMC(){

        double imc = peso / (Math.pow(altura, 2));

        double pesoIdealMin = 20.0;
        double pesoIdealMax = 25.0;

        if (imc < pesoIdealMin) {
            return -1; 
        } else if (imc >= pesoIdealMin && imc <= pesoIdealMax) {
            return 0; 
        } else {
            return 1; 
        }
    }

    public boolean esMayorDeEdad() {
        if (this.edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public void comprobarSexo(char sexo) {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = sexoDefecto;
        } else {
            this.sexo = sexo;
        }
    }

    @Override
    public String toString(){
        return "Person [nombre=" + nombre + ", edad=" + edad + ", cedula=" + cedula + ", sexo=" + sexo + ", peso="
                + peso + ", altura=" + altura + "]";
    }

}
