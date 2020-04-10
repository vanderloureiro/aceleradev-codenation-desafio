package com.codenation;

public class CesarDecoder {

    private final int A_MAIUSCULO = 65;
    private final int Z_MAIUSCULO = 90;
    private final int A_MINUSCULO = 97;
    private final int Z_MINUSCULO = 122;

    public CesarDecoder() {

    }

    public String decodificaMensagem(String msgCifrada, int sauto) {
        int tamanhoMensagem = msgCifrada.length();
        String msgDecifrada = "";
        for (int index = 0; index < tamanhoMensagem; index++) {
            char letraAtual = msgCifrada.charAt(index);

            if ( this.seMaiuscula(letraAtual, sauto) )
                msgDecifrada += this.trataLetraMaiuscula(letraAtual, sauto);
            else if ( this.seMinuscula(letraAtual, sauto) ) 
                msgDecifrada += this.trataLetraMinuscula(letraAtual, sauto);
            else msgDecifrada += letraAtual;

        }
        return msgDecifrada;
    }

    private char trataLetraMinuscula(char letra, int sauto) {
        if ( (letra - sauto) < this.A_MINUSCULO) {
            int diferenca = this.A_MINUSCULO - (letra - sauto);
            return (char) ( this.Z_MINUSCULO - diferenca + 1 );
        } else {
            return (char) (letra - sauto);
        }
    }

    private char trataLetraMaiuscula(char letra, int sauto) {
        if ( (letra - sauto) < this.A_MAIUSCULO) {
            int diferenca = this.A_MAIUSCULO - (letra - sauto);
            return (char) ( this.Z_MAIUSCULO - diferenca + 1);
        } else {
            return (char) (letra - sauto);
        }
    }

    private boolean seMaiuscula(char letra, int sauto) {
        return ( letra >= this.A_MAIUSCULO &&  letra <= this.Z_MAIUSCULO);
    }

    private boolean seMinuscula(char letra, int sauto) {
        return ( letra >= this.A_MINUSCULO && letra <= this.Z_MINUSCULO );
    }
}