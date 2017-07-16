package com.my.shop.seller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SellerController {
	
	
	@RequestMapping(value = "/seller/productAddPage.do")
	public String productaddpage(){
		return "seller/productAdd";
	}
}
