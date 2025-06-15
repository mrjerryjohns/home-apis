// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface MediaInputCommandsDefaultImpl : com.google.home.matter.standard.MediaInputCommands {
    public open suspend fun selectInput(index: kotlin.UByte): kotlin.Unit { /* compiled code */ }

    public open suspend fun showInputStatus(): kotlin.Unit { /* compiled code */ }

    public open suspend fun hideInputStatus(): kotlin.Unit { /* compiled code */ }

    public open suspend fun renameInput(index: kotlin.UByte, name: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open fun selectInputBatchable(index: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun showInputStatusBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun hideInputStatusBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun renameInputBatchable(index: kotlin.UByte, name: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}
