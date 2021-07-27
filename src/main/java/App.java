import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        boolean result = bean==bean1;
        System.out.println("Результат сравнения ссылок бинов helloworld: " + result);

        Cat beanCat = (Cat) applicationContext.getBean("cat");
        Cat beanCat1 = (Cat) applicationContext.getBean("cat");
        boolean result1 = beanCat==beanCat1;
        System.out.println("Результат сравнения ссылок бинов cat: " + result1);
    }
}