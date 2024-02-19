package mobile.services;

import mobile.po.LangSelectPage;
import mobile.po.SearchPage;

public class LangSelectService {
    private final LangSelectPage languageSelectPage = new LangSelectPage();
    public void spanishClick(){
        languageSelectPage.clickOnSpanish();
    }
}
