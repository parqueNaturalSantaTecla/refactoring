package interval.v16;

public interface ModeVisitor {

	boolean visit(Open open);
	
	boolean visit(Closed closed);
}
