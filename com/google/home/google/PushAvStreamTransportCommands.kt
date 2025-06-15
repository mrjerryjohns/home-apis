// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface PushAvStreamTransportCommands {
    public abstract suspend fun setTransportStatus(transportStatus: com.google.home.google.PushAvStreamTransportTrait.TransportStatusEnum, optionalArgs: com.google.home.google.PushAvStreamTransportTrait.SetTransportStatusCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun findTransport(optionalArgs: com.google.home.google.PushAvStreamTransportTrait.FindTransportCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.google.PushAvStreamTransportTrait.FindTransportCommand.Response

    public abstract fun setTransportStatusBatchable(transportStatus: com.google.home.google.PushAvStreamTransportTrait.TransportStatusEnum, optionalArgs: com.google.home.google.PushAvStreamTransportTrait.SetTransportStatusCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun findTransportBatchable(optionalArgs: com.google.home.google.PushAvStreamTransportTrait.FindTransportCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<com.google.home.google.PushAvStreamTransportTrait.FindTransportCommand.Response>
}
