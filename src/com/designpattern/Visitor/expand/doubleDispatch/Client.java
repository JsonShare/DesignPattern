package com.designpattern.Visitor.expand.doubleDispatch;

/**
 * 双重分派
 * @author Json<<json1990@foxmail.com>>
 */
class Dog {  
    public void accept(Execute exe){  
        exe.excute(this);  
    }  
}  

class DogBaby1 extends Dog{  
    public void accept(Execute exe){  
        exe.excute(this);  
    }  
}  

class DogBaby2 extends Dog{  
    public void accept(Execute exe){  
        exe.excute(this);  
    }  
}  
  
class Execute {  
    public void excute(Dog dog){  
        System.out.println("我是dog妈妈");  
    }  
      
    public void excute(DogBaby1 baby1){  
        System.out.println("我是dogbaby1");  
    }  
      
    public void excute(DogBaby2 baby2){  
        System.out.println("我是dogbaby2");  
    }  
}  
public class Client {
	public static void main(String[] args) {
		Dog dog = new Dog();  
        Dog baby1 = new DogBaby1();  
        Dog baby2 = new DogBaby2();  
  
        Execute exe = new Execute();  
        dog.accept(exe);  
        baby1.accept(exe);  
        baby2.accept(exe);  
	}
}
