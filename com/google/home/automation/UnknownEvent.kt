// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

public final class UnknownEvent public constructor(eventId: com.google.home.Id = COMPILED_CODE, eventName: kotlin.String = COMPILED_CODE, timestamp: java.time.Instant = COMPILED_CODE, eventImportance: com.google.home.EventImportance = COMPILED_CODE, eventNumber: kotlin.ULong = COMPILED_CODE) : com.google.home.Event {
    public open val eventId: com.google.home.Id /* compiled code */

    public open val eventName: kotlin.String /* compiled code */

    public open val timestamp: java.time.Instant /* compiled code */

    public open val eventImportance: com.google.home.EventImportance /* compiled code */

    public open val eventNumber: kotlin.ULong /* compiled code */

    public final class UnknownEventFactory public constructor(id: kotlin.String) : com.google.home.EventFactory<com.google.home.automation.UnknownEvent> {
        public final val id: kotlin.String /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }
    }

    private final class Factory public constructor(eventId: kotlin.String) : com.google.home.InternalEventFactory<com.google.home.automation.UnknownEvent> {
        public open val eventId: kotlin.String /* compiled code */
    }
}

