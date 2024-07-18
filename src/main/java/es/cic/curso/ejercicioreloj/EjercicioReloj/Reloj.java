package es.cic.curso.ejercicioreloj.EjercicioReloj;





public class Reloj {

    /*
     * Reloj invocará a la calculadora
     * Calculadora(método que cuando le incoque se le pasa hora y minuto y devolvera
     * que minuto de la hora es
     */

    private Calculadora calculadora;

    public int CalculoMinutoDelDia(int hora, int minuto) {

       int minutoshoras=calculadora.multiplicar(hora, 60);
       int minutoDelDia=calculadora.sumar(minuto, minutoshoras);

       return minutoDelDia;

    }

    public Calculadora getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

   /*  public boolean equals(Object objeto){
        if(objeto==null){
            return false;
        }
        if(!(objeto.getClass().isAssignableFrom(Reloj.class))){ //objeto instanceof Reloj
            return false;
        }
        if(this.calculadora.equals(objeto)){

        }

        return true;
    }
*/




}
