package com.cts.service.assetDetailsService.controller;


import com.cts.service.assetDetailsService.entity.AssetDetails;
import com.cts.service.assetDetailsService.entity.Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {

    @Autowired
    private Details assetDetail;

    @GetMapping(value="/")
    public List<AssetDetails> getAssetDetails(){
        return assetDetail.findAll();
    }
}
