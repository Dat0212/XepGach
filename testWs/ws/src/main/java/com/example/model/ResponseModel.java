package com.example.model;

public class ResponseModel {
    private String responseCode;

    private String responseMessage;

    private Class responseObject;

    public String getResponseCode() {
        return this.responseCode;
    }

    public void setResponseCode(String _responseCode) {
        this.responseCode = _responseCode;
    }

    public String getResponseMessage() {
        return this.responseMessage;
    }

    public void setResponseMessage(String _responseMessage) {
        this.responseMessage = _responseMessage;
    }

    public Class getResponseObject() {
        return this.responseObject;
    }

    public void setResponseCode(Class _responseObject) {
        this.responseObject = _responseObject;
    }
}
