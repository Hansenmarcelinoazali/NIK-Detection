package org.example;

public class Main {
    public static void main(String[] args) {
        String inputNIK = "1234567890123456"; //input NIK
        System.out.println(validasiNIK(inputNIK));
    }

    public static String validasiNIK(String inputNIK) {
        if (inputNIK.length() != 16 || !inputNIK.matches("\\d+")) {
            return "NIK FAIL";
        }
        return "NIK OK";
    }
}