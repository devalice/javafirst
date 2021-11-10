package singleton;

public class BusinessLogic {
	private static BusinessLogic obj;

	private BusinessLogic() {

	}

	public static BusinessLogic getInstance() {
		if(obj == null) {
			obj = new BusinessLogic();
		}
		return obj;
	}
	
}
