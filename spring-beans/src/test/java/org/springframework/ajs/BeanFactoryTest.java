package org.springframework.ajs;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


/**
 * @ClassName BeanFactoryTest
 * @Description TODO
 * @Author anjunshuang
 * @Date 2019/9/3 15:37
 * @Version 1.0
 */
//XmlBeanFactory已废弃，这里抑制过期警告
@SuppressWarnings(value = {"deprecation"})
public class BeanFactoryTest {

    @Test
    public void testSimpleLoad(){
        //直接使用beanFactory作为容器对于spring来说并不常见，大多数采用applicationContext，后续补充区别
        //1.读取配置文件myTestBean.xml
        //2.根据myTestBean.xml中的配置找到对应的类的配置，并实例化
        //3.调用实例化后的实例
        //思考，要实现上述的功能，我们首先需要一个configReader读取xml配置，其次还得有反射，通过配置实例化类，最后还得有一个类将它们串联起来？
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("org/springframework/beans/ajs/myTestBean.xml"));
        MyTestBean bean = beanFactory.getBean("myTestBean", MyTestBean.class);
        System.out.println(bean.getTestStr());
    }

}
