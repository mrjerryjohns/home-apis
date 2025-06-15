// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object FanControlTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class AirflowDirectionEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.FanControlTrait.AirflowDirectionEnum> {
        @androidx.annotation.NonNull Forward,

        @androidx.annotation.NonNull Reverse,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.FanControlTrait.AirflowDirectionEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class FanModeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.FanControlTrait.FanModeEnum> {
        @androidx.annotation.NonNull Off,

        @androidx.annotation.NonNull Low,

        @androidx.annotation.NonNull Medium,

        @androidx.annotation.NonNull High,

        @androidx.annotation.NonNull On,

        @androidx.annotation.NonNull Auto,

        @androidx.annotation.NonNull Smart,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.FanControlTrait.FanModeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class FanModeSequenceEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.FanControlTrait.FanModeSequenceEnum> {
        @androidx.annotation.NonNull OffLowMedHigh,

        @androidx.annotation.NonNull OffLowHigh,

        @androidx.annotation.NonNull OffLowMedHighAuto,

        @androidx.annotation.NonNull OffLowHighAuto,

        @androidx.annotation.NonNull OffHighAuto,

        @androidx.annotation.NonNull OffHigh,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.FanControlTrait.FanModeSequenceEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class StepDirectionEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.FanControlTrait.StepDirectionEnum> {
        @androidx.annotation.NonNull Increase,

        @androidx.annotation.NonNull Decrease,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.FanControlTrait.StepDirectionEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(multiSpeed: kotlin.Boolean = COMPILED_CODE, auto: kotlin.Boolean = COMPILED_CODE, rocking: kotlin.Boolean = COMPILED_CODE, wind: kotlin.Boolean = COMPILED_CODE, step: kotlin.Boolean = COMPILED_CODE, airflowDirection: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.FanControlTrait.Feature> {
            private const final val MULTI_SPEED_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val AUTO_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ROCKING_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val WIND_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val STEP_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val AIRFLOW_DIRECTION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.FanControlTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.FanControlTrait.Feature { /* compiled code */ }
        }

        public final val multiSpeed: kotlin.Boolean /* compiled code */

        public final val auto: kotlin.Boolean /* compiled code */

        public final val rocking: kotlin.Boolean /* compiled code */

        public final val wind: kotlin.Boolean /* compiled code */

        public final val step: kotlin.Boolean /* compiled code */

        public final val airflowDirection: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component6(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(multiSpeed: kotlin.Boolean = COMPILED_CODE, auto: kotlin.Boolean = COMPILED_CODE, rocking: kotlin.Boolean = COMPILED_CODE, wind: kotlin.Boolean = COMPILED_CODE, step: kotlin.Boolean = COMPILED_CODE, airflowDirection: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.FanControlTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class RockBitmap public constructor(rockLeftRight: kotlin.Boolean = COMPILED_CODE, rockUpDown: kotlin.Boolean = COMPILED_CODE, rockRound: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.FanControlTrait.RockBitmap> {
            private const final val ROCK_LEFT_RIGHT_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ROCK_UP_DOWN_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ROCK_ROUND_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.FanControlTrait.RockBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.FanControlTrait.RockBitmap { /* compiled code */ }
        }

        public final val rockLeftRight: kotlin.Boolean /* compiled code */

        public final val rockUpDown: kotlin.Boolean /* compiled code */

        public final val rockRound: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(rockLeftRight: kotlin.Boolean = COMPILED_CODE, rockUpDown: kotlin.Boolean = COMPILED_CODE, rockRound: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.FanControlTrait.RockBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class WindBitmap public constructor(sleepWind: kotlin.Boolean = COMPILED_CODE, naturalWind: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.FanControlTrait.WindBitmap> {
            private const final val SLEEP_WIND_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val NATURAL_WIND_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.FanControlTrait.WindBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.FanControlTrait.WindBitmap { /* compiled code */ }
        }

        public final val sleepWind: kotlin.Boolean /* compiled code */

        public final val naturalWind: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(sleepWind: kotlin.Boolean = COMPILED_CODE, naturalWind: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.FanControlTrait.WindBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.FanControlTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.FanControlTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.FanControlTrait.Attributes { /* compiled code */ }
        }

        public abstract val fanMode: com.google.home.matter.standard.FanControlTrait.FanModeEnum?

        public abstract val fanModeSequence: com.google.home.matter.standard.FanControlTrait.FanModeSequenceEnum?

        public abstract val percentSetting: kotlin.UByte?

        public abstract val percentCurrent: kotlin.UByte?

        public abstract val speedMax: kotlin.UByte?

        public abstract val speedSetting: kotlin.UByte?

        public abstract val speedCurrent: kotlin.UByte?

        public abstract val rockSupport: com.google.home.matter.standard.FanControlTrait.RockBitmap?

        public abstract val rockSetting: com.google.home.matter.standard.FanControlTrait.RockBitmap?

        public abstract val windSupport: com.google.home.matter.standard.FanControlTrait.WindBitmap?

        public abstract val windSetting: com.google.home.matter.standard.FanControlTrait.WindBitmap?

        public abstract val airflowDirection: com.google.home.matter.standard.FanControlTrait.AirflowDirectionEnum?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.FanControlTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(fanMode: com.google.home.matter.standard.FanControlTrait.FanModeEnum? = COMPILED_CODE, fanModeSequence: com.google.home.matter.standard.FanControlTrait.FanModeSequenceEnum? = COMPILED_CODE, percentSetting: kotlin.UByte? = COMPILED_CODE, percentCurrent: kotlin.UByte? = COMPILED_CODE, speedMax: kotlin.UByte? = COMPILED_CODE, speedSetting: kotlin.UByte? = COMPILED_CODE, speedCurrent: kotlin.UByte? = COMPILED_CODE, rockSupport: com.google.home.matter.standard.FanControlTrait.RockBitmap? = COMPILED_CODE, rockSetting: com.google.home.matter.standard.FanControlTrait.RockBitmap? = COMPILED_CODE, windSupport: com.google.home.matter.standard.FanControlTrait.WindBitmap? = COMPILED_CODE, windSetting:
        com.google.home.matter.standard.FanControlTrait.WindBitmap? = COMPILED_CODE, airflowDirection: com.google.home.matter.standard.FanControlTrait.AirflowDirectionEnum? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.FanControlTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.FanControlTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.FanControlTrait.Attributes, com.google.home.matter.standard.FanControlTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.FanControlTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.FanControlTrait.Attributes) { /* compiled code */ }

        public open val fanMode: com.google.home.matter.standard.FanControlTrait.FanModeEnum? /* compiled code */

        public open val fanModeSequence: com.google.home.matter.standard.FanControlTrait.FanModeSequenceEnum? /* compiled code */

        public open val percentSetting: kotlin.UByte? /* compiled code */

        public open val percentCurrent: kotlin.UByte? /* compiled code */

        public open val speedMax: kotlin.UByte? /* compiled code */

        public open val speedSetting: kotlin.UByte? /* compiled code */

        public open val speedCurrent: kotlin.UByte? /* compiled code */

        public open val rockSupport: com.google.home.matter.standard.FanControlTrait.RockBitmap? /* compiled code */

        public open val rockSetting: com.google.home.matter.standard.FanControlTrait.RockBitmap? /* compiled code */

        public open val windSupport: com.google.home.matter.standard.FanControlTrait.WindBitmap? /* compiled code */

        public open val windSetting: com.google.home.matter.standard.FanControlTrait.WindBitmap? /* compiled code */

        public open val airflowDirection: com.google.home.matter.standard.FanControlTrait.AirflowDirectionEnum? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.FanControlTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.FanControlTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.FanControlTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(fanMode: com.google.home.matter.standard.FanControlTrait.FanModeEnum? = COMPILED_CODE, fanModeSequence: com.google.home.matter.standard.FanControlTrait.FanModeSequenceEnum? = COMPILED_CODE, percentSetting: kotlin.UByte? = COMPILED_CODE, percentCurrent: kotlin.UByte? = COMPILED_CODE, speedMax: kotlin.UByte? = COMPILED_CODE, speedSetting: kotlin.UByte? = COMPILED_CODE, speedCurrent: kotlin.UByte? = COMPILED_CODE, rockSupport: com.google.home.matter.standard.FanControlTrait.RockBitmap? = COMPILED_CODE, rockSetting: com.google.home.matter.standard.FanControlTrait.RockBitmap? = COMPILED_CODE, windSupport: com.google.home.matter.standard.FanControlTrait.WindBitmap? = COMPILED_CODE, windSetting: com.google.home.matter.standard.FanControlTrait.WindBitmap? =
            COMPILED_CODE, airflowDirection: com.google.home.matter.standard.FanControlTrait.AirflowDirectionEnum? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.FanControlTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.FanControlTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.FanControlTrait.Attributes) : com.google.home.matter.standard.FanControlTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.FanControlTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.FanControlTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.FanControlTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _fanMode: com.google.home.matter.standard.FanControlTrait.FanModeEnum? /* compiled code */

        public open val fanMode: com.google.home.matter.standard.FanControlTrait.FanModeEnum? /* compiled code */
            public open get

        internal final var _percentSetting: kotlin.UByte? /* compiled code */

        internal final var _isPercentSettingSet: kotlin.Boolean /* compiled code */

        public open val percentSetting: kotlin.UByte? /* compiled code */
            public open get

        internal final var _speedSetting: kotlin.UByte? /* compiled code */

        internal final var _isSpeedSettingSet: kotlin.Boolean /* compiled code */

        public open val speedSetting: kotlin.UByte? /* compiled code */
            public open get

        internal final var _rockSetting: com.google.home.matter.standard.FanControlTrait.RockBitmap? /* compiled code */

        public open val rockSetting: com.google.home.matter.standard.FanControlTrait.RockBitmap? /* compiled code */
            public open get

        internal final var _windSetting: com.google.home.matter.standard.FanControlTrait.WindBitmap? /* compiled code */

        public open val windSetting: com.google.home.matter.standard.FanControlTrait.WindBitmap? /* compiled code */
            public open get

        internal final var _airflowDirection: com.google.home.matter.standard.FanControlTrait.AirflowDirectionEnum? /* compiled code */

        public open val airflowDirection: com.google.home.matter.standard.FanControlTrait.AirflowDirectionEnum? /* compiled code */
            public open get

        public final fun setFanMode(value: com.google.home.matter.standard.FanControlTrait.FanModeEnum): kotlin.Unit { /* compiled code */ }

        public final fun setPercentSetting(value: kotlin.UByte?): kotlin.Unit { /* compiled code */ }

        public final fun setSpeedSetting(value: kotlin.UByte?): kotlin.Unit { /* compiled code */ }

        public final fun setRockSetting(value: com.google.home.matter.standard.FanControlTrait.RockBitmap): kotlin.Unit { /* compiled code */ }

        public final fun setWindSetting(value: com.google.home.matter.standard.FanControlTrait.WindBitmap): kotlin.Unit { /* compiled code */ }

        public final fun setAirflowDirection(value: com.google.home.matter.standard.FanControlTrait.AirflowDirectionEnum): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public object StepCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(direction: com.google.home.matter.standard.FanControlTrait.StepDirectionEnum = COMPILED_CODE, wrap: com.google.home.matter.serialization.OptionalValue<kotlin.Boolean> = COMPILED_CODE, lowestOff: com.google.home.matter.serialization.OptionalValue<kotlin.Boolean> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.FanControlTrait.StepCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.FanControlTrait.StepCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.FanControlTrait.StepCommand.Request { /* compiled code */ }
            }

            public final val direction: com.google.home.matter.standard.FanControlTrait.StepDirectionEnum /* compiled code */

            public final val wrap: com.google.home.matter.serialization.OptionalValue<kotlin.Boolean> /* compiled code */

            public final val lowestOff: com.google.home.matter.serialization.OptionalValue<kotlin.Boolean> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.FanControlTrait.StepCommand.Request.CommandFields> {
                @androidx.annotation.NonNull direction,

                @androidx.annotation.NonNull wrap,

                @androidx.annotation.NonNull lowestOff;

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
            public abstract var wrap: kotlin.Boolean

            public abstract var lowestOff: kotlin.Boolean
        }
    }
}
