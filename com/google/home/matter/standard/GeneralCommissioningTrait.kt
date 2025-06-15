// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public object GeneralCommissioningTrait {
    public final val Id: com.google.home.matter.serialization.ClusterId /* compiled code */

    public final enum class CommissioningErrorEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningErrorEnum> {
        @androidx.annotation.NonNull OK,

        @androidx.annotation.NonNull ValueOutsideRange,

        @androidx.annotation.NonNull InvalidAuthentication,

        @androidx.annotation.NonNull NoFailSafe,

        @androidx.annotation.NonNull BusyWithOtherAdmin,

        @androidx.annotation.NonNull RequiredTCNotAccepted,

        @androidx.annotation.NonNull TCAcknowledgementsNotReceived,

        @androidx.annotation.NonNull TCMinVersionNotMet,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningErrorEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final enum class RegulatoryLocationTypeEnum private constructor(value: kotlin.ULong, traitId: kotlin.String = COMPILED_CODE, typeName: kotlin.String = COMPILED_CODE) : com.google.home.matter.serialization.ClusterEnum, kotlin.Enum<com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum> {
        @androidx.annotation.NonNull Indoor,

        @androidx.annotation.NonNull Outdoor,

        @androidx.annotation.NonNull IndoorOutdoor,

        @androidx.annotation.NonNull UnknownValue;

        public companion object {
            public final val Adapter: com.google.home.matter.serialization.EnumAdapter<com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum> /* compiled code */
        }

        public open val value: kotlin.ULong /* compiled code */

        public open val traitId: kotlin.String /* compiled code */

        public open val typeName: kotlin.String /* compiled code */
    }

    public final data class Feature public constructor(termsAndConditions: kotlin.Boolean = COMPILED_CODE) : com.google.home.matter.serialization.ClusterBitmap {
        public companion object Adapter : com.google.home.matter.serialization.BitmapAdapter<com.google.home.matter.standard.GeneralCommissioningTrait.Feature> {
            private const final val TERMS_AND_CONDITIONS_FLAG: kotlin.ULong = COMPILED_CODE /* compiled code */

            public open fun toRaw(value: com.google.home.matter.standard.GeneralCommissioningTrait.Feature): com.google.home.matter.serialization.Bitmap { /* compiled code */ }

            public open fun toRuntime(value: com.google.home.matter.serialization.Bitmap): com.google.home.matter.standard.GeneralCommissioningTrait.Feature { /* compiled code */ }
        }

        public final val termsAndConditions: kotlin.Boolean /* compiled code */

        public open fun toRaw(): kotlin.ULong { /* compiled code */ }

        public final operator fun component1(): kotlin.Boolean { /* compiled code */ }

        public final fun copy(termsAndConditions: kotlin.Boolean = COMPILED_CODE): com.google.home.matter.standard.GeneralCommissioningTrait.Feature { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public final class BasicCommissioningInfo public constructor(failSafeExpiryLengthSeconds: kotlin.UShort = COMPILED_CODE, maxCumulativeFailsafeSeconds: kotlin.UShort = COMPILED_CODE) {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GeneralCommissioningTrait.BasicCommissioningInfo>, com.google.home.StructDescriptor {
            @field:com.google.android.gms.common.internal.ShowFirstParty public open val fields: kotlin.collections.Map<kotlin.UInt /* from: com.google.home.TagId */, com.google.home.Field> /* from: com.google.home.DescriptorMap */ /* compiled code */

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralCommissioningTrait.BasicCommissioningInfo?>.failSafeExpiryLengthSeconds: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralCommissioningTrait.BasicCommissioningInfo?>.maxCumulativeFailsafeSeconds: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
                public final get

            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GeneralCommissioningTrait.BasicCommissioningInfo): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GeneralCommissioningTrait.BasicCommissioningInfo { /* compiled code */ }
        }

        public final val failSafeExpiryLengthSeconds: kotlin.UShort /* compiled code */

        public final val maxCumulativeFailsafeSeconds: kotlin.UShort /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty public final enum class StructFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GeneralCommissioningTrait.BasicCommissioningInfo.StructFields> {
            @androidx.annotation.NonNull failSafeExpiryLengthSeconds,

            @androidx.annotation.NonNull maxCumulativeFailsafeSeconds;

            public open val fieldName: kotlin.String /* compiled code */

            public open val tag: kotlin.UInt /* compiled code */

            public open val typeName: kotlin.String /* compiled code */

            public open val typeEnum: com.google.home.Type /* compiled code */

            public open val descriptor: com.google.home.Descriptor /* compiled code */

            public final val isNullable: kotlin.Boolean /* compiled code */
        }
    }

    public interface Attributes {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GeneralCommissioningTrait.Attributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GeneralCommissioningTrait.Attributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GeneralCommissioningTrait.Attributes { /* compiled code */ }
        }

        public abstract val breadcrumb: kotlin.ULong?

        public abstract val basicCommissioningInfo: com.google.home.matter.standard.GeneralCommissioningTrait.BasicCommissioningInfo?

        public abstract val regulatoryConfig: com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum?

        public abstract val locationCapability: com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum?

        public abstract val supportsConcurrentConnection: kotlin.Boolean?

        public abstract val tcAcceptedVersion: kotlin.UShort?

        public abstract val tcMinRequiredVersion: kotlin.UShort?

        public abstract val tcAcknowledgements: kotlin.UShort?

        public abstract val tcAcknowledgementsRequired: kotlin.Boolean?

        public abstract val generatedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val acceptedCommandList: kotlin.collections.List<kotlin.UInt>

        public abstract val attributeList: kotlin.collections.List<kotlin.UInt>

        public abstract val featureMap: com.google.home.matter.standard.GeneralCommissioningTrait.Feature

        public abstract val clusterRevision: kotlin.UShort
    }

    public open class AttributesImpl public constructor(breadcrumb: kotlin.ULong? = COMPILED_CODE, basicCommissioningInfo: com.google.home.matter.standard.GeneralCommissioningTrait.BasicCommissioningInfo? = COMPILED_CODE, regulatoryConfig: com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum? = COMPILED_CODE, locationCapability: com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum? = COMPILED_CODE, supportsConcurrentConnection: kotlin.Boolean? = COMPILED_CODE, tcAcceptedVersion: kotlin.UShort? = COMPILED_CODE, tcMinRequiredVersion: kotlin.UShort? = COMPILED_CODE, tcAcknowledgements: kotlin.UShort? = COMPILED_CODE, tcAcknowledgementsRequired: kotlin.Boolean? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.GeneralCommissioningTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE) : com.google.home.matter.standard.GeneralCommissioningTrait.Attributes, com.google.home.matter.serialization.CanMutate<com.google.home.matter.standard.GeneralCommissioningTrait.Attributes, com.google.home.matter.standard.GeneralCommissioningTrait.MutableAttributes> {
        public companion object {
            public final val Adapter: com.google.home.matter.standard.GeneralCommissioningTrait.Attributes.Adapter /* compiled code */
        }

        public constructor(other: com.google.home.matter.standard.GeneralCommissioningTrait.Attributes) { /* compiled code */ }

        public open val breadcrumb: kotlin.ULong? /* compiled code */

        public open val basicCommissioningInfo: com.google.home.matter.standard.GeneralCommissioningTrait.BasicCommissioningInfo? /* compiled code */

        public open val regulatoryConfig: com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum? /* compiled code */

        public open val locationCapability: com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum? /* compiled code */

        public open val supportsConcurrentConnection: kotlin.Boolean? /* compiled code */

        public open val tcAcceptedVersion: kotlin.UShort? /* compiled code */

        public open val tcMinRequiredVersion: kotlin.UShort? /* compiled code */

        public open val tcAcknowledgements: kotlin.UShort? /* compiled code */

        public open val tcAcknowledgementsRequired: kotlin.Boolean? /* compiled code */

        public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

        public open val featureMap: com.google.home.matter.standard.GeneralCommissioningTrait.Feature /* compiled code */

        public open val clusterRevision: kotlin.UShort /* compiled code */

        public open fun mutate(init: com.google.home.matter.standard.GeneralCommissioningTrait.MutableAttributes.() -> kotlin.Unit): com.google.home.matter.standard.GeneralCommissioningTrait.Attributes { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }

        public final fun copy(breadcrumb: kotlin.ULong? = COMPILED_CODE, basicCommissioningInfo: com.google.home.matter.standard.GeneralCommissioningTrait.BasicCommissioningInfo? = COMPILED_CODE, regulatoryConfig: com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum? = COMPILED_CODE, locationCapability: com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum? = COMPILED_CODE, supportsConcurrentConnection: kotlin.Boolean? = COMPILED_CODE, tcAcceptedVersion: kotlin.UShort? = COMPILED_CODE, tcMinRequiredVersion: kotlin.UShort? = COMPILED_CODE, tcAcknowledgements: kotlin.UShort? = COMPILED_CODE, tcAcknowledgementsRequired: kotlin.Boolean? = COMPILED_CODE, generatedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, acceptedCommandList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, attributeList: kotlin.collections.List<kotlin.UInt> = COMPILED_CODE, featureMap: com.google.home.matter.standard.GeneralCommissioningTrait.Feature = COMPILED_CODE, clusterRevision: kotlin.UShort = COMPILED_CODE): com.google.home.matter.standard.GeneralCommissioningTrait.AttributesImpl { /* compiled code */ }
    }

    public final class MutableAttributes public constructor(attributes: com.google.home.matter.standard.GeneralCommissioningTrait.Attributes) : com.google.home.matter.standard.GeneralCommissioningTrait.AttributesImpl {
        public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GeneralCommissioningTrait.MutableAttributes> {
            public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GeneralCommissioningTrait.MutableAttributes): kotlin.Unit { /* compiled code */ }

            public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GeneralCommissioningTrait.MutableAttributes { /* compiled code */ }
        }

        internal final var _breadcrumb: kotlin.ULong? /* compiled code */

        public open val breadcrumb: kotlin.ULong? /* compiled code */
            public open get

        public final fun setBreadcrumb(value: kotlin.ULong): kotlin.Unit { /* compiled code */ }

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public object ArmFailSafeCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(expiryLengthSeconds: kotlin.UShort = COMPILED_CODE, breadcrumb: kotlin.ULong = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GeneralCommissioningTrait.ArmFailSafeCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GeneralCommissioningTrait.ArmFailSafeCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GeneralCommissioningTrait.ArmFailSafeCommand.Request { /* compiled code */ }
            }

            public final val expiryLengthSeconds: kotlin.UShort /* compiled code */

            public final val breadcrumb: kotlin.ULong /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GeneralCommissioningTrait.ArmFailSafeCommand.Request.CommandFields> {
                @androidx.annotation.NonNull expiryLengthSeconds,

                @androidx.annotation.NonNull breadcrumb;

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

        public final class Response public constructor(errorCode: com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningErrorEnum = COMPILED_CODE, debugText: kotlin.String = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GeneralCommissioningTrait.ArmFailSafeCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GeneralCommissioningTrait.ArmFailSafeCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GeneralCommissioningTrait.ArmFailSafeCommand.Response { /* compiled code */ }
            }

            public final val errorCode: com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningErrorEnum /* compiled code */

            public final val debugText: kotlin.String /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GeneralCommissioningTrait.ArmFailSafeCommand.Response.CommandFields> {
                @androidx.annotation.NonNull errorCode,

                @androidx.annotation.NonNull debugText;

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

    public object SetRegulatoryConfigCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(newRegulatoryConfig: com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum = COMPILED_CODE, countryCode: kotlin.String = COMPILED_CODE, breadcrumb: kotlin.ULong = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GeneralCommissioningTrait.SetRegulatoryConfigCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GeneralCommissioningTrait.SetRegulatoryConfigCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GeneralCommissioningTrait.SetRegulatoryConfigCommand.Request { /* compiled code */ }
            }

            public final val newRegulatoryConfig: com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum /* compiled code */

            public final val countryCode: kotlin.String /* compiled code */

            public final val breadcrumb: kotlin.ULong /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GeneralCommissioningTrait.SetRegulatoryConfigCommand.Request.CommandFields> {
                @androidx.annotation.NonNull newRegulatoryConfig,

                @androidx.annotation.NonNull countryCode,

                @androidx.annotation.NonNull breadcrumb;

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

        public final class Response public constructor(errorCode: com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningErrorEnum = COMPILED_CODE, debugText: kotlin.String = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GeneralCommissioningTrait.SetRegulatoryConfigCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GeneralCommissioningTrait.SetRegulatoryConfigCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GeneralCommissioningTrait.SetRegulatoryConfigCommand.Response { /* compiled code */ }
            }

            public final val errorCode: com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningErrorEnum /* compiled code */

            public final val debugText: kotlin.String /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GeneralCommissioningTrait.SetRegulatoryConfigCommand.Response.CommandFields> {
                @androidx.annotation.NonNull errorCode,

                @androidx.annotation.NonNull debugText;

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

    public object CommissioningCompleteCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public final class Request public constructor() {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningCompleteCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningCompleteCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningCompleteCommand.Request { /* compiled code */ }
            }

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningCompleteCommand.Request.CommandFields> {
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

        public final class Response public constructor(errorCode: com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningErrorEnum = COMPILED_CODE, debugText: kotlin.String = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningCompleteCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningCompleteCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningCompleteCommand.Response { /* compiled code */ }
            }

            public final val errorCode: com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningErrorEnum /* compiled code */

            public final val debugText: kotlin.String /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningCompleteCommand.Response.CommandFields> {
                @androidx.annotation.NonNull errorCode,

                @androidx.annotation.NonNull debugText;

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

    public object SetTcAcknowledgementsCommand : com.google.home.CommandDescriptor {
        public final val requestId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        public open val commandId: kotlin.String /* compiled code */

        public final val responseId: com.google.home.matter.serialization.ScopedCommandId /* compiled code */

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getCommandRequestFieldByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public final class Request public constructor(tcVersion: kotlin.UShort = COMPILED_CODE, tcUserResponse: kotlin.UShort = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GeneralCommissioningTrait.SetTcAcknowledgementsCommand.Request> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GeneralCommissioningTrait.SetTcAcknowledgementsCommand.Request): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GeneralCommissioningTrait.SetTcAcknowledgementsCommand.Request { /* compiled code */ }
            }

            public final val tcVersion: kotlin.UShort /* compiled code */

            public final val tcUserResponse: kotlin.UShort /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GeneralCommissioningTrait.SetTcAcknowledgementsCommand.Request.CommandFields> {
                @androidx.annotation.NonNull tcVersion,

                @androidx.annotation.NonNull tcUserResponse;

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

        public final class Response public constructor(errorCode: com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningErrorEnum = COMPILED_CODE) {
            public companion object Adapter : com.google.home.matter.serialization.StructAdapter<com.google.home.matter.standard.GeneralCommissioningTrait.SetTcAcknowledgementsCommand.Response> {
                public open fun write(writer: com.google.home.matter.serialization.ClusterPayloadWriter, value: com.google.home.matter.standard.GeneralCommissioningTrait.SetTcAcknowledgementsCommand.Response): kotlin.Unit { /* compiled code */ }

                public open fun read(reader: com.google.home.matter.serialization.ClusterPayloadReader): com.google.home.matter.standard.GeneralCommissioningTrait.SetTcAcknowledgementsCommand.Response { /* compiled code */ }
            }

            public final val errorCode: com.google.home.matter.standard.GeneralCommissioningTrait.CommissioningErrorEnum /* compiled code */

            public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

            public open fun hashCode(): kotlin.Int { /* compiled code */ }

            public open fun toString(): kotlin.String { /* compiled code */ }

            @com.google.android.gms.common.internal.ShowFirstParty public final enum class CommandFields private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GeneralCommissioningTrait.SetTcAcknowledgementsCommand.Response.CommandFields> {
                @androidx.annotation.NonNull errorCode;

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

