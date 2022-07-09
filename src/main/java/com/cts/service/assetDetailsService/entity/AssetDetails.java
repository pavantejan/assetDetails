package com.cts.service.assetDetailsService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="asset_details")
public class AssetDetails {

    @Id
    private String name;


    private double current_value;

    private double initial_value;
}

