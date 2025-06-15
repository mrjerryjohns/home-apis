// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface OtaSoftwareUpdateProviderCommandsDefaultImpl : com.google.home.matter.standard.OtaSoftwareUpdateProviderCommands {
    public open suspend fun queryImage(vendorId: kotlin.UShort, productId: kotlin.UShort, softwareVersion: kotlin.UInt, protocolsSupported: kotlin.collections.List<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.DownloadProtocolEnum>, optionalArgs: com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.QueryImageCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.QueryImageCommand.Response { /* compiled code */ }

    public open suspend fun applyUpdateRequest(updateToken: kotlin.ByteArray, newVersion: kotlin.UInt): com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.ApplyUpdateRequestCommand.Response { /* compiled code */ }

    public open suspend fun notifyUpdateApplied(updateToken: kotlin.ByteArray, softwareVersion: kotlin.UInt): kotlin.Unit { /* compiled code */ }

    public open fun queryImageBatchable(vendorId: kotlin.UShort, productId: kotlin.UShort, softwareVersion: kotlin.UInt, protocolsSupported: kotlin.collections.List<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.DownloadProtocolEnum>, optionalArgs: com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.QueryImageCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.QueryImageCommand.Response> { /* compiled code */ }

    public open fun applyUpdateRequestBatchable(updateToken: kotlin.ByteArray, newVersion: kotlin.UInt): com.google.home.BatchableCommand<com.google.home.matter.standard.OtaSoftwareUpdateProviderTrait.ApplyUpdateRequestCommand.Response> { /* compiled code */ }

    public open fun notifyUpdateAppliedBatchable(updateToken: kotlin.ByteArray, softwareVersion: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}
