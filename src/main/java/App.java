import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat1 = (Cat) applicationContext.getBean("catBean");
        Cat cat2 = (Cat) applicationContext.getBean("catBean");
        System.out.println("bean = bean1 is " + (bean == bean2));
        System.out.println("cat1 = cat2 is " + (cat1 == cat2));

    }
}