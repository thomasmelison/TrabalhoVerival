import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarcaBugsTest {


    /*
    -Testar se o usuário colocar uma fileira maior que 60.
    [F80A18]
     */
    @org.junit.jupiter.api.Test
    void test_centesimo_primeiro_passageiro() {
        BarcaBugs barcaBugs = new BarcaBugs();

        for(int fileira = 0 ; fileira <= 4 ; fileira++){
            for(int assento = 0; assento <=19 ; assento++ ){
                barcaBugs.ocupaLugar(fileira,assento);
            }
        }
        System.out.println(barcaBugs.qtdadeAssentosOcupados);
        int resultado = barcaBugs.ocupaLugar("F50A01");
        System.out.println(barcaBugs.qtdadeAssentosOcupados);
        assertEquals(3, resultado);
    }

    /*
    Se o primeiro usuário adiciona dentro do intervalo F[1-20], não precisa
    testar assento por que pode ser qualquer um dentro do intervalo valido.
    Input: [F01A01]
     */
    @org.junit.jupiter.api.Test
    void test_primeiro_passageiro() {
        BarcaBugs barcaBugs = new BarcaBugs();

        assertEquals(3, barcaBugs.ocupaLugar("F41A19"));
    }

    /*
    Se nos 100 primeiros passageiros adicionamos fora do intervalo
    onde a fileira vai de 0 a 20 ,não precisa testar assento pq
    já está no "retorna 0" (sem incluir zero).
    Input: F50A10
     */
    @org.junit.jupiter.api.Test
    void test_primeiro_passageiro_escolhe_assento_desbalanceado() {
        BarcaBugs barcaBugs = new BarcaBugs();

        assertEquals(2, barcaBugs.ocupaLugar("F50A10"));
    }

    /*
    Se, depois de acionar 100 usuários corretamente, adicionamos um fora
    do intervalo de fileiras 40 a 60,não precisa testar assento pq
    já está no "retorna 0".
    Input: F[0-20]A[0-20] + F21A01
     */
    @org.junit.jupiter.api.Test
    void test_centesimo_primeiro_passageiro_escolhe_assento_desbalanceado() {
        BarcaBugs barcaBugs = new BarcaBugs();
        int soma = 0;
        for(int fileira = 0 ; fileira <= 4 ; fileira++){
            for(int assento = 0; assento <=19 ; assento++ ){
                barcaBugs.ocupaLugar(fileira,assento);
            }
        }
        System.out.println(barcaBugs.qtdadeAssentosOcupados);
        assertEquals(2, barcaBugs.ocupaLugar("F30A01"));
    }


}