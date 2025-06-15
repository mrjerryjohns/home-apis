// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface ModeSelectCommands {
    public abstract suspend fun changeToMode(newMode: kotlin.UByte): kotlin.Unit

    public abstract fun changeToModeBatchable(newMode: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit>
}
