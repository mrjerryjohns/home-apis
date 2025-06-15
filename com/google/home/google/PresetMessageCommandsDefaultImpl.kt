// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface PresetMessageCommandsDefaultImpl : com.google.home.google.PresetMessageCommands {
    public open suspend fun playPresetMessage(phraseType: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open fun playPresetMessageBatchable(phraseType: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}
