/**
 * 妇女类
 * @author qiaojy
 *
 */
public class Women implements IWomen{

	/**
	 * 1 未出嫁
	 * 2 出嫁
	 * 3 夫死
	 */
	private int type = 0;
	//妇女请示
	private String request = "";
	
	public Women(int type,String request) {
		this.type = type;
		switch (type) {
		case 1:
			this.request = "女儿的请求是"+request;
			break;

		case 2:
			this.request = "妻子的请求是"+request;
			break;
		case 3:
			this.request = "母亲的请求是"+request;
			break;
		}
	}
	
	@Override
	public int getType() {
		return type;
	}

	@Override
	public String getRequest() {
		return request;
	}

}
