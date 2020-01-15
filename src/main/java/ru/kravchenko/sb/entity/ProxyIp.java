package ru.kravchenko.sb.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Roman Kravchenko
 */

@Getter
@Setter
public class ProxyIp extends AbstractEntity {

    private String ip;

    private String port;

    @Override
    public String toString() {
        return "ProxyIp{" +
                "ip='" + ip + '\'' +
                ", port='" + port + '\'' +
                '}';
    }

}
