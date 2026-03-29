package bpack;

import apack.A;

public class B extends A 
{
    public B(int pub, int prot, int priv) 
    {
        super(pub, prot, priv);
    }

    public void display() 
    {
        System.out.println("=== Class B (extends A) via Inheritance ===");

        System.out.println("pubVar  (public)    : " + pubVar);

        System.out.println("protVar (protected) : " + protVar);

        // System.out.println("privVar (private)   : " + privVar);
        System.out.println("privVar (private)   : Not accessible in subclass");
    }
}