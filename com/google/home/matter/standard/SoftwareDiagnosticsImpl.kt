// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class SoftwareDiagnosticsImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.SoftwareDiagnosticsTrait.Attributes) : com.google.home.matter.standard.SoftwareDiagnostics, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.SoftwareDiagnosticsTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.SoftwareDiagnosticsTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val currentHeapFree: kotlin.ULong? /* compiled code */

    public open val currentHeapHighWatermark: kotlin.ULong? /* compiled code */

    public open val currentHeapUsed: kotlin.ULong? /* compiled code */

    public open val featureMap: com.google.home.matter.standard.SoftwareDiagnosticsTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val threadMetrics: kotlin.collections.List<com.google.home.matter.standard.SoftwareDiagnosticsTrait.ThreadMetricsStruct>? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.SoftwareDiagnostics.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.SoftwareDiagnostics.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun resetWatermarks(): kotlin.Unit { /* compiled code */ }

    public open fun resetWatermarksBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
