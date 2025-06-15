// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home

public object HomeManagerProvider {
    public final fun getInstance(interactionClient: com.google.nest.platform.mesh.interaction.InteractionClient, homeConfig: com.google.home.HomeConfig = COMPILED_CODE, tokenRefresh: com.google.home.internal.impl.TokenRefresh = COMPILED_CODE, supportedFeatures: kotlin.collections.Set<com.google.home.Feature>, metricsLogger: com.google.nest.platform.mesh.api.metrics.MetricsLogger): com.google.home.HomeManager { /* compiled code */ }

    public final fun getInstance(interactionClientProvider: kotlinx.coroutines.flow.StateFlow<com.google.nest.platform.mesh.interaction.InteractionClient?>, homeConfig: com.google.home.HomeConfig, tokenRefresh: com.google.home.internal.impl.TokenRefresh = COMPILED_CODE, supportedFeatures: kotlin.collections.Set<com.google.home.Feature>, metricsLogger: com.google.nest.platform.mesh.api.metrics.MetricsLogger): com.google.home.HomeManager { /* compiled code */ }
}

