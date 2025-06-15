// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home

public interface Event {
    public abstract val eventId: com.google.home.Id

    public abstract val eventName: kotlin.String

    public abstract val timestamp: java.time.Instant

    public abstract val eventImportance: com.google.home.EventImportance

    public abstract val eventNumber: kotlin.ULong
}

