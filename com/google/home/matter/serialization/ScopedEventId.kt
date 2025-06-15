// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.serialization

public final data class ScopedEventId public constructor(cluster: com.google.home.matter.serialization.ClusterId, event: kotlin.UInt) {
    public final val cluster: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final val event: kotlin.UInt /* compiled code */

    public final val vendor: kotlin.UInt /* compiled code */

    public final val id: kotlin.UInt /* compiled code */

    public final val uddmId: kotlin.UInt /* compiled code */

    public final val traitId: kotlin.String /* compiled code */

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final operator fun component1(): com.google.home.matter.serialization.ClusterId { /* compiled code */ }

    public final operator fun component2(): kotlin.UInt { /* compiled code */ }

    public final fun copy(cluster: com.google.home.matter.serialization.ClusterId = COMPILED_CODE, event: kotlin.UInt = COMPILED_CODE): com.google.home.matter.serialization.ScopedEventId { /* compiled code */ }

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }
}

