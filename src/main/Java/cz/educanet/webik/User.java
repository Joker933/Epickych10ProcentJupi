package cz.educanet.webik;

public class User {
    public String jmeno, heslo;
    public int id, code;

    public String dostanJmeno() { return jmeno; }
    public String dostanHeslo() { return heslo; }
    public int dostanID() { return id; }
    public int dostanCode() { return code; }

    public String nastavUser(String jmeno) { return this.jmeno = jmeno; }
    public String nastavHeslo(String heslo){ return this.heslo = heslo;}
    public int nastavId(int id) { return this.id = id; }
    public int nastavCode(int code) { return this.code = code; }

}

