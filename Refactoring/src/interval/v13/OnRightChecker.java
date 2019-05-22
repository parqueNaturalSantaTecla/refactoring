package interval.v13;

public class OnRightChecker {

	private UntilEndPoint included;
	
	public OnRightChecker(UntilEndPoint included) {
		super();
		this.included = included;
	}
	
	public boolean onRight() {
		return !(included instanceof UntilIncludedEndPoint);
	}
	
}
