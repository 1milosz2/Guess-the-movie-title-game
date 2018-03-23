package com.company;

public class MaskedString {

    private String maskedString;
    private String unmaskedString;

    public MaskedString(String s) {
        this.unmaskedString = s;
        this.maskedString = maskString(s);
    }

    public String tryToRevealLetter (char c){

        StringBuilder uncoverLetterBuilder = new StringBuilder(maskedString);

            for (int i = 0; i < unmaskedString.length(); i++) {
                if (unmaskedString.indexOf(c, i) < 0) break;
                else
                    uncoverLetterBuilder.setCharAt(unmaskedString.indexOf(c, i), c);
            }

        return uncoverLetterBuilder.toString();
    }

    public String tryToRevealString (String s){
        if (s.equals(unmaskedString)){
            return unmaskedString;
        }
        else return maskedString;
    }

    private String maskString (String s){
        StringBuilder maskedStringBuilder = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isWhitespace(s.charAt(i))) {
                maskedStringBuilder.setCharAt(i, '*');
            }
        }
        return maskedStringBuilder.toString();

    }

    public String getUnmaskedString() {
        return unmaskedString;
    }

    public String getMaskedString() {
        return maskedString;
    }
}





