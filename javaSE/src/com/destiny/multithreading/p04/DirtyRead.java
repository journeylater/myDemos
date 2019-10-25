package com.destiny.multithreading.p04;
/**
 * 业务整体需要使用完整的synchronized，保持业务的原子性。
 * acid:
 * 	a原子性：保证逻辑的原子性
 * 	c一致性：事务前后数据完整
 * 	i隔离性：各个用户互不干扰
 * 	d持久性：事务执行成功后结果持续不变
 * @author alienware
 *
 */
public class DirtyRead {

	private String username = "bjsxt";
	private String password = "123";
	
	public synchronized void setValue(String username, String password){
		this.username = username;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		this.password = password;
		
		System.out.println("setValue最终结果：username = " + username + " , password = " + password);
	}
	
	public synchronized void getValue(){
		System.out.println("getValue方法得到：username = " + this.username + " , password = " + this.password);
	}
	
	
	public static void main(String[] args) throws Exception{
		
		final DirtyRead dr = new DirtyRead();
//		Thread t1 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				dr.setValue("z3", "456");
//			}
//		});
//		t1.start();
		new Thread(()->dr.setValue("z3", "456")).start();
		Thread.sleep(1000);
		
		dr.getValue();
	}

}
