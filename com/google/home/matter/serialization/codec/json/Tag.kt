// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.serialization.codec.json

public final class Tag public constructor(tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */, type: com.google.home.matter.serialization.WireType<*>, isArray: kotlin.Boolean = COMPILED_CODE) {
    public companion object {
        public final fun parseTag(str: kotlin.String): com.google.home.matter.serialization.codec.json.Tag { /* compiled code */ }
    }

    public final val tag: kotlin.UInt /* from: com.google.home.matter.serialization.TagId */ /* compiled code */

    public final val type: com.google.home.matter.serialization.WireType<*> /* compiled code */

    public final val isArray: kotlin.Boolean /* compiled code */

    public open fun toString(): kotlin.String { /* compiled code */ }

    public final fun asNull(): com.google.home.matter.serialization.codec.json.Tag { /* compiled code */ }

    public final fun asElement(): com.google.home.matter.serialization.codec.json.Tag { /* compiled code */ }

    public final fun asArray(): com.google.home.matter.serialization.codec.json.Tag { /* compiled code */ }

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }
}
