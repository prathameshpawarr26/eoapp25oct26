package com.Kamalsir.EvenOdd;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*")
public class EvenOddController
{
private EvenOddService service;

public EvenOddController(EvenOddService service)
{
this.service=service;
}

@GetMapping("/check/{num}")
public String check(@PathVariable int num)
{
return service.check(num);
}
}
