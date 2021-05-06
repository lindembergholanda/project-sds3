package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entity.Seller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class SaleSuccessDTO implements Serializable {
	
	private static final long serialVersionUID = -55766961580646440L;
	
	private String sellerName;
	private Long visited;
	private Long deals;
	
	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		this.sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}
}
