@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winsock

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.system.com.Blob
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.CompartmentId
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ProcessorNumber

public data class Aal5Parameters(
    public var forwardMaxCPCSSDUSize: UInt = 0u,
    public var backwardMaxCPCSSDUSize: UInt = 0u,
    public var mode: UByte = 0u,
    public var sSCSType: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Aal5Parameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Aal5Parameters> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Aal5Parameters =
                    Aal5Parameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: Aal5Parameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.forwardMaxCPCSSDUSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.backwardMaxCPCSSDUSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.mode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.sSCSType)
                }
            }
    }
}

public data class AaluserParameters(
    public var userDefined: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AaluserParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AaluserParameters> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): AaluserParameters =
                    AaluserParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: AaluserParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.userDefined)
                }
            }
    }
}

public data class AalParametersIe(
    public var aALType: AalType = 0,
    public var aALSpecificParameters: AalParametersIe0 = AalParametersIe0(),
)

public data class AalParametersIe0(
    public var aAL5Parameters: Aal5Parameters = Aal5Parameters(),
    public var aALUserParameters: AaluserParameters = AaluserParameters(),
)

public class Addrinfoa internal constructor(
    public var aiFlags: Int,
    public var aiFamily: Int,
    public var aiSocktype: Int,
    public var aiProtocol: Int,
    public var aiAddrlen: Int,
    aiCanonnameCtorArg: Pstr,
    aiAddrCtorArg: MutPtr<Sockaddr>,
    aiNextCtorArg: MutPtr<Addrinfoa>,
) {
    public var aiCanonname: Pstr = aiCanonnameCtorArg
        internal set

    public var aiAddr: MutPtr<Sockaddr> = aiAddrCtorArg
        internal set

    public var aiNext: MutPtr<Addrinfoa> = aiNextCtorArg
        internal set

    public constructor() : this(
        aiFlags = 0,
        aiFamily = 0,
        aiSocktype = 0,
        aiProtocol = 0,
        aiAddrlen = 0,
        aiCanonnameCtorArg = MutPtr(0L),
        aiAddrCtorArg = MutPtr(0L),
        aiNextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.aiFlags

    public operator fun component2(): Int = this.aiFamily

    public operator fun component3(): Int = this.aiSocktype

    public operator fun component4(): Int = this.aiProtocol

    public operator fun component5(): Int = this.aiAddrlen

    public operator fun component6(): Pstr = this.aiCanonname

    public operator fun component7(): MutPtr<Sockaddr> = this.aiAddr

    public operator fun component8(): MutPtr<Addrinfoa> = this.aiNext

    public fun copy(aiFlags: Int = this.aiFlags, aiFamily: Int = this.aiFamily, aiSocktype: Int = this.aiSocktype, aiProtocol: Int = this.aiProtocol, aiAddrlen: Int = this.aiAddrlen, aiCanonname: Pstr = this.aiCanonname, aiAddr: MutPtr<Sockaddr> = this.aiAddr, aiNext: MutPtr<Addrinfoa> = this.aiNext): Addrinfoa = Addrinfoa(aiFlags = aiFlags, aiFamily = aiFamily, aiSocktype = aiSocktype, aiProtocol = aiProtocol, aiAddrlen = aiAddrlen, aiCanonnameCtorArg = aiCanonname, aiAddrCtorArg = aiAddr, aiNextCtorArg = aiNext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Addrinfoa) return false
        if (this.aiFlags != other.aiFlags) return false
        if (this.aiFamily != other.aiFamily) return false
        if (this.aiSocktype != other.aiSocktype) return false
        if (this.aiProtocol != other.aiProtocol) return false
        if (this.aiAddrlen != other.aiAddrlen) return false
        if (this.aiCanonname != other.aiCanonname) return false
        if (this.aiAddr != other.aiAddr) return false
        if (this.aiNext != other.aiNext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aiFlags.hashCode()
        result = 31 * result + this.aiFamily.hashCode()
        result = 31 * result + this.aiSocktype.hashCode()
        result = 31 * result + this.aiProtocol.hashCode()
        result = 31 * result + this.aiAddrlen.hashCode()
        result = 31 * result + this.aiCanonname.hashCode()
        result = 31 * result + this.aiAddr.hashCode()
        result = 31 * result + this.aiNext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aiFlags: Int = 0,
            aiFamily: Int = 0,
            aiSocktype: Int = 0,
            aiProtocol: Int = 0,
            aiAddrlen: Int = 0,
            aiCanonname: Pstr = MutPtr(0L),
            aiAddr: MutPtr<Sockaddr> = MutPtr(0L),
            aiNext: MutPtr<Addrinfoa> = MutPtr(0L),
        ): Addrinfoa =
            Addrinfoa(
                aiFlags = aiFlags,
                aiFamily = aiFamily,
                aiSocktype = aiSocktype,
                aiProtocol = aiProtocol,
                aiAddrlen = aiAddrlen,
                aiCanonnameCtorArg = aiCanonname,
                aiAddrCtorArg = aiAddr,
                aiNextCtorArg = aiNext,
            )
    }
}

public class Addrinfoex2a internal constructor(
    public var aiFlags: Int,
    public var aiFamily: Int,
    public var aiSocktype: Int,
    public var aiProtocol: Int,
    public var aiAddrlen: Int,
    aiCanonnameCtorArg: Pstr,
    aiAddrCtorArg: MutPtr<Sockaddr>,
    aiBlobCtorArg: MutPtr<CVoid>,
    public var aiBloblen: Int,
    aiProviderCtorArg: MutPtr<Guid>,
    aiNextCtorArg: MutPtr<Addrinfoex2a>,
    public var aiVersion: Int,
    aiFqdnCtorArg: Pstr,
) {
    public var aiCanonname: Pstr = aiCanonnameCtorArg
        internal set

    public var aiAddr: MutPtr<Sockaddr> = aiAddrCtorArg
        internal set

    public var aiBlob: MutPtr<CVoid> = aiBlobCtorArg
        internal set

    public var aiProvider: MutPtr<Guid> = aiProviderCtorArg
        internal set

    public var aiNext: MutPtr<Addrinfoex2a> = aiNextCtorArg
        internal set

    public var aiFqdn: Pstr = aiFqdnCtorArg
        internal set

    public constructor() : this(
        aiFlags = 0,
        aiFamily = 0,
        aiSocktype = 0,
        aiProtocol = 0,
        aiAddrlen = 0,
        aiCanonnameCtorArg = MutPtr(0L),
        aiAddrCtorArg = MutPtr(0L),
        aiBlobCtorArg = MutPtr(0L),
        aiBloblen = 0,
        aiProviderCtorArg = MutPtr(0L),
        aiNextCtorArg = MutPtr(0L),
        aiVersion = 0,
        aiFqdnCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.aiFlags

    public operator fun component2(): Int = this.aiFamily

    public operator fun component3(): Int = this.aiSocktype

    public operator fun component4(): Int = this.aiProtocol

    public operator fun component5(): Int = this.aiAddrlen

    public operator fun component6(): Pstr = this.aiCanonname

    public operator fun component7(): MutPtr<Sockaddr> = this.aiAddr

    public operator fun component8(): MutPtr<CVoid> = this.aiBlob

    public operator fun component9(): Int = this.aiBloblen

    public operator fun component10(): MutPtr<Guid> = this.aiProvider

    public operator fun component11(): MutPtr<Addrinfoex2a> = this.aiNext

    public operator fun component12(): Int = this.aiVersion

    public operator fun component13(): Pstr = this.aiFqdn

    public fun copy(aiFlags: Int = this.aiFlags, aiFamily: Int = this.aiFamily, aiSocktype: Int = this.aiSocktype, aiProtocol: Int = this.aiProtocol, aiAddrlen: Int = this.aiAddrlen, aiCanonname: Pstr = this.aiCanonname, aiAddr: MutPtr<Sockaddr> = this.aiAddr, aiBlob: MutPtr<CVoid> = this.aiBlob, aiBloblen: Int = this.aiBloblen, aiProvider: MutPtr<Guid> = this.aiProvider, aiNext: MutPtr<Addrinfoex2a> = this.aiNext, aiVersion: Int = this.aiVersion, aiFqdn: Pstr = this.aiFqdn): Addrinfoex2a = Addrinfoex2a(aiFlags = aiFlags, aiFamily = aiFamily, aiSocktype = aiSocktype, aiProtocol = aiProtocol, aiAddrlen = aiAddrlen, aiCanonnameCtorArg = aiCanonname, aiAddrCtorArg = aiAddr, aiBlobCtorArg = aiBlob, aiBloblen = aiBloblen, aiProviderCtorArg = aiProvider, aiNextCtorArg = aiNext, aiVersion = aiVersion, aiFqdnCtorArg = aiFqdn)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Addrinfoex2a) return false
        if (this.aiFlags != other.aiFlags) return false
        if (this.aiFamily != other.aiFamily) return false
        if (this.aiSocktype != other.aiSocktype) return false
        if (this.aiProtocol != other.aiProtocol) return false
        if (this.aiAddrlen != other.aiAddrlen) return false
        if (this.aiCanonname != other.aiCanonname) return false
        if (this.aiAddr != other.aiAddr) return false
        if (this.aiBlob != other.aiBlob) return false
        if (this.aiBloblen != other.aiBloblen) return false
        if (this.aiProvider != other.aiProvider) return false
        if (this.aiNext != other.aiNext) return false
        if (this.aiVersion != other.aiVersion) return false
        if (this.aiFqdn != other.aiFqdn) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aiFlags.hashCode()
        result = 31 * result + this.aiFamily.hashCode()
        result = 31 * result + this.aiSocktype.hashCode()
        result = 31 * result + this.aiProtocol.hashCode()
        result = 31 * result + this.aiAddrlen.hashCode()
        result = 31 * result + this.aiCanonname.hashCode()
        result = 31 * result + this.aiAddr.hashCode()
        result = 31 * result + this.aiBlob.hashCode()
        result = 31 * result + this.aiBloblen.hashCode()
        result = 31 * result + this.aiProvider.hashCode()
        result = 31 * result + this.aiNext.hashCode()
        result = 31 * result + this.aiVersion.hashCode()
        result = 31 * result + this.aiFqdn.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aiFlags: Int = 0,
            aiFamily: Int = 0,
            aiSocktype: Int = 0,
            aiProtocol: Int = 0,
            aiAddrlen: Int = 0,
            aiCanonname: Pstr = MutPtr(0L),
            aiAddr: MutPtr<Sockaddr> = MutPtr(0L),
            aiBlob: MutPtr<CVoid> = MutPtr(0L),
            aiBloblen: Int = 0,
            aiProvider: MutPtr<Guid> = MutPtr(0L),
            aiNext: MutPtr<Addrinfoex2a> = MutPtr(0L),
            aiVersion: Int = 0,
            aiFqdn: Pstr = MutPtr(0L),
        ): Addrinfoex2a =
            Addrinfoex2a(
                aiFlags = aiFlags,
                aiFamily = aiFamily,
                aiSocktype = aiSocktype,
                aiProtocol = aiProtocol,
                aiAddrlen = aiAddrlen,
                aiCanonnameCtorArg = aiCanonname,
                aiAddrCtorArg = aiAddr,
                aiBlobCtorArg = aiBlob,
                aiBloblen = aiBloblen,
                aiProviderCtorArg = aiProvider,
                aiNextCtorArg = aiNext,
                aiVersion = aiVersion,
                aiFqdnCtorArg = aiFqdn,
            )
    }
}

public class Addrinfoex2w internal constructor(
    public var aiFlags: Int,
    public var aiFamily: Int,
    public var aiSocktype: Int,
    public var aiProtocol: Int,
    public var aiAddrlen: Int,
    aiCanonnameCtorArg: Pwstr,
    aiAddrCtorArg: MutPtr<Sockaddr>,
    aiBlobCtorArg: MutPtr<CVoid>,
    public var aiBloblen: Int,
    aiProviderCtorArg: MutPtr<Guid>,
    aiNextCtorArg: MutPtr<Addrinfoex2w>,
    public var aiVersion: Int,
    aiFqdnCtorArg: Pwstr,
) {
    public var aiCanonname: Pwstr = aiCanonnameCtorArg
        internal set

    public var aiAddr: MutPtr<Sockaddr> = aiAddrCtorArg
        internal set

    public var aiBlob: MutPtr<CVoid> = aiBlobCtorArg
        internal set

    public var aiProvider: MutPtr<Guid> = aiProviderCtorArg
        internal set

    public var aiNext: MutPtr<Addrinfoex2w> = aiNextCtorArg
        internal set

    public var aiFqdn: Pwstr = aiFqdnCtorArg
        internal set

    public constructor() : this(
        aiFlags = 0,
        aiFamily = 0,
        aiSocktype = 0,
        aiProtocol = 0,
        aiAddrlen = 0,
        aiCanonnameCtorArg = MutPtr(0L),
        aiAddrCtorArg = MutPtr(0L),
        aiBlobCtorArg = MutPtr(0L),
        aiBloblen = 0,
        aiProviderCtorArg = MutPtr(0L),
        aiNextCtorArg = MutPtr(0L),
        aiVersion = 0,
        aiFqdnCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.aiFlags

    public operator fun component2(): Int = this.aiFamily

    public operator fun component3(): Int = this.aiSocktype

    public operator fun component4(): Int = this.aiProtocol

    public operator fun component5(): Int = this.aiAddrlen

    public operator fun component6(): Pwstr = this.aiCanonname

    public operator fun component7(): MutPtr<Sockaddr> = this.aiAddr

    public operator fun component8(): MutPtr<CVoid> = this.aiBlob

    public operator fun component9(): Int = this.aiBloblen

    public operator fun component10(): MutPtr<Guid> = this.aiProvider

    public operator fun component11(): MutPtr<Addrinfoex2w> = this.aiNext

    public operator fun component12(): Int = this.aiVersion

    public operator fun component13(): Pwstr = this.aiFqdn

    public fun copy(aiFlags: Int = this.aiFlags, aiFamily: Int = this.aiFamily, aiSocktype: Int = this.aiSocktype, aiProtocol: Int = this.aiProtocol, aiAddrlen: Int = this.aiAddrlen, aiCanonname: Pwstr = this.aiCanonname, aiAddr: MutPtr<Sockaddr> = this.aiAddr, aiBlob: MutPtr<CVoid> = this.aiBlob, aiBloblen: Int = this.aiBloblen, aiProvider: MutPtr<Guid> = this.aiProvider, aiNext: MutPtr<Addrinfoex2w> = this.aiNext, aiVersion: Int = this.aiVersion, aiFqdn: Pwstr = this.aiFqdn): Addrinfoex2w = Addrinfoex2w(aiFlags = aiFlags, aiFamily = aiFamily, aiSocktype = aiSocktype, aiProtocol = aiProtocol, aiAddrlen = aiAddrlen, aiCanonnameCtorArg = aiCanonname, aiAddrCtorArg = aiAddr, aiBlobCtorArg = aiBlob, aiBloblen = aiBloblen, aiProviderCtorArg = aiProvider, aiNextCtorArg = aiNext, aiVersion = aiVersion, aiFqdnCtorArg = aiFqdn)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Addrinfoex2w) return false
        if (this.aiFlags != other.aiFlags) return false
        if (this.aiFamily != other.aiFamily) return false
        if (this.aiSocktype != other.aiSocktype) return false
        if (this.aiProtocol != other.aiProtocol) return false
        if (this.aiAddrlen != other.aiAddrlen) return false
        if (this.aiCanonname != other.aiCanonname) return false
        if (this.aiAddr != other.aiAddr) return false
        if (this.aiBlob != other.aiBlob) return false
        if (this.aiBloblen != other.aiBloblen) return false
        if (this.aiProvider != other.aiProvider) return false
        if (this.aiNext != other.aiNext) return false
        if (this.aiVersion != other.aiVersion) return false
        if (this.aiFqdn != other.aiFqdn) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aiFlags.hashCode()
        result = 31 * result + this.aiFamily.hashCode()
        result = 31 * result + this.aiSocktype.hashCode()
        result = 31 * result + this.aiProtocol.hashCode()
        result = 31 * result + this.aiAddrlen.hashCode()
        result = 31 * result + this.aiCanonname.hashCode()
        result = 31 * result + this.aiAddr.hashCode()
        result = 31 * result + this.aiBlob.hashCode()
        result = 31 * result + this.aiBloblen.hashCode()
        result = 31 * result + this.aiProvider.hashCode()
        result = 31 * result + this.aiNext.hashCode()
        result = 31 * result + this.aiVersion.hashCode()
        result = 31 * result + this.aiFqdn.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aiFlags: Int = 0,
            aiFamily: Int = 0,
            aiSocktype: Int = 0,
            aiProtocol: Int = 0,
            aiAddrlen: Int = 0,
            aiCanonname: Pwstr = MutPtr(0L),
            aiAddr: MutPtr<Sockaddr> = MutPtr(0L),
            aiBlob: MutPtr<CVoid> = MutPtr(0L),
            aiBloblen: Int = 0,
            aiProvider: MutPtr<Guid> = MutPtr(0L),
            aiNext: MutPtr<Addrinfoex2w> = MutPtr(0L),
            aiVersion: Int = 0,
            aiFqdn: Pwstr = MutPtr(0L),
        ): Addrinfoex2w =
            Addrinfoex2w(
                aiFlags = aiFlags,
                aiFamily = aiFamily,
                aiSocktype = aiSocktype,
                aiProtocol = aiProtocol,
                aiAddrlen = aiAddrlen,
                aiCanonnameCtorArg = aiCanonname,
                aiAddrCtorArg = aiAddr,
                aiBlobCtorArg = aiBlob,
                aiBloblen = aiBloblen,
                aiProviderCtorArg = aiProvider,
                aiNextCtorArg = aiNext,
                aiVersion = aiVersion,
                aiFqdnCtorArg = aiFqdn,
            )
    }
}

public class Addrinfoex3 internal constructor(
    public var aiFlags: Int,
    public var aiFamily: Int,
    public var aiSocktype: Int,
    public var aiProtocol: Int,
    public var aiAddrlen: Int,
    aiCanonnameCtorArg: Pwstr,
    aiAddrCtorArg: MutPtr<Sockaddr>,
    aiBlobCtorArg: MutPtr<CVoid>,
    public var aiBloblen: Int,
    aiProviderCtorArg: MutPtr<Guid>,
    aiNextCtorArg: MutPtr<Addrinfoex3>,
    public var aiVersion: Int,
    aiFqdnCtorArg: Pwstr,
    public var aiInterfaceindex: Int,
) {
    public var aiCanonname: Pwstr = aiCanonnameCtorArg
        internal set

    public var aiAddr: MutPtr<Sockaddr> = aiAddrCtorArg
        internal set

    public var aiBlob: MutPtr<CVoid> = aiBlobCtorArg
        internal set

    public var aiProvider: MutPtr<Guid> = aiProviderCtorArg
        internal set

    public var aiNext: MutPtr<Addrinfoex3> = aiNextCtorArg
        internal set

    public var aiFqdn: Pwstr = aiFqdnCtorArg
        internal set

    public constructor() : this(
        aiFlags = 0,
        aiFamily = 0,
        aiSocktype = 0,
        aiProtocol = 0,
        aiAddrlen = 0,
        aiCanonnameCtorArg = MutPtr(0L),
        aiAddrCtorArg = MutPtr(0L),
        aiBlobCtorArg = MutPtr(0L),
        aiBloblen = 0,
        aiProviderCtorArg = MutPtr(0L),
        aiNextCtorArg = MutPtr(0L),
        aiVersion = 0,
        aiFqdnCtorArg = MutPtr(0L),
        aiInterfaceindex = 0,
    )

    public operator fun component1(): Int = this.aiFlags

    public operator fun component2(): Int = this.aiFamily

    public operator fun component3(): Int = this.aiSocktype

    public operator fun component4(): Int = this.aiProtocol

    public operator fun component5(): Int = this.aiAddrlen

    public operator fun component6(): Pwstr = this.aiCanonname

    public operator fun component7(): MutPtr<Sockaddr> = this.aiAddr

    public operator fun component8(): MutPtr<CVoid> = this.aiBlob

    public operator fun component9(): Int = this.aiBloblen

    public operator fun component10(): MutPtr<Guid> = this.aiProvider

    public operator fun component11(): MutPtr<Addrinfoex3> = this.aiNext

    public operator fun component12(): Int = this.aiVersion

    public operator fun component13(): Pwstr = this.aiFqdn

    public operator fun component14(): Int = this.aiInterfaceindex

    public fun copy(aiFlags: Int = this.aiFlags, aiFamily: Int = this.aiFamily, aiSocktype: Int = this.aiSocktype, aiProtocol: Int = this.aiProtocol, aiAddrlen: Int = this.aiAddrlen, aiCanonname: Pwstr = this.aiCanonname, aiAddr: MutPtr<Sockaddr> = this.aiAddr, aiBlob: MutPtr<CVoid> = this.aiBlob, aiBloblen: Int = this.aiBloblen, aiProvider: MutPtr<Guid> = this.aiProvider, aiNext: MutPtr<Addrinfoex3> = this.aiNext, aiVersion: Int = this.aiVersion, aiFqdn: Pwstr = this.aiFqdn, aiInterfaceindex: Int = this.aiInterfaceindex): Addrinfoex3 = Addrinfoex3(aiFlags = aiFlags, aiFamily = aiFamily, aiSocktype = aiSocktype, aiProtocol = aiProtocol, aiAddrlen = aiAddrlen, aiCanonnameCtorArg = aiCanonname, aiAddrCtorArg = aiAddr, aiBlobCtorArg = aiBlob, aiBloblen = aiBloblen, aiProviderCtorArg = aiProvider, aiNextCtorArg = aiNext, aiVersion = aiVersion, aiFqdnCtorArg = aiFqdn, aiInterfaceindex = aiInterfaceindex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Addrinfoex3) return false
        if (this.aiFlags != other.aiFlags) return false
        if (this.aiFamily != other.aiFamily) return false
        if (this.aiSocktype != other.aiSocktype) return false
        if (this.aiProtocol != other.aiProtocol) return false
        if (this.aiAddrlen != other.aiAddrlen) return false
        if (this.aiCanonname != other.aiCanonname) return false
        if (this.aiAddr != other.aiAddr) return false
        if (this.aiBlob != other.aiBlob) return false
        if (this.aiBloblen != other.aiBloblen) return false
        if (this.aiProvider != other.aiProvider) return false
        if (this.aiNext != other.aiNext) return false
        if (this.aiVersion != other.aiVersion) return false
        if (this.aiFqdn != other.aiFqdn) return false
        if (this.aiInterfaceindex != other.aiInterfaceindex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aiFlags.hashCode()
        result = 31 * result + this.aiFamily.hashCode()
        result = 31 * result + this.aiSocktype.hashCode()
        result = 31 * result + this.aiProtocol.hashCode()
        result = 31 * result + this.aiAddrlen.hashCode()
        result = 31 * result + this.aiCanonname.hashCode()
        result = 31 * result + this.aiAddr.hashCode()
        result = 31 * result + this.aiBlob.hashCode()
        result = 31 * result + this.aiBloblen.hashCode()
        result = 31 * result + this.aiProvider.hashCode()
        result = 31 * result + this.aiNext.hashCode()
        result = 31 * result + this.aiVersion.hashCode()
        result = 31 * result + this.aiFqdn.hashCode()
        result = 31 * result + this.aiInterfaceindex.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aiFlags: Int = 0,
            aiFamily: Int = 0,
            aiSocktype: Int = 0,
            aiProtocol: Int = 0,
            aiAddrlen: Int = 0,
            aiCanonname: Pwstr = MutPtr(0L),
            aiAddr: MutPtr<Sockaddr> = MutPtr(0L),
            aiBlob: MutPtr<CVoid> = MutPtr(0L),
            aiBloblen: Int = 0,
            aiProvider: MutPtr<Guid> = MutPtr(0L),
            aiNext: MutPtr<Addrinfoex3> = MutPtr(0L),
            aiVersion: Int = 0,
            aiFqdn: Pwstr = MutPtr(0L),
            aiInterfaceindex: Int = 0,
        ): Addrinfoex3 =
            Addrinfoex3(
                aiFlags = aiFlags,
                aiFamily = aiFamily,
                aiSocktype = aiSocktype,
                aiProtocol = aiProtocol,
                aiAddrlen = aiAddrlen,
                aiCanonnameCtorArg = aiCanonname,
                aiAddrCtorArg = aiAddr,
                aiBlobCtorArg = aiBlob,
                aiBloblen = aiBloblen,
                aiProviderCtorArg = aiProvider,
                aiNextCtorArg = aiNext,
                aiVersion = aiVersion,
                aiFqdnCtorArg = aiFqdn,
                aiInterfaceindex = aiInterfaceindex,
            )
    }
}

public class Addrinfoex4 internal constructor(
    public var aiFlags: Int,
    public var aiFamily: Int,
    public var aiSocktype: Int,
    public var aiProtocol: Int,
    public var aiAddrlen: Int,
    aiCanonnameCtorArg: Pwstr,
    aiAddrCtorArg: MutPtr<Sockaddr>,
    aiBlobCtorArg: MutPtr<CVoid>,
    public var aiBloblen: Int,
    aiProviderCtorArg: MutPtr<Guid>,
    aiNextCtorArg: MutPtr<Addrinfoex4>,
    public var aiVersion: Int,
    aiFqdnCtorArg: Pwstr,
    public var aiInterfaceindex: Int,
    aiResolutionhandleCtorArg: Handle,
) {
    public var aiCanonname: Pwstr = aiCanonnameCtorArg
        internal set

    public var aiAddr: MutPtr<Sockaddr> = aiAddrCtorArg
        internal set

    public var aiBlob: MutPtr<CVoid> = aiBlobCtorArg
        internal set

    public var aiProvider: MutPtr<Guid> = aiProviderCtorArg
        internal set

    public var aiNext: MutPtr<Addrinfoex4> = aiNextCtorArg
        internal set

    public var aiFqdn: Pwstr = aiFqdnCtorArg
        internal set

    public var aiResolutionhandle: Handle = aiResolutionhandleCtorArg
        internal set

    public constructor() : this(
        aiFlags = 0,
        aiFamily = 0,
        aiSocktype = 0,
        aiProtocol = 0,
        aiAddrlen = 0,
        aiCanonnameCtorArg = MutPtr(0L),
        aiAddrCtorArg = MutPtr(0L),
        aiBlobCtorArg = MutPtr(0L),
        aiBloblen = 0,
        aiProviderCtorArg = MutPtr(0L),
        aiNextCtorArg = MutPtr(0L),
        aiVersion = 0,
        aiFqdnCtorArg = MutPtr(0L),
        aiInterfaceindex = 0,
        aiResolutionhandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.aiFlags

    public operator fun component2(): Int = this.aiFamily

    public operator fun component3(): Int = this.aiSocktype

    public operator fun component4(): Int = this.aiProtocol

    public operator fun component5(): Int = this.aiAddrlen

    public operator fun component6(): Pwstr = this.aiCanonname

    public operator fun component7(): MutPtr<Sockaddr> = this.aiAddr

    public operator fun component8(): MutPtr<CVoid> = this.aiBlob

    public operator fun component9(): Int = this.aiBloblen

    public operator fun component10(): MutPtr<Guid> = this.aiProvider

    public operator fun component11(): MutPtr<Addrinfoex4> = this.aiNext

    public operator fun component12(): Int = this.aiVersion

    public operator fun component13(): Pwstr = this.aiFqdn

    public operator fun component14(): Int = this.aiInterfaceindex

    public operator fun component15(): Handle = this.aiResolutionhandle

    public fun copy(aiFlags: Int = this.aiFlags, aiFamily: Int = this.aiFamily, aiSocktype: Int = this.aiSocktype, aiProtocol: Int = this.aiProtocol, aiAddrlen: Int = this.aiAddrlen, aiCanonname: Pwstr = this.aiCanonname, aiAddr: MutPtr<Sockaddr> = this.aiAddr, aiBlob: MutPtr<CVoid> = this.aiBlob, aiBloblen: Int = this.aiBloblen, aiProvider: MutPtr<Guid> = this.aiProvider, aiNext: MutPtr<Addrinfoex4> = this.aiNext, aiVersion: Int = this.aiVersion, aiFqdn: Pwstr = this.aiFqdn, aiInterfaceindex: Int = this.aiInterfaceindex, aiResolutionhandle: Handle = this.aiResolutionhandle): Addrinfoex4 = Addrinfoex4(aiFlags = aiFlags, aiFamily = aiFamily, aiSocktype = aiSocktype, aiProtocol = aiProtocol, aiAddrlen = aiAddrlen, aiCanonnameCtorArg = aiCanonname, aiAddrCtorArg = aiAddr, aiBlobCtorArg = aiBlob, aiBloblen = aiBloblen, aiProviderCtorArg = aiProvider, aiNextCtorArg = aiNext, aiVersion = aiVersion, aiFqdnCtorArg = aiFqdn, aiInterfaceindex = aiInterfaceindex, aiResolutionhandleCtorArg = aiResolutionhandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Addrinfoex4) return false
        if (this.aiFlags != other.aiFlags) return false
        if (this.aiFamily != other.aiFamily) return false
        if (this.aiSocktype != other.aiSocktype) return false
        if (this.aiProtocol != other.aiProtocol) return false
        if (this.aiAddrlen != other.aiAddrlen) return false
        if (this.aiCanonname != other.aiCanonname) return false
        if (this.aiAddr != other.aiAddr) return false
        if (this.aiBlob != other.aiBlob) return false
        if (this.aiBloblen != other.aiBloblen) return false
        if (this.aiProvider != other.aiProvider) return false
        if (this.aiNext != other.aiNext) return false
        if (this.aiVersion != other.aiVersion) return false
        if (this.aiFqdn != other.aiFqdn) return false
        if (this.aiInterfaceindex != other.aiInterfaceindex) return false
        if (this.aiResolutionhandle != other.aiResolutionhandle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aiFlags.hashCode()
        result = 31 * result + this.aiFamily.hashCode()
        result = 31 * result + this.aiSocktype.hashCode()
        result = 31 * result + this.aiProtocol.hashCode()
        result = 31 * result + this.aiAddrlen.hashCode()
        result = 31 * result + this.aiCanonname.hashCode()
        result = 31 * result + this.aiAddr.hashCode()
        result = 31 * result + this.aiBlob.hashCode()
        result = 31 * result + this.aiBloblen.hashCode()
        result = 31 * result + this.aiProvider.hashCode()
        result = 31 * result + this.aiNext.hashCode()
        result = 31 * result + this.aiVersion.hashCode()
        result = 31 * result + this.aiFqdn.hashCode()
        result = 31 * result + this.aiInterfaceindex.hashCode()
        result = 31 * result + this.aiResolutionhandle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aiFlags: Int = 0,
            aiFamily: Int = 0,
            aiSocktype: Int = 0,
            aiProtocol: Int = 0,
            aiAddrlen: Int = 0,
            aiCanonname: Pwstr = MutPtr(0L),
            aiAddr: MutPtr<Sockaddr> = MutPtr(0L),
            aiBlob: MutPtr<CVoid> = MutPtr(0L),
            aiBloblen: Int = 0,
            aiProvider: MutPtr<Guid> = MutPtr(0L),
            aiNext: MutPtr<Addrinfoex4> = MutPtr(0L),
            aiVersion: Int = 0,
            aiFqdn: Pwstr = MutPtr(0L),
            aiInterfaceindex: Int = 0,
            aiResolutionhandle: Handle = MutPtr(0L),
        ): Addrinfoex4 =
            Addrinfoex4(
                aiFlags = aiFlags,
                aiFamily = aiFamily,
                aiSocktype = aiSocktype,
                aiProtocol = aiProtocol,
                aiAddrlen = aiAddrlen,
                aiCanonnameCtorArg = aiCanonname,
                aiAddrCtorArg = aiAddr,
                aiBlobCtorArg = aiBlob,
                aiBloblen = aiBloblen,
                aiProviderCtorArg = aiProvider,
                aiNextCtorArg = aiNext,
                aiVersion = aiVersion,
                aiFqdnCtorArg = aiFqdn,
                aiInterfaceindex = aiInterfaceindex,
                aiResolutionhandleCtorArg = aiResolutionhandle,
            )
    }
}

public class Addrinfoex5 internal constructor(
    public var aiFlags: Int,
    public var aiFamily: Int,
    public var aiSocktype: Int,
    public var aiProtocol: Int,
    public var aiAddrlen: Int,
    aiCanonnameCtorArg: Pwstr,
    aiAddrCtorArg: MutPtr<Sockaddr>,
    aiBlobCtorArg: MutPtr<CVoid>,
    public var aiBloblen: Int,
    aiProviderCtorArg: MutPtr<Guid>,
    aiNextCtorArg: MutPtr<Addrinfoex5>,
    public var aiVersion: Int,
    aiFqdnCtorArg: Pwstr,
    public var aiInterfaceindex: Int,
    aiResolutionhandleCtorArg: Handle,
    public var aiTtl: UInt,
) {
    public var aiCanonname: Pwstr = aiCanonnameCtorArg
        internal set

    public var aiAddr: MutPtr<Sockaddr> = aiAddrCtorArg
        internal set

    public var aiBlob: MutPtr<CVoid> = aiBlobCtorArg
        internal set

    public var aiProvider: MutPtr<Guid> = aiProviderCtorArg
        internal set

    public var aiNext: MutPtr<Addrinfoex5> = aiNextCtorArg
        internal set

    public var aiFqdn: Pwstr = aiFqdnCtorArg
        internal set

    public var aiResolutionhandle: Handle = aiResolutionhandleCtorArg
        internal set

    public constructor() : this(
        aiFlags = 0,
        aiFamily = 0,
        aiSocktype = 0,
        aiProtocol = 0,
        aiAddrlen = 0,
        aiCanonnameCtorArg = MutPtr(0L),
        aiAddrCtorArg = MutPtr(0L),
        aiBlobCtorArg = MutPtr(0L),
        aiBloblen = 0,
        aiProviderCtorArg = MutPtr(0L),
        aiNextCtorArg = MutPtr(0L),
        aiVersion = 0,
        aiFqdnCtorArg = MutPtr(0L),
        aiInterfaceindex = 0,
        aiResolutionhandleCtorArg = MutPtr(0L),
        aiTtl = 0u,
    )

    public operator fun component1(): Int = this.aiFlags

    public operator fun component2(): Int = this.aiFamily

    public operator fun component3(): Int = this.aiSocktype

    public operator fun component4(): Int = this.aiProtocol

    public operator fun component5(): Int = this.aiAddrlen

    public operator fun component6(): Pwstr = this.aiCanonname

    public operator fun component7(): MutPtr<Sockaddr> = this.aiAddr

    public operator fun component8(): MutPtr<CVoid> = this.aiBlob

    public operator fun component9(): Int = this.aiBloblen

    public operator fun component10(): MutPtr<Guid> = this.aiProvider

    public operator fun component11(): MutPtr<Addrinfoex5> = this.aiNext

    public operator fun component12(): Int = this.aiVersion

    public operator fun component13(): Pwstr = this.aiFqdn

    public operator fun component14(): Int = this.aiInterfaceindex

    public operator fun component15(): Handle = this.aiResolutionhandle

    public operator fun component16(): UInt = this.aiTtl

    public fun copy(aiFlags: Int = this.aiFlags, aiFamily: Int = this.aiFamily, aiSocktype: Int = this.aiSocktype, aiProtocol: Int = this.aiProtocol, aiAddrlen: Int = this.aiAddrlen, aiCanonname: Pwstr = this.aiCanonname, aiAddr: MutPtr<Sockaddr> = this.aiAddr, aiBlob: MutPtr<CVoid> = this.aiBlob, aiBloblen: Int = this.aiBloblen, aiProvider: MutPtr<Guid> = this.aiProvider, aiNext: MutPtr<Addrinfoex5> = this.aiNext, aiVersion: Int = this.aiVersion, aiFqdn: Pwstr = this.aiFqdn, aiInterfaceindex: Int = this.aiInterfaceindex, aiResolutionhandle: Handle = this.aiResolutionhandle, aiTtl: UInt = this.aiTtl): Addrinfoex5 = Addrinfoex5(aiFlags = aiFlags, aiFamily = aiFamily, aiSocktype = aiSocktype, aiProtocol = aiProtocol, aiAddrlen = aiAddrlen, aiCanonnameCtorArg = aiCanonname, aiAddrCtorArg = aiAddr, aiBlobCtorArg = aiBlob, aiBloblen = aiBloblen, aiProviderCtorArg = aiProvider, aiNextCtorArg = aiNext, aiVersion = aiVersion, aiFqdnCtorArg = aiFqdn, aiInterfaceindex = aiInterfaceindex, aiResolutionhandleCtorArg = aiResolutionhandle, aiTtl = aiTtl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Addrinfoex5) return false
        if (this.aiFlags != other.aiFlags) return false
        if (this.aiFamily != other.aiFamily) return false
        if (this.aiSocktype != other.aiSocktype) return false
        if (this.aiProtocol != other.aiProtocol) return false
        if (this.aiAddrlen != other.aiAddrlen) return false
        if (this.aiCanonname != other.aiCanonname) return false
        if (this.aiAddr != other.aiAddr) return false
        if (this.aiBlob != other.aiBlob) return false
        if (this.aiBloblen != other.aiBloblen) return false
        if (this.aiProvider != other.aiProvider) return false
        if (this.aiNext != other.aiNext) return false
        if (this.aiVersion != other.aiVersion) return false
        if (this.aiFqdn != other.aiFqdn) return false
        if (this.aiInterfaceindex != other.aiInterfaceindex) return false
        if (this.aiResolutionhandle != other.aiResolutionhandle) return false
        if (this.aiTtl != other.aiTtl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aiFlags.hashCode()
        result = 31 * result + this.aiFamily.hashCode()
        result = 31 * result + this.aiSocktype.hashCode()
        result = 31 * result + this.aiProtocol.hashCode()
        result = 31 * result + this.aiAddrlen.hashCode()
        result = 31 * result + this.aiCanonname.hashCode()
        result = 31 * result + this.aiAddr.hashCode()
        result = 31 * result + this.aiBlob.hashCode()
        result = 31 * result + this.aiBloblen.hashCode()
        result = 31 * result + this.aiProvider.hashCode()
        result = 31 * result + this.aiNext.hashCode()
        result = 31 * result + this.aiVersion.hashCode()
        result = 31 * result + this.aiFqdn.hashCode()
        result = 31 * result + this.aiInterfaceindex.hashCode()
        result = 31 * result + this.aiResolutionhandle.hashCode()
        result = 31 * result + this.aiTtl.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aiFlags: Int = 0,
            aiFamily: Int = 0,
            aiSocktype: Int = 0,
            aiProtocol: Int = 0,
            aiAddrlen: Int = 0,
            aiCanonname: Pwstr = MutPtr(0L),
            aiAddr: MutPtr<Sockaddr> = MutPtr(0L),
            aiBlob: MutPtr<CVoid> = MutPtr(0L),
            aiBloblen: Int = 0,
            aiProvider: MutPtr<Guid> = MutPtr(0L),
            aiNext: MutPtr<Addrinfoex5> = MutPtr(0L),
            aiVersion: Int = 0,
            aiFqdn: Pwstr = MutPtr(0L),
            aiInterfaceindex: Int = 0,
            aiResolutionhandle: Handle = MutPtr(0L),
            aiTtl: UInt = 0u,
        ): Addrinfoex5 =
            Addrinfoex5(
                aiFlags = aiFlags,
                aiFamily = aiFamily,
                aiSocktype = aiSocktype,
                aiProtocol = aiProtocol,
                aiAddrlen = aiAddrlen,
                aiCanonnameCtorArg = aiCanonname,
                aiAddrCtorArg = aiAddr,
                aiBlobCtorArg = aiBlob,
                aiBloblen = aiBloblen,
                aiProviderCtorArg = aiProvider,
                aiNextCtorArg = aiNext,
                aiVersion = aiVersion,
                aiFqdnCtorArg = aiFqdn,
                aiInterfaceindex = aiInterfaceindex,
                aiResolutionhandleCtorArg = aiResolutionhandle,
                aiTtl = aiTtl,
            )
    }
}

public class Addrinfoex6 internal constructor(
    public var aiFlags: Int,
    public var aiFamily: Int,
    public var aiSocktype: Int,
    public var aiProtocol: Int,
    public var aiAddrlen: Int,
    aiCanonnameCtorArg: Pwstr,
    aiAddrCtorArg: MutPtr<Sockaddr>,
    aiBlobCtorArg: MutPtr<CVoid>,
    public var aiBloblen: Int,
    aiProviderCtorArg: MutPtr<Guid>,
    aiNextCtorArg: MutPtr<Addrinfoex5>,
    public var aiVersion: Int,
    aiFqdnCtorArg: Pwstr,
    public var aiInterfaceindex: Int,
    aiResolutionhandleCtorArg: Handle,
    public var aiTtl: UInt,
    public var aiNumservers: UInt,
    aiServersCtorArg: MutPtr<AddrinfoDnsServer>,
    public var aiResponseflags: ULong,
) {
    public var aiCanonname: Pwstr = aiCanonnameCtorArg
        internal set

    public var aiAddr: MutPtr<Sockaddr> = aiAddrCtorArg
        internal set

    public var aiBlob: MutPtr<CVoid> = aiBlobCtorArg
        internal set

    public var aiProvider: MutPtr<Guid> = aiProviderCtorArg
        internal set

    public var aiNext: MutPtr<Addrinfoex5> = aiNextCtorArg
        internal set

    public var aiFqdn: Pwstr = aiFqdnCtorArg
        internal set

    public var aiResolutionhandle: Handle = aiResolutionhandleCtorArg
        internal set

    public var aiServers: MutPtr<AddrinfoDnsServer> = aiServersCtorArg
        internal set

    public constructor() : this(
        aiFlags = 0,
        aiFamily = 0,
        aiSocktype = 0,
        aiProtocol = 0,
        aiAddrlen = 0,
        aiCanonnameCtorArg = MutPtr(0L),
        aiAddrCtorArg = MutPtr(0L),
        aiBlobCtorArg = MutPtr(0L),
        aiBloblen = 0,
        aiProviderCtorArg = MutPtr(0L),
        aiNextCtorArg = MutPtr(0L),
        aiVersion = 0,
        aiFqdnCtorArg = MutPtr(0L),
        aiInterfaceindex = 0,
        aiResolutionhandleCtorArg = MutPtr(0L),
        aiTtl = 0u,
        aiNumservers = 0u,
        aiServersCtorArg = MutPtr(0L),
        aiResponseflags = 0uL,
    )

    public companion object {
        public operator fun invoke(
            aiFlags: Int = 0,
            aiFamily: Int = 0,
            aiSocktype: Int = 0,
            aiProtocol: Int = 0,
            aiAddrlen: Int = 0,
            aiCanonname: Pwstr = MutPtr(0L),
            aiAddr: MutPtr<Sockaddr> = MutPtr(0L),
            aiBlob: MutPtr<CVoid> = MutPtr(0L),
            aiBloblen: Int = 0,
            aiProvider: MutPtr<Guid> = MutPtr(0L),
            aiNext: MutPtr<Addrinfoex5> = MutPtr(0L),
            aiVersion: Int = 0,
            aiFqdn: Pwstr = MutPtr(0L),
            aiInterfaceindex: Int = 0,
            aiResolutionhandle: Handle = MutPtr(0L),
            aiTtl: UInt = 0u,
            aiNumservers: UInt = 0u,
            aiServers: MutPtr<AddrinfoDnsServer> = MutPtr(0L),
            aiResponseflags: ULong = 0uL,
        ): Addrinfoex6 =
            Addrinfoex6(
                aiFlags = aiFlags,
                aiFamily = aiFamily,
                aiSocktype = aiSocktype,
                aiProtocol = aiProtocol,
                aiAddrlen = aiAddrlen,
                aiCanonnameCtorArg = aiCanonname,
                aiAddrCtorArg = aiAddr,
                aiBlobCtorArg = aiBlob,
                aiBloblen = aiBloblen,
                aiProviderCtorArg = aiProvider,
                aiNextCtorArg = aiNext,
                aiVersion = aiVersion,
                aiFqdnCtorArg = aiFqdn,
                aiInterfaceindex = aiInterfaceindex,
                aiResolutionhandleCtorArg = aiResolutionhandle,
                aiTtl = aiTtl,
                aiNumservers = aiNumservers,
                aiServersCtorArg = aiServers,
                aiResponseflags = aiResponseflags,
            )
    }
}

public class Addrinfoexa internal constructor(
    public var aiFlags: Int,
    public var aiFamily: Int,
    public var aiSocktype: Int,
    public var aiProtocol: Int,
    public var aiAddrlen: Int,
    aiCanonnameCtorArg: Pstr,
    aiAddrCtorArg: MutPtr<Sockaddr>,
    aiBlobCtorArg: MutPtr<CVoid>,
    public var aiBloblen: Int,
    aiProviderCtorArg: MutPtr<Guid>,
    aiNextCtorArg: MutPtr<Addrinfoexa>,
) {
    public var aiCanonname: Pstr = aiCanonnameCtorArg
        internal set

    public var aiAddr: MutPtr<Sockaddr> = aiAddrCtorArg
        internal set

    public var aiBlob: MutPtr<CVoid> = aiBlobCtorArg
        internal set

    public var aiProvider: MutPtr<Guid> = aiProviderCtorArg
        internal set

    public var aiNext: MutPtr<Addrinfoexa> = aiNextCtorArg
        internal set

    public constructor() : this(
        aiFlags = 0,
        aiFamily = 0,
        aiSocktype = 0,
        aiProtocol = 0,
        aiAddrlen = 0,
        aiCanonnameCtorArg = MutPtr(0L),
        aiAddrCtorArg = MutPtr(0L),
        aiBlobCtorArg = MutPtr(0L),
        aiBloblen = 0,
        aiProviderCtorArg = MutPtr(0L),
        aiNextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.aiFlags

    public operator fun component2(): Int = this.aiFamily

    public operator fun component3(): Int = this.aiSocktype

    public operator fun component4(): Int = this.aiProtocol

    public operator fun component5(): Int = this.aiAddrlen

    public operator fun component6(): Pstr = this.aiCanonname

    public operator fun component7(): MutPtr<Sockaddr> = this.aiAddr

    public operator fun component8(): MutPtr<CVoid> = this.aiBlob

    public operator fun component9(): Int = this.aiBloblen

    public operator fun component10(): MutPtr<Guid> = this.aiProvider

    public operator fun component11(): MutPtr<Addrinfoexa> = this.aiNext

    public fun copy(aiFlags: Int = this.aiFlags, aiFamily: Int = this.aiFamily, aiSocktype: Int = this.aiSocktype, aiProtocol: Int = this.aiProtocol, aiAddrlen: Int = this.aiAddrlen, aiCanonname: Pstr = this.aiCanonname, aiAddr: MutPtr<Sockaddr> = this.aiAddr, aiBlob: MutPtr<CVoid> = this.aiBlob, aiBloblen: Int = this.aiBloblen, aiProvider: MutPtr<Guid> = this.aiProvider, aiNext: MutPtr<Addrinfoexa> = this.aiNext): Addrinfoexa = Addrinfoexa(aiFlags = aiFlags, aiFamily = aiFamily, aiSocktype = aiSocktype, aiProtocol = aiProtocol, aiAddrlen = aiAddrlen, aiCanonnameCtorArg = aiCanonname, aiAddrCtorArg = aiAddr, aiBlobCtorArg = aiBlob, aiBloblen = aiBloblen, aiProviderCtorArg = aiProvider, aiNextCtorArg = aiNext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Addrinfoexa) return false
        if (this.aiFlags != other.aiFlags) return false
        if (this.aiFamily != other.aiFamily) return false
        if (this.aiSocktype != other.aiSocktype) return false
        if (this.aiProtocol != other.aiProtocol) return false
        if (this.aiAddrlen != other.aiAddrlen) return false
        if (this.aiCanonname != other.aiCanonname) return false
        if (this.aiAddr != other.aiAddr) return false
        if (this.aiBlob != other.aiBlob) return false
        if (this.aiBloblen != other.aiBloblen) return false
        if (this.aiProvider != other.aiProvider) return false
        if (this.aiNext != other.aiNext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aiFlags.hashCode()
        result = 31 * result + this.aiFamily.hashCode()
        result = 31 * result + this.aiSocktype.hashCode()
        result = 31 * result + this.aiProtocol.hashCode()
        result = 31 * result + this.aiAddrlen.hashCode()
        result = 31 * result + this.aiCanonname.hashCode()
        result = 31 * result + this.aiAddr.hashCode()
        result = 31 * result + this.aiBlob.hashCode()
        result = 31 * result + this.aiBloblen.hashCode()
        result = 31 * result + this.aiProvider.hashCode()
        result = 31 * result + this.aiNext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aiFlags: Int = 0,
            aiFamily: Int = 0,
            aiSocktype: Int = 0,
            aiProtocol: Int = 0,
            aiAddrlen: Int = 0,
            aiCanonname: Pstr = MutPtr(0L),
            aiAddr: MutPtr<Sockaddr> = MutPtr(0L),
            aiBlob: MutPtr<CVoid> = MutPtr(0L),
            aiBloblen: Int = 0,
            aiProvider: MutPtr<Guid> = MutPtr(0L),
            aiNext: MutPtr<Addrinfoexa> = MutPtr(0L),
        ): Addrinfoexa =
            Addrinfoexa(
                aiFlags = aiFlags,
                aiFamily = aiFamily,
                aiSocktype = aiSocktype,
                aiProtocol = aiProtocol,
                aiAddrlen = aiAddrlen,
                aiCanonnameCtorArg = aiCanonname,
                aiAddrCtorArg = aiAddr,
                aiBlobCtorArg = aiBlob,
                aiBloblen = aiBloblen,
                aiProviderCtorArg = aiProvider,
                aiNextCtorArg = aiNext,
            )
    }
}

public class Addrinfoexw internal constructor(
    public var aiFlags: Int,
    public var aiFamily: Int,
    public var aiSocktype: Int,
    public var aiProtocol: Int,
    public var aiAddrlen: Int,
    aiCanonnameCtorArg: Pwstr,
    aiAddrCtorArg: MutPtr<Sockaddr>,
    aiBlobCtorArg: MutPtr<CVoid>,
    public var aiBloblen: Int,
    aiProviderCtorArg: MutPtr<Guid>,
    aiNextCtorArg: MutPtr<Addrinfoexw>,
) {
    public var aiCanonname: Pwstr = aiCanonnameCtorArg
        internal set

    public var aiAddr: MutPtr<Sockaddr> = aiAddrCtorArg
        internal set

    public var aiBlob: MutPtr<CVoid> = aiBlobCtorArg
        internal set

    public var aiProvider: MutPtr<Guid> = aiProviderCtorArg
        internal set

    public var aiNext: MutPtr<Addrinfoexw> = aiNextCtorArg
        internal set

    public constructor() : this(
        aiFlags = 0,
        aiFamily = 0,
        aiSocktype = 0,
        aiProtocol = 0,
        aiAddrlen = 0,
        aiCanonnameCtorArg = MutPtr(0L),
        aiAddrCtorArg = MutPtr(0L),
        aiBlobCtorArg = MutPtr(0L),
        aiBloblen = 0,
        aiProviderCtorArg = MutPtr(0L),
        aiNextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.aiFlags

    public operator fun component2(): Int = this.aiFamily

    public operator fun component3(): Int = this.aiSocktype

    public operator fun component4(): Int = this.aiProtocol

    public operator fun component5(): Int = this.aiAddrlen

    public operator fun component6(): Pwstr = this.aiCanonname

    public operator fun component7(): MutPtr<Sockaddr> = this.aiAddr

    public operator fun component8(): MutPtr<CVoid> = this.aiBlob

    public operator fun component9(): Int = this.aiBloblen

    public operator fun component10(): MutPtr<Guid> = this.aiProvider

    public operator fun component11(): MutPtr<Addrinfoexw> = this.aiNext

    public fun copy(aiFlags: Int = this.aiFlags, aiFamily: Int = this.aiFamily, aiSocktype: Int = this.aiSocktype, aiProtocol: Int = this.aiProtocol, aiAddrlen: Int = this.aiAddrlen, aiCanonname: Pwstr = this.aiCanonname, aiAddr: MutPtr<Sockaddr> = this.aiAddr, aiBlob: MutPtr<CVoid> = this.aiBlob, aiBloblen: Int = this.aiBloblen, aiProvider: MutPtr<Guid> = this.aiProvider, aiNext: MutPtr<Addrinfoexw> = this.aiNext): Addrinfoexw = Addrinfoexw(aiFlags = aiFlags, aiFamily = aiFamily, aiSocktype = aiSocktype, aiProtocol = aiProtocol, aiAddrlen = aiAddrlen, aiCanonnameCtorArg = aiCanonname, aiAddrCtorArg = aiAddr, aiBlobCtorArg = aiBlob, aiBloblen = aiBloblen, aiProviderCtorArg = aiProvider, aiNextCtorArg = aiNext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Addrinfoexw) return false
        if (this.aiFlags != other.aiFlags) return false
        if (this.aiFamily != other.aiFamily) return false
        if (this.aiSocktype != other.aiSocktype) return false
        if (this.aiProtocol != other.aiProtocol) return false
        if (this.aiAddrlen != other.aiAddrlen) return false
        if (this.aiCanonname != other.aiCanonname) return false
        if (this.aiAddr != other.aiAddr) return false
        if (this.aiBlob != other.aiBlob) return false
        if (this.aiBloblen != other.aiBloblen) return false
        if (this.aiProvider != other.aiProvider) return false
        if (this.aiNext != other.aiNext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aiFlags.hashCode()
        result = 31 * result + this.aiFamily.hashCode()
        result = 31 * result + this.aiSocktype.hashCode()
        result = 31 * result + this.aiProtocol.hashCode()
        result = 31 * result + this.aiAddrlen.hashCode()
        result = 31 * result + this.aiCanonname.hashCode()
        result = 31 * result + this.aiAddr.hashCode()
        result = 31 * result + this.aiBlob.hashCode()
        result = 31 * result + this.aiBloblen.hashCode()
        result = 31 * result + this.aiProvider.hashCode()
        result = 31 * result + this.aiNext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aiFlags: Int = 0,
            aiFamily: Int = 0,
            aiSocktype: Int = 0,
            aiProtocol: Int = 0,
            aiAddrlen: Int = 0,
            aiCanonname: Pwstr = MutPtr(0L),
            aiAddr: MutPtr<Sockaddr> = MutPtr(0L),
            aiBlob: MutPtr<CVoid> = MutPtr(0L),
            aiBloblen: Int = 0,
            aiProvider: MutPtr<Guid> = MutPtr(0L),
            aiNext: MutPtr<Addrinfoexw> = MutPtr(0L),
        ): Addrinfoexw =
            Addrinfoexw(
                aiFlags = aiFlags,
                aiFamily = aiFamily,
                aiSocktype = aiSocktype,
                aiProtocol = aiProtocol,
                aiAddrlen = aiAddrlen,
                aiCanonnameCtorArg = aiCanonname,
                aiAddrCtorArg = aiAddr,
                aiBlobCtorArg = aiBlob,
                aiBloblen = aiBloblen,
                aiProviderCtorArg = aiProvider,
                aiNextCtorArg = aiNext,
            )
    }
}

public class Addrinfow internal constructor(
    public var aiFlags: Int,
    public var aiFamily: Int,
    public var aiSocktype: Int,
    public var aiProtocol: Int,
    public var aiAddrlen: Int,
    aiCanonnameCtorArg: Pwstr,
    aiAddrCtorArg: MutPtr<Sockaddr>,
    aiNextCtorArg: MutPtr<Addrinfow>,
) {
    public var aiCanonname: Pwstr = aiCanonnameCtorArg
        internal set

    public var aiAddr: MutPtr<Sockaddr> = aiAddrCtorArg
        internal set

    public var aiNext: MutPtr<Addrinfow> = aiNextCtorArg
        internal set

    public constructor() : this(
        aiFlags = 0,
        aiFamily = 0,
        aiSocktype = 0,
        aiProtocol = 0,
        aiAddrlen = 0,
        aiCanonnameCtorArg = MutPtr(0L),
        aiAddrCtorArg = MutPtr(0L),
        aiNextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.aiFlags

    public operator fun component2(): Int = this.aiFamily

    public operator fun component3(): Int = this.aiSocktype

    public operator fun component4(): Int = this.aiProtocol

    public operator fun component5(): Int = this.aiAddrlen

    public operator fun component6(): Pwstr = this.aiCanonname

    public operator fun component7(): MutPtr<Sockaddr> = this.aiAddr

    public operator fun component8(): MutPtr<Addrinfow> = this.aiNext

    public fun copy(aiFlags: Int = this.aiFlags, aiFamily: Int = this.aiFamily, aiSocktype: Int = this.aiSocktype, aiProtocol: Int = this.aiProtocol, aiAddrlen: Int = this.aiAddrlen, aiCanonname: Pwstr = this.aiCanonname, aiAddr: MutPtr<Sockaddr> = this.aiAddr, aiNext: MutPtr<Addrinfow> = this.aiNext): Addrinfow = Addrinfow(aiFlags = aiFlags, aiFamily = aiFamily, aiSocktype = aiSocktype, aiProtocol = aiProtocol, aiAddrlen = aiAddrlen, aiCanonnameCtorArg = aiCanonname, aiAddrCtorArg = aiAddr, aiNextCtorArg = aiNext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Addrinfow) return false
        if (this.aiFlags != other.aiFlags) return false
        if (this.aiFamily != other.aiFamily) return false
        if (this.aiSocktype != other.aiSocktype) return false
        if (this.aiProtocol != other.aiProtocol) return false
        if (this.aiAddrlen != other.aiAddrlen) return false
        if (this.aiCanonname != other.aiCanonname) return false
        if (this.aiAddr != other.aiAddr) return false
        if (this.aiNext != other.aiNext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aiFlags.hashCode()
        result = 31 * result + this.aiFamily.hashCode()
        result = 31 * result + this.aiSocktype.hashCode()
        result = 31 * result + this.aiProtocol.hashCode()
        result = 31 * result + this.aiAddrlen.hashCode()
        result = 31 * result + this.aiCanonname.hashCode()
        result = 31 * result + this.aiAddr.hashCode()
        result = 31 * result + this.aiNext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aiFlags: Int = 0,
            aiFamily: Int = 0,
            aiSocktype: Int = 0,
            aiProtocol: Int = 0,
            aiAddrlen: Int = 0,
            aiCanonname: Pwstr = MutPtr(0L),
            aiAddr: MutPtr<Sockaddr> = MutPtr(0L),
            aiNext: MutPtr<Addrinfow> = MutPtr(0L),
        ): Addrinfow =
            Addrinfow(
                aiFlags = aiFlags,
                aiFamily = aiFamily,
                aiSocktype = aiSocktype,
                aiProtocol = aiProtocol,
                aiAddrlen = aiAddrlen,
                aiCanonnameCtorArg = aiCanonname,
                aiAddrCtorArg = aiAddr,
                aiNextCtorArg = aiNext,
            )
    }
}

public class AddrinfoDnsServer internal constructor(
    public var aiServertype: UInt,
    public var aiFlags: ULong,
    public var aiAddrlen: UInt,
    aiAddrCtorArg: MutPtr<Sockaddr>,
    public var anonymous: AddrinfoDnsServer0,
) {
    public var aiAddr: MutPtr<Sockaddr> = aiAddrCtorArg
        internal set

    public constructor() : this(
        aiServertype = 0u,
        aiFlags = 0uL,
        aiAddrlen = 0u,
        aiAddrCtorArg = MutPtr(0L),
        anonymous = AddrinfoDnsServer0(),
    )

    public operator fun component1(): UInt = this.aiServertype

    public operator fun component2(): ULong = this.aiFlags

    public operator fun component3(): UInt = this.aiAddrlen

    public operator fun component4(): MutPtr<Sockaddr> = this.aiAddr

    public operator fun component5(): AddrinfoDnsServer0 = this.anonymous

    public fun copy(aiServertype: UInt = this.aiServertype, aiFlags: ULong = this.aiFlags, aiAddrlen: UInt = this.aiAddrlen, aiAddr: MutPtr<Sockaddr> = this.aiAddr, anonymous: AddrinfoDnsServer0 = this.anonymous): AddrinfoDnsServer = AddrinfoDnsServer(aiServertype = aiServertype, aiFlags = aiFlags, aiAddrlen = aiAddrlen, aiAddrCtorArg = aiAddr, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AddrinfoDnsServer) return false
        if (this.aiServertype != other.aiServertype) return false
        if (this.aiFlags != other.aiFlags) return false
        if (this.aiAddrlen != other.aiAddrlen) return false
        if (this.aiAddr != other.aiAddr) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aiServertype.hashCode()
        result = 31 * result + this.aiFlags.hashCode()
        result = 31 * result + this.aiAddrlen.hashCode()
        result = 31 * result + this.aiAddr.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aiServertype: UInt = 0u,
            aiFlags: ULong = 0uL,
            aiAddrlen: UInt = 0u,
            aiAddr: MutPtr<Sockaddr> = MutPtr(0L),
            anonymous: AddrinfoDnsServer0 = AddrinfoDnsServer0(),
        ): AddrinfoDnsServer =
            AddrinfoDnsServer(
                aiServertype = aiServertype,
                aiFlags = aiFlags,
                aiAddrlen = aiAddrlen,
                aiAddrCtorArg = aiAddr,
                anonymous = anonymous,
            )
    }
}

public class AddrinfoDnsServer0 internal constructor(
    aiTemplateCtorArg: Pwstr,
) {
    public var aiTemplate: Pwstr = aiTemplateCtorArg
        internal set

    public constructor() : this(
        aiTemplateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.aiTemplate

    public fun copy(aiTemplate: Pwstr = this.aiTemplate): AddrinfoDnsServer0 = AddrinfoDnsServer0(aiTemplateCtorArg = aiTemplate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AddrinfoDnsServer0) return false
        if (this.aiTemplate != other.aiTemplate) return false
        return true
    }

    override fun hashCode(): Int = this.aiTemplate.hashCode()

    public companion object {
        public operator fun invoke(
            aiTemplate: Pwstr = MutPtr(0L),
        ): AddrinfoDnsServer0 =
            AddrinfoDnsServer0(
                aiTemplateCtorArg = aiTemplate,
            )
    }
}

public data class Afprotocols(
    public var iAddressFamily: Int = 0,
    public var iProtocol: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Afprotocols> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Afprotocols> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Afprotocols =
                    Afprotocols(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Afprotocols) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.iAddressFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.iProtocol)
                }
            }
    }
}

public data class ArpHeader(
    public var hardwareAddressSpace: UShort = 0u,
    public var protocolAddressSpace: UShort = 0u,
    public var hardwareAddressLength: UByte = 0u,
    public var protocolAddressLength: UByte = 0u,
    public var opcode: UShort = 0u,
    public var senderHardwareAddress: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ArpHeader) return false
        if (this.hardwareAddressSpace != other.hardwareAddressSpace) return false
        if (this.protocolAddressSpace != other.protocolAddressSpace) return false
        if (this.hardwareAddressLength != other.hardwareAddressLength) return false
        if (this.protocolAddressLength != other.protocolAddressLength) return false
        if (this.opcode != other.opcode) return false
        if (!this.senderHardwareAddress.contentEquals(other.senderHardwareAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hardwareAddressSpace.hashCode()
        result = 31 * result + this.protocolAddressSpace.hashCode()
        result = 31 * result + this.hardwareAddressLength.hashCode()
        result = 31 * result + this.protocolAddressLength.hashCode()
        result = 31 * result + this.opcode.hashCode()
        result = 31 * result + this.senderHardwareAddress.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArpHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ArpHeader> {
                override val sizeBytes: Long = 10L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): ArpHeader =
                    ArpHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ArpHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.hardwareAddressSpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.protocolAddressSpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.hardwareAddressLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.protocolAddressLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.opcode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.senderHardwareAddress)
                }
            }
    }
}

public data class AssociateNameresContextInput(
    public var transportSettingId: TransportSettingId = TransportSettingId(),
    public var handle: ULong = 0uL,
)

public data class AtmAddress(
    public var addressType: UInt = 0u,
    public var numofDigits: UInt = 0u,
    public var addr: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AtmAddress) return false
        if (this.addressType != other.addressType) return false
        if (this.numofDigits != other.numofDigits) return false
        if (!this.addr.contentEquals(other.addr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addressType.hashCode()
        result = 31 * result + this.numofDigits.hashCode()
        result = 31 * result + this.addr.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtmAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtmAddress> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): AtmAddress =
                    AtmAddress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AtmAddress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.addressType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numofDigits)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 8L, value.addr)
                }
            }
    }
}

public data class AtmBhli(
    public var highLayerInfoType: UInt = 0u,
    public var highLayerInfoLength: UInt = 0u,
    public var highLayerInfo: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AtmBhli) return false
        if (this.highLayerInfoType != other.highLayerInfoType) return false
        if (this.highLayerInfoLength != other.highLayerInfoLength) return false
        if (!this.highLayerInfo.contentEquals(other.highLayerInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.highLayerInfoType.hashCode()
        result = 31 * result + this.highLayerInfoLength.hashCode()
        result = 31 * result + this.highLayerInfo.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtmBhli> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtmBhli> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): AtmBhli =
                    AtmBhli(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AtmBhli) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.highLayerInfoType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.highLayerInfoLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 8L, value.highLayerInfo)
                }
            }
    }
}

public data class AtmBlli(
    public var layer2Protocol: UInt = 0u,
    public var layer2UserSpecifiedProtocol: UInt = 0u,
    public var layer3Protocol: UInt = 0u,
    public var layer3UserSpecifiedProtocol: UInt = 0u,
    public var layer3IPI: UInt = 0u,
    public var snapID: UByteArray = UByteArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AtmBlli) return false
        if (this.layer2Protocol != other.layer2Protocol) return false
        if (this.layer2UserSpecifiedProtocol != other.layer2UserSpecifiedProtocol) return false
        if (this.layer3Protocol != other.layer3Protocol) return false
        if (this.layer3UserSpecifiedProtocol != other.layer3UserSpecifiedProtocol) return false
        if (this.layer3IPI != other.layer3IPI) return false
        if (!this.snapID.contentEquals(other.snapID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.layer2Protocol.hashCode()
        result = 31 * result + this.layer2UserSpecifiedProtocol.hashCode()
        result = 31 * result + this.layer3Protocol.hashCode()
        result = 31 * result + this.layer3UserSpecifiedProtocol.hashCode()
        result = 31 * result + this.layer3IPI.hashCode()
        result = 31 * result + this.snapID.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtmBlli> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtmBlli> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): AtmBlli =
                    AtmBlli(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (5).toInt())
                        ).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: AtmBlli) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.layer2Protocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.layer2UserSpecifiedProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.layer3Protocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.layer3UserSpecifiedProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.layer3IPI)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (5).toInt())
                    ).writeNative(addr + 20L, value.snapID)
                }
            }
    }
}

public data class AtmBlliIe(
    public var layer2Protocol: UInt = 0u,
    public var layer2Mode: UByte = 0u,
    public var layer2WindowSize: UByte = 0u,
    public var layer2UserSpecifiedProtocol: UInt = 0u,
    public var layer3Protocol: UInt = 0u,
    public var layer3Mode: UByte = 0u,
    public var layer3DefaultPacketSize: UByte = 0u,
    public var layer3PacketWindowSize: UByte = 0u,
    public var layer3UserSpecifiedProtocol: UInt = 0u,
    public var layer3IPI: UInt = 0u,
    public var snapID: UByteArray = UByteArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AtmBlliIe) return false
        if (this.layer2Protocol != other.layer2Protocol) return false
        if (this.layer2Mode != other.layer2Mode) return false
        if (this.layer2WindowSize != other.layer2WindowSize) return false
        if (this.layer2UserSpecifiedProtocol != other.layer2UserSpecifiedProtocol) return false
        if (this.layer3Protocol != other.layer3Protocol) return false
        if (this.layer3Mode != other.layer3Mode) return false
        if (this.layer3DefaultPacketSize != other.layer3DefaultPacketSize) return false
        if (this.layer3PacketWindowSize != other.layer3PacketWindowSize) return false
        if (this.layer3UserSpecifiedProtocol != other.layer3UserSpecifiedProtocol) return false
        if (this.layer3IPI != other.layer3IPI) return false
        if (!this.snapID.contentEquals(other.snapID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.layer2Protocol.hashCode()
        result = 31 * result + this.layer2Mode.hashCode()
        result = 31 * result + this.layer2WindowSize.hashCode()
        result = 31 * result + this.layer2UserSpecifiedProtocol.hashCode()
        result = 31 * result + this.layer3Protocol.hashCode()
        result = 31 * result + this.layer3Mode.hashCode()
        result = 31 * result + this.layer3DefaultPacketSize.hashCode()
        result = 31 * result + this.layer3PacketWindowSize.hashCode()
        result = 31 * result + this.layer3UserSpecifiedProtocol.hashCode()
        result = 31 * result + this.layer3IPI.hashCode()
        result = 31 * result + this.snapID.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtmBlliIe> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtmBlliIe> {
                override val sizeBytes: Long = 36L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): AtmBlliIe =
                    AtmBlliIe(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (5).toInt())
                        ).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: AtmBlliIe) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.layer2Protocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.layer2Mode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.layer2WindowSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.layer2UserSpecifiedProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.layer3Protocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.layer3Mode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.layer3DefaultPacketSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 18L, value.layer3PacketWindowSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.layer3UserSpecifiedProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.layer3IPI)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (5).toInt())
                    ).writeNative(addr + 28L, value.snapID)
                }
            }
    }
}

public data class AtmBroadbandBearerCapabilityIe(
    public var bearerClass: UByte = 0u,
    public var trafficType: UByte = 0u,
    public var timingRequirements: UByte = 0u,
    public var clippingSusceptability: UByte = 0u,
    public var userPlaneConnectionConfig: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtmBroadbandBearerCapabilityIe> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtmBroadbandBearerCapabilityIe> {
                override val sizeBytes: Long = 5L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): AtmBroadbandBearerCapabilityIe =
                    AtmBroadbandBearerCapabilityIe(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: AtmBroadbandBearerCapabilityIe) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bearerClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.trafficType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.timingRequirements)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.clippingSusceptability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.userPlaneConnectionConfig)
                }
            }
    }
}

public data class AtmCallingPartyNumberIe(
    public var atmNumber: AtmAddress = AtmAddress(),
    public var presentationIndication: UByte = 0u,
    public var screeningIndicator: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtmCallingPartyNumberIe> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtmCallingPartyNumberIe> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): AtmCallingPartyNumberIe =
                    AtmCallingPartyNumberIe(
                        (AtmAddress.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 29L),
                    )
                override fun writeNative(addr: Long, value: AtmCallingPartyNumberIe) {
                    (AtmAddress.typeLayout()).writeNative(addr, value.atmNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 28L, value.presentationIndication)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 29L, value.screeningIndicator)
                }
            }
    }
}

public data class AtmCauseIe(
    public var location: UByte = 0u,
    public var cause: UByte = 0u,
    public var diagnosticsLength: UByte = 0u,
    public var diagnostics: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AtmCauseIe) return false
        if (this.location != other.location) return false
        if (this.cause != other.cause) return false
        if (this.diagnosticsLength != other.diagnosticsLength) return false
        if (!this.diagnostics.contentEquals(other.diagnostics)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.location.hashCode()
        result = 31 * result + this.cause.hashCode()
        result = 31 * result + this.diagnosticsLength.hashCode()
        result = 31 * result + this.diagnostics.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtmCauseIe> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtmCauseIe> {
                override val sizeBytes: Long = 7L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): AtmCauseIe =
                    AtmCauseIe(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: AtmCauseIe) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.location)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.cause)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.diagnosticsLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 3L, value.diagnostics)
                }
            }
    }
}

public data class AtmConnectionId(
    public var deviceNumber: UInt = 0u,
    public var vpi: UInt = 0u,
    public var vci: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtmConnectionId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtmConnectionId> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): AtmConnectionId =
                    AtmConnectionId(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AtmConnectionId) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.deviceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vpi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.vci)
                }
            }
    }
}

public data class AtmPvcParams(
    public var pvcConnectionId: AtmConnectionId = AtmConnectionId(),
    public var pvcQos: Qos = Qos(),
)

public data class AtmQosClassIe(
    public var qOSClassForward: UByte = 0u,
    public var qOSClassBackward: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtmQosClassIe> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtmQosClassIe> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): AtmQosClassIe =
                    AtmQosClassIe(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: AtmQosClassIe) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.qOSClassForward)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.qOSClassBackward)
                }
            }
    }
}

public data class AtmTd(
    public var peakCellRateClp0: UInt = 0u,
    public var peakCellRateClp01: UInt = 0u,
    public var sustainableCellRateClp0: UInt = 0u,
    public var sustainableCellRateClp01: UInt = 0u,
    public var maxBurstSizeClp0: UInt = 0u,
    public var maxBurstSizeClp01: UInt = 0u,
    public var tagging: Bool = 0,
)

public data class AtmTrafficDescriptorIe(
    public var forward: AtmTd = AtmTd(),
    public var backward: AtmTd = AtmTd(),
    public var bestEffort: Bool = 0,
)

public data class AtmTransitNetworkSelectionIe(
    public var typeOfNetworkId: UByte = 0u,
    public var networkIdPlan: UByte = 0u,
    public var networkIdLength: UByte = 0u,
    public var networkId: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AtmTransitNetworkSelectionIe) return false
        if (this.typeOfNetworkId != other.typeOfNetworkId) return false
        if (this.networkIdPlan != other.networkIdPlan) return false
        if (this.networkIdLength != other.networkIdLength) return false
        if (!this.networkId.contentEquals(other.networkId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.typeOfNetworkId.hashCode()
        result = 31 * result + this.networkIdPlan.hashCode()
        result = 31 * result + this.networkIdLength.hashCode()
        result = 31 * result + this.networkId.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtmTransitNetworkSelectionIe> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtmTransitNetworkSelectionIe> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): AtmTransitNetworkSelectionIe =
                    AtmTransitNetworkSelectionIe(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: AtmTransitNetworkSelectionIe) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.typeOfNetworkId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.networkIdPlan)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.networkIdLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 3L, value.networkId)
                }
            }
    }
}

public data class Cmsghdr(
    public var cmsgLen: Int = 0,
    public var cmsgLevel: Int = 0,
    public var cmsgType: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cmsghdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cmsghdr> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Cmsghdr =
                    Cmsghdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Cmsghdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.cmsgLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.cmsgLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.cmsgType)
                }
            }
    }
}

public data class CsaddrInfo(
    public var localAddr: SocketAddress = SocketAddress(),
    public var remoteAddr: SocketAddress = SocketAddress(),
    public var iSocketType: Int = 0,
    public var iProtocol: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsaddrInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CsaddrInfo> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): CsaddrInfo =
                    CsaddrInfo(
                        (SocketAddress.typeLayout()).readNative(addr),
                        (SocketAddress.typeLayout()).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: CsaddrInfo) {
                    (SocketAddress.typeLayout()).writeNative(addr, value.localAddr)
                    (SocketAddress.typeLayout()).writeNative(addr + 16L, value.remoteAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.iSocketType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.iProtocol)
                }
            }
    }
}

public data class DlEi48(
    public var byte: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlEi48) return false
        if (!this.byte.contentEquals(other.byte)) return false
        return true
    }

    override fun hashCode(): Int = this.byte.contentHashCode()
}

public data class DlEi64(
    public var byte: UByteArray = UByteArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlEi64) return false
        if (!this.byte.contentEquals(other.byte)) return false
        return true
    }

    override fun hashCode(): Int = this.byte.contentHashCode()
}

public data class DlEui48(
    public var byte: UByteArray = UByteArray(6),
    public var anonymous: DlEui480 = DlEui480(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlEui48) return false
        if (!this.byte.contentEquals(other.byte)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.byte.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class DlEui480(
    public var oui: DlOui = DlOui(),
    public var ei48: DlEi48 = DlEi48(),
)

public data class DlEui64(
    public var byte: UByteArray = UByteArray(8),
    public var value: ULong = 0uL,
    public var anonymous: DlEui640 = DlEui640(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlEui64) return false
        if (!this.byte.contentEquals(other.byte)) return false
        if (this.value != other.value) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.byte.contentHashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class DlEui640(
    public var oui: DlOui = DlOui(),
    public var anonymous: DlEui6400 = DlEui6400(),
)

public data class DlEui6400(
    public var ei64: DlEi64 = DlEi64(),
    public var anonymous: DlEui64000 = DlEui64000(),
)

public data class DlEui64000(
    public var type: UByte = 0u,
    public var tse: UByte = 0u,
    public var ei48: DlEi48 = DlEi48(),
)

public data class DlOui(
    public var byte: UByteArray = UByteArray(3),
    public var anonymous: DlOui0 = DlOui0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlOui) return false
        if (!this.byte.contentEquals(other.byte)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.byte.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class DlOui0(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DlOui0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DlOui0> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DlOui0 =
                    DlOui0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DlOui0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DlTeredoAddress(
    public var reserved: UByteArray = UByteArray(6),
    public var anonymous: DlTeredoAddress0 = DlTeredoAddress0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlTeredoAddress) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class DlTeredoAddress0(
    public var eui64: DlEui64 = DlEui64(),
    public var anonymous: DlTeredoAddress00 = DlTeredoAddress00(),
)

public data class DlTeredoAddress00(
    public var flags: UShort = 0u,
    public var mappedPort: UShort = 0u,
    public var mappedAddress: InAddr = InAddr(),
)

public data class DlTeredoAddressPrv(
    public var reserved: UByteArray = UByteArray(6),
    public var anonymous: DlTeredoAddressPrv0 = DlTeredoAddressPrv0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlTeredoAddressPrv) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class DlTeredoAddressPrv0(
    public var eui64: DlEui64 = DlEui64(),
    public var anonymous: DlTeredoAddressPrv00 = DlTeredoAddressPrv00(),
)

public data class DlTeredoAddressPrv00(
    public var flags: UShort = 0u,
    public var mappedPort: UShort = 0u,
    public var mappedAddress: InAddr = InAddr(),
    public var localAddress: InAddr = InAddr(),
    public var interfaceIndex: UInt = 0u,
    public var localPort: UShort = 0u,
    public var dlDestination: DlEui48 = DlEui48(),
)

public data class DlTunnelAddress(
    public var compartmentId: CompartmentId = 0,
    public var scopeId: ScopeId = ScopeId(),
    public var ipAddress: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlTunnelAddress) return false
        if (this.compartmentId != other.compartmentId) return false
        if (this.scopeId != other.scopeId) return false
        if (!this.ipAddress.contentEquals(other.ipAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.compartmentId.hashCode()
        result = 31 * result + this.scopeId.hashCode()
        result = 31 * result + this.ipAddress.contentHashCode()
        return result
    }
}

public data class EthernetHeader(
    public var destination: DlEui48 = DlEui48(),
    public var source: DlEui48 = DlEui48(),
    public var anonymous: EthernetHeader0 = EthernetHeader0(),
)

public data class EthernetHeader0(
    public var type: UShort = 0u,
    public var length: UShort = 0u,
)

public data class FdSet(
    public var fdCount: UInt = 0u,
    public var fdArray: ULongArray = ULongArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FdSet) return false
        if (this.fdCount != other.fdCount) return false
        if (!this.fdArray.contentEquals(other.fdArray)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fdCount.hashCode()
        result = 31 * result + this.fdArray.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FdSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FdSet> {
                override val sizeBytes: Long = 520L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FdSet =
                    FdSet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (64).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FdSet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fdCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (64).toInt())
                    ).writeNative(addr + 8L, value.fdArray)
                }
            }
    }
}

public data class Flowspec(
    public var tokenRate: UInt = 0u,
    public var tokenBucketSize: UInt = 0u,
    public var peakBandwidth: UInt = 0u,
    public var latency: UInt = 0u,
    public var delayVariation: UInt = 0u,
    public var serviceType: UInt = 0u,
    public var maxSduSize: UInt = 0u,
    public var minimumPolicedSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flowspec> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flowspec> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Flowspec =
                    Flowspec(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Flowspec) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tokenRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.tokenBucketSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.peakBandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.latency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.delayVariation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.serviceType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.maxSduSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.minimumPolicedSize)
                }
            }
    }
}

public data class GroupFilter(
    public var gfInterface: UInt = 0u,
    public var gfGroup: SockaddrStorage = SockaddrStorage(),
    public var gfFmode: MulticastModeType = 0,
    public var gfNumsrc: UInt = 0u,
    public var gfSlist: List<SockaddrStorage> = List(1) { SockaddrStorage() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GroupFilter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GroupFilter> {
                override val sizeBytes: Long = 272L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): GroupFilter =
                    GroupFilter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (SockaddrStorage.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(SockaddrStorage.typeLayout(), (1).toInt())
                        ).readNative(addr + 144L),
                    )
                override fun writeNative(addr: Long, value: GroupFilter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.gfInterface)
                    (SockaddrStorage.typeLayout()).writeNative(addr + 8L, value.gfGroup)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 136L, value.gfFmode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.gfNumsrc)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(SockaddrStorage.typeLayout(), (1).toInt())
                    ).writeNative(addr + 144L, value.gfSlist)
                }
            }
    }
}

public data class GroupReq(
    public var grInterface: UInt = 0u,
    public var grGroup: SockaddrStorage = SockaddrStorage(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GroupReq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GroupReq> {
                override val sizeBytes: Long = 136L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): GroupReq =
                    GroupReq(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (SockaddrStorage.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: GroupReq) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.grInterface)
                    (SockaddrStorage.typeLayout()).writeNative(addr + 8L, value.grGroup)
                }
            }
    }
}

public data class GroupSourceReq(
    public var gsrInterface: UInt = 0u,
    public var gsrGroup: SockaddrStorage = SockaddrStorage(),
    public var gsrSource: SockaddrStorage = SockaddrStorage(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GroupSourceReq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GroupSourceReq> {
                override val sizeBytes: Long = 264L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): GroupSourceReq =
                    GroupSourceReq(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (SockaddrStorage.typeLayout()).readNative(addr + 8L),
                        (SockaddrStorage.typeLayout()).readNative(addr + 136L),
                    )
                override fun writeNative(addr: Long, value: GroupSourceReq) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.gsrInterface)
                    (SockaddrStorage.typeLayout()).writeNative(addr + 8L, value.gsrGroup)
                    (SockaddrStorage.typeLayout()).writeNative(addr + 136L, value.gsrSource)
                }
            }
    }
}

public class Hostent internal constructor(
    hNameCtorArg: Pstr,
    hAliasesCtorArg: MutPtr<MutPtr<Byte>>,
    public var hAddrtype: Short,
    public var hLength: Short,
    hAddrListCtorArg: MutPtr<MutPtr<Byte>>,
) {
    public var hName: Pstr = hNameCtorArg
        internal set

    public var hAliases: MutPtr<MutPtr<Byte>> = hAliasesCtorArg
        internal set

    public var hAddrList: MutPtr<MutPtr<Byte>> = hAddrListCtorArg
        internal set

    public constructor() : this(
        hNameCtorArg = MutPtr(0L),
        hAliasesCtorArg = MutPtr(0L),
        hAddrtype = 0,
        hLength = 0,
        hAddrListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.hName

    public operator fun component2(): MutPtr<MutPtr<Byte>> = this.hAliases

    public operator fun component3(): Short = this.hAddrtype

    public operator fun component4(): Short = this.hLength

    public operator fun component5(): MutPtr<MutPtr<Byte>> = this.hAddrList

    public fun copy(hName: Pstr = this.hName, hAliases: MutPtr<MutPtr<Byte>> = this.hAliases, hAddrtype: Short = this.hAddrtype, hLength: Short = this.hLength, hAddrList: MutPtr<MutPtr<Byte>> = this.hAddrList): Hostent = Hostent(hNameCtorArg = hName, hAliasesCtorArg = hAliases, hAddrtype = hAddrtype, hLength = hLength, hAddrListCtorArg = hAddrList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Hostent) return false
        if (this.hName != other.hName) return false
        if (this.hAliases != other.hAliases) return false
        if (this.hAddrtype != other.hAddrtype) return false
        if (this.hLength != other.hLength) return false
        if (this.hAddrList != other.hAddrList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hName.hashCode()
        result = 31 * result + this.hAliases.hashCode()
        result = 31 * result + this.hAddrtype.hashCode()
        result = 31 * result + this.hLength.hashCode()
        result = 31 * result + this.hAddrList.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hName: Pstr = MutPtr(0L),
            hAliases: MutPtr<MutPtr<Byte>> = MutPtr(0L),
            hAddrtype: Short = 0,
            hLength: Short = 0,
            hAddrList: MutPtr<MutPtr<Byte>> = MutPtr(0L),
        ): Hostent =
            Hostent(
                hNameCtorArg = hName,
                hAliasesCtorArg = hAliases,
                hAddrtype = hAddrtype,
                hLength = hLength,
                hAddrListCtorArg = hAddrList,
            )
    }
}

public data class Icmpv4AddressMaskMessage(
    public var header: IcmpMessage = IcmpMessage(),
    public var addressMask: UInt = 0u,
)

public data class Icmpv4RouterAdvertEntry(
    public var routerAdvertAddr: InAddr = InAddr(),
    public var preferenceLevel: Int = 0,
)

public data class Icmpv4RouterAdvertHeader(
    public var raHeader: IcmpMessage = IcmpMessage(),
)

public data class Icmpv4RouterSolicit(
    public var rsHeader: IcmpMessage = IcmpMessage(),
)

public data class Icmpv4TimestampMessage(
    public var header: IcmpMessage = IcmpMessage(),
    public var originateTimestamp: UInt = 0u,
    public var receiveTimestamp: UInt = 0u,
    public var transmitTimestamp: UInt = 0u,
)

public data class IcmpErrorInfo(
    public var srcaddress: SockaddrInet = SockaddrInet(),
    public var protocol: Ipproto = 0,
    public var type: UByte = 0u,
    public var code: UByte = 0u,
)

public data class IcmpHeader(
    public var type: UByte = 0u,
    public var code: UByte = 0u,
    public var checksum: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IcmpHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IcmpHeader> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): IcmpHeader =
                    IcmpHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: IcmpHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.code)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.checksum)
                }
            }
    }
}

public data class IcmpMessage(
    public var header: IcmpHeader = IcmpHeader(),
    public var data: IcmpMessage0 = IcmpMessage0(),
)

public data class IcmpMessage0(
    public var data32: UIntArray = UIntArray(1),
    public var data16: UShortArray = UShortArray(2),
    public var data8: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IcmpMessage0) return false
        if (!this.data32.contentEquals(other.data32)) return false
        if (!this.data16.contentEquals(other.data16)) return false
        if (!this.data8.contentEquals(other.data8)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data32.contentHashCode()
        result = 31 * result + this.data16.contentHashCode()
        result = 31 * result + this.data8.contentHashCode()
        return result
    }
}

public data class Igmpv3QueryHeader(
    public var type: UByte = 0u,
    public var anonymous1: Igmpv3QueryHeader0 = Igmpv3QueryHeader0(),
    public var checksum: UShort = 0u,
    public var multicastAddress: InAddr = InAddr(),
    public var bitfield: UByte = 0u,
    public var anonymous2: Igmpv3QueryHeader1 = Igmpv3QueryHeader1(),
    public var sourceCount: UShort = 0u,
)

public data class Igmpv3QueryHeader0(
    public var maxRespCode: UByte = 0u,
    public var anonymous: Igmpv3QueryHeader00 = Igmpv3QueryHeader00(),
)

public data class Igmpv3QueryHeader00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Igmpv3QueryHeader00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Igmpv3QueryHeader00> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Igmpv3QueryHeader00 =
                    Igmpv3QueryHeader00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Igmpv3QueryHeader00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Igmpv3QueryHeader1(
    public var queriersQueryInterfaceCode: UByte = 0u,
    public var anonymous: Igmpv3QueryHeader10 = Igmpv3QueryHeader10(),
)

public data class Igmpv3QueryHeader10(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Igmpv3QueryHeader10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Igmpv3QueryHeader10> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Igmpv3QueryHeader10 =
                    Igmpv3QueryHeader10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Igmpv3QueryHeader10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Igmpv3ReportHeader(
    public var type: UByte = 0u,
    public var reserved: UByte = 0u,
    public var checksum: UShort = 0u,
    public var reserved2: UShort = 0u,
    public var recordCount: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Igmpv3ReportHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Igmpv3ReportHeader> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Igmpv3ReportHeader =
                    Igmpv3ReportHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Igmpv3ReportHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.checksum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.recordCount)
                }
            }
    }
}

public data class Igmpv3ReportRecordHeader(
    public var type: UByte = 0u,
    public var auxillaryDataLength: UByte = 0u,
    public var sourceCount: UShort = 0u,
    public var multicastAddress: InAddr = InAddr(),
)

public data class IgmpHeader(
    public var anonymous1: IgmpHeader0 = IgmpHeader0(),
    public var anonymous2: IgmpHeader1 = IgmpHeader1(),
    public var checksum: UShort = 0u,
    public var multicastAddress: InAddr = InAddr(),
)

public data class IgmpHeader0(
    public var anonymous: IgmpHeader00 = IgmpHeader00(),
    public var versionType: UByte = 0u,
)

public data class IgmpHeader00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IgmpHeader00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IgmpHeader00> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): IgmpHeader00 =
                    IgmpHeader00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IgmpHeader00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class IgmpHeader1(
    public var reserved: UByte = 0u,
    public var maxRespTime: UByte = 0u,
    public var code: UByte = 0u,
)

public data class In6Addr(
    public var u: In6Addr0 = In6Addr0(),
)

public data class In6Addr0(
    public var byte: UByteArray = UByteArray(16),
    public var word: UShortArray = UShortArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is In6Addr0) return false
        if (!this.byte.contentEquals(other.byte)) return false
        if (!this.word.contentEquals(other.word)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.byte.contentHashCode()
        result = 31 * result + this.word.contentHashCode()
        return result
    }
}

public data class In6Pktinfo(
    public var ipi6Addr: In6Addr = In6Addr(),
    public var ipi6Ifindex: UInt = 0u,
)

public data class In6PktinfoEx(
    public var pktInfo: In6Pktinfo = In6Pktinfo(),
    public var scopeId: ScopeId = ScopeId(),
)

public data class InetPortRange(
    public var startPort: UShort = 0u,
    public var numberOfPorts: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InetPortRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InetPortRange> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): InetPortRange =
                    InetPortRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: InetPortRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.startPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.numberOfPorts)
                }
            }
    }
}

public data class InetPortReservationInformation(
    public var owningPid: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InetPortReservationInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InetPortReservationInformation> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): InetPortReservationInformation =
                    InetPortReservationInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: InetPortReservationInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.owningPid)
                }
            }
    }
}

public data class InetPortReservationInstance(
    public var reservation: InetPortRange = InetPortRange(),
    public var token: InetPortReservationToken = InetPortReservationToken(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InetPortReservationInstance> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InetPortReservationInstance> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): InetPortReservationInstance =
                    InetPortReservationInstance(
                        (InetPortRange.typeLayout()).readNative(addr),
                        (InetPortReservationToken.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: InetPortReservationInstance) {
                    (InetPortRange.typeLayout()).writeNative(addr, value.reservation)
                    (InetPortReservationToken.typeLayout()).writeNative(addr + 8L, value.token)
                }
            }
    }
}

public data class InetPortReservationToken(
    public var token: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InetPortReservationToken> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InetPortReservationToken> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): InetPortReservationToken =
                    InetPortReservationToken(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: InetPortReservationToken) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.token)
                }
            }
    }
}

public data class InterfaceInfo(
    public var iiFlags: UInt = 0u,
    public var iiAddress: SockaddrGen = SockaddrGen(),
    public var iiBroadcastAddress: SockaddrGen = SockaddrGen(),
    public var iiNetmask: SockaddrGen = SockaddrGen(),
)

public data class InterfaceInfoEx(
    public var iiFlags: UInt = 0u,
    public var iiAddress: SocketAddress = SocketAddress(),
    public var iiBroadcastAddress: SocketAddress = SocketAddress(),
    public var iiNetmask: SocketAddress = SocketAddress(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InterfaceInfoEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InterfaceInfoEx> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): InterfaceInfoEx =
                    InterfaceInfoEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (SocketAddress.typeLayout()).readNative(addr + 8L),
                        (SocketAddress.typeLayout()).readNative(addr + 24L),
                        (SocketAddress.typeLayout()).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: InterfaceInfoEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.iiFlags)
                    (SocketAddress.typeLayout()).writeNative(addr + 8L, value.iiAddress)
                    (SocketAddress.typeLayout()).writeNative(addr + 24L, value.iiBroadcastAddress)
                    (SocketAddress.typeLayout()).writeNative(addr + 40L, value.iiNetmask)
                }
            }
    }
}

public data class InAddr(
    public var sUn: InAddr0 = InAddr0(),
)

public data class InAddr0(
    public var sUnB: InAddr00 = InAddr00(),
    public var sUnW: InAddr01 = InAddr01(),
    public var sAddr: UInt = 0u,
)

public data class InAddr00(
    public var sB1: UByte = 0u,
    public var sB2: UByte = 0u,
    public var sB3: UByte = 0u,
    public var sB4: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InAddr00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InAddr00> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): InAddr00 =
                    InAddr00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: InAddr00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.sB1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.sB2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.sB3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.sB4)
                }
            }
    }
}

public data class InAddr01(
    public var sW1: UShort = 0u,
    public var sW2: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InAddr01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InAddr01> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): InAddr01 =
                    InAddr01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: InAddr01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sW1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sW2)
                }
            }
    }
}

public data class InPktinfo(
    public var ipiAddr: InAddr = InAddr(),
    public var ipiIfindex: UInt = 0u,
)

public data class InPktinfoEx(
    public var pktInfo: InPktinfo = InPktinfo(),
    public var scopeId: ScopeId = ScopeId(),
)

public data class InRecverr(
    public var protocol: Ipproto = 0,
    public var info: UInt = 0u,
    public var type: UByte = 0u,
    public var code: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InRecverr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InRecverr> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): InRecverr =
                    InRecverr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: InRecverr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.protocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.info)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.code)
                }
            }
    }
}

public data class IptlsMetadata(
    public var sequenceNumber: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IptlsMetadata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IptlsMetadata> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): IptlsMetadata =
                    IptlsMetadata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IptlsMetadata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.sequenceNumber)
                }
            }
    }
}

public data class Ipv4Header(
    public var anonymous1: Ipv4Header0 = Ipv4Header0(),
    public var anonymous2: Ipv4Header1 = Ipv4Header1(),
    public var totalLength: UShort = 0u,
    public var identification: UShort = 0u,
    public var anonymous3: Ipv4Header2 = Ipv4Header2(),
    public var timeToLive: UByte = 0u,
    public var protocol: UByte = 0u,
    public var headerChecksum: UShort = 0u,
    public var sourceAddress: InAddr = InAddr(),
    public var destinationAddress: InAddr = InAddr(),
)

public data class Ipv4Header0(
    public var versionAndHeaderLength: UByte = 0u,
    public var anonymous: Ipv4Header00 = Ipv4Header00(),
)

public data class Ipv4Header00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv4Header00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv4Header00> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Ipv4Header00 =
                    Ipv4Header00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ipv4Header00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Ipv4Header1(
    public var typeOfServiceAndEcnField: UByte = 0u,
    public var anonymous: Ipv4Header10 = Ipv4Header10(),
)

public data class Ipv4Header10(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv4Header10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv4Header10> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Ipv4Header10 =
                    Ipv4Header10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ipv4Header10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Ipv4Header2(
    public var flagsAndOffset: UShort = 0u,
    public var anonymous: Ipv4Header20 = Ipv4Header20(),
)

public data class Ipv4Header20(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv4Header20> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv4Header20> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Ipv4Header20 =
                    Ipv4Header20(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ipv4Header20) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Ipv4OptionHeader(
    public var anonymous: Ipv4OptionHeader0 = Ipv4OptionHeader0(),
    public var optionLength: UByte = 0u,
)

public data class Ipv4OptionHeader0(
    public var optionType: UByte = 0u,
    public var anonymous: Ipv4OptionHeader00 = Ipv4OptionHeader00(),
)

public data class Ipv4OptionHeader00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv4OptionHeader00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv4OptionHeader00> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Ipv4OptionHeader00 =
                    Ipv4OptionHeader00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ipv4OptionHeader00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Ipv4RoutingHeader(
    public var optionHeader: Ipv4OptionHeader = Ipv4OptionHeader(),
    public var pointer: UByte = 0u,
)

public data class Ipv4TimestampOption(
    public var optionHeader: Ipv4OptionHeader = Ipv4OptionHeader(),
    public var pointer: UByte = 0u,
    public var anonymous: Ipv4TimestampOption0 = Ipv4TimestampOption0(),
)

public data class Ipv4TimestampOption0(
    public var flagsOverflow: UByte = 0u,
    public var anonymous: Ipv4TimestampOption00 = Ipv4TimestampOption00(),
)

public data class Ipv4TimestampOption00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv4TimestampOption00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv4TimestampOption00> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Ipv4TimestampOption00 =
                    Ipv4TimestampOption00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ipv4TimestampOption00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Ipv6ExtensionHeader(
    public var nextHeader: UByte = 0u,
    public var length: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6ExtensionHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6ExtensionHeader> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Ipv6ExtensionHeader =
                    Ipv6ExtensionHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: Ipv6ExtensionHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.nextHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.length)
                }
            }
    }
}

public data class Ipv6FragmentHeader(
    public var nextHeader: UByte = 0u,
    public var reserved: UByte = 0u,
    public var anonymous: Ipv6FragmentHeader0 = Ipv6FragmentHeader0(),
    public var id: UInt = 0u,
)

public data class Ipv6FragmentHeader0(
    public var anonymous: Ipv6FragmentHeader00 = Ipv6FragmentHeader00(),
    public var offsetAndFlags: UShort = 0u,
)

public data class Ipv6FragmentHeader00(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6FragmentHeader00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6FragmentHeader00> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Ipv6FragmentHeader00 =
                    Ipv6FragmentHeader00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ipv6FragmentHeader00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Ipv6Header(
    public var anonymous: Ipv6Header0 = Ipv6Header0(),
    public var payloadLength: UShort = 0u,
    public var nextHeader: UByte = 0u,
    public var hopLimit: UByte = 0u,
    public var sourceAddress: In6Addr = In6Addr(),
    public var destinationAddress: In6Addr = In6Addr(),
)

public data class Ipv6Header0(
    public var versionClassFlow: UInt = 0u,
    public var anonymous: Ipv6Header00 = Ipv6Header00(),
)

public data class Ipv6Header00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6Header00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6Header00> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ipv6Header00 =
                    Ipv6Header00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ipv6Header00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Ipv6Mreq(
    public var ipv6mrMultiaddr: In6Addr = In6Addr(),
    public var ipv6mrInterface: UInt = 0u,
)

public data class Ipv6NeighborAdvertisementFlags(
    public var anonymous: Ipv6NeighborAdvertisementFlags0 = Ipv6NeighborAdvertisementFlags0(),
    public var value: UInt = 0u,
)

public data class Ipv6NeighborAdvertisementFlags0(
    public var bitfield: UByte = 0u,
    public var reserved2: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ipv6NeighborAdvertisementFlags0) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6NeighborAdvertisementFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6NeighborAdvertisementFlags0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Ipv6NeighborAdvertisementFlags0 =
                    Ipv6NeighborAdvertisementFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: Ipv6NeighborAdvertisementFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 1L, value.reserved2)
                }
            }
    }
}

public data class Ipv6OptionHeader(
    public var type: UByte = 0u,
    public var dataLength: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6OptionHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6OptionHeader> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Ipv6OptionHeader =
                    Ipv6OptionHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: Ipv6OptionHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.dataLength)
                }
            }
    }
}

public data class Ipv6OptionJumbogram(
    public var header: Ipv6OptionHeader = Ipv6OptionHeader(),
    public var jumbogramLength: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ipv6OptionJumbogram) return false
        if (this.header != other.header) return false
        if (!this.jumbogramLength.contentEquals(other.jumbogramLength)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.jumbogramLength.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6OptionJumbogram> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6OptionJumbogram> {
                override val sizeBytes: Long = 6L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Ipv6OptionJumbogram =
                    Ipv6OptionJumbogram(
                        (Ipv6OptionHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Ipv6OptionJumbogram) {
                    (Ipv6OptionHeader.typeLayout()).writeNative(addr, value.header)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 2L, value.jumbogramLength)
                }
            }
    }
}

public data class Ipv6OptionRouterAlert(
    public var header: Ipv6OptionHeader = Ipv6OptionHeader(),
    public var value: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ipv6OptionRouterAlert) return false
        if (this.header != other.header) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.value.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6OptionRouterAlert> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6OptionRouterAlert> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Ipv6OptionRouterAlert =
                    Ipv6OptionRouterAlert(
                        (Ipv6OptionHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Ipv6OptionRouterAlert) {
                    (Ipv6OptionHeader.typeLayout()).writeNative(addr, value.header)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 2L, value.value)
                }
            }
    }
}

public data class Ipv6RouterAdvertisementFlags(
    public var anonymous: Ipv6RouterAdvertisementFlags0 = Ipv6RouterAdvertisementFlags0(),
    public var value: UByte = 0u,
)

public data class Ipv6RouterAdvertisementFlags0(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6RouterAdvertisementFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6RouterAdvertisementFlags0> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Ipv6RouterAdvertisementFlags0 =
                    Ipv6RouterAdvertisementFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Ipv6RouterAdvertisementFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Ipv6RoutingHeader(
    public var nextHeader: UByte = 0u,
    public var length: UByte = 0u,
    public var routingType: UByte = 0u,
    public var segmentsLeft: UByte = 0u,
    public var reserved: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ipv6RoutingHeader) return false
        if (this.nextHeader != other.nextHeader) return false
        if (this.length != other.length) return false
        if (this.routingType != other.routingType) return false
        if (this.segmentsLeft != other.segmentsLeft) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextHeader.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.routingType.hashCode()
        result = 31 * result + this.segmentsLeft.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6RoutingHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6RoutingHeader> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Ipv6RoutingHeader =
                    Ipv6RoutingHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ipv6RoutingHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.nextHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.routingType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.segmentsLeft)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 4L, value.reserved)
                }
            }
    }
}

public data class IpxAddressData(
    public var adapternum: Int = 0,
    public var netnum: UByteArray = UByteArray(4),
    public var nodenum: UByteArray = UByteArray(6),
    public var wan: Boolean = false,
    public var status: Boolean = false,
    public var maxpkt: Int = 0,
    public var linkspeed: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpxAddressData) return false
        if (this.adapternum != other.adapternum) return false
        if (!this.netnum.contentEquals(other.netnum)) return false
        if (!this.nodenum.contentEquals(other.nodenum)) return false
        if (this.wan != other.wan) return false
        if (this.status != other.status) return false
        if (this.maxpkt != other.maxpkt) return false
        if (this.linkspeed != other.linkspeed) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.adapternum.hashCode()
        result = 31 * result + this.netnum.contentHashCode()
        result = 31 * result + this.nodenum.contentHashCode()
        result = 31 * result + this.wan.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.maxpkt.hashCode()
        result = 31 * result + this.linkspeed.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpxAddressData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpxAddressData> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IpxAddressData =
                    IpxAddressData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 15L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: IpxAddressData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.adapternum)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 4L, value.netnum)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 8L, value.nodenum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 14L, value.wan)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 15L, value.status)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.maxpkt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.linkspeed)
                }
            }
    }
}

public data class IpxNetnumData(
    public var netnum: UByteArray = UByteArray(4),
    public var hopcount: UShort = 0u,
    public var netdelay: UShort = 0u,
    public var cardnum: Int = 0,
    public var router: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpxNetnumData) return false
        if (!this.netnum.contentEquals(other.netnum)) return false
        if (this.hopcount != other.hopcount) return false
        if (this.netdelay != other.netdelay) return false
        if (this.cardnum != other.cardnum) return false
        if (!this.router.contentEquals(other.router)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.netnum.contentHashCode()
        result = 31 * result + this.hopcount.hashCode()
        result = 31 * result + this.netdelay.hashCode()
        result = 31 * result + this.cardnum.hashCode()
        result = 31 * result + this.router.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpxNetnumData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpxNetnumData> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IpxNetnumData =
                    IpxNetnumData(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: IpxNetnumData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr, value.netnum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.hopcount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.netdelay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.cardnum)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 12L, value.router)
                }
            }
    }
}

public class IpxSpxconnstatusData(
    public var connectionState: UByte = 0u,
    public var watchDogActive: UByte = 0u,
    public var localConnectionId: UShort = 0u,
    public var remoteConnectionId: UShort = 0u,
    public var localSequenceNumber: UShort = 0u,
    public var localAckNumber: UShort = 0u,
    public var localAllocNumber: UShort = 0u,
    public var remoteAckNumber: UShort = 0u,
    public var remoteAllocNumber: UShort = 0u,
    public var localSocket: UShort = 0u,
    public var immediateAddress: UByteArray = UByteArray(6),
    public var remoteNetwork: UByteArray = UByteArray(4),
    public var remoteNode: UByteArray = UByteArray(6),
    public var remoteSocket: UShort = 0u,
    public var retransmissionCount: UShort = 0u,
    public var estimatedRoundTripDelay: UShort = 0u,
    public var retransmittedPackets: UShort = 0u,
    public var suppressedPacket: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpxSpxconnstatusData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpxSpxconnstatusData> {
                override val sizeBytes: Long = 44L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): IpxSpxconnstatusData =
                    IpxSpxconnstatusData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 18L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 34L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 38L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 42L),
                    )
                override fun writeNative(addr: Long, value: IpxSpxconnstatusData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.connectionState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.watchDogActive)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.localConnectionId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.remoteConnectionId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.localSequenceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.localAckNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.localAllocNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.remoteAckNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.remoteAllocNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.localSocket)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 18L, value.immediateAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 24L, value.remoteNetwork)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 28L, value.remoteNode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 34L, value.remoteSocket)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 36L, value.retransmissionCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 38L, value.estimatedRoundTripDelay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 40L, value.retransmittedPackets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 42L, value.suppressedPacket)
                }
            }
    }
}

public data class IpMreq(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrInterface: InAddr = InAddr(),
)

public data class IpMreqSource(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrSourceaddr: InAddr = InAddr(),
    public var imrInterface: InAddr = InAddr(),
)

public data class IpMsfilter(
    public var imsfMultiaddr: InAddr = InAddr(),
    public var imsfInterface: InAddr = InAddr(),
    public var imsfFmode: MulticastModeType = 0,
    public var imsfNumsrc: UInt = 0u,
    public var imsfSlist: List<InAddr> = List(1) { InAddr() },
)

public data class Linger(
    public var lOnoff: UShort = 0u,
    public var lLinger: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linger> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linger> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Linger =
                    Linger(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Linger) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.lOnoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.lLinger)
                }
            }
    }
}

public data class LmIrparms(
    public var nTXDataBytes: UInt = 0u,
    public var nRXDataBytes: UInt = 0u,
    public var nBaudRate: UInt = 0u,
    public var thresholdTime: UInt = 0u,
    public var discTime: UInt = 0u,
    public var nMSLinkTurn: UShort = 0u,
    public var nTXPackets: UByte = 0u,
    public var nRXPackets: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LmIrparms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LmIrparms> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): LmIrparms =
                    LmIrparms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 23L),
                    )
                override fun writeNative(addr: Long, value: LmIrparms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nTXDataBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nRXDataBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nBaudRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.thresholdTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.discTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.nMSLinkTurn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 22L, value.nTXPackets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 23L, value.nRXPackets)
                }
            }
    }
}

public data class Mldv2QueryHeader(
    public var icmpHeader: IcmpHeader = IcmpHeader(),
    public var anonymous1: Mldv2QueryHeader0 = Mldv2QueryHeader0(),
    public var reserved: UShort = 0u,
    public var multicastAddress: In6Addr = In6Addr(),
    public var bitfield: UByte = 0u,
    public var anonymous2: Mldv2QueryHeader1 = Mldv2QueryHeader1(),
    public var sourceCount: UShort = 0u,
)

public data class Mldv2QueryHeader0(
    public var maxRespCode: UShort = 0u,
    public var anonymous: Mldv2QueryHeader00 = Mldv2QueryHeader00(),
)

public data class Mldv2QueryHeader00(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mldv2QueryHeader00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mldv2QueryHeader00> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Mldv2QueryHeader00 =
                    Mldv2QueryHeader00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Mldv2QueryHeader00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Mldv2QueryHeader1(
    public var queriersQueryInterfaceCode: UByte = 0u,
    public var anonymous: Mldv2QueryHeader10 = Mldv2QueryHeader10(),
)

public data class Mldv2QueryHeader10(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mldv2QueryHeader10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mldv2QueryHeader10> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Mldv2QueryHeader10 =
                    Mldv2QueryHeader10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Mldv2QueryHeader10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class Mldv2ReportHeader(
    public var icmpHeader: IcmpHeader = IcmpHeader(),
    public var reserved: UShort = 0u,
    public var recordCount: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mldv2ReportHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mldv2ReportHeader> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Mldv2ReportHeader =
                    Mldv2ReportHeader(
                        (IcmpHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Mldv2ReportHeader) {
                    (IcmpHeader.typeLayout()).writeNative(addr, value.icmpHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.recordCount)
                }
            }
    }
}

public data class Mldv2ReportRecordHeader(
    public var type: UByte = 0u,
    public var auxillaryDataLength: UByte = 0u,
    public var sourceCount: UShort = 0u,
    public var multicastAddress: In6Addr = In6Addr(),
)

public data class MldHeader(
    public var icmpHeader: IcmpHeader = IcmpHeader(),
    public var maxRespTime: UShort = 0u,
    public var reserved: UShort = 0u,
    public var multicastAddress: In6Addr = In6Addr(),
)

public data class NapiDomainDescriptionBlob(
    public var authLevel: UInt = 0u,
    public var cchDomainName: UInt = 0u,
    public var offsetNextDomainDescription: UInt = 0u,
    public var offsetThisDomainName: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NapiDomainDescriptionBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NapiDomainDescriptionBlob> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NapiDomainDescriptionBlob =
                    NapiDomainDescriptionBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NapiDomainDescriptionBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.authLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cchDomainName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.offsetNextDomainDescription)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.offsetThisDomainName)
                }
            }
    }
}

public data class NapiProviderInstallationBlob(
    public var dwVersion: UInt = 0u,
    public var dwProviderType: UInt = 0u,
    public var fSupportsWildCard: UInt = 0u,
    public var cDomains: UInt = 0u,
    public var offsetFirstDomain: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NapiProviderInstallationBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NapiProviderInstallationBlob> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NapiProviderInstallationBlob =
                    NapiProviderInstallationBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NapiProviderInstallationBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwProviderType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fSupportsWildCard)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cDomains)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.offsetFirstDomain)
                }
            }
    }
}

public data class NdNeighborAdvertHeader(
    public var ndNaHdr: IcmpMessage = IcmpMessage(),
    public var ndNaTarget: In6Addr = In6Addr(),
)

public data class NdNeighborSolicitHeader(
    public var ndNsHdr: IcmpMessage = IcmpMessage(),
    public var ndNsTarget: In6Addr = In6Addr(),
)

public data class NdOptionDnssl(
    public var ndOptDnsslType: UByte = 0u,
    public var ndOptDnsslLen: UByte = 0u,
    public var ndOptDnsslReserved: UShort = 0u,
    public var ndOptDnsslLifetime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdOptionDnssl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdOptionDnssl> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdOptionDnssl =
                    NdOptionDnssl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NdOptionDnssl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.ndOptDnsslType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.ndOptDnsslLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.ndOptDnsslReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ndOptDnsslLifetime)
                }
            }
    }
}

public data class NdOptionHdr(
    public var ndOptType: UByte = 0u,
    public var ndOptLen: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdOptionHdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdOptionHdr> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NdOptionHdr =
                    NdOptionHdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: NdOptionHdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.ndOptType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.ndOptLen)
                }
            }
    }
}

public data class NdOptionMtu(
    public var ndOptMtuType: UByte = 0u,
    public var ndOptMtuLen: UByte = 0u,
    public var ndOptMtuReserved: UShort = 0u,
    public var ndOptMtuMtu: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdOptionMtu> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdOptionMtu> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdOptionMtu =
                    NdOptionMtu(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NdOptionMtu) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.ndOptMtuType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.ndOptMtuLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.ndOptMtuReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ndOptMtuMtu)
                }
            }
    }
}

public data class NdOptionPrefixInfo(
    public var ndOptPiType: UByte = 0u,
    public var ndOptPiLen: UByte = 0u,
    public var ndOptPiPrefixLen: UByte = 0u,
    public var anonymous1: NdOptionPrefixInfo0 = NdOptionPrefixInfo0(),
    public var ndOptPiValidTime: UInt = 0u,
    public var ndOptPiPreferredTime: UInt = 0u,
    public var anonymous2: NdOptionPrefixInfo1 = NdOptionPrefixInfo1(),
    public var ndOptPiPrefix: In6Addr = In6Addr(),
)

public data class NdOptionPrefixInfo0(
    public var ndOptPiFlagsReserved: UByte = 0u,
    public var flags: NdOptionPrefixInfo00 = NdOptionPrefixInfo00(),
)

public data class NdOptionPrefixInfo00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdOptionPrefixInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdOptionPrefixInfo00> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NdOptionPrefixInfo00 =
                    NdOptionPrefixInfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NdOptionPrefixInfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NdOptionPrefixInfo1(
    public var ndOptPiReserved2: UInt = 0u,
    public var anonymous: NdOptionPrefixInfo10 = NdOptionPrefixInfo10(),
)

public data class NdOptionPrefixInfo10(
    public var ndOptPiReserved3: UByteArray = UByteArray(3),
    public var ndOptPiSitePrefixLen: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NdOptionPrefixInfo10) return false
        if (!this.ndOptPiReserved3.contentEquals(other.ndOptPiReserved3)) return false
        if (this.ndOptPiSitePrefixLen != other.ndOptPiSitePrefixLen) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ndOptPiReserved3.contentHashCode()
        result = 31 * result + this.ndOptPiSitePrefixLen.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdOptionPrefixInfo10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdOptionPrefixInfo10> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NdOptionPrefixInfo10 =
                    NdOptionPrefixInfo10(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: NdOptionPrefixInfo10) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr, value.ndOptPiReserved3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.ndOptPiSitePrefixLen)
                }
            }
    }
}

public data class NdOptionRdnss(
    public var ndOptRdnssType: UByte = 0u,
    public var ndOptRdnssLen: UByte = 0u,
    public var ndOptRdnssReserved: UShort = 0u,
    public var ndOptRdnssLifetime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdOptionRdnss> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdOptionRdnss> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdOptionRdnss =
                    NdOptionRdnss(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NdOptionRdnss) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.ndOptRdnssType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.ndOptRdnssLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.ndOptRdnssReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ndOptRdnssLifetime)
                }
            }
    }
}

public data class NdOptionRdHdr(
    public var ndOptRhType: UByte = 0u,
    public var ndOptRhLen: UByte = 0u,
    public var ndOptRhReserved1: UShort = 0u,
    public var ndOptRhReserved2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdOptionRdHdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdOptionRdHdr> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NdOptionRdHdr =
                    NdOptionRdHdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NdOptionRdHdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.ndOptRhType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.ndOptRhLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.ndOptRhReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ndOptRhReserved2)
                }
            }
    }
}

public data class NdOptionRouteInfo(
    public var ndOptRiType: UByte = 0u,
    public var ndOptRiLen: UByte = 0u,
    public var ndOptRiPrefixLen: UByte = 0u,
    public var anonymous: NdOptionRouteInfo0 = NdOptionRouteInfo0(),
    public var ndOptRiRouteLifetime: UInt = 0u,
    public var ndOptRiPrefix: In6Addr = In6Addr(),
)

public data class NdOptionRouteInfo0(
    public var ndOptRiFlagsReserved: UByte = 0u,
    public var flags: NdOptionRouteInfo00 = NdOptionRouteInfo00(),
)

public data class NdOptionRouteInfo00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdOptionRouteInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NdOptionRouteInfo00> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NdOptionRouteInfo00 =
                    NdOptionRouteInfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NdOptionRouteInfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NdRedirectHeader(
    public var ndRdHdr: IcmpMessage = IcmpMessage(),
    public var ndRdTarget: In6Addr = In6Addr(),
    public var ndRdDst: In6Addr = In6Addr(),
)

public data class NdRouterAdvertHeader(
    public var ndRaHdr: IcmpMessage = IcmpMessage(),
    public var ndRaReachable: UInt = 0u,
    public var ndRaRetransmit: UInt = 0u,
)

public data class NdRouterSolicitHeader(
    public var ndRsHdr: IcmpMessage = IcmpMessage(),
)

public class Netresource2a internal constructor(
    public var dwScope: UInt,
    public var dwType: UInt,
    public var dwUsage: UInt,
    public var dwDisplayType: UInt,
    lpLocalNameCtorArg: Pstr,
    lpRemoteNameCtorArg: Pstr,
    lpCommentCtorArg: Pstr,
    public var nsInfo: NsInfoa,
    public var serviceType: Guid,
    public var dwProtocols: UInt,
    lpiProtocolsCtorArg: MutPtr<Int>,
) {
    public var lpLocalName: Pstr = lpLocalNameCtorArg
        internal set

    public var lpRemoteName: Pstr = lpRemoteNameCtorArg
        internal set

    public var lpComment: Pstr = lpCommentCtorArg
        internal set

    public var lpiProtocols: MutPtr<Int> = lpiProtocolsCtorArg
        internal set

    public constructor() : this(
        dwScope = 0u,
        dwType = 0u,
        dwUsage = 0u,
        dwDisplayType = 0u,
        lpLocalNameCtorArg = MutPtr(0L),
        lpRemoteNameCtorArg = MutPtr(0L),
        lpCommentCtorArg = MutPtr(0L),
        nsInfo = NsInfoa(),
        serviceType = Guid(),
        dwProtocols = 0u,
        lpiProtocolsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwScope

    public operator fun component2(): UInt = this.dwType

    public operator fun component3(): UInt = this.dwUsage

    public operator fun component4(): UInt = this.dwDisplayType

    public operator fun component5(): Pstr = this.lpLocalName

    public operator fun component6(): Pstr = this.lpRemoteName

    public operator fun component7(): Pstr = this.lpComment

    public operator fun component8(): NsInfoa = this.nsInfo

    public operator fun component9(): Guid = this.serviceType

    public operator fun component10(): UInt = this.dwProtocols

    public operator fun component11(): MutPtr<Int> = this.lpiProtocols

    public fun copy(dwScope: UInt = this.dwScope, dwType: UInt = this.dwType, dwUsage: UInt = this.dwUsage, dwDisplayType: UInt = this.dwDisplayType, lpLocalName: Pstr = this.lpLocalName, lpRemoteName: Pstr = this.lpRemoteName, lpComment: Pstr = this.lpComment, nsInfo: NsInfoa = this.nsInfo, serviceType: Guid = this.serviceType, dwProtocols: UInt = this.dwProtocols, lpiProtocols: MutPtr<Int> = this.lpiProtocols): Netresource2a = Netresource2a(dwScope = dwScope, dwType = dwType, dwUsage = dwUsage, dwDisplayType = dwDisplayType, lpLocalNameCtorArg = lpLocalName, lpRemoteNameCtorArg = lpRemoteName, lpCommentCtorArg = lpComment, nsInfo = nsInfo, serviceType = serviceType, dwProtocols = dwProtocols, lpiProtocolsCtorArg = lpiProtocols)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Netresource2a) return false
        if (this.dwScope != other.dwScope) return false
        if (this.dwType != other.dwType) return false
        if (this.dwUsage != other.dwUsage) return false
        if (this.dwDisplayType != other.dwDisplayType) return false
        if (this.lpLocalName != other.lpLocalName) return false
        if (this.lpRemoteName != other.lpRemoteName) return false
        if (this.lpComment != other.lpComment) return false
        if (this.nsInfo != other.nsInfo) return false
        if (this.serviceType != other.serviceType) return false
        if (this.dwProtocols != other.dwProtocols) return false
        if (this.lpiProtocols != other.lpiProtocols) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwScope.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.dwUsage.hashCode()
        result = 31 * result + this.dwDisplayType.hashCode()
        result = 31 * result + this.lpLocalName.hashCode()
        result = 31 * result + this.lpRemoteName.hashCode()
        result = 31 * result + this.lpComment.hashCode()
        result = 31 * result + this.nsInfo.hashCode()
        result = 31 * result + this.serviceType.hashCode()
        result = 31 * result + this.dwProtocols.hashCode()
        result = 31 * result + this.lpiProtocols.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwScope: UInt = 0u,
            dwType: UInt = 0u,
            dwUsage: UInt = 0u,
            dwDisplayType: UInt = 0u,
            lpLocalName: Pstr = MutPtr(0L),
            lpRemoteName: Pstr = MutPtr(0L),
            lpComment: Pstr = MutPtr(0L),
            nsInfo: NsInfoa = NsInfoa(),
            serviceType: Guid = Guid(),
            dwProtocols: UInt = 0u,
            lpiProtocols: MutPtr<Int> = MutPtr(0L),
        ): Netresource2a =
            Netresource2a(
                dwScope = dwScope,
                dwType = dwType,
                dwUsage = dwUsage,
                dwDisplayType = dwDisplayType,
                lpLocalNameCtorArg = lpLocalName,
                lpRemoteNameCtorArg = lpRemoteName,
                lpCommentCtorArg = lpComment,
                nsInfo = nsInfo,
                serviceType = serviceType,
                dwProtocols = dwProtocols,
                lpiProtocolsCtorArg = lpiProtocols,
            )
    }
}

public class Netresource2w internal constructor(
    public var dwScope: UInt,
    public var dwType: UInt,
    public var dwUsage: UInt,
    public var dwDisplayType: UInt,
    lpLocalNameCtorArg: Pwstr,
    lpRemoteNameCtorArg: Pwstr,
    lpCommentCtorArg: Pwstr,
    public var nsInfo: NsInfoa,
    public var serviceType: Guid,
    public var dwProtocols: UInt,
    lpiProtocolsCtorArg: MutPtr<Int>,
) {
    public var lpLocalName: Pwstr = lpLocalNameCtorArg
        internal set

    public var lpRemoteName: Pwstr = lpRemoteNameCtorArg
        internal set

    public var lpComment: Pwstr = lpCommentCtorArg
        internal set

    public var lpiProtocols: MutPtr<Int> = lpiProtocolsCtorArg
        internal set

    public constructor() : this(
        dwScope = 0u,
        dwType = 0u,
        dwUsage = 0u,
        dwDisplayType = 0u,
        lpLocalNameCtorArg = MutPtr(0L),
        lpRemoteNameCtorArg = MutPtr(0L),
        lpCommentCtorArg = MutPtr(0L),
        nsInfo = NsInfoa(),
        serviceType = Guid(),
        dwProtocols = 0u,
        lpiProtocolsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwScope

    public operator fun component2(): UInt = this.dwType

    public operator fun component3(): UInt = this.dwUsage

    public operator fun component4(): UInt = this.dwDisplayType

    public operator fun component5(): Pwstr = this.lpLocalName

    public operator fun component6(): Pwstr = this.lpRemoteName

    public operator fun component7(): Pwstr = this.lpComment

    public operator fun component8(): NsInfoa = this.nsInfo

    public operator fun component9(): Guid = this.serviceType

    public operator fun component10(): UInt = this.dwProtocols

    public operator fun component11(): MutPtr<Int> = this.lpiProtocols

    public fun copy(dwScope: UInt = this.dwScope, dwType: UInt = this.dwType, dwUsage: UInt = this.dwUsage, dwDisplayType: UInt = this.dwDisplayType, lpLocalName: Pwstr = this.lpLocalName, lpRemoteName: Pwstr = this.lpRemoteName, lpComment: Pwstr = this.lpComment, nsInfo: NsInfoa = this.nsInfo, serviceType: Guid = this.serviceType, dwProtocols: UInt = this.dwProtocols, lpiProtocols: MutPtr<Int> = this.lpiProtocols): Netresource2w = Netresource2w(dwScope = dwScope, dwType = dwType, dwUsage = dwUsage, dwDisplayType = dwDisplayType, lpLocalNameCtorArg = lpLocalName, lpRemoteNameCtorArg = lpRemoteName, lpCommentCtorArg = lpComment, nsInfo = nsInfo, serviceType = serviceType, dwProtocols = dwProtocols, lpiProtocolsCtorArg = lpiProtocols)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Netresource2w) return false
        if (this.dwScope != other.dwScope) return false
        if (this.dwType != other.dwType) return false
        if (this.dwUsage != other.dwUsage) return false
        if (this.dwDisplayType != other.dwDisplayType) return false
        if (this.lpLocalName != other.lpLocalName) return false
        if (this.lpRemoteName != other.lpRemoteName) return false
        if (this.lpComment != other.lpComment) return false
        if (this.nsInfo != other.nsInfo) return false
        if (this.serviceType != other.serviceType) return false
        if (this.dwProtocols != other.dwProtocols) return false
        if (this.lpiProtocols != other.lpiProtocols) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwScope.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.dwUsage.hashCode()
        result = 31 * result + this.dwDisplayType.hashCode()
        result = 31 * result + this.lpLocalName.hashCode()
        result = 31 * result + this.lpRemoteName.hashCode()
        result = 31 * result + this.lpComment.hashCode()
        result = 31 * result + this.nsInfo.hashCode()
        result = 31 * result + this.serviceType.hashCode()
        result = 31 * result + this.dwProtocols.hashCode()
        result = 31 * result + this.lpiProtocols.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwScope: UInt = 0u,
            dwType: UInt = 0u,
            dwUsage: UInt = 0u,
            dwDisplayType: UInt = 0u,
            lpLocalName: Pwstr = MutPtr(0L),
            lpRemoteName: Pwstr = MutPtr(0L),
            lpComment: Pwstr = MutPtr(0L),
            nsInfo: NsInfoa = NsInfoa(),
            serviceType: Guid = Guid(),
            dwProtocols: UInt = 0u,
            lpiProtocols: MutPtr<Int> = MutPtr(0L),
        ): Netresource2w =
            Netresource2w(
                dwScope = dwScope,
                dwType = dwType,
                dwUsage = dwUsage,
                dwDisplayType = dwDisplayType,
                lpLocalNameCtorArg = lpLocalName,
                lpRemoteNameCtorArg = lpRemoteName,
                lpCommentCtorArg = lpComment,
                nsInfo = nsInfo,
                serviceType = serviceType,
                dwProtocols = dwProtocols,
                lpiProtocolsCtorArg = lpiProtocols,
            )
    }
}

public data class NlaBlob(
    public var header: NlaBlob0 = NlaBlob0(),
    public var data: NlaBlob1 = NlaBlob1(),
)

public data class NlaBlob1(
    public var rawData: ByteArray = ByteArray(1),
    public var interfaceData: NlaBlob10 = NlaBlob10(),
    public var locationData: NlaBlob11 = NlaBlob11(),
    public var connectivity: NlaBlob12 = NlaBlob12(),
    public var ics: NlaBlob13 = NlaBlob13(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NlaBlob1) return false
        if (!this.rawData.contentEquals(other.rawData)) return false
        if (this.interfaceData != other.interfaceData) return false
        if (this.locationData != other.locationData) return false
        if (this.connectivity != other.connectivity) return false
        if (this.ics != other.ics) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rawData.contentHashCode()
        result = 31 * result + this.interfaceData.hashCode()
        result = 31 * result + this.locationData.hashCode()
        result = 31 * result + this.connectivity.hashCode()
        result = 31 * result + this.ics.hashCode()
        return result
    }
}

public data class NlaBlob13(
    public var remote: NlaBlob130 = NlaBlob130(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlaBlob13> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlaBlob13> {
                override val sizeBytes: Long = 1036L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NlaBlob13 =
                    NlaBlob13(
                        (NlaBlob130.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NlaBlob13) {
                    (NlaBlob130.typeLayout()).writeNative(addr, value.remote)
                }
            }
    }
}

public data class NlaBlob130(
    public var speed: UInt = 0u,
    public var type: UInt = 0u,
    public var state: UInt = 0u,
    public var machineName: UShortArray = UShortArray(256),
    public var sharedAdapterName: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NlaBlob130) return false
        if (this.speed != other.speed) return false
        if (this.type != other.type) return false
        if (this.state != other.state) return false
        if (!this.machineName.contentEquals(other.machineName)) return false
        if (!this.sharedAdapterName.contentEquals(other.sharedAdapterName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.speed.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.machineName.contentHashCode()
        result = 31 * result + this.sharedAdapterName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlaBlob130> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlaBlob130> {
                override val sizeBytes: Long = 1036L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NlaBlob130 =
                    NlaBlob130(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 524L),
                    )
                override fun writeNative(addr: Long, value: NlaBlob130) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.speed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.state)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 12L, value.machineName)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 524L, value.sharedAdapterName)
                }
            }
    }
}

public data class NlaBlob12(
    public var type: NlaConnectivityType = 0,
    public var internet: NlaInternet = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlaBlob12> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlaBlob12> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NlaBlob12 =
                    NlaBlob12(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: NlaBlob12) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.internet)
                }
            }
    }
}

public data class NlaBlob10(
    public var dwType: UInt = 0u,
    public var dwSpeed: UInt = 0u,
    public var adapterName: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NlaBlob10) return false
        if (this.dwType != other.dwType) return false
        if (this.dwSpeed != other.dwSpeed) return false
        if (!this.adapterName.contentEquals(other.adapterName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwType.hashCode()
        result = 31 * result + this.dwSpeed.hashCode()
        result = 31 * result + this.adapterName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlaBlob10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlaBlob10> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NlaBlob10 =
                    NlaBlob10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NlaBlob10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSpeed)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                    ).writeNative(addr + 8L, value.adapterName)
                }
            }
    }
}

public data class NlaBlob11(
    public var information: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NlaBlob11) return false
        if (!this.information.contentEquals(other.information)) return false
        return true
    }

    override fun hashCode(): Int = this.information.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlaBlob11> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlaBlob11> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NlaBlob11 =
                    NlaBlob11(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NlaBlob11) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())
                    ).writeNative(addr, value.information)
                }
            }
    }
}

public data class NlaBlob0(
    public var type: NlaBlobDataType = 0,
    public var dwSize: UInt = 0u,
    public var nextOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlaBlob0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlaBlob0> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NlaBlob0 =
                    NlaBlob0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NlaBlob0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nextOffset)
                }
            }
    }
}

public data class NlBandwidthInformation(
    public var bandwidth: ULong = 0uL,
    public var instability: ULong = 0uL,
    public var bandwidthPeaked: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlBandwidthInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlBandwidthInformation> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NlBandwidthInformation =
                    NlBandwidthInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NlBandwidthInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.instability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 16L, value.bandwidthPeaked)
                }
            }
    }
}

public data class NlInterfaceOffloadRod(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlInterfaceOffloadRod> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlInterfaceOffloadRod> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): NlInterfaceOffloadRod =
                    NlInterfaceOffloadRod(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NlInterfaceOffloadRod) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class NlNetworkConnectivityHint(
    public var connectivityLevel: NlNetworkConnectivityLevelHint = 0,
    public var connectivityCost: NlNetworkConnectivityCostHint = 0,
    public var approachingDataLimit: Boolean = false,
    public var overDataLimit: Boolean = false,
    public var roaming: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlNetworkConnectivityHint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlNetworkConnectivityHint> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NlNetworkConnectivityHint =
                    NlNetworkConnectivityHint(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: NlNetworkConnectivityHint) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.connectivityLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.connectivityCost)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.approachingDataLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 9L, value.overDataLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 10L, value.roaming)
                }
            }
    }
}

public data class NlPathBandwidthRod(
    public var bandwidth: ULong = 0uL,
    public var instability: ULong = 0uL,
    public var bandwidthPeaked: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlPathBandwidthRod> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlPathBandwidthRod> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NlPathBandwidthRod =
                    NlPathBandwidthRod(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NlPathBandwidthRod) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.instability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 16L, value.bandwidthPeaked)
                }
            }
    }
}

public data class NpiModuleid(
    public var length: UShort = 0u,
    public var type: NpiModuleidType = 0,
    public var anonymous: NpiModuleid0 = NpiModuleid0(),
)

public data class NpiModuleid0(
    public var guid: Guid = Guid(),
    public var ifLuid: Luid = Luid(),
)

public data class Nspv2Routine(
    public var cbSize: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var nSPv2Startup: Lpnspv2startup = null,
    public var nSPv2Cleanup: Lpnspv2cleanup = null,
    public var nSPv2LookupServiceBegin: Lpnspv2lookupservicebegin = null,
    public var nSPv2LookupServiceNextEx: Lpnspv2lookupservicenextex = null,
    public var nSPv2LookupServiceEnd: Lpnspv2lookupserviceend = null,
    public var nSPv2SetServiceEx: Lpnspv2setserviceex = null,
    public var nSPv2ClientSessionRundown: Lpnspv2clientsessionrundown = null,
)

public data class NspRoutine(
    public var cbSize: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var nSPCleanup: Lpnspcleanup = null,
    public var nSPLookupServiceBegin: Lpnsplookupservicebegin = null,
    public var nSPLookupServiceNext: Lpnsplookupservicenext = null,
    public var nSPLookupServiceEnd: Lpnsplookupserviceend = null,
    public var nSPSetService: Lpnspsetservice = null,
    public var nSPInstallServiceClass: Lpnspinstallserviceclass = null,
    public var nSPRemoveServiceClass: Lpnspremoveserviceclass = null,
    public var nSPGetServiceClassInfo: Lpnspgetserviceclassinfo = null,
    public var nSPIoctl: Lpnspioctl = null,
)

public class NsInfoa internal constructor(
    public var dwNameSpace: UInt,
    public var dwNameSpaceFlags: UInt,
    lpNameSpaceCtorArg: Pstr,
) {
    public var lpNameSpace: Pstr = lpNameSpaceCtorArg
        internal set

    public constructor() : this(
        dwNameSpace = 0u,
        dwNameSpaceFlags = 0u,
        lpNameSpaceCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwNameSpace

    public operator fun component2(): UInt = this.dwNameSpaceFlags

    public operator fun component3(): Pstr = this.lpNameSpace

    public fun copy(dwNameSpace: UInt = this.dwNameSpace, dwNameSpaceFlags: UInt = this.dwNameSpaceFlags, lpNameSpace: Pstr = this.lpNameSpace): NsInfoa = NsInfoa(dwNameSpace = dwNameSpace, dwNameSpaceFlags = dwNameSpaceFlags, lpNameSpaceCtorArg = lpNameSpace)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NsInfoa) return false
        if (this.dwNameSpace != other.dwNameSpace) return false
        if (this.dwNameSpaceFlags != other.dwNameSpaceFlags) return false
        if (this.lpNameSpace != other.lpNameSpace) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwNameSpace.hashCode()
        result = 31 * result + this.dwNameSpaceFlags.hashCode()
        result = 31 * result + this.lpNameSpace.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwNameSpace: UInt = 0u,
            dwNameSpaceFlags: UInt = 0u,
            lpNameSpace: Pstr = MutPtr(0L),
        ): NsInfoa =
            NsInfoa(
                dwNameSpace = dwNameSpace,
                dwNameSpaceFlags = dwNameSpaceFlags,
                lpNameSpaceCtorArg = lpNameSpace,
            )
    }
}

public class NsInfow internal constructor(
    public var dwNameSpace: UInt,
    public var dwNameSpaceFlags: UInt,
    lpNameSpaceCtorArg: Pwstr,
) {
    public var lpNameSpace: Pwstr = lpNameSpaceCtorArg
        internal set

    public constructor() : this(
        dwNameSpace = 0u,
        dwNameSpaceFlags = 0u,
        lpNameSpaceCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwNameSpace

    public operator fun component2(): UInt = this.dwNameSpaceFlags

    public operator fun component3(): Pwstr = this.lpNameSpace

    public fun copy(dwNameSpace: UInt = this.dwNameSpace, dwNameSpaceFlags: UInt = this.dwNameSpaceFlags, lpNameSpace: Pwstr = this.lpNameSpace): NsInfow = NsInfow(dwNameSpace = dwNameSpace, dwNameSpaceFlags = dwNameSpaceFlags, lpNameSpaceCtorArg = lpNameSpace)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NsInfow) return false
        if (this.dwNameSpace != other.dwNameSpace) return false
        if (this.dwNameSpaceFlags != other.dwNameSpaceFlags) return false
        if (this.lpNameSpace != other.lpNameSpace) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwNameSpace.hashCode()
        result = 31 * result + this.dwNameSpaceFlags.hashCode()
        result = 31 * result + this.lpNameSpace.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwNameSpace: UInt = 0u,
            dwNameSpaceFlags: UInt = 0u,
            lpNameSpace: Pwstr = MutPtr(0L),
        ): NsInfow =
            NsInfow(
                dwNameSpace = dwNameSpace,
                dwNameSpaceFlags = dwNameSpaceFlags,
                lpNameSpaceCtorArg = lpNameSpace,
            )
    }
}

public data class NsServiceInfoa(
    public var dwNameSpace: UInt = 0u,
    public var serviceInfo: ServiceInfoa = ServiceInfoa(),
)

public data class NsServiceInfow(
    public var dwNameSpace: UInt = 0u,
    public var serviceInfo: ServiceInfow = ServiceInfow(),
)

public data class PriorityStatus(
    public var sender: SocketPriorityHint = 0,
    public var receiver: SocketPriorityHint = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PriorityStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PriorityStatus> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): PriorityStatus =
                    PriorityStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PriorityStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.sender)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.receiver)
                }
            }
    }
}

public class ProtocolInfoa internal constructor(
    public var dwServiceFlags: UInt,
    public var iAddressFamily: Int,
    public var iMaxSockAddr: Int,
    public var iMinSockAddr: Int,
    public var iSocketType: Int,
    public var iProtocol: Int,
    public var dwMessageSize: UInt,
    lpProtocolCtorArg: Pstr,
) {
    public var lpProtocol: Pstr = lpProtocolCtorArg
        internal set

    public constructor() : this(
        dwServiceFlags = 0u,
        iAddressFamily = 0,
        iMaxSockAddr = 0,
        iMinSockAddr = 0,
        iSocketType = 0,
        iProtocol = 0,
        dwMessageSize = 0u,
        lpProtocolCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwServiceFlags

    public operator fun component2(): Int = this.iAddressFamily

    public operator fun component3(): Int = this.iMaxSockAddr

    public operator fun component4(): Int = this.iMinSockAddr

    public operator fun component5(): Int = this.iSocketType

    public operator fun component6(): Int = this.iProtocol

    public operator fun component7(): UInt = this.dwMessageSize

    public operator fun component8(): Pstr = this.lpProtocol

    public fun copy(dwServiceFlags: UInt = this.dwServiceFlags, iAddressFamily: Int = this.iAddressFamily, iMaxSockAddr: Int = this.iMaxSockAddr, iMinSockAddr: Int = this.iMinSockAddr, iSocketType: Int = this.iSocketType, iProtocol: Int = this.iProtocol, dwMessageSize: UInt = this.dwMessageSize, lpProtocol: Pstr = this.lpProtocol): ProtocolInfoa = ProtocolInfoa(dwServiceFlags = dwServiceFlags, iAddressFamily = iAddressFamily, iMaxSockAddr = iMaxSockAddr, iMinSockAddr = iMinSockAddr, iSocketType = iSocketType, iProtocol = iProtocol, dwMessageSize = dwMessageSize, lpProtocolCtorArg = lpProtocol)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProtocolInfoa) return false
        if (this.dwServiceFlags != other.dwServiceFlags) return false
        if (this.iAddressFamily != other.iAddressFamily) return false
        if (this.iMaxSockAddr != other.iMaxSockAddr) return false
        if (this.iMinSockAddr != other.iMinSockAddr) return false
        if (this.iSocketType != other.iSocketType) return false
        if (this.iProtocol != other.iProtocol) return false
        if (this.dwMessageSize != other.dwMessageSize) return false
        if (this.lpProtocol != other.lpProtocol) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwServiceFlags.hashCode()
        result = 31 * result + this.iAddressFamily.hashCode()
        result = 31 * result + this.iMaxSockAddr.hashCode()
        result = 31 * result + this.iMinSockAddr.hashCode()
        result = 31 * result + this.iSocketType.hashCode()
        result = 31 * result + this.iProtocol.hashCode()
        result = 31 * result + this.dwMessageSize.hashCode()
        result = 31 * result + this.lpProtocol.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwServiceFlags: UInt = 0u,
            iAddressFamily: Int = 0,
            iMaxSockAddr: Int = 0,
            iMinSockAddr: Int = 0,
            iSocketType: Int = 0,
            iProtocol: Int = 0,
            dwMessageSize: UInt = 0u,
            lpProtocol: Pstr = MutPtr(0L),
        ): ProtocolInfoa =
            ProtocolInfoa(
                dwServiceFlags = dwServiceFlags,
                iAddressFamily = iAddressFamily,
                iMaxSockAddr = iMaxSockAddr,
                iMinSockAddr = iMinSockAddr,
                iSocketType = iSocketType,
                iProtocol = iProtocol,
                dwMessageSize = dwMessageSize,
                lpProtocolCtorArg = lpProtocol,
            )
    }
}

public class ProtocolInfow internal constructor(
    public var dwServiceFlags: UInt,
    public var iAddressFamily: Int,
    public var iMaxSockAddr: Int,
    public var iMinSockAddr: Int,
    public var iSocketType: Int,
    public var iProtocol: Int,
    public var dwMessageSize: UInt,
    lpProtocolCtorArg: Pwstr,
) {
    public var lpProtocol: Pwstr = lpProtocolCtorArg
        internal set

    public constructor() : this(
        dwServiceFlags = 0u,
        iAddressFamily = 0,
        iMaxSockAddr = 0,
        iMinSockAddr = 0,
        iSocketType = 0,
        iProtocol = 0,
        dwMessageSize = 0u,
        lpProtocolCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwServiceFlags

    public operator fun component2(): Int = this.iAddressFamily

    public operator fun component3(): Int = this.iMaxSockAddr

    public operator fun component4(): Int = this.iMinSockAddr

    public operator fun component5(): Int = this.iSocketType

    public operator fun component6(): Int = this.iProtocol

    public operator fun component7(): UInt = this.dwMessageSize

    public operator fun component8(): Pwstr = this.lpProtocol

    public fun copy(dwServiceFlags: UInt = this.dwServiceFlags, iAddressFamily: Int = this.iAddressFamily, iMaxSockAddr: Int = this.iMaxSockAddr, iMinSockAddr: Int = this.iMinSockAddr, iSocketType: Int = this.iSocketType, iProtocol: Int = this.iProtocol, dwMessageSize: UInt = this.dwMessageSize, lpProtocol: Pwstr = this.lpProtocol): ProtocolInfow = ProtocolInfow(dwServiceFlags = dwServiceFlags, iAddressFamily = iAddressFamily, iMaxSockAddr = iMaxSockAddr, iMinSockAddr = iMinSockAddr, iSocketType = iSocketType, iProtocol = iProtocol, dwMessageSize = dwMessageSize, lpProtocolCtorArg = lpProtocol)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProtocolInfow) return false
        if (this.dwServiceFlags != other.dwServiceFlags) return false
        if (this.iAddressFamily != other.iAddressFamily) return false
        if (this.iMaxSockAddr != other.iMaxSockAddr) return false
        if (this.iMinSockAddr != other.iMinSockAddr) return false
        if (this.iSocketType != other.iSocketType) return false
        if (this.iProtocol != other.iProtocol) return false
        if (this.dwMessageSize != other.dwMessageSize) return false
        if (this.lpProtocol != other.lpProtocol) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwServiceFlags.hashCode()
        result = 31 * result + this.iAddressFamily.hashCode()
        result = 31 * result + this.iMaxSockAddr.hashCode()
        result = 31 * result + this.iMinSockAddr.hashCode()
        result = 31 * result + this.iSocketType.hashCode()
        result = 31 * result + this.iProtocol.hashCode()
        result = 31 * result + this.dwMessageSize.hashCode()
        result = 31 * result + this.lpProtocol.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwServiceFlags: UInt = 0u,
            iAddressFamily: Int = 0,
            iMaxSockAddr: Int = 0,
            iMinSockAddr: Int = 0,
            iSocketType: Int = 0,
            iProtocol: Int = 0,
            dwMessageSize: UInt = 0u,
            lpProtocol: Pwstr = MutPtr(0L),
        ): ProtocolInfow =
            ProtocolInfow(
                dwServiceFlags = dwServiceFlags,
                iAddressFamily = iAddressFamily,
                iMaxSockAddr = iMaxSockAddr,
                iMinSockAddr = iMinSockAddr,
                iSocketType = iSocketType,
                iProtocol = iProtocol,
                dwMessageSize = dwMessageSize,
                lpProtocolCtorArg = lpProtocol,
            )
    }
}

public class Protoent internal constructor(
    pNameCtorArg: Pstr,
    pAliasesCtorArg: MutPtr<MutPtr<Byte>>,
    public var pProto: Short,
) {
    public var pName: Pstr = pNameCtorArg
        internal set

    public var pAliases: MutPtr<MutPtr<Byte>> = pAliasesCtorArg
        internal set

    public constructor() : this(
        pNameCtorArg = MutPtr(0L),
        pAliasesCtorArg = MutPtr(0L),
        pProto = 0,
    )

    public operator fun component1(): Pstr = this.pName

    public operator fun component2(): MutPtr<MutPtr<Byte>> = this.pAliases

    public operator fun component3(): Short = this.pProto

    public fun copy(pName: Pstr = this.pName, pAliases: MutPtr<MutPtr<Byte>> = this.pAliases, pProto: Short = this.pProto): Protoent = Protoent(pNameCtorArg = pName, pAliasesCtorArg = pAliases, pProto = pProto)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Protoent) return false
        if (this.pName != other.pName) return false
        if (this.pAliases != other.pAliases) return false
        if (this.pProto != other.pProto) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pName.hashCode()
        result = 31 * result + this.pAliases.hashCode()
        result = 31 * result + this.pProto.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pName: Pstr = MutPtr(0L),
            pAliases: MutPtr<MutPtr<Byte>> = MutPtr(0L),
            pProto: Short = 0,
        ): Protoent =
            Protoent(
                pNameCtorArg = pName,
                pAliasesCtorArg = pAliases,
                pProto = pProto,
            )
    }
}

public data class Q2931Ie(
    public var iEType: Q2931IeType = 0,
    public var iELength: UInt = 0u,
    public var ie: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Q2931Ie) return false
        if (this.iEType != other.iEType) return false
        if (this.iELength != other.iELength) return false
        if (!this.ie.contentEquals(other.ie)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iEType.hashCode()
        result = 31 * result + this.iELength.hashCode()
        result = 31 * result + this.ie.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Q2931Ie> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Q2931Ie> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Q2931Ie =
                    Q2931Ie(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Q2931Ie) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.iEType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.iELength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.ie)
                }
            }
    }
}

public data class Qos(
    public var sendingFlowspec: Flowspec = Flowspec(),
    public var receivingFlowspec: Flowspec = Flowspec(),
    public var providerSpecific: Wsabuf = Wsabuf(),
)

public data class RcvallIf(
    public var mode: RcvallValue = 0,
    public var iface: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RcvallIf> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RcvallIf> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): RcvallIf =
                    RcvallIf(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: RcvallIf) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.mode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.iface)
                }
            }
    }
}

public data class RealTimeNotificationSettingInput(
    public var transportSettingId: TransportSettingId = TransportSettingId(),
    public var brokerEventGuid: Guid = Guid(),
)

public data class RealTimeNotificationSettingInputEx(
    public var transportSettingId: TransportSettingId = TransportSettingId(),
    public var brokerEventGuid: Guid = Guid(),
    public var unmark: Boolean = false,
)

public data class RealTimeNotificationSettingOutput(
    public var channelStatus: ControlChannelTriggerStatus = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RealTimeNotificationSettingOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RealTimeNotificationSettingOutput> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): RealTimeNotificationSettingOutput =
                    RealTimeNotificationSettingOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: RealTimeNotificationSettingOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.channelStatus)
                }
            }
    }
}

public data class Rioresult(
    public var status: Int = 0,
    public var bytesTransferred: UInt = 0u,
    public var socketContext: ULong = 0uL,
    public var requestContext: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rioresult> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rioresult> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Rioresult =
                    Rioresult(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Rioresult) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.status)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bytesTransferred)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.socketContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.requestContext)
                }
            }
    }
}

public data class RioBuf(
    public var bufferId: RioBufferid = 0,
    public var offset: UInt = 0u,
    public var length: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RioBuf> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RioBuf> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RioBuf =
                    RioBuf(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: RioBuf) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.bufferId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.length)
                }
            }
    }
}

public data class RioCmsgBuffer(
    public var totalLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RioCmsgBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RioCmsgBuffer> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): RioCmsgBuffer =
                    RioCmsgBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: RioCmsgBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.totalLength)
                }
            }
    }
}

public data class RioExtensionFunctionTable(
    public var cbSize: UInt = 0u,
    public var rIOReceive: LpfnRioreceive = null,
    public var rIOReceiveEx: LpfnRioreceiveex = null,
    public var rIOSend: LpfnRiosend = null,
    public var rIOSendEx: LpfnRiosendex = null,
    public var rIOCloseCompletionQueue: LpfnRioclosecompletionqueue = null,
    public var rIOCreateCompletionQueue: LpfnRiocreatecompletionqueue = null,
    public var rIOCreateRequestQueue: LpfnRiocreaterequestqueue = null,
    public var rIODequeueCompletion: LpfnRiodequeuecompletion = null,
    public var rIODeregisterBuffer: LpfnRioderegisterbuffer = null,
    public var rIONotify: LpfnRionotify = null,
    public var rIORegisterBuffer: LpfnRioregisterbuffer = null,
    public var rIOResizeCompletionQueue: LpfnRioresizecompletionqueue = null,
    public var rIOResizeRequestQueue: LpfnRioresizerequestqueue = null,
)

public data class RioNotificationCompletion(
    public var type: RioNotificationCompletionType = 0,
    public var anonymous: RioNotificationCompletion0 = RioNotificationCompletion0(),
)

public data class RioNotificationCompletion0(
    public var event: RioNotificationCompletion00 = RioNotificationCompletion00(),
    public var iocp: RioNotificationCompletion01 = RioNotificationCompletion01(),
)

public class RioNotificationCompletion00 internal constructor(
    eventHandleCtorArg: Handle,
    public var notifyReset: Bool,
) {
    public var eventHandle: Handle = eventHandleCtorArg
        internal set

    public constructor() : this(
        eventHandleCtorArg = MutPtr(0L),
        notifyReset = 0,
    )

    public operator fun component1(): Handle = this.eventHandle

    public operator fun component2(): Bool = this.notifyReset

    public fun copy(eventHandle: Handle = this.eventHandle, notifyReset: Bool = this.notifyReset): RioNotificationCompletion00 = RioNotificationCompletion00(eventHandleCtorArg = eventHandle, notifyReset = notifyReset)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RioNotificationCompletion00) return false
        if (this.eventHandle != other.eventHandle) return false
        if (this.notifyReset != other.notifyReset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eventHandle.hashCode()
        result = 31 * result + this.notifyReset.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            eventHandle: Handle = MutPtr(0L),
            notifyReset: Bool = 0,
        ): RioNotificationCompletion00 =
            RioNotificationCompletion00(
                eventHandleCtorArg = eventHandle,
                notifyReset = notifyReset,
            )
    }
}

public class RioNotificationCompletion01 internal constructor(
    iocpHandleCtorArg: Handle,
    completionKeyCtorArg: MutPtr<CVoid>,
    overlappedCtorArg: MutPtr<CVoid>,
) {
    public var iocpHandle: Handle = iocpHandleCtorArg
        internal set

    public var completionKey: MutPtr<CVoid> = completionKeyCtorArg
        internal set

    public var overlapped: MutPtr<CVoid> = overlappedCtorArg
        internal set

    public constructor() : this(
        iocpHandleCtorArg = MutPtr(0L),
        completionKeyCtorArg = MutPtr(0L),
        overlappedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.iocpHandle

    public operator fun component2(): MutPtr<CVoid> = this.completionKey

    public operator fun component3(): MutPtr<CVoid> = this.overlapped

    public fun copy(iocpHandle: Handle = this.iocpHandle, completionKey: MutPtr<CVoid> = this.completionKey, overlapped: MutPtr<CVoid> = this.overlapped): RioNotificationCompletion01 = RioNotificationCompletion01(iocpHandleCtorArg = iocpHandle, completionKeyCtorArg = completionKey, overlappedCtorArg = overlapped)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RioNotificationCompletion01) return false
        if (this.iocpHandle != other.iocpHandle) return false
        if (this.completionKey != other.completionKey) return false
        if (this.overlapped != other.overlapped) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iocpHandle.hashCode()
        result = 31 * result + this.completionKey.hashCode()
        result = 31 * result + this.overlapped.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            iocpHandle: Handle = MutPtr(0L),
            completionKey: MutPtr<CVoid> = MutPtr(0L),
            overlapped: MutPtr<CVoid> = MutPtr(0L),
        ): RioNotificationCompletion01 =
            RioNotificationCompletion01(
                iocpHandleCtorArg = iocpHandle,
                completionKeyCtorArg = completionKey,
                overlappedCtorArg = overlapped,
            )
    }
}

public data class RmFecInfo(
    public var fECBlockSize: UShort = 0u,
    public var fECProActivePackets: UShort = 0u,
    public var fECGroupSize: UByte = 0u,
    public var fFECOnDemandParityEnabled: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RmFecInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RmFecInfo> {
                override val sizeBytes: Long = 6L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): RmFecInfo =
                    RmFecInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 5L),
                    )
                override fun writeNative(addr: Long, value: RmFecInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.fECBlockSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.fECProActivePackets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.fECGroupSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 5L, value.fFECOnDemandParityEnabled)
                }
            }
    }
}

public class RmReceiverStats(
    public var numODataPacketsReceived: ULong = 0uL,
    public var numRDataPacketsReceived: ULong = 0uL,
    public var numDuplicateDataPackets: ULong = 0uL,
    public var dataBytesReceived: ULong = 0uL,
    public var totalBytesReceived: ULong = 0uL,
    public var rateKBitsPerSecOverall: ULong = 0uL,
    public var rateKBitsPerSecLast: ULong = 0uL,
    public var trailingEdgeSeqId: ULong = 0uL,
    public var leadingEdgeSeqId: ULong = 0uL,
    public var averageSequencesInWindow: ULong = 0uL,
    public var minSequencesInWindow: ULong = 0uL,
    public var maxSequencesInWindow: ULong = 0uL,
    public var firstNakSequenceNumber: ULong = 0uL,
    public var numPendingNaks: ULong = 0uL,
    public var numOutstandingNaks: ULong = 0uL,
    public var numDataPacketsBuffered: ULong = 0uL,
    public var totalSelectiveNaksSent: ULong = 0uL,
    public var totalParityNaksSent: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RmReceiverStats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RmReceiverStats> {
                override val sizeBytes: Long = 144L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RmReceiverStats =
                    RmReceiverStats(
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
                override fun writeNative(addr: Long, value: RmReceiverStats) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.numODataPacketsReceived)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.numRDataPacketsReceived)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.numDuplicateDataPackets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.dataBytesReceived)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.totalBytesReceived)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.rateKBitsPerSecOverall)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.rateKBitsPerSecLast)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.trailingEdgeSeqId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.leadingEdgeSeqId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.averageSequencesInWindow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.minSequencesInWindow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.maxSequencesInWindow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.firstNakSequenceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.numPendingNaks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.numOutstandingNaks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.numDataPacketsBuffered)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.totalSelectiveNaksSent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.totalParityNaksSent)
                }
            }
    }
}

public data class RmSenderStats(
    public var dataBytesSent: ULong = 0uL,
    public var totalBytesSent: ULong = 0uL,
    public var naksReceived: ULong = 0uL,
    public var naksReceivedTooLate: ULong = 0uL,
    public var numOutstandingNaks: ULong = 0uL,
    public var numNaksAfterRData: ULong = 0uL,
    public var repairPacketsSent: ULong = 0uL,
    public var bufferSpaceAvailable: ULong = 0uL,
    public var trailingEdgeSeqId: ULong = 0uL,
    public var leadingEdgeSeqId: ULong = 0uL,
    public var rateKBitsPerSecOverall: ULong = 0uL,
    public var rateKBitsPerSecLast: ULong = 0uL,
    public var totalODataPacketsSent: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RmSenderStats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RmSenderStats> {
                override val sizeBytes: Long = 104L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RmSenderStats =
                    RmSenderStats(
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
                    )
                override fun writeNative(addr: Long, value: RmSenderStats) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dataBytesSent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.totalBytesSent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.naksReceived)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.naksReceivedTooLate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.numOutstandingNaks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.numNaksAfterRData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.repairPacketsSent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.bufferSpaceAvailable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.trailingEdgeSeqId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.leadingEdgeSeqId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.rateKBitsPerSecOverall)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.rateKBitsPerSecLast)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.totalODataPacketsSent)
                }
            }
    }
}

public data class RmSendWindow(
    public var rateKbitsPerSec: UInt = 0u,
    public var windowSizeInMSecs: UInt = 0u,
    public var windowSizeInBytes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RmSendWindow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RmSendWindow> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): RmSendWindow =
                    RmSendWindow(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RmSendWindow) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.rateKbitsPerSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.windowSizeInMSecs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.windowSizeInBytes)
                }
            }
    }
}

public data class RssScalabilityInfo(
    public var rssEnabled: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RssScalabilityInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RssScalabilityInfo> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): RssScalabilityInfo =
                    RssScalabilityInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: RssScalabilityInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.rssEnabled)
                }
            }
    }
}

public data class ScopeId(
    public var anonymous: ScopeId0 = ScopeId0(),
)

public data class ScopeId0(
    public var anonymous: ScopeId00 = ScopeId00(),
    public var value: UInt = 0u,
)

public data class ScopeId00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScopeId00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScopeId00> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ScopeId00 =
                    ScopeId00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ScopeId00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class Servent internal constructor(
    sNameCtorArg: Pstr,
    sAliasesCtorArg: MutPtr<MutPtr<Byte>>,
    sProtoCtorArg: Pstr,
    public var sPort: Short,
) {
    public var sName: Pstr = sNameCtorArg
        internal set

    public var sAliases: MutPtr<MutPtr<Byte>> = sAliasesCtorArg
        internal set

    public var sProto: Pstr = sProtoCtorArg
        internal set

    public constructor() : this(
        sNameCtorArg = MutPtr(0L),
        sAliasesCtorArg = MutPtr(0L),
        sProtoCtorArg = MutPtr(0L),
        sPort = 0,
    )

    public operator fun component1(): Pstr = this.sName

    public operator fun component2(): MutPtr<MutPtr<Byte>> = this.sAliases

    public operator fun component3(): Pstr = this.sProto

    public operator fun component4(): Short = this.sPort

    public fun copy(sName: Pstr = this.sName, sAliases: MutPtr<MutPtr<Byte>> = this.sAliases, sProto: Pstr = this.sProto, sPort: Short = this.sPort): Servent = Servent(sNameCtorArg = sName, sAliasesCtorArg = sAliases, sProtoCtorArg = sProto, sPort = sPort)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Servent) return false
        if (this.sName != other.sName) return false
        if (this.sAliases != other.sAliases) return false
        if (this.sProto != other.sProto) return false
        if (this.sPort != other.sPort) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sName.hashCode()
        result = 31 * result + this.sAliases.hashCode()
        result = 31 * result + this.sProto.hashCode()
        result = 31 * result + this.sPort.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sName: Pstr = MutPtr(0L),
            sAliases: MutPtr<MutPtr<Byte>> = MutPtr(0L),
            sProto: Pstr = MutPtr(0L),
            sPort: Short = 0,
        ): Servent =
            Servent(
                sNameCtorArg = sName,
                sAliasesCtorArg = sAliases,
                sProtoCtorArg = sProto,
                sPort = sPort,
            )
    }
}

public class ServiceAddress internal constructor(
    public var dwAddressType: UInt,
    public var dwAddressFlags: UInt,
    public var dwAddressLength: UInt,
    public var dwPrincipalLength: UInt,
    lpAddressCtorArg: MutPtr<UByte>,
    lpPrincipalCtorArg: MutPtr<UByte>,
) {
    public var lpAddress: MutPtr<UByte> = lpAddressCtorArg
        internal set

    public var lpPrincipal: MutPtr<UByte> = lpPrincipalCtorArg
        internal set

    public constructor() : this(
        dwAddressType = 0u,
        dwAddressFlags = 0u,
        dwAddressLength = 0u,
        dwPrincipalLength = 0u,
        lpAddressCtorArg = MutPtr(0L),
        lpPrincipalCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwAddressType

    public operator fun component2(): UInt = this.dwAddressFlags

    public operator fun component3(): UInt = this.dwAddressLength

    public operator fun component4(): UInt = this.dwPrincipalLength

    public operator fun component5(): MutPtr<UByte> = this.lpAddress

    public operator fun component6(): MutPtr<UByte> = this.lpPrincipal

    public fun copy(dwAddressType: UInt = this.dwAddressType, dwAddressFlags: UInt = this.dwAddressFlags, dwAddressLength: UInt = this.dwAddressLength, dwPrincipalLength: UInt = this.dwPrincipalLength, lpAddress: MutPtr<UByte> = this.lpAddress, lpPrincipal: MutPtr<UByte> = this.lpPrincipal): ServiceAddress = ServiceAddress(dwAddressType = dwAddressType, dwAddressFlags = dwAddressFlags, dwAddressLength = dwAddressLength, dwPrincipalLength = dwPrincipalLength, lpAddressCtorArg = lpAddress, lpPrincipalCtorArg = lpPrincipal)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceAddress) return false
        if (this.dwAddressType != other.dwAddressType) return false
        if (this.dwAddressFlags != other.dwAddressFlags) return false
        if (this.dwAddressLength != other.dwAddressLength) return false
        if (this.dwPrincipalLength != other.dwPrincipalLength) return false
        if (this.lpAddress != other.lpAddress) return false
        if (this.lpPrincipal != other.lpPrincipal) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwAddressType.hashCode()
        result = 31 * result + this.dwAddressFlags.hashCode()
        result = 31 * result + this.dwAddressLength.hashCode()
        result = 31 * result + this.dwPrincipalLength.hashCode()
        result = 31 * result + this.lpAddress.hashCode()
        result = 31 * result + this.lpPrincipal.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceAddress> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ServiceAddress =
                    ServiceAddress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: ServiceAddress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwAddressType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwAddressFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwAddressLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwPrincipalLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 16L, value.lpAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 24L, value.lpPrincipal)
                }
            }

        public operator fun invoke(
            dwAddressType: UInt = 0u,
            dwAddressFlags: UInt = 0u,
            dwAddressLength: UInt = 0u,
            dwPrincipalLength: UInt = 0u,
            lpAddress: MutPtr<UByte> = MutPtr(0L),
            lpPrincipal: MutPtr<UByte> = MutPtr(0L),
        ): ServiceAddress =
            ServiceAddress(
                dwAddressType = dwAddressType,
                dwAddressFlags = dwAddressFlags,
                dwAddressLength = dwAddressLength,
                dwPrincipalLength = dwPrincipalLength,
                lpAddressCtorArg = lpAddress,
                lpPrincipalCtorArg = lpPrincipal,
            )
    }
}

public data class ServiceAddresses(
    public var dwAddressCount: UInt = 0u,
    public var addresses: List<ServiceAddress> = List(1) { ServiceAddress() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceAddresses> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceAddresses> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ServiceAddresses =
                    ServiceAddresses(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(ServiceAddress.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ServiceAddresses) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwAddressCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(ServiceAddress.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.addresses)
                }
            }
    }
}

public class ServiceAsyncInfo internal constructor(
    public var lpServiceCallbackProc: LpserviceCallbackProc,
    public var lParam: Lparam,
    hAsyncTaskHandleCtorArg: Handle,
) {
    public var hAsyncTaskHandle: Handle = hAsyncTaskHandleCtorArg
        internal set

    public constructor() : this(
        lpServiceCallbackProc = null,
        lParam = 0L,
        hAsyncTaskHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): LpserviceCallbackProc = this.lpServiceCallbackProc

    public operator fun component2(): Lparam = this.lParam

    public operator fun component3(): Handle = this.hAsyncTaskHandle

    public fun copy(lpServiceCallbackProc: LpserviceCallbackProc = this.lpServiceCallbackProc, lParam: Lparam = this.lParam, hAsyncTaskHandle: Handle = this.hAsyncTaskHandle): ServiceAsyncInfo = ServiceAsyncInfo(lpServiceCallbackProc = lpServiceCallbackProc, lParam = lParam, hAsyncTaskHandleCtorArg = hAsyncTaskHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceAsyncInfo) return false
        if (this.lpServiceCallbackProc != other.lpServiceCallbackProc) return false
        if (this.lParam != other.lParam) return false
        if (this.hAsyncTaskHandle != other.hAsyncTaskHandle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpServiceCallbackProc.hashCode()
        result = 31 * result + this.lParam.hashCode()
        result = 31 * result + this.hAsyncTaskHandle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpServiceCallbackProc: LpserviceCallbackProc = null,
            lParam: Lparam = 0L,
            hAsyncTaskHandle: Handle = MutPtr(0L),
        ): ServiceAsyncInfo =
            ServiceAsyncInfo(
                lpServiceCallbackProc = lpServiceCallbackProc,
                lParam = lParam,
                hAsyncTaskHandleCtorArg = hAsyncTaskHandle,
            )
    }
}

public class ServiceInfoa internal constructor(
    lpServiceTypeCtorArg: MutPtr<Guid>,
    lpServiceNameCtorArg: Pstr,
    lpCommentCtorArg: Pstr,
    lpLocaleCtorArg: Pstr,
    public var dwDisplayHint: ResourceDisplayType,
    public var dwVersion: UInt,
    public var dwTime: UInt,
    lpMachineNameCtorArg: Pstr,
    lpServiceAddressCtorArg: MutPtr<ServiceAddresses>,
    public var serviceSpecificInfo: Blob,
) {
    public var lpServiceType: MutPtr<Guid> = lpServiceTypeCtorArg
        internal set

    public var lpServiceName: Pstr = lpServiceNameCtorArg
        internal set

    public var lpComment: Pstr = lpCommentCtorArg
        internal set

    public var lpLocale: Pstr = lpLocaleCtorArg
        internal set

    public var lpMachineName: Pstr = lpMachineNameCtorArg
        internal set

    public var lpServiceAddress: MutPtr<ServiceAddresses> = lpServiceAddressCtorArg
        internal set

    public constructor() : this(
        lpServiceTypeCtorArg = MutPtr(0L),
        lpServiceNameCtorArg = MutPtr(0L),
        lpCommentCtorArg = MutPtr(0L),
        lpLocaleCtorArg = MutPtr(0L),
        dwDisplayHint = 0u,
        dwVersion = 0u,
        dwTime = 0u,
        lpMachineNameCtorArg = MutPtr(0L),
        lpServiceAddressCtorArg = MutPtr(0L),
        serviceSpecificInfo = Blob(),
    )

    public operator fun component1(): MutPtr<Guid> = this.lpServiceType

    public operator fun component2(): Pstr = this.lpServiceName

    public operator fun component3(): Pstr = this.lpComment

    public operator fun component4(): Pstr = this.lpLocale

    public operator fun component5(): ResourceDisplayType = this.dwDisplayHint

    public operator fun component6(): UInt = this.dwVersion

    public operator fun component7(): UInt = this.dwTime

    public operator fun component8(): Pstr = this.lpMachineName

    public operator fun component9(): MutPtr<ServiceAddresses> = this.lpServiceAddress

    public operator fun component10(): Blob = this.serviceSpecificInfo

    public fun copy(lpServiceType: MutPtr<Guid> = this.lpServiceType, lpServiceName: Pstr = this.lpServiceName, lpComment: Pstr = this.lpComment, lpLocale: Pstr = this.lpLocale, dwDisplayHint: ResourceDisplayType = this.dwDisplayHint, dwVersion: UInt = this.dwVersion, dwTime: UInt = this.dwTime, lpMachineName: Pstr = this.lpMachineName, lpServiceAddress: MutPtr<ServiceAddresses> = this.lpServiceAddress, serviceSpecificInfo: Blob = this.serviceSpecificInfo): ServiceInfoa = ServiceInfoa(lpServiceTypeCtorArg = lpServiceType, lpServiceNameCtorArg = lpServiceName, lpCommentCtorArg = lpComment, lpLocaleCtorArg = lpLocale, dwDisplayHint = dwDisplayHint, dwVersion = dwVersion, dwTime = dwTime, lpMachineNameCtorArg = lpMachineName, lpServiceAddressCtorArg = lpServiceAddress, serviceSpecificInfo = serviceSpecificInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceInfoa) return false
        if (this.lpServiceType != other.lpServiceType) return false
        if (this.lpServiceName != other.lpServiceName) return false
        if (this.lpComment != other.lpComment) return false
        if (this.lpLocale != other.lpLocale) return false
        if (this.dwDisplayHint != other.dwDisplayHint) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwTime != other.dwTime) return false
        if (this.lpMachineName != other.lpMachineName) return false
        if (this.lpServiceAddress != other.lpServiceAddress) return false
        if (this.serviceSpecificInfo != other.serviceSpecificInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpServiceType.hashCode()
        result = 31 * result + this.lpServiceName.hashCode()
        result = 31 * result + this.lpComment.hashCode()
        result = 31 * result + this.lpLocale.hashCode()
        result = 31 * result + this.dwDisplayHint.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.dwTime.hashCode()
        result = 31 * result + this.lpMachineName.hashCode()
        result = 31 * result + this.lpServiceAddress.hashCode()
        result = 31 * result + this.serviceSpecificInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpServiceType: MutPtr<Guid> = MutPtr(0L),
            lpServiceName: Pstr = MutPtr(0L),
            lpComment: Pstr = MutPtr(0L),
            lpLocale: Pstr = MutPtr(0L),
            dwDisplayHint: ResourceDisplayType = 0u,
            dwVersion: UInt = 0u,
            dwTime: UInt = 0u,
            lpMachineName: Pstr = MutPtr(0L),
            lpServiceAddress: MutPtr<ServiceAddresses> = MutPtr(0L),
            serviceSpecificInfo: Blob = Blob(),
        ): ServiceInfoa =
            ServiceInfoa(
                lpServiceTypeCtorArg = lpServiceType,
                lpServiceNameCtorArg = lpServiceName,
                lpCommentCtorArg = lpComment,
                lpLocaleCtorArg = lpLocale,
                dwDisplayHint = dwDisplayHint,
                dwVersion = dwVersion,
                dwTime = dwTime,
                lpMachineNameCtorArg = lpMachineName,
                lpServiceAddressCtorArg = lpServiceAddress,
                serviceSpecificInfo = serviceSpecificInfo,
            )
    }
}

public class ServiceInfow internal constructor(
    lpServiceTypeCtorArg: MutPtr<Guid>,
    lpServiceNameCtorArg: Pwstr,
    lpCommentCtorArg: Pwstr,
    lpLocaleCtorArg: Pwstr,
    public var dwDisplayHint: ResourceDisplayType,
    public var dwVersion: UInt,
    public var dwTime: UInt,
    lpMachineNameCtorArg: Pwstr,
    lpServiceAddressCtorArg: MutPtr<ServiceAddresses>,
    public var serviceSpecificInfo: Blob,
) {
    public var lpServiceType: MutPtr<Guid> = lpServiceTypeCtorArg
        internal set

    public var lpServiceName: Pwstr = lpServiceNameCtorArg
        internal set

    public var lpComment: Pwstr = lpCommentCtorArg
        internal set

    public var lpLocale: Pwstr = lpLocaleCtorArg
        internal set

    public var lpMachineName: Pwstr = lpMachineNameCtorArg
        internal set

    public var lpServiceAddress: MutPtr<ServiceAddresses> = lpServiceAddressCtorArg
        internal set

    public constructor() : this(
        lpServiceTypeCtorArg = MutPtr(0L),
        lpServiceNameCtorArg = MutPtr(0L),
        lpCommentCtorArg = MutPtr(0L),
        lpLocaleCtorArg = MutPtr(0L),
        dwDisplayHint = 0u,
        dwVersion = 0u,
        dwTime = 0u,
        lpMachineNameCtorArg = MutPtr(0L),
        lpServiceAddressCtorArg = MutPtr(0L),
        serviceSpecificInfo = Blob(),
    )

    public operator fun component1(): MutPtr<Guid> = this.lpServiceType

    public operator fun component2(): Pwstr = this.lpServiceName

    public operator fun component3(): Pwstr = this.lpComment

    public operator fun component4(): Pwstr = this.lpLocale

    public operator fun component5(): ResourceDisplayType = this.dwDisplayHint

    public operator fun component6(): UInt = this.dwVersion

    public operator fun component7(): UInt = this.dwTime

    public operator fun component8(): Pwstr = this.lpMachineName

    public operator fun component9(): MutPtr<ServiceAddresses> = this.lpServiceAddress

    public operator fun component10(): Blob = this.serviceSpecificInfo

    public fun copy(lpServiceType: MutPtr<Guid> = this.lpServiceType, lpServiceName: Pwstr = this.lpServiceName, lpComment: Pwstr = this.lpComment, lpLocale: Pwstr = this.lpLocale, dwDisplayHint: ResourceDisplayType = this.dwDisplayHint, dwVersion: UInt = this.dwVersion, dwTime: UInt = this.dwTime, lpMachineName: Pwstr = this.lpMachineName, lpServiceAddress: MutPtr<ServiceAddresses> = this.lpServiceAddress, serviceSpecificInfo: Blob = this.serviceSpecificInfo): ServiceInfow = ServiceInfow(lpServiceTypeCtorArg = lpServiceType, lpServiceNameCtorArg = lpServiceName, lpCommentCtorArg = lpComment, lpLocaleCtorArg = lpLocale, dwDisplayHint = dwDisplayHint, dwVersion = dwVersion, dwTime = dwTime, lpMachineNameCtorArg = lpMachineName, lpServiceAddressCtorArg = lpServiceAddress, serviceSpecificInfo = serviceSpecificInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceInfow) return false
        if (this.lpServiceType != other.lpServiceType) return false
        if (this.lpServiceName != other.lpServiceName) return false
        if (this.lpComment != other.lpComment) return false
        if (this.lpLocale != other.lpLocale) return false
        if (this.dwDisplayHint != other.dwDisplayHint) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwTime != other.dwTime) return false
        if (this.lpMachineName != other.lpMachineName) return false
        if (this.lpServiceAddress != other.lpServiceAddress) return false
        if (this.serviceSpecificInfo != other.serviceSpecificInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpServiceType.hashCode()
        result = 31 * result + this.lpServiceName.hashCode()
        result = 31 * result + this.lpComment.hashCode()
        result = 31 * result + this.lpLocale.hashCode()
        result = 31 * result + this.dwDisplayHint.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.dwTime.hashCode()
        result = 31 * result + this.lpMachineName.hashCode()
        result = 31 * result + this.lpServiceAddress.hashCode()
        result = 31 * result + this.serviceSpecificInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpServiceType: MutPtr<Guid> = MutPtr(0L),
            lpServiceName: Pwstr = MutPtr(0L),
            lpComment: Pwstr = MutPtr(0L),
            lpLocale: Pwstr = MutPtr(0L),
            dwDisplayHint: ResourceDisplayType = 0u,
            dwVersion: UInt = 0u,
            dwTime: UInt = 0u,
            lpMachineName: Pwstr = MutPtr(0L),
            lpServiceAddress: MutPtr<ServiceAddresses> = MutPtr(0L),
            serviceSpecificInfo: Blob = Blob(),
        ): ServiceInfow =
            ServiceInfow(
                lpServiceTypeCtorArg = lpServiceType,
                lpServiceNameCtorArg = lpServiceName,
                lpCommentCtorArg = lpComment,
                lpLocaleCtorArg = lpLocale,
                dwDisplayHint = dwDisplayHint,
                dwVersion = dwVersion,
                dwTime = dwTime,
                lpMachineNameCtorArg = lpMachineName,
                lpServiceAddressCtorArg = lpServiceAddress,
                serviceSpecificInfo = serviceSpecificInfo,
            )
    }
}

public data class ServiceTypeInfo(
    public var dwTypeNameOffset: UInt = 0u,
    public var dwValueCount: UInt = 0u,
    public var values: List<ServiceTypeValue> = List(1) { ServiceTypeValue() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceTypeInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceTypeInfo> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ServiceTypeInfo =
                    ServiceTypeInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(ServiceTypeValue.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ServiceTypeInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTypeNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwValueCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(ServiceTypeValue.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.values)
                }
            }
    }
}

public class ServiceTypeInfoAbsa internal constructor(
    lpTypeNameCtorArg: Pstr,
    public var dwValueCount: UInt,
    public var values: List<ServiceTypeValueAbsa>,
) {
    public var lpTypeName: Pstr = lpTypeNameCtorArg
        internal set

    public constructor() : this(
        lpTypeNameCtorArg = MutPtr(0L),
        dwValueCount = 0u,
        values = List(1) { ServiceTypeValueAbsa() },
    )

    public operator fun component1(): Pstr = this.lpTypeName

    public operator fun component2(): UInt = this.dwValueCount

    public operator fun component3(): List<ServiceTypeValueAbsa> = this.values

    public fun copy(lpTypeName: Pstr = this.lpTypeName, dwValueCount: UInt = this.dwValueCount, values: List<ServiceTypeValueAbsa> = this.values): ServiceTypeInfoAbsa = ServiceTypeInfoAbsa(lpTypeNameCtorArg = lpTypeName, dwValueCount = dwValueCount, values = values)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceTypeInfoAbsa) return false
        if (this.lpTypeName != other.lpTypeName) return false
        if (this.dwValueCount != other.dwValueCount) return false
        if (this.values != other.values) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpTypeName.hashCode()
        result = 31 * result + this.dwValueCount.hashCode()
        result = 31 * result + this.values.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpTypeName: Pstr = MutPtr(0L),
            dwValueCount: UInt = 0u,
            values: List<ServiceTypeValueAbsa> = List(1) { ServiceTypeValueAbsa() },
        ): ServiceTypeInfoAbsa =
            ServiceTypeInfoAbsa(
                lpTypeNameCtorArg = lpTypeName,
                dwValueCount = dwValueCount,
                values = values,
            )
    }
}

public class ServiceTypeInfoAbsw internal constructor(
    lpTypeNameCtorArg: Pwstr,
    public var dwValueCount: UInt,
    public var values: List<ServiceTypeValueAbsw>,
) {
    public var lpTypeName: Pwstr = lpTypeNameCtorArg
        internal set

    public constructor() : this(
        lpTypeNameCtorArg = MutPtr(0L),
        dwValueCount = 0u,
        values = List(1) { ServiceTypeValueAbsw() },
    )

    public operator fun component1(): Pwstr = this.lpTypeName

    public operator fun component2(): UInt = this.dwValueCount

    public operator fun component3(): List<ServiceTypeValueAbsw> = this.values

    public fun copy(lpTypeName: Pwstr = this.lpTypeName, dwValueCount: UInt = this.dwValueCount, values: List<ServiceTypeValueAbsw> = this.values): ServiceTypeInfoAbsw = ServiceTypeInfoAbsw(lpTypeNameCtorArg = lpTypeName, dwValueCount = dwValueCount, values = values)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceTypeInfoAbsw) return false
        if (this.lpTypeName != other.lpTypeName) return false
        if (this.dwValueCount != other.dwValueCount) return false
        if (this.values != other.values) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpTypeName.hashCode()
        result = 31 * result + this.dwValueCount.hashCode()
        result = 31 * result + this.values.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpTypeName: Pwstr = MutPtr(0L),
            dwValueCount: UInt = 0u,
            values: List<ServiceTypeValueAbsw> = List(1) { ServiceTypeValueAbsw() },
        ): ServiceTypeInfoAbsw =
            ServiceTypeInfoAbsw(
                lpTypeNameCtorArg = lpTypeName,
                dwValueCount = dwValueCount,
                values = values,
            )
    }
}

public data class ServiceTypeValue(
    public var dwNameSpace: UInt = 0u,
    public var dwValueType: UInt = 0u,
    public var dwValueSize: UInt = 0u,
    public var dwValueNameOffset: UInt = 0u,
    public var dwValueOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceTypeValue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ServiceTypeValue> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ServiceTypeValue =
                    ServiceTypeValue(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ServiceTypeValue) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNameSpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwValueType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwValueSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwValueNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwValueOffset)
                }
            }
    }
}

public class ServiceTypeValueAbsa internal constructor(
    public var dwNameSpace: UInt,
    public var dwValueType: UInt,
    public var dwValueSize: UInt,
    lpValueNameCtorArg: Pstr,
    lpValueCtorArg: MutPtr<CVoid>,
) {
    public var lpValueName: Pstr = lpValueNameCtorArg
        internal set

    public var lpValue: MutPtr<CVoid> = lpValueCtorArg
        internal set

    public constructor() : this(
        dwNameSpace = 0u,
        dwValueType = 0u,
        dwValueSize = 0u,
        lpValueNameCtorArg = MutPtr(0L),
        lpValueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwNameSpace

    public operator fun component2(): UInt = this.dwValueType

    public operator fun component3(): UInt = this.dwValueSize

    public operator fun component4(): Pstr = this.lpValueName

    public operator fun component5(): MutPtr<CVoid> = this.lpValue

    public fun copy(dwNameSpace: UInt = this.dwNameSpace, dwValueType: UInt = this.dwValueType, dwValueSize: UInt = this.dwValueSize, lpValueName: Pstr = this.lpValueName, lpValue: MutPtr<CVoid> = this.lpValue): ServiceTypeValueAbsa = ServiceTypeValueAbsa(dwNameSpace = dwNameSpace, dwValueType = dwValueType, dwValueSize = dwValueSize, lpValueNameCtorArg = lpValueName, lpValueCtorArg = lpValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceTypeValueAbsa) return false
        if (this.dwNameSpace != other.dwNameSpace) return false
        if (this.dwValueType != other.dwValueType) return false
        if (this.dwValueSize != other.dwValueSize) return false
        if (this.lpValueName != other.lpValueName) return false
        if (this.lpValue != other.lpValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwNameSpace.hashCode()
        result = 31 * result + this.dwValueType.hashCode()
        result = 31 * result + this.dwValueSize.hashCode()
        result = 31 * result + this.lpValueName.hashCode()
        result = 31 * result + this.lpValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwNameSpace: UInt = 0u,
            dwValueType: UInt = 0u,
            dwValueSize: UInt = 0u,
            lpValueName: Pstr = MutPtr(0L),
            lpValue: MutPtr<CVoid> = MutPtr(0L),
        ): ServiceTypeValueAbsa =
            ServiceTypeValueAbsa(
                dwNameSpace = dwNameSpace,
                dwValueType = dwValueType,
                dwValueSize = dwValueSize,
                lpValueNameCtorArg = lpValueName,
                lpValueCtorArg = lpValue,
            )
    }
}

public class ServiceTypeValueAbsw internal constructor(
    public var dwNameSpace: UInt,
    public var dwValueType: UInt,
    public var dwValueSize: UInt,
    lpValueNameCtorArg: Pwstr,
    lpValueCtorArg: MutPtr<CVoid>,
) {
    public var lpValueName: Pwstr = lpValueNameCtorArg
        internal set

    public var lpValue: MutPtr<CVoid> = lpValueCtorArg
        internal set

    public constructor() : this(
        dwNameSpace = 0u,
        dwValueType = 0u,
        dwValueSize = 0u,
        lpValueNameCtorArg = MutPtr(0L),
        lpValueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwNameSpace

    public operator fun component2(): UInt = this.dwValueType

    public operator fun component3(): UInt = this.dwValueSize

    public operator fun component4(): Pwstr = this.lpValueName

    public operator fun component5(): MutPtr<CVoid> = this.lpValue

    public fun copy(dwNameSpace: UInt = this.dwNameSpace, dwValueType: UInt = this.dwValueType, dwValueSize: UInt = this.dwValueSize, lpValueName: Pwstr = this.lpValueName, lpValue: MutPtr<CVoid> = this.lpValue): ServiceTypeValueAbsw = ServiceTypeValueAbsw(dwNameSpace = dwNameSpace, dwValueType = dwValueType, dwValueSize = dwValueSize, lpValueNameCtorArg = lpValueName, lpValueCtorArg = lpValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceTypeValueAbsw) return false
        if (this.dwNameSpace != other.dwNameSpace) return false
        if (this.dwValueType != other.dwValueType) return false
        if (this.dwValueSize != other.dwValueSize) return false
        if (this.lpValueName != other.lpValueName) return false
        if (this.lpValue != other.lpValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwNameSpace.hashCode()
        result = 31 * result + this.dwValueType.hashCode()
        result = 31 * result + this.dwValueSize.hashCode()
        result = 31 * result + this.lpValueName.hashCode()
        result = 31 * result + this.lpValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwNameSpace: UInt = 0u,
            dwValueType: UInt = 0u,
            dwValueSize: UInt = 0u,
            lpValueName: Pwstr = MutPtr(0L),
            lpValue: MutPtr<CVoid> = MutPtr(0L),
        ): ServiceTypeValueAbsw =
            ServiceTypeValueAbsw(
                dwNameSpace = dwNameSpace,
                dwValueType = dwValueType,
                dwValueSize = dwValueSize,
                lpValueNameCtorArg = lpValueName,
                lpValueCtorArg = lpValue,
            )
    }
}

public data class SnapHeader(
    public var dsap: UByte = 0u,
    public var ssap: UByte = 0u,
    public var control: UByte = 0u,
    public var oui: UByteArray = UByteArray(3),
    public var type: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SnapHeader) return false
        if (this.dsap != other.dsap) return false
        if (this.ssap != other.ssap) return false
        if (this.control != other.control) return false
        if (!this.oui.contentEquals(other.oui)) return false
        if (this.type != other.type) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dsap.hashCode()
        result = 31 * result + this.ssap.hashCode()
        result = 31 * result + this.control.hashCode()
        result = 31 * result + this.oui.contentHashCode()
        result = 31 * result + this.type.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SnapHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SnapHeader> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): SnapHeader =
                    SnapHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: SnapHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.dsap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.ssap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.control)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 3L, value.oui)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.type)
                }
            }
    }
}

public data class Sockaddr(
    public var saFamily: AddressFamily = 0u,
    public var saData: ByteArray = ByteArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sockaddr) return false
        if (this.saFamily != other.saFamily) return false
        if (!this.saData.contentEquals(other.saData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saFamily.hashCode()
        result = 31 * result + this.saData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sockaddr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sockaddr> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Sockaddr =
                    Sockaddr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (14).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Sockaddr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.saFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (14).toInt())
                    ).writeNative(addr + 2L, value.saData)
                }
            }
    }
}

public data class SockaddrAtm(
    public var satmFamily: UShort = 0u,
    public var satmNumber: AtmAddress = AtmAddress(),
    public var satmBlli: AtmBlli = AtmBlli(),
    public var satmBhli: AtmBhli = AtmBhli(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrAtm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrAtm> {
                override val sizeBytes: Long = 76L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SockaddrAtm =
                    SockaddrAtm(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (AtmAddress.typeLayout()).readNative(addr + 4L),
                        (AtmBlli.typeLayout()).readNative(addr + 32L),
                        (AtmBhli.typeLayout()).readNative(addr + 60L),
                    )
                override fun writeNative(addr: Long, value: SockaddrAtm) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.satmFamily)
                    (AtmAddress.typeLayout()).writeNative(addr + 4L, value.satmNumber)
                    (AtmBlli.typeLayout()).writeNative(addr + 32L, value.satmBlli)
                    (AtmBhli.typeLayout()).writeNative(addr + 60L, value.satmBhli)
                }
            }
    }
}

public data class SockaddrDl(
    public var sdlFamily: AddressFamily = 0u,
    public var sdlData: UByteArray = UByteArray(8),
    public var sdlZero: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrDl) return false
        if (this.sdlFamily != other.sdlFamily) return false
        if (!this.sdlData.contentEquals(other.sdlData)) return false
        if (!this.sdlZero.contentEquals(other.sdlZero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sdlFamily.hashCode()
        result = 31 * result + this.sdlData.contentHashCode()
        result = 31 * result + this.sdlZero.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrDl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrDl> {
                override val sizeBytes: Long = 14L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): SockaddrDl =
                    SockaddrDl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: SockaddrDl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sdlFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 2L, value.sdlData)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 10L, value.sdlZero)
                }
            }
    }
}

public data class SockaddrIn(
    public var sinFamily: AddressFamily = 0u,
    public var sinPort: UShort = 0u,
    public var sinAddr: InAddr = InAddr(),
    public var sinZero: ByteArray = ByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrIn) return false
        if (this.sinFamily != other.sinFamily) return false
        if (this.sinPort != other.sinPort) return false
        if (this.sinAddr != other.sinAddr) return false
        if (!this.sinZero.contentEquals(other.sinZero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sinFamily.hashCode()
        result = 31 * result + this.sinPort.hashCode()
        result = 31 * result + this.sinAddr.hashCode()
        result = 31 * result + this.sinZero.contentHashCode()
        return result
    }
}

public data class SockaddrIn6(
    public var sin6Family: AddressFamily = 0u,
    public var sin6Port: UShort = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
    public var anonymous: SockaddrIn60 = SockaddrIn60(),
)

public data class SockaddrIn60(
    public var sin6ScopeId: UInt = 0u,
    public var sin6ScopeStruct: ScopeId = ScopeId(),
)

public class SockaddrIn6Pair internal constructor(
    sourceAddressCtorArg: MutPtr<SockaddrIn6>,
    destinationAddressCtorArg: MutPtr<SockaddrIn6>,
) {
    public var sourceAddress: MutPtr<SockaddrIn6> = sourceAddressCtorArg
        internal set

    public var destinationAddress: MutPtr<SockaddrIn6> = destinationAddressCtorArg
        internal set

    public constructor() : this(
        sourceAddressCtorArg = MutPtr(0L),
        destinationAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<SockaddrIn6> = this.sourceAddress

    public operator fun component2(): MutPtr<SockaddrIn6> = this.destinationAddress

    public fun copy(sourceAddress: MutPtr<SockaddrIn6> = this.sourceAddress, destinationAddress: MutPtr<SockaddrIn6> = this.destinationAddress): SockaddrIn6Pair = SockaddrIn6Pair(sourceAddressCtorArg = sourceAddress, destinationAddressCtorArg = destinationAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrIn6Pair) return false
        if (this.sourceAddress != other.sourceAddress) return false
        if (this.destinationAddress != other.destinationAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sourceAddress.hashCode()
        result = 31 * result + this.destinationAddress.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrIn6Pair> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrIn6Pair> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SockaddrIn6Pair =
                    SockaddrIn6Pair(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SockaddrIn6>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SockaddrIn6>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SockaddrIn6Pair) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SockaddrIn6>(64)
                    ).writeNative(addr, value.sourceAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SockaddrIn6>(64)
                    ).writeNative(addr + 8L, value.destinationAddress)
                }
            }

        public operator fun invoke(
            sourceAddress: MutPtr<SockaddrIn6> = MutPtr(0L),
            destinationAddress: MutPtr<SockaddrIn6> = MutPtr(0L),
        ): SockaddrIn6Pair =
            SockaddrIn6Pair(
                sourceAddressCtorArg = sourceAddress,
                destinationAddressCtorArg = destinationAddress,
            )
    }
}

public data class SockaddrIn6W2ksp1(
    public var sin6Family: Short = 0,
    public var sin6Port: UShort = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
    public var sin6ScopeId: UInt = 0u,
)

public data class SockaddrInet(
    public var ipv4: SockaddrIn = SockaddrIn(),
    public var ipv6: SockaddrIn6 = SockaddrIn6(),
    public var siFamily: AddressFamily = 0u,
)

public data class SockaddrIpx(
    public var saFamily: Short = 0,
    public var saNetnum: ByteArray = ByteArray(4),
    public var saNodenum: ByteArray = ByteArray(6),
    public var saSocket: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrIpx) return false
        if (this.saFamily != other.saFamily) return false
        if (!this.saNetnum.contentEquals(other.saNetnum)) return false
        if (!this.saNodenum.contentEquals(other.saNodenum)) return false
        if (this.saSocket != other.saSocket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saFamily.hashCode()
        result = 31 * result + this.saNetnum.contentHashCode()
        result = 31 * result + this.saNodenum.contentHashCode()
        result = 31 * result + this.saSocket.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrIpx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrIpx> {
                override val sizeBytes: Long = 14L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): SockaddrIpx =
                    SockaddrIpx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (4).toInt())
                        ).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (6).toInt())
                        ).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SockaddrIpx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.saFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (4).toInt())
                    ).writeNative(addr + 2L, value.saNetnum)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (6).toInt())
                    ).writeNative(addr + 6L, value.saNodenum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.saSocket)
                }
            }
    }
}

public data class SockaddrIrda(
    public var irdaAddressFamily: UShort = 0u,
    public var irdaDeviceID: UByteArray = UByteArray(4),
    public var irdaServiceName: ByteArray = ByteArray(25),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrIrda) return false
        if (this.irdaAddressFamily != other.irdaAddressFamily) return false
        if (!this.irdaDeviceID.contentEquals(other.irdaDeviceID)) return false
        if (!this.irdaServiceName.contentEquals(other.irdaServiceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.irdaAddressFamily.hashCode()
        result = 31 * result + this.irdaDeviceID.contentHashCode()
        result = 31 * result + this.irdaServiceName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrIrda> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrIrda> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): SockaddrIrda =
                    SockaddrIrda(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (25).toInt())
                        ).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: SockaddrIrda) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.irdaAddressFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 2L, value.irdaDeviceID)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (25).toInt())
                    ).writeNative(addr + 6L, value.irdaServiceName)
                }
            }
    }
}

public data class SockaddrNb(
    public var snbFamily: Short = 0,
    public var snbType: UShort = 0u,
    public var snbName: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrNb) return false
        if (this.snbFamily != other.snbFamily) return false
        if (this.snbType != other.snbType) return false
        if (!this.snbName.contentEquals(other.snbName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.snbFamily.hashCode()
        result = 31 * result + this.snbType.hashCode()
        result = 31 * result + this.snbName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrNb> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrNb> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): SockaddrNb =
                    SockaddrNb(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SockaddrNb) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.snbFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.snbType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                    ).writeNative(addr + 4L, value.snbName)
                }
            }
    }
}

public data class SockaddrStorage(
    public var ssFamily: AddressFamily = 0u,
    public var ssPad1: ByteArray = ByteArray(6),
    public var ssAlign: Long = 0L,
    public var ssPad2: ByteArray = ByteArray(112),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrStorage) return false
        if (this.ssFamily != other.ssFamily) return false
        if (!this.ssPad1.contentEquals(other.ssPad1)) return false
        if (this.ssAlign != other.ssAlign) return false
        if (!this.ssPad2.contentEquals(other.ssPad2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssFamily.hashCode()
        result = 31 * result + this.ssPad1.contentHashCode()
        result = 31 * result + this.ssAlign.hashCode()
        result = 31 * result + this.ssPad2.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrStorage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrStorage> {
                override val sizeBytes: Long = 128L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SockaddrStorage =
                    SockaddrStorage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (6).toInt())
                        ).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (112).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SockaddrStorage) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.ssFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (6).toInt())
                    ).writeNative(addr + 2L, value.ssPad1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.ssAlign)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (112).toInt())
                    ).writeNative(addr + 16L, value.ssPad2)
                }
            }
    }
}

public data class SockaddrStorageXp(
    public var ssFamily: Short = 0,
    public var ssPad1: ByteArray = ByteArray(6),
    public var ssAlign: Long = 0L,
    public var ssPad2: ByteArray = ByteArray(112),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrStorageXp) return false
        if (this.ssFamily != other.ssFamily) return false
        if (!this.ssPad1.contentEquals(other.ssPad1)) return false
        if (this.ssAlign != other.ssAlign) return false
        if (!this.ssPad2.contentEquals(other.ssPad2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssFamily.hashCode()
        result = 31 * result + this.ssPad1.contentHashCode()
        result = 31 * result + this.ssAlign.hashCode()
        result = 31 * result + this.ssPad2.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrStorageXp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrStorageXp> {
                override val sizeBytes: Long = 128L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SockaddrStorageXp =
                    SockaddrStorageXp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (6).toInt())
                        ).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (112).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SockaddrStorageXp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.ssFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (6).toInt())
                    ).writeNative(addr + 2L, value.ssPad1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.ssAlign)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (112).toInt())
                    ).writeNative(addr + 16L, value.ssPad2)
                }
            }
    }
}

public data class SockaddrTp(
    public var tpFamily: UShort = 0u,
    public var tpAddrType: UShort = 0u,
    public var tpTaddrLen: UShort = 0u,
    public var tpTselLen: UShort = 0u,
    public var tpAddr: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrTp) return false
        if (this.tpFamily != other.tpFamily) return false
        if (this.tpAddrType != other.tpAddrType) return false
        if (this.tpTaddrLen != other.tpTaddrLen) return false
        if (this.tpTselLen != other.tpTselLen) return false
        if (!this.tpAddr.contentEquals(other.tpAddr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tpFamily.hashCode()
        result = 31 * result + this.tpAddrType.hashCode()
        result = 31 * result + this.tpTaddrLen.hashCode()
        result = 31 * result + this.tpTselLen.hashCode()
        result = 31 * result + this.tpAddr.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrTp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrTp> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): SockaddrTp =
                    SockaddrTp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SockaddrTp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.tpFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.tpAddrType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.tpTaddrLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.tpTselLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                    ).writeNative(addr + 8L, value.tpAddr)
                }
            }
    }
}

public data class SockaddrUn(
    public var sunFamily: AddressFamily = 0u,
    public var sunPath: ByteArray = ByteArray(108),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrUn) return false
        if (this.sunFamily != other.sunFamily) return false
        if (!this.sunPath.contentEquals(other.sunPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sunFamily.hashCode()
        result = 31 * result + this.sunPath.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrUn> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrUn> {
                override val sizeBytes: Long = 110L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): SockaddrUn =
                    SockaddrUn(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (108).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: SockaddrUn) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sunFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (108).toInt())
                    ).writeNative(addr + 2L, value.sunPath)
                }
            }
    }
}

public data class SockaddrVns(
    public var sinFamily: UShort = 0u,
    public var netAddress: UByteArray = UByteArray(4),
    public var subnetAddr: UByteArray = UByteArray(2),
    public var port: UByteArray = UByteArray(2),
    public var hops: UByte = 0u,
    public var filler: UByteArray = UByteArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrVns) return false
        if (this.sinFamily != other.sinFamily) return false
        if (!this.netAddress.contentEquals(other.netAddress)) return false
        if (!this.subnetAddr.contentEquals(other.subnetAddr)) return false
        if (!this.port.contentEquals(other.port)) return false
        if (this.hops != other.hops) return false
        if (!this.filler.contentEquals(other.filler)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sinFamily.hashCode()
        result = 31 * result + this.netAddress.contentHashCode()
        result = 31 * result + this.subnetAddr.contentHashCode()
        result = 31 * result + this.port.contentHashCode()
        result = 31 * result + this.hops.hashCode()
        result = 31 * result + this.filler.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrVns> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrVns> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): SockaddrVns =
                    SockaddrVns(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (5).toInt())
                        ).readNative(addr + 11L),
                    )
                override fun writeNative(addr: Long, value: SockaddrVns) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sinFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 2L, value.netAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 6L, value.subnetAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 8L, value.port)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.hops)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (5).toInt())
                    ).writeNative(addr + 11L, value.filler)
                }
            }
    }
}

public class SocketAddress internal constructor(
    lpSockaddrCtorArg: MutPtr<Sockaddr>,
    public var iSockaddrLength: Int,
) {
    public var lpSockaddr: MutPtr<Sockaddr> = lpSockaddrCtorArg
        internal set

    public constructor() : this(
        lpSockaddrCtorArg = MutPtr(0L),
        iSockaddrLength = 0,
    )

    public operator fun component1(): MutPtr<Sockaddr> = this.lpSockaddr

    public operator fun component2(): Int = this.iSockaddrLength

    public fun copy(lpSockaddr: MutPtr<Sockaddr> = this.lpSockaddr, iSockaddrLength: Int = this.iSockaddrLength): SocketAddress = SocketAddress(lpSockaddrCtorArg = lpSockaddr, iSockaddrLength = iSockaddrLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SocketAddress) return false
        if (this.lpSockaddr != other.lpSockaddr) return false
        if (this.iSockaddrLength != other.iSockaddrLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpSockaddr.hashCode()
        result = 31 * result + this.iSockaddrLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SocketAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SocketAddress> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SocketAddress =
                    SocketAddress(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Sockaddr>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SocketAddress) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Sockaddr>(64)
                    ).writeNative(addr, value.lpSockaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.iSockaddrLength)
                }
            }

        public operator fun invoke(
            lpSockaddr: MutPtr<Sockaddr> = MutPtr(0L),
            iSockaddrLength: Int = 0,
        ): SocketAddress =
            SocketAddress(
                lpSockaddrCtorArg = lpSockaddr,
                iSockaddrLength = iSockaddrLength,
            )
    }
}

public data class SocketAddressList(
    public var iAddressCount: Int = 0,
    public var address: List<SocketAddress> = List(1) { SocketAddress() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SocketAddressList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SocketAddressList> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SocketAddressList =
                    SocketAddressList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(SocketAddress.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SocketAddressList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.iAddressCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(SocketAddress.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.address)
                }
            }
    }
}

public data class SocketPeerTargetName(
    public var securityProtocol: SocketSecurityProtocol = 0,
    public var peerAddress: SockaddrStorage = SockaddrStorage(),
    public var peerTargetNameStringLen: UInt = 0u,
    public var allStrings: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SocketPeerTargetName) return false
        if (this.securityProtocol != other.securityProtocol) return false
        if (this.peerAddress != other.peerAddress) return false
        if (this.peerTargetNameStringLen != other.peerTargetNameStringLen) return false
        if (!this.allStrings.contentEquals(other.allStrings)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityProtocol.hashCode()
        result = 31 * result + this.peerAddress.hashCode()
        result = 31 * result + this.peerTargetNameStringLen.hashCode()
        result = 31 * result + this.allStrings.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SocketPeerTargetName> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SocketPeerTargetName> {
                override val sizeBytes: Long = 144L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SocketPeerTargetName =
                    SocketPeerTargetName(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (SockaddrStorage.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 140L),
                    )
                override fun writeNative(addr: Long, value: SocketPeerTargetName) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.securityProtocol)
                    (SockaddrStorage.typeLayout()).writeNative(addr + 8L, value.peerAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.peerTargetNameStringLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 140L, value.allStrings)
                }
            }
    }
}

public data class SocketProcessorAffinity(
    public var processor: ProcessorNumber = ProcessorNumber(),
    public var numaNodeId: UShort = 0u,
    public var reserved: UShort = 0u,
)

public data class SocketSecurityQueryInfo(
    public var securityProtocol: SocketSecurityProtocol = 0,
    public var flags: UInt = 0u,
    public var peerApplicationAccessTokenHandle: ULong = 0uL,
    public var peerMachineAccessTokenHandle: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SocketSecurityQueryInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SocketSecurityQueryInfo> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SocketSecurityQueryInfo =
                    SocketSecurityQueryInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SocketSecurityQueryInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.securityProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.peerApplicationAccessTokenHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.peerMachineAccessTokenHandle)
                }
            }
    }
}

public data class SocketSecurityQueryInfoIpsec2(
    public var securityProtocol: SocketSecurityProtocol = 0,
    public var flags: UInt = 0u,
    public var peerApplicationAccessTokenHandle: ULong = 0uL,
    public var peerMachineAccessTokenHandle: ULong = 0uL,
    public var mmSaId: ULong = 0uL,
    public var qmSaId: ULong = 0uL,
    public var negotiationWinerr: UInt = 0u,
    public var saLookupContext: Guid = Guid(),
)

public data class SocketSecurityQueryTemplate(
    public var securityProtocol: SocketSecurityProtocol = 0,
    public var peerAddress: SockaddrStorage = SockaddrStorage(),
    public var peerTokenAccessMask: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SocketSecurityQueryTemplate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SocketSecurityQueryTemplate> {
                override val sizeBytes: Long = 144L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SocketSecurityQueryTemplate =
                    SocketSecurityQueryTemplate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (SockaddrStorage.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                    )
                override fun writeNative(addr: Long, value: SocketSecurityQueryTemplate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.securityProtocol)
                    (SockaddrStorage.typeLayout()).writeNative(addr + 8L, value.peerAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.peerTokenAccessMask)
                }
            }
    }
}

public data class SocketSecurityQueryTemplateIpsec2(
    public var securityProtocol: SocketSecurityProtocol = 0,
    public var peerAddress: SockaddrStorage = SockaddrStorage(),
    public var peerTokenAccessMask: UInt = 0u,
    public var flags: UInt = 0u,
    public var fieldMask: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SocketSecurityQueryTemplateIpsec2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SocketSecurityQueryTemplateIpsec2> {
                override val sizeBytes: Long = 152L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SocketSecurityQueryTemplateIpsec2 =
                    SocketSecurityQueryTemplateIpsec2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (SockaddrStorage.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 144L),
                    )
                override fun writeNative(addr: Long, value: SocketSecurityQueryTemplateIpsec2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.securityProtocol)
                    (SockaddrStorage.typeLayout()).writeNative(addr + 8L, value.peerAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.peerTokenAccessMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 144L, value.fieldMask)
                }
            }
    }
}

public data class SocketSecuritySettings(
    public var securityProtocol: SocketSecurityProtocol = 0,
    public var securityFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SocketSecuritySettings> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SocketSecuritySettings> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SocketSecuritySettings =
                    SocketSecuritySettings(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SocketSecuritySettings) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.securityProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.securityFlags)
                }
            }
    }
}
