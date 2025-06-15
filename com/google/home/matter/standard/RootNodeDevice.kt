// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package com.google.home.matter.standard

public final class RootNodeDevice public constructor(metadata: com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents, standardTraits: com.google.home.matter.standard.RootNodeDevice.StandardTraits) : com.google.home.DeviceType {
    public companion object : com.google.home.DeviceTypeFactory<com.google.home.matter.standard.RootNodeDevice> {
        public const final val TYPE_ID: kotlin.String = COMPILED_CODE /* compiled code */

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    public open val metadata: com.google.home.DeviceType.Metadata /* compiled code */

    public final val standardTraits: com.google.home.matter.standard.RootNodeDevice.StandardTraits /* compiled code */

    public open val factory: com.google.home.DeviceTypeFactory<com.google.home.matter.standard.RootNodeDevice> /* compiled code */

    public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

    public open fun hashCode(): kotlin.Int { /* compiled code */ }

    public open fun toString(): kotlin.String { /* compiled code */ }

        public final class StandardTraits public constructor(accessControl: com.google.home.matter.standard.AccessControl?, basicInformation: com.google.home.matter.standard.BasicInformation?, generalCommissioning: com.google.home.matter.standard.GeneralCommissioning?, generalDiagnostics: com.google.home.matter.standard.GeneralDiagnostics?, administratorCommissioning: com.google.home.matter.standard.AdministratorCommissioning?, operationalCredentials: com.google.home.matter.standard.OperationalCredentials?, groupKeyManagement: com.google.home.matter.standard.GroupKeyManagement?, localizationConfiguration: com.google.home.matter.standard.LocalizationConfiguration?, timeFormatLocalization: com.google.home.matter.standard.TimeFormatLocalization?, unitLocalization:
        com.google.home.matter.standard.UnitLocalization?, powerSourceConfiguration: com.google.home.matter.standard.PowerSourceConfiguration?, networkCommissioning: com.google.home.matter.standard.NetworkCommissioning?, diagnosticLogs: com.google.home.matter.standard.DiagnosticLogs?, softwareDiagnostics: com.google.home.matter.standard.SoftwareDiagnostics?, threadNetworkDiagnostics: com.google.home.matter.standard.ThreadNetworkDiagnostics?, wiFiNetworkDiagnostics: com.google.home.matter.standard.WiFiNetworkDiagnostics?, ethernetNetworkDiagnostics: com.google.home.matter.standard.EthernetNetworkDiagnostics?, icdManagement: com.google.home.matter.standard.IcdManagement?) {
        public final val accessControl: com.google.home.matter.standard.AccessControl? /* compiled code */

        public final val basicInformation: com.google.home.matter.standard.BasicInformation? /* compiled code */

        public final val generalCommissioning: com.google.home.matter.standard.GeneralCommissioning? /* compiled code */

        public final val generalDiagnostics: com.google.home.matter.standard.GeneralDiagnostics? /* compiled code */

        public final val administratorCommissioning: com.google.home.matter.standard.AdministratorCommissioning? /* compiled code */

        public final val operationalCredentials: com.google.home.matter.standard.OperationalCredentials? /* compiled code */

        public final val groupKeyManagement: com.google.home.matter.standard.GroupKeyManagement? /* compiled code */

        public final val localizationConfiguration: com.google.home.matter.standard.LocalizationConfiguration? /* compiled code */

        public final val timeFormatLocalization: com.google.home.matter.standard.TimeFormatLocalization? /* compiled code */

        public final val unitLocalization: com.google.home.matter.standard.UnitLocalization? /* compiled code */

        public final val powerSourceConfiguration: com.google.home.matter.standard.PowerSourceConfiguration? /* compiled code */

        public final val networkCommissioning: com.google.home.matter.standard.NetworkCommissioning? /* compiled code */

        public final val diagnosticLogs: com.google.home.matter.standard.DiagnosticLogs? /* compiled code */

        public final val softwareDiagnostics: com.google.home.matter.standard.SoftwareDiagnostics? /* compiled code */

        public final val threadNetworkDiagnostics: com.google.home.matter.standard.ThreadNetworkDiagnostics? /* compiled code */

        public final val wiFiNetworkDiagnostics: com.google.home.matter.standard.WiFiNetworkDiagnostics? /* compiled code */

        public final val ethernetNetworkDiagnostics: com.google.home.matter.standard.EthernetNetworkDiagnostics? /* compiled code */

        public final val icdManagement: com.google.home.matter.standard.IcdManagement? /* compiled code */

        public open operator fun equals(other: kotlin.Any?): kotlin.Boolean { /* compiled code */ }

        public open fun hashCode(): kotlin.Int { /* compiled code */ }

        public open fun toString(): kotlin.String { /* compiled code */ }
    }

    private object Factory : com.google.home.matter.MatterDeviceTypeFactory<com.google.home.matter.standard.RootNodeDevice> {
        public open fun createType(traits: kotlin.collections.Map<com.google.home.TraitFactory<*>, com.google.home.Trait?>, metadataBuilder: (kotlin.collections.List<com.google.home.Trait>?) -> com.google.home.DeviceType.Metadata, traitProvider: com.google.home.TraitProvider, eventProvider: com.google.home.HasEvents): com.google.home.matter.standard.RootNodeDevice { /* compiled code */ }
    }
}
