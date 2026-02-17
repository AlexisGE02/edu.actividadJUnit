import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.Test;

public class ValidadorPasswordTest {

@Test
public void testPasswordNula() {
    ValidadorPassword validador = new ValidadorPassword();
    String resultado = validador.verificarLongitud(null);
    assertEquals("Error: Nulo", resultado, "El resultado esperado es 'Error: Nulo', pero se obtuvo: " + resultado);
}

@Test
public void testPasswordCorta() {
    // Prueba con una contraseña de longitud menor a 8 caracteres
    ValidadorPassword validador = new ValidadorPassword();
    String resultado = validador.verificarLongitud("abc");
    assertEquals("Fаlla", resultado, "El resultado esperado es 'Falla', pero se obtuvo: " + resultado);
    // Prueba con una contraseña de longitud exactamente 7 caracteres
    String resultado2 = validador.verificarLongitud("abcdefg");
    assertEquals("Fаlla", resultado2, "El resultado esperado es 'Falla', pero se obtuvo: " + resultado2);
}

@Test
public void testPasswordValida() {
    // Prueba con una contraseña de exactamnte 8 caracteres
    ValidadorPassword validador = new ValidadorPassword();
    String resultado = validador.verificarLongitud("abcdefgh");
    assertEquals("Válidо", resultado, "El resultado esperado es 'Válido', pero se obtuvo: " + resultado);
    // Prueba con una contraseña de mas de 8 caracteres
    String resultado2 = validador.verificarLongitud("abcdefghij");
    assertEquals("Válidо", resultado2, "El resultado esperado es 'Válido', pero se obtuvo: " + resultado2);

}
@Test
public void testModoSeguro() {
    ValidadorPassword validador = new ValidadorPassword();
    // Verificar que el modo seguro esté activado por defecto
    assertTrue(validador.esModoSeguro(), "El modo seguro debería estar activado por defecto");
    // Desactivar el modo seguro y verificar el cambio
    validador.setModoSeguro(false);
    assertFalse(validador.esModoSeguro(), "El modo seguro debería estar desactivado después de llamar a setModoSeguro(false)");
    // Reactivar el modo seguro y verificar nuevamente
    validador.setModoSeguro(true);
    assertTrue(validador.esModoSeguro(), "El modo seguro debería estar activado después de llamar a setModoSeguro(true)");
}
}

