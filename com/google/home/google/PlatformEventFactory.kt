// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class PlatformEventFactory<T : com.google.home.Event, A : kotlin.Any> public constructor(eventId: kotlin.String, eventName: kotlin.String, parser: com.google.home.google.Parser<A>, creator: (kotlin.String, kotlin.Long, com.google.home.EventImportance, kotlin.ULong, A) -> T) : com.google.home.InternalEventFactory<T> {
    public open val eventId: kotlin.String /* compiled code */

    public final val eventName: kotlin.String /* compiled code */

    public final val parser: com.google.home.google.Parser<A> /* compiled code */

    public final val creator: (kotlin.String, kotlin.Long, com.google.home.EventImportance, kotlin.ULong, A) -> T /* compiled code */

    public final fun createEvent(eventTimestamp: kotlin.Long, eventImportance: com.google.home.EventImportance, eventNumber: kotlin.ULong, payload: com.google.nest.platform.mesh.serialization.TraitElementPayload): T { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }
}
