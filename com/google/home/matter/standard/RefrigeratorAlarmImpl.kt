// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class RefrigeratorAlarmImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.RefrigeratorAlarmTrait.Attributes) : com.google.home.matter.standard.RefrigeratorAlarm, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.RefrigeratorAlarmTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.RefrigeratorAlarmTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: kotlin.UInt /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val mask: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? /* compiled code */

    public open val state: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? /* compiled code */

    public open val supported: com.google.home.matter.standard.RefrigeratorAlarmTrait.AlarmBitmap? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.RefrigeratorAlarm.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

