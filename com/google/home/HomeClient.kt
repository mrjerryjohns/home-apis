// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home

public interface HomeClient {
    @androidx.annotation.RequiresApi public abstract fun structures(): com.google.home.HomeObjectsFlow<com.google.home.Structure>

    @androidx.annotation.RequiresApi public abstract fun devices(): com.google.home.HomeObjectsFlow<com.google.home.HomeDevice>

    @androidx.annotation.RequiresApi public abstract fun rooms(): com.google.home.HomeObjectsFlow<com.google.home.Room>

    @androidx.annotation.RequiresApi public abstract fun hasPermissions(): kotlinx.coroutines.flow.Flow<com.google.home.PermissionsState>

    @androidx.annotation.RequiresApi public abstract fun registerActivityResultCallerForPermissions(permissionsLauncher: androidx.activity.result.ActivityResultCaller /* from: com.google.home.PermissionsLauncher */): kotlin.Unit

    @androidx.annotation.RequiresApi @androidx.annotation.Nullable public abstract suspend fun requestPermissions(forceLaunch: kotlin.Boolean = COMPILED_CODE): com.google.home.PermissionsResult

    @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.RequiresApi @androidx.annotation.Nullable public abstract suspend fun <T> sendBatchedCommands(block: com.google.home.BatchScope.() -> T): T

    @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.RequiresApi @androidx.annotation.Nullable public abstract suspend fun shutdown(): kotlin.Unit
}
