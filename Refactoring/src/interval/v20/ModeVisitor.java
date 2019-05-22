package interval.v20;

public interface ModeVisitor {

	boolean visit(Open open);
	
	boolean visit(Closed closed);
}
