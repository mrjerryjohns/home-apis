// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface WaterHeaterModeCommandsDefaultImpl : com.google.home.matter.standard.WaterHeaterModeCommands {
    public open suspend fun changeToMode(newMode: kotlin.UByte): com.google.home.matter.standard.WaterHeaterModeTrait.ChangeToModeCommand.Response { /* compiled code */ }

    public open fun changeToModeBatchable(newMode: kotlin.UByte): com.google.home.BatchableCommand<com.google.home.matter.standard.WaterHeaterModeTrait.ChangeToModeCommand.Response> { /* compiled code */ }
}

