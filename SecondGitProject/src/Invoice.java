
public class Invoice {
	private int id;
	private String producto;
	public Invoice(int id, String producto) {
		super();
		this.id = id;
		this.producto = producto;
	}
	private void modify() {
		System.out.println("Modify invoice");
	}
	
}
