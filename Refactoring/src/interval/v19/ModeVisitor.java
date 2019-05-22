package interval.v19;

public interface ModeVisitor {

	boolean visit(Open open);
	
	boolean visit(Closed closed);
}
