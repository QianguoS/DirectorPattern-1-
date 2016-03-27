package director;

public class ConcreteEncrypt extends EncryptComponet {

	private EncryptComponet encryptComponet;
	public ConcreteEncrypt(EncryptComponet encryptComponet) {
		super();
		this.encryptComponet = encryptComponet;
	}
	public void encrypt() {
		// TODO Auto-generated method stub
		encryptComponet.encrypt();
	}

}
