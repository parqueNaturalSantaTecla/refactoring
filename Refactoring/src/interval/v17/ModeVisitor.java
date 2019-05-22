package interval.v17;

public interface ModeVisitor {

	boolean visit(Open open);
	
	boolean visit(Closed closed);
}
