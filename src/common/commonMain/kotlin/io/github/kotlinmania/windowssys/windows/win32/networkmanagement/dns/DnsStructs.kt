@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public data class DnsAaaaData(
    public var ip6Address: Ip6Address = Ip6Address(),
)

public data class DnsAddr(
    public var maxSa: ByteArray = ByteArray(32),
    public var data: DnsAddr0 = DnsAddr0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsAddr) return false
        if (!this.maxSa.contentEquals(other.maxSa)) return false
        if (this.data != other.data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maxSa.contentHashCode()
        result = 31 * result + this.data.hashCode()
        return result
    }
}

public data class DnsAddr0(
    public var dnsAddrUserDword: UIntArray = UIntArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsAddr0) return false
        if (!this.dnsAddrUserDword.contentEquals(other.dnsAddrUserDword)) return false
        return true
    }

    override fun hashCode(): Int = this.dnsAddrUserDword.contentHashCode()
}

public data class DnsAddrArray(
    public var maxCount: UInt = 0u,
    public var addrCount: UInt = 0u,
    public var tag: UInt = 0u,
    public var family: UShort = 0u,
    public var wordReserved: UShort = 0u,
    public var flags: UInt = 0u,
    public var matchFlag: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var reserved2: UInt = 0u,
    public var addrArray: List<DnsAddr> = List(1) { DnsAddr() },
)

public data class DnsApplicationSettings(
    public var version: UInt = 0u,
    public var flags: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsApplicationSettings> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsApplicationSettings> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DnsApplicationSettings =
                    DnsApplicationSettings(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DnsApplicationSettings) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.flags)
                }
            }
    }
}

public data class DnsAtmaData(
    public var addressType: UByte = 0u,
    public var address: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsAtmaData) return false
        if (this.addressType != other.addressType) return false
        if (!this.address.contentEquals(other.address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addressType.hashCode()
        result = 31 * result + this.address.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsAtmaData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsAtmaData> {
                override val sizeBytes: Long = 21L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DnsAtmaData =
                    DnsAtmaData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: DnsAtmaData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.addressType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 1L, value.address)
                }
            }
    }
}

public data class DnsAData(
    public var ipAddress: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsAData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsAData> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DnsAData =
                    DnsAData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DnsAData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ipAddress)
                }
            }
    }
}

public class DnsConnectionIfindexEntry internal constructor(
    pwszConnectionNameCtorArg: Pcwstr,
    public var dwIfIndex: UInt,
) {
    public var pwszConnectionName: Pcwstr = pwszConnectionNameCtorArg
        internal set

    public constructor() : this(
        pwszConnectionNameCtorArg = ConstPtr(0L),
        dwIfIndex = 0u,
    )

    public operator fun component1(): Pcwstr = this.pwszConnectionName

    public operator fun component2(): UInt = this.dwIfIndex

    public fun copy(pwszConnectionName: Pcwstr = this.pwszConnectionName, dwIfIndex: UInt = this.dwIfIndex): DnsConnectionIfindexEntry = DnsConnectionIfindexEntry(pwszConnectionNameCtorArg = pwszConnectionName, dwIfIndex = dwIfIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsConnectionIfindexEntry) return false
        if (this.pwszConnectionName != other.pwszConnectionName) return false
        if (this.dwIfIndex != other.dwIfIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszConnectionName.hashCode()
        result = 31 * result + this.dwIfIndex.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszConnectionName: Pcwstr = ConstPtr(0L),
            dwIfIndex: UInt = 0u,
        ): DnsConnectionIfindexEntry =
            DnsConnectionIfindexEntry(
                pwszConnectionNameCtorArg = pwszConnectionName,
                dwIfIndex = dwIfIndex,
            )
    }
}

public class DnsConnectionIfindexList internal constructor(
    pConnectionIfIndexEntriesCtorArg: MutPtr<DnsConnectionIfindexEntry>,
    public var nEntries: UInt,
) {
    public var pConnectionIfIndexEntries: MutPtr<DnsConnectionIfindexEntry> = pConnectionIfIndexEntriesCtorArg
        internal set

    public constructor() : this(
        pConnectionIfIndexEntriesCtorArg = MutPtr(0L),
        nEntries = 0u,
    )

    public operator fun component1(): MutPtr<DnsConnectionIfindexEntry> = this.pConnectionIfIndexEntries

    public operator fun component2(): UInt = this.nEntries

    public fun copy(pConnectionIfIndexEntries: MutPtr<DnsConnectionIfindexEntry> = this.pConnectionIfIndexEntries, nEntries: UInt = this.nEntries): DnsConnectionIfindexList = DnsConnectionIfindexList(pConnectionIfIndexEntriesCtorArg = pConnectionIfIndexEntries, nEntries = nEntries)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsConnectionIfindexList) return false
        if (this.pConnectionIfIndexEntries != other.pConnectionIfIndexEntries) return false
        if (this.nEntries != other.nEntries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pConnectionIfIndexEntries.hashCode()
        result = 31 * result + this.nEntries.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsConnectionIfindexList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsConnectionIfindexList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DnsConnectionIfindexList =
                    DnsConnectionIfindexList(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DnsConnectionIfindexEntry>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DnsConnectionIfindexList) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DnsConnectionIfindexEntry>(64)
                    ).writeNative(addr, value.pConnectionIfIndexEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nEntries)
                }
            }

        public operator fun invoke(
            pConnectionIfIndexEntries: MutPtr<DnsConnectionIfindexEntry> = MutPtr(0L),
            nEntries: UInt = 0u,
        ): DnsConnectionIfindexList =
            DnsConnectionIfindexList(
                pConnectionIfIndexEntriesCtorArg = pConnectionIfIndexEntries,
                nEntries = nEntries,
            )
    }
}

public data class DnsConnectionName(
    public var wszName: UShortArray = UShortArray(65),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsConnectionName) return false
        if (!this.wszName.contentEquals(other.wszName)) return false
        return true
    }

    override fun hashCode(): Int = this.wszName.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsConnectionName> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsConnectionName> {
                override val sizeBytes: Long = 130L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): DnsConnectionName =
                    DnsConnectionName(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (65).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DnsConnectionName) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (65).toInt())
                    ).writeNative(addr, value.wszName)
                }
            }
    }
}

public class DnsConnectionNameList internal constructor(
    public var cNames: UInt,
    pNamesCtorArg: MutPtr<DnsConnectionName>,
) {
    public var pNames: MutPtr<DnsConnectionName> = pNamesCtorArg
        internal set

    public constructor() : this(
        cNames = 0u,
        pNamesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cNames

    public operator fun component2(): MutPtr<DnsConnectionName> = this.pNames

    public fun copy(cNames: UInt = this.cNames, pNames: MutPtr<DnsConnectionName> = this.pNames): DnsConnectionNameList = DnsConnectionNameList(cNames = cNames, pNamesCtorArg = pNames)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsConnectionNameList) return false
        if (this.cNames != other.cNames) return false
        if (this.pNames != other.pNames) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cNames.hashCode()
        result = 31 * result + this.pNames.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsConnectionNameList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsConnectionNameList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DnsConnectionNameList =
                    DnsConnectionNameList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DnsConnectionName>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DnsConnectionNameList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cNames)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DnsConnectionName>(64)
                    ).writeNative(addr + 8L, value.pNames)
                }
            }

        public operator fun invoke(
            cNames: UInt = 0u,
            pNames: MutPtr<DnsConnectionName> = MutPtr(0L),
        ): DnsConnectionNameList =
            DnsConnectionNameList(
                cNames = cNames,
                pNamesCtorArg = pNames,
            )
    }
}

public class DnsConnectionPolicyEntry internal constructor(
    pwszHostCtorArg: Pcwstr,
    pwszAppIdCtorArg: Pcwstr,
    public var cbAppSid: UInt,
    pbAppSidCtorArg: MutPtr<UByte>,
    public var nConnections: UInt,
    ppwszConnectionsCtorArg: ConstPtr<Pcwstr>,
    public var dwPolicyEntryFlags: UInt,
) {
    public var pwszHost: Pcwstr = pwszHostCtorArg
        internal set

    public var pwszAppId: Pcwstr = pwszAppIdCtorArg
        internal set

    public var pbAppSid: MutPtr<UByte> = pbAppSidCtorArg
        internal set

    public var ppwszConnections: ConstPtr<Pcwstr> = ppwszConnectionsCtorArg
        internal set

    public constructor() : this(
        pwszHostCtorArg = ConstPtr(0L),
        pwszAppIdCtorArg = ConstPtr(0L),
        cbAppSid = 0u,
        pbAppSidCtorArg = MutPtr(0L),
        nConnections = 0u,
        ppwszConnectionsCtorArg = ConstPtr(0L),
        dwPolicyEntryFlags = 0u,
    )

    public operator fun component1(): Pcwstr = this.pwszHost

    public operator fun component2(): Pcwstr = this.pwszAppId

    public operator fun component3(): UInt = this.cbAppSid

    public operator fun component4(): MutPtr<UByte> = this.pbAppSid

    public operator fun component5(): UInt = this.nConnections

    public operator fun component6(): ConstPtr<Pcwstr> = this.ppwszConnections

    public operator fun component7(): UInt = this.dwPolicyEntryFlags

    public fun copy(pwszHost: Pcwstr = this.pwszHost, pwszAppId: Pcwstr = this.pwszAppId, cbAppSid: UInt = this.cbAppSid, pbAppSid: MutPtr<UByte> = this.pbAppSid, nConnections: UInt = this.nConnections, ppwszConnections: ConstPtr<Pcwstr> = this.ppwszConnections, dwPolicyEntryFlags: UInt = this.dwPolicyEntryFlags): DnsConnectionPolicyEntry = DnsConnectionPolicyEntry(pwszHostCtorArg = pwszHost, pwszAppIdCtorArg = pwszAppId, cbAppSid = cbAppSid, pbAppSidCtorArg = pbAppSid, nConnections = nConnections, ppwszConnectionsCtorArg = ppwszConnections, dwPolicyEntryFlags = dwPolicyEntryFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsConnectionPolicyEntry) return false
        if (this.pwszHost != other.pwszHost) return false
        if (this.pwszAppId != other.pwszAppId) return false
        if (this.cbAppSid != other.cbAppSid) return false
        if (this.pbAppSid != other.pbAppSid) return false
        if (this.nConnections != other.nConnections) return false
        if (this.ppwszConnections != other.ppwszConnections) return false
        if (this.dwPolicyEntryFlags != other.dwPolicyEntryFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszHost.hashCode()
        result = 31 * result + this.pwszAppId.hashCode()
        result = 31 * result + this.cbAppSid.hashCode()
        result = 31 * result + this.pbAppSid.hashCode()
        result = 31 * result + this.nConnections.hashCode()
        result = 31 * result + this.ppwszConnections.hashCode()
        result = 31 * result + this.dwPolicyEntryFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszHost: Pcwstr = ConstPtr(0L),
            pwszAppId: Pcwstr = ConstPtr(0L),
            cbAppSid: UInt = 0u,
            pbAppSid: MutPtr<UByte> = MutPtr(0L),
            nConnections: UInt = 0u,
            ppwszConnections: ConstPtr<Pcwstr> = ConstPtr(0L),
            dwPolicyEntryFlags: UInt = 0u,
        ): DnsConnectionPolicyEntry =
            DnsConnectionPolicyEntry(
                pwszHostCtorArg = pwszHost,
                pwszAppIdCtorArg = pwszAppId,
                cbAppSid = cbAppSid,
                pbAppSidCtorArg = pbAppSid,
                nConnections = nConnections,
                ppwszConnectionsCtorArg = ppwszConnections,
                dwPolicyEntryFlags = dwPolicyEntryFlags,
            )
    }
}

public class DnsConnectionPolicyEntryList internal constructor(
    pPolicyEntriesCtorArg: MutPtr<DnsConnectionPolicyEntry>,
    public var nEntries: UInt,
) {
    public var pPolicyEntries: MutPtr<DnsConnectionPolicyEntry> = pPolicyEntriesCtorArg
        internal set

    public constructor() : this(
        pPolicyEntriesCtorArg = MutPtr(0L),
        nEntries = 0u,
    )

    public operator fun component1(): MutPtr<DnsConnectionPolicyEntry> = this.pPolicyEntries

    public operator fun component2(): UInt = this.nEntries

    public fun copy(pPolicyEntries: MutPtr<DnsConnectionPolicyEntry> = this.pPolicyEntries, nEntries: UInt = this.nEntries): DnsConnectionPolicyEntryList = DnsConnectionPolicyEntryList(pPolicyEntriesCtorArg = pPolicyEntries, nEntries = nEntries)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsConnectionPolicyEntryList) return false
        if (this.pPolicyEntries != other.pPolicyEntries) return false
        if (this.nEntries != other.nEntries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pPolicyEntries.hashCode()
        result = 31 * result + this.nEntries.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsConnectionPolicyEntryList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsConnectionPolicyEntryList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DnsConnectionPolicyEntryList =
                    DnsConnectionPolicyEntryList(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DnsConnectionPolicyEntry>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DnsConnectionPolicyEntryList) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DnsConnectionPolicyEntry>(64)
                    ).writeNative(addr, value.pPolicyEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nEntries)
                }
            }

        public operator fun invoke(
            pPolicyEntries: MutPtr<DnsConnectionPolicyEntry> = MutPtr(0L),
            nEntries: UInt = 0u,
        ): DnsConnectionPolicyEntryList =
            DnsConnectionPolicyEntryList(
                pPolicyEntriesCtorArg = pPolicyEntries,
                nEntries = nEntries,
            )
    }
}

public data class DnsConnectionProxyElement(
    public var type: DnsConnectionProxyType = 0,
    public var info: DnsConnectionProxyInfo = DnsConnectionProxyInfo(),
)

public class DnsConnectionProxyInfo internal constructor(
    public var version: UInt,
    pwszFriendlyNameCtorArg: Pwstr,
    public var flags: UInt,
    public var switch: DnsConnectionProxyInfoSwitch,
    public var anonymous: DnsConnectionProxyInfo0,
) {
    public var pwszFriendlyName: Pwstr = pwszFriendlyNameCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        pwszFriendlyNameCtorArg = MutPtr(0L),
        flags = 0u,
        switch = 0,
        anonymous = DnsConnectionProxyInfo0(),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): Pwstr = this.pwszFriendlyName

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): DnsConnectionProxyInfoSwitch = this.switch

    public operator fun component5(): DnsConnectionProxyInfo0 = this.anonymous

    public fun copy(version: UInt = this.version, pwszFriendlyName: Pwstr = this.pwszFriendlyName, flags: UInt = this.flags, switch: DnsConnectionProxyInfoSwitch = this.switch, anonymous: DnsConnectionProxyInfo0 = this.anonymous): DnsConnectionProxyInfo = DnsConnectionProxyInfo(version = version, pwszFriendlyNameCtorArg = pwszFriendlyName, flags = flags, switch = switch, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsConnectionProxyInfo) return false
        if (this.version != other.version) return false
        if (this.pwszFriendlyName != other.pwszFriendlyName) return false
        if (this.flags != other.flags) return false
        if (this.switch != other.switch) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.pwszFriendlyName.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.switch.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            pwszFriendlyName: Pwstr = MutPtr(0L),
            flags: UInt = 0u,
            switch: DnsConnectionProxyInfoSwitch = 0,
            anonymous: DnsConnectionProxyInfo0 = DnsConnectionProxyInfo0(),
        ): DnsConnectionProxyInfo =
            DnsConnectionProxyInfo(
                version = version,
                pwszFriendlyNameCtorArg = pwszFriendlyName,
                flags = flags,
                switch = switch,
                anonymous = anonymous,
            )
    }
}

public data class DnsConnectionProxyInfo0(
    public var config: DnsConnectionProxyInfo00 = DnsConnectionProxyInfo00(),
    public var script: DnsConnectionProxyInfo01 = DnsConnectionProxyInfo01(),
)

public class DnsConnectionProxyInfo00 internal constructor(
    pwszServerCtorArg: Pwstr,
    pwszUsernameCtorArg: Pwstr,
    pwszPasswordCtorArg: Pwstr,
    pwszExceptionCtorArg: Pwstr,
    pwszExtraInfoCtorArg: Pwstr,
    public var port: UShort,
) {
    public var pwszServer: Pwstr = pwszServerCtorArg
        internal set

    public var pwszUsername: Pwstr = pwszUsernameCtorArg
        internal set

    public var pwszPassword: Pwstr = pwszPasswordCtorArg
        internal set

    public var pwszException: Pwstr = pwszExceptionCtorArg
        internal set

    public var pwszExtraInfo: Pwstr = pwszExtraInfoCtorArg
        internal set

    public constructor() : this(
        pwszServerCtorArg = MutPtr(0L),
        pwszUsernameCtorArg = MutPtr(0L),
        pwszPasswordCtorArg = MutPtr(0L),
        pwszExceptionCtorArg = MutPtr(0L),
        pwszExtraInfoCtorArg = MutPtr(0L),
        port = 0u,
    )

    public operator fun component1(): Pwstr = this.pwszServer

    public operator fun component2(): Pwstr = this.pwszUsername

    public operator fun component3(): Pwstr = this.pwszPassword

    public operator fun component4(): Pwstr = this.pwszException

    public operator fun component5(): Pwstr = this.pwszExtraInfo

    public operator fun component6(): UShort = this.port

    public fun copy(pwszServer: Pwstr = this.pwszServer, pwszUsername: Pwstr = this.pwszUsername, pwszPassword: Pwstr = this.pwszPassword, pwszException: Pwstr = this.pwszException, pwszExtraInfo: Pwstr = this.pwszExtraInfo, port: UShort = this.port): DnsConnectionProxyInfo00 = DnsConnectionProxyInfo00(pwszServerCtorArg = pwszServer, pwszUsernameCtorArg = pwszUsername, pwszPasswordCtorArg = pwszPassword, pwszExceptionCtorArg = pwszException, pwszExtraInfoCtorArg = pwszExtraInfo, port = port)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsConnectionProxyInfo00) return false
        if (this.pwszServer != other.pwszServer) return false
        if (this.pwszUsername != other.pwszUsername) return false
        if (this.pwszPassword != other.pwszPassword) return false
        if (this.pwszException != other.pwszException) return false
        if (this.pwszExtraInfo != other.pwszExtraInfo) return false
        if (this.port != other.port) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszServer.hashCode()
        result = 31 * result + this.pwszUsername.hashCode()
        result = 31 * result + this.pwszPassword.hashCode()
        result = 31 * result + this.pwszException.hashCode()
        result = 31 * result + this.pwszExtraInfo.hashCode()
        result = 31 * result + this.port.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszServer: Pwstr = MutPtr(0L),
            pwszUsername: Pwstr = MutPtr(0L),
            pwszPassword: Pwstr = MutPtr(0L),
            pwszException: Pwstr = MutPtr(0L),
            pwszExtraInfo: Pwstr = MutPtr(0L),
            port: UShort = 0u,
        ): DnsConnectionProxyInfo00 =
            DnsConnectionProxyInfo00(
                pwszServerCtorArg = pwszServer,
                pwszUsernameCtorArg = pwszUsername,
                pwszPasswordCtorArg = pwszPassword,
                pwszExceptionCtorArg = pwszException,
                pwszExtraInfoCtorArg = pwszExtraInfo,
                port = port,
            )
    }
}

public class DnsConnectionProxyInfo01 internal constructor(
    pwszScriptCtorArg: Pwstr,
    pwszUsernameCtorArg: Pwstr,
    pwszPasswordCtorArg: Pwstr,
) {
    public var pwszScript: Pwstr = pwszScriptCtorArg
        internal set

    public var pwszUsername: Pwstr = pwszUsernameCtorArg
        internal set

    public var pwszPassword: Pwstr = pwszPasswordCtorArg
        internal set

    public constructor() : this(
        pwszScriptCtorArg = MutPtr(0L),
        pwszUsernameCtorArg = MutPtr(0L),
        pwszPasswordCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pwszScript

    public operator fun component2(): Pwstr = this.pwszUsername

    public operator fun component3(): Pwstr = this.pwszPassword

    public fun copy(pwszScript: Pwstr = this.pwszScript, pwszUsername: Pwstr = this.pwszUsername, pwszPassword: Pwstr = this.pwszPassword): DnsConnectionProxyInfo01 = DnsConnectionProxyInfo01(pwszScriptCtorArg = pwszScript, pwszUsernameCtorArg = pwszUsername, pwszPasswordCtorArg = pwszPassword)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsConnectionProxyInfo01) return false
        if (this.pwszScript != other.pwszScript) return false
        if (this.pwszUsername != other.pwszUsername) return false
        if (this.pwszPassword != other.pwszPassword) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszScript.hashCode()
        result = 31 * result + this.pwszUsername.hashCode()
        result = 31 * result + this.pwszPassword.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszScript: Pwstr = MutPtr(0L),
            pwszUsername: Pwstr = MutPtr(0L),
            pwszPassword: Pwstr = MutPtr(0L),
        ): DnsConnectionProxyInfo01 =
            DnsConnectionProxyInfo01(
                pwszScriptCtorArg = pwszScript,
                pwszUsernameCtorArg = pwszUsername,
                pwszPasswordCtorArg = pwszPassword,
            )
    }
}

public class DnsConnectionProxyInfoEx internal constructor(
    public var proxyInfo: DnsConnectionProxyInfo,
    public var dwInterfaceIndex: UInt,
    pwszConnectionNameCtorArg: Pwstr,
    public var fDirectConfiguration: Bool,
    hConnectionCtorArg: Handle,
) {
    public var pwszConnectionName: Pwstr = pwszConnectionNameCtorArg
        internal set

    public var hConnection: Handle = hConnectionCtorArg
        internal set

    public constructor() : this(
        proxyInfo = DnsConnectionProxyInfo(),
        dwInterfaceIndex = 0u,
        pwszConnectionNameCtorArg = MutPtr(0L),
        fDirectConfiguration = 0,
        hConnectionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): DnsConnectionProxyInfo = this.proxyInfo

    public operator fun component2(): UInt = this.dwInterfaceIndex

    public operator fun component3(): Pwstr = this.pwszConnectionName

    public operator fun component4(): Bool = this.fDirectConfiguration

    public operator fun component5(): Handle = this.hConnection

    public fun copy(proxyInfo: DnsConnectionProxyInfo = this.proxyInfo, dwInterfaceIndex: UInt = this.dwInterfaceIndex, pwszConnectionName: Pwstr = this.pwszConnectionName, fDirectConfiguration: Bool = this.fDirectConfiguration, hConnection: Handle = this.hConnection): DnsConnectionProxyInfoEx = DnsConnectionProxyInfoEx(proxyInfo = proxyInfo, dwInterfaceIndex = dwInterfaceIndex, pwszConnectionNameCtorArg = pwszConnectionName, fDirectConfiguration = fDirectConfiguration, hConnectionCtorArg = hConnection)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsConnectionProxyInfoEx) return false
        if (this.proxyInfo != other.proxyInfo) return false
        if (this.dwInterfaceIndex != other.dwInterfaceIndex) return false
        if (this.pwszConnectionName != other.pwszConnectionName) return false
        if (this.fDirectConfiguration != other.fDirectConfiguration) return false
        if (this.hConnection != other.hConnection) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.proxyInfo.hashCode()
        result = 31 * result + this.dwInterfaceIndex.hashCode()
        result = 31 * result + this.pwszConnectionName.hashCode()
        result = 31 * result + this.fDirectConfiguration.hashCode()
        result = 31 * result + this.hConnection.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            proxyInfo: DnsConnectionProxyInfo = DnsConnectionProxyInfo(),
            dwInterfaceIndex: UInt = 0u,
            pwszConnectionName: Pwstr = MutPtr(0L),
            fDirectConfiguration: Bool = 0,
            hConnection: Handle = MutPtr(0L),
        ): DnsConnectionProxyInfoEx =
            DnsConnectionProxyInfoEx(
                proxyInfo = proxyInfo,
                dwInterfaceIndex = dwInterfaceIndex,
                pwszConnectionNameCtorArg = pwszConnectionName,
                fDirectConfiguration = fDirectConfiguration,
                hConnectionCtorArg = hConnection,
            )
    }
}

public class DnsConnectionProxyList internal constructor(
    public var cProxies: UInt,
    pProxiesCtorArg: MutPtr<DnsConnectionProxyElement>,
) {
    public var pProxies: MutPtr<DnsConnectionProxyElement> = pProxiesCtorArg
        internal set

    public constructor() : this(
        cProxies = 0u,
        pProxiesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cProxies

    public operator fun component2(): MutPtr<DnsConnectionProxyElement> = this.pProxies

    public fun copy(cProxies: UInt = this.cProxies, pProxies: MutPtr<DnsConnectionProxyElement> = this.pProxies): DnsConnectionProxyList = DnsConnectionProxyList(cProxies = cProxies, pProxiesCtorArg = pProxies)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsConnectionProxyList) return false
        if (this.cProxies != other.cProxies) return false
        if (this.pProxies != other.pProxies) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cProxies.hashCode()
        result = 31 * result + this.pProxies.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsConnectionProxyList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsConnectionProxyList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DnsConnectionProxyList =
                    DnsConnectionProxyList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DnsConnectionProxyElement>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DnsConnectionProxyList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cProxies)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DnsConnectionProxyElement>(64)
                    ).writeNative(addr + 8L, value.pProxies)
                }
            }

        public operator fun invoke(
            cProxies: UInt = 0u,
            pProxies: MutPtr<DnsConnectionProxyElement> = MutPtr(0L),
        ): DnsConnectionProxyList =
            DnsConnectionProxyList(
                cProxies = cProxies,
                pProxiesCtorArg = pProxies,
            )
    }
}

public data class DnsCustomServer(
    public var dwServerType: UInt = 0u,
    public var ullFlags: ULong = 0uL,
    public var anonymous1: DnsCustomServer0 = DnsCustomServer0(),
    public var anonymous2: DnsCustomServer1 = DnsCustomServer1(),
)

public class DnsCustomServer0 internal constructor(
    pwszTemplateCtorArg: Pwstr,
) {
    public var pwszTemplate: Pwstr = pwszTemplateCtorArg
        internal set

    public constructor() : this(
        pwszTemplateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pwszTemplate

    public fun copy(pwszTemplate: Pwstr = this.pwszTemplate): DnsCustomServer0 = DnsCustomServer0(pwszTemplateCtorArg = pwszTemplate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsCustomServer0) return false
        if (this.pwszTemplate != other.pwszTemplate) return false
        return true
    }

    override fun hashCode(): Int = this.pwszTemplate.hashCode()

    public companion object {
        public operator fun invoke(
            pwszTemplate: Pwstr = MutPtr(0L),
        ): DnsCustomServer0 =
            DnsCustomServer0(
                pwszTemplateCtorArg = pwszTemplate,
            )
    }
}

public data class DnsCustomServer1(
    public var maxSa: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsCustomServer1) return false
        if (!this.maxSa.contentEquals(other.maxSa)) return false
        return true
    }

    override fun hashCode(): Int = this.maxSa.contentHashCode()
}

public data class DnsDhcidData(
    public var dwByteCount: UInt = 0u,
    public var dhcid: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsDhcidData) return false
        if (this.dwByteCount != other.dwByteCount) return false
        if (!this.dhcid.contentEquals(other.dhcid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwByteCount.hashCode()
        result = 31 * result + this.dhcid.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsDhcidData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsDhcidData> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DnsDhcidData =
                    DnsDhcidData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DnsDhcidData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwByteCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.dhcid)
                }
            }
    }
}

public data class DnsDsData(
    public var wKeyTag: UShort = 0u,
    public var chAlgorithm: UByte = 0u,
    public var chDigestType: UByte = 0u,
    public var wDigestLength: UShort = 0u,
    public var wPad: UShort = 0u,
    public var digest: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsDsData) return false
        if (this.wKeyTag != other.wKeyTag) return false
        if (this.chAlgorithm != other.chAlgorithm) return false
        if (this.chDigestType != other.chDigestType) return false
        if (this.wDigestLength != other.wDigestLength) return false
        if (this.wPad != other.wPad) return false
        if (!this.digest.contentEquals(other.digest)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wKeyTag.hashCode()
        result = 31 * result + this.chAlgorithm.hashCode()
        result = 31 * result + this.chDigestType.hashCode()
        result = 31 * result + this.wDigestLength.hashCode()
        result = 31 * result + this.wPad.hashCode()
        result = 31 * result + this.digest.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsDsData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsDsData> {
                override val sizeBytes: Long = 10L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): DnsDsData =
                    DnsDsData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DnsDsData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wKeyTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.chAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.chDigestType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wDigestLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wPad)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.digest)
                }
            }
    }
}

public data class DnsHeader(
    public var xid: UShort = 0u,
    public var bitfield1: UByte = 0u,
    public var bitfield2: UByte = 0u,
    public var questionCount: UShort = 0u,
    public var answerCount: UShort = 0u,
    public var nameServerCount: UShort = 0u,
    public var additionalCount: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsHeader> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DnsHeader =
                    DnsHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: DnsHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.xid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.bitfield1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.bitfield2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.questionCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.answerCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.nameServerCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.additionalCount)
                }
            }
    }
}

public data class DnsHeaderExt(
    public var bitfield: UShort = 0u,
    public var chRcode: UByte = 0u,
    public var chVersion: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsHeaderExt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsHeaderExt> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DnsHeaderExt =
                    DnsHeaderExt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: DnsHeaderExt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.chRcode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.chVersion)
                }
            }
    }
}

public data class DnsKeyData(
    public var wFlags: UShort = 0u,
    public var chProtocol: UByte = 0u,
    public var chAlgorithm: UByte = 0u,
    public var wKeyLength: UShort = 0u,
    public var wPad: UShort = 0u,
    public var key: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsKeyData) return false
        if (this.wFlags != other.wFlags) return false
        if (this.chProtocol != other.chProtocol) return false
        if (this.chAlgorithm != other.chAlgorithm) return false
        if (this.wKeyLength != other.wKeyLength) return false
        if (this.wPad != other.wPad) return false
        if (!this.key.contentEquals(other.key)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wFlags.hashCode()
        result = 31 * result + this.chProtocol.hashCode()
        result = 31 * result + this.chAlgorithm.hashCode()
        result = 31 * result + this.wKeyLength.hashCode()
        result = 31 * result + this.wPad.hashCode()
        result = 31 * result + this.key.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsKeyData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsKeyData> {
                override val sizeBytes: Long = 10L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): DnsKeyData =
                    DnsKeyData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DnsKeyData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.chProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.chAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wKeyLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wPad)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.key)
                }
            }
    }
}

public data class DnsLocData(
    public var wVersion: UShort = 0u,
    public var wSize: UShort = 0u,
    public var wHorPrec: UShort = 0u,
    public var wVerPrec: UShort = 0u,
    public var dwLatitude: UInt = 0u,
    public var dwLongitude: UInt = 0u,
    public var dwAltitude: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsLocData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsLocData> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DnsLocData =
                    DnsLocData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DnsLocData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wHorPrec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wVerPrec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwLatitude)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwLongitude)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwAltitude)
                }
            }
    }
}

public data class DnsMessageBuffer(
    public var messageHead: DnsHeader = DnsHeader(),
    public var messageBody: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsMessageBuffer) return false
        if (this.messageHead != other.messageHead) return false
        if (!this.messageBody.contentEquals(other.messageBody)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageHead.hashCode()
        result = 31 * result + this.messageBody.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsMessageBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsMessageBuffer> {
                override val sizeBytes: Long = 13L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DnsMessageBuffer =
                    DnsMessageBuffer(
                        (DnsHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: DnsMessageBuffer) {
                    (DnsHeader.typeLayout()).writeNative(addr, value.messageHead)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                    ).writeNative(addr + 12L, value.messageBody)
                }
            }
    }
}

public class DnsMinfoDataa internal constructor(
    pNameMailboxCtorArg: Pstr,
    pNameErrorsMailboxCtorArg: Pstr,
) {
    public var pNameMailbox: Pstr = pNameMailboxCtorArg
        internal set

    public var pNameErrorsMailbox: Pstr = pNameErrorsMailboxCtorArg
        internal set

    public constructor() : this(
        pNameMailboxCtorArg = MutPtr(0L),
        pNameErrorsMailboxCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.pNameMailbox

    public operator fun component2(): Pstr = this.pNameErrorsMailbox

    public fun copy(pNameMailbox: Pstr = this.pNameMailbox, pNameErrorsMailbox: Pstr = this.pNameErrorsMailbox): DnsMinfoDataa = DnsMinfoDataa(pNameMailboxCtorArg = pNameMailbox, pNameErrorsMailboxCtorArg = pNameErrorsMailbox)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsMinfoDataa) return false
        if (this.pNameMailbox != other.pNameMailbox) return false
        if (this.pNameErrorsMailbox != other.pNameErrorsMailbox) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNameMailbox.hashCode()
        result = 31 * result + this.pNameErrorsMailbox.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pNameMailbox: Pstr = MutPtr(0L),
            pNameErrorsMailbox: Pstr = MutPtr(0L),
        ): DnsMinfoDataa =
            DnsMinfoDataa(
                pNameMailboxCtorArg = pNameMailbox,
                pNameErrorsMailboxCtorArg = pNameErrorsMailbox,
            )
    }
}

public class DnsMinfoDataw internal constructor(
    pNameMailboxCtorArg: Pwstr,
    pNameErrorsMailboxCtorArg: Pwstr,
) {
    public var pNameMailbox: Pwstr = pNameMailboxCtorArg
        internal set

    public var pNameErrorsMailbox: Pwstr = pNameErrorsMailboxCtorArg
        internal set

    public constructor() : this(
        pNameMailboxCtorArg = MutPtr(0L),
        pNameErrorsMailboxCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pNameMailbox

    public operator fun component2(): Pwstr = this.pNameErrorsMailbox

    public fun copy(pNameMailbox: Pwstr = this.pNameMailbox, pNameErrorsMailbox: Pwstr = this.pNameErrorsMailbox): DnsMinfoDataw = DnsMinfoDataw(pNameMailboxCtorArg = pNameMailbox, pNameErrorsMailboxCtorArg = pNameErrorsMailbox)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsMinfoDataw) return false
        if (this.pNameMailbox != other.pNameMailbox) return false
        if (this.pNameErrorsMailbox != other.pNameErrorsMailbox) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNameMailbox.hashCode()
        result = 31 * result + this.pNameErrorsMailbox.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pNameMailbox: Pwstr = MutPtr(0L),
            pNameErrorsMailbox: Pwstr = MutPtr(0L),
        ): DnsMinfoDataw =
            DnsMinfoDataw(
                pNameMailboxCtorArg = pNameMailbox,
                pNameErrorsMailboxCtorArg = pNameErrorsMailbox,
            )
    }
}

public class DnsMxDataa internal constructor(
    pNameExchangeCtorArg: Pstr,
    public var wPreference: UShort,
    public var pad: UShort,
) {
    public var pNameExchange: Pstr = pNameExchangeCtorArg
        internal set

    public constructor() : this(
        pNameExchangeCtorArg = MutPtr(0L),
        wPreference = 0u,
        pad = 0u,
    )

    public operator fun component1(): Pstr = this.pNameExchange

    public operator fun component2(): UShort = this.wPreference

    public operator fun component3(): UShort = this.pad

    public fun copy(pNameExchange: Pstr = this.pNameExchange, wPreference: UShort = this.wPreference, pad: UShort = this.pad): DnsMxDataa = DnsMxDataa(pNameExchangeCtorArg = pNameExchange, wPreference = wPreference, pad = pad)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsMxDataa) return false
        if (this.pNameExchange != other.pNameExchange) return false
        if (this.wPreference != other.wPreference) return false
        if (this.pad != other.pad) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNameExchange.hashCode()
        result = 31 * result + this.wPreference.hashCode()
        result = 31 * result + this.pad.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pNameExchange: Pstr = MutPtr(0L),
            wPreference: UShort = 0u,
            pad: UShort = 0u,
        ): DnsMxDataa =
            DnsMxDataa(
                pNameExchangeCtorArg = pNameExchange,
                wPreference = wPreference,
                pad = pad,
            )
    }
}

public class DnsMxDataw internal constructor(
    pNameExchangeCtorArg: Pwstr,
    public var wPreference: UShort,
    public var pad: UShort,
) {
    public var pNameExchange: Pwstr = pNameExchangeCtorArg
        internal set

    public constructor() : this(
        pNameExchangeCtorArg = MutPtr(0L),
        wPreference = 0u,
        pad = 0u,
    )

    public operator fun component1(): Pwstr = this.pNameExchange

    public operator fun component2(): UShort = this.wPreference

    public operator fun component3(): UShort = this.pad

    public fun copy(pNameExchange: Pwstr = this.pNameExchange, wPreference: UShort = this.wPreference, pad: UShort = this.pad): DnsMxDataw = DnsMxDataw(pNameExchangeCtorArg = pNameExchange, wPreference = wPreference, pad = pad)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsMxDataw) return false
        if (this.pNameExchange != other.pNameExchange) return false
        if (this.wPreference != other.wPreference) return false
        if (this.pad != other.pad) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNameExchange.hashCode()
        result = 31 * result + this.wPreference.hashCode()
        result = 31 * result + this.pad.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pNameExchange: Pwstr = MutPtr(0L),
            wPreference: UShort = 0u,
            pad: UShort = 0u,
        ): DnsMxDataw =
            DnsMxDataw(
                pNameExchangeCtorArg = pNameExchange,
                wPreference = wPreference,
                pad = pad,
            )
    }
}

public class DnsNaptrDataa internal constructor(
    public var wOrder: UShort,
    public var wPreference: UShort,
    pFlagsCtorArg: Pstr,
    pServiceCtorArg: Pstr,
    pRegularExpressionCtorArg: Pstr,
    pReplacementCtorArg: Pstr,
) {
    public var pFlags: Pstr = pFlagsCtorArg
        internal set

    public var pService: Pstr = pServiceCtorArg
        internal set

    public var pRegularExpression: Pstr = pRegularExpressionCtorArg
        internal set

    public var pReplacement: Pstr = pReplacementCtorArg
        internal set

    public constructor() : this(
        wOrder = 0u,
        wPreference = 0u,
        pFlagsCtorArg = MutPtr(0L),
        pServiceCtorArg = MutPtr(0L),
        pRegularExpressionCtorArg = MutPtr(0L),
        pReplacementCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.wOrder

    public operator fun component2(): UShort = this.wPreference

    public operator fun component3(): Pstr = this.pFlags

    public operator fun component4(): Pstr = this.pService

    public operator fun component5(): Pstr = this.pRegularExpression

    public operator fun component6(): Pstr = this.pReplacement

    public fun copy(wOrder: UShort = this.wOrder, wPreference: UShort = this.wPreference, pFlags: Pstr = this.pFlags, pService: Pstr = this.pService, pRegularExpression: Pstr = this.pRegularExpression, pReplacement: Pstr = this.pReplacement): DnsNaptrDataa = DnsNaptrDataa(wOrder = wOrder, wPreference = wPreference, pFlagsCtorArg = pFlags, pServiceCtorArg = pService, pRegularExpressionCtorArg = pRegularExpression, pReplacementCtorArg = pReplacement)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsNaptrDataa) return false
        if (this.wOrder != other.wOrder) return false
        if (this.wPreference != other.wPreference) return false
        if (this.pFlags != other.pFlags) return false
        if (this.pService != other.pService) return false
        if (this.pRegularExpression != other.pRegularExpression) return false
        if (this.pReplacement != other.pReplacement) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wOrder.hashCode()
        result = 31 * result + this.wPreference.hashCode()
        result = 31 * result + this.pFlags.hashCode()
        result = 31 * result + this.pService.hashCode()
        result = 31 * result + this.pRegularExpression.hashCode()
        result = 31 * result + this.pReplacement.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wOrder: UShort = 0u,
            wPreference: UShort = 0u,
            pFlags: Pstr = MutPtr(0L),
            pService: Pstr = MutPtr(0L),
            pRegularExpression: Pstr = MutPtr(0L),
            pReplacement: Pstr = MutPtr(0L),
        ): DnsNaptrDataa =
            DnsNaptrDataa(
                wOrder = wOrder,
                wPreference = wPreference,
                pFlagsCtorArg = pFlags,
                pServiceCtorArg = pService,
                pRegularExpressionCtorArg = pRegularExpression,
                pReplacementCtorArg = pReplacement,
            )
    }
}

public class DnsNaptrDataw internal constructor(
    public var wOrder: UShort,
    public var wPreference: UShort,
    pFlagsCtorArg: Pwstr,
    pServiceCtorArg: Pwstr,
    pRegularExpressionCtorArg: Pwstr,
    pReplacementCtorArg: Pwstr,
) {
    public var pFlags: Pwstr = pFlagsCtorArg
        internal set

    public var pService: Pwstr = pServiceCtorArg
        internal set

    public var pRegularExpression: Pwstr = pRegularExpressionCtorArg
        internal set

    public var pReplacement: Pwstr = pReplacementCtorArg
        internal set

    public constructor() : this(
        wOrder = 0u,
        wPreference = 0u,
        pFlagsCtorArg = MutPtr(0L),
        pServiceCtorArg = MutPtr(0L),
        pRegularExpressionCtorArg = MutPtr(0L),
        pReplacementCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.wOrder

    public operator fun component2(): UShort = this.wPreference

    public operator fun component3(): Pwstr = this.pFlags

    public operator fun component4(): Pwstr = this.pService

    public operator fun component5(): Pwstr = this.pRegularExpression

    public operator fun component6(): Pwstr = this.pReplacement

    public fun copy(wOrder: UShort = this.wOrder, wPreference: UShort = this.wPreference, pFlags: Pwstr = this.pFlags, pService: Pwstr = this.pService, pRegularExpression: Pwstr = this.pRegularExpression, pReplacement: Pwstr = this.pReplacement): DnsNaptrDataw = DnsNaptrDataw(wOrder = wOrder, wPreference = wPreference, pFlagsCtorArg = pFlags, pServiceCtorArg = pService, pRegularExpressionCtorArg = pRegularExpression, pReplacementCtorArg = pReplacement)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsNaptrDataw) return false
        if (this.wOrder != other.wOrder) return false
        if (this.wPreference != other.wPreference) return false
        if (this.pFlags != other.pFlags) return false
        if (this.pService != other.pService) return false
        if (this.pRegularExpression != other.pRegularExpression) return false
        if (this.pReplacement != other.pReplacement) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wOrder.hashCode()
        result = 31 * result + this.wPreference.hashCode()
        result = 31 * result + this.pFlags.hashCode()
        result = 31 * result + this.pService.hashCode()
        result = 31 * result + this.pRegularExpression.hashCode()
        result = 31 * result + this.pReplacement.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wOrder: UShort = 0u,
            wPreference: UShort = 0u,
            pFlags: Pwstr = MutPtr(0L),
            pService: Pwstr = MutPtr(0L),
            pRegularExpression: Pwstr = MutPtr(0L),
            pReplacement: Pwstr = MutPtr(0L),
        ): DnsNaptrDataw =
            DnsNaptrDataw(
                wOrder = wOrder,
                wPreference = wPreference,
                pFlagsCtorArg = pFlags,
                pServiceCtorArg = pService,
                pRegularExpressionCtorArg = pRegularExpression,
                pReplacementCtorArg = pReplacement,
            )
    }
}

public data class DnsNsec3paramData(
    public var chAlgorithm: UByte = 0u,
    public var bFlags: UByte = 0u,
    public var wIterations: UShort = 0u,
    public var bSaltLength: UByte = 0u,
    public var bPad: UByteArray = UByteArray(3),
    public var pbSalt: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsNsec3paramData) return false
        if (this.chAlgorithm != other.chAlgorithm) return false
        if (this.bFlags != other.bFlags) return false
        if (this.wIterations != other.wIterations) return false
        if (this.bSaltLength != other.bSaltLength) return false
        if (!this.bPad.contentEquals(other.bPad)) return false
        if (!this.pbSalt.contentEquals(other.pbSalt)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.chAlgorithm.hashCode()
        result = 31 * result + this.bFlags.hashCode()
        result = 31 * result + this.wIterations.hashCode()
        result = 31 * result + this.bSaltLength.hashCode()
        result = 31 * result + this.bPad.contentHashCode()
        result = 31 * result + this.pbSalt.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsNsec3paramData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsNsec3paramData> {
                override val sizeBytes: Long = 10L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): DnsNsec3paramData =
                    DnsNsec3paramData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 5L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DnsNsec3paramData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.chAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wIterations)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.bSaltLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 5L, value.bPad)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.pbSalt)
                }
            }
    }
}

public data class DnsNsec3Data(
    public var chAlgorithm: UByte = 0u,
    public var bFlags: UByte = 0u,
    public var wIterations: UShort = 0u,
    public var bSaltLength: UByte = 0u,
    public var bHashLength: UByte = 0u,
    public var wTypeBitMapsLength: UShort = 0u,
    public var chData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsNsec3Data) return false
        if (this.chAlgorithm != other.chAlgorithm) return false
        if (this.bFlags != other.bFlags) return false
        if (this.wIterations != other.wIterations) return false
        if (this.bSaltLength != other.bSaltLength) return false
        if (this.bHashLength != other.bHashLength) return false
        if (this.wTypeBitMapsLength != other.wTypeBitMapsLength) return false
        if (!this.chData.contentEquals(other.chData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.chAlgorithm.hashCode()
        result = 31 * result + this.bFlags.hashCode()
        result = 31 * result + this.wIterations.hashCode()
        result = 31 * result + this.bSaltLength.hashCode()
        result = 31 * result + this.bHashLength.hashCode()
        result = 31 * result + this.wTypeBitMapsLength.hashCode()
        result = 31 * result + this.chData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsNsec3Data> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsNsec3Data> {
                override val sizeBytes: Long = 10L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): DnsNsec3Data =
                    DnsNsec3Data(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DnsNsec3Data) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.chAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wIterations)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.bSaltLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.bHashLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wTypeBitMapsLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.chData)
                }
            }
    }
}

public class DnsNsecDataa internal constructor(
    pNextDomainNameCtorArg: Pstr,
    public var wTypeBitMapsLength: UShort,
    public var wPad: UShort,
    public var typeBitMaps: UByteArray,
) {
    public var pNextDomainName: Pstr = pNextDomainNameCtorArg
        internal set

    public constructor() : this(
        pNextDomainNameCtorArg = MutPtr(0L),
        wTypeBitMapsLength = 0u,
        wPad = 0u,
        typeBitMaps = UByteArray(1),
    )

    public operator fun component1(): Pstr = this.pNextDomainName

    public operator fun component2(): UShort = this.wTypeBitMapsLength

    public operator fun component3(): UShort = this.wPad

    public operator fun component4(): UByteArray = this.typeBitMaps

    public fun copy(pNextDomainName: Pstr = this.pNextDomainName, wTypeBitMapsLength: UShort = this.wTypeBitMapsLength, wPad: UShort = this.wPad, typeBitMaps: UByteArray = this.typeBitMaps): DnsNsecDataa = DnsNsecDataa(pNextDomainNameCtorArg = pNextDomainName, wTypeBitMapsLength = wTypeBitMapsLength, wPad = wPad, typeBitMaps = typeBitMaps)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsNsecDataa) return false
        if (this.pNextDomainName != other.pNextDomainName) return false
        if (this.wTypeBitMapsLength != other.wTypeBitMapsLength) return false
        if (this.wPad != other.wPad) return false
        if (!this.typeBitMaps.contentEquals(other.typeBitMaps)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNextDomainName.hashCode()
        result = 31 * result + this.wTypeBitMapsLength.hashCode()
        result = 31 * result + this.wPad.hashCode()
        result = 31 * result + this.typeBitMaps.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pNextDomainName: Pstr = MutPtr(0L),
            wTypeBitMapsLength: UShort = 0u,
            wPad: UShort = 0u,
            typeBitMaps: UByteArray = UByteArray(1),
        ): DnsNsecDataa =
            DnsNsecDataa(
                pNextDomainNameCtorArg = pNextDomainName,
                wTypeBitMapsLength = wTypeBitMapsLength,
                wPad = wPad,
                typeBitMaps = typeBitMaps,
            )
    }
}

public class DnsNsecDataw internal constructor(
    pNextDomainNameCtorArg: Pwstr,
    public var wTypeBitMapsLength: UShort,
    public var wPad: UShort,
    public var typeBitMaps: UByteArray,
) {
    public var pNextDomainName: Pwstr = pNextDomainNameCtorArg
        internal set

    public constructor() : this(
        pNextDomainNameCtorArg = MutPtr(0L),
        wTypeBitMapsLength = 0u,
        wPad = 0u,
        typeBitMaps = UByteArray(1),
    )

    public operator fun component1(): Pwstr = this.pNextDomainName

    public operator fun component2(): UShort = this.wTypeBitMapsLength

    public operator fun component3(): UShort = this.wPad

    public operator fun component4(): UByteArray = this.typeBitMaps

    public fun copy(pNextDomainName: Pwstr = this.pNextDomainName, wTypeBitMapsLength: UShort = this.wTypeBitMapsLength, wPad: UShort = this.wPad, typeBitMaps: UByteArray = this.typeBitMaps): DnsNsecDataw = DnsNsecDataw(pNextDomainNameCtorArg = pNextDomainName, wTypeBitMapsLength = wTypeBitMapsLength, wPad = wPad, typeBitMaps = typeBitMaps)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsNsecDataw) return false
        if (this.pNextDomainName != other.pNextDomainName) return false
        if (this.wTypeBitMapsLength != other.wTypeBitMapsLength) return false
        if (this.wPad != other.wPad) return false
        if (!this.typeBitMaps.contentEquals(other.typeBitMaps)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNextDomainName.hashCode()
        result = 31 * result + this.wTypeBitMapsLength.hashCode()
        result = 31 * result + this.wPad.hashCode()
        result = 31 * result + this.typeBitMaps.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pNextDomainName: Pwstr = MutPtr(0L),
            wTypeBitMapsLength: UShort = 0u,
            wPad: UShort = 0u,
            typeBitMaps: UByteArray = UByteArray(1),
        ): DnsNsecDataw =
            DnsNsecDataw(
                pNextDomainNameCtorArg = pNextDomainName,
                wTypeBitMapsLength = wTypeBitMapsLength,
                wPad = wPad,
                typeBitMaps = typeBitMaps,
            )
    }
}

public data class DnsNullData(
    public var dwByteCount: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsNullData) return false
        if (this.dwByteCount != other.dwByteCount) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwByteCount.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsNullData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsNullData> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DnsNullData =
                    DnsNullData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DnsNullData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwByteCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.data)
                }
            }
    }
}

public class DnsNxtDataa internal constructor(
    pNameNextCtorArg: Pstr,
    public var wNumTypes: UShort,
    public var wTypes: UShortArray,
) {
    public var pNameNext: Pstr = pNameNextCtorArg
        internal set

    public constructor() : this(
        pNameNextCtorArg = MutPtr(0L),
        wNumTypes = 0u,
        wTypes = UShortArray(1),
    )

    public operator fun component1(): Pstr = this.pNameNext

    public operator fun component2(): UShort = this.wNumTypes

    public operator fun component3(): UShortArray = this.wTypes

    public fun copy(pNameNext: Pstr = this.pNameNext, wNumTypes: UShort = this.wNumTypes, wTypes: UShortArray = this.wTypes): DnsNxtDataa = DnsNxtDataa(pNameNextCtorArg = pNameNext, wNumTypes = wNumTypes, wTypes = wTypes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsNxtDataa) return false
        if (this.pNameNext != other.pNameNext) return false
        if (this.wNumTypes != other.wNumTypes) return false
        if (!this.wTypes.contentEquals(other.wTypes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNameNext.hashCode()
        result = 31 * result + this.wNumTypes.hashCode()
        result = 31 * result + this.wTypes.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pNameNext: Pstr = MutPtr(0L),
            wNumTypes: UShort = 0u,
            wTypes: UShortArray = UShortArray(1),
        ): DnsNxtDataa =
            DnsNxtDataa(
                pNameNextCtorArg = pNameNext,
                wNumTypes = wNumTypes,
                wTypes = wTypes,
            )
    }
}

public class DnsNxtDataw internal constructor(
    pNameNextCtorArg: Pwstr,
    public var wNumTypes: UShort,
    public var wTypes: UShortArray,
) {
    public var pNameNext: Pwstr = pNameNextCtorArg
        internal set

    public constructor() : this(
        pNameNextCtorArg = MutPtr(0L),
        wNumTypes = 0u,
        wTypes = UShortArray(1),
    )

    public operator fun component1(): Pwstr = this.pNameNext

    public operator fun component2(): UShort = this.wNumTypes

    public operator fun component3(): UShortArray = this.wTypes

    public fun copy(pNameNext: Pwstr = this.pNameNext, wNumTypes: UShort = this.wNumTypes, wTypes: UShortArray = this.wTypes): DnsNxtDataw = DnsNxtDataw(pNameNextCtorArg = pNameNext, wNumTypes = wNumTypes, wTypes = wTypes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsNxtDataw) return false
        if (this.pNameNext != other.pNameNext) return false
        if (this.wNumTypes != other.wNumTypes) return false
        if (!this.wTypes.contentEquals(other.wTypes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNameNext.hashCode()
        result = 31 * result + this.wNumTypes.hashCode()
        result = 31 * result + this.wTypes.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pNameNext: Pwstr = MutPtr(0L),
            wNumTypes: UShort = 0u,
            wTypes: UShortArray = UShortArray(1),
        ): DnsNxtDataw =
            DnsNxtDataw(
                pNameNextCtorArg = pNameNext,
                wNumTypes = wNumTypes,
                wTypes = wTypes,
            )
    }
}

public data class DnsOptData(
    public var wDataLength: UShort = 0u,
    public var wPad: UShort = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsOptData) return false
        if (this.wDataLength != other.wDataLength) return false
        if (this.wPad != other.wPad) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wDataLength.hashCode()
        result = 31 * result + this.wPad.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsOptData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsOptData> {
                override val sizeBytes: Long = 6L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): DnsOptData =
                    DnsOptData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DnsOptData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wDataLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wPad)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.data)
                }
            }
    }
}

public class DnsProxyInformation internal constructor(
    public var version: UInt,
    public var proxyInformationType: DnsProxyInformationType,
    proxyNameCtorArg: Pwstr,
) {
    public var proxyName: Pwstr = proxyNameCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        proxyInformationType = 0,
        proxyNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): DnsProxyInformationType = this.proxyInformationType

    public operator fun component3(): Pwstr = this.proxyName

    public fun copy(version: UInt = this.version, proxyInformationType: DnsProxyInformationType = this.proxyInformationType, proxyName: Pwstr = this.proxyName): DnsProxyInformation = DnsProxyInformation(version = version, proxyInformationType = proxyInformationType, proxyNameCtorArg = proxyName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsProxyInformation) return false
        if (this.version != other.version) return false
        if (this.proxyInformationType != other.proxyInformationType) return false
        if (this.proxyName != other.proxyName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.proxyInformationType.hashCode()
        result = 31 * result + this.proxyName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            proxyInformationType: DnsProxyInformationType = 0,
            proxyName: Pwstr = MutPtr(0L),
        ): DnsProxyInformation =
            DnsProxyInformation(
                version = version,
                proxyInformationType = proxyInformationType,
                proxyNameCtorArg = proxyName,
            )
    }
}

public class DnsPtrDataa internal constructor(
    pNameHostCtorArg: Pstr,
) {
    public var pNameHost: Pstr = pNameHostCtorArg
        internal set

    public constructor() : this(
        pNameHostCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.pNameHost

    public fun copy(pNameHost: Pstr = this.pNameHost): DnsPtrDataa = DnsPtrDataa(pNameHostCtorArg = pNameHost)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsPtrDataa) return false
        if (this.pNameHost != other.pNameHost) return false
        return true
    }

    override fun hashCode(): Int = this.pNameHost.hashCode()

    public companion object {
        public operator fun invoke(
            pNameHost: Pstr = MutPtr(0L),
        ): DnsPtrDataa =
            DnsPtrDataa(
                pNameHostCtorArg = pNameHost,
            )
    }
}

public class DnsPtrDataw internal constructor(
    pNameHostCtorArg: Pwstr,
) {
    public var pNameHost: Pwstr = pNameHostCtorArg
        internal set

    public constructor() : this(
        pNameHostCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.pNameHost

    public fun copy(pNameHost: Pwstr = this.pNameHost): DnsPtrDataw = DnsPtrDataw(pNameHostCtorArg = pNameHost)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsPtrDataw) return false
        if (this.pNameHost != other.pNameHost) return false
        return true
    }

    override fun hashCode(): Int = this.pNameHost.hashCode()

    public companion object {
        public operator fun invoke(
            pNameHost: Pwstr = MutPtr(0L),
        ): DnsPtrDataw =
            DnsPtrDataw(
                pNameHostCtorArg = pNameHost,
            )
    }
}

public data class DnsQueryCancel(
    public var reserved: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsQueryCancel) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int = this.reserved.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsQueryCancel> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsQueryCancel> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DnsQueryCancel =
                    DnsQueryCancel(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DnsQueryCancel) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr, value.reserved)
                }
            }
    }
}

public data class DnsQueryRawCancel(
    public var reserved: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsQueryRawCancel) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int = this.reserved.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsQueryRawCancel> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsQueryRawCancel> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DnsQueryRawCancel =
                    DnsQueryRawCancel(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DnsQueryRawCancel) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr, value.reserved)
                }
            }
    }
}

public class DnsQueryRawRequest internal constructor(
    public var version: UInt,
    public var resultsVersion: UInt,
    public var dnsQueryRawSize: UInt,
    dnsQueryRawCtorArg: MutPtr<UByte>,
    dnsQueryNameCtorArg: Pwstr,
    public var dnsQueryType: UShort,
    public var queryOptions: ULong,
    public var interfaceIndex: UInt,
    public var queryCompletionCallback: DnsQueryRawCompletionRoutine,
    queryContextCtorArg: MutPtr<CVoid>,
    public var queryRawOptions: ULong,
    public var customServersSize: UInt,
    customServersCtorArg: MutPtr<DnsCustomServer>,
    public var protocol: UInt,
    public var anonymous: DnsQueryRawRequest0,
) {
    public var dnsQueryRaw: MutPtr<UByte> = dnsQueryRawCtorArg
        internal set

    public var dnsQueryName: Pwstr = dnsQueryNameCtorArg
        internal set

    public var queryContext: MutPtr<CVoid> = queryContextCtorArg
        internal set

    public var customServers: MutPtr<DnsCustomServer> = customServersCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        resultsVersion = 0u,
        dnsQueryRawSize = 0u,
        dnsQueryRawCtorArg = MutPtr(0L),
        dnsQueryNameCtorArg = MutPtr(0L),
        dnsQueryType = 0u,
        queryOptions = 0uL,
        interfaceIndex = 0u,
        queryCompletionCallback = null,
        queryContextCtorArg = MutPtr(0L),
        queryRawOptions = 0uL,
        customServersSize = 0u,
        customServersCtorArg = MutPtr(0L),
        protocol = 0u,
        anonymous = DnsQueryRawRequest0(),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UInt = this.resultsVersion

    public operator fun component3(): UInt = this.dnsQueryRawSize

    public operator fun component4(): MutPtr<UByte> = this.dnsQueryRaw

    public operator fun component5(): Pwstr = this.dnsQueryName

    public operator fun component6(): UShort = this.dnsQueryType

    public operator fun component7(): ULong = this.queryOptions

    public operator fun component8(): UInt = this.interfaceIndex

    public operator fun component9(): DnsQueryRawCompletionRoutine = this.queryCompletionCallback

    public operator fun component10(): MutPtr<CVoid> = this.queryContext

    public operator fun component11(): ULong = this.queryRawOptions

    public operator fun component12(): UInt = this.customServersSize

    public operator fun component13(): MutPtr<DnsCustomServer> = this.customServers

    public operator fun component14(): UInt = this.protocol

    public operator fun component15(): DnsQueryRawRequest0 = this.anonymous

    public fun copy(version: UInt = this.version, resultsVersion: UInt = this.resultsVersion, dnsQueryRawSize: UInt = this.dnsQueryRawSize, dnsQueryRaw: MutPtr<UByte> = this.dnsQueryRaw, dnsQueryName: Pwstr = this.dnsQueryName, dnsQueryType: UShort = this.dnsQueryType, queryOptions: ULong = this.queryOptions, interfaceIndex: UInt = this.interfaceIndex, queryCompletionCallback: DnsQueryRawCompletionRoutine = this.queryCompletionCallback, queryContext: MutPtr<CVoid> = this.queryContext, queryRawOptions: ULong = this.queryRawOptions, customServersSize: UInt = this.customServersSize, customServers: MutPtr<DnsCustomServer> = this.customServers, protocol: UInt = this.protocol, anonymous: DnsQueryRawRequest0 = this.anonymous): DnsQueryRawRequest = DnsQueryRawRequest(version = version, resultsVersion = resultsVersion, dnsQueryRawSize = dnsQueryRawSize, dnsQueryRawCtorArg = dnsQueryRaw, dnsQueryNameCtorArg = dnsQueryName, dnsQueryType = dnsQueryType, queryOptions = queryOptions, interfaceIndex = interfaceIndex, queryCompletionCallback = queryCompletionCallback, queryContextCtorArg = queryContext, queryRawOptions = queryRawOptions, customServersSize = customServersSize, customServersCtorArg = customServers, protocol = protocol, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsQueryRawRequest) return false
        if (this.version != other.version) return false
        if (this.resultsVersion != other.resultsVersion) return false
        if (this.dnsQueryRawSize != other.dnsQueryRawSize) return false
        if (this.dnsQueryRaw != other.dnsQueryRaw) return false
        if (this.dnsQueryName != other.dnsQueryName) return false
        if (this.dnsQueryType != other.dnsQueryType) return false
        if (this.queryOptions != other.queryOptions) return false
        if (this.interfaceIndex != other.interfaceIndex) return false
        if (this.queryCompletionCallback != other.queryCompletionCallback) return false
        if (this.queryContext != other.queryContext) return false
        if (this.queryRawOptions != other.queryRawOptions) return false
        if (this.customServersSize != other.customServersSize) return false
        if (this.customServers != other.customServers) return false
        if (this.protocol != other.protocol) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.resultsVersion.hashCode()
        result = 31 * result + this.dnsQueryRawSize.hashCode()
        result = 31 * result + this.dnsQueryRaw.hashCode()
        result = 31 * result + this.dnsQueryName.hashCode()
        result = 31 * result + this.dnsQueryType.hashCode()
        result = 31 * result + this.queryOptions.hashCode()
        result = 31 * result + this.interfaceIndex.hashCode()
        result = 31 * result + this.queryCompletionCallback.hashCode()
        result = 31 * result + this.queryContext.hashCode()
        result = 31 * result + this.queryRawOptions.hashCode()
        result = 31 * result + this.customServersSize.hashCode()
        result = 31 * result + this.customServers.hashCode()
        result = 31 * result + this.protocol.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            resultsVersion: UInt = 0u,
            dnsQueryRawSize: UInt = 0u,
            dnsQueryRaw: MutPtr<UByte> = MutPtr(0L),
            dnsQueryName: Pwstr = MutPtr(0L),
            dnsQueryType: UShort = 0u,
            queryOptions: ULong = 0uL,
            interfaceIndex: UInt = 0u,
            queryCompletionCallback: DnsQueryRawCompletionRoutine = null,
            queryContext: MutPtr<CVoid> = MutPtr(0L),
            queryRawOptions: ULong = 0uL,
            customServersSize: UInt = 0u,
            customServers: MutPtr<DnsCustomServer> = MutPtr(0L),
            protocol: UInt = 0u,
            anonymous: DnsQueryRawRequest0 = DnsQueryRawRequest0(),
        ): DnsQueryRawRequest =
            DnsQueryRawRequest(
                version = version,
                resultsVersion = resultsVersion,
                dnsQueryRawSize = dnsQueryRawSize,
                dnsQueryRawCtorArg = dnsQueryRaw,
                dnsQueryNameCtorArg = dnsQueryName,
                dnsQueryType = dnsQueryType,
                queryOptions = queryOptions,
                interfaceIndex = interfaceIndex,
                queryCompletionCallback = queryCompletionCallback,
                queryContextCtorArg = queryContext,
                queryRawOptions = queryRawOptions,
                customServersSize = customServersSize,
                customServersCtorArg = customServers,
                protocol = protocol,
                anonymous = anonymous,
            )
    }
}

public data class DnsQueryRawRequest0(
    public var maxSa: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsQueryRawRequest0) return false
        if (!this.maxSa.contentEquals(other.maxSa)) return false
        return true
    }

    override fun hashCode(): Int = this.maxSa.contentHashCode()
}

public class DnsQueryRawResult internal constructor(
    public var version: UInt,
    public var queryStatus: Int,
    public var queryOptions: ULong,
    public var queryRawOptions: ULong,
    public var responseFlags: ULong,
    public var queryRawResponseSize: UInt,
    queryRawResponseCtorArg: MutPtr<UByte>,
    queryRecordsCtorArg: MutPtr<DnsRecorda>,
    public var protocol: UInt,
    public var anonymous: DnsQueryRawResult0,
) {
    public var queryRawResponse: MutPtr<UByte> = queryRawResponseCtorArg
        internal set

    public var queryRecords: MutPtr<DnsRecorda> = queryRecordsCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        queryStatus = 0,
        queryOptions = 0uL,
        queryRawOptions = 0uL,
        responseFlags = 0uL,
        queryRawResponseSize = 0u,
        queryRawResponseCtorArg = MutPtr(0L),
        queryRecordsCtorArg = MutPtr(0L),
        protocol = 0u,
        anonymous = DnsQueryRawResult0(),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): Int = this.queryStatus

    public operator fun component3(): ULong = this.queryOptions

    public operator fun component4(): ULong = this.queryRawOptions

    public operator fun component5(): ULong = this.responseFlags

    public operator fun component6(): UInt = this.queryRawResponseSize

    public operator fun component7(): MutPtr<UByte> = this.queryRawResponse

    public operator fun component8(): MutPtr<DnsRecorda> = this.queryRecords

    public operator fun component9(): UInt = this.protocol

    public operator fun component10(): DnsQueryRawResult0 = this.anonymous

    public fun copy(version: UInt = this.version, queryStatus: Int = this.queryStatus, queryOptions: ULong = this.queryOptions, queryRawOptions: ULong = this.queryRawOptions, responseFlags: ULong = this.responseFlags, queryRawResponseSize: UInt = this.queryRawResponseSize, queryRawResponse: MutPtr<UByte> = this.queryRawResponse, queryRecords: MutPtr<DnsRecorda> = this.queryRecords, protocol: UInt = this.protocol, anonymous: DnsQueryRawResult0 = this.anonymous): DnsQueryRawResult = DnsQueryRawResult(version = version, queryStatus = queryStatus, queryOptions = queryOptions, queryRawOptions = queryRawOptions, responseFlags = responseFlags, queryRawResponseSize = queryRawResponseSize, queryRawResponseCtorArg = queryRawResponse, queryRecordsCtorArg = queryRecords, protocol = protocol, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsQueryRawResult) return false
        if (this.version != other.version) return false
        if (this.queryStatus != other.queryStatus) return false
        if (this.queryOptions != other.queryOptions) return false
        if (this.queryRawOptions != other.queryRawOptions) return false
        if (this.responseFlags != other.responseFlags) return false
        if (this.queryRawResponseSize != other.queryRawResponseSize) return false
        if (this.queryRawResponse != other.queryRawResponse) return false
        if (this.queryRecords != other.queryRecords) return false
        if (this.protocol != other.protocol) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.queryStatus.hashCode()
        result = 31 * result + this.queryOptions.hashCode()
        result = 31 * result + this.queryRawOptions.hashCode()
        result = 31 * result + this.responseFlags.hashCode()
        result = 31 * result + this.queryRawResponseSize.hashCode()
        result = 31 * result + this.queryRawResponse.hashCode()
        result = 31 * result + this.queryRecords.hashCode()
        result = 31 * result + this.protocol.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            queryStatus: Int = 0,
            queryOptions: ULong = 0uL,
            queryRawOptions: ULong = 0uL,
            responseFlags: ULong = 0uL,
            queryRawResponseSize: UInt = 0u,
            queryRawResponse: MutPtr<UByte> = MutPtr(0L),
            queryRecords: MutPtr<DnsRecorda> = MutPtr(0L),
            protocol: UInt = 0u,
            anonymous: DnsQueryRawResult0 = DnsQueryRawResult0(),
        ): DnsQueryRawResult =
            DnsQueryRawResult(
                version = version,
                queryStatus = queryStatus,
                queryOptions = queryOptions,
                queryRawOptions = queryRawOptions,
                responseFlags = responseFlags,
                queryRawResponseSize = queryRawResponseSize,
                queryRawResponseCtorArg = queryRawResponse,
                queryRecordsCtorArg = queryRecords,
                protocol = protocol,
                anonymous = anonymous,
            )
    }
}

public data class DnsQueryRawResult0(
    public var maxSa: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsQueryRawResult0) return false
        if (!this.maxSa.contentEquals(other.maxSa)) return false
        return true
    }

    override fun hashCode(): Int = this.maxSa.contentHashCode()
}

public class DnsQueryRequest internal constructor(
    public var version: UInt,
    queryNameCtorArg: Pcwstr,
    public var queryType: UShort,
    public var queryOptions: ULong,
    pDnsServerListCtorArg: MutPtr<DnsAddrArray>,
    public var interfaceIndex: UInt,
    public var pQueryCompletionCallback: PdnsQueryCompletionRoutine,
    pQueryContextCtorArg: MutPtr<CVoid>,
) {
    public var queryName: Pcwstr = queryNameCtorArg
        internal set

    public var pDnsServerList: MutPtr<DnsAddrArray> = pDnsServerListCtorArg
        internal set

    public var pQueryContext: MutPtr<CVoid> = pQueryContextCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        queryNameCtorArg = ConstPtr(0L),
        queryType = 0u,
        queryOptions = 0uL,
        pDnsServerListCtorArg = MutPtr(0L),
        interfaceIndex = 0u,
        pQueryCompletionCallback = null,
        pQueryContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): Pcwstr = this.queryName

    public operator fun component3(): UShort = this.queryType

    public operator fun component4(): ULong = this.queryOptions

    public operator fun component5(): MutPtr<DnsAddrArray> = this.pDnsServerList

    public operator fun component6(): UInt = this.interfaceIndex

    public operator fun component7(): PdnsQueryCompletionRoutine = this.pQueryCompletionCallback

    public operator fun component8(): MutPtr<CVoid> = this.pQueryContext

    public fun copy(version: UInt = this.version, queryName: Pcwstr = this.queryName, queryType: UShort = this.queryType, queryOptions: ULong = this.queryOptions, pDnsServerList: MutPtr<DnsAddrArray> = this.pDnsServerList, interfaceIndex: UInt = this.interfaceIndex, pQueryCompletionCallback: PdnsQueryCompletionRoutine = this.pQueryCompletionCallback, pQueryContext: MutPtr<CVoid> = this.pQueryContext): DnsQueryRequest = DnsQueryRequest(version = version, queryNameCtorArg = queryName, queryType = queryType, queryOptions = queryOptions, pDnsServerListCtorArg = pDnsServerList, interfaceIndex = interfaceIndex, pQueryCompletionCallback = pQueryCompletionCallback, pQueryContextCtorArg = pQueryContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsQueryRequest) return false
        if (this.version != other.version) return false
        if (this.queryName != other.queryName) return false
        if (this.queryType != other.queryType) return false
        if (this.queryOptions != other.queryOptions) return false
        if (this.pDnsServerList != other.pDnsServerList) return false
        if (this.interfaceIndex != other.interfaceIndex) return false
        if (this.pQueryCompletionCallback != other.pQueryCompletionCallback) return false
        if (this.pQueryContext != other.pQueryContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.queryName.hashCode()
        result = 31 * result + this.queryType.hashCode()
        result = 31 * result + this.queryOptions.hashCode()
        result = 31 * result + this.pDnsServerList.hashCode()
        result = 31 * result + this.interfaceIndex.hashCode()
        result = 31 * result + this.pQueryCompletionCallback.hashCode()
        result = 31 * result + this.pQueryContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            queryName: Pcwstr = ConstPtr(0L),
            queryType: UShort = 0u,
            queryOptions: ULong = 0uL,
            pDnsServerList: MutPtr<DnsAddrArray> = MutPtr(0L),
            interfaceIndex: UInt = 0u,
            pQueryCompletionCallback: PdnsQueryCompletionRoutine = null,
            pQueryContext: MutPtr<CVoid> = MutPtr(0L),
        ): DnsQueryRequest =
            DnsQueryRequest(
                version = version,
                queryNameCtorArg = queryName,
                queryType = queryType,
                queryOptions = queryOptions,
                pDnsServerListCtorArg = pDnsServerList,
                interfaceIndex = interfaceIndex,
                pQueryCompletionCallback = pQueryCompletionCallback,
                pQueryContextCtorArg = pQueryContext,
            )
    }
}

public class DnsQueryRequest3 internal constructor(
    public var version: UInt,
    queryNameCtorArg: Pcwstr,
    public var queryType: UShort,
    public var queryOptions: ULong,
    pDnsServerListCtorArg: MutPtr<DnsAddrArray>,
    public var interfaceIndex: UInt,
    public var pQueryCompletionCallback: PdnsQueryCompletionRoutine,
    pQueryContextCtorArg: MutPtr<CVoid>,
    public var isNetworkQueryRequired: Bool,
    public var requiredNetworkIndex: UInt,
    public var cCustomServers: UInt,
    pCustomServersCtorArg: MutPtr<DnsCustomServer>,
) {
    public var queryName: Pcwstr = queryNameCtorArg
        internal set

    public var pDnsServerList: MutPtr<DnsAddrArray> = pDnsServerListCtorArg
        internal set

    public var pQueryContext: MutPtr<CVoid> = pQueryContextCtorArg
        internal set

    public var pCustomServers: MutPtr<DnsCustomServer> = pCustomServersCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        queryNameCtorArg = ConstPtr(0L),
        queryType = 0u,
        queryOptions = 0uL,
        pDnsServerListCtorArg = MutPtr(0L),
        interfaceIndex = 0u,
        pQueryCompletionCallback = null,
        pQueryContextCtorArg = MutPtr(0L),
        isNetworkQueryRequired = 0,
        requiredNetworkIndex = 0u,
        cCustomServers = 0u,
        pCustomServersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): Pcwstr = this.queryName

    public operator fun component3(): UShort = this.queryType

    public operator fun component4(): ULong = this.queryOptions

    public operator fun component5(): MutPtr<DnsAddrArray> = this.pDnsServerList

    public operator fun component6(): UInt = this.interfaceIndex

    public operator fun component7(): PdnsQueryCompletionRoutine = this.pQueryCompletionCallback

    public operator fun component8(): MutPtr<CVoid> = this.pQueryContext

    public operator fun component9(): Bool = this.isNetworkQueryRequired

    public operator fun component10(): UInt = this.requiredNetworkIndex

    public operator fun component11(): UInt = this.cCustomServers

    public operator fun component12(): MutPtr<DnsCustomServer> = this.pCustomServers

    public fun copy(version: UInt = this.version, queryName: Pcwstr = this.queryName, queryType: UShort = this.queryType, queryOptions: ULong = this.queryOptions, pDnsServerList: MutPtr<DnsAddrArray> = this.pDnsServerList, interfaceIndex: UInt = this.interfaceIndex, pQueryCompletionCallback: PdnsQueryCompletionRoutine = this.pQueryCompletionCallback, pQueryContext: MutPtr<CVoid> = this.pQueryContext, isNetworkQueryRequired: Bool = this.isNetworkQueryRequired, requiredNetworkIndex: UInt = this.requiredNetworkIndex, cCustomServers: UInt = this.cCustomServers, pCustomServers: MutPtr<DnsCustomServer> = this.pCustomServers): DnsQueryRequest3 = DnsQueryRequest3(version = version, queryNameCtorArg = queryName, queryType = queryType, queryOptions = queryOptions, pDnsServerListCtorArg = pDnsServerList, interfaceIndex = interfaceIndex, pQueryCompletionCallback = pQueryCompletionCallback, pQueryContextCtorArg = pQueryContext, isNetworkQueryRequired = isNetworkQueryRequired, requiredNetworkIndex = requiredNetworkIndex, cCustomServers = cCustomServers, pCustomServersCtorArg = pCustomServers)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsQueryRequest3) return false
        if (this.version != other.version) return false
        if (this.queryName != other.queryName) return false
        if (this.queryType != other.queryType) return false
        if (this.queryOptions != other.queryOptions) return false
        if (this.pDnsServerList != other.pDnsServerList) return false
        if (this.interfaceIndex != other.interfaceIndex) return false
        if (this.pQueryCompletionCallback != other.pQueryCompletionCallback) return false
        if (this.pQueryContext != other.pQueryContext) return false
        if (this.isNetworkQueryRequired != other.isNetworkQueryRequired) return false
        if (this.requiredNetworkIndex != other.requiredNetworkIndex) return false
        if (this.cCustomServers != other.cCustomServers) return false
        if (this.pCustomServers != other.pCustomServers) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.queryName.hashCode()
        result = 31 * result + this.queryType.hashCode()
        result = 31 * result + this.queryOptions.hashCode()
        result = 31 * result + this.pDnsServerList.hashCode()
        result = 31 * result + this.interfaceIndex.hashCode()
        result = 31 * result + this.pQueryCompletionCallback.hashCode()
        result = 31 * result + this.pQueryContext.hashCode()
        result = 31 * result + this.isNetworkQueryRequired.hashCode()
        result = 31 * result + this.requiredNetworkIndex.hashCode()
        result = 31 * result + this.cCustomServers.hashCode()
        result = 31 * result + this.pCustomServers.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            queryName: Pcwstr = ConstPtr(0L),
            queryType: UShort = 0u,
            queryOptions: ULong = 0uL,
            pDnsServerList: MutPtr<DnsAddrArray> = MutPtr(0L),
            interfaceIndex: UInt = 0u,
            pQueryCompletionCallback: PdnsQueryCompletionRoutine = null,
            pQueryContext: MutPtr<CVoid> = MutPtr(0L),
            isNetworkQueryRequired: Bool = 0,
            requiredNetworkIndex: UInt = 0u,
            cCustomServers: UInt = 0u,
            pCustomServers: MutPtr<DnsCustomServer> = MutPtr(0L),
        ): DnsQueryRequest3 =
            DnsQueryRequest3(
                version = version,
                queryNameCtorArg = queryName,
                queryType = queryType,
                queryOptions = queryOptions,
                pDnsServerListCtorArg = pDnsServerList,
                interfaceIndex = interfaceIndex,
                pQueryCompletionCallback = pQueryCompletionCallback,
                pQueryContextCtorArg = pQueryContext,
                isNetworkQueryRequired = isNetworkQueryRequired,
                requiredNetworkIndex = requiredNetworkIndex,
                cCustomServers = cCustomServers,
                pCustomServersCtorArg = pCustomServers,
            )
    }
}

public class DnsQueryResult internal constructor(
    public var version: UInt,
    public var queryStatus: Int,
    public var queryOptions: ULong,
    pQueryRecordsCtorArg: MutPtr<DnsRecorda>,
    reservedCtorArg: MutPtr<CVoid>,
) {
    public var pQueryRecords: MutPtr<DnsRecorda> = pQueryRecordsCtorArg
        internal set

    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        queryStatus = 0,
        queryOptions = 0uL,
        pQueryRecordsCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): Int = this.queryStatus

    public operator fun component3(): ULong = this.queryOptions

    public operator fun component4(): MutPtr<DnsRecorda> = this.pQueryRecords

    public operator fun component5(): MutPtr<CVoid> = this.reserved

    public fun copy(version: UInt = this.version, queryStatus: Int = this.queryStatus, queryOptions: ULong = this.queryOptions, pQueryRecords: MutPtr<DnsRecorda> = this.pQueryRecords, reserved: MutPtr<CVoid> = this.reserved): DnsQueryResult = DnsQueryResult(version = version, queryStatus = queryStatus, queryOptions = queryOptions, pQueryRecordsCtorArg = pQueryRecords, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsQueryResult) return false
        if (this.version != other.version) return false
        if (this.queryStatus != other.queryStatus) return false
        if (this.queryOptions != other.queryOptions) return false
        if (this.pQueryRecords != other.pQueryRecords) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.queryStatus.hashCode()
        result = 31 * result + this.queryOptions.hashCode()
        result = 31 * result + this.pQueryRecords.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsQueryResult> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsQueryResult> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DnsQueryResult =
                    DnsQueryResult(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DnsRecorda>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: DnsQueryResult) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.queryStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.queryOptions)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DnsRecorda>(64)
                    ).writeNative(addr + 16L, value.pQueryRecords)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.reserved)
                }
            }

        public operator fun invoke(
            version: UInt = 0u,
            queryStatus: Int = 0,
            queryOptions: ULong = 0uL,
            pQueryRecords: MutPtr<DnsRecorda> = MutPtr(0L),
            reserved: MutPtr<CVoid> = MutPtr(0L),
        ): DnsQueryResult =
            DnsQueryResult(
                version = version,
                queryStatus = queryStatus,
                queryOptions = queryOptions,
                pQueryRecordsCtorArg = pQueryRecords,
                reservedCtorArg = reserved,
            )
    }
}

public class DnsRecorda internal constructor(
    pNextCtorArg: MutPtr<DnsRecorda>,
    pNameCtorArg: Pstr,
    public var wType: UShort,
    public var wDataLength: UShort,
    public var flags: DnsRecorda0,
    public var dwTtl: UInt,
    public var dwReserved: UInt,
    public var data: DnsRecorda1,
) {
    public var pNext: MutPtr<DnsRecorda> = pNextCtorArg
        internal set

    public var pName: Pstr = pNameCtorArg
        internal set

    public constructor() : this(
        pNextCtorArg = MutPtr(0L),
        pNameCtorArg = MutPtr(0L),
        wType = 0u,
        wDataLength = 0u,
        flags = DnsRecorda0(),
        dwTtl = 0u,
        dwReserved = 0u,
        data = DnsRecorda1(),
    )

    public operator fun component1(): MutPtr<DnsRecorda> = this.pNext

    public operator fun component2(): Pstr = this.pName

    public operator fun component3(): UShort = this.wType

    public operator fun component4(): UShort = this.wDataLength

    public operator fun component5(): DnsRecorda0 = this.flags

    public operator fun component6(): UInt = this.dwTtl

    public operator fun component7(): UInt = this.dwReserved

    public operator fun component8(): DnsRecorda1 = this.data

    public fun copy(pNext: MutPtr<DnsRecorda> = this.pNext, pName: Pstr = this.pName, wType: UShort = this.wType, wDataLength: UShort = this.wDataLength, flags: DnsRecorda0 = this.flags, dwTtl: UInt = this.dwTtl, dwReserved: UInt = this.dwReserved, data: DnsRecorda1 = this.data): DnsRecorda = DnsRecorda(pNextCtorArg = pNext, pNameCtorArg = pName, wType = wType, wDataLength = wDataLength, flags = flags, dwTtl = dwTtl, dwReserved = dwReserved, data = data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsRecorda) return false
        if (this.pNext != other.pNext) return false
        if (this.pName != other.pName) return false
        if (this.wType != other.wType) return false
        if (this.wDataLength != other.wDataLength) return false
        if (this.flags != other.flags) return false
        if (this.dwTtl != other.dwTtl) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.data != other.data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNext.hashCode()
        result = 31 * result + this.pName.hashCode()
        result = 31 * result + this.wType.hashCode()
        result = 31 * result + this.wDataLength.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.dwTtl.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.data.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pNext: MutPtr<DnsRecorda> = MutPtr(0L),
            pName: Pstr = MutPtr(0L),
            wType: UShort = 0u,
            wDataLength: UShort = 0u,
            flags: DnsRecorda0 = DnsRecorda0(),
            dwTtl: UInt = 0u,
            dwReserved: UInt = 0u,
            data: DnsRecorda1 = DnsRecorda1(),
        ): DnsRecorda =
            DnsRecorda(
                pNextCtorArg = pNext,
                pNameCtorArg = pName,
                wType = wType,
                wDataLength = wDataLength,
                flags = flags,
                dwTtl = dwTtl,
                dwReserved = dwReserved,
                data = data,
            )
    }
}

public class DnsRecorda1 internal constructor(
    public var a: DnsAData,
    public var soa: DnsSoaDataa,
    public var ptr: DnsPtrDataa,
    public var ns: DnsPtrDataa,
    public var cname: DnsPtrDataa,
    public var dname: DnsPtrDataa,
    public var mb: DnsPtrDataa,
    public var md: DnsPtrDataa,
    public var mf: DnsPtrDataa,
    public var mg: DnsPtrDataa,
    public var mr: DnsPtrDataa,
    public var minfo: DnsMinfoDataa,
    public var rp: DnsMinfoDataa,
    public var mx: DnsMxDataa,
    public var afsdb: DnsMxDataa,
    public var rt: DnsMxDataa,
    public var hinfo: DnsTxtDataa,
    public var isdn: DnsTxtDataa,
    public var txt: DnsTxtDataa,
    public var x25: DnsTxtDataa,
    public var nullVal: DnsNullData,
    public var wks: DnsWksData,
    public var aaaa: DnsAaaaData,
    public var key: DnsKeyData,
    public var sig: DnsSigDataa,
    public var atma: DnsAtmaData,
    public var nxt: DnsNxtDataa,
    public var srv: DnsSrvDataa,
    public var naptr: DnsNaptrDataa,
    public var opt: DnsOptData,
    public var ds: DnsDsData,
    public var rrsig: DnsSigDataa,
    public var nsec: DnsNsecDataa,
    public var dnskey: DnsKeyData,
    public var tkey: DnsTkeyDataa,
    public var tsig: DnsTsigDataa,
    public var wins: DnsWinsData,
    public var winsr: DnsWinsrDataa,
    public var winsR: DnsWinsrDataa,
    public var nbstat: DnsWinsrDataa,
    public var dhcid: DnsDhcidData,
    public var nsec3: DnsNsec3Data,
    public var nsec3param: DnsNsec3paramData,
    public var nsec3Param: DnsNsec3paramData,
    public var tlsa: DnsTlsaData,
    public var svcb: DnsSvcbData,
    public var unknown: DnsUnknownData,
    pDataPtrCtorArg: MutPtr<UByte>,
) {
    public var pDataPtr: MutPtr<UByte> = pDataPtrCtorArg
        internal set

    public constructor() : this(
        a = DnsAData(),
        soa = DnsSoaDataa(),
        ptr = DnsPtrDataa(),
        ns = DnsPtrDataa(),
        cname = DnsPtrDataa(),
        dname = DnsPtrDataa(),
        mb = DnsPtrDataa(),
        md = DnsPtrDataa(),
        mf = DnsPtrDataa(),
        mg = DnsPtrDataa(),
        mr = DnsPtrDataa(),
        minfo = DnsMinfoDataa(),
        rp = DnsMinfoDataa(),
        mx = DnsMxDataa(),
        afsdb = DnsMxDataa(),
        rt = DnsMxDataa(),
        hinfo = DnsTxtDataa(),
        isdn = DnsTxtDataa(),
        txt = DnsTxtDataa(),
        x25 = DnsTxtDataa(),
        nullVal = DnsNullData(),
        wks = DnsWksData(),
        aaaa = DnsAaaaData(),
        key = DnsKeyData(),
        sig = DnsSigDataa(),
        atma = DnsAtmaData(),
        nxt = DnsNxtDataa(),
        srv = DnsSrvDataa(),
        naptr = DnsNaptrDataa(),
        opt = DnsOptData(),
        ds = DnsDsData(),
        rrsig = DnsSigDataa(),
        nsec = DnsNsecDataa(),
        dnskey = DnsKeyData(),
        tkey = DnsTkeyDataa(),
        tsig = DnsTsigDataa(),
        wins = DnsWinsData(),
        winsr = DnsWinsrDataa(),
        winsR = DnsWinsrDataa(),
        nbstat = DnsWinsrDataa(),
        dhcid = DnsDhcidData(),
        nsec3 = DnsNsec3Data(),
        nsec3param = DnsNsec3paramData(),
        nsec3Param = DnsNsec3paramData(),
        tlsa = DnsTlsaData(),
        svcb = DnsSvcbData(),
        unknown = DnsUnknownData(),
        pDataPtrCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            a: DnsAData = DnsAData(),
            soa: DnsSoaDataa = DnsSoaDataa(),
            ptr: DnsPtrDataa = DnsPtrDataa(),
            ns: DnsPtrDataa = DnsPtrDataa(),
            cname: DnsPtrDataa = DnsPtrDataa(),
            dname: DnsPtrDataa = DnsPtrDataa(),
            mb: DnsPtrDataa = DnsPtrDataa(),
            md: DnsPtrDataa = DnsPtrDataa(),
            mf: DnsPtrDataa = DnsPtrDataa(),
            mg: DnsPtrDataa = DnsPtrDataa(),
            mr: DnsPtrDataa = DnsPtrDataa(),
            minfo: DnsMinfoDataa = DnsMinfoDataa(),
            rp: DnsMinfoDataa = DnsMinfoDataa(),
            mx: DnsMxDataa = DnsMxDataa(),
            afsdb: DnsMxDataa = DnsMxDataa(),
            rt: DnsMxDataa = DnsMxDataa(),
            hinfo: DnsTxtDataa = DnsTxtDataa(),
            isdn: DnsTxtDataa = DnsTxtDataa(),
            txt: DnsTxtDataa = DnsTxtDataa(),
            x25: DnsTxtDataa = DnsTxtDataa(),
            nullVal: DnsNullData = DnsNullData(),
            wks: DnsWksData = DnsWksData(),
            aaaa: DnsAaaaData = DnsAaaaData(),
            key: DnsKeyData = DnsKeyData(),
            sig: DnsSigDataa = DnsSigDataa(),
            atma: DnsAtmaData = DnsAtmaData(),
            nxt: DnsNxtDataa = DnsNxtDataa(),
            srv: DnsSrvDataa = DnsSrvDataa(),
            naptr: DnsNaptrDataa = DnsNaptrDataa(),
            opt: DnsOptData = DnsOptData(),
            ds: DnsDsData = DnsDsData(),
            rrsig: DnsSigDataa = DnsSigDataa(),
            nsec: DnsNsecDataa = DnsNsecDataa(),
            dnskey: DnsKeyData = DnsKeyData(),
            tkey: DnsTkeyDataa = DnsTkeyDataa(),
            tsig: DnsTsigDataa = DnsTsigDataa(),
            wins: DnsWinsData = DnsWinsData(),
            winsr: DnsWinsrDataa = DnsWinsrDataa(),
            winsR: DnsWinsrDataa = DnsWinsrDataa(),
            nbstat: DnsWinsrDataa = DnsWinsrDataa(),
            dhcid: DnsDhcidData = DnsDhcidData(),
            nsec3: DnsNsec3Data = DnsNsec3Data(),
            nsec3param: DnsNsec3paramData = DnsNsec3paramData(),
            nsec3Param: DnsNsec3paramData = DnsNsec3paramData(),
            tlsa: DnsTlsaData = DnsTlsaData(),
            svcb: DnsSvcbData = DnsSvcbData(),
            unknown: DnsUnknownData = DnsUnknownData(),
            pDataPtr: MutPtr<UByte> = MutPtr(0L),
        ): DnsRecorda1 =
            DnsRecorda1(
                a = a,
                soa = soa,
                ptr = ptr,
                ns = ns,
                cname = cname,
                dname = dname,
                mb = mb,
                md = md,
                mf = mf,
                mg = mg,
                mr = mr,
                minfo = minfo,
                rp = rp,
                mx = mx,
                afsdb = afsdb,
                rt = rt,
                hinfo = hinfo,
                isdn = isdn,
                txt = txt,
                x25 = x25,
                nullVal = nullVal,
                wks = wks,
                aaaa = aaaa,
                key = key,
                sig = sig,
                atma = atma,
                nxt = nxt,
                srv = srv,
                naptr = naptr,
                opt = opt,
                ds = ds,
                rrsig = rrsig,
                nsec = nsec,
                dnskey = dnskey,
                tkey = tkey,
                tsig = tsig,
                wins = wins,
                winsr = winsr,
                winsR = winsR,
                nbstat = nbstat,
                dhcid = dhcid,
                nsec3 = nsec3,
                nsec3param = nsec3param,
                nsec3Param = nsec3Param,
                tlsa = tlsa,
                svcb = svcb,
                unknown = unknown,
                pDataPtrCtorArg = pDataPtr,
            )
    }
}

public data class DnsRecorda0(
    public var dw: UInt = 0u,
    public var s: DnsRecordFlags = DnsRecordFlags(),
)

public class DnsRecordw internal constructor(
    pNextCtorArg: MutPtr<DnsRecordw>,
    pNameCtorArg: Pwstr,
    public var wType: UShort,
    public var wDataLength: UShort,
    public var flags: DnsRecordw0,
    public var dwTtl: UInt,
    public var dwReserved: UInt,
    public var data: DnsRecordw1,
) {
    public var pNext: MutPtr<DnsRecordw> = pNextCtorArg
        internal set

    public var pName: Pwstr = pNameCtorArg
        internal set

    public constructor() : this(
        pNextCtorArg = MutPtr(0L),
        pNameCtorArg = MutPtr(0L),
        wType = 0u,
        wDataLength = 0u,
        flags = DnsRecordw0(),
        dwTtl = 0u,
        dwReserved = 0u,
        data = DnsRecordw1(),
    )

    public operator fun component1(): MutPtr<DnsRecordw> = this.pNext

    public operator fun component2(): Pwstr = this.pName

    public operator fun component3(): UShort = this.wType

    public operator fun component4(): UShort = this.wDataLength

    public operator fun component5(): DnsRecordw0 = this.flags

    public operator fun component6(): UInt = this.dwTtl

    public operator fun component7(): UInt = this.dwReserved

    public operator fun component8(): DnsRecordw1 = this.data

    public fun copy(pNext: MutPtr<DnsRecordw> = this.pNext, pName: Pwstr = this.pName, wType: UShort = this.wType, wDataLength: UShort = this.wDataLength, flags: DnsRecordw0 = this.flags, dwTtl: UInt = this.dwTtl, dwReserved: UInt = this.dwReserved, data: DnsRecordw1 = this.data): DnsRecordw = DnsRecordw(pNextCtorArg = pNext, pNameCtorArg = pName, wType = wType, wDataLength = wDataLength, flags = flags, dwTtl = dwTtl, dwReserved = dwReserved, data = data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsRecordw) return false
        if (this.pNext != other.pNext) return false
        if (this.pName != other.pName) return false
        if (this.wType != other.wType) return false
        if (this.wDataLength != other.wDataLength) return false
        if (this.flags != other.flags) return false
        if (this.dwTtl != other.dwTtl) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.data != other.data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNext.hashCode()
        result = 31 * result + this.pName.hashCode()
        result = 31 * result + this.wType.hashCode()
        result = 31 * result + this.wDataLength.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.dwTtl.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.data.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pNext: MutPtr<DnsRecordw> = MutPtr(0L),
            pName: Pwstr = MutPtr(0L),
            wType: UShort = 0u,
            wDataLength: UShort = 0u,
            flags: DnsRecordw0 = DnsRecordw0(),
            dwTtl: UInt = 0u,
            dwReserved: UInt = 0u,
            data: DnsRecordw1 = DnsRecordw1(),
        ): DnsRecordw =
            DnsRecordw(
                pNextCtorArg = pNext,
                pNameCtorArg = pName,
                wType = wType,
                wDataLength = wDataLength,
                flags = flags,
                dwTtl = dwTtl,
                dwReserved = dwReserved,
                data = data,
            )
    }
}

public class DnsRecordw1 internal constructor(
    public var a: DnsAData,
    public var soa: DnsSoaDataw,
    public var ptr: DnsPtrDataw,
    public var ns: DnsPtrDataw,
    public var cname: DnsPtrDataw,
    public var dname: DnsPtrDataw,
    public var mb: DnsPtrDataw,
    public var md: DnsPtrDataw,
    public var mf: DnsPtrDataw,
    public var mg: DnsPtrDataw,
    public var mr: DnsPtrDataw,
    public var minfo: DnsMinfoDataw,
    public var rp: DnsMinfoDataw,
    public var mx: DnsMxDataw,
    public var afsdb: DnsMxDataw,
    public var rt: DnsMxDataw,
    public var hinfo: DnsTxtDataw,
    public var isdn: DnsTxtDataw,
    public var txt: DnsTxtDataw,
    public var x25: DnsTxtDataw,
    public var nullVal: DnsNullData,
    public var wks: DnsWksData,
    public var aaaa: DnsAaaaData,
    public var key: DnsKeyData,
    public var sig: DnsSigDataw,
    public var atma: DnsAtmaData,
    public var nxt: DnsNxtDataw,
    public var srv: DnsSrvDataw,
    public var naptr: DnsNaptrDataw,
    public var opt: DnsOptData,
    public var ds: DnsDsData,
    public var rrsig: DnsSigDataw,
    public var nsec: DnsNsecDataw,
    public var dnskey: DnsKeyData,
    public var tkey: DnsTkeyDataw,
    public var tsig: DnsTsigDataw,
    public var wins: DnsWinsData,
    public var winsr: DnsWinsrDataw,
    public var winsR: DnsWinsrDataw,
    public var nbstat: DnsWinsrDataw,
    public var dhcid: DnsDhcidData,
    public var nsec3: DnsNsec3Data,
    public var nsec3param: DnsNsec3paramData,
    public var nsec3Param: DnsNsec3paramData,
    public var tlsa: DnsTlsaData,
    public var svcb: DnsSvcbData,
    public var unknown: DnsUnknownData,
    pDataPtrCtorArg: MutPtr<UByte>,
) {
    public var pDataPtr: MutPtr<UByte> = pDataPtrCtorArg
        internal set

    public constructor() : this(
        a = DnsAData(),
        soa = DnsSoaDataw(),
        ptr = DnsPtrDataw(),
        ns = DnsPtrDataw(),
        cname = DnsPtrDataw(),
        dname = DnsPtrDataw(),
        mb = DnsPtrDataw(),
        md = DnsPtrDataw(),
        mf = DnsPtrDataw(),
        mg = DnsPtrDataw(),
        mr = DnsPtrDataw(),
        minfo = DnsMinfoDataw(),
        rp = DnsMinfoDataw(),
        mx = DnsMxDataw(),
        afsdb = DnsMxDataw(),
        rt = DnsMxDataw(),
        hinfo = DnsTxtDataw(),
        isdn = DnsTxtDataw(),
        txt = DnsTxtDataw(),
        x25 = DnsTxtDataw(),
        nullVal = DnsNullData(),
        wks = DnsWksData(),
        aaaa = DnsAaaaData(),
        key = DnsKeyData(),
        sig = DnsSigDataw(),
        atma = DnsAtmaData(),
        nxt = DnsNxtDataw(),
        srv = DnsSrvDataw(),
        naptr = DnsNaptrDataw(),
        opt = DnsOptData(),
        ds = DnsDsData(),
        rrsig = DnsSigDataw(),
        nsec = DnsNsecDataw(),
        dnskey = DnsKeyData(),
        tkey = DnsTkeyDataw(),
        tsig = DnsTsigDataw(),
        wins = DnsWinsData(),
        winsr = DnsWinsrDataw(),
        winsR = DnsWinsrDataw(),
        nbstat = DnsWinsrDataw(),
        dhcid = DnsDhcidData(),
        nsec3 = DnsNsec3Data(),
        nsec3param = DnsNsec3paramData(),
        nsec3Param = DnsNsec3paramData(),
        tlsa = DnsTlsaData(),
        svcb = DnsSvcbData(),
        unknown = DnsUnknownData(),
        pDataPtrCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            a: DnsAData = DnsAData(),
            soa: DnsSoaDataw = DnsSoaDataw(),
            ptr: DnsPtrDataw = DnsPtrDataw(),
            ns: DnsPtrDataw = DnsPtrDataw(),
            cname: DnsPtrDataw = DnsPtrDataw(),
            dname: DnsPtrDataw = DnsPtrDataw(),
            mb: DnsPtrDataw = DnsPtrDataw(),
            md: DnsPtrDataw = DnsPtrDataw(),
            mf: DnsPtrDataw = DnsPtrDataw(),
            mg: DnsPtrDataw = DnsPtrDataw(),
            mr: DnsPtrDataw = DnsPtrDataw(),
            minfo: DnsMinfoDataw = DnsMinfoDataw(),
            rp: DnsMinfoDataw = DnsMinfoDataw(),
            mx: DnsMxDataw = DnsMxDataw(),
            afsdb: DnsMxDataw = DnsMxDataw(),
            rt: DnsMxDataw = DnsMxDataw(),
            hinfo: DnsTxtDataw = DnsTxtDataw(),
            isdn: DnsTxtDataw = DnsTxtDataw(),
            txt: DnsTxtDataw = DnsTxtDataw(),
            x25: DnsTxtDataw = DnsTxtDataw(),
            nullVal: DnsNullData = DnsNullData(),
            wks: DnsWksData = DnsWksData(),
            aaaa: DnsAaaaData = DnsAaaaData(),
            key: DnsKeyData = DnsKeyData(),
            sig: DnsSigDataw = DnsSigDataw(),
            atma: DnsAtmaData = DnsAtmaData(),
            nxt: DnsNxtDataw = DnsNxtDataw(),
            srv: DnsSrvDataw = DnsSrvDataw(),
            naptr: DnsNaptrDataw = DnsNaptrDataw(),
            opt: DnsOptData = DnsOptData(),
            ds: DnsDsData = DnsDsData(),
            rrsig: DnsSigDataw = DnsSigDataw(),
            nsec: DnsNsecDataw = DnsNsecDataw(),
            dnskey: DnsKeyData = DnsKeyData(),
            tkey: DnsTkeyDataw = DnsTkeyDataw(),
            tsig: DnsTsigDataw = DnsTsigDataw(),
            wins: DnsWinsData = DnsWinsData(),
            winsr: DnsWinsrDataw = DnsWinsrDataw(),
            winsR: DnsWinsrDataw = DnsWinsrDataw(),
            nbstat: DnsWinsrDataw = DnsWinsrDataw(),
            dhcid: DnsDhcidData = DnsDhcidData(),
            nsec3: DnsNsec3Data = DnsNsec3Data(),
            nsec3param: DnsNsec3paramData = DnsNsec3paramData(),
            nsec3Param: DnsNsec3paramData = DnsNsec3paramData(),
            tlsa: DnsTlsaData = DnsTlsaData(),
            svcb: DnsSvcbData = DnsSvcbData(),
            unknown: DnsUnknownData = DnsUnknownData(),
            pDataPtr: MutPtr<UByte> = MutPtr(0L),
        ): DnsRecordw1 =
            DnsRecordw1(
                a = a,
                soa = soa,
                ptr = ptr,
                ns = ns,
                cname = cname,
                dname = dname,
                mb = mb,
                md = md,
                mf = mf,
                mg = mg,
                mr = mr,
                minfo = minfo,
                rp = rp,
                mx = mx,
                afsdb = afsdb,
                rt = rt,
                hinfo = hinfo,
                isdn = isdn,
                txt = txt,
                x25 = x25,
                nullVal = nullVal,
                wks = wks,
                aaaa = aaaa,
                key = key,
                sig = sig,
                atma = atma,
                nxt = nxt,
                srv = srv,
                naptr = naptr,
                opt = opt,
                ds = ds,
                rrsig = rrsig,
                nsec = nsec,
                dnskey = dnskey,
                tkey = tkey,
                tsig = tsig,
                wins = wins,
                winsr = winsr,
                winsR = winsR,
                nbstat = nbstat,
                dhcid = dhcid,
                nsec3 = nsec3,
                nsec3param = nsec3param,
                nsec3Param = nsec3Param,
                tlsa = tlsa,
                svcb = svcb,
                unknown = unknown,
                pDataPtrCtorArg = pDataPtr,
            )
    }
}

public data class DnsRecordw0(
    public var dw: UInt = 0u,
    public var s: DnsRecordFlags = DnsRecordFlags(),
)

public data class DnsRecordFlags(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsRecordFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsRecordFlags> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DnsRecordFlags =
                    DnsRecordFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DnsRecordFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class DnsRecordOptw internal constructor(
    pNextCtorArg: MutPtr<DnsRecordw>,
    pNameCtorArg: Pwstr,
    public var wType: UShort,
    public var wDataLength: UShort,
    public var flags: DnsRecordOptw0,
    public var extHeader: DnsHeaderExt,
    public var wPayloadSize: UShort,
    public var wReserved: UShort,
    public var data: DnsRecordOptw1,
) {
    public var pNext: MutPtr<DnsRecordw> = pNextCtorArg
        internal set

    public var pName: Pwstr = pNameCtorArg
        internal set

    public constructor() : this(
        pNextCtorArg = MutPtr(0L),
        pNameCtorArg = MutPtr(0L),
        wType = 0u,
        wDataLength = 0u,
        flags = DnsRecordOptw0(),
        extHeader = DnsHeaderExt(),
        wPayloadSize = 0u,
        wReserved = 0u,
        data = DnsRecordOptw1(),
    )

    public operator fun component1(): MutPtr<DnsRecordw> = this.pNext

    public operator fun component2(): Pwstr = this.pName

    public operator fun component3(): UShort = this.wType

    public operator fun component4(): UShort = this.wDataLength

    public operator fun component5(): DnsRecordOptw0 = this.flags

    public operator fun component6(): DnsHeaderExt = this.extHeader

    public operator fun component7(): UShort = this.wPayloadSize

    public operator fun component8(): UShort = this.wReserved

    public operator fun component9(): DnsRecordOptw1 = this.data

    public fun copy(pNext: MutPtr<DnsRecordw> = this.pNext, pName: Pwstr = this.pName, wType: UShort = this.wType, wDataLength: UShort = this.wDataLength, flags: DnsRecordOptw0 = this.flags, extHeader: DnsHeaderExt = this.extHeader, wPayloadSize: UShort = this.wPayloadSize, wReserved: UShort = this.wReserved, data: DnsRecordOptw1 = this.data): DnsRecordOptw = DnsRecordOptw(pNextCtorArg = pNext, pNameCtorArg = pName, wType = wType, wDataLength = wDataLength, flags = flags, extHeader = extHeader, wPayloadSize = wPayloadSize, wReserved = wReserved, data = data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsRecordOptw) return false
        if (this.pNext != other.pNext) return false
        if (this.pName != other.pName) return false
        if (this.wType != other.wType) return false
        if (this.wDataLength != other.wDataLength) return false
        if (this.flags != other.flags) return false
        if (this.extHeader != other.extHeader) return false
        if (this.wPayloadSize != other.wPayloadSize) return false
        if (this.wReserved != other.wReserved) return false
        if (this.data != other.data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNext.hashCode()
        result = 31 * result + this.pName.hashCode()
        result = 31 * result + this.wType.hashCode()
        result = 31 * result + this.wDataLength.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.extHeader.hashCode()
        result = 31 * result + this.wPayloadSize.hashCode()
        result = 31 * result + this.wReserved.hashCode()
        result = 31 * result + this.data.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pNext: MutPtr<DnsRecordw> = MutPtr(0L),
            pName: Pwstr = MutPtr(0L),
            wType: UShort = 0u,
            wDataLength: UShort = 0u,
            flags: DnsRecordOptw0 = DnsRecordOptw0(),
            extHeader: DnsHeaderExt = DnsHeaderExt(),
            wPayloadSize: UShort = 0u,
            wReserved: UShort = 0u,
            data: DnsRecordOptw1 = DnsRecordOptw1(),
        ): DnsRecordOptw =
            DnsRecordOptw(
                pNextCtorArg = pNext,
                pNameCtorArg = pName,
                wType = wType,
                wDataLength = wDataLength,
                flags = flags,
                extHeader = extHeader,
                wPayloadSize = wPayloadSize,
                wReserved = wReserved,
                data = data,
            )
    }
}

public data class DnsRecordOptw1(
    public var opt: DnsOptData = DnsOptData(),
)

public data class DnsRecordOptw0(
    public var dw: UInt = 0u,
    public var s: DnsRecordFlags = DnsRecordFlags(),
)

public class DnsRrset internal constructor(
    pFirstRRCtorArg: MutPtr<DnsRecorda>,
    pLastRRCtorArg: MutPtr<DnsRecorda>,
) {
    public var pFirstRR: MutPtr<DnsRecorda> = pFirstRRCtorArg
        internal set

    public var pLastRR: MutPtr<DnsRecorda> = pLastRRCtorArg
        internal set

    public constructor() : this(
        pFirstRRCtorArg = MutPtr(0L),
        pLastRRCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<DnsRecorda> = this.pFirstRR

    public operator fun component2(): MutPtr<DnsRecorda> = this.pLastRR

    public fun copy(pFirstRR: MutPtr<DnsRecorda> = this.pFirstRR, pLastRR: MutPtr<DnsRecorda> = this.pLastRR): DnsRrset = DnsRrset(pFirstRRCtorArg = pFirstRR, pLastRRCtorArg = pLastRR)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsRrset) return false
        if (this.pFirstRR != other.pFirstRR) return false
        if (this.pLastRR != other.pLastRR) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pFirstRR.hashCode()
        result = 31 * result + this.pLastRR.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsRrset> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsRrset> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DnsRrset =
                    DnsRrset(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DnsRecorda>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DnsRecorda>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DnsRrset) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DnsRecorda>(64)
                    ).writeNative(addr, value.pFirstRR)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DnsRecorda>(64)
                    ).writeNative(addr + 8L, value.pLastRR)
                }
            }

        public operator fun invoke(
            pFirstRR: MutPtr<DnsRecorda> = MutPtr(0L),
            pLastRR: MutPtr<DnsRecorda> = MutPtr(0L),
        ): DnsRrset =
            DnsRrset(
                pFirstRRCtorArg = pFirstRR,
                pLastRRCtorArg = pLastRR,
            )
    }
}

public class DnsServiceBrowseRequest internal constructor(
    public var version: UInt,
    public var interfaceIndex: UInt,
    queryNameCtorArg: Pcwstr,
    public var anonymous: DnsServiceBrowseRequest0,
    pQueryContextCtorArg: MutPtr<CVoid>,
) {
    public var queryName: Pcwstr = queryNameCtorArg
        internal set

    public var pQueryContext: MutPtr<CVoid> = pQueryContextCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        interfaceIndex = 0u,
        queryNameCtorArg = ConstPtr(0L),
        anonymous = DnsServiceBrowseRequest0(),
        pQueryContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UInt = this.interfaceIndex

    public operator fun component3(): Pcwstr = this.queryName

    public operator fun component4(): DnsServiceBrowseRequest0 = this.anonymous

    public operator fun component5(): MutPtr<CVoid> = this.pQueryContext

    public fun copy(version: UInt = this.version, interfaceIndex: UInt = this.interfaceIndex, queryName: Pcwstr = this.queryName, anonymous: DnsServiceBrowseRequest0 = this.anonymous, pQueryContext: MutPtr<CVoid> = this.pQueryContext): DnsServiceBrowseRequest = DnsServiceBrowseRequest(version = version, interfaceIndex = interfaceIndex, queryNameCtorArg = queryName, anonymous = anonymous, pQueryContextCtorArg = pQueryContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsServiceBrowseRequest) return false
        if (this.version != other.version) return false
        if (this.interfaceIndex != other.interfaceIndex) return false
        if (this.queryName != other.queryName) return false
        if (this.anonymous != other.anonymous) return false
        if (this.pQueryContext != other.pQueryContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.interfaceIndex.hashCode()
        result = 31 * result + this.queryName.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.pQueryContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            interfaceIndex: UInt = 0u,
            queryName: Pcwstr = ConstPtr(0L),
            anonymous: DnsServiceBrowseRequest0 = DnsServiceBrowseRequest0(),
            pQueryContext: MutPtr<CVoid> = MutPtr(0L),
        ): DnsServiceBrowseRequest =
            DnsServiceBrowseRequest(
                version = version,
                interfaceIndex = interfaceIndex,
                queryNameCtorArg = queryName,
                anonymous = anonymous,
                pQueryContextCtorArg = pQueryContext,
            )
    }
}

public data class DnsServiceBrowseRequest0(
    public var pBrowseCallback: PdnsServiceBrowseCallback = null,
    public var pBrowseCallbackV2: PdnsQueryCompletionRoutine = null,
)

public class DnsServiceCancel internal constructor(
    reservedCtorArg: MutPtr<CVoid>,
) {
    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public constructor() : this(
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.reserved

    public fun copy(reserved: MutPtr<CVoid> = this.reserved): DnsServiceCancel = DnsServiceCancel(reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsServiceCancel) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int = this.reserved.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsServiceCancel> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsServiceCancel> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DnsServiceCancel =
                    DnsServiceCancel(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DnsServiceCancel) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.reserved)
                }
            }

        public operator fun invoke(
            reserved: MutPtr<CVoid> = MutPtr(0L),
        ): DnsServiceCancel =
            DnsServiceCancel(
                reservedCtorArg = reserved,
            )
    }
}

public class DnsServiceInstance internal constructor(
    pszInstanceNameCtorArg: Pwstr,
    pszHostNameCtorArg: Pwstr,
    ip4AddressCtorArg: MutPtr<UInt>,
    ip6AddressCtorArg: MutPtr<Ip6Address>,
    public var wPort: UShort,
    public var wPriority: UShort,
    public var wWeight: UShort,
    public var dwPropertyCount: UInt,
    keysCtorArg: MutPtr<Pwstr>,
    valuesCtorArg: MutPtr<Pwstr>,
    public var dwInterfaceIndex: UInt,
) {
    public var pszInstanceName: Pwstr = pszInstanceNameCtorArg
        internal set

    public var pszHostName: Pwstr = pszHostNameCtorArg
        internal set

    public var ip4Address: MutPtr<UInt> = ip4AddressCtorArg
        internal set

    public var ip6Address: MutPtr<Ip6Address> = ip6AddressCtorArg
        internal set

    public var keys: MutPtr<Pwstr> = keysCtorArg
        internal set

    public var values: MutPtr<Pwstr> = valuesCtorArg
        internal set

    public constructor() : this(
        pszInstanceNameCtorArg = MutPtr(0L),
        pszHostNameCtorArg = MutPtr(0L),
        ip4AddressCtorArg = MutPtr(0L),
        ip6AddressCtorArg = MutPtr(0L),
        wPort = 0u,
        wPriority = 0u,
        wWeight = 0u,
        dwPropertyCount = 0u,
        keysCtorArg = MutPtr(0L),
        valuesCtorArg = MutPtr(0L),
        dwInterfaceIndex = 0u,
    )

    public operator fun component1(): Pwstr = this.pszInstanceName

    public operator fun component2(): Pwstr = this.pszHostName

    public operator fun component3(): MutPtr<UInt> = this.ip4Address

    public operator fun component4(): MutPtr<Ip6Address> = this.ip6Address

    public operator fun component5(): UShort = this.wPort

    public operator fun component6(): UShort = this.wPriority

    public operator fun component7(): UShort = this.wWeight

    public operator fun component8(): UInt = this.dwPropertyCount

    public operator fun component9(): MutPtr<Pwstr> = this.keys

    public operator fun component10(): MutPtr<Pwstr> = this.values

    public operator fun component11(): UInt = this.dwInterfaceIndex

    public fun copy(pszInstanceName: Pwstr = this.pszInstanceName, pszHostName: Pwstr = this.pszHostName, ip4Address: MutPtr<UInt> = this.ip4Address, ip6Address: MutPtr<Ip6Address> = this.ip6Address, wPort: UShort = this.wPort, wPriority: UShort = this.wPriority, wWeight: UShort = this.wWeight, dwPropertyCount: UInt = this.dwPropertyCount, keys: MutPtr<Pwstr> = this.keys, values: MutPtr<Pwstr> = this.values, dwInterfaceIndex: UInt = this.dwInterfaceIndex): DnsServiceInstance = DnsServiceInstance(pszInstanceNameCtorArg = pszInstanceName, pszHostNameCtorArg = pszHostName, ip4AddressCtorArg = ip4Address, ip6AddressCtorArg = ip6Address, wPort = wPort, wPriority = wPriority, wWeight = wWeight, dwPropertyCount = dwPropertyCount, keysCtorArg = keys, valuesCtorArg = values, dwInterfaceIndex = dwInterfaceIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsServiceInstance) return false
        if (this.pszInstanceName != other.pszInstanceName) return false
        if (this.pszHostName != other.pszHostName) return false
        if (this.ip4Address != other.ip4Address) return false
        if (this.ip6Address != other.ip6Address) return false
        if (this.wPort != other.wPort) return false
        if (this.wPriority != other.wPriority) return false
        if (this.wWeight != other.wWeight) return false
        if (this.dwPropertyCount != other.dwPropertyCount) return false
        if (this.keys != other.keys) return false
        if (this.values != other.values) return false
        if (this.dwInterfaceIndex != other.dwInterfaceIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pszInstanceName.hashCode()
        result = 31 * result + this.pszHostName.hashCode()
        result = 31 * result + this.ip4Address.hashCode()
        result = 31 * result + this.ip6Address.hashCode()
        result = 31 * result + this.wPort.hashCode()
        result = 31 * result + this.wPriority.hashCode()
        result = 31 * result + this.wWeight.hashCode()
        result = 31 * result + this.dwPropertyCount.hashCode()
        result = 31 * result + this.keys.hashCode()
        result = 31 * result + this.values.hashCode()
        result = 31 * result + this.dwInterfaceIndex.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pszInstanceName: Pwstr = MutPtr(0L),
            pszHostName: Pwstr = MutPtr(0L),
            ip4Address: MutPtr<UInt> = MutPtr(0L),
            ip6Address: MutPtr<Ip6Address> = MutPtr(0L),
            wPort: UShort = 0u,
            wPriority: UShort = 0u,
            wWeight: UShort = 0u,
            dwPropertyCount: UInt = 0u,
            keys: MutPtr<Pwstr> = MutPtr(0L),
            values: MutPtr<Pwstr> = MutPtr(0L),
            dwInterfaceIndex: UInt = 0u,
        ): DnsServiceInstance =
            DnsServiceInstance(
                pszInstanceNameCtorArg = pszInstanceName,
                pszHostNameCtorArg = pszHostName,
                ip4AddressCtorArg = ip4Address,
                ip6AddressCtorArg = ip6Address,
                wPort = wPort,
                wPriority = wPriority,
                wWeight = wWeight,
                dwPropertyCount = dwPropertyCount,
                keysCtorArg = keys,
                valuesCtorArg = values,
                dwInterfaceIndex = dwInterfaceIndex,
            )
    }
}

public class DnsServiceRegisterRequest internal constructor(
    public var version: UInt,
    public var interfaceIndex: UInt,
    pServiceInstanceCtorArg: MutPtr<DnsServiceInstance>,
    public var pRegisterCompletionCallback: PdnsServiceRegisterComplete,
    pQueryContextCtorArg: MutPtr<CVoid>,
    hCredentialsCtorArg: Handle,
    public var unicastEnabled: Bool,
) {
    public var pServiceInstance: MutPtr<DnsServiceInstance> = pServiceInstanceCtorArg
        internal set

    public var pQueryContext: MutPtr<CVoid> = pQueryContextCtorArg
        internal set

    public var hCredentials: Handle = hCredentialsCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        interfaceIndex = 0u,
        pServiceInstanceCtorArg = MutPtr(0L),
        pRegisterCompletionCallback = null,
        pQueryContextCtorArg = MutPtr(0L),
        hCredentialsCtorArg = MutPtr(0L),
        unicastEnabled = 0,
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UInt = this.interfaceIndex

    public operator fun component3(): MutPtr<DnsServiceInstance> = this.pServiceInstance

    public operator fun component4(): PdnsServiceRegisterComplete = this.pRegisterCompletionCallback

    public operator fun component5(): MutPtr<CVoid> = this.pQueryContext

    public operator fun component6(): Handle = this.hCredentials

    public operator fun component7(): Bool = this.unicastEnabled

    public fun copy(version: UInt = this.version, interfaceIndex: UInt = this.interfaceIndex, pServiceInstance: MutPtr<DnsServiceInstance> = this.pServiceInstance, pRegisterCompletionCallback: PdnsServiceRegisterComplete = this.pRegisterCompletionCallback, pQueryContext: MutPtr<CVoid> = this.pQueryContext, hCredentials: Handle = this.hCredentials, unicastEnabled: Bool = this.unicastEnabled): DnsServiceRegisterRequest = DnsServiceRegisterRequest(version = version, interfaceIndex = interfaceIndex, pServiceInstanceCtorArg = pServiceInstance, pRegisterCompletionCallback = pRegisterCompletionCallback, pQueryContextCtorArg = pQueryContext, hCredentialsCtorArg = hCredentials, unicastEnabled = unicastEnabled)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsServiceRegisterRequest) return false
        if (this.version != other.version) return false
        if (this.interfaceIndex != other.interfaceIndex) return false
        if (this.pServiceInstance != other.pServiceInstance) return false
        if (this.pRegisterCompletionCallback != other.pRegisterCompletionCallback) return false
        if (this.pQueryContext != other.pQueryContext) return false
        if (this.hCredentials != other.hCredentials) return false
        if (this.unicastEnabled != other.unicastEnabled) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.interfaceIndex.hashCode()
        result = 31 * result + this.pServiceInstance.hashCode()
        result = 31 * result + this.pRegisterCompletionCallback.hashCode()
        result = 31 * result + this.pQueryContext.hashCode()
        result = 31 * result + this.hCredentials.hashCode()
        result = 31 * result + this.unicastEnabled.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            interfaceIndex: UInt = 0u,
            pServiceInstance: MutPtr<DnsServiceInstance> = MutPtr(0L),
            pRegisterCompletionCallback: PdnsServiceRegisterComplete = null,
            pQueryContext: MutPtr<CVoid> = MutPtr(0L),
            hCredentials: Handle = MutPtr(0L),
            unicastEnabled: Bool = 0,
        ): DnsServiceRegisterRequest =
            DnsServiceRegisterRequest(
                version = version,
                interfaceIndex = interfaceIndex,
                pServiceInstanceCtorArg = pServiceInstance,
                pRegisterCompletionCallback = pRegisterCompletionCallback,
                pQueryContextCtorArg = pQueryContext,
                hCredentialsCtorArg = hCredentials,
                unicastEnabled = unicastEnabled,
            )
    }
}

public class DnsServiceResolveRequest internal constructor(
    public var version: UInt,
    public var interfaceIndex: UInt,
    queryNameCtorArg: Pwstr,
    public var pResolveCompletionCallback: PdnsServiceResolveComplete,
    pQueryContextCtorArg: MutPtr<CVoid>,
) {
    public var queryName: Pwstr = queryNameCtorArg
        internal set

    public var pQueryContext: MutPtr<CVoid> = pQueryContextCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        interfaceIndex = 0u,
        queryNameCtorArg = MutPtr(0L),
        pResolveCompletionCallback = null,
        pQueryContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UInt = this.interfaceIndex

    public operator fun component3(): Pwstr = this.queryName

    public operator fun component4(): PdnsServiceResolveComplete = this.pResolveCompletionCallback

    public operator fun component5(): MutPtr<CVoid> = this.pQueryContext

    public fun copy(version: UInt = this.version, interfaceIndex: UInt = this.interfaceIndex, queryName: Pwstr = this.queryName, pResolveCompletionCallback: PdnsServiceResolveComplete = this.pResolveCompletionCallback, pQueryContext: MutPtr<CVoid> = this.pQueryContext): DnsServiceResolveRequest = DnsServiceResolveRequest(version = version, interfaceIndex = interfaceIndex, queryNameCtorArg = queryName, pResolveCompletionCallback = pResolveCompletionCallback, pQueryContextCtorArg = pQueryContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsServiceResolveRequest) return false
        if (this.version != other.version) return false
        if (this.interfaceIndex != other.interfaceIndex) return false
        if (this.queryName != other.queryName) return false
        if (this.pResolveCompletionCallback != other.pResolveCompletionCallback) return false
        if (this.pQueryContext != other.pQueryContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.interfaceIndex.hashCode()
        result = 31 * result + this.queryName.hashCode()
        result = 31 * result + this.pResolveCompletionCallback.hashCode()
        result = 31 * result + this.pQueryContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            interfaceIndex: UInt = 0u,
            queryName: Pwstr = MutPtr(0L),
            pResolveCompletionCallback: PdnsServiceResolveComplete = null,
            pQueryContext: MutPtr<CVoid> = MutPtr(0L),
        ): DnsServiceResolveRequest =
            DnsServiceResolveRequest(
                version = version,
                interfaceIndex = interfaceIndex,
                queryNameCtorArg = queryName,
                pResolveCompletionCallback = pResolveCompletionCallback,
                pQueryContextCtorArg = pQueryContext,
            )
    }
}

public class DnsSigDataa internal constructor(
    public var wTypeCovered: UShort,
    public var chAlgorithm: UByte,
    public var chLabelCount: UByte,
    public var dwOriginalTtl: UInt,
    public var dwExpiration: UInt,
    public var dwTimeSigned: UInt,
    public var wKeyTag: UShort,
    public var wSignatureLength: UShort,
    pNameSignerCtorArg: Pstr,
    public var signature: UByteArray,
) {
    public var pNameSigner: Pstr = pNameSignerCtorArg
        internal set

    public constructor() : this(
        wTypeCovered = 0u,
        chAlgorithm = 0u,
        chLabelCount = 0u,
        dwOriginalTtl = 0u,
        dwExpiration = 0u,
        dwTimeSigned = 0u,
        wKeyTag = 0u,
        wSignatureLength = 0u,
        pNameSignerCtorArg = MutPtr(0L),
        signature = UByteArray(1),
    )

    public operator fun component1(): UShort = this.wTypeCovered

    public operator fun component2(): UByte = this.chAlgorithm

    public operator fun component3(): UByte = this.chLabelCount

    public operator fun component4(): UInt = this.dwOriginalTtl

    public operator fun component5(): UInt = this.dwExpiration

    public operator fun component6(): UInt = this.dwTimeSigned

    public operator fun component7(): UShort = this.wKeyTag

    public operator fun component8(): UShort = this.wSignatureLength

    public operator fun component9(): Pstr = this.pNameSigner

    public operator fun component10(): UByteArray = this.signature

    public fun copy(wTypeCovered: UShort = this.wTypeCovered, chAlgorithm: UByte = this.chAlgorithm, chLabelCount: UByte = this.chLabelCount, dwOriginalTtl: UInt = this.dwOriginalTtl, dwExpiration: UInt = this.dwExpiration, dwTimeSigned: UInt = this.dwTimeSigned, wKeyTag: UShort = this.wKeyTag, wSignatureLength: UShort = this.wSignatureLength, pNameSigner: Pstr = this.pNameSigner, signature: UByteArray = this.signature): DnsSigDataa = DnsSigDataa(wTypeCovered = wTypeCovered, chAlgorithm = chAlgorithm, chLabelCount = chLabelCount, dwOriginalTtl = dwOriginalTtl, dwExpiration = dwExpiration, dwTimeSigned = dwTimeSigned, wKeyTag = wKeyTag, wSignatureLength = wSignatureLength, pNameSignerCtorArg = pNameSigner, signature = signature)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsSigDataa) return false
        if (this.wTypeCovered != other.wTypeCovered) return false
        if (this.chAlgorithm != other.chAlgorithm) return false
        if (this.chLabelCount != other.chLabelCount) return false
        if (this.dwOriginalTtl != other.dwOriginalTtl) return false
        if (this.dwExpiration != other.dwExpiration) return false
        if (this.dwTimeSigned != other.dwTimeSigned) return false
        if (this.wKeyTag != other.wKeyTag) return false
        if (this.wSignatureLength != other.wSignatureLength) return false
        if (this.pNameSigner != other.pNameSigner) return false
        if (!this.signature.contentEquals(other.signature)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wTypeCovered.hashCode()
        result = 31 * result + this.chAlgorithm.hashCode()
        result = 31 * result + this.chLabelCount.hashCode()
        result = 31 * result + this.dwOriginalTtl.hashCode()
        result = 31 * result + this.dwExpiration.hashCode()
        result = 31 * result + this.dwTimeSigned.hashCode()
        result = 31 * result + this.wKeyTag.hashCode()
        result = 31 * result + this.wSignatureLength.hashCode()
        result = 31 * result + this.pNameSigner.hashCode()
        result = 31 * result + this.signature.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wTypeCovered: UShort = 0u,
            chAlgorithm: UByte = 0u,
            chLabelCount: UByte = 0u,
            dwOriginalTtl: UInt = 0u,
            dwExpiration: UInt = 0u,
            dwTimeSigned: UInt = 0u,
            wKeyTag: UShort = 0u,
            wSignatureLength: UShort = 0u,
            pNameSigner: Pstr = MutPtr(0L),
            signature: UByteArray = UByteArray(1),
        ): DnsSigDataa =
            DnsSigDataa(
                wTypeCovered = wTypeCovered,
                chAlgorithm = chAlgorithm,
                chLabelCount = chLabelCount,
                dwOriginalTtl = dwOriginalTtl,
                dwExpiration = dwExpiration,
                dwTimeSigned = dwTimeSigned,
                wKeyTag = wKeyTag,
                wSignatureLength = wSignatureLength,
                pNameSignerCtorArg = pNameSigner,
                signature = signature,
            )
    }
}

public class DnsSigDataw internal constructor(
    public var wTypeCovered: UShort,
    public var chAlgorithm: UByte,
    public var chLabelCount: UByte,
    public var dwOriginalTtl: UInt,
    public var dwExpiration: UInt,
    public var dwTimeSigned: UInt,
    public var wKeyTag: UShort,
    public var wSignatureLength: UShort,
    pNameSignerCtorArg: Pwstr,
    public var signature: UByteArray,
) {
    public var pNameSigner: Pwstr = pNameSignerCtorArg
        internal set

    public constructor() : this(
        wTypeCovered = 0u,
        chAlgorithm = 0u,
        chLabelCount = 0u,
        dwOriginalTtl = 0u,
        dwExpiration = 0u,
        dwTimeSigned = 0u,
        wKeyTag = 0u,
        wSignatureLength = 0u,
        pNameSignerCtorArg = MutPtr(0L),
        signature = UByteArray(1),
    )

    public operator fun component1(): UShort = this.wTypeCovered

    public operator fun component2(): UByte = this.chAlgorithm

    public operator fun component3(): UByte = this.chLabelCount

    public operator fun component4(): UInt = this.dwOriginalTtl

    public operator fun component5(): UInt = this.dwExpiration

    public operator fun component6(): UInt = this.dwTimeSigned

    public operator fun component7(): UShort = this.wKeyTag

    public operator fun component8(): UShort = this.wSignatureLength

    public operator fun component9(): Pwstr = this.pNameSigner

    public operator fun component10(): UByteArray = this.signature

    public fun copy(wTypeCovered: UShort = this.wTypeCovered, chAlgorithm: UByte = this.chAlgorithm, chLabelCount: UByte = this.chLabelCount, dwOriginalTtl: UInt = this.dwOriginalTtl, dwExpiration: UInt = this.dwExpiration, dwTimeSigned: UInt = this.dwTimeSigned, wKeyTag: UShort = this.wKeyTag, wSignatureLength: UShort = this.wSignatureLength, pNameSigner: Pwstr = this.pNameSigner, signature: UByteArray = this.signature): DnsSigDataw = DnsSigDataw(wTypeCovered = wTypeCovered, chAlgorithm = chAlgorithm, chLabelCount = chLabelCount, dwOriginalTtl = dwOriginalTtl, dwExpiration = dwExpiration, dwTimeSigned = dwTimeSigned, wKeyTag = wKeyTag, wSignatureLength = wSignatureLength, pNameSignerCtorArg = pNameSigner, signature = signature)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsSigDataw) return false
        if (this.wTypeCovered != other.wTypeCovered) return false
        if (this.chAlgorithm != other.chAlgorithm) return false
        if (this.chLabelCount != other.chLabelCount) return false
        if (this.dwOriginalTtl != other.dwOriginalTtl) return false
        if (this.dwExpiration != other.dwExpiration) return false
        if (this.dwTimeSigned != other.dwTimeSigned) return false
        if (this.wKeyTag != other.wKeyTag) return false
        if (this.wSignatureLength != other.wSignatureLength) return false
        if (this.pNameSigner != other.pNameSigner) return false
        if (!this.signature.contentEquals(other.signature)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wTypeCovered.hashCode()
        result = 31 * result + this.chAlgorithm.hashCode()
        result = 31 * result + this.chLabelCount.hashCode()
        result = 31 * result + this.dwOriginalTtl.hashCode()
        result = 31 * result + this.dwExpiration.hashCode()
        result = 31 * result + this.dwTimeSigned.hashCode()
        result = 31 * result + this.wKeyTag.hashCode()
        result = 31 * result + this.wSignatureLength.hashCode()
        result = 31 * result + this.pNameSigner.hashCode()
        result = 31 * result + this.signature.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wTypeCovered: UShort = 0u,
            chAlgorithm: UByte = 0u,
            chLabelCount: UByte = 0u,
            dwOriginalTtl: UInt = 0u,
            dwExpiration: UInt = 0u,
            dwTimeSigned: UInt = 0u,
            wKeyTag: UShort = 0u,
            wSignatureLength: UShort = 0u,
            pNameSigner: Pwstr = MutPtr(0L),
            signature: UByteArray = UByteArray(1),
        ): DnsSigDataw =
            DnsSigDataw(
                wTypeCovered = wTypeCovered,
                chAlgorithm = chAlgorithm,
                chLabelCount = chLabelCount,
                dwOriginalTtl = dwOriginalTtl,
                dwExpiration = dwExpiration,
                dwTimeSigned = dwTimeSigned,
                wKeyTag = wKeyTag,
                wSignatureLength = wSignatureLength,
                pNameSignerCtorArg = pNameSigner,
                signature = signature,
            )
    }
}

public class DnsSoaDataa internal constructor(
    pNamePrimaryServerCtorArg: Pstr,
    pNameAdministratorCtorArg: Pstr,
    public var dwSerialNo: UInt,
    public var dwRefresh: UInt,
    public var dwRetry: UInt,
    public var dwExpire: UInt,
    public var dwDefaultTtl: UInt,
) {
    public var pNamePrimaryServer: Pstr = pNamePrimaryServerCtorArg
        internal set

    public var pNameAdministrator: Pstr = pNameAdministratorCtorArg
        internal set

    public constructor() : this(
        pNamePrimaryServerCtorArg = MutPtr(0L),
        pNameAdministratorCtorArg = MutPtr(0L),
        dwSerialNo = 0u,
        dwRefresh = 0u,
        dwRetry = 0u,
        dwExpire = 0u,
        dwDefaultTtl = 0u,
    )

    public operator fun component1(): Pstr = this.pNamePrimaryServer

    public operator fun component2(): Pstr = this.pNameAdministrator

    public operator fun component3(): UInt = this.dwSerialNo

    public operator fun component4(): UInt = this.dwRefresh

    public operator fun component5(): UInt = this.dwRetry

    public operator fun component6(): UInt = this.dwExpire

    public operator fun component7(): UInt = this.dwDefaultTtl

    public fun copy(pNamePrimaryServer: Pstr = this.pNamePrimaryServer, pNameAdministrator: Pstr = this.pNameAdministrator, dwSerialNo: UInt = this.dwSerialNo, dwRefresh: UInt = this.dwRefresh, dwRetry: UInt = this.dwRetry, dwExpire: UInt = this.dwExpire, dwDefaultTtl: UInt = this.dwDefaultTtl): DnsSoaDataa = DnsSoaDataa(pNamePrimaryServerCtorArg = pNamePrimaryServer, pNameAdministratorCtorArg = pNameAdministrator, dwSerialNo = dwSerialNo, dwRefresh = dwRefresh, dwRetry = dwRetry, dwExpire = dwExpire, dwDefaultTtl = dwDefaultTtl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsSoaDataa) return false
        if (this.pNamePrimaryServer != other.pNamePrimaryServer) return false
        if (this.pNameAdministrator != other.pNameAdministrator) return false
        if (this.dwSerialNo != other.dwSerialNo) return false
        if (this.dwRefresh != other.dwRefresh) return false
        if (this.dwRetry != other.dwRetry) return false
        if (this.dwExpire != other.dwExpire) return false
        if (this.dwDefaultTtl != other.dwDefaultTtl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNamePrimaryServer.hashCode()
        result = 31 * result + this.pNameAdministrator.hashCode()
        result = 31 * result + this.dwSerialNo.hashCode()
        result = 31 * result + this.dwRefresh.hashCode()
        result = 31 * result + this.dwRetry.hashCode()
        result = 31 * result + this.dwExpire.hashCode()
        result = 31 * result + this.dwDefaultTtl.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pNamePrimaryServer: Pstr = MutPtr(0L),
            pNameAdministrator: Pstr = MutPtr(0L),
            dwSerialNo: UInt = 0u,
            dwRefresh: UInt = 0u,
            dwRetry: UInt = 0u,
            dwExpire: UInt = 0u,
            dwDefaultTtl: UInt = 0u,
        ): DnsSoaDataa =
            DnsSoaDataa(
                pNamePrimaryServerCtorArg = pNamePrimaryServer,
                pNameAdministratorCtorArg = pNameAdministrator,
                dwSerialNo = dwSerialNo,
                dwRefresh = dwRefresh,
                dwRetry = dwRetry,
                dwExpire = dwExpire,
                dwDefaultTtl = dwDefaultTtl,
            )
    }
}

public class DnsSoaDataw internal constructor(
    pNamePrimaryServerCtorArg: Pwstr,
    pNameAdministratorCtorArg: Pwstr,
    public var dwSerialNo: UInt,
    public var dwRefresh: UInt,
    public var dwRetry: UInt,
    public var dwExpire: UInt,
    public var dwDefaultTtl: UInt,
) {
    public var pNamePrimaryServer: Pwstr = pNamePrimaryServerCtorArg
        internal set

    public var pNameAdministrator: Pwstr = pNameAdministratorCtorArg
        internal set

    public constructor() : this(
        pNamePrimaryServerCtorArg = MutPtr(0L),
        pNameAdministratorCtorArg = MutPtr(0L),
        dwSerialNo = 0u,
        dwRefresh = 0u,
        dwRetry = 0u,
        dwExpire = 0u,
        dwDefaultTtl = 0u,
    )

    public operator fun component1(): Pwstr = this.pNamePrimaryServer

    public operator fun component2(): Pwstr = this.pNameAdministrator

    public operator fun component3(): UInt = this.dwSerialNo

    public operator fun component4(): UInt = this.dwRefresh

    public operator fun component5(): UInt = this.dwRetry

    public operator fun component6(): UInt = this.dwExpire

    public operator fun component7(): UInt = this.dwDefaultTtl

    public fun copy(pNamePrimaryServer: Pwstr = this.pNamePrimaryServer, pNameAdministrator: Pwstr = this.pNameAdministrator, dwSerialNo: UInt = this.dwSerialNo, dwRefresh: UInt = this.dwRefresh, dwRetry: UInt = this.dwRetry, dwExpire: UInt = this.dwExpire, dwDefaultTtl: UInt = this.dwDefaultTtl): DnsSoaDataw = DnsSoaDataw(pNamePrimaryServerCtorArg = pNamePrimaryServer, pNameAdministratorCtorArg = pNameAdministrator, dwSerialNo = dwSerialNo, dwRefresh = dwRefresh, dwRetry = dwRetry, dwExpire = dwExpire, dwDefaultTtl = dwDefaultTtl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsSoaDataw) return false
        if (this.pNamePrimaryServer != other.pNamePrimaryServer) return false
        if (this.pNameAdministrator != other.pNameAdministrator) return false
        if (this.dwSerialNo != other.dwSerialNo) return false
        if (this.dwRefresh != other.dwRefresh) return false
        if (this.dwRetry != other.dwRetry) return false
        if (this.dwExpire != other.dwExpire) return false
        if (this.dwDefaultTtl != other.dwDefaultTtl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNamePrimaryServer.hashCode()
        result = 31 * result + this.pNameAdministrator.hashCode()
        result = 31 * result + this.dwSerialNo.hashCode()
        result = 31 * result + this.dwRefresh.hashCode()
        result = 31 * result + this.dwRetry.hashCode()
        result = 31 * result + this.dwExpire.hashCode()
        result = 31 * result + this.dwDefaultTtl.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pNamePrimaryServer: Pwstr = MutPtr(0L),
            pNameAdministrator: Pwstr = MutPtr(0L),
            dwSerialNo: UInt = 0u,
            dwRefresh: UInt = 0u,
            dwRetry: UInt = 0u,
            dwExpire: UInt = 0u,
            dwDefaultTtl: UInt = 0u,
        ): DnsSoaDataw =
            DnsSoaDataw(
                pNamePrimaryServerCtorArg = pNamePrimaryServer,
                pNameAdministratorCtorArg = pNameAdministrator,
                dwSerialNo = dwSerialNo,
                dwRefresh = dwRefresh,
                dwRetry = dwRetry,
                dwExpire = dwExpire,
                dwDefaultTtl = dwDefaultTtl,
            )
    }
}

public class DnsSrvDataa internal constructor(
    pNameTargetCtorArg: Pstr,
    public var wPriority: UShort,
    public var wWeight: UShort,
    public var wPort: UShort,
    public var pad: UShort,
) {
    public var pNameTarget: Pstr = pNameTargetCtorArg
        internal set

    public constructor() : this(
        pNameTargetCtorArg = MutPtr(0L),
        wPriority = 0u,
        wWeight = 0u,
        wPort = 0u,
        pad = 0u,
    )

    public operator fun component1(): Pstr = this.pNameTarget

    public operator fun component2(): UShort = this.wPriority

    public operator fun component3(): UShort = this.wWeight

    public operator fun component4(): UShort = this.wPort

    public operator fun component5(): UShort = this.pad

    public fun copy(pNameTarget: Pstr = this.pNameTarget, wPriority: UShort = this.wPriority, wWeight: UShort = this.wWeight, wPort: UShort = this.wPort, pad: UShort = this.pad): DnsSrvDataa = DnsSrvDataa(pNameTargetCtorArg = pNameTarget, wPriority = wPriority, wWeight = wWeight, wPort = wPort, pad = pad)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsSrvDataa) return false
        if (this.pNameTarget != other.pNameTarget) return false
        if (this.wPriority != other.wPriority) return false
        if (this.wWeight != other.wWeight) return false
        if (this.wPort != other.wPort) return false
        if (this.pad != other.pad) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNameTarget.hashCode()
        result = 31 * result + this.wPriority.hashCode()
        result = 31 * result + this.wWeight.hashCode()
        result = 31 * result + this.wPort.hashCode()
        result = 31 * result + this.pad.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pNameTarget: Pstr = MutPtr(0L),
            wPriority: UShort = 0u,
            wWeight: UShort = 0u,
            wPort: UShort = 0u,
            pad: UShort = 0u,
        ): DnsSrvDataa =
            DnsSrvDataa(
                pNameTargetCtorArg = pNameTarget,
                wPriority = wPriority,
                wWeight = wWeight,
                wPort = wPort,
                pad = pad,
            )
    }
}

public class DnsSrvDataw internal constructor(
    pNameTargetCtorArg: Pwstr,
    public var wPriority: UShort,
    public var wWeight: UShort,
    public var wPort: UShort,
    public var pad: UShort,
) {
    public var pNameTarget: Pwstr = pNameTargetCtorArg
        internal set

    public constructor() : this(
        pNameTargetCtorArg = MutPtr(0L),
        wPriority = 0u,
        wWeight = 0u,
        wPort = 0u,
        pad = 0u,
    )

    public operator fun component1(): Pwstr = this.pNameTarget

    public operator fun component2(): UShort = this.wPriority

    public operator fun component3(): UShort = this.wWeight

    public operator fun component4(): UShort = this.wPort

    public operator fun component5(): UShort = this.pad

    public fun copy(pNameTarget: Pwstr = this.pNameTarget, wPriority: UShort = this.wPriority, wWeight: UShort = this.wWeight, wPort: UShort = this.wPort, pad: UShort = this.pad): DnsSrvDataw = DnsSrvDataw(pNameTargetCtorArg = pNameTarget, wPriority = wPriority, wWeight = wWeight, wPort = wPort, pad = pad)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsSrvDataw) return false
        if (this.pNameTarget != other.pNameTarget) return false
        if (this.wPriority != other.wPriority) return false
        if (this.wWeight != other.wWeight) return false
        if (this.wPort != other.wPort) return false
        if (this.pad != other.pad) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNameTarget.hashCode()
        result = 31 * result + this.wPriority.hashCode()
        result = 31 * result + this.wWeight.hashCode()
        result = 31 * result + this.wPort.hashCode()
        result = 31 * result + this.pad.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pNameTarget: Pwstr = MutPtr(0L),
            wPriority: UShort = 0u,
            wWeight: UShort = 0u,
            wPort: UShort = 0u,
            pad: UShort = 0u,
        ): DnsSrvDataw =
            DnsSrvDataw(
                pNameTargetCtorArg = pNameTarget,
                wPriority = wPriority,
                wWeight = wWeight,
                wPort = wPort,
                pad = pad,
            )
    }
}

public class DnsSvcbData internal constructor(
    public var wSvcPriority: UShort,
    pszTargetNameCtorArg: Pstr,
    public var cSvcParams: UShort,
    pSvcParamsCtorArg: MutPtr<DnsSvcbParam>,
) {
    public var pszTargetName: Pstr = pszTargetNameCtorArg
        internal set

    public var pSvcParams: MutPtr<DnsSvcbParam> = pSvcParamsCtorArg
        internal set

    public constructor() : this(
        wSvcPriority = 0u,
        pszTargetNameCtorArg = MutPtr(0L),
        cSvcParams = 0u,
        pSvcParamsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.wSvcPriority

    public operator fun component2(): Pstr = this.pszTargetName

    public operator fun component3(): UShort = this.cSvcParams

    public operator fun component4(): MutPtr<DnsSvcbParam> = this.pSvcParams

    public fun copy(wSvcPriority: UShort = this.wSvcPriority, pszTargetName: Pstr = this.pszTargetName, cSvcParams: UShort = this.cSvcParams, pSvcParams: MutPtr<DnsSvcbParam> = this.pSvcParams): DnsSvcbData = DnsSvcbData(wSvcPriority = wSvcPriority, pszTargetNameCtorArg = pszTargetName, cSvcParams = cSvcParams, pSvcParamsCtorArg = pSvcParams)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsSvcbData) return false
        if (this.wSvcPriority != other.wSvcPriority) return false
        if (this.pszTargetName != other.pszTargetName) return false
        if (this.cSvcParams != other.cSvcParams) return false
        if (this.pSvcParams != other.pSvcParams) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wSvcPriority.hashCode()
        result = 31 * result + this.pszTargetName.hashCode()
        result = 31 * result + this.cSvcParams.hashCode()
        result = 31 * result + this.pSvcParams.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wSvcPriority: UShort = 0u,
            pszTargetName: Pstr = MutPtr(0L),
            cSvcParams: UShort = 0u,
            pSvcParams: MutPtr<DnsSvcbParam> = MutPtr(0L),
        ): DnsSvcbData =
            DnsSvcbData(
                wSvcPriority = wSvcPriority,
                pszTargetNameCtorArg = pszTargetName,
                cSvcParams = cSvcParams,
                pSvcParamsCtorArg = pSvcParams,
            )
    }
}

public data class DnsSvcbParam(
    public var wSvcParamKey: UShort = 0u,
    public var anonymous: DnsSvcbParam0 = DnsSvcbParam0(),
)

public class DnsSvcbParam0 internal constructor(
    pIpv4HintsCtorArg: MutPtr<DnsSvcbParamIpv4>,
    pIpv6HintsCtorArg: MutPtr<DnsSvcbParamIpv6>,
    pMandatoryCtorArg: MutPtr<DnsSvcbParamMandatory>,
    pAlpnCtorArg: MutPtr<DnsSvcbParamAlpn>,
    public var wPort: UShort,
    pUnknownCtorArg: MutPtr<DnsSvcbParamUnknown>,
    pszDohPathCtorArg: Pstr,
    pReservedCtorArg: MutPtr<CVoid>,
) {
    public var pIpv4Hints: MutPtr<DnsSvcbParamIpv4> = pIpv4HintsCtorArg
        internal set

    public var pIpv6Hints: MutPtr<DnsSvcbParamIpv6> = pIpv6HintsCtorArg
        internal set

    public var pMandatory: MutPtr<DnsSvcbParamMandatory> = pMandatoryCtorArg
        internal set

    public var pAlpn: MutPtr<DnsSvcbParamAlpn> = pAlpnCtorArg
        internal set

    public var pUnknown: MutPtr<DnsSvcbParamUnknown> = pUnknownCtorArg
        internal set

    public var pszDohPath: Pstr = pszDohPathCtorArg
        internal set

    public var pReserved: MutPtr<CVoid> = pReservedCtorArg
        internal set

    public constructor() : this(
        pIpv4HintsCtorArg = MutPtr(0L),
        pIpv6HintsCtorArg = MutPtr(0L),
        pMandatoryCtorArg = MutPtr(0L),
        pAlpnCtorArg = MutPtr(0L),
        wPort = 0u,
        pUnknownCtorArg = MutPtr(0L),
        pszDohPathCtorArg = MutPtr(0L),
        pReservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<DnsSvcbParamIpv4> = this.pIpv4Hints

    public operator fun component2(): MutPtr<DnsSvcbParamIpv6> = this.pIpv6Hints

    public operator fun component3(): MutPtr<DnsSvcbParamMandatory> = this.pMandatory

    public operator fun component4(): MutPtr<DnsSvcbParamAlpn> = this.pAlpn

    public operator fun component5(): UShort = this.wPort

    public operator fun component6(): MutPtr<DnsSvcbParamUnknown> = this.pUnknown

    public operator fun component7(): Pstr = this.pszDohPath

    public operator fun component8(): MutPtr<CVoid> = this.pReserved

    public fun copy(pIpv4Hints: MutPtr<DnsSvcbParamIpv4> = this.pIpv4Hints, pIpv6Hints: MutPtr<DnsSvcbParamIpv6> = this.pIpv6Hints, pMandatory: MutPtr<DnsSvcbParamMandatory> = this.pMandatory, pAlpn: MutPtr<DnsSvcbParamAlpn> = this.pAlpn, wPort: UShort = this.wPort, pUnknown: MutPtr<DnsSvcbParamUnknown> = this.pUnknown, pszDohPath: Pstr = this.pszDohPath, pReserved: MutPtr<CVoid> = this.pReserved): DnsSvcbParam0 = DnsSvcbParam0(pIpv4HintsCtorArg = pIpv4Hints, pIpv6HintsCtorArg = pIpv6Hints, pMandatoryCtorArg = pMandatory, pAlpnCtorArg = pAlpn, wPort = wPort, pUnknownCtorArg = pUnknown, pszDohPathCtorArg = pszDohPath, pReservedCtorArg = pReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsSvcbParam0) return false
        if (this.pIpv4Hints != other.pIpv4Hints) return false
        if (this.pIpv6Hints != other.pIpv6Hints) return false
        if (this.pMandatory != other.pMandatory) return false
        if (this.pAlpn != other.pAlpn) return false
        if (this.wPort != other.wPort) return false
        if (this.pUnknown != other.pUnknown) return false
        if (this.pszDohPath != other.pszDohPath) return false
        if (this.pReserved != other.pReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pIpv4Hints.hashCode()
        result = 31 * result + this.pIpv6Hints.hashCode()
        result = 31 * result + this.pMandatory.hashCode()
        result = 31 * result + this.pAlpn.hashCode()
        result = 31 * result + this.wPort.hashCode()
        result = 31 * result + this.pUnknown.hashCode()
        result = 31 * result + this.pszDohPath.hashCode()
        result = 31 * result + this.pReserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pIpv4Hints: MutPtr<DnsSvcbParamIpv4> = MutPtr(0L),
            pIpv6Hints: MutPtr<DnsSvcbParamIpv6> = MutPtr(0L),
            pMandatory: MutPtr<DnsSvcbParamMandatory> = MutPtr(0L),
            pAlpn: MutPtr<DnsSvcbParamAlpn> = MutPtr(0L),
            wPort: UShort = 0u,
            pUnknown: MutPtr<DnsSvcbParamUnknown> = MutPtr(0L),
            pszDohPath: Pstr = MutPtr(0L),
            pReserved: MutPtr<CVoid> = MutPtr(0L),
        ): DnsSvcbParam0 =
            DnsSvcbParam0(
                pIpv4HintsCtorArg = pIpv4Hints,
                pIpv6HintsCtorArg = pIpv6Hints,
                pMandatoryCtorArg = pMandatory,
                pAlpnCtorArg = pAlpn,
                wPort = wPort,
                pUnknownCtorArg = pUnknown,
                pszDohPathCtorArg = pszDohPath,
                pReservedCtorArg = pReserved,
            )
    }
}

public data class DnsSvcbParamAlpn(
    public var cIds: UShort = 0u,
    public var rgIds: List<DnsSvcbParamAlpnId> = List(1) { DnsSvcbParamAlpnId() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsSvcbParamAlpn> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsSvcbParamAlpn> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DnsSvcbParamAlpn =
                    DnsSvcbParamAlpn(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(DnsSvcbParamAlpnId.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DnsSvcbParamAlpn) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cIds)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(DnsSvcbParamAlpnId.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.rgIds)
                }
            }
    }
}

public class DnsSvcbParamAlpnId internal constructor(
    public var cBytes: UByte,
    pbIdCtorArg: MutPtr<UByte>,
) {
    public var pbId: MutPtr<UByte> = pbIdCtorArg
        internal set

    public constructor() : this(
        cBytes = 0u,
        pbIdCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.cBytes

    public operator fun component2(): MutPtr<UByte> = this.pbId

    public fun copy(cBytes: UByte = this.cBytes, pbId: MutPtr<UByte> = this.pbId): DnsSvcbParamAlpnId = DnsSvcbParamAlpnId(cBytes = cBytes, pbIdCtorArg = pbId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsSvcbParamAlpnId) return false
        if (this.cBytes != other.cBytes) return false
        if (this.pbId != other.pbId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cBytes.hashCode()
        result = 31 * result + this.pbId.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsSvcbParamAlpnId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsSvcbParamAlpnId> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DnsSvcbParamAlpnId =
                    DnsSvcbParamAlpnId(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DnsSvcbParamAlpnId) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.cBytes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbId)
                }
            }

        public operator fun invoke(
            cBytes: UByte = 0u,
            pbId: MutPtr<UByte> = MutPtr(0L),
        ): DnsSvcbParamAlpnId =
            DnsSvcbParamAlpnId(
                cBytes = cBytes,
                pbIdCtorArg = pbId,
            )
    }
}

public data class DnsSvcbParamIpv4(
    public var cIps: UShort = 0u,
    public var rgIps: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsSvcbParamIpv4) return false
        if (this.cIps != other.cIps) return false
        if (!this.rgIps.contentEquals(other.rgIps)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cIps.hashCode()
        result = 31 * result + this.rgIps.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsSvcbParamIpv4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsSvcbParamIpv4> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DnsSvcbParamIpv4 =
                    DnsSvcbParamIpv4(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DnsSvcbParamIpv4) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cIps)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 4L, value.rgIps)
                }
            }
    }
}

public data class DnsSvcbParamIpv6(
    public var cIps: UShort = 0u,
    public var rgIps: List<Ip6Address> = List(1) { Ip6Address() },
)

public data class DnsSvcbParamMandatory(
    public var cMandatoryKeys: UShort = 0u,
    public var rgwMandatoryKeys: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsSvcbParamMandatory) return false
        if (this.cMandatoryKeys != other.cMandatoryKeys) return false
        if (!this.rgwMandatoryKeys.contentEquals(other.rgwMandatoryKeys)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cMandatoryKeys.hashCode()
        result = 31 * result + this.rgwMandatoryKeys.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsSvcbParamMandatory> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsSvcbParamMandatory> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): DnsSvcbParamMandatory =
                    DnsSvcbParamMandatory(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: DnsSvcbParamMandatory) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cMandatoryKeys)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 2L, value.rgwMandatoryKeys)
                }
            }
    }
}

public data class DnsSvcbParamUnknown(
    public var cBytes: UShort = 0u,
    public var pbSvcParamValue: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsSvcbParamUnknown) return false
        if (this.cBytes != other.cBytes) return false
        if (!this.pbSvcParamValue.contentEquals(other.pbSvcParamValue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cBytes.hashCode()
        result = 31 * result + this.pbSvcParamValue.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsSvcbParamUnknown> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsSvcbParamUnknown> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): DnsSvcbParamUnknown =
                    DnsSvcbParamUnknown(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: DnsSvcbParamUnknown) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cBytes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 2L, value.pbSvcParamValue)
                }
            }
    }
}

public class DnsTkeyDataa internal constructor(
    pNameAlgorithmCtorArg: Pstr,
    pAlgorithmPacketCtorArg: MutPtr<UByte>,
    pKeyCtorArg: MutPtr<UByte>,
    pOtherDataCtorArg: MutPtr<UByte>,
    public var dwCreateTime: UInt,
    public var dwExpireTime: UInt,
    public var wMode: UShort,
    public var wError: UShort,
    public var wKeyLength: UShort,
    public var wOtherLength: UShort,
    public var cAlgNameLength: UByte,
    public var bPacketPointers: Bool,
) {
    public var pNameAlgorithm: Pstr = pNameAlgorithmCtorArg
        internal set

    public var pAlgorithmPacket: MutPtr<UByte> = pAlgorithmPacketCtorArg
        internal set

    public var pKey: MutPtr<UByte> = pKeyCtorArg
        internal set

    public var pOtherData: MutPtr<UByte> = pOtherDataCtorArg
        internal set

    public constructor() : this(
        pNameAlgorithmCtorArg = MutPtr(0L),
        pAlgorithmPacketCtorArg = MutPtr(0L),
        pKeyCtorArg = MutPtr(0L),
        pOtherDataCtorArg = MutPtr(0L),
        dwCreateTime = 0u,
        dwExpireTime = 0u,
        wMode = 0u,
        wError = 0u,
        wKeyLength = 0u,
        wOtherLength = 0u,
        cAlgNameLength = 0u,
        bPacketPointers = 0,
    )

    public operator fun component1(): Pstr = this.pNameAlgorithm

    public operator fun component2(): MutPtr<UByte> = this.pAlgorithmPacket

    public operator fun component3(): MutPtr<UByte> = this.pKey

    public operator fun component4(): MutPtr<UByte> = this.pOtherData

    public operator fun component5(): UInt = this.dwCreateTime

    public operator fun component6(): UInt = this.dwExpireTime

    public operator fun component7(): UShort = this.wMode

    public operator fun component8(): UShort = this.wError

    public operator fun component9(): UShort = this.wKeyLength

    public operator fun component10(): UShort = this.wOtherLength

    public operator fun component11(): UByte = this.cAlgNameLength

    public operator fun component12(): Bool = this.bPacketPointers

    public fun copy(pNameAlgorithm: Pstr = this.pNameAlgorithm, pAlgorithmPacket: MutPtr<UByte> = this.pAlgorithmPacket, pKey: MutPtr<UByte> = this.pKey, pOtherData: MutPtr<UByte> = this.pOtherData, dwCreateTime: UInt = this.dwCreateTime, dwExpireTime: UInt = this.dwExpireTime, wMode: UShort = this.wMode, wError: UShort = this.wError, wKeyLength: UShort = this.wKeyLength, wOtherLength: UShort = this.wOtherLength, cAlgNameLength: UByte = this.cAlgNameLength, bPacketPointers: Bool = this.bPacketPointers): DnsTkeyDataa = DnsTkeyDataa(pNameAlgorithmCtorArg = pNameAlgorithm, pAlgorithmPacketCtorArg = pAlgorithmPacket, pKeyCtorArg = pKey, pOtherDataCtorArg = pOtherData, dwCreateTime = dwCreateTime, dwExpireTime = dwExpireTime, wMode = wMode, wError = wError, wKeyLength = wKeyLength, wOtherLength = wOtherLength, cAlgNameLength = cAlgNameLength, bPacketPointers = bPacketPointers)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsTkeyDataa) return false
        if (this.pNameAlgorithm != other.pNameAlgorithm) return false
        if (this.pAlgorithmPacket != other.pAlgorithmPacket) return false
        if (this.pKey != other.pKey) return false
        if (this.pOtherData != other.pOtherData) return false
        if (this.dwCreateTime != other.dwCreateTime) return false
        if (this.dwExpireTime != other.dwExpireTime) return false
        if (this.wMode != other.wMode) return false
        if (this.wError != other.wError) return false
        if (this.wKeyLength != other.wKeyLength) return false
        if (this.wOtherLength != other.wOtherLength) return false
        if (this.cAlgNameLength != other.cAlgNameLength) return false
        if (this.bPacketPointers != other.bPacketPointers) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNameAlgorithm.hashCode()
        result = 31 * result + this.pAlgorithmPacket.hashCode()
        result = 31 * result + this.pKey.hashCode()
        result = 31 * result + this.pOtherData.hashCode()
        result = 31 * result + this.dwCreateTime.hashCode()
        result = 31 * result + this.dwExpireTime.hashCode()
        result = 31 * result + this.wMode.hashCode()
        result = 31 * result + this.wError.hashCode()
        result = 31 * result + this.wKeyLength.hashCode()
        result = 31 * result + this.wOtherLength.hashCode()
        result = 31 * result + this.cAlgNameLength.hashCode()
        result = 31 * result + this.bPacketPointers.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pNameAlgorithm: Pstr = MutPtr(0L),
            pAlgorithmPacket: MutPtr<UByte> = MutPtr(0L),
            pKey: MutPtr<UByte> = MutPtr(0L),
            pOtherData: MutPtr<UByte> = MutPtr(0L),
            dwCreateTime: UInt = 0u,
            dwExpireTime: UInt = 0u,
            wMode: UShort = 0u,
            wError: UShort = 0u,
            wKeyLength: UShort = 0u,
            wOtherLength: UShort = 0u,
            cAlgNameLength: UByte = 0u,
            bPacketPointers: Bool = 0,
        ): DnsTkeyDataa =
            DnsTkeyDataa(
                pNameAlgorithmCtorArg = pNameAlgorithm,
                pAlgorithmPacketCtorArg = pAlgorithmPacket,
                pKeyCtorArg = pKey,
                pOtherDataCtorArg = pOtherData,
                dwCreateTime = dwCreateTime,
                dwExpireTime = dwExpireTime,
                wMode = wMode,
                wError = wError,
                wKeyLength = wKeyLength,
                wOtherLength = wOtherLength,
                cAlgNameLength = cAlgNameLength,
                bPacketPointers = bPacketPointers,
            )
    }
}

public class DnsTkeyDataw internal constructor(
    pNameAlgorithmCtorArg: Pwstr,
    pAlgorithmPacketCtorArg: MutPtr<UByte>,
    pKeyCtorArg: MutPtr<UByte>,
    pOtherDataCtorArg: MutPtr<UByte>,
    public var dwCreateTime: UInt,
    public var dwExpireTime: UInt,
    public var wMode: UShort,
    public var wError: UShort,
    public var wKeyLength: UShort,
    public var wOtherLength: UShort,
    public var cAlgNameLength: UByte,
    public var bPacketPointers: Bool,
) {
    public var pNameAlgorithm: Pwstr = pNameAlgorithmCtorArg
        internal set

    public var pAlgorithmPacket: MutPtr<UByte> = pAlgorithmPacketCtorArg
        internal set

    public var pKey: MutPtr<UByte> = pKeyCtorArg
        internal set

    public var pOtherData: MutPtr<UByte> = pOtherDataCtorArg
        internal set

    public constructor() : this(
        pNameAlgorithmCtorArg = MutPtr(0L),
        pAlgorithmPacketCtorArg = MutPtr(0L),
        pKeyCtorArg = MutPtr(0L),
        pOtherDataCtorArg = MutPtr(0L),
        dwCreateTime = 0u,
        dwExpireTime = 0u,
        wMode = 0u,
        wError = 0u,
        wKeyLength = 0u,
        wOtherLength = 0u,
        cAlgNameLength = 0u,
        bPacketPointers = 0,
    )

    public operator fun component1(): Pwstr = this.pNameAlgorithm

    public operator fun component2(): MutPtr<UByte> = this.pAlgorithmPacket

    public operator fun component3(): MutPtr<UByte> = this.pKey

    public operator fun component4(): MutPtr<UByte> = this.pOtherData

    public operator fun component5(): UInt = this.dwCreateTime

    public operator fun component6(): UInt = this.dwExpireTime

    public operator fun component7(): UShort = this.wMode

    public operator fun component8(): UShort = this.wError

    public operator fun component9(): UShort = this.wKeyLength

    public operator fun component10(): UShort = this.wOtherLength

    public operator fun component11(): UByte = this.cAlgNameLength

    public operator fun component12(): Bool = this.bPacketPointers

    public fun copy(pNameAlgorithm: Pwstr = this.pNameAlgorithm, pAlgorithmPacket: MutPtr<UByte> = this.pAlgorithmPacket, pKey: MutPtr<UByte> = this.pKey, pOtherData: MutPtr<UByte> = this.pOtherData, dwCreateTime: UInt = this.dwCreateTime, dwExpireTime: UInt = this.dwExpireTime, wMode: UShort = this.wMode, wError: UShort = this.wError, wKeyLength: UShort = this.wKeyLength, wOtherLength: UShort = this.wOtherLength, cAlgNameLength: UByte = this.cAlgNameLength, bPacketPointers: Bool = this.bPacketPointers): DnsTkeyDataw = DnsTkeyDataw(pNameAlgorithmCtorArg = pNameAlgorithm, pAlgorithmPacketCtorArg = pAlgorithmPacket, pKeyCtorArg = pKey, pOtherDataCtorArg = pOtherData, dwCreateTime = dwCreateTime, dwExpireTime = dwExpireTime, wMode = wMode, wError = wError, wKeyLength = wKeyLength, wOtherLength = wOtherLength, cAlgNameLength = cAlgNameLength, bPacketPointers = bPacketPointers)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsTkeyDataw) return false
        if (this.pNameAlgorithm != other.pNameAlgorithm) return false
        if (this.pAlgorithmPacket != other.pAlgorithmPacket) return false
        if (this.pKey != other.pKey) return false
        if (this.pOtherData != other.pOtherData) return false
        if (this.dwCreateTime != other.dwCreateTime) return false
        if (this.dwExpireTime != other.dwExpireTime) return false
        if (this.wMode != other.wMode) return false
        if (this.wError != other.wError) return false
        if (this.wKeyLength != other.wKeyLength) return false
        if (this.wOtherLength != other.wOtherLength) return false
        if (this.cAlgNameLength != other.cAlgNameLength) return false
        if (this.bPacketPointers != other.bPacketPointers) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNameAlgorithm.hashCode()
        result = 31 * result + this.pAlgorithmPacket.hashCode()
        result = 31 * result + this.pKey.hashCode()
        result = 31 * result + this.pOtherData.hashCode()
        result = 31 * result + this.dwCreateTime.hashCode()
        result = 31 * result + this.dwExpireTime.hashCode()
        result = 31 * result + this.wMode.hashCode()
        result = 31 * result + this.wError.hashCode()
        result = 31 * result + this.wKeyLength.hashCode()
        result = 31 * result + this.wOtherLength.hashCode()
        result = 31 * result + this.cAlgNameLength.hashCode()
        result = 31 * result + this.bPacketPointers.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pNameAlgorithm: Pwstr = MutPtr(0L),
            pAlgorithmPacket: MutPtr<UByte> = MutPtr(0L),
            pKey: MutPtr<UByte> = MutPtr(0L),
            pOtherData: MutPtr<UByte> = MutPtr(0L),
            dwCreateTime: UInt = 0u,
            dwExpireTime: UInt = 0u,
            wMode: UShort = 0u,
            wError: UShort = 0u,
            wKeyLength: UShort = 0u,
            wOtherLength: UShort = 0u,
            cAlgNameLength: UByte = 0u,
            bPacketPointers: Bool = 0,
        ): DnsTkeyDataw =
            DnsTkeyDataw(
                pNameAlgorithmCtorArg = pNameAlgorithm,
                pAlgorithmPacketCtorArg = pAlgorithmPacket,
                pKeyCtorArg = pKey,
                pOtherDataCtorArg = pOtherData,
                dwCreateTime = dwCreateTime,
                dwExpireTime = dwExpireTime,
                wMode = wMode,
                wError = wError,
                wKeyLength = wKeyLength,
                wOtherLength = wOtherLength,
                cAlgNameLength = cAlgNameLength,
                bPacketPointers = bPacketPointers,
            )
    }
}

public data class DnsTlsaData(
    public var bCertUsage: UByte = 0u,
    public var bSelector: UByte = 0u,
    public var bMatchingType: UByte = 0u,
    public var bCertificateAssociationDataLength: UShort = 0u,
    public var bPad: UByteArray = UByteArray(3),
    public var bCertificateAssociationData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsTlsaData) return false
        if (this.bCertUsage != other.bCertUsage) return false
        if (this.bSelector != other.bSelector) return false
        if (this.bMatchingType != other.bMatchingType) return false
        if (this.bCertificateAssociationDataLength != other.bCertificateAssociationDataLength) return false
        if (!this.bPad.contentEquals(other.bPad)) return false
        if (!this.bCertificateAssociationData.contentEquals(other.bCertificateAssociationData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bCertUsage.hashCode()
        result = 31 * result + this.bSelector.hashCode()
        result = 31 * result + this.bMatchingType.hashCode()
        result = 31 * result + this.bCertificateAssociationDataLength.hashCode()
        result = 31 * result + this.bPad.contentHashCode()
        result = 31 * result + this.bCertificateAssociationData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsTlsaData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsTlsaData> {
                override val sizeBytes: Long = 10L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): DnsTlsaData =
                    DnsTlsaData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: DnsTlsaData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bCertUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bSelector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.bMatchingType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.bCertificateAssociationDataLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 6L, value.bPad)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 9L, value.bCertificateAssociationData)
                }
            }
    }
}

public class DnsTsigDataa internal constructor(
    pNameAlgorithmCtorArg: Pstr,
    pAlgorithmPacketCtorArg: MutPtr<UByte>,
    pSignatureCtorArg: MutPtr<UByte>,
    pOtherDataCtorArg: MutPtr<UByte>,
    public var i64CreateTime: Long,
    public var wFudgeTime: UShort,
    public var wOriginalXid: UShort,
    public var wError: UShort,
    public var wSigLength: UShort,
    public var wOtherLength: UShort,
    public var cAlgNameLength: UByte,
    public var bPacketPointers: Bool,
) {
    public var pNameAlgorithm: Pstr = pNameAlgorithmCtorArg
        internal set

    public var pAlgorithmPacket: MutPtr<UByte> = pAlgorithmPacketCtorArg
        internal set

    public var pSignature: MutPtr<UByte> = pSignatureCtorArg
        internal set

    public var pOtherData: MutPtr<UByte> = pOtherDataCtorArg
        internal set

    public constructor() : this(
        pNameAlgorithmCtorArg = MutPtr(0L),
        pAlgorithmPacketCtorArg = MutPtr(0L),
        pSignatureCtorArg = MutPtr(0L),
        pOtherDataCtorArg = MutPtr(0L),
        i64CreateTime = 0L,
        wFudgeTime = 0u,
        wOriginalXid = 0u,
        wError = 0u,
        wSigLength = 0u,
        wOtherLength = 0u,
        cAlgNameLength = 0u,
        bPacketPointers = 0,
    )

    public operator fun component1(): Pstr = this.pNameAlgorithm

    public operator fun component2(): MutPtr<UByte> = this.pAlgorithmPacket

    public operator fun component3(): MutPtr<UByte> = this.pSignature

    public operator fun component4(): MutPtr<UByte> = this.pOtherData

    public operator fun component5(): Long = this.i64CreateTime

    public operator fun component6(): UShort = this.wFudgeTime

    public operator fun component7(): UShort = this.wOriginalXid

    public operator fun component8(): UShort = this.wError

    public operator fun component9(): UShort = this.wSigLength

    public operator fun component10(): UShort = this.wOtherLength

    public operator fun component11(): UByte = this.cAlgNameLength

    public operator fun component12(): Bool = this.bPacketPointers

    public fun copy(pNameAlgorithm: Pstr = this.pNameAlgorithm, pAlgorithmPacket: MutPtr<UByte> = this.pAlgorithmPacket, pSignature: MutPtr<UByte> = this.pSignature, pOtherData: MutPtr<UByte> = this.pOtherData, i64CreateTime: Long = this.i64CreateTime, wFudgeTime: UShort = this.wFudgeTime, wOriginalXid: UShort = this.wOriginalXid, wError: UShort = this.wError, wSigLength: UShort = this.wSigLength, wOtherLength: UShort = this.wOtherLength, cAlgNameLength: UByte = this.cAlgNameLength, bPacketPointers: Bool = this.bPacketPointers): DnsTsigDataa = DnsTsigDataa(pNameAlgorithmCtorArg = pNameAlgorithm, pAlgorithmPacketCtorArg = pAlgorithmPacket, pSignatureCtorArg = pSignature, pOtherDataCtorArg = pOtherData, i64CreateTime = i64CreateTime, wFudgeTime = wFudgeTime, wOriginalXid = wOriginalXid, wError = wError, wSigLength = wSigLength, wOtherLength = wOtherLength, cAlgNameLength = cAlgNameLength, bPacketPointers = bPacketPointers)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsTsigDataa) return false
        if (this.pNameAlgorithm != other.pNameAlgorithm) return false
        if (this.pAlgorithmPacket != other.pAlgorithmPacket) return false
        if (this.pSignature != other.pSignature) return false
        if (this.pOtherData != other.pOtherData) return false
        if (this.i64CreateTime != other.i64CreateTime) return false
        if (this.wFudgeTime != other.wFudgeTime) return false
        if (this.wOriginalXid != other.wOriginalXid) return false
        if (this.wError != other.wError) return false
        if (this.wSigLength != other.wSigLength) return false
        if (this.wOtherLength != other.wOtherLength) return false
        if (this.cAlgNameLength != other.cAlgNameLength) return false
        if (this.bPacketPointers != other.bPacketPointers) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNameAlgorithm.hashCode()
        result = 31 * result + this.pAlgorithmPacket.hashCode()
        result = 31 * result + this.pSignature.hashCode()
        result = 31 * result + this.pOtherData.hashCode()
        result = 31 * result + this.i64CreateTime.hashCode()
        result = 31 * result + this.wFudgeTime.hashCode()
        result = 31 * result + this.wOriginalXid.hashCode()
        result = 31 * result + this.wError.hashCode()
        result = 31 * result + this.wSigLength.hashCode()
        result = 31 * result + this.wOtherLength.hashCode()
        result = 31 * result + this.cAlgNameLength.hashCode()
        result = 31 * result + this.bPacketPointers.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pNameAlgorithm: Pstr = MutPtr(0L),
            pAlgorithmPacket: MutPtr<UByte> = MutPtr(0L),
            pSignature: MutPtr<UByte> = MutPtr(0L),
            pOtherData: MutPtr<UByte> = MutPtr(0L),
            i64CreateTime: Long = 0L,
            wFudgeTime: UShort = 0u,
            wOriginalXid: UShort = 0u,
            wError: UShort = 0u,
            wSigLength: UShort = 0u,
            wOtherLength: UShort = 0u,
            cAlgNameLength: UByte = 0u,
            bPacketPointers: Bool = 0,
        ): DnsTsigDataa =
            DnsTsigDataa(
                pNameAlgorithmCtorArg = pNameAlgorithm,
                pAlgorithmPacketCtorArg = pAlgorithmPacket,
                pSignatureCtorArg = pSignature,
                pOtherDataCtorArg = pOtherData,
                i64CreateTime = i64CreateTime,
                wFudgeTime = wFudgeTime,
                wOriginalXid = wOriginalXid,
                wError = wError,
                wSigLength = wSigLength,
                wOtherLength = wOtherLength,
                cAlgNameLength = cAlgNameLength,
                bPacketPointers = bPacketPointers,
            )
    }
}

public class DnsTsigDataw internal constructor(
    pNameAlgorithmCtorArg: Pwstr,
    pAlgorithmPacketCtorArg: MutPtr<UByte>,
    pSignatureCtorArg: MutPtr<UByte>,
    pOtherDataCtorArg: MutPtr<UByte>,
    public var i64CreateTime: Long,
    public var wFudgeTime: UShort,
    public var wOriginalXid: UShort,
    public var wError: UShort,
    public var wSigLength: UShort,
    public var wOtherLength: UShort,
    public var cAlgNameLength: UByte,
    public var bPacketPointers: Bool,
) {
    public var pNameAlgorithm: Pwstr = pNameAlgorithmCtorArg
        internal set

    public var pAlgorithmPacket: MutPtr<UByte> = pAlgorithmPacketCtorArg
        internal set

    public var pSignature: MutPtr<UByte> = pSignatureCtorArg
        internal set

    public var pOtherData: MutPtr<UByte> = pOtherDataCtorArg
        internal set

    public constructor() : this(
        pNameAlgorithmCtorArg = MutPtr(0L),
        pAlgorithmPacketCtorArg = MutPtr(0L),
        pSignatureCtorArg = MutPtr(0L),
        pOtherDataCtorArg = MutPtr(0L),
        i64CreateTime = 0L,
        wFudgeTime = 0u,
        wOriginalXid = 0u,
        wError = 0u,
        wSigLength = 0u,
        wOtherLength = 0u,
        cAlgNameLength = 0u,
        bPacketPointers = 0,
    )

    public operator fun component1(): Pwstr = this.pNameAlgorithm

    public operator fun component2(): MutPtr<UByte> = this.pAlgorithmPacket

    public operator fun component3(): MutPtr<UByte> = this.pSignature

    public operator fun component4(): MutPtr<UByte> = this.pOtherData

    public operator fun component5(): Long = this.i64CreateTime

    public operator fun component6(): UShort = this.wFudgeTime

    public operator fun component7(): UShort = this.wOriginalXid

    public operator fun component8(): UShort = this.wError

    public operator fun component9(): UShort = this.wSigLength

    public operator fun component10(): UShort = this.wOtherLength

    public operator fun component11(): UByte = this.cAlgNameLength

    public operator fun component12(): Bool = this.bPacketPointers

    public fun copy(pNameAlgorithm: Pwstr = this.pNameAlgorithm, pAlgorithmPacket: MutPtr<UByte> = this.pAlgorithmPacket, pSignature: MutPtr<UByte> = this.pSignature, pOtherData: MutPtr<UByte> = this.pOtherData, i64CreateTime: Long = this.i64CreateTime, wFudgeTime: UShort = this.wFudgeTime, wOriginalXid: UShort = this.wOriginalXid, wError: UShort = this.wError, wSigLength: UShort = this.wSigLength, wOtherLength: UShort = this.wOtherLength, cAlgNameLength: UByte = this.cAlgNameLength, bPacketPointers: Bool = this.bPacketPointers): DnsTsigDataw = DnsTsigDataw(pNameAlgorithmCtorArg = pNameAlgorithm, pAlgorithmPacketCtorArg = pAlgorithmPacket, pSignatureCtorArg = pSignature, pOtherDataCtorArg = pOtherData, i64CreateTime = i64CreateTime, wFudgeTime = wFudgeTime, wOriginalXid = wOriginalXid, wError = wError, wSigLength = wSigLength, wOtherLength = wOtherLength, cAlgNameLength = cAlgNameLength, bPacketPointers = bPacketPointers)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsTsigDataw) return false
        if (this.pNameAlgorithm != other.pNameAlgorithm) return false
        if (this.pAlgorithmPacket != other.pAlgorithmPacket) return false
        if (this.pSignature != other.pSignature) return false
        if (this.pOtherData != other.pOtherData) return false
        if (this.i64CreateTime != other.i64CreateTime) return false
        if (this.wFudgeTime != other.wFudgeTime) return false
        if (this.wOriginalXid != other.wOriginalXid) return false
        if (this.wError != other.wError) return false
        if (this.wSigLength != other.wSigLength) return false
        if (this.wOtherLength != other.wOtherLength) return false
        if (this.cAlgNameLength != other.cAlgNameLength) return false
        if (this.bPacketPointers != other.bPacketPointers) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNameAlgorithm.hashCode()
        result = 31 * result + this.pAlgorithmPacket.hashCode()
        result = 31 * result + this.pSignature.hashCode()
        result = 31 * result + this.pOtherData.hashCode()
        result = 31 * result + this.i64CreateTime.hashCode()
        result = 31 * result + this.wFudgeTime.hashCode()
        result = 31 * result + this.wOriginalXid.hashCode()
        result = 31 * result + this.wError.hashCode()
        result = 31 * result + this.wSigLength.hashCode()
        result = 31 * result + this.wOtherLength.hashCode()
        result = 31 * result + this.cAlgNameLength.hashCode()
        result = 31 * result + this.bPacketPointers.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pNameAlgorithm: Pwstr = MutPtr(0L),
            pAlgorithmPacket: MutPtr<UByte> = MutPtr(0L),
            pSignature: MutPtr<UByte> = MutPtr(0L),
            pOtherData: MutPtr<UByte> = MutPtr(0L),
            i64CreateTime: Long = 0L,
            wFudgeTime: UShort = 0u,
            wOriginalXid: UShort = 0u,
            wError: UShort = 0u,
            wSigLength: UShort = 0u,
            wOtherLength: UShort = 0u,
            cAlgNameLength: UByte = 0u,
            bPacketPointers: Bool = 0,
        ): DnsTsigDataw =
            DnsTsigDataw(
                pNameAlgorithmCtorArg = pNameAlgorithm,
                pAlgorithmPacketCtorArg = pAlgorithmPacket,
                pSignatureCtorArg = pSignature,
                pOtherDataCtorArg = pOtherData,
                i64CreateTime = i64CreateTime,
                wFudgeTime = wFudgeTime,
                wOriginalXid = wOriginalXid,
                wError = wError,
                wSigLength = wSigLength,
                wOtherLength = wOtherLength,
                cAlgNameLength = cAlgNameLength,
                bPacketPointers = bPacketPointers,
            )
    }
}

public class DnsTxtDataa internal constructor(
    public var dwStringCount: UInt,
    pStringArrayCtorArg: List<Pstr>,
) {
    public var pStringArray: List<Pstr> = pStringArrayCtorArg
        internal set

    public constructor() : this(
        dwStringCount = 0u,
        pStringArrayCtorArg = List(1) { MutPtr(0L) },
    )

    public operator fun component1(): UInt = this.dwStringCount

    public operator fun component2(): List<Pstr> = this.pStringArray

    public fun copy(dwStringCount: UInt = this.dwStringCount, pStringArray: List<Pstr> = this.pStringArray): DnsTxtDataa = DnsTxtDataa(dwStringCount = dwStringCount, pStringArrayCtorArg = pStringArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsTxtDataa) return false
        if (this.dwStringCount != other.dwStringCount) return false
        if (this.pStringArray != other.pStringArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStringCount.hashCode()
        result = 31 * result + this.pStringArray.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwStringCount: UInt = 0u,
            pStringArray: List<Pstr> = List(1) { MutPtr(0L) },
        ): DnsTxtDataa =
            DnsTxtDataa(
                dwStringCount = dwStringCount,
                pStringArrayCtorArg = pStringArray,
            )
    }
}

public class DnsTxtDataw internal constructor(
    public var dwStringCount: UInt,
    pStringArrayCtorArg: List<Pwstr>,
) {
    public var pStringArray: List<Pwstr> = pStringArrayCtorArg
        internal set

    public constructor() : this(
        dwStringCount = 0u,
        pStringArrayCtorArg = List(1) { MutPtr(0L) },
    )

    public operator fun component1(): UInt = this.dwStringCount

    public operator fun component2(): List<Pwstr> = this.pStringArray

    public fun copy(dwStringCount: UInt = this.dwStringCount, pStringArray: List<Pwstr> = this.pStringArray): DnsTxtDataw = DnsTxtDataw(dwStringCount = dwStringCount, pStringArrayCtorArg = pStringArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsTxtDataw) return false
        if (this.dwStringCount != other.dwStringCount) return false
        if (this.pStringArray != other.pStringArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStringCount.hashCode()
        result = 31 * result + this.pStringArray.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwStringCount: UInt = 0u,
            pStringArray: List<Pwstr> = List(1) { MutPtr(0L) },
        ): DnsTxtDataw =
            DnsTxtDataw(
                dwStringCount = dwStringCount,
                pStringArrayCtorArg = pStringArray,
            )
    }
}

public data class DnsUnknownData(
    public var dwByteCount: UInt = 0u,
    public var bData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsUnknownData) return false
        if (this.dwByteCount != other.dwByteCount) return false
        if (!this.bData.contentEquals(other.bData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwByteCount.hashCode()
        result = 31 * result + this.bData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsUnknownData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsUnknownData> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DnsUnknownData =
                    DnsUnknownData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DnsUnknownData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwByteCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.bData)
                }
            }
    }
}

public class DnsWinsrDataa internal constructor(
    public var dwMappingFlag: UInt,
    public var dwLookupTimeout: UInt,
    public var dwCacheTimeout: UInt,
    pNameResultDomainCtorArg: Pstr,
) {
    public var pNameResultDomain: Pstr = pNameResultDomainCtorArg
        internal set

    public constructor() : this(
        dwMappingFlag = 0u,
        dwLookupTimeout = 0u,
        dwCacheTimeout = 0u,
        pNameResultDomainCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwMappingFlag

    public operator fun component2(): UInt = this.dwLookupTimeout

    public operator fun component3(): UInt = this.dwCacheTimeout

    public operator fun component4(): Pstr = this.pNameResultDomain

    public fun copy(dwMappingFlag: UInt = this.dwMappingFlag, dwLookupTimeout: UInt = this.dwLookupTimeout, dwCacheTimeout: UInt = this.dwCacheTimeout, pNameResultDomain: Pstr = this.pNameResultDomain): DnsWinsrDataa = DnsWinsrDataa(dwMappingFlag = dwMappingFlag, dwLookupTimeout = dwLookupTimeout, dwCacheTimeout = dwCacheTimeout, pNameResultDomainCtorArg = pNameResultDomain)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsWinsrDataa) return false
        if (this.dwMappingFlag != other.dwMappingFlag) return false
        if (this.dwLookupTimeout != other.dwLookupTimeout) return false
        if (this.dwCacheTimeout != other.dwCacheTimeout) return false
        if (this.pNameResultDomain != other.pNameResultDomain) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMappingFlag.hashCode()
        result = 31 * result + this.dwLookupTimeout.hashCode()
        result = 31 * result + this.dwCacheTimeout.hashCode()
        result = 31 * result + this.pNameResultDomain.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwMappingFlag: UInt = 0u,
            dwLookupTimeout: UInt = 0u,
            dwCacheTimeout: UInt = 0u,
            pNameResultDomain: Pstr = MutPtr(0L),
        ): DnsWinsrDataa =
            DnsWinsrDataa(
                dwMappingFlag = dwMappingFlag,
                dwLookupTimeout = dwLookupTimeout,
                dwCacheTimeout = dwCacheTimeout,
                pNameResultDomainCtorArg = pNameResultDomain,
            )
    }
}

public class DnsWinsrDataw internal constructor(
    public var dwMappingFlag: UInt,
    public var dwLookupTimeout: UInt,
    public var dwCacheTimeout: UInt,
    pNameResultDomainCtorArg: Pwstr,
) {
    public var pNameResultDomain: Pwstr = pNameResultDomainCtorArg
        internal set

    public constructor() : this(
        dwMappingFlag = 0u,
        dwLookupTimeout = 0u,
        dwCacheTimeout = 0u,
        pNameResultDomainCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwMappingFlag

    public operator fun component2(): UInt = this.dwLookupTimeout

    public operator fun component3(): UInt = this.dwCacheTimeout

    public operator fun component4(): Pwstr = this.pNameResultDomain

    public fun copy(dwMappingFlag: UInt = this.dwMappingFlag, dwLookupTimeout: UInt = this.dwLookupTimeout, dwCacheTimeout: UInt = this.dwCacheTimeout, pNameResultDomain: Pwstr = this.pNameResultDomain): DnsWinsrDataw = DnsWinsrDataw(dwMappingFlag = dwMappingFlag, dwLookupTimeout = dwLookupTimeout, dwCacheTimeout = dwCacheTimeout, pNameResultDomainCtorArg = pNameResultDomain)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsWinsrDataw) return false
        if (this.dwMappingFlag != other.dwMappingFlag) return false
        if (this.dwLookupTimeout != other.dwLookupTimeout) return false
        if (this.dwCacheTimeout != other.dwCacheTimeout) return false
        if (this.pNameResultDomain != other.pNameResultDomain) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMappingFlag.hashCode()
        result = 31 * result + this.dwLookupTimeout.hashCode()
        result = 31 * result + this.dwCacheTimeout.hashCode()
        result = 31 * result + this.pNameResultDomain.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwMappingFlag: UInt = 0u,
            dwLookupTimeout: UInt = 0u,
            dwCacheTimeout: UInt = 0u,
            pNameResultDomain: Pwstr = MutPtr(0L),
        ): DnsWinsrDataw =
            DnsWinsrDataw(
                dwMappingFlag = dwMappingFlag,
                dwLookupTimeout = dwLookupTimeout,
                dwCacheTimeout = dwCacheTimeout,
                pNameResultDomainCtorArg = pNameResultDomain,
            )
    }
}

public data class DnsWinsData(
    public var dwMappingFlag: UInt = 0u,
    public var dwLookupTimeout: UInt = 0u,
    public var dwCacheTimeout: UInt = 0u,
    public var cWinsServerCount: UInt = 0u,
    public var winsServers: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsWinsData) return false
        if (this.dwMappingFlag != other.dwMappingFlag) return false
        if (this.dwLookupTimeout != other.dwLookupTimeout) return false
        if (this.dwCacheTimeout != other.dwCacheTimeout) return false
        if (this.cWinsServerCount != other.cWinsServerCount) return false
        if (!this.winsServers.contentEquals(other.winsServers)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMappingFlag.hashCode()
        result = 31 * result + this.dwLookupTimeout.hashCode()
        result = 31 * result + this.dwCacheTimeout.hashCode()
        result = 31 * result + this.cWinsServerCount.hashCode()
        result = 31 * result + this.winsServers.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsWinsData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsWinsData> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DnsWinsData =
                    DnsWinsData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DnsWinsData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMappingFlag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwLookupTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwCacheTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cWinsServerCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 16L, value.winsServers)
                }
            }
    }
}

public data class DnsWireQuestion(
    public var questionType: UShort = 0u,
    public var questionClass: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsWireQuestion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsWireQuestion> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DnsWireQuestion =
                    DnsWireQuestion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: DnsWireQuestion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.questionType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.questionClass)
                }
            }
    }
}

public data class DnsWireRecord(
    public var recordType: UShort = 0u,
    public var recordClass: UShort = 0u,
    public var timeToLive: UInt = 0u,
    public var dataLength: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsWireRecord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsWireRecord> {
                override val sizeBytes: Long = 10L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DnsWireRecord =
                    DnsWireRecord(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DnsWireRecord) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.recordType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.recordClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.timeToLive)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.dataLength)
                }
            }
    }
}

public data class DnsWksData(
    public var ipAddress: UInt = 0u,
    public var chProtocol: UByte = 0u,
    public var bitMask: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsWksData) return false
        if (this.ipAddress != other.ipAddress) return false
        if (this.chProtocol != other.chProtocol) return false
        if (!this.bitMask.contentEquals(other.bitMask)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ipAddress.hashCode()
        result = 31 * result + this.chProtocol.hashCode()
        result = 31 * result + this.bitMask.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsWksData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DnsWksData> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DnsWksData =
                    DnsWksData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 5L),
                    )
                override fun writeNative(addr: Long, value: DnsWksData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ipAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.chProtocol)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 5L, value.bitMask)
                }
            }
    }
}

public data class Ip4Array(
    public var addrCount: UInt = 0u,
    public var addrArray: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ip4Array) return false
        if (this.addrCount != other.addrCount) return false
        if (!this.addrArray.contentEquals(other.addrArray)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addrCount.hashCode()
        result = 31 * result + this.addrArray.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ip4Array> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ip4Array> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ip4Array =
                    Ip4Array(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ip4Array) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.addrCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 4L, value.addrArray)
                }
            }
    }
}

public data class Ip6Address(
    public var iP6Qword: ULongArray = ULongArray(2),
    public var iP6Dword: UIntArray = UIntArray(4),
    public var iP6Word: UShortArray = UShortArray(8),
    public var iP6Byte: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ip6Address) return false
        if (!this.iP6Qword.contentEquals(other.iP6Qword)) return false
        if (!this.iP6Dword.contentEquals(other.iP6Dword)) return false
        if (!this.iP6Word.contentEquals(other.iP6Word)) return false
        if (!this.iP6Byte.contentEquals(other.iP6Byte)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iP6Qword.contentHashCode()
        result = 31 * result + this.iP6Dword.contentHashCode()
        result = 31 * result + this.iP6Word.contentHashCode()
        result = 31 * result + this.iP6Byte.contentHashCode()
        return result
    }
}

public class MdnsQueryHandle internal constructor(
    public var nameBuf: UShortArray,
    public var wType: UShort,
    pSubscriptionCtorArg: MutPtr<CVoid>,
    pWnfCallbackParamsCtorArg: MutPtr<CVoid>,
    public var stateNameData: UIntArray,
) {
    public var pSubscription: MutPtr<CVoid> = pSubscriptionCtorArg
        internal set

    public var pWnfCallbackParams: MutPtr<CVoid> = pWnfCallbackParamsCtorArg
        internal set

    public constructor() : this(
        nameBuf = UShortArray(256),
        wType = 0u,
        pSubscriptionCtorArg = MutPtr(0L),
        pWnfCallbackParamsCtorArg = MutPtr(0L),
        stateNameData = UIntArray(2),
    )

    public operator fun component1(): UShortArray = this.nameBuf

    public operator fun component2(): UShort = this.wType

    public operator fun component3(): MutPtr<CVoid> = this.pSubscription

    public operator fun component4(): MutPtr<CVoid> = this.pWnfCallbackParams

    public operator fun component5(): UIntArray = this.stateNameData

    public fun copy(nameBuf: UShortArray = this.nameBuf, wType: UShort = this.wType, pSubscription: MutPtr<CVoid> = this.pSubscription, pWnfCallbackParams: MutPtr<CVoid> = this.pWnfCallbackParams, stateNameData: UIntArray = this.stateNameData): MdnsQueryHandle = MdnsQueryHandle(nameBuf = nameBuf, wType = wType, pSubscriptionCtorArg = pSubscription, pWnfCallbackParamsCtorArg = pWnfCallbackParams, stateNameData = stateNameData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MdnsQueryHandle) return false
        if (!this.nameBuf.contentEquals(other.nameBuf)) return false
        if (this.wType != other.wType) return false
        if (this.pSubscription != other.pSubscription) return false
        if (this.pWnfCallbackParams != other.pWnfCallbackParams) return false
        if (!this.stateNameData.contentEquals(other.stateNameData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nameBuf.contentHashCode()
        result = 31 * result + this.wType.hashCode()
        result = 31 * result + this.pSubscription.hashCode()
        result = 31 * result + this.pWnfCallbackParams.hashCode()
        result = 31 * result + this.stateNameData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MdnsQueryHandle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MdnsQueryHandle> {
                override val sizeBytes: Long = 544L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): MdnsQueryHandle =
                    MdnsQueryHandle(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 512L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 520L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 528L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 536L),
                    )
                override fun writeNative(addr: Long, value: MdnsQueryHandle) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr, value.nameBuf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 512L, value.wType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 520L, value.pSubscription)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 528L, value.pWnfCallbackParams)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 536L, value.stateNameData)
                }
            }

        public operator fun invoke(
            nameBuf: UShortArray = UShortArray(256),
            wType: UShort = 0u,
            pSubscription: MutPtr<CVoid> = MutPtr(0L),
            pWnfCallbackParams: MutPtr<CVoid> = MutPtr(0L),
            stateNameData: UIntArray = UIntArray(2),
        ): MdnsQueryHandle =
            MdnsQueryHandle(
                nameBuf = nameBuf,
                wType = wType,
                pSubscriptionCtorArg = pSubscription,
                pWnfCallbackParamsCtorArg = pWnfCallbackParams,
                stateNameData = stateNameData,
            )
    }
}

public class MdnsQueryRequest internal constructor(
    public var version: UInt,
    public var ulRefCount: UInt,
    queryCtorArg: Pcwstr,
    public var queryType: UShort,
    public var queryOptions: ULong,
    public var interfaceIndex: UInt,
    public var pQueryCallback: PmdnsQueryCallback,
    pQueryContextCtorArg: MutPtr<CVoid>,
    public var fAnswerReceived: Bool,
    public var ulResendCount: UInt,
) {
    public var query: Pcwstr = queryCtorArg
        internal set

    public var pQueryContext: MutPtr<CVoid> = pQueryContextCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        ulRefCount = 0u,
        queryCtorArg = ConstPtr(0L),
        queryType = 0u,
        queryOptions = 0uL,
        interfaceIndex = 0u,
        pQueryCallback = null,
        pQueryContextCtorArg = MutPtr(0L),
        fAnswerReceived = 0,
        ulResendCount = 0u,
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UInt = this.ulRefCount

    public operator fun component3(): Pcwstr = this.query

    public operator fun component4(): UShort = this.queryType

    public operator fun component5(): ULong = this.queryOptions

    public operator fun component6(): UInt = this.interfaceIndex

    public operator fun component7(): PmdnsQueryCallback = this.pQueryCallback

    public operator fun component8(): MutPtr<CVoid> = this.pQueryContext

    public operator fun component9(): Bool = this.fAnswerReceived

    public operator fun component10(): UInt = this.ulResendCount

    public fun copy(version: UInt = this.version, ulRefCount: UInt = this.ulRefCount, query: Pcwstr = this.query, queryType: UShort = this.queryType, queryOptions: ULong = this.queryOptions, interfaceIndex: UInt = this.interfaceIndex, pQueryCallback: PmdnsQueryCallback = this.pQueryCallback, pQueryContext: MutPtr<CVoid> = this.pQueryContext, fAnswerReceived: Bool = this.fAnswerReceived, ulResendCount: UInt = this.ulResendCount): MdnsQueryRequest = MdnsQueryRequest(version = version, ulRefCount = ulRefCount, queryCtorArg = query, queryType = queryType, queryOptions = queryOptions, interfaceIndex = interfaceIndex, pQueryCallback = pQueryCallback, pQueryContextCtorArg = pQueryContext, fAnswerReceived = fAnswerReceived, ulResendCount = ulResendCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MdnsQueryRequest) return false
        if (this.version != other.version) return false
        if (this.ulRefCount != other.ulRefCount) return false
        if (this.query != other.query) return false
        if (this.queryType != other.queryType) return false
        if (this.queryOptions != other.queryOptions) return false
        if (this.interfaceIndex != other.interfaceIndex) return false
        if (this.pQueryCallback != other.pQueryCallback) return false
        if (this.pQueryContext != other.pQueryContext) return false
        if (this.fAnswerReceived != other.fAnswerReceived) return false
        if (this.ulResendCount != other.ulResendCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.ulRefCount.hashCode()
        result = 31 * result + this.query.hashCode()
        result = 31 * result + this.queryType.hashCode()
        result = 31 * result + this.queryOptions.hashCode()
        result = 31 * result + this.interfaceIndex.hashCode()
        result = 31 * result + this.pQueryCallback.hashCode()
        result = 31 * result + this.pQueryContext.hashCode()
        result = 31 * result + this.fAnswerReceived.hashCode()
        result = 31 * result + this.ulResendCount.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            ulRefCount: UInt = 0u,
            query: Pcwstr = ConstPtr(0L),
            queryType: UShort = 0u,
            queryOptions: ULong = 0uL,
            interfaceIndex: UInt = 0u,
            pQueryCallback: PmdnsQueryCallback = null,
            pQueryContext: MutPtr<CVoid> = MutPtr(0L),
            fAnswerReceived: Bool = 0,
            ulResendCount: UInt = 0u,
        ): MdnsQueryRequest =
            MdnsQueryRequest(
                version = version,
                ulRefCount = ulRefCount,
                queryCtorArg = query,
                queryType = queryType,
                queryOptions = queryOptions,
                interfaceIndex = interfaceIndex,
                pQueryCallback = pQueryCallback,
                pQueryContextCtorArg = pQueryContext,
                fAnswerReceived = fAnswerReceived,
                ulResendCount = ulResendCount,
            )
    }
}

public class DnsRecordOptA internal constructor(
    pNextCtorArg: MutPtr<DnsRecorda>,
    pNameCtorArg: Pstr,
    public var wType: UShort,
    public var wDataLength: UShort,
    public var flags: DnsRecordOptA0,
    public var extHeader: DnsHeaderExt,
    public var wPayloadSize: UShort,
    public var wReserved: UShort,
    public var data: DnsRecordOptA1,
) {
    public var pNext: MutPtr<DnsRecorda> = pNextCtorArg
        internal set

    public var pName: Pstr = pNameCtorArg
        internal set

    public constructor() : this(
        pNextCtorArg = MutPtr(0L),
        pNameCtorArg = MutPtr(0L),
        wType = 0u,
        wDataLength = 0u,
        flags = DnsRecordOptA0(),
        extHeader = DnsHeaderExt(),
        wPayloadSize = 0u,
        wReserved = 0u,
        data = DnsRecordOptA1(),
    )

    public operator fun component1(): MutPtr<DnsRecorda> = this.pNext

    public operator fun component2(): Pstr = this.pName

    public operator fun component3(): UShort = this.wType

    public operator fun component4(): UShort = this.wDataLength

    public operator fun component5(): DnsRecordOptA0 = this.flags

    public operator fun component6(): DnsHeaderExt = this.extHeader

    public operator fun component7(): UShort = this.wPayloadSize

    public operator fun component8(): UShort = this.wReserved

    public operator fun component9(): DnsRecordOptA1 = this.data

    public fun copy(pNext: MutPtr<DnsRecorda> = this.pNext, pName: Pstr = this.pName, wType: UShort = this.wType, wDataLength: UShort = this.wDataLength, flags: DnsRecordOptA0 = this.flags, extHeader: DnsHeaderExt = this.extHeader, wPayloadSize: UShort = this.wPayloadSize, wReserved: UShort = this.wReserved, data: DnsRecordOptA1 = this.data): DnsRecordOptA = DnsRecordOptA(pNextCtorArg = pNext, pNameCtorArg = pName, wType = wType, wDataLength = wDataLength, flags = flags, extHeader = extHeader, wPayloadSize = wPayloadSize, wReserved = wReserved, data = data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsRecordOptA) return false
        if (this.pNext != other.pNext) return false
        if (this.pName != other.pName) return false
        if (this.wType != other.wType) return false
        if (this.wDataLength != other.wDataLength) return false
        if (this.flags != other.flags) return false
        if (this.extHeader != other.extHeader) return false
        if (this.wPayloadSize != other.wPayloadSize) return false
        if (this.wReserved != other.wReserved) return false
        if (this.data != other.data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNext.hashCode()
        result = 31 * result + this.pName.hashCode()
        result = 31 * result + this.wType.hashCode()
        result = 31 * result + this.wDataLength.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.extHeader.hashCode()
        result = 31 * result + this.wPayloadSize.hashCode()
        result = 31 * result + this.wReserved.hashCode()
        result = 31 * result + this.data.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pNext: MutPtr<DnsRecorda> = MutPtr(0L),
            pName: Pstr = MutPtr(0L),
            wType: UShort = 0u,
            wDataLength: UShort = 0u,
            flags: DnsRecordOptA0 = DnsRecordOptA0(),
            extHeader: DnsHeaderExt = DnsHeaderExt(),
            wPayloadSize: UShort = 0u,
            wReserved: UShort = 0u,
            data: DnsRecordOptA1 = DnsRecordOptA1(),
        ): DnsRecordOptA =
            DnsRecordOptA(
                pNextCtorArg = pNext,
                pNameCtorArg = pName,
                wType = wType,
                wDataLength = wDataLength,
                flags = flags,
                extHeader = extHeader,
                wPayloadSize = wPayloadSize,
                wReserved = wReserved,
                data = data,
            )
    }
}

public data class DnsRecordOptA1(
    public var opt: DnsOptData = DnsOptData(),
)

public data class DnsRecordOptA0(
    public var dw: UInt = 0u,
    public var s: DnsRecordFlags = DnsRecordFlags(),
)
