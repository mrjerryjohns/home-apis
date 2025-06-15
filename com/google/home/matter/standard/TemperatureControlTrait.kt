// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object TemperatureControlTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final data class Feature public constructor(temperatureNumber: kotlin.Boolean = COMPILED_CODE, temperatureLevel: kotlin.Boolean = COMPILED_CODE, temperatureStep: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.TemperatureControlTrait.Feature> {
            private const final val TEMPERATURE_NUMBER_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val TEMPERATURE_LEVEL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val TEMPERATURE_STEP_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.TemperatureControlTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.TemperatureControlTrait.Feature { /* compiled code */ }
        }

        public final val temperatureNumber: kotlin.Boolean /* compiled code */

        public final val temperatureLevel: kotlin.Boolean /* compiled code */

        public final val temperatureStep: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(temperatureNumber: kotlin.Boolean = COMPILED_CODE, temperatureLevel: kotlin.Boolean = COMPILED_CODE, temperatureStep: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.TemperatureControlTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.TemperatureControlTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.TemperatureControlTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.TemperatureControlTrait.Attributes { /* compiled code */ }
        }

        public abstract val temperatureSetpoint: kotlin.Short?

        public abstract val minTemperature: kotlin.Short?

        public abstract val maxTemperature: kotlin.Short?

        public abstract val step: kotlin.Short?

        public abstract val selectedTemperatureLevel: kotlin.UByte?

        public abstract val supportedTemperatureLevels: kotlin.collections.List<kotlin.String>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.TemperatureControlTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(temperatureSetpoint: kotlin.Short? = COMPILED_CODE, minTemperature: kotlin.Short? = COMPILED_CODE, maxTemperature: kotlin.Short? = COMPILED_CODE, step: kotlin.Short? = COMPILED_CODE, selectedTemperatureLevel: kotlin.UByte? = COMPILED_CODE, supportedTemperatureLevels: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.TemperatureControlTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) :
        com.google.home.matter.standard.TemperatureControlTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.TemperatureControlTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.TemperatureControlTrait.Attributes) { /* compiled code */ }

        public open val temperatureSetpoint: kotlin.Short? /* compiled code */

        public open val minTemperature: kotlin.Short? /* compiled code */

        public open val maxTemperature: kotlin.Short? /* compiled code */

        public open val step: kotlin.Short? /* compiled code */

        public open val selectedTemperatureLevel: kotlin.UByte? /* compiled code */

        public open val supportedTemperatureLevels: kotlin.collections.List<kotlin.String>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.TemperatureControlTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(temperatureSetpoint: kotlin.Short? = COMPILED_CODE, minTemperature: kotlin.Short? = COMPILED_CODE, maxTemperature: kotlin.Short? = COMPILED_CODE, step: kotlin.Short? = COMPILED_CODE, selectedTemperatureLevel: kotlin.UByte? = COMPILED_CODE, supportedTemperatureLevels: kotlin.collections.List<kotlin.String>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.TemperatureControlTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.TemperatureControlTrait.AttributesImpl { /*
            compiled code */ }
    }

    public object SetTemperatureCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(targetTemperature: com.google.home.matter.serialization.OptionalValue<kotlin.Short> = COMPILED_CODE, targetTemperatureLevel: com.google.home.matter.serialization.OptionalValue<kotlin.UByte> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.TemperatureControlTrait.SetTemperatureCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.TemperatureControlTrait.SetTemperatureCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.TemperatureControlTrait.SetTemperatureCommand.Request { /* compiled code */ }
            }

            public final val targetTemperature: com.google.home.matter.serialization.OptionalValue<kotlin.Short> /* compiled code */

            public final val targetTemperatureLevel: com.google.home.matter.serialization.OptionalValue<kotlin.UByte> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.TemperatureControlTrait.SetTemperatureCommand.Request.CommandFields> {
                @androidx.annotation.NonNull targetTemperature,

                @androidx.annotation.NonNull targetTemperatureLevel;

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

        public interface OptionalArgs {
            public abstract var targetTemperature: kotlin.Short

            public abstract var targetTemperatureLevel: kotlin.UByte
        }
    }
}
