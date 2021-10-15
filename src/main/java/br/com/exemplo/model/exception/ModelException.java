package br.com.exemplo.model.exception;

public class ModelException extends Exception{
    private String msg;

    public ModelException(String msg){
        super(msg);
        this.msg = msg;
    }
}
