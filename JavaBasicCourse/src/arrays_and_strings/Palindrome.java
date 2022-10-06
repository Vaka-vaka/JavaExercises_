/**
 * Method that checks if a given string is a palindrome
 *
 * @author Valentyn Mozul
 * @version 1.0 from 02.10.2022
 */

/*Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
Палиндромом называется строка, которая читается одинаково слева направо и
справа налево (в том числе пустая). При определении "палиндромности" строки
должны учитываться только буквы и цифры. А пробелы, знаки препинания, а
также регистр символов должны игнорироваться. Гарантируется, что в метод
попадают только строки, состоящие из символов ASCII (цифры, латинские буквы,
знаки препинания). Т.е. русских, китайских и прочих экзотических символов
в строке не будет.*/

package arrays_and_strings;

public class Palindrome {
     boolean isPalindrome(String text){
       /*String txt1 = text.replaceAll("[^a-zA-Z0-9]", "");
       String txt2 = new StringBuilder(txt1).reverse().toString();
       return txt1.equalsIgnoreCase(txt2);*/
        /* return text.replaceAll("[^a-zA-Z0-9]", "").equalsIgnoreCase
                 (String.valueOf(new StringBuilder(text.replaceAll("[^a-zA-Z0-9]", ""))
                         .reverse()));*/
         text = text.toLowerCase();
         text = text.replaceAll("[^a-z0-9]", "");
         int len = text.length();
         // Сравниваем попарно символы, двигаясь от краёв к середине
         // Если находим хоть одну разную пару, то возвращаем false
         // Если не нашли, то возвращаем true
         for (int i=0; i<(len/2); i++){
             if (text.charAt(i) != text.charAt(len - 1 - i)) return false;
         }
         return true;
         /*text = text.toLowerCase();
         text = text.replaceAll("[^a-zA-Z0-9]", "");
         int i=0, j=text.length()-1;
         while(i<j){
             if(text.charAt(i) != text.charAt(j)){
                 return false;
             }
             i++; j--;
         }
         return true;*/
    }
}

class PalindromeDemo {
    public static void main(String[] args) {
        String txt = "Madam, I'm Adam!";
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(txt));
    }
}