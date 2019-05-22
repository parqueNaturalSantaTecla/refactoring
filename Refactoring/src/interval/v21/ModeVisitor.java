package interval.v21;

public interface ModeVisitor {

	boolean visit(Open open);
	
	boolean visit(Closed closed);
}
