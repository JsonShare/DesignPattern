package com.designpattern.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 结构对象角色类 -- 主人家
 * @author Json<<json1990@foxmail.com>>
 */
public class Home {
	private List<Animal> nodeList = new ArrayList<>();

    public void action(Person person) {
        for (Animal node : nodeList) {
            node.accept(person);
        }
    }

    /**
     * 添加操作
     * @param animal
     */
    public void add(Animal animal) {
        nodeList.add(animal);
    }
}
