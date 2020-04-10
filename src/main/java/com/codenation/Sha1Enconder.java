package com.codenation;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha1Enconder {

    public Sha1Enconder() { }

    public String resume(String mensagem) throws NoSuchAlgorithmException, 
    UnsupportedEncodingException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        byte result[]   = messageDigest.digest(mensagem.getBytes("UTF-8"));
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }

}