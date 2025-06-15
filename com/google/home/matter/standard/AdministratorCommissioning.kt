// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface AdministratorCommissioning : com.google.home.matter.standard.AdministratorCommissioningTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.matter.standard.AdministratorCommissioningCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.AdministratorCommissioning> {
        public final val windowStatus: com.google.home.automation.Attribute<com.google.home.matter.standard.AdministratorCommissioningTrait.CommissioningWindowStatusEnum?> /* compiled code */
            public final get

        public final val adminFabricIndex: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val adminVendorId: com.google.home.automation.Attribute<kotlin.UShort?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<com.google.home.matter.standard.AdministratorCommissioningTrait.Feature> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AdministratorCommissioning?>.windowStatus: com.google.home.automation.TypedExpression<com.google.home.matter.standard.AdministratorCommissioningTrait.CommissioningWindowStatusEnum?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AdministratorCommissioning?>.adminFabricIndex: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AdministratorCommissioning?>.adminVendorId: com.google.home.automation.TypedExpression<kotlin.UShort?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AdministratorCommissioning?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AdministratorCommissioning?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AdministratorCommissioning?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AdministratorCommissioning?>.featureMap: com.google.home.automation.TypedExpression<com.google.home.matter.standard.AdministratorCommissioningTrait.Feature> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.AdministratorCommissioning?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun openCommissioningWindow(commissioningTimeout: kotlin.UShort, pakePasscodeVerifier: kotlin.ByteArray, discriminator: kotlin.UShort, iterations: kotlin.UInt, salt: kotlin.ByteArray): com.google.home.automation.Command { /* compiled code */ }

        public final fun openBasicCommissioningWindow(commissioningTimeout: kotlin.UShort): com.google.home.automation.Command { /* compiled code */ }

        public final fun revokeCommissioning(): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.AdministratorCommissioning> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.AdministratorCommissioning.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.AdministratorCommissioning.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.AdministratorCommissioning.Attribute> {
        @androidx.annotation.NonNull windowStatus,

        @androidx.annotation.NonNull adminFabricIndex,

        @androidx.annotation.NonNull adminVendorId,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.AdministratorCommissioning.Command> {
        @androidx.annotation.NonNull OpenCommissioningWindow,

        @androidx.annotation.NonNull OpenBasicCommissioningWindow,

        @androidx.annotation.NonNull RevokeCommissioning;

        public final val tag: kotlin.UInt /* compiled code */
    }
}
