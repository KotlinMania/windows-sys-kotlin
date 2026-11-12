@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NdisObjectHeader
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.EapAttributes
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.EapMethodType

public class Dot11extApis(
    public var dot11ExtAllocateBuffer: Dot11extAllocateBuffer = null,
    public var dot11ExtFreeBuffer: Dot11extFreeBuffer = null,
    public var dot11ExtSetProfileCustomUserData: Dot11extSetProfileCustomUserData = null,
    public var dot11ExtGetProfileCustomUserData: Dot11extGetProfileCustomUserData = null,
    public var dot11ExtSetCurrentProfile: Dot11extSetCurrentProfile = null,
    public var dot11ExtSendUIRequest: Dot11extSendUiRequest = null,
    public var dot11ExtPreAssociateCompletion: Dot11extPreAssociateCompletion = null,
    public var dot11ExtPostAssociateCompletion: Dot11extPostAssociateCompletion = null,
    public var dot11ExtSendNotification: Dot11extSendNotification = null,
    public var dot11ExtSendPacket: Dot11extSendPacket = null,
    public var dot11ExtSetEtherTypeHandling: Dot11extSetEthertypeHandling = null,
    public var dot11ExtSetAuthAlgorithm: Dot11extSetAuthAlgorithm = null,
    public var dot11ExtSetUnicastCipherAlgorithm: Dot11extSetUnicastCipherAlgorithm = null,
    public var dot11ExtSetMulticastCipherAlgorithm: Dot11extSetMulticastCipherAlgorithm = null,
    public var dot11ExtSetDefaultKey: Dot11extSetDefaultKey = null,
    public var dot11ExtSetKeyMappingKey: Dot11extSetKeyMappingKey = null,
    public var dot11ExtSetDefaultKeyId: Dot11extSetDefaultKeyId = null,
    public var dot11ExtNicSpecificExtension: Dot11extNicSpecificExtension = null,
    public var dot11ExtSetExcludeUnencrypted: Dot11extSetExcludeUnencrypted = null,
    public var dot11ExtStartOneX: Dot11extOnexStart = null,
    public var dot11ExtStopOneX: Dot11extOnexStop = null,
    public var dot11ExtProcessSecurityPacket: Dot11extProcessOnexPacket = null,
)

public class Dot11extIhvConnectivityProfile internal constructor(
    pszXmlFragmentIhvConnectivityCtorArg: Pwstr,
) {
    public var pszXmlFragmentIhvConnectivity: Pwstr = pszXmlFragmentIhvConnectivityCtorArg
        internal set

    public constructor() : this(
        pszXmlFragmentIhvConnectivityCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pszXmlFragmentIhvConnectivity

    public fun copy(pszXmlFragmentIhvConnectivity: Pwstr = this.pszXmlFragmentIhvConnectivity): Dot11extIhvConnectivityProfile = Dot11extIhvConnectivityProfile(pszXmlFragmentIhvConnectivityCtorArg = pszXmlFragmentIhvConnectivity)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11extIhvConnectivityProfile) return false
        if (this.pszXmlFragmentIhvConnectivity != other.pszXmlFragmentIhvConnectivity) return false
        return true
    }

    override fun hashCode(): Int = this.pszXmlFragmentIhvConnectivity.hashCode()

    public companion object {
        public operator fun invoke(
            pszXmlFragmentIhvConnectivity: Pwstr = MutPtr(0L),
        ): Dot11extIhvConnectivityProfile =
            Dot11extIhvConnectivityProfile(
                pszXmlFragmentIhvConnectivityCtorArg = pszXmlFragmentIhvConnectivity,
            )
    }
}

public data class Dot11extIhvDiscoveryProfile(
    public var ihvConnectivityProfile: Dot11extIhvConnectivityProfile = Dot11extIhvConnectivityProfile(),
    public var ihvSecurityProfile: Dot11extIhvSecurityProfile = Dot11extIhvSecurityProfile(),
)

public class Dot11extIhvDiscoveryProfileList internal constructor(
    public var dwCount: UInt,
    pIhvDiscoveryProfilesCtorArg: MutPtr<Dot11extIhvDiscoveryProfile>,
) {
    public var pIhvDiscoveryProfiles: MutPtr<Dot11extIhvDiscoveryProfile> = pIhvDiscoveryProfilesCtorArg
        internal set

    public constructor() : this(
        dwCount = 0u,
        pIhvDiscoveryProfilesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwCount

    public operator fun component2(): MutPtr<Dot11extIhvDiscoveryProfile> = this.pIhvDiscoveryProfiles

    public fun copy(dwCount: UInt = this.dwCount, pIhvDiscoveryProfiles: MutPtr<Dot11extIhvDiscoveryProfile> = this.pIhvDiscoveryProfiles): Dot11extIhvDiscoveryProfileList = Dot11extIhvDiscoveryProfileList(dwCount = dwCount, pIhvDiscoveryProfilesCtorArg = pIhvDiscoveryProfiles)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11extIhvDiscoveryProfileList) return false
        if (this.dwCount != other.dwCount) return false
        if (this.pIhvDiscoveryProfiles != other.pIhvDiscoveryProfiles) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwCount.hashCode()
        result = 31 * result + this.pIhvDiscoveryProfiles.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11extIhvDiscoveryProfileList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11extIhvDiscoveryProfileList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dot11extIhvDiscoveryProfileList =
                    Dot11extIhvDiscoveryProfileList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Dot11extIhvDiscoveryProfile>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11extIhvDiscoveryProfileList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Dot11extIhvDiscoveryProfile>(64)
                    ).writeNative(addr + 8L, value.pIhvDiscoveryProfiles)
                }
            }

        public operator fun invoke(
            dwCount: UInt = 0u,
            pIhvDiscoveryProfiles: MutPtr<Dot11extIhvDiscoveryProfile> = MutPtr(0L),
        ): Dot11extIhvDiscoveryProfileList =
            Dot11extIhvDiscoveryProfileList(
                dwCount = dwCount,
                pIhvDiscoveryProfilesCtorArg = pIhvDiscoveryProfiles,
            )
    }
}

public class Dot11extIhvHandlers(
    public var dot11ExtIhvDeinitService: Dot11extihvDeinitService = null,
    public var dot11ExtIhvInitAdapter: Dot11extihvInitAdapter = null,
    public var dot11ExtIhvDeinitAdapter: Dot11extihvDeinitAdapter = null,
    public var dot11ExtIhvPerformPreAssociate: Dot11extihvPerformPreAssociate = null,
    public var dot11ExtIhvAdapterReset: Dot11extihvAdapterReset = null,
    public var dot11ExtIhvPerformPostAssociate: Dot11extihvPerformPostAssociate = null,
    public var dot11ExtIhvStopPostAssociate: Dot11extihvStopPostAssociate = null,
    public var dot11ExtIhvValidateProfile: Dot11extihvValidateProfile = null,
    public var dot11ExtIhvPerformCapabilityMatch: Dot11extihvPerformCapabilityMatch = null,
    public var dot11ExtIhvCreateDiscoveryProfiles: Dot11extihvCreateDiscoveryProfiles = null,
    public var dot11ExtIhvProcessSessionChange: Dot11extihvProcessSessionChange = null,
    public var dot11ExtIhvReceiveIndication: Dot11extihvReceiveIndication = null,
    public var dot11ExtIhvReceivePacket: Dot11extihvReceivePacket = null,
    public var dot11ExtIhvSendPacketCompletion: Dot11extihvSendPacketCompletion = null,
    public var dot11ExtIhvIsUIRequestPending: Dot11extihvIsUiRequestPending = null,
    public var dot11ExtIhvProcessUIResponse: Dot11extihvProcessUiResponse = null,
    public var dot11ExtIhvQueryUIRequest: Dot11extihvQueryUiRequest = null,
    public var dot11ExtIhvOnexIndicateResult: Dot11extihvOnexIndicateResult = null,
    public var dot11ExtIhvControl: Dot11extihvControl = null,
)

public data class Dot11extIhvParams(
    public var dot11ExtIhvProfileParams: Dot11extIhvProfileParams = Dot11extIhvProfileParams(),
    public var wstrProfileName: UShortArray = UShortArray(256),
    public var dwProfileTypeFlags: UInt = 0u,
    public var interfaceGuid: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11extIhvParams) return false
        if (this.dot11ExtIhvProfileParams != other.dot11ExtIhvProfileParams) return false
        if (!this.wstrProfileName.contentEquals(other.wstrProfileName)) return false
        if (this.dwProfileTypeFlags != other.dwProfileTypeFlags) return false
        if (this.interfaceGuid != other.interfaceGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11ExtIhvProfileParams.hashCode()
        result = 31 * result + this.wstrProfileName.contentHashCode()
        result = 31 * result + this.dwProfileTypeFlags.hashCode()
        result = 31 * result + this.interfaceGuid.hashCode()
        return result
    }
}

public class Dot11extIhvProfileParams internal constructor(
    pSsidListCtorArg: MutPtr<Dot11extIhvSsidList>,
    public var bssType: Dot11BssType,
    pMSSecuritySettingsCtorArg: MutPtr<Dot11MssecuritySettings>,
) {
    public var pSsidList: MutPtr<Dot11extIhvSsidList> = pSsidListCtorArg
        internal set

    public var pMSSecuritySettings: MutPtr<Dot11MssecuritySettings> = pMSSecuritySettingsCtorArg
        internal set

    public constructor() : this(
        pSsidListCtorArg = MutPtr(0L),
        bssType = 0,
        pMSSecuritySettingsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Dot11extIhvSsidList> = this.pSsidList

    public operator fun component2(): Dot11BssType = this.bssType

    public operator fun component3(): MutPtr<Dot11MssecuritySettings> = this.pMSSecuritySettings

    public fun copy(pSsidList: MutPtr<Dot11extIhvSsidList> = this.pSsidList, bssType: Dot11BssType = this.bssType, pMSSecuritySettings: MutPtr<Dot11MssecuritySettings> = this.pMSSecuritySettings): Dot11extIhvProfileParams = Dot11extIhvProfileParams(pSsidListCtorArg = pSsidList, bssType = bssType, pMSSecuritySettingsCtorArg = pMSSecuritySettings)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11extIhvProfileParams) return false
        if (this.pSsidList != other.pSsidList) return false
        if (this.bssType != other.bssType) return false
        if (this.pMSSecuritySettings != other.pMSSecuritySettings) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pSsidList.hashCode()
        result = 31 * result + this.bssType.hashCode()
        result = 31 * result + this.pMSSecuritySettings.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11extIhvProfileParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11extIhvProfileParams> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dot11extIhvProfileParams =
                    Dot11extIhvProfileParams(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Dot11extIhvSsidList>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Dot11MssecuritySettings>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Dot11extIhvProfileParams) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Dot11extIhvSsidList>(64)
                    ).writeNative(addr, value.pSsidList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.bssType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Dot11MssecuritySettings>(64)
                    ).writeNative(addr + 16L, value.pMSSecuritySettings)
                }
            }

        public operator fun invoke(
            pSsidList: MutPtr<Dot11extIhvSsidList> = MutPtr(0L),
            bssType: Dot11BssType = 0,
            pMSSecuritySettings: MutPtr<Dot11MssecuritySettings> = MutPtr(0L),
        ): Dot11extIhvProfileParams =
            Dot11extIhvProfileParams(
                pSsidListCtorArg = pSsidList,
                bssType = bssType,
                pMSSecuritySettingsCtorArg = pMSSecuritySettings,
            )
    }
}

public class Dot11extIhvSecurityProfile internal constructor(
    pszXmlFragmentIhvSecurityCtorArg: Pwstr,
    public var bUseMSOnex: Bool,
) {
    public var pszXmlFragmentIhvSecurity: Pwstr = pszXmlFragmentIhvSecurityCtorArg
        internal set

    public constructor() : this(
        pszXmlFragmentIhvSecurityCtorArg = MutPtr(0L),
        bUseMSOnex = 0,
    )

    public operator fun component1(): Pwstr = this.pszXmlFragmentIhvSecurity

    public operator fun component2(): Bool = this.bUseMSOnex

    public fun copy(pszXmlFragmentIhvSecurity: Pwstr = this.pszXmlFragmentIhvSecurity, bUseMSOnex: Bool = this.bUseMSOnex): Dot11extIhvSecurityProfile = Dot11extIhvSecurityProfile(pszXmlFragmentIhvSecurityCtorArg = pszXmlFragmentIhvSecurity, bUseMSOnex = bUseMSOnex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11extIhvSecurityProfile) return false
        if (this.pszXmlFragmentIhvSecurity != other.pszXmlFragmentIhvSecurity) return false
        if (this.bUseMSOnex != other.bUseMSOnex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszXmlFragmentIhvSecurity.hashCode()
        result = 31 * result + this.bUseMSOnex.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszXmlFragmentIhvSecurity: Pwstr = MutPtr(0L),
            bUseMSOnex: Bool = 0,
        ): Dot11extIhvSecurityProfile =
            Dot11extIhvSecurityProfile(
                pszXmlFragmentIhvSecurityCtorArg = pszXmlFragmentIhvSecurity,
                bUseMSOnex = bUseMSOnex,
            )
    }
}

public data class Dot11extIhvSsidList(
    public var ulCount: UInt = 0u,
    public var sSIDs: List<Dot11Ssid> = List(1) { Dot11Ssid() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11extIhvSsidList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11extIhvSsidList> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11extIhvSsidList =
                    Dot11extIhvSsidList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Dot11Ssid.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11extIhvSsidList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Dot11Ssid.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.sSIDs)
                }
            }
    }
}

public class Dot11extIhvUiRequest internal constructor(
    public var dwSessionId: UInt,
    public var guidUIRequest: Guid,
    public var uIPageClsid: Guid,
    public var dwByteCount: UInt,
    pvUIRequestCtorArg: MutPtr<UByte>,
) {
    public var pvUIRequest: MutPtr<UByte> = pvUIRequestCtorArg
        internal set

    public constructor() : this(
        dwSessionId = 0u,
        guidUIRequest = Guid(),
        uIPageClsid = Guid(),
        dwByteCount = 0u,
        pvUIRequestCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSessionId

    public operator fun component2(): Guid = this.guidUIRequest

    public operator fun component3(): Guid = this.uIPageClsid

    public operator fun component4(): UInt = this.dwByteCount

    public operator fun component5(): MutPtr<UByte> = this.pvUIRequest

    public fun copy(dwSessionId: UInt = this.dwSessionId, guidUIRequest: Guid = this.guidUIRequest, uIPageClsid: Guid = this.uIPageClsid, dwByteCount: UInt = this.dwByteCount, pvUIRequest: MutPtr<UByte> = this.pvUIRequest): Dot11extIhvUiRequest = Dot11extIhvUiRequest(dwSessionId = dwSessionId, guidUIRequest = guidUIRequest, uIPageClsid = uIPageClsid, dwByteCount = dwByteCount, pvUIRequestCtorArg = pvUIRequest)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11extIhvUiRequest) return false
        if (this.dwSessionId != other.dwSessionId) return false
        if (this.guidUIRequest != other.guidUIRequest) return false
        if (this.uIPageClsid != other.uIPageClsid) return false
        if (this.dwByteCount != other.dwByteCount) return false
        if (this.pvUIRequest != other.pvUIRequest) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSessionId.hashCode()
        result = 31 * result + this.guidUIRequest.hashCode()
        result = 31 * result + this.uIPageClsid.hashCode()
        result = 31 * result + this.dwByteCount.hashCode()
        result = 31 * result + this.pvUIRequest.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSessionId: UInt = 0u,
            guidUIRequest: Guid = Guid(),
            uIPageClsid: Guid = Guid(),
            dwByteCount: UInt = 0u,
            pvUIRequest: MutPtr<UByte> = MutPtr(0L),
        ): Dot11extIhvUiRequest =
            Dot11extIhvUiRequest(
                dwSessionId = dwSessionId,
                guidUIRequest = guidUIRequest,
                uIPageClsid = uIPageClsid,
                dwByteCount = dwByteCount,
                pvUIRequestCtorArg = pvUIRequest,
            )
    }
}

public data class Dot11extVirtualStationApis(
    public var dot11ExtRequestVirtualStation: Dot11extRequestVirtualStation = null,
    public var dot11ExtReleaseVirtualStation: Dot11extReleaseVirtualStation = null,
    public var dot11ExtQueryVirtualStationProperties: Dot11extQueryVirtualStationProperties = null,
    public var dot11ExtSetVirtualStationAPProperties: Dot11extSetVirtualStationApProperties = null,
)

public data class Dot11extVirtualStationApProperty(
    public var dot11SSID: Dot11Ssid = Dot11Ssid(),
    public var dot11AuthAlgo: Dot11AuthAlgorithm = 0,
    public var dot11CipherAlgo: Dot11CipherAlgorithm = 0,
    public var bIsPassPhrase: Bool = 0,
    public var dwKeyLength: UInt = 0u,
    public var ucKeyData: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11extVirtualStationApProperty) return false
        if (this.dot11SSID != other.dot11SSID) return false
        if (this.dot11AuthAlgo != other.dot11AuthAlgo) return false
        if (this.dot11CipherAlgo != other.dot11CipherAlgo) return false
        if (this.bIsPassPhrase != other.bIsPassPhrase) return false
        if (this.dwKeyLength != other.dwKeyLength) return false
        if (!this.ucKeyData.contentEquals(other.ucKeyData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11SSID.hashCode()
        result = 31 * result + this.dot11AuthAlgo.hashCode()
        result = 31 * result + this.dot11CipherAlgo.hashCode()
        result = 31 * result + this.bIsPassPhrase.hashCode()
        result = 31 * result + this.dwKeyLength.hashCode()
        result = 31 * result + this.ucKeyData.contentHashCode()
        return result
    }
}

public data class Dot11Accessnetworkoptions(
    public var accessNetworkType: UByte = 0u,
    public var internet: UByte = 0u,
    public var asra: UByte = 0u,
    public var esr: UByte = 0u,
    public var uesa: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11Accessnetworkoptions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11Accessnetworkoptions> {
                override val sizeBytes: Long = 5L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Dot11Accessnetworkoptions =
                    Dot11Accessnetworkoptions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11Accessnetworkoptions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.accessNetworkType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.internet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.asra)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.esr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.uesa)
                }
            }
    }
}

public class Dot11Adapter internal constructor(
    public var gAdapterId: Guid,
    pszDescriptionCtorArg: Pwstr,
    public var dot11CurrentOpMode: Dot11CurrentOperationMode,
) {
    public var pszDescription: Pwstr = pszDescriptionCtorArg
        internal set

    public constructor() : this(
        gAdapterId = Guid(),
        pszDescriptionCtorArg = MutPtr(0L),
        dot11CurrentOpMode = Dot11CurrentOperationMode(),
    )

    public operator fun component1(): Guid = this.gAdapterId

    public operator fun component2(): Pwstr = this.pszDescription

    public operator fun component3(): Dot11CurrentOperationMode = this.dot11CurrentOpMode

    public fun copy(gAdapterId: Guid = this.gAdapterId, pszDescription: Pwstr = this.pszDescription, dot11CurrentOpMode: Dot11CurrentOperationMode = this.dot11CurrentOpMode): Dot11Adapter = Dot11Adapter(gAdapterId = gAdapterId, pszDescriptionCtorArg = pszDescription, dot11CurrentOpMode = dot11CurrentOpMode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11Adapter) return false
        if (this.gAdapterId != other.gAdapterId) return false
        if (this.pszDescription != other.pszDescription) return false
        if (this.dot11CurrentOpMode != other.dot11CurrentOpMode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.gAdapterId.hashCode()
        result = 31 * result + this.pszDescription.hashCode()
        result = 31 * result + this.dot11CurrentOpMode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            gAdapterId: Guid = Guid(),
            pszDescription: Pwstr = MutPtr(0L),
            dot11CurrentOpMode: Dot11CurrentOperationMode = Dot11CurrentOperationMode(),
        ): Dot11Adapter =
            Dot11Adapter(
                gAdapterId = gAdapterId,
                pszDescriptionCtorArg = pszDescription,
                dot11CurrentOpMode = dot11CurrentOpMode,
            )
    }
}

public data class Dot11AdditionalIe(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uBeaconIEsOffset: UInt = 0u,
    public var uBeaconIEsLength: UInt = 0u,
    public var uResponseIEsOffset: UInt = 0u,
    public var uResponseIEsLength: UInt = 0u,
)

public class Dot11AnqpQueryCompleteParameters internal constructor(
    public var header: NdisObjectHeader,
    public var status: Dot11AnqpQueryResult,
    hContextCtorArg: Handle,
    public var uResponseLength: UInt,
) {
    public var hContext: Handle = hContextCtorArg
        internal set

    public constructor() : this(
        header = NdisObjectHeader(),
        status = 0,
        hContextCtorArg = MutPtr(0L),
        uResponseLength = 0u,
    )

    public operator fun component1(): NdisObjectHeader = this.header

    public operator fun component2(): Dot11AnqpQueryResult = this.status

    public operator fun component3(): Handle = this.hContext

    public operator fun component4(): UInt = this.uResponseLength

    public fun copy(header: NdisObjectHeader = this.header, status: Dot11AnqpQueryResult = this.status, hContext: Handle = this.hContext, uResponseLength: UInt = this.uResponseLength): Dot11AnqpQueryCompleteParameters = Dot11AnqpQueryCompleteParameters(header = header, status = status, hContextCtorArg = hContext, uResponseLength = uResponseLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11AnqpQueryCompleteParameters) return false
        if (this.header != other.header) return false
        if (this.status != other.status) return false
        if (this.hContext != other.hContext) return false
        if (this.uResponseLength != other.uResponseLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.hContext.hashCode()
        result = 31 * result + this.uResponseLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            header: NdisObjectHeader = NdisObjectHeader(),
            status: Dot11AnqpQueryResult = 0,
            hContext: Handle = MutPtr(0L),
            uResponseLength: UInt = 0u,
        ): Dot11AnqpQueryCompleteParameters =
            Dot11AnqpQueryCompleteParameters(
                header = header,
                status = status,
                hContextCtorArg = hContext,
                uResponseLength = uResponseLength,
            )
    }
}

public data class Dot11ApJoinRequest(
    public var uJoinFailureTimeout: UInt = 0u,
    public var operationalRateSet: Dot11RateSet = Dot11RateSet(),
    public var uChCenterFrequency: UInt = 0u,
    public var dot11BSSDescription: Dot11BssDescription = Dot11BssDescription(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ApJoinRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ApJoinRequest> {
                override val sizeBytes: Long = 192L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dot11ApJoinRequest =
                    Dot11ApJoinRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (Dot11RateSet.typeLayout()).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (Dot11BssDescription.typeLayout()).readNative(addr + 144L),
                    )
                override fun writeNative(addr: Long, value: Dot11ApJoinRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uJoinFailureTimeout)
                    (Dot11RateSet.typeLayout()).writeNative(addr + 4L, value.operationalRateSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.uChCenterFrequency)
                    (Dot11BssDescription.typeLayout()).writeNative(addr + 144L, value.dot11BSSDescription)
                }
            }
    }
}

public class Dot11AssociationCompletionParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var macAddr: UByteArray = UByteArray(6),
    public var uStatus: UInt = 0u,
    public var bReAssocReq: Boolean = false,
    public var bReAssocResp: Boolean = false,
    public var uAssocReqOffset: UInt = 0u,
    public var uAssocReqSize: UInt = 0u,
    public var uAssocRespOffset: UInt = 0u,
    public var uAssocRespSize: UInt = 0u,
    public var uBeaconOffset: UInt = 0u,
    public var uBeaconSize: UInt = 0u,
    public var uIHVDataOffset: UInt = 0u,
    public var uIHVDataSize: UInt = 0u,
    public var authAlgo: Dot11AuthAlgorithm = 0,
    public var unicastCipher: Dot11CipherAlgorithm = 0,
    public var multicastCipher: Dot11CipherAlgorithm = 0,
    public var uActivePhyListOffset: UInt = 0u,
    public var uActivePhyListSize: UInt = 0u,
    public var bFourAddressSupported: Boolean = false,
    public var bPortAuthorized: Boolean = false,
    public var ucActiveQoSProtocol: UByte = 0u,
    public var dSInfo: Dot11DsInfo = 0,
    public var uEncapTableOffset: UInt = 0u,
    public var uEncapTableSize: UInt = 0u,
    public var multicastMgmtCipher: Dot11CipherAlgorithm = 0,
    public var uAssocComebackTime: UInt = 0u,
)

public data class Dot11AssociationInfoEx(
    public var peerMacAddress: UByteArray = UByteArray(6),
    public var bssid: UByteArray = UByteArray(6),
    public var usCapabilityInformation: UShort = 0u,
    public var usListenInterval: UShort = 0u,
    public var ucPeerSupportedRates: UByteArray = UByteArray(255),
    public var usAssociationID: UShort = 0u,
    public var dot11AssociationState: Dot11AssociationState = 0,
    public var dot11PowerMode: Dot11PowerMode = 0,
    public var liAssociationUpTime: Long = 0L,
    public var ullNumOfTxPacketSuccesses: ULong = 0uL,
    public var ullNumOfTxPacketFailures: ULong = 0uL,
    public var ullNumOfRxPacketSuccesses: ULong = 0uL,
    public var ullNumOfRxPacketFailures: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11AssociationInfoEx) return false
        if (!this.peerMacAddress.contentEquals(other.peerMacAddress)) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (this.usCapabilityInformation != other.usCapabilityInformation) return false
        if (this.usListenInterval != other.usListenInterval) return false
        if (!this.ucPeerSupportedRates.contentEquals(other.ucPeerSupportedRates)) return false
        if (this.usAssociationID != other.usAssociationID) return false
        if (this.dot11AssociationState != other.dot11AssociationState) return false
        if (this.dot11PowerMode != other.dot11PowerMode) return false
        if (this.liAssociationUpTime != other.liAssociationUpTime) return false
        if (this.ullNumOfTxPacketSuccesses != other.ullNumOfTxPacketSuccesses) return false
        if (this.ullNumOfTxPacketFailures != other.ullNumOfTxPacketFailures) return false
        if (this.ullNumOfRxPacketSuccesses != other.ullNumOfRxPacketSuccesses) return false
        if (this.ullNumOfRxPacketFailures != other.ullNumOfRxPacketFailures) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.peerMacAddress.contentHashCode()
        result = 31 * result + this.bssid.contentHashCode()
        result = 31 * result + this.usCapabilityInformation.hashCode()
        result = 31 * result + this.usListenInterval.hashCode()
        result = 31 * result + this.ucPeerSupportedRates.contentHashCode()
        result = 31 * result + this.usAssociationID.hashCode()
        result = 31 * result + this.dot11AssociationState.hashCode()
        result = 31 * result + this.dot11PowerMode.hashCode()
        result = 31 * result + this.liAssociationUpTime.hashCode()
        result = 31 * result + this.ullNumOfTxPacketSuccesses.hashCode()
        result = 31 * result + this.ullNumOfTxPacketFailures.hashCode()
        result = 31 * result + this.ullNumOfRxPacketSuccesses.hashCode()
        result = 31 * result + this.ullNumOfRxPacketFailures.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11AssociationInfoEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11AssociationInfoEx> {
                override val sizeBytes: Long = 328L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dot11AssociationInfoEx =
                    Dot11AssociationInfoEx(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (255).toInt())
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 272L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 276L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 280L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 288L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 296L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 304L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 312L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 320L),
                    )
                override fun writeNative(addr: Long, value: Dot11AssociationInfoEx) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.peerMacAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 6L, value.bssid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.usCapabilityInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.usListenInterval)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (255).toInt())
                    ).writeNative(addr + 16L, value.ucPeerSupportedRates)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 272L, value.usAssociationID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 276L, value.dot11AssociationState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 280L, value.dot11PowerMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 288L, value.liAssociationUpTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 296L, value.ullNumOfTxPacketSuccesses)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 304L, value.ullNumOfTxPacketFailures)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 312L, value.ullNumOfRxPacketSuccesses)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 320L, value.ullNumOfRxPacketFailures)
                }
            }
    }
}

public data class Dot11AssociationInfoList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11AssocInfo: List<Dot11AssociationInfoEx> = List(1) { Dot11AssociationInfoEx() },
)

public data class Dot11AssociationParams(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var bssid: UByteArray = UByteArray(6),
    public var uAssocRequestIEsOffset: UInt = 0u,
    public var uAssocRequestIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11AssociationParams) return false
        if (this.header != other.header) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (this.uAssocRequestIEsOffset != other.uAssocRequestIEsOffset) return false
        if (this.uAssocRequestIEsLength != other.uAssocRequestIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.bssid.contentHashCode()
        result = 31 * result + this.uAssocRequestIEsOffset.hashCode()
        result = 31 * result + this.uAssocRequestIEsLength.hashCode()
        return result
    }
}

public data class Dot11AssociationStartParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var macAddr: UByteArray = UByteArray(6),
    public var ssid: Dot11Ssid = Dot11Ssid(),
    public var uIHVDataOffset: UInt = 0u,
    public var uIHVDataSize: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11AssociationStartParameters) return false
        if (this.header != other.header) return false
        if (!this.macAddr.contentEquals(other.macAddr)) return false
        if (this.ssid != other.ssid) return false
        if (this.uIHVDataOffset != other.uIHVDataOffset) return false
        if (this.uIHVDataSize != other.uIHVDataSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.macAddr.contentHashCode()
        result = 31 * result + this.ssid.hashCode()
        result = 31 * result + this.uIHVDataOffset.hashCode()
        result = 31 * result + this.uIHVDataSize.hashCode()
        return result
    }
}

public data class Dot11AuthAlgorithmList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var algorithmIds: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11AuthAlgorithmList) return false
        if (this.header != other.header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.algorithmIds.contentEquals(other.algorithmIds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.algorithmIds.contentHashCode()
        return result
    }
}

public data class Dot11AuthCipherPair(
    public var authAlgoId: Dot11AuthAlgorithm = 0,
    public var cipherAlgoId: Dot11CipherAlgorithm = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11AuthCipherPair> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11AuthCipherPair> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11AuthCipherPair =
                    Dot11AuthCipherPair(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11AuthCipherPair) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.authAlgoId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.cipherAlgoId)
                }
            }
    }
}

public data class Dot11AuthCipherPairList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var authCipherPairs: List<Dot11AuthCipherPair> = List(1) { Dot11AuthCipherPair() },
)

public data class Dot11AvailableChannelList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var uChannelNumber: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11AvailableChannelList) return false
        if (this.header != other.header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.uChannelNumber.contentEquals(other.uChannelNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.uChannelNumber.contentHashCode()
        return result
    }
}

public data class Dot11AvailableFrequencyList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var uFrequencyValue: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11AvailableFrequencyList) return false
        if (this.header != other.header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.uFrequencyValue.contentEquals(other.uFrequencyValue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.uFrequencyValue.contentHashCode()
        return result
    }
}

public data class Dot11BssidCandidate(
    public var bssid: UByteArray = UByteArray(6),
    public var uFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11BssidCandidate) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (this.uFlags != other.uFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bssid.contentHashCode()
        result = 31 * result + this.uFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11BssidCandidate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11BssidCandidate> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11BssidCandidate =
                    Dot11BssidCandidate(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11BssidCandidate) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.bssid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uFlags)
                }
            }
    }
}

public data class Dot11BssidList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var bSSIDs: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11BssidList) return false
        if (this.header != other.header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.bSSIDs.contentEquals(other.bSSIDs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.bSSIDs.contentHashCode()
        return result
    }
}

public data class Dot11BssDescription(
    public var uReserved: UInt = 0u,
    public var dot11BSSID: UByteArray = UByteArray(6),
    public var dot11BSSType: Dot11BssType = 0,
    public var usBeaconPeriod: UShort = 0u,
    public var ullTimestamp: ULong = 0uL,
    public var usCapabilityInformation: UShort = 0u,
    public var uBufferLength: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11BssDescription) return false
        if (this.uReserved != other.uReserved) return false
        if (!this.dot11BSSID.contentEquals(other.dot11BSSID)) return false
        if (this.dot11BSSType != other.dot11BSSType) return false
        if (this.usBeaconPeriod != other.usBeaconPeriod) return false
        if (this.ullTimestamp != other.ullTimestamp) return false
        if (this.usCapabilityInformation != other.usCapabilityInformation) return false
        if (this.uBufferLength != other.uBufferLength) return false
        if (!this.ucBuffer.contentEquals(other.ucBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uReserved.hashCode()
        result = 31 * result + this.dot11BSSID.contentHashCode()
        result = 31 * result + this.dot11BSSType.hashCode()
        result = 31 * result + this.usBeaconPeriod.hashCode()
        result = 31 * result + this.ullTimestamp.hashCode()
        result = 31 * result + this.usCapabilityInformation.hashCode()
        result = 31 * result + this.uBufferLength.hashCode()
        result = 31 * result + this.ucBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11BssDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11BssDescription> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dot11BssDescription =
                    Dot11BssDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: Dot11BssDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uReserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 4L, value.dot11BSSID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.dot11BSSType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.usBeaconPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.ullTimestamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 32L, value.usCapabilityInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.uBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 40L, value.ucBuffer)
                }
            }
    }
}

public data class Dot11BssEntry(
    public var uPhyId: UInt = 0u,
    public var phySpecificInfo: Dot11BssEntryPhySpecificInfo = Dot11BssEntryPhySpecificInfo(),
    public var dot11BSSID: UByteArray = UByteArray(6),
    public var dot11BSSType: Dot11BssType = 0,
    public var lRSSI: Int = 0,
    public var uLinkQuality: UInt = 0u,
    public var bInRegDomain: Boolean = false,
    public var usBeaconPeriod: UShort = 0u,
    public var ullTimestamp: ULong = 0uL,
    public var ullHostTimestamp: ULong = 0uL,
    public var usCapabilityInformation: UShort = 0u,
    public var uBufferLength: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11BssEntry) return false
        if (this.uPhyId != other.uPhyId) return false
        if (this.phySpecificInfo != other.phySpecificInfo) return false
        if (!this.dot11BSSID.contentEquals(other.dot11BSSID)) return false
        if (this.dot11BSSType != other.dot11BSSType) return false
        if (this.lRSSI != other.lRSSI) return false
        if (this.uLinkQuality != other.uLinkQuality) return false
        if (this.bInRegDomain != other.bInRegDomain) return false
        if (this.usBeaconPeriod != other.usBeaconPeriod) return false
        if (this.ullTimestamp != other.ullTimestamp) return false
        if (this.ullHostTimestamp != other.ullHostTimestamp) return false
        if (this.usCapabilityInformation != other.usCapabilityInformation) return false
        if (this.uBufferLength != other.uBufferLength) return false
        if (!this.ucBuffer.contentEquals(other.ucBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uPhyId.hashCode()
        result = 31 * result + this.phySpecificInfo.hashCode()
        result = 31 * result + this.dot11BSSID.contentHashCode()
        result = 31 * result + this.dot11BSSType.hashCode()
        result = 31 * result + this.lRSSI.hashCode()
        result = 31 * result + this.uLinkQuality.hashCode()
        result = 31 * result + this.bInRegDomain.hashCode()
        result = 31 * result + this.usBeaconPeriod.hashCode()
        result = 31 * result + this.ullTimestamp.hashCode()
        result = 31 * result + this.ullHostTimestamp.hashCode()
        result = 31 * result + this.usCapabilityInformation.hashCode()
        result = 31 * result + this.uBufferLength.hashCode()
        result = 31 * result + this.ucBuffer.contentHashCode()
        return result
    }
}

public data class Dot11BssEntryPhySpecificInfo(
    public var uChCenterFrequency: UInt = 0u,
    public var fhss: Dot11BssEntryPhySpecificInfo0 = Dot11BssEntryPhySpecificInfo0(),
)

public data class Dot11BssEntryPhySpecificInfo0(
    public var uHopPattern: UInt = 0u,
    public var uHopSet: UInt = 0u,
    public var uDwellTime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11BssEntryPhySpecificInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11BssEntryPhySpecificInfo0> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11BssEntryPhySpecificInfo0 =
                    Dot11BssEntryPhySpecificInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11BssEntryPhySpecificInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uHopPattern)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uHopSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uDwellTime)
                }
            }
    }
}

public class Dot11BssList internal constructor(
    public var uNumOfBytes: UInt,
    pucBufferCtorArg: MutPtr<UByte>,
) {
    public var pucBuffer: MutPtr<UByte> = pucBufferCtorArg
        internal set

    public constructor() : this(
        uNumOfBytes = 0u,
        pucBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.uNumOfBytes

    public operator fun component2(): MutPtr<UByte> = this.pucBuffer

    public fun copy(uNumOfBytes: UInt = this.uNumOfBytes, pucBuffer: MutPtr<UByte> = this.pucBuffer): Dot11BssList = Dot11BssList(uNumOfBytes = uNumOfBytes, pucBufferCtorArg = pucBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11BssList) return false
        if (this.uNumOfBytes != other.uNumOfBytes) return false
        if (this.pucBuffer != other.pucBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uNumOfBytes.hashCode()
        result = 31 * result + this.pucBuffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11BssList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11BssList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dot11BssList =
                    Dot11BssList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11BssList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uNumOfBytes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pucBuffer)
                }
            }

        public operator fun invoke(
            uNumOfBytes: UInt = 0u,
            pucBuffer: MutPtr<UByte> = MutPtr(0L),
        ): Dot11BssList =
            Dot11BssList(
                uNumOfBytes = uNumOfBytes,
                pucBufferCtorArg = pucBuffer,
            )
    }
}

public data class Dot11ByteArray(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfBytes: UInt = 0u,
    public var uTotalNumOfBytes: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ByteArray) return false
        if (this.header != other.header) return false
        if (this.uNumOfBytes != other.uNumOfBytes) return false
        if (this.uTotalNumOfBytes != other.uTotalNumOfBytes) return false
        if (!this.ucBuffer.contentEquals(other.ucBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uNumOfBytes.hashCode()
        result = 31 * result + this.uTotalNumOfBytes.hashCode()
        result = 31 * result + this.ucBuffer.contentHashCode()
        return result
    }
}

public data class Dot11CanSustainApParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var ulReason: UInt = 0u,
)

public data class Dot11ChannelHint(
    public var dot11PhyType: Dot11PhyType = 0,
    public var uChannelNumber: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ChannelHint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ChannelHint> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11ChannelHint =
                    Dot11ChannelHint(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11ChannelHint) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.dot11PhyType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uChannelNumber)
                }
            }
    }
}

public data class Dot11CipherAlgorithmList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var algorithmIds: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11CipherAlgorithmList) return false
        if (this.header != other.header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.algorithmIds.contentEquals(other.algorithmIds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.algorithmIds.contentHashCode()
        return result
    }
}

public data class Dot11CipherDefaultKeyValue(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uKeyIndex: UInt = 0u,
    public var algorithmId: Dot11CipherAlgorithm = 0,
    public var macAddr: UByteArray = UByteArray(6),
    public var bDelete: Boolean = false,
    public var bStatic: Boolean = false,
    public var usKeyLength: UShort = 0u,
    public var ucKey: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11CipherDefaultKeyValue) return false
        if (this.header != other.header) return false
        if (this.uKeyIndex != other.uKeyIndex) return false
        if (this.algorithmId != other.algorithmId) return false
        if (!this.macAddr.contentEquals(other.macAddr)) return false
        if (this.bDelete != other.bDelete) return false
        if (this.bStatic != other.bStatic) return false
        if (this.usKeyLength != other.usKeyLength) return false
        if (!this.ucKey.contentEquals(other.ucKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uKeyIndex.hashCode()
        result = 31 * result + this.algorithmId.hashCode()
        result = 31 * result + this.macAddr.contentHashCode()
        result = 31 * result + this.bDelete.hashCode()
        result = 31 * result + this.bStatic.hashCode()
        result = 31 * result + this.usKeyLength.hashCode()
        result = 31 * result + this.ucKey.contentHashCode()
        return result
    }
}

public data class Dot11CipherKeyMappingKeyValue(
    public var peerMacAddr: UByteArray = UByteArray(6),
    public var algorithmId: Dot11CipherAlgorithm = 0,
    public var direction: Dot11Direction = 0,
    public var bDelete: Boolean = false,
    public var bStatic: Boolean = false,
    public var usKeyLength: UShort = 0u,
    public var ucKey: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11CipherKeyMappingKeyValue) return false
        if (!this.peerMacAddr.contentEquals(other.peerMacAddr)) return false
        if (this.algorithmId != other.algorithmId) return false
        if (this.direction != other.direction) return false
        if (this.bDelete != other.bDelete) return false
        if (this.bStatic != other.bStatic) return false
        if (this.usKeyLength != other.usKeyLength) return false
        if (!this.ucKey.contentEquals(other.ucKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.peerMacAddr.contentHashCode()
        result = 31 * result + this.algorithmId.hashCode()
        result = 31 * result + this.direction.hashCode()
        result = 31 * result + this.bDelete.hashCode()
        result = 31 * result + this.bStatic.hashCode()
        result = 31 * result + this.usKeyLength.hashCode()
        result = 31 * result + this.ucKey.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11CipherKeyMappingKeyValue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11CipherKeyMappingKeyValue> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11CipherKeyMappingKeyValue =
                    Dot11CipherKeyMappingKeyValue(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 17L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Dot11CipherKeyMappingKeyValue) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.peerMacAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.algorithmId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.direction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 16L, value.bDelete)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 17L, value.bStatic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.usKeyLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 20L, value.ucKey)
                }
            }
    }
}

public data class Dot11ConnectionCompletionParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uStatus: UInt = 0u,
)

public data class Dot11ConnectionStartParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var bSSType: Dot11BssType = 0,
    public var adhocBSSID: UByteArray = UByteArray(6),
    public var adhocSSID: Dot11Ssid = Dot11Ssid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ConnectionStartParameters) return false
        if (this.header != other.header) return false
        if (this.bSSType != other.bSSType) return false
        if (!this.adhocBSSID.contentEquals(other.adhocBSSID)) return false
        if (this.adhocSSID != other.adhocSSID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.bSSType.hashCode()
        result = 31 * result + this.adhocBSSID.contentHashCode()
        result = 31 * result + this.adhocSSID.hashCode()
        return result
    }
}

public data class Dot11CountersEntry(
    public var uTransmittedFragmentCount: UInt = 0u,
    public var uMulticastTransmittedFrameCount: UInt = 0u,
    public var uFailedCount: UInt = 0u,
    public var uRetryCount: UInt = 0u,
    public var uMultipleRetryCount: UInt = 0u,
    public var uFrameDuplicateCount: UInt = 0u,
    public var uRTSSuccessCount: UInt = 0u,
    public var uRTSFailureCount: UInt = 0u,
    public var uACKFailureCount: UInt = 0u,
    public var uReceivedFragmentCount: UInt = 0u,
    public var uMulticastReceivedFrameCount: UInt = 0u,
    public var uFCSErrorCount: UInt = 0u,
    public var uTransmittedFrameCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11CountersEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11CountersEntry> {
                override val sizeBytes: Long = 52L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11CountersEntry =
                    Dot11CountersEntry(
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
                override fun writeNative(addr: Long, value: Dot11CountersEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uTransmittedFragmentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uMulticastTransmittedFrameCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uFailedCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.uRetryCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.uMultipleRetryCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.uFrameDuplicateCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.uRTSSuccessCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.uRTSFailureCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.uACKFailureCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.uReceivedFragmentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.uMulticastReceivedFrameCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.uFCSErrorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.uTransmittedFrameCount)
                }
            }
    }
}

public data class Dot11CountryOrRegionStringList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var countryOrRegionStrings: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11CountryOrRegionStringList) return false
        if (this.header != other.header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.countryOrRegionStrings.contentEquals(other.countryOrRegionStrings)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.countryOrRegionStrings.contentHashCode()
        return result
    }
}

public data class Dot11CurrentOffloadCapability(
    public var uReserved: UInt = 0u,
    public var uFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11CurrentOffloadCapability> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11CurrentOffloadCapability> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11CurrentOffloadCapability =
                    Dot11CurrentOffloadCapability(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11CurrentOffloadCapability) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uFlags)
                }
            }
    }
}

public data class Dot11CurrentOperationMode(
    public var uReserved: UInt = 0u,
    public var uCurrentOpMode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11CurrentOperationMode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11CurrentOperationMode> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11CurrentOperationMode =
                    Dot11CurrentOperationMode(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11CurrentOperationMode) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uCurrentOpMode)
                }
            }
    }
}

public data class Dot11CurrentOptionalCapability(
    public var uReserved: UInt = 0u,
    public var bDot11CFPollable: Boolean = false,
    public var bDot11PCF: Boolean = false,
    public var bDot11PCFMPDUTransferToPC: Boolean = false,
    public var bStrictlyOrderedServiceClass: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11CurrentOptionalCapability> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11CurrentOptionalCapability> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11CurrentOptionalCapability =
                    Dot11CurrentOptionalCapability(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 7L),
                    )
                override fun writeNative(addr: Long, value: Dot11CurrentOptionalCapability) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.bDot11CFPollable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 5L, value.bDot11PCF)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 6L, value.bDot11PCFMPDUTransferToPC)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 7L, value.bStrictlyOrderedServiceClass)
                }
            }
    }
}

public data class Dot11DataRateMappingEntry(
    public var ucDataRateIndex: UByte = 0u,
    public var ucDataRateFlag: UByte = 0u,
    public var usDataRateValue: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11DataRateMappingEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11DataRateMappingEntry> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Dot11DataRateMappingEntry =
                    Dot11DataRateMappingEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Dot11DataRateMappingEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.ucDataRateIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.ucDataRateFlag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.usDataRateValue)
                }
            }
    }
}

public data class Dot11DataRateMappingTable(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uDataRateMappingLength: UInt = 0u,
    public var dataRateMappingEntries: List<Dot11DataRateMappingEntry> = List(126) { Dot11DataRateMappingEntry() },
)

public class Dot11DefaultWepOffload internal constructor(
    public var uReserved: UInt,
    hOffloadContextCtorArg: Handle,
    hOffloadCtorArg: Handle,
    public var dwIndex: UInt,
    public var dot11OffloadType: Dot11OffloadType,
    public var dwAlgorithm: UInt,
    public var uFlags: UInt,
    public var dot11KeyDirection: Dot11KeyDirection,
    public var ucMacAddress: UByteArray,
    public var uNumOfRWsOnMe: UInt,
    public var dot11IV48Counters: List<Dot11Iv48Counter>,
    public var usDot11RWBitMaps: UShortArray,
    public var usKeyLength: UShort,
    public var ucKey: UByteArray,
) {
    public var hOffloadContext: Handle = hOffloadContextCtorArg
        internal set

    public var hOffload: Handle = hOffloadCtorArg
        internal set

    public constructor() : this(
        uReserved = 0u,
        hOffloadContextCtorArg = MutPtr(0L),
        hOffloadCtorArg = MutPtr(0L),
        dwIndex = 0u,
        dot11OffloadType = 0,
        dwAlgorithm = 0u,
        uFlags = 0u,
        dot11KeyDirection = 0,
        ucMacAddress = UByteArray(6),
        uNumOfRWsOnMe = 0u,
        dot11IV48Counters = List(16) { Dot11Iv48Counter() },
        usDot11RWBitMaps = UShortArray(16),
        usKeyLength = 0u,
        ucKey = UByteArray(1),
    )

    public operator fun component1(): UInt = this.uReserved

    public operator fun component2(): Handle = this.hOffloadContext

    public operator fun component3(): Handle = this.hOffload

    public operator fun component4(): UInt = this.dwIndex

    public operator fun component5(): Dot11OffloadType = this.dot11OffloadType

    public operator fun component6(): UInt = this.dwAlgorithm

    public operator fun component7(): UInt = this.uFlags

    public operator fun component8(): Dot11KeyDirection = this.dot11KeyDirection

    public operator fun component9(): UByteArray = this.ucMacAddress

    public operator fun component10(): UInt = this.uNumOfRWsOnMe

    public operator fun component11(): List<Dot11Iv48Counter> = this.dot11IV48Counters

    public operator fun component12(): UShortArray = this.usDot11RWBitMaps

    public operator fun component13(): UShort = this.usKeyLength

    public operator fun component14(): UByteArray = this.ucKey

    public fun copy(uReserved: UInt = this.uReserved, hOffloadContext: Handle = this.hOffloadContext, hOffload: Handle = this.hOffload, dwIndex: UInt = this.dwIndex, dot11OffloadType: Dot11OffloadType = this.dot11OffloadType, dwAlgorithm: UInt = this.dwAlgorithm, uFlags: UInt = this.uFlags, dot11KeyDirection: Dot11KeyDirection = this.dot11KeyDirection, ucMacAddress: UByteArray = this.ucMacAddress, uNumOfRWsOnMe: UInt = this.uNumOfRWsOnMe, dot11IV48Counters: List<Dot11Iv48Counter> = this.dot11IV48Counters, usDot11RWBitMaps: UShortArray = this.usDot11RWBitMaps, usKeyLength: UShort = this.usKeyLength, ucKey: UByteArray = this.ucKey): Dot11DefaultWepOffload = Dot11DefaultWepOffload(uReserved = uReserved, hOffloadContextCtorArg = hOffloadContext, hOffloadCtorArg = hOffload, dwIndex = dwIndex, dot11OffloadType = dot11OffloadType, dwAlgorithm = dwAlgorithm, uFlags = uFlags, dot11KeyDirection = dot11KeyDirection, ucMacAddress = ucMacAddress, uNumOfRWsOnMe = uNumOfRWsOnMe, dot11IV48Counters = dot11IV48Counters, usDot11RWBitMaps = usDot11RWBitMaps, usKeyLength = usKeyLength, ucKey = ucKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11DefaultWepOffload) return false
        if (this.uReserved != other.uReserved) return false
        if (this.hOffloadContext != other.hOffloadContext) return false
        if (this.hOffload != other.hOffload) return false
        if (this.dwIndex != other.dwIndex) return false
        if (this.dot11OffloadType != other.dot11OffloadType) return false
        if (this.dwAlgorithm != other.dwAlgorithm) return false
        if (this.uFlags != other.uFlags) return false
        if (this.dot11KeyDirection != other.dot11KeyDirection) return false
        if (!this.ucMacAddress.contentEquals(other.ucMacAddress)) return false
        if (this.uNumOfRWsOnMe != other.uNumOfRWsOnMe) return false
        if (this.dot11IV48Counters != other.dot11IV48Counters) return false
        if (!this.usDot11RWBitMaps.contentEquals(other.usDot11RWBitMaps)) return false
        if (this.usKeyLength != other.usKeyLength) return false
        if (!this.ucKey.contentEquals(other.ucKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uReserved.hashCode()
        result = 31 * result + this.hOffloadContext.hashCode()
        result = 31 * result + this.hOffload.hashCode()
        result = 31 * result + this.dwIndex.hashCode()
        result = 31 * result + this.dot11OffloadType.hashCode()
        result = 31 * result + this.dwAlgorithm.hashCode()
        result = 31 * result + this.uFlags.hashCode()
        result = 31 * result + this.dot11KeyDirection.hashCode()
        result = 31 * result + this.ucMacAddress.contentHashCode()
        result = 31 * result + this.uNumOfRWsOnMe.hashCode()
        result = 31 * result + this.dot11IV48Counters.hashCode()
        result = 31 * result + this.usDot11RWBitMaps.contentHashCode()
        result = 31 * result + this.usKeyLength.hashCode()
        result = 31 * result + this.ucKey.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uReserved: UInt = 0u,
            hOffloadContext: Handle = MutPtr(0L),
            hOffload: Handle = MutPtr(0L),
            dwIndex: UInt = 0u,
            dot11OffloadType: Dot11OffloadType = 0,
            dwAlgorithm: UInt = 0u,
            uFlags: UInt = 0u,
            dot11KeyDirection: Dot11KeyDirection = 0,
            ucMacAddress: UByteArray = UByteArray(6),
            uNumOfRWsOnMe: UInt = 0u,
            dot11IV48Counters: List<Dot11Iv48Counter> = List(16) { Dot11Iv48Counter() },
            usDot11RWBitMaps: UShortArray = UShortArray(16),
            usKeyLength: UShort = 0u,
            ucKey: UByteArray = UByteArray(1),
        ): Dot11DefaultWepOffload =
            Dot11DefaultWepOffload(
                uReserved = uReserved,
                hOffloadContextCtorArg = hOffloadContext,
                hOffloadCtorArg = hOffload,
                dwIndex = dwIndex,
                dot11OffloadType = dot11OffloadType,
                dwAlgorithm = dwAlgorithm,
                uFlags = uFlags,
                dot11KeyDirection = dot11KeyDirection,
                ucMacAddress = ucMacAddress,
                uNumOfRWsOnMe = uNumOfRWsOnMe,
                dot11IV48Counters = dot11IV48Counters,
                usDot11RWBitMaps = usDot11RWBitMaps,
                usKeyLength = usKeyLength,
                ucKey = ucKey,
            )
    }
}

public class Dot11DefaultWepUpload internal constructor(
    public var uReserved: UInt,
    public var dot11OffloadType: Dot11OffloadType,
    hOffloadCtorArg: Handle,
    public var uNumOfRWsUsed: UInt,
    public var dot11IV48Counters: List<Dot11Iv48Counter>,
    public var usDot11RWBitMaps: UShortArray,
) {
    public var hOffload: Handle = hOffloadCtorArg
        internal set

    public constructor() : this(
        uReserved = 0u,
        dot11OffloadType = 0,
        hOffloadCtorArg = MutPtr(0L),
        uNumOfRWsUsed = 0u,
        dot11IV48Counters = List(16) { Dot11Iv48Counter() },
        usDot11RWBitMaps = UShortArray(16),
    )

    public operator fun component1(): UInt = this.uReserved

    public operator fun component2(): Dot11OffloadType = this.dot11OffloadType

    public operator fun component3(): Handle = this.hOffload

    public operator fun component4(): UInt = this.uNumOfRWsUsed

    public operator fun component5(): List<Dot11Iv48Counter> = this.dot11IV48Counters

    public operator fun component6(): UShortArray = this.usDot11RWBitMaps

    public fun copy(uReserved: UInt = this.uReserved, dot11OffloadType: Dot11OffloadType = this.dot11OffloadType, hOffload: Handle = this.hOffload, uNumOfRWsUsed: UInt = this.uNumOfRWsUsed, dot11IV48Counters: List<Dot11Iv48Counter> = this.dot11IV48Counters, usDot11RWBitMaps: UShortArray = this.usDot11RWBitMaps): Dot11DefaultWepUpload = Dot11DefaultWepUpload(uReserved = uReserved, dot11OffloadType = dot11OffloadType, hOffloadCtorArg = hOffload, uNumOfRWsUsed = uNumOfRWsUsed, dot11IV48Counters = dot11IV48Counters, usDot11RWBitMaps = usDot11RWBitMaps)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11DefaultWepUpload) return false
        if (this.uReserved != other.uReserved) return false
        if (this.dot11OffloadType != other.dot11OffloadType) return false
        if (this.hOffload != other.hOffload) return false
        if (this.uNumOfRWsUsed != other.uNumOfRWsUsed) return false
        if (this.dot11IV48Counters != other.dot11IV48Counters) return false
        if (!this.usDot11RWBitMaps.contentEquals(other.usDot11RWBitMaps)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uReserved.hashCode()
        result = 31 * result + this.dot11OffloadType.hashCode()
        result = 31 * result + this.hOffload.hashCode()
        result = 31 * result + this.uNumOfRWsUsed.hashCode()
        result = 31 * result + this.dot11IV48Counters.hashCode()
        result = 31 * result + this.usDot11RWBitMaps.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uReserved: UInt = 0u,
            dot11OffloadType: Dot11OffloadType = 0,
            hOffload: Handle = MutPtr(0L),
            uNumOfRWsUsed: UInt = 0u,
            dot11IV48Counters: List<Dot11Iv48Counter> = List(16) { Dot11Iv48Counter() },
            usDot11RWBitMaps: UShortArray = UShortArray(16),
        ): Dot11DefaultWepUpload =
            Dot11DefaultWepUpload(
                uReserved = uReserved,
                dot11OffloadType = dot11OffloadType,
                hOffloadCtorArg = hOffload,
                uNumOfRWsUsed = uNumOfRWsUsed,
                dot11IV48Counters = dot11IV48Counters,
                usDot11RWBitMaps = usDot11RWBitMaps,
            )
    }
}

public data class Dot11DisassociatePeerRequest(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerMacAddr: UByteArray = UByteArray(6),
    public var usReason: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11DisassociatePeerRequest) return false
        if (this.header != other.header) return false
        if (!this.peerMacAddr.contentEquals(other.peerMacAddr)) return false
        if (this.usReason != other.usReason) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerMacAddr.contentHashCode()
        result = 31 * result + this.usReason.hashCode()
        return result
    }
}

public data class Dot11DisassociationParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var macAddr: UByteArray = UByteArray(6),
    public var uReason: UInt = 0u,
    public var uIHVDataOffset: UInt = 0u,
    public var uIHVDataSize: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11DisassociationParameters) return false
        if (this.header != other.header) return false
        if (!this.macAddr.contentEquals(other.macAddr)) return false
        if (this.uReason != other.uReason) return false
        if (this.uIHVDataOffset != other.uIHVDataOffset) return false
        if (this.uIHVDataSize != other.uIHVDataSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.macAddr.contentHashCode()
        result = 31 * result + this.uReason.hashCode()
        result = 31 * result + this.uIHVDataOffset.hashCode()
        result = 31 * result + this.uIHVDataSize.hashCode()
        return result
    }
}

public data class Dot11DiversitySelectionRx(
    public var uAntennaListIndex: UInt = 0u,
    public var bDiversitySelectionRX: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11DiversitySelectionRx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11DiversitySelectionRx> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11DiversitySelectionRx =
                    Dot11DiversitySelectionRx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11DiversitySelectionRx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uAntennaListIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.bDiversitySelectionRX)
                }
            }
    }
}

public data class Dot11DiversitySelectionRxList(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11DiversitySelectionRx: List<Dot11DiversitySelectionRx> = List(1) { Dot11DiversitySelectionRx() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11DiversitySelectionRxList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11DiversitySelectionRxList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11DiversitySelectionRxList =
                    Dot11DiversitySelectionRxList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Dot11DiversitySelectionRx.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11DiversitySelectionRxList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uNumOfEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uTotalNumOfEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Dot11DiversitySelectionRx.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.dot11DiversitySelectionRx)
                }
            }
    }
}

public class Dot11EapResult internal constructor(
    public var dwFailureReasonCode: UInt,
    pAttribArrayCtorArg: MutPtr<EapAttributes>,
) {
    public var pAttribArray: MutPtr<EapAttributes> = pAttribArrayCtorArg
        internal set

    public constructor() : this(
        dwFailureReasonCode = 0u,
        pAttribArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwFailureReasonCode

    public operator fun component2(): MutPtr<EapAttributes> = this.pAttribArray

    public fun copy(dwFailureReasonCode: UInt = this.dwFailureReasonCode, pAttribArray: MutPtr<EapAttributes> = this.pAttribArray): Dot11EapResult = Dot11EapResult(dwFailureReasonCode = dwFailureReasonCode, pAttribArrayCtorArg = pAttribArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11EapResult) return false
        if (this.dwFailureReasonCode != other.dwFailureReasonCode) return false
        if (this.pAttribArray != other.pAttribArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFailureReasonCode.hashCode()
        result = 31 * result + this.pAttribArray.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11EapResult> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11EapResult> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dot11EapResult =
                    Dot11EapResult(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<EapAttributes>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11EapResult) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFailureReasonCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<EapAttributes>(64)
                    ).writeNative(addr + 8L, value.pAttribArray)
                }
            }

        public operator fun invoke(
            dwFailureReasonCode: UInt = 0u,
            pAttribArray: MutPtr<EapAttributes> = MutPtr(0L),
        ): Dot11EapResult =
            Dot11EapResult(
                dwFailureReasonCode = dwFailureReasonCode,
                pAttribArrayCtorArg = pAttribArray,
            )
    }
}

public data class Dot11EncapEntry(
    public var usEtherType: UShort = 0u,
    public var usEncapType: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11EncapEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11EncapEntry> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Dot11EncapEntry =
                    Dot11EncapEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Dot11EncapEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.usEtherType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.usEncapType)
                }
            }
    }
}

public data class Dot11ErpPhyAttributes(
    public var hRDSSSAttributes: Dot11HrdsssPhyAttributes = Dot11HrdsssPhyAttributes(),
    public var bERPPBCCOptionImplemented: Boolean = false,
    public var bDSSSOFDMOptionImplemented: Boolean = false,
    public var bShortSlotTimeOptionImplemented: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ErpPhyAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ErpPhyAttributes> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11ErpPhyAttributes =
                    Dot11ErpPhyAttributes(
                        (Dot11HrdsssPhyAttributes.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: Dot11ErpPhyAttributes) {
                    (Dot11HrdsssPhyAttributes.typeLayout()).writeNative(addr, value.hRDSSSAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.bERPPBCCOptionImplemented)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 9L, value.bDSSSOFDMOptionImplemented)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 10L, value.bShortSlotTimeOptionImplemented)
                }
            }
    }
}

public class Dot11ExtapAttributes internal constructor(
    public var header: NdisObjectHeader,
    public var uScanSSIDListSize: UInt,
    public var uDesiredSSIDListSize: UInt,
    public var uPrivacyExemptionListSize: UInt,
    public var uAssociationTableSize: UInt,
    public var uDefaultKeyTableSize: UInt,
    public var uWEPKeyValueMaxLength: UInt,
    public var bStrictlyOrderedServiceClassImplemented: Boolean,
    public var uNumSupportedCountryOrRegionStrings: UInt,
    pSupportedCountryOrRegionStringsCtorArg: MutPtr<UByte>,
    public var uInfraNumSupportedUcastAlgoPairs: UInt,
    pInfraSupportedUcastAlgoPairsCtorArg: MutPtr<Dot11AuthCipherPair>,
    public var uInfraNumSupportedMcastAlgoPairs: UInt,
    pInfraSupportedMcastAlgoPairsCtorArg: MutPtr<Dot11AuthCipherPair>,
) {
    public var pSupportedCountryOrRegionStrings: MutPtr<UByte> = pSupportedCountryOrRegionStringsCtorArg
        internal set

    public var pInfraSupportedUcastAlgoPairs: MutPtr<Dot11AuthCipherPair> = pInfraSupportedUcastAlgoPairsCtorArg
        internal set

    public var pInfraSupportedMcastAlgoPairs: MutPtr<Dot11AuthCipherPair> = pInfraSupportedMcastAlgoPairsCtorArg
        internal set

    public constructor() : this(
        header = NdisObjectHeader(),
        uScanSSIDListSize = 0u,
        uDesiredSSIDListSize = 0u,
        uPrivacyExemptionListSize = 0u,
        uAssociationTableSize = 0u,
        uDefaultKeyTableSize = 0u,
        uWEPKeyValueMaxLength = 0u,
        bStrictlyOrderedServiceClassImplemented = false,
        uNumSupportedCountryOrRegionStrings = 0u,
        pSupportedCountryOrRegionStringsCtorArg = MutPtr(0L),
        uInfraNumSupportedUcastAlgoPairs = 0u,
        pInfraSupportedUcastAlgoPairsCtorArg = MutPtr(0L),
        uInfraNumSupportedMcastAlgoPairs = 0u,
        pInfraSupportedMcastAlgoPairsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): NdisObjectHeader = this.header

    public operator fun component2(): UInt = this.uScanSSIDListSize

    public operator fun component3(): UInt = this.uDesiredSSIDListSize

    public operator fun component4(): UInt = this.uPrivacyExemptionListSize

    public operator fun component5(): UInt = this.uAssociationTableSize

    public operator fun component6(): UInt = this.uDefaultKeyTableSize

    public operator fun component7(): UInt = this.uWEPKeyValueMaxLength

    public operator fun component8(): Boolean = this.bStrictlyOrderedServiceClassImplemented

    public operator fun component9(): UInt = this.uNumSupportedCountryOrRegionStrings

    public operator fun component10(): MutPtr<UByte> = this.pSupportedCountryOrRegionStrings

    public operator fun component11(): UInt = this.uInfraNumSupportedUcastAlgoPairs

    public operator fun component12(): MutPtr<Dot11AuthCipherPair> = this.pInfraSupportedUcastAlgoPairs

    public operator fun component13(): UInt = this.uInfraNumSupportedMcastAlgoPairs

    public operator fun component14(): MutPtr<Dot11AuthCipherPair> = this.pInfraSupportedMcastAlgoPairs

    public fun copy(header: NdisObjectHeader = this.header, uScanSSIDListSize: UInt = this.uScanSSIDListSize, uDesiredSSIDListSize: UInt = this.uDesiredSSIDListSize, uPrivacyExemptionListSize: UInt = this.uPrivacyExemptionListSize, uAssociationTableSize: UInt = this.uAssociationTableSize, uDefaultKeyTableSize: UInt = this.uDefaultKeyTableSize, uWEPKeyValueMaxLength: UInt = this.uWEPKeyValueMaxLength, bStrictlyOrderedServiceClassImplemented: Boolean = this.bStrictlyOrderedServiceClassImplemented, uNumSupportedCountryOrRegionStrings: UInt = this.uNumSupportedCountryOrRegionStrings, pSupportedCountryOrRegionStrings: MutPtr<UByte> = this.pSupportedCountryOrRegionStrings, uInfraNumSupportedUcastAlgoPairs: UInt = this.uInfraNumSupportedUcastAlgoPairs, pInfraSupportedUcastAlgoPairs: MutPtr<Dot11AuthCipherPair> = this.pInfraSupportedUcastAlgoPairs, uInfraNumSupportedMcastAlgoPairs: UInt = this.uInfraNumSupportedMcastAlgoPairs, pInfraSupportedMcastAlgoPairs: MutPtr<Dot11AuthCipherPair> = this.pInfraSupportedMcastAlgoPairs): Dot11ExtapAttributes = Dot11ExtapAttributes(header = header, uScanSSIDListSize = uScanSSIDListSize, uDesiredSSIDListSize = uDesiredSSIDListSize, uPrivacyExemptionListSize = uPrivacyExemptionListSize, uAssociationTableSize = uAssociationTableSize, uDefaultKeyTableSize = uDefaultKeyTableSize, uWEPKeyValueMaxLength = uWEPKeyValueMaxLength, bStrictlyOrderedServiceClassImplemented = bStrictlyOrderedServiceClassImplemented, uNumSupportedCountryOrRegionStrings = uNumSupportedCountryOrRegionStrings, pSupportedCountryOrRegionStringsCtorArg = pSupportedCountryOrRegionStrings, uInfraNumSupportedUcastAlgoPairs = uInfraNumSupportedUcastAlgoPairs, pInfraSupportedUcastAlgoPairsCtorArg = pInfraSupportedUcastAlgoPairs, uInfraNumSupportedMcastAlgoPairs = uInfraNumSupportedMcastAlgoPairs, pInfraSupportedMcastAlgoPairsCtorArg = pInfraSupportedMcastAlgoPairs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ExtapAttributes) return false
        if (this.header != other.header) return false
        if (this.uScanSSIDListSize != other.uScanSSIDListSize) return false
        if (this.uDesiredSSIDListSize != other.uDesiredSSIDListSize) return false
        if (this.uPrivacyExemptionListSize != other.uPrivacyExemptionListSize) return false
        if (this.uAssociationTableSize != other.uAssociationTableSize) return false
        if (this.uDefaultKeyTableSize != other.uDefaultKeyTableSize) return false
        if (this.uWEPKeyValueMaxLength != other.uWEPKeyValueMaxLength) return false
        if (this.bStrictlyOrderedServiceClassImplemented != other.bStrictlyOrderedServiceClassImplemented) return false
        if (this.uNumSupportedCountryOrRegionStrings != other.uNumSupportedCountryOrRegionStrings) return false
        if (this.pSupportedCountryOrRegionStrings != other.pSupportedCountryOrRegionStrings) return false
        if (this.uInfraNumSupportedUcastAlgoPairs != other.uInfraNumSupportedUcastAlgoPairs) return false
        if (this.pInfraSupportedUcastAlgoPairs != other.pInfraSupportedUcastAlgoPairs) return false
        if (this.uInfraNumSupportedMcastAlgoPairs != other.uInfraNumSupportedMcastAlgoPairs) return false
        if (this.pInfraSupportedMcastAlgoPairs != other.pInfraSupportedMcastAlgoPairs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uScanSSIDListSize.hashCode()
        result = 31 * result + this.uDesiredSSIDListSize.hashCode()
        result = 31 * result + this.uPrivacyExemptionListSize.hashCode()
        result = 31 * result + this.uAssociationTableSize.hashCode()
        result = 31 * result + this.uDefaultKeyTableSize.hashCode()
        result = 31 * result + this.uWEPKeyValueMaxLength.hashCode()
        result = 31 * result + this.bStrictlyOrderedServiceClassImplemented.hashCode()
        result = 31 * result + this.uNumSupportedCountryOrRegionStrings.hashCode()
        result = 31 * result + this.pSupportedCountryOrRegionStrings.hashCode()
        result = 31 * result + this.uInfraNumSupportedUcastAlgoPairs.hashCode()
        result = 31 * result + this.pInfraSupportedUcastAlgoPairs.hashCode()
        result = 31 * result + this.uInfraNumSupportedMcastAlgoPairs.hashCode()
        result = 31 * result + this.pInfraSupportedMcastAlgoPairs.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            header: NdisObjectHeader = NdisObjectHeader(),
            uScanSSIDListSize: UInt = 0u,
            uDesiredSSIDListSize: UInt = 0u,
            uPrivacyExemptionListSize: UInt = 0u,
            uAssociationTableSize: UInt = 0u,
            uDefaultKeyTableSize: UInt = 0u,
            uWEPKeyValueMaxLength: UInt = 0u,
            bStrictlyOrderedServiceClassImplemented: Boolean = false,
            uNumSupportedCountryOrRegionStrings: UInt = 0u,
            pSupportedCountryOrRegionStrings: MutPtr<UByte> = MutPtr(0L),
            uInfraNumSupportedUcastAlgoPairs: UInt = 0u,
            pInfraSupportedUcastAlgoPairs: MutPtr<Dot11AuthCipherPair> = MutPtr(0L),
            uInfraNumSupportedMcastAlgoPairs: UInt = 0u,
            pInfraSupportedMcastAlgoPairs: MutPtr<Dot11AuthCipherPair> = MutPtr(0L),
        ): Dot11ExtapAttributes =
            Dot11ExtapAttributes(
                header = header,
                uScanSSIDListSize = uScanSSIDListSize,
                uDesiredSSIDListSize = uDesiredSSIDListSize,
                uPrivacyExemptionListSize = uPrivacyExemptionListSize,
                uAssociationTableSize = uAssociationTableSize,
                uDefaultKeyTableSize = uDefaultKeyTableSize,
                uWEPKeyValueMaxLength = uWEPKeyValueMaxLength,
                bStrictlyOrderedServiceClassImplemented = bStrictlyOrderedServiceClassImplemented,
                uNumSupportedCountryOrRegionStrings = uNumSupportedCountryOrRegionStrings,
                pSupportedCountryOrRegionStringsCtorArg = pSupportedCountryOrRegionStrings,
                uInfraNumSupportedUcastAlgoPairs = uInfraNumSupportedUcastAlgoPairs,
                pInfraSupportedUcastAlgoPairsCtorArg = pInfraSupportedUcastAlgoPairs,
                uInfraNumSupportedMcastAlgoPairs = uInfraNumSupportedMcastAlgoPairs,
                pInfraSupportedMcastAlgoPairsCtorArg = pInfraSupportedMcastAlgoPairs,
            )
    }
}

public class Dot11ExtstaAttributes internal constructor(
    public var header: NdisObjectHeader,
    public var uScanSSIDListSize: UInt,
    public var uDesiredBSSIDListSize: UInt,
    public var uDesiredSSIDListSize: UInt,
    public var uExcludedMacAddressListSize: UInt,
    public var uPrivacyExemptionListSize: UInt,
    public var uKeyMappingTableSize: UInt,
    public var uDefaultKeyTableSize: UInt,
    public var uWEPKeyValueMaxLength: UInt,
    public var uPMKIDCacheSize: UInt,
    public var uMaxNumPerSTADefaultKeyTables: UInt,
    public var bStrictlyOrderedServiceClassImplemented: Boolean,
    public var ucSupportedQoSProtocolFlags: UByte,
    public var bSafeModeImplemented: Boolean,
    public var uNumSupportedCountryOrRegionStrings: UInt,
    pSupportedCountryOrRegionStringsCtorArg: MutPtr<UByte>,
    public var uInfraNumSupportedUcastAlgoPairs: UInt,
    pInfraSupportedUcastAlgoPairsCtorArg: MutPtr<Dot11AuthCipherPair>,
    public var uInfraNumSupportedMcastAlgoPairs: UInt,
    pInfraSupportedMcastAlgoPairsCtorArg: MutPtr<Dot11AuthCipherPair>,
    public var uAdhocNumSupportedUcastAlgoPairs: UInt,
    pAdhocSupportedUcastAlgoPairsCtorArg: MutPtr<Dot11AuthCipherPair>,
    public var uAdhocNumSupportedMcastAlgoPairs: UInt,
    pAdhocSupportedMcastAlgoPairsCtorArg: MutPtr<Dot11AuthCipherPair>,
    public var bAutoPowerSaveMode: Boolean,
    public var uMaxNetworkOffloadListSize: UInt,
    public var bMFPCapable: Boolean,
    public var uInfraNumSupportedMcastMgmtAlgoPairs: UInt,
    pInfraSupportedMcastMgmtAlgoPairsCtorArg: MutPtr<Dot11AuthCipherPair>,
    public var bNeighborReportSupported: Boolean,
    public var bAPChannelReportSupported: Boolean,
    public var bActionFramesSupported: Boolean,
    public var bANQPQueryOffloadSupported: Boolean,
    public var bHESSIDConnectionSupported: Boolean,
) {
    public var pSupportedCountryOrRegionStrings: MutPtr<UByte> = pSupportedCountryOrRegionStringsCtorArg
        internal set

    public var pInfraSupportedUcastAlgoPairs: MutPtr<Dot11AuthCipherPair> = pInfraSupportedUcastAlgoPairsCtorArg
        internal set

    public var pInfraSupportedMcastAlgoPairs: MutPtr<Dot11AuthCipherPair> = pInfraSupportedMcastAlgoPairsCtorArg
        internal set

    public var pAdhocSupportedUcastAlgoPairs: MutPtr<Dot11AuthCipherPair> = pAdhocSupportedUcastAlgoPairsCtorArg
        internal set

    public var pAdhocSupportedMcastAlgoPairs: MutPtr<Dot11AuthCipherPair> = pAdhocSupportedMcastAlgoPairsCtorArg
        internal set

    public var pInfraSupportedMcastMgmtAlgoPairs: MutPtr<Dot11AuthCipherPair> = pInfraSupportedMcastMgmtAlgoPairsCtorArg
        internal set

    public constructor() : this(
        header = NdisObjectHeader(),
        uScanSSIDListSize = 0u,
        uDesiredBSSIDListSize = 0u,
        uDesiredSSIDListSize = 0u,
        uExcludedMacAddressListSize = 0u,
        uPrivacyExemptionListSize = 0u,
        uKeyMappingTableSize = 0u,
        uDefaultKeyTableSize = 0u,
        uWEPKeyValueMaxLength = 0u,
        uPMKIDCacheSize = 0u,
        uMaxNumPerSTADefaultKeyTables = 0u,
        bStrictlyOrderedServiceClassImplemented = false,
        ucSupportedQoSProtocolFlags = 0u,
        bSafeModeImplemented = false,
        uNumSupportedCountryOrRegionStrings = 0u,
        pSupportedCountryOrRegionStringsCtorArg = MutPtr(0L),
        uInfraNumSupportedUcastAlgoPairs = 0u,
        pInfraSupportedUcastAlgoPairsCtorArg = MutPtr(0L),
        uInfraNumSupportedMcastAlgoPairs = 0u,
        pInfraSupportedMcastAlgoPairsCtorArg = MutPtr(0L),
        uAdhocNumSupportedUcastAlgoPairs = 0u,
        pAdhocSupportedUcastAlgoPairsCtorArg = MutPtr(0L),
        uAdhocNumSupportedMcastAlgoPairs = 0u,
        pAdhocSupportedMcastAlgoPairsCtorArg = MutPtr(0L),
        bAutoPowerSaveMode = false,
        uMaxNetworkOffloadListSize = 0u,
        bMFPCapable = false,
        uInfraNumSupportedMcastMgmtAlgoPairs = 0u,
        pInfraSupportedMcastMgmtAlgoPairsCtorArg = MutPtr(0L),
        bNeighborReportSupported = false,
        bAPChannelReportSupported = false,
        bActionFramesSupported = false,
        bANQPQueryOffloadSupported = false,
        bHESSIDConnectionSupported = false,
    )

    public companion object {
        public operator fun invoke(
            header: NdisObjectHeader = NdisObjectHeader(),
            uScanSSIDListSize: UInt = 0u,
            uDesiredBSSIDListSize: UInt = 0u,
            uDesiredSSIDListSize: UInt = 0u,
            uExcludedMacAddressListSize: UInt = 0u,
            uPrivacyExemptionListSize: UInt = 0u,
            uKeyMappingTableSize: UInt = 0u,
            uDefaultKeyTableSize: UInt = 0u,
            uWEPKeyValueMaxLength: UInt = 0u,
            uPMKIDCacheSize: UInt = 0u,
            uMaxNumPerSTADefaultKeyTables: UInt = 0u,
            bStrictlyOrderedServiceClassImplemented: Boolean = false,
            ucSupportedQoSProtocolFlags: UByte = 0u,
            bSafeModeImplemented: Boolean = false,
            uNumSupportedCountryOrRegionStrings: UInt = 0u,
            pSupportedCountryOrRegionStrings: MutPtr<UByte> = MutPtr(0L),
            uInfraNumSupportedUcastAlgoPairs: UInt = 0u,
            pInfraSupportedUcastAlgoPairs: MutPtr<Dot11AuthCipherPair> = MutPtr(0L),
            uInfraNumSupportedMcastAlgoPairs: UInt = 0u,
            pInfraSupportedMcastAlgoPairs: MutPtr<Dot11AuthCipherPair> = MutPtr(0L),
            uAdhocNumSupportedUcastAlgoPairs: UInt = 0u,
            pAdhocSupportedUcastAlgoPairs: MutPtr<Dot11AuthCipherPair> = MutPtr(0L),
            uAdhocNumSupportedMcastAlgoPairs: UInt = 0u,
            pAdhocSupportedMcastAlgoPairs: MutPtr<Dot11AuthCipherPair> = MutPtr(0L),
            bAutoPowerSaveMode: Boolean = false,
            uMaxNetworkOffloadListSize: UInt = 0u,
            bMFPCapable: Boolean = false,
            uInfraNumSupportedMcastMgmtAlgoPairs: UInt = 0u,
            pInfraSupportedMcastMgmtAlgoPairs: MutPtr<Dot11AuthCipherPair> = MutPtr(0L),
            bNeighborReportSupported: Boolean = false,
            bAPChannelReportSupported: Boolean = false,
            bActionFramesSupported: Boolean = false,
            bANQPQueryOffloadSupported: Boolean = false,
            bHESSIDConnectionSupported: Boolean = false,
        ): Dot11ExtstaAttributes =
            Dot11ExtstaAttributes(
                header = header,
                uScanSSIDListSize = uScanSSIDListSize,
                uDesiredBSSIDListSize = uDesiredBSSIDListSize,
                uDesiredSSIDListSize = uDesiredSSIDListSize,
                uExcludedMacAddressListSize = uExcludedMacAddressListSize,
                uPrivacyExemptionListSize = uPrivacyExemptionListSize,
                uKeyMappingTableSize = uKeyMappingTableSize,
                uDefaultKeyTableSize = uDefaultKeyTableSize,
                uWEPKeyValueMaxLength = uWEPKeyValueMaxLength,
                uPMKIDCacheSize = uPMKIDCacheSize,
                uMaxNumPerSTADefaultKeyTables = uMaxNumPerSTADefaultKeyTables,
                bStrictlyOrderedServiceClassImplemented = bStrictlyOrderedServiceClassImplemented,
                ucSupportedQoSProtocolFlags = ucSupportedQoSProtocolFlags,
                bSafeModeImplemented = bSafeModeImplemented,
                uNumSupportedCountryOrRegionStrings = uNumSupportedCountryOrRegionStrings,
                pSupportedCountryOrRegionStringsCtorArg = pSupportedCountryOrRegionStrings,
                uInfraNumSupportedUcastAlgoPairs = uInfraNumSupportedUcastAlgoPairs,
                pInfraSupportedUcastAlgoPairsCtorArg = pInfraSupportedUcastAlgoPairs,
                uInfraNumSupportedMcastAlgoPairs = uInfraNumSupportedMcastAlgoPairs,
                pInfraSupportedMcastAlgoPairsCtorArg = pInfraSupportedMcastAlgoPairs,
                uAdhocNumSupportedUcastAlgoPairs = uAdhocNumSupportedUcastAlgoPairs,
                pAdhocSupportedUcastAlgoPairsCtorArg = pAdhocSupportedUcastAlgoPairs,
                uAdhocNumSupportedMcastAlgoPairs = uAdhocNumSupportedMcastAlgoPairs,
                pAdhocSupportedMcastAlgoPairsCtorArg = pAdhocSupportedMcastAlgoPairs,
                bAutoPowerSaveMode = bAutoPowerSaveMode,
                uMaxNetworkOffloadListSize = uMaxNetworkOffloadListSize,
                bMFPCapable = bMFPCapable,
                uInfraNumSupportedMcastMgmtAlgoPairs = uInfraNumSupportedMcastMgmtAlgoPairs,
                pInfraSupportedMcastMgmtAlgoPairsCtorArg = pInfraSupportedMcastMgmtAlgoPairs,
                bNeighborReportSupported = bNeighborReportSupported,
                bAPChannelReportSupported = bAPChannelReportSupported,
                bActionFramesSupported = bActionFramesSupported,
                bANQPQueryOffloadSupported = bANQPQueryOffloadSupported,
                bHESSIDConnectionSupported = bHESSIDConnectionSupported,
            )
    }
}

public data class Dot11ExtstaCapability(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uScanSSIDListSize: UInt = 0u,
    public var uDesiredBSSIDListSize: UInt = 0u,
    public var uDesiredSSIDListSize: UInt = 0u,
    public var uExcludedMacAddressListSize: UInt = 0u,
    public var uPrivacyExemptionListSize: UInt = 0u,
    public var uKeyMappingTableSize: UInt = 0u,
    public var uDefaultKeyTableSize: UInt = 0u,
    public var uWEPKeyValueMaxLength: UInt = 0u,
    public var uPMKIDCacheSize: UInt = 0u,
    public var uMaxNumPerSTADefaultKeyTables: UInt = 0u,
)

public class Dot11ExtstaRecvContext internal constructor(
    public var header: NdisObjectHeader,
    public var uReceiveFlags: UInt,
    public var uPhyId: UInt,
    public var uChCenterFrequency: UInt,
    public var usNumberOfMPDUsReceived: UShort,
    public var lRSSI: Int,
    public var ucDataRate: UByte,
    public var uSizeMediaSpecificInfo: UInt,
    pvMediaSpecificInfoCtorArg: MutPtr<CVoid>,
    public var ullTimestamp: ULong,
) {
    public var pvMediaSpecificInfo: MutPtr<CVoid> = pvMediaSpecificInfoCtorArg
        internal set

    public constructor() : this(
        header = NdisObjectHeader(),
        uReceiveFlags = 0u,
        uPhyId = 0u,
        uChCenterFrequency = 0u,
        usNumberOfMPDUsReceived = 0u,
        lRSSI = 0,
        ucDataRate = 0u,
        uSizeMediaSpecificInfo = 0u,
        pvMediaSpecificInfoCtorArg = MutPtr(0L),
        ullTimestamp = 0uL,
    )

    public operator fun component1(): NdisObjectHeader = this.header

    public operator fun component2(): UInt = this.uReceiveFlags

    public operator fun component3(): UInt = this.uPhyId

    public operator fun component4(): UInt = this.uChCenterFrequency

    public operator fun component5(): UShort = this.usNumberOfMPDUsReceived

    public operator fun component6(): Int = this.lRSSI

    public operator fun component7(): UByte = this.ucDataRate

    public operator fun component8(): UInt = this.uSizeMediaSpecificInfo

    public operator fun component9(): MutPtr<CVoid> = this.pvMediaSpecificInfo

    public operator fun component10(): ULong = this.ullTimestamp

    public fun copy(header: NdisObjectHeader = this.header, uReceiveFlags: UInt = this.uReceiveFlags, uPhyId: UInt = this.uPhyId, uChCenterFrequency: UInt = this.uChCenterFrequency, usNumberOfMPDUsReceived: UShort = this.usNumberOfMPDUsReceived, lRSSI: Int = this.lRSSI, ucDataRate: UByte = this.ucDataRate, uSizeMediaSpecificInfo: UInt = this.uSizeMediaSpecificInfo, pvMediaSpecificInfo: MutPtr<CVoid> = this.pvMediaSpecificInfo, ullTimestamp: ULong = this.ullTimestamp): Dot11ExtstaRecvContext = Dot11ExtstaRecvContext(header = header, uReceiveFlags = uReceiveFlags, uPhyId = uPhyId, uChCenterFrequency = uChCenterFrequency, usNumberOfMPDUsReceived = usNumberOfMPDUsReceived, lRSSI = lRSSI, ucDataRate = ucDataRate, uSizeMediaSpecificInfo = uSizeMediaSpecificInfo, pvMediaSpecificInfoCtorArg = pvMediaSpecificInfo, ullTimestamp = ullTimestamp)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ExtstaRecvContext) return false
        if (this.header != other.header) return false
        if (this.uReceiveFlags != other.uReceiveFlags) return false
        if (this.uPhyId != other.uPhyId) return false
        if (this.uChCenterFrequency != other.uChCenterFrequency) return false
        if (this.usNumberOfMPDUsReceived != other.usNumberOfMPDUsReceived) return false
        if (this.lRSSI != other.lRSSI) return false
        if (this.ucDataRate != other.ucDataRate) return false
        if (this.uSizeMediaSpecificInfo != other.uSizeMediaSpecificInfo) return false
        if (this.pvMediaSpecificInfo != other.pvMediaSpecificInfo) return false
        if (this.ullTimestamp != other.ullTimestamp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uReceiveFlags.hashCode()
        result = 31 * result + this.uPhyId.hashCode()
        result = 31 * result + this.uChCenterFrequency.hashCode()
        result = 31 * result + this.usNumberOfMPDUsReceived.hashCode()
        result = 31 * result + this.lRSSI.hashCode()
        result = 31 * result + this.ucDataRate.hashCode()
        result = 31 * result + this.uSizeMediaSpecificInfo.hashCode()
        result = 31 * result + this.pvMediaSpecificInfo.hashCode()
        result = 31 * result + this.ullTimestamp.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            header: NdisObjectHeader = NdisObjectHeader(),
            uReceiveFlags: UInt = 0u,
            uPhyId: UInt = 0u,
            uChCenterFrequency: UInt = 0u,
            usNumberOfMPDUsReceived: UShort = 0u,
            lRSSI: Int = 0,
            ucDataRate: UByte = 0u,
            uSizeMediaSpecificInfo: UInt = 0u,
            pvMediaSpecificInfo: MutPtr<CVoid> = MutPtr(0L),
            ullTimestamp: ULong = 0uL,
        ): Dot11ExtstaRecvContext =
            Dot11ExtstaRecvContext(
                header = header,
                uReceiveFlags = uReceiveFlags,
                uPhyId = uPhyId,
                uChCenterFrequency = uChCenterFrequency,
                usNumberOfMPDUsReceived = usNumberOfMPDUsReceived,
                lRSSI = lRSSI,
                ucDataRate = ucDataRate,
                uSizeMediaSpecificInfo = uSizeMediaSpecificInfo,
                pvMediaSpecificInfoCtorArg = pvMediaSpecificInfo,
                ullTimestamp = ullTimestamp,
            )
    }
}

public class Dot11ExtstaSendContext internal constructor(
    public var header: NdisObjectHeader,
    public var usExemptionActionType: UShort,
    public var uPhyId: UInt,
    public var uDelayedSleepValue: UInt,
    pvMediaSpecificInfoCtorArg: MutPtr<CVoid>,
    public var uSendFlags: UInt,
) {
    public var pvMediaSpecificInfo: MutPtr<CVoid> = pvMediaSpecificInfoCtorArg
        internal set

    public constructor() : this(
        header = NdisObjectHeader(),
        usExemptionActionType = 0u,
        uPhyId = 0u,
        uDelayedSleepValue = 0u,
        pvMediaSpecificInfoCtorArg = MutPtr(0L),
        uSendFlags = 0u,
    )

    public operator fun component1(): NdisObjectHeader = this.header

    public operator fun component2(): UShort = this.usExemptionActionType

    public operator fun component3(): UInt = this.uPhyId

    public operator fun component4(): UInt = this.uDelayedSleepValue

    public operator fun component5(): MutPtr<CVoid> = this.pvMediaSpecificInfo

    public operator fun component6(): UInt = this.uSendFlags

    public fun copy(header: NdisObjectHeader = this.header, usExemptionActionType: UShort = this.usExemptionActionType, uPhyId: UInt = this.uPhyId, uDelayedSleepValue: UInt = this.uDelayedSleepValue, pvMediaSpecificInfo: MutPtr<CVoid> = this.pvMediaSpecificInfo, uSendFlags: UInt = this.uSendFlags): Dot11ExtstaSendContext = Dot11ExtstaSendContext(header = header, usExemptionActionType = usExemptionActionType, uPhyId = uPhyId, uDelayedSleepValue = uDelayedSleepValue, pvMediaSpecificInfoCtorArg = pvMediaSpecificInfo, uSendFlags = uSendFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ExtstaSendContext) return false
        if (this.header != other.header) return false
        if (this.usExemptionActionType != other.usExemptionActionType) return false
        if (this.uPhyId != other.uPhyId) return false
        if (this.uDelayedSleepValue != other.uDelayedSleepValue) return false
        if (this.pvMediaSpecificInfo != other.pvMediaSpecificInfo) return false
        if (this.uSendFlags != other.uSendFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.usExemptionActionType.hashCode()
        result = 31 * result + this.uPhyId.hashCode()
        result = 31 * result + this.uDelayedSleepValue.hashCode()
        result = 31 * result + this.pvMediaSpecificInfo.hashCode()
        result = 31 * result + this.uSendFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            header: NdisObjectHeader = NdisObjectHeader(),
            usExemptionActionType: UShort = 0u,
            uPhyId: UInt = 0u,
            uDelayedSleepValue: UInt = 0u,
            pvMediaSpecificInfo: MutPtr<CVoid> = MutPtr(0L),
            uSendFlags: UInt = 0u,
        ): Dot11ExtstaSendContext =
            Dot11ExtstaSendContext(
                header = header,
                usExemptionActionType = usExemptionActionType,
                uPhyId = uPhyId,
                uDelayedSleepValue = uDelayedSleepValue,
                pvMediaSpecificInfoCtorArg = pvMediaSpecificInfo,
                uSendFlags = uSendFlags,
            )
    }
}

public data class Dot11FragmentDescriptor(
    public var uOffset: UInt = 0u,
    public var uLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11FragmentDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11FragmentDescriptor> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11FragmentDescriptor =
                    Dot11FragmentDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11FragmentDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uLength)
                }
            }
    }
}

public data class Dot11GoNegotiationConfirmationSendCompleteParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerDeviceAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var status: Int = 0,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11GoNegotiationConfirmationSendCompleteParameters) return false
        if (this.header != other.header) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.status != other.status) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11GoNegotiationRequestSendCompleteParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerDeviceAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var status: Int = 0,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11GoNegotiationRequestSendCompleteParameters) return false
        if (this.header != other.header) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.status != other.status) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11GoNegotiationResponseSendCompleteParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerDeviceAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var status: Int = 0,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11GoNegotiationResponseSendCompleteParameters) return false
        if (this.header != other.header) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.status != other.status) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11HoppingPatternEntry(
    public var uHoppingPatternIndex: UInt = 0u,
    public var uRandomTableFieldNumber: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11HoppingPatternEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11HoppingPatternEntry> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11HoppingPatternEntry =
                    Dot11HoppingPatternEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11HoppingPatternEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uHoppingPatternIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uRandomTableFieldNumber)
                }
            }
    }
}

public data class Dot11HoppingPatternEntryList(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11HoppingPatternEntry: List<Dot11HoppingPatternEntry> = List(1) { Dot11HoppingPatternEntry() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11HoppingPatternEntryList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11HoppingPatternEntryList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11HoppingPatternEntryList =
                    Dot11HoppingPatternEntryList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Dot11HoppingPatternEntry.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11HoppingPatternEntryList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uNumOfEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uTotalNumOfEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Dot11HoppingPatternEntry.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.dot11HoppingPatternEntry)
                }
            }
    }
}

public data class Dot11HrdsssPhyAttributes(
    public var bShortPreambleOptionImplemented: Boolean = false,
    public var bPBCCOptionImplemented: Boolean = false,
    public var bChannelAgilityPresent: Boolean = false,
    public var uHRCCAModeSupported: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11HrdsssPhyAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11HrdsssPhyAttributes> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11HrdsssPhyAttributes =
                    Dot11HrdsssPhyAttributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11HrdsssPhyAttributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.bShortPreambleOptionImplemented)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.bPBCCOptionImplemented)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 2L, value.bChannelAgilityPresent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uHRCCAModeSupported)
                }
            }
    }
}

public data class Dot11IbssParams(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var bJoinOnly: Boolean = false,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
)

public data class Dot11IhvVersionInfo(
    public var dwVerMin: UInt = 0u,
    public var dwVerMax: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11IhvVersionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11IhvVersionInfo> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11IhvVersionInfo =
                    Dot11IhvVersionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11IhvVersionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVerMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwVerMax)
                }
            }
    }
}

public class Dot11IncomingAssocCompletionParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerMacAddr: UByteArray = UByteArray(6),
    public var uStatus: UInt = 0u,
    public var ucErrorSource: UByte = 0u,
    public var bReAssocReq: Boolean = false,
    public var bReAssocResp: Boolean = false,
    public var uAssocReqOffset: UInt = 0u,
    public var uAssocReqSize: UInt = 0u,
    public var uAssocRespOffset: UInt = 0u,
    public var uAssocRespSize: UInt = 0u,
    public var authAlgo: Dot11AuthAlgorithm = 0,
    public var unicastCipher: Dot11CipherAlgorithm = 0,
    public var multicastCipher: Dot11CipherAlgorithm = 0,
    public var uActivePhyListOffset: UInt = 0u,
    public var uActivePhyListSize: UInt = 0u,
    public var uBeaconOffset: UInt = 0u,
    public var uBeaconSize: UInt = 0u,
)

public data class Dot11IncomingAssocDecision(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerMacAddr: UByteArray = UByteArray(6),
    public var bAccept: Boolean = false,
    public var usReasonCode: UShort = 0u,
    public var uAssocResponseIEsOffset: UInt = 0u,
    public var uAssocResponseIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11IncomingAssocDecision) return false
        if (this.header != other.header) return false
        if (!this.peerMacAddr.contentEquals(other.peerMacAddr)) return false
        if (this.bAccept != other.bAccept) return false
        if (this.usReasonCode != other.usReasonCode) return false
        if (this.uAssocResponseIEsOffset != other.uAssocResponseIEsOffset) return false
        if (this.uAssocResponseIEsLength != other.uAssocResponseIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerMacAddr.contentHashCode()
        result = 31 * result + this.bAccept.hashCode()
        result = 31 * result + this.usReasonCode.hashCode()
        result = 31 * result + this.uAssocResponseIEsOffset.hashCode()
        result = 31 * result + this.uAssocResponseIEsLength.hashCode()
        return result
    }
}

public data class Dot11IncomingAssocDecisionV2(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerMacAddr: UByteArray = UByteArray(6),
    public var bAccept: Boolean = false,
    public var usReasonCode: UShort = 0u,
    public var uAssocResponseIEsOffset: UInt = 0u,
    public var uAssocResponseIEsLength: UInt = 0u,
    public var wFDStatus: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11IncomingAssocDecisionV2) return false
        if (this.header != other.header) return false
        if (!this.peerMacAddr.contentEquals(other.peerMacAddr)) return false
        if (this.bAccept != other.bAccept) return false
        if (this.usReasonCode != other.usReasonCode) return false
        if (this.uAssocResponseIEsOffset != other.uAssocResponseIEsOffset) return false
        if (this.uAssocResponseIEsLength != other.uAssocResponseIEsLength) return false
        if (this.wFDStatus != other.wFDStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerMacAddr.contentHashCode()
        result = 31 * result + this.bAccept.hashCode()
        result = 31 * result + this.usReasonCode.hashCode()
        result = 31 * result + this.uAssocResponseIEsOffset.hashCode()
        result = 31 * result + this.uAssocResponseIEsLength.hashCode()
        result = 31 * result + this.wFDStatus.hashCode()
        return result
    }
}

public data class Dot11IncomingAssocRequestReceivedParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerMacAddr: UByteArray = UByteArray(6),
    public var bReAssocReq: Boolean = false,
    public var uAssocReqOffset: UInt = 0u,
    public var uAssocReqSize: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11IncomingAssocRequestReceivedParameters) return false
        if (this.header != other.header) return false
        if (!this.peerMacAddr.contentEquals(other.peerMacAddr)) return false
        if (this.bReAssocReq != other.bReAssocReq) return false
        if (this.uAssocReqOffset != other.uAssocReqOffset) return false
        if (this.uAssocReqSize != other.uAssocReqSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerMacAddr.contentHashCode()
        result = 31 * result + this.bReAssocReq.hashCode()
        result = 31 * result + this.uAssocReqOffset.hashCode()
        result = 31 * result + this.uAssocReqSize.hashCode()
        return result
    }
}

public data class Dot11IncomingAssocStartedParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerMacAddr: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11IncomingAssocStartedParameters) return false
        if (this.header != other.header) return false
        if (!this.peerMacAddr.contentEquals(other.peerMacAddr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerMacAddr.contentHashCode()
        return result
    }
}

public data class Dot11InvitationRequestSendCompleteParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerDeviceAddress: UByteArray = UByteArray(6),
    public var receiverAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var status: Int = 0,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11InvitationRequestSendCompleteParameters) return false
        if (this.header != other.header) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (!this.receiverAddress.contentEquals(other.receiverAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.status != other.status) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.receiverAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11InvitationResponseSendCompleteParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var receiverDeviceAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var status: Int = 0,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11InvitationResponseSendCompleteParameters) return false
        if (this.header != other.header) return false
        if (!this.receiverDeviceAddress.contentEquals(other.receiverDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.status != other.status) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.receiverDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11Iv48Counter(
    public var uIV32Counter: UInt = 0u,
    public var usIV16Counter: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11Iv48Counter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11Iv48Counter> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11Iv48Counter =
                    Dot11Iv48Counter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11Iv48Counter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uIV32Counter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.usIV16Counter)
                }
            }
    }
}

public data class Dot11JoinRequest(
    public var uJoinFailureTimeout: UInt = 0u,
    public var operationalRateSet: Dot11RateSet = Dot11RateSet(),
    public var uChCenterFrequency: UInt = 0u,
    public var dot11BSSDescription: Dot11BssDescription = Dot11BssDescription(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11JoinRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11JoinRequest> {
                override val sizeBytes: Long = 192L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dot11JoinRequest =
                    Dot11JoinRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (Dot11RateSet.typeLayout()).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (Dot11BssDescription.typeLayout()).readNative(addr + 144L),
                    )
                override fun writeNative(addr: Long, value: Dot11JoinRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uJoinFailureTimeout)
                    (Dot11RateSet.typeLayout()).writeNative(addr + 4L, value.operationalRateSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.uChCenterFrequency)
                    (Dot11BssDescription.typeLayout()).writeNative(addr + 144L, value.dot11BSSDescription)
                }
            }
    }
}

public data class Dot11KeyAlgoBip(
    public var ucIPN: UByteArray = UByteArray(6),
    public var ulBIPKeyLength: UInt = 0u,
    public var ucBIPKey: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11KeyAlgoBip) return false
        if (!this.ucIPN.contentEquals(other.ucIPN)) return false
        if (this.ulBIPKeyLength != other.ulBIPKeyLength) return false
        if (!this.ucBIPKey.contentEquals(other.ucBIPKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucIPN.contentHashCode()
        result = 31 * result + this.ulBIPKeyLength.hashCode()
        result = 31 * result + this.ucBIPKey.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11KeyAlgoBip> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11KeyAlgoBip> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11KeyAlgoBip =
                    Dot11KeyAlgoBip(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Dot11KeyAlgoBip) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.ucIPN)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulBIPKeyLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.ucBIPKey)
                }
            }
    }
}

public data class Dot11KeyAlgoBipGmac256(
    public var ucIPN: UByteArray = UByteArray(6),
    public var ulBIPGmac256KeyLength: UInt = 0u,
    public var ucBIPGmac256Key: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11KeyAlgoBipGmac256) return false
        if (!this.ucIPN.contentEquals(other.ucIPN)) return false
        if (this.ulBIPGmac256KeyLength != other.ulBIPGmac256KeyLength) return false
        if (!this.ucBIPGmac256Key.contentEquals(other.ucBIPGmac256Key)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucIPN.contentHashCode()
        result = 31 * result + this.ulBIPGmac256KeyLength.hashCode()
        result = 31 * result + this.ucBIPGmac256Key.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11KeyAlgoBipGmac256> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11KeyAlgoBipGmac256> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11KeyAlgoBipGmac256 =
                    Dot11KeyAlgoBipGmac256(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Dot11KeyAlgoBipGmac256) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.ucIPN)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulBIPGmac256KeyLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.ucBIPGmac256Key)
                }
            }
    }
}

public data class Dot11KeyAlgoCcmp(
    public var ucIV48Counter: UByteArray = UByteArray(6),
    public var ulCCMPKeyLength: UInt = 0u,
    public var ucCCMPKey: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11KeyAlgoCcmp) return false
        if (!this.ucIV48Counter.contentEquals(other.ucIV48Counter)) return false
        if (this.ulCCMPKeyLength != other.ulCCMPKeyLength) return false
        if (!this.ucCCMPKey.contentEquals(other.ucCCMPKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucIV48Counter.contentHashCode()
        result = 31 * result + this.ulCCMPKeyLength.hashCode()
        result = 31 * result + this.ucCCMPKey.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11KeyAlgoCcmp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11KeyAlgoCcmp> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11KeyAlgoCcmp =
                    Dot11KeyAlgoCcmp(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Dot11KeyAlgoCcmp) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.ucIV48Counter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulCCMPKeyLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.ucCCMPKey)
                }
            }
    }
}

public data class Dot11KeyAlgoGcmp(
    public var ucIV48Counter: UByteArray = UByteArray(6),
    public var ulGCMPKeyLength: UInt = 0u,
    public var ucGCMPKey: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11KeyAlgoGcmp) return false
        if (!this.ucIV48Counter.contentEquals(other.ucIV48Counter)) return false
        if (this.ulGCMPKeyLength != other.ulGCMPKeyLength) return false
        if (!this.ucGCMPKey.contentEquals(other.ucGCMPKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucIV48Counter.contentHashCode()
        result = 31 * result + this.ulGCMPKeyLength.hashCode()
        result = 31 * result + this.ucGCMPKey.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11KeyAlgoGcmp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11KeyAlgoGcmp> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11KeyAlgoGcmp =
                    Dot11KeyAlgoGcmp(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Dot11KeyAlgoGcmp) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.ucIV48Counter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulGCMPKeyLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.ucGCMPKey)
                }
            }
    }
}

public data class Dot11KeyAlgoGcmp256(
    public var ucIV48Counter: UByteArray = UByteArray(6),
    public var ulGCMP256KeyLength: UInt = 0u,
    public var ucGCMP256Key: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11KeyAlgoGcmp256) return false
        if (!this.ucIV48Counter.contentEquals(other.ucIV48Counter)) return false
        if (this.ulGCMP256KeyLength != other.ulGCMP256KeyLength) return false
        if (!this.ucGCMP256Key.contentEquals(other.ucGCMP256Key)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucIV48Counter.contentHashCode()
        result = 31 * result + this.ulGCMP256KeyLength.hashCode()
        result = 31 * result + this.ucGCMP256Key.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11KeyAlgoGcmp256> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11KeyAlgoGcmp256> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11KeyAlgoGcmp256 =
                    Dot11KeyAlgoGcmp256(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Dot11KeyAlgoGcmp256) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.ucIV48Counter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulGCMP256KeyLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.ucGCMP256Key)
                }
            }
    }
}

public data class Dot11KeyAlgoTkipMic(
    public var ucIV48Counter: UByteArray = UByteArray(6),
    public var ulTKIPKeyLength: UInt = 0u,
    public var ulMICKeyLength: UInt = 0u,
    public var ucTKIPMICKeys: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11KeyAlgoTkipMic) return false
        if (!this.ucIV48Counter.contentEquals(other.ucIV48Counter)) return false
        if (this.ulTKIPKeyLength != other.ulTKIPKeyLength) return false
        if (this.ulMICKeyLength != other.ulMICKeyLength) return false
        if (!this.ucTKIPMICKeys.contentEquals(other.ucTKIPMICKeys)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucIV48Counter.contentHashCode()
        result = 31 * result + this.ulTKIPKeyLength.hashCode()
        result = 31 * result + this.ulMICKeyLength.hashCode()
        result = 31 * result + this.ucTKIPMICKeys.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11KeyAlgoTkipMic> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11KeyAlgoTkipMic> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11KeyAlgoTkipMic =
                    Dot11KeyAlgoTkipMic(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Dot11KeyAlgoTkipMic) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.ucIV48Counter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulTKIPKeyLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ulMICKeyLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 16L, value.ucTKIPMICKeys)
                }
            }
    }
}

public data class Dot11LinkQualityEntry(
    public var peerMacAddr: UByteArray = UByteArray(6),
    public var ucLinkQuality: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11LinkQualityEntry) return false
        if (!this.peerMacAddr.contentEquals(other.peerMacAddr)) return false
        if (this.ucLinkQuality != other.ucLinkQuality) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.peerMacAddr.contentHashCode()
        result = 31 * result + this.ucLinkQuality.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11LinkQualityEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11LinkQualityEntry> {
                override val sizeBytes: Long = 7L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Dot11LinkQualityEntry =
                    Dot11LinkQualityEntry(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Dot11LinkQualityEntry) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.peerMacAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.ucLinkQuality)
                }
            }
    }
}

public data class Dot11LinkQualityParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uLinkQualityListSize: UInt = 0u,
    public var uLinkQualityListOffset: UInt = 0u,
)

public data class Dot11MacAddressList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var macAddrs: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11MacAddressList) return false
        if (this.header != other.header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.macAddrs.contentEquals(other.macAddrs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.macAddrs.contentHashCode()
        return result
    }
}

public data class Dot11MacFrameStatistics(
    public var ullTransmittedFrameCount: ULong = 0uL,
    public var ullReceivedFrameCount: ULong = 0uL,
    public var ullTransmittedFailureFrameCount: ULong = 0uL,
    public var ullReceivedFailureFrameCount: ULong = 0uL,
    public var ullWEPExcludedCount: ULong = 0uL,
    public var ullTKIPLocalMICFailures: ULong = 0uL,
    public var ullTKIPReplays: ULong = 0uL,
    public var ullTKIPICVErrorCount: ULong = 0uL,
    public var ullCCMPReplays: ULong = 0uL,
    public var ullCCMPDecryptErrors: ULong = 0uL,
    public var ullWEPUndecryptableCount: ULong = 0uL,
    public var ullWEPICVErrorCount: ULong = 0uL,
    public var ullDecryptSuccessCount: ULong = 0uL,
    public var ullDecryptFailureCount: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11MacFrameStatistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11MacFrameStatistics> {
                override val sizeBytes: Long = 112L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dot11MacFrameStatistics =
                    Dot11MacFrameStatistics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                    )
                override fun writeNative(addr: Long, value: Dot11MacFrameStatistics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ullTransmittedFrameCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ullReceivedFrameCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.ullTransmittedFailureFrameCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.ullReceivedFailureFrameCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.ullWEPExcludedCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.ullTKIPLocalMICFailures)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.ullTKIPReplays)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.ullTKIPICVErrorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.ullCCMPReplays)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.ullCCMPDecryptErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.ullWEPUndecryptableCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.ullWEPICVErrorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.ullDecryptSuccessCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.ullDecryptFailureCount)
                }
            }
    }
}

public data class Dot11MacInfo(
    public var uReserved: UInt = 0u,
    public var uNdisPortNumber: UInt = 0u,
    public var macAddr: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11MacInfo) return false
        if (this.uReserved != other.uReserved) return false
        if (this.uNdisPortNumber != other.uNdisPortNumber) return false
        if (!this.macAddr.contentEquals(other.macAddr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uReserved.hashCode()
        result = 31 * result + this.uNdisPortNumber.hashCode()
        result = 31 * result + this.macAddr.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11MacInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11MacInfo> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11MacInfo =
                    Dot11MacInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11MacInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uNdisPortNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 8L, value.macAddr)
                }
            }
    }
}

public data class Dot11MacParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uOpmodeMask: UInt = 0u,
)

public class Dot11ManufacturingCallbackParameters internal constructor(
    public var header: NdisObjectHeader,
    public var dot11ManufacturingCallbackType: Dot11ManufacturingCallbackType,
    public var uStatus: UInt,
    pvContextCtorArg: MutPtr<CVoid>,
) {
    public var pvContext: MutPtr<CVoid> = pvContextCtorArg
        internal set

    public constructor() : this(
        header = NdisObjectHeader(),
        dot11ManufacturingCallbackType = 0,
        uStatus = 0u,
        pvContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): NdisObjectHeader = this.header

    public operator fun component2(): Dot11ManufacturingCallbackType = this.dot11ManufacturingCallbackType

    public operator fun component3(): UInt = this.uStatus

    public operator fun component4(): MutPtr<CVoid> = this.pvContext

    public fun copy(header: NdisObjectHeader = this.header, dot11ManufacturingCallbackType: Dot11ManufacturingCallbackType = this.dot11ManufacturingCallbackType, uStatus: UInt = this.uStatus, pvContext: MutPtr<CVoid> = this.pvContext): Dot11ManufacturingCallbackParameters = Dot11ManufacturingCallbackParameters(header = header, dot11ManufacturingCallbackType = dot11ManufacturingCallbackType, uStatus = uStatus, pvContextCtorArg = pvContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ManufacturingCallbackParameters) return false
        if (this.header != other.header) return false
        if (this.dot11ManufacturingCallbackType != other.dot11ManufacturingCallbackType) return false
        if (this.uStatus != other.uStatus) return false
        if (this.pvContext != other.pvContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.dot11ManufacturingCallbackType.hashCode()
        result = 31 * result + this.uStatus.hashCode()
        result = 31 * result + this.pvContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            header: NdisObjectHeader = NdisObjectHeader(),
            dot11ManufacturingCallbackType: Dot11ManufacturingCallbackType = 0,
            uStatus: UInt = 0u,
            pvContext: MutPtr<CVoid> = MutPtr(0L),
        ): Dot11ManufacturingCallbackParameters =
            Dot11ManufacturingCallbackParameters(
                header = header,
                dot11ManufacturingCallbackType = dot11ManufacturingCallbackType,
                uStatus = uStatus,
                pvContextCtorArg = pvContext,
            )
    }
}

public data class Dot11ManufacturingFunctionalTestQueryAdc(
    public var dot11Band: Dot11Band = 0,
    public var uChannel: UInt = 0u,
    public var aDCPowerLevel: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ManufacturingFunctionalTestQueryAdc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ManufacturingFunctionalTestQueryAdc> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11ManufacturingFunctionalTestQueryAdc =
                    Dot11ManufacturingFunctionalTestQueryAdc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11ManufacturingFunctionalTestQueryAdc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.dot11Band)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uChannel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.aDCPowerLevel)
                }
            }
    }
}

public data class Dot11ManufacturingFunctionalTestRx(
    public var bEnabled: Boolean = false,
    public var dot11Band: Dot11Band = 0,
    public var uChannel: UInt = 0u,
    public var powerLevel: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ManufacturingFunctionalTestRx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ManufacturingFunctionalTestRx> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11ManufacturingFunctionalTestRx =
                    Dot11ManufacturingFunctionalTestRx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Dot11ManufacturingFunctionalTestRx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.bEnabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.dot11Band)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uChannel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.powerLevel)
                }
            }
    }
}

public data class Dot11ManufacturingFunctionalTestTx(
    public var bEnable: Boolean = false,
    public var bOpenLoop: Boolean = false,
    public var dot11Band: Dot11Band = 0,
    public var uChannel: UInt = 0u,
    public var uSetPowerLevel: UInt = 0u,
    public var aDCPowerLevel: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ManufacturingFunctionalTestTx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ManufacturingFunctionalTestTx> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11ManufacturingFunctionalTestTx =
                    Dot11ManufacturingFunctionalTestTx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Dot11ManufacturingFunctionalTestTx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.bEnable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.bOpenLoop)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.dot11Band)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uChannel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.uSetPowerLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.aDCPowerLevel)
                }
            }
    }
}

public class Dot11ManufacturingSelfTestQueryResults internal constructor(
    public var selfTestType: Dot11ManufacturingSelfTestType,
    public var uTestID: UInt,
    public var bResult: Boolean,
    public var uPinFailedBitMask: UInt,
    pvContextCtorArg: MutPtr<CVoid>,
    public var uBytesWrittenOut: UInt,
    public var ucBufferOut: UByteArray,
) {
    public var pvContext: MutPtr<CVoid> = pvContextCtorArg
        internal set

    public constructor() : this(
        selfTestType = 0,
        uTestID = 0u,
        bResult = false,
        uPinFailedBitMask = 0u,
        pvContextCtorArg = MutPtr(0L),
        uBytesWrittenOut = 0u,
        ucBufferOut = UByteArray(1),
    )

    public operator fun component1(): Dot11ManufacturingSelfTestType = this.selfTestType

    public operator fun component2(): UInt = this.uTestID

    public operator fun component3(): Boolean = this.bResult

    public operator fun component4(): UInt = this.uPinFailedBitMask

    public operator fun component5(): MutPtr<CVoid> = this.pvContext

    public operator fun component6(): UInt = this.uBytesWrittenOut

    public operator fun component7(): UByteArray = this.ucBufferOut

    public fun copy(selfTestType: Dot11ManufacturingSelfTestType = this.selfTestType, uTestID: UInt = this.uTestID, bResult: Boolean = this.bResult, uPinFailedBitMask: UInt = this.uPinFailedBitMask, pvContext: MutPtr<CVoid> = this.pvContext, uBytesWrittenOut: UInt = this.uBytesWrittenOut, ucBufferOut: UByteArray = this.ucBufferOut): Dot11ManufacturingSelfTestQueryResults = Dot11ManufacturingSelfTestQueryResults(selfTestType = selfTestType, uTestID = uTestID, bResult = bResult, uPinFailedBitMask = uPinFailedBitMask, pvContextCtorArg = pvContext, uBytesWrittenOut = uBytesWrittenOut, ucBufferOut = ucBufferOut)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ManufacturingSelfTestQueryResults) return false
        if (this.selfTestType != other.selfTestType) return false
        if (this.uTestID != other.uTestID) return false
        if (this.bResult != other.bResult) return false
        if (this.uPinFailedBitMask != other.uPinFailedBitMask) return false
        if (this.pvContext != other.pvContext) return false
        if (this.uBytesWrittenOut != other.uBytesWrittenOut) return false
        if (!this.ucBufferOut.contentEquals(other.ucBufferOut)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.selfTestType.hashCode()
        result = 31 * result + this.uTestID.hashCode()
        result = 31 * result + this.bResult.hashCode()
        result = 31 * result + this.uPinFailedBitMask.hashCode()
        result = 31 * result + this.pvContext.hashCode()
        result = 31 * result + this.uBytesWrittenOut.hashCode()
        result = 31 * result + this.ucBufferOut.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ManufacturingSelfTestQueryResults> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ManufacturingSelfTestQueryResults> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dot11ManufacturingSelfTestQueryResults =
                    Dot11ManufacturingSelfTestQueryResults(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Dot11ManufacturingSelfTestQueryResults) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.selfTestType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uTestID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.bResult)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.uPinFailedBitMask)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.pvContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.uBytesWrittenOut)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 28L, value.ucBufferOut)
                }
            }

        public operator fun invoke(
            selfTestType: Dot11ManufacturingSelfTestType = 0,
            uTestID: UInt = 0u,
            bResult: Boolean = false,
            uPinFailedBitMask: UInt = 0u,
            pvContext: MutPtr<CVoid> = MutPtr(0L),
            uBytesWrittenOut: UInt = 0u,
            ucBufferOut: UByteArray = UByteArray(1),
        ): Dot11ManufacturingSelfTestQueryResults =
            Dot11ManufacturingSelfTestQueryResults(
                selfTestType = selfTestType,
                uTestID = uTestID,
                bResult = bResult,
                uPinFailedBitMask = uPinFailedBitMask,
                pvContextCtorArg = pvContext,
                uBytesWrittenOut = uBytesWrittenOut,
                ucBufferOut = ucBufferOut,
            )
    }
}

public class Dot11ManufacturingSelfTestSetParams internal constructor(
    public var selfTestType: Dot11ManufacturingSelfTestType,
    public var uTestID: UInt,
    public var uPinBitMask: UInt,
    pvContextCtorArg: MutPtr<CVoid>,
    public var uBufferLength: UInt,
    public var ucBufferIn: UByteArray,
) {
    public var pvContext: MutPtr<CVoid> = pvContextCtorArg
        internal set

    public constructor() : this(
        selfTestType = 0,
        uTestID = 0u,
        uPinBitMask = 0u,
        pvContextCtorArg = MutPtr(0L),
        uBufferLength = 0u,
        ucBufferIn = UByteArray(1),
    )

    public operator fun component1(): Dot11ManufacturingSelfTestType = this.selfTestType

    public operator fun component2(): UInt = this.uTestID

    public operator fun component3(): UInt = this.uPinBitMask

    public operator fun component4(): MutPtr<CVoid> = this.pvContext

    public operator fun component5(): UInt = this.uBufferLength

    public operator fun component6(): UByteArray = this.ucBufferIn

    public fun copy(selfTestType: Dot11ManufacturingSelfTestType = this.selfTestType, uTestID: UInt = this.uTestID, uPinBitMask: UInt = this.uPinBitMask, pvContext: MutPtr<CVoid> = this.pvContext, uBufferLength: UInt = this.uBufferLength, ucBufferIn: UByteArray = this.ucBufferIn): Dot11ManufacturingSelfTestSetParams = Dot11ManufacturingSelfTestSetParams(selfTestType = selfTestType, uTestID = uTestID, uPinBitMask = uPinBitMask, pvContextCtorArg = pvContext, uBufferLength = uBufferLength, ucBufferIn = ucBufferIn)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ManufacturingSelfTestSetParams) return false
        if (this.selfTestType != other.selfTestType) return false
        if (this.uTestID != other.uTestID) return false
        if (this.uPinBitMask != other.uPinBitMask) return false
        if (this.pvContext != other.pvContext) return false
        if (this.uBufferLength != other.uBufferLength) return false
        if (!this.ucBufferIn.contentEquals(other.ucBufferIn)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.selfTestType.hashCode()
        result = 31 * result + this.uTestID.hashCode()
        result = 31 * result + this.uPinBitMask.hashCode()
        result = 31 * result + this.pvContext.hashCode()
        result = 31 * result + this.uBufferLength.hashCode()
        result = 31 * result + this.ucBufferIn.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ManufacturingSelfTestSetParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ManufacturingSelfTestSetParams> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dot11ManufacturingSelfTestSetParams =
                    Dot11ManufacturingSelfTestSetParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Dot11ManufacturingSelfTestSetParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.selfTestType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uTestID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uPinBitMask)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.pvContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.uBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 28L, value.ucBufferIn)
                }
            }

        public operator fun invoke(
            selfTestType: Dot11ManufacturingSelfTestType = 0,
            uTestID: UInt = 0u,
            uPinBitMask: UInt = 0u,
            pvContext: MutPtr<CVoid> = MutPtr(0L),
            uBufferLength: UInt = 0u,
            ucBufferIn: UByteArray = UByteArray(1),
        ): Dot11ManufacturingSelfTestSetParams =
            Dot11ManufacturingSelfTestSetParams(
                selfTestType = selfTestType,
                uTestID = uTestID,
                uPinBitMask = uPinBitMask,
                pvContextCtorArg = pvContext,
                uBufferLength = uBufferLength,
                ucBufferIn = ucBufferIn,
            )
    }
}

public data class Dot11ManufacturingTest(
    public var dot11ManufacturingTestType: Dot11ManufacturingTestType = 0,
    public var uBufferLength: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ManufacturingTest) return false
        if (this.dot11ManufacturingTestType != other.dot11ManufacturingTestType) return false
        if (this.uBufferLength != other.uBufferLength) return false
        if (!this.ucBuffer.contentEquals(other.ucBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11ManufacturingTestType.hashCode()
        result = 31 * result + this.uBufferLength.hashCode()
        result = 31 * result + this.ucBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ManufacturingTest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ManufacturingTest> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11ManufacturingTest =
                    Dot11ManufacturingTest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11ManufacturingTest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.dot11ManufacturingTestType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.ucBuffer)
                }
            }
    }
}

public data class Dot11ManufacturingTestQueryData(
    public var uKey: UInt = 0u,
    public var uOffset: UInt = 0u,
    public var uBufferLength: UInt = 0u,
    public var uBytesRead: UInt = 0u,
    public var ucBufferOut: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ManufacturingTestQueryData) return false
        if (this.uKey != other.uKey) return false
        if (this.uOffset != other.uOffset) return false
        if (this.uBufferLength != other.uBufferLength) return false
        if (this.uBytesRead != other.uBytesRead) return false
        if (!this.ucBufferOut.contentEquals(other.ucBufferOut)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uKey.hashCode()
        result = 31 * result + this.uOffset.hashCode()
        result = 31 * result + this.uBufferLength.hashCode()
        result = 31 * result + this.uBytesRead.hashCode()
        result = 31 * result + this.ucBufferOut.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ManufacturingTestQueryData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ManufacturingTestQueryData> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11ManufacturingTestQueryData =
                    Dot11ManufacturingTestQueryData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Dot11ManufacturingTestQueryData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.uBytesRead)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 16L, value.ucBufferOut)
                }
            }
    }
}

public data class Dot11ManufacturingTestSetData(
    public var uKey: UInt = 0u,
    public var uOffset: UInt = 0u,
    public var uBufferLength: UInt = 0u,
    public var ucBufferIn: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ManufacturingTestSetData) return false
        if (this.uKey != other.uKey) return false
        if (this.uOffset != other.uOffset) return false
        if (this.uBufferLength != other.uBufferLength) return false
        if (!this.ucBufferIn.contentEquals(other.ucBufferIn)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uKey.hashCode()
        result = 31 * result + this.uOffset.hashCode()
        result = 31 * result + this.uBufferLength.hashCode()
        result = 31 * result + this.ucBufferIn.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ManufacturingTestSetData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ManufacturingTestSetData> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11ManufacturingTestSetData =
                    Dot11ManufacturingTestSetData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Dot11ManufacturingTestSetData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.ucBufferIn)
                }
            }
    }
}

public class Dot11ManufacturingTestSleep internal constructor(
    public var uSleepTime: UInt,
    pvContextCtorArg: MutPtr<CVoid>,
) {
    public var pvContext: MutPtr<CVoid> = pvContextCtorArg
        internal set

    public constructor() : this(
        uSleepTime = 0u,
        pvContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.uSleepTime

    public operator fun component2(): MutPtr<CVoid> = this.pvContext

    public fun copy(uSleepTime: UInt = this.uSleepTime, pvContext: MutPtr<CVoid> = this.pvContext): Dot11ManufacturingTestSleep = Dot11ManufacturingTestSleep(uSleepTime = uSleepTime, pvContextCtorArg = pvContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ManufacturingTestSleep) return false
        if (this.uSleepTime != other.uSleepTime) return false
        if (this.pvContext != other.pvContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uSleepTime.hashCode()
        result = 31 * result + this.pvContext.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ManufacturingTestSleep> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ManufacturingTestSleep> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dot11ManufacturingTestSleep =
                    Dot11ManufacturingTestSleep(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11ManufacturingTestSleep) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uSleepTime)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pvContext)
                }
            }

        public operator fun invoke(
            uSleepTime: UInt = 0u,
            pvContext: MutPtr<CVoid> = MutPtr(0L),
        ): Dot11ManufacturingTestSleep =
            Dot11ManufacturingTestSleep(
                uSleepTime = uSleepTime,
                pvContextCtorArg = pvContext,
            )
    }
}

public data class Dot11MdCapabilityEntryList(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11MDCapabilityEntry: List<Dot11MultiDomainCapabilityEntry> = List(1) { Dot11MultiDomainCapabilityEntry() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11MdCapabilityEntryList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11MdCapabilityEntryList> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11MdCapabilityEntryList =
                    Dot11MdCapabilityEntryList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Dot11MultiDomainCapabilityEntry.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11MdCapabilityEntryList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uNumOfEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uTotalNumOfEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Dot11MultiDomainCapabilityEntry.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.dot11MDCapabilityEntry)
                }
            }
    }
}

public data class Dot11MpduMaxLengthIndication(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uPhyId: UInt = 0u,
    public var uMPDUMaxLength: UInt = 0u,
)

public class Dot11MsonexResultParams internal constructor(
    public var dot11OnexAuthStatus: OnexAuthStatus,
    public var dot11OneXReasonCode: OnexReasonCode,
    pbMPPESendKeyCtorArg: MutPtr<UByte>,
    public var dwMPPESendKeyLen: UInt,
    pbMPPERecvKeyCtorArg: MutPtr<UByte>,
    public var dwMPPERecvKeyLen: UInt,
    pDot11EapResultCtorArg: MutPtr<Dot11EapResult>,
) {
    public var pbMPPESendKey: MutPtr<UByte> = pbMPPESendKeyCtorArg
        internal set

    public var pbMPPERecvKey: MutPtr<UByte> = pbMPPERecvKeyCtorArg
        internal set

    public var pDot11EapResult: MutPtr<Dot11EapResult> = pDot11EapResultCtorArg
        internal set

    public constructor() : this(
        dot11OnexAuthStatus = 0,
        dot11OneXReasonCode = 0,
        pbMPPESendKeyCtorArg = MutPtr(0L),
        dwMPPESendKeyLen = 0u,
        pbMPPERecvKeyCtorArg = MutPtr(0L),
        dwMPPERecvKeyLen = 0u,
        pDot11EapResultCtorArg = MutPtr(0L),
    )

    public operator fun component1(): OnexAuthStatus = this.dot11OnexAuthStatus

    public operator fun component2(): OnexReasonCode = this.dot11OneXReasonCode

    public operator fun component3(): MutPtr<UByte> = this.pbMPPESendKey

    public operator fun component4(): UInt = this.dwMPPESendKeyLen

    public operator fun component5(): MutPtr<UByte> = this.pbMPPERecvKey

    public operator fun component6(): UInt = this.dwMPPERecvKeyLen

    public operator fun component7(): MutPtr<Dot11EapResult> = this.pDot11EapResult

    public fun copy(dot11OnexAuthStatus: OnexAuthStatus = this.dot11OnexAuthStatus, dot11OneXReasonCode: OnexReasonCode = this.dot11OneXReasonCode, pbMPPESendKey: MutPtr<UByte> = this.pbMPPESendKey, dwMPPESendKeyLen: UInt = this.dwMPPESendKeyLen, pbMPPERecvKey: MutPtr<UByte> = this.pbMPPERecvKey, dwMPPERecvKeyLen: UInt = this.dwMPPERecvKeyLen, pDot11EapResult: MutPtr<Dot11EapResult> = this.pDot11EapResult): Dot11MsonexResultParams = Dot11MsonexResultParams(dot11OnexAuthStatus = dot11OnexAuthStatus, dot11OneXReasonCode = dot11OneXReasonCode, pbMPPESendKeyCtorArg = pbMPPESendKey, dwMPPESendKeyLen = dwMPPESendKeyLen, pbMPPERecvKeyCtorArg = pbMPPERecvKey, dwMPPERecvKeyLen = dwMPPERecvKeyLen, pDot11EapResultCtorArg = pDot11EapResult)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11MsonexResultParams) return false
        if (this.dot11OnexAuthStatus != other.dot11OnexAuthStatus) return false
        if (this.dot11OneXReasonCode != other.dot11OneXReasonCode) return false
        if (this.pbMPPESendKey != other.pbMPPESendKey) return false
        if (this.dwMPPESendKeyLen != other.dwMPPESendKeyLen) return false
        if (this.pbMPPERecvKey != other.pbMPPERecvKey) return false
        if (this.dwMPPERecvKeyLen != other.dwMPPERecvKeyLen) return false
        if (this.pDot11EapResult != other.pDot11EapResult) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11OnexAuthStatus.hashCode()
        result = 31 * result + this.dot11OneXReasonCode.hashCode()
        result = 31 * result + this.pbMPPESendKey.hashCode()
        result = 31 * result + this.dwMPPESendKeyLen.hashCode()
        result = 31 * result + this.pbMPPERecvKey.hashCode()
        result = 31 * result + this.dwMPPERecvKeyLen.hashCode()
        result = 31 * result + this.pDot11EapResult.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11MsonexResultParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11MsonexResultParams> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dot11MsonexResultParams =
                    Dot11MsonexResultParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Dot11EapResult>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: Dot11MsonexResultParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.dot11OnexAuthStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.dot11OneXReasonCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbMPPESendKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwMPPESendKeyLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 24L, value.pbMPPERecvKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwMPPERecvKeyLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Dot11EapResult>(64)
                    ).writeNative(addr + 40L, value.pDot11EapResult)
                }
            }

        public operator fun invoke(
            dot11OnexAuthStatus: OnexAuthStatus = 0,
            dot11OneXReasonCode: OnexReasonCode = 0,
            pbMPPESendKey: MutPtr<UByte> = MutPtr(0L),
            dwMPPESendKeyLen: UInt = 0u,
            pbMPPERecvKey: MutPtr<UByte> = MutPtr(0L),
            dwMPPERecvKeyLen: UInt = 0u,
            pDot11EapResult: MutPtr<Dot11EapResult> = MutPtr(0L),
        ): Dot11MsonexResultParams =
            Dot11MsonexResultParams(
                dot11OnexAuthStatus = dot11OnexAuthStatus,
                dot11OneXReasonCode = dot11OneXReasonCode,
                pbMPPESendKeyCtorArg = pbMPPESendKey,
                dwMPPESendKeyLen = dwMPPESendKeyLen,
                pbMPPERecvKeyCtorArg = pbMPPERecvKey,
                dwMPPERecvKeyLen = dwMPPERecvKeyLen,
                pDot11EapResultCtorArg = pDot11EapResult,
            )
    }
}

public class Dot11MssecuritySettings internal constructor(
    public var dot11AuthAlgorithm: Dot11AuthAlgorithm,
    public var dot11CipherAlgorithm: Dot11CipherAlgorithm,
    public var fOneXEnabled: Bool,
    public var eapMethodType: EapMethodType,
    public var dwEapConnectionDataLen: UInt,
    pEapConnectionDataCtorArg: MutPtr<UByte>,
) {
    public var pEapConnectionData: MutPtr<UByte> = pEapConnectionDataCtorArg
        internal set

    public constructor() : this(
        dot11AuthAlgorithm = 0,
        dot11CipherAlgorithm = 0,
        fOneXEnabled = 0,
        eapMethodType = EapMethodType(),
        dwEapConnectionDataLen = 0u,
        pEapConnectionDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Dot11AuthAlgorithm = this.dot11AuthAlgorithm

    public operator fun component2(): Dot11CipherAlgorithm = this.dot11CipherAlgorithm

    public operator fun component3(): Bool = this.fOneXEnabled

    public operator fun component4(): EapMethodType = this.eapMethodType

    public operator fun component5(): UInt = this.dwEapConnectionDataLen

    public operator fun component6(): MutPtr<UByte> = this.pEapConnectionData

    public fun copy(dot11AuthAlgorithm: Dot11AuthAlgorithm = this.dot11AuthAlgorithm, dot11CipherAlgorithm: Dot11CipherAlgorithm = this.dot11CipherAlgorithm, fOneXEnabled: Bool = this.fOneXEnabled, eapMethodType: EapMethodType = this.eapMethodType, dwEapConnectionDataLen: UInt = this.dwEapConnectionDataLen, pEapConnectionData: MutPtr<UByte> = this.pEapConnectionData): Dot11MssecuritySettings = Dot11MssecuritySettings(dot11AuthAlgorithm = dot11AuthAlgorithm, dot11CipherAlgorithm = dot11CipherAlgorithm, fOneXEnabled = fOneXEnabled, eapMethodType = eapMethodType, dwEapConnectionDataLen = dwEapConnectionDataLen, pEapConnectionDataCtorArg = pEapConnectionData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11MssecuritySettings) return false
        if (this.dot11AuthAlgorithm != other.dot11AuthAlgorithm) return false
        if (this.dot11CipherAlgorithm != other.dot11CipherAlgorithm) return false
        if (this.fOneXEnabled != other.fOneXEnabled) return false
        if (this.eapMethodType != other.eapMethodType) return false
        if (this.dwEapConnectionDataLen != other.dwEapConnectionDataLen) return false
        if (this.pEapConnectionData != other.pEapConnectionData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11AuthAlgorithm.hashCode()
        result = 31 * result + this.dot11CipherAlgorithm.hashCode()
        result = 31 * result + this.fOneXEnabled.hashCode()
        result = 31 * result + this.eapMethodType.hashCode()
        result = 31 * result + this.dwEapConnectionDataLen.hashCode()
        result = 31 * result + this.pEapConnectionData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dot11AuthAlgorithm: Dot11AuthAlgorithm = 0,
            dot11CipherAlgorithm: Dot11CipherAlgorithm = 0,
            fOneXEnabled: Bool = 0,
            eapMethodType: EapMethodType = EapMethodType(),
            dwEapConnectionDataLen: UInt = 0u,
            pEapConnectionData: MutPtr<UByte> = MutPtr(0L),
        ): Dot11MssecuritySettings =
            Dot11MssecuritySettings(
                dot11AuthAlgorithm = dot11AuthAlgorithm,
                dot11CipherAlgorithm = dot11CipherAlgorithm,
                fOneXEnabled = fOneXEnabled,
                eapMethodType = eapMethodType,
                dwEapConnectionDataLen = dwEapConnectionDataLen,
                pEapConnectionDataCtorArg = pEapConnectionData,
            )
    }
}

public data class Dot11MultiDomainCapabilityEntry(
    public var uMultiDomainCapabilityIndex: UInt = 0u,
    public var uFirstChannelNumber: UInt = 0u,
    public var uNumberOfChannels: UInt = 0u,
    public var lMaximumTransmitPowerLevel: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11MultiDomainCapabilityEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11MultiDomainCapabilityEntry> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11MultiDomainCapabilityEntry =
                    Dot11MultiDomainCapabilityEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Dot11MultiDomainCapabilityEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uMultiDomainCapabilityIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uFirstChannelNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uNumberOfChannels)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.lMaximumTransmitPowerLevel)
                }
            }
    }
}

public data class Dot11Network(
    public var dot11Ssid: Dot11Ssid = Dot11Ssid(),
    public var dot11BssType: Dot11BssType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11Network> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11Network> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11Network =
                    Dot11Network(
                        (Dot11Ssid.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: Dot11Network) {
                    (Dot11Ssid.typeLayout()).writeNative(addr, value.dot11Ssid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.dot11BssType)
                }
            }
    }
}

public data class Dot11NetworkList(
    public var dwNumberOfItems: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var network: List<Dot11Network> = List(1) { Dot11Network() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11NetworkList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11NetworkList> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11NetworkList =
                    Dot11NetworkList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Dot11Network.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11NetworkList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumberOfItems)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwIndex)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Dot11Network.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.network)
                }
            }
    }
}

public data class Dot11NicSpecificExtension(
    public var uBufferLength: UInt = 0u,
    public var uTotalBufferLength: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11NicSpecificExtension) return false
        if (this.uBufferLength != other.uBufferLength) return false
        if (this.uTotalBufferLength != other.uTotalBufferLength) return false
        if (!this.ucBuffer.contentEquals(other.ucBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uBufferLength.hashCode()
        result = 31 * result + this.uTotalBufferLength.hashCode()
        result = 31 * result + this.ucBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11NicSpecificExtension> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11NicSpecificExtension> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11NicSpecificExtension =
                    Dot11NicSpecificExtension(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11NicSpecificExtension) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uTotalBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.ucBuffer)
                }
            }
    }
}

public data class Dot11OfdmPhyAttributes(
    public var uFrequencyBandsSupported: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11OfdmPhyAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11OfdmPhyAttributes> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11OfdmPhyAttributes =
                    Dot11OfdmPhyAttributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Dot11OfdmPhyAttributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uFrequencyBandsSupported)
                }
            }
    }
}

public data class Dot11OffloadCapability(
    public var uReserved: UInt = 0u,
    public var uFlags: UInt = 0u,
    public var uSupportedWEPAlgorithms: UInt = 0u,
    public var uNumOfReplayWindows: UInt = 0u,
    public var uMaxWEPKeyMappingLength: UInt = 0u,
    public var uSupportedAuthAlgorithms: UInt = 0u,
    public var uMaxAuthKeyMappingLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11OffloadCapability> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11OffloadCapability> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11OffloadCapability =
                    Dot11OffloadCapability(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Dot11OffloadCapability) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uSupportedWEPAlgorithms)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.uNumOfReplayWindows)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.uMaxWEPKeyMappingLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.uSupportedAuthAlgorithms)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.uMaxAuthKeyMappingLength)
                }
            }
    }
}

public data class Dot11OffloadNetwork(
    public var ssid: Dot11Ssid = Dot11Ssid(),
    public var unicastCipher: Dot11CipherAlgorithm = 0,
    public var authAlgo: Dot11AuthAlgorithm = 0,
    public var dot11ChannelHints: List<Dot11ChannelHint> = List(4) { Dot11ChannelHint() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11OffloadNetwork> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11OffloadNetwork> {
                override val sizeBytes: Long = 76L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11OffloadNetwork =
                    Dot11OffloadNetwork(
                        (Dot11Ssid.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Dot11ChannelHint.typeLayout(), (4).toInt())
                        ).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: Dot11OffloadNetwork) {
                    (Dot11Ssid.typeLayout()).writeNative(addr, value.ssid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.unicastCipher)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.authAlgo)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Dot11ChannelHint.typeLayout(), (4).toInt())
                    ).writeNative(addr + 44L, value.dot11ChannelHints)
                }
            }
    }
}

public data class Dot11OffloadNetworkListInfo(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var ulFlags: UInt = 0u,
    public var fastScanPeriod: UInt = 0u,
    public var fastScanIterations: UInt = 0u,
    public var slowScanPeriod: UInt = 0u,
    public var uNumOfEntries: UInt = 0u,
    public var offloadNetworkList: List<Dot11OffloadNetwork> = List(1) { Dot11OffloadNetwork() },
)

public data class Dot11OffloadNetworkStatusParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var status: Int = 0,
)

public data class Dot11Oi(
    public var oILength: UShort = 0u,
    public var oi: UByteArray = UByteArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11Oi) return false
        if (this.oILength != other.oILength) return false
        if (!this.oi.contentEquals(other.oi)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.oILength.hashCode()
        result = 31 * result + this.oi.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11Oi> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11Oi> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Dot11Oi =
                    Dot11Oi(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (5).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Dot11Oi) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.oILength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (5).toInt())
                    ).writeNative(addr + 2L, value.oi)
                }
            }
    }
}

public data class Dot11OperationModeCapability(
    public var uReserved: UInt = 0u,
    public var uMajorVersion: UInt = 0u,
    public var uMinorVersion: UInt = 0u,
    public var uNumOfTXBuffers: UInt = 0u,
    public var uNumOfRXBuffers: UInt = 0u,
    public var uOpModeCapability: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11OperationModeCapability> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11OperationModeCapability> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11OperationModeCapability =
                    Dot11OperationModeCapability(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Dot11OperationModeCapability) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uMinorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.uNumOfTXBuffers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.uNumOfRXBuffers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.uOpModeCapability)
                }
            }
    }
}

public data class Dot11OptionalCapability(
    public var uReserved: UInt = 0u,
    public var bDot11PCF: Boolean = false,
    public var bDot11PCFMPDUTransferToPC: Boolean = false,
    public var bStrictlyOrderedServiceClass: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11OptionalCapability> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11OptionalCapability> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11OptionalCapability =
                    Dot11OptionalCapability(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Dot11OptionalCapability) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.bDot11PCF)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 5L, value.bDot11PCFMPDUTransferToPC)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 6L, value.bStrictlyOrderedServiceClass)
                }
            }
    }
}

public data class Dot11PeerInfo(
    public var macAddress: UByteArray = UByteArray(6),
    public var usCapabilityInformation: UShort = 0u,
    public var authAlgo: Dot11AuthAlgorithm = 0,
    public var unicastCipherAlgo: Dot11CipherAlgorithm = 0,
    public var multicastCipherAlgo: Dot11CipherAlgorithm = 0,
    public var bWpsEnabled: Boolean = false,
    public var usListenInterval: UShort = 0u,
    public var ucSupportedRates: UByteArray = UByteArray(255),
    public var usAssociationID: UShort = 0u,
    public var associationState: Dot11AssociationState = 0,
    public var powerMode: Dot11PowerMode = 0,
    public var liAssociationUpTime: Long = 0L,
    public var statistics: Dot11PeerStatistics = Dot11PeerStatistics(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11PeerInfo) return false
        if (!this.macAddress.contentEquals(other.macAddress)) return false
        if (this.usCapabilityInformation != other.usCapabilityInformation) return false
        if (this.authAlgo != other.authAlgo) return false
        if (this.unicastCipherAlgo != other.unicastCipherAlgo) return false
        if (this.multicastCipherAlgo != other.multicastCipherAlgo) return false
        if (this.bWpsEnabled != other.bWpsEnabled) return false
        if (this.usListenInterval != other.usListenInterval) return false
        if (!this.ucSupportedRates.contentEquals(other.ucSupportedRates)) return false
        if (this.usAssociationID != other.usAssociationID) return false
        if (this.associationState != other.associationState) return false
        if (this.powerMode != other.powerMode) return false
        if (this.liAssociationUpTime != other.liAssociationUpTime) return false
        if (this.statistics != other.statistics) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.macAddress.contentHashCode()
        result = 31 * result + this.usCapabilityInformation.hashCode()
        result = 31 * result + this.authAlgo.hashCode()
        result = 31 * result + this.unicastCipherAlgo.hashCode()
        result = 31 * result + this.multicastCipherAlgo.hashCode()
        result = 31 * result + this.bWpsEnabled.hashCode()
        result = 31 * result + this.usListenInterval.hashCode()
        result = 31 * result + this.ucSupportedRates.contentHashCode()
        result = 31 * result + this.usAssociationID.hashCode()
        result = 31 * result + this.associationState.hashCode()
        result = 31 * result + this.powerMode.hashCode()
        result = 31 * result + this.liAssociationUpTime.hashCode()
        result = 31 * result + this.statistics.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11PeerInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11PeerInfo> {
                override val sizeBytes: Long = 352L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dot11PeerInfo =
                    Dot11PeerInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (255).toInt())
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 280L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 284L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 288L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 296L),
                        (Dot11PeerStatistics.typeLayout()).readNative(addr + 304L),
                    )
                override fun writeNative(addr: Long, value: Dot11PeerInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.macAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.usCapabilityInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.authAlgo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.unicastCipherAlgo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.multicastCipherAlgo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 20L, value.bWpsEnabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.usListenInterval)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (255).toInt())
                    ).writeNative(addr + 24L, value.ucSupportedRates)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 280L, value.usAssociationID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 284L, value.associationState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 288L, value.powerMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 296L, value.liAssociationUpTime)
                    (Dot11PeerStatistics.typeLayout()).writeNative(addr + 304L, value.statistics)
                }
            }
    }
}

public data class Dot11PeerInfoList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var peerInfo: List<Dot11PeerInfo> = List(1) { Dot11PeerInfo() },
)

public data class Dot11PeerStatistics(
    public var ullDecryptSuccessCount: ULong = 0uL,
    public var ullDecryptFailureCount: ULong = 0uL,
    public var ullTxPacketSuccessCount: ULong = 0uL,
    public var ullTxPacketFailureCount: ULong = 0uL,
    public var ullRxPacketSuccessCount: ULong = 0uL,
    public var ullRxPacketFailureCount: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11PeerStatistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11PeerStatistics> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dot11PeerStatistics =
                    Dot11PeerStatistics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: Dot11PeerStatistics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ullDecryptSuccessCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ullDecryptFailureCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.ullTxPacketSuccessCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.ullTxPacketFailureCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.ullRxPacketSuccessCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.ullRxPacketFailureCount)
                }
            }
    }
}

public data class Dot11PerMsduCounters(
    public var uTransmittedFragmentCount: UInt = 0u,
    public var uRetryCount: UInt = 0u,
    public var uRTSSuccessCount: UInt = 0u,
    public var uRTSFailureCount: UInt = 0u,
    public var uACKFailureCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11PerMsduCounters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11PerMsduCounters> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11PerMsduCounters =
                    Dot11PerMsduCounters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Dot11PerMsduCounters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uTransmittedFragmentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uRetryCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uRTSSuccessCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.uRTSFailureCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.uACKFailureCount)
                }
            }
    }
}

public data class Dot11PhyAttributes(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var phyType: Dot11PhyType = 0,
    public var bHardwarePhyState: Boolean = false,
    public var bSoftwarePhyState: Boolean = false,
    public var bCFPollable: Boolean = false,
    public var uMPDUMaxLength: UInt = 0u,
    public var tempType: Dot11TempType = 0,
    public var diversitySupport: Dot11DiversitySupport = 0,
    public var phySpecificAttributes: Dot11PhyAttributes0 = Dot11PhyAttributes0(),
    public var uNumberSupportedPowerLevels: UInt = 0u,
    public var txPowerLevels: UIntArray = UIntArray(8),
    public var uNumDataRateMappingEntries: UInt = 0u,
    public var dataRateMappingEntries: List<Dot11DataRateMappingEntry> = List(126) { Dot11DataRateMappingEntry() },
    public var supportedDataRatesValue: Dot11SupportedDataRatesValueV2 = Dot11SupportedDataRatesValueV2(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11PhyAttributes) return false
        if (this.header != other.header) return false
        if (this.phyType != other.phyType) return false
        if (this.bHardwarePhyState != other.bHardwarePhyState) return false
        if (this.bSoftwarePhyState != other.bSoftwarePhyState) return false
        if (this.bCFPollable != other.bCFPollable) return false
        if (this.uMPDUMaxLength != other.uMPDUMaxLength) return false
        if (this.tempType != other.tempType) return false
        if (this.diversitySupport != other.diversitySupport) return false
        if (this.phySpecificAttributes != other.phySpecificAttributes) return false
        if (this.uNumberSupportedPowerLevels != other.uNumberSupportedPowerLevels) return false
        if (!this.txPowerLevels.contentEquals(other.txPowerLevels)) return false
        if (this.uNumDataRateMappingEntries != other.uNumDataRateMappingEntries) return false
        if (this.dataRateMappingEntries != other.dataRateMappingEntries) return false
        if (this.supportedDataRatesValue != other.supportedDataRatesValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.phyType.hashCode()
        result = 31 * result + this.bHardwarePhyState.hashCode()
        result = 31 * result + this.bSoftwarePhyState.hashCode()
        result = 31 * result + this.bCFPollable.hashCode()
        result = 31 * result + this.uMPDUMaxLength.hashCode()
        result = 31 * result + this.tempType.hashCode()
        result = 31 * result + this.diversitySupport.hashCode()
        result = 31 * result + this.phySpecificAttributes.hashCode()
        result = 31 * result + this.uNumberSupportedPowerLevels.hashCode()
        result = 31 * result + this.txPowerLevels.contentHashCode()
        result = 31 * result + this.uNumDataRateMappingEntries.hashCode()
        result = 31 * result + this.dataRateMappingEntries.hashCode()
        result = 31 * result + this.supportedDataRatesValue.hashCode()
        return result
    }
}

public data class Dot11PhyAttributes0(
    public var hRDSSSAttributes: Dot11HrdsssPhyAttributes = Dot11HrdsssPhyAttributes(),
    public var oFDMAttributes: Dot11OfdmPhyAttributes = Dot11OfdmPhyAttributes(),
    public var eRPAttributes: Dot11ErpPhyAttributes = Dot11ErpPhyAttributes(),
)

public class Dot11PhyFrameStatistics(
    public var ullTransmittedFrameCount: ULong = 0uL,
    public var ullMulticastTransmittedFrameCount: ULong = 0uL,
    public var ullFailedCount: ULong = 0uL,
    public var ullRetryCount: ULong = 0uL,
    public var ullMultipleRetryCount: ULong = 0uL,
    public var ullMaxTXLifetimeExceededCount: ULong = 0uL,
    public var ullTransmittedFragmentCount: ULong = 0uL,
    public var ullRTSSuccessCount: ULong = 0uL,
    public var ullRTSFailureCount: ULong = 0uL,
    public var ullACKFailureCount: ULong = 0uL,
    public var ullReceivedFrameCount: ULong = 0uL,
    public var ullMulticastReceivedFrameCount: ULong = 0uL,
    public var ullPromiscuousReceivedFrameCount: ULong = 0uL,
    public var ullMaxRXLifetimeExceededCount: ULong = 0uL,
    public var ullFrameDuplicateCount: ULong = 0uL,
    public var ullReceivedFragmentCount: ULong = 0uL,
    public var ullPromiscuousReceivedFragmentCount: ULong = 0uL,
    public var ullFCSErrorCount: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11PhyFrameStatistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11PhyFrameStatistics> {
                override val sizeBytes: Long = 144L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dot11PhyFrameStatistics =
                    Dot11PhyFrameStatistics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                    )
                override fun writeNative(addr: Long, value: Dot11PhyFrameStatistics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ullTransmittedFrameCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ullMulticastTransmittedFrameCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.ullFailedCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.ullRetryCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.ullMultipleRetryCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.ullMaxTXLifetimeExceededCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.ullTransmittedFragmentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.ullRTSSuccessCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.ullRTSFailureCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.ullACKFailureCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.ullReceivedFrameCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.ullMulticastReceivedFrameCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.ullPromiscuousReceivedFrameCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.ullMaxRXLifetimeExceededCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.ullFrameDuplicateCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.ullReceivedFragmentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.ullPromiscuousReceivedFragmentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.ullFCSErrorCount)
                }
            }
    }
}

public data class Dot11PhyFrequencyAdoptedParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var ulPhyId: UInt = 0u,
    public var anonymous: Dot11PhyFrequencyAdoptedParameters0 = Dot11PhyFrequencyAdoptedParameters0(),
)

public data class Dot11PhyFrequencyAdoptedParameters0(
    public var ulChannel: UInt = 0u,
    public var ulFrequency: UInt = 0u,
)

public data class Dot11PhyIdList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11PhyId: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11PhyIdList) return false
        if (this.header != other.header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.dot11PhyId.contentEquals(other.dot11PhyId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.dot11PhyId.contentHashCode()
        return result
    }
}

public data class Dot11PhyStateParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uPhyId: UInt = 0u,
    public var bHardwarePhyState: Boolean = false,
    public var bSoftwarePhyState: Boolean = false,
)

public data class Dot11PhyTypeInfo(
    public var dot11PhyType: Dot11PhyType = 0,
    public var bUseParameters: Boolean = false,
    public var uProbeDelay: UInt = 0u,
    public var uMinChannelTime: UInt = 0u,
    public var uMaxChannelTime: UInt = 0u,
    public var chDescriptionType: ChDescriptionType = 0,
    public var uChannelListSize: UInt = 0u,
    public var ucChannelListBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11PhyTypeInfo) return false
        if (this.dot11PhyType != other.dot11PhyType) return false
        if (this.bUseParameters != other.bUseParameters) return false
        if (this.uProbeDelay != other.uProbeDelay) return false
        if (this.uMinChannelTime != other.uMinChannelTime) return false
        if (this.uMaxChannelTime != other.uMaxChannelTime) return false
        if (this.chDescriptionType != other.chDescriptionType) return false
        if (this.uChannelListSize != other.uChannelListSize) return false
        if (!this.ucChannelListBuffer.contentEquals(other.ucChannelListBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11PhyType.hashCode()
        result = 31 * result + this.bUseParameters.hashCode()
        result = 31 * result + this.uProbeDelay.hashCode()
        result = 31 * result + this.uMinChannelTime.hashCode()
        result = 31 * result + this.uMaxChannelTime.hashCode()
        result = 31 * result + this.chDescriptionType.hashCode()
        result = 31 * result + this.uChannelListSize.hashCode()
        result = 31 * result + this.ucChannelListBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11PhyTypeInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11PhyTypeInfo> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11PhyTypeInfo =
                    Dot11PhyTypeInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Dot11PhyTypeInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.dot11PhyType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.bUseParameters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uProbeDelay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.uMinChannelTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.uMaxChannelTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.chDescriptionType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.uChannelListSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 28L, value.ucChannelListBuffer)
                }
            }
    }
}

public data class Dot11PhyTypeList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11PhyType: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11PhyTypeList) return false
        if (this.header != other.header) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.dot11PhyType.contentEquals(other.dot11PhyType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.dot11PhyType.contentHashCode()
        return result
    }
}

public data class Dot11PmkidCandidateListParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uCandidateListSize: UInt = 0u,
    public var uCandidateListOffset: UInt = 0u,
)

public data class Dot11PmkidEntry(
    public var bssid: UByteArray = UByteArray(6),
    public var pmkid: UByteArray = UByteArray(16),
    public var uFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11PmkidEntry) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (!this.pmkid.contentEquals(other.pmkid)) return false
        if (this.uFlags != other.uFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bssid.contentHashCode()
        result = 31 * result + this.pmkid.contentHashCode()
        result = 31 * result + this.uFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11PmkidEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11PmkidEntry> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11PmkidEntry =
                    Dot11PmkidEntry(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Dot11PmkidEntry) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.bssid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 6L, value.pmkid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.uFlags)
                }
            }
    }
}

public data class Dot11PmkidList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var pMKIDs: List<Dot11PmkidEntry> = List(1) { Dot11PmkidEntry() },
)

public data class Dot11PortState(
    public var peerMacAddress: UByteArray = UByteArray(6),
    public var uSessionId: UInt = 0u,
    public var bPortControlled: Bool = 0,
    public var bPortAuthorized: Bool = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11PortState) return false
        if (!this.peerMacAddress.contentEquals(other.peerMacAddress)) return false
        if (this.uSessionId != other.uSessionId) return false
        if (this.bPortControlled != other.bPortControlled) return false
        if (this.bPortAuthorized != other.bPortAuthorized) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.peerMacAddress.contentHashCode()
        result = 31 * result + this.uSessionId.hashCode()
        result = 31 * result + this.bPortControlled.hashCode()
        result = 31 * result + this.bPortAuthorized.hashCode()
        return result
    }
}

public data class Dot11PortStateNotification(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerMac: UByteArray = UByteArray(6),
    public var bOpen: Boolean = false,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11PortStateNotification) return false
        if (this.header != other.header) return false
        if (!this.peerMac.contentEquals(other.peerMac)) return false
        if (this.bOpen != other.bOpen) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerMac.contentHashCode()
        result = 31 * result + this.bOpen.hashCode()
        return result
    }
}

public data class Dot11PowerMgmtAutoModeEnabledInfo(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var bEnabled: Boolean = false,
)

public data class Dot11PowerMgmtMode(
    public var dot11PowerMode: Dot11PowerMode = 0,
    public var uPowerSaveLevel: UInt = 0u,
    public var usListenInterval: UShort = 0u,
    public var usAID: UShort = 0u,
    public var bReceiveDTIMs: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11PowerMgmtMode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11PowerMgmtMode> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11PowerMgmtMode =
                    Dot11PowerMgmtMode(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Dot11PowerMgmtMode) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.dot11PowerMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uPowerSaveLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.usListenInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.usAID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 12L, value.bReceiveDTIMs)
                }
            }
    }
}

public data class Dot11PowerMgmtModeStatusInfo(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var powerSaveMode: Dot11PowerMode = 0,
    public var uPowerSaveLevel: UInt = 0u,
    public var reason: Dot11PowerModeReason = 0,
)

public data class Dot11PrivacyExemption(
    public var usEtherType: UShort = 0u,
    public var usExemptionActionType: UShort = 0u,
    public var usExemptionPacketType: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11PrivacyExemption> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11PrivacyExemption> {
                override val sizeBytes: Long = 6L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Dot11PrivacyExemption =
                    Dot11PrivacyExemption(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11PrivacyExemption) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.usEtherType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.usExemptionActionType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.usExemptionPacketType)
                }
            }
    }
}

public data class Dot11PrivacyExemptionList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var privacyExemptionEntries: List<Dot11PrivacyExemption> = List(1) { Dot11PrivacyExemption() },
)

public data class Dot11ProvisionDiscoveryRequestSendCompleteParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerDeviceAddress: UByteArray = UByteArray(6),
    public var receiverAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var status: Int = 0,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ProvisionDiscoveryRequestSendCompleteParameters) return false
        if (this.header != other.header) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (!this.receiverAddress.contentEquals(other.receiverAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.status != other.status) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.receiverAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11ProvisionDiscoveryResponseSendCompleteParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var receiverDeviceAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var status: Int = 0,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ProvisionDiscoveryResponseSendCompleteParameters) return false
        if (this.header != other.header) return false
        if (!this.receiverDeviceAddress.contentEquals(other.receiverDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.status != other.status) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.receiverDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public data class Dot11QosParams(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var ucEnabledQoSProtocolFlags: UByte = 0u,
)

public data class Dot11QosTxDuration(
    public var uNominalMSDUSize: UInt = 0u,
    public var uMinPHYRate: UInt = 0u,
    public var uDuration: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11QosTxDuration> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11QosTxDuration> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11QosTxDuration =
                    Dot11QosTxDuration(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11QosTxDuration) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uNominalMSDUSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uMinPHYRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uDuration)
                }
            }
    }
}

public data class Dot11QosTxMediumTime(
    public var dot11PeerAddress: UByteArray = UByteArray(6),
    public var ucQoSPriority: UByte = 0u,
    public var uMediumTimeAdmited: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11QosTxMediumTime) return false
        if (!this.dot11PeerAddress.contentEquals(other.dot11PeerAddress)) return false
        if (this.ucQoSPriority != other.ucQoSPriority) return false
        if (this.uMediumTimeAdmited != other.uMediumTimeAdmited) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11PeerAddress.contentHashCode()
        result = 31 * result + this.ucQoSPriority.hashCode()
        result = 31 * result + this.uMediumTimeAdmited.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11QosTxMediumTime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11QosTxMediumTime> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11QosTxMediumTime =
                    Dot11QosTxMediumTime(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11QosTxMediumTime) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.dot11PeerAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.ucQoSPriority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uMediumTimeAdmited)
                }
            }
    }
}

public data class Dot11RateSet(
    public var uRateSetLength: UInt = 0u,
    public var ucRateSet: UByteArray = UByteArray(126),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11RateSet) return false
        if (this.uRateSetLength != other.uRateSetLength) return false
        if (!this.ucRateSet.contentEquals(other.ucRateSet)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uRateSetLength.hashCode()
        result = 31 * result + this.ucRateSet.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11RateSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11RateSet> {
                override val sizeBytes: Long = 132L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11RateSet =
                    Dot11RateSet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (126).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11RateSet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uRateSetLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (126).toInt())
                    ).writeNative(addr + 4L, value.ucRateSet)
                }
            }
    }
}

public data class Dot11ReceivedGoNegotiationConfirmationParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerDeviceAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ReceivedGoNegotiationConfirmationParameters) return false
        if (this.header != other.header) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public class Dot11ReceivedGoNegotiationRequestParameters internal constructor(
    public var header: NdisObjectHeader,
    public var peerDeviceAddress: UByteArray,
    public var dialogToken: UByte,
    requestContextCtorArg: MutPtr<CVoid>,
    public var uIEsOffset: UInt,
    public var uIEsLength: UInt,
) {
    public var requestContext: MutPtr<CVoid> = requestContextCtorArg
        internal set

    public constructor() : this(
        header = NdisObjectHeader(),
        peerDeviceAddress = UByteArray(6),
        dialogToken = 0u,
        requestContextCtorArg = MutPtr(0L),
        uIEsOffset = 0u,
        uIEsLength = 0u,
    )

    public operator fun component1(): NdisObjectHeader = this.header

    public operator fun component2(): UByteArray = this.peerDeviceAddress

    public operator fun component3(): UByte = this.dialogToken

    public operator fun component4(): MutPtr<CVoid> = this.requestContext

    public operator fun component5(): UInt = this.uIEsOffset

    public operator fun component6(): UInt = this.uIEsLength

    public fun copy(header: NdisObjectHeader = this.header, peerDeviceAddress: UByteArray = this.peerDeviceAddress, dialogToken: UByte = this.dialogToken, requestContext: MutPtr<CVoid> = this.requestContext, uIEsOffset: UInt = this.uIEsOffset, uIEsLength: UInt = this.uIEsLength): Dot11ReceivedGoNegotiationRequestParameters = Dot11ReceivedGoNegotiationRequestParameters(header = header, peerDeviceAddress = peerDeviceAddress, dialogToken = dialogToken, requestContextCtorArg = requestContext, uIEsOffset = uIEsOffset, uIEsLength = uIEsLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ReceivedGoNegotiationRequestParameters) return false
        if (this.header != other.header) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.requestContext != other.requestContext) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.requestContext.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            header: NdisObjectHeader = NdisObjectHeader(),
            peerDeviceAddress: UByteArray = UByteArray(6),
            dialogToken: UByte = 0u,
            requestContext: MutPtr<CVoid> = MutPtr(0L),
            uIEsOffset: UInt = 0u,
            uIEsLength: UInt = 0u,
        ): Dot11ReceivedGoNegotiationRequestParameters =
            Dot11ReceivedGoNegotiationRequestParameters(
                header = header,
                peerDeviceAddress = peerDeviceAddress,
                dialogToken = dialogToken,
                requestContextCtorArg = requestContext,
                uIEsOffset = uIEsOffset,
                uIEsLength = uIEsLength,
            )
    }
}

public class Dot11ReceivedGoNegotiationResponseParameters internal constructor(
    public var header: NdisObjectHeader,
    public var peerDeviceAddress: UByteArray,
    public var dialogToken: UByte,
    responseContextCtorArg: MutPtr<CVoid>,
    public var uIEsOffset: UInt,
    public var uIEsLength: UInt,
) {
    public var responseContext: MutPtr<CVoid> = responseContextCtorArg
        internal set

    public constructor() : this(
        header = NdisObjectHeader(),
        peerDeviceAddress = UByteArray(6),
        dialogToken = 0u,
        responseContextCtorArg = MutPtr(0L),
        uIEsOffset = 0u,
        uIEsLength = 0u,
    )

    public operator fun component1(): NdisObjectHeader = this.header

    public operator fun component2(): UByteArray = this.peerDeviceAddress

    public operator fun component3(): UByte = this.dialogToken

    public operator fun component4(): MutPtr<CVoid> = this.responseContext

    public operator fun component5(): UInt = this.uIEsOffset

    public operator fun component6(): UInt = this.uIEsLength

    public fun copy(header: NdisObjectHeader = this.header, peerDeviceAddress: UByteArray = this.peerDeviceAddress, dialogToken: UByte = this.dialogToken, responseContext: MutPtr<CVoid> = this.responseContext, uIEsOffset: UInt = this.uIEsOffset, uIEsLength: UInt = this.uIEsLength): Dot11ReceivedGoNegotiationResponseParameters = Dot11ReceivedGoNegotiationResponseParameters(header = header, peerDeviceAddress = peerDeviceAddress, dialogToken = dialogToken, responseContextCtorArg = responseContext, uIEsOffset = uIEsOffset, uIEsLength = uIEsLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ReceivedGoNegotiationResponseParameters) return false
        if (this.header != other.header) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.responseContext != other.responseContext) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.responseContext.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            header: NdisObjectHeader = NdisObjectHeader(),
            peerDeviceAddress: UByteArray = UByteArray(6),
            dialogToken: UByte = 0u,
            responseContext: MutPtr<CVoid> = MutPtr(0L),
            uIEsOffset: UInt = 0u,
            uIEsLength: UInt = 0u,
        ): Dot11ReceivedGoNegotiationResponseParameters =
            Dot11ReceivedGoNegotiationResponseParameters(
                header = header,
                peerDeviceAddress = peerDeviceAddress,
                dialogToken = dialogToken,
                responseContextCtorArg = responseContext,
                uIEsOffset = uIEsOffset,
                uIEsLength = uIEsLength,
            )
    }
}

public class Dot11ReceivedInvitationRequestParameters internal constructor(
    public var header: NdisObjectHeader,
    public var transmitterDeviceAddress: UByteArray,
    public var bssid: UByteArray,
    public var dialogToken: UByte,
    requestContextCtorArg: MutPtr<CVoid>,
    public var uIEsOffset: UInt,
    public var uIEsLength: UInt,
) {
    public var requestContext: MutPtr<CVoid> = requestContextCtorArg
        internal set

    public constructor() : this(
        header = NdisObjectHeader(),
        transmitterDeviceAddress = UByteArray(6),
        bssid = UByteArray(6),
        dialogToken = 0u,
        requestContextCtorArg = MutPtr(0L),
        uIEsOffset = 0u,
        uIEsLength = 0u,
    )

    public operator fun component1(): NdisObjectHeader = this.header

    public operator fun component2(): UByteArray = this.transmitterDeviceAddress

    public operator fun component3(): UByteArray = this.bssid

    public operator fun component4(): UByte = this.dialogToken

    public operator fun component5(): MutPtr<CVoid> = this.requestContext

    public operator fun component6(): UInt = this.uIEsOffset

    public operator fun component7(): UInt = this.uIEsLength

    public fun copy(header: NdisObjectHeader = this.header, transmitterDeviceAddress: UByteArray = this.transmitterDeviceAddress, bssid: UByteArray = this.bssid, dialogToken: UByte = this.dialogToken, requestContext: MutPtr<CVoid> = this.requestContext, uIEsOffset: UInt = this.uIEsOffset, uIEsLength: UInt = this.uIEsLength): Dot11ReceivedInvitationRequestParameters = Dot11ReceivedInvitationRequestParameters(header = header, transmitterDeviceAddress = transmitterDeviceAddress, bssid = bssid, dialogToken = dialogToken, requestContextCtorArg = requestContext, uIEsOffset = uIEsOffset, uIEsLength = uIEsLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ReceivedInvitationRequestParameters) return false
        if (this.header != other.header) return false
        if (!this.transmitterDeviceAddress.contentEquals(other.transmitterDeviceAddress)) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.requestContext != other.requestContext) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.transmitterDeviceAddress.contentHashCode()
        result = 31 * result + this.bssid.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.requestContext.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            header: NdisObjectHeader = NdisObjectHeader(),
            transmitterDeviceAddress: UByteArray = UByteArray(6),
            bssid: UByteArray = UByteArray(6),
            dialogToken: UByte = 0u,
            requestContext: MutPtr<CVoid> = MutPtr(0L),
            uIEsOffset: UInt = 0u,
            uIEsLength: UInt = 0u,
        ): Dot11ReceivedInvitationRequestParameters =
            Dot11ReceivedInvitationRequestParameters(
                header = header,
                transmitterDeviceAddress = transmitterDeviceAddress,
                bssid = bssid,
                dialogToken = dialogToken,
                requestContextCtorArg = requestContext,
                uIEsOffset = uIEsOffset,
                uIEsLength = uIEsLength,
            )
    }
}

public data class Dot11ReceivedInvitationResponseParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var transmitterDeviceAddress: UByteArray = UByteArray(6),
    public var bssid: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ReceivedInvitationResponseParameters) return false
        if (this.header != other.header) return false
        if (!this.transmitterDeviceAddress.contentEquals(other.transmitterDeviceAddress)) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.transmitterDeviceAddress.contentHashCode()
        result = 31 * result + this.bssid.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public class Dot11ReceivedProvisionDiscoveryRequestParameters internal constructor(
    public var header: NdisObjectHeader,
    public var transmitterDeviceAddress: UByteArray,
    public var bssid: UByteArray,
    public var dialogToken: UByte,
    requestContextCtorArg: MutPtr<CVoid>,
    public var uIEsOffset: UInt,
    public var uIEsLength: UInt,
) {
    public var requestContext: MutPtr<CVoid> = requestContextCtorArg
        internal set

    public constructor() : this(
        header = NdisObjectHeader(),
        transmitterDeviceAddress = UByteArray(6),
        bssid = UByteArray(6),
        dialogToken = 0u,
        requestContextCtorArg = MutPtr(0L),
        uIEsOffset = 0u,
        uIEsLength = 0u,
    )

    public operator fun component1(): NdisObjectHeader = this.header

    public operator fun component2(): UByteArray = this.transmitterDeviceAddress

    public operator fun component3(): UByteArray = this.bssid

    public operator fun component4(): UByte = this.dialogToken

    public operator fun component5(): MutPtr<CVoid> = this.requestContext

    public operator fun component6(): UInt = this.uIEsOffset

    public operator fun component7(): UInt = this.uIEsLength

    public fun copy(header: NdisObjectHeader = this.header, transmitterDeviceAddress: UByteArray = this.transmitterDeviceAddress, bssid: UByteArray = this.bssid, dialogToken: UByte = this.dialogToken, requestContext: MutPtr<CVoid> = this.requestContext, uIEsOffset: UInt = this.uIEsOffset, uIEsLength: UInt = this.uIEsLength): Dot11ReceivedProvisionDiscoveryRequestParameters = Dot11ReceivedProvisionDiscoveryRequestParameters(header = header, transmitterDeviceAddress = transmitterDeviceAddress, bssid = bssid, dialogToken = dialogToken, requestContextCtorArg = requestContext, uIEsOffset = uIEsOffset, uIEsLength = uIEsLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ReceivedProvisionDiscoveryRequestParameters) return false
        if (this.header != other.header) return false
        if (!this.transmitterDeviceAddress.contentEquals(other.transmitterDeviceAddress)) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.requestContext != other.requestContext) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.transmitterDeviceAddress.contentHashCode()
        result = 31 * result + this.bssid.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.requestContext.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            header: NdisObjectHeader = NdisObjectHeader(),
            transmitterDeviceAddress: UByteArray = UByteArray(6),
            bssid: UByteArray = UByteArray(6),
            dialogToken: UByte = 0u,
            requestContext: MutPtr<CVoid> = MutPtr(0L),
            uIEsOffset: UInt = 0u,
            uIEsLength: UInt = 0u,
        ): Dot11ReceivedProvisionDiscoveryRequestParameters =
            Dot11ReceivedProvisionDiscoveryRequestParameters(
                header = header,
                transmitterDeviceAddress = transmitterDeviceAddress,
                bssid = bssid,
                dialogToken = dialogToken,
                requestContextCtorArg = requestContext,
                uIEsOffset = uIEsOffset,
                uIEsLength = uIEsLength,
            )
    }
}

public data class Dot11ReceivedProvisionDiscoveryResponseParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var transmitterDeviceAddress: UByteArray = UByteArray(6),
    public var bssid: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ReceivedProvisionDiscoveryResponseParameters) return false
        if (this.header != other.header) return false
        if (!this.transmitterDeviceAddress.contentEquals(other.transmitterDeviceAddress)) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.transmitterDeviceAddress.contentHashCode()
        result = 31 * result + this.bssid.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public class Dot11RecvExtensionInfo internal constructor(
    public var uVersion: UInt,
    pvReservedCtorArg: MutPtr<CVoid>,
    public var dot11PhyType: Dot11PhyType,
    public var uChCenterFrequency: UInt,
    public var lRSSI: Int,
    public var lRSSIMin: Int,
    public var lRSSIMax: Int,
    public var uRSSI: UInt,
    public var ucPriority: UByte,
    public var ucDataRate: UByte,
    public var ucPeerMacAddress: UByteArray,
    public var dwExtendedStatus: UInt,
    hWEPOffloadContextCtorArg: Handle,
    hAuthOffloadContextCtorArg: Handle,
    public var usWEPAppliedMask: UShort,
    public var usWPAMSDUPriority: UShort,
    public var dot11LowestIV48Counter: Dot11Iv48Counter,
    public var usDot11LeftRWBitMap: UShort,
    public var dot11HighestIV48Counter: Dot11Iv48Counter,
    public var usDot11RightRWBitMap: UShort,
    public var usNumberOfMPDUsReceived: UShort,
    public var usNumberOfFragments: UShort,
    pNdisPacketsCtorArg: List<MutPtr<CVoid>>,
) {
    public var pvReserved: MutPtr<CVoid> = pvReservedCtorArg
        internal set

    public var hWEPOffloadContext: Handle = hWEPOffloadContextCtorArg
        internal set

    public var hAuthOffloadContext: Handle = hAuthOffloadContextCtorArg
        internal set

    public var pNdisPackets: List<MutPtr<CVoid>> = pNdisPacketsCtorArg
        internal set

    public constructor() : this(
        uVersion = 0u,
        pvReservedCtorArg = MutPtr(0L),
        dot11PhyType = 0,
        uChCenterFrequency = 0u,
        lRSSI = 0,
        lRSSIMin = 0,
        lRSSIMax = 0,
        uRSSI = 0u,
        ucPriority = 0u,
        ucDataRate = 0u,
        ucPeerMacAddress = UByteArray(6),
        dwExtendedStatus = 0u,
        hWEPOffloadContextCtorArg = MutPtr(0L),
        hAuthOffloadContextCtorArg = MutPtr(0L),
        usWEPAppliedMask = 0u,
        usWPAMSDUPriority = 0u,
        dot11LowestIV48Counter = Dot11Iv48Counter(),
        usDot11LeftRWBitMap = 0u,
        dot11HighestIV48Counter = Dot11Iv48Counter(),
        usDot11RightRWBitMap = 0u,
        usNumberOfMPDUsReceived = 0u,
        usNumberOfFragments = 0u,
        pNdisPacketsCtorArg = List(1) { MutPtr(0L) },
    )

    public companion object {
        public operator fun invoke(
            uVersion: UInt = 0u,
            pvReserved: MutPtr<CVoid> = MutPtr(0L),
            dot11PhyType: Dot11PhyType = 0,
            uChCenterFrequency: UInt = 0u,
            lRSSI: Int = 0,
            lRSSIMin: Int = 0,
            lRSSIMax: Int = 0,
            uRSSI: UInt = 0u,
            ucPriority: UByte = 0u,
            ucDataRate: UByte = 0u,
            ucPeerMacAddress: UByteArray = UByteArray(6),
            dwExtendedStatus: UInt = 0u,
            hWEPOffloadContext: Handle = MutPtr(0L),
            hAuthOffloadContext: Handle = MutPtr(0L),
            usWEPAppliedMask: UShort = 0u,
            usWPAMSDUPriority: UShort = 0u,
            dot11LowestIV48Counter: Dot11Iv48Counter = Dot11Iv48Counter(),
            usDot11LeftRWBitMap: UShort = 0u,
            dot11HighestIV48Counter: Dot11Iv48Counter = Dot11Iv48Counter(),
            usDot11RightRWBitMap: UShort = 0u,
            usNumberOfMPDUsReceived: UShort = 0u,
            usNumberOfFragments: UShort = 0u,
            pNdisPackets: List<MutPtr<CVoid>> = List(1) { MutPtr(0L) },
        ): Dot11RecvExtensionInfo =
            Dot11RecvExtensionInfo(
                uVersion = uVersion,
                pvReservedCtorArg = pvReserved,
                dot11PhyType = dot11PhyType,
                uChCenterFrequency = uChCenterFrequency,
                lRSSI = lRSSI,
                lRSSIMin = lRSSIMin,
                lRSSIMax = lRSSIMax,
                uRSSI = uRSSI,
                ucPriority = ucPriority,
                ucDataRate = ucDataRate,
                ucPeerMacAddress = ucPeerMacAddress,
                dwExtendedStatus = dwExtendedStatus,
                hWEPOffloadContextCtorArg = hWEPOffloadContext,
                hAuthOffloadContextCtorArg = hAuthOffloadContext,
                usWEPAppliedMask = usWEPAppliedMask,
                usWPAMSDUPriority = usWPAMSDUPriority,
                dot11LowestIV48Counter = dot11LowestIV48Counter,
                usDot11LeftRWBitMap = usDot11LeftRWBitMap,
                dot11HighestIV48Counter = dot11HighestIV48Counter,
                usDot11RightRWBitMap = usDot11RightRWBitMap,
                usNumberOfMPDUsReceived = usNumberOfMPDUsReceived,
                usNumberOfFragments = usNumberOfFragments,
                pNdisPacketsCtorArg = pNdisPackets,
            )
    }
}

public class Dot11RecvExtensionInfoV2 internal constructor(
    public var uVersion: UInt,
    pvReservedCtorArg: MutPtr<CVoid>,
    public var dot11PhyType: Dot11PhyType,
    public var uChCenterFrequency: UInt,
    public var lRSSI: Int,
    public var uRSSI: UInt,
    public var ucPriority: UByte,
    public var ucDataRate: UByte,
    public var ucPeerMacAddress: UByteArray,
    public var dwExtendedStatus: UInt,
    hWEPOffloadContextCtorArg: Handle,
    hAuthOffloadContextCtorArg: Handle,
    public var usWEPAppliedMask: UShort,
    public var usWPAMSDUPriority: UShort,
    public var dot11LowestIV48Counter: Dot11Iv48Counter,
    public var usDot11LeftRWBitMap: UShort,
    public var dot11HighestIV48Counter: Dot11Iv48Counter,
    public var usDot11RightRWBitMap: UShort,
    public var usNumberOfMPDUsReceived: UShort,
    public var usNumberOfFragments: UShort,
    pNdisPacketsCtorArg: List<MutPtr<CVoid>>,
) {
    public var pvReserved: MutPtr<CVoid> = pvReservedCtorArg
        internal set

    public var hWEPOffloadContext: Handle = hWEPOffloadContextCtorArg
        internal set

    public var hAuthOffloadContext: Handle = hAuthOffloadContextCtorArg
        internal set

    public var pNdisPackets: List<MutPtr<CVoid>> = pNdisPacketsCtorArg
        internal set

    public constructor() : this(
        uVersion = 0u,
        pvReservedCtorArg = MutPtr(0L),
        dot11PhyType = 0,
        uChCenterFrequency = 0u,
        lRSSI = 0,
        uRSSI = 0u,
        ucPriority = 0u,
        ucDataRate = 0u,
        ucPeerMacAddress = UByteArray(6),
        dwExtendedStatus = 0u,
        hWEPOffloadContextCtorArg = MutPtr(0L),
        hAuthOffloadContextCtorArg = MutPtr(0L),
        usWEPAppliedMask = 0u,
        usWPAMSDUPriority = 0u,
        dot11LowestIV48Counter = Dot11Iv48Counter(),
        usDot11LeftRWBitMap = 0u,
        dot11HighestIV48Counter = Dot11Iv48Counter(),
        usDot11RightRWBitMap = 0u,
        usNumberOfMPDUsReceived = 0u,
        usNumberOfFragments = 0u,
        pNdisPacketsCtorArg = List(1) { MutPtr(0L) },
    )

    public companion object {
        public operator fun invoke(
            uVersion: UInt = 0u,
            pvReserved: MutPtr<CVoid> = MutPtr(0L),
            dot11PhyType: Dot11PhyType = 0,
            uChCenterFrequency: UInt = 0u,
            lRSSI: Int = 0,
            uRSSI: UInt = 0u,
            ucPriority: UByte = 0u,
            ucDataRate: UByte = 0u,
            ucPeerMacAddress: UByteArray = UByteArray(6),
            dwExtendedStatus: UInt = 0u,
            hWEPOffloadContext: Handle = MutPtr(0L),
            hAuthOffloadContext: Handle = MutPtr(0L),
            usWEPAppliedMask: UShort = 0u,
            usWPAMSDUPriority: UShort = 0u,
            dot11LowestIV48Counter: Dot11Iv48Counter = Dot11Iv48Counter(),
            usDot11LeftRWBitMap: UShort = 0u,
            dot11HighestIV48Counter: Dot11Iv48Counter = Dot11Iv48Counter(),
            usDot11RightRWBitMap: UShort = 0u,
            usNumberOfMPDUsReceived: UShort = 0u,
            usNumberOfFragments: UShort = 0u,
            pNdisPackets: List<MutPtr<CVoid>> = List(1) { MutPtr(0L) },
        ): Dot11RecvExtensionInfoV2 =
            Dot11RecvExtensionInfoV2(
                uVersion = uVersion,
                pvReservedCtorArg = pvReserved,
                dot11PhyType = dot11PhyType,
                uChCenterFrequency = uChCenterFrequency,
                lRSSI = lRSSI,
                uRSSI = uRSSI,
                ucPriority = ucPriority,
                ucDataRate = ucDataRate,
                ucPeerMacAddress = ucPeerMacAddress,
                dwExtendedStatus = dwExtendedStatus,
                hWEPOffloadContextCtorArg = hWEPOffloadContext,
                hAuthOffloadContextCtorArg = hAuthOffloadContext,
                usWEPAppliedMask = usWEPAppliedMask,
                usWPAMSDUPriority = usWPAMSDUPriority,
                dot11LowestIV48Counter = dot11LowestIV48Counter,
                usDot11LeftRWBitMap = usDot11LeftRWBitMap,
                dot11HighestIV48Counter = dot11HighestIV48Counter,
                usDot11RightRWBitMap = usDot11RightRWBitMap,
                usNumberOfMPDUsReceived = usNumberOfMPDUsReceived,
                usNumberOfFragments = usNumberOfFragments,
                pNdisPacketsCtorArg = pNdisPackets,
            )
    }
}

public data class Dot11RecvSensitivity(
    public var ucDataRate: UByte = 0u,
    public var lRSSIMin: Int = 0,
    public var lRSSIMax: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11RecvSensitivity> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11RecvSensitivity> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11RecvSensitivity =
                    Dot11RecvSensitivity(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11RecvSensitivity) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.ucDataRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lRSSIMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.lRSSIMax)
                }
            }
    }
}

public data class Dot11RecvSensitivityList(
    public var anonymous: Dot11RecvSensitivityList0 = Dot11RecvSensitivityList0(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11RecvSensitivity: List<Dot11RecvSensitivity> = List(1) { Dot11RecvSensitivity() },
)

public data class Dot11RecvSensitivityList0(
    public var dot11PhyType: Dot11PhyType = 0,
    public var uPhyId: UInt = 0u,
)

public data class Dot11RegDomainsSupportValue(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11RegDomainValue: List<Dot11RegDomainValue> = List(1) { Dot11RegDomainValue() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11RegDomainsSupportValue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11RegDomainsSupportValue> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11RegDomainsSupportValue =
                    Dot11RegDomainsSupportValue(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Dot11RegDomainValue.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11RegDomainsSupportValue) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uNumOfEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uTotalNumOfEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Dot11RegDomainValue.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.dot11RegDomainValue)
                }
            }
    }
}

public data class Dot11RegDomainValue(
    public var uRegDomainsSupportIndex: UInt = 0u,
    public var uRegDomainsSupportValue: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11RegDomainValue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11RegDomainValue> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11RegDomainValue =
                    Dot11RegDomainValue(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11RegDomainValue) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uRegDomainsSupportIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uRegDomainsSupportValue)
                }
            }
    }
}

public data class Dot11ResetRequest(
    public var dot11ResetType: Dot11ResetType = 0,
    public var dot11MacAddress: UByteArray = UByteArray(6),
    public var bSetDefaultMIB: Boolean = false,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ResetRequest) return false
        if (this.dot11ResetType != other.dot11ResetType) return false
        if (!this.dot11MacAddress.contentEquals(other.dot11MacAddress)) return false
        if (this.bSetDefaultMIB != other.bSetDefaultMIB) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11ResetType.hashCode()
        result = 31 * result + this.dot11MacAddress.contentHashCode()
        result = 31 * result + this.bSetDefaultMIB.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ResetRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ResetRequest> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11ResetRequest =
                    Dot11ResetRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: Dot11ResetRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.dot11ResetType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 4L, value.dot11MacAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 10L, value.bSetDefaultMIB)
                }
            }
    }
}

public data class Dot11RoamingCompletionParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uStatus: UInt = 0u,
)

public data class Dot11RoamingStartParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var adhocBSSID: UByteArray = UByteArray(6),
    public var adhocSSID: Dot11Ssid = Dot11Ssid(),
    public var uRoamingReason: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11RoamingStartParameters) return false
        if (this.header != other.header) return false
        if (!this.adhocBSSID.contentEquals(other.adhocBSSID)) return false
        if (this.adhocSSID != other.adhocSSID) return false
        if (this.uRoamingReason != other.uRoamingReason) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.adhocBSSID.contentHashCode()
        result = 31 * result + this.adhocSSID.hashCode()
        result = 31 * result + this.uRoamingReason.hashCode()
        return result
    }
}

public data class Dot11RssiRange(
    public var dot11PhyType: Dot11PhyType = 0,
    public var uRSSIMin: UInt = 0u,
    public var uRSSIMax: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11RssiRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11RssiRange> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11RssiRange =
                    Dot11RssiRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11RssiRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.dot11PhyType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uRSSIMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uRSSIMax)
                }
            }
    }
}

public data class Dot11ScanRequest(
    public var dot11BSSType: Dot11BssType = 0,
    public var dot11BSSID: UByteArray = UByteArray(6),
    public var dot11SSID: Dot11Ssid = Dot11Ssid(),
    public var dot11ScanType: Dot11ScanType = 0,
    public var bRestrictedScan: Boolean = false,
    public var bUseRequestIE: Boolean = false,
    public var uRequestIDsOffset: UInt = 0u,
    public var uNumOfRequestIDs: UInt = 0u,
    public var uPhyTypesOffset: UInt = 0u,
    public var uNumOfPhyTypes: UInt = 0u,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ScanRequest) return false
        if (this.dot11BSSType != other.dot11BSSType) return false
        if (!this.dot11BSSID.contentEquals(other.dot11BSSID)) return false
        if (this.dot11SSID != other.dot11SSID) return false
        if (this.dot11ScanType != other.dot11ScanType) return false
        if (this.bRestrictedScan != other.bRestrictedScan) return false
        if (this.bUseRequestIE != other.bUseRequestIE) return false
        if (this.uRequestIDsOffset != other.uRequestIDsOffset) return false
        if (this.uNumOfRequestIDs != other.uNumOfRequestIDs) return false
        if (this.uPhyTypesOffset != other.uPhyTypesOffset) return false
        if (this.uNumOfPhyTypes != other.uNumOfPhyTypes) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        if (!this.ucBuffer.contentEquals(other.ucBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11BSSType.hashCode()
        result = 31 * result + this.dot11BSSID.contentHashCode()
        result = 31 * result + this.dot11SSID.hashCode()
        result = 31 * result + this.dot11ScanType.hashCode()
        result = 31 * result + this.bRestrictedScan.hashCode()
        result = 31 * result + this.bUseRequestIE.hashCode()
        result = 31 * result + this.uRequestIDsOffset.hashCode()
        result = 31 * result + this.uNumOfRequestIDs.hashCode()
        result = 31 * result + this.uPhyTypesOffset.hashCode()
        result = 31 * result + this.uNumOfPhyTypes.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        result = 31 * result + this.ucBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ScanRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ScanRequest> {
                override val sizeBytes: Long = 84L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11ScanRequest =
                    Dot11ScanRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 4L),
                        (Dot11Ssid.typeLayout()).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 53L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: Dot11ScanRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.dot11BSSType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 4L, value.dot11BSSID)
                    (Dot11Ssid.typeLayout()).writeNative(addr + 12L, value.dot11SSID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.dot11ScanType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 52L, value.bRestrictedScan)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 53L, value.bUseRequestIE)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.uRequestIDsOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.uNumOfRequestIDs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.uPhyTypesOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.uNumOfPhyTypes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.uIEsOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.uIEsLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 80L, value.ucBuffer)
                }
            }
    }
}

public data class Dot11ScanRequestV2(
    public var dot11BSSType: Dot11BssType = 0,
    public var dot11BSSID: UByteArray = UByteArray(6),
    public var dot11ScanType: Dot11ScanType = 0,
    public var bRestrictedScan: Boolean = false,
    public var udot11SSIDsOffset: UInt = 0u,
    public var uNumOfdot11SSIDs: UInt = 0u,
    public var bUseRequestIE: Boolean = false,
    public var uRequestIDsOffset: UInt = 0u,
    public var uNumOfRequestIDs: UInt = 0u,
    public var uPhyTypeInfosOffset: UInt = 0u,
    public var uNumOfPhyTypeInfos: UInt = 0u,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11ScanRequestV2) return false
        if (this.dot11BSSType != other.dot11BSSType) return false
        if (!this.dot11BSSID.contentEquals(other.dot11BSSID)) return false
        if (this.dot11ScanType != other.dot11ScanType) return false
        if (this.bRestrictedScan != other.bRestrictedScan) return false
        if (this.udot11SSIDsOffset != other.udot11SSIDsOffset) return false
        if (this.uNumOfdot11SSIDs != other.uNumOfdot11SSIDs) return false
        if (this.bUseRequestIE != other.bUseRequestIE) return false
        if (this.uRequestIDsOffset != other.uRequestIDsOffset) return false
        if (this.uNumOfRequestIDs != other.uNumOfRequestIDs) return false
        if (this.uPhyTypeInfosOffset != other.uPhyTypeInfosOffset) return false
        if (this.uNumOfPhyTypeInfos != other.uNumOfPhyTypeInfos) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        if (!this.ucBuffer.contentEquals(other.ucBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11BSSType.hashCode()
        result = 31 * result + this.dot11BSSID.contentHashCode()
        result = 31 * result + this.dot11ScanType.hashCode()
        result = 31 * result + this.bRestrictedScan.hashCode()
        result = 31 * result + this.udot11SSIDsOffset.hashCode()
        result = 31 * result + this.uNumOfdot11SSIDs.hashCode()
        result = 31 * result + this.bUseRequestIE.hashCode()
        result = 31 * result + this.uRequestIDsOffset.hashCode()
        result = 31 * result + this.uNumOfRequestIDs.hashCode()
        result = 31 * result + this.uPhyTypeInfosOffset.hashCode()
        result = 31 * result + this.uNumOfPhyTypeInfos.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        result = 31 * result + this.ucBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ScanRequestV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11ScanRequestV2> {
                override val sizeBytes: Long = 60L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11ScanRequestV2 =
                    Dot11ScanRequestV2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: Dot11ScanRequestV2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.dot11BSSType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 4L, value.dot11BSSID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.dot11ScanType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 16L, value.bRestrictedScan)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.udot11SSIDsOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.uNumOfdot11SSIDs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 28L, value.bUseRequestIE)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.uRequestIDsOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.uNumOfRequestIDs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.uPhyTypeInfosOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.uNumOfPhyTypeInfos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.uIEsOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.uIEsLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 56L, value.ucBuffer)
                }
            }
    }
}

public data class Dot11SecurityPacketHeader(
    public var peerMac: UByteArray = UByteArray(6),
    public var usEtherType: UShort = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SecurityPacketHeader) return false
        if (!this.peerMac.contentEquals(other.peerMac)) return false
        if (this.usEtherType != other.usEtherType) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.peerMac.contentHashCode()
        result = 31 * result + this.usEtherType.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11SecurityPacketHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11SecurityPacketHeader> {
                override val sizeBytes: Long = 9L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Dot11SecurityPacketHeader =
                    Dot11SecurityPacketHeader(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11SecurityPacketHeader) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.peerMac)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.usEtherType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.data)
                }
            }
    }
}

public class Dot11SendGoNegotiationConfirmationParameters internal constructor(
    public var header: NdisObjectHeader,
    public var peerDeviceAddress: UByteArray,
    public var dialogToken: UByte,
    responseContextCtorArg: MutPtr<CVoid>,
    public var uSendTimeout: UInt,
    public var status: UByte,
    public var groupCapability: UByte,
    public var groupID: Dot11WfdGroupId,
    public var bUseGroupID: Boolean,
    public var uIEsOffset: UInt,
    public var uIEsLength: UInt,
) {
    public var responseContext: MutPtr<CVoid> = responseContextCtorArg
        internal set

    public constructor() : this(
        header = NdisObjectHeader(),
        peerDeviceAddress = UByteArray(6),
        dialogToken = 0u,
        responseContextCtorArg = MutPtr(0L),
        uSendTimeout = 0u,
        status = 0u,
        groupCapability = 0u,
        groupID = Dot11WfdGroupId(),
        bUseGroupID = false,
        uIEsOffset = 0u,
        uIEsLength = 0u,
    )

    public operator fun component1(): NdisObjectHeader = this.header

    public operator fun component2(): UByteArray = this.peerDeviceAddress

    public operator fun component3(): UByte = this.dialogToken

    public operator fun component4(): MutPtr<CVoid> = this.responseContext

    public operator fun component5(): UInt = this.uSendTimeout

    public operator fun component6(): UByte = this.status

    public operator fun component7(): UByte = this.groupCapability

    public operator fun component8(): Dot11WfdGroupId = this.groupID

    public operator fun component9(): Boolean = this.bUseGroupID

    public operator fun component10(): UInt = this.uIEsOffset

    public operator fun component11(): UInt = this.uIEsLength

    public fun copy(header: NdisObjectHeader = this.header, peerDeviceAddress: UByteArray = this.peerDeviceAddress, dialogToken: UByte = this.dialogToken, responseContext: MutPtr<CVoid> = this.responseContext, uSendTimeout: UInt = this.uSendTimeout, status: UByte = this.status, groupCapability: UByte = this.groupCapability, groupID: Dot11WfdGroupId = this.groupID, bUseGroupID: Boolean = this.bUseGroupID, uIEsOffset: UInt = this.uIEsOffset, uIEsLength: UInt = this.uIEsLength): Dot11SendGoNegotiationConfirmationParameters = Dot11SendGoNegotiationConfirmationParameters(header = header, peerDeviceAddress = peerDeviceAddress, dialogToken = dialogToken, responseContextCtorArg = responseContext, uSendTimeout = uSendTimeout, status = status, groupCapability = groupCapability, groupID = groupID, bUseGroupID = bUseGroupID, uIEsOffset = uIEsOffset, uIEsLength = uIEsLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SendGoNegotiationConfirmationParameters) return false
        if (this.header != other.header) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.responseContext != other.responseContext) return false
        if (this.uSendTimeout != other.uSendTimeout) return false
        if (this.status != other.status) return false
        if (this.groupCapability != other.groupCapability) return false
        if (this.groupID != other.groupID) return false
        if (this.bUseGroupID != other.bUseGroupID) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.responseContext.hashCode()
        result = 31 * result + this.uSendTimeout.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.groupCapability.hashCode()
        result = 31 * result + this.groupID.hashCode()
        result = 31 * result + this.bUseGroupID.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            header: NdisObjectHeader = NdisObjectHeader(),
            peerDeviceAddress: UByteArray = UByteArray(6),
            dialogToken: UByte = 0u,
            responseContext: MutPtr<CVoid> = MutPtr(0L),
            uSendTimeout: UInt = 0u,
            status: UByte = 0u,
            groupCapability: UByte = 0u,
            groupID: Dot11WfdGroupId = Dot11WfdGroupId(),
            bUseGroupID: Boolean = false,
            uIEsOffset: UInt = 0u,
            uIEsLength: UInt = 0u,
        ): Dot11SendGoNegotiationConfirmationParameters =
            Dot11SendGoNegotiationConfirmationParameters(
                header = header,
                peerDeviceAddress = peerDeviceAddress,
                dialogToken = dialogToken,
                responseContextCtorArg = responseContext,
                uSendTimeout = uSendTimeout,
                status = status,
                groupCapability = groupCapability,
                groupID = groupID,
                bUseGroupID = bUseGroupID,
                uIEsOffset = uIEsOffset,
                uIEsLength = uIEsLength,
            )
    }
}

public data class Dot11SendGoNegotiationRequestParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var peerDeviceAddress: UByteArray = UByteArray(6),
    public var dialogToken: UByte = 0u,
    public var uSendTimeout: UInt = 0u,
    public var groupOwnerIntent: Dot11WfdGoIntent = Dot11WfdGoIntent(),
    public var minimumConfigTimeout: Dot11WfdConfigurationTimeout = Dot11WfdConfigurationTimeout(),
    public var intendedInterfaceAddress: UByteArray = UByteArray(6),
    public var groupCapability: UByte = 0u,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SendGoNegotiationRequestParameters) return false
        if (this.header != other.header) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.uSendTimeout != other.uSendTimeout) return false
        if (this.groupOwnerIntent != other.groupOwnerIntent) return false
        if (this.minimumConfigTimeout != other.minimumConfigTimeout) return false
        if (!this.intendedInterfaceAddress.contentEquals(other.intendedInterfaceAddress)) return false
        if (this.groupCapability != other.groupCapability) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.uSendTimeout.hashCode()
        result = 31 * result + this.groupOwnerIntent.hashCode()
        result = 31 * result + this.minimumConfigTimeout.hashCode()
        result = 31 * result + this.intendedInterfaceAddress.contentHashCode()
        result = 31 * result + this.groupCapability.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public class Dot11SendGoNegotiationResponseParameters internal constructor(
    public var header: NdisObjectHeader,
    public var peerDeviceAddress: UByteArray,
    public var dialogToken: UByte,
    requestContextCtorArg: MutPtr<CVoid>,
    public var uSendTimeout: UInt,
    public var status: UByte,
    public var groupOwnerIntent: Dot11WfdGoIntent,
    public var minimumConfigTimeout: Dot11WfdConfigurationTimeout,
    public var intendedInterfaceAddress: UByteArray,
    public var groupCapability: UByte,
    public var groupID: Dot11WfdGroupId,
    public var bUseGroupID: Boolean,
    public var uIEsOffset: UInt,
    public var uIEsLength: UInt,
) {
    public var requestContext: MutPtr<CVoid> = requestContextCtorArg
        internal set

    public constructor() : this(
        header = NdisObjectHeader(),
        peerDeviceAddress = UByteArray(6),
        dialogToken = 0u,
        requestContextCtorArg = MutPtr(0L),
        uSendTimeout = 0u,
        status = 0u,
        groupOwnerIntent = Dot11WfdGoIntent(),
        minimumConfigTimeout = Dot11WfdConfigurationTimeout(),
        intendedInterfaceAddress = UByteArray(6),
        groupCapability = 0u,
        groupID = Dot11WfdGroupId(),
        bUseGroupID = false,
        uIEsOffset = 0u,
        uIEsLength = 0u,
    )

    public operator fun component1(): NdisObjectHeader = this.header

    public operator fun component2(): UByteArray = this.peerDeviceAddress

    public operator fun component3(): UByte = this.dialogToken

    public operator fun component4(): MutPtr<CVoid> = this.requestContext

    public operator fun component5(): UInt = this.uSendTimeout

    public operator fun component6(): UByte = this.status

    public operator fun component7(): Dot11WfdGoIntent = this.groupOwnerIntent

    public operator fun component8(): Dot11WfdConfigurationTimeout = this.minimumConfigTimeout

    public operator fun component9(): UByteArray = this.intendedInterfaceAddress

    public operator fun component10(): UByte = this.groupCapability

    public operator fun component11(): Dot11WfdGroupId = this.groupID

    public operator fun component12(): Boolean = this.bUseGroupID

    public operator fun component13(): UInt = this.uIEsOffset

    public operator fun component14(): UInt = this.uIEsLength

    public fun copy(header: NdisObjectHeader = this.header, peerDeviceAddress: UByteArray = this.peerDeviceAddress, dialogToken: UByte = this.dialogToken, requestContext: MutPtr<CVoid> = this.requestContext, uSendTimeout: UInt = this.uSendTimeout, status: UByte = this.status, groupOwnerIntent: Dot11WfdGoIntent = this.groupOwnerIntent, minimumConfigTimeout: Dot11WfdConfigurationTimeout = this.minimumConfigTimeout, intendedInterfaceAddress: UByteArray = this.intendedInterfaceAddress, groupCapability: UByte = this.groupCapability, groupID: Dot11WfdGroupId = this.groupID, bUseGroupID: Boolean = this.bUseGroupID, uIEsOffset: UInt = this.uIEsOffset, uIEsLength: UInt = this.uIEsLength): Dot11SendGoNegotiationResponseParameters = Dot11SendGoNegotiationResponseParameters(header = header, peerDeviceAddress = peerDeviceAddress, dialogToken = dialogToken, requestContextCtorArg = requestContext, uSendTimeout = uSendTimeout, status = status, groupOwnerIntent = groupOwnerIntent, minimumConfigTimeout = minimumConfigTimeout, intendedInterfaceAddress = intendedInterfaceAddress, groupCapability = groupCapability, groupID = groupID, bUseGroupID = bUseGroupID, uIEsOffset = uIEsOffset, uIEsLength = uIEsLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SendGoNegotiationResponseParameters) return false
        if (this.header != other.header) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.requestContext != other.requestContext) return false
        if (this.uSendTimeout != other.uSendTimeout) return false
        if (this.status != other.status) return false
        if (this.groupOwnerIntent != other.groupOwnerIntent) return false
        if (this.minimumConfigTimeout != other.minimumConfigTimeout) return false
        if (!this.intendedInterfaceAddress.contentEquals(other.intendedInterfaceAddress)) return false
        if (this.groupCapability != other.groupCapability) return false
        if (this.groupID != other.groupID) return false
        if (this.bUseGroupID != other.bUseGroupID) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.requestContext.hashCode()
        result = 31 * result + this.uSendTimeout.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.groupOwnerIntent.hashCode()
        result = 31 * result + this.minimumConfigTimeout.hashCode()
        result = 31 * result + this.intendedInterfaceAddress.contentHashCode()
        result = 31 * result + this.groupCapability.hashCode()
        result = 31 * result + this.groupID.hashCode()
        result = 31 * result + this.bUseGroupID.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            header: NdisObjectHeader = NdisObjectHeader(),
            peerDeviceAddress: UByteArray = UByteArray(6),
            dialogToken: UByte = 0u,
            requestContext: MutPtr<CVoid> = MutPtr(0L),
            uSendTimeout: UInt = 0u,
            status: UByte = 0u,
            groupOwnerIntent: Dot11WfdGoIntent = Dot11WfdGoIntent(),
            minimumConfigTimeout: Dot11WfdConfigurationTimeout = Dot11WfdConfigurationTimeout(),
            intendedInterfaceAddress: UByteArray = UByteArray(6),
            groupCapability: UByte = 0u,
            groupID: Dot11WfdGroupId = Dot11WfdGroupId(),
            bUseGroupID: Boolean = false,
            uIEsOffset: UInt = 0u,
            uIEsLength: UInt = 0u,
        ): Dot11SendGoNegotiationResponseParameters =
            Dot11SendGoNegotiationResponseParameters(
                header = header,
                peerDeviceAddress = peerDeviceAddress,
                dialogToken = dialogToken,
                requestContextCtorArg = requestContext,
                uSendTimeout = uSendTimeout,
                status = status,
                groupOwnerIntent = groupOwnerIntent,
                minimumConfigTimeout = minimumConfigTimeout,
                intendedInterfaceAddress = intendedInterfaceAddress,
                groupCapability = groupCapability,
                groupID = groupID,
                bUseGroupID = bUseGroupID,
                uIEsOffset = uIEsOffset,
                uIEsLength = uIEsLength,
            )
    }
}

public data class Dot11SendInvitationRequestParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var dialogToken: UByte = 0u,
    public var peerDeviceAddress: UByteArray = UByteArray(6),
    public var uSendTimeout: UInt = 0u,
    public var minimumConfigTimeout: Dot11WfdConfigurationTimeout = Dot11WfdConfigurationTimeout(),
    public var invitationFlags: Dot11WfdInvitationFlags = Dot11WfdInvitationFlags(),
    public var groupBSSID: UByteArray = UByteArray(6),
    public var bUseGroupBSSID: Boolean = false,
    public var operatingChannel: Dot11WfdChannel = Dot11WfdChannel(),
    public var bUseSpecifiedOperatingChannel: Boolean = false,
    public var groupID: Dot11WfdGroupId = Dot11WfdGroupId(),
    public var bLocalGO: Boolean = false,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SendInvitationRequestParameters) return false
        if (this.header != other.header) return false
        if (this.dialogToken != other.dialogToken) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (this.uSendTimeout != other.uSendTimeout) return false
        if (this.minimumConfigTimeout != other.minimumConfigTimeout) return false
        if (this.invitationFlags != other.invitationFlags) return false
        if (!this.groupBSSID.contentEquals(other.groupBSSID)) return false
        if (this.bUseGroupBSSID != other.bUseGroupBSSID) return false
        if (this.operatingChannel != other.operatingChannel) return false
        if (this.bUseSpecifiedOperatingChannel != other.bUseSpecifiedOperatingChannel) return false
        if (this.groupID != other.groupID) return false
        if (this.bLocalGO != other.bLocalGO) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.uSendTimeout.hashCode()
        result = 31 * result + this.minimumConfigTimeout.hashCode()
        result = 31 * result + this.invitationFlags.hashCode()
        result = 31 * result + this.groupBSSID.contentHashCode()
        result = 31 * result + this.bUseGroupBSSID.hashCode()
        result = 31 * result + this.operatingChannel.hashCode()
        result = 31 * result + this.bUseSpecifiedOperatingChannel.hashCode()
        result = 31 * result + this.groupID.hashCode()
        result = 31 * result + this.bLocalGO.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public class Dot11SendInvitationResponseParameters internal constructor(
    public var header: NdisObjectHeader,
    public var receiverDeviceAddress: UByteArray,
    public var dialogToken: UByte,
    requestContextCtorArg: MutPtr<CVoid>,
    public var uSendTimeout: UInt,
    public var status: UByte,
    public var minimumConfigTimeout: Dot11WfdConfigurationTimeout,
    public var groupBSSID: UByteArray,
    public var bUseGroupBSSID: Boolean,
    public var operatingChannel: Dot11WfdChannel,
    public var bUseSpecifiedOperatingChannel: Boolean,
    public var uIEsOffset: UInt,
    public var uIEsLength: UInt,
) {
    public var requestContext: MutPtr<CVoid> = requestContextCtorArg
        internal set

    public constructor() : this(
        header = NdisObjectHeader(),
        receiverDeviceAddress = UByteArray(6),
        dialogToken = 0u,
        requestContextCtorArg = MutPtr(0L),
        uSendTimeout = 0u,
        status = 0u,
        minimumConfigTimeout = Dot11WfdConfigurationTimeout(),
        groupBSSID = UByteArray(6),
        bUseGroupBSSID = false,
        operatingChannel = Dot11WfdChannel(),
        bUseSpecifiedOperatingChannel = false,
        uIEsOffset = 0u,
        uIEsLength = 0u,
    )

    public operator fun component1(): NdisObjectHeader = this.header

    public operator fun component2(): UByteArray = this.receiverDeviceAddress

    public operator fun component3(): UByte = this.dialogToken

    public operator fun component4(): MutPtr<CVoid> = this.requestContext

    public operator fun component5(): UInt = this.uSendTimeout

    public operator fun component6(): UByte = this.status

    public operator fun component7(): Dot11WfdConfigurationTimeout = this.minimumConfigTimeout

    public operator fun component8(): UByteArray = this.groupBSSID

    public operator fun component9(): Boolean = this.bUseGroupBSSID

    public operator fun component10(): Dot11WfdChannel = this.operatingChannel

    public operator fun component11(): Boolean = this.bUseSpecifiedOperatingChannel

    public operator fun component12(): UInt = this.uIEsOffset

    public operator fun component13(): UInt = this.uIEsLength

    public fun copy(header: NdisObjectHeader = this.header, receiverDeviceAddress: UByteArray = this.receiverDeviceAddress, dialogToken: UByte = this.dialogToken, requestContext: MutPtr<CVoid> = this.requestContext, uSendTimeout: UInt = this.uSendTimeout, status: UByte = this.status, minimumConfigTimeout: Dot11WfdConfigurationTimeout = this.minimumConfigTimeout, groupBSSID: UByteArray = this.groupBSSID, bUseGroupBSSID: Boolean = this.bUseGroupBSSID, operatingChannel: Dot11WfdChannel = this.operatingChannel, bUseSpecifiedOperatingChannel: Boolean = this.bUseSpecifiedOperatingChannel, uIEsOffset: UInt = this.uIEsOffset, uIEsLength: UInt = this.uIEsLength): Dot11SendInvitationResponseParameters = Dot11SendInvitationResponseParameters(header = header, receiverDeviceAddress = receiverDeviceAddress, dialogToken = dialogToken, requestContextCtorArg = requestContext, uSendTimeout = uSendTimeout, status = status, minimumConfigTimeout = minimumConfigTimeout, groupBSSID = groupBSSID, bUseGroupBSSID = bUseGroupBSSID, operatingChannel = operatingChannel, bUseSpecifiedOperatingChannel = bUseSpecifiedOperatingChannel, uIEsOffset = uIEsOffset, uIEsLength = uIEsLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SendInvitationResponseParameters) return false
        if (this.header != other.header) return false
        if (!this.receiverDeviceAddress.contentEquals(other.receiverDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.requestContext != other.requestContext) return false
        if (this.uSendTimeout != other.uSendTimeout) return false
        if (this.status != other.status) return false
        if (this.minimumConfigTimeout != other.minimumConfigTimeout) return false
        if (!this.groupBSSID.contentEquals(other.groupBSSID)) return false
        if (this.bUseGroupBSSID != other.bUseGroupBSSID) return false
        if (this.operatingChannel != other.operatingChannel) return false
        if (this.bUseSpecifiedOperatingChannel != other.bUseSpecifiedOperatingChannel) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.receiverDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.requestContext.hashCode()
        result = 31 * result + this.uSendTimeout.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.minimumConfigTimeout.hashCode()
        result = 31 * result + this.groupBSSID.contentHashCode()
        result = 31 * result + this.bUseGroupBSSID.hashCode()
        result = 31 * result + this.operatingChannel.hashCode()
        result = 31 * result + this.bUseSpecifiedOperatingChannel.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            header: NdisObjectHeader = NdisObjectHeader(),
            receiverDeviceAddress: UByteArray = UByteArray(6),
            dialogToken: UByte = 0u,
            requestContext: MutPtr<CVoid> = MutPtr(0L),
            uSendTimeout: UInt = 0u,
            status: UByte = 0u,
            minimumConfigTimeout: Dot11WfdConfigurationTimeout = Dot11WfdConfigurationTimeout(),
            groupBSSID: UByteArray = UByteArray(6),
            bUseGroupBSSID: Boolean = false,
            operatingChannel: Dot11WfdChannel = Dot11WfdChannel(),
            bUseSpecifiedOperatingChannel: Boolean = false,
            uIEsOffset: UInt = 0u,
            uIEsLength: UInt = 0u,
        ): Dot11SendInvitationResponseParameters =
            Dot11SendInvitationResponseParameters(
                header = header,
                receiverDeviceAddress = receiverDeviceAddress,
                dialogToken = dialogToken,
                requestContextCtorArg = requestContext,
                uSendTimeout = uSendTimeout,
                status = status,
                minimumConfigTimeout = minimumConfigTimeout,
                groupBSSID = groupBSSID,
                bUseGroupBSSID = bUseGroupBSSID,
                operatingChannel = operatingChannel,
                bUseSpecifiedOperatingChannel = bUseSpecifiedOperatingChannel,
                uIEsOffset = uIEsOffset,
                uIEsLength = uIEsLength,
            )
    }
}

public data class Dot11SendProvisionDiscoveryRequestParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var dialogToken: UByte = 0u,
    public var peerDeviceAddress: UByteArray = UByteArray(6),
    public var uSendTimeout: UInt = 0u,
    public var groupCapability: UByte = 0u,
    public var groupID: Dot11WfdGroupId = Dot11WfdGroupId(),
    public var bUseGroupID: Boolean = false,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SendProvisionDiscoveryRequestParameters) return false
        if (this.header != other.header) return false
        if (this.dialogToken != other.dialogToken) return false
        if (!this.peerDeviceAddress.contentEquals(other.peerDeviceAddress)) return false
        if (this.uSendTimeout != other.uSendTimeout) return false
        if (this.groupCapability != other.groupCapability) return false
        if (this.groupID != other.groupID) return false
        if (this.bUseGroupID != other.bUseGroupID) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.peerDeviceAddress.contentHashCode()
        result = 31 * result + this.uSendTimeout.hashCode()
        result = 31 * result + this.groupCapability.hashCode()
        result = 31 * result + this.groupID.hashCode()
        result = 31 * result + this.bUseGroupID.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }
}

public class Dot11SendProvisionDiscoveryResponseParameters internal constructor(
    public var header: NdisObjectHeader,
    public var receiverDeviceAddress: UByteArray,
    public var dialogToken: UByte,
    requestContextCtorArg: MutPtr<CVoid>,
    public var uSendTimeout: UInt,
    public var uIEsOffset: UInt,
    public var uIEsLength: UInt,
) {
    public var requestContext: MutPtr<CVoid> = requestContextCtorArg
        internal set

    public constructor() : this(
        header = NdisObjectHeader(),
        receiverDeviceAddress = UByteArray(6),
        dialogToken = 0u,
        requestContextCtorArg = MutPtr(0L),
        uSendTimeout = 0u,
        uIEsOffset = 0u,
        uIEsLength = 0u,
    )

    public operator fun component1(): NdisObjectHeader = this.header

    public operator fun component2(): UByteArray = this.receiverDeviceAddress

    public operator fun component3(): UByte = this.dialogToken

    public operator fun component4(): MutPtr<CVoid> = this.requestContext

    public operator fun component5(): UInt = this.uSendTimeout

    public operator fun component6(): UInt = this.uIEsOffset

    public operator fun component7(): UInt = this.uIEsLength

    public fun copy(header: NdisObjectHeader = this.header, receiverDeviceAddress: UByteArray = this.receiverDeviceAddress, dialogToken: UByte = this.dialogToken, requestContext: MutPtr<CVoid> = this.requestContext, uSendTimeout: UInt = this.uSendTimeout, uIEsOffset: UInt = this.uIEsOffset, uIEsLength: UInt = this.uIEsLength): Dot11SendProvisionDiscoveryResponseParameters = Dot11SendProvisionDiscoveryResponseParameters(header = header, receiverDeviceAddress = receiverDeviceAddress, dialogToken = dialogToken, requestContextCtorArg = requestContext, uSendTimeout = uSendTimeout, uIEsOffset = uIEsOffset, uIEsLength = uIEsLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SendProvisionDiscoveryResponseParameters) return false
        if (this.header != other.header) return false
        if (!this.receiverDeviceAddress.contentEquals(other.receiverDeviceAddress)) return false
        if (this.dialogToken != other.dialogToken) return false
        if (this.requestContext != other.requestContext) return false
        if (this.uSendTimeout != other.uSendTimeout) return false
        if (this.uIEsOffset != other.uIEsOffset) return false
        if (this.uIEsLength != other.uIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.receiverDeviceAddress.contentHashCode()
        result = 31 * result + this.dialogToken.hashCode()
        result = 31 * result + this.requestContext.hashCode()
        result = 31 * result + this.uSendTimeout.hashCode()
        result = 31 * result + this.uIEsOffset.hashCode()
        result = 31 * result + this.uIEsLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            header: NdisObjectHeader = NdisObjectHeader(),
            receiverDeviceAddress: UByteArray = UByteArray(6),
            dialogToken: UByte = 0u,
            requestContext: MutPtr<CVoid> = MutPtr(0L),
            uSendTimeout: UInt = 0u,
            uIEsOffset: UInt = 0u,
            uIEsLength: UInt = 0u,
        ): Dot11SendProvisionDiscoveryResponseParameters =
            Dot11SendProvisionDiscoveryResponseParameters(
                header = header,
                receiverDeviceAddress = receiverDeviceAddress,
                dialogToken = dialogToken,
                requestContextCtorArg = requestContext,
                uSendTimeout = uSendTimeout,
                uIEsOffset = uIEsOffset,
                uIEsLength = uIEsLength,
            )
    }
}

public data class Dot11Ssid(
    public var uSSIDLength: UInt = 0u,
    public var ucSSID: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11Ssid) return false
        if (this.uSSIDLength != other.uSSIDLength) return false
        if (!this.ucSSID.contentEquals(other.ucSSID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uSSIDLength.hashCode()
        result = 31 * result + this.ucSSID.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11Ssid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11Ssid> {
                override val sizeBytes: Long = 36L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11Ssid =
                    Dot11Ssid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11Ssid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uSSIDLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 4L, value.ucSSID)
                }
            }
    }
}

public data class Dot11SsidList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var sSIDs: List<Dot11Ssid> = List(1) { Dot11Ssid() },
)

public data class Dot11StartRequest(
    public var uStartFailureTimeout: UInt = 0u,
    public var operationalRateSet: Dot11RateSet = Dot11RateSet(),
    public var uChCenterFrequency: UInt = 0u,
    public var dot11BSSDescription: Dot11BssDescription = Dot11BssDescription(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11StartRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11StartRequest> {
                override val sizeBytes: Long = 192L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dot11StartRequest =
                    Dot11StartRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (Dot11RateSet.typeLayout()).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (Dot11BssDescription.typeLayout()).readNative(addr + 144L),
                    )
                override fun writeNative(addr: Long, value: Dot11StartRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uStartFailureTimeout)
                    (Dot11RateSet.typeLayout()).writeNative(addr + 4L, value.operationalRateSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.uChCenterFrequency)
                    (Dot11BssDescription.typeLayout()).writeNative(addr + 144L, value.dot11BSSDescription)
                }
            }
    }
}

public data class Dot11Statistics(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var ullFourWayHandshakeFailures: ULong = 0uL,
    public var ullTKIPCounterMeasuresInvoked: ULong = 0uL,
    public var ullReserved: ULong = 0uL,
    public var macUcastCounters: Dot11MacFrameStatistics = Dot11MacFrameStatistics(),
    public var macMcastCounters: Dot11MacFrameStatistics = Dot11MacFrameStatistics(),
    public var phyCounters: List<Dot11PhyFrameStatistics> = List(1) { Dot11PhyFrameStatistics() },
)

public data class Dot11StatusIndication(
    public var uStatusType: UInt = 0u,
    public var ndisStatus: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11StatusIndication> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11StatusIndication> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11StatusIndication =
                    Dot11StatusIndication(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11StatusIndication) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uStatusType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.ndisStatus)
                }
            }
    }
}

public data class Dot11StopApParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var ulReason: UInt = 0u,
)

public data class Dot11SupportedAntenna(
    public var uAntennaListIndex: UInt = 0u,
    public var bSupportedAntenna: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11SupportedAntenna> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11SupportedAntenna> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11SupportedAntenna =
                    Dot11SupportedAntenna(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11SupportedAntenna) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uAntennaListIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.bSupportedAntenna)
                }
            }
    }
}

public data class Dot11SupportedAntennaList(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11SupportedAntenna: List<Dot11SupportedAntenna> = List(1) { Dot11SupportedAntenna() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11SupportedAntennaList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11SupportedAntennaList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11SupportedAntennaList =
                    Dot11SupportedAntennaList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Dot11SupportedAntenna.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11SupportedAntennaList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uNumOfEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uTotalNumOfEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Dot11SupportedAntenna.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.dot11SupportedAntenna)
                }
            }
    }
}

public data class Dot11SupportedDataRatesValue(
    public var ucSupportedTxDataRatesValue: UByteArray = UByteArray(8),
    public var ucSupportedRxDataRatesValue: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SupportedDataRatesValue) return false
        if (!this.ucSupportedTxDataRatesValue.contentEquals(other.ucSupportedTxDataRatesValue)) return false
        if (!this.ucSupportedRxDataRatesValue.contentEquals(other.ucSupportedRxDataRatesValue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucSupportedTxDataRatesValue.contentHashCode()
        result = 31 * result + this.ucSupportedRxDataRatesValue.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11SupportedDataRatesValue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11SupportedDataRatesValue> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Dot11SupportedDataRatesValue =
                    Dot11SupportedDataRatesValue(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11SupportedDataRatesValue) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr, value.ucSupportedTxDataRatesValue)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 8L, value.ucSupportedRxDataRatesValue)
                }
            }
    }
}

public data class Dot11SupportedDataRatesValueV2(
    public var ucSupportedTxDataRatesValue: UByteArray = UByteArray(255),
    public var ucSupportedRxDataRatesValue: UByteArray = UByteArray(255),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SupportedDataRatesValueV2) return false
        if (!this.ucSupportedTxDataRatesValue.contentEquals(other.ucSupportedTxDataRatesValue)) return false
        if (!this.ucSupportedRxDataRatesValue.contentEquals(other.ucSupportedRxDataRatesValue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucSupportedTxDataRatesValue.contentHashCode()
        result = 31 * result + this.ucSupportedRxDataRatesValue.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11SupportedDataRatesValueV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11SupportedDataRatesValueV2> {
                override val sizeBytes: Long = 510L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Dot11SupportedDataRatesValueV2 =
                    Dot11SupportedDataRatesValueV2(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (255).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (255).toInt())
                        ).readNative(addr + 255L),
                    )
                override fun writeNative(addr: Long, value: Dot11SupportedDataRatesValueV2) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (255).toInt())
                    ).writeNative(addr, value.ucSupportedTxDataRatesValue)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (255).toInt())
                    ).writeNative(addr + 255L, value.ucSupportedRxDataRatesValue)
                }
            }
    }
}

public data class Dot11SupportedDsssChannel(
    public var uChannel: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11SupportedDsssChannel> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11SupportedDsssChannel> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11SupportedDsssChannel =
                    Dot11SupportedDsssChannel(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Dot11SupportedDsssChannel) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uChannel)
                }
            }
    }
}

public data class Dot11SupportedDsssChannelList(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11SupportedDSSSChannel: List<Dot11SupportedDsssChannel> = List(1) { Dot11SupportedDsssChannel() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11SupportedDsssChannelList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11SupportedDsssChannelList> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11SupportedDsssChannelList =
                    Dot11SupportedDsssChannelList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Dot11SupportedDsssChannel.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11SupportedDsssChannelList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uNumOfEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uTotalNumOfEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Dot11SupportedDsssChannel.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.dot11SupportedDSSSChannel)
                }
            }
    }
}

public data class Dot11SupportedOfdmFrequency(
    public var uCenterFrequency: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11SupportedOfdmFrequency> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11SupportedOfdmFrequency> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11SupportedOfdmFrequency =
                    Dot11SupportedOfdmFrequency(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Dot11SupportedOfdmFrequency) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uCenterFrequency)
                }
            }
    }
}

public data class Dot11SupportedOfdmFrequencyList(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11SupportedOFDMFrequency: List<Dot11SupportedOfdmFrequency> = List(1) { Dot11SupportedOfdmFrequency() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11SupportedOfdmFrequencyList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11SupportedOfdmFrequencyList> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11SupportedOfdmFrequencyList =
                    Dot11SupportedOfdmFrequencyList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Dot11SupportedOfdmFrequency.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11SupportedOfdmFrequencyList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uNumOfEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uTotalNumOfEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Dot11SupportedOfdmFrequency.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.dot11SupportedOFDMFrequency)
                }
            }
    }
}

public data class Dot11SupportedPhyTypes(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11PHYType: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SupportedPhyTypes) return false
        if (this.uNumOfEntries != other.uNumOfEntries) return false
        if (this.uTotalNumOfEntries != other.uTotalNumOfEntries) return false
        if (!this.dot11PHYType.contentEquals(other.dot11PHYType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uNumOfEntries.hashCode()
        result = 31 * result + this.uTotalNumOfEntries.hashCode()
        result = 31 * result + this.dot11PHYType.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11SupportedPhyTypes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11SupportedPhyTypes> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11SupportedPhyTypes =
                    Dot11SupportedPhyTypes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11SupportedPhyTypes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uNumOfEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uTotalNumOfEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (1).toInt())
                    ).writeNative(addr + 8L, value.dot11PHYType)
                }
            }
    }
}

public data class Dot11SupportedPowerLevels(
    public var uNumOfSupportedPowerLevels: UInt = 0u,
    public var uTxPowerLevelValues: UIntArray = UIntArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11SupportedPowerLevels) return false
        if (this.uNumOfSupportedPowerLevels != other.uNumOfSupportedPowerLevels) return false
        if (!this.uTxPowerLevelValues.contentEquals(other.uTxPowerLevelValues)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uNumOfSupportedPowerLevels.hashCode()
        result = 31 * result + this.uTxPowerLevelValues.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11SupportedPowerLevels> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11SupportedPowerLevels> {
                override val sizeBytes: Long = 36L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11SupportedPowerLevels =
                    Dot11SupportedPowerLevels(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (8).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11SupportedPowerLevels) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uNumOfSupportedPowerLevels)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (8).toInt())
                    ).writeNative(addr + 4L, value.uTxPowerLevelValues)
                }
            }
    }
}

public data class Dot11TkipmicFailureParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var bDefaultKeyFailure: Boolean = false,
    public var uKeyIndex: UInt = 0u,
    public var peerMac: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11TkipmicFailureParameters) return false
        if (this.header != other.header) return false
        if (this.bDefaultKeyFailure != other.bDefaultKeyFailure) return false
        if (this.uKeyIndex != other.uKeyIndex) return false
        if (!this.peerMac.contentEquals(other.peerMac)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.bDefaultKeyFailure.hashCode()
        result = 31 * result + this.uKeyIndex.hashCode()
        result = 31 * result + this.peerMac.contentHashCode()
        return result
    }
}

public data class Dot11UpdateIe(
    public var dot11UpdateIEOp: Dot11UpdateIeOp = 0,
    public var uBufferLength: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11UpdateIe) return false
        if (this.dot11UpdateIEOp != other.dot11UpdateIEOp) return false
        if (this.uBufferLength != other.uBufferLength) return false
        if (!this.ucBuffer.contentEquals(other.ucBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11UpdateIEOp.hashCode()
        result = 31 * result + this.uBufferLength.hashCode()
        result = 31 * result + this.ucBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11UpdateIe> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11UpdateIe> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11UpdateIe =
                    Dot11UpdateIe(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11UpdateIe) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.dot11UpdateIEOp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uBufferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.ucBuffer)
                }
            }
    }
}

public data class Dot11Venueinfo(
    public var venueGroup: UByte = 0u,
    public var venueType: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11Venueinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11Venueinfo> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Dot11Venueinfo =
                    Dot11Venueinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: Dot11Venueinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.venueGroup)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.venueType)
                }
            }
    }
}

public data class Dot11VwifiAttributes(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uTotalNumOfEntries: UInt = 0u,
    public var combinations: List<Dot11VwifiCombination> = List(1) { Dot11VwifiCombination() },
)

public data class Dot11VwifiCombination(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumInfrastructure: UInt = 0u,
    public var uNumAdhoc: UInt = 0u,
    public var uNumSoftAP: UInt = 0u,
)

public data class Dot11VwifiCombinationV2(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumInfrastructure: UInt = 0u,
    public var uNumAdhoc: UInt = 0u,
    public var uNumSoftAP: UInt = 0u,
    public var uNumVirtualStation: UInt = 0u,
)

public data class Dot11VwifiCombinationV3(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumInfrastructure: UInt = 0u,
    public var uNumAdhoc: UInt = 0u,
    public var uNumSoftAP: UInt = 0u,
    public var uNumVirtualStation: UInt = 0u,
    public var uNumWFDGroup: UInt = 0u,
)

public class Dot11WepOffload internal constructor(
    public var uReserved: UInt,
    hOffloadContextCtorArg: Handle,
    hOffloadCtorArg: Handle,
    public var dot11OffloadType: Dot11OffloadType,
    public var dwAlgorithm: UInt,
    public var bRowIsOutbound: Boolean,
    public var bUseDefault: Boolean,
    public var uFlags: UInt,
    public var ucMacAddress: UByteArray,
    public var uNumOfRWsOnPeer: UInt,
    public var uNumOfRWsOnMe: UInt,
    public var dot11IV48Counters: List<Dot11Iv48Counter>,
    public var usDot11RWBitMaps: UShortArray,
    public var usKeyLength: UShort,
    public var ucKey: UByteArray,
) {
    public var hOffloadContext: Handle = hOffloadContextCtorArg
        internal set

    public var hOffload: Handle = hOffloadCtorArg
        internal set

    public constructor() : this(
        uReserved = 0u,
        hOffloadContextCtorArg = MutPtr(0L),
        hOffloadCtorArg = MutPtr(0L),
        dot11OffloadType = 0,
        dwAlgorithm = 0u,
        bRowIsOutbound = false,
        bUseDefault = false,
        uFlags = 0u,
        ucMacAddress = UByteArray(6),
        uNumOfRWsOnPeer = 0u,
        uNumOfRWsOnMe = 0u,
        dot11IV48Counters = List(16) { Dot11Iv48Counter() },
        usDot11RWBitMaps = UShortArray(16),
        usKeyLength = 0u,
        ucKey = UByteArray(1),
    )

    public operator fun component1(): UInt = this.uReserved

    public operator fun component2(): Handle = this.hOffloadContext

    public operator fun component3(): Handle = this.hOffload

    public operator fun component4(): Dot11OffloadType = this.dot11OffloadType

    public operator fun component5(): UInt = this.dwAlgorithm

    public operator fun component6(): Boolean = this.bRowIsOutbound

    public operator fun component7(): Boolean = this.bUseDefault

    public operator fun component8(): UInt = this.uFlags

    public operator fun component9(): UByteArray = this.ucMacAddress

    public operator fun component10(): UInt = this.uNumOfRWsOnPeer

    public operator fun component11(): UInt = this.uNumOfRWsOnMe

    public operator fun component12(): List<Dot11Iv48Counter> = this.dot11IV48Counters

    public operator fun component13(): UShortArray = this.usDot11RWBitMaps

    public operator fun component14(): UShort = this.usKeyLength

    public operator fun component15(): UByteArray = this.ucKey

    public fun copy(uReserved: UInt = this.uReserved, hOffloadContext: Handle = this.hOffloadContext, hOffload: Handle = this.hOffload, dot11OffloadType: Dot11OffloadType = this.dot11OffloadType, dwAlgorithm: UInt = this.dwAlgorithm, bRowIsOutbound: Boolean = this.bRowIsOutbound, bUseDefault: Boolean = this.bUseDefault, uFlags: UInt = this.uFlags, ucMacAddress: UByteArray = this.ucMacAddress, uNumOfRWsOnPeer: UInt = this.uNumOfRWsOnPeer, uNumOfRWsOnMe: UInt = this.uNumOfRWsOnMe, dot11IV48Counters: List<Dot11Iv48Counter> = this.dot11IV48Counters, usDot11RWBitMaps: UShortArray = this.usDot11RWBitMaps, usKeyLength: UShort = this.usKeyLength, ucKey: UByteArray = this.ucKey): Dot11WepOffload = Dot11WepOffload(uReserved = uReserved, hOffloadContextCtorArg = hOffloadContext, hOffloadCtorArg = hOffload, dot11OffloadType = dot11OffloadType, dwAlgorithm = dwAlgorithm, bRowIsOutbound = bRowIsOutbound, bUseDefault = bUseDefault, uFlags = uFlags, ucMacAddress = ucMacAddress, uNumOfRWsOnPeer = uNumOfRWsOnPeer, uNumOfRWsOnMe = uNumOfRWsOnMe, dot11IV48Counters = dot11IV48Counters, usDot11RWBitMaps = usDot11RWBitMaps, usKeyLength = usKeyLength, ucKey = ucKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WepOffload) return false
        if (this.uReserved != other.uReserved) return false
        if (this.hOffloadContext != other.hOffloadContext) return false
        if (this.hOffload != other.hOffload) return false
        if (this.dot11OffloadType != other.dot11OffloadType) return false
        if (this.dwAlgorithm != other.dwAlgorithm) return false
        if (this.bRowIsOutbound != other.bRowIsOutbound) return false
        if (this.bUseDefault != other.bUseDefault) return false
        if (this.uFlags != other.uFlags) return false
        if (!this.ucMacAddress.contentEquals(other.ucMacAddress)) return false
        if (this.uNumOfRWsOnPeer != other.uNumOfRWsOnPeer) return false
        if (this.uNumOfRWsOnMe != other.uNumOfRWsOnMe) return false
        if (this.dot11IV48Counters != other.dot11IV48Counters) return false
        if (!this.usDot11RWBitMaps.contentEquals(other.usDot11RWBitMaps)) return false
        if (this.usKeyLength != other.usKeyLength) return false
        if (!this.ucKey.contentEquals(other.ucKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uReserved.hashCode()
        result = 31 * result + this.hOffloadContext.hashCode()
        result = 31 * result + this.hOffload.hashCode()
        result = 31 * result + this.dot11OffloadType.hashCode()
        result = 31 * result + this.dwAlgorithm.hashCode()
        result = 31 * result + this.bRowIsOutbound.hashCode()
        result = 31 * result + this.bUseDefault.hashCode()
        result = 31 * result + this.uFlags.hashCode()
        result = 31 * result + this.ucMacAddress.contentHashCode()
        result = 31 * result + this.uNumOfRWsOnPeer.hashCode()
        result = 31 * result + this.uNumOfRWsOnMe.hashCode()
        result = 31 * result + this.dot11IV48Counters.hashCode()
        result = 31 * result + this.usDot11RWBitMaps.contentHashCode()
        result = 31 * result + this.usKeyLength.hashCode()
        result = 31 * result + this.ucKey.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uReserved: UInt = 0u,
            hOffloadContext: Handle = MutPtr(0L),
            hOffload: Handle = MutPtr(0L),
            dot11OffloadType: Dot11OffloadType = 0,
            dwAlgorithm: UInt = 0u,
            bRowIsOutbound: Boolean = false,
            bUseDefault: Boolean = false,
            uFlags: UInt = 0u,
            ucMacAddress: UByteArray = UByteArray(6),
            uNumOfRWsOnPeer: UInt = 0u,
            uNumOfRWsOnMe: UInt = 0u,
            dot11IV48Counters: List<Dot11Iv48Counter> = List(16) { Dot11Iv48Counter() },
            usDot11RWBitMaps: UShortArray = UShortArray(16),
            usKeyLength: UShort = 0u,
            ucKey: UByteArray = UByteArray(1),
        ): Dot11WepOffload =
            Dot11WepOffload(
                uReserved = uReserved,
                hOffloadContextCtorArg = hOffloadContext,
                hOffloadCtorArg = hOffload,
                dot11OffloadType = dot11OffloadType,
                dwAlgorithm = dwAlgorithm,
                bRowIsOutbound = bRowIsOutbound,
                bUseDefault = bUseDefault,
                uFlags = uFlags,
                ucMacAddress = ucMacAddress,
                uNumOfRWsOnPeer = uNumOfRWsOnPeer,
                uNumOfRWsOnMe = uNumOfRWsOnMe,
                dot11IV48Counters = dot11IV48Counters,
                usDot11RWBitMaps = usDot11RWBitMaps,
                usKeyLength = usKeyLength,
                ucKey = ucKey,
            )
    }
}

public class Dot11WepUpload internal constructor(
    public var uReserved: UInt,
    public var dot11OffloadType: Dot11OffloadType,
    hOffloadCtorArg: Handle,
    public var uNumOfRWsUsed: UInt,
    public var dot11IV48Counters: List<Dot11Iv48Counter>,
    public var usDot11RWBitMaps: UShortArray,
) {
    public var hOffload: Handle = hOffloadCtorArg
        internal set

    public constructor() : this(
        uReserved = 0u,
        dot11OffloadType = 0,
        hOffloadCtorArg = MutPtr(0L),
        uNumOfRWsUsed = 0u,
        dot11IV48Counters = List(16) { Dot11Iv48Counter() },
        usDot11RWBitMaps = UShortArray(16),
    )

    public operator fun component1(): UInt = this.uReserved

    public operator fun component2(): Dot11OffloadType = this.dot11OffloadType

    public operator fun component3(): Handle = this.hOffload

    public operator fun component4(): UInt = this.uNumOfRWsUsed

    public operator fun component5(): List<Dot11Iv48Counter> = this.dot11IV48Counters

    public operator fun component6(): UShortArray = this.usDot11RWBitMaps

    public fun copy(uReserved: UInt = this.uReserved, dot11OffloadType: Dot11OffloadType = this.dot11OffloadType, hOffload: Handle = this.hOffload, uNumOfRWsUsed: UInt = this.uNumOfRWsUsed, dot11IV48Counters: List<Dot11Iv48Counter> = this.dot11IV48Counters, usDot11RWBitMaps: UShortArray = this.usDot11RWBitMaps): Dot11WepUpload = Dot11WepUpload(uReserved = uReserved, dot11OffloadType = dot11OffloadType, hOffloadCtorArg = hOffload, uNumOfRWsUsed = uNumOfRWsUsed, dot11IV48Counters = dot11IV48Counters, usDot11RWBitMaps = usDot11RWBitMaps)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WepUpload) return false
        if (this.uReserved != other.uReserved) return false
        if (this.dot11OffloadType != other.dot11OffloadType) return false
        if (this.hOffload != other.hOffload) return false
        if (this.uNumOfRWsUsed != other.uNumOfRWsUsed) return false
        if (this.dot11IV48Counters != other.dot11IV48Counters) return false
        if (!this.usDot11RWBitMaps.contentEquals(other.usDot11RWBitMaps)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uReserved.hashCode()
        result = 31 * result + this.dot11OffloadType.hashCode()
        result = 31 * result + this.hOffload.hashCode()
        result = 31 * result + this.uNumOfRWsUsed.hashCode()
        result = 31 * result + this.dot11IV48Counters.hashCode()
        result = 31 * result + this.usDot11RWBitMaps.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uReserved: UInt = 0u,
            dot11OffloadType: Dot11OffloadType = 0,
            hOffload: Handle = MutPtr(0L),
            uNumOfRWsUsed: UInt = 0u,
            dot11IV48Counters: List<Dot11Iv48Counter> = List(16) { Dot11Iv48Counter() },
            usDot11RWBitMaps: UShortArray = UShortArray(16),
        ): Dot11WepUpload =
            Dot11WepUpload(
                uReserved = uReserved,
                dot11OffloadType = dot11OffloadType,
                hOffloadCtorArg = hOffload,
                uNumOfRWsUsed = uNumOfRWsUsed,
                dot11IV48Counters = dot11IV48Counters,
                usDot11RWBitMaps = usDot11RWBitMaps,
            )
    }
}

public data class Dot11WfdAdditionalIe(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uBeaconIEsOffset: UInt = 0u,
    public var uBeaconIEsLength: UInt = 0u,
    public var uProbeResponseIEsOffset: UInt = 0u,
    public var uProbeResponseIEsLength: UInt = 0u,
    public var uDefaultRequestIEsOffset: UInt = 0u,
    public var uDefaultRequestIEsLength: UInt = 0u,
)

public data class Dot11WfdAdvertisedServiceDescriptor(
    public var advertisementID: UInt = 0u,
    public var configMethods: UShort = 0u,
    public var serviceNameLength: UByte = 0u,
    public var serviceName: UByteArray = UByteArray(255),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdAdvertisedServiceDescriptor) return false
        if (this.advertisementID != other.advertisementID) return false
        if (this.configMethods != other.configMethods) return false
        if (this.serviceNameLength != other.serviceNameLength) return false
        if (!this.serviceName.contentEquals(other.serviceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.advertisementID.hashCode()
        result = 31 * result + this.configMethods.hashCode()
        result = 31 * result + this.serviceNameLength.hashCode()
        result = 31 * result + this.serviceName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdAdvertisedServiceDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdAdvertisedServiceDescriptor> {
                override val sizeBytes: Long = 264L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11WfdAdvertisedServiceDescriptor =
                    Dot11WfdAdvertisedServiceDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (255).toInt())
                        ).readNative(addr + 7L),
                    )
                override fun writeNative(addr: Long, value: Dot11WfdAdvertisedServiceDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.advertisementID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.configMethods)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.serviceNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (255).toInt())
                    ).writeNative(addr + 7L, value.serviceName)
                }
            }
    }
}

public data class Dot11WfdAdvertisedServiceList(
    public var serviceCount: UShort = 0u,
    public var advertisedService: List<Dot11WfdAdvertisedServiceDescriptor> = List(1) { Dot11WfdAdvertisedServiceDescriptor() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdAdvertisedServiceList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdAdvertisedServiceList> {
                override val sizeBytes: Long = 268L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11WfdAdvertisedServiceList =
                    Dot11WfdAdvertisedServiceList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Dot11WfdAdvertisedServiceDescriptor.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11WfdAdvertisedServiceList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.serviceCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Dot11WfdAdvertisedServiceDescriptor.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.advertisedService)
                }
            }
    }
}

public data class Dot11WfdAdvertisementId(
    public var advertisementID: UInt = 0u,
    public var serviceAddress: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdAdvertisementId) return false
        if (this.advertisementID != other.advertisementID) return false
        if (!this.serviceAddress.contentEquals(other.serviceAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.advertisementID.hashCode()
        result = 31 * result + this.serviceAddress.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdAdvertisementId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdAdvertisementId> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11WfdAdvertisementId =
                    Dot11WfdAdvertisementId(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11WfdAdvertisementId) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.advertisementID)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 4L, value.serviceAddress)
                }
            }
    }
}

public class Dot11WfdAttributes internal constructor(
    public var header: NdisObjectHeader,
    public var uNumConcurrentGORole: UInt,
    public var uNumConcurrentClientRole: UInt,
    public var wPSVersionsSupported: UInt,
    public var bServiceDiscoverySupported: Boolean,
    public var bClientDiscoverabilitySupported: Boolean,
    public var bInfrastructureManagementSupported: Boolean,
    public var uMaxSecondaryDeviceTypeListSize: UInt,
    public var deviceAddress: UByteArray,
    public var uInterfaceAddressListCount: UInt,
    pInterfaceAddressListCtorArg: MutPtr<UByte>,
    public var uNumSupportedCountryOrRegionStrings: UInt,
    pSupportedCountryOrRegionStringsCtorArg: MutPtr<UByte>,
    public var uDiscoveryFilterListSize: UInt,
    public var uGORoleClientTableSize: UInt,
) {
    public var pInterfaceAddressList: MutPtr<UByte> = pInterfaceAddressListCtorArg
        internal set

    public var pSupportedCountryOrRegionStrings: MutPtr<UByte> = pSupportedCountryOrRegionStringsCtorArg
        internal set

    public constructor() : this(
        header = NdisObjectHeader(),
        uNumConcurrentGORole = 0u,
        uNumConcurrentClientRole = 0u,
        wPSVersionsSupported = 0u,
        bServiceDiscoverySupported = false,
        bClientDiscoverabilitySupported = false,
        bInfrastructureManagementSupported = false,
        uMaxSecondaryDeviceTypeListSize = 0u,
        deviceAddress = UByteArray(6),
        uInterfaceAddressListCount = 0u,
        pInterfaceAddressListCtorArg = MutPtr(0L),
        uNumSupportedCountryOrRegionStrings = 0u,
        pSupportedCountryOrRegionStringsCtorArg = MutPtr(0L),
        uDiscoveryFilterListSize = 0u,
        uGORoleClientTableSize = 0u,
    )

    public operator fun component1(): NdisObjectHeader = this.header

    public operator fun component2(): UInt = this.uNumConcurrentGORole

    public operator fun component3(): UInt = this.uNumConcurrentClientRole

    public operator fun component4(): UInt = this.wPSVersionsSupported

    public operator fun component5(): Boolean = this.bServiceDiscoverySupported

    public operator fun component6(): Boolean = this.bClientDiscoverabilitySupported

    public operator fun component7(): Boolean = this.bInfrastructureManagementSupported

    public operator fun component8(): UInt = this.uMaxSecondaryDeviceTypeListSize

    public operator fun component9(): UByteArray = this.deviceAddress

    public operator fun component10(): UInt = this.uInterfaceAddressListCount

    public operator fun component11(): MutPtr<UByte> = this.pInterfaceAddressList

    public operator fun component12(): UInt = this.uNumSupportedCountryOrRegionStrings

    public operator fun component13(): MutPtr<UByte> = this.pSupportedCountryOrRegionStrings

    public operator fun component14(): UInt = this.uDiscoveryFilterListSize

    public operator fun component15(): UInt = this.uGORoleClientTableSize

    public fun copy(header: NdisObjectHeader = this.header, uNumConcurrentGORole: UInt = this.uNumConcurrentGORole, uNumConcurrentClientRole: UInt = this.uNumConcurrentClientRole, wPSVersionsSupported: UInt = this.wPSVersionsSupported, bServiceDiscoverySupported: Boolean = this.bServiceDiscoverySupported, bClientDiscoverabilitySupported: Boolean = this.bClientDiscoverabilitySupported, bInfrastructureManagementSupported: Boolean = this.bInfrastructureManagementSupported, uMaxSecondaryDeviceTypeListSize: UInt = this.uMaxSecondaryDeviceTypeListSize, deviceAddress: UByteArray = this.deviceAddress, uInterfaceAddressListCount: UInt = this.uInterfaceAddressListCount, pInterfaceAddressList: MutPtr<UByte> = this.pInterfaceAddressList, uNumSupportedCountryOrRegionStrings: UInt = this.uNumSupportedCountryOrRegionStrings, pSupportedCountryOrRegionStrings: MutPtr<UByte> = this.pSupportedCountryOrRegionStrings, uDiscoveryFilterListSize: UInt = this.uDiscoveryFilterListSize, uGORoleClientTableSize: UInt = this.uGORoleClientTableSize): Dot11WfdAttributes = Dot11WfdAttributes(header = header, uNumConcurrentGORole = uNumConcurrentGORole, uNumConcurrentClientRole = uNumConcurrentClientRole, wPSVersionsSupported = wPSVersionsSupported, bServiceDiscoverySupported = bServiceDiscoverySupported, bClientDiscoverabilitySupported = bClientDiscoverabilitySupported, bInfrastructureManagementSupported = bInfrastructureManagementSupported, uMaxSecondaryDeviceTypeListSize = uMaxSecondaryDeviceTypeListSize, deviceAddress = deviceAddress, uInterfaceAddressListCount = uInterfaceAddressListCount, pInterfaceAddressListCtorArg = pInterfaceAddressList, uNumSupportedCountryOrRegionStrings = uNumSupportedCountryOrRegionStrings, pSupportedCountryOrRegionStringsCtorArg = pSupportedCountryOrRegionStrings, uDiscoveryFilterListSize = uDiscoveryFilterListSize, uGORoleClientTableSize = uGORoleClientTableSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdAttributes) return false
        if (this.header != other.header) return false
        if (this.uNumConcurrentGORole != other.uNumConcurrentGORole) return false
        if (this.uNumConcurrentClientRole != other.uNumConcurrentClientRole) return false
        if (this.wPSVersionsSupported != other.wPSVersionsSupported) return false
        if (this.bServiceDiscoverySupported != other.bServiceDiscoverySupported) return false
        if (this.bClientDiscoverabilitySupported != other.bClientDiscoverabilitySupported) return false
        if (this.bInfrastructureManagementSupported != other.bInfrastructureManagementSupported) return false
        if (this.uMaxSecondaryDeviceTypeListSize != other.uMaxSecondaryDeviceTypeListSize) return false
        if (!this.deviceAddress.contentEquals(other.deviceAddress)) return false
        if (this.uInterfaceAddressListCount != other.uInterfaceAddressListCount) return false
        if (this.pInterfaceAddressList != other.pInterfaceAddressList) return false
        if (this.uNumSupportedCountryOrRegionStrings != other.uNumSupportedCountryOrRegionStrings) return false
        if (this.pSupportedCountryOrRegionStrings != other.pSupportedCountryOrRegionStrings) return false
        if (this.uDiscoveryFilterListSize != other.uDiscoveryFilterListSize) return false
        if (this.uGORoleClientTableSize != other.uGORoleClientTableSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uNumConcurrentGORole.hashCode()
        result = 31 * result + this.uNumConcurrentClientRole.hashCode()
        result = 31 * result + this.wPSVersionsSupported.hashCode()
        result = 31 * result + this.bServiceDiscoverySupported.hashCode()
        result = 31 * result + this.bClientDiscoverabilitySupported.hashCode()
        result = 31 * result + this.bInfrastructureManagementSupported.hashCode()
        result = 31 * result + this.uMaxSecondaryDeviceTypeListSize.hashCode()
        result = 31 * result + this.deviceAddress.contentHashCode()
        result = 31 * result + this.uInterfaceAddressListCount.hashCode()
        result = 31 * result + this.pInterfaceAddressList.hashCode()
        result = 31 * result + this.uNumSupportedCountryOrRegionStrings.hashCode()
        result = 31 * result + this.pSupportedCountryOrRegionStrings.hashCode()
        result = 31 * result + this.uDiscoveryFilterListSize.hashCode()
        result = 31 * result + this.uGORoleClientTableSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            header: NdisObjectHeader = NdisObjectHeader(),
            uNumConcurrentGORole: UInt = 0u,
            uNumConcurrentClientRole: UInt = 0u,
            wPSVersionsSupported: UInt = 0u,
            bServiceDiscoverySupported: Boolean = false,
            bClientDiscoverabilitySupported: Boolean = false,
            bInfrastructureManagementSupported: Boolean = false,
            uMaxSecondaryDeviceTypeListSize: UInt = 0u,
            deviceAddress: UByteArray = UByteArray(6),
            uInterfaceAddressListCount: UInt = 0u,
            pInterfaceAddressList: MutPtr<UByte> = MutPtr(0L),
            uNumSupportedCountryOrRegionStrings: UInt = 0u,
            pSupportedCountryOrRegionStrings: MutPtr<UByte> = MutPtr(0L),
            uDiscoveryFilterListSize: UInt = 0u,
            uGORoleClientTableSize: UInt = 0u,
        ): Dot11WfdAttributes =
            Dot11WfdAttributes(
                header = header,
                uNumConcurrentGORole = uNumConcurrentGORole,
                uNumConcurrentClientRole = uNumConcurrentClientRole,
                wPSVersionsSupported = wPSVersionsSupported,
                bServiceDiscoverySupported = bServiceDiscoverySupported,
                bClientDiscoverabilitySupported = bClientDiscoverabilitySupported,
                bInfrastructureManagementSupported = bInfrastructureManagementSupported,
                uMaxSecondaryDeviceTypeListSize = uMaxSecondaryDeviceTypeListSize,
                deviceAddress = deviceAddress,
                uInterfaceAddressListCount = uInterfaceAddressListCount,
                pInterfaceAddressListCtorArg = pInterfaceAddressList,
                uNumSupportedCountryOrRegionStrings = uNumSupportedCountryOrRegionStrings,
                pSupportedCountryOrRegionStringsCtorArg = pSupportedCountryOrRegionStrings,
                uDiscoveryFilterListSize = uDiscoveryFilterListSize,
                uGORoleClientTableSize = uGORoleClientTableSize,
            )
    }
}

public data class Dot11WfdChannel(
    public var countryRegionString: UByteArray = UByteArray(3),
    public var operatingClass: UByte = 0u,
    public var channelNumber: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdChannel) return false
        if (!this.countryRegionString.contentEquals(other.countryRegionString)) return false
        if (this.operatingClass != other.operatingClass) return false
        if (this.channelNumber != other.channelNumber) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.countryRegionString.contentHashCode()
        result = 31 * result + this.operatingClass.hashCode()
        result = 31 * result + this.channelNumber.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdChannel> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdChannel> {
                override val sizeBytes: Long = 5L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Dot11WfdChannel =
                    Dot11WfdChannel(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11WfdChannel) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr, value.countryRegionString)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.operatingClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.channelNumber)
                }
            }
    }
}

public data class Dot11WfdConfigurationTimeout(
    public var gOTimeout: UByte = 0u,
    public var clientTimeout: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdConfigurationTimeout> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdConfigurationTimeout> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Dot11WfdConfigurationTimeout =
                    Dot11WfdConfigurationTimeout(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: Dot11WfdConfigurationTimeout) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.gOTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.clientTimeout)
                }
            }
    }
}

public data class Dot11WfdDeviceCapabilityConfig(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var bServiceDiscoveryEnabled: Boolean = false,
    public var bClientDiscoverabilityEnabled: Boolean = false,
    public var bConcurrentOperationSupported: Boolean = false,
    public var bInfrastructureManagementEnabled: Boolean = false,
    public var bDeviceLimitReached: Boolean = false,
    public var bInvitationProcedureEnabled: Boolean = false,
    public var wPSVersionsEnabled: UInt = 0u,
)

public data class Dot11WfdDeviceEntry(
    public var uPhyId: UInt = 0u,
    public var phySpecificInfo: Dot11BssEntryPhySpecificInfo = Dot11BssEntryPhySpecificInfo(),
    public var dot11BSSID: UByteArray = UByteArray(6),
    public var dot11BSSType: Dot11BssType = 0,
    public var transmitterAddress: UByteArray = UByteArray(6),
    public var lRSSI: Int = 0,
    public var uLinkQuality: UInt = 0u,
    public var usBeaconPeriod: UShort = 0u,
    public var ullTimestamp: ULong = 0uL,
    public var ullBeaconHostTimestamp: ULong = 0uL,
    public var ullProbeResponseHostTimestamp: ULong = 0uL,
    public var usCapabilityInformation: UShort = 0u,
    public var uBeaconIEsOffset: UInt = 0u,
    public var uBeaconIEsLength: UInt = 0u,
    public var uProbeResponseIEsOffset: UInt = 0u,
    public var uProbeResponseIEsLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdDeviceEntry) return false
        if (this.uPhyId != other.uPhyId) return false
        if (this.phySpecificInfo != other.phySpecificInfo) return false
        if (!this.dot11BSSID.contentEquals(other.dot11BSSID)) return false
        if (this.dot11BSSType != other.dot11BSSType) return false
        if (!this.transmitterAddress.contentEquals(other.transmitterAddress)) return false
        if (this.lRSSI != other.lRSSI) return false
        if (this.uLinkQuality != other.uLinkQuality) return false
        if (this.usBeaconPeriod != other.usBeaconPeriod) return false
        if (this.ullTimestamp != other.ullTimestamp) return false
        if (this.ullBeaconHostTimestamp != other.ullBeaconHostTimestamp) return false
        if (this.ullProbeResponseHostTimestamp != other.ullProbeResponseHostTimestamp) return false
        if (this.usCapabilityInformation != other.usCapabilityInformation) return false
        if (this.uBeaconIEsOffset != other.uBeaconIEsOffset) return false
        if (this.uBeaconIEsLength != other.uBeaconIEsLength) return false
        if (this.uProbeResponseIEsOffset != other.uProbeResponseIEsOffset) return false
        if (this.uProbeResponseIEsLength != other.uProbeResponseIEsLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uPhyId.hashCode()
        result = 31 * result + this.phySpecificInfo.hashCode()
        result = 31 * result + this.dot11BSSID.contentHashCode()
        result = 31 * result + this.dot11BSSType.hashCode()
        result = 31 * result + this.transmitterAddress.contentHashCode()
        result = 31 * result + this.lRSSI.hashCode()
        result = 31 * result + this.uLinkQuality.hashCode()
        result = 31 * result + this.usBeaconPeriod.hashCode()
        result = 31 * result + this.ullTimestamp.hashCode()
        result = 31 * result + this.ullBeaconHostTimestamp.hashCode()
        result = 31 * result + this.ullProbeResponseHostTimestamp.hashCode()
        result = 31 * result + this.usCapabilityInformation.hashCode()
        result = 31 * result + this.uBeaconIEsOffset.hashCode()
        result = 31 * result + this.uBeaconIEsLength.hashCode()
        result = 31 * result + this.uProbeResponseIEsOffset.hashCode()
        result = 31 * result + this.uProbeResponseIEsLength.hashCode()
        return result
    }
}

public data class Dot11WfdDeviceInfo(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var deviceAddress: UByteArray = UByteArray(6),
    public var configMethods: UShort = 0u,
    public var primaryDeviceType: Dot11WfdDeviceType = Dot11WfdDeviceType(),
    public var deviceName: Dot11WpsDeviceName = Dot11WpsDeviceName(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdDeviceInfo) return false
        if (this.header != other.header) return false
        if (!this.deviceAddress.contentEquals(other.deviceAddress)) return false
        if (this.configMethods != other.configMethods) return false
        if (this.primaryDeviceType != other.primaryDeviceType) return false
        if (this.deviceName != other.deviceName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.deviceAddress.contentHashCode()
        result = 31 * result + this.configMethods.hashCode()
        result = 31 * result + this.primaryDeviceType.hashCode()
        result = 31 * result + this.deviceName.hashCode()
        return result
    }
}

public data class Dot11WfdDeviceListenChannel(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var channelNumber: UByte = 0u,
)

public data class Dot11WfdDeviceType(
    public var categoryID: UShort = 0u,
    public var subCategoryID: UShort = 0u,
    public var oui: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdDeviceType) return false
        if (this.categoryID != other.categoryID) return false
        if (this.subCategoryID != other.subCategoryID) return false
        if (!this.oui.contentEquals(other.oui)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.categoryID.hashCode()
        result = 31 * result + this.subCategoryID.hashCode()
        result = 31 * result + this.oui.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdDeviceType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdDeviceType> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Dot11WfdDeviceType =
                    Dot11WfdDeviceType(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11WfdDeviceType) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.categoryID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.subCategoryID)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 4L, value.oui)
                }
            }
    }
}

public data class Dot11WfdDiscoverCompleteParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var status: Int = 0,
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var uListOffset: UInt = 0u,
    public var uListLength: UInt = 0u,
)

public data class Dot11WfdDiscoverDeviceFilter(
    public var deviceID: UByteArray = UByteArray(6),
    public var ucBitmask: UByte = 0u,
    public var groupSSID: Dot11Ssid = Dot11Ssid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdDiscoverDeviceFilter) return false
        if (!this.deviceID.contentEquals(other.deviceID)) return false
        if (this.ucBitmask != other.ucBitmask) return false
        if (this.groupSSID != other.groupSSID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceID.contentHashCode()
        result = 31 * result + this.ucBitmask.hashCode()
        result = 31 * result + this.groupSSID.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdDiscoverDeviceFilter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdDiscoverDeviceFilter> {
                override val sizeBytes: Long = 44L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11WfdDiscoverDeviceFilter =
                    Dot11WfdDiscoverDeviceFilter(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (Dot11Ssid.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11WfdDiscoverDeviceFilter) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.deviceID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.ucBitmask)
                    (Dot11Ssid.typeLayout()).writeNative(addr + 8L, value.groupSSID)
                }
            }
    }
}

public data class Dot11WfdDiscoverRequest(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var discoverType: Dot11WfdDiscoverType = 0,
    public var scanType: Dot11WfdScanType = 0,
    public var uDiscoverTimeout: UInt = 0u,
    public var uDeviceFilterListOffset: UInt = 0u,
    public var uNumDeviceFilters: UInt = 0u,
    public var uIEsOffset: UInt = 0u,
    public var uIEsLength: UInt = 0u,
    public var bForceScanLegacyNetworks: Boolean = false,
)

public data class Dot11WfdGoIntent(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdGoIntent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdGoIntent> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Dot11WfdGoIntent =
                    Dot11WfdGoIntent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Dot11WfdGoIntent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Dot11WfdGroupId(
    public var deviceAddress: UByteArray = UByteArray(6),
    public var ssid: Dot11Ssid = Dot11Ssid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdGroupId) return false
        if (!this.deviceAddress.contentEquals(other.deviceAddress)) return false
        if (this.ssid != other.ssid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceAddress.contentHashCode()
        result = 31 * result + this.ssid.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdGroupId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdGroupId> {
                override val sizeBytes: Long = 44L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11WfdGroupId =
                    Dot11WfdGroupId(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (Dot11Ssid.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11WfdGroupId) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.deviceAddress)
                    (Dot11Ssid.typeLayout()).writeNative(addr + 8L, value.ssid)
                }
            }
    }
}

public data class Dot11WfdGroupJoinParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var gOOperatingChannel: Dot11WfdChannel = Dot11WfdChannel(),
    public var gOConfigTime: UInt = 0u,
    public var bInGroupFormation: Boolean = false,
    public var bWaitForWPSReady: Boolean = false,
)

public data class Dot11WfdGroupOwnerCapabilityConfig(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var bPersistentGroupEnabled: Boolean = false,
    public var bIntraBSSDistributionSupported: Boolean = false,
    public var bCrossConnectionSupported: Boolean = false,
    public var bPersistentReconnectSupported: Boolean = false,
    public var bGroupFormationEnabled: Boolean = false,
    public var uMaximumGroupLimit: UInt = 0u,
)

public data class Dot11WfdGroupOwnerCapabilityConfigV2(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var bPersistentGroupEnabled: Boolean = false,
    public var bIntraBSSDistributionSupported: Boolean = false,
    public var bCrossConnectionSupported: Boolean = false,
    public var bPersistentReconnectSupported: Boolean = false,
    public var bGroupFormationEnabled: Boolean = false,
    public var uMaximumGroupLimit: UInt = 0u,
    public var bEapolKeyIpAddressAllocationSupported: Boolean = false,
)

public data class Dot11WfdGroupStartParameters(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var advertisedOperatingChannel: Dot11WfdChannel = Dot11WfdChannel(),
)

public data class Dot11WfdInvitationFlags(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdInvitationFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdInvitationFlags> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Dot11WfdInvitationFlags =
                    Dot11WfdInvitationFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Dot11WfdInvitationFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Dot11WfdSecondaryDeviceTypeList(
    public var header: NdisObjectHeader = NdisObjectHeader(),
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var secondaryDeviceTypes: List<Dot11WfdDeviceType> = List(1) { Dot11WfdDeviceType() },
)

public data class Dot11WfdServiceHashList(
    public var serviceHashCount: UShort = 0u,
    public var serviceHash: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdServiceHashList) return false
        if (this.serviceHashCount != other.serviceHashCount) return false
        if (!this.serviceHash.contentEquals(other.serviceHash)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.serviceHashCount.hashCode()
        result = 31 * result + this.serviceHash.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdServiceHashList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdServiceHashList> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Dot11WfdServiceHashList =
                    Dot11WfdServiceHashList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Dot11WfdServiceHashList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.serviceHashCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 2L, value.serviceHash)
                }
            }
    }
}

public data class Dot11WfdSessionId(
    public var sessionID: UInt = 0u,
    public var sessionAddress: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdSessionId) return false
        if (this.sessionID != other.sessionID) return false
        if (!this.sessionAddress.contentEquals(other.sessionAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sessionID.hashCode()
        result = 31 * result + this.sessionAddress.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdSessionId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdSessionId> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11WfdSessionId =
                    Dot11WfdSessionId(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11WfdSessionId) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sessionID)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 4L, value.sessionAddress)
                }
            }
    }
}

public data class Dot11WfdSessionInfo(
    public var uSessionInfoLength: UShort = 0u,
    public var ucSessionInfo: UByteArray = UByteArray(144),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WfdSessionInfo) return false
        if (this.uSessionInfoLength != other.uSessionInfoLength) return false
        if (!this.ucSessionInfo.contentEquals(other.ucSessionInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uSessionInfoLength.hashCode()
        result = 31 * result + this.ucSessionInfo.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdSessionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WfdSessionInfo> {
                override val sizeBytes: Long = 146L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Dot11WfdSessionInfo =
                    Dot11WfdSessionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (144).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Dot11WfdSessionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.uSessionInfoLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (144).toInt())
                    ).writeNative(addr + 2L, value.ucSessionInfo)
                }
            }
    }
}

public data class Dot11WmeAcParameters(
    public var ucAccessCategoryIndex: UByte = 0u,
    public var ucAIFSN: UByte = 0u,
    public var ucECWmin: UByte = 0u,
    public var ucECWmax: UByte = 0u,
    public var usTXOPLimit: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WmeAcParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WmeAcParameters> {
                override val sizeBytes: Long = 6L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Dot11WmeAcParameters =
                    Dot11WmeAcParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11WmeAcParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.ucAccessCategoryIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.ucAIFSN)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.ucECWmin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.ucECWmax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.usTXOPLimit)
                }
            }
    }
}

public data class Dot11WmeAcParametersList(
    public var uNumOfEntries: UInt = 0u,
    public var uTotalNumOfEntries: UInt = 0u,
    public var dot11WMEACParameters: List<Dot11WmeAcParameters> = List(1) { Dot11WmeAcParameters() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WmeAcParametersList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WmeAcParametersList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11WmeAcParametersList =
                    Dot11WmeAcParametersList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Dot11WmeAcParameters.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dot11WmeAcParametersList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uNumOfEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uTotalNumOfEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Dot11WmeAcParameters.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.dot11WMEACParameters)
                }
            }
    }
}

public data class Dot11WmeUpdateIe(
    public var uParamElemMinBeaconIntervals: UInt = 0u,
    public var uWMEInfoElemOffset: UInt = 0u,
    public var uWMEInfoElemLength: UInt = 0u,
    public var uWMEParamElemOffset: UInt = 0u,
    public var uWMEParamElemLength: UInt = 0u,
    public var ucBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WmeUpdateIe) return false
        if (this.uParamElemMinBeaconIntervals != other.uParamElemMinBeaconIntervals) return false
        if (this.uWMEInfoElemOffset != other.uWMEInfoElemOffset) return false
        if (this.uWMEInfoElemLength != other.uWMEInfoElemLength) return false
        if (this.uWMEParamElemOffset != other.uWMEParamElemOffset) return false
        if (this.uWMEParamElemLength != other.uWMEParamElemLength) return false
        if (!this.ucBuffer.contentEquals(other.ucBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uParamElemMinBeaconIntervals.hashCode()
        result = 31 * result + this.uWMEInfoElemOffset.hashCode()
        result = 31 * result + this.uWMEInfoElemLength.hashCode()
        result = 31 * result + this.uWMEParamElemOffset.hashCode()
        result = 31 * result + this.uWMEParamElemLength.hashCode()
        result = 31 * result + this.ucBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WmeUpdateIe> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WmeUpdateIe> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11WmeUpdateIe =
                    Dot11WmeUpdateIe(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Dot11WmeUpdateIe) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uParamElemMinBeaconIntervals)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uWMEInfoElemOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uWMEInfoElemLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.uWMEParamElemOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.uWMEParamElemLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 20L, value.ucBuffer)
                }
            }
    }
}

public class Dot11WpaTsc internal constructor(
    public var uReserved: UInt,
    public var dot11OffloadType: Dot11OffloadType,
    hOffloadCtorArg: Handle,
    public var dot11IV48Counter: Dot11Iv48Counter,
) {
    public var hOffload: Handle = hOffloadCtorArg
        internal set

    public constructor() : this(
        uReserved = 0u,
        dot11OffloadType = 0,
        hOffloadCtorArg = MutPtr(0L),
        dot11IV48Counter = Dot11Iv48Counter(),
    )

    public operator fun component1(): UInt = this.uReserved

    public operator fun component2(): Dot11OffloadType = this.dot11OffloadType

    public operator fun component3(): Handle = this.hOffload

    public operator fun component4(): Dot11Iv48Counter = this.dot11IV48Counter

    public fun copy(uReserved: UInt = this.uReserved, dot11OffloadType: Dot11OffloadType = this.dot11OffloadType, hOffload: Handle = this.hOffload, dot11IV48Counter: Dot11Iv48Counter = this.dot11IV48Counter): Dot11WpaTsc = Dot11WpaTsc(uReserved = uReserved, dot11OffloadType = dot11OffloadType, hOffloadCtorArg = hOffload, dot11IV48Counter = dot11IV48Counter)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WpaTsc) return false
        if (this.uReserved != other.uReserved) return false
        if (this.dot11OffloadType != other.dot11OffloadType) return false
        if (this.hOffload != other.hOffload) return false
        if (this.dot11IV48Counter != other.dot11IV48Counter) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uReserved.hashCode()
        result = 31 * result + this.dot11OffloadType.hashCode()
        result = 31 * result + this.hOffload.hashCode()
        result = 31 * result + this.dot11IV48Counter.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uReserved: UInt = 0u,
            dot11OffloadType: Dot11OffloadType = 0,
            hOffload: Handle = MutPtr(0L),
            dot11IV48Counter: Dot11Iv48Counter = Dot11Iv48Counter(),
        ): Dot11WpaTsc =
            Dot11WpaTsc(
                uReserved = uReserved,
                dot11OffloadType = dot11OffloadType,
                hOffloadCtorArg = hOffload,
                dot11IV48Counter = dot11IV48Counter,
            )
    }
}

public data class Dot11WpsDeviceName(
    public var uDeviceNameLength: UInt = 0u,
    public var ucDeviceName: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dot11WpsDeviceName) return false
        if (this.uDeviceNameLength != other.uDeviceNameLength) return false
        if (!this.ucDeviceName.contentEquals(other.ucDeviceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uDeviceNameLength.hashCode()
        result = 31 * result + this.ucDeviceName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WpsDeviceName> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dot11WpsDeviceName> {
                override val sizeBytes: Long = 36L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dot11WpsDeviceName =
                    Dot11WpsDeviceName(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dot11WpsDeviceName) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uDeviceNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 4L, value.ucDeviceName)
                }
            }
    }
}

public class L2NotificationData internal constructor(
    public var notificationSource: WlanNotificationSources,
    public var notificationCode: UInt,
    public var interfaceGuid: Guid,
    public var dwDataSize: UInt,
    pDataCtorArg: MutPtr<CVoid>,
) {
    public var pData: MutPtr<CVoid> = pDataCtorArg
        internal set

    public constructor() : this(
        notificationSource = 0u,
        notificationCode = 0u,
        interfaceGuid = Guid(),
        dwDataSize = 0u,
        pDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WlanNotificationSources = this.notificationSource

    public operator fun component2(): UInt = this.notificationCode

    public operator fun component3(): Guid = this.interfaceGuid

    public operator fun component4(): UInt = this.dwDataSize

    public operator fun component5(): MutPtr<CVoid> = this.pData

    public fun copy(notificationSource: WlanNotificationSources = this.notificationSource, notificationCode: UInt = this.notificationCode, interfaceGuid: Guid = this.interfaceGuid, dwDataSize: UInt = this.dwDataSize, pData: MutPtr<CVoid> = this.pData): L2NotificationData = L2NotificationData(notificationSource = notificationSource, notificationCode = notificationCode, interfaceGuid = interfaceGuid, dwDataSize = dwDataSize, pDataCtorArg = pData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is L2NotificationData) return false
        if (this.notificationSource != other.notificationSource) return false
        if (this.notificationCode != other.notificationCode) return false
        if (this.interfaceGuid != other.interfaceGuid) return false
        if (this.dwDataSize != other.dwDataSize) return false
        if (this.pData != other.pData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.notificationSource.hashCode()
        result = 31 * result + this.notificationCode.hashCode()
        result = 31 * result + this.interfaceGuid.hashCode()
        result = 31 * result + this.dwDataSize.hashCode()
        result = 31 * result + this.pData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            notificationSource: WlanNotificationSources = 0u,
            notificationCode: UInt = 0u,
            interfaceGuid: Guid = Guid(),
            dwDataSize: UInt = 0u,
            pData: MutPtr<CVoid> = MutPtr(0L),
        ): L2NotificationData =
            L2NotificationData(
                notificationSource = notificationSource,
                notificationCode = notificationCode,
                interfaceGuid = interfaceGuid,
                dwDataSize = dwDataSize,
                pDataCtorArg = pData,
            )
    }
}

public class OnexAuthParams internal constructor(
    public var fUpdatePending: Bool,
    public var oneXConnProfile: OnexVariableBlob,
    public var authIdentity: OnexAuthIdentity,
    public var dwQuarantineState: UInt,
    public var bitfield: UInt,
    public var dwSessionId: UInt,
    hUserTokenCtorArg: Handle,
    public var oneXUserProfile: OnexVariableBlob,
    public var identity: OnexVariableBlob,
    public var userName: OnexVariableBlob,
    public var domain: OnexVariableBlob,
) {
    public var hUserToken: Handle = hUserTokenCtorArg
        internal set

    public constructor() : this(
        fUpdatePending = 0,
        oneXConnProfile = OnexVariableBlob(),
        authIdentity = 0,
        dwQuarantineState = 0u,
        bitfield = 0u,
        dwSessionId = 0u,
        hUserTokenCtorArg = MutPtr(0L),
        oneXUserProfile = OnexVariableBlob(),
        identity = OnexVariableBlob(),
        userName = OnexVariableBlob(),
        domain = OnexVariableBlob(),
    )

    public operator fun component1(): Bool = this.fUpdatePending

    public operator fun component2(): OnexVariableBlob = this.oneXConnProfile

    public operator fun component3(): OnexAuthIdentity = this.authIdentity

    public operator fun component4(): UInt = this.dwQuarantineState

    public operator fun component5(): UInt = this.bitfield

    public operator fun component6(): UInt = this.dwSessionId

    public operator fun component7(): Handle = this.hUserToken

    public operator fun component8(): OnexVariableBlob = this.oneXUserProfile

    public operator fun component9(): OnexVariableBlob = this.identity

    public operator fun component10(): OnexVariableBlob = this.userName

    public operator fun component11(): OnexVariableBlob = this.domain

    public fun copy(fUpdatePending: Bool = this.fUpdatePending, oneXConnProfile: OnexVariableBlob = this.oneXConnProfile, authIdentity: OnexAuthIdentity = this.authIdentity, dwQuarantineState: UInt = this.dwQuarantineState, bitfield: UInt = this.bitfield, dwSessionId: UInt = this.dwSessionId, hUserToken: Handle = this.hUserToken, oneXUserProfile: OnexVariableBlob = this.oneXUserProfile, identity: OnexVariableBlob = this.identity, userName: OnexVariableBlob = this.userName, domain: OnexVariableBlob = this.domain): OnexAuthParams = OnexAuthParams(fUpdatePending = fUpdatePending, oneXConnProfile = oneXConnProfile, authIdentity = authIdentity, dwQuarantineState = dwQuarantineState, bitfield = bitfield, dwSessionId = dwSessionId, hUserTokenCtorArg = hUserToken, oneXUserProfile = oneXUserProfile, identity = identity, userName = userName, domain = domain)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OnexAuthParams) return false
        if (this.fUpdatePending != other.fUpdatePending) return false
        if (this.oneXConnProfile != other.oneXConnProfile) return false
        if (this.authIdentity != other.authIdentity) return false
        if (this.dwQuarantineState != other.dwQuarantineState) return false
        if (this.bitfield != other.bitfield) return false
        if (this.dwSessionId != other.dwSessionId) return false
        if (this.hUserToken != other.hUserToken) return false
        if (this.oneXUserProfile != other.oneXUserProfile) return false
        if (this.identity != other.identity) return false
        if (this.userName != other.userName) return false
        if (this.domain != other.domain) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fUpdatePending.hashCode()
        result = 31 * result + this.oneXConnProfile.hashCode()
        result = 31 * result + this.authIdentity.hashCode()
        result = 31 * result + this.dwQuarantineState.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.dwSessionId.hashCode()
        result = 31 * result + this.hUserToken.hashCode()
        result = 31 * result + this.oneXUserProfile.hashCode()
        result = 31 * result + this.identity.hashCode()
        result = 31 * result + this.userName.hashCode()
        result = 31 * result + this.domain.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fUpdatePending: Bool = 0,
            oneXConnProfile: OnexVariableBlob = OnexVariableBlob(),
            authIdentity: OnexAuthIdentity = 0,
            dwQuarantineState: UInt = 0u,
            bitfield: UInt = 0u,
            dwSessionId: UInt = 0u,
            hUserToken: Handle = MutPtr(0L),
            oneXUserProfile: OnexVariableBlob = OnexVariableBlob(),
            identity: OnexVariableBlob = OnexVariableBlob(),
            userName: OnexVariableBlob = OnexVariableBlob(),
            domain: OnexVariableBlob = OnexVariableBlob(),
        ): OnexAuthParams =
            OnexAuthParams(
                fUpdatePending = fUpdatePending,
                oneXConnProfile = oneXConnProfile,
                authIdentity = authIdentity,
                dwQuarantineState = dwQuarantineState,
                bitfield = bitfield,
                dwSessionId = dwSessionId,
                hUserTokenCtorArg = hUserToken,
                oneXUserProfile = oneXUserProfile,
                identity = identity,
                userName = userName,
                domain = domain,
            )
    }
}

public data class OnexEapError(
    public var dwWinError: UInt = 0u,
    public var type: EapMethodType = EapMethodType(),
    public var dwReasonCode: UInt = 0u,
    public var rootCauseGuid: Guid = Guid(),
    public var repairGuid: Guid = Guid(),
    public var helpLinkGuid: Guid = Guid(),
    public var bitfield: UInt = 0u,
    public var rootCauseString: OnexVariableBlob = OnexVariableBlob(),
    public var repairString: OnexVariableBlob = OnexVariableBlob(),
)

public data class OnexResultUpdateData(
    public var oneXStatus: OnexStatus = OnexStatus(),
    public var backendSupport: OnexEapMethodBackendSupport = 0,
    public var fBackendEngaged: Bool = 0,
    public var bitfield: UInt = 0u,
    public var authParams: OnexVariableBlob = OnexVariableBlob(),
    public var eapError: OnexVariableBlob = OnexVariableBlob(),
)

public data class OnexStatus(
    public var authStatus: OnexAuthStatus = 0,
    public var dwReason: UInt = 0u,
    public var dwError: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OnexStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OnexStatus> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): OnexStatus =
                    OnexStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: OnexStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.authStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwReason)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwError)
                }
            }
    }
}

public data class OnexUserInfo(
    public var authIdentity: OnexAuthIdentity = 0,
    public var bitfield: UInt = 0u,
    public var userName: OnexVariableBlob = OnexVariableBlob(),
    public var domainName: OnexVariableBlob = OnexVariableBlob(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OnexUserInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OnexUserInfo> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): OnexUserInfo =
                    OnexUserInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (OnexVariableBlob.typeLayout()).readNative(addr + 8L),
                        (OnexVariableBlob.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: OnexUserInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.authIdentity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitfield)
                    (OnexVariableBlob.typeLayout()).writeNative(addr + 8L, value.userName)
                    (OnexVariableBlob.typeLayout()).writeNative(addr + 16L, value.domainName)
                }
            }
    }
}

public data class OnexVariableBlob(
    public var dwSize: UInt = 0u,
    public var dwOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OnexVariableBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OnexVariableBlob> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): OnexVariableBlob =
                    OnexVariableBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: OnexVariableBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwOffset)
                }
            }
    }
}

public data class WdiagIhvWlanId(
    public var strProfileName: UShortArray = UShortArray(256),
    public var ssid: Dot11Ssid = Dot11Ssid(),
    public var bssType: Dot11BssType = 0,
    public var dwFlags: UInt = 0u,
    public var dwReasonCode: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WdiagIhvWlanId) return false
        if (!this.strProfileName.contentEquals(other.strProfileName)) return false
        if (this.ssid != other.ssid) return false
        if (this.bssType != other.bssType) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwReasonCode != other.dwReasonCode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.strProfileName.contentHashCode()
        result = 31 * result + this.ssid.hashCode()
        result = 31 * result + this.bssType.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwReasonCode.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WdiagIhvWlanId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WdiagIhvWlanId> {
                override val sizeBytes: Long = 560L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WdiagIhvWlanId =
                    WdiagIhvWlanId(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr),
                        (Dot11Ssid.typeLayout()).readNative(addr + 512L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 548L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 552L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 556L),
                    )
                override fun writeNative(addr: Long, value: WdiagIhvWlanId) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr, value.strProfileName)
                    (Dot11Ssid.typeLayout()).writeNative(addr + 512L, value.ssid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 548L, value.bssType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 552L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 556L, value.dwReasonCode)
                }
            }
    }
}

public data class WfdsvcConnectionCapability(
    public var bNew: Boolean = false,
    public var bClient: Boolean = false,
    public var bGO: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WfdsvcConnectionCapability> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WfdsvcConnectionCapability> {
                override val sizeBytes: Long = 3L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WfdsvcConnectionCapability =
                    WfdsvcConnectionCapability(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: WfdsvcConnectionCapability) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.bNew)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.bClient)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 2L, value.bGO)
                }
            }
    }
}

public data class WfdGroupId(
    public var deviceAddress: UByteArray = UByteArray(6),
    public var groupSSID: Dot11Ssid = Dot11Ssid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WfdGroupId) return false
        if (!this.deviceAddress.contentEquals(other.deviceAddress)) return false
        if (this.groupSSID != other.groupSSID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceAddress.contentHashCode()
        result = 31 * result + this.groupSSID.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WfdGroupId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WfdGroupId> {
                override val sizeBytes: Long = 44L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WfdGroupId =
                    WfdGroupId(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (Dot11Ssid.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WfdGroupId) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.deviceAddress)
                    (Dot11Ssid.typeLayout()).writeNative(addr + 8L, value.groupSSID)
                }
            }
    }
}

public data class WlanAssociationAttributes(
    public var dot11Ssid: Dot11Ssid = Dot11Ssid(),
    public var dot11BssType: Dot11BssType = 0,
    public var dot11Bssid: UByteArray = UByteArray(6),
    public var dot11PhyType: Dot11PhyType = 0,
    public var uDot11PhyIndex: UInt = 0u,
    public var wlanSignalQuality: UInt = 0u,
    public var ulRxRate: UInt = 0u,
    public var ulTxRate: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanAssociationAttributes) return false
        if (this.dot11Ssid != other.dot11Ssid) return false
        if (this.dot11BssType != other.dot11BssType) return false
        if (!this.dot11Bssid.contentEquals(other.dot11Bssid)) return false
        if (this.dot11PhyType != other.dot11PhyType) return false
        if (this.uDot11PhyIndex != other.uDot11PhyIndex) return false
        if (this.wlanSignalQuality != other.wlanSignalQuality) return false
        if (this.ulRxRate != other.ulRxRate) return false
        if (this.ulTxRate != other.ulTxRate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11Ssid.hashCode()
        result = 31 * result + this.dot11BssType.hashCode()
        result = 31 * result + this.dot11Bssid.contentHashCode()
        result = 31 * result + this.dot11PhyType.hashCode()
        result = 31 * result + this.uDot11PhyIndex.hashCode()
        result = 31 * result + this.wlanSignalQuality.hashCode()
        result = 31 * result + this.ulRxRate.hashCode()
        result = 31 * result + this.ulTxRate.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanAssociationAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanAssociationAttributes> {
                override val sizeBytes: Long = 68L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WlanAssociationAttributes =
                    WlanAssociationAttributes(
                        (Dot11Ssid.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: WlanAssociationAttributes) {
                    (Dot11Ssid.typeLayout()).writeNative(addr, value.dot11Ssid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.dot11BssType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 40L, value.dot11Bssid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.dot11PhyType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.uDot11PhyIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.wlanSignalQuality)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.ulRxRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.ulTxRate)
                }
            }
    }
}

public data class WlanAuthCipherPairList(
    public var dwNumberOfItems: UInt = 0u,
    public var pAuthCipherPairList: List<Dot11AuthCipherPair> = List(1) { Dot11AuthCipherPair() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanAuthCipherPairList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanAuthCipherPairList> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WlanAuthCipherPairList =
                    WlanAuthCipherPairList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Dot11AuthCipherPair.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WlanAuthCipherPairList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumberOfItems)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Dot11AuthCipherPair.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.pAuthCipherPairList)
                }
            }
    }
}

public data class WlanAvailableNetwork(
    public var strProfileName: UShortArray = UShortArray(256),
    public var dot11Ssid: Dot11Ssid = Dot11Ssid(),
    public var dot11BssType: Dot11BssType = 0,
    public var uNumberOfBssids: UInt = 0u,
    public var bNetworkConnectable: Bool = 0,
    public var wlanNotConnectableReason: UInt = 0u,
    public var uNumberOfPhyTypes: UInt = 0u,
    public var dot11PhyTypes: IntArray = IntArray(8),
    public var bMorePhyTypes: Bool = 0,
    public var wlanSignalQuality: UInt = 0u,
    public var bSecurityEnabled: Bool = 0,
    public var dot11DefaultAuthAlgorithm: Dot11AuthAlgorithm = 0,
    public var dot11DefaultCipherAlgorithm: Dot11CipherAlgorithm = 0,
    public var dwFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanAvailableNetwork) return false
        if (!this.strProfileName.contentEquals(other.strProfileName)) return false
        if (this.dot11Ssid != other.dot11Ssid) return false
        if (this.dot11BssType != other.dot11BssType) return false
        if (this.uNumberOfBssids != other.uNumberOfBssids) return false
        if (this.bNetworkConnectable != other.bNetworkConnectable) return false
        if (this.wlanNotConnectableReason != other.wlanNotConnectableReason) return false
        if (this.uNumberOfPhyTypes != other.uNumberOfPhyTypes) return false
        if (!this.dot11PhyTypes.contentEquals(other.dot11PhyTypes)) return false
        if (this.bMorePhyTypes != other.bMorePhyTypes) return false
        if (this.wlanSignalQuality != other.wlanSignalQuality) return false
        if (this.bSecurityEnabled != other.bSecurityEnabled) return false
        if (this.dot11DefaultAuthAlgorithm != other.dot11DefaultAuthAlgorithm) return false
        if (this.dot11DefaultCipherAlgorithm != other.dot11DefaultCipherAlgorithm) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwReserved != other.dwReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.strProfileName.contentHashCode()
        result = 31 * result + this.dot11Ssid.hashCode()
        result = 31 * result + this.dot11BssType.hashCode()
        result = 31 * result + this.uNumberOfBssids.hashCode()
        result = 31 * result + this.bNetworkConnectable.hashCode()
        result = 31 * result + this.wlanNotConnectableReason.hashCode()
        result = 31 * result + this.uNumberOfPhyTypes.hashCode()
        result = 31 * result + this.dot11PhyTypes.contentHashCode()
        result = 31 * result + this.bMorePhyTypes.hashCode()
        result = 31 * result + this.wlanSignalQuality.hashCode()
        result = 31 * result + this.bSecurityEnabled.hashCode()
        result = 31 * result + this.dot11DefaultAuthAlgorithm.hashCode()
        result = 31 * result + this.dot11DefaultCipherAlgorithm.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        return result
    }
}

public data class WlanAvailableNetworkList(
    public var dwNumberOfItems: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var network: List<WlanAvailableNetwork> = List(1) { WlanAvailableNetwork() },
)

public data class WlanAvailableNetworkListV2(
    public var dwNumberOfItems: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var network: List<WlanAvailableNetworkV2> = List(1) { WlanAvailableNetworkV2() },
)

public class WlanAvailableNetworkV2(
    public var strProfileName: UShortArray = UShortArray(256),
    public var dot11Ssid: Dot11Ssid = Dot11Ssid(),
    public var dot11BssType: Dot11BssType = 0,
    public var uNumberOfBssids: UInt = 0u,
    public var bNetworkConnectable: Bool = 0,
    public var wlanNotConnectableReason: UInt = 0u,
    public var uNumberOfPhyTypes: UInt = 0u,
    public var dot11PhyTypes: IntArray = IntArray(8),
    public var bMorePhyTypes: Bool = 0,
    public var wlanSignalQuality: UInt = 0u,
    public var bSecurityEnabled: Bool = 0,
    public var dot11DefaultAuthAlgorithm: Dot11AuthAlgorithm = 0,
    public var dot11DefaultCipherAlgorithm: Dot11CipherAlgorithm = 0,
    public var dwFlags: UInt = 0u,
    public var accessNetworkOptions: Dot11Accessnetworkoptions = Dot11Accessnetworkoptions(),
    public var dot11HESSID: UByteArray = UByteArray(6),
    public var venueInfo: Dot11Venueinfo = Dot11Venueinfo(),
    public var dwReserved: UInt = 0u,
)

public data class WlanBssEntry(
    public var dot11Ssid: Dot11Ssid = Dot11Ssid(),
    public var uPhyId: UInt = 0u,
    public var dot11Bssid: UByteArray = UByteArray(6),
    public var dot11BssType: Dot11BssType = 0,
    public var dot11BssPhyType: Dot11PhyType = 0,
    public var lRssi: Int = 0,
    public var uLinkQuality: UInt = 0u,
    public var bInRegDomain: Boolean = false,
    public var usBeaconPeriod: UShort = 0u,
    public var ullTimestamp: ULong = 0uL,
    public var ullHostTimestamp: ULong = 0uL,
    public var usCapabilityInformation: UShort = 0u,
    public var ulChCenterFrequency: UInt = 0u,
    public var wlanRateSet: WlanRateSet = WlanRateSet(),
    public var ulIeOffset: UInt = 0u,
    public var ulIeSize: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanBssEntry) return false
        if (this.dot11Ssid != other.dot11Ssid) return false
        if (this.uPhyId != other.uPhyId) return false
        if (!this.dot11Bssid.contentEquals(other.dot11Bssid)) return false
        if (this.dot11BssType != other.dot11BssType) return false
        if (this.dot11BssPhyType != other.dot11BssPhyType) return false
        if (this.lRssi != other.lRssi) return false
        if (this.uLinkQuality != other.uLinkQuality) return false
        if (this.bInRegDomain != other.bInRegDomain) return false
        if (this.usBeaconPeriod != other.usBeaconPeriod) return false
        if (this.ullTimestamp != other.ullTimestamp) return false
        if (this.ullHostTimestamp != other.ullHostTimestamp) return false
        if (this.usCapabilityInformation != other.usCapabilityInformation) return false
        if (this.ulChCenterFrequency != other.ulChCenterFrequency) return false
        if (this.wlanRateSet != other.wlanRateSet) return false
        if (this.ulIeOffset != other.ulIeOffset) return false
        if (this.ulIeSize != other.ulIeSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot11Ssid.hashCode()
        result = 31 * result + this.uPhyId.hashCode()
        result = 31 * result + this.dot11Bssid.contentHashCode()
        result = 31 * result + this.dot11BssType.hashCode()
        result = 31 * result + this.dot11BssPhyType.hashCode()
        result = 31 * result + this.lRssi.hashCode()
        result = 31 * result + this.uLinkQuality.hashCode()
        result = 31 * result + this.bInRegDomain.hashCode()
        result = 31 * result + this.usBeaconPeriod.hashCode()
        result = 31 * result + this.ullTimestamp.hashCode()
        result = 31 * result + this.ullHostTimestamp.hashCode()
        result = 31 * result + this.usCapabilityInformation.hashCode()
        result = 31 * result + this.ulChCenterFrequency.hashCode()
        result = 31 * result + this.wlanRateSet.hashCode()
        result = 31 * result + this.ulIeOffset.hashCode()
        result = 31 * result + this.ulIeSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanBssEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanBssEntry> {
                override val sizeBytes: Long = 360L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WlanBssEntry =
                    WlanBssEntry(
                        (Dot11Ssid.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 66L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (WlanRateSet.typeLayout()).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 352L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 356L),
                    )
                override fun writeNative(addr: Long, value: WlanBssEntry) {
                    (Dot11Ssid.typeLayout()).writeNative(addr, value.dot11Ssid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.uPhyId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 40L, value.dot11Bssid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.dot11BssType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.dot11BssPhyType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.lRssi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.uLinkQuality)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 64L, value.bInRegDomain)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 66L, value.usBeaconPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.ullTimestamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.ullHostTimestamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 88L, value.usCapabilityInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.ulChCenterFrequency)
                    (WlanRateSet.typeLayout()).writeNative(addr + 96L, value.wlanRateSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 352L, value.ulIeOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 356L, value.ulIeSize)
                }
            }
    }
}

public data class WlanBssList(
    public var dwTotalSize: UInt = 0u,
    public var dwNumberOfItems: UInt = 0u,
    public var wlanBssEntries: List<WlanBssEntry> = List(1) { WlanBssEntry() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanBssList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanBssList> {
                override val sizeBytes: Long = 368L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WlanBssList =
                    WlanBssList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(WlanBssEntry.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WlanBssList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNumberOfItems)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(WlanBssEntry.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.wlanBssEntries)
                }
            }
    }
}
