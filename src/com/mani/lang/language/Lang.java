package com.mani.lang.language;

import java.util.Map;

public interface Lang {
    // We are giving them a blank hashmap, to add the keys too.
    Object init(Map<String, String> keywords);
}
