package com.example.calculator.SVC;

import com.example.calculator.Exc.DivisionByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalcSvcImpl implements CalcSVC{

    @Override
    public Integer plus(int n1, int n2) {
        return   (n1+n2);
    }

    @Override
    public Integer minus(int n1, int n2) {
        return (n1-n2);
    }

    @Override
    public Integer multiply(int n1, int n2)  {
        return   (n1*n2);
    }

    @Override
    public Number divide(int n1, int n2) throws DivisionByZeroException {
        if(n2==0) throw new DivisionByZeroException("деление на ноль. Охуел?");
        return (double) n1 /n2;

    }

    @Override
    public String checkParams(Integer n1, Integer n2) {
        if (n1==null || n2==null) return "Где все параметры, сцуко?";
        else return null;
    }
}
