// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface ModeSelectCommandsDefaultImpl : com.google.home.matter.standard.ModeSelectCommands {
    public open suspend fun changeToMode(newMode: kotlin.UByte): kotlin.Unit { /* compiled code */ }

    public open fun changeToModeBatchable(newMode: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}
