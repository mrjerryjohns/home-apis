// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface FillCommandsDefaultImpl : com.google.home.google.FillCommands {
    public open suspend fun fill(fill: kotlin.Boolean, fillLevel: kotlin.String, fillPercent: kotlin.Float): kotlin.Unit { /* compiled code */ }

    public open fun fillBatchable(fill: kotlin.Boolean, fillLevel: kotlin.String, fillPercent: kotlin.Float): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}
