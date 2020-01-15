package ru.kravchenko.sb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import ru.kravchenko.sb.api.service.AbstractParserHtmlService;
import ru.kravchenko.sb.api.service.IParserHtmlService;

import java.util.Map;

/**
 * @author Roman Kravchenko
 */

@Async
@Component
public class MailHtml extends AbstractParserHtmlService {

    private final static String MAIL = "http://www.mail.ru";

    private final static String FILE_NAME = "mailHtml.txt";

    public void init() {
        final String html = getAnyHtmlPage(MAIL);
        saveHtmlStringToFile(html, FILE_NAME);
        System.out.println(Thread.currentThread().getId());
    }

    @Override
    public String getAnyHtmlPage(String page) {
        return super.getAnyHtmlPage(page);
    }

    @Override
    public void saveHtmlStringToFile(String htmlPage, String fileName) {
        super.saveHtmlStringToFile(htmlPage, fileName);
    }

}
