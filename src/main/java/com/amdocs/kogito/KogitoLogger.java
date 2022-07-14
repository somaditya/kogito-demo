package com.amdocs.kogito;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.logging.Log;

@ApplicationScoped
public class KogitoLogger {

    public void log(String logText) {
        Log.info(logText);
    }
}
