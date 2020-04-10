package com.codenation;

public class App 
{
    public static void main( String[] args )
    {
        // Descriptando
        String msgCriptografada    = "xurq iagxp nq ea ygot qmeuqd ur iq azxk tmp ftq eagdoq oapq. gzwzaiz";
        int sautoCriptografia      = 12;
        CesarDecoder cesarDecoder  = new CesarDecoder();
        String msgDescriptografada = cesarDecoder.decodificaMensagem(msgCriptografada, sautoCriptografia);
        System.out.println( "Mensagem descriptografada: " + msgDescriptografada );

        // Resumo criptográfico
        Sha1Enconder sh1Enconder = new Sha1Enconder();
        try {
            String msgResumida   = sh1Enconder.resume(msgDescriptografada);
            System.out.println( "Resumo criptográfico: " + msgResumida );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
