@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.AddressFamily
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.In6Addr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlBandwidthInformation
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlDadState
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlInterfaceOffloadRod
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlLinkLocalAddressBehavior
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlNeighborState
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlPrefixOrigin
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlRouteOrigin
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlRouteProtocol
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlRouterDiscoveryBehavior
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlSuffixOrigin
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.ScopeId
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Sockaddr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SockaddrIn
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SockaddrIn6
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SockaddrInet
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SocketAddress
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.IfOperStatus
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NdisMedium
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NdisPhysicalMedium
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfAccessType
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfAdminStatus
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfCompartmentId
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfConnectionType
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfDirectionType
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfMediaConnectState
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetLuidLh
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.TunnelType

public data class ArpSendReply(
    public var destAddress: UInt = 0u,
    public var srcAddress: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArpSendReply> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArpSendReply> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ArpSendReply =
                    ArpSendReply(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ArpSendReply) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.destAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.srcAddress)
                }
            }
    }
}

public class DnsDohServerSettings internal constructor(
    templateCtorArg: Pwstr,
    public var flags: ULong,
) {
    public var template: Pwstr = templateCtorArg
        internal set

    public constructor() : this(
        templateCtorArg = MutPtr(0L),
        flags = 0uL,
    )

    public operator fun component1(): Pwstr = this.template

    public operator fun component2(): ULong = this.flags

    public fun copy(template: Pwstr = this.template, flags: ULong = this.flags): DnsDohServerSettings = DnsDohServerSettings(templateCtorArg = template, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsDohServerSettings) return false
        if (this.template != other.template) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.template.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            template: Pwstr = MutPtr(0L),
            flags: ULong = 0uL,
        ): DnsDohServerSettings =
            DnsDohServerSettings(
                templateCtorArg = template,
                flags = flags,
            )
    }
}

public class DnsInterfaceSettings internal constructor(
    public var version: UInt,
    public var flags: ULong,
    domainCtorArg: Pwstr,
    nameServerCtorArg: Pwstr,
    searchListCtorArg: Pwstr,
    public var registrationEnabled: UInt,
    public var registerAdapterName: UInt,
    public var enableLLMNR: UInt,
    public var queryAdapterName: UInt,
    profileNameServerCtorArg: Pwstr,
) {
    public var domain: Pwstr = domainCtorArg
        internal set

    public var nameServer: Pwstr = nameServerCtorArg
        internal set

    public var searchList: Pwstr = searchListCtorArg
        internal set

    public var profileNameServer: Pwstr = profileNameServerCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        flags = 0uL,
        domainCtorArg = MutPtr(0L),
        nameServerCtorArg = MutPtr(0L),
        searchListCtorArg = MutPtr(0L),
        registrationEnabled = 0u,
        registerAdapterName = 0u,
        enableLLMNR = 0u,
        queryAdapterName = 0u,
        profileNameServerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): ULong = this.flags

    public operator fun component3(): Pwstr = this.domain

    public operator fun component4(): Pwstr = this.nameServer

    public operator fun component5(): Pwstr = this.searchList

    public operator fun component6(): UInt = this.registrationEnabled

    public operator fun component7(): UInt = this.registerAdapterName

    public operator fun component8(): UInt = this.enableLLMNR

    public operator fun component9(): UInt = this.queryAdapterName

    public operator fun component10(): Pwstr = this.profileNameServer

    public fun copy(version: UInt = this.version, flags: ULong = this.flags, domain: Pwstr = this.domain, nameServer: Pwstr = this.nameServer, searchList: Pwstr = this.searchList, registrationEnabled: UInt = this.registrationEnabled, registerAdapterName: UInt = this.registerAdapterName, enableLLMNR: UInt = this.enableLLMNR, queryAdapterName: UInt = this.queryAdapterName, profileNameServer: Pwstr = this.profileNameServer): DnsInterfaceSettings = DnsInterfaceSettings(version = version, flags = flags, domainCtorArg = domain, nameServerCtorArg = nameServer, searchListCtorArg = searchList, registrationEnabled = registrationEnabled, registerAdapterName = registerAdapterName, enableLLMNR = enableLLMNR, queryAdapterName = queryAdapterName, profileNameServerCtorArg = profileNameServer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsInterfaceSettings) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (this.domain != other.domain) return false
        if (this.nameServer != other.nameServer) return false
        if (this.searchList != other.searchList) return false
        if (this.registrationEnabled != other.registrationEnabled) return false
        if (this.registerAdapterName != other.registerAdapterName) return false
        if (this.enableLLMNR != other.enableLLMNR) return false
        if (this.queryAdapterName != other.queryAdapterName) return false
        if (this.profileNameServer != other.profileNameServer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.domain.hashCode()
        result = 31 * result + this.nameServer.hashCode()
        result = 31 * result + this.searchList.hashCode()
        result = 31 * result + this.registrationEnabled.hashCode()
        result = 31 * result + this.registerAdapterName.hashCode()
        result = 31 * result + this.enableLLMNR.hashCode()
        result = 31 * result + this.queryAdapterName.hashCode()
        result = 31 * result + this.profileNameServer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            flags: ULong = 0uL,
            domain: Pwstr = MutPtr(0L),
            nameServer: Pwstr = MutPtr(0L),
            searchList: Pwstr = MutPtr(0L),
            registrationEnabled: UInt = 0u,
            registerAdapterName: UInt = 0u,
            enableLLMNR: UInt = 0u,
            queryAdapterName: UInt = 0u,
            profileNameServer: Pwstr = MutPtr(0L),
        ): DnsInterfaceSettings =
            DnsInterfaceSettings(
                version = version,
                flags = flags,
                domainCtorArg = domain,
                nameServerCtorArg = nameServer,
                searchListCtorArg = searchList,
                registrationEnabled = registrationEnabled,
                registerAdapterName = registerAdapterName,
                enableLLMNR = enableLLMNR,
                queryAdapterName = queryAdapterName,
                profileNameServerCtorArg = profileNameServer,
            )
    }
}

public class DnsInterfaceSettings3 internal constructor(
    public var version: UInt,
    public var flags: ULong,
    domainCtorArg: Pwstr,
    nameServerCtorArg: Pwstr,
    searchListCtorArg: Pwstr,
    public var registrationEnabled: UInt,
    public var registerAdapterName: UInt,
    public var enableLLMNR: UInt,
    public var queryAdapterName: UInt,
    profileNameServerCtorArg: Pwstr,
    public var disableUnconstrainedQueries: UInt,
    supplementalSearchListCtorArg: Pwstr,
    public var cServerProperties: UInt,
    serverPropertiesCtorArg: MutPtr<DnsServerProperty>,
    public var cProfileServerProperties: UInt,
    profileServerPropertiesCtorArg: MutPtr<DnsServerProperty>,
) {
    public var domain: Pwstr = domainCtorArg
        internal set

    public var nameServer: Pwstr = nameServerCtorArg
        internal set

    public var searchList: Pwstr = searchListCtorArg
        internal set

    public var profileNameServer: Pwstr = profileNameServerCtorArg
        internal set

    public var supplementalSearchList: Pwstr = supplementalSearchListCtorArg
        internal set

    public var serverProperties: MutPtr<DnsServerProperty> = serverPropertiesCtorArg
        internal set

    public var profileServerProperties: MutPtr<DnsServerProperty> = profileServerPropertiesCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        flags = 0uL,
        domainCtorArg = MutPtr(0L),
        nameServerCtorArg = MutPtr(0L),
        searchListCtorArg = MutPtr(0L),
        registrationEnabled = 0u,
        registerAdapterName = 0u,
        enableLLMNR = 0u,
        queryAdapterName = 0u,
        profileNameServerCtorArg = MutPtr(0L),
        disableUnconstrainedQueries = 0u,
        supplementalSearchListCtorArg = MutPtr(0L),
        cServerProperties = 0u,
        serverPropertiesCtorArg = MutPtr(0L),
        cProfileServerProperties = 0u,
        profileServerPropertiesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): ULong = this.flags

    public operator fun component3(): Pwstr = this.domain

    public operator fun component4(): Pwstr = this.nameServer

    public operator fun component5(): Pwstr = this.searchList

    public operator fun component6(): UInt = this.registrationEnabled

    public operator fun component7(): UInt = this.registerAdapterName

    public operator fun component8(): UInt = this.enableLLMNR

    public operator fun component9(): UInt = this.queryAdapterName

    public operator fun component10(): Pwstr = this.profileNameServer

    public operator fun component11(): UInt = this.disableUnconstrainedQueries

    public operator fun component12(): Pwstr = this.supplementalSearchList

    public operator fun component13(): UInt = this.cServerProperties

    public operator fun component14(): MutPtr<DnsServerProperty> = this.serverProperties

    public operator fun component15(): UInt = this.cProfileServerProperties

    public operator fun component16(): MutPtr<DnsServerProperty> = this.profileServerProperties

    public fun copy(version: UInt = this.version, flags: ULong = this.flags, domain: Pwstr = this.domain, nameServer: Pwstr = this.nameServer, searchList: Pwstr = this.searchList, registrationEnabled: UInt = this.registrationEnabled, registerAdapterName: UInt = this.registerAdapterName, enableLLMNR: UInt = this.enableLLMNR, queryAdapterName: UInt = this.queryAdapterName, profileNameServer: Pwstr = this.profileNameServer, disableUnconstrainedQueries: UInt = this.disableUnconstrainedQueries, supplementalSearchList: Pwstr = this.supplementalSearchList, cServerProperties: UInt = this.cServerProperties, serverProperties: MutPtr<DnsServerProperty> = this.serverProperties, cProfileServerProperties: UInt = this.cProfileServerProperties, profileServerProperties: MutPtr<DnsServerProperty> = this.profileServerProperties): DnsInterfaceSettings3 = DnsInterfaceSettings3(version = version, flags = flags, domainCtorArg = domain, nameServerCtorArg = nameServer, searchListCtorArg = searchList, registrationEnabled = registrationEnabled, registerAdapterName = registerAdapterName, enableLLMNR = enableLLMNR, queryAdapterName = queryAdapterName, profileNameServerCtorArg = profileNameServer, disableUnconstrainedQueries = disableUnconstrainedQueries, supplementalSearchListCtorArg = supplementalSearchList, cServerProperties = cServerProperties, serverPropertiesCtorArg = serverProperties, cProfileServerProperties = cProfileServerProperties, profileServerPropertiesCtorArg = profileServerProperties)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsInterfaceSettings3) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (this.domain != other.domain) return false
        if (this.nameServer != other.nameServer) return false
        if (this.searchList != other.searchList) return false
        if (this.registrationEnabled != other.registrationEnabled) return false
        if (this.registerAdapterName != other.registerAdapterName) return false
        if (this.enableLLMNR != other.enableLLMNR) return false
        if (this.queryAdapterName != other.queryAdapterName) return false
        if (this.profileNameServer != other.profileNameServer) return false
        if (this.disableUnconstrainedQueries != other.disableUnconstrainedQueries) return false
        if (this.supplementalSearchList != other.supplementalSearchList) return false
        if (this.cServerProperties != other.cServerProperties) return false
        if (this.serverProperties != other.serverProperties) return false
        if (this.cProfileServerProperties != other.cProfileServerProperties) return false
        if (this.profileServerProperties != other.profileServerProperties) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.domain.hashCode()
        result = 31 * result + this.nameServer.hashCode()
        result = 31 * result + this.searchList.hashCode()
        result = 31 * result + this.registrationEnabled.hashCode()
        result = 31 * result + this.registerAdapterName.hashCode()
        result = 31 * result + this.enableLLMNR.hashCode()
        result = 31 * result + this.queryAdapterName.hashCode()
        result = 31 * result + this.profileNameServer.hashCode()
        result = 31 * result + this.disableUnconstrainedQueries.hashCode()
        result = 31 * result + this.supplementalSearchList.hashCode()
        result = 31 * result + this.cServerProperties.hashCode()
        result = 31 * result + this.serverProperties.hashCode()
        result = 31 * result + this.cProfileServerProperties.hashCode()
        result = 31 * result + this.profileServerProperties.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            flags: ULong = 0uL,
            domain: Pwstr = MutPtr(0L),
            nameServer: Pwstr = MutPtr(0L),
            searchList: Pwstr = MutPtr(0L),
            registrationEnabled: UInt = 0u,
            registerAdapterName: UInt = 0u,
            enableLLMNR: UInt = 0u,
            queryAdapterName: UInt = 0u,
            profileNameServer: Pwstr = MutPtr(0L),
            disableUnconstrainedQueries: UInt = 0u,
            supplementalSearchList: Pwstr = MutPtr(0L),
            cServerProperties: UInt = 0u,
            serverProperties: MutPtr<DnsServerProperty> = MutPtr(0L),
            cProfileServerProperties: UInt = 0u,
            profileServerProperties: MutPtr<DnsServerProperty> = MutPtr(0L),
        ): DnsInterfaceSettings3 =
            DnsInterfaceSettings3(
                version = version,
                flags = flags,
                domainCtorArg = domain,
                nameServerCtorArg = nameServer,
                searchListCtorArg = searchList,
                registrationEnabled = registrationEnabled,
                registerAdapterName = registerAdapterName,
                enableLLMNR = enableLLMNR,
                queryAdapterName = queryAdapterName,
                profileNameServerCtorArg = profileNameServer,
                disableUnconstrainedQueries = disableUnconstrainedQueries,
                supplementalSearchListCtorArg = supplementalSearchList,
                cServerProperties = cServerProperties,
                serverPropertiesCtorArg = serverProperties,
                cProfileServerProperties = cProfileServerProperties,
                profileServerPropertiesCtorArg = profileServerProperties,
            )
    }
}

public class DnsInterfaceSettings4 internal constructor(
    public var version: UInt,
    public var flags: ULong,
    domainCtorArg: Pwstr,
    nameServerCtorArg: Pwstr,
    searchListCtorArg: Pwstr,
    public var registrationEnabled: UInt,
    public var registerAdapterName: UInt,
    public var enableLLMNR: UInt,
    public var queryAdapterName: UInt,
    profileNameServerCtorArg: Pwstr,
    public var disableUnconstrainedQueries: UInt,
    supplementalSearchListCtorArg: Pwstr,
    public var cServerProperties: UInt,
    serverPropertiesCtorArg: MutPtr<DnsServerProperty>,
    public var cProfileServerProperties: UInt,
    profileServerPropertiesCtorArg: MutPtr<DnsServerProperty>,
    public var encryptedDnsAdapterFlags: UInt,
) {
    public var domain: Pwstr = domainCtorArg
        internal set

    public var nameServer: Pwstr = nameServerCtorArg
        internal set

    public var searchList: Pwstr = searchListCtorArg
        internal set

    public var profileNameServer: Pwstr = profileNameServerCtorArg
        internal set

    public var supplementalSearchList: Pwstr = supplementalSearchListCtorArg
        internal set

    public var serverProperties: MutPtr<DnsServerProperty> = serverPropertiesCtorArg
        internal set

    public var profileServerProperties: MutPtr<DnsServerProperty> = profileServerPropertiesCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        flags = 0uL,
        domainCtorArg = MutPtr(0L),
        nameServerCtorArg = MutPtr(0L),
        searchListCtorArg = MutPtr(0L),
        registrationEnabled = 0u,
        registerAdapterName = 0u,
        enableLLMNR = 0u,
        queryAdapterName = 0u,
        profileNameServerCtorArg = MutPtr(0L),
        disableUnconstrainedQueries = 0u,
        supplementalSearchListCtorArg = MutPtr(0L),
        cServerProperties = 0u,
        serverPropertiesCtorArg = MutPtr(0L),
        cProfileServerProperties = 0u,
        profileServerPropertiesCtorArg = MutPtr(0L),
        encryptedDnsAdapterFlags = 0u,
    )

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            flags: ULong = 0uL,
            domain: Pwstr = MutPtr(0L),
            nameServer: Pwstr = MutPtr(0L),
            searchList: Pwstr = MutPtr(0L),
            registrationEnabled: UInt = 0u,
            registerAdapterName: UInt = 0u,
            enableLLMNR: UInt = 0u,
            queryAdapterName: UInt = 0u,
            profileNameServer: Pwstr = MutPtr(0L),
            disableUnconstrainedQueries: UInt = 0u,
            supplementalSearchList: Pwstr = MutPtr(0L),
            cServerProperties: UInt = 0u,
            serverProperties: MutPtr<DnsServerProperty> = MutPtr(0L),
            cProfileServerProperties: UInt = 0u,
            profileServerProperties: MutPtr<DnsServerProperty> = MutPtr(0L),
            encryptedDnsAdapterFlags: UInt = 0u,
        ): DnsInterfaceSettings4 =
            DnsInterfaceSettings4(
                version = version,
                flags = flags,
                domainCtorArg = domain,
                nameServerCtorArg = nameServer,
                searchListCtorArg = searchList,
                registrationEnabled = registrationEnabled,
                registerAdapterName = registerAdapterName,
                enableLLMNR = enableLLMNR,
                queryAdapterName = queryAdapterName,
                profileNameServerCtorArg = profileNameServer,
                disableUnconstrainedQueries = disableUnconstrainedQueries,
                supplementalSearchListCtorArg = supplementalSearchList,
                cServerProperties = cServerProperties,
                serverPropertiesCtorArg = serverProperties,
                cProfileServerProperties = cProfileServerProperties,
                profileServerPropertiesCtorArg = profileServerProperties,
                encryptedDnsAdapterFlags = encryptedDnsAdapterFlags,
            )
    }
}

public class DnsInterfaceSettingsEx internal constructor(
    public var settingsV1: DnsInterfaceSettings,
    public var disableUnconstrainedQueries: UInt,
    supplementalSearchListCtorArg: Pwstr,
) {
    public var supplementalSearchList: Pwstr = supplementalSearchListCtorArg
        internal set

    public constructor() : this(
        settingsV1 = DnsInterfaceSettings(),
        disableUnconstrainedQueries = 0u,
        supplementalSearchListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): DnsInterfaceSettings = this.settingsV1

    public operator fun component2(): UInt = this.disableUnconstrainedQueries

    public operator fun component3(): Pwstr = this.supplementalSearchList

    public fun copy(settingsV1: DnsInterfaceSettings = this.settingsV1, disableUnconstrainedQueries: UInt = this.disableUnconstrainedQueries, supplementalSearchList: Pwstr = this.supplementalSearchList): DnsInterfaceSettingsEx = DnsInterfaceSettingsEx(settingsV1 = settingsV1, disableUnconstrainedQueries = disableUnconstrainedQueries, supplementalSearchListCtorArg = supplementalSearchList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsInterfaceSettingsEx) return false
        if (this.settingsV1 != other.settingsV1) return false
        if (this.disableUnconstrainedQueries != other.disableUnconstrainedQueries) return false
        if (this.supplementalSearchList != other.supplementalSearchList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.settingsV1.hashCode()
        result = 31 * result + this.disableUnconstrainedQueries.hashCode()
        result = 31 * result + this.supplementalSearchList.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            settingsV1: DnsInterfaceSettings = DnsInterfaceSettings(),
            disableUnconstrainedQueries: UInt = 0u,
            supplementalSearchList: Pwstr = MutPtr(0L),
        ): DnsInterfaceSettingsEx =
            DnsInterfaceSettingsEx(
                settingsV1 = settingsV1,
                disableUnconstrainedQueries = disableUnconstrainedQueries,
                supplementalSearchListCtorArg = supplementalSearchList,
            )
    }
}

public data class DnsServerProperty(
    public var version: UInt = 0u,
    public var serverIndex: UInt = 0u,
    public var type: DnsServerPropertyType = 0,
    public var property: DnsServerPropertyTypes = DnsServerPropertyTypes(),
)

public class DnsServerPropertyTypes internal constructor(
    dohSettingsCtorArg: MutPtr<DnsDohServerSettings>,
) {
    public var dohSettings: MutPtr<DnsDohServerSettings> = dohSettingsCtorArg
        internal set

    public constructor() : this(
        dohSettingsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<DnsDohServerSettings> = this.dohSettings

    public fun copy(dohSettings: MutPtr<DnsDohServerSettings> = this.dohSettings): DnsServerPropertyTypes = DnsServerPropertyTypes(dohSettingsCtorArg = dohSettings)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsServerPropertyTypes) return false
        if (this.dohSettings != other.dohSettings) return false
        return true
    }

    override fun hashCode(): Int = this.dohSettings.hashCode()

    public companion object {
        public operator fun invoke(
            dohSettings: MutPtr<DnsDohServerSettings> = MutPtr(0L),
        ): DnsServerPropertyTypes =
            DnsServerPropertyTypes(
                dohSettingsCtorArg = dohSettings,
            )
    }
}

public class DnsSettings internal constructor(
    public var version: UInt,
    public var flags: ULong,
    hostnameCtorArg: Pwstr,
    domainCtorArg: Pwstr,
    searchListCtorArg: Pwstr,
) {
    public var hostname: Pwstr = hostnameCtorArg
        internal set

    public var domain: Pwstr = domainCtorArg
        internal set

    public var searchList: Pwstr = searchListCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        flags = 0uL,
        hostnameCtorArg = MutPtr(0L),
        domainCtorArg = MutPtr(0L),
        searchListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): ULong = this.flags

    public operator fun component3(): Pwstr = this.hostname

    public operator fun component4(): Pwstr = this.domain

    public operator fun component5(): Pwstr = this.searchList

    public fun copy(version: UInt = this.version, flags: ULong = this.flags, hostname: Pwstr = this.hostname, domain: Pwstr = this.domain, searchList: Pwstr = this.searchList): DnsSettings = DnsSettings(version = version, flags = flags, hostnameCtorArg = hostname, domainCtorArg = domain, searchListCtorArg = searchList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsSettings) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (this.hostname != other.hostname) return false
        if (this.domain != other.domain) return false
        if (this.searchList != other.searchList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.hostname.hashCode()
        result = 31 * result + this.domain.hashCode()
        result = 31 * result + this.searchList.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            flags: ULong = 0uL,
            hostname: Pwstr = MutPtr(0L),
            domain: Pwstr = MutPtr(0L),
            searchList: Pwstr = MutPtr(0L),
        ): DnsSettings =
            DnsSettings(
                version = version,
                flags = flags,
                hostnameCtorArg = hostname,
                domainCtorArg = domain,
                searchListCtorArg = searchList,
            )
    }
}

public class DnsSettings2 internal constructor(
    public var version: UInt,
    public var flags: ULong,
    hostnameCtorArg: Pwstr,
    domainCtorArg: Pwstr,
    searchListCtorArg: Pwstr,
    public var settingFlags: ULong,
) {
    public var hostname: Pwstr = hostnameCtorArg
        internal set

    public var domain: Pwstr = domainCtorArg
        internal set

    public var searchList: Pwstr = searchListCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        flags = 0uL,
        hostnameCtorArg = MutPtr(0L),
        domainCtorArg = MutPtr(0L),
        searchListCtorArg = MutPtr(0L),
        settingFlags = 0uL,
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): ULong = this.flags

    public operator fun component3(): Pwstr = this.hostname

    public operator fun component4(): Pwstr = this.domain

    public operator fun component5(): Pwstr = this.searchList

    public operator fun component6(): ULong = this.settingFlags

    public fun copy(version: UInt = this.version, flags: ULong = this.flags, hostname: Pwstr = this.hostname, domain: Pwstr = this.domain, searchList: Pwstr = this.searchList, settingFlags: ULong = this.settingFlags): DnsSettings2 = DnsSettings2(version = version, flags = flags, hostnameCtorArg = hostname, domainCtorArg = domain, searchListCtorArg = searchList, settingFlags = settingFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsSettings2) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (this.hostname != other.hostname) return false
        if (this.domain != other.domain) return false
        if (this.searchList != other.searchList) return false
        if (this.settingFlags != other.settingFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.hostname.hashCode()
        result = 31 * result + this.domain.hashCode()
        result = 31 * result + this.searchList.hashCode()
        result = 31 * result + this.settingFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            flags: ULong = 0uL,
            hostname: Pwstr = MutPtr(0L),
            domain: Pwstr = MutPtr(0L),
            searchList: Pwstr = MutPtr(0L),
            settingFlags: ULong = 0uL,
        ): DnsSettings2 =
            DnsSettings2(
                version = version,
                flags = flags,
                hostnameCtorArg = hostname,
                domainCtorArg = domain,
                searchListCtorArg = searchList,
                settingFlags = settingFlags,
            )
    }
}

public class FixedInfoW2ksp1 internal constructor(
    public var hostName: ByteArray,
    public var domainName: ByteArray,
    currentDnsServerCtorArg: MutPtr<IpAddrString>,
    public var dnsServerList: IpAddrString,
    public var nodeType: UInt,
    public var scopeId: ByteArray,
    public var enableRouting: UInt,
    public var enableProxy: UInt,
    public var enableDns: UInt,
) {
    public var currentDnsServer: MutPtr<IpAddrString> = currentDnsServerCtorArg
        internal set

    public constructor() : this(
        hostName = ByteArray(132),
        domainName = ByteArray(132),
        currentDnsServerCtorArg = MutPtr(0L),
        dnsServerList = IpAddrString(),
        nodeType = 0u,
        scopeId = ByteArray(260),
        enableRouting = 0u,
        enableProxy = 0u,
        enableDns = 0u,
    )

    public operator fun component1(): ByteArray = this.hostName

    public operator fun component2(): ByteArray = this.domainName

    public operator fun component3(): MutPtr<IpAddrString> = this.currentDnsServer

    public operator fun component4(): IpAddrString = this.dnsServerList

    public operator fun component5(): UInt = this.nodeType

    public operator fun component6(): ByteArray = this.scopeId

    public operator fun component7(): UInt = this.enableRouting

    public operator fun component8(): UInt = this.enableProxy

    public operator fun component9(): UInt = this.enableDns

    public fun copy(hostName: ByteArray = this.hostName, domainName: ByteArray = this.domainName, currentDnsServer: MutPtr<IpAddrString> = this.currentDnsServer, dnsServerList: IpAddrString = this.dnsServerList, nodeType: UInt = this.nodeType, scopeId: ByteArray = this.scopeId, enableRouting: UInt = this.enableRouting, enableProxy: UInt = this.enableProxy, enableDns: UInt = this.enableDns): FixedInfoW2ksp1 = FixedInfoW2ksp1(hostName = hostName, domainName = domainName, currentDnsServerCtorArg = currentDnsServer, dnsServerList = dnsServerList, nodeType = nodeType, scopeId = scopeId, enableRouting = enableRouting, enableProxy = enableProxy, enableDns = enableDns)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FixedInfoW2ksp1) return false
        if (!this.hostName.contentEquals(other.hostName)) return false
        if (!this.domainName.contentEquals(other.domainName)) return false
        if (this.currentDnsServer != other.currentDnsServer) return false
        if (this.dnsServerList != other.dnsServerList) return false
        if (this.nodeType != other.nodeType) return false
        if (!this.scopeId.contentEquals(other.scopeId)) return false
        if (this.enableRouting != other.enableRouting) return false
        if (this.enableProxy != other.enableProxy) return false
        if (this.enableDns != other.enableDns) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hostName.contentHashCode()
        result = 31 * result + this.domainName.contentHashCode()
        result = 31 * result + this.currentDnsServer.hashCode()
        result = 31 * result + this.dnsServerList.hashCode()
        result = 31 * result + this.nodeType.hashCode()
        result = 31 * result + this.scopeId.contentHashCode()
        result = 31 * result + this.enableRouting.hashCode()
        result = 31 * result + this.enableProxy.hashCode()
        result = 31 * result + this.enableDns.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FixedInfoW2ksp1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FixedInfoW2ksp1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 600L
                override fun readNative(addr: Long): FixedInfoW2ksp1 =
                    FixedInfoW2ksp1(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (132).toInt())
                        ).readNative(addr).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (132).toInt())
                        ).readNative(addr + 132L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IpAddrString>(64)
                        ).readNative(addr + 264L),
                        (IpAddrString.typeLayout()).readNative(addr + 272L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 320L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 324L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 584L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 588L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 592L),
                    )
                override fun writeNative(addr: Long, value: FixedInfoW2ksp1) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (132).toInt())
                    ).writeNative(addr, value.hostName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (132).toInt())
                    ).writeNative(addr + 132L, value.domainName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IpAddrString>(64)
                    ).writeNative(addr + 264L, value.currentDnsServer)
                    (IpAddrString.typeLayout()).writeNative(addr + 272L, value.dnsServerList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 320L, value.nodeType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 324L, value.scopeId.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 584L, value.enableRouting)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 588L, value.enableProxy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 592L, value.enableDns)
                }
            }

        public operator fun invoke(
            hostName: ByteArray = ByteArray(132),
            domainName: ByteArray = ByteArray(132),
            currentDnsServer: MutPtr<IpAddrString> = MutPtr(0L),
            dnsServerList: IpAddrString = IpAddrString(),
            nodeType: UInt = 0u,
            scopeId: ByteArray = ByteArray(260),
            enableRouting: UInt = 0u,
            enableProxy: UInt = 0u,
            enableDns: UInt = 0u,
        ): FixedInfoW2ksp1 =
            FixedInfoW2ksp1(
                hostName = hostName,
                domainName = domainName,
                currentDnsServerCtorArg = currentDnsServer,
                dnsServerList = dnsServerList,
                nodeType = nodeType,
                scopeId = scopeId,
                enableRouting = enableRouting,
                enableProxy = enableProxy,
                enableDns = enableDns,
            )
    }
}

public data class Icmpv6EchoReplyLh(
    public var address: Ipv6AddressEx = Ipv6AddressEx(),
    public var status: UInt = 0u,
    public var roundTripTime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Icmpv6EchoReplyLh> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Icmpv6EchoReplyLh> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): Icmpv6EchoReplyLh =
                    Icmpv6EchoReplyLh(
                        (Ipv6AddressEx.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Icmpv6EchoReplyLh) {
                    (Ipv6AddressEx.typeLayout()).writeNative(addr, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.status)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.roundTripTime)
                }
            }
    }
}

public class IcmpEchoReply internal constructor(
    public var address: UInt,
    public var status: UInt,
    public var roundTripTime: UInt,
    public var dataSize: UShort,
    public var reserved: UShort,
    dataCtorArg: MutPtr<CVoid>,
    public var options: IpOptionInformation,
) {
    public var data: MutPtr<CVoid> = dataCtorArg
        internal set

    public constructor() : this(
        address = 0u,
        status = 0u,
        roundTripTime = 0u,
        dataSize = 0u,
        reserved = 0u,
        dataCtorArg = MutPtr(0L),
        options = IpOptionInformation(),
    )

    public operator fun component1(): UInt = this.address

    public operator fun component2(): UInt = this.status

    public operator fun component3(): UInt = this.roundTripTime

    public operator fun component4(): UShort = this.dataSize

    public operator fun component5(): UShort = this.reserved

    public operator fun component6(): MutPtr<CVoid> = this.data

    public operator fun component7(): IpOptionInformation = this.options

    public fun copy(address: UInt = this.address, status: UInt = this.status, roundTripTime: UInt = this.roundTripTime, dataSize: UShort = this.dataSize, reserved: UShort = this.reserved, data: MutPtr<CVoid> = this.data, options: IpOptionInformation = this.options): IcmpEchoReply = IcmpEchoReply(address = address, status = status, roundTripTime = roundTripTime, dataSize = dataSize, reserved = reserved, dataCtorArg = data, options = options)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IcmpEchoReply) return false
        if (this.address != other.address) return false
        if (this.status != other.status) return false
        if (this.roundTripTime != other.roundTripTime) return false
        if (this.dataSize != other.dataSize) return false
        if (this.reserved != other.reserved) return false
        if (this.data != other.data) return false
        if (this.options != other.options) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.address.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.roundTripTime.hashCode()
        result = 31 * result + this.dataSize.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.options.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IcmpEchoReply> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IcmpEchoReply> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): IcmpEchoReply =
                    IcmpEchoReply(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (IpOptionInformation.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: IcmpEchoReply) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.status)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.roundTripTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.dataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.data)
                    (IpOptionInformation.typeLayout()).writeNative(addr + 24L, value.options)
                }
            }

        public operator fun invoke(
            address: UInt = 0u,
            status: UInt = 0u,
            roundTripTime: UInt = 0u,
            dataSize: UShort = 0u,
            reserved: UShort = 0u,
            data: MutPtr<CVoid> = MutPtr(0L),
            options: IpOptionInformation = IpOptionInformation(),
        ): IcmpEchoReply =
            IcmpEchoReply(
                address = address,
                status = status,
                roundTripTime = roundTripTime,
                dataSize = dataSize,
                reserved = reserved,
                dataCtorArg = data,
                options = options,
            )
    }
}

public class IcmpEchoReply32 internal constructor(
    public var address: UInt,
    public var status: UInt,
    public var roundTripTime: UInt,
    public var dataSize: UShort,
    public var reserved: UShort,
    dataCtorArg: MutPtr<CVoid>,
    public var options: IpOptionInformation32,
) {
    public var data: MutPtr<CVoid> = dataCtorArg
        internal set

    public constructor() : this(
        address = 0u,
        status = 0u,
        roundTripTime = 0u,
        dataSize = 0u,
        reserved = 0u,
        dataCtorArg = MutPtr(0L),
        options = IpOptionInformation32(),
    )

    public operator fun component1(): UInt = this.address

    public operator fun component2(): UInt = this.status

    public operator fun component3(): UInt = this.roundTripTime

    public operator fun component4(): UShort = this.dataSize

    public operator fun component5(): UShort = this.reserved

    public operator fun component6(): MutPtr<CVoid> = this.data

    public operator fun component7(): IpOptionInformation32 = this.options

    public fun copy(address: UInt = this.address, status: UInt = this.status, roundTripTime: UInt = this.roundTripTime, dataSize: UShort = this.dataSize, reserved: UShort = this.reserved, data: MutPtr<CVoid> = this.data, options: IpOptionInformation32 = this.options): IcmpEchoReply32 = IcmpEchoReply32(address = address, status = status, roundTripTime = roundTripTime, dataSize = dataSize, reserved = reserved, dataCtorArg = data, options = options)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IcmpEchoReply32) return false
        if (this.address != other.address) return false
        if (this.status != other.status) return false
        if (this.roundTripTime != other.roundTripTime) return false
        if (this.dataSize != other.dataSize) return false
        if (this.reserved != other.reserved) return false
        if (this.data != other.data) return false
        if (this.options != other.options) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.address.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.roundTripTime.hashCode()
        result = 31 * result + this.dataSize.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.options.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IcmpEchoReply32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IcmpEchoReply32> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): IcmpEchoReply32 =
                    IcmpEchoReply32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (IpOptionInformation32.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: IcmpEchoReply32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.status)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.roundTripTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.dataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.data)
                    (IpOptionInformation32.typeLayout()).writeNative(addr + 24L, value.options)
                }
            }

        public operator fun invoke(
            address: UInt = 0u,
            status: UInt = 0u,
            roundTripTime: UInt = 0u,
            dataSize: UShort = 0u,
            reserved: UShort = 0u,
            data: MutPtr<CVoid> = MutPtr(0L),
            options: IpOptionInformation32 = IpOptionInformation32(),
        ): IcmpEchoReply32 =
            IcmpEchoReply32(
                address = address,
                status = status,
                roundTripTime = roundTripTime,
                dataSize = dataSize,
                reserved = reserved,
                dataCtorArg = data,
                options = options,
            )
    }
}

public data class InterfaceHardwareCrosstimestamp(
    public var systemTimestamp1: ULong = 0uL,
    public var hardwareClockTimestamp: ULong = 0uL,
    public var systemTimestamp2: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InterfaceHardwareCrosstimestamp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InterfaceHardwareCrosstimestamp> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): InterfaceHardwareCrosstimestamp =
                    InterfaceHardwareCrosstimestamp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: InterfaceHardwareCrosstimestamp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.systemTimestamp1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.hardwareClockTimestamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.systemTimestamp2)
                }
            }
    }
}

public data class InterfaceHardwareTimestampCapabilities(
    public var ptpV2OverUdpIPv4EventMessageReceive: Boolean = false,
    public var ptpV2OverUdpIPv4AllMessageReceive: Boolean = false,
    public var ptpV2OverUdpIPv4EventMessageTransmit: Boolean = false,
    public var ptpV2OverUdpIPv4AllMessageTransmit: Boolean = false,
    public var ptpV2OverUdpIPv6EventMessageReceive: Boolean = false,
    public var ptpV2OverUdpIPv6AllMessageReceive: Boolean = false,
    public var ptpV2OverUdpIPv6EventMessageTransmit: Boolean = false,
    public var ptpV2OverUdpIPv6AllMessageTransmit: Boolean = false,
    public var allReceive: Boolean = false,
    public var allTransmit: Boolean = false,
    public var taggedTransmit: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InterfaceHardwareTimestampCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InterfaceHardwareTimestampCapabilities> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 11L
                override fun readNative(addr: Long): InterfaceHardwareTimestampCapabilities =
                    InterfaceHardwareTimestampCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: InterfaceHardwareTimestampCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.ptpV2OverUdpIPv4EventMessageReceive)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.ptpV2OverUdpIPv4AllMessageReceive)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 2L, value.ptpV2OverUdpIPv4EventMessageTransmit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 3L, value.ptpV2OverUdpIPv4AllMessageTransmit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.ptpV2OverUdpIPv6EventMessageReceive)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 5L, value.ptpV2OverUdpIPv6AllMessageReceive)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 6L, value.ptpV2OverUdpIPv6EventMessageTransmit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 7L, value.ptpV2OverUdpIPv6AllMessageTransmit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.allReceive)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 9L, value.allTransmit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 10L, value.taggedTransmit)
                }
            }
    }
}

public data class InterfaceSoftwareTimestampCapabilities(
    public var allReceive: Boolean = false,
    public var allTransmit: Boolean = false,
    public var taggedTransmit: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InterfaceSoftwareTimestampCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InterfaceSoftwareTimestampCapabilities> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 3L
                override fun readNative(addr: Long): InterfaceSoftwareTimestampCapabilities =
                    InterfaceSoftwareTimestampCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: InterfaceSoftwareTimestampCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.allReceive)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.allTransmit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 2L, value.taggedTransmit)
                }
            }
    }
}

public data class InterfaceTimestampCapabilities(
    public var hardwareClockFrequencyHz: ULong = 0uL,
    public var supportsCrossTimestamp: Boolean = false,
    public var hardwareCapabilities: InterfaceHardwareTimestampCapabilities = InterfaceHardwareTimestampCapabilities(),
    public var softwareCapabilities: InterfaceSoftwareTimestampCapabilities = InterfaceSoftwareTimestampCapabilities(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InterfaceTimestampCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InterfaceTimestampCapabilities> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): InterfaceTimestampCapabilities =
                    InterfaceTimestampCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (InterfaceHardwareTimestampCapabilities.typeLayout()).readNative(addr + 9L),
                        (InterfaceSoftwareTimestampCapabilities.typeLayout()).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: InterfaceTimestampCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.hardwareClockFrequencyHz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.supportsCrossTimestamp)
                    (InterfaceHardwareTimestampCapabilities.typeLayout()).writeNative(addr + 9L, value.hardwareCapabilities)
                    (InterfaceSoftwareTimestampCapabilities.typeLayout()).writeNative(addr + 20L, value.softwareCapabilities)
                }
            }
    }
}

public data class Ipv6AddressEx(
    public var sin6Port: UShort = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: UShortArray = UShortArray(8),
    public var sin6ScopeId: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ipv6AddressEx) return false
        if (this.sin6Port != other.sin6Port) return false
        if (this.sin6Flowinfo != other.sin6Flowinfo) return false
        if (!this.sin6Addr.contentEquals(other.sin6Addr)) return false
        if (this.sin6ScopeId != other.sin6ScopeId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sin6Port.hashCode()
        result = 31 * result + this.sin6Flowinfo.hashCode()
        result = 31 * result + this.sin6Addr.contentHashCode()
        result = 31 * result + this.sin6ScopeId.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6AddressEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6AddressEx> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 26L
                override fun readNative(addr: Long): Ipv6AddressEx =
                    Ipv6AddressEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (8).toInt())
                        ).readNative(addr + 6L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 22L),
                    )
                override fun writeNative(addr: Long, value: Ipv6AddressEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sin6Port)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 2L, value.sin6Flowinfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (8).toInt())
                    ).writeNative(addr + 6L, value.sin6Addr.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 22L, value.sin6ScopeId)
                }
            }
    }
}

public class IpAdapterAddressesLh internal constructor(
    public var anonymous1: IpAdapterAddressesLh0,
    nextCtorArg: MutPtr<IpAdapterAddressesLh>,
    adapterNameCtorArg: Pstr,
    firstUnicastAddressCtorArg: MutPtr<IpAdapterUnicastAddressLh>,
    firstAnycastAddressCtorArg: MutPtr<IpAdapterAnycastAddressXp>,
    firstMulticastAddressCtorArg: MutPtr<IpAdapterMulticastAddressXp>,
    firstDnsServerAddressCtorArg: MutPtr<IpAdapterDnsServerAddressXp>,
    dnsSuffixCtorArg: Pwstr,
    descriptionCtorArg: Pwstr,
    friendlyNameCtorArg: Pwstr,
    public var physicalAddress: UByteArray,
    public var physicalAddressLength: UInt,
    public var anonymous2: IpAdapterAddressesLh1,
    public var mtu: UInt,
    public var ifType: UInt,
    public var operStatus: IfOperStatus,
    public var ipv6IfIndex: UInt,
    public var zoneIndices: UIntArray,
    firstPrefixCtorArg: MutPtr<IpAdapterPrefixXp>,
    public var transmitLinkSpeed: ULong,
    public var receiveLinkSpeed: ULong,
    firstWinsServerAddressCtorArg: MutPtr<IpAdapterWinsServerAddressLh>,
    firstGatewayAddressCtorArg: MutPtr<IpAdapterGatewayAddressLh>,
    public var ipv4Metric: UInt,
    public var ipv6Metric: UInt,
    public var luid: NetLuidLh,
    public var dhcpv4Server: SocketAddress,
    public var compartmentId: NetIfCompartmentId,
    public var networkGuid: Guid,
    public var connectionType: NetIfConnectionType,
    public var tunnelType: TunnelType,
    public var dhcpv6Server: SocketAddress,
    public var dhcpv6ClientDuid: UByteArray,
    public var dhcpv6ClientDuidLength: UInt,
    public var dhcpv6Iaid: UInt,
    firstDnsSuffixCtorArg: MutPtr<IpAdapterDnsSuffix>,
) {
    public var next: MutPtr<IpAdapterAddressesLh> = nextCtorArg
        internal set

    public var adapterName: Pstr = adapterNameCtorArg
        internal set

    public var firstUnicastAddress: MutPtr<IpAdapterUnicastAddressLh> = firstUnicastAddressCtorArg
        internal set

    public var firstAnycastAddress: MutPtr<IpAdapterAnycastAddressXp> = firstAnycastAddressCtorArg
        internal set

    public var firstMulticastAddress: MutPtr<IpAdapterMulticastAddressXp> = firstMulticastAddressCtorArg
        internal set

    public var firstDnsServerAddress: MutPtr<IpAdapterDnsServerAddressXp> = firstDnsServerAddressCtorArg
        internal set

    public var dnsSuffix: Pwstr = dnsSuffixCtorArg
        internal set

    public var description: Pwstr = descriptionCtorArg
        internal set

    public var friendlyName: Pwstr = friendlyNameCtorArg
        internal set

    public var firstPrefix: MutPtr<IpAdapterPrefixXp> = firstPrefixCtorArg
        internal set

    public var firstWinsServerAddress: MutPtr<IpAdapterWinsServerAddressLh> = firstWinsServerAddressCtorArg
        internal set

    public var firstGatewayAddress: MutPtr<IpAdapterGatewayAddressLh> = firstGatewayAddressCtorArg
        internal set

    public var firstDnsSuffix: MutPtr<IpAdapterDnsSuffix> = firstDnsSuffixCtorArg
        internal set

    public constructor() : this(
        anonymous1 = IpAdapterAddressesLh0(),
        nextCtorArg = MutPtr(0L),
        adapterNameCtorArg = MutPtr(0L),
        firstUnicastAddressCtorArg = MutPtr(0L),
        firstAnycastAddressCtorArg = MutPtr(0L),
        firstMulticastAddressCtorArg = MutPtr(0L),
        firstDnsServerAddressCtorArg = MutPtr(0L),
        dnsSuffixCtorArg = MutPtr(0L),
        descriptionCtorArg = MutPtr(0L),
        friendlyNameCtorArg = MutPtr(0L),
        physicalAddress = UByteArray(8),
        physicalAddressLength = 0u,
        anonymous2 = IpAdapterAddressesLh1(),
        mtu = 0u,
        ifType = 0u,
        operStatus = 0,
        ipv6IfIndex = 0u,
        zoneIndices = UIntArray(16),
        firstPrefixCtorArg = MutPtr(0L),
        transmitLinkSpeed = 0uL,
        receiveLinkSpeed = 0uL,
        firstWinsServerAddressCtorArg = MutPtr(0L),
        firstGatewayAddressCtorArg = MutPtr(0L),
        ipv4Metric = 0u,
        ipv6Metric = 0u,
        luid = NetLuidLh(),
        dhcpv4Server = SocketAddress(),
        compartmentId = 0u,
        networkGuid = Guid(),
        connectionType = 0,
        tunnelType = 0,
        dhcpv6Server = SocketAddress(),
        dhcpv6ClientDuid = UByteArray(130),
        dhcpv6ClientDuidLength = 0u,
        dhcpv6Iaid = 0u,
        firstDnsSuffixCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            anonymous1: IpAdapterAddressesLh0 = IpAdapterAddressesLh0(),
            next: MutPtr<IpAdapterAddressesLh> = MutPtr(0L),
            adapterName: Pstr = MutPtr(0L),
            firstUnicastAddress: MutPtr<IpAdapterUnicastAddressLh> = MutPtr(0L),
            firstAnycastAddress: MutPtr<IpAdapterAnycastAddressXp> = MutPtr(0L),
            firstMulticastAddress: MutPtr<IpAdapterMulticastAddressXp> = MutPtr(0L),
            firstDnsServerAddress: MutPtr<IpAdapterDnsServerAddressXp> = MutPtr(0L),
            dnsSuffix: Pwstr = MutPtr(0L),
            description: Pwstr = MutPtr(0L),
            friendlyName: Pwstr = MutPtr(0L),
            physicalAddress: UByteArray = UByteArray(8),
            physicalAddressLength: UInt = 0u,
            anonymous2: IpAdapterAddressesLh1 = IpAdapterAddressesLh1(),
            mtu: UInt = 0u,
            ifType: UInt = 0u,
            operStatus: IfOperStatus = 0,
            ipv6IfIndex: UInt = 0u,
            zoneIndices: UIntArray = UIntArray(16),
            firstPrefix: MutPtr<IpAdapterPrefixXp> = MutPtr(0L),
            transmitLinkSpeed: ULong = 0uL,
            receiveLinkSpeed: ULong = 0uL,
            firstWinsServerAddress: MutPtr<IpAdapterWinsServerAddressLh> = MutPtr(0L),
            firstGatewayAddress: MutPtr<IpAdapterGatewayAddressLh> = MutPtr(0L),
            ipv4Metric: UInt = 0u,
            ipv6Metric: UInt = 0u,
            luid: NetLuidLh = NetLuidLh(),
            dhcpv4Server: SocketAddress = SocketAddress(),
            compartmentId: NetIfCompartmentId = 0u,
            networkGuid: Guid = Guid(),
            connectionType: NetIfConnectionType = 0,
            tunnelType: TunnelType = 0,
            dhcpv6Server: SocketAddress = SocketAddress(),
            dhcpv6ClientDuid: UByteArray = UByteArray(130),
            dhcpv6ClientDuidLength: UInt = 0u,
            dhcpv6Iaid: UInt = 0u,
            firstDnsSuffix: MutPtr<IpAdapterDnsSuffix> = MutPtr(0L),
        ): IpAdapterAddressesLh =
            IpAdapterAddressesLh(
                anonymous1 = anonymous1,
                nextCtorArg = next,
                adapterNameCtorArg = adapterName,
                firstUnicastAddressCtorArg = firstUnicastAddress,
                firstAnycastAddressCtorArg = firstAnycastAddress,
                firstMulticastAddressCtorArg = firstMulticastAddress,
                firstDnsServerAddressCtorArg = firstDnsServerAddress,
                dnsSuffixCtorArg = dnsSuffix,
                descriptionCtorArg = description,
                friendlyNameCtorArg = friendlyName,
                physicalAddress = physicalAddress,
                physicalAddressLength = physicalAddressLength,
                anonymous2 = anonymous2,
                mtu = mtu,
                ifType = ifType,
                operStatus = operStatus,
                ipv6IfIndex = ipv6IfIndex,
                zoneIndices = zoneIndices,
                firstPrefixCtorArg = firstPrefix,
                transmitLinkSpeed = transmitLinkSpeed,
                receiveLinkSpeed = receiveLinkSpeed,
                firstWinsServerAddressCtorArg = firstWinsServerAddress,
                firstGatewayAddressCtorArg = firstGatewayAddress,
                ipv4Metric = ipv4Metric,
                ipv6Metric = ipv6Metric,
                luid = luid,
                dhcpv4Server = dhcpv4Server,
                compartmentId = compartmentId,
                networkGuid = networkGuid,
                connectionType = connectionType,
                tunnelType = tunnelType,
                dhcpv6Server = dhcpv6Server,
                dhcpv6ClientDuid = dhcpv6ClientDuid,
                dhcpv6ClientDuidLength = dhcpv6ClientDuidLength,
                dhcpv6Iaid = dhcpv6Iaid,
                firstDnsSuffixCtorArg = firstDnsSuffix,
            )
    }
}

public data class IpAdapterAddressesLh0(
    public var alignment: ULong = 0uL,
    public var anonymous: IpAdapterAddressesLh00 = IpAdapterAddressesLh00(),
)

public data class IpAdapterAddressesLh00(
    public var length: UInt = 0u,
    public var ifIndex: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterAddressesLh00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterAddressesLh00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): IpAdapterAddressesLh00 =
                    IpAdapterAddressesLh00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IpAdapterAddressesLh00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ifIndex)
                }
            }
    }
}

public data class IpAdapterAddressesLh1(
    public var flags: UInt = 0u,
    public var anonymous: IpAdapterAddressesLh10 = IpAdapterAddressesLh10(),
)

public data class IpAdapterAddressesLh10(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterAddressesLh10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterAddressesLh10> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): IpAdapterAddressesLh10 =
                    IpAdapterAddressesLh10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IpAdapterAddressesLh10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class IpAdapterAddressesXp internal constructor(
    public var anonymous: IpAdapterAddressesXp0,
    nextCtorArg: MutPtr<IpAdapterAddressesXp>,
    adapterNameCtorArg: Pstr,
    firstUnicastAddressCtorArg: MutPtr<IpAdapterUnicastAddressXp>,
    firstAnycastAddressCtorArg: MutPtr<IpAdapterAnycastAddressXp>,
    firstMulticastAddressCtorArg: MutPtr<IpAdapterMulticastAddressXp>,
    firstDnsServerAddressCtorArg: MutPtr<IpAdapterDnsServerAddressXp>,
    dnsSuffixCtorArg: Pwstr,
    descriptionCtorArg: Pwstr,
    friendlyNameCtorArg: Pwstr,
    public var physicalAddress: UByteArray,
    public var physicalAddressLength: UInt,
    public var flags: UInt,
    public var mtu: UInt,
    public var ifType: UInt,
    public var operStatus: IfOperStatus,
    public var ipv6IfIndex: UInt,
    public var zoneIndices: UIntArray,
    firstPrefixCtorArg: MutPtr<IpAdapterPrefixXp>,
) {
    public var next: MutPtr<IpAdapterAddressesXp> = nextCtorArg
        internal set

    public var adapterName: Pstr = adapterNameCtorArg
        internal set

    public var firstUnicastAddress: MutPtr<IpAdapterUnicastAddressXp> = firstUnicastAddressCtorArg
        internal set

    public var firstAnycastAddress: MutPtr<IpAdapterAnycastAddressXp> = firstAnycastAddressCtorArg
        internal set

    public var firstMulticastAddress: MutPtr<IpAdapterMulticastAddressXp> = firstMulticastAddressCtorArg
        internal set

    public var firstDnsServerAddress: MutPtr<IpAdapterDnsServerAddressXp> = firstDnsServerAddressCtorArg
        internal set

    public var dnsSuffix: Pwstr = dnsSuffixCtorArg
        internal set

    public var description: Pwstr = descriptionCtorArg
        internal set

    public var friendlyName: Pwstr = friendlyNameCtorArg
        internal set

    public var firstPrefix: MutPtr<IpAdapterPrefixXp> = firstPrefixCtorArg
        internal set

    public constructor() : this(
        anonymous = IpAdapterAddressesXp0(),
        nextCtorArg = MutPtr(0L),
        adapterNameCtorArg = MutPtr(0L),
        firstUnicastAddressCtorArg = MutPtr(0L),
        firstAnycastAddressCtorArg = MutPtr(0L),
        firstMulticastAddressCtorArg = MutPtr(0L),
        firstDnsServerAddressCtorArg = MutPtr(0L),
        dnsSuffixCtorArg = MutPtr(0L),
        descriptionCtorArg = MutPtr(0L),
        friendlyNameCtorArg = MutPtr(0L),
        physicalAddress = UByteArray(8),
        physicalAddressLength = 0u,
        flags = 0u,
        mtu = 0u,
        ifType = 0u,
        operStatus = 0,
        ipv6IfIndex = 0u,
        zoneIndices = UIntArray(16),
        firstPrefixCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            anonymous: IpAdapterAddressesXp0 = IpAdapterAddressesXp0(),
            next: MutPtr<IpAdapterAddressesXp> = MutPtr(0L),
            adapterName: Pstr = MutPtr(0L),
            firstUnicastAddress: MutPtr<IpAdapterUnicastAddressXp> = MutPtr(0L),
            firstAnycastAddress: MutPtr<IpAdapterAnycastAddressXp> = MutPtr(0L),
            firstMulticastAddress: MutPtr<IpAdapterMulticastAddressXp> = MutPtr(0L),
            firstDnsServerAddress: MutPtr<IpAdapterDnsServerAddressXp> = MutPtr(0L),
            dnsSuffix: Pwstr = MutPtr(0L),
            description: Pwstr = MutPtr(0L),
            friendlyName: Pwstr = MutPtr(0L),
            physicalAddress: UByteArray = UByteArray(8),
            physicalAddressLength: UInt = 0u,
            flags: UInt = 0u,
            mtu: UInt = 0u,
            ifType: UInt = 0u,
            operStatus: IfOperStatus = 0,
            ipv6IfIndex: UInt = 0u,
            zoneIndices: UIntArray = UIntArray(16),
            firstPrefix: MutPtr<IpAdapterPrefixXp> = MutPtr(0L),
        ): IpAdapterAddressesXp =
            IpAdapterAddressesXp(
                anonymous = anonymous,
                nextCtorArg = next,
                adapterNameCtorArg = adapterName,
                firstUnicastAddressCtorArg = firstUnicastAddress,
                firstAnycastAddressCtorArg = firstAnycastAddress,
                firstMulticastAddressCtorArg = firstMulticastAddress,
                firstDnsServerAddressCtorArg = firstDnsServerAddress,
                dnsSuffixCtorArg = dnsSuffix,
                descriptionCtorArg = description,
                friendlyNameCtorArg = friendlyName,
                physicalAddress = physicalAddress,
                physicalAddressLength = physicalAddressLength,
                flags = flags,
                mtu = mtu,
                ifType = ifType,
                operStatus = operStatus,
                ipv6IfIndex = ipv6IfIndex,
                zoneIndices = zoneIndices,
                firstPrefixCtorArg = firstPrefix,
            )
    }
}

public data class IpAdapterAddressesXp0(
    public var alignment: ULong = 0uL,
    public var anonymous: IpAdapterAddressesXp00 = IpAdapterAddressesXp00(),
)

public data class IpAdapterAddressesXp00(
    public var length: UInt = 0u,
    public var ifIndex: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterAddressesXp00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterAddressesXp00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): IpAdapterAddressesXp00 =
                    IpAdapterAddressesXp00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IpAdapterAddressesXp00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ifIndex)
                }
            }
    }
}

public class IpAdapterAnycastAddressXp internal constructor(
    public var anonymous: IpAdapterAnycastAddressXp0,
    nextCtorArg: MutPtr<IpAdapterAnycastAddressXp>,
    public var address: SocketAddress,
) {
    public var next: MutPtr<IpAdapterAnycastAddressXp> = nextCtorArg
        internal set

    public constructor() : this(
        anonymous = IpAdapterAnycastAddressXp0(),
        nextCtorArg = MutPtr(0L),
        address = SocketAddress(),
    )

    public operator fun component1(): IpAdapterAnycastAddressXp0 = this.anonymous

    public operator fun component2(): MutPtr<IpAdapterAnycastAddressXp> = this.next

    public operator fun component3(): SocketAddress = this.address

    public fun copy(anonymous: IpAdapterAnycastAddressXp0 = this.anonymous, next: MutPtr<IpAdapterAnycastAddressXp> = this.next, address: SocketAddress = this.address): IpAdapterAnycastAddressXp = IpAdapterAnycastAddressXp(anonymous = anonymous, nextCtorArg = next, address = address)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpAdapterAnycastAddressXp) return false
        if (this.anonymous != other.anonymous) return false
        if (this.next != other.next) return false
        if (this.address != other.address) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.next.hashCode()
        result = 31 * result + this.address.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: IpAdapterAnycastAddressXp0 = IpAdapterAnycastAddressXp0(),
            next: MutPtr<IpAdapterAnycastAddressXp> = MutPtr(0L),
            address: SocketAddress = SocketAddress(),
        ): IpAdapterAnycastAddressXp =
            IpAdapterAnycastAddressXp(
                anonymous = anonymous,
                nextCtorArg = next,
                address = address,
            )
    }
}

public data class IpAdapterAnycastAddressXp0(
    public var alignment: ULong = 0uL,
    public var anonymous: IpAdapterAnycastAddressXp00 = IpAdapterAnycastAddressXp00(),
)

public data class IpAdapterAnycastAddressXp00(
    public var length: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterAnycastAddressXp00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterAnycastAddressXp00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): IpAdapterAnycastAddressXp00 =
                    IpAdapterAnycastAddressXp00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IpAdapterAnycastAddressXp00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

public class IpAdapterDnsServerAddressXp internal constructor(
    public var anonymous: IpAdapterDnsServerAddressXp0,
    nextCtorArg: MutPtr<IpAdapterDnsServerAddressXp>,
    public var address: SocketAddress,
) {
    public var next: MutPtr<IpAdapterDnsServerAddressXp> = nextCtorArg
        internal set

    public constructor() : this(
        anonymous = IpAdapterDnsServerAddressXp0(),
        nextCtorArg = MutPtr(0L),
        address = SocketAddress(),
    )

    public operator fun component1(): IpAdapterDnsServerAddressXp0 = this.anonymous

    public operator fun component2(): MutPtr<IpAdapterDnsServerAddressXp> = this.next

    public operator fun component3(): SocketAddress = this.address

    public fun copy(anonymous: IpAdapterDnsServerAddressXp0 = this.anonymous, next: MutPtr<IpAdapterDnsServerAddressXp> = this.next, address: SocketAddress = this.address): IpAdapterDnsServerAddressXp = IpAdapterDnsServerAddressXp(anonymous = anonymous, nextCtorArg = next, address = address)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpAdapterDnsServerAddressXp) return false
        if (this.anonymous != other.anonymous) return false
        if (this.next != other.next) return false
        if (this.address != other.address) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.next.hashCode()
        result = 31 * result + this.address.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: IpAdapterDnsServerAddressXp0 = IpAdapterDnsServerAddressXp0(),
            next: MutPtr<IpAdapterDnsServerAddressXp> = MutPtr(0L),
            address: SocketAddress = SocketAddress(),
        ): IpAdapterDnsServerAddressXp =
            IpAdapterDnsServerAddressXp(
                anonymous = anonymous,
                nextCtorArg = next,
                address = address,
            )
    }
}

public data class IpAdapterDnsServerAddressXp0(
    public var alignment: ULong = 0uL,
    public var anonymous: IpAdapterDnsServerAddressXp00 = IpAdapterDnsServerAddressXp00(),
)

public data class IpAdapterDnsServerAddressXp00(
    public var length: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterDnsServerAddressXp00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterDnsServerAddressXp00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): IpAdapterDnsServerAddressXp00 =
                    IpAdapterDnsServerAddressXp00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IpAdapterDnsServerAddressXp00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                }
            }
    }
}

public class IpAdapterDnsSuffix internal constructor(
    nextCtorArg: MutPtr<IpAdapterDnsSuffix>,
    public var string: UShortArray,
) {
    public var next: MutPtr<IpAdapterDnsSuffix> = nextCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
        string = UShortArray(256),
    )

    public operator fun component1(): MutPtr<IpAdapterDnsSuffix> = this.next

    public operator fun component2(): UShortArray = this.string

    public fun copy(next: MutPtr<IpAdapterDnsSuffix> = this.next, string: UShortArray = this.string): IpAdapterDnsSuffix = IpAdapterDnsSuffix(nextCtorArg = next, string = string)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpAdapterDnsSuffix) return false
        if (this.next != other.next) return false
        if (!this.string.contentEquals(other.string)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.next.hashCode()
        result = 31 * result + this.string.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterDnsSuffix> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterDnsSuffix> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 520L
                override fun readNative(addr: Long): IpAdapterDnsSuffix =
                    IpAdapterDnsSuffix(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IpAdapterDnsSuffix>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: IpAdapterDnsSuffix) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IpAdapterDnsSuffix>(64)
                    ).writeNative(addr, value.next)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 8L, value.string.toList())
                }
            }

        public operator fun invoke(
            next: MutPtr<IpAdapterDnsSuffix> = MutPtr(0L),
            string: UShortArray = UShortArray(256),
        ): IpAdapterDnsSuffix =
            IpAdapterDnsSuffix(
                nextCtorArg = next,
                string = string,
            )
    }
}

public class IpAdapterGatewayAddressLh internal constructor(
    public var anonymous: IpAdapterGatewayAddressLh0,
    nextCtorArg: MutPtr<IpAdapterGatewayAddressLh>,
    public var address: SocketAddress,
) {
    public var next: MutPtr<IpAdapterGatewayAddressLh> = nextCtorArg
        internal set

    public constructor() : this(
        anonymous = IpAdapterGatewayAddressLh0(),
        nextCtorArg = MutPtr(0L),
        address = SocketAddress(),
    )

    public operator fun component1(): IpAdapterGatewayAddressLh0 = this.anonymous

    public operator fun component2(): MutPtr<IpAdapterGatewayAddressLh> = this.next

    public operator fun component3(): SocketAddress = this.address

    public fun copy(anonymous: IpAdapterGatewayAddressLh0 = this.anonymous, next: MutPtr<IpAdapterGatewayAddressLh> = this.next, address: SocketAddress = this.address): IpAdapterGatewayAddressLh = IpAdapterGatewayAddressLh(anonymous = anonymous, nextCtorArg = next, address = address)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpAdapterGatewayAddressLh) return false
        if (this.anonymous != other.anonymous) return false
        if (this.next != other.next) return false
        if (this.address != other.address) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.next.hashCode()
        result = 31 * result + this.address.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: IpAdapterGatewayAddressLh0 = IpAdapterGatewayAddressLh0(),
            next: MutPtr<IpAdapterGatewayAddressLh> = MutPtr(0L),
            address: SocketAddress = SocketAddress(),
        ): IpAdapterGatewayAddressLh =
            IpAdapterGatewayAddressLh(
                anonymous = anonymous,
                nextCtorArg = next,
                address = address,
            )
    }
}

public data class IpAdapterGatewayAddressLh0(
    public var alignment: ULong = 0uL,
    public var anonymous: IpAdapterGatewayAddressLh00 = IpAdapterGatewayAddressLh00(),
)

public data class IpAdapterGatewayAddressLh00(
    public var length: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterGatewayAddressLh00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterGatewayAddressLh00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): IpAdapterGatewayAddressLh00 =
                    IpAdapterGatewayAddressLh00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IpAdapterGatewayAddressLh00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                }
            }
    }
}

public data class IpAdapterIndexMap(
    public var index: UInt = 0u,
    public var name: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpAdapterIndexMap) return false
        if (this.index != other.index) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.index.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterIndexMap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterIndexMap> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 260L
                override fun readNative(addr: Long): IpAdapterIndexMap =
                    IpAdapterIndexMap(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: IpAdapterIndexMap) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.index)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 4L, value.name.toList())
                }
            }
    }
}

public class IpAdapterInfo internal constructor(
    nextCtorArg: MutPtr<IpAdapterInfo>,
    public var comboIndex: UInt,
    public var adapterName: ByteArray,
    public var description: ByteArray,
    public var addressLength: UInt,
    public var address: UByteArray,
    public var index: UInt,
    public var type: UInt,
    public var dhcpEnabled: UInt,
    currentIpAddressCtorArg: MutPtr<IpAddrString>,
    public var ipAddressList: IpAddrString,
    public var gatewayList: IpAddrString,
    public var dhcpServer: IpAddrString,
    public var haveWins: Bool,
    public var primaryWinsServer: IpAddrString,
    public var secondaryWinsServer: IpAddrString,
    public var leaseObtained: Long,
    public var leaseExpires: Long,
) {
    public var next: MutPtr<IpAdapterInfo> = nextCtorArg
        internal set

    public var currentIpAddress: MutPtr<IpAddrString> = currentIpAddressCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
        comboIndex = 0u,
        adapterName = ByteArray(260),
        description = ByteArray(132),
        addressLength = 0u,
        address = UByteArray(8),
        index = 0u,
        type = 0u,
        dhcpEnabled = 0u,
        currentIpAddressCtorArg = MutPtr(0L),
        ipAddressList = IpAddrString(),
        gatewayList = IpAddrString(),
        dhcpServer = IpAddrString(),
        haveWins = 0,
        primaryWinsServer = IpAddrString(),
        secondaryWinsServer = IpAddrString(),
        leaseObtained = 0L,
        leaseExpires = 0L,
    )

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 704L
                override fun readNative(addr: Long): IpAdapterInfo =
                    IpAdapterInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IpAdapterInfo>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 12L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (132).toInt())
                        ).readNative(addr + 272L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 404L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 408L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 416L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 420L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 424L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IpAddrString>(64)
                        ).readNative(addr + 432L),
                        (IpAddrString.typeLayout()).readNative(addr + 440L),
                        (IpAddrString.typeLayout()).readNative(addr + 488L),
                        (IpAddrString.typeLayout()).readNative(addr + 536L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 584L),
                        (IpAddrString.typeLayout()).readNative(addr + 592L),
                        (IpAddrString.typeLayout()).readNative(addr + 640L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 688L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 696L),
                    )
                override fun writeNative(addr: Long, value: IpAdapterInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IpAdapterInfo>(64)
                    ).writeNative(addr, value.next)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.comboIndex)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 12L, value.adapterName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (132).toInt())
                    ).writeNative(addr + 272L, value.description.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 404L, value.addressLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 408L, value.address.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 416L, value.index)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 420L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 424L, value.dhcpEnabled)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IpAddrString>(64)
                    ).writeNative(addr + 432L, value.currentIpAddress)
                    (IpAddrString.typeLayout()).writeNative(addr + 440L, value.ipAddressList)
                    (IpAddrString.typeLayout()).writeNative(addr + 488L, value.gatewayList)
                    (IpAddrString.typeLayout()).writeNative(addr + 536L, value.dhcpServer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 584L, value.haveWins)
                    (IpAddrString.typeLayout()).writeNative(addr + 592L, value.primaryWinsServer)
                    (IpAddrString.typeLayout()).writeNative(addr + 640L, value.secondaryWinsServer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 688L, value.leaseObtained)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 696L, value.leaseExpires)
                }
            }

        public operator fun invoke(
            next: MutPtr<IpAdapterInfo> = MutPtr(0L),
            comboIndex: UInt = 0u,
            adapterName: ByteArray = ByteArray(260),
            description: ByteArray = ByteArray(132),
            addressLength: UInt = 0u,
            address: UByteArray = UByteArray(8),
            index: UInt = 0u,
            type: UInt = 0u,
            dhcpEnabled: UInt = 0u,
            currentIpAddress: MutPtr<IpAddrString> = MutPtr(0L),
            ipAddressList: IpAddrString = IpAddrString(),
            gatewayList: IpAddrString = IpAddrString(),
            dhcpServer: IpAddrString = IpAddrString(),
            haveWins: Bool = 0,
            primaryWinsServer: IpAddrString = IpAddrString(),
            secondaryWinsServer: IpAddrString = IpAddrString(),
            leaseObtained: Long = 0L,
            leaseExpires: Long = 0L,
        ): IpAdapterInfo =
            IpAdapterInfo(
                nextCtorArg = next,
                comboIndex = comboIndex,
                adapterName = adapterName,
                description = description,
                addressLength = addressLength,
                address = address,
                index = index,
                type = type,
                dhcpEnabled = dhcpEnabled,
                currentIpAddressCtorArg = currentIpAddress,
                ipAddressList = ipAddressList,
                gatewayList = gatewayList,
                dhcpServer = dhcpServer,
                haveWins = haveWins,
                primaryWinsServer = primaryWinsServer,
                secondaryWinsServer = secondaryWinsServer,
                leaseObtained = leaseObtained,
                leaseExpires = leaseExpires,
            )
    }
}

public class IpAdapterMulticastAddressXp internal constructor(
    public var anonymous: IpAdapterMulticastAddressXp0,
    nextCtorArg: MutPtr<IpAdapterMulticastAddressXp>,
    public var address: SocketAddress,
) {
    public var next: MutPtr<IpAdapterMulticastAddressXp> = nextCtorArg
        internal set

    public constructor() : this(
        anonymous = IpAdapterMulticastAddressXp0(),
        nextCtorArg = MutPtr(0L),
        address = SocketAddress(),
    )

    public operator fun component1(): IpAdapterMulticastAddressXp0 = this.anonymous

    public operator fun component2(): MutPtr<IpAdapterMulticastAddressXp> = this.next

    public operator fun component3(): SocketAddress = this.address

    public fun copy(anonymous: IpAdapterMulticastAddressXp0 = this.anonymous, next: MutPtr<IpAdapterMulticastAddressXp> = this.next, address: SocketAddress = this.address): IpAdapterMulticastAddressXp = IpAdapterMulticastAddressXp(anonymous = anonymous, nextCtorArg = next, address = address)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpAdapterMulticastAddressXp) return false
        if (this.anonymous != other.anonymous) return false
        if (this.next != other.next) return false
        if (this.address != other.address) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.next.hashCode()
        result = 31 * result + this.address.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: IpAdapterMulticastAddressXp0 = IpAdapterMulticastAddressXp0(),
            next: MutPtr<IpAdapterMulticastAddressXp> = MutPtr(0L),
            address: SocketAddress = SocketAddress(),
        ): IpAdapterMulticastAddressXp =
            IpAdapterMulticastAddressXp(
                anonymous = anonymous,
                nextCtorArg = next,
                address = address,
            )
    }
}

public data class IpAdapterMulticastAddressXp0(
    public var alignment: ULong = 0uL,
    public var anonymous: IpAdapterMulticastAddressXp00 = IpAdapterMulticastAddressXp00(),
)

public data class IpAdapterMulticastAddressXp00(
    public var length: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterMulticastAddressXp00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterMulticastAddressXp00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): IpAdapterMulticastAddressXp00 =
                    IpAdapterMulticastAddressXp00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IpAdapterMulticastAddressXp00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

public data class IpAdapterOrderMap(
    public var numAdapters: UInt = 0u,
    public var adapterOrder: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpAdapterOrderMap) return false
        if (this.numAdapters != other.numAdapters) return false
        if (!this.adapterOrder.contentEquals(other.adapterOrder)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numAdapters.hashCode()
        result = 31 * result + this.adapterOrder.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterOrderMap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterOrderMap> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): IpAdapterOrderMap =
                    IpAdapterOrderMap(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 4L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: IpAdapterOrderMap) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numAdapters)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 4L, value.adapterOrder.toList())
                }
            }
    }
}

public class IpAdapterPrefixXp internal constructor(
    public var anonymous: IpAdapterPrefixXp0,
    nextCtorArg: MutPtr<IpAdapterPrefixXp>,
    public var address: SocketAddress,
    public var prefixLength: UInt,
) {
    public var next: MutPtr<IpAdapterPrefixXp> = nextCtorArg
        internal set

    public constructor() : this(
        anonymous = IpAdapterPrefixXp0(),
        nextCtorArg = MutPtr(0L),
        address = SocketAddress(),
        prefixLength = 0u,
    )

    public operator fun component1(): IpAdapterPrefixXp0 = this.anonymous

    public operator fun component2(): MutPtr<IpAdapterPrefixXp> = this.next

    public operator fun component3(): SocketAddress = this.address

    public operator fun component4(): UInt = this.prefixLength

    public fun copy(anonymous: IpAdapterPrefixXp0 = this.anonymous, next: MutPtr<IpAdapterPrefixXp> = this.next, address: SocketAddress = this.address, prefixLength: UInt = this.prefixLength): IpAdapterPrefixXp = IpAdapterPrefixXp(anonymous = anonymous, nextCtorArg = next, address = address, prefixLength = prefixLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpAdapterPrefixXp) return false
        if (this.anonymous != other.anonymous) return false
        if (this.next != other.next) return false
        if (this.address != other.address) return false
        if (this.prefixLength != other.prefixLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.next.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.prefixLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: IpAdapterPrefixXp0 = IpAdapterPrefixXp0(),
            next: MutPtr<IpAdapterPrefixXp> = MutPtr(0L),
            address: SocketAddress = SocketAddress(),
            prefixLength: UInt = 0u,
        ): IpAdapterPrefixXp =
            IpAdapterPrefixXp(
                anonymous = anonymous,
                nextCtorArg = next,
                address = address,
                prefixLength = prefixLength,
            )
    }
}

public data class IpAdapterPrefixXp0(
    public var alignment: ULong = 0uL,
    public var anonymous: IpAdapterPrefixXp00 = IpAdapterPrefixXp00(),
)

public data class IpAdapterPrefixXp00(
    public var length: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterPrefixXp00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterPrefixXp00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): IpAdapterPrefixXp00 =
                    IpAdapterPrefixXp00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IpAdapterPrefixXp00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

public class IpAdapterUnicastAddressLh internal constructor(
    public var anonymous: IpAdapterUnicastAddressLh0,
    nextCtorArg: MutPtr<IpAdapterUnicastAddressLh>,
    public var address: SocketAddress,
    public var prefixOrigin: NlPrefixOrigin,
    public var suffixOrigin: NlSuffixOrigin,
    public var dadState: NlDadState,
    public var validLifetime: UInt,
    public var preferredLifetime: UInt,
    public var leaseLifetime: UInt,
    public var onLinkPrefixLength: UByte,
) {
    public var next: MutPtr<IpAdapterUnicastAddressLh> = nextCtorArg
        internal set

    public constructor() : this(
        anonymous = IpAdapterUnicastAddressLh0(),
        nextCtorArg = MutPtr(0L),
        address = SocketAddress(),
        prefixOrigin = 0,
        suffixOrigin = 0,
        dadState = 0,
        validLifetime = 0u,
        preferredLifetime = 0u,
        leaseLifetime = 0u,
        onLinkPrefixLength = 0u,
    )

    public operator fun component1(): IpAdapterUnicastAddressLh0 = this.anonymous

    public operator fun component2(): MutPtr<IpAdapterUnicastAddressLh> = this.next

    public operator fun component3(): SocketAddress = this.address

    public operator fun component4(): NlPrefixOrigin = this.prefixOrigin

    public operator fun component5(): NlSuffixOrigin = this.suffixOrigin

    public operator fun component6(): NlDadState = this.dadState

    public operator fun component7(): UInt = this.validLifetime

    public operator fun component8(): UInt = this.preferredLifetime

    public operator fun component9(): UInt = this.leaseLifetime

    public operator fun component10(): UByte = this.onLinkPrefixLength

    public fun copy(anonymous: IpAdapterUnicastAddressLh0 = this.anonymous, next: MutPtr<IpAdapterUnicastAddressLh> = this.next, address: SocketAddress = this.address, prefixOrigin: NlPrefixOrigin = this.prefixOrigin, suffixOrigin: NlSuffixOrigin = this.suffixOrigin, dadState: NlDadState = this.dadState, validLifetime: UInt = this.validLifetime, preferredLifetime: UInt = this.preferredLifetime, leaseLifetime: UInt = this.leaseLifetime, onLinkPrefixLength: UByte = this.onLinkPrefixLength): IpAdapterUnicastAddressLh = IpAdapterUnicastAddressLh(anonymous = anonymous, nextCtorArg = next, address = address, prefixOrigin = prefixOrigin, suffixOrigin = suffixOrigin, dadState = dadState, validLifetime = validLifetime, preferredLifetime = preferredLifetime, leaseLifetime = leaseLifetime, onLinkPrefixLength = onLinkPrefixLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpAdapterUnicastAddressLh) return false
        if (this.anonymous != other.anonymous) return false
        if (this.next != other.next) return false
        if (this.address != other.address) return false
        if (this.prefixOrigin != other.prefixOrigin) return false
        if (this.suffixOrigin != other.suffixOrigin) return false
        if (this.dadState != other.dadState) return false
        if (this.validLifetime != other.validLifetime) return false
        if (this.preferredLifetime != other.preferredLifetime) return false
        if (this.leaseLifetime != other.leaseLifetime) return false
        if (this.onLinkPrefixLength != other.onLinkPrefixLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.next.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.prefixOrigin.hashCode()
        result = 31 * result + this.suffixOrigin.hashCode()
        result = 31 * result + this.dadState.hashCode()
        result = 31 * result + this.validLifetime.hashCode()
        result = 31 * result + this.preferredLifetime.hashCode()
        result = 31 * result + this.leaseLifetime.hashCode()
        result = 31 * result + this.onLinkPrefixLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: IpAdapterUnicastAddressLh0 = IpAdapterUnicastAddressLh0(),
            next: MutPtr<IpAdapterUnicastAddressLh> = MutPtr(0L),
            address: SocketAddress = SocketAddress(),
            prefixOrigin: NlPrefixOrigin = 0,
            suffixOrigin: NlSuffixOrigin = 0,
            dadState: NlDadState = 0,
            validLifetime: UInt = 0u,
            preferredLifetime: UInt = 0u,
            leaseLifetime: UInt = 0u,
            onLinkPrefixLength: UByte = 0u,
        ): IpAdapterUnicastAddressLh =
            IpAdapterUnicastAddressLh(
                anonymous = anonymous,
                nextCtorArg = next,
                address = address,
                prefixOrigin = prefixOrigin,
                suffixOrigin = suffixOrigin,
                dadState = dadState,
                validLifetime = validLifetime,
                preferredLifetime = preferredLifetime,
                leaseLifetime = leaseLifetime,
                onLinkPrefixLength = onLinkPrefixLength,
            )
    }
}

public data class IpAdapterUnicastAddressLh0(
    public var alignment: ULong = 0uL,
    public var anonymous: IpAdapterUnicastAddressLh00 = IpAdapterUnicastAddressLh00(),
)

public data class IpAdapterUnicastAddressLh00(
    public var length: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterUnicastAddressLh00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterUnicastAddressLh00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): IpAdapterUnicastAddressLh00 =
                    IpAdapterUnicastAddressLh00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IpAdapterUnicastAddressLh00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

public class IpAdapterUnicastAddressXp internal constructor(
    public var anonymous: IpAdapterUnicastAddressXp0,
    nextCtorArg: MutPtr<IpAdapterUnicastAddressXp>,
    public var address: SocketAddress,
    public var prefixOrigin: NlPrefixOrigin,
    public var suffixOrigin: NlSuffixOrigin,
    public var dadState: NlDadState,
    public var validLifetime: UInt,
    public var preferredLifetime: UInt,
    public var leaseLifetime: UInt,
) {
    public var next: MutPtr<IpAdapterUnicastAddressXp> = nextCtorArg
        internal set

    public constructor() : this(
        anonymous = IpAdapterUnicastAddressXp0(),
        nextCtorArg = MutPtr(0L),
        address = SocketAddress(),
        prefixOrigin = 0,
        suffixOrigin = 0,
        dadState = 0,
        validLifetime = 0u,
        preferredLifetime = 0u,
        leaseLifetime = 0u,
    )

    public operator fun component1(): IpAdapterUnicastAddressXp0 = this.anonymous

    public operator fun component2(): MutPtr<IpAdapterUnicastAddressXp> = this.next

    public operator fun component3(): SocketAddress = this.address

    public operator fun component4(): NlPrefixOrigin = this.prefixOrigin

    public operator fun component5(): NlSuffixOrigin = this.suffixOrigin

    public operator fun component6(): NlDadState = this.dadState

    public operator fun component7(): UInt = this.validLifetime

    public operator fun component8(): UInt = this.preferredLifetime

    public operator fun component9(): UInt = this.leaseLifetime

    public fun copy(anonymous: IpAdapterUnicastAddressXp0 = this.anonymous, next: MutPtr<IpAdapterUnicastAddressXp> = this.next, address: SocketAddress = this.address, prefixOrigin: NlPrefixOrigin = this.prefixOrigin, suffixOrigin: NlSuffixOrigin = this.suffixOrigin, dadState: NlDadState = this.dadState, validLifetime: UInt = this.validLifetime, preferredLifetime: UInt = this.preferredLifetime, leaseLifetime: UInt = this.leaseLifetime): IpAdapterUnicastAddressXp = IpAdapterUnicastAddressXp(anonymous = anonymous, nextCtorArg = next, address = address, prefixOrigin = prefixOrigin, suffixOrigin = suffixOrigin, dadState = dadState, validLifetime = validLifetime, preferredLifetime = preferredLifetime, leaseLifetime = leaseLifetime)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpAdapterUnicastAddressXp) return false
        if (this.anonymous != other.anonymous) return false
        if (this.next != other.next) return false
        if (this.address != other.address) return false
        if (this.prefixOrigin != other.prefixOrigin) return false
        if (this.suffixOrigin != other.suffixOrigin) return false
        if (this.dadState != other.dadState) return false
        if (this.validLifetime != other.validLifetime) return false
        if (this.preferredLifetime != other.preferredLifetime) return false
        if (this.leaseLifetime != other.leaseLifetime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.next.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.prefixOrigin.hashCode()
        result = 31 * result + this.suffixOrigin.hashCode()
        result = 31 * result + this.dadState.hashCode()
        result = 31 * result + this.validLifetime.hashCode()
        result = 31 * result + this.preferredLifetime.hashCode()
        result = 31 * result + this.leaseLifetime.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: IpAdapterUnicastAddressXp0 = IpAdapterUnicastAddressXp0(),
            next: MutPtr<IpAdapterUnicastAddressXp> = MutPtr(0L),
            address: SocketAddress = SocketAddress(),
            prefixOrigin: NlPrefixOrigin = 0,
            suffixOrigin: NlSuffixOrigin = 0,
            dadState: NlDadState = 0,
            validLifetime: UInt = 0u,
            preferredLifetime: UInt = 0u,
            leaseLifetime: UInt = 0u,
        ): IpAdapterUnicastAddressXp =
            IpAdapterUnicastAddressXp(
                anonymous = anonymous,
                nextCtorArg = next,
                address = address,
                prefixOrigin = prefixOrigin,
                suffixOrigin = suffixOrigin,
                dadState = dadState,
                validLifetime = validLifetime,
                preferredLifetime = preferredLifetime,
                leaseLifetime = leaseLifetime,
            )
    }
}

public data class IpAdapterUnicastAddressXp0(
    public var alignment: ULong = 0uL,
    public var anonymous: IpAdapterUnicastAddressXp00 = IpAdapterUnicastAddressXp00(),
)

public data class IpAdapterUnicastAddressXp00(
    public var length: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterUnicastAddressXp00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterUnicastAddressXp00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): IpAdapterUnicastAddressXp00 =
                    IpAdapterUnicastAddressXp00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IpAdapterUnicastAddressXp00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

public class IpAdapterWinsServerAddressLh internal constructor(
    public var anonymous: IpAdapterWinsServerAddressLh0,
    nextCtorArg: MutPtr<IpAdapterWinsServerAddressLh>,
    public var address: SocketAddress,
) {
    public var next: MutPtr<IpAdapterWinsServerAddressLh> = nextCtorArg
        internal set

    public constructor() : this(
        anonymous = IpAdapterWinsServerAddressLh0(),
        nextCtorArg = MutPtr(0L),
        address = SocketAddress(),
    )

    public operator fun component1(): IpAdapterWinsServerAddressLh0 = this.anonymous

    public operator fun component2(): MutPtr<IpAdapterWinsServerAddressLh> = this.next

    public operator fun component3(): SocketAddress = this.address

    public fun copy(anonymous: IpAdapterWinsServerAddressLh0 = this.anonymous, next: MutPtr<IpAdapterWinsServerAddressLh> = this.next, address: SocketAddress = this.address): IpAdapterWinsServerAddressLh = IpAdapterWinsServerAddressLh(anonymous = anonymous, nextCtorArg = next, address = address)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpAdapterWinsServerAddressLh) return false
        if (this.anonymous != other.anonymous) return false
        if (this.next != other.next) return false
        if (this.address != other.address) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.next.hashCode()
        result = 31 * result + this.address.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: IpAdapterWinsServerAddressLh0 = IpAdapterWinsServerAddressLh0(),
            next: MutPtr<IpAdapterWinsServerAddressLh> = MutPtr(0L),
            address: SocketAddress = SocketAddress(),
        ): IpAdapterWinsServerAddressLh =
            IpAdapterWinsServerAddressLh(
                anonymous = anonymous,
                nextCtorArg = next,
                address = address,
            )
    }
}

public data class IpAdapterWinsServerAddressLh0(
    public var alignment: ULong = 0uL,
    public var anonymous: IpAdapterWinsServerAddressLh00 = IpAdapterWinsServerAddressLh00(),
)

public data class IpAdapterWinsServerAddressLh00(
    public var length: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterWinsServerAddressLh00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAdapterWinsServerAddressLh00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): IpAdapterWinsServerAddressLh00 =
                    IpAdapterWinsServerAddressLh00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IpAdapterWinsServerAddressLh00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                }
            }
    }
}

public data class IpAddressPrefix(
    public var prefix: SockaddrInet = SockaddrInet(),
    public var prefixLength: UByte = 0u,
)

public data class IpAddressString(
    public var string: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpAddressString) return false
        if (!this.string.contentEquals(other.string)) return false
        return true
    }

    override fun hashCode(): Int = this.string.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAddressString> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAddressString> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): IpAddressString =
                    IpAddressString(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                        ).readNative(addr).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: IpAddressString) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                    ).writeNative(addr, value.string.toList())
                }
            }
    }
}

public class IpAddrString internal constructor(
    nextCtorArg: MutPtr<IpAddrString>,
    public var ipAddress: IpAddressString,
    public var ipMask: IpAddressString,
    public var context: UInt,
) {
    public var next: MutPtr<IpAddrString> = nextCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
        ipAddress = IpAddressString(),
        ipMask = IpAddressString(),
        context = 0u,
    )

    public operator fun component1(): MutPtr<IpAddrString> = this.next

    public operator fun component2(): IpAddressString = this.ipAddress

    public operator fun component3(): IpAddressString = this.ipMask

    public operator fun component4(): UInt = this.context

    public fun copy(next: MutPtr<IpAddrString> = this.next, ipAddress: IpAddressString = this.ipAddress, ipMask: IpAddressString = this.ipMask, context: UInt = this.context): IpAddrString = IpAddrString(nextCtorArg = next, ipAddress = ipAddress, ipMask = ipMask, context = context)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpAddrString) return false
        if (this.next != other.next) return false
        if (this.ipAddress != other.ipAddress) return false
        if (this.ipMask != other.ipMask) return false
        if (this.context != other.context) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.next.hashCode()
        result = 31 * result + this.ipAddress.hashCode()
        result = 31 * result + this.ipMask.hashCode()
        result = 31 * result + this.context.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAddrString> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpAddrString> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): IpAddrString =
                    IpAddrString(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IpAddrString>(64)
                        ).readNative(addr),
                        (IpAddressString.typeLayout()).readNative(addr + 8L),
                        (IpAddressString.typeLayout()).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: IpAddrString) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IpAddrString>(64)
                    ).writeNative(addr, value.next)
                    (IpAddressString.typeLayout()).writeNative(addr + 8L, value.ipAddress)
                    (IpAddressString.typeLayout()).writeNative(addr + 24L, value.ipMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.context)
                }
            }

        public operator fun invoke(
            next: MutPtr<IpAddrString> = MutPtr(0L),
            ipAddress: IpAddressString = IpAddressString(),
            ipMask: IpAddressString = IpAddressString(),
            context: UInt = 0u,
        ): IpAddrString =
            IpAddrString(
                nextCtorArg = next,
                ipAddress = ipAddress,
                ipMask = ipMask,
                context = context,
            )
    }
}

public data class IpInterfaceInfo(
    public var numAdapters: Int = 0,
    public var adapter: List<IpAdapterIndexMap> = List(1) { IpAdapterIndexMap() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpInterfaceInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpInterfaceInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 264L
                override fun readNative(addr: Long): IpInterfaceInfo =
                    IpInterfaceInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(IpAdapterIndexMap.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IpInterfaceInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.numAdapters)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(IpAdapterIndexMap.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.adapter)
                }
            }
    }
}

public data class IpInterfaceNameInfoW2ksp1(
    public var index: UInt = 0u,
    public var mediaType: UInt = 0u,
    public var connectionType: UByte = 0u,
    public var accessType: UByte = 0u,
    public var deviceGuid: Guid = Guid(),
    public var interfaceGuid: Guid = Guid(),
)

public data class IpMcastCounterInfo(
    public var inMcastOctets: ULong = 0uL,
    public var outMcastOctets: ULong = 0uL,
    public var inMcastPkts: ULong = 0uL,
    public var outMcastPkts: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpMcastCounterInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpMcastCounterInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): IpMcastCounterInfo =
                    IpMcastCounterInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: IpMcastCounterInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.inMcastOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.outMcastOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.inMcastPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.outMcastPkts)
                }
            }
    }
}

public class IpOptionInformation internal constructor(
    public var ttl: UByte,
    public var tos: UByte,
    public var flags: UByte,
    public var optionsSize: UByte,
    optionsDataCtorArg: MutPtr<UByte>,
) {
    public var optionsData: MutPtr<UByte> = optionsDataCtorArg
        internal set

    public constructor() : this(
        ttl = 0u,
        tos = 0u,
        flags = 0u,
        optionsSize = 0u,
        optionsDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.ttl

    public operator fun component2(): UByte = this.tos

    public operator fun component3(): UByte = this.flags

    public operator fun component4(): UByte = this.optionsSize

    public operator fun component5(): MutPtr<UByte> = this.optionsData

    public fun copy(ttl: UByte = this.ttl, tos: UByte = this.tos, flags: UByte = this.flags, optionsSize: UByte = this.optionsSize, optionsData: MutPtr<UByte> = this.optionsData): IpOptionInformation = IpOptionInformation(ttl = ttl, tos = tos, flags = flags, optionsSize = optionsSize, optionsDataCtorArg = optionsData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpOptionInformation) return false
        if (this.ttl != other.ttl) return false
        if (this.tos != other.tos) return false
        if (this.flags != other.flags) return false
        if (this.optionsSize != other.optionsSize) return false
        if (this.optionsData != other.optionsData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ttl.hashCode()
        result = 31 * result + this.tos.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.optionsSize.hashCode()
        result = 31 * result + this.optionsData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpOptionInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpOptionInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): IpOptionInformation =
                    IpOptionInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IpOptionInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.ttl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.tos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.optionsSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.optionsData)
                }
            }

        public operator fun invoke(
            ttl: UByte = 0u,
            tos: UByte = 0u,
            flags: UByte = 0u,
            optionsSize: UByte = 0u,
            optionsData: MutPtr<UByte> = MutPtr(0L),
        ): IpOptionInformation =
            IpOptionInformation(
                ttl = ttl,
                tos = tos,
                flags = flags,
                optionsSize = optionsSize,
                optionsDataCtorArg = optionsData,
            )
    }
}

public class IpOptionInformation32 internal constructor(
    public var ttl: UByte,
    public var tos: UByte,
    public var flags: UByte,
    public var optionsSize: UByte,
    optionsDataCtorArg: MutPtr<UByte>,
) {
    public var optionsData: MutPtr<UByte> = optionsDataCtorArg
        internal set

    public constructor() : this(
        ttl = 0u,
        tos = 0u,
        flags = 0u,
        optionsSize = 0u,
        optionsDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.ttl

    public operator fun component2(): UByte = this.tos

    public operator fun component3(): UByte = this.flags

    public operator fun component4(): UByte = this.optionsSize

    public operator fun component5(): MutPtr<UByte> = this.optionsData

    public fun copy(ttl: UByte = this.ttl, tos: UByte = this.tos, flags: UByte = this.flags, optionsSize: UByte = this.optionsSize, optionsData: MutPtr<UByte> = this.optionsData): IpOptionInformation32 = IpOptionInformation32(ttl = ttl, tos = tos, flags = flags, optionsSize = optionsSize, optionsDataCtorArg = optionsData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpOptionInformation32) return false
        if (this.ttl != other.ttl) return false
        if (this.tos != other.tos) return false
        if (this.flags != other.flags) return false
        if (this.optionsSize != other.optionsSize) return false
        if (this.optionsData != other.optionsData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ttl.hashCode()
        result = 31 * result + this.tos.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.optionsSize.hashCode()
        result = 31 * result + this.optionsData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpOptionInformation32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpOptionInformation32> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): IpOptionInformation32 =
                    IpOptionInformation32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IpOptionInformation32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.ttl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.tos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.optionsSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.optionsData)
                }
            }

        public operator fun invoke(
            ttl: UByte = 0u,
            tos: UByte = 0u,
            flags: UByte = 0u,
            optionsSize: UByte = 0u,
            optionsData: MutPtr<UByte> = MutPtr(0L),
        ): IpOptionInformation32 =
            IpOptionInformation32(
                ttl = ttl,
                tos = tos,
                flags = flags,
                optionsSize = optionsSize,
                optionsDataCtorArg = optionsData,
            )
    }
}

public class IpPerAdapterInfoW2ksp1 internal constructor(
    public var autoconfigEnabled: UInt,
    public var autoconfigActive: UInt,
    currentDnsServerCtorArg: MutPtr<IpAddrString>,
    public var dnsServerList: IpAddrString,
) {
    public var currentDnsServer: MutPtr<IpAddrString> = currentDnsServerCtorArg
        internal set

    public constructor() : this(
        autoconfigEnabled = 0u,
        autoconfigActive = 0u,
        currentDnsServerCtorArg = MutPtr(0L),
        dnsServerList = IpAddrString(),
    )

    public operator fun component1(): UInt = this.autoconfigEnabled

    public operator fun component2(): UInt = this.autoconfigActive

    public operator fun component3(): MutPtr<IpAddrString> = this.currentDnsServer

    public operator fun component4(): IpAddrString = this.dnsServerList

    public fun copy(autoconfigEnabled: UInt = this.autoconfigEnabled, autoconfigActive: UInt = this.autoconfigActive, currentDnsServer: MutPtr<IpAddrString> = this.currentDnsServer, dnsServerList: IpAddrString = this.dnsServerList): IpPerAdapterInfoW2ksp1 = IpPerAdapterInfoW2ksp1(autoconfigEnabled = autoconfigEnabled, autoconfigActive = autoconfigActive, currentDnsServerCtorArg = currentDnsServer, dnsServerList = dnsServerList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpPerAdapterInfoW2ksp1) return false
        if (this.autoconfigEnabled != other.autoconfigEnabled) return false
        if (this.autoconfigActive != other.autoconfigActive) return false
        if (this.currentDnsServer != other.currentDnsServer) return false
        if (this.dnsServerList != other.dnsServerList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.autoconfigEnabled.hashCode()
        result = 31 * result + this.autoconfigActive.hashCode()
        result = 31 * result + this.currentDnsServer.hashCode()
        result = 31 * result + this.dnsServerList.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpPerAdapterInfoW2ksp1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpPerAdapterInfoW2ksp1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): IpPerAdapterInfoW2ksp1 =
                    IpPerAdapterInfoW2ksp1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IpAddrString>(64)
                        ).readNative(addr + 8L),
                        (IpAddrString.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IpPerAdapterInfoW2ksp1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.autoconfigEnabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.autoconfigActive)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IpAddrString>(64)
                    ).writeNative(addr + 8L, value.currentDnsServer)
                    (IpAddrString.typeLayout()).writeNative(addr + 16L, value.dnsServerList)
                }
            }

        public operator fun invoke(
            autoconfigEnabled: UInt = 0u,
            autoconfigActive: UInt = 0u,
            currentDnsServer: MutPtr<IpAddrString> = MutPtr(0L),
            dnsServerList: IpAddrString = IpAddrString(),
        ): IpPerAdapterInfoW2ksp1 =
            IpPerAdapterInfoW2ksp1(
                autoconfigEnabled = autoconfigEnabled,
                autoconfigActive = autoconfigActive,
                currentDnsServerCtorArg = currentDnsServer,
                dnsServerList = dnsServerList,
            )
    }
}

public data class IpUnidirectionalAdapterAddress(
    public var numAdapters: UInt = 0u,
    public var address: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpUnidirectionalAdapterAddress) return false
        if (this.numAdapters != other.numAdapters) return false
        if (!this.address.contentEquals(other.address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numAdapters.hashCode()
        result = 31 * result + this.address.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpUnidirectionalAdapterAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpUnidirectionalAdapterAddress> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): IpUnidirectionalAdapterAddress =
                    IpUnidirectionalAdapterAddress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 4L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: IpUnidirectionalAdapterAddress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numAdapters)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 4L, value.address.toList())
                }
            }
    }
}

public data class Mibicmpinfo(
    public var icmpInStats: Mibicmpstats = Mibicmpstats(),
    public var icmpOutStats: Mibicmpstats = Mibicmpstats(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mibicmpinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mibicmpinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): Mibicmpinfo =
                    Mibicmpinfo(
                        (Mibicmpstats.typeLayout()).readNative(addr),
                        (Mibicmpstats.typeLayout()).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: Mibicmpinfo) {
                    (Mibicmpstats.typeLayout()).writeNative(addr, value.icmpInStats)
                    (Mibicmpstats.typeLayout()).writeNative(addr + 52L, value.icmpOutStats)
                }
            }
    }
}

public data class Mibicmpstats(
    public var dwMsgs: UInt = 0u,
    public var dwErrors: UInt = 0u,
    public var dwDestUnreachs: UInt = 0u,
    public var dwTimeExcds: UInt = 0u,
    public var dwParmProbs: UInt = 0u,
    public var dwSrcQuenchs: UInt = 0u,
    public var dwRedirects: UInt = 0u,
    public var dwEchos: UInt = 0u,
    public var dwEchoReps: UInt = 0u,
    public var dwTimestamps: UInt = 0u,
    public var dwTimestampReps: UInt = 0u,
    public var dwAddrMasks: UInt = 0u,
    public var dwAddrMaskReps: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mibicmpstats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mibicmpstats> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): Mibicmpstats =
                    Mibicmpstats(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Mibicmpstats) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMsgs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwDestUnreachs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwTimeExcds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwParmProbs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwSrcQuenchs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwRedirects)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwEchos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwEchoReps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwTimestamps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwTimestampReps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwAddrMasks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwAddrMaskReps)
                }
            }
    }
}

public data class MibicmpstatsExXpsp1(
    public var dwMsgs: UInt = 0u,
    public var dwErrors: UInt = 0u,
    public var rgdwTypeCount: UIntArray = UIntArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibicmpstatsExXpsp1) return false
        if (this.dwMsgs != other.dwMsgs) return false
        if (this.dwErrors != other.dwErrors) return false
        if (!this.rgdwTypeCount.contentEquals(other.rgdwTypeCount)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMsgs.hashCode()
        result = 31 * result + this.dwErrors.hashCode()
        result = 31 * result + this.rgdwTypeCount.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibicmpstatsExXpsp1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibicmpstatsExXpsp1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1032L
                override fun readNative(addr: Long): MibicmpstatsExXpsp1 =
                    MibicmpstatsExXpsp1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (256).toInt())
                        ).readNative(addr + 8L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: MibicmpstatsExXpsp1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMsgs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwErrors)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (256).toInt())
                    ).writeNative(addr + 8L, value.rgdwTypeCount.toList())
                }
            }
    }
}

public data class MibAnycastipaddressRow(
    public var address: SockaddrInet = SockaddrInet(),
    public var interfaceLuid: NetLuidLh = NetLuidLh(),
    public var interfaceIndex: UInt = 0u,
    public var scopeId: ScopeId = ScopeId(),
)

public data class MibAnycastipaddressTable(
    public var numEntries: UInt = 0u,
    public var table: List<MibAnycastipaddressRow> = List(1) { MibAnycastipaddressRow() },
)

public data class MibBestIf(
    public var dwDestAddr: UInt = 0u,
    public var dwIfIndex: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibBestIf> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibBestIf> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MibBestIf =
                    MibBestIf(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MibBestIf) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwDestAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwIfIndex)
                }
            }
    }
}

public data class MibBoundaryrow(
    public var dwGroupAddress: UInt = 0u,
    public var dwGroupMask: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibBoundaryrow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibBoundaryrow> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MibBoundaryrow =
                    MibBoundaryrow(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MibBoundaryrow) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwGroupAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwGroupMask)
                }
            }
    }
}

public data class MibIcmp(
    public var stats: Mibicmpinfo = Mibicmpinfo(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIcmp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIcmp> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): MibIcmp =
                    MibIcmp(
                        (Mibicmpinfo.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MibIcmp) {
                    (Mibicmpinfo.typeLayout()).writeNative(addr, value.stats)
                }
            }
    }
}

public data class MibIcmpExXpsp1(
    public var icmpInStats: MibicmpstatsExXpsp1 = MibicmpstatsExXpsp1(),
    public var icmpOutStats: MibicmpstatsExXpsp1 = MibicmpstatsExXpsp1(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIcmpExXpsp1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIcmpExXpsp1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 2064L
                override fun readNative(addr: Long): MibIcmpExXpsp1 =
                    MibIcmpExXpsp1(
                        (MibicmpstatsExXpsp1.typeLayout()).readNative(addr),
                        (MibicmpstatsExXpsp1.typeLayout()).readNative(addr + 1032L),
                    )
                override fun writeNative(addr: Long, value: MibIcmpExXpsp1) {
                    (MibicmpstatsExXpsp1.typeLayout()).writeNative(addr, value.icmpInStats)
                    (MibicmpstatsExXpsp1.typeLayout()).writeNative(addr + 1032L, value.icmpOutStats)
                }
            }
    }
}

public data class MibIfnumber(
    public var dwValue: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIfnumber> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIfnumber> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MibIfnumber =
                    MibIfnumber(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MibIfnumber) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwValue)
                }
            }
    }
}

public class MibIfrow(
    public var wszName: UShortArray = UShortArray(256),
    public var dwIndex: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwMtu: UInt = 0u,
    public var dwSpeed: UInt = 0u,
    public var dwPhysAddrLen: UInt = 0u,
    public var bPhysAddr: UByteArray = UByteArray(8),
    public var dwAdminStatus: UInt = 0u,
    public var dwOperStatus: InternalIfOperStatus = 0,
    public var dwLastChange: UInt = 0u,
    public var dwInOctets: UInt = 0u,
    public var dwInUcastPkts: UInt = 0u,
    public var dwInNUcastPkts: UInt = 0u,
    public var dwInDiscards: UInt = 0u,
    public var dwInErrors: UInt = 0u,
    public var dwInUnknownProtos: UInt = 0u,
    public var dwOutOctets: UInt = 0u,
    public var dwOutUcastPkts: UInt = 0u,
    public var dwOutNUcastPkts: UInt = 0u,
    public var dwOutDiscards: UInt = 0u,
    public var dwOutErrors: UInt = 0u,
    public var dwOutQLen: UInt = 0u,
    public var dwDescrLen: UInt = 0u,
    public var bDescr: UByteArray = UByteArray(256),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIfrow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIfrow> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 860L
                override fun readNative(addr: Long): MibIfrow =
                    MibIfrow(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 512L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 516L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 520L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 524L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 528L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 532L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 540L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 544L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 548L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 552L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 556L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 560L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 564L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 568L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 572L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 576L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 580L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 584L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 588L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 592L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 596L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 600L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 604L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: MibIfrow) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr, value.wszName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 512L, value.dwIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 516L, value.dwType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 520L, value.dwMtu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 524L, value.dwSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 528L, value.dwPhysAddrLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 532L, value.bPhysAddr.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 540L, value.dwAdminStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 544L, value.dwOperStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 548L, value.dwLastChange)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 552L, value.dwInOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 556L, value.dwInUcastPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 560L, value.dwInNUcastPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 564L, value.dwInDiscards)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 568L, value.dwInErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 572L, value.dwInUnknownProtos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 576L, value.dwOutOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 580L, value.dwOutUcastPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 584L, value.dwOutNUcastPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 588L, value.dwOutDiscards)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 592L, value.dwOutErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 596L, value.dwOutQLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 600L, value.dwDescrLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 604L, value.bDescr.toList())
                }
            }
    }
}

public data class MibIfstackRow(
    public var higherLayerInterfaceIndex: UInt = 0u,
    public var lowerLayerInterfaceIndex: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIfstackRow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIfstackRow> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MibIfstackRow =
                    MibIfstackRow(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MibIfstackRow) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.higherLayerInterfaceIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.lowerLayerInterfaceIndex)
                }
            }
    }
}

public data class MibIfstackTable(
    public var numEntries: UInt = 0u,
    public var table: List<MibIfstackRow> = List(1) { MibIfstackRow() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIfstackTable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIfstackTable> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): MibIfstackTable =
                    MibIfstackTable(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MibIfstackRow.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MibIfstackTable) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MibIfstackRow.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.table)
                }
            }
    }
}

public data class MibIfstatus(
    public var dwIfIndex: UInt = 0u,
    public var dwAdminStatus: UInt = 0u,
    public var dwOperationalStatus: UInt = 0u,
    public var bMHbeatActive: Bool = 0,
    public var bMHbeatAlive: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIfstatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIfstatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): MibIfstatus =
                    MibIfstatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MibIfstatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwIfIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwAdminStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwOperationalStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.bMHbeatActive)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.bMHbeatAlive)
                }
            }
    }
}

public data class MibIftable(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibIfrow> = List(1) { MibIfrow() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIftable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIftable> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 864L
                override fun readNative(addr: Long): MibIftable =
                    MibIftable(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MibIfrow.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MibIftable) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MibIfrow.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.table)
                }
            }
    }
}

public class MibIfRow2(
    public var interfaceLuid: NetLuidLh = NetLuidLh(),
    public var interfaceIndex: UInt = 0u,
    public var interfaceGuid: Guid = Guid(),
    public var alias: UShortArray = UShortArray(257),
    public var description: UShortArray = UShortArray(257),
    public var physicalAddressLength: UInt = 0u,
    public var physicalAddress: UByteArray = UByteArray(32),
    public var permanentPhysicalAddress: UByteArray = UByteArray(32),
    public var mtu: UInt = 0u,
    public var type: UInt = 0u,
    public var tunnelType: TunnelType = 0,
    public var mediaType: NdisMedium = 0,
    public var physicalMediumType: NdisPhysicalMedium = 0,
    public var accessType: NetIfAccessType = 0,
    public var directionType: NetIfDirectionType = 0,
    public var interfaceAndOperStatusFlags: MibIfRow20 = MibIfRow20(),
    public var operStatus: IfOperStatus = 0,
    public var adminStatus: NetIfAdminStatus = 0,
    public var mediaConnectState: NetIfMediaConnectState = 0,
    public var networkGuid: Guid = Guid(),
    public var connectionType: NetIfConnectionType = 0,
    public var transmitLinkSpeed: ULong = 0uL,
    public var receiveLinkSpeed: ULong = 0uL,
    public var inOctets: ULong = 0uL,
    public var inUcastPkts: ULong = 0uL,
    public var inNUcastPkts: ULong = 0uL,
    public var inDiscards: ULong = 0uL,
    public var inErrors: ULong = 0uL,
    public var inUnknownProtos: ULong = 0uL,
    public var inUcastOctets: ULong = 0uL,
    public var inMulticastOctets: ULong = 0uL,
    public var inBroadcastOctets: ULong = 0uL,
    public var outOctets: ULong = 0uL,
    public var outUcastPkts: ULong = 0uL,
    public var outNUcastPkts: ULong = 0uL,
    public var outDiscards: ULong = 0uL,
    public var outErrors: ULong = 0uL,
    public var outUcastOctets: ULong = 0uL,
    public var outMulticastOctets: ULong = 0uL,
    public var outBroadcastOctets: ULong = 0uL,
    public var outQLen: ULong = 0uL,
)

public data class MibIfRow20(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIfRow20> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIfRow20> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): MibIfRow20 =
                    MibIfRow20(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MibIfRow20) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class MibIfTable2(
    public var numEntries: UInt = 0u,
    public var table: List<MibIfRow2> = List(1) { MibIfRow2() },
)

public data class MibInvertedifstackRow(
    public var lowerLayerInterfaceIndex: UInt = 0u,
    public var higherLayerInterfaceIndex: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibInvertedifstackRow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibInvertedifstackRow> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MibInvertedifstackRow =
                    MibInvertedifstackRow(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MibInvertedifstackRow) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lowerLayerInterfaceIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.higherLayerInterfaceIndex)
                }
            }
    }
}

public data class MibInvertedifstackTable(
    public var numEntries: UInt = 0u,
    public var table: List<MibInvertedifstackRow> = List(1) { MibInvertedifstackRow() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibInvertedifstackTable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibInvertedifstackTable> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): MibInvertedifstackTable =
                    MibInvertedifstackTable(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MibInvertedifstackRow.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MibInvertedifstackTable) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MibInvertedifstackRow.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.table)
                }
            }
    }
}

public data class MibIpaddrrowW2k(
    public var dwAddr: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var dwBCastAddr: UInt = 0u,
    public var dwReasmSize: UInt = 0u,
    public var unused1: UShort = 0u,
    public var unused2: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpaddrrowW2k> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpaddrrowW2k> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MibIpaddrrowW2k =
                    MibIpaddrrowW2k(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                    )
                override fun writeNative(addr: Long, value: MibIpaddrrowW2k) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwBCastAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwReasmSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.unused1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.unused2)
                }
            }
    }
}

public data class MibIpaddrrowXp(
    public var dwAddr: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var dwBCastAddr: UInt = 0u,
    public var dwReasmSize: UInt = 0u,
    public var unused1: UShort = 0u,
    public var wType: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpaddrrowXp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpaddrrowXp> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MibIpaddrrowXp =
                    MibIpaddrrowXp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                    )
                override fun writeNative(addr: Long, value: MibIpaddrrowXp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwBCastAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwReasmSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.unused1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.wType)
                }
            }
    }
}

public data class MibIpaddrtable(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibIpaddrrowXp> = List(1) { MibIpaddrrowXp() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpaddrtable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpaddrtable> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): MibIpaddrtable =
                    MibIpaddrtable(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MibIpaddrrowXp.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MibIpaddrtable) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MibIpaddrrowXp.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.table)
                }
            }
    }
}

public data class MibIpdestrow(
    public var forwardRow: MibIpforwardrow = MibIpforwardrow(),
    public var dwForwardPreference: UInt = 0u,
    public var dwForwardViewSet: UInt = 0u,
)

public data class MibIpdesttable(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibIpdestrow> = List(1) { MibIpdestrow() },
)

public data class MibIpforwardnumber(
    public var dwValue: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpforwardnumber> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpforwardnumber> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MibIpforwardnumber =
                    MibIpforwardnumber(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MibIpforwardnumber) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwValue)
                }
            }
    }
}

public data class MibIpforwardrow(
    public var dwForwardDest: UInt = 0u,
    public var dwForwardMask: UInt = 0u,
    public var dwForwardPolicy: UInt = 0u,
    public var dwForwardNextHop: UInt = 0u,
    public var dwForwardIfIndex: UInt = 0u,
    public var anonymous1: MibIpforwardrow0 = MibIpforwardrow0(),
    public var anonymous2: MibIpforwardrow1 = MibIpforwardrow1(),
    public var dwForwardAge: UInt = 0u,
    public var dwForwardNextHopAS: UInt = 0u,
    public var dwForwardMetric1: UInt = 0u,
    public var dwForwardMetric2: UInt = 0u,
    public var dwForwardMetric3: UInt = 0u,
    public var dwForwardMetric4: UInt = 0u,
    public var dwForwardMetric5: UInt = 0u,
)

public data class MibIpforwardrow0(
    public var dwForwardType: UInt = 0u,
    public var forwardType: MibIpforwardType = 0,
)

public data class MibIpforwardrow1(
    public var dwForwardProto: UInt = 0u,
    public var forwardProto: NlRouteProtocol = 0,
)

public data class MibIpforwardtable(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibIpforwardrow> = List(1) { MibIpforwardrow() },
)

public data class MibIpforwardRow2(
    public var interfaceLuid: NetLuidLh = NetLuidLh(),
    public var interfaceIndex: UInt = 0u,
    public var destinationPrefix: IpAddressPrefix = IpAddressPrefix(),
    public var nextHop: SockaddrInet = SockaddrInet(),
    public var sitePrefixLength: UByte = 0u,
    public var validLifetime: UInt = 0u,
    public var preferredLifetime: UInt = 0u,
    public var metric: UInt = 0u,
    public var protocol: NlRouteProtocol = 0,
    public var loopback: Boolean = false,
    public var autoconfigureAddress: Boolean = false,
    public var publish: Boolean = false,
    public var immortal: Boolean = false,
    public var age: UInt = 0u,
    public var origin: NlRouteOrigin = 0,
)

public data class MibIpforwardTable2(
    public var numEntries: UInt = 0u,
    public var table: List<MibIpforwardRow2> = List(1) { MibIpforwardRow2() },
)

public class MibIpinterfaceRow(
    public var family: AddressFamily = 0u,
    public var interfaceLuid: NetLuidLh = NetLuidLh(),
    public var interfaceIndex: UInt = 0u,
    public var maxReassemblySize: UInt = 0u,
    public var interfaceIdentifier: ULong = 0uL,
    public var minRouterAdvertisementInterval: UInt = 0u,
    public var maxRouterAdvertisementInterval: UInt = 0u,
    public var advertisingEnabled: Boolean = false,
    public var forwardingEnabled: Boolean = false,
    public var weakHostSend: Boolean = false,
    public var weakHostReceive: Boolean = false,
    public var useAutomaticMetric: Boolean = false,
    public var useNeighborUnreachabilityDetection: Boolean = false,
    public var managedAddressConfigurationSupported: Boolean = false,
    public var otherStatefulConfigurationSupported: Boolean = false,
    public var advertiseDefaultRoute: Boolean = false,
    public var routerDiscoveryBehavior: NlRouterDiscoveryBehavior = 0,
    public var dadTransmits: UInt = 0u,
    public var baseReachableTime: UInt = 0u,
    public var retransmitTime: UInt = 0u,
    public var pathMtuDiscoveryTimeout: UInt = 0u,
    public var linkLocalAddressBehavior: NlLinkLocalAddressBehavior = 0,
    public var linkLocalAddressTimeout: UInt = 0u,
    public var zoneIndices: UIntArray = UIntArray(16),
    public var sitePrefixLength: UInt = 0u,
    public var metric: UInt = 0u,
    public var nlMtu: UInt = 0u,
    public var connected: Boolean = false,
    public var supportsWakeUpPatterns: Boolean = false,
    public var supportsNeighborDiscovery: Boolean = false,
    public var supportsRouterDiscovery: Boolean = false,
    public var reachableTime: UInt = 0u,
    public var transmitOffload: NlInterfaceOffloadRod = NlInterfaceOffloadRod(),
    public var receiveOffload: NlInterfaceOffloadRod = NlInterfaceOffloadRod(),
    public var disableDefaultRoutes: Boolean = false,
)

public data class MibIpinterfaceTable(
    public var numEntries: UInt = 0u,
    public var table: List<MibIpinterfaceRow> = List(1) { MibIpinterfaceRow() },
)

public data class MibIpmcastBoundary(
    public var dwIfIndex: UInt = 0u,
    public var dwGroupAddress: UInt = 0u,
    public var dwGroupMask: UInt = 0u,
    public var dwStatus: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastBoundary> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastBoundary> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MibIpmcastBoundary =
                    MibIpmcastBoundary(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: MibIpmcastBoundary) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwIfIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwGroupAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwGroupMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwStatus)
                }
            }
    }
}

public data class MibIpmcastBoundaryTable(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibIpmcastBoundary> = List(1) { MibIpmcastBoundary() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastBoundaryTable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastBoundaryTable> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): MibIpmcastBoundaryTable =
                    MibIpmcastBoundaryTable(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MibIpmcastBoundary.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MibIpmcastBoundaryTable) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MibIpmcastBoundary.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.table)
                }
            }
    }
}

public data class MibIpmcastGlobal(
    public var dwEnable: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastGlobal> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastGlobal> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MibIpmcastGlobal =
                    MibIpmcastGlobal(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MibIpmcastGlobal) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwEnable)
                }
            }
    }
}

public data class MibIpmcastIfEntry(
    public var dwIfIndex: UInt = 0u,
    public var dwTtl: UInt = 0u,
    public var dwProtocol: UInt = 0u,
    public var dwRateLimit: UInt = 0u,
    public var ulInMcastOctets: UInt = 0u,
    public var ulOutMcastOctets: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastIfEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastIfEntry> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MibIpmcastIfEntry =
                    MibIpmcastIfEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: MibIpmcastIfEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwIfIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwTtl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwRateLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ulInMcastOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.ulOutMcastOctets)
                }
            }
    }
}

public data class MibIpmcastIfTable(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibIpmcastIfEntry> = List(1) { MibIpmcastIfEntry() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastIfTable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastIfTable> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): MibIpmcastIfTable =
                    MibIpmcastIfTable(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MibIpmcastIfEntry.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MibIpmcastIfTable) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MibIpmcastIfEntry.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.table)
                }
            }
    }
}

public data class MibIpmcastMfe(
    public var dwGroup: UInt = 0u,
    public var dwSource: UInt = 0u,
    public var dwSrcMask: UInt = 0u,
    public var dwUpStrmNgbr: UInt = 0u,
    public var dwInIfIndex: UInt = 0u,
    public var dwInIfProtocol: UInt = 0u,
    public var dwRouteProtocol: UInt = 0u,
    public var dwRouteNetwork: UInt = 0u,
    public var dwRouteMask: UInt = 0u,
    public var ulUpTime: UInt = 0u,
    public var ulExpiryTime: UInt = 0u,
    public var ulTimeOut: UInt = 0u,
    public var ulNumOutIf: UInt = 0u,
    public var fFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var rgmioOutInfo: List<MibIpmcastOifXp> = List(1) { MibIpmcastOifXp() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastMfe> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastMfe> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 76L
                override fun readNative(addr: Long): MibIpmcastMfe =
                    MibIpmcastMfe(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MibIpmcastOifXp.typeLayout(), (1).toInt())
                        ).readNative(addr + 60L),
                    )
                override fun writeNative(addr: Long, value: MibIpmcastMfe) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwGroup)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSource)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwSrcMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwUpStrmNgbr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwInIfIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwInIfProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwRouteProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwRouteNetwork)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwRouteMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.ulUpTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.ulExpiryTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.ulTimeOut)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.ulNumOutIf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.fFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.dwReserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MibIpmcastOifXp.typeLayout(), (1).toInt())
                    ).writeNative(addr + 60L, value.rgmioOutInfo)
                }
            }
    }
}

public class MibIpmcastMfeStats(
    public var dwGroup: UInt = 0u,
    public var dwSource: UInt = 0u,
    public var dwSrcMask: UInt = 0u,
    public var dwUpStrmNgbr: UInt = 0u,
    public var dwInIfIndex: UInt = 0u,
    public var dwInIfProtocol: UInt = 0u,
    public var dwRouteProtocol: UInt = 0u,
    public var dwRouteNetwork: UInt = 0u,
    public var dwRouteMask: UInt = 0u,
    public var ulUpTime: UInt = 0u,
    public var ulExpiryTime: UInt = 0u,
    public var ulNumOutIf: UInt = 0u,
    public var ulInPkts: UInt = 0u,
    public var ulInOctets: UInt = 0u,
    public var ulPktsDifferentIf: UInt = 0u,
    public var ulQueueOverflow: UInt = 0u,
    public var rgmiosOutStats: List<MibIpmcastOifStatsLh> = List(1) { MibIpmcastOifStatsLh() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastMfeStats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastMfeStats> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 92L
                override fun readNative(addr: Long): MibIpmcastMfeStats =
                    MibIpmcastMfeStats(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MibIpmcastOifStatsLh.typeLayout(), (1).toInt())
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: MibIpmcastMfeStats) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwGroup)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSource)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwSrcMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwUpStrmNgbr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwInIfIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwInIfProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwRouteProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwRouteNetwork)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwRouteMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.ulUpTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.ulExpiryTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.ulNumOutIf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.ulInPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.ulInOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.ulPktsDifferentIf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.ulQueueOverflow)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MibIpmcastOifStatsLh.typeLayout(), (1).toInt())
                    ).writeNative(addr + 64L, value.rgmiosOutStats)
                }
            }
    }
}

public class MibIpmcastMfeStatsExXp(
    public var dwGroup: UInt = 0u,
    public var dwSource: UInt = 0u,
    public var dwSrcMask: UInt = 0u,
    public var dwUpStrmNgbr: UInt = 0u,
    public var dwInIfIndex: UInt = 0u,
    public var dwInIfProtocol: UInt = 0u,
    public var dwRouteProtocol: UInt = 0u,
    public var dwRouteNetwork: UInt = 0u,
    public var dwRouteMask: UInt = 0u,
    public var ulUpTime: UInt = 0u,
    public var ulExpiryTime: UInt = 0u,
    public var ulNumOutIf: UInt = 0u,
    public var ulInPkts: UInt = 0u,
    public var ulInOctets: UInt = 0u,
    public var ulPktsDifferentIf: UInt = 0u,
    public var ulQueueOverflow: UInt = 0u,
    public var ulUninitMfe: UInt = 0u,
    public var ulNegativeMfe: UInt = 0u,
    public var ulInDiscards: UInt = 0u,
    public var ulInHdrErrors: UInt = 0u,
    public var ulTotalOutPackets: UInt = 0u,
    public var rgmiosOutStats: List<MibIpmcastOifStatsLh> = List(1) { MibIpmcastOifStatsLh() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastMfeStatsExXp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastMfeStatsExXp> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 112L
                override fun readNative(addr: Long): MibIpmcastMfeStatsExXp =
                    MibIpmcastMfeStatsExXp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MibIpmcastOifStatsLh.typeLayout(), (1).toInt())
                        ).readNative(addr + 84L),
                    )
                override fun writeNative(addr: Long, value: MibIpmcastMfeStatsExXp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwGroup)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSource)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwSrcMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwUpStrmNgbr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwInIfIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwInIfProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwRouteProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwRouteNetwork)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwRouteMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.ulUpTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.ulExpiryTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.ulNumOutIf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.ulInPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.ulInOctets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.ulPktsDifferentIf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.ulQueueOverflow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.ulUninitMfe)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.ulNegativeMfe)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.ulInDiscards)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.ulInHdrErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.ulTotalOutPackets)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MibIpmcastOifStatsLh.typeLayout(), (1).toInt())
                    ).writeNative(addr + 84L, value.rgmiosOutStats)
                }
            }
    }
}

public data class MibIpmcastOifStatsLh(
    public var dwOutIfIndex: UInt = 0u,
    public var dwNextHopAddr: UInt = 0u,
    public var dwDialContext: UInt = 0u,
    public var ulTtlTooLow: UInt = 0u,
    public var ulFragNeeded: UInt = 0u,
    public var ulOutPackets: UInt = 0u,
    public var ulOutDiscards: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastOifStatsLh> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastOifStatsLh> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): MibIpmcastOifStatsLh =
                    MibIpmcastOifStatsLh(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: MibIpmcastOifStatsLh) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwOutIfIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNextHopAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwDialContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ulTtlTooLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ulFragNeeded)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.ulOutPackets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.ulOutDiscards)
                }
            }
    }
}

public class MibIpmcastOifStatsW2k internal constructor(
    public var dwOutIfIndex: UInt,
    public var dwNextHopAddr: UInt,
    pvDialContextCtorArg: MutPtr<CVoid>,
    public var ulTtlTooLow: UInt,
    public var ulFragNeeded: UInt,
    public var ulOutPackets: UInt,
    public var ulOutDiscards: UInt,
) {
    public var pvDialContext: MutPtr<CVoid> = pvDialContextCtorArg
        internal set

    public constructor() : this(
        dwOutIfIndex = 0u,
        dwNextHopAddr = 0u,
        pvDialContextCtorArg = MutPtr(0L),
        ulTtlTooLow = 0u,
        ulFragNeeded = 0u,
        ulOutPackets = 0u,
        ulOutDiscards = 0u,
    )

    public operator fun component1(): UInt = this.dwOutIfIndex

    public operator fun component2(): UInt = this.dwNextHopAddr

    public operator fun component3(): MutPtr<CVoid> = this.pvDialContext

    public operator fun component4(): UInt = this.ulTtlTooLow

    public operator fun component5(): UInt = this.ulFragNeeded

    public operator fun component6(): UInt = this.ulOutPackets

    public operator fun component7(): UInt = this.ulOutDiscards

    public fun copy(dwOutIfIndex: UInt = this.dwOutIfIndex, dwNextHopAddr: UInt = this.dwNextHopAddr, pvDialContext: MutPtr<CVoid> = this.pvDialContext, ulTtlTooLow: UInt = this.ulTtlTooLow, ulFragNeeded: UInt = this.ulFragNeeded, ulOutPackets: UInt = this.ulOutPackets, ulOutDiscards: UInt = this.ulOutDiscards): MibIpmcastOifStatsW2k = MibIpmcastOifStatsW2k(dwOutIfIndex = dwOutIfIndex, dwNextHopAddr = dwNextHopAddr, pvDialContextCtorArg = pvDialContext, ulTtlTooLow = ulTtlTooLow, ulFragNeeded = ulFragNeeded, ulOutPackets = ulOutPackets, ulOutDiscards = ulOutDiscards)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibIpmcastOifStatsW2k) return false
        if (this.dwOutIfIndex != other.dwOutIfIndex) return false
        if (this.dwNextHopAddr != other.dwNextHopAddr) return false
        if (this.pvDialContext != other.pvDialContext) return false
        if (this.ulTtlTooLow != other.ulTtlTooLow) return false
        if (this.ulFragNeeded != other.ulFragNeeded) return false
        if (this.ulOutPackets != other.ulOutPackets) return false
        if (this.ulOutDiscards != other.ulOutDiscards) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwOutIfIndex.hashCode()
        result = 31 * result + this.dwNextHopAddr.hashCode()
        result = 31 * result + this.pvDialContext.hashCode()
        result = 31 * result + this.ulTtlTooLow.hashCode()
        result = 31 * result + this.ulFragNeeded.hashCode()
        result = 31 * result + this.ulOutPackets.hashCode()
        result = 31 * result + this.ulOutDiscards.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastOifStatsW2k> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastOifStatsW2k> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MibIpmcastOifStatsW2k =
                    MibIpmcastOifStatsW2k(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: MibIpmcastOifStatsW2k) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwOutIfIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNextHopAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pvDialContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ulTtlTooLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.ulFragNeeded)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.ulOutPackets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.ulOutDiscards)
                }
            }

        public operator fun invoke(
            dwOutIfIndex: UInt = 0u,
            dwNextHopAddr: UInt = 0u,
            pvDialContext: MutPtr<CVoid> = MutPtr(0L),
            ulTtlTooLow: UInt = 0u,
            ulFragNeeded: UInt = 0u,
            ulOutPackets: UInt = 0u,
            ulOutDiscards: UInt = 0u,
        ): MibIpmcastOifStatsW2k =
            MibIpmcastOifStatsW2k(
                dwOutIfIndex = dwOutIfIndex,
                dwNextHopAddr = dwNextHopAddr,
                pvDialContextCtorArg = pvDialContext,
                ulTtlTooLow = ulTtlTooLow,
                ulFragNeeded = ulFragNeeded,
                ulOutPackets = ulOutPackets,
                ulOutDiscards = ulOutDiscards,
            )
    }
}

public class MibIpmcastOifW2k internal constructor(
    public var dwOutIfIndex: UInt,
    public var dwNextHopAddr: UInt,
    pvReservedCtorArg: MutPtr<CVoid>,
    public var dwReserved: UInt,
) {
    public var pvReserved: MutPtr<CVoid> = pvReservedCtorArg
        internal set

    public constructor() : this(
        dwOutIfIndex = 0u,
        dwNextHopAddr = 0u,
        pvReservedCtorArg = MutPtr(0L),
        dwReserved = 0u,
    )

    public operator fun component1(): UInt = this.dwOutIfIndex

    public operator fun component2(): UInt = this.dwNextHopAddr

    public operator fun component3(): MutPtr<CVoid> = this.pvReserved

    public operator fun component4(): UInt = this.dwReserved

    public fun copy(dwOutIfIndex: UInt = this.dwOutIfIndex, dwNextHopAddr: UInt = this.dwNextHopAddr, pvReserved: MutPtr<CVoid> = this.pvReserved, dwReserved: UInt = this.dwReserved): MibIpmcastOifW2k = MibIpmcastOifW2k(dwOutIfIndex = dwOutIfIndex, dwNextHopAddr = dwNextHopAddr, pvReservedCtorArg = pvReserved, dwReserved = dwReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibIpmcastOifW2k) return false
        if (this.dwOutIfIndex != other.dwOutIfIndex) return false
        if (this.dwNextHopAddr != other.dwNextHopAddr) return false
        if (this.pvReserved != other.pvReserved) return false
        if (this.dwReserved != other.dwReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwOutIfIndex.hashCode()
        result = 31 * result + this.dwNextHopAddr.hashCode()
        result = 31 * result + this.pvReserved.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastOifW2k> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastOifW2k> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MibIpmcastOifW2k =
                    MibIpmcastOifW2k(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MibIpmcastOifW2k) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwOutIfIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNextHopAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pvReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwReserved)
                }
            }

        public operator fun invoke(
            dwOutIfIndex: UInt = 0u,
            dwNextHopAddr: UInt = 0u,
            pvReserved: MutPtr<CVoid> = MutPtr(0L),
            dwReserved: UInt = 0u,
        ): MibIpmcastOifW2k =
            MibIpmcastOifW2k(
                dwOutIfIndex = dwOutIfIndex,
                dwNextHopAddr = dwNextHopAddr,
                pvReservedCtorArg = pvReserved,
                dwReserved = dwReserved,
            )
    }
}

public data class MibIpmcastOifXp(
    public var dwOutIfIndex: UInt = 0u,
    public var dwNextHopAddr: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var dwReserved1: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastOifXp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastOifXp> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MibIpmcastOifXp =
                    MibIpmcastOifXp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: MibIpmcastOifXp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwOutIfIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNextHopAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwReserved1)
                }
            }
    }
}

public data class MibIpmcastScope(
    public var dwGroupAddress: UInt = 0u,
    public var dwGroupMask: UInt = 0u,
    public var snNameBuffer: UShortArray = UShortArray(256),
    public var dwStatus: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibIpmcastScope) return false
        if (this.dwGroupAddress != other.dwGroupAddress) return false
        if (this.dwGroupMask != other.dwGroupMask) return false
        if (!this.snNameBuffer.contentEquals(other.snNameBuffer)) return false
        if (this.dwStatus != other.dwStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwGroupAddress.hashCode()
        result = 31 * result + this.dwGroupMask.hashCode()
        result = 31 * result + this.snNameBuffer.contentHashCode()
        result = 31 * result + this.dwStatus.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastScope> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpmcastScope> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 524L
                override fun readNative(addr: Long): MibIpmcastScope =
                    MibIpmcastScope(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 520L),
                    )
                override fun writeNative(addr: Long, value: MibIpmcastScope) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwGroupAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwGroupMask)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 8L, value.snNameBuffer.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 520L, value.dwStatus)
                }
            }
    }
}

public data class MibIpnetrowLh(
    public var dwIndex: UInt = 0u,
    public var dwPhysAddrLen: UInt = 0u,
    public var bPhysAddr: UByteArray = UByteArray(8),
    public var dwAddr: UInt = 0u,
    public var anonymous: MibIpnetrowLh0 = MibIpnetrowLh0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibIpnetrowLh) return false
        if (this.dwIndex != other.dwIndex) return false
        if (this.dwPhysAddrLen != other.dwPhysAddrLen) return false
        if (!this.bPhysAddr.contentEquals(other.bPhysAddr)) return false
        if (this.dwAddr != other.dwAddr) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwIndex.hashCode()
        result = 31 * result + this.dwPhysAddrLen.hashCode()
        result = 31 * result + this.bPhysAddr.contentHashCode()
        result = 31 * result + this.dwAddr.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class MibIpnetrowLh0(
    public var dwType: UInt = 0u,
    public var type: MibIpnetType = 0,
)

public data class MibIpnetrowW2k(
    public var dwIndex: UInt = 0u,
    public var dwPhysAddrLen: UInt = 0u,
    public var bPhysAddr: UByteArray = UByteArray(8),
    public var dwAddr: UInt = 0u,
    public var dwType: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibIpnetrowW2k) return false
        if (this.dwIndex != other.dwIndex) return false
        if (this.dwPhysAddrLen != other.dwPhysAddrLen) return false
        if (!this.bPhysAddr.contentEquals(other.bPhysAddr)) return false
        if (this.dwAddr != other.dwAddr) return false
        if (this.dwType != other.dwType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwIndex.hashCode()
        result = 31 * result + this.dwPhysAddrLen.hashCode()
        result = 31 * result + this.bPhysAddr.contentHashCode()
        result = 31 * result + this.dwAddr.hashCode()
        result = 31 * result + this.dwType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpnetrowW2k> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpnetrowW2k> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MibIpnetrowW2k =
                    MibIpnetrowW2k(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: MibIpnetrowW2k) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwPhysAddrLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 8L, value.bPhysAddr.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwType)
                }
            }
    }
}

public data class MibIpnettable(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibIpnetrowLh> = List(1) { MibIpnetrowLh() },
)

public data class MibIpnetRow2(
    public var address: SockaddrInet = SockaddrInet(),
    public var interfaceIndex: UInt = 0u,
    public var interfaceLuid: NetLuidLh = NetLuidLh(),
    public var physicalAddress: UByteArray = UByteArray(32),
    public var physicalAddressLength: UInt = 0u,
    public var state: NlNeighborState = 0,
    public var anonymous: MibIpnetRow20 = MibIpnetRow20(),
    public var reachabilityTime: MibIpnetRow21 = MibIpnetRow21(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibIpnetRow2) return false
        if (this.address != other.address) return false
        if (this.interfaceIndex != other.interfaceIndex) return false
        if (this.interfaceLuid != other.interfaceLuid) return false
        if (!this.physicalAddress.contentEquals(other.physicalAddress)) return false
        if (this.physicalAddressLength != other.physicalAddressLength) return false
        if (this.state != other.state) return false
        if (this.anonymous != other.anonymous) return false
        if (this.reachabilityTime != other.reachabilityTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.address.hashCode()
        result = 31 * result + this.interfaceIndex.hashCode()
        result = 31 * result + this.interfaceLuid.hashCode()
        result = 31 * result + this.physicalAddress.contentHashCode()
        result = 31 * result + this.physicalAddressLength.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.reachabilityTime.hashCode()
        return result
    }
}

public data class MibIpnetRow20(
    public var anonymous: MibIpnetRow200 = MibIpnetRow200(),
    public var flags: UByte = 0u,
)

public data class MibIpnetRow200(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpnetRow200> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpnetRow200> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): MibIpnetRow200 =
                    MibIpnetRow200(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MibIpnetRow200) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class MibIpnetRow21(
    public var lastReachable: UInt = 0u,
    public var lastUnreachable: UInt = 0u,
)

public data class MibIpnetTable2(
    public var numEntries: UInt = 0u,
    public var table: List<MibIpnetRow2> = List(1) { MibIpnetRow2() },
)

public data class MibIppathRow(
    public var source: SockaddrInet = SockaddrInet(),
    public var destination: SockaddrInet = SockaddrInet(),
    public var interfaceLuid: NetLuidLh = NetLuidLh(),
    public var interfaceIndex: UInt = 0u,
    public var currentNextHop: SockaddrInet = SockaddrInet(),
    public var pathMtu: UInt = 0u,
    public var rttMean: UInt = 0u,
    public var rttDeviation: UInt = 0u,
    public var anonymous: MibIppathRow0 = MibIppathRow0(),
    public var isReachable: Boolean = false,
    public var linkTransmitSpeed: ULong = 0uL,
    public var linkReceiveSpeed: ULong = 0uL,
)

public data class MibIppathRow0(
    public var lastReachable: UInt = 0u,
    public var lastUnreachable: UInt = 0u,
)

public data class MibIppathTable(
    public var numEntries: UInt = 0u,
    public var table: List<MibIppathRow> = List(1) { MibIppathRow() },
)

public class MibIpstatsLh(
    public var anonymous: MibIpstatsLh0 = MibIpstatsLh0(),
    public var dwDefaultTTL: UInt = 0u,
    public var dwInReceives: UInt = 0u,
    public var dwInHdrErrors: UInt = 0u,
    public var dwInAddrErrors: UInt = 0u,
    public var dwForwDatagrams: UInt = 0u,
    public var dwInUnknownProtos: UInt = 0u,
    public var dwInDiscards: UInt = 0u,
    public var dwInDelivers: UInt = 0u,
    public var dwOutRequests: UInt = 0u,
    public var dwRoutingDiscards: UInt = 0u,
    public var dwOutDiscards: UInt = 0u,
    public var dwOutNoRoutes: UInt = 0u,
    public var dwReasmTimeout: UInt = 0u,
    public var dwReasmReqds: UInt = 0u,
    public var dwReasmOks: UInt = 0u,
    public var dwReasmFails: UInt = 0u,
    public var dwFragOks: UInt = 0u,
    public var dwFragFails: UInt = 0u,
    public var dwFragCreates: UInt = 0u,
    public var dwNumIf: UInt = 0u,
    public var dwNumAddr: UInt = 0u,
    public var dwNumRoutes: UInt = 0u,
)

public data class MibIpstatsLh0(
    public var dwForwarding: UInt = 0u,
    public var forwarding: MibIpstatsForwarding = 0,
)

public class MibIpstatsW2k(
    public var dwForwarding: UInt = 0u,
    public var dwDefaultTTL: UInt = 0u,
    public var dwInReceives: UInt = 0u,
    public var dwInHdrErrors: UInt = 0u,
    public var dwInAddrErrors: UInt = 0u,
    public var dwForwDatagrams: UInt = 0u,
    public var dwInUnknownProtos: UInt = 0u,
    public var dwInDiscards: UInt = 0u,
    public var dwInDelivers: UInt = 0u,
    public var dwOutRequests: UInt = 0u,
    public var dwRoutingDiscards: UInt = 0u,
    public var dwOutDiscards: UInt = 0u,
    public var dwOutNoRoutes: UInt = 0u,
    public var dwReasmTimeout: UInt = 0u,
    public var dwReasmReqds: UInt = 0u,
    public var dwReasmOks: UInt = 0u,
    public var dwReasmFails: UInt = 0u,
    public var dwFragOks: UInt = 0u,
    public var dwFragFails: UInt = 0u,
    public var dwFragCreates: UInt = 0u,
    public var dwNumIf: UInt = 0u,
    public var dwNumAddr: UInt = 0u,
    public var dwNumRoutes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpstatsW2k> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibIpstatsW2k> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 92L
                override fun readNative(addr: Long): MibIpstatsW2k =
                    MibIpstatsW2k(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                    )
                override fun writeNative(addr: Long, value: MibIpstatsW2k) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwForwarding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwDefaultTTL)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwInReceives)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwInHdrErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwInAddrErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwForwDatagrams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwInUnknownProtos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwInDiscards)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwInDelivers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwOutRequests)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwRoutingDiscards)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwOutDiscards)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwOutNoRoutes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dwReasmTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.dwReasmReqds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.dwReasmOks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.dwReasmFails)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.dwFragOks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.dwFragFails)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.dwFragCreates)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.dwNumIf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.dwNumAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.dwNumRoutes)
                }
            }
    }
}

public data class MibIpNetworkConnectionBandwidthEstimates(
    public var inboundBandwidthInformation: NlBandwidthInformation = NlBandwidthInformation(),
    public var outboundBandwidthInformation: NlBandwidthInformation = NlBandwidthInformation(),
)

public data class MibMcastLimitRow(
    public var dwTtl: UInt = 0u,
    public var dwRateLimit: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibMcastLimitRow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibMcastLimitRow> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MibMcastLimitRow =
                    MibMcastLimitRow(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MibMcastLimitRow) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTtl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwRateLimit)
                }
            }
    }
}

public data class MibMfeStatsTable(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibIpmcastMfeStats> = List(1) { MibIpmcastMfeStats() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibMfeStatsTable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibMfeStatsTable> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): MibMfeStatsTable =
                    MibMfeStatsTable(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MibIpmcastMfeStats.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MibMfeStatsTable) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MibIpmcastMfeStats.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.table)
                }
            }
    }
}

public class MibMfeStatsTableExXp internal constructor(
    public var dwNumEntries: UInt,
    tableCtorArg: List<MutPtr<MibIpmcastMfeStatsExXp>>,
) {
    public var table: List<MutPtr<MibIpmcastMfeStatsExXp>> = tableCtorArg
        internal set

    public constructor() : this(
        dwNumEntries = 0u,
        tableCtorArg = List(1) { MutPtr(0L) },
    )

    public operator fun component1(): UInt = this.dwNumEntries

    public operator fun component2(): List<MutPtr<MibIpmcastMfeStatsExXp>> = this.table

    public fun copy(dwNumEntries: UInt = this.dwNumEntries, table: List<MutPtr<MibIpmcastMfeStatsExXp>> = this.table): MibMfeStatsTableExXp = MibMfeStatsTableExXp(dwNumEntries = dwNumEntries, tableCtorArg = table)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibMfeStatsTableExXp) return false
        if (this.dwNumEntries != other.dwNumEntries) return false
        if (this.table != other.table) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwNumEntries.hashCode()
        result = 31 * result + this.table.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibMfeStatsTableExXp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibMfeStatsTableExXp> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MibMfeStatsTableExXp =
                    MibMfeStatsTableExXp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<MibIpmcastMfeStatsExXp>(64),
                                    (1).toInt(),
                                )
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MibMfeStatsTableExXp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<MibIpmcastMfeStatsExXp>(64),
                                (1).toInt(),
                            )
                    ).writeNative(addr + 8L, value.table)
                }
            }

        public operator fun invoke(
            dwNumEntries: UInt = 0u,
            table: List<MutPtr<MibIpmcastMfeStatsExXp>> = List(1) { MutPtr(0L) },
        ): MibMfeStatsTableExXp =
            MibMfeStatsTableExXp(
                dwNumEntries = dwNumEntries,
                tableCtorArg = table,
            )
    }
}

public data class MibMfeTable(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibIpmcastMfe> = List(1) { MibIpmcastMfe() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibMfeTable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibMfeTable> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): MibMfeTable =
                    MibMfeTable(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MibIpmcastMfe.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MibMfeTable) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MibIpmcastMfe.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.table)
                }
            }
    }
}

public data class MibMulticastipaddressRow(
    public var address: SockaddrInet = SockaddrInet(),
    public var interfaceIndex: UInt = 0u,
    public var interfaceLuid: NetLuidLh = NetLuidLh(),
    public var scopeId: ScopeId = ScopeId(),
)

public data class MibMulticastipaddressTable(
    public var numEntries: UInt = 0u,
    public var table: List<MibMulticastipaddressRow> = List(1) { MibMulticastipaddressRow() },
)

public data class MibOpaqueInfo(
    public var dwId: UInt = 0u,
    public var anonymous: MibOpaqueInfo0 = MibOpaqueInfo0(),
)

public data class MibOpaqueInfo0(
    public var ullAlign: ULong = 0uL,
    public var rgbyData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibOpaqueInfo0) return false
        if (this.ullAlign != other.ullAlign) return false
        if (!this.rgbyData.contentEquals(other.rgbyData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ullAlign.hashCode()
        result = 31 * result + this.rgbyData.contentHashCode()
        return result
    }
}

public data class MibOpaqueQuery(
    public var dwVarId: UInt = 0u,
    public var rgdwVarIndex: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibOpaqueQuery) return false
        if (this.dwVarId != other.dwVarId) return false
        if (!this.rgdwVarIndex.contentEquals(other.rgdwVarIndex)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVarId.hashCode()
        result = 31 * result + this.rgdwVarIndex.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibOpaqueQuery> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibOpaqueQuery> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MibOpaqueQuery =
                    MibOpaqueQuery(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 4L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: MibOpaqueQuery) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVarId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 4L, value.rgdwVarIndex.toList())
                }
            }
    }
}

public data class MibProxyarp(
    public var dwAddress: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var dwIfIndex: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibProxyarp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibProxyarp> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): MibProxyarp =
                    MibProxyarp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MibProxyarp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwIfIndex)
                }
            }
    }
}

public data class MibRoutestate(
    public var bRoutesSetToStack: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibRoutestate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibRoutestate> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MibRoutestate =
                    MibRoutestate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MibRoutestate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bRoutesSetToStack)
                }
            }
    }
}

public data class MibTcp6row(
    public var state: MibTcpState = 0,
    public var localAddr: In6Addr = In6Addr(),
    public var dwLocalScopeId: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var remoteAddr: In6Addr = In6Addr(),
    public var dwRemoteScopeId: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
)

public data class MibTcp6row2(
    public var localAddr: In6Addr = In6Addr(),
    public var dwLocalScopeId: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var remoteAddr: In6Addr = In6Addr(),
    public var dwRemoteScopeId: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
    public var state: MibTcpState = 0,
    public var dwOwningPid: UInt = 0u,
    public var dwOffloadState: TcpConnectionOffloadState = 0,
)

public data class MibTcp6rowOwnerModule(
    public var ucLocalAddr: UByteArray = UByteArray(16),
    public var dwLocalScopeId: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var ucRemoteAddr: UByteArray = UByteArray(16),
    public var dwRemoteScopeId: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
    public var dwState: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
    public var liCreateTimestamp: Long = 0L,
    public var owningModuleInfo: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibTcp6rowOwnerModule) return false
        if (!this.ucLocalAddr.contentEquals(other.ucLocalAddr)) return false
        if (this.dwLocalScopeId != other.dwLocalScopeId) return false
        if (this.dwLocalPort != other.dwLocalPort) return false
        if (!this.ucRemoteAddr.contentEquals(other.ucRemoteAddr)) return false
        if (this.dwRemoteScopeId != other.dwRemoteScopeId) return false
        if (this.dwRemotePort != other.dwRemotePort) return false
        if (this.dwState != other.dwState) return false
        if (this.dwOwningPid != other.dwOwningPid) return false
        if (this.liCreateTimestamp != other.liCreateTimestamp) return false
        if (!this.owningModuleInfo.contentEquals(other.owningModuleInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucLocalAddr.contentHashCode()
        result = 31 * result + this.dwLocalScopeId.hashCode()
        result = 31 * result + this.dwLocalPort.hashCode()
        result = 31 * result + this.ucRemoteAddr.contentHashCode()
        result = 31 * result + this.dwRemoteScopeId.hashCode()
        result = 31 * result + this.dwRemotePort.hashCode()
        result = 31 * result + this.dwState.hashCode()
        result = 31 * result + this.dwOwningPid.hashCode()
        result = 31 * result + this.liCreateTimestamp.hashCode()
        result = 31 * result + this.owningModuleInfo.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcp6rowOwnerModule> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcp6rowOwnerModule> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 192L
                override fun readNative(addr: Long): MibTcp6rowOwnerModule =
                    MibTcp6rowOwnerModule(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 24L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (16).toInt())
                        ).readNative(addr + 64L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: MibTcp6rowOwnerModule) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.ucLocalAddr.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwLocalScopeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwLocalPort)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 24L, value.ucRemoteAddr.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwRemoteScopeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwRemotePort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dwOwningPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.liCreateTimestamp)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (16).toInt())
                    ).writeNative(addr + 64L, value.owningModuleInfo.toList())
                }
            }
    }
}

public data class MibTcp6rowOwnerPid(
    public var ucLocalAddr: UByteArray = UByteArray(16),
    public var dwLocalScopeId: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var ucRemoteAddr: UByteArray = UByteArray(16),
    public var dwRemoteScopeId: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
    public var dwState: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibTcp6rowOwnerPid) return false
        if (!this.ucLocalAddr.contentEquals(other.ucLocalAddr)) return false
        if (this.dwLocalScopeId != other.dwLocalScopeId) return false
        if (this.dwLocalPort != other.dwLocalPort) return false
        if (!this.ucRemoteAddr.contentEquals(other.ucRemoteAddr)) return false
        if (this.dwRemoteScopeId != other.dwRemoteScopeId) return false
        if (this.dwRemotePort != other.dwRemotePort) return false
        if (this.dwState != other.dwState) return false
        if (this.dwOwningPid != other.dwOwningPid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucLocalAddr.contentHashCode()
        result = 31 * result + this.dwLocalScopeId.hashCode()
        result = 31 * result + this.dwLocalPort.hashCode()
        result = 31 * result + this.ucRemoteAddr.contentHashCode()
        result = 31 * result + this.dwRemoteScopeId.hashCode()
        result = 31 * result + this.dwRemotePort.hashCode()
        result = 31 * result + this.dwState.hashCode()
        result = 31 * result + this.dwOwningPid.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcp6rowOwnerPid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcp6rowOwnerPid> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): MibTcp6rowOwnerPid =
                    MibTcp6rowOwnerPid(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 24L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: MibTcp6rowOwnerPid) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.ucLocalAddr.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwLocalScopeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwLocalPort)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 24L, value.ucRemoteAddr.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwRemoteScopeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwRemotePort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dwOwningPid)
                }
            }
    }
}

public data class MibTcp6table(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibTcp6row> = List(1) { MibTcp6row() },
)

public data class MibTcp6table2(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibTcp6row2> = List(1) { MibTcp6row2() },
)

public data class MibTcp6tableOwnerModule(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibTcp6rowOwnerModule> = List(1) { MibTcp6rowOwnerModule() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcp6tableOwnerModule> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcp6tableOwnerModule> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 200L
                override fun readNative(addr: Long): MibTcp6tableOwnerModule =
                    MibTcp6tableOwnerModule(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MibTcp6rowOwnerModule.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MibTcp6tableOwnerModule) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MibTcp6rowOwnerModule.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.table)
                }
            }
    }
}

public data class MibTcp6tableOwnerPid(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibTcp6rowOwnerPid> = List(1) { MibTcp6rowOwnerPid() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcp6tableOwnerPid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcp6tableOwnerPid> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 60L
                override fun readNative(addr: Long): MibTcp6tableOwnerPid =
                    MibTcp6tableOwnerPid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MibTcp6rowOwnerPid.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MibTcp6tableOwnerPid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MibTcp6rowOwnerPid.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.table)
                }
            }
    }
}

public data class MibTcprow2(
    public var dwState: UInt = 0u,
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwRemoteAddr: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
    public var dwOffloadState: TcpConnectionOffloadState = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcprow2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcprow2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): MibTcprow2 =
                    MibTcprow2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: MibTcprow2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwLocalAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwLocalPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwRemoteAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwRemotePort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwOwningPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.dwOffloadState)
                }
            }
    }
}

public data class MibTcprowLh(
    public var anonymous: MibTcprowLh0 = MibTcprowLh0(),
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwRemoteAddr: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
)

public data class MibTcprowLh0(
    public var dwState: UInt = 0u,
    public var state: MibTcpState = 0,
)

public data class MibTcprowOwnerModule(
    public var dwState: UInt = 0u,
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwRemoteAddr: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
    public var liCreateTimestamp: Long = 0L,
    public var owningModuleInfo: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibTcprowOwnerModule) return false
        if (this.dwState != other.dwState) return false
        if (this.dwLocalAddr != other.dwLocalAddr) return false
        if (this.dwLocalPort != other.dwLocalPort) return false
        if (this.dwRemoteAddr != other.dwRemoteAddr) return false
        if (this.dwRemotePort != other.dwRemotePort) return false
        if (this.dwOwningPid != other.dwOwningPid) return false
        if (this.liCreateTimestamp != other.liCreateTimestamp) return false
        if (!this.owningModuleInfo.contentEquals(other.owningModuleInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwState.hashCode()
        result = 31 * result + this.dwLocalAddr.hashCode()
        result = 31 * result + this.dwLocalPort.hashCode()
        result = 31 * result + this.dwRemoteAddr.hashCode()
        result = 31 * result + this.dwRemotePort.hashCode()
        result = 31 * result + this.dwOwningPid.hashCode()
        result = 31 * result + this.liCreateTimestamp.hashCode()
        result = 31 * result + this.owningModuleInfo.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcprowOwnerModule> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcprowOwnerModule> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 160L
                override fun readNative(addr: Long): MibTcprowOwnerModule =
                    MibTcprowOwnerModule(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (16).toInt())
                        ).readNative(addr + 32L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: MibTcprowOwnerModule) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwLocalAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwLocalPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwRemoteAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwRemotePort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwOwningPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.liCreateTimestamp)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (16).toInt())
                    ).writeNative(addr + 32L, value.owningModuleInfo.toList())
                }
            }
    }
}

public data class MibTcprowOwnerPid(
    public var dwState: UInt = 0u,
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwRemoteAddr: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcprowOwnerPid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcprowOwnerPid> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MibTcprowOwnerPid =
                    MibTcprowOwnerPid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: MibTcprowOwnerPid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwLocalAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwLocalPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwRemoteAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwRemotePort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwOwningPid)
                }
            }
    }
}

public data class MibTcprowW2k(
    public var dwState: UInt = 0u,
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwRemoteAddr: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcprowW2k> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcprowW2k> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): MibTcprowW2k =
                    MibTcprowW2k(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MibTcprowW2k) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwLocalAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwLocalPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwRemoteAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwRemotePort)
                }
            }
    }
}

public data class MibTcpstats2(
    public var rtoAlgorithm: TcpRtoAlgorithm = 0,
    public var dwRtoMin: UInt = 0u,
    public var dwRtoMax: UInt = 0u,
    public var dwMaxConn: UInt = 0u,
    public var dwActiveOpens: UInt = 0u,
    public var dwPassiveOpens: UInt = 0u,
    public var dwAttemptFails: UInt = 0u,
    public var dwEstabResets: UInt = 0u,
    public var dwCurrEstab: UInt = 0u,
    public var dw64InSegs: ULong = 0uL,
    public var dw64OutSegs: ULong = 0uL,
    public var dwRetransSegs: UInt = 0u,
    public var dwInErrs: UInt = 0u,
    public var dwOutRsts: UInt = 0u,
    public var dwNumConns: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcpstats2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcpstats2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): MibTcpstats2 =
                    MibTcpstats2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                    )
                override fun writeNative(addr: Long, value: MibTcpstats2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.rtoAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwRtoMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwRtoMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwMaxConn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwActiveOpens)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwPassiveOpens)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwAttemptFails)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwEstabResets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwCurrEstab)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.dw64InSegs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.dw64OutSegs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.dwRetransSegs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.dwInErrs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.dwOutRsts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.dwNumConns)
                }
            }
    }
}

public data class MibTcpstatsLh(
    public var anonymous: MibTcpstatsLh0 = MibTcpstatsLh0(),
    public var dwRtoMin: UInt = 0u,
    public var dwRtoMax: UInt = 0u,
    public var dwMaxConn: UInt = 0u,
    public var dwActiveOpens: UInt = 0u,
    public var dwPassiveOpens: UInt = 0u,
    public var dwAttemptFails: UInt = 0u,
    public var dwEstabResets: UInt = 0u,
    public var dwCurrEstab: UInt = 0u,
    public var dwInSegs: UInt = 0u,
    public var dwOutSegs: UInt = 0u,
    public var dwRetransSegs: UInt = 0u,
    public var dwInErrs: UInt = 0u,
    public var dwOutRsts: UInt = 0u,
    public var dwNumConns: UInt = 0u,
)

public data class MibTcpstatsLh0(
    public var dwRtoAlgorithm: UInt = 0u,
    public var rtoAlgorithm: TcpRtoAlgorithm = 0,
)

public data class MibTcpstatsW2k(
    public var dwRtoAlgorithm: UInt = 0u,
    public var dwRtoMin: UInt = 0u,
    public var dwRtoMax: UInt = 0u,
    public var dwMaxConn: UInt = 0u,
    public var dwActiveOpens: UInt = 0u,
    public var dwPassiveOpens: UInt = 0u,
    public var dwAttemptFails: UInt = 0u,
    public var dwEstabResets: UInt = 0u,
    public var dwCurrEstab: UInt = 0u,
    public var dwInSegs: UInt = 0u,
    public var dwOutSegs: UInt = 0u,
    public var dwRetransSegs: UInt = 0u,
    public var dwInErrs: UInt = 0u,
    public var dwOutRsts: UInt = 0u,
    public var dwNumConns: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcpstatsW2k> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcpstatsW2k> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 60L
                override fun readNative(addr: Long): MibTcpstatsW2k =
                    MibTcpstatsW2k(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: MibTcpstatsW2k) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwRtoAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwRtoMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwRtoMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwMaxConn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwActiveOpens)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwPassiveOpens)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwAttemptFails)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwEstabResets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwCurrEstab)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwInSegs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwOutSegs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwRetransSegs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwInErrs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dwOutRsts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.dwNumConns)
                }
            }
    }
}

public data class MibTcptable(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibTcprowLh> = List(1) { MibTcprowLh() },
)

public data class MibTcptable2(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibTcprow2> = List(1) { MibTcprow2() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcptable2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcptable2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MibTcptable2 =
                    MibTcptable2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MibTcprow2.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MibTcptable2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MibTcprow2.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.table)
                }
            }
    }
}

public data class MibTcptableOwnerModule(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibTcprowOwnerModule> = List(1) { MibTcprowOwnerModule() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcptableOwnerModule> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcptableOwnerModule> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 168L
                override fun readNative(addr: Long): MibTcptableOwnerModule =
                    MibTcptableOwnerModule(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MibTcprowOwnerModule.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MibTcptableOwnerModule) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MibTcprowOwnerModule.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.table)
                }
            }
    }
}

public data class MibTcptableOwnerPid(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibTcprowOwnerPid> = List(1) { MibTcprowOwnerPid() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcptableOwnerPid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibTcptableOwnerPid> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): MibTcptableOwnerPid =
                    MibTcptableOwnerPid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MibTcprowOwnerPid.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MibTcptableOwnerPid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MibTcprowOwnerPid.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.table)
                }
            }
    }
}

public data class MibUdp6row(
    public var dwLocalAddr: In6Addr = In6Addr(),
    public var dwLocalScopeId: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
)

public data class MibUdp6row2(
    public var ucLocalAddr: UByteArray = UByteArray(16),
    public var dwLocalScopeId: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
    public var liCreateTimestamp: Long = 0L,
    public var anonymous: MibUdp6row20 = MibUdp6row20(),
    public var owningModuleInfo: ULongArray = ULongArray(16),
    public var ucRemoteAddr: UByteArray = UByteArray(16),
    public var dwRemoteScopeId: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibUdp6row2) return false
        if (!this.ucLocalAddr.contentEquals(other.ucLocalAddr)) return false
        if (this.dwLocalScopeId != other.dwLocalScopeId) return false
        if (this.dwLocalPort != other.dwLocalPort) return false
        if (this.dwOwningPid != other.dwOwningPid) return false
        if (this.liCreateTimestamp != other.liCreateTimestamp) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.owningModuleInfo.contentEquals(other.owningModuleInfo)) return false
        if (!this.ucRemoteAddr.contentEquals(other.ucRemoteAddr)) return false
        if (this.dwRemoteScopeId != other.dwRemoteScopeId) return false
        if (this.dwRemotePort != other.dwRemotePort) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucLocalAddr.contentHashCode()
        result = 31 * result + this.dwLocalScopeId.hashCode()
        result = 31 * result + this.dwLocalPort.hashCode()
        result = 31 * result + this.dwOwningPid.hashCode()
        result = 31 * result + this.liCreateTimestamp.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.owningModuleInfo.contentHashCode()
        result = 31 * result + this.ucRemoteAddr.contentHashCode()
        result = 31 * result + this.dwRemoteScopeId.hashCode()
        result = 31 * result + this.dwRemotePort.hashCode()
        return result
    }
}

public data class MibUdp6row20(
    public var anonymous: MibUdp6row200 = MibUdp6row200(),
    public var dwFlags: Int = 0,
)

public data class MibUdp6row200(
    public var bitfield: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdp6row200> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdp6row200> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MibUdp6row200 =
                    MibUdp6row200(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MibUdp6row200) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class MibUdp6rowOwnerModule(
    public var ucLocalAddr: UByteArray = UByteArray(16),
    public var dwLocalScopeId: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
    public var liCreateTimestamp: Long = 0L,
    public var anonymous: MibUdp6rowOwnerModule0 = MibUdp6rowOwnerModule0(),
    public var owningModuleInfo: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibUdp6rowOwnerModule) return false
        if (!this.ucLocalAddr.contentEquals(other.ucLocalAddr)) return false
        if (this.dwLocalScopeId != other.dwLocalScopeId) return false
        if (this.dwLocalPort != other.dwLocalPort) return false
        if (this.dwOwningPid != other.dwOwningPid) return false
        if (this.liCreateTimestamp != other.liCreateTimestamp) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.owningModuleInfo.contentEquals(other.owningModuleInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucLocalAddr.contentHashCode()
        result = 31 * result + this.dwLocalScopeId.hashCode()
        result = 31 * result + this.dwLocalPort.hashCode()
        result = 31 * result + this.dwOwningPid.hashCode()
        result = 31 * result + this.liCreateTimestamp.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.owningModuleInfo.contentHashCode()
        return result
    }
}

public data class MibUdp6rowOwnerModule0(
    public var anonymous: MibUdp6rowOwnerModule00 = MibUdp6rowOwnerModule00(),
    public var dwFlags: Int = 0,
)

public data class MibUdp6rowOwnerModule00(
    public var bitfield: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdp6rowOwnerModule00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdp6rowOwnerModule00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MibUdp6rowOwnerModule00 =
                    MibUdp6rowOwnerModule00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MibUdp6rowOwnerModule00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class MibUdp6rowOwnerPid(
    public var ucLocalAddr: UByteArray = UByteArray(16),
    public var dwLocalScopeId: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibUdp6rowOwnerPid) return false
        if (!this.ucLocalAddr.contentEquals(other.ucLocalAddr)) return false
        if (this.dwLocalScopeId != other.dwLocalScopeId) return false
        if (this.dwLocalPort != other.dwLocalPort) return false
        if (this.dwOwningPid != other.dwOwningPid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucLocalAddr.contentHashCode()
        result = 31 * result + this.dwLocalScopeId.hashCode()
        result = 31 * result + this.dwLocalPort.hashCode()
        result = 31 * result + this.dwOwningPid.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdp6rowOwnerPid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdp6rowOwnerPid> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): MibUdp6rowOwnerPid =
                    MibUdp6rowOwnerPid(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: MibUdp6rowOwnerPid) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.ucLocalAddr.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwLocalScopeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwLocalPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwOwningPid)
                }
            }
    }
}

public data class MibUdp6table(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibUdp6row> = List(1) { MibUdp6row() },
)

public data class MibUdp6table2(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibUdp6row2> = List(1) { MibUdp6row2() },
)

public data class MibUdp6tableOwnerModule(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibUdp6rowOwnerModule> = List(1) { MibUdp6rowOwnerModule() },
)

public data class MibUdp6tableOwnerPid(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibUdp6rowOwnerPid> = List(1) { MibUdp6rowOwnerPid() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdp6tableOwnerPid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdp6tableOwnerPid> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MibUdp6tableOwnerPid =
                    MibUdp6tableOwnerPid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MibUdp6rowOwnerPid.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MibUdp6tableOwnerPid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MibUdp6rowOwnerPid.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.table)
                }
            }
    }
}

public data class MibUdprow(
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdprow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdprow> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MibUdprow =
                    MibUdprow(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MibUdprow) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwLocalAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwLocalPort)
                }
            }
    }
}

public data class MibUdprow2(
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
    public var liCreateTimestamp: Long = 0L,
    public var anonymous: MibUdprow20 = MibUdprow20(),
    public var owningModuleInfo: ULongArray = ULongArray(16),
    public var dwRemoteAddr: UInt = 0u,
    public var dwRemotePort: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibUdprow2) return false
        if (this.dwLocalAddr != other.dwLocalAddr) return false
        if (this.dwLocalPort != other.dwLocalPort) return false
        if (this.dwOwningPid != other.dwOwningPid) return false
        if (this.liCreateTimestamp != other.liCreateTimestamp) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.owningModuleInfo.contentEquals(other.owningModuleInfo)) return false
        if (this.dwRemoteAddr != other.dwRemoteAddr) return false
        if (this.dwRemotePort != other.dwRemotePort) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLocalAddr.hashCode()
        result = 31 * result + this.dwLocalPort.hashCode()
        result = 31 * result + this.dwOwningPid.hashCode()
        result = 31 * result + this.liCreateTimestamp.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.owningModuleInfo.contentHashCode()
        result = 31 * result + this.dwRemoteAddr.hashCode()
        result = 31 * result + this.dwRemotePort.hashCode()
        return result
    }
}

public data class MibUdprow20(
    public var anonymous: MibUdprow200 = MibUdprow200(),
    public var dwFlags: Int = 0,
)

public data class MibUdprow200(
    public var bitfield: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdprow200> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdprow200> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MibUdprow200 =
                    MibUdprow200(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MibUdprow200) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class MibUdprowOwnerModule(
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
    public var liCreateTimestamp: Long = 0L,
    public var anonymous: MibUdprowOwnerModule0 = MibUdprowOwnerModule0(),
    public var owningModuleInfo: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MibUdprowOwnerModule) return false
        if (this.dwLocalAddr != other.dwLocalAddr) return false
        if (this.dwLocalPort != other.dwLocalPort) return false
        if (this.dwOwningPid != other.dwOwningPid) return false
        if (this.liCreateTimestamp != other.liCreateTimestamp) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.owningModuleInfo.contentEquals(other.owningModuleInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLocalAddr.hashCode()
        result = 31 * result + this.dwLocalPort.hashCode()
        result = 31 * result + this.dwOwningPid.hashCode()
        result = 31 * result + this.liCreateTimestamp.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.owningModuleInfo.contentHashCode()
        return result
    }
}

public data class MibUdprowOwnerModule0(
    public var anonymous: MibUdprowOwnerModule00 = MibUdprowOwnerModule00(),
    public var dwFlags: Int = 0,
)

public data class MibUdprowOwnerModule00(
    public var bitfield: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdprowOwnerModule00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdprowOwnerModule00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MibUdprowOwnerModule00 =
                    MibUdprowOwnerModule00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MibUdprowOwnerModule00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class MibUdprowOwnerPid(
    public var dwLocalAddr: UInt = 0u,
    public var dwLocalPort: UInt = 0u,
    public var dwOwningPid: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdprowOwnerPid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdprowOwnerPid> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): MibUdprowOwnerPid =
                    MibUdprowOwnerPid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MibUdprowOwnerPid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwLocalAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwLocalPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwOwningPid)
                }
            }
    }
}

public data class MibUdpstats(
    public var dwInDatagrams: UInt = 0u,
    public var dwNoPorts: UInt = 0u,
    public var dwInErrors: UInt = 0u,
    public var dwOutDatagrams: UInt = 0u,
    public var dwNumAddrs: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdpstats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdpstats> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): MibUdpstats =
                    MibUdpstats(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MibUdpstats) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwInDatagrams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNoPorts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwInErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwOutDatagrams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwNumAddrs)
                }
            }
    }
}

public data class MibUdpstats2(
    public var dw64InDatagrams: ULong = 0uL,
    public var dwNoPorts: UInt = 0u,
    public var dwInErrors: UInt = 0u,
    public var dw64OutDatagrams: ULong = 0uL,
    public var dwNumAddrs: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdpstats2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdpstats2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MibUdpstats2 =
                    MibUdpstats2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: MibUdpstats2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dw64InDatagrams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwNoPorts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwInErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.dw64OutDatagrams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwNumAddrs)
                }
            }
    }
}

public data class MibUdptable(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibUdprow> = List(1) { MibUdprow() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdptable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdptable> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): MibUdptable =
                    MibUdptable(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MibUdprow.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MibUdptable) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MibUdprow.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.table)
                }
            }
    }
}

public data class MibUdptable2(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibUdprow2> = List(1) { MibUdprow2() },
)

public data class MibUdptableOwnerModule(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibUdprowOwnerModule> = List(1) { MibUdprowOwnerModule() },
)

public data class MibUdptableOwnerPid(
    public var dwNumEntries: UInt = 0u,
    public var table: List<MibUdprowOwnerPid> = List(1) { MibUdprowOwnerPid() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdptableOwnerPid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MibUdptableOwnerPid> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MibUdptableOwnerPid =
                    MibUdptableOwnerPid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MibUdprowOwnerPid.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MibUdptableOwnerPid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MibUdprowOwnerPid.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.table)
                }
            }
    }
}

public data class MibUnicastipaddressRow(
    public var address: SockaddrInet = SockaddrInet(),
    public var interfaceLuid: NetLuidLh = NetLuidLh(),
    public var interfaceIndex: UInt = 0u,
    public var prefixOrigin: NlPrefixOrigin = 0,
    public var suffixOrigin: NlSuffixOrigin = 0,
    public var validLifetime: UInt = 0u,
    public var preferredLifetime: UInt = 0u,
    public var onLinkPrefixLength: UByte = 0u,
    public var skipAsSource: Boolean = false,
    public var dadState: NlDadState = 0,
    public var scopeId: ScopeId = ScopeId(),
    public var creationTimeStamp: Long = 0L,
)

public data class MibUnicastipaddressTable(
    public var numEntries: UInt = 0u,
    public var table: List<MibUnicastipaddressRow> = List(1) { MibUnicastipaddressRow() },
)

public data class NetAddressInfo(
    public var format: NetAddressFormat = 0,
    public var anonymous: NetAddressInfo0 = NetAddressInfo0(),
)

public data class NetAddressInfo0(
    public var namedAddress: NetAddressInfo00 = NetAddressInfo00(),
    public var ipv4Address: SockaddrIn = SockaddrIn(),
    public var ipv6Address: SockaddrIn6 = SockaddrIn6(),
    public var ipAddress: Sockaddr = Sockaddr(),
)

public data class NetAddressInfo00(
    public var address: UShortArray = UShortArray(256),
    public var port: UShortArray = UShortArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetAddressInfo00) return false
        if (!this.address.contentEquals(other.address)) return false
        if (!this.port.contentEquals(other.port)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.address.contentHashCode()
        result = 31 * result + this.port.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetAddressInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NetAddressInfo00> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 524L
                override fun readNative(addr: Long): NetAddressInfo00 =
                    NetAddressInfo00(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (6).toInt())
                        ).readNative(addr + 512L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: NetAddressInfo00) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr, value.address.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (6).toInt())
                    ).writeNative(addr + 512L, value.port.toList())
                }
            }
    }
}

public data class Pflogframe(
    public var timestamp: Long = 0L,
    public var pfeTypeOfFrame: Pfframetype = 0,
    public var dwTotalSizeUsed: UInt = 0u,
    public var dwFilterRule: UInt = 0u,
    public var wSizeOfAdditionalData: UShort = 0u,
    public var wSizeOfIpHeader: UShort = 0u,
    public var dwInterfaceName: UInt = 0u,
    public var dwIPIndex: UInt = 0u,
    public var bPacketData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pflogframe) return false
        if (this.timestamp != other.timestamp) return false
        if (this.pfeTypeOfFrame != other.pfeTypeOfFrame) return false
        if (this.dwTotalSizeUsed != other.dwTotalSizeUsed) return false
        if (this.dwFilterRule != other.dwFilterRule) return false
        if (this.wSizeOfAdditionalData != other.wSizeOfAdditionalData) return false
        if (this.wSizeOfIpHeader != other.wSizeOfIpHeader) return false
        if (this.dwInterfaceName != other.dwInterfaceName) return false
        if (this.dwIPIndex != other.dwIPIndex) return false
        if (!this.bPacketData.contentEquals(other.bPacketData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.timestamp.hashCode()
        result = 31 * result + this.pfeTypeOfFrame.hashCode()
        result = 31 * result + this.dwTotalSizeUsed.hashCode()
        result = 31 * result + this.dwFilterRule.hashCode()
        result = 31 * result + this.wSizeOfAdditionalData.hashCode()
        result = 31 * result + this.wSizeOfIpHeader.hashCode()
        result = 31 * result + this.dwInterfaceName.hashCode()
        result = 31 * result + this.dwIPIndex.hashCode()
        result = 31 * result + this.bPacketData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pflogframe> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pflogframe> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Pflogframe =
                    Pflogframe(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 32L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Pflogframe) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.timestamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.pfeTypeOfFrame)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwTotalSizeUsed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwFilterRule)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.wSizeOfAdditionalData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.wSizeOfIpHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwInterfaceName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwIPIndex)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 32L, value.bPacketData.toList())
                }
            }
    }
}

public class PfFilterDescriptor internal constructor(
    public var dwFilterFlags: UInt,
    public var dwRule: UInt,
    public var pfatType: Pfaddresstype,
    srcAddrCtorArg: MutPtr<UByte>,
    srcMaskCtorArg: MutPtr<UByte>,
    dstAddrCtorArg: MutPtr<UByte>,
    dstMaskCtorArg: MutPtr<UByte>,
    public var dwProtocol: UInt,
    public var fLateBound: UInt,
    public var wSrcPort: UShort,
    public var wDstPort: UShort,
    public var wSrcPortHighRange: UShort,
    public var wDstPortHighRange: UShort,
) {
    public var srcAddr: MutPtr<UByte> = srcAddrCtorArg
        internal set

    public var srcMask: MutPtr<UByte> = srcMaskCtorArg
        internal set

    public var dstAddr: MutPtr<UByte> = dstAddrCtorArg
        internal set

    public var dstMask: MutPtr<UByte> = dstMaskCtorArg
        internal set

    public constructor() : this(
        dwFilterFlags = 0u,
        dwRule = 0u,
        pfatType = 0,
        srcAddrCtorArg = MutPtr(0L),
        srcMaskCtorArg = MutPtr(0L),
        dstAddrCtorArg = MutPtr(0L),
        dstMaskCtorArg = MutPtr(0L),
        dwProtocol = 0u,
        fLateBound = 0u,
        wSrcPort = 0u,
        wDstPort = 0u,
        wSrcPortHighRange = 0u,
        wDstPortHighRange = 0u,
    )

    public operator fun component1(): UInt = this.dwFilterFlags

    public operator fun component2(): UInt = this.dwRule

    public operator fun component3(): Pfaddresstype = this.pfatType

    public operator fun component4(): MutPtr<UByte> = this.srcAddr

    public operator fun component5(): MutPtr<UByte> = this.srcMask

    public operator fun component6(): MutPtr<UByte> = this.dstAddr

    public operator fun component7(): MutPtr<UByte> = this.dstMask

    public operator fun component8(): UInt = this.dwProtocol

    public operator fun component9(): UInt = this.fLateBound

    public operator fun component10(): UShort = this.wSrcPort

    public operator fun component11(): UShort = this.wDstPort

    public operator fun component12(): UShort = this.wSrcPortHighRange

    public operator fun component13(): UShort = this.wDstPortHighRange

    public fun copy(dwFilterFlags: UInt = this.dwFilterFlags, dwRule: UInt = this.dwRule, pfatType: Pfaddresstype = this.pfatType, srcAddr: MutPtr<UByte> = this.srcAddr, srcMask: MutPtr<UByte> = this.srcMask, dstAddr: MutPtr<UByte> = this.dstAddr, dstMask: MutPtr<UByte> = this.dstMask, dwProtocol: UInt = this.dwProtocol, fLateBound: UInt = this.fLateBound, wSrcPort: UShort = this.wSrcPort, wDstPort: UShort = this.wDstPort, wSrcPortHighRange: UShort = this.wSrcPortHighRange, wDstPortHighRange: UShort = this.wDstPortHighRange): PfFilterDescriptor = PfFilterDescriptor(dwFilterFlags = dwFilterFlags, dwRule = dwRule, pfatType = pfatType, srcAddrCtorArg = srcAddr, srcMaskCtorArg = srcMask, dstAddrCtorArg = dstAddr, dstMaskCtorArg = dstMask, dwProtocol = dwProtocol, fLateBound = fLateBound, wSrcPort = wSrcPort, wDstPort = wDstPort, wSrcPortHighRange = wSrcPortHighRange, wDstPortHighRange = wDstPortHighRange)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PfFilterDescriptor) return false
        if (this.dwFilterFlags != other.dwFilterFlags) return false
        if (this.dwRule != other.dwRule) return false
        if (this.pfatType != other.pfatType) return false
        if (this.srcAddr != other.srcAddr) return false
        if (this.srcMask != other.srcMask) return false
        if (this.dstAddr != other.dstAddr) return false
        if (this.dstMask != other.dstMask) return false
        if (this.dwProtocol != other.dwProtocol) return false
        if (this.fLateBound != other.fLateBound) return false
        if (this.wSrcPort != other.wSrcPort) return false
        if (this.wDstPort != other.wDstPort) return false
        if (this.wSrcPortHighRange != other.wSrcPortHighRange) return false
        if (this.wDstPortHighRange != other.wDstPortHighRange) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFilterFlags.hashCode()
        result = 31 * result + this.dwRule.hashCode()
        result = 31 * result + this.pfatType.hashCode()
        result = 31 * result + this.srcAddr.hashCode()
        result = 31 * result + this.srcMask.hashCode()
        result = 31 * result + this.dstAddr.hashCode()
        result = 31 * result + this.dstMask.hashCode()
        result = 31 * result + this.dwProtocol.hashCode()
        result = 31 * result + this.fLateBound.hashCode()
        result = 31 * result + this.wSrcPort.hashCode()
        result = 31 * result + this.wDstPort.hashCode()
        result = 31 * result + this.wSrcPortHighRange.hashCode()
        result = 31 * result + this.wDstPortHighRange.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PfFilterDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PfFilterDescriptor> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): PfFilterDescriptor =
                    PfFilterDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 58L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 62L),
                    )
                override fun writeNative(addr: Long, value: PfFilterDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFilterFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwRule)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.pfatType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 16L, value.srcAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 24L, value.srcMask)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 32L, value.dstAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 40L, value.dstMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.fLateBound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 56L, value.wSrcPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 58L, value.wDstPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 60L, value.wSrcPortHighRange)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 62L, value.wDstPortHighRange)
                }
            }

        public operator fun invoke(
            dwFilterFlags: UInt = 0u,
            dwRule: UInt = 0u,
            pfatType: Pfaddresstype = 0,
            srcAddr: MutPtr<UByte> = MutPtr(0L),
            srcMask: MutPtr<UByte> = MutPtr(0L),
            dstAddr: MutPtr<UByte> = MutPtr(0L),
            dstMask: MutPtr<UByte> = MutPtr(0L),
            dwProtocol: UInt = 0u,
            fLateBound: UInt = 0u,
            wSrcPort: UShort = 0u,
            wDstPort: UShort = 0u,
            wSrcPortHighRange: UShort = 0u,
            wDstPortHighRange: UShort = 0u,
        ): PfFilterDescriptor =
            PfFilterDescriptor(
                dwFilterFlags = dwFilterFlags,
                dwRule = dwRule,
                pfatType = pfatType,
                srcAddrCtorArg = srcAddr,
                srcMaskCtorArg = srcMask,
                dstAddrCtorArg = dstAddr,
                dstMaskCtorArg = dstMask,
                dwProtocol = dwProtocol,
                fLateBound = fLateBound,
                wSrcPort = wSrcPort,
                wDstPort = wDstPort,
                wSrcPortHighRange = wSrcPortHighRange,
                wDstPortHighRange = wDstPortHighRange,
            )
    }
}

public data class PfFilterStats(
    public var dwNumPacketsFiltered: UInt = 0u,
    public var info: PfFilterDescriptor = PfFilterDescriptor(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PfFilterStats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PfFilterStats> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): PfFilterStats =
                    PfFilterStats(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (PfFilterDescriptor.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PfFilterStats) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumPacketsFiltered)
                    (PfFilterDescriptor.typeLayout()).writeNative(addr + 8L, value.info)
                }
            }
    }
}

public class PfInterfaceStats internal constructor(
    pvDriverContextCtorArg: MutPtr<CVoid>,
    public var dwFlags: UInt,
    public var dwInDrops: UInt,
    public var dwOutDrops: UInt,
    public var eaInAction: PfforwardAction,
    public var eaOutAction: PfforwardAction,
    public var dwNumInFilters: UInt,
    public var dwNumOutFilters: UInt,
    public var dwFrag: UInt,
    public var dwSpoof: UInt,
    public var dwReserved1: UInt,
    public var dwReserved2: UInt,
    public var liSYN: Long,
    public var liTotalLogged: Long,
    public var dwLostLogEntries: UInt,
    public var filterInfo: List<PfFilterStats>,
) {
    public var pvDriverContext: MutPtr<CVoid> = pvDriverContextCtorArg
        internal set

    public constructor() : this(
        pvDriverContextCtorArg = MutPtr(0L),
        dwFlags = 0u,
        dwInDrops = 0u,
        dwOutDrops = 0u,
        eaInAction = 0,
        eaOutAction = 0,
        dwNumInFilters = 0u,
        dwNumOutFilters = 0u,
        dwFrag = 0u,
        dwSpoof = 0u,
        dwReserved1 = 0u,
        dwReserved2 = 0u,
        liSYN = 0L,
        liTotalLogged = 0L,
        dwLostLogEntries = 0u,
        filterInfo = List(1) { PfFilterStats() },
    )

    public operator fun component1(): MutPtr<CVoid> = this.pvDriverContext

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): UInt = this.dwInDrops

    public operator fun component4(): UInt = this.dwOutDrops

    public operator fun component5(): PfforwardAction = this.eaInAction

    public operator fun component6(): PfforwardAction = this.eaOutAction

    public operator fun component7(): UInt = this.dwNumInFilters

    public operator fun component8(): UInt = this.dwNumOutFilters

    public operator fun component9(): UInt = this.dwFrag

    public operator fun component10(): UInt = this.dwSpoof

    public operator fun component11(): UInt = this.dwReserved1

    public operator fun component12(): UInt = this.dwReserved2

    public operator fun component13(): Long = this.liSYN

    public operator fun component14(): Long = this.liTotalLogged

    public operator fun component15(): UInt = this.dwLostLogEntries

    public operator fun component16(): List<PfFilterStats> = this.filterInfo

    public fun copy(pvDriverContext: MutPtr<CVoid> = this.pvDriverContext, dwFlags: UInt = this.dwFlags, dwInDrops: UInt = this.dwInDrops, dwOutDrops: UInt = this.dwOutDrops, eaInAction: PfforwardAction = this.eaInAction, eaOutAction: PfforwardAction = this.eaOutAction, dwNumInFilters: UInt = this.dwNumInFilters, dwNumOutFilters: UInt = this.dwNumOutFilters, dwFrag: UInt = this.dwFrag, dwSpoof: UInt = this.dwSpoof, dwReserved1: UInt = this.dwReserved1, dwReserved2: UInt = this.dwReserved2, liSYN: Long = this.liSYN, liTotalLogged: Long = this.liTotalLogged, dwLostLogEntries: UInt = this.dwLostLogEntries, filterInfo: List<PfFilterStats> = this.filterInfo): PfInterfaceStats = PfInterfaceStats(pvDriverContextCtorArg = pvDriverContext, dwFlags = dwFlags, dwInDrops = dwInDrops, dwOutDrops = dwOutDrops, eaInAction = eaInAction, eaOutAction = eaOutAction, dwNumInFilters = dwNumInFilters, dwNumOutFilters = dwNumOutFilters, dwFrag = dwFrag, dwSpoof = dwSpoof, dwReserved1 = dwReserved1, dwReserved2 = dwReserved2, liSYN = liSYN, liTotalLogged = liTotalLogged, dwLostLogEntries = dwLostLogEntries, filterInfo = filterInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PfInterfaceStats) return false
        if (this.pvDriverContext != other.pvDriverContext) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwInDrops != other.dwInDrops) return false
        if (this.dwOutDrops != other.dwOutDrops) return false
        if (this.eaInAction != other.eaInAction) return false
        if (this.eaOutAction != other.eaOutAction) return false
        if (this.dwNumInFilters != other.dwNumInFilters) return false
        if (this.dwNumOutFilters != other.dwNumOutFilters) return false
        if (this.dwFrag != other.dwFrag) return false
        if (this.dwSpoof != other.dwSpoof) return false
        if (this.dwReserved1 != other.dwReserved1) return false
        if (this.dwReserved2 != other.dwReserved2) return false
        if (this.liSYN != other.liSYN) return false
        if (this.liTotalLogged != other.liTotalLogged) return false
        if (this.dwLostLogEntries != other.dwLostLogEntries) return false
        if (this.filterInfo != other.filterInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pvDriverContext.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwInDrops.hashCode()
        result = 31 * result + this.dwOutDrops.hashCode()
        result = 31 * result + this.eaInAction.hashCode()
        result = 31 * result + this.eaOutAction.hashCode()
        result = 31 * result + this.dwNumInFilters.hashCode()
        result = 31 * result + this.dwNumOutFilters.hashCode()
        result = 31 * result + this.dwFrag.hashCode()
        result = 31 * result + this.dwSpoof.hashCode()
        result = 31 * result + this.dwReserved1.hashCode()
        result = 31 * result + this.dwReserved2.hashCode()
        result = 31 * result + this.liSYN.hashCode()
        result = 31 * result + this.liTotalLogged.hashCode()
        result = 31 * result + this.dwLostLogEntries.hashCode()
        result = 31 * result + this.filterInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PfInterfaceStats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PfInterfaceStats> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 152L
                override fun readNative(addr: Long): PfInterfaceStats =
                    PfInterfaceStats(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(PfFilterStats.typeLayout(), (1).toInt())
                        ).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: PfInterfaceStats) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.pvDriverContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwInDrops)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwOutDrops)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.eaInAction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.eaOutAction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwNumInFilters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwNumOutFilters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwFrag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwSpoof)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwReserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.liSYN)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.liTotalLogged)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.dwLostLogEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(PfFilterStats.typeLayout(), (1).toInt())
                    ).writeNative(addr + 80L, value.filterInfo)
                }
            }

        public operator fun invoke(
            pvDriverContext: MutPtr<CVoid> = MutPtr(0L),
            dwFlags: UInt = 0u,
            dwInDrops: UInt = 0u,
            dwOutDrops: UInt = 0u,
            eaInAction: PfforwardAction = 0,
            eaOutAction: PfforwardAction = 0,
            dwNumInFilters: UInt = 0u,
            dwNumOutFilters: UInt = 0u,
            dwFrag: UInt = 0u,
            dwSpoof: UInt = 0u,
            dwReserved1: UInt = 0u,
            dwReserved2: UInt = 0u,
            liSYN: Long = 0L,
            liTotalLogged: Long = 0L,
            dwLostLogEntries: UInt = 0u,
            filterInfo: List<PfFilterStats> = List(1) { PfFilterStats() },
        ): PfInterfaceStats =
            PfInterfaceStats(
                pvDriverContextCtorArg = pvDriverContext,
                dwFlags = dwFlags,
                dwInDrops = dwInDrops,
                dwOutDrops = dwOutDrops,
                eaInAction = eaInAction,
                eaOutAction = eaOutAction,
                dwNumInFilters = dwNumInFilters,
                dwNumOutFilters = dwNumOutFilters,
                dwFrag = dwFrag,
                dwSpoof = dwSpoof,
                dwReserved1 = dwReserved1,
                dwReserved2 = dwReserved2,
                liSYN = liSYN,
                liTotalLogged = liTotalLogged,
                dwLostLogEntries = dwLostLogEntries,
                filterInfo = filterInfo,
            )
    }
}

public class PfLatebindInfo internal constructor(
    srcAddrCtorArg: MutPtr<UByte>,
    dstAddrCtorArg: MutPtr<UByte>,
    maskCtorArg: MutPtr<UByte>,
) {
    public var srcAddr: MutPtr<UByte> = srcAddrCtorArg
        internal set

    public var dstAddr: MutPtr<UByte> = dstAddrCtorArg
        internal set

    public var mask: MutPtr<UByte> = maskCtorArg
        internal set

    public constructor() : this(
        srcAddrCtorArg = MutPtr(0L),
        dstAddrCtorArg = MutPtr(0L),
        maskCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<UByte> = this.srcAddr

    public operator fun component2(): MutPtr<UByte> = this.dstAddr

    public operator fun component3(): MutPtr<UByte> = this.mask

    public fun copy(srcAddr: MutPtr<UByte> = this.srcAddr, dstAddr: MutPtr<UByte> = this.dstAddr, mask: MutPtr<UByte> = this.mask): PfLatebindInfo = PfLatebindInfo(srcAddrCtorArg = srcAddr, dstAddrCtorArg = dstAddr, maskCtorArg = mask)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PfLatebindInfo) return false
        if (this.srcAddr != other.srcAddr) return false
        if (this.dstAddr != other.dstAddr) return false
        if (this.mask != other.mask) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.srcAddr.hashCode()
        result = 31 * result + this.dstAddr.hashCode()
        result = 31 * result + this.mask.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PfLatebindInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PfLatebindInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): PfLatebindInfo =
                    PfLatebindInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: PfLatebindInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr, value.srcAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.dstAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 16L, value.mask)
                }
            }

        public operator fun invoke(
            srcAddr: MutPtr<UByte> = MutPtr(0L),
            dstAddr: MutPtr<UByte> = MutPtr(0L),
            mask: MutPtr<UByte> = MutPtr(0L),
        ): PfLatebindInfo =
            PfLatebindInfo(
                srcAddrCtorArg = srcAddr,
                dstAddrCtorArg = dstAddr,
                maskCtorArg = mask,
            )
    }
}

public class TcpipOwnerModuleBasicInfo internal constructor(
    pModuleNameCtorArg: Pwstr,
    pModulePathCtorArg: Pwstr,
) {
    public var pModuleName: Pwstr = pModuleNameCtorArg
        internal set

    public var pModulePath: Pwstr = pModulePathCtorArg
        internal set

    public constructor() : this(
        pModuleNameCtorArg = MutPtr(0L),
        pModulePathCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pModuleName

    public operator fun component2(): Pwstr = this.pModulePath

    public fun copy(pModuleName: Pwstr = this.pModuleName, pModulePath: Pwstr = this.pModulePath): TcpipOwnerModuleBasicInfo = TcpipOwnerModuleBasicInfo(pModuleNameCtorArg = pModuleName, pModulePathCtorArg = pModulePath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TcpipOwnerModuleBasicInfo) return false
        if (this.pModuleName != other.pModuleName) return false
        if (this.pModulePath != other.pModulePath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pModuleName.hashCode()
        result = 31 * result + this.pModulePath.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pModuleName: Pwstr = MutPtr(0L),
            pModulePath: Pwstr = MutPtr(0L),
        ): TcpipOwnerModuleBasicInfo =
            TcpipOwnerModuleBasicInfo(
                pModuleNameCtorArg = pModuleName,
                pModulePathCtorArg = pModulePath,
            )
    }
}

public data class TcpEstatsBandwidthRodV0(
    public var outboundBandwidth: ULong = 0uL,
    public var inboundBandwidth: ULong = 0uL,
    public var outboundInstability: ULong = 0uL,
    public var inboundInstability: ULong = 0uL,
    public var outboundBandwidthPeaked: Boolean = false,
    public var inboundBandwidthPeaked: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsBandwidthRodV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsBandwidthRodV0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): TcpEstatsBandwidthRodV0 =
                    TcpEstatsBandwidthRodV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 33L),
                    )
                override fun writeNative(addr: Long, value: TcpEstatsBandwidthRodV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.outboundBandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.inboundBandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.outboundInstability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.inboundInstability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 32L, value.outboundBandwidthPeaked)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 33L, value.inboundBandwidthPeaked)
                }
            }
    }
}

public data class TcpEstatsBandwidthRwV0(
    public var enableCollectionOutbound: TcpBooleanOptional = 0,
    public var enableCollectionInbound: TcpBooleanOptional = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsBandwidthRwV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsBandwidthRwV0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): TcpEstatsBandwidthRwV0 =
                    TcpEstatsBandwidthRwV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: TcpEstatsBandwidthRwV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.enableCollectionOutbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.enableCollectionInbound)
                }
            }
    }
}

public data class TcpEstatsDataRodV0(
    public var dataBytesOut: ULong = 0uL,
    public var dataSegsOut: ULong = 0uL,
    public var dataBytesIn: ULong = 0uL,
    public var dataSegsIn: ULong = 0uL,
    public var segsOut: ULong = 0uL,
    public var segsIn: ULong = 0uL,
    public var softErrors: UInt = 0u,
    public var softErrorReason: UInt = 0u,
    public var sndUna: UInt = 0u,
    public var sndNxt: UInt = 0u,
    public var sndMax: UInt = 0u,
    public var thruBytesAcked: ULong = 0uL,
    public var rcvNxt: UInt = 0u,
    public var thruBytesReceived: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsDataRodV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsDataRodV0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): TcpEstatsDataRodV0 =
                    TcpEstatsDataRodV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                    )
                override fun writeNative(addr: Long, value: TcpEstatsDataRodV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dataBytesOut)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.dataSegsOut)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.dataBytesIn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.dataSegsIn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.segsOut)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.segsIn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.softErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.softErrorReason)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.sndUna)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.sndNxt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.sndMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.thruBytesAcked)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.rcvNxt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.thruBytesReceived)
                }
            }
    }
}

public data class TcpEstatsDataRwV0(
    public var enableCollection: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsDataRwV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsDataRwV0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): TcpEstatsDataRwV0 =
                    TcpEstatsDataRwV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TcpEstatsDataRwV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.enableCollection)
                }
            }
    }
}

public data class TcpEstatsFineRttRodV0(
    public var rttVar: UInt = 0u,
    public var maxRtt: UInt = 0u,
    public var minRtt: UInt = 0u,
    public var sumRtt: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsFineRttRodV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsFineRttRodV0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): TcpEstatsFineRttRodV0 =
                    TcpEstatsFineRttRodV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: TcpEstatsFineRttRodV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.rttVar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxRtt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minRtt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.sumRtt)
                }
            }
    }
}

public data class TcpEstatsFineRttRwV0(
    public var enableCollection: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsFineRttRwV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsFineRttRwV0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): TcpEstatsFineRttRwV0 =
                    TcpEstatsFineRttRwV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TcpEstatsFineRttRwV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.enableCollection)
                }
            }
    }
}

public data class TcpEstatsObsRecRodV0(
    public var curRwinRcvd: UInt = 0u,
    public var maxRwinRcvd: UInt = 0u,
    public var minRwinRcvd: UInt = 0u,
    public var winScaleRcvd: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsObsRecRodV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsObsRecRodV0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): TcpEstatsObsRecRodV0 =
                    TcpEstatsObsRecRodV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: TcpEstatsObsRecRodV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.curRwinRcvd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxRwinRcvd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minRwinRcvd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.winScaleRcvd)
                }
            }
    }
}

public data class TcpEstatsObsRecRwV0(
    public var enableCollection: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsObsRecRwV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsObsRecRwV0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): TcpEstatsObsRecRwV0 =
                    TcpEstatsObsRecRwV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TcpEstatsObsRecRwV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.enableCollection)
                }
            }
    }
}

public class TcpEstatsPathRodV0(
    public var fastRetran: UInt = 0u,
    public var timeouts: UInt = 0u,
    public var subsequentTimeouts: UInt = 0u,
    public var curTimeoutCount: UInt = 0u,
    public var abruptTimeouts: UInt = 0u,
    public var pktsRetrans: UInt = 0u,
    public var bytesRetrans: UInt = 0u,
    public var dupAcksIn: UInt = 0u,
    public var sacksRcvd: UInt = 0u,
    public var sackBlocksRcvd: UInt = 0u,
    public var congSignals: UInt = 0u,
    public var preCongSumCwnd: UInt = 0u,
    public var preCongSumRtt: UInt = 0u,
    public var postCongSumRtt: UInt = 0u,
    public var postCongCountRtt: UInt = 0u,
    public var ecnSignals: UInt = 0u,
    public var eceRcvd: UInt = 0u,
    public var sendStall: UInt = 0u,
    public var quenchRcvd: UInt = 0u,
    public var retranThresh: UInt = 0u,
    public var sndDupAckEpisodes: UInt = 0u,
    public var sumBytesReordered: UInt = 0u,
    public var nonRecovDa: UInt = 0u,
    public var nonRecovDaEpisodes: UInt = 0u,
    public var ackAfterFr: UInt = 0u,
    public var dsackDups: UInt = 0u,
    public var sampleRtt: UInt = 0u,
    public var smoothedRtt: UInt = 0u,
    public var rttVar: UInt = 0u,
    public var maxRtt: UInt = 0u,
    public var minRtt: UInt = 0u,
    public var sumRtt: UInt = 0u,
    public var countRtt: UInt = 0u,
    public var curRto: UInt = 0u,
    public var maxRto: UInt = 0u,
    public var minRto: UInt = 0u,
    public var curMss: UInt = 0u,
    public var maxMss: UInt = 0u,
    public var minMss: UInt = 0u,
    public var spuriousRtoDetections: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsPathRodV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsPathRodV0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 160L
                override fun readNative(addr: Long): TcpEstatsPathRodV0 =
                    TcpEstatsPathRodV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 116L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 148L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 156L),
                    )
                override fun writeNative(addr: Long, value: TcpEstatsPathRodV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fastRetran)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.timeouts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.subsequentTimeouts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.curTimeoutCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.abruptTimeouts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.pktsRetrans)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.bytesRetrans)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dupAcksIn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.sacksRcvd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.sackBlocksRcvd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.congSignals)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.preCongSumCwnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.preCongSumRtt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.postCongSumRtt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.postCongCountRtt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.ecnSignals)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.eceRcvd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.sendStall)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.quenchRcvd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.retranThresh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.sndDupAckEpisodes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.sumBytesReordered)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.nonRecovDa)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.nonRecovDaEpisodes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.ackAfterFr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.dsackDups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.sampleRtt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.smoothedRtt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.rttVar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 116L, value.maxRtt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.minRtt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 124L, value.sumRtt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.countRtt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.curRto)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.maxRto)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.minRto)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 144L, value.curMss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 148L, value.maxMss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 152L, value.minMss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 156L, value.spuriousRtoDetections)
                }
            }
    }
}

public data class TcpEstatsPathRwV0(
    public var enableCollection: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsPathRwV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsPathRwV0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): TcpEstatsPathRwV0 =
                    TcpEstatsPathRwV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TcpEstatsPathRwV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.enableCollection)
                }
            }
    }
}

public data class TcpEstatsRecRodV0(
    public var curRwinSent: UInt = 0u,
    public var maxRwinSent: UInt = 0u,
    public var minRwinSent: UInt = 0u,
    public var limRwin: UInt = 0u,
    public var dupAckEpisodes: UInt = 0u,
    public var dupAcksOut: UInt = 0u,
    public var ceRcvd: UInt = 0u,
    public var ecnSent: UInt = 0u,
    public var ecnNoncesRcvd: UInt = 0u,
    public var curReasmQueue: UInt = 0u,
    public var maxReasmQueue: UInt = 0u,
    public var curAppRQueue: Int = 0,
    public var maxAppRQueue: Int = 0,
    public var winScaleSent: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsRecRodV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsRecRodV0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): TcpEstatsRecRodV0 =
                    TcpEstatsRecRodV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: TcpEstatsRecRodV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.curRwinSent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxRwinSent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minRwinSent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.limRwin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dupAckEpisodes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dupAcksOut)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.ceRcvd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.ecnSent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.ecnNoncesRcvd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.curReasmQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.maxReasmQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 48L, value.curAppRQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 56L, value.maxAppRQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 64L, value.winScaleSent)
                }
            }
    }
}

public data class TcpEstatsRecRwV0(
    public var enableCollection: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsRecRwV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsRecRwV0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): TcpEstatsRecRwV0 =
                    TcpEstatsRecRwV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TcpEstatsRecRwV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.enableCollection)
                }
            }
    }
}

public data class TcpEstatsSendBuffRodV0(
    public var curRetxQueue: Int = 0,
    public var maxRetxQueue: Int = 0,
    public var curAppWQueue: Int = 0,
    public var maxAppWQueue: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsSendBuffRodV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsSendBuffRodV0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): TcpEstatsSendBuffRodV0 =
                    TcpEstatsSendBuffRodV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: TcpEstatsSendBuffRodV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.curRetxQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.maxRetxQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.curAppWQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.maxAppWQueue)
                }
            }
    }
}

public data class TcpEstatsSendBuffRwV0(
    public var enableCollection: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsSendBuffRwV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsSendBuffRwV0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): TcpEstatsSendBuffRwV0 =
                    TcpEstatsSendBuffRwV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TcpEstatsSendBuffRwV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.enableCollection)
                }
            }
    }
}

public class TcpEstatsSndCongRodV0(
    public var sndLimTransRwin: UInt = 0u,
    public var sndLimTimeRwin: UInt = 0u,
    public var sndLimBytesRwin: Int = 0,
    public var sndLimTransCwnd: UInt = 0u,
    public var sndLimTimeCwnd: UInt = 0u,
    public var sndLimBytesCwnd: Int = 0,
    public var sndLimTransSnd: UInt = 0u,
    public var sndLimTimeSnd: UInt = 0u,
    public var sndLimBytesSnd: Int = 0,
    public var slowStart: UInt = 0u,
    public var congAvoid: UInt = 0u,
    public var otherReductions: UInt = 0u,
    public var curCwnd: UInt = 0u,
    public var maxSsCwnd: UInt = 0u,
    public var maxCaCwnd: UInt = 0u,
    public var curSsthresh: UInt = 0u,
    public var maxSsthresh: UInt = 0u,
    public var minSsthresh: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsSndCongRodV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsSndCongRodV0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): TcpEstatsSndCongRodV0 =
                    TcpEstatsSndCongRodV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: TcpEstatsSndCongRodV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sndLimTransRwin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sndLimTimeRwin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.sndLimBytesRwin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.sndLimTransCwnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.sndLimTimeCwnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.sndLimBytesCwnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.sndLimTransSnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.sndLimTimeSnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 40L, value.sndLimBytesSnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.slowStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.congAvoid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.otherReductions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.curCwnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.maxSsCwnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.maxCaCwnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.curSsthresh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.maxSsthresh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.minSsthresh)
                }
            }
    }
}

public data class TcpEstatsSndCongRosV0(
    public var limCwnd: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsSndCongRosV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsSndCongRosV0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): TcpEstatsSndCongRosV0 =
                    TcpEstatsSndCongRosV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TcpEstatsSndCongRosV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.limCwnd)
                }
            }
    }
}

public data class TcpEstatsSndCongRwV0(
    public var enableCollection: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsSndCongRwV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsSndCongRwV0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): TcpEstatsSndCongRwV0 =
                    TcpEstatsSndCongRwV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: TcpEstatsSndCongRwV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.enableCollection)
                }
            }
    }
}

public data class TcpEstatsSynOptsRosV0(
    public var activeOpen: Boolean = false,
    public var mssRcvd: UInt = 0u,
    public var mssSent: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsSynOptsRosV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpEstatsSynOptsRosV0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): TcpEstatsSynOptsRosV0 =
                    TcpEstatsSynOptsRosV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TcpEstatsSynOptsRosV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.activeOpen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mssRcvd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.mssSent)
                }
            }
    }
}

public data class TcpReservePortRange(
    public var upperRange: UShort = 0u,
    public var lowerRange: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpReservePortRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpReservePortRange> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): TcpReservePortRange =
                    TcpReservePortRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: TcpReservePortRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.upperRange)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.lowerRange)
                }
            }
    }
}
