package apack;

public class A 
{
    public int pubVar;
    protected int protVar;
    private int privVar;

    public A(int pub, int prot, int priv) 
    {
        this.pubVar   = pub;
        this.protVar  = prot;
        this.privVar  = priv;
    }
}