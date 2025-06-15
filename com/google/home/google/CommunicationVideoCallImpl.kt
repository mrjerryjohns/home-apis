// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.google

public final class CommunicationVideoCallImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.google.CommunicationVideoCallTrait.Attributes) : com.google.home.google.CommunicationVideoCall, com.google.home.matter.MatterTraitImpl, com.google.home.google.CommunicationVideoCallTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.google.CommunicationVideoCallTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val communicationVideoCallState: com.google.home.google.CommunicationVideoCallTrait.CommunicationVideoCallState? /* compiled code */

    public open val featureMap: com.google.home.google.CommunicationVideoCallTrait.CommunicationVideoCallFeature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.google.CommunicationVideoCall.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}
