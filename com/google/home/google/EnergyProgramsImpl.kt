// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class EnergyProgramsImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.EnergyProgramsTrait.Attributes) : com.google.home.google.EnergyPrograms, com.google.home.matter.MatterTraitImpl, com.google.home.google.EnergyProgramsTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.EnergyProgramsTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val activeEnergyPrograms: kotlin.collections.List<kotlin.String>? /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val enrolledEnergyPrograms: kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.EnergyProgram>? /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val scheduledEnergyProgramEvents: kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.EnergyProgramEvent>? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.EnergyPrograms.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.EnergyPrograms.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun scheduleEnergyProgramEvent(eventId: kotlin.String, eventType: com.google.home.google.EnergyProgramsTrait.EventType, programName: kotlin.String, segments: kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.Segment>): kotlin.Unit { /* compiled code */ }

    public open suspend fun cancelEnergyProgramEvent(eventId: kotlin.String, programName: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open fun scheduleEnergyProgramEventBatchable(eventId: kotlin.String, eventType: com.google.home.google.EnergyProgramsTrait.EventType, programName: kotlin.String, segments: kotlin.collections.List<com.google.home.google.EnergyProgramsTrait.Segment>): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun cancelEnergyProgramEventBatchable(eventId: kotlin.String, programName: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

