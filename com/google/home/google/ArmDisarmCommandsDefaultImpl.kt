// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface ArmDisarmCommandsDefaultImpl : com.google.home.google.ArmDisarmCommands {
    public open suspend fun armDisarm(arm: kotlin.Boolean, optionalArgs: com.google.home.google.ArmDisarmTrait.ArmDisarmCommand.OptionalArgs.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public open fun armDisarmBatchable(arm: kotlin.Boolean, optionalArgs: com.google.home.google.ArmDisarmTrait.ArmDisarmCommand.OptionalArgs.() -> kotlin.Unit): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}
