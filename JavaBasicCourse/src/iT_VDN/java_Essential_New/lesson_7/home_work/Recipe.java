/**
 * java basic
 * lesson 7
 *
 * @version 1.0 from 2023-12-28
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential_New.lesson_7.home_work;

import java.util.List;

public class Recipe {
    private String name;
    List<String> listIngredients;
    private int time;

    public Recipe() {
    }

    public Recipe(String name, List<String> listIngredients, int time) {
        this.name = name;
        this.listIngredients = listIngredients;
        this.time = time;
    }

    public void cook(List<String> ingredients) throws InsufficientIngredientsException {
        if (ingredients.size() < 2) {
            throw new InsufficientIngredientsException("Insufficient ingredients");
        }
    }
}
