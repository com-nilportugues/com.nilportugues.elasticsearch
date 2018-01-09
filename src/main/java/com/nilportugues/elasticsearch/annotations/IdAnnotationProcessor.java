package com.nilportugues.elasticsearch.annotations;

import java.lang.reflect.Field;

public class IdAnnotationProcessor<T, ID_TYPE> {

    public ID_TYPE findIdValue(T object) throws Exception {

        final Class<T> clazz = (Class<T>) object.getClass();
        int total = 0;
        ID_TYPE value = null;

        for (Field field: clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Id.class)) {
                if (null == value) {
                    field.setAccessible(true);
                    value = (ID_TYPE) field.get(object);
                }
                total++;
            }
        }

        if (total == 0) {
            throw new RuntimeException("Missing @Id annotation on a property in "+clazz.getCanonicalName());
        }

        if (total > 1) {
            throw new RuntimeException("More than one @Id annotation was found in "+clazz.getCanonicalName());
        }

        return value;
    }
}
