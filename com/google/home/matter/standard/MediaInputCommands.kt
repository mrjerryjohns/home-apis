// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface MediaInputCommands {
    public abstract suspend fun selectInput(index: kotlin.UByte): kotlin.Unit

    public abstract suspend fun showInputStatus(): kotlin.Unit

    public abstract suspend fun hideInputStatus(): kotlin.Unit

    public abstract suspend fun renameInput(index: kotlin.UByte, name: kotlin.String): kotlin.Unit

    public abstract fun selectInputBatchable(index: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun showInputStatusBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun hideInputStatusBatchable(): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun renameInputBatchable(index: kotlin.UByte, name: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit>
}
