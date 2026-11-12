@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr

public data class WlanConnectionAttributes(
    public var isState: WlanInterfaceState = 0,
    public var wlanConnectionMode: WlanConnectionMode = 0,
    public var strProfileName: UShortArray = UShortArray(256),
    public var wlanAssociationAttributes: WlanAssociationAttributes = WlanAssociationAttributes(),
    public var wlanSecurityAttributes: WlanSecurityAttributes = WlanSecurityAttributes(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanConnectionAttributes) return false
        if (this.isState != other.isState) return false
        if (this.wlanConnectionMode != other.wlanConnectionMode) return false
        if (!this.strProfileName.contentEquals(other.strProfileName)) return false
        if (this.wlanAssociationAttributes != other.wlanAssociationAttributes) return false
        if (this.wlanSecurityAttributes != other.wlanSecurityAttributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.isState.hashCode()
        result = 31 * result + this.wlanConnectionMode.hashCode()
        result = 31 * result + this.strProfileName.contentHashCode()
        result = 31 * result + this.wlanAssociationAttributes.hashCode()
        result = 31 * result + this.wlanSecurityAttributes.hashCode()
        return result
    }
}

public data class WlanConnectionNotificationData(
    public var wlanConnectionMode: WlanConnectionMode = 0,
    public var strProfileName: UShortArray = UShortArray(256),
    public var dot11Ssid: Dot11Ssid = Dot11Ssid(),
    public var dot11BssType: Dot11BssType = 0,
    public var bSecurityEnabled: Bool = 0,
    public var wlanReasonCode: UInt = 0u,
    public var dwFlags: WlanConnectionNotificationFlags = 0u,
    public var strProfileXml: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanConnectionNotificationData) return false
        if (this.wlanConnectionMode != other.wlanConnectionMode) return false
        if (!this.strProfileName.contentEquals(other.strProfileName)) return false
        if (this.dot11Ssid != other.dot11Ssid) return false
        if (this.dot11BssType != other.dot11BssType) return false
        if (this.bSecurityEnabled != other.bSecurityEnabled) return false
        if (this.wlanReasonCode != other.wlanReasonCode) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.strProfileXml.contentEquals(other.strProfileXml)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wlanConnectionMode.hashCode()
        result = 31 * result + this.strProfileName.contentHashCode()
        result = 31 * result + this.dot11Ssid.hashCode()
        result = 31 * result + this.dot11BssType.hashCode()
        result = 31 * result + this.bSecurityEnabled.hashCode()
        result = 31 * result + this.wlanReasonCode.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.strProfileXml.contentHashCode()
        return result
    }
}

public class WlanConnectionParameters internal constructor(
    public var wlanConnectionMode: WlanConnectionMode,
    strProfileCtorArg: Pcwstr,
    pDot11SsidCtorArg: MutPtr<Dot11Ssid>,
    pDesiredBssidListCtorArg: MutPtr<Dot11BssidList>,
    public var dot11BssType: Dot11BssType,
    public var dwFlags: UInt,
) {
    public var strProfile: Pcwstr = strProfileCtorArg
        internal set

    public var pDot11Ssid: MutPtr<Dot11Ssid> = pDot11SsidCtorArg
        internal set

    public var pDesiredBssidList: MutPtr<Dot11BssidList> = pDesiredBssidListCtorArg
        internal set

    public constructor() : this(
        wlanConnectionMode = 0,
        strProfileCtorArg = ConstPtr(0L),
        pDot11SsidCtorArg = MutPtr(0L),
        pDesiredBssidListCtorArg = MutPtr(0L),
        dot11BssType = 0,
        dwFlags = 0u,
    )

    public operator fun component1(): WlanConnectionMode = this.wlanConnectionMode

    public operator fun component2(): Pcwstr = this.strProfile

    public operator fun component3(): MutPtr<Dot11Ssid> = this.pDot11Ssid

    public operator fun component4(): MutPtr<Dot11BssidList> = this.pDesiredBssidList

    public operator fun component5(): Dot11BssType = this.dot11BssType

    public operator fun component6(): UInt = this.dwFlags

    public fun copy(wlanConnectionMode: WlanConnectionMode = this.wlanConnectionMode, strProfile: Pcwstr = this.strProfile, pDot11Ssid: MutPtr<Dot11Ssid> = this.pDot11Ssid, pDesiredBssidList: MutPtr<Dot11BssidList> = this.pDesiredBssidList, dot11BssType: Dot11BssType = this.dot11BssType, dwFlags: UInt = this.dwFlags): WlanConnectionParameters = WlanConnectionParameters(wlanConnectionMode = wlanConnectionMode, strProfileCtorArg = strProfile, pDot11SsidCtorArg = pDot11Ssid, pDesiredBssidListCtorArg = pDesiredBssidList, dot11BssType = dot11BssType, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanConnectionParameters) return false
        if (this.wlanConnectionMode != other.wlanConnectionMode) return false
        if (this.strProfile != other.strProfile) return false
        if (this.pDot11Ssid != other.pDot11Ssid) return false
        if (this.pDesiredBssidList != other.pDesiredBssidList) return false
        if (this.dot11BssType != other.dot11BssType) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wlanConnectionMode.hashCode()
        result = 31 * result + this.strProfile.hashCode()
        result = 31 * result + this.pDot11Ssid.hashCode()
        result = 31 * result + this.pDesiredBssidList.hashCode()
        result = 31 * result + this.dot11BssType.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wlanConnectionMode: WlanConnectionMode = 0,
            strProfile: Pcwstr = ConstPtr(0L),
            pDot11Ssid: MutPtr<Dot11Ssid> = MutPtr(0L),
            pDesiredBssidList: MutPtr<Dot11BssidList> = MutPtr(0L),
            dot11BssType: Dot11BssType = 0,
            dwFlags: UInt = 0u,
        ): WlanConnectionParameters =
            WlanConnectionParameters(
                wlanConnectionMode = wlanConnectionMode,
                strProfileCtorArg = strProfile,
                pDot11SsidCtorArg = pDot11Ssid,
                pDesiredBssidListCtorArg = pDesiredBssidList,
                dot11BssType = dot11BssType,
                dwFlags = dwFlags,
            )
    }
}

public class WlanConnectionParametersV2 internal constructor(
    public var wlanConnectionMode: WlanConnectionMode,
    strProfileCtorArg: Pcwstr,
    pDot11SsidCtorArg: MutPtr<Dot11Ssid>,
    pDot11HessidCtorArg: MutPtr<UByte>,
    pDesiredBssidListCtorArg: MutPtr<Dot11BssidList>,
    public var dot11BssType: Dot11BssType,
    public var dwFlags: UInt,
    pDot11AccessNetworkOptionsCtorArg: MutPtr<Dot11Accessnetworkoptions>,
) {
    public var strProfile: Pcwstr = strProfileCtorArg
        internal set

    public var pDot11Ssid: MutPtr<Dot11Ssid> = pDot11SsidCtorArg
        internal set

    public var pDot11Hessid: MutPtr<UByte> = pDot11HessidCtorArg
        internal set

    public var pDesiredBssidList: MutPtr<Dot11BssidList> = pDesiredBssidListCtorArg
        internal set

    public var pDot11AccessNetworkOptions: MutPtr<Dot11Accessnetworkoptions> = pDot11AccessNetworkOptionsCtorArg
        internal set

    public constructor() : this(
        wlanConnectionMode = 0,
        strProfileCtorArg = ConstPtr(0L),
        pDot11SsidCtorArg = MutPtr(0L),
        pDot11HessidCtorArg = MutPtr(0L),
        pDesiredBssidListCtorArg = MutPtr(0L),
        dot11BssType = 0,
        dwFlags = 0u,
        pDot11AccessNetworkOptionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WlanConnectionMode = this.wlanConnectionMode

    public operator fun component2(): Pcwstr = this.strProfile

    public operator fun component3(): MutPtr<Dot11Ssid> = this.pDot11Ssid

    public operator fun component4(): MutPtr<UByte> = this.pDot11Hessid

    public operator fun component5(): MutPtr<Dot11BssidList> = this.pDesiredBssidList

    public operator fun component6(): Dot11BssType = this.dot11BssType

    public operator fun component7(): UInt = this.dwFlags

    public operator fun component8(): MutPtr<Dot11Accessnetworkoptions> = this.pDot11AccessNetworkOptions

    public fun copy(wlanConnectionMode: WlanConnectionMode = this.wlanConnectionMode, strProfile: Pcwstr = this.strProfile, pDot11Ssid: MutPtr<Dot11Ssid> = this.pDot11Ssid, pDot11Hessid: MutPtr<UByte> = this.pDot11Hessid, pDesiredBssidList: MutPtr<Dot11BssidList> = this.pDesiredBssidList, dot11BssType: Dot11BssType = this.dot11BssType, dwFlags: UInt = this.dwFlags, pDot11AccessNetworkOptions: MutPtr<Dot11Accessnetworkoptions> = this.pDot11AccessNetworkOptions): WlanConnectionParametersV2 = WlanConnectionParametersV2(wlanConnectionMode = wlanConnectionMode, strProfileCtorArg = strProfile, pDot11SsidCtorArg = pDot11Ssid, pDot11HessidCtorArg = pDot11Hessid, pDesiredBssidListCtorArg = pDesiredBssidList, dot11BssType = dot11BssType, dwFlags = dwFlags, pDot11AccessNetworkOptionsCtorArg = pDot11AccessNetworkOptions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanConnectionParametersV2) return false
        if (this.wlanConnectionMode != other.wlanConnectionMode) return false
        if (this.strProfile != other.strProfile) return false
        if (this.pDot11Ssid != other.pDot11Ssid) return false
        if (this.pDot11Hessid != other.pDot11Hessid) return false
        if (this.pDesiredBssidList != other.pDesiredBssidList) return false
        if (this.dot11BssType != other.dot11BssType) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pDot11AccessNetworkOptions != other.pDot11AccessNetworkOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wlanConnectionMode.hashCode()
        result = 31 * result + this.strProfile.hashCode()
        result = 31 * result + this.pDot11Ssid.hashCode()
        result = 31 * result + this.pDot11Hessid.hashCode()
        result = 31 * result + this.pDesiredBssidList.hashCode()
        result = 31 * result + this.dot11BssType.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pDot11AccessNetworkOptions.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wlanConnectionMode: WlanConnectionMode = 0,
            strProfile: Pcwstr = ConstPtr(0L),
            pDot11Ssid: MutPtr<Dot11Ssid> = MutPtr(0L),
            pDot11Hessid: MutPtr<UByte> = MutPtr(0L),
            pDesiredBssidList: MutPtr<Dot11BssidList> = MutPtr(0L),
            dot11BssType: Dot11BssType = 0,
            dwFlags: UInt = 0u,
            pDot11AccessNetworkOptions: MutPtr<Dot11Accessnetworkoptions> = MutPtr(0L),
        ): WlanConnectionParametersV2 =
            WlanConnectionParametersV2(
                wlanConnectionMode = wlanConnectionMode,
                strProfileCtorArg = strProfile,
                pDot11SsidCtorArg = pDot11Ssid,
                pDot11HessidCtorArg = pDot11Hessid,
                pDesiredBssidListCtorArg = pDesiredBssidList,
                dot11BssType = dot11BssType,
                dwFlags = dwFlags,
                pDot11AccessNetworkOptionsCtorArg = pDot11AccessNetworkOptions,
            )
    }
}

public data class WlanCountryOrRegionStringList(
    public var dwNumberOfItems: UInt = 0u,
    public var pCountryOrRegionStringList: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanCountryOrRegionStringList) return false
        if (this.dwNumberOfItems != other.dwNumberOfItems) return false
        if (!this.pCountryOrRegionStringList.contentEquals(other.pCountryOrRegionStringList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwNumberOfItems.hashCode()
        result = 31 * result + this.pCountryOrRegionStringList.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanCountryOrRegionStringList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanCountryOrRegionStringList> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WlanCountryOrRegionStringList =
                    WlanCountryOrRegionStringList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WlanCountryOrRegionStringList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumberOfItems)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 4L, value.pCountryOrRegionStringList)
                }
            }
    }
}

public data class WlanDeviceServiceGuidList(
    public var dwNumberOfItems: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var deviceService: List<Guid> = List(1) { Guid() },
)

public data class WlanDeviceServiceNotificationData(
    public var deviceService: Guid = Guid(),
    public var dwOpCode: UInt = 0u,
    public var dwDataSize: UInt = 0u,
    public var dataBlob: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanDeviceServiceNotificationData) return false
        if (this.deviceService != other.deviceService) return false
        if (this.dwOpCode != other.dwOpCode) return false
        if (this.dwDataSize != other.dwDataSize) return false
        if (!this.dataBlob.contentEquals(other.dataBlob)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceService.hashCode()
        result = 31 * result + this.dwOpCode.hashCode()
        result = 31 * result + this.dwDataSize.hashCode()
        result = 31 * result + this.dataBlob.contentHashCode()
        return result
    }
}

public data class WlanHostedNetworkConnectionSettings(
    public var hostedNetworkSSID: Dot11Ssid = Dot11Ssid(),
    public var dwMaxNumberOfPeers: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanHostedNetworkConnectionSettings> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanHostedNetworkConnectionSettings> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WlanHostedNetworkConnectionSettings =
                    WlanHostedNetworkConnectionSettings(
                        (Dot11Ssid.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: WlanHostedNetworkConnectionSettings) {
                    (Dot11Ssid.typeLayout()).writeNative(addr, value.hostedNetworkSSID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwMaxNumberOfPeers)
                }
            }
    }
}

public data class WlanHostedNetworkDataPeerStateChange(
    public var oldState: WlanHostedNetworkPeerState = WlanHostedNetworkPeerState(),
    public var newState: WlanHostedNetworkPeerState = WlanHostedNetworkPeerState(),
    public var peerStateChangeReason: WlanHostedNetworkReason = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanHostedNetworkDataPeerStateChange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanHostedNetworkDataPeerStateChange> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WlanHostedNetworkDataPeerStateChange =
                    WlanHostedNetworkDataPeerStateChange(
                        (WlanHostedNetworkPeerState.typeLayout()).readNative(addr),
                        (WlanHostedNetworkPeerState.typeLayout()).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WlanHostedNetworkDataPeerStateChange) {
                    (WlanHostedNetworkPeerState.typeLayout()).writeNative(addr, value.oldState)
                    (WlanHostedNetworkPeerState.typeLayout()).writeNative(addr + 12L, value.newState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.peerStateChangeReason)
                }
            }
    }
}

public data class WlanHostedNetworkPeerState(
    public var peerMacAddress: UByteArray = UByteArray(6),
    public var peerAuthState: WlanHostedNetworkPeerAuthState = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanHostedNetworkPeerState) return false
        if (!this.peerMacAddress.contentEquals(other.peerMacAddress)) return false
        if (this.peerAuthState != other.peerAuthState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.peerMacAddress.contentHashCode()
        result = 31 * result + this.peerAuthState.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanHostedNetworkPeerState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanHostedNetworkPeerState> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WlanHostedNetworkPeerState =
                    WlanHostedNetworkPeerState(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WlanHostedNetworkPeerState) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.peerMacAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.peerAuthState)
                }
            }
    }
}

public data class WlanHostedNetworkRadioState(
    public var dot11SoftwareRadioState: Dot11RadioState = 0,
    public var dot11HardwareRadioState: Dot11RadioState = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanHostedNetworkRadioState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanHostedNetworkRadioState> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WlanHostedNetworkRadioState =
                    WlanHostedNetworkRadioState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WlanHostedNetworkRadioState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.dot11SoftwareRadioState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.dot11HardwareRadioState)
                }
            }
    }
}

public data class WlanHostedNetworkSecuritySettings(
    public var dot11AuthAlgo: Dot11AuthAlgorithm = 0,
    public var dot11CipherAlgo: Dot11CipherAlgorithm = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanHostedNetworkSecuritySettings> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanHostedNetworkSecuritySettings> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WlanHostedNetworkSecuritySettings =
                    WlanHostedNetworkSecuritySettings(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WlanHostedNetworkSecuritySettings) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.dot11AuthAlgo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.dot11CipherAlgo)
                }
            }
    }
}

public data class WlanHostedNetworkStateChange(
    public var oldState: WlanHostedNetworkState = 0,
    public var newState: WlanHostedNetworkState = 0,
    public var stateChangeReason: WlanHostedNetworkReason = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanHostedNetworkStateChange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanHostedNetworkStateChange> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WlanHostedNetworkStateChange =
                    WlanHostedNetworkStateChange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WlanHostedNetworkStateChange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.oldState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.newState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.stateChangeReason)
                }
            }
    }
}

public data class WlanHostedNetworkStatus(
    public var hostedNetworkState: WlanHostedNetworkState = 0,
    public var iPDeviceID: Guid = Guid(),
    public var wlanHostedNetworkBSSID: UByteArray = UByteArray(6),
    public var dot11PhyType: Dot11PhyType = 0,
    public var ulChannelFrequency: UInt = 0u,
    public var dwNumberOfPeers: UInt = 0u,
    public var peerList: List<WlanHostedNetworkPeerState> = List(1) { WlanHostedNetworkPeerState() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanHostedNetworkStatus) return false
        if (this.hostedNetworkState != other.hostedNetworkState) return false
        if (this.iPDeviceID != other.iPDeviceID) return false
        if (!this.wlanHostedNetworkBSSID.contentEquals(other.wlanHostedNetworkBSSID)) return false
        if (this.dot11PhyType != other.dot11PhyType) return false
        if (this.ulChannelFrequency != other.ulChannelFrequency) return false
        if (this.dwNumberOfPeers != other.dwNumberOfPeers) return false
        if (this.peerList != other.peerList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hostedNetworkState.hashCode()
        result = 31 * result + this.iPDeviceID.hashCode()
        result = 31 * result + this.wlanHostedNetworkBSSID.contentHashCode()
        result = 31 * result + this.dot11PhyType.hashCode()
        result = 31 * result + this.ulChannelFrequency.hashCode()
        result = 31 * result + this.dwNumberOfPeers.hashCode()
        result = 31 * result + this.peerList.hashCode()
        return result
    }
}

public data class WlanInterfaceCapability(
    public var interfaceType: WlanInterfaceType = 0,
    public var bDot11DSupported: Bool = 0,
    public var dwMaxDesiredSsidListSize: UInt = 0u,
    public var dwMaxDesiredBssidListSize: UInt = 0u,
    public var dwNumberOfSupportedPhys: UInt = 0u,
    public var dot11PhyTypes: IntArray = IntArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanInterfaceCapability) return false
        if (this.interfaceType != other.interfaceType) return false
        if (this.bDot11DSupported != other.bDot11DSupported) return false
        if (this.dwMaxDesiredSsidListSize != other.dwMaxDesiredSsidListSize) return false
        if (this.dwMaxDesiredBssidListSize != other.dwMaxDesiredBssidListSize) return false
        if (this.dwNumberOfSupportedPhys != other.dwNumberOfSupportedPhys) return false
        if (!this.dot11PhyTypes.contentEquals(other.dot11PhyTypes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.interfaceType.hashCode()
        result = 31 * result + this.bDot11DSupported.hashCode()
        result = 31 * result + this.dwMaxDesiredSsidListSize.hashCode()
        result = 31 * result + this.dwMaxDesiredBssidListSize.hashCode()
        result = 31 * result + this.dwNumberOfSupportedPhys.hashCode()
        result = 31 * result + this.dot11PhyTypes.contentHashCode()
        return result
    }
}

public data class WlanInterfaceInfo(
    public var interfaceGuid: Guid = Guid(),
    public var strInterfaceDescription: UShortArray = UShortArray(256),
    public var isState: WlanInterfaceState = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanInterfaceInfo) return false
        if (this.interfaceGuid != other.interfaceGuid) return false
        if (!this.strInterfaceDescription.contentEquals(other.strInterfaceDescription)) return false
        if (this.isState != other.isState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.interfaceGuid.hashCode()
        result = 31 * result + this.strInterfaceDescription.contentHashCode()
        result = 31 * result + this.isState.hashCode()
        return result
    }
}

public data class WlanInterfaceInfoList(
    public var dwNumberOfItems: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var interfaceInfo: List<WlanInterfaceInfo> = List(1) { WlanInterfaceInfo() },
)

public data class WlanMacFrameStatistics(
    public var ullTransmittedFrameCount: ULong = 0uL,
    public var ullReceivedFrameCount: ULong = 0uL,
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
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanMacFrameStatistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanMacFrameStatistics> {
                override val sizeBytes: Long = 96L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WlanMacFrameStatistics =
                    WlanMacFrameStatistics(
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
                    )
                override fun writeNative(addr: Long, value: WlanMacFrameStatistics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ullTransmittedFrameCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ullReceivedFrameCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.ullWEPExcludedCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.ullTKIPLocalMICFailures)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.ullTKIPReplays)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.ullTKIPICVErrorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.ullCCMPReplays)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.ullCCMPDecryptErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.ullWEPUndecryptableCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.ullWEPICVErrorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.ullDecryptSuccessCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.ullDecryptFailureCount)
                }
            }
    }
}

public data class WlanMsmNotificationData(
    public var wlanConnectionMode: WlanConnectionMode = 0,
    public var strProfileName: UShortArray = UShortArray(256),
    public var dot11Ssid: Dot11Ssid = Dot11Ssid(),
    public var dot11BssType: Dot11BssType = 0,
    public var dot11MacAddr: UByteArray = UByteArray(6),
    public var bSecurityEnabled: Bool = 0,
    public var bFirstPeer: Bool = 0,
    public var bLastPeer: Bool = 0,
    public var wlanReasonCode: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanMsmNotificationData) return false
        if (this.wlanConnectionMode != other.wlanConnectionMode) return false
        if (!this.strProfileName.contentEquals(other.strProfileName)) return false
        if (this.dot11Ssid != other.dot11Ssid) return false
        if (this.dot11BssType != other.dot11BssType) return false
        if (!this.dot11MacAddr.contentEquals(other.dot11MacAddr)) return false
        if (this.bSecurityEnabled != other.bSecurityEnabled) return false
        if (this.bFirstPeer != other.bFirstPeer) return false
        if (this.bLastPeer != other.bLastPeer) return false
        if (this.wlanReasonCode != other.wlanReasonCode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wlanConnectionMode.hashCode()
        result = 31 * result + this.strProfileName.contentHashCode()
        result = 31 * result + this.dot11Ssid.hashCode()
        result = 31 * result + this.dot11BssType.hashCode()
        result = 31 * result + this.dot11MacAddr.contentHashCode()
        result = 31 * result + this.bSecurityEnabled.hashCode()
        result = 31 * result + this.bFirstPeer.hashCode()
        result = 31 * result + this.bLastPeer.hashCode()
        result = 31 * result + this.wlanReasonCode.hashCode()
        return result
    }
}

public class WlanPhyFrameStatistics(
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
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanPhyFrameStatistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanPhyFrameStatistics> {
                override val sizeBytes: Long = 144L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WlanPhyFrameStatistics =
                    WlanPhyFrameStatistics(
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
                override fun writeNative(addr: Long, value: WlanPhyFrameStatistics) {
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

public data class WlanPhyRadioState(
    public var dwPhyIndex: UInt = 0u,
    public var dot11SoftwareRadioState: Dot11RadioState = 0,
    public var dot11HardwareRadioState: Dot11RadioState = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanPhyRadioState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanPhyRadioState> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WlanPhyRadioState =
                    WlanPhyRadioState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WlanPhyRadioState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwPhyIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.dot11SoftwareRadioState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.dot11HardwareRadioState)
                }
            }
    }
}

public data class WlanProfileInfo(
    public var strProfileName: UShortArray = UShortArray(256),
    public var dwFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanProfileInfo) return false
        if (!this.strProfileName.contentEquals(other.strProfileName)) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.strProfileName.contentHashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanProfileInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanProfileInfo> {
                override val sizeBytes: Long = 516L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WlanProfileInfo =
                    WlanProfileInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 512L),
                    )
                override fun writeNative(addr: Long, value: WlanProfileInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr, value.strProfileName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 512L, value.dwFlags)
                }
            }
    }
}

public data class WlanProfileInfoList(
    public var dwNumberOfItems: UInt = 0u,
    public var dwIndex: UInt = 0u,
    public var profileInfo: List<WlanProfileInfo> = List(1) { WlanProfileInfo() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanProfileInfoList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanProfileInfoList> {
                override val sizeBytes: Long = 524L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WlanProfileInfoList =
                    WlanProfileInfoList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(WlanProfileInfo.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WlanProfileInfoList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumberOfItems)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwIndex)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(WlanProfileInfo.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.profileInfo)
                }
            }
    }
}

public data class WlanRadioState(
    public var dwNumberOfPhys: UInt = 0u,
    public var phyRadioState: List<WlanPhyRadioState> = List(64) { WlanPhyRadioState() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanRadioState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanRadioState> {
                override val sizeBytes: Long = 772L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WlanRadioState =
                    WlanRadioState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(WlanPhyRadioState.typeLayout(), (64).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WlanRadioState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumberOfPhys)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(WlanPhyRadioState.typeLayout(), (64).toInt())
                    ).writeNative(addr + 4L, value.phyRadioState)
                }
            }
    }
}

public data class WlanRateSet(
    public var uRateSetLength: UInt = 0u,
    public var usRateSet: UShortArray = UShortArray(126),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanRateSet) return false
        if (this.uRateSetLength != other.uRateSetLength) return false
        if (!this.usRateSet.contentEquals(other.usRateSet)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uRateSetLength.hashCode()
        result = 31 * result + this.usRateSet.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanRateSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanRateSet> {
                override val sizeBytes: Long = 256L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WlanRateSet =
                    WlanRateSet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (126).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WlanRateSet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uRateSetLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (126).toInt())
                    ).writeNative(addr + 4L, value.usRateSet)
                }
            }
    }
}

public data class WlanRawData(
    public var dwDataSize: UInt = 0u,
    public var dataBlob: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WlanRawData) return false
        if (this.dwDataSize != other.dwDataSize) return false
        if (!this.dataBlob.contentEquals(other.dataBlob)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwDataSize.hashCode()
        result = 31 * result + this.dataBlob.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanRawData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanRawData> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WlanRawData =
                    WlanRawData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WlanRawData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwDataSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.dataBlob)
                }
            }
    }
}

public data class WlanRawDataList(
    public var dwTotalSize: UInt = 0u,
    public var dwNumberOfItems: UInt = 0u,
    public var dataList: List<WlanRawDataList0> = List(1) { WlanRawDataList0() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanRawDataList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanRawDataList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WlanRawDataList =
                    WlanRawDataList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(WlanRawDataList0.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WlanRawDataList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTotalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNumberOfItems)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(WlanRawDataList0.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.dataList)
                }
            }
    }
}

public data class WlanRawDataList0(
    public var dwDataOffset: UInt = 0u,
    public var dwDataSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanRawDataList0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanRawDataList0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WlanRawDataList0 =
                    WlanRawDataList0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WlanRawDataList0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwDataOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwDataSize)
                }
            }
    }
}

public data class WlanSecurityAttributes(
    public var bSecurityEnabled: Bool = 0,
    public var bOneXEnabled: Bool = 0,
    public var dot11AuthAlgorithm: Dot11AuthAlgorithm = 0,
    public var dot11CipherAlgorithm: Dot11CipherAlgorithm = 0,
)

public data class WlanStatistics(
    public var ullFourWayHandshakeFailures: ULong = 0uL,
    public var ullTKIPCounterMeasuresInvoked: ULong = 0uL,
    public var ullReserved: ULong = 0uL,
    public var macUcastCounters: WlanMacFrameStatistics = WlanMacFrameStatistics(),
    public var macMcastCounters: WlanMacFrameStatistics = WlanMacFrameStatistics(),
    public var dwNumberOfPhys: UInt = 0u,
    public var phyCounters: List<WlanPhyFrameStatistics> = List(1) { WlanPhyFrameStatistics() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanStatistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WlanStatistics> {
                override val sizeBytes: Long = 368L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WlanStatistics =
                    WlanStatistics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (WlanMacFrameStatistics.typeLayout()).readNative(addr + 24L),
                        (WlanMacFrameStatistics.typeLayout()).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 216L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(WlanPhyFrameStatistics.typeLayout(), (1).toInt())
                        ).readNative(addr + 224L),
                    )
                override fun writeNative(addr: Long, value: WlanStatistics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ullFourWayHandshakeFailures)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ullTKIPCounterMeasuresInvoked)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.ullReserved)
                    (WlanMacFrameStatistics.typeLayout()).writeNative(addr + 24L, value.macUcastCounters)
                    (WlanMacFrameStatistics.typeLayout()).writeNative(addr + 120L, value.macMcastCounters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 216L, value.dwNumberOfPhys)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(WlanPhyFrameStatistics.typeLayout(), (1).toInt())
                    ).writeNative(addr + 224L, value.phyCounters)
                }
            }
    }
}
