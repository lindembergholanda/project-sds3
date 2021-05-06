package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entity.Seller;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class SellerDTO implements Serializable {
	
	private static final long serialVersionUID = -3349201538097320683L;
	
	private Long id;
	
	private String name;

	public SellerDTO(Seller entity) {
		id = entity.getId();
		name = entity.getName();
	}
	
	

}
