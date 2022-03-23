package com.itheima.homework;

/*定义项目经理类Manager 【属性：姓名 工号 工资 奖金】【行为：工作work】
定义程序员类Coder【属性：姓名 工号 工资】【行为：工作work】
要求：通过有参构造创建两个类的对象，并调用各自的work方法*/
public class Test7 {
    public static void main(String[] args) {
        Coder coder = new Coder("张三","9527",10000);
        coder.work();

        Manager manager = new Manager("李四","9528",15000,2000);
        manager.work();
    }

}

class Manager extends Worker{
    private double bonus;

    public Manager() {
    }

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("姓名为:"+ getName() +",工号为:"+ getId()
                + ",工资为:"+ getSalary() +",奖金为:"+ getBonus()
                + ",的项目经理正在管理程序员写代码");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

class Coder extends Worker {
    public Coder() {
    }

    public Coder(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("姓名为:"+ getName() +",工号为:"+ getId()
                + ",工资为:"+ getSalary() +",的程序员正在编写代码");
    }
}


abstract class Worker{
    private String name;
    private String id;
    private double salary;

    public Worker() {
    }

    public Worker(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}