package re.session_07bai02.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectSecurity {

    private String currentUserRole = "VIP"; // giả lập user hiện tại

    @Before("execution(* re.session_07bai02.Service.ProductService.add*(..))")
    public void verifyUser(JoinPoint joinPoint) {
        if (!"ADMIN".equals(currentUserRole)) {
            throw new RuntimeException("!! TRUY CẬP BỊ TỪ CHỐI !! User không có quyền gọi "
                    + joinPoint.getSignature().getName());
        }
    }
}
