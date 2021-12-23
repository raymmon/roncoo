package priv.roncoo.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 统一响应对象
 *
 * @author lei.xu
 * 2021/12/23 2:34 下午
 */
@Getter
@Setter
public class Result {

    private int status;

    private String message;

    @Getter
    @Setter
    static class ResultData<T> extends Result {

        /**
         * 响应数据
         */
        T data;

    }

    @Getter
    @AllArgsConstructor
    public enum Exceptions {

        /**
         * 异常信息枚举
         */
        OK(0, "OK."),
        SERVER_ERROR(1, "An error occurred on server.");

        private int status;

        private String message;

    }

    public static Result build(int status, String message) {
        Result result = new Result();
        result.status = status;
        result.message = message;
        return result;
    }

    public static <T> Result build(int status, String message, T data) {
        ResultData<T> result = new ResultData<T>();
        result.setStatus(status);
        result.setMessage(message);
        result.data = data;
        return result;
    }

    public static Result fail(int status, String message) {
        return build(status, message);
    }

    public static Result fail(Exceptions exceptions) {
        return fail(exceptions.status, exceptions.message);
    }

    public static Result fail(String message) {
        return fail(Exceptions.SERVER_ERROR.status, message);
    }

    public static Result fail() {
        return fail(Exceptions.SERVER_ERROR.message);
    }

    public static <T> Result ok(String message, T data) {
        return build(Exceptions.OK.status, message, data);
    }

    public static <T> Result ok(T data) {
        return ok(Exceptions.OK.message, data);
    }

    public static Result ok() {
        return fail(Exceptions.OK);
    }

}
