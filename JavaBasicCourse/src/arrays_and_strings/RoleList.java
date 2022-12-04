/**
 * Role list and script
 *
 * @author Valentyn Mozul
 * @version 1.0 from 01.12.2022
 */

package arrays_and_strings;

public class RoleList {
    String printTextPerRole(String[] roles, String[] textRoles) {
        StringBuilder stringBuilder = new StringBuilder();
//        for (String role : roles) {
//            stringBuilder.append(role).append(":\n");
//            for (int a = 0; a < textRoles.length; a++) {
//                if (textRoles[a].startsWith(role + ":")) {
//                    stringBuilder.append(a + 1).append(")").
//                            append(textRoles[a].replaceFirst(role + ":", "")).append("\n");
//                }
//            }
//            stringBuilder.append("\n");
//        }
        for (int t = 0; t < roles.length; t++) {
            stringBuilder.append(roles[t]).append(":").append("\n");
            for (int a = 0; a < textRoles.length; a++) {
                if (textRoles[a].startsWith(roles[t] + ":")) {
                    stringBuilder.append(a + 1).append(")").
                            append(textRoles[a].substring(roles[t].length() + 1)).append("\n");
                }
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}

class RoleListDemo {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        RoleList roleList = new RoleList();
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
