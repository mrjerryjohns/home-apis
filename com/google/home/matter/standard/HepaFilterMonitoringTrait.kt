// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object HepaFilterMonitoringTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class ChangeIndicationEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.HepaFilterMonitoringTrait.ChangeIndicationEnum> {
        @androidx.annotation.NonNull OK,

        @androidx.annotation.NonNull Warning,

        @androidx.annotation.NonNull Critical,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.HepaFilterMonitoringTrait.ChangeIndicationEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class DegradationDirectionEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.HepaFilterMonitoringTrait.DegradationDirectionEnum> {
        @androidx.annotation.NonNull Up,

        @androidx.annotation.NonNull Down,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.HepaFilterMonitoringTrait.DegradationDirectionEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class ProductIdentifierTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.HepaFilterMonitoringTrait.ProductIdentifierTypeEnum> {
        @androidx.annotation.NonNull UPC,

        @androidx.annotation.NonNull GTIN8,

        @androidx.annotation.NonNull EAN,

        @androidx.annotation.NonNull GTIN14,

        @androidx.annotation.NonNull OEM,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.HepaFilterMonitoringTrait.ProductIdentifierTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(condition: kotlin.Boolean = COMPILED_CODE, warning: kotlin.Boolean = COMPILED_CODE, replacementProductList: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.HepaFilterMonitoringTrait.Feature> {
            private const final val CONDITION_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val WARNING_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            private const final val REPLACEMENT_PRODUCT_LIST_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.HepaFilterMonitoringTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.HepaFilterMonitoringTrait.Feature { /* compiled code */ }
        }

        public final val condition: kotlin.Boolean /* compiled code */

        public final val warning: kotlin.Boolean /* compiled code */

        public final val replacementProductList: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component2(): kotlin.Boolean { /* compiled code */ }

        public final operator fun component3(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(condition: kotlin.Boolean = COMPILED_CODE, warning: kotlin.Boolean = COMPILED_CODE, replacementProductList: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.HepaFilterMonitoringTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class ReplacementProductStruct public constructor(productIdentifierType: com.google.home.matter.standard.HepaFilterMonitoringTrait.ProductIdentifierTypeEnum = COMPILED_CODE, productIdentifierValue: kotlin.String = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.HepaFilterMonitoringTrait.ReplacementProductStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.HepaFilterMonitoringTrait.ReplacementProductStruct?>.productIdentifierType: com.google.home.automation.TypedExpression<com.google.home.matter.standard.HepaFilterMonitoringTrait.ProductIdentifierTypeEnum> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.HepaFilterMonitoringTrait.ReplacementProductStruct?>.productIdentifierValue: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.HepaFilterMonitoringTrait.ReplacementProductStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.HepaFilterMonitoringTrait.ReplacementProductStruct { /* compiled code */ }
        }

        public final val productIdentifierType: com.google.home.matter.standard.HepaFilterMonitoringTrait.ProductIdentifierTypeEnum /* compiled code */

        public final val productIdentifierValue: kotlin.String /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.HepaFilterMonitoringTrait.ReplacementProductStruct.StructFields> {
            @androidx.annotation.NonNull productIdentifierType,

            @androidx.annotation.NonNull productIdentifierValue;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.HepaFilterMonitoringTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.HepaFilterMonitoringTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.HepaFilterMonitoringTrait.Attributes { /* compiled code */ }
        }

        public abstract val condition: kotlin.UByte?

        public abstract val degradationDirection: com.google.home.matter.standard.HepaFilterMonitoringTrait.DegradationDirectionEnum?

        public abstract val changeIndication: com.google.home.matter.standard.HepaFilterMonitoringTrait.ChangeIndicationEnum?

        public abstract val inPlaceIndicator: kotlin.Boolean?

        public abstract val lastChangedTime: kotlin.UInt?

        public abstract val replacementProductList: kotlin.collections.List<com.google.home.matter.standard.HepaFilterMonitoringTrait.ReplacementProductStruct>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.HepaFilterMonitoringTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(condition: kotlin.UByte? = COMPILED_CODE, degradationDirection: com.google.home.matter.standard.HepaFilterMonitoringTrait.DegradationDirectionEnum? = COMPILED_CODE, changeIndication: com.google.home.matter.standard.HepaFilterMonitoringTrait.ChangeIndicationEnum? = COMPILED_CODE, inPlaceIndicator: kotlin.Boolean? = COMPILED_CODE, lastChangedTime: kotlin.UInt? = COMPILED_CODE, replacementProductList: kotlin.collections.List<com.google.home.matter.standard.HepaFilterMonitoringTrait.ReplacementProductStruct>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> =
        COMPILED_CODE, featureMap: com.google.home.matter.standard.HepaFilterMonitoringTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.HepaFilterMonitoringTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.HepaFilterMonitoringTrait.Attributes, com.google.home.matter.standard.HepaFilterMonitoringTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.HepaFilterMonitoringTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.HepaFilterMonitoringTrait.Attributes) { /* compiled code */ }

        public open val condition: kotlin.UByte? /* compiled code */

        public open val degradationDirection: com.google.home.matter.standard.HepaFilterMonitoringTrait.DegradationDirectionEnum? /* compiled code */

        public open val changeIndication: com.google.home.matter.standard.HepaFilterMonitoringTrait.ChangeIndicationEnum? /* compiled code */

        public open val inPlaceIndicator: kotlin.Boolean? /* compiled code */

        public open val lastChangedTime: kotlin.UInt? /* compiled code */

        public open val replacementProductList: kotlin.collections.List<com.google.home.matter.standard.HepaFilterMonitoringTrait.ReplacementProductStruct>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.HepaFilterMonitoringTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.HepaFilterMonitoringTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.HepaFilterMonitoringTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(condition: kotlin.UByte? = COMPILED_CODE, degradationDirection: com.google.home.matter.standard.HepaFilterMonitoringTrait.DegradationDirectionEnum? = COMPILED_CODE, changeIndication: com.google.home.matter.standard.HepaFilterMonitoringTrait.ChangeIndicationEnum? = COMPILED_CODE, inPlaceIndicator: kotlin.Boolean? = COMPILED_CODE, lastChangedTime: kotlin.UInt? = COMPILED_CODE, replacementProductList: kotlin.collections.List<com.google.home.matter.standard.HepaFilterMonitoringTrait.ReplacementProductStruct>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap:
            com.google.home.matter.standard.HepaFilterMonitoringTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.HepaFilterMonitoringTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.HepaFilterMonitoringTrait.Attributes) : com.google.home.matter.standard.HepaFilterMonitoringTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.HepaFilterMonitoringTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.HepaFilterMonitoringTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.HepaFilterMonitoringTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _lastChangedTime: kotlin.UInt? /* compiled code */

        internal final var _isLastChangedTimeSet: kotlin.Boolean /* compiled code */

        public open val lastChangedTime: kotlin.UInt? /* compiled code */
            public open get

        public final fun setLastChangedTime(value: kotlin.UInt?): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public object ResetConditionCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.HepaFilterMonitoringTrait.ResetConditionCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.HepaFilterMonitoringTrait.ResetConditionCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.HepaFilterMonitoringTrait.ResetConditionCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.HepaFilterMonitoringTrait.ResetConditionCommand.Request.CommandFields> {
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
