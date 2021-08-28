package yidajiabei.xyz.util;


// { sign: boolean, msg: "", data: null }
public class ResultBean<T> {
    private boolean sign; // result
    private String msg;   // message
    private T data;       // return json data

    public boolean isSign() {
        return sign;
    }

    public void setSign(boolean sign) {
        this.sign = sign;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}