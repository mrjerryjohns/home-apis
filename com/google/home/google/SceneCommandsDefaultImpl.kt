// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public interface SceneCommandsDefaultImpl : com.google.home.google.SceneCommands {
    public open suspend fun activateScene(dynamic: kotlin.Boolean): kotlin.Unit { /* compiled code */ }

    public open suspend fun deactivateScene(): kotlin.Unit { /* compiled code */ }

    public open fun activateSceneBatchable(dynamic: kotlin.Boolean): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun deactivateSceneBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }
}

