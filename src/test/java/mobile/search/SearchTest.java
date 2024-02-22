package mobile.search;

import mobile.BaseTest;
import mobile.po.*;
import mobile.services.ArticleService;
import mobile.services.ListSavedArticleService;
import mobile.services.SearchService;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchTest extends BaseTest {

    @Test
    void shouldBeArticleNameVisible() {
        new SkipPage().clickSkip();

        new SearchService().searchTest("Appium");

        var article = new ArticleService().getArticleName();

        assertThat(article).as("The article has wrong name").isEqualTo("Appium");
    }
//    @Test
//    void shouldBeSpanish(){
//        new SkipPage().clickSkip();
//
//        new SearchService().searchTest("Appium");
//
//        new ArticleService().getArticle();
//
//        new LangService().languageClick();
//
//        new LangSelectService().spanishClick();
//
//        var article = new ArticleService().getArticleHeader();
//
//        assertThat(article).as("Header").isEqualTo("Historia");
//
//    }
@Test
void shouldBeSwipeUp() {
    new SkipPage().clickSkip();

    new SearchService().searchTest("Appium");

    new ArticleService().clickArticle();

    new SavePage().clickSaveButton();

    new ListSavedArticleService()
            .addToListArticle("ABC");

    new ListSavedArticlePage()
            .swipeElementRight(150);

}

    @Test
    void sdfs() {
        new SkipPage().clickSkip();
        new MainPage().swipeToElementTo();

    }
    @Test
    void shouldBeDeletedFromFavourites() {
        new SkipPage().clickSkip();
        new MainPage().scrollToElementMoreTopRead();
        new ArticleService().clickMoreTopRead();
        new ArticleService().clickValentineArticle();
        new SavePage().clickSaveButton();
        new ListSavedArticleService()
                .addToListArticle("MyList");
        new ListSavedArticlePage()
                .swipeElementRight(150);

    }
}