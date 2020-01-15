package ru.kravchenko.sb.api.service;

import org.springframework.stereotype.Component;

/**
 * @author Roman Kravchenko
 */

@Component
public interface IParserHtmlService {

    void getHtmlPage (String site);

}
