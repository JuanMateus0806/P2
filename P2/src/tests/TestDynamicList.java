package tests;

import co.edu.uptc.model.ListUptc;

import java.util.*;

public class TestDynamicList {

    List list;
    public TestDynamicList(){
        list = new ListUptc();
    }
    public static void main (String[]arg){
        TestDynamicList test = new TestDynamicList();
        test.TestAdd();
        test.view();
        test.remove();
        test.indexOf();
        test.view();
    }
    public void TestAdd(){
        for (int i = 0; i < 10; i++)
            list.add("Value "+i);
    }

    public void remove(){
        list.remove("Value 2");
    }

    public int size(){
        return list.size();
    }
    public void view(){
        for (int i = 0; i < size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("size "+ size());
    }

    public void set(){
        list.set(9,"a");
    }

    public void clear(){
        list.clear();
    }

    public void contains(){
        System.out.println(list.contains("Value 1"));
    }

    public void indexOf(){
        System.out.println("X:"+list.indexOf("Value 3"));

    }
}
