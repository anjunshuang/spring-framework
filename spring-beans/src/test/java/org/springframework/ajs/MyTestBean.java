package org.springframework.ajs;

/**
 * @ClassName MyTestBean
 * @Description TODO
 * @Author anjunshuang
 * @Date 2019/9/3 15:40
 * @Version 1.0
 */
public class MyTestBean {
    private String testStr = "中文还乱码吗？";

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    @Override
    public String toString() {
        return "MyTestBean{" +
                "testStr='" + testStr + '\'' +
                '}';
    }
}
