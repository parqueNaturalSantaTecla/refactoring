package interval.v18;

public interface ModeVisitor {

	boolean visit(Open open);
	
	boolean visit(Closed closed);
}
