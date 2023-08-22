package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Incremento (i vale 1)***");
        Integer i = 1;

        System.out.println(i++); // Impressão: 1
        System.out.println(i);  // Impressão: 2, pois foi incrementado após a linha anterior e agora está atualizado.
        System.out.println(++i); // Impressão: 3, pois já foi incrementado e adicionado a variavel i
        System.out.println(i); // Impressão: 3, não tem necessidade de imprimir i pois a impressão já foi feita na linha anterior de forma simplificada ++i.

        /* Forma extensa |   Forma simplificada
            I = 3        |   I = 3
            I++ = 3      |   ++I = 4
            I = 4        |
        Forma extensa: atualização da variável ocorre na 3ª linha. Na 2ª linha o incremento ocorre depois da variável na própria estrutura, portanto, se faz necessário chamar a variável novamente para atualizar seu valor agora incrementado.
        Forma simplificada: a atualização da variável ocorre na 2ª linha mesmo, pois quando a incrementação vem antes da variavel na própria estrutura, ela já retorna o valor atualizado incrementado.

         */

        System.out.println("\n");
        System.out.println("*** Decremento (k vale 5)***");
        Integer k = 5;

        System.out.println(k--);
        System.out.println(k);
        System.out.println(--k);
        System.out.println(k);
    }
}