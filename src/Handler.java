
public abstract class Handler {

	public final static int FATHER_LEVEL_REQUEST = 1;
	public final static int HUSBAND_LEVEL_REQUEST = 2;
	public final static int SON_LEVEL_REQUEST = 3;
	//能处理的级别
	private int level = 0;
	//责任传递，下一个责任人的引用
	private Handler nextHandler;
	//每个对象都要说明自己能处理的级别
	public Handler(int level) {
		this.level = level;
	}
	
	public final void HandlerMessage(IWomen women) {
		if(women.getType() == this.level) {//自己处理
			response(women);
		} else {//交给下一级处理
			if(nextHandler != null) {
				nextHandler.HandlerMessage(women);
			} else {
				System.out.println("---没地方请示，按不同意处理");
			}
		}
	}
	
	/**
	 * 如果自己处理不了，要交给下一个对象处理
	 * @param handler
	 */
	public void setNext(Handler handler) {
		nextHandler = handler;
	}
	
	protected abstract void response(IWomen women);
}
