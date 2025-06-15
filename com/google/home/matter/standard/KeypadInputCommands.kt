// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface KeypadInputCommands {
    public abstract suspend fun sendKey(keyCode: com.google.home.matter.standard.KeypadInputTrait.CecKeyCodeEnum): com.google.home.matter.standard.KeypadInputTrait.SendKeyCommand.Response

    public abstract fun sendKeyBatchable(keyCode: com.google.home.matter.standard.KeypadInputTrait.CecKeyCodeEnum): com.google.home.BatchableCommand<com.google.home.matter.standard.KeypadInputTrait.SendKeyCommand.Response>
}

