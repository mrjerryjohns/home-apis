// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object BooleanStateConfigurationTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final data class AlarmModeBitmap public constructor(visual: kotlin.Boolean = COMPILED_CODE, audible: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap> {
            private const final val VISUAL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val AUDIBLE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap { /* compiled code */ }
        }

        public final val visual: kotlin.Boolean /* compiled code */

        public final val audible: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(visual: kotlin.Boolean = COMPILED_CODE, audible: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class Feature public constructor(visual: kotlin.Boolean = COMPILED_CODE, audible: kotlin.Boolean = COMPILED_CODE, alarmSuppress: kotlin.Boolean = COMPILED_CODE, sensitivityLevel: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.BooleanStateConfigurationTrait.Feature> {
            private const final val VISUAL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val AUDIBLE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ALARM_SUPPRESS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val SENSITIVITY_LEVEL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.BooleanStateConfigurationTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.BooleanStateConfigurationTrait.Feature { /* compiled code */ }
        }

        public final val visual: kotlin.Boolean /* compiled code */

        public final val audible: kotlin.Boolean /* compiled code */

        public final val alarmSuppress: kotlin.Boolean /* compiled code */

        public final val sensitivityLevel: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(visual: kotlin.Boolean = COMPILED_CODE, audible: kotlin.Boolean = COMPILED_CODE, alarmSuppress: kotlin.Boolean = COMPILED_CODE, sensitivityLevel: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.BooleanStateConfigurationTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class SensorFaultBitmap public constructor(generalFault: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.BooleanStateConfigurationTrait.SensorFaultBitmap> {
            private const final val GENERAL_FAULT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.BooleanStateConfigurationTrait.SensorFaultBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.BooleanStateConfigurationTrait.SensorFaultBitmap { /* compiled code */ }
        }

        public final val generalFault: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(generalFault: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.BooleanStateConfigurationTrait.SensorFaultBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface AlarmsStateChanged {
        public abstract val alarmsActive: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap?

        public abstract val alarmsSuppressed: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap?
    }

    public final class AlarmsStateChangedImpl public constructor(alarmsActive: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap? = COMPILED_CODE, alarmsSuppressed: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap? = COMPILED_CODE) : com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmsStateChanged {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmsStateChanged> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmsStateChanged): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmsStateChanged { /* compiled code */ }
        }

        public open val alarmsActive: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap? /* compiled code */

        public open val alarmsSuppressed: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface SensorFault {
        public abstract val sensorFault: com.google.home.matter.standard.BooleanStateConfigurationTrait.SensorFaultBitmap?
    }

    public final class SensorFaultImpl public constructor(sensorFault: com.google.home.matter.standard.BooleanStateConfigurationTrait.SensorFaultBitmap? = COMPILED_CODE) : com.google.home.matter.standard.BooleanStateConfigurationTrait.SensorFault {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.BooleanStateConfigurationTrait.SensorFault> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.BooleanStateConfigurationTrait.SensorFault): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.BooleanStateConfigurationTrait.SensorFault { /* compiled code */ }
        }

        public open val sensorFault: com.google.home.matter.standard.BooleanStateConfigurationTrait.SensorFaultBitmap? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.BooleanStateConfigurationTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.BooleanStateConfigurationTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.BooleanStateConfigurationTrait.Attributes { /* compiled code */ }
        }

        public abstract val currentSensitivityLevel: kotlin.UByte?

        public abstract val supportedSensitivityLevels: kotlin.UByte?

        public abstract val defaultSensitivityLevel: kotlin.UByte?

        public abstract val alarmsActive: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap?

        public abstract val alarmsSuppressed: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap?

        public abstract val alarmsEnabled: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap?

        public abstract val alarmsSupported: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap?

        public abstract val sensorFault: com.google.home.matter.standard.BooleanStateConfigurationTrait.SensorFaultBitmap?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.BooleanStateConfigurationTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(currentSensitivityLevel: kotlin.UByte? = COMPILED_CODE, supportedSensitivityLevels: kotlin.UByte? = COMPILED_CODE, defaultSensitivityLevel: kotlin.UByte? = COMPILED_CODE, alarmsActive: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap? = COMPILED_CODE, alarmsSuppressed: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap? = COMPILED_CODE, alarmsEnabled: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap? = COMPILED_CODE, alarmsSupported: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap? = COMPILED_CODE, sensorFault: com.google.home.matter.standard.BooleanStateConfigurationTrait.SensorFaultBitmap? = COMPILED_CODE,
        generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.BooleanStateConfigurationTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.BooleanStateConfigurationTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.BooleanStateConfigurationTrait.Attributes, com.google.home.matter.standard.BooleanStateConfigurationTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.BooleanStateConfigurationTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.BooleanStateConfigurationTrait.Attributes) { /* compiled code */ }

        public open val currentSensitivityLevel: kotlin.UByte? /* compiled code */

        public open val supportedSensitivityLevels: kotlin.UByte? /* compiled code */

        public open val defaultSensitivityLevel: kotlin.UByte? /* compiled code */

        public open val alarmsActive: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap? /* compiled code */

        public open val alarmsSuppressed: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap? /* compiled code */

        public open val alarmsEnabled: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap? /* compiled code */

        public open val alarmsSupported: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap? /* compiled code */

        public open val sensorFault: com.google.home.matter.standard.BooleanStateConfigurationTrait.SensorFaultBitmap? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.BooleanStateConfigurationTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.BooleanStateConfigurationTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.BooleanStateConfigurationTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(currentSensitivityLevel: kotlin.UByte? = COMPILED_CODE, supportedSensitivityLevels: kotlin.UByte? = COMPILED_CODE, defaultSensitivityLevel: kotlin.UByte? = COMPILED_CODE, alarmsActive: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap? = COMPILED_CODE, alarmsSuppressed: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap? = COMPILED_CODE, alarmsEnabled: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap? = COMPILED_CODE, alarmsSupported: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap? = COMPILED_CODE, sensorFault: com.google.home.matter.standard.BooleanStateConfigurationTrait.SensorFaultBitmap? = COMPILED_CODE, generatedCommandList:
            kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.BooleanStateConfigurationTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.BooleanStateConfigurationTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.BooleanStateConfigurationTrait.Attributes) : com.google.home.matter.standard.BooleanStateConfigurationTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.BooleanStateConfigurationTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.BooleanStateConfigurationTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.BooleanStateConfigurationTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _currentSensitivityLevel: kotlin.UByte? /* compiled code */

        public open val currentSensitivityLevel: kotlin.UByte? /* compiled code */
            public open get

        public final fun setCurrentSensitivityLevel(value: kotlin.UByte): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public object SuppressAlarmCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(alarmsToSuppress: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.BooleanStateConfigurationTrait.SuppressAlarmCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.BooleanStateConfigurationTrait.SuppressAlarmCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.BooleanStateConfigurationTrait.SuppressAlarmCommand.Request { /* compiled code */ }
            }

            public final val alarmsToSuppress: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.BooleanStateConfigurationTrait.SuppressAlarmCommand.Request.CommandFields> {
                @androidx.annotation.NonNull alarmsToSuppress;

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

    public object EnableDisableAlarmCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(alarmsToEnableDisable: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.BooleanStateConfigurationTrait.EnableDisableAlarmCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.BooleanStateConfigurationTrait.EnableDisableAlarmCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.BooleanStateConfigurationTrait.EnableDisableAlarmCommand.Request { /* compiled code */ }
            }

            public final val alarmsToEnableDisable: com.google.home.matter.standard.BooleanStateConfigurationTrait.AlarmModeBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.BooleanStateConfigurationTrait.EnableDisableAlarmCommand.Request.CommandFields> {
                @androidx.annotation.NonNull alarmsToEnableDisable;

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
