// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public interface MicrowaveOvenControlCommands {
    public abstract suspend fun setCookingParameters(optionalArgs: com.google.home.matter.standard.MicrowaveOvenControlTrait.SetCookingParametersCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): kotlin.Unit

    public abstract suspend fun addMoreTime(timeToAdd: kotlin.UInt): kotlin.Unit

    public abstract fun setCookingParametersBatchable(optionalArgs: com.google.home.matter.standard.MicrowaveOvenControlTrait.SetCookingParametersCommand.OptionalArgs.() -> kotlin.Unit = COMPILED_CODE): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun addMoreTimeBatchable(timeToAdd: kotlin.UInt): com.google.home.BatchableCommand<kotlin.Unit>
}

