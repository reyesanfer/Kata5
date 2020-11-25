
package kata5;

import kata5.model.Mail;
import kata5.model.Histogram;
import java.util.List;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2020/11/25 09:54 GMT
 *
 */

public class MailHistogramBuilder {

    public static Histogram<String> build (List<Mail> mailList) {
        
        Histogram<String> histogram = new Histogram<>();
        
        for (Mail mail : mailList) {
            histogram.increment(mail.getDomain());
        }
        
        return histogram;
    }
}
