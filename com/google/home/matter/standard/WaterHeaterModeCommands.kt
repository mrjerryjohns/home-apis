// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface WaterHeaterModeCommands {
    public abstract suspend fun changeToMode(newMode: kotlin.UByte): com.google.home.matter.standard.WaterHeaterModeTrait.ChangeToModeCommand.Response

    public abstract fun changeToModeBatchable(newMode: kotlin.UByte): com.google.home.BatchableCommand<com.google.home.matter.standard.WaterHeaterModeTrait.ChangeToModeCommand.Response>
}
