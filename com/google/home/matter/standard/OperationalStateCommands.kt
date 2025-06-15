// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface OperationalStateCommands {
    public abstract suspend fun pause(): com.google.home.matter.standard.OperationalStateTrait.PauseCommand.Response

    public abstract suspend fun stop(): com.google.home.matter.standard.OperationalStateTrait.StopCommand.Response

    public abstract suspend fun start(): com.google.home.matter.standard.OperationalStateTrait.StartCommand.Response

    public abstract suspend fun resume(): com.google.home.matter.standard.OperationalStateTrait.ResumeCommand.Response

    public abstract fun pauseBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalStateTrait.PauseCommand.Response>

    public abstract fun stopBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalStateTrait.StopCommand.Response>

    public abstract fun startBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalStateTrait.StartCommand.Response>

    public abstract fun resumeBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.OperationalStateTrait.ResumeCommand.Response>
}
