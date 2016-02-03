import com.github.zhaohonglin1995.dubbo.provider.api.ITestProvider;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述:dubbo-Consumer调用方
 *
 */
public class TestDubboProvider {
    public static void main(String[] args) {
        //开始调用
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        ITestProvider iTestProvider=ctx.getBean(ITestProvider.class);
        //只负责调用这个接口方法,不需要关注具体实现
        String str=iTestProvider.sayHi("dubbo");
        System.out.println(str);
    }
}
