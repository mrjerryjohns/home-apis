// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface OvenCavityOperationalStateCommandsDefaultImpl : com.google.home.matter.standard.OvenCavityOperationalStateCommands {
    public open suspend fun pause(): com.google.home.matter.standard.OvenCavityOperationalStateTrait.PauseCommand.Response { /* compiled code */ }

    public open suspend fun stop(): com.google.home.matter.standard.OvenCavityOperationalStateTrait.StopCommand.Response { /* compiled code */ }

    public open suspend fun start(): com.google.home.matter.standard.OvenCavityOperationalStateTrait.StartCommand.Response { /* compiled code */ }

    public open suspend fun resume(): com.google.home.matter.standard.OvenCavityOperationalStateTrait.ResumeCommand.Response { /* compiled code */ }

    public open fun pauseBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.OvenCavityOperationalStateTrait.PauseCommand.Response> { /* compiled code */ }

    public open fun stopBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.OvenCavityOperationalStateTrait.StopCommand.Response> { /* compiled code */ }

    public open fun startBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.OvenCavityOperationalStateTrait.StartCommand.Response> { /* compiled code */ }

    public open fun resumeBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.OvenCavityOperationalStateTrait.ResumeCommand.Response> { /* compiled code */ }
}

