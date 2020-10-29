package com.company;

public class LeetCodeProblem1 {
    String[] words = {"bat","bt","hat","tree","cat","cricket"};
    String chars = "atach";

    public static void main(String[] args) {
        LeetCodeProblem1 leetCodeProblem1 = new LeetCodeProblem1();
        int p= leetCodeProblem1.countCharacters(leetCodeProblem1.words, leetCodeProblem1.chars);
        System.out.println(p);
    }

    public int countCharacters(String[] words, String chars) {
        String text = "";
        String check="";
        int count=0;
        int value=1;
        for (int i = 0; i < words.length; i++) {
            check=words[i];
            for (int j=0;j<check.length();j++){
                if (!chars.contains(String.valueOf(check.charAt(j)))){
                    System.out.println(check);
                    value=2;
                    count++;
                    System.out.println(chars+"\t"+String.valueOf(check.charAt(j))+" "+count);
                }
            }
            if (value==1){
                text=text+check;
            }
            else {
                value=1;
            }
        }
        System.out.println(text);
//        for (int i = 0; i < words.length; i++) {
//
//        }
        return text.length();
    }

}
