package homeWorkEx3;

public class SurfaceBundlesCharacteristics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SurfaceBundles SurfaceGo2 = new SurfaceBundles();
		SurfaceBundles SurfacePro7Plus = new SurfaceBundles();
		SurfaceBundles SurfaceBook = new SurfaceBundles();
		
		SurfaceGo2.display = 12.4;
		SurfaceGo2.ram = 6;
		SurfaceGo2.DiscSpace = 16;
		SurfaceGo2.price = 543.26f;
		
		SurfacePro7Plus.display = 14.2;
		SurfacePro7Plus.ram = 8;
		SurfacePro7Plus.DiscSpace = 32;
		SurfacePro7Plus.price = 776.76f;
		
		SurfaceBook.display = 8;
		SurfaceBook.ram = 2;
		SurfaceBook.DiscSpace = 8;
		SurfaceBook.price = 222.88f;
		
		System.out.println("SurfaceGo2 characteristics:");
		SurfaceGo2.DisplaySurfaceBundlesCharacteristics();
		System.out.println("====================");
		
		System.out.println("SurfacePro7Plus characteristics:");
		SurfacePro7Plus.DisplaySurfaceBundlesCharacteristics();
		System.out.println("====================");
		
		System.out.println("SurfaceBook characteristics:");
		SurfaceBook.DisplaySurfaceBundlesCharacteristics();
		System.out.println("====================");
	}

}
