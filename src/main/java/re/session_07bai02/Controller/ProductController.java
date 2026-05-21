package re.session_07bai02.Controller;

import re.session_07bai02.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public String addProduct(@RequestParam String name) {
        productService.addProduct(name);
        return "Sản phẩm " + name + " đã được thêm thành công!";
    }
}

