package ru.kravchenko.sb.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;
import ru.kravchenko.sb.api.service.AbstractParserHtmlService;
import ru.kravchenko.sb.entity.ProxyIp;
import ru.kravchenko.sb.event.SyncEvent;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Roman Kravchenko
 */

@Service
public class FreeProxyParserService extends AbstractParserHtmlService {

    private final static String URL = "https://free-proxy-list.net/";

    public void init() {
        final String html = getAnyHtmlPage(URL);
        tableParserFromString(html);
    }

    @Override
    public String getAnyHtmlPage(String page) {
        return super.getAnyHtmlPage(page);
    }

    private List<ProxyIp> tableParserFromString(String html) {
        Document doc = Jsoup.parse(html);
        Element table = doc.select("table").get(0); //select the first table.
        Elements rows = table.select("tr");
        List<ProxyIp> allProxyList = new ArrayList<>();

        for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
            ProxyIp proxyIp = new ProxyIp();
            Element row = rows.get(i);
            proxyIp.setIp(row.child(0).text()); // ip
            proxyIp.setPort(row.child(1).text()); // port
            allProxyList.add(proxyIp);
        }

        return allProxyList;
    }

}
