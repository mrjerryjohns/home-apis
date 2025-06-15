// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public object CookTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class CookingMode private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.CookTrait.CookingMode> {
        @androidx.annotation.NonNull UnknownCookingMode,

        @androidx.annotation.NonNull Bake,

        @androidx.annotation.NonNull Beat,

        @androidx.annotation.NonNull Blend,

        @androidx.annotation.NonNull Boil,

        @androidx.annotation.NonNull Brew,

        @androidx.annotation.NonNull Broil,

        @androidx.annotation.NonNull ConvectionBake,

        @androidx.annotation.NonNull Cook,

        @androidx.annotation.NonNull Defrost,

        @androidx.annotation.NonNull Dehydrate,

        @androidx.annotation.NonNull Ferment,

        @androidx.annotation.NonNull Fry,

        @androidx.annotation.NonNull Grill,

        @androidx.annotation.NonNull Knead,

        @androidx.annotation.NonNull Microwave,

        @androidx.annotation.NonNull Mix,

        @androidx.annotation.NonNull PressureCook,

        @androidx.annotation.NonNull Puree,

        @androidx.annotation.NonNull Roast,

        @androidx.annotation.NonNull Saute,

        @androidx.annotation.NonNull SlowCook,

        @androidx.annotation.NonNull SousVide,

        @androidx.annotation.NonNull Steam,

        @androidx.annotation.NonNull Stew,

        @androidx.annotation.NonNull Stir,

        @androidx.annotation.NonNull Warm,

        @androidx.annotation.NonNull Whip,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.CookTrait.CookingMode> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class Unit private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.google.CookTrait.Unit> {
        @androidx.annotation.NonNull UnknownUnits,

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
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.google.CookTrait.Unit> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final class FoodSynonym public constructor(synonym: kotlin.collections.List<kotlin.String> = COMPILED_CODE, lang: kotlin.String = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.CookTrait.FoodSynonym>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CookTrait.FoodSynonym?>.synonym: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.String>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CookTrait.FoodSynonym?>.lang: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.CookTrait.FoodSynonym): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.CookTrait.FoodSynonym { /* compiled code */ }
        }

        public final val synonym: kotlin.collections.List<kotlin.String> /* compiled code */

        public final val lang: kotlin.String /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.CookTrait.FoodSynonym.StructFields> {
            @androidx.annotation.NonNull synonym,

            @androidx.annotation.NonNull lang;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public final class FoodPreset public constructor(foodPresetName: kotlin.String = COMPILED_CODE, supportedUnits: kotlin.collections.List<com.google.home.google.CookTrait.Unit> = COMPILED_CODE, foodSynonyms: kotlin.collections.List<com.google.home.google.CookTrait.FoodSynonym> = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.CookTrait.FoodPreset>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CookTrait.FoodPreset?>.foodPresetName: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CookTrait.FoodPreset?>.supportedUnits: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.CookTrait.Unit>> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.google.CookTrait.FoodPreset?>.foodSynonyms: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.google.CookTrait.FoodSynonym>> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.CookTrait.FoodPreset): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.CookTrait.FoodPreset { /* compiled code */ }
        }

        public final val foodPresetName: kotlin.String /* compiled code */

        public final val supportedUnits: kotlin.collections.List<com.google.home.google.CookTrait.Unit> /* compiled code */

        public final val foodSynonyms: kotlin.collections.List<com.google.home.google.CookTrait.FoodSynonym> /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.CookTrait.FoodPreset.StructFields> {
            @androidx.annotation.NonNull foodPresetName,

            @androidx.annotation.NonNull supportedUnits,

            @androidx.annotation.NonNull foodSynonyms;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.CookTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.CookTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.CookTrait.Attributes { /* compiled code */ }
        }

        public abstract val supportedCookingModes: kotlin.collections.List<com.google.home.google.CookTrait.CookingMode>?

        public abstract val foodPresets: kotlin.collections.List<com.google.home.google.CookTrait.FoodPreset>?

        public abstract val currentCookingMode: com.google.home.google.CookTrait.CookingMode?

        public abstract val currentFoodPreset: kotlin.String?

        public abstract val currentFoodQuantity: kotlin.Float?

        public abstract val currentFoodUnit: com.google.home.google.CookTrait.Unit?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(supportedCookingModes: kotlin.collections.List<com.google.home.google.CookTrait.CookingMode>? = COMPILED_CODE, foodPresets: kotlin.collections.List<com.google.home.google.CookTrait.FoodPreset>? = COMPILED_CODE, currentCookingMode: com.google.home.google.CookTrait.CookingMode? = COMPILED_CODE, currentFoodPreset: kotlin.String? = COMPILED_CODE, currentFoodQuantity: kotlin.Float? = COMPILED_CODE, currentFoodUnit: com.google.home.google.CookTrait.Unit? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE,
        clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.google.CookTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.google.CookTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.google.CookTrait.Attributes) { /* compiled code */ }

        public open val supportedCookingModes: kotlin.collections.List<com.google.home.google.CookTrait.CookingMode>? /* compiled code */

        public open val foodPresets: kotlin.collections.List<com.google.home.google.CookTrait.FoodPreset>? /* compiled code */

        public open val currentCookingMode: com.google.home.google.CookTrait.CookingMode? /* compiled code */

        public open val currentFoodPreset: kotlin.String? /* compiled code */

        public open val currentFoodQuantity: kotlin.Float? /* compiled code */

        public open val currentFoodUnit: com.google.home.google.CookTrait.Unit? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(supportedCookingModes: kotlin.collections.List<com.google.home.google.CookTrait.CookingMode>? = COMPILED_CODE, foodPresets: kotlin.collections.List<com.google.home.google.CookTrait.FoodPreset>? = COMPILED_CODE, currentCookingMode: com.google.home.google.CookTrait.CookingMode? = COMPILED_CODE, currentFoodPreset: kotlin.String? = COMPILED_CODE, currentFoodQuantity: kotlin.Float? = COMPILED_CODE, currentFoodUnit: com.google.home.google.CookTrait.Unit? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort
            = COMPILED_CODE): com.google.home.google.CookTrait.AttributesImpl { /* compiled code */ }
    }

    public object CookCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(start: kotlin.Boolean = COMPILED_CODE, cookingMode: com.google.home.google.CookTrait.CookingMode = COMPILED_CODE, foodPreset: kotlin.String = COMPILED_CODE, quantity: kotlin.Float = COMPILED_CODE, unit: com.google.home.google.CookTrait.Unit = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.CookTrait.CookCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.CookTrait.CookCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.CookTrait.CookCommand.Request { /* compiled code */ }
            }

            public final val start: kotlin.Boolean /* compiled code */

            public final val cookingMode: com.google.home.google.CookTrait.CookingMode /* compiled code */

            public final val foodPreset: kotlin.String /* compiled code */

            public final val quantity: kotlin.Float /* compiled code */

            public final val unit: com.google.home.google.CookTrait.Unit /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.CookTrait.CookCommand.Request.CommandFields> {
                @androidx.annotation.NonNull start,

                @androidx.annotation.NonNull cookingMode,

                @androidx.annotation.NonNull foodPreset,

                @androidx.annotation.NonNull quantity,

                @androidx.annotation.NonNull unit;

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
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.google.CookTrait.CookCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.google.CookTrait.CookCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.google.CookTrait.CookCommand.Response { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.google.CookTrait.CookCommand.Response.CommandFields> {
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
