// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface OtaSoftwareUpdateRequestorCommands {
    public abstract suspend fun announceOtaProvider(providerNodeId: kotlin.ULong, vendorId: kotlin.UShort, announcementReason: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AnnouncementReasonEnum, endpoint: kotlin.UShort, optionalArgs: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AnnounceOtaProviderCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract fun announceOtaProviderBatchable(providerNodeId: kotlin.ULong, vendorId: kotlin.UShort, announcementReason: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AnnouncementReasonEnum, endpoint: kotlin.UShort, optionalArgs: com.google.home.matter.standard.OtaSoftwareUpdateRequestorTrait.AnnounceOtaProviderCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>
}

