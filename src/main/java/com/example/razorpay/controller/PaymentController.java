
package com.example.razorpay.controller;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
@CrossOrigin(origins = "*")
public class PaymentController {

	@PostMapping("/createOrder/{amount}")
	@ResponseBody
	public String createOrder(@PathVariable double amount) {
	    try {
	        RazorpayClient razorpay = new RazorpayClient("YourRazorpay.key_id", "YourRazorpay.key_secret");

	        JSONObject orderRequest = new JSONObject();
	        orderRequest.put("amount", amount); // paise
	        orderRequest.put("currency", "INR");
	        orderRequest.put("receipt", "order_rcptid_11");

	        Order order = razorpay.orders.create(orderRequest);
	        return order.toString(); // returns JSON to frontend
	    } catch (Exception e) {
	        e.printStackTrace();
	        return "{\"error\":\"" + e.getMessage() + "\"}";
	    }
	}

}
