// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface ValveConfigurationAndControlCommandsDefaultImpl : com.google.home.matter.standard.ValveConfigurationAndControlCommands {
    public open suspend fun open(optionalArgs: com.google.home.matter.standard.ValveConfigurationAndControlTrait.OpenCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open suspend fun close(): kotlin.Unit { /* compiled code */ }

    public open fun openBatchable(optionalArgs: com.google.home.matter.standard.ValveConfigurationAndControlTrait.OpenCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun closeBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}
