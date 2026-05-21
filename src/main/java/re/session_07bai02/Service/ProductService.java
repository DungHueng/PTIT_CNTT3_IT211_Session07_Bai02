package re.session_07bai02.Service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public void addProduct(String name) {
        System.out.println("Sản phẩm " + name + " đã được thêm vào hệ thống!");
    }
}
