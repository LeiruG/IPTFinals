package com.example.demo.response;

import com.example.demo.entity.Shop;

import java.util.List;

/**
 * Created by Lucem on 28/05/2018.
 */
public class ShopListResponse {
    private SystemResponse systemResponse;
    private List<Shop> items;

    public ShopListResponse() {
    }

    public ShopListResponse(SystemResponse systemResponse, List<Shop> items) {
        this.systemResponse = systemResponse;
        this.items = items;
    }

    public SystemResponse getSystemResponse() {
        return systemResponse;
    }

    public void setSystemResponse(SystemResponse systemResponse) {
        this.systemResponse = systemResponse;
    }

    public List<Shop> getItems() {
        return items;
    }

    public void setItems(List<Shop> items) {
        this.items = items;
    }
}