/**
 * java basic
 * lesson 7
 *
 * @version 1.0 from 2024-01-01
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_7.home_work;

import iT_VDN.java_Essential_New.lesson_7.home_work_2.CustomException;

import java.util.Arrays;

public class MainException {
    /**
     * Program entry point.
     *
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        Recipe allRecipe = new Recipe();

        Recipe ca_cha = new Recipe("Cacha",
                Arrays.asList("water", "sole", "cru_pa", "maslo"), 20);
        System.out.println(ca_cha.listIngredients.size());
        System.out.println(ca_cha.listIngredients.get(0));
        System.out.println();

        Recipe tea = new Recipe("Tea",
                Arrays.asList("water"), 15);
        System.out.println(tea.listIngredients.size());
        System.out.println(ca_cha.listIngredients.get(2));

        try {
            allRecipe.cook(tea.listIngredients);
        } catch (Exception e) {
            if (e instanceof InsufficientIngredientsException) {
                InsufficientIngredientsException ingredientsException = (InsufficientIngredientsException) e;
                System.out.println("InsufficientIngredientsException = " + ingredientsException.getMessage());
            }
        } finally {
            System.out.println("completion of cooking");
        }

        CustomException customException = new CustomException("n 1");
        try {
            customException.throwException();
        } catch (CustomException e) {
            System.out.println("++==++ ");
            System.out.println(e.getMessage());
        }
    }
}
