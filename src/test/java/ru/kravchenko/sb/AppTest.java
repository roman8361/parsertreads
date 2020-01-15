package ru.kravchenko.sb;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import lombok.SneakyThrows;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.kravchenko.sb.api.repository.IUserRepository;
import ru.kravchenko.sb.entity.User;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class AppTest {

    private Lorem lorem = new LoremIpsum();

    @Autowired
    IUserRepository userRepository;

    @Test
    public void createAnyUser() {
        for (int i = 0; i < 1; i++) {
            userRepository.save(getAnyUser());
        }
    }

    @Test
    public void delAllUser() {
        userRepository.deleteAll();
    }

    @Test
    @SneakyThrows
    public void jsonTest() {
        User user = getAnyUser();
        final ObjectMapper objectMapper = new ObjectMapper();
        final String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);

        User user1 = objectMapper.readValue(json, User.class);

        System.out.println(user1);
        Assert.assertNotNull(json);
    }

    private User getAnyUser() {
        User user = new User();
        user. setLogin(lorem.getNameMale());
        user.setPasswordHash(lorem.getZipCode());
        return user;
    }

}
