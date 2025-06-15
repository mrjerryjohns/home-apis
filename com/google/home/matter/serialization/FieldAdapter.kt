// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.serialization

public interface FieldAdapter<RAW : kotlin.Any, RUNTIME : kotlin.Any> {
    public companion object {
        public final val ULONG_UBYTE: com.google.home.matter.serialization.FunctionAdapter<kotlin.ULong, kotlin.UByte> /* compiled code */

        public final val ULONG_UINT: com.google.home.matter.serialization.FunctionAdapter<kotlin.ULong, kotlin.UInt> /* compiled code */

        public final val ULONG_USHORT: com.google.home.matter.serialization.FunctionAdapter<kotlin.ULong, kotlin.UShort> /* compiled code */

        public final val LONG_BYTE: com.google.home.matter.serialization.FunctionAdapter<kotlin.Long, kotlin.Byte> /* compiled code */

        public final val LONG_INT: com.google.home.matter.serialization.FunctionAdapter<kotlin.Long, kotlin.Int> /* compiled code */

        public final val LONG_SHORT: com.google.home.matter.serialization.FunctionAdapter<kotlin.Long, kotlin.Short> /* compiled code */
    }

    public open val defaultValue: RUNTIME? /* compiled code */
        public open get

    public abstract fun toRaw(value: RUNTIME): RAW

    public abstract fun toRuntime(value: RAW): RUNTIME
}
