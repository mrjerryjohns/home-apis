// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.serialization

public sealed class WireType<T : kotlin.Any> protected constructor(name: kotlin.String) {
    public companion object {
        public final fun valueOf(name: kotlin.String): com.google.home.matter.serialization.WireType<out kotlin.Any> { /* compiled code */ }
    }

    public final val name: kotlin.String /* compiled code */

    public object WireTypeUInt : com.google.home.matter.serialization.WireType<kotlin.ULong> {
    }

    public object WireTypeInt : com.google.home.matter.serialization.WireType<kotlin.Long> {
    }

    public object WireTypeBool : com.google.home.matter.serialization.WireType<kotlin.Boolean> {
    }

    public object WireTypeFloat : com.google.home.matter.serialization.WireType<kotlin.Float> {
    }

    public object WireTypeDouble : com.google.home.matter.serialization.WireType<kotlin.Double> {
    }

    public object WireTypeBytes : com.google.home.matter.serialization.WireType<kotlin.ByteArray> {
    }

    public object WireTypeString : com.google.home.matter.serialization.WireType<kotlin.String> {
    }

    public object WireTypeNull : com.google.home.matter.serialization.WireType<kotlin.Any> {
    }

    public object WireTypeStruct : com.google.home.matter.serialization.WireType<kotlin.Any> {
    }

    public object WireTypeUnknown : com.google.home.matter.serialization.WireType<kotlin.Any> {
    }
}

