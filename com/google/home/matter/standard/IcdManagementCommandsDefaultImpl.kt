// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface IcdManagementCommandsDefaultImpl : com.google.home.matter.standard.IcdManagementCommands {
    public open suspend fun registerClient(checkInNodeId: kotlin.ULong, monitoredSubject: kotlin.ULong, key: kotlin.ByteArray, clientType: com.google.home.matter.standard.IcdManagementTrait.ClientTypeEnum, optionalArgs: com.google.home.matter.standard.IcdManagementTrait.RegisterClientCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.matter.standard.IcdManagementTrait.RegisterClientCommand.Response { /* compiled code */ }

    public open suspend fun unregisterClient(checkInNodeId: kotlin.ULong, optionalArgs: com.google.home.matter.standard.IcdManagementTrait.UnregisterClientCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun stayActiveRequest(stayActiveDuration: kotlin.UInt): com.google.home.matter.standard.IcdManagementTrait.StayActiveRequestCommand.Response { /* compiled code */ }

    public open fun registerClientBatchable(checkInNodeId: kotlin.ULong, monitoredSubject: kotlin.ULong, key: kotlin.ByteArray, clientType: com.google.home.matter.standard.IcdManagementTrait.ClientTypeEnum, optionalArgs: com.google.home.matter.standard.IcdManagementTrait.RegisterClientCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<com.google.home.matter.standard.IcdManagementTrait.RegisterClientCommand.Response> { /* compiled code */ }

    public open fun unregisterClientBatchable(checkInNodeId: kotlin.ULong, optionalArgs: com.google.home.matter.standard.IcdManagementTrait.UnregisterClientCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun stayActiveRequestBatchable(stayActiveDuration: kotlin.UInt): com.google.home.BatchableCommand<com.google.home.matter.standard.IcdManagementTrait.StayActiveRequestCommand.Response> { /* compiled code */ }
}
