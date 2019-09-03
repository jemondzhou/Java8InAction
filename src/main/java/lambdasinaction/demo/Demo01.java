package lambdasinaction.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoukai
 * @date 2019/9/3
 */
public class Demo01 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.stream().forEach(p -> System.out.printf(p));

    }
}
