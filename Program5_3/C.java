package cpack;

import apack.A;

public class C 
{
    public void display() 
    {
        A obj = new A(10, 20, 30);

        System.out.println("=== Class C (unrelated class, different package) ===");

        System.out.println("pubVar  (public)    : " + obj.pubVar);

        // System.out.println("protVar (protected) : " + obj.protVar);
        System.out.println("protVar (protected) : Not accessible in unrelated class");

        // System.out.println("privVar (private)   : " + obj.privVar);
        System.out.println("privVar (private)   : Not accessible in unrelated class");
    }
}