// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface AudioOutputCommandsDefaultImpl : com.google.home.matter.standard.AudioOutputCommands {
    public open suspend fun selectOutput(index: kotlin.UByte): kotlin.Unit { /* compiled code */ }

    public open suspend fun renameOutput(index: kotlin.UByte, name: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open fun selectOutputBatchable(index: kotlin.UByte): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun renameOutputBatchable(index: kotlin.UByte, name: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}

