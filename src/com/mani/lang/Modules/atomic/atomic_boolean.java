package com.mani.lang.Modules.atomic;

import com.mani.lang.Interpreter;
import com.mani.lang.ManiCallable;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class atomic_boolean implements ManiCallable {

    @Override
    public int arity() {
        return 0;
    }

    @Override
	public Object call(Interpreter interpreter, List<Object> arguments) {
		return new AtomicBoolean();
	}

}