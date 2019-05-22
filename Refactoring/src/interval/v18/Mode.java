package interval.v18;

public abstract class Mode {

	public abstract boolean includes(Mode mode);
	
	public abstract boolean accept(ModeVisitor modeVisitor);
}
