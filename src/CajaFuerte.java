public class CajaFuerte {
    private String combinacionSecreta;
    private boolean bloqueada;
    private int contadorIntentosFallidos;
    private static final int MAX_INTENTOS = 3;

    public CajaFuerte(String combinacionInicial) {
        this.combinacionSecreta = combinacionInicial;
        this.bloqueada = false;
        this.contadorIntentosFallidos = 0;
    }

    public boolean isBloqueada() {
        return bloqueada;
    }

    public int getContadorIntentosFallidos() {
        return contadorIntentosFallidos;
    }


    public boolean abrir(String intentoClave) {
        if (bloqueada) {
            System.out.println("Error: La caja fuerte está bloqueada por seguridad.");
            return false;
        }

        if (this.combinacionSecreta.equals(intentoClave)) {
            this.contadorIntentosFallidos = 0;
            System.out.println("¡Acceso concedido! Caja abierta exitosamente.");
            return true;
        } else {
            this.contadorIntentosFallidos++;
            System.out.println("Clave incorrecta. Intentos fallidos: " + contadorIntentosFallidos);
            if (this.contadorIntentosFallidos >= MAX_INTENTOS) {
                this.bloqueada = true;
                System.out.println("¡Alerta! Se han alcanzado 3 errores consecutivos. La caja ha sido bloqueada.");
            }
            return false;
        }

    }

    public void cambiarCombinacion(String claveActual, String nuevaClave) {
        if (bloqueada) {
            System.out.println("Error: No se puede cambiar la combinación de una caja bloqueada.");
            return;
        }

        if (this.combinacionSecreta.equals(claveActual)) {
            if (nuevaClave != null && !nuevaClave.isEmpty()) {
                this.combinacionSecreta = nuevaClave;
                System.out.println("Combinación actualizada exitosamente.");
            } else {
                System.out.println("Error: La nueva combinación no puede estar vacía.");
            }
        } else {
            System.out.println("Error: La clave actual es incorrecta.");
        }
    }
}
