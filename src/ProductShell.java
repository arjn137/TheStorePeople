import javax.swing.ImageIcon;

public class ProductShell {
	private String name;
	private String desc;
	private int quan;
	private double price;
	private ImageIcon img;
	
	public ProductShell(String name, String desc, double price, ImageIcon img){
		this.name=name;
		this.desc=desc;
		quan=0;
		this.price=price;
		this.img=img;
	}
	public String getName(){
		return name;
	}
	public String getDesc(){
		return desc;
	}
	public int getQuan(){
		return quan;
	}
	public void setQuan(int x){
		quan=x;
	}
	public double getPrice(){
		return price;
	}
	public ImageIcon getImg(){
		return img;
	}
}
