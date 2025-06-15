// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ExtendedKeypadInputCommandsDefaultImpl : com.google.home.google.ExtendedKeypadInputCommands {
    public open suspend fun extendedSendKey(keyCode: com.google.home.google.ExtendedKeypadInputTrait.Key): kotlin.Unit { /* compiled code */ }

    public open fun extendedSendKeyBatchable(keyCode: com.google.home.google.ExtendedKeypadInputTrait.Key): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}
