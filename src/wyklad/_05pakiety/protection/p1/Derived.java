package wyklad._05pakiety.protection.p1;

class Derived extends Protection {

	Derived() {
		//super();
		System.out.println("konstruktor klasy dziedziczącej");
//		System.out.println("nPrivate = " + nPrivate);
		System.out.println("nPackage = " + nPackage);
		System.out.println("nProtected = " + nProtected);
		System.out.println("nPublic = " + nPublic);
	}
}
