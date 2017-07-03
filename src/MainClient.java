import java.util.ArrayList;
import java.util.Random;

public class MainClient {

	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<IWomen> arrayList = new ArrayList<IWomen>();
		for(int i = 0;i < 5;i++) {
			arrayList.add(new Women(rand.nextInt(4), "我要去逛街"));
		}
		Handler father = new Father();
		Handler husband = new Husband();
		Handler son = new Son();
		//设置责任链
		father.setNext(husband);
		husband.setNext(son);
		for(IWomen women : arrayList) {
			//先从责任链的第一个开始调用
			father.HandlerMessage(women);
		}
	}
	
}
