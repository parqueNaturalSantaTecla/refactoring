package interval.v24;

public interface ModeVisitor {

	boolean visit(Open open);
	
	boolean visit(Closed closed);
}
