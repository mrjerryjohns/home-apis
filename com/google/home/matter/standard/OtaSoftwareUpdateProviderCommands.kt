// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface OtaSoftwareUpdateProviderCommands {
    public abstract suspend fun queryImage(vendorId: kotlin.UShort, productId: kotlin.UShort, softwareVersion: kotlin.UInt, protocolsSupported: kotlin.collections.List<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.DownloadProtocolEnum>, optionalArgs: com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.QueryImageCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.QueryImageCommand.Response

    public abstract suspend fun applyUpdateRequest(updateToken: kotlin.ByteArray, newVersion: kotlin.UInt): com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.ApplyUpdateRequestCommand.Response

    public abstract suspend fun notifyUpdateApplied(updateToken: kotlin.ByteArray, softwareVersion: kotlin.UInt): kotlin.Unit

    public abstract fun queryImageBatchable(vendorId: kotlin.UShort, productId: kotlin.UShort, softwareVersion: kotlin.UInt, protocolsSupported: kotlin.collections.List<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.DownloadProtocolEnum>, optionalArgs: com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.QueryImageCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.QueryImageCommand.Response>

    public abstract fun applyUpdateRequestBatchable(updateToken: kotlin.ByteArray, newVersion: kotlin.UInt): com.google.home.BatchableCommand<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.ApplyUpdateRequestCommand.Response>

    public abstract fun notifyUpdateAppliedBatchable(updateToken: kotlin.ByteArray, softwareVersion: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit>
}
