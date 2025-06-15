// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface DispenseCommandsDefaultImpl : com.google.home.google.DispenseCommands {
    public open suspend fun dispense(item: kotlin.String, amount: kotlin.Float, unit: com.google.home.google.DispenseTrait.Unit, presetName: kotlin.String): com.google.home.google.DispenseTrait.DispenseCommand.Response { /* compiled code */ }

    public open fun dispenseBatchable(item: kotlin.String, amount: kotlin.Float, unit: com.google.home.google.DispenseTrait.Unit, presetName: kotlin.String): com.google.home.BatchableCommand<com.google.home.google.DispenseTrait.DispenseCommand.Response> { /* compiled code */ }
}
