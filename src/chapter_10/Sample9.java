package chapter_10;

import java.util.Date;

public class Sample9 {
    static interface Customer {
        int amountInvoicedIn(DateRange range);
        int amountReceivedIn(DateRange range);
        int amountOverdueIn(DateRange range);
    }
}
