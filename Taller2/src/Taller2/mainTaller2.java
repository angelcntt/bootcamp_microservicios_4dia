package Taller2;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class mainTaller2 {

	public static void main(String[] args) {
		List<Product> shopping = List.of( new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL), new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED), new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED), new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED), new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED), new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));
	
		BigDecimal totalprice=shopping.stream().map(n-> n.price.add(n.price.multiply(BigDecimal.valueOf(( Double.valueOf(n.tax.getPercent())/100))))).reduce(BigDecimal.ZERO, BigDecimal::add);
		System.out.println(totalprice + " is the total price");
		
		
		
		String productswithc= shopping.stream().filter(n-> n.name.startsWith("C")).sorted((x,y)->x.name.compareTo(y.name)).map(x-> x.name).collect(Collectors.joining(", ","Products start with C are ", ","));
		
		System.out.println(productswithc);
	}

}
