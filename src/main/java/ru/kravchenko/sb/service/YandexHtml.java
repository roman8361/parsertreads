package ru.kravchenko.sb.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import ru.kravchenko.sb.api.service.AbstractParserHtmlService;
import ru.kravchenko.sb.api.service.IParserHtmlService;

/**
 * @author Roman Kravchenko
 */

@Async
@Component
public class YandexHtml extends AbstractParserHtmlService {

    private final static String YANDEX = "http://www.mail.ru";

    private final static String FILE_NAME = "yandexHtml.txt";

    @Override
    public void init() {
        final String html = getAnyHtmlPage(YANDEX);
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
