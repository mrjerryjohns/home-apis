// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object DishwasherAlarmTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final data class AlarmBitmap public constructor(inflowError: kotlin.Boolean = COMPILED_CODE, drainError: kotlin.Boolean = COMPILED_CODE, doorError: kotlin.Boolean = COMPILED_CODE, tempTooLow: kotlin.Boolean = COMPILED_CODE, tempTooHigh: kotlin.Boolean = COMPILED_CODE, waterLevelError: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap> {
            private const final val INFLOW_ERROR_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val DRAIN_ERROR_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val DOOR_ERROR_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val TEMP_TOO_LOW_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val TEMP_TOO_HIGH_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val WATER_LEVEL_ERROR_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap { /* compiled code */ }
        }

        public final val inflowError: kotlin.Boolean /* compiled code */

        public final val drainError: kotlin.Boolean /* compiled code */

        public final val doorError: kotlin.Boolean /* compiled code */

        public final val tempTooLow: kotlin.Boolean /* compiled code */

        public final val tempTooHigh: kotlin.Boolean /* compiled code */

        public final val waterLevelError: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(inflowError: kotlin.Boolean = COMPILED_CODE, drainError: kotlin.Boolean = COMPILED_CODE, doorError: kotlin.Boolean = COMPILED_CODE, tempTooLow: kotlin.Boolean = COMPILED_CODE, tempTooHigh: kotlin.Boolean = COMPILED_CODE, waterLevelError: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class Feature public constructor(reset: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.DishwasherAlarmTrait.Feature> {
            private const final val RESET_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.DishwasherAlarmTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.DishwasherAlarmTrait.Feature { /* compiled code */ }
        }

        public final val reset: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(reset: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.DishwasherAlarmTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Notify {
        public abstract val active: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap?

        public abstract val inactive: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap?

        public abstract val state: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap?

        public abstract val mask: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap?
    }

    public final class NotifyImpl public constructor(active: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? = COMPILED_CODE, inactive: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? = COMPILED_CODE, state: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? = COMPILED_CODE, mask: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? = COMPILED_CODE) : com.google.home.matter.standard.DishwasherAlarmTrait.Notify {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DishwasherAlarmTrait.Notify> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DishwasherAlarmTrait.Notify): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DishwasherAlarmTrait.Notify { /* compiled code */ }
        }

        public open val active: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? /* compiled code */

        public open val inactive: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? /* compiled code */

        public open val state: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? /* compiled code */

        public open val mask: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DishwasherAlarmTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DishwasherAlarmTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DishwasherAlarmTrait.Attributes { /* compiled code */ }
        }

        public abstract val mask: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap?

        public abstract val latch: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap?

        public abstract val state: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap?

        public abstract val supported: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.DishwasherAlarmTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(mask: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? = COMPILED_CODE, latch: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? = COMPILED_CODE, state: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? = COMPILED_CODE, supported: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.DishwasherAlarmTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) :
        com.google.home.matter.standard.DishwasherAlarmTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.DishwasherAlarmTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.DishwasherAlarmTrait.Attributes) { /* compiled code */ }

        public open val mask: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? /* compiled code */

        public open val latch: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? /* compiled code */

        public open val state: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? /* compiled code */

        public open val supported: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.DishwasherAlarmTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(mask: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? = COMPILED_CODE, latch: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? = COMPILED_CODE, state: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? = COMPILED_CODE, supported: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.DishwasherAlarmTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE):
            com.google.home.matter.standard.DishwasherAlarmTrait.AttributesImpl { /* compiled code */ }
    }

    public object ResetCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(alarms: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DishwasherAlarmTrait.ResetCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DishwasherAlarmTrait.ResetCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DishwasherAlarmTrait.ResetCommand.Request { /* compiled code */ }
            }

            public final val alarms: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DishwasherAlarmTrait.ResetCommand.Request.CommandFields> {
                @androidx.annotation.NonNull alarms;

                public companion object {
                    public final val StructDescriptor: com.google.home.StructDescriptor /* compiled code */
                }

                public open val fieldName: kotlin.String /* compiled code */

                public open val tag: kotlin.UInt /* compiled code */

                public open val typeName: kotlin.String /* compiled code */

                public open val typeEnum: com.google.home.Type /* compiled code */

                public open val descriptor: com.google.home.Descriptor /* compiled code */

                public final val isNullable: kotlin.Boolean /* compiled code */
            }
        }
    }

    public object ModifyEnabledAlarmsCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(mask: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.DishwasherAlarmTrait.ModifyEnabledAlarmsCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.DishwasherAlarmTrait.ModifyEnabledAlarmsCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.DishwasherAlarmTrait.ModifyEnabledAlarmsCommand.Request { /* compiled code */ }
            }

            public final val mask: com.google.home.matter.standard.DishwasherAlarmTrait.AlarmBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.DishwasherAlarmTrait.ModifyEnabledAlarmsCommand.Request.CommandFields> {
                @androidx.annotation.NonNull mask;

                public companion object {
                    public final val StructDescriptor: com.google.home.StructDescriptor /* compiled code */
                }

                public open val fieldName: kotlin.String /* compiled code */

                public open val tag: kotlin.UInt /* compiled code */

                public open val typeName: kotlin.String /* compiled code */

                public open val typeEnum: com.google.home.Type /* compiled code */

                public open val descriptor: com.google.home.Descriptor /* compiled code */

                public final val isNullable: kotlin.Boolean /* compiled code */
            }
        }
    }
}
