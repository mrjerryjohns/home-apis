// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class OperationalCredentialsImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.OperationalCredentialsTrait.Attributes) : com.google.home.matter.standard.OperationalCredentials, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.OperationalCredentialsTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.OperationalCredentialsTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val commissionedFabrics: kotlin.UByte? /* compiled code */

    public open val currentFabricIndex: kotlin.UByte? /* compiled code */

    public open val fabrics: kotlin.collections.List<com.google.home.matter.standard.OperationalCredentialsTrait.FabricDescriptorStruct>? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val nocs: kotlin.collections.List<com.google.home.matter.standard.OperationalCredentialsTrait.NocStruct>? /* compiled code */

    public open val supportedFabrics: kotlin.UByte? /* compiled code */

    public open val trustedRootCertificates: kotlin.collections.List<kotlin.ByteArray>? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.OperationalCredentials.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.OperationalCredentials.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun attestationRequest(attestationNonce: kotlin.ByteArray): com.google.home.matter.standard.OperationalCredentialsTrait.AttestationRequestCommand.Response { /* compiled code */ }

    public open suspend fun certificateChainRequest(certificateType: com.google.home.matter.standard.OperationalCredentialsTrait.CertificateChainTypeEnum): com.google.home.matter.standard.OperationalCredentialsTrait.CertificateChainRequestCommand.Response { /* compiled code */ }

    public open suspend fun csrRequest(csrNonce: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.OperationalCredentialsTrait.CsrRequestCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.OperationalCredentialsTrait.CsrRequestCommand.Response { /* compiled code */ }

    public open suspend fun addNoc(nocValue: kotlin.ByteArray, ipkValue: kotlin.ByteArray, caseAdminSubject: kotlin.ULong, adminVendorId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.OperationalCredentialsTrait.AddNocCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.OperationalCredentialsTrait.AddNocCommand.Response { /* compiled code */ }

    public open suspend fun updateNoc(nocValue: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.OperationalCredentialsTrait.UpdateNocCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.OperationalCredentialsTrait.UpdateNocCommand.Response { /* compiled code */ }

    public open suspend fun updateFabricLabel(label: kotlin.String): com.google.home.matter.standard.OperationalCredentialsTrait.UpdateFabricLabelCommand.Response { /* compiled code */ }

    public open suspend fun removeFabric(fabricIndex: kotlin.UByte): com.google.home.matter.standard.OperationalCredentialsTrait.RemoveFabricCommand.Response { /* compiled code */ }

    public open suspend fun addTrustedRootCertificate(rootCaCertificate: kotlin.ByteArray): kotlin.Unit { /* compiled code */ }

    public open fun attestationRequestBatchable(attestationNonce: kotlin.ByteArray): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalCredentialsTrait.AttestationRequestCommand.Response> { /* compiled code */ }

    public open fun certificateChainRequestBatchable(certificateType: com.google.home.matter.standard.OperationalCredentialsTrait.CertificateChainTypeEnum): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalCredentialsTrait.CertificateChainRequestCommand.Response> { /* compiled code */ }

    public open fun csrRequestBatchable(csrNonce: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.OperationalCredentialsTrait.CsrRequestCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalCredentialsTrait.CsrRequestCommand.Response> { /* compiled code */ }

    public open fun addNocBatchable(nocValue: kotlin.ByteArray, ipkValue: kotlin.ByteArray, caseAdminSubject: kotlin.ULong, adminVendorId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.OperationalCredentialsTrait.AddNocCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalCredentialsTrait.AddNocCommand.Response> { /* compiled code */ }

    public open fun updateNocBatchable(nocValue: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.OperationalCredentialsTrait.UpdateNocCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalCredentialsTrait.UpdateNocCommand.Response> { /* compiled code */ }

    public open fun updateFabricLabelBatchable(label: kotlin.String): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalCredentialsTrait.UpdateFabricLabelCommand.Response> { /* compiled code */ }

    public open fun removeFabricBatchable(fabricIndex: kotlin.UByte): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalCredentialsTrait.RemoveFabricCommand.Response> { /* compiled code */ }

    public open fun addTrustedRootCertificateBatchable(rootCaCertificate: kotlin.ByteArray): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

