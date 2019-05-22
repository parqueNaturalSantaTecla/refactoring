package interval.v15;

public interface ModeVisitor {

	boolean visit(Open open);
	
	boolean visit(Closed closed);
}
