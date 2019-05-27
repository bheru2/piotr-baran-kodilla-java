package com.kodilla.stream.beautifier;

public class StreamMain {
    public static void main(String[] args) {
        String sampleText = "Test Text";
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify(sampleText, decorate -> sampleText.toLowerCase()));
        System.out.println(poemBeautifier.beautify(sampleText, decorate -> sampleText.toUpperCase()));
        System.out.println(poemBeautifier.beautify(sampleText, decorate -> {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < sampleText.length(); i++) {
                if (i % 2 == 0) {
                    sb.append(sampleText.substring(i, i + 1).toUpperCase());
                } else {
                    sb.append(sampleText.substring(i, i + 1).toLowerCase());
                }
            }
            return sb.toString();
        }));
        System.out.println(poemBeautifier.beautify(sampleText, decorate -> {
            char[] reverse = sampleText.toCharArray();    // instead of StringBuilder.reverse
            StringBuilder sb = new StringBuilder();
            for (int i = reverse.length - 1; i >= 0; i--) {
                sb.append(reverse[i]);
            }
            return sb.toString();
        }));
    }
}
