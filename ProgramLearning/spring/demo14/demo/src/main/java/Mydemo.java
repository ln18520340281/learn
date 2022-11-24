import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lenny.config.SpringCongfig;
import com.lenny.dao.UserDao;

public class Mydemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringCongfig.class);
        UserDao userDao = context.getBean(UserDao.class);
        userDao.test();
        context.close();
    }
}
