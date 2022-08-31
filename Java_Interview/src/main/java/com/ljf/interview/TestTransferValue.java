package com.ljf.interview;

/**
 * @author ljf
 * @date 2022/8/31 21:40
 * @Description
 */
public class TestTransferValue {

    public void changeAge(int age){
        age = 60;
    }

    public void changePerson(Person person){
        person.setName("xxxxxxx");
    }

    public void changeString(String str){
        str = "哈哈哈哈";
    }

    public static void main(String[] args) {
        TestTransferValue testTransferValue = new TestTransferValue();
        int age = 20;
        testTransferValue.changeAge(age);
        // 1.结果值应该是:
        System.out.println(age);

        Person person = new Person();
        person.setName("李四");
        testTransferValue.changePerson(person);
        // 2.结果值应该是:
        System.out.println(person.getName());

        String str = "发哈阿萨德金凤凰";
        testTransferValue.changeString(str);
        // 3.结果值应该是:
        System.out.println(str);

    }
}
