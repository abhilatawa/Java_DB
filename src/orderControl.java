import java.util.Map;
import java.util.List;

public interface orderControl {
        public boolean applyCredit( String customerName, int orderId, double credit );
        public boolean payOrder( String customerName, double payment, List<Integer> orderId, String receivingStaff );
        public boolean returnItem( int orderId, String reason, String receivingStaff, List<String> productName, List<Integer> quantityReturned );
        public Map<String, Double> outstandingPayments();
        public Map<String, Double> storeCredit();
        public Map<String, Double> returnWindow();
}
