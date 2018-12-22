package ClassthreePackage;

public class TestDriveWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		keywords hisWay = new keywords();
		hisWay.setDriveWaySize(6);
		System.out.println("His driveway size  "+ hisWay.getDriveWaySize());
		keywords herWay = new keywords();
		herWay.setDriveWaySize(7);
		System.out.println(herWay.getDriveWaySize());
		keywords.buildDriveWay();
	}

}
