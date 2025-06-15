// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

public interface BaseAutomation {
    public abstract val name: kotlin.String

    public abstract val description: kotlin.String

    public abstract val isActive: kotlin.Boolean

    public abstract val automationGraph: com.google.home.automation.SequentialFlow?

    public abstract val maxExecutionCount: kotlin.Int?
        public abstract @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable get

    public abstract val executionCount: kotlin.Int?
        public abstract @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable get

    public abstract val clientFeatureGroup: kotlin.String?
        public abstract @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable get

    public abstract val firstPartyClientMetadata: com.google.home.platform.traits.FirstPartyClientMetadata?
        public abstract @com.google.android.gms.common.internal.ShowFirstParty @androidx.annotation.Nullable get
}

