package ru.kravchenko.sb.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import ru.kravchenko.sb.api.service.AbstractParserHtmlService;

/**
 * @author Roman Kravchenko
 */

@Async
@Component
public class ProxyRequest extends AbstractParserHtmlService {

    private final static String HTTPS_2_IP_RU = "https://2ip.ru/";

    private final static String FILE_NAME = "2ip.ru.txt";

    @Override
    public void init() {
        final String html = getAnyHtmlPage(HTTPS_2_IP_RU);
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
