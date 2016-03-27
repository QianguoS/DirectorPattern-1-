package director;

public class SuperEncrypt extends ConcreteEncrypt {

	public SuperEncrypt(EncryptComponet encryptComponet) {
		super(encryptComponet);
		// TODO Auto-generated constructor stub
		
	}

	private void addSuperEncrypt() {
		// TODO Auto-generated method stub
		System.out.println("最高加密算法");
	}

	public void encrypt() {
		// TODO Auto-generated method stub
		super.encrypt();
		addSuperEncrypt();
	}

}
