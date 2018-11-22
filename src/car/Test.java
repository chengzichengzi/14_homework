package car;

public class Test {
	public static void printCars(Car[] cars) {
		for (Car car : cars) {
			System.out.println("Ʒ��:" + car.getBrand());
			System.out.println("����:" + car.getType() );
			System.out.println("����:" + car.getCarId());
			System.out.println("===================");
		}
	}
	public static void main(String[] args) {
		ICarDao icd = new CarDaoImpl(20);
		Car c1 = new Car("����","X1","��B10000");
		Car c2 = new Car("����","X2","��B20000");
		Car c3 = new Car("����","X1","��B30000");
		Car c4 = new Car("��ɯ����","X1","��B40000");
		Car c5 = new Car("��ʱ��","X1","��B50000");
		Car c6 = new Car("����","X3","��B60000");
		Car c7 = new Car("��ɯ����","X2","��B70000");
		Car c8 = new Car("����","X3","��B80000");
		icd.save(c1);
		icd.save(c2);
		icd.save(c3);
		icd.save(c4);
		icd.save(c5);
		icd.save(c6);
		icd.save(c7);
		icd.save(c8);
		printCars(icd.queryAll());
		
		icd.delete("��B60000");
		System.out.println("=============delete=============");
		printCars(icd.queryAll());
		
		System.out.println("=============queryById=============");	
		Car car = icd.queryById("��B80000");
		if(null != car) {
			System.out.println("Ʒ��:" + car.getBrand());
			System.out.println("����:" + car.getType() );
			System.out.println("����:" + car.getCarId());
			System.out.println("===================");
		}
		
		System.out.println("=============queryByBrand=============");	
		Car[] cars = icd.queryBybrand("��ʱ��");
		printCars(cars);
		
		System.out.println("=============queryByBrand=============");	
		Car[] cars2 = icd.queryByType("X3");
		printCars(cars2);
		
	}	
	
}
