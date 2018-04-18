/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maroš
 */
public class Languages {

    public String languageName, languageLevel;

    public Languages(String languageName, String languageLevel){
        this.languageName = languageName;
        this.languageLevel = languageLevel;
    }
    public String getLanguageName() {
        return languageName;
    }

    public String getLanguageLevel() {
        return languageLevel;
    }
}
