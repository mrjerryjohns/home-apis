// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object RefrigeratorAlarmTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final data class AlarmBitmap public constructor(doorOpen: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap> {
            private const final val DOOR_OPEN_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap { /* compiled code */ }
        }

        public final val doorOpen: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(doorOpen: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Notify {
        public abstract val active: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap?

        public abstract val inactive: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap?

        public abstract val state: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap?

        public abstract val mask: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap?
    }

    public final class NotifyImpl public constructor(active: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? = COMPILED_CODE, inactive: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? = COMPILED_CODE, state: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? = COMPILED_CODE, mask: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? = COMPILED_CODE) : com.google.home.matter.standard.RefrigeratorAlarmTrait.Notify {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.RefrigeratorAlarmTrait.Notify> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.RefrigeratorAlarmTrait.Notify): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.RefrigeratorAlarmTrait.Notify { /* compiled code */ }
        }

        public open val active: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? /* compiled code */

        public open val inactive: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? /* compiled code */

        public open val state: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? /* compiled code */

        public open val mask: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.RefrigeratorAlarmTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.RefrigeratorAlarmTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.RefrigeratorAlarmTrait.Attributes { /* compiled code */ }
        }

        public abstract val mask: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap?

        public abstract val state: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap?

        public abstract val supported: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(mask: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? = COMPILED_CODE, state: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? = COMPILED_CODE, supported: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.RefrigeratorAlarmTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.RefrigeratorAlarmTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.RefrigeratorAlarmTrait.Attributes) { /* compiled code */ }

        public open val mask: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? /* compiled code */

        public open val state: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? /* compiled code */

        public open val supported: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(mask: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? = COMPILED_CODE, state: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? = COMPILED_CODE, supported: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.RefrigeratorAlarmTrait.AttributesImpl { /* compiled code */ }
    }
}

