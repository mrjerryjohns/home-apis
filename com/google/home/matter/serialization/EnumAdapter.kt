// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.serialization

public final class EnumAdapter<RUNTIME : com.google.home.matter.serialization.ClusterEnum> public constructor(values: kotlin.Array<RUNTIME>) : com.google.home.matter.serialization.FieldAdapter<kotlin.ULong, RUNTIME> {
    private final val values: kotlin.Array<RUNTIME> /* compiled code */

    public open val defaultValue: RUNTIME /* compiled code */
        public open get

    private final val unknownValue: RUNTIME /* compiled code */

    public open fun toRuntime(value: kotlin.ULong): RUNTIME { /* compiled code */ }

    public open fun toRaw(value: RUNTIME): kotlin.ULong { /* compiled code */ }
}
