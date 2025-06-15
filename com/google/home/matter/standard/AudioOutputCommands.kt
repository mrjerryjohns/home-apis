// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface AudioOutputCommands {
    public abstract suspend fun selectOutput(index: kotlin.UByte): kotlin.Unit

    public abstract suspend fun renameOutput(index: kotlin.UByte, name: kotlin.String): kotlin.Unit

    public abstract fun selectOutputBatchable(index: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun renameOutputBatchable(index: kotlin.UByte, name: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit>
}

