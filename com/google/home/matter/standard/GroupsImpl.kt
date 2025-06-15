// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class GroupsImpl public constructor(metadata: com.google.home.Trait.TraitMetadata, client: com.google.home.matter.MatterTraitClient, attributes: com.google.home.matter.standard.GroupsTrait.Attributes) : com.google.home.matter.standard.Groups, com.google.home.matter.MatterTraitImpl, com.google.home.matter.standard.GroupsTrait.Attributes {
    public open val metadata: com.google.home.Trait.TraitMetadata /* compiled code */

    internal final val attributes: com.google.home.matter.standard.GroupsTrait.Attributes /* compiled code */

    public open val acceptedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val attributeList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val clusterRevision: kotlin.UShort /* compiled code */

    public open val featureMap: com.google.home.matter.standard.GroupsTrait.Feature /* compiled code */

    public open val generatedCommandList: kotlin.collections.List<kotlin.UInt> /* compiled code */

    public open val nameSupport: com.google.home.matter.standard.GroupsTrait.NameSupportBitmap? /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun supports(attribute: com.google.home.matter.standard.Groups.Attribute): kotlin.Boolean { /* compiled code */ }

    public open fun supports(command: com.google.home.matter.standard.Groups.Command): kotlin.Boolean { /* compiled code */ }

    public open suspend fun addGroup(groupId: kotlin.UShort, groupName: kotlin.String): com.google.home.matter.standard.GroupsTrait.AddGroupCommand.Response { /* compiled code */ }

    public open suspend fun viewGroup(groupId: kotlin.UShort): com.google.home.matter.standard.GroupsTrait.ViewGroupCommand.Response { /* compiled code */ }

    public open suspend fun getGroupMembership(groupList: kotlin.collections.List<kotlin.UShort>): com.google.home.matter.standard.GroupsTrait.GetGroupMembershipCommand.Response { /* compiled code */ }

    public open suspend fun removeGroup(groupId: kotlin.UShort): com.google.home.matter.standard.GroupsTrait.RemoveGroupCommand.Response { /* compiled code */ }

    public open suspend fun removeAllGroups(): kotlin.Unit { /* compiled code */ }

    public open suspend fun addGroupIfIdentifying(groupId: kotlin.UShort, groupName: kotlin.String): kotlin.Unit { /* compiled code */ }

    public open fun addGroupBatchable(groupId: kotlin.UShort, groupName: kotlin.String): com.google.home.BatchableCommand<com.google.home.matter.standard.GroupsTrait.AddGroupCommand.Response> { /* compiled code */ }

    public open fun viewGroupBatchable(groupId: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.GroupsTrait.ViewGroupCommand.Response> { /* compiled code */ }

    public open fun getGroupMembershipBatchable(groupList: kotlin.collections.List<kotlin.UShort>): com.google.home.BatchableCommand<com.google.home.matter.standard.GroupsTrait.GetGroupMembershipCommand.Response> { /* compiled code */ }

    public open fun removeGroupBatchable(groupId: kotlin.UShort): com.google.home.BatchableCommand<com.google.home.matter.standard.GroupsTrait.RemoveGroupCommand.Response> { /* compiled code */ }

    public open fun removeAllGroupsBatchable(): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun addGroupIfIdentifyingBatchable(groupId: kotlin.UShort, groupName: kotlin.String): com.google.home.BatchableCommand<kotlin.Unit> { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }
}

