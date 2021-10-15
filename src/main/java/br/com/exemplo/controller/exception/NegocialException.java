package br.com.exemplo.controller.exception;

public class NegocialException extends Exception{
    private String msg;

    public NegocialException(String msg){
        super(msg);
        this.msg = msg;
    }
}
