// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface SampleMeiCommandsDefaultImpl : com.google.home.matter.standard.SampleMeiCommands {
    public open suspend fun ping(): kotlin.Unit { /* compiled code */ }

    public open suspend fun addArguments(arg1: kotlin.UByte, arg2: kotlin.UByte): com.google.home.matter.standard.SampleMeiTrait.AddArgumentsCommand.Response { /* compiled code */ }

    public open fun pingBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun addArgumentsBatchable(arg1: kotlin.UByte, arg2: kotlin.UByte): com.google.home.BatchableCommand<com.google.home.matter.standard.SampleMeiTrait.AddArgumentsCommand.Response> { /* compiled code */ }
}
