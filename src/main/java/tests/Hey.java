package tests;

import Annotations.*;


@Component
@Scope("Prototype")
//@Resource
public class Hey {
    Hi injectThisPls;

    String testSingleton = "at first it says this";

    public Hey(){}

    public Hey(Hi plsInject) {
        injectThisPls = plsInject;
    }

    @PostInicialization
    public void start() {
        System.out.println("SIRVE POST CONSTRUCTION");
    }

    @PreDestruction
    public void end(){
        System.out.println("SIRVE PRE DESCTRUCT");
    }

    public void setHiBean(Hi hi) {
        this.injectThisPls = hi;
    }

    public void funciono() {
        injectThisPls.funciono();
        System.out.println("HEY SIRVIÓ");
    }

    public String getTestSingleton() {
        return testSingleton;
    }

    public void changeTestSingleton() {
        testSingleton = "but now it says this instead";
    }
}
