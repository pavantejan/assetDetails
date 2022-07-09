package com.cts.service.assetDetailsService.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Details extends JpaRepository<AssetDetails,String> {

}
