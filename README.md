Este programa está diseñado para modelar y gestionar la seguridad física y lógica de una caja fuerte asegurando la protección de su combinación mediante la aplicación estricta del principio de encapsulamiento (ocultación de datos), contadores de intentos defensivos y mecanismos de bloqueo automático tras errores consecutivos en programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase CajaFuerte: Declara atributos privados (combinacionSecreta, bloqueada y intentosFallidos) para impedir que código externo lea la clave o altere el estado de seguridad de forma arbitraria.

Implementa el método abrir(String intentoClave): Valida la clave ingresada. Si es correcta, restablece los intentos fallidos y concede el acceso; si es incorrecta, incrementa el contador de seguridad y bloquea el dispositivo de forma permanente al alcanzar tres errores consecutivos.

Oculta la modificación directa de la combinación: Exige obligatoriamente el ingreso correcto de la clave actual (cambiarCombinacion(String claveActual, String nuevaClave)) para permitir actualizar la contraseña, protegiendo el sistema frente a modificaciones no autorizadas.

Ejecuta la prueba en el main: Instancia la caja fuerte, simula una secuencia de aperturas con claves incorrectas hasta disparar el bloqueo de seguridad, intenta cambiar combinaciones y refleja los estados detallados por consola.
