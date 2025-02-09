package org.javarush;

class CaesarCipher {
    String encrypt(String txt, int code) {
        return encodeHelper(txt, code);
    }

    String decrypt(String txt, int code) {
        return encodeHelper(txt, -code);
    }

    private String encodeHelper(String txt, int code) {
        char[] charArrayTxt = txt.toCharArray();
        for (int i = 0; i < charArrayTxt.length; i++) {
            charArrayTxt[i] = (char) (charArrayTxt[i] + code);
        }
        return new String(charArrayTxt);
    }
}
