// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface OperationalCredentialsCommandsDefaultImpl : com.google.home.matter.standard.OperationalCredentialsCommands {
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
}
