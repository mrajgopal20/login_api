package com.javatpoint;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProductController 
{
@GetMapping(value = "/product")
public String getProduct() 
{

return "New in the market.!!!!!";
}
}
