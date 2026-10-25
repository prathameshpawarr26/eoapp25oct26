package com.Kamalsir.EvenOdd;

import org.springframework.stereotype.*;

@Service
public class EvenOddService{
public String check(int num)
{
String msg="";
if(num%2==0)
msg=num+"is even";
else
msg=num+"is odd";
return msg;
}
}
