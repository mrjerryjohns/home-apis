// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object ApplicationBasicTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class ApplicationStatusEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.ApplicationBasicTrait.ApplicationStatusEnum> {
        @androidx.annotation.NonNull Stopped,

        @androidx.annotation.NonNull ActiveVisibleFocus,

        @androidx.annotation.NonNull ActiveHidden,

        @androidx.annotation.NonNull ActiveVisibleNotFocus,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.ApplicationBasicTrait.ApplicationStatusEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final class ApplicationStruct public constructor(catalogVendorId: kotlin.UShort = COMPILED_CODE, applicationId: kotlin.String = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ApplicationBasicTrait.ApplicationStruct>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ApplicationBasicTrait.ApplicationStruct?>.catalogVendorId: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.ApplicationBasicTrait.ApplicationStruct?>.applicationId: com.google.home.automation.TypedExpression<kotlin.String> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ApplicationBasicTrait.ApplicationStruct): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ApplicationBasicTrait.ApplicationStruct { /* compiled code */ }
        }

        public final val catalogVendorId: kotlin.UShort /* compiled code */

        public final val applicationId: kotlin.String /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.ApplicationBasicTrait.ApplicationStruct.StructFields> {
            @androidx.annotation.NonNull catalogVendorId,

            @androidx.annotation.NonNull applicationId;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.ApplicationBasicTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.ApplicationBasicTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.ApplicationBasicTrait.Attributes { /* compiled code */ }
        }

        public abstract val vendorName: kotlin.String?

        public abstract val vendorId: kotlin.UShort?

        public abstract val applicationName: kotlin.String?

        public abstract val productId: kotlin.UShort?

        public abstract val application: com.google.home.matter.standard.ApplicationBasicTrait.ApplicationStruct?

        public abstract val status: com.google.home.matter.standard.ApplicationBasicTrait.ApplicationStatusEnum?

        public abstract val applicationVersion: kotlin.String?

        public abstract val allowedVendorList: kotlin.collections.List<kotlin.UShort>?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: kotlin.UInt

        public abstract val clusterRevision: kotlin.UShort
    }

        public open class AttributesImpl public constructor(vendorName: kotlin.String? = COMPILED_CODE, vendorId: kotlin.UShort? = COMPILED_CODE, applicationName: kotlin.String? = COMPILED_CODE, productId: kotlin.UShort? = COMPILED_CODE, application: com.google.home.matter.standard.ApplicationBasicTrait.ApplicationStruct? = COMPILED_CODE, status: com.google.home.matter.standard.ApplicationBasicTrait.ApplicationStatusEnum? = COMPILED_CODE, applicationVersion: kotlin.String? = COMPILED_CODE, allowedVendorList: kotlin.collections.List<kotlin.UShort>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE,
        featureMap: kotlin.UInt = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.ApplicationBasicTrait.Attributes {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.ApplicationBasicTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.ApplicationBasicTrait.Attributes) { /* compiled code */ }

        public open val vendorName: kotlin.String? /* compiled code */

        public open val vendorId: kotlin.UShort? /* compiled code */

        public open val applicationName: kotlin.String? /* compiled code */

        public open val productId: kotlin.UShort? /* compiled code */

        public open val application: com.google.home.matter.standard.ApplicationBasicTrait.ApplicationStruct? /* compiled code */

        public open val status: com.google.home.matter.standard.ApplicationBasicTrait.ApplicationStatusEnum? /* compiled code */

        public open val applicationVersion: kotlin.String? /* compiled code */

        public open val allowedVendorList: kotlin.collections.List<kotlin.UShort>? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: kotlin.UInt /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

                public final fun copy(vendorName: kotlin.String? = COMPILED_CODE, vendorId: kotlin.UShort? = COMPILED_CODE, applicationName: kotlin.String? = COMPILED_CODE, productId: kotlin.UShort? = COMPILED_CODE, application: com.google.home.matter.standard.ApplicationBasicTrait.ApplicationStruct? = COMPILED_CODE, status: com.google.home.matter.standard.ApplicationBasicTrait.ApplicationStatusEnum? = COMPILED_CODE, applicationVersion: kotlin.String? = COMPILED_CODE, allowedVendorList: kotlin.collections.List<kotlin.UShort>? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: kotlin.UInt =
            COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.ApplicationBasicTrait.AttributesImpl { /* compiled code */ }
    }
}
