// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home

@com.google.android.gms.common.annotation.KeepForSdk @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.RequiresApi public final class Home internal constructor(context: android.content.Context, permissionsClient: com.google.android.gms.home.permissions.PermissionsClient, authorizationClient: com.google.android.gms.home.internal.AuthorizationClient = COMPILED_CODE, homeConfig: com.google.home.HomeConfig = COMPILED_CODE, googleApiAvailability: com.google.android.gms.common.GoogleApiAvailabilityLight = COMPILED_CODE, permissionsUiManagerOverride: com.google.android.gms.home.internal.PermissionsUiManager? = COMPILED_CODE, providedAccount: com.google.android.gms.auth.api.signin.GoogleSignInAccount? = COMPILED_CODE, homeManagerOverride: com.google.home.HomeManager? =
    COMPILED_CODE, previousShutdownJob: kotlinx.coroutines.Job? = COMPILED_CODE, use1pAuthFlow: kotlin.Boolean = COMPILED_CODE, googleAuthUtilWrapper: com.google.android.gms.home.internal.GhpGoogleAuthUtilWrapper = COMPILED_CODE) : com.google.home.HomeClient {
    public companion object : com.google.android.gms.common.api.OptionalModuleApi {
        public const final val TAG: kotlin.String = COMPILED_CODE /* compiled code */

        @androidx.annotation.VisibleForTesting internal const final val MIN_REQUIRED_GMS_CORE_VERSION: kotlin.Int = COMPILED_CODE /* compiled code */

        public open fun getOptionalFeatures(): kotlin.Array<com.google.android.gms.common.Feature> { /* compiled code */ }

        @kotlin.jvm.JvmStatic @com.google.android.gms.common.annotation.KeepForSdk public final fun getClient(context: android.content.Context, homeConfig: com.google.home.HomeConfig = COMPILED_CODE): com.google.home.HomeClient { /* compiled code */ }

        @kotlin.jvm.JvmStatic @com.google.android.gms.common.annotation.KeepForSdk public final fun getClient(activity: android.app.Activity, homeConfig: com.google.home.HomeConfig = COMPILED_CODE): com.google.home.HomeClient { /* compiled code */ }

        @kotlin.jvm.JvmStatic @com.google.android.gms.common.annotation.KeepForSdk internal final fun getClientInternal(context: android.content.Context, homeConfig: com.google.home.HomeConfig = COMPILED_CODE, authorizationClient: com.google.android.gms.home.internal.AuthorizationClient? = COMPILED_CODE, googleApiAvailability: com.google.android.gms.common.GoogleApiAvailabilityLight? = COMPILED_CODE): com.google.home.HomeClient { /* compiled code */ }

        @kotlin.jvm.JvmStatic @com.google.android.gms.common.internal.ShowFirstParty public final fun getClient(context: android.content.Context, account: com.google.android.gms.auth.api.signin.GoogleSignInAccount, homeConfig: com.google.home.HomeConfig = COMPILED_CODE, use1pAuthFlow: kotlin.Boolean = COMPILED_CODE): com.google.home.HomeClient { /* compiled code */ }

        @kotlin.jvm.JvmStatic @com.google.android.gms.common.internal.ShowFirstParty public final fun getClient(activity: android.app.Activity, account: com.google.android.gms.auth.api.signin.GoogleSignInAccount, homeConfig: com.google.home.HomeConfig = COMPILED_CODE, use1pAuthFlow: kotlin.Boolean = COMPILED_CODE): com.google.home.HomeClient { /* compiled code */ }

        @kotlin.jvm.JvmStatic @androidx.annotation.VisibleForTesting internal final fun getClientInternal(context: android.content.Context, account: com.google.android.gms.auth.api.signin.GoogleSignInAccount, homeConfig: com.google.home.HomeConfig = COMPILED_CODE, authorizationClient: com.google.android.gms.home.internal.AuthorizationClient? = COMPILED_CODE, googleApiAvailability: com.google.android.gms.common.GoogleApiAvailabilityLight? = COMPILED_CODE, firstPartyAuthFlowEnabled: kotlin.Boolean = COMPILED_CODE): com.google.home.HomeClient { /* compiled code */ }

        @kotlin.jvm.JvmStatic @com.google.android.gms.common.annotation.KeepForSdk @androidx.annotation.VisibleForTesting public final fun getTestClient(context: android.content.Context, permissionsClient: com.google.android.gms.home.permissions.PermissionsClient, googleApiAvailability: com.google.android.gms.common.GoogleApiAvailabilityLight = COMPILED_CODE, homeConfig: com.google.home.HomeConfig, permissionsUiManagerOverride: com.google.android.gms.home.internal.PermissionsUiManager? = COMPILED_CODE, authorizationClient: com.google.android.gms.home.internal.AuthorizationClient = COMPILED_CODE, use1pAuthFlow: kotlin.Boolean = COMPILED_CODE): com.google.home.HomeClient { /* compiled code */ }

        private final enum class PermissionsType private constructor() : kotlin.Enum<com.google.home.Home.Companion.PermissionsType> {
            OAUTH,

            OAUTH_WITH_ACCOUNT_PROVIDED;
        }

        private final enum class TokenRefreshState private constructor() : kotlin.Enum<com.google.home.Home.Companion.TokenRefreshState> {
            UNKNOWN,

            TOKEN_FETCH_SUCCESSFUL,

            TOKEN_FETCH_UNSUCCESSFUL;
        }
    }

    private final val context: android.content.Context /* compiled code */

    internal final val permissionsClient: com.google.android.gms.home.permissions.PermissionsClient /* compiled code */

    internal final val authorizationClient: com.google.android.gms.home.internal.AuthorizationClient /* compiled code */

    internal final val homeConfig: com.google.home.HomeConfig /* compiled code */

    private final val googleApiAvailability: com.google.android.gms.common.GoogleApiAvailabilityLight /* compiled code */

    private final val permissionsUiManagerOverride: com.google.android.gms.home.internal.PermissionsUiManager? /* compiled code */

    private final val providedAccount: com.google.android.gms.auth.api.signin.GoogleSignInAccount? /* compiled code */

    private final val homeManagerOverride: com.google.home.HomeManager? /* compiled code */

    private final val previousShutdownJob: kotlinx.coroutines.Job? /* compiled code */

    private final val use1pAuthFlow: kotlin.Boolean /* compiled code */

    private final val googleAuthUtilWrapper: com.google.android.gms.home.internal.GhpGoogleAuthUtilWrapper /* compiled code */

    private final val instanceTag: kotlin.String /* compiled code */

    private final val isFirstParty: kotlin.Boolean /* compiled code */

    private final val permissionsType: com.google.home.Home.Companion.PermissionsType /* compiled code */

    private final val interactionClientLock: kotlinx.coroutines.sync.Mutex /* compiled code */

    private final var currentAccount: android.accounts.Account? /* compiled code */

    private final val cachedOAuthTokenLock: kotlinx.coroutines.sync.Mutex /* compiled code */

    private final var cachedOAuthToken: kotlin.String? /* compiled code */

    private final var tokenRefreshStateFlow: kotlinx.coroutines.flow.MutableStateFlow<com.google.home.Home.Companion.TokenRefreshState> /* compiled code */

    @androidx.annotation.VisibleForTesting internal final val isShutdown: java.util.concurrent.atomic.AtomicBoolean /* compiled code */

    private final val _interactionClientProvider: kotlinx.coroutines.flow.MutableStateFlow<com.google.nest.platform.mesh.interaction.InteractionClient?> /* compiled code */

    internal final val interactionClientProvider: kotlinx.coroutines.flow.StateFlow<com.google.nest.platform.mesh.interaction.InteractionClient?> /* compiled code */

    internal final val loggerScope: kotlinx.coroutines.CoroutineScope /* compiled code */

    internal final val metricsLogger: com.google.nest.platform.mesh.api.metrics.MetricsLogger /* compiled code */
        internal final get

    @androidx.annotation.VisibleForTesting internal final val homeManager: com.google.home.HomeManager /* compiled code */

    @androidx.annotation.VisibleForTesting internal final val permissionsUiManager: com.google.android.gms.home.internal.PermissionsUiManager /* compiled code */

    private final var initWithProvidedAccountException: java.lang.Exception? /* from: kotlin.Exception? */ /* compiled code */

    @androidx.annotation.VisibleForTesting internal final val initializationJob: kotlinx.coroutines.CompletableJob /* compiled code */

    private final val permissionsGrantedJob: kotlinx.coroutines.CompletableJob /* compiled code */

    private final val hasPermissionsGrantStateFlow: kotlinx.coroutines.flow.Flow<kotlin.Boolean> /* compiled code */
        private final get

    @androidx.annotation.VisibleForTesting internal final val updateHasPermissionsFlow: (kotlin.Boolean) -> kotlin.Unit /* compiled code */

    @androidx.annotation.VisibleForTesting @androidx.annotation.Nullable internal final suspend fun getCachedOAuthTokenForTest(): kotlin.String? { /* compiled code */ }

    @androidx.annotation.VisibleForTesting @androidx.annotation.Nullable internal final suspend fun setInteractionClient(createClient: () -> com.google.nest.platform.mesh.interaction.InteractionClient?): kotlin.Unit { /* compiled code */ }

    private final suspend fun attemptToInitializeInteractionClient(): kotlin.Unit { /* compiled code */ }

    private final suspend fun initializeInteractionClientWithProvidedAccount(googleAccount: com.google.android.gms.auth.api.signin.GoogleSignInAccount): kotlin.Unit { /* compiled code */ }

    @kotlin.Deprecated @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public open suspend fun shutdown(): kotlin.Unit { /* compiled code */ }

    internal final fun shutdownAsJob(): kotlinx.coroutines.Job { /* compiled code */ }

    private final fun <T : com.google.home.HasId> executeHomeManagerCall(call: com.google.home.HomeManager.() -> com.google.home.HomeObjectsFlow<T>?): com.google.home.HomeObjectsFlow<T> { /* compiled code */ }

    public open fun structures(): com.google.home.HomeObjectsFlow<com.google.home.Structure> { /* compiled code */ }

    public open fun devices(): com.google.home.HomeObjectsFlow<com.google.home.HomeDevice> { /* compiled code */ }

    public open fun rooms(): com.google.home.HomeObjectsFlow<com.google.home.Room> { /* compiled code */ }

    public open fun hasPermissions(): kotlinx.coroutines.flow.Flow<com.google.home.PermissionsState> { /* compiled code */ }

    public open fun registerActivityResultCallerForPermissions(permissionsLauncher: androidx.activity.result.ActivityResultCaller): kotlin.Unit { /* compiled code */ }

    @com.google.home.annotation.HomeExperimentalApi @androidx.annotation.Nullable public open suspend fun <T> sendBatchedCommands(block: com.google.home.BatchScope.() -> T): T { /* compiled code */ }

    @androidx.annotation.Nullable public open suspend fun requestPermissions(forceLaunch: kotlin.Boolean): com.google.home.PermissionsResult { /* compiled code */ }

    public final suspend fun readObjects(objectFilter: com.google.nest.platform.mesh.interaction.FilterQuery, reduceObjectFilter: kotlin.collections.List<kotlin.String> = COMPILED_CODE): kotlin.collections.List<com.google.nest.platform.mesh.serialization.ObjectData> { /* compiled code */ }

    @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public final suspend fun writeObjects(objects: kotlin.collections.List<com.google.nest.platform.mesh.serialization.ObjectData>): kotlin.Unit { /* compiled code */ }

    public final suspend fun registerTraitSubscriber(subscriber: com.google.nest.platform.mesh.interaction.TraitSubscriber, objectFilter: com.google.nest.platform.mesh.interaction.FilterQuery, traitFilter: kotlin.collections.List<kotlin.String> = COMPILED_CODE): com.google.nest.platform.mesh.interaction.ReceiveHandle { /* compiled code */ }

    @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public final suspend fun unregisterTraitSubscriber(handle: com.google.nest.platform.mesh.interaction.ReceiveHandle): kotlin.Boolean { /* compiled code */ }

    @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable public final suspend fun sendCommands(commands: kotlin.collections.List<com.google.nest.platform.mesh.interaction.ObjectCommand>): kotlin.collections.List<com.google.nest.platform.mesh.interaction.ObjectCommandResult> { /* compiled code */ }

    internal final suspend fun refreshTokenForAccount(): kotlin.String { /* compiled code */ }

    private final fun homeExceptionDueToNoInteractionClient(): com.google.home.HomeException { /* compiled code */ }

    private final fun throwHomeExceptionIfShutdown(): kotlin.Unit { /* compiled code */ }

    private final fun calculateSupportedFeatures(): kotlin.collections.Set<com.google.home.Feature> { /* compiled code */ }
}
