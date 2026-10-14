//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
CajaFuerte cajaFuerte = new CajaFuerte("AKJF-2311");

cajaFuerte.abrir("AJKF-1222");
cajaFuerte.abrir("AEYR-3442");
cajaFuerte.abrir("AKJF-2311");

System.out.println("\n--- Pruebas de Cambio de Combinación ---");
 cajaFuerte.cambiarCombinacion("AKJF-2311", "1234");
}

