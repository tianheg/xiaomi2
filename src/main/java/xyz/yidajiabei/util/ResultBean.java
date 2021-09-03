package xyz.yidajiabei.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// { sign: boolean, msg: "", data: null }
public class ResultBean<T> {
    private boolean sign; // result
    private String msg;   // message
    private T data;       // return json data
}