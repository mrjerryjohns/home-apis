// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object ExtendedTemperatureControlTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class TemperatureDisplayMode private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.ExtendedTemperatureControlTrait.TemperatureDisplayMode> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull Celsius,

        @androidx.annotation.NonNull Fahrenheit,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.ExtendedTemperatureControlTrait.TemperatureDisplayMode> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public interface TemperatureSetpointReached {
        public abstract val priority: kotlin.Int?

        public abstract val targetTemperatureReached: kotlin.Boolean?

        public abstract val temperatureSetpointCelsius: kotlin.Short?
    }

    public final class TemperatureSetpointReachedImpl public constructor(priority: kotlin.Int? = COMPILED_CODE, targetTemperatureReached: kotlin.Boolean? = COMPILED_CODE, temperatureSetpointCelsius: kotlin.Short? = COMPILED_CODE) : com.google.home.google.ExtendedTemperatureControlTrait.TemperatureSetpointReached {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedTemperatureControlTrait.TemperatureSetpointReached> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedTemperatureControlTrait.TemperatureSetpointReached): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedTemperatureControlTrait.TemperatureSetpointReached { /* compiled code */ }
        }

        public open val priority: kotlin.Int? /* compiled code */

        public open val targetTemperatureReached: kotlin.Boolean? /* compiled code */

        public open val temperatureSetpointCelsius: kotlin.Short? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface TemperatureControlError {
        public abstract val errorCode: kotlin.String?
    }

    public final class TemperatureControlErrorImpl public constructor(errorCode: kotlin.String? = COMPILED_CODE) : com.google.home.google.ExtendedTemperatureControlTrait.TemperatureControlError {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedTemperatureControlTrait.TemperatureControlError> {
            public final val Id: com.google.home.matter.serialization.ScopedEventId /* compiled code */

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedTemperatureControlTrait.TemperatureControlError): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedTemperatureControlTrait.TemperatureControlError { /* compiled code */ }
        }

        public open val errorCode: kotlin.String? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.ExtendedTemperatureControlTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.ExtendedTemperatureControlTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.ExtendedTemperatureControlTrait.Attributes { /* compiled code */ }
        }

        public abstract val temperatureDisplayMode: com.google.home.google.ExtendedTemperatureControlTrait.TemperatureDisplayMode?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(temperatureDisplayMode: com.google.home.google.ExtendedTemperatureControlTrait.TemperatureDisplayMode? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.ExtendedTemperatureControlTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.ExtendedTemperatureControlTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.ExtendedTemperatureControlTrait.Attributes) { /* compiled code */ }

        public open val temperatureDisplayMode: com.google.home.google.ExtendedTemperatureControlTrait.TemperatureDisplayMode? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(temperatureDisplayMode: com.google.home.google.ExtendedTemperatureControlTrait.TemperatureDisplayMode? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.ExtendedTemperatureControlTrait.AttributesImpl { /* compiled code */ }
    }
}

