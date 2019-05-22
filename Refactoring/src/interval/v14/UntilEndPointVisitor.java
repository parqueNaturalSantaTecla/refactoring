package interval.v14;

public interface UntilEndPointVisitor {

	void visit(UntilEndPoint included);
	
	void visit(UntilIncludedEndPoint included);
}
