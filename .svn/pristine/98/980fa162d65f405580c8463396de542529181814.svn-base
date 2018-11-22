package car;

public class Test {
	public static void printCars(Car[] cars) {
		for (Car car : cars) {
			System.out.println("品牌:" + car.getBrand());
			System.out.println("类型:" + car.getType() );
			System.out.println("车牌:" + car.getCarId());
			System.out.println("===================");
		}
	}
	public static void main(String[] args) {
		ICarDao icd = new CarDaoImpl(20);
		Car c1 = new Car("宝马","X1","辽B10000");
		Car c2 = new Car("宝马","X2","辽B20000");
		Car c3 = new Car("宝马","X1","辽B30000");
		Car c4 = new Car("玛莎拉蒂","X1","辽B40000");
		Car c5 = new Car("保时捷","X1","辽B50000");
		Car c6 = new Car("宾利","X3","辽B60000");
		Car c7 = new Car("玛莎拉蒂","X2","辽B70000");
		Car c8 = new Car("宾利","X3","辽B80000");
		icd.save(c1);
		icd.save(c2);
		icd.save(c3);
		icd.save(c4);
		icd.save(c5);
		icd.save(c6);
		icd.save(c7);
		icd.save(c8);
		printCars(icd.queryAll());
		
		icd.delete("辽B60000");
		System.out.println("=============delete=============");
		printCars(icd.queryAll());
		
		System.out.println("=============queryById=============");	
		Car car = icd.queryById("辽B80000");
		if(null != car) {
			System.out.println("品牌:" + car.getBrand());
			System.out.println("类型:" + car.getType() );
			System.out.println("车牌:" + car.getCarId());
			System.out.println("===================");
		}
		
		System.out.println("=============queryByBrand=============");	
		Car[] cars = icd.queryBybrand("保时捷");
		printCars(cars);
		
		System.out.println("=============queryByBrand=============");	
		Car[] cars2 = icd.queryByType("X3");
		printCars(cars2);
		
	}	
	
}
