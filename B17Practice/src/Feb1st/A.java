package Feb1st;

class A {
	A get(){
		return this;
	}
}

class B1 extends A {
	B1 get() {
		return this;
	}
	
	void message() {
		System.out.println("Welcome to covariant return type");
	}
}
