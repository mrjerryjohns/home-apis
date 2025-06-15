// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object MicrowaveOvenControlTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final data class Feature public constructor(powerAsNumber: kotlin.Boolean = COMPILED_CODE, powerInWatts: kotlin.Boolean = COMPILED_CODE, powerNumberLimits: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.MicrowaveOvenControlTrait.Feature> {
            private const final val POWER_AS_NUMBER_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val POWER_IN_WATTS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val POWER_NUMBER_LIMITS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.MicrowaveOvenControlTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.MicrowaveOvenControlTrait.Feature { /* compiled code */ }
        }

        public final val powerAsNumber: kotlin.Boolean /* compiled code */

        public final val powerInWatts: kotlin.Boolean /* compiled code */

        public final val powerNumberLimits: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(powerAsNumber: kotlin.Boolean = COMPILED_CODE, powerInWatts: kotlin.Boolean = COMPILED_CODE, powerNumberLimits: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.MicrowaveOvenControlTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.MicrowaveOvenControlTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.MicrowaveOvenControlTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.MicrowaveOvenControlTrait.Attributes { /* compiled code */ }
        }

        public abstract val cookTime: kotlin.UInt?

        public abstract val maxCookTime: kotlin.UInt?

        public abstract val powerSetting: kotlin.UByte?

        public abstract val minPower: kotlin.UByte?

        public abstract val maxPower: kotlin.UByte?

        public abstract val powerStep: kotlin.UByte?

        public abstract val supportedWatts: kotlin.collections.List<kotlin.UShort>?

        public abstract val selectedWattIndex: kotlin.UByte?

        public abstract val wattRating: kotlin.UShort?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.MicrowaveOvenControlTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(cookTime: kotlin.UInt? = COMPILED_CODE, maxCookTime: kotlin.UInt? = COMPILED_CODE, powerSetting: kotlin.UByte? = COMPILED_CODE, minPower: kotlin.UByte? = COMPILED_CODE, maxPower: kotlin.UByte? = COMPILED_CODE, powerStep: kotlin.UByte? = COMPILED_CODE, supportedWatts: kotlin.collections.List<kotlin.UShort>? = COMPILED_CODE, selectedWattIndex: kotlin.UByte? = COMPILED_CODE, wattRating: kotlin.UShort? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.MicrowaveOvenControlTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.MicrowaveOvenControlTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.MicrowaveOvenControlTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.MicrowaveOvenControlTrait.Attributes) { /* compiled code */ }

        public open val cookTime: kotlin.UInt? /* compiled code */

        public open val maxCookTime: kotlin.UInt? /* compiled code */

        public open val powerSetting: kotlin.UByte? /* compiled code */

        public open val minPower: kotlin.UByte? /* compiled code */

        public open val maxPower: kotlin.UByte? /* compiled code */

        public open val powerStep: kotlin.UByte? /* compiled code */

        public open val supportedWatts: kotlin.collections.List<kotlin.UShort>? /* compiled code */

        public open val selectedWattIndex: kotlin.UByte? /* compiled code */

        public open val wattRating: kotlin.UShort? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.MicrowaveOvenControlTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(cookTime: kotlin.UInt? = COMPILED_CODE, maxCookTime: kotlin.UInt? = COMPILED_CODE, powerSetting: kotlin.UByte? = COMPILED_CODE, minPower: kotlin.UByte? = COMPILED_CODE, maxPower: kotlin.UByte? = COMPILED_CODE, powerStep: kotlin.UByte? = COMPILED_CODE, supportedWatts: kotlin.collections.List<kotlin.UShort>? = COMPILED_CODE, selectedWattIndex: kotlin.UByte? = COMPILED_CODE, wattRating: kotlin.UShort? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.MicrowaveOvenControlTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.MicrowaveOvenControlTrait.AttributesImpl { /* compiled code */ }
    }

    public object SetCookingParametersCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(cookMode: com.google.home.matter.serialization.OptionalValue<kotlin.UByte> = COMPILED_CODE, cookTime: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> = COMPILED_CODE, powerSetting: com.google.home.matter.serialization.OptionalValue<kotlin.UByte> = COMPILED_CODE, wattSettingIndex: com.google.home.matter.serialization.OptionalValue<kotlin.UByte> = COMPILED_CODE, startAfterSetting: com.google.home.matter.serialization.OptionalValue<kotlin.Boolean> = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.MicrowaveOvenControlTrait.SetCookingParametersCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.MicrowaveOvenControlTrait.SetCookingParametersCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.MicrowaveOvenControlTrait.SetCookingParametersCommand.Request { /* compiled code */ }
            }

            public final val cookMode: com.google.home.matter.serialization.OptionalValue<kotlin.UByte> /* compiled code */

            public final val cookTime: com.google.home.matter.serialization.OptionalValue<kotlin.UInt> /* compiled code */

            public final val powerSetting: com.google.home.matter.serialization.OptionalValue<kotlin.UByte> /* compiled code */

            public final val wattSettingIndex: com.google.home.matter.serialization.OptionalValue<kotlin.UByte> /* compiled code */

            public final val startAfterSetting: com.google.home.matter.serialization.OptionalValue<kotlin.Boolean> /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.MicrowaveOvenControlTrait.SetCookingParametersCommand.Request.CommandFields> {
                @androidx.annotation.NonNull cookMode,

                @androidx.annotation.NonNull cookTime,

                @androidx.annotation.NonNull powerSetting,

                @androidx.annotation.NonNull wattSettingIndex,

                @androidx.annotation.NonNull startAfterSetting;

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
            public abstract var cookMode: kotlin.UByte

            public abstract var cookTime: kotlin.UInt

            public abstract var powerSetting: kotlin.UByte

            public abstract var wattSettingIndex: kotlin.UByte

            public abstract var startAfterSetting: kotlin.Boolean
        }
    }

    public object AddMoreTimeCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(timeToAdd: kotlin.UInt = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.MicrowaveOvenControlTrait.AddMoreTimeCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.MicrowaveOvenControlTrait.AddMoreTimeCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.MicrowaveOvenControlTrait.AddMoreTimeCommand.Request { /* compiled code */ }
            }

            public final val timeToAdd: kotlin.UInt /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.MicrowaveOvenControlTrait.AddMoreTimeCommand.Request.CommandFields> {
                @androidx.annotation.NonNull timeToAdd;

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

