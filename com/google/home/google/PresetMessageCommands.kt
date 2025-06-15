// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface PresetMessageCommands {
    public abstract suspend fun playPresetMessage(phraseType: kotlin.String): kotlin.Unit

    public abstract fun playPresetMessageBatchable(phraseType: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit>
}
