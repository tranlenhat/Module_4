package com.example.quan_ly_san_pham.repository;

import com.example.quan_ly_san_pham.entity.Product;
import com.example.quan_ly_san_pham.util.ConnectionUtil;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {

    @Override
    public List<Product> findAll() {
        Session session = ConnectionUtil.sessionFactory.openSession();
        TypedQuery<Product> query = session.createQuery("from Product", Product.class);
        List<Product> productList = query.getResultList();
        session.close();
        return productList;
    }

    @Override
    public void save(Product product) {
        Session session = ConnectionUtil.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(product);

        transaction.commit();
        session.close();
    }

    @Override
    public Product findById(int id) {
        Session session = ConnectionUtil.sessionFactory.openSession();
        Product product = session.get(Product.class, id);
        session.close();
        return product;
    }

    @Override
    public void update(Product product) {
        Session session = ConnectionUtil.sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(product);

        transaction.commit();
        session.close();
    }
}