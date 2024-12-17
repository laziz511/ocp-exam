package com.laziz.assessment_test.question6;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Question: Suppose that we have the following property files and code.
 * What values are printed on lines 8 and 9, respectively?
 * Penguin.properties
 * name=Billy
 * age=1
 * Penguin_de.properties
 * name=Chilly
 * age=4
 * Penguin_en.properties
 * name=Willy
 * Answer: C. Willy and 1
 * Description:
 * - Java will use Penguin_en.properties as the matching resource bundle on the line 7
 * - since there is no match for French, the default locale is used.
 * - line 8 finds a matching key in the Penguin_en.properties file
 * - line 9 does not find a match in the Penguin_en.properties file; therefore,
 *      it has to look higher up in the hierarchy to Penguin.properties
 */
public class Question6 {
    public static void main(String[] args) {
        Locale fr = new Locale("fr");
        Locale.setDefault(new Locale("en", "US"));
        var b = ResourceBundle.getBundle("Penguin", fr); // line 7
        System.out.println(b.getString("name")); // line 8
        System.out.println(b.getString("age")); // line 9
    }
}
