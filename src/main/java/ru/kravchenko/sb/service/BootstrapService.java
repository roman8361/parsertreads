package ru.kravchenko.sb.service;

import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kravchenko.sb.api.service.IBootstrapService;
import ru.kravchenko.sb.event.AsyncComponent;

/**
 * @author Roman Kravchenko
 */

@Service
public class BootstrapService implements IBootstrapService {

    @Autowired
    private MailHtml mailHtml;

    @Autowired
    private YandexHtml yandexHtml;

    @Autowired
    private ProxyRequest proxyRequest;

    @Autowired
    FreeProxyParserService freeProxyService;

    @Autowired
    AsyncComponent asyncComponent;

    @Override
    public void init() {
        System.out.println("Init thread id: " +  Thread.currentThread().getId());
        asyncComponent.asyncMethod();
//        mailHtml.init();
//        yandexHtml.init();
//        proxyRequest.init();
 //       getAnyHtmlByJsoup();
  //      freeProxyService.init();

    }

    @SneakyThrows
    public void getAnyHtmlByJsoup() {
//        System.setProperty("http.proxyHost", "36.55.239.38");
//        System.setProperty("http.proxyPort", "8080");


//        String webPage = "https://mail.ru/";
        String webPage = "https://2ip.ru/";
        String html = Jsoup.connect(webPage).proxy("114.5.195.226", 8080).get().html();
//        String html = Jsoup.connect(webPage).get().html();
        System.out.println(html);
//        BufferedWriter writer = new BufferedWriter(new FileWriter("https://2ip.ru/.txt"));
//        writer.write(html);

//        writer.close();

    }

}
