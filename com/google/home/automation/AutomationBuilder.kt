// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

@com.google.home.automation.AutomationDsl public final class AutomationBuilder public constructor() {
    public final var name: kotlin.String /* compiled code */

    public final var description: kotlin.String /* compiled code */

    public final var isActive: kotlin.Boolean /* compiled code */

    public final var isRunning: kotlin.Boolean /* compiled code */

    @field:com.google.android.gms.common.internal.ShowFirstParty public final var maxExecutionCount: kotlin.Int? /* compiled code */

    @field:com.google.android.gms.common.internal.ShowFirstParty public final var clientFeatureGroup: kotlin.String? /* compiled code */

    private final lateinit var sequentialFlow: com.google.home.automation.SequentialFlow /* compiled code */

    @field:com.google.android.gms.common.internal.ShowFirstParty public final var firstPartyClientMetadata: com.google.home.platform.traits.FirstPartyClientMetadata? /* compiled code */

    public final fun name(name: kotlin.String): kotlin.Unit { /* compiled code */ }

    public final fun description(description: kotlin.String): () -> kotlin.Unit { /* compiled code */ }

    public final fun isActive(isActive: kotlin.Boolean): () -> kotlin.Unit { /* compiled code */ }

    public final fun maxExecutionCount(maxExecutionCount: kotlin.Int?): () -> kotlin.Unit { /* compiled code */ }

    public final fun sequential(block: com.google.home.automation.SequentialFlowBuilder.() -> kotlin.Unit): kotlin.Unit { /* compiled code */ }

    public final fun sequential(sequentialFlow: com.google.home.automation.SequentialFlow): kotlin.Unit { /* compiled code */ }

    public final fun build(): com.google.home.automation.BaseAutomation /* from: com.google.home.automation.DraftAutomation */ { /* compiled code */ }
}
