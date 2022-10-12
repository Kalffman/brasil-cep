package com.kalffman.projects.brasilcep.domain.utils;

import static java.lang.String.format;

public abstract class DomainExceptions {
    public static UnsupportedOperationException notImplemented(String method) {
        return new UnsupportedOperationException(format("Método [%s] não implementado.", method));
    }
}
