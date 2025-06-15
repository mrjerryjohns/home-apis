// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface ValveConfigurationAndControlCommands {
    public abstract suspend fun open(optionalArgs: com.google.home.matter.standard.ValveConfigurationAndControlTrait.OpenCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun close(): kotlin.Unit

    public abstract fun openBatchable(optionalArgs: com.google.home.matter.standard.ValveConfigurationAndControlTrait.OpenCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun closeBatchable(): com.google.home.BatchableCommand<kotlin.Unit>
}
