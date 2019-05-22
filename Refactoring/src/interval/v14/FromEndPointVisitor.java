package interval.v14;

public interface FromEndPointVisitor {

	void visit(FromEndPoint fromEndPoint);
	
	void visit(FromIncludedEndPoint fromIncludedEndPoint);
}
