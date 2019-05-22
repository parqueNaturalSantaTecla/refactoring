package interval.v22;

public interface ModeVisitor {

	boolean visit(Open open);
	
	boolean visit(Closed closed);
}
