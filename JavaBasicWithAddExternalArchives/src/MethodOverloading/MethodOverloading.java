package MethodOverloading;

public class MethodOverloading {
	
	int a, b, c;
	float d, e;
	String f,g;
	
	public void sum(int a, int b) {
		
		this.a = a;
		this.b = b;
		int c = a+b;
		System.out.println(c);
		
	}
	
	public void sum(int c, float d, float e) {
		this.c = c;
		this.d = d;
		this.e = e;
		float p = c+d+e;
		System.out.println(p);
		
	}
	
	public void sum(String f, String g ) {
		this.f = f;
		this.g = g;
		System.out.println(f.concat(" ".concat(g)));
	}
	
	public int mul(int a, int b) {
		this.a = a;
		this.b = b;
		int c= a*b;
		return c;
	}
	
}
