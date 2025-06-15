// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedKeypadInputCommands {
    public abstract suspend fun extendedSendKey(keyCode: com.google.home.google.ExtendedKeypadInputTrait.Key): kotlin.Unit

    public abstract fun extendedSendKeyBatchable(keyCode: com.google.home.google.ExtendedKeypadInputTrait.Key): com.google.home.BatchableCommand<kotlin.Unit>
}

