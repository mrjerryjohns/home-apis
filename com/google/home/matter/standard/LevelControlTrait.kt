// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object LevelControlTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class MoveModeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.LevelControlTrait.MoveModeEnum> {
        @androidx.annotation.NonNull Up,

        @androidx.annotation.NonNull Down,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.LevelControlTrait.MoveModeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class StepModeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.LevelControlTrait.StepModeEnum> {
        @androidx.annotation.NonNull Up,

        @androidx.annotation.NonNull Down,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.LevelControlTrait.StepModeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(onOff: kotlin.Boolean = COMPILED_CODE, lighting: kotlin.Boolean = COMPILED_CODE, frequency: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.LevelControlTrait.Feature> {
            private const final val ON_OFF_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val LIGHTING_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val FREQUENCY_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.LevelControlTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.LevelControlTrait.Feature { /* compiled code */ }
        }

        public final val onOff: kotlin.Boolean /* compiled code */

        public final val lighting: kotlin.Boolean /* compiled code */

        public final val frequency: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(onOff: kotlin.Boolean = COMPILED_CODE, lighting: kotlin.Boolean = COMPILED_CODE, frequency: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.LevelControlTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final data class OptionsBitmap public constructor(executeIfOff: kotlin.Boolean = COMPILED_CODE, coupleColorTempToLevel: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.LevelControlTrait.OptionsBitmap> {
            private const final val EXECUTE_IF_OFF_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val COUPLE_COLOR_TEMP_TO_LEVEL_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.LevelControlTrait.OptionsBitmap { /* compiled code */ }
        }

        public final val executeIfOff: kotlin.Boolean /* compiled code */

        public final val coupleColorTempToLevel: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(executeIfOff: kotlin.Boolean = COMPILED_CODE, coupleColorTempToLevel: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.LevelControlTrait.OptionsBitmap { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.LevelControlTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.LevelControlTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.LevelControlTrait.Attributes { /* compiled code */ }
        }

        public abstract val currentLevel: kotlin.UByte?

        public abstract val remainingTime: kotlin.UShort?

        public abstract val minLevel: kotlin.UByte?

        public abstract val maxLevel: kotlin.UByte?

        public abstract val currentFrequency: kotlin.UShort?

        public abstract val minFrequency: kotlin.UShort?

        public abstract val maxFrequency: kotlin.UShort?

        public abstract val options: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap?

        public abstract val onOffTransitionTime: kotlin.UShort?

        public abstract val onLevel: kotlin.UByte?

        public abstract val onTransitionTime: kotlin.UShort?

        public abstract val offTransitionTime: kotlin.UShort?

        public abstract val defaultMoveRate: kotlin.UByte?

        public abstract val startUpCurrentLevel: kotlin.UByte?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.LevelControlTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(currentLevel: kotlin.UByte? = COMPILED_CODE, remainingTime: kotlin.UShort? = COMPILED_CODE, minLevel: kotlin.UByte? = COMPILED_CODE, maxLevel: kotlin.UByte? = COMPILED_CODE, currentFrequency: kotlin.UShort? = COMPILED_CODE, minFrequency: kotlin.UShort? = COMPILED_CODE, maxFrequency: kotlin.UShort? = COMPILED_CODE, options: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap? = COMPILED_CODE, onOffTransitionTime: kotlin.UShort? = COMPILED_CODE, onLevel: kotlin.UByte? = COMPILED_CODE, onTransitionTime: kotlin.UShort? = COMPILED_CODE, offTransitionTime: kotlin.UShort? = COMPILED_CODE, defaultMoveRate: kotlin.UByte? = COMPILED_CODE, startUpCurrentLevel: kotlin.UByte? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.LevelControlTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.LevelControlTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.LevelControlTrait.Attributes, com.google.home.matter.standard.LevelControlTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.LevelControlTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.LevelControlTrait.Attributes) { /* compiled code */ }

        public open val currentLevel: kotlin.UByte? /* compiled code */

        public open val remainingTime: kotlin.UShort? /* compiled code */

        public open val minLevel: kotlin.UByte? /* compiled code */

        public open val maxLevel: kotlin.UByte? /* compiled code */

        public open val currentFrequency: kotlin.UShort? /* compiled code */

        public open val minFrequency: kotlin.UShort? /* compiled code */

        public open val maxFrequency: kotlin.UShort? /* compiled code */

        public open val options: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap? /* compiled code */

        public open val onOffTransitionTime: kotlin.UShort? /* compiled code */

        public open val onLevel: kotlin.UByte? /* compiled code */

        public open val onTransitionTime: kotlin.UShort? /* compiled code */

        public open val offTransitionTime: kotlin.UShort? /* compiled code */

        public open val defaultMoveRate: kotlin.UByte? /* compiled code */

        public open val startUpCurrentLevel: kotlin.UByte? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.LevelControlTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.LevelControlTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.LevelControlTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(currentLevel: kotlin.UByte? = COMPILED_CODE, remainingTime: kotlin.UShort? = COMPILED_CODE, minLevel: kotlin.UByte? = COMPILED_CODE, maxLevel: kotlin.UByte? = COMPILED_CODE, currentFrequency: kotlin.UShort? = COMPILED_CODE, minFrequency: kotlin.UShort? = COMPILED_CODE, maxFrequency: kotlin.UShort? = COMPILED_CODE, options: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap? = COMPILED_CODE, onOffTransitionTime: kotlin.UShort? = COMPILED_CODE, onLevel: kotlin.UByte? = COMPILED_CODE, onTransitionTime: kotlin.UShort? = COMPILED_CODE, offTransitionTime: kotlin.UShort? = COMPILED_CODE, defaultMoveRate: kotlin.UByte? = COMPILED_CODE, startUpCurrentLevel: kotlin.UByte? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.LevelControlTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.LevelControlTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.LevelControlTrait.Attributes) : com.google.home.matter.standard.LevelControlTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.LevelControlTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.LevelControlTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.LevelControlTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _options: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap? /* compiled code */

        public open val options: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap? /* compiled code */
            public open get

        internal final var _onOffTransitionTime: kotlin.UShort? /* compiled code */

        public open val onOffTransitionTime: kotlin.UShort? /* compiled code */
            public open get

        internal final var _onLevel: kotlin.UByte? /* compiled code */

        internal final var _isOnLevelSet: kotlin.Boolean /* compiled code */

        public open val onLevel: kotlin.UByte? /* compiled code */
            public open get

        internal final var _onTransitionTime: kotlin.UShort? /* compiled code */

        internal final var _isOnTransitionTimeSet: kotlin.Boolean /* compiled code */

        public open val onTransitionTime: kotlin.UShort? /* compiled code */
            public open get

        internal final var _offTransitionTime: kotlin.UShort? /* compiled code */

        internal final var _isOffTransitionTimeSet: kotlin.Boolean /* compiled code */

        public open val offTransitionTime: kotlin.UShort? /* compiled code */
            public open get

        internal final var _defaultMoveRate: kotlin.UByte? /* compiled code */

        internal final var _isDefaultMoveRateSet: kotlin.Boolean /* compiled code */

        public open val defaultMoveRate: kotlin.UByte? /* compiled code */
            public open get

        internal final var _startUpCurrentLevel: kotlin.UByte? /* compiled code */

        internal final var _isStartUpCurrentLevelSet: kotlin.Boolean /* compiled code */

        public open val startUpCurrentLevel: kotlin.UByte? /* compiled code */
            public open get

        public final fun setOptions(value: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap): kotlin.Unit { /* compiled code */ }

        public final fun setOnOffTransitionTime(value: kotlin.UShort): kotlin.Unit { /* compiled code */ }

        public final fun setOnLevel(value: kotlin.UByte?): kotlin.Unit { /* compiled code */ }

        public final fun setOnTransitionTime(value: kotlin.UShort?): kotlin.Unit { /* compiled code */ }

        public final fun setOffTransitionTime(value: kotlin.UShort?): kotlin.Unit { /* compiled code */ }

        public final fun setDefaultMoveRate(value: kotlin.UByte?): kotlin.Unit { /* compiled code */ }

        public final fun setStartUpCurrentLevel(value: kotlin.UByte?): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public object MoveToLevelCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(level: kotlin.UByte = COMPILED_CODE, transitionTime: kotlin.UShort? = COMPILED_CODE, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.LevelControlTrait.MoveToLevelCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.LevelControlTrait.MoveToLevelCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.LevelControlTrait.MoveToLevelCommand.Request { /* compiled code */ }
            }

            public final val level: kotlin.UByte /* compiled code */

            public final val transitionTime: kotlin.UShort? /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.LevelControlTrait.MoveToLevelCommand.Request.CommandFields> {
                @androidx.annotation.NonNull level,

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

    public object MoveCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(moveMode: com.google.home.matter.standard.LevelControlTrait.MoveModeEnum = COMPILED_CODE, rate: kotlin.UByte? = COMPILED_CODE, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.LevelControlTrait.MoveCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.LevelControlTrait.MoveCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.LevelControlTrait.MoveCommand.Request { /* compiled code */ }
            }

            public final val moveMode: com.google.home.matter.standard.LevelControlTrait.MoveModeEnum /* compiled code */

            public final val rate: kotlin.UByte? /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.LevelControlTrait.MoveCommand.Request.CommandFields> {
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

    public object StepCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(stepMode: com.google.home.matter.standard.LevelControlTrait.StepModeEnum = COMPILED_CODE, stepSize: kotlin.UByte = COMPILED_CODE, transitionTime: kotlin.UShort? = COMPILED_CODE, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.LevelControlTrait.StepCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.LevelControlTrait.StepCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.LevelControlTrait.StepCommand.Request { /* compiled code */ }
            }

            public final val stepMode: com.google.home.matter.standard.LevelControlTrait.StepModeEnum /* compiled code */

            public final val stepSize: kotlin.UByte /* compiled code */

            public final val transitionTime: kotlin.UShort? /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.LevelControlTrait.StepCommand.Request.CommandFields> {
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

    public object StopCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.LevelControlTrait.StopCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.LevelControlTrait.StopCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.LevelControlTrait.StopCommand.Request { /* compiled code */ }
            }

            public final val optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.LevelControlTrait.StopCommand.Request.CommandFields> {
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

    public object MoveToLevelWithOnOffCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(level: kotlin.UByte = COMPILED_CODE, transitionTime: kotlin.UShort? = COMPILED_CODE, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.LevelControlTrait.MoveToLevelWithOnOffCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.LevelControlTrait.MoveToLevelWithOnOffCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.LevelControlTrait.MoveToLevelWithOnOffCommand.Request { /* compiled code */ }
            }

            public final val level: kotlin.UByte /* compiled code */

            public final val transitionTime: kotlin.UShort? /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.LevelControlTrait.MoveToLevelWithOnOffCommand.Request.CommandFields> {
                @androidx.annotation.NonNull level,

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

    public object MoveWithOnOffCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(moveMode: com.google.home.matter.standard.LevelControlTrait.MoveModeEnum = COMPILED_CODE, rate: kotlin.UByte? = COMPILED_CODE, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.LevelControlTrait.MoveWithOnOffCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.LevelControlTrait.MoveWithOnOffCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.LevelControlTrait.MoveWithOnOffCommand.Request { /* compiled code */ }
            }

            public final val moveMode: com.google.home.matter.standard.LevelControlTrait.MoveModeEnum /* compiled code */

            public final val rate: kotlin.UByte? /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.LevelControlTrait.MoveWithOnOffCommand.Request.CommandFields> {
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

    public object StepWithOnOffCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(stepMode: com.google.home.matter.standard.LevelControlTrait.StepModeEnum = COMPILED_CODE, stepSize: kotlin.UByte = COMPILED_CODE, transitionTime: kotlin.UShort? = COMPILED_CODE, optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.LevelControlTrait.StepWithOnOffCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.LevelControlTrait.StepWithOnOffCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.LevelControlTrait.StepWithOnOffCommand.Request { /* compiled code */ }
            }

            public final val stepMode: com.google.home.matter.standard.LevelControlTrait.StepModeEnum /* compiled code */

            public final val stepSize: kotlin.UByte /* compiled code */

            public final val transitionTime: kotlin.UShort? /* compiled code */

            public final val optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.LevelControlTrait.StepWithOnOffCommand.Request.CommandFields> {
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

    public object StopWithOnOffCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap = COMPILED_CODE, optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.LevelControlTrait.StopWithOnOffCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.LevelControlTrait.StopWithOnOffCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.LevelControlTrait.StopWithOnOffCommand.Request { /* compiled code */ }
            }

            public final val optionsMask: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap /* compiled code */

            public final val optionsOverride: com.google.home.matter.standard.LevelControlTrait.OptionsBitmap /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.LevelControlTrait.StopWithOnOffCommand.Request.CommandFields> {
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

    public object MoveToClosestFrequencyCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(frequency: kotlin.UShort = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.LevelControlTrait.MoveToClosestFrequencyCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.LevelControlTrait.MoveToClosestFrequencyCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.LevelControlTrait.MoveToClosestFrequencyCommand.Request { /* compiled code */ }
            }

            public final val frequency: kotlin.UShort /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.LevelControlTrait.MoveToClosestFrequencyCommand.Request.CommandFields> {
                @androidx.annotation.NonNull frequency;

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

