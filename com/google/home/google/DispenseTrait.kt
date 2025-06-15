// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object DispenseTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class Unit private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.DispenseTrait.Unit> {
        @androidx.annotation.NonNull Unspecified,

        @androidx.annotation.NonNull NoUnits,

        @androidx.annotation.NonNull Centimeters,

        @androidx.annotation.NonNull Cups,

        @androidx.annotation.NonNull Deciliters,

        @androidx.annotation.NonNull Feet,

        @androidx.annotation.NonNull FluidOunces,

        @androidx.annotation.NonNull Gallons,

        @androidx.annotation.NonNull Grams,

        @androidx.annotation.NonNull Inches,

        @androidx.annotation.NonNull Kilograms,

        @androidx.annotation.NonNull Liters,

        @androidx.annotation.NonNull Meters,

        @androidx.annotation.NonNull Milligrams,

        @androidx.annotation.NonNull Milliliters,

        @androidx.annotation.NonNull Millimeters,

        @androidx.annotation.NonNull Ounces,

        @androidx.annotation.NonNull Pinch,

        @androidx.annotation.NonNull Pints,

        @androidx.annotation.NonNull Portion,

        @androidx.annotation.NonNull Pounds,

        @androidx.annotation.NonNull Quarts,

        @androidx.annotation.NonNull Tablespoons,

        @androidx.annotation.NonNull Teaspoons,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.DispenseTrait.Unit> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final class Amount public constructor(amount: kotlin.Float = COMPILED_CODE, unit: com.google.home.google.DispenseTrait.Unit = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.DispenseTrait.Amount>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.DispenseTrait.Amount?>.amount: com.google.home.automation.TypedExpression<kotlin.Float> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.DispenseTrait.Amount?>.unit: com.google.home.automation.TypedExpression<com.google.home.google.DispenseTrait.Unit> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.DispenseTrait.Amount): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.DispenseTrait.Amount { /* compiled code */ }
        }

        public final val amount: kotlin.Float /* compiled code */

        public final val unit: com.google.home.google.DispenseTrait.Unit /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.DispenseTrait.Amount.StructFields> {
            @androidx.annotation.NonNull amount,

            @androidx.annotation.NonNull unit;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class ItemNameSynonym public constructor(synonyms: kotlin.collections.List<kotlin.String> = COMPILED_CODE, lang: kotlin.String = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.DispenseTrait.ItemNameSynonym>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.DispenseTrait.ItemNameSynonym?>.synonyms: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.DispenseTrait.ItemNameSynonym?>.lang: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.DispenseTrait.ItemNameSynonym): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.DispenseTrait.ItemNameSynonym { /* compiled code */ }
        }

        public final val synonyms: kotlin.collections.List<kotlin.String> /* compiled code */

        public final val lang: kotlin.String /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.DispenseTrait.ItemNameSynonym.StructFields> {
            @androidx.annotation.NonNull synonyms,

            @androidx.annotation.NonNull lang;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class DispensableItem public constructor(itemName: kotlin.String = COMPILED_CODE, itemNameSynonyms: kotlin.collections.List<com.google.home.google.DispenseTrait.ItemNameSynonym> = COMPILED_CODE, supportedUnits: kotlin.collections.List<com.google.home.google.DispenseTrait.Unit> = COMPILED_CODE, defaultPortion: com.google.home.google.DispenseTrait.Amount = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.DispenseTrait.DispensableItem>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.DispenseTrait.DispensableItem?>.itemName: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.DispenseTrait.DispensableItem?>.itemNameSynonyms: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.DispenseTrait.ItemNameSynonym>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.DispenseTrait.DispensableItem?>.supportedUnits: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.DispenseTrait.Unit>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.DispenseTrait.DispensableItem?>.defaultPortion: com.google.home.automation.TypedExpression<com.google.home.google.DispenseTrait.Amount> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.DispenseTrait.DispensableItem): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.DispenseTrait.DispensableItem { /* compiled code */ }
        }

        public final val itemName: kotlin.String /* compiled code */

        public final val itemNameSynonyms: kotlin.collections.List<com.google.home.google.DispenseTrait.ItemNameSynonym> /* compiled code */

        public final val supportedUnits: kotlin.collections.List<com.google.home.google.DispenseTrait.Unit> /* compiled code */

        public final val defaultPortion: com.google.home.google.DispenseTrait.Amount /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.DispenseTrait.DispensableItem.StructFields> {
            @androidx.annotation.NonNull itemName,

            @androidx.annotation.NonNull itemNameSynonyms,

            @androidx.annotation.NonNull supportedUnits,

            @androidx.annotation.NonNull defaultPortion;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class PresetNameSynonym public constructor(synonyms: kotlin.collections.List<kotlin.String> = COMPILED_CODE, lang: kotlin.String = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.DispenseTrait.PresetNameSynonym>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.DispenseTrait.PresetNameSynonym?>.synonyms: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.DispenseTrait.PresetNameSynonym?>.lang: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.DispenseTrait.PresetNameSynonym): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.DispenseTrait.PresetNameSynonym { /* compiled code */ }
        }

        public final val synonyms: kotlin.collections.List<kotlin.String> /* compiled code */

        public final val lang: kotlin.String /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.DispenseTrait.PresetNameSynonym.StructFields> {
            @androidx.annotation.NonNull synonyms,

            @androidx.annotation.NonNull lang;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class Preset public constructor(presetName: kotlin.String = COMPILED_CODE, presetNameSynonyms: kotlin.collections.List<com.google.home.google.DispenseTrait.PresetNameSynonym> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.DispenseTrait.Preset>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.DispenseTrait.Preset?>.presetName: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.DispenseTrait.Preset?>.presetNameSynonyms: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.DispenseTrait.PresetNameSynonym>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.DispenseTrait.Preset): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.DispenseTrait.Preset { /* compiled code */ }
        }

        public final val presetName: kotlin.String /* compiled code */

        public final val presetNameSynonyms: kotlin.collections.List<com.google.home.google.DispenseTrait.PresetNameSynonym> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.DispenseTrait.Preset.StructFields> {
            @androidx.annotation.NonNull presetName,

            @androidx.annotation.NonNull presetNameSynonyms;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class DispenseItem public constructor(itemName: kotlin.String = COMPILED_CODE, amountRemaining: com.google.home.google.DispenseTrait.Amount = COMPILED_CODE, amountLastDispensed: com.google.home.google.DispenseTrait.Amount = COMPILED_CODE, isCurrentlyDispensing: kotlin.Boolean = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.DispenseTrait.DispenseItem>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.DispenseTrait.DispenseItem?>.itemName: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.DispenseTrait.DispenseItem?>.amountRemaining: com.google.home.automation.TypedExpression<com.google.home.google.DispenseTrait.Amount> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.DispenseTrait.DispenseItem?>.amountLastDispensed: com.google.home.automation.TypedExpression<com.google.home.google.DispenseTrait.Amount> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.DispenseTrait.DispenseItem?>.isCurrentlyDispensing: com.google.home.automation.TypedExpression<kotlin.Boolean> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.DispenseTrait.DispenseItem): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.DispenseTrait.DispenseItem { /* compiled code */ }
        }

        public final val itemName: kotlin.String /* compiled code */

        public final val amountRemaining: com.google.home.google.DispenseTrait.Amount /* compiled code */

        public final val amountLastDispensed: com.google.home.google.DispenseTrait.Amount /* compiled code */

        public final val isCurrentlyDispensing: kotlin.Boolean /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.DispenseTrait.DispenseItem.StructFields> {
            @androidx.annotation.NonNull itemName,

            @androidx.annotation.NonNull amountRemaining,

            @androidx.annotation.NonNull amountLastDispensed,

            @androidx.annotation.NonNull isCurrentlyDispensing;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.DispenseTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.DispenseTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.DispenseTrait.Attributes { /* compiled code */ }
        }

        public abstract val supportedDispenseItems: kotlin.collections.List<com.google.home.google.DispenseTrait.DispensableItem>?

        public abstract val supportedDispensePresets: kotlin.collections.List<com.google.home.google.DispenseTrait.Preset>?

        public abstract val dispenseItems: kotlin.collections.List<com.google.home.google.DispenseTrait.DispenseItem>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(supportedDispenseItems: kotlin.collections.List<com.google.home.google.DispenseTrait.DispensableItem>? = COMPILED_CODE, supportedDispensePresets: kotlin.collections.List<com.google.home.google.DispenseTrait.Preset>? = COMPILED_CODE, dispenseItems: kotlin.collections.List<com.google.home.google.DispenseTrait.DispenseItem>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.DispenseTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.DispenseTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.DispenseTrait.Attributes) { /* compiled code */ }

        public open val supportedDispenseItems: kotlin.collections.List<com.google.home.google.DispenseTrait.DispensableItem>? /* compiled code */

        public open val supportedDispensePresets: kotlin.collections.List<com.google.home.google.DispenseTrait.Preset>? /* compiled code */

        public open val dispenseItems: kotlin.collections.List<com.google.home.google.DispenseTrait.DispenseItem>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(supportedDispenseItems: kotlin.collections.List<com.google.home.google.DispenseTrait.DispensableItem>? = COMPILED_CODE, supportedDispensePresets: kotlin.collections.List<com.google.home.google.DispenseTrait.Preset>? = COMPILED_CODE, dispenseItems: kotlin.collections.List<com.google.home.google.DispenseTrait.DispenseItem>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.google.DispenseTrait.AttributesImpl { /* compiled code */ }
    }

    public object DispenseCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(item: kotlin.String = COMPILED_CODE, amount: kotlin.Float = COMPILED_CODE, unit: com.google.home.google.DispenseTrait.Unit = COMPILED_CODE, presetName: kotlin.String = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.DispenseTrait.DispenseCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.DispenseTrait.DispenseCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.DispenseTrait.DispenseCommand.Request { /* compiled code */ }
            }

            public final val item: kotlin.String /* compiled code */

            public final val amount: kotlin.Float /* compiled code */

            public final val unit: com.google.home.google.DispenseTrait.Unit /* compiled code */

            public final val presetName: kotlin.String /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.DispenseTrait.DispenseCommand.Request.CommandFields> {
                @androidx.annotation.NonNull item,

                @androidx.annotation.NonNull amount,

                @androidx.annotation.NonNull unit,

                @androidx.annotation.NonNull presetName;

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

        public final class Response public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.DispenseTrait.DispenseCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.DispenseTrait.DispenseCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.DispenseTrait.DispenseCommand.Response { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.DispenseTrait.DispenseCommand.Response.CommandFields> {
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

