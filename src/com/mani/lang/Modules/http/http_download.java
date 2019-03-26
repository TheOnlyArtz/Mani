package com.mani.lang.modules.http;

import java.io.IOException;

import okhttp3.*;

import com.mani.lang.Interpreter;
import com.mani.lang.ManiCallable;

public final class http_download implements ManiCallable {

    @Override
    public int arity() {
        return 1;
    }

    @Override
    public Object call(Interpreter interpreter, List<Object> arguments) {
        try {
            final Response response = client.newCall(
                    new Request.Builder().url(arguments.get(0).toString()).build())
                    .execute()
            return response.body().bytes();
        } catch (IOException ex) {
            return ex;
        }
    }
}
