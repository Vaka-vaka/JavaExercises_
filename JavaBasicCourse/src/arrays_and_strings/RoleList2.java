/**
 * Role list and script2
 *
 * @author Valentyn Mozul
 * @version 1.0 from 02.12.2022
 */

package arrays_and_strings;

public class RoleList2 {
     String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder res = new StringBuilder();                  // Создание результирующей строки в StringBuilder
        for (int i = 0; i < roles.length; i++) {                  // Прохождение по массиву roles[]
            String rol = roles[i] + ":";                          // Перевод эл-та массива roles[] в строку и добавление ":"
            res.append(rol + "\n");                               // Добавление в строку переведенного эл-та массива и перевод строки
            for (int j = 0; j < textLines.length; j++) {          // Прохождение по массиву textLines[]
                String text = textLines[j];                       // Перевод эл-та массива textLiness[] в строку
                if (text.startsWith(rol)) {                        // Цикл для проверки начала строки с текстом и ролью:
                    StringBuilder text1 = new StringBuilder(text);// Перевод текста из String в StringBuilder для форматирования
                    text1.delete(0, roles[i].length() + 2);       // Удаление симоволов в начале строки с текстом роли
                    text1.toString();                             // Перевод из StringBuilder обратно в String
                    res.append((j + 1) + ") " + text1 + "\n");    // Добавление в строку индекса текста, скобки с пробелом и
                }                                                 // текста роли, переводя все на новую строку
            }
            res.append("\n");                                     // Перевод строки, для отступа между ролями
        }
        String res1 = res.toString();                                 // Перевод результата из StringBuilder обратно в String
        return res1;                                                  // Возвращение результата из метода типа String
    }
}

class RoleListDemo2 {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        RoleList2 roleList = new RoleList2();
        System.out.println(roleList.printTextPerRole(new String[]{"" +
                        "Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"
                },
                new String[]{"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить" +
                        " вам пренеприятное известие: к нам едет ревизор.",
                        "Аммос Федорович: Как ревизор?",
                        "Артемий Филиппович: Как ревизор?",
                        "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                        "Аммос Федорович: Вот те на!",
                        "Артемий Филиппович: Вот не было заботы, так подай!",
                        "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
                }
        ));
    }
}