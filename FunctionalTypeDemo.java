package FunctionalInterfaceTypes;
import java.util.function.*;
import java.util.*;
public class FunctionalTypeDemo {
	
	 public static void main(String[] args) {

	        // Predicate - Check if order amount is high
	        Predicate<Double> isHighValue = amount -> amount > 10000;
	        System.out.println(isHighValue.test(15000.0)); // true

	        // Function - Convert order amount to discounted amount
	        Function<Double, Double> applyDiscount = amount -> amount * 0.9;
	        System.out.println(applyDiscount.apply(20000.0)); // 18000.0

	        // Supplier - Generate random order ID
	        Supplier<Integer> orderIdGenerator = () -> new Random().nextInt(1000);
	        System.out.println(orderIdGenerator.get());

	        // Consumer - Print order details
	        Consumer<String> printOrder = order -> System.out.println("Processing order: " + order);
	        printOrder.accept("Order#101");
	        /*
	         * Predicate → used in filtering collections
Function → used in mapping data (converting one type to another)
Supplier → used in lazy loading or generating IDs
Consumer → used in logging, printing, sending notifications

	         */
	    }
}
