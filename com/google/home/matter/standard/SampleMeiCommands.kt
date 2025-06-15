// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface SampleMeiCommands {
    public abstract suspend fun ping(): kotlin.Unit

    public abstract suspend fun addArguments(arg1: kotlin.UByte, arg2: kotlin.UByte): com.google.home.matter.standard.SampleMeiTrait.AddArgumentsCommand.Response

    public abstract fun pingBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun addArgumentsBatchable(arg1: kotlin.UByte, arg2: kotlin.UByte): com.google.home.BatchableCommand<com.google.home.matter.standard.SampleMeiTrait.AddArgumentsCommand.Response>
}

