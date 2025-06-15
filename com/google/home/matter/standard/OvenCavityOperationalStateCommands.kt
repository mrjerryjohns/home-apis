// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface OvenCavityOperationalStateCommands {
    public abstract suspend fun pause(): com.google.home.matter.standard.OvenCavityOperationalStateTrait.PauseCommand.Response

    public abstract suspend fun stop(): com.google.home.matter.standard.OvenCavityOperationalStateTrait.StopCommand.Response

    public abstract suspend fun start(): com.google.home.matter.standard.OvenCavityOperationalStateTrait.StartCommand.Response

    public abstract suspend fun resume(): com.google.home.matter.standard.OvenCavityOperationalStateTrait.ResumeCommand.Response

    public abstract fun pauseBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.OvenCavityOperationalStateTrait.PauseCommand.Response>

    public abstract fun stopBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.OvenCavityOperationalStateTrait.StopCommand.Response>

    public abstract fun startBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.OvenCavityOperationalStateTrait.StartCommand.Response>

    public abstract fun resumeBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.OvenCavityOperationalStateTrait.ResumeCommand.Response>
}

