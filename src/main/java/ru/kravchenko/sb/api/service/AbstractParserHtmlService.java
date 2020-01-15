package ru.kravchenko.sb.api.service;

import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @author Roman Kravchenko
 */

@Component
public abstract class AbstractParserHtmlService {

    private final static String URL = "";

    private final static String FILE_NAME = "";

    public void init() {
        final String html = getAnyHtmlPage(URL);
        saveHtmlStringToFile(html, FILE_NAME);
        System.out.println(Thread.currentThread().getId());
    }

    @SneakyThrows
    public String getAnyHtmlPage(final String page) {
        return Jsoup.connect(page).get().html();
    }

    @SneakyThrows
    public void saveHtmlStringToFile(final String htmlPage, final String fileName) {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(htmlPage);
        writer.close();
    }

}
