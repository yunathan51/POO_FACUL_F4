package jogo_perguntas_respostas.test;

import jogo_perguntas_respostas.Arquivo;
import jogo_perguntas_respostas.Pergunta;
import jogo_perguntas_respostas.Resposta;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class JogoTest {

    private Arquivo jogo = new Arquivo();

    @Test
    void carregaArquivoTest() {
        jogo.lerArquivo();
        assertEquals(50, jogo.getPerguntas().size());
        Pergunta quarta = jogo.getPerguntas().get(3);
        assertEquals("A agua ferve a 100 graus Celcius.", quarta.getTitulo());
        assertEquals(true, quarta.isRespostaCorreta());
    }

    @Test
    void fazCorrecaoTest() {
        Pergunta pergunta = new Pergunta("ABCD é EFGH,Falso");
        Resposta r = new Resposta(pergunta, false);
        assertEquals("acerto", r.correcao());
    }

    @Test
    void calculaPontuacaoTest() {
        assertEquals(2, jogo.calculaPontuacao(respostasControladas()));
    }

    @Test
    void gravarRespostaTest() {
        ArrayList<Resposta> respostas = respostasControladas();
        jogo.gravaResultado(respostas);
        String conteuArq = jogo.lerArquivo();


    }

    @Test
    void sorteiaRodada() {
        jogo.lerArquivo();
        Pergunta primeira = jogo.getPerguntas().get(0);
        Pergunta segunda = jogo.getPerguntas().get(3);
        assertEquals("A água ferve a 100 graus Celsius", primeira);
        assertEquals("A água ferve a 100 graus Celsius", segunda);
        assertEquals("A água ferve a 100 graus Celsius", primeira);
        ArrayList<Pergunta> sorteadas = jogo.sorteiaRodada(10);
        primeira = sorteadas.get(0);
        segunda = sorteadas.get(1);
        assertEquals("As baleias são mamiferos.", primeira.getTitulo());
        assertEquals("O sol gira em torno  da Terra.", segunda.getTitulo());
        assertEquals(10, sorteadas.size());
    }



    private ArrayList<Resposta> respostasControladas() {
        ArrayList<Resposta> respostas = new ArrayList<Resposta>();
        Pergunta p1 = new Pergunta("A", false);
        Pergunta p2 = new Pergunta("B", false);
        Pergunta p3 = new Pergunta("C", true);
        Pergunta p4 = new Pergunta("D", true);
        respostas.add(new Resposta(p1, false));
        respostas.add(new Resposta(p2, false));
        respostas.add(new Resposta(p3, false));
        respostas.add(new Resposta(p4, false));
        return respostas;
    }
}
