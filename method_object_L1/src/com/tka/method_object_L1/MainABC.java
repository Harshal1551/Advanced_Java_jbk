package com.tka.method_object_L1;

public class MainABC {

	public static void main(String[] args) {
		
		A a1 = new A();
        B b1 = a1.m1();
        C c1 = b1.m2();
        int p = c1.m3();
        System.out.println(p);
        
        // one line (Method chaining)
        
        int q = new A().m1().m2().m3();

        System.out.println(q);

	}

}
