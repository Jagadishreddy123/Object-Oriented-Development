package books;

import pages.AboutTheAuthorPage;
import pages.StoryPage;
import pages.TitlePage;

public class ComicBook extends Book {
    public ComicBook(){
        this.pages.add(new TitlePage());
        this.pages.add(new StoryPage());
        this.pages.add(new AboutTheAuthorPage());
    }
}
