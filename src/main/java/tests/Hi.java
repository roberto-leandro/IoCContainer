package tests;

import Annotations.Autowired;
import Annotations.Component;

@Component
public class Hi {

    byte by;
    short sh;
    int in;
    long lo;
    float fl;
    double dou;
    boolean tru;

    boolean fal;
    char ch;
    String str;

    public Hi() {

    }


    public Hi(byte b, short s, int i, long l, float f, double d, boolean t, boolean fa, char c, String st){
        by = b;
        sh = s;
        in = i;
        lo = l;
        fl = f;
        dou = d;
        tru = t;
        fal = fa;
        ch = c;
        str = st;
    }

    @Autowired
    public void setBy(byte by) {
        this.by = by;
    }

    public void setSh(short sh) {
        this.sh = sh;
    }

    public void setIn(int in) {
        this.in = in;
    }

    public void setLo(long lo) {
        this.lo = lo;
    }

    public void setFl(float fl) {
        this.fl = fl;
    }

    public void setDou(double dou) {
        this.dou = dou;
    }

    public void setTru(boolean tru) {
        this.tru = tru;
    }

    public void setFal(boolean fal) {
        this.fal = fal;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void funciono() {
        System.out.println("by: "+by+"\n"+"sh: "+sh+"\n"+"in: "+in+"\n"+"lo: "+lo+"\n"+"fl: "+fl+"\n"+"dou: "+dou+"\n"+"tru: "+tru+"\n"+"fal: "+fal+"\n"+"ch: "+ch+"\n"+"st: "+str+"\nHI SIRVIÓ");
    }
}
