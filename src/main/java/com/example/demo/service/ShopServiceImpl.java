package com.example.demo.service;

import com.example.demo.dao.ShopDao;
import com.example.demo.entity.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Lucem on 28/05/2018.
 */
@Service
@Transactional
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopDao shopDao;

    @Override
    public List<Shop> getItems() {
        return shopDao.getItems();
    }
}
