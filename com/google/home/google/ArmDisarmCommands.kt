// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ArmDisarmCommands {
    public abstract suspend fun armDisarm(arm: kotlin.Boolean, optionalArgs: com.google.home.google.ArmDisarmTrait.ArmDisarmCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract fun armDisarmBatchable(arm: kotlin.Boolean, optionalArgs: com.google.home.google.ArmDisarmTrait.ArmDisarmCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>
}

