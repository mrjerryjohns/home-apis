// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface PushAvStreamTransportCommandsDefaultImpl : com.google.home.google.PushAvStreamTransportCommands {
    public open suspend fun setTransportStatus(transportStatus: com.google.home.google.PushAvStreamTransportTrait.TransportStatusEnum, optionalArgs: com.google.home.google.PushAvStreamTransportTrait.SetTransportStatusCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun findTransport(optionalArgs: com.google.home.google.PushAvStreamTransportTrait.FindTransportCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.google.PushAvStreamTransportTrait.FindTransportCommand.Response { /* compiled code */ }

    public open fun setTransportStatusBatchable(transportStatus: com.google.home.google.PushAvStreamTransportTrait.TransportStatusEnum, optionalArgs: com.google.home.google.PushAvStreamTransportTrait.SetTransportStatusCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun findTransportBatchable(optionalArgs: com.google.home.google.PushAvStreamTransportTrait.FindTransportCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.google.PushAvStreamTransportTrait.FindTransportCommand.Response> { /* compiled code */ }
}
