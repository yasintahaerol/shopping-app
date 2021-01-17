package com.yasin.shoppingapp.product.service;

import com.yasin.shoppingapp.product.model.ProductResponse;
import com.yasin.shoppingapp.product.model.ProductSaveRequest;
import com.yasin.shoppingapp.product.repository.mongo.ProductRepository;
import com.yasin.shoppingapp.repository.es.ProductEsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductEsRepository productEsRepository;
    private final ProductRepository productRepository;

    public ProductService(ProductEsRepository productEsRepository, ProductRepository productRepository) {
        this.productEsRepository = productEsRepository;
        this.productRepository = productRepository;
    }

    List<ProductResponse> getByPaging(Pageable pageable) {
        // 1 - es den sorgula
        // 2 - Calc fieldları isle
        // 3 - redisten ihtiyac alanlar,n, getir
        // 4 - response nesnesine donusur
        return null;
    }
    List<ProductResponse> save(ProductSaveRequest producSaveRequest) {
        // 1 - mongoya yaz
        // 2 - elasticten guncelle
        // 3 - redisten guncelle
        // 4 - Es den cevap don
        // 5 - response nesnesine dondur
        return null;
    }


    /*
    Burada şu tarz işlemler olacak:
    repository ler bizim veritabanı problemlerimizi cozecek. Mesela mongo da bir update olduğunda
    git onu redise de update et işleminni,
    ismi yoksa kaydetme vs gibi business işlerimizi burada yapıcaz.
    Buradan yöneticez.
     */

}
