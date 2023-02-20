import javax.swing.SwingConstants;

public class Caso2_2 {

    public static void main(String[] args) {
        /*
         * Calcula el sueldo neto en Wakanda. Del sueldo bruto el 30% se lo lleva en ley
         * pantera negra. El 10% sirve para pagar a los espías y el 5% para cuidar a los
         * rinocerontes. Si se pertenece a cuerpo de dora milaje se recibe un 1% de
         * bonificación en todos los impuestos y si perteneces al pueblo de la frontera
         * obtienes un 5% de bonificación.
         */

        float sueldoBruto;
        float sueldoNeto;
        boolean doraMilaje = false;
        boolean frontera = false;
        char sino;
       

        sueldoBruto = Utilidades.pedirFloat("\n¿Cuál es tu sueldo bruto?\n");
        sino = Utilidades.PedirChar("\n¿Perteneces al cuerpo Dora Milaje? (s/n)");
        if (sino=='s'){
            doraMilaje = true;
        } else {
            sino = Utilidades.PedirChar("\n¿Pertecenes al pueblo de la frontera?");
            if (sino=='s'){
                frontera = true;
            }
        }
        sueldoNeto = CalcularImpuestos(sueldoBruto, doraMilaje, frontera);
        System.out.println("\nTu sueldo neto son " + sueldoNeto + " √ibranios");
        
    }

    private static float CalcularImpuestos(float sueldoBruto, boolean doraMilaje, boolean frontera) {
        float reyPantera = 0.3f;
        float espias = 0.1f;
        float rinocerontes = 0.05f;
        float boniFrontera = -0.05f;
        float boniDoraMilaje = -0.01f;
        float sueldoNeto;
        float impuestos = 0;

        impuestos = sueldoBruto * reyPantera + sueldoBruto * espias + sueldoBruto * rinocerontes;
        if (doraMilaje) {
            impuestos = impuestos - impuestos * boniDoraMilaje;
        } else if (frontera) {
            impuestos = impuestos - impuestos * boniFrontera;
        }

        sueldoNeto = sueldoBruto - impuestos;
        return sueldoNeto;
    }
}
