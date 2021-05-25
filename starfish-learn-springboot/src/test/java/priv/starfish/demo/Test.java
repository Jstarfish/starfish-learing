package priv.starfish.demo;


import org.springframework.util.Assert;

import java.util.Optional;

/**
 * @description:
 * @author: starfish
 * @date: 2021/2/22 17:15
 */
public class Test {

    public static void main(String[] args) {
        //Assert.isTrue(100<1,"dd");

        System.out.println(Optional.ofNullable("demo").orElse("a")); //demo
        System.out.println(Optional.ofNullable(null).orElse("a")); //a
        //或者 使用supplier生产
        System.out.println(Optional.ofNullable(null).orElseGet(() -> "abc")); //abc
    }
}
