import static org.junit.jupiter.api.Assertions.*;

class BarcaBugsTest {

    /*
    -Testar se o usuário colocar uma fileira maior que 60.
    [F80A18]
     */
    @org.junit.jupiter.api.Test
    void test_fileira_maior_que_60() {
        BarcaBugs barcaBugs = new BarcaBugs();
        assertEquals(0, barcaBugs.ocupaLugar("F80A18"));
    }

    /*
    -Testar se o usuário colocar um assento maior que 20.
    [F10A25]
    */
    @org.junit.jupiter.api.Test
    void test_assento_maior_que_20() {
        BarcaBugs barcaBugs = new BarcaBugs();
        assertEquals(0, barcaBugs.ocupaLugar("F10A25"));
    }

    /*
    -Testar se o usuário não colocar o "F" no primeiro caractere.
    [G05A12]
    */
    @org.junit.jupiter.api.Test
    void test_string_F_no_primeiro_caractere() {
        BarcaBugs barcaBugs = new BarcaBugs();
        assertEquals(0, barcaBugs.ocupaLugar("G05A12"));
    }

    /*
    -Testar se o usuário não colocar o "A" no quarto caractere.
    [F17B08]
    */
    @org.junit.jupiter.api.Test
    void test_string_A_no_quarto_caractere() {
        BarcaBugs barcaBugs = new BarcaBugs();
        assertEquals(0, barcaBugs.ocupaLugar("F17B08"));
    }

    /*
    -Testar se o usuário não colocar 6 caracteres no input.
    [F01A6]
    */
    @org.junit.jupiter.api.Test
    void test_menos_caracteres() {
        BarcaBugs barcaBugs = new BarcaBugs();
        assertEquals(0, barcaBugs.ocupaLugar("F01A6"));
    }

    /*
    -Testar se o usuário não colocar um número nos índices 2, 3, 5 e 6 da string (partindo do 1).
    [Fa5A16]
    [F1sA04]
    [F03Af9]
    [F09A1a]
    */
    @org.junit.jupiter.api.Test
    void test_numeros_nas_fileiras_e_assentos() {
        BarcaBugs barcaBugs = new BarcaBugs();
        assertEquals(0, barcaBugs.ocupaLugar("Fa5A16"));
        assertEquals(0, barcaBugs.ocupaLugar("F1sA04"));
        assertEquals(0, barcaBugs.ocupaLugar("F03Af9"));
        assertEquals(0, barcaBugs.ocupaLugar("F09A1a"));
    }

    /*
    -Testar se o usuário colocar um assento que ja esta ocupado.
    [F01A18]
    [F01A18]
    */
    @org.junit.jupiter.api.Test
    void test_assento_ocupado() {
        BarcaBugs barcaBugs = new BarcaBugs();
        assertEquals(3, barcaBugs.ocupaLugar("F01A18"));
        assertEquals(1, barcaBugs.ocupaLugar("F01A18"));
    }
}