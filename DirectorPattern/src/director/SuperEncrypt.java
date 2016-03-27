package director;

public class SuperEncrypt extends ConcreteEncrypt {

	public SuperEncrypt(EncryptComponet encryptComponet) {
		super(encryptComponet);
		// TODO Auto-generated constructor stub
		addSuperEncrypt();
	}

	private void addSuperEncrypt() {
		// TODO Auto-generated method stub
		System.out.println("最高加密算法");
	}

}
