import java.util.ArrayList;
public class ShoppingCart {
	ArrayList<ProductShell> cart = new ArrayList<ProductShell>();
	private int count=0;
	
	public int getCount(){
		return count;
	}
	public void addToCart (ProductShell p){
		cart.add(p);
		count++;
	}
	public ProductShell removeFromCart(ProductShell p){
		cart.remove(p);
		count--;
		return p;
	}
	public ProductShell removeFromCart(int index){
		ProductShell temp = (ProductShell) cart.get(index);
		cart.remove(index);
		count--;
		return temp;
	}
	public ArrayList<ProductShell> getCart(){
		return cart;
	}
	public double getTotal(){
		double total=0;
		for (int i = 0; i < cart.size(); i++){
			total+=(cart.get(i)).getPrice()*cart.get(i).getQuan();
		}
		return total;
	}
	public ProductShell getCurrent(int i){
		return cart.get(i);
	}
}
