import com.github.zhaohonglin1995.dubbo.provider.api.ITestProvider;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述:
 *
 * @author 赵红林(OF1116)
 */
public class TestDubboProvider {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        ITestProvider iTestProvider=ctx.getBean(ITestProvider.class);
        String str=iTestProvider.sayHi("Hi~");
        System.out.println(str);
    }
}
