// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object ColorControlTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class ColorLoopActionEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.ColorLoopActionEnum> {
        @androidx.annotation.NonNull Deactivate,

        @androidx.annotation.NonNull ActivateFromColorLoopStartEnhancedHue,

        @androidx.annotation.NonNull ActivateFromEnhancedCurrentHue,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ColorControlTrait.ColorLoopActionEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ColorLoopDirectionEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.ColorLoopDirectionEnum> {
        @androidx.annotation.NonNull Decrement,

        @androidx.annotation.NonNull Increment,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ColorControlTrait.ColorLoopDirectionEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ColorModeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.ColorModeEnum> {
        @androidx.annotation.NonNull CurrentHueAndCurrentSaturation,

        @androidx.annotation.NonNull CurrentXAndCurrentY,

        @androidx.annotation.NonNull ColorTemperatureMireds,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ColorControlTrait.ColorModeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class DirectionEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.DirectionEnum> {
        @androidx.annotation.NonNull Shortest,

        @androidx.annotation.NonNull Longest,

        @androidx.annotation.NonNull Up,

        @androidx.annotation.NonNull Down,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ColorControlTrait.DirectionEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class DriftCompensationEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.DriftCompensationEnum> {
        @androidx.annotation.NonNull None,

        @androidx.annotation.NonNull OtherOrUnknown,

        @androidx.annotation.NonNull TemperatureMonitoring,

        @androidx.annotation.NonNull OpticalLuminanceMonitoringAndFeedback,

        @androidx.annotation.NonNull OpticalColorMonitoringAndFeedback,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ColorControlTrait.DriftCompensationEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class EnhancedColorModeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.EnhancedColorModeEnum> {
        @androidx.annotation.NonNull CurrentHueAndCurrentSaturation,

        @androidx.annotation.NonNull CurrentXAndCurrentY,

        @androidx.annotation.NonNull ColorTemperatureMireds,

        @androidx.annotation.NonNull EnhancedCurrentHueAndCurrentSaturation,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ColorControlTrait.EnhancedColorModeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class MoveModeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.MoveModeEnum> {
        @androidx.annotation.NonNull Stop,

        @androidx.annotation.NonNull Up,

        @androidx.annotation.NonNull Down,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ColorControlTrait.MoveModeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class StepModeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.StepModeEnum> {
        @androidx.annotation.NonNull Up,

        @androidx.annotation.NonNull Down,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ColorControlTrait.StepModeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class ColorCapabilitiesBitmap public constructor(hueSaturation: kotlin.Boolean = COMPILED_CODE, enhancedHue: kotlin.Boolean = COMPILED_CODE, colorLoop: kotlin.Boolean = COMPILED_CODE, xy: kotlin.Boolean = COMPILED_CODE, colorTemperature: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ColorControlTrait.ColorCapabilitiesBitmap> {
            private const final val HUE_SATURATION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ENHANCED_HUE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val COLOR_LOOP_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val XY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val COLOR_TEMPERATURE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ColorControlTrait.ColorCapabilitiesBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ColorControlTrait.ColorCapabilitiesBitmap { /* compiled code */ }
        }

        public final val hueSaturation: kotlin.Boolean /* compiled code */

        public final val enhancedHue: kotlin.Boolean /* compiled code */

        public final val colorLoop: kotlin.Boolean /* compiled code */

        public final val xy: kotlin.Boolean /* compiled code */

        public final val colorTemperature: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(hueSaturation: kotlin.Boolean = COMPILED_CODE, enhancedHue: kotlin.Boolean = COMPILED_CODE, colorLoop: kotlin.Boolean = COMPILED_CODE, xy: kotlin.Boolean = COMPILED_CODE, colorTemperature: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ColorControlTrait.ColorCapabilitiesBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class Feature public constructor(hueAndSaturation: kotlin.Boolean = COMPILED_CODE, enhancedHue: kotlin.Boolean = COMPILED_CODE, colorLoop: kotlin.Boolean = COMPILED_CODE, xy: kotlin.Boolean = COMPILED_CODE, colorTemperature: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ColorControlTrait.Feature> {
            private const final val HUE_AND_SATURATION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val ENHANCED_HUE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val COLOR_LOOP_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val XY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val COLOR_TEMPERATURE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ColorControlTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ColorControlTrait.Feature { /* compiled code */ }
        }

        public final val hueAndSaturation: kotlin.Boolean /* compiled code */

        public final val enhancedHue: kotlin.Boolean /* compiled code */

        public final val colorLoop: kotlin.Boolean /* compiled code */

        public final val xy: kotlin.Boolean /* compiled code */

        public final val colorTemperature: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component5(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(hueAndSaturation: kotlin.Boolean = COMPILED_CODE, enhancedHue: kotlin.Boolean = COMPILED_CODE, colorLoop: kotlin.Boolean = COMPILED_CODE, xy: kotlin.Boolean = COMPILED_CODE, colorTemperature: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ColorControlTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class OptionsBitmap public constructor(executeIfOff: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ColorControlTrait.OptionsBitmap> {
            private const final val EXECUTE_IF_OFF_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ColorControlTrait.OptionsBitmap { /* compiled code */ }
        }

        public final val executeIfOff: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(executeIfOff: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ColorControlTrait.OptionsBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class UpdateFlagsBitmap public constructor(updateAction: kotlin.Boolean = COMPILED_CODE, updateDirection: kotlin.Boolean = COMPILED_CODE, updateTime: kotlin.Boolean = COMPILED_CODE, updateStartHue: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.ColorControlTrait.UpdateFlagsBitmap> {
            private const final val UPDATE_ACTION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val UPDATE_DIRECTION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val UPDATE_TIME_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val UPDATE_START_HUE_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.ColorControlTrait.UpdateFlagsBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.ColorControlTrait.UpdateFlagsBitmap { /* compiled code */ }
        }

        public final val updateAction: kotlin.Boolean /* compiled code */

        public final val updateDirection: kotlin.Boolean /* compiled code */

        public final val updateTime: kotlin.Boolean /* compiled code */

        public final val updateStartHue: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component4(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(updateAction: kotlin.Boolean = COMPILED_CODE, updateDirection: kotlin.Boolean = COMPILED_CODE, updateTime: kotlin.Boolean = COMPILED_CODE, updateStartHue: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.ColorControlTrait.UpdateFlagsBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ColorControlTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ColorControlTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ColorControlTrait.Attributes { /* compiled code */ }
        }

        public abstract val currentHue: kotlin.UByte?

        public abstract val currentSaturation: kotlin.UByte?

        public abstract val remainingTime: kotlin.UShort?

        public abstract val currentX: kotlin.UShort?

        public abstract val currentY: kotlin.UShort?

        public abstract val driftCompensation: com.google.home.matter.standard.ColorControlTrait.DriftCompensationEnum?

        public abstract val compensationText: kotlin.String?

        public abstract val colorTemperatureMireds: kotlin.UShort?

        public abstract val colorMode: com.google.home.matter.standard.ColorControlTrait.ColorModeEnum?

        public abstract val options: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap?

        public abstract val numberOfPrimaries: kotlin.UByte?

        public abstract val primary1X: kotlin.UShort?

        public abstract val primary1Y: kotlin.UShort?

        public abstract val primary1Intensity: kotlin.UByte?

        public abstract val primary2X: kotlin.UShort?

        public abstract val primary2Y: kotlin.UShort?

        public abstract val primary2Intensity: kotlin.UByte?

        public abstract val primary3X: kotlin.UShort?

        public abstract val primary3Y: kotlin.UShort?

        public abstract val primary3Intensity: kotlin.UByte?

        public abstract val primary4X: kotlin.UShort?

        public abstract val primary4Y: kotlin.UShort?

        public abstract val primary4Intensity: kotlin.UByte?

        public abstract val primary5X: kotlin.UShort?

        public abstract val primary5Y: kotlin.UShort?

        public abstract val primary5Intensity: kotlin.UByte?

        public abstract val primary6X: kotlin.UShort?

        public abstract val primary6Y: kotlin.UShort?

        public abstract val primary6Intensity: kotlin.UByte?

        public abstract val whitePointX: kotlin.UShort?

        public abstract val whitePointY: kotlin.UShort?

        public abstract val colorPointRx: kotlin.UShort?

        public abstract val colorPointRy: kotlin.UShort?

        public abstract val colorPointRIntensity: kotlin.UByte?

        public abstract val colorPointGx: kotlin.UShort?

        public abstract val colorPointGy: kotlin.UShort?

        public abstract val colorPointGIntensity: kotlin.UByte?

        public abstract val colorPointBx: kotlin.UShort?

        public abstract val colorPointBy: kotlin.UShort?

        public abstract val colorPointBIntensity: kotlin.UByte?

        public abstract val enhancedCurrentHue: kotlin.UShort?

        public abstract val enhancedColorMode: com.google.home.matter.standard.ColorControlTrait.EnhancedColorModeEnum?

        public abstract val colorLoopActive: kotlin.UByte?

        public abstract val colorLoopDirection: kotlin.UByte?

        public abstract val colorLoopTime: kotlin.UShort?

        public abstract val colorLoopStartEnhancedHue: kotlin.UShort?

        public abstract val colorLoopStoredEnhancedHue: kotlin.UShort?

        public abstract val colorCapabilities: com.google.home.matter.standard.ColorControlTrait.ColorCapabilitiesBitmap?

        public abstract val colorTempPhysicalMinMireds: kotlin.UShort?

        public abstract val colorTempPhysicalMaxMireds: kotlin.UShort?

        public abstract val coupleColorTempToLevelMinMireds: kotlin.UShort?

        public abstract val startUpColorTemperatureMireds: kotlin.UShort?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.ColorControlTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(currentHue: kotlin.UByte? = COMPILED_CODE, currentSaturation: kotlin.UByte? = COMPILED_CODE, remainingTime: kotlin.UShort? = COMPILED_CODE, currentX: kotlin.UShort? = COMPILED_CODE, currentY: kotlin.UShort? = COMPILED_CODE, driftCompensation: com.google.home.matter.standard.ColorControlTrait.DriftCompensationEnum? = COMPILED_CODE, compensationText: kotlin.String? = COMPILED_CODE, colorTemperatureMireds: kotlin.UShort? = COMPILED_CODE, colorMode: com.google.home.matter.standard.ColorControlTrait.ColorModeEnum? = COMPILED_CODE, options: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap? = COMPILED_CODE, numberOfPrimaries: kotlin.UByte? = COMPILED_CODE, primary1X: kotlin.UShort? = COMPILED_CODE, primary1Y:
        kotlin.UShort? = COMPILED_CODE, primary1Intensity: kotlin.UByte? = COMPILED_CODE, primary2X: kotlin.UShort? = COMPILED_CODE, primary2Y: kotlin.UShort? = COMPILED_CODE, primary2Intensity: kotlin.UByte? = COMPILED_CODE, primary3X: kotlin.UShort? = COMPILED_CODE, primary3Y: kotlin.UShort? = COMPILED_CODE, primary3Intensity: kotlin.UByte? = COMPILED_CODE, primary4X: kotlin.UShort? = COMPILED_CODE, primary4Y: kotlin.UShort? = COMPILED_CODE, primary4Intensity: kotlin.UByte? = COMPILED_CODE, primary5X: kotlin.UShort? = COMPILED_CODE, primary5Y: kotlin.UShort? = COMPILED_CODE, primary5Intensity: kotlin.UByte? = COMPILED_CODE, primary6X: kotlin.UShort? = COMPILED_CODE, primary6Y: kotlin.UShort? = COMPILED_CODE, primary6Intensity: kotlin.UByte? = COMPILED_CODE, whitePointX: kotlin.UShort? =
        COMPILED_CODE, whitePointY: kotlin.UShort? = COMPILED_CODE, colorPointRx: kotlin.UShort? = COMPILED_CODE, colorPointRy: kotlin.UShort? = COMPILED_CODE, colorPointRIntensity: kotlin.UByte? = COMPILED_CODE, colorPointGx: kotlin.UShort? = COMPILED_CODE, colorPointGy: kotlin.UShort? = COMPILED_CODE, colorPointGIntensity: kotlin.UByte? = COMPILED_CODE, colorPointBx: kotlin.UShort? = COMPILED_CODE, colorPointBy: kotlin.UShort? = COMPILED_CODE, colorPointBIntensity: kotlin.UByte? = COMPILED_CODE, enhancedCurrentHue: kotlin.UShort? = COMPILED_CODE, enhancedColorMode: com.google.home.matter.standard.ColorControlTrait.EnhancedColorModeEnum? = COMPILED_CODE, colorLoopActive: kotlin.UByte? = COMPILED_CODE, colorLoopDirection: kotlin.UByte? = COMPILED_CODE, colorLoopTime: kotlin.UShort? =
        COMPILED_CODE, colorLoopStartEnhancedHue: kotlin.UShort? = COMPILED_CODE, colorLoopStoredEnhancedHue: kotlin.UShort? = COMPILED_CODE, colorCapabilities: com.google.home.matter.standard.ColorControlTrait.ColorCapabilitiesBitmap? = COMPILED_CODE, colorTempPhysicalMinMireds: kotlin.UShort? = COMPILED_CODE, colorTempPhysicalMaxMireds: kotlin.UShort? = COMPILED_CODE, coupleColorTempToLevelMinMireds: kotlin.UShort? = COMPILED_CODE, startUpColorTemperatureMireds: kotlin.UShort? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.ColorControlTrait.Feature =
        COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.ColorControlTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.ColorControlTrait.Attributes, com.google.home.matter.standard.ColorControlTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.ColorControlTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.ColorControlTrait.Attributes) { /* compiled code */ }

        public open val currentHue: kotlin.UByte? /* compiled code */

        public open val currentSaturation: kotlin.UByte? /* compiled code */

        public open val remainingTime: kotlin.UShort? /* compiled code */

        public open val currentX: kotlin.UShort? /* compiled code */

        public open val currentY: kotlin.UShort? /* compiled code */

        public open val driftCompensation: com.google.home.matter.standard.ColorControlTrait.DriftCompensationEnum? /* compiled code */

        public open val compensationText: kotlin.String? /* compiled code */

        public open val colorTemperatureMireds: kotlin.UShort? /* compiled code */

        public open val colorMode: com.google.home.matter.standard.ColorControlTrait.ColorModeEnum? /* compiled code */

        public open val options: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap? /* compiled code */

        public open val numberOfPrimaries: kotlin.UByte? /* compiled code */

        public open val primary1X: kotlin.UShort? /* compiled code */

        public open val primary1Y: kotlin.UShort? /* compiled code */

        public open val primary1Intensity: kotlin.UByte? /* compiled code */

        public open val primary2X: kotlin.UShort? /* compiled code */

        public open val primary2Y: kotlin.UShort? /* compiled code */

        public open val primary2Intensity: kotlin.UByte? /* compiled code */

        public open val primary3X: kotlin.UShort? /* compiled code */

        public open val primary3Y: kotlin.UShort? /* compiled code */

        public open val primary3Intensity: kotlin.UByte? /* compiled code */

        public open val primary4X: kotlin.UShort? /* compiled code */

        public open val primary4Y: kotlin.UShort? /* compiled code */

        public open val primary4Intensity: kotlin.UByte? /* compiled code */

        public open val primary5X: kotlin.UShort? /* compiled code */

        public open val primary5Y: kotlin.UShort? /* compiled code */

        public open val primary5Intensity: kotlin.UByte? /* compiled code */

        public open val primary6X: kotlin.UShort? /* compiled code */

        public open val primary6Y: kotlin.UShort? /* compiled code */

        public open val primary6Intensity: kotlin.UByte? /* compiled code */

        public open val whitePointX: kotlin.UShort? /* compiled code */

        public open val whitePointY: kotlin.UShort? /* compiled code */

        public open val colorPointRx: kotlin.UShort? /* compiled code */

        public open val colorPointRy: kotlin.UShort? /* compiled code */

        public open val colorPointRIntensity: kotlin.UByte? /* compiled code */

        public open val colorPointGx: kotlin.UShort? /* compiled code */

        public open val colorPointGy: kotlin.UShort? /* compiled code */

        public open val colorPointGIntensity: kotlin.UByte? /* compiled code */

        public open val colorPointBx: kotlin.UShort? /* compiled code */

        public open val colorPointBy: kotlin.UShort? /* compiled code */

        public open val colorPointBIntensity: kotlin.UByte? /* compiled code */

        public open val enhancedCurrentHue: kotlin.UShort? /* compiled code */

        public open val enhancedColorMode: com.google.home.matter.standard.ColorControlTrait.EnhancedColorModeEnum? /* compiled code */

        public open val colorLoopActive: kotlin.UByte? /* compiled code */

        public open val colorLoopDirection: kotlin.UByte? /* compiled code */

        public open val colorLoopTime: kotlin.UShort? /* compiled code */

        public open val colorLoopStartEnhancedHue: kotlin.UShort? /* compiled code */

        public open val colorLoopStoredEnhancedHue: kotlin.UShort? /* compiled code */

        public open val colorCapabilities: com.google.home.matter.standard.ColorControlTrait.ColorCapabilitiesBitmap? /* compiled code */

        public open val colorTempPhysicalMinMireds: kotlin.UShort? /* compiled code */

        public open val colorTempPhysicalMaxMireds: kotlin.UShort? /* compiled code */

        public open val coupleColorTempToLevelMinMireds: kotlin.UShort? /* compiled code */

        public open val startUpColorTemperatureMireds: kotlin.UShort? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.ColorControlTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.ColorControlTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.ColorControlTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(currentHue: kotlin.UByte? = COMPILED_CODE, currentSaturation: kotlin.UByte? = COMPILED_CODE, remainingTime: kotlin.UShort? = COMPILED_CODE, currentX: kotlin.UShort? = COMPILED_CODE, currentY: kotlin.UShort? = COMPILED_CODE, driftCompensation: com.google.home.matter.standard.ColorControlTrait.DriftCompensationEnum? = COMPILED_CODE, compensationText: kotlin.String? = COMPILED_CODE, colorTemperatureMireds: kotlin.UShort? = COMPILED_CODE, colorMode: com.google.home.matter.standard.ColorControlTrait.ColorModeEnum? = COMPILED_CODE, options: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap? = COMPILED_CODE, numberOfPrimaries: kotlin.UByte? = COMPILED_CODE, primary1X: kotlin.UShort? = COMPILED_CODE, primary1Y: kotlin.UShort? = COMPILED_CODE,
            primary1Intensity: kotlin.UByte? = COMPILED_CODE, primary2X: kotlin.UShort? = COMPILED_CODE, primary2Y: kotlin.UShort? = COMPILED_CODE, primary2Intensity: kotlin.UByte? = COMPILED_CODE, primary3X: kotlin.UShort? = COMPILED_CODE, primary3Y: kotlin.UShort? = COMPILED_CODE, primary3Intensity: kotlin.UByte? = COMPILED_CODE, primary4X: kotlin.UShort? = COMPILED_CODE, primary4Y: kotlin.UShort? = COMPILED_CODE, primary4Intensity: kotlin.UByte? = COMPILED_CODE, primary5X: kotlin.UShort? = COMPILED_CODE, primary5Y: kotlin.UShort? = COMPILED_CODE, primary5Intensity: kotlin.UByte? = COMPILED_CODE, primary6X: kotlin.UShort? = COMPILED_CODE, primary6Y: kotlin.UShort? = COMPILED_CODE, primary6Intensity: kotlin.UByte? = COMPILED_CODE, whitePointX: kotlin.UShort? = COMPILED_CODE, whitePointY:
            kotlin.UShort? = COMPILED_CODE, colorPointRx: kotlin.UShort? = COMPILED_CODE, colorPointRy: kotlin.UShort? = COMPILED_CODE, colorPointRIntensity: kotlin.UByte? = COMPILED_CODE, colorPointGx: kotlin.UShort? = COMPILED_CODE, colorPointGy: kotlin.UShort? = COMPILED_CODE, colorPointGIntensity: kotlin.UByte? = COMPILED_CODE, colorPointBx: kotlin.UShort? = COMPILED_CODE, colorPointBy: kotlin.UShort? = COMPILED_CODE, colorPointBIntensity: kotlin.UByte? = COMPILED_CODE, enhancedCurrentHue: kotlin.UShort? = COMPILED_CODE, enhancedColorMode: com.google.home.matter.standard.ColorControlTrait.EnhancedColorModeEnum? = COMPILED_CODE, colorLoopActive: kotlin.UByte? = COMPILED_CODE, colorLoopDirection: kotlin.UByte? = COMPILED_CODE, colorLoopTime: kotlin.UShort? = COMPILED_CODE,
            colorLoopStartEnhancedHue: kotlin.UShort? = COMPILED_CODE, colorLoopStoredEnhancedHue: kotlin.UShort? = COMPILED_CODE, colorCapabilities: com.google.home.matter.standard.ColorControlTrait.ColorCapabilitiesBitmap? = COMPILED_CODE, colorTempPhysicalMinMireds: kotlin.UShort? = COMPILED_CODE, colorTempPhysicalMaxMireds: kotlin.UShort? = COMPILED_CODE, coupleColorTempToLevelMinMireds: kotlin.UShort? = COMPILED_CODE, startUpColorTemperatureMireds: kotlin.UShort? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.ColorControlTrait.Feature = COMPILED_CODE,
            clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.ColorControlTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.ColorControlTrait.Attributes) : com.google.home.matter.standard.ColorControlTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ColorControlTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ColorControlTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ColorControlTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _options: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap? /* compiled code */

        public open val options: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap? /* compiled code */
            public open get

        internal final var _whitePointX: kotlin.UShort? /* compiled code */

        public open val whitePointX: kotlin.UShort? /* compiled code */
            public open get

        internal final var _whitePointY: kotlin.UShort? /* compiled code */

        public open val whitePointY: kotlin.UShort? /* compiled code */
            public open get

        internal final var _colorPointRx: kotlin.UShort? /* compiled code */

        public open val colorPointRx: kotlin.UShort? /* compiled code */
            public open get

        internal final var _colorPointRy: kotlin.UShort? /* compiled code */

        public open val colorPointRy: kotlin.UShort? /* compiled code */
            public open get

        internal final var _colorPointRIntensity: kotlin.UByte? /* compiled code */

        internal final var _isColorPointRIntensitySet: kotlin.Boolean /* compiled code */

        public open val colorPointRIntensity: kotlin.UByte? /* compiled code */
            public open get

        internal final var _colorPointGx: kotlin.UShort? /* compiled code */

        public open val colorPointGx: kotlin.UShort? /* compiled code */
            public open get

        internal final var _colorPointGy: kotlin.UShort? /* compiled code */

        public open val colorPointGy: kotlin.UShort? /* compiled code */
            public open get

        internal final var _colorPointGIntensity: kotlin.UByte? /* compiled code */

        internal final var _isColorPointGIntensitySet: kotlin.Boolean /* compiled code */

        public open val colorPointGIntensity: kotlin.UByte? /* compiled code */
            public open get

        internal final var _colorPointBx: kotlin.UShort? /* compiled code */

        public open val colorPointBx: kotlin.UShort? /* compiled code */
            public open get

        internal final var _colorPointBy: kotlin.UShort? /* compiled code */

        public open val colorPointBy: kotlin.UShort? /* compiled code */
            public open get

        internal final var _colorPointBIntensity: kotlin.UByte? /* compiled code */

        internal final var _isColorPointBIntensitySet: kotlin.Boolean /* compiled code */

        public open val colorPointBIntensity: kotlin.UByte? /* compiled code */
            public open get

        internal final var _startUpColorTemperatureMireds: kotlin.UShort? /* compiled code */

        internal final var _isStartUpColorTemperatureMiredsSet: kotlin.Boolean /* compiled code */

        public open val startUpColorTemperatureMireds: kotlin.UShort? /* compiled code */
            public open get

        public final fun setOptions(value: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

        public final fun setWhitePointX(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun setWhitePointY(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun setColorPointRx(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun setColorPointRy(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun setColorPointRIntensity(value: kotlin.UByte?): kotlin.Unit { /* compiled code */ }

        public final fun setColorPointGx(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun setColorPointGy(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun setColorPointGIntensity(value: kotlin.UByte?): kotlin.Unit { /* compiled code */ }

        public final fun setColorPointBx(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun setColorPointBy(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun setColorPointBIntensity(value: kotlin.UByte?): kotlin.Unit { /* compiled code */ }

        public final fun setStartUpColorTemperatureMireds(value: kotlin.UShort?): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public object MoveToHueCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(hue: kotlin.UByte = COMPILED_CODE, direction: com.google.home.matter.standard.ColorControlTrait.DirectionEnum = COMPILED_CODE, transitionTime: kotlin.UShort = COMPILED_CODE, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ColorControlTrait.MoveToHueCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ColorControlTrait.MoveToHueCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ColorControlTrait.MoveToHueCommand.Request { /* compiled code */ }
            }

            public final val hue: kotlin.UByte /* compiled code */

            public final val direction: com.google.home.matter.standard.ColorControlTrait.DirectionEnum /* compiled code */

            public final val transitionTime: kotlin.UShort /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.MoveToHueCommand.Request.CommandFields> {
                @androidx.annotation.NonNull hue,

                @androidx.annotation.NonNull direction,

                @androidx.annotation.NonNull transitionTime,

                @androidx.annotation.NonNull optionsMask,

                @androidx.annotation.NonNull optionsOverride;

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

    public object MoveHueCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum = COMPILED_CODE, rate: kotlin.UByte = COMPILED_CODE, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ColorControlTrait.MoveHueCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ColorControlTrait.MoveHueCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ColorControlTrait.MoveHueCommand.Request { /* compiled code */ }
            }

            public final val moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum /* compiled code */

            public final val rate: kotlin.UByte /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.MoveHueCommand.Request.CommandFields> {
                @androidx.annotation.NonNull moveMode,

                @androidx.annotation.NonNull rate,

                @androidx.annotation.NonNull optionsMask,

                @androidx.annotation.NonNull optionsOverride;

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

    public object StepHueCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum = COMPILED_CODE, stepSize: kotlin.UByte = COMPILED_CODE, transitionTime: kotlin.UByte = COMPILED_CODE, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ColorControlTrait.StepHueCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ColorControlTrait.StepHueCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ColorControlTrait.StepHueCommand.Request { /* compiled code */ }
            }

            public final val stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum /* compiled code */

            public final val stepSize: kotlin.UByte /* compiled code */

            public final val transitionTime: kotlin.UByte /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.StepHueCommand.Request.CommandFields> {
                @androidx.annotation.NonNull stepMode,

                @androidx.annotation.NonNull stepSize,

                @androidx.annotation.NonNull transitionTime,

                @androidx.annotation.NonNull optionsMask,

                @androidx.annotation.NonNull optionsOverride;

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

    public object MoveToSaturationCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(saturation: kotlin.UByte = COMPILED_CODE, transitionTime: kotlin.UShort = COMPILED_CODE, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ColorControlTrait.MoveToSaturationCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ColorControlTrait.MoveToSaturationCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ColorControlTrait.MoveToSaturationCommand.Request { /* compiled code */ }
            }

            public final val saturation: kotlin.UByte /* compiled code */

            public final val transitionTime: kotlin.UShort /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.MoveToSaturationCommand.Request.CommandFields> {
                @androidx.annotation.NonNull saturation,

                @androidx.annotation.NonNull transitionTime,

                @androidx.annotation.NonNull optionsMask,

                @androidx.annotation.NonNull optionsOverride;

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

    public object MoveSaturationCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum = COMPILED_CODE, rate: kotlin.UByte = COMPILED_CODE, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ColorControlTrait.MoveSaturationCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ColorControlTrait.MoveSaturationCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ColorControlTrait.MoveSaturationCommand.Request { /* compiled code */ }
            }

            public final val moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum /* compiled code */

            public final val rate: kotlin.UByte /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.MoveSaturationCommand.Request.CommandFields> {
                @androidx.annotation.NonNull moveMode,

                @androidx.annotation.NonNull rate,

                @androidx.annotation.NonNull optionsMask,

                @androidx.annotation.NonNull optionsOverride;

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

    public object StepSaturationCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum = COMPILED_CODE, stepSize: kotlin.UByte = COMPILED_CODE, transitionTime: kotlin.UByte = COMPILED_CODE, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ColorControlTrait.StepSaturationCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ColorControlTrait.StepSaturationCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ColorControlTrait.StepSaturationCommand.Request { /* compiled code */ }
            }

            public final val stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum /* compiled code */

            public final val stepSize: kotlin.UByte /* compiled code */

            public final val transitionTime: kotlin.UByte /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.StepSaturationCommand.Request.CommandFields> {
                @androidx.annotation.NonNull stepMode,

                @androidx.annotation.NonNull stepSize,

                @androidx.annotation.NonNull transitionTime,

                @androidx.annotation.NonNull optionsMask,

                @androidx.annotation.NonNull optionsOverride;

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

    public object MoveToHueAndSaturationCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(hue: kotlin.UByte = COMPILED_CODE, saturation: kotlin.UByte = COMPILED_CODE, transitionTime: kotlin.UShort = COMPILED_CODE, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ColorControlTrait.MoveToHueAndSaturationCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ColorControlTrait.MoveToHueAndSaturationCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ColorControlTrait.MoveToHueAndSaturationCommand.Request { /* compiled code */ }
            }

            public final val hue: kotlin.UByte /* compiled code */

            public final val saturation: kotlin.UByte /* compiled code */

            public final val transitionTime: kotlin.UShort /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.MoveToHueAndSaturationCommand.Request.CommandFields> {
                @androidx.annotation.NonNull hue,

                @androidx.annotation.NonNull saturation,

                @androidx.annotation.NonNull transitionTime,

                @androidx.annotation.NonNull optionsMask,

                @androidx.annotation.NonNull optionsOverride;

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

    public object MoveToColorCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(colorX: kotlin.UShort = COMPILED_CODE, colorY: kotlin.UShort = COMPILED_CODE, transitionTime: kotlin.UShort = COMPILED_CODE, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ColorControlTrait.MoveToColorCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ColorControlTrait.MoveToColorCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ColorControlTrait.MoveToColorCommand.Request { /* compiled code */ }
            }

            public final val colorX: kotlin.UShort /* compiled code */

            public final val colorY: kotlin.UShort /* compiled code */

            public final val transitionTime: kotlin.UShort /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.MoveToColorCommand.Request.CommandFields> {
                @androidx.annotation.NonNull colorX,

                @androidx.annotation.NonNull colorY,

                @androidx.annotation.NonNull transitionTime,

                @androidx.annotation.NonNull optionsMask,

                @androidx.annotation.NonNull optionsOverride;

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

    public object MoveColorCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(rateX: kotlin.Short = COMPILED_CODE, rateY: kotlin.Short = COMPILED_CODE, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ColorControlTrait.MoveColorCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ColorControlTrait.MoveColorCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ColorControlTrait.MoveColorCommand.Request { /* compiled code */ }
            }

            public final val rateX: kotlin.Short /* compiled code */

            public final val rateY: kotlin.Short /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.MoveColorCommand.Request.CommandFields> {
                @androidx.annotation.NonNull rateX,

                @androidx.annotation.NonNull rateY,

                @androidx.annotation.NonNull optionsMask,

                @androidx.annotation.NonNull optionsOverride;

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

    public object StepColorCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(stepX: kotlin.Short = COMPILED_CODE, stepY: kotlin.Short = COMPILED_CODE, transitionTime: kotlin.UShort = COMPILED_CODE, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ColorControlTrait.StepColorCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ColorControlTrait.StepColorCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ColorControlTrait.StepColorCommand.Request { /* compiled code */ }
            }

            public final val stepX: kotlin.Short /* compiled code */

            public final val stepY: kotlin.Short /* compiled code */

            public final val transitionTime: kotlin.UShort /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.StepColorCommand.Request.CommandFields> {
                @androidx.annotation.NonNull stepX,

                @androidx.annotation.NonNull stepY,

                @androidx.annotation.NonNull transitionTime,

                @androidx.annotation.NonNull optionsMask,

                @androidx.annotation.NonNull optionsOverride;

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

    public object MoveToColorTemperatureCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(colorTemperatureMireds: kotlin.UShort = COMPILED_CODE, transitionTime: kotlin.UShort = COMPILED_CODE, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ColorControlTrait.MoveToColorTemperatureCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ColorControlTrait.MoveToColorTemperatureCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ColorControlTrait.MoveToColorTemperatureCommand.Request { /* compiled code */ }
            }

            public final val colorTemperatureMireds: kotlin.UShort /* compiled code */

            public final val transitionTime: kotlin.UShort /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.MoveToColorTemperatureCommand.Request.CommandFields> {
                @androidx.annotation.NonNull colorTemperatureMireds,

                @androidx.annotation.NonNull transitionTime,

                @androidx.annotation.NonNull optionsMask,

                @androidx.annotation.NonNull optionsOverride;

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

    public object EnhancedMoveToHueCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(enhancedHue: kotlin.UShort = COMPILED_CODE, direction: com.google.home.matter.standard.ColorControlTrait.DirectionEnum = COMPILED_CODE, transitionTime: kotlin.UShort = COMPILED_CODE, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ColorControlTrait.EnhancedMoveToHueCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ColorControlTrait.EnhancedMoveToHueCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ColorControlTrait.EnhancedMoveToHueCommand.Request { /* compiled code */ }
            }

            public final val enhancedHue: kotlin.UShort /* compiled code */

            public final val direction: com.google.home.matter.standard.ColorControlTrait.DirectionEnum /* compiled code */

            public final val transitionTime: kotlin.UShort /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.EnhancedMoveToHueCommand.Request.CommandFields> {
                @androidx.annotation.NonNull enhancedHue,

                @androidx.annotation.NonNull direction,

                @androidx.annotation.NonNull transitionTime,

                @androidx.annotation.NonNull optionsMask,

                @androidx.annotation.NonNull optionsOverride;

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

    public object EnhancedMoveHueCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum = COMPILED_CODE, rate: kotlin.UShort = COMPILED_CODE, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ColorControlTrait.EnhancedMoveHueCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ColorControlTrait.EnhancedMoveHueCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ColorControlTrait.EnhancedMoveHueCommand.Request { /* compiled code */ }
            }

            public final val moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum /* compiled code */

            public final val rate: kotlin.UShort /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.EnhancedMoveHueCommand.Request.CommandFields> {
                @androidx.annotation.NonNull moveMode,

                @androidx.annotation.NonNull rate,

                @androidx.annotation.NonNull optionsMask,

                @androidx.annotation.NonNull optionsOverride;

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

    public object EnhancedStepHueCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum = COMPILED_CODE, stepSize: kotlin.UShort = COMPILED_CODE, transitionTime: kotlin.UShort = COMPILED_CODE, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ColorControlTrait.EnhancedStepHueCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ColorControlTrait.EnhancedStepHueCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ColorControlTrait.EnhancedStepHueCommand.Request { /* compiled code */ }
            }

            public final val stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum /* compiled code */

            public final val stepSize: kotlin.UShort /* compiled code */

            public final val transitionTime: kotlin.UShort /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.EnhancedStepHueCommand.Request.CommandFields> {
                @androidx.annotation.NonNull stepMode,

                @androidx.annotation.NonNull stepSize,

                @androidx.annotation.NonNull transitionTime,

                @androidx.annotation.NonNull optionsMask,

                @androidx.annotation.NonNull optionsOverride;

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

    public object EnhancedMoveToHueAndSaturationCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(enhancedHue: kotlin.UShort = COMPILED_CODE, saturation: kotlin.UByte = COMPILED_CODE, transitionTime: kotlin.UShort = COMPILED_CODE, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ColorControlTrait.EnhancedMoveToHueAndSaturationCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ColorControlTrait.EnhancedMoveToHueAndSaturationCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ColorControlTrait.EnhancedMoveToHueAndSaturationCommand.Request { /* compiled code */ }
            }

            public final val enhancedHue: kotlin.UShort /* compiled code */

            public final val saturation: kotlin.UByte /* compiled code */

            public final val transitionTime: kotlin.UShort /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.EnhancedMoveToHueAndSaturationCommand.Request.CommandFields> {
                @androidx.annotation.NonNull enhancedHue,

                @androidx.annotation.NonNull saturation,

                @androidx.annotation.NonNull transitionTime,

                @androidx.annotation.NonNull optionsMask,

                @androidx.annotation.NonNull optionsOverride;

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

    public object ColorLoopSetCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(updateFlags: com.google.home.matter.standard.ColorControlTrait.UpdateFlagsBitmap = COMPILED_CODE, action: com.google.home.matter.standard.ColorControlTrait.ColorLoopActionEnum = COMPILED_CODE, direction: com.google.home.matter.standard.ColorControlTrait.ColorLoopDirectionEnum = COMPILED_CODE, time: kotlin.UShort = COMPILED_CODE, startHue: kotlin.UShort = COMPILED_CODE, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ColorControlTrait.ColorLoopSetCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ColorControlTrait.ColorLoopSetCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ColorControlTrait.ColorLoopSetCommand.Request { /* compiled code */ }
            }

            public final val updateFlags: com.google.home.matter.standard.ColorControlTrait.UpdateFlagsBitmap /* compiled code */

            public final val action: com.google.home.matter.standard.ColorControlTrait.ColorLoopActionEnum /* compiled code */

            public final val direction: com.google.home.matter.standard.ColorControlTrait.ColorLoopDirectionEnum /* compiled code */

            public final val time: kotlin.UShort /* compiled code */

            public final val startHue: kotlin.UShort /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.ColorLoopSetCommand.Request.CommandFields> {
                @androidx.annotation.NonNull updateFlags,

                @androidx.annotation.NonNull action,

                @androidx.annotation.NonNull direction,

                @androidx.annotation.NonNull time,

                @androidx.annotation.NonNull startHue,

                @androidx.annotation.NonNull optionsMask,

                @androidx.annotation.NonNull optionsOverride;

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

    public object StopMoveStepCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ColorControlTrait.StopMoveStepCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ColorControlTrait.StopMoveStepCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ColorControlTrait.StopMoveStepCommand.Request { /* compiled code */ }
            }

            public final val optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.StopMoveStepCommand.Request.CommandFields> {
                @androidx.annotation.NonNull optionsMask,

                @androidx.annotation.NonNull optionsOverride;

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

    public object MoveColorTemperatureCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum = COMPILED_CODE, rate: kotlin.UShort = COMPILED_CODE, colorTemperatureMinimumMireds: kotlin.UShort = COMPILED_CODE, colorTemperatureMaximumMireds: kotlin.UShort = COMPILED_CODE, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ColorControlTrait.MoveColorTemperatureCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ColorControlTrait.MoveColorTemperatureCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ColorControlTrait.MoveColorTemperatureCommand.Request { /* compiled code */ }
            }

            public final val moveMode: com.google.home.matter.standard.ColorControlTrait.MoveModeEnum /* compiled code */

            public final val rate: kotlin.UShort /* compiled code */

            public final val colorTemperatureMinimumMireds: kotlin.UShort /* compiled code */

            public final val colorTemperatureMaximumMireds: kotlin.UShort /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.MoveColorTemperatureCommand.Request.CommandFields> {
                @androidx.annotation.NonNull moveMode,

                @androidx.annotation.NonNull rate,

                @androidx.annotation.NonNull colorTemperatureMinimumMireds,

                @androidx.annotation.NonNull colorTemperatureMaximumMireds,

                @androidx.annotation.NonNull optionsMask,

                @androidx.annotation.NonNull optionsOverride;

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

    public object StepColorTemperatureCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum = COMPILED_CODE, stepSize: kotlin.UShort = COMPILED_CODE, transitionTime: kotlin.UShort = COMPILED_CODE, colorTemperatureMinimumMireds: kotlin.UShort = COMPILED_CODE, colorTemperatureMaximumMireds: kotlin.UShort = COMPILED_CODE, optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ColorControlTrait.StepColorTemperatureCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ColorControlTrait.StepColorTemperatureCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ColorControlTrait.StepColorTemperatureCommand.Request { /* compiled code */ }
            }

            public final val stepMode: com.google.home.matter.standard.ColorControlTrait.StepModeEnum /* compiled code */

            public final val stepSize: kotlin.UShort /* compiled code */

            public final val transitionTime: kotlin.UShort /* compiled code */

            public final val colorTemperatureMinimumMireds: kotlin.UShort /* compiled code */

            public final val colorTemperatureMaximumMireds: kotlin.UShort /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.ColorControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ColorControlTrait.StepColorTemperatureCommand.Request.CommandFields> {
                @androidx.annotation.NonNull stepMode,

                @androidx.annotation.NonNull stepSize,

                @androidx.annotation.NonNull transitionTime,

                @androidx.annotation.NonNull colorTemperatureMinimumMireds,

                @androidx.annotation.NonNull colorTemperatureMaximumMireds,

                @androidx.annotation.NonNull optionsMask,

                @androidx.annotation.NonNull optionsOverride;

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
