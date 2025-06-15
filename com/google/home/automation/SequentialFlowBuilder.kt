// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.automation

@com.google.home.automation.AutomationDsl public final class SequentialFlowBuilder public constructor(nodes: kotlin.collections.List<com.google.home.automation.Node> = COMPILED_CODE) : com.google.home.automation.AutomationFlowBuilder, com.google.home.automation.StarterNodeDsl, com.google.home.automation.ManualStarterNodeDsl, com.google.home.automation.ConditionNodeDsl, com.google.home.automation.StateReaderNodeDsl, com.google.home.automation.ActionNodeDsl, com.google.home.automation.ParallelNodeDsl, com.google.home.automation.SelectNodeDsl, com.google.home.automation.DelayNodeDsl, com.google.home.automation.SuppressionNodeDsl, com.google.home.automation.AssignmentNodeDsl {
    public final fun build(): com.google.home.automation.SequentialFlow { /* compiled code */ }

    @com.google.android.gms.common.internal.ShowFirstParty public open fun addNode(n: com.google.home.automation.Node): kotlin.Unit { /* compiled code */ }

    public open fun flowBuilder(): com.google.home.automation.AutomationFlowBuilder { /* compiled code */ }

    public open fun nodes(): kotlin.collections.List<com.google.home.automation.Node> { /* compiled code */ }
}

