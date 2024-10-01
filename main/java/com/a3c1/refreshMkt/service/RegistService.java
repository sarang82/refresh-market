
package com.a3c1.refreshMkt.service;

        import com.a3c1.refreshMkt.entity.Product;
        import com.a3c1.refreshMkt.repository.RegistRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.data.domain.Page;
        import org.springframework.data.domain.Pageable;
        import org.springframework.stereotype.Service;

@Service
public class BoardService {
    @Autowired
    private RegistRepository registRepository;

    //글 작성 처리
    public Product write(Product product) {
        return RegistRepository.save(product);
    }
}