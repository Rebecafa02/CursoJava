package Desafios;

public class ManipulacaoString {
    public static String reverseAlphabets(String input){
        StringBuilder resultado = new StringBuilder();
        for(int i = input.length() -1; i >=0; i--){
            char c = input.charAt(i);
            if(Character.isLetter(c)){
                resultado.append(c);
            }
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseAlphabets("Java 123!"));
    }
}
