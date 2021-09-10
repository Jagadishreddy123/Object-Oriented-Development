package books;

import pages.AcknowledgmentsPage;
import pages.GlossaryPage;
import pages.UnitsPage;

public class HistoryBook extends Book {
    public HistoryBook(){
        this.pages.add(new AcknowledgmentsPage());
        this.pages.add(new UnitsPage());
        this.pages.add(new GlossaryPage()); 
    }
}
