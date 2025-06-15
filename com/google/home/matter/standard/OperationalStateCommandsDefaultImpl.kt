// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface OperationalStateCommandsDefaultImpl : com.google.home.matter.standard.OperationalStateCommands {
    public open suspend fun pause(): com.google.home.matter.standard.OperationalStateTrait.PauseCommand.Response { /* compiled code */ }

    public open suspend fun stop(): com.google.home.matter.standard.OperationalStateTrait.StopCommand.Response { /* compiled code */ }

    public open suspend fun start(): com.google.home.matter.standard.OperationalStateTrait.StartCommand.Response { /* compiled code */ }

    public open suspend fun resume(): com.google.home.matter.standard.OperationalStateTrait.ResumeCommand.Response { /* compiled code */ }

    public open fun pauseBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalStateTrait.PauseCommand.Response> { /* compiled code */ }

    public open fun stopBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalStateTrait.StopCommand.Response> { /* compiled code */ }

    public open fun startBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalStateTrait.StartCommand.Response> { /* compiled code */ }

    public open fun resumeBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalStateTrait.ResumeCommand.Response> { /* compiled code */ }
}
