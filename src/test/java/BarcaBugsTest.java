import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarcaBugsTest {



    /*
    -Testar se o usuário colocar uma fileira maior que 60.
    [F80A18]
     */
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

    /*
    Se nos 100 primeiros passageiros adicionamos fora do intervalo
    onde a fileira vai de 1 a 20 retorna 2.
    Input: F50A10
     */
    @org.junit.jupiter.api.Test
    void test_primeiro_passageiro_escolhe_assento_desbalanceado() {
        BarcaBugs barcaBugs = new BarcaBugs();

        assertEquals(2, barcaBugs.ocupaLugar("F50A10"));
    }

    /*
    Se, depois de acionar 100 usuários corretamente, adicionamos um fora
    do intervalo de fileiras 40 a 60, retorna 2.
    Input: F[0-20]A[0-20] + F30A01
     */
    @org.junit.jupiter.api.Test
    void test_centesimo_primeiro_passageiro_escolhe_assento_desbalanceado() {
        BarcaBugs barcaBugs = new BarcaBugs();
        for(int fileira = 1 ; fileira <= 5 ; fileira++){
            for(int assento = 0; assento < 20 ; assento++ ){
                barcaBugs.ocupaLugar(fileira,assento);
            }
        }
        barcaBugs.ocupaLugar(20,19);
        assertEquals(2, barcaBugs.ocupaLugar("F30A01"));
    }




    // Se o 101º usuário adiciona dentro do intervalo F[40-60]
    // retorna 3.
    // Input: F[0-20]A[0-20] + F50A01
    @org.junit.jupiter.api.Test
    void test_centesimo_primeiro_passageiro() {
        BarcaBugs barcaBugs = new BarcaBugs();

        for(int fileira = 0 ; fileira <= 4 ; fileira++){
            for(int assento = 0; assento <=19 ; assento ++ ){
                barcaBugs.ocupaLugar(fileira,assento);
            }
        }
        assertEquals(3, barcaBugs.ocupaLugar("F50A01"));
    }

    /*
    Se o primeiro usuário adiciona dentro do intervalo F[1-20],
    Input : F15A15
     */
    @org.junit.jupiter.api.Test
    void test_primeiro_passageiro() {
        BarcaBugs barcaBugs = new BarcaBugs();

        assertEquals(3, barcaBugs.ocupaLugar("F15A15"));

    }

   





}