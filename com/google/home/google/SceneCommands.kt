// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface SceneCommands {
    public abstract suspend fun activateScene(dynamic: kotlin.Boolean): kotlin.Unit

    public abstract suspend fun deactivateScene(): kotlin.Unit

    public abstract fun activateSceneBatchable(dynamic: kotlin.Boolean): com.google.home.BatchableCommand<kotlin.Unit>

    public abstract fun deactivateSceneBatchable(): com.google.home.BatchableCommand<kotlin.Unit>
}
