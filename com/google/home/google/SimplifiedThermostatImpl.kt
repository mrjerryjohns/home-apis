// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class SimplifiedThermostatImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.SimplifiedThermostatTrait.Attributes) : com.google.home.google.SimplifiedThermostat, com.google.home.matter.MatterTraitImpl, com.google.home.google.SimplifiedThermostatTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.SimplifiedThermostatTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val systemMode: com.google.home.google.SimplifiedThermostatTrait.SystemModeEnum? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.SimplifiedThermostat.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.google.SimplifiedThermostat.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun setSystemMode(systemMode: com.google.home.google.SimplifiedThermostatTrait.SystemModeEnum): kotlin.Unit { /* compiled code */ }

    public open fun setSystemModeBatchable(systemMode: com.google.home.google.SimplifiedThermostatTrait.SystemModeEnum): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
