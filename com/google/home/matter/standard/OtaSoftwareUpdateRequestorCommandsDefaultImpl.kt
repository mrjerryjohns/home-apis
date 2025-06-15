// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface OtaSoftwareUpdateRequestorCommandsDefaultImpl : com.google.home.matter.standard.OtaSoftwareUpdateRequestorCommands {
    public open suspend fun announceOtaProvider(providerNodeId: kotlin.ULong, vendorId: kotlin.UShort, announcementReason: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AnnouncementReasonEnum, endpoint: kotlin.UShort, optionalArgs: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AnnounceOtaProviderCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open fun announceOtaProviderBatchable(providerNodeId: kotlin.ULong, vendorId: kotlin.UShort, announcementReason: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AnnouncementReasonEnum, endpoint: kotlin.UShort, optionalArgs: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AnnounceOtaProviderCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}
