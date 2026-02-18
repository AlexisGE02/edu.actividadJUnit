import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;  

public class CuentaBancariaTest {

@Test// Prueba para el método ingresar
public void testIngresar(){
    // Crear una cuenta bancaria con un saldo inicial de 1000.0
    CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000.0);
    // Prueba al ingresar 500.0 a la cuenta
    cuenta.ingresar(500.0);
    assertEquals(1500.0, cuenta.getSaldo(), 0.001, "El saldo debería ser 1500.0 después de ingresar 500.0");
    // Prueba al intentar ingresar numeros negativos a la cuenta
    }

@Test // Prueba para el método retirar
public void testRetirar(){
    // Crear una cuenta bancaria con un saldo inicial de 1000.0
    CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000.0);
    // Prueba al retirar 500.0 a la cuenta
    cuenta.retirar(500.0);
    assertEquals(500.0, cuenta.getSaldo(), 0.001, "El saldo debería ser 500.0 después de retirar 500.0");
    

}
@Test // Prueba para el método retirar retirando todo el saldo
public void testRetirarTodo(){
    // Crear una cuenta bancaria con un saldo inicial de 1000.0
    CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000.0);
    // Prueba al retirar todo el saldo de la cuenta
    cuenta.retirar(1000.0);
    assertEquals(0.0, cuenta.getSaldo(), 0.001, "El saldo debería ser 0.0 después de retirar todo el saldo");
    

}

@Test // Prueba para el método ingresar intentando ingresar una cantidad negativa
public void testIngresarNegativos(){
    // Crear una cuenta bancaria con un saldo inicial de 1000.0
    CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000.0);
    cuenta.ingresar(-200.0);
    assertEquals(1000.0, cuenta.getSaldo(), 0.001, "El saldo no debería cambiar al intentar ingresar una cantidad negativa");
    // Falla al intentar Ingresar una cantidad negativa porque no hay 
    // validación en el método ingresar para evitarlo, lo que permite que el saldo
    // se reduzca incorrectamente.
    // Para corregir esto, se debería agregar una validación
    // en el método ingresar para asegurarse de que la cantidad ingresada sea positiva.


}
@Test // Prueba de los métodos en el estado de cuenta bloqueada
public void testCuentaBloqueada() {
    // Crear una cuenta bancaria con un saldo inicial de 1000.0
    CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000.0);
    // Bloquear la cuenta
    cuenta.setBloqueada(true);
    // Intentar ingresar dinero en la cuenta bloqueada
    boolean ingresoExitoso = cuenta.ingresar(500.0);
    assertFalse(ingresoExitoso, "No se debería poder ingresar dinero en una cuenta bloqueada");
    // Intentar retirar dinero de la cuenta bloqueada
    boolean retiroExitoso = cuenta.retirar(500.0);
    assertFalse(retiroExitoso, "No se debería poder retirar dinero de una cuenta bloqueada");
    // Habilitar la cuenta nuevamente
    cuenta.setBloqueada(false);
    // Intentar ingresar dinero en la cuenta desbloqueada
    boolean ingresoExitosoDesbloqueada = cuenta.ingresar(500.0);
    assertTrue(ingresoExitosoDesbloqueada, "Se debería poder ingresar dinero en una cuenta desbloqueada");

}

public void transferirPositivoTest() {
	CuentaBancaria cuenta2 = new CuentaBancaria("Pepa Morales", 50);
	assertTrue(cuenta,transferir)
	
}
}