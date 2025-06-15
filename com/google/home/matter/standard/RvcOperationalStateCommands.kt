// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface RvcOperationalStateCommands {
    public abstract suspend fun pause(): com.google.home.matter.standard.RvcOperationalStateTrait.PauseCommand.Response

    public abstract suspend fun resume(): com.google.home.matter.standard.RvcOperationalStateTrait.ResumeCommand.Response

    public abstract suspend fun goHome(): com.google.home.matter.standard.RvcOperationalStateTrait.GoHomeCommand.Response

    public abstract fun pauseBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.RvcOperationalStateTrait.PauseCommand.Response>

    public abstract fun resumeBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.RvcOperationalStateTrait.ResumeCommand.Response>

    public abstract fun goHomeBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.RvcOperationalStateTrait.GoHomeCommand.Response>
}
