// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface OperationalCredentials : com.google.home.matter.standard.OperationalCredentialsTrait.Attributes, com.google.home.matter.MatterTrait, com.google.home.matter.standard.OperationalCredentialsCommands {
    public companion object : com.google.home.TraitFactory<com.google.home.matter.standard.OperationalCredentials> {
        public final val nocs: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.OperationalCredentialsTrait.NocStruct>?> /* compiled code */
            public final get

        public final val fabrics: com.google.home.automation.Attribute<kotlin.collections.List<com.google.home.matter.standard.OperationalCredentialsTrait.FabricDescriptorStruct>?> /* compiled code */
            public final get

        public final val supportedFabrics: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val commissionedFabrics: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val trustedRootCertificates: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.ByteArray>?> /* compiled code */
            public final get

        public final val currentFabricIndex: com.google.home.automation.Attribute<kotlin.UByte?> /* compiled code */
            public final get

        public final val generatedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val acceptedCommandList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val attributeList: com.google.home.automation.Attribute<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val featureMap: com.google.home.automation.Attribute<kotlin.UInt> /* compiled code */
            public final get

        public final val clusterRevision: com.google.home.automation.Attribute<kotlin.UShort> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OperationalCredentials?>.nocs: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.OperationalCredentialsTrait.NocStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OperationalCredentials?>.fabrics: com.google.home.automation.TypedExpression<kotlin.collections.List<com.google.home.matter.standard.OperationalCredentialsTrait.FabricDescriptorStruct>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OperationalCredentials?>.supportedFabrics: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OperationalCredentials?>.commissionedFabrics: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OperationalCredentials?>.trustedRootCertificates: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.ByteArray>?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OperationalCredentials?>.currentFabricIndex: com.google.home.automation.TypedExpression<kotlin.UByte?> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OperationalCredentials?>.generatedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OperationalCredentials?>.acceptedCommandList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OperationalCredentials?>.attributeList: com.google.home.automation.TypedExpression<kotlin.collections.List<kotlin.UInt>> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OperationalCredentials?>.featureMap: com.google.home.automation.TypedExpression<kotlin.UInt> /* compiled code */
            public final get

        public final val @receiver:androidx.annotation.NonNull com.google.home.automation.TypedExpression<out com.google.home.matter.standard.OperationalCredentials?>.clusterRevision: com.google.home.automation.TypedExpression<kotlin.UShort> /* compiled code */
            public final get

        public final fun attestationRequest(attestationNonce: kotlin.ByteArray): com.google.home.automation.Command { /* compiled code */ }

        public final fun certificateChainRequest(certificateType: com.google.home.matter.standard.OperationalCredentialsTrait.CertificateChainTypeEnum): com.google.home.automation.Command { /* compiled code */ }

        public final fun csrRequest(csrNonce: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.OperationalCredentialsTrait.CsrRequestCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun addNoc(nocValue: kotlin.ByteArray, ipkValue: kotlin.ByteArray, caseAdminSubject: kotlin.ULong, adminVendorId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.OperationalCredentialsTrait.AddNocCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun updateNoc(nocValue: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.OperationalCredentialsTrait.UpdateNocCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.automation.Command { /* compiled code */ }

        public final fun updateFabricLabel(label: kotlin.String): com.google.home.automation.Command { /* compiled code */ }

        public final fun removeFabric(fabricIndex: kotlin.UByte): com.google.home.automation.Command { /* compiled code */ }

        public final fun addTrustedRootCertificate(rootCaCertificate: kotlin.ByteArray): com.google.home.automation.Command { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeById(tagId: kotlin.UInt): com.google.home.Field? { /* compiled code */ }

        @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open fun getAttributeByName(name: kotlin.String): com.google.home.Field? { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val factory: com.google.home.TraitFactory<com.google.home.matter.standard.OperationalCredentials> /* compiled code */
        public open get

    public abstract fun supports(attribute: com.google.home.matter.standard.OperationalCredentials.Attribute): kotlin.Boolean

    public abstract fun supports(command: com.google.home.matter.standard.OperationalCredentials.Command): kotlin.Boolean

    public final enum class Attribute private constructor(fieldName: kotlin.String, tag: kotlin.UInt, typeName: kotlin.String, typeEnum: com.google.home.Type, descriptor: com.google.home.Descriptor, isNullable: kotlin.Boolean) : com.google.home.Field, kotlin.Enum<com.google.home.matter.standard.OperationalCredentials.Attribute> {
        @androidx.annotation.NonNull nocs,

        @androidx.annotation.NonNull fabrics,

        @androidx.annotation.NonNull supportedFabrics,

        @androidx.annotation.NonNull commissionedFabrics,

        @androidx.annotation.NonNull trustedRootCertificates,

        @androidx.annotation.NonNull currentFabricIndex,

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

    public final enum class Command private constructor(tag: kotlin.UInt) : kotlin.Enum<com.google.home.matter.standard.OperationalCredentials.Command> {
        @androidx.annotation.NonNull AttestationRequest,

        @androidx.annotation.NonNull CertificateChainRequest,

        @androidx.annotation.NonNull CsrRequest,

        @androidx.annotation.NonNull AddNoc,

        @androidx.annotation.NonNull UpdateNoc,

        @androidx.annotation.NonNull UpdateFabricLabel,

        @androidx.annotation.NonNull RemoveFabric,

        @androidx.annotation.NonNull AddTrustedRootCertificate;

        public final val tag: kotlin.UInt /* compiled code */
    }
}
