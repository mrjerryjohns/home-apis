// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface GeneralCommissioning : com.google.home.matter.standard.GeneralCommissioningTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.Updatable<com.google.home.matter.standard.GeneralCommissioning, com.google.home.matter.standard.GeneralCommissioningTrait.MutableAttributes>, com.google.home.matter.standard.GeneralCommissioningCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.GeneralCommissioning> {
        public final val breadcrumb: com.google.home.automation.Attribute<kotlin.ULong?> /* compiled code */
            public final get

        public final val basicCommissioningInfo: com.google.home.automation.Attribute<com.google.home.matter.standard.GeneralCommissioningTrait.BasicCommissioningInfo?> /* compiled code */
            public final get

        public final val regulatoryConfig: com.google.home.automation.Attribute<com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum?> /* compiled code */
            public final get

        public final val locationCapability: com.google.home.automation.Attribute<com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum?> /* compiled code */
            public final get

        public final val supportsConcurrentConnection: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val tcAcceptedVersion: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val tcMinRequiredVersion: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val tcAcknowledgements: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val tcAcknowledgementsRequired: com.google.home.automation.Attribute<kotlin.Boolean?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.GeneralCommissioningTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralCommissioning?>.breadcrumb: com.google.home.automation.TypedExpression<kotlin.ULong?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralCommissioning?>.basicCommissioningInfo: com.google.home.automation.TypedExpression<com.google.home.matter.standard.GeneralCommissioningTrait.BasicCommissioningInfo?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralCommissioning?>.regulatoryConfig: com.google.home.automation.TypedExpression<com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralCommissioning?>.locationCapability: com.google.home.automation.TypedExpression<com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralCommissioning?>.supportsConcurrentConnection: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralCommissioning?>.tcAcceptedVersion: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralCommissioning?>.tcMinRequiredVersion: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralCommissioning?>.tcAcknowledgements: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralCommissioning?>.tcAcknowledgementsRequired: com.google.home.automation.TypedExpression<kotlin.Boolean?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralCommissioning?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralCommissioning?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralCommissioning?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralCommissioning?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.GeneralCommissioningTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.GeneralCommissioning?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun @receiver:androidx.annotation.NonNull com.google.home.automation.Updater<com.google.home.matter.standard.GeneralCommissioning>.setBreadcrumb(value: kotlin.ULong): kotlin.Unit { /* compiled code */ }

        public final fun armFailSafe(expiryLengthSeconds: kotlin.UShort, breadcrumb: kotlin.ULong): com.google.home.automation.Command { /* compiled code */ }

        public final fun setRegulatoryConfig(newRegulatoryConfig: com.google.home.matter.standard.GeneralCommissioningTrait.RegulatoryLocationTypeEnum, countryCode: kotlin.String, breadcrumb: kotlin.ULong): com.google.home.automation.Command { /* compiled code */ }

        public final fun commissioningComplete(): com.google.home.automation.Command { /* compiled code */ }

        public final fun setTcAcknowledgements(tcVersion: kotlin.UShort, tcUserResponse: kotlin.UShort): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.GeneralCommissioning> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.GeneralCommissioning.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.GeneralCommissioning.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.GeneralCommissioning.Attribute> {
        @androidx.annotation.NonNull breadcrumb,

        @androidx.annotation.NonNull basicCommissioningInfo,

        @androidx.annotation.NonNull regulatoryConfig,

        @androidx.annotation.NonNull locationCapability,

        @androidx.annotation.NonNull supportsConcurrentConnection,

        @androidx.annotation.NonNull tcAcceptedVersion,

        @androidx.annotation.NonNull tcMinRequiredVersion,

        @androidx.annotation.NonNull tcAcknowledgements,

        @androidx.annotation.NonNull tcAcknowledgementsRequired,

        @androidx.annotation.NonNull generatedCommandList,

        @androidx.annotation.NonNull acceptedCommandList,

        @androidx.annotation.NonNull attributeList,

        @androidx.annotation.NonNull featureMap,

        @androidx.annotation.NonNull clusterRevision;

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.GeneralCommissioning.Command> {
        @androidx.annotation.NonNull ArmFailSafe,

        @androidx.annotation.NonNull SetRegulatoryConfig,

        @androidx.annotation.NonNull CommissioningComplete,

        @androidx.annotation.NonNull SetTcAcknowledgements;

        public final val tag: kotlin.UInt /* compiled code */
    }
}

