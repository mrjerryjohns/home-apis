// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface OperationalCredentialsCommands {
    public abstract suspend fun attestationRequest(attestationNonce: kotlin.ByteArray): com.google.home.matter.standard.OperationalCredentialsTrait.AttestationRequestCommand.Response

    public abstract suspend fun certificateChainRequest(certificateType: com.google.home.matter.standard.OperationalCredentialsTrait.CertificateChainTypeEnum): com.google.home.matter.standard.OperationalCredentialsTrait.CertificateChainRequestCommand.Response

    public abstract suspend fun csrRequest(csrNonce: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.OperationalCredentialsTrait.CsrRequestCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.OperationalCredentialsTrait.CsrRequestCommand.Response

    public abstract suspend fun addNoc(nocValue: kotlin.ByteArray, ipkValue: kotlin.ByteArray, caseAdminSubject: kotlin.ULong, adminVendorId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.OperationalCredentialsTrait.AddNocCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.OperationalCredentialsTrait.AddNocCommand.Response

    public abstract suspend fun updateNoc(nocValue: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.OperationalCredentialsTrait.UpdateNocCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.OperationalCredentialsTrait.UpdateNocCommand.Response

    public abstract suspend fun updateFabricLabel(label: kotlin.String): com.google.home.matter.standard.OperationalCredentialsTrait.UpdateFabricLabelCommand.Response

    public abstract suspend fun removeFabric(fabricIndex: kotlin.UByte): com.google.home.matter.standard.OperationalCredentialsTrait.RemoveFabricCommand.Response

    public abstract suspend fun addTrustedRootCertificate(rootCaCertificate: kotlin.ByteArray): kotlin.Unit

    public abstract fun attestationRequestBatchable(attestationNonce: kotlin.ByteArray): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalCredentialsTrait.AttestationRequestCommand.Response>

    public abstract fun certificateChainRequestBatchable(certificateType: com.google.home.matter.standard.OperationalCredentialsTrait.CertificateChainTypeEnum): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalCredentialsTrait.CertificateChainRequestCommand.Response>

    public abstract fun csrRequestBatchable(csrNonce: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.OperationalCredentialsTrait.CsrRequestCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalCredentialsTrait.CsrRequestCommand.Response>

    public abstract fun addNocBatchable(nocValue: kotlin.ByteArray, ipkValue: kotlin.ByteArray, caseAdminSubject: kotlin.ULong, adminVendorId: kotlin.UShort, optionalArgs: com.google.home.matter.standard.OperationalCredentialsTrait.AddNocCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalCredentialsTrait.AddNocCommand.Response>

    public abstract fun updateNocBatchable(nocValue: kotlin.ByteArray, optionalArgs: com.google.home.matter.standard.OperationalCredentialsTrait.UpdateNocCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalCredentialsTrait.UpdateNocCommand.Response>

    public abstract fun updateFabricLabelBatchable(label: kotlin.String): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalCredentialsTrait.UpdateFabricLabelCommand.Response>

    public abstract fun removeFabricBatchable(fabricIndex: kotlin.UByte): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalCredentialsTrait.RemoveFabricCommand.Response>

    public abstract fun addTrustedRootCertificateBatchable(rootCaCertificate: kotlin.ByteArray): com.google.home.BatchableCommand<kotlin.Unit>
}
