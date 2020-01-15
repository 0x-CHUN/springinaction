package concert;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Criticism {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("criticism.xml");
        Performance performance = context.getBean(Performance.class);
        performance.perform();
        context.close();
    }
}
