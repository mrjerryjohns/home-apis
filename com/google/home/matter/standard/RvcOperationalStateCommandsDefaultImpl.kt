// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface RvcOperationalStateCommandsDefaultImpl : com.google.home.matter.standard.RvcOperationalStateCommands {
    public open suspend fun pause(): com.google.home.matter.standard.RvcOperationalStateTrait.PauseCommand.Response { /* compiled code */ }

    public open suspend fun resume(): com.google.home.matter.standard.RvcOperationalStateTrait.ResumeCommand.Response { /* compiled code */ }

    public open suspend fun goHome(): com.google.home.matter.standard.RvcOperationalStateTrait.GoHomeCommand.Response { /* compiled code */ }

    public open fun pauseBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.RvcOperationalStateTrait.PauseCommand.Response> { /* compiled code */ }

    public open fun resumeBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.RvcOperationalStateTrait.ResumeCommand.Response> { /* compiled code */ }

    public open fun goHomeBatchable(): com.google.home.BatchableCommand<com.google.home.matter.standard.RvcOperationalStateTrait.GoHomeCommand.Response> { /* compiled code */ }
}
