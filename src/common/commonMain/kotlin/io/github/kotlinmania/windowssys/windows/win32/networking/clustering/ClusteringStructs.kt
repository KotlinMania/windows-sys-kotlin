@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.clustering

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityDescriptorRelative

public class ClresCallbackFunctionTable(
    public var logEvent: PlogEventRoutine = null,
    public var setResourceStatusEx: PsetResourceStatusRoutineEx = null,
    public var setResourceLockedMode: PsetResourceLockedModeRoutine = null,
    public var signalFailure: PsignalFailureRoutine = null,
    public var setResourceInMemoryNodeLocalProperties: PsetResourceInmemoryNodelocalPropertiesRoutine = null,
    public var endControlCall: PendControlCall = null,
    public var endTypeControlCall: PendTypeControlCall = null,
    public var extendControlCall: PextendResControlCall = null,
    public var extendTypeControlCall: PextendResTypeControlCall = null,
    public var raiseResTypeNotification: PraiseResTypeNotification = null,
    public var changeResourceProcessForDumps: PchangeResourceProcessForDumps = null,
    public var changeResTypeProcessForDumps: PchangeResTypeProcessForDumps = null,
    public var setInternalState: PsetInternalState = null,
    public var setResourceLockedModeEx: PsetResourceLockedModeExRoutine = null,
    public var requestDump: PrequestDumpRoutine = null,
    public var setResourceWprPolicy: PsetResourceWprPolicyRoutine = null,
    public var armWprWatchdogForCurrentResourceCall: ParmWprWatchdogForCurrentResourceCallRoutine = null,
)

public data class ClresFunctionTable(
    public var tableSize: UInt = 0u,
    public var version: UInt = 0u,
    public var anonymous: ClresFunctionTable0 = ClresFunctionTable0(),
)

public data class ClresFunctionTable0(
    public var v1Functions: ClresV1Functions = ClresV1Functions(),
    public var v2Functions: ClresV2Functions = ClresV2Functions(),
    public var v3Functions: ClresV3Functions = ClresV3Functions(),
    public var v4Functions: ClresV4Functions = ClresV4Functions(),
)

public data class ClresV1Functions(
    public var open: PopenRoutine = null,
    public var close: PcloseRoutine = null,
    public var online: PonlineRoutine = null,
    public var offline: PofflineRoutine = null,
    public var terminate: PterminateRoutine = null,
    public var looksAlive: PlooksAliveRoutine = null,
    public var isAlive: PisAliveRoutine = null,
    public var arbitrate: ParbitrateRoutine = null,
    public var release: PreleaseRoutine = null,
    public var resourceControl: PresourceControlRoutine = null,
    public var resourceTypeControl: PresourceTypeControlRoutine = null,
)

public data class ClresV2Functions(
    public var open: PopenV2Routine = null,
    public var close: PcloseRoutine = null,
    public var online: PonlineV2Routine = null,
    public var offline: PofflineV2Routine = null,
    public var terminate: PterminateRoutine = null,
    public var looksAlive: PlooksAliveRoutine = null,
    public var isAlive: PisAliveRoutine = null,
    public var arbitrate: ParbitrateRoutine = null,
    public var release: PreleaseRoutine = null,
    public var resourceControl: PresourceControlRoutine = null,
    public var resourceTypeControl: PresourceTypeControlRoutine = null,
    public var cancel: PcancelRoutine = null,
)

public data class ClresV3Functions(
    public var open: PopenV2Routine = null,
    public var close: PcloseRoutine = null,
    public var online: PonlineV2Routine = null,
    public var offline: PofflineV2Routine = null,
    public var terminate: PterminateRoutine = null,
    public var looksAlive: PlooksAliveRoutine = null,
    public var isAlive: PisAliveRoutine = null,
    public var arbitrate: ParbitrateRoutine = null,
    public var release: PreleaseRoutine = null,
    public var beginResourceControl: PbeginRescallRoutine = null,
    public var beginResourceTypeControl: PbeginRestypecallRoutine = null,
    public var cancel: PcancelRoutine = null,
)

public data class ClresV4Functions(
    public var open: PopenV2Routine = null,
    public var close: PcloseRoutine = null,
    public var online: PonlineV2Routine = null,
    public var offline: PofflineV2Routine = null,
    public var terminate: PterminateRoutine = null,
    public var looksAlive: PlooksAliveRoutine = null,
    public var isAlive: PisAliveRoutine = null,
    public var arbitrate: ParbitrateRoutine = null,
    public var release: PreleaseRoutine = null,
    public var beginResourceControl: PbeginRescallRoutine = null,
    public var beginResourceTypeControl: PbeginRestypecallRoutine = null,
    public var cancel: PcancelRoutine = null,
    public var beginResourceControlAsUser: PbeginRescallAsUserRoutine = null,
    public var beginResourceTypeControlAsUser: PbeginRestypecallAsUserRoutine = null,
)

public class ClusapiReasonHandler internal constructor(
    lpParameterCtorArg: MutPtr,
    public var pfnHandler: PclusapiPfnReasonHandler,
) {
    public var lpParameter: MutPtr = lpParameterCtorArg
        internal set

    public constructor() : this(
        lpParameterCtorArg = MutPtr(0L),
        pfnHandler = null,
    )

    public operator fun component1(): MutPtr = this.lpParameter

    public operator fun component2(): PclusapiPfnReasonHandler = this.pfnHandler

    public fun copy(lpParameter: MutPtr = this.lpParameter, pfnHandler: PclusapiPfnReasonHandler = this.pfnHandler): ClusapiReasonHandler = ClusapiReasonHandler(lpParameterCtorArg = lpParameter, pfnHandler = pfnHandler)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusapiReasonHandler) return false
        if (this.lpParameter != other.lpParameter) return false
        if (this.pfnHandler != other.pfnHandler) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpParameter.hashCode()
        result = 31 * result + this.pfnHandler.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpParameter: MutPtr = MutPtr(0L),
            pfnHandler: PclusapiPfnReasonHandler = null,
        ): ClusapiReasonHandler =
            ClusapiReasonHandler(
                lpParameterCtorArg = lpParameter,
                pfnHandler = pfnHandler,
            )
    }
}

public data class ClusctlGroupGetLastMoveTimeOutput(
    public var getTickCount64: ULong = 0uL,
    public var getSystemTime: Systemtime = Systemtime(),
    public var nodeId: UInt = 0u,
)

public data class ClusctlResourceStateChangeReasonStruct(
    public var dwSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var eReason: ClusterResourceStateChangeReason = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusctlResourceStateChangeReasonStruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusctlResourceStateChangeReasonStruct> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ClusctlResourceStateChangeReasonStruct =
                    ClusctlResourceStateChangeReasonStruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ClusctlResourceStateChangeReasonStruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.eReason)
                }
            }
    }
}

public data class ClusctlResourceTypeStorageGetAvailableDisksEx2Input(
    public var dwFlags: UInt = 0u,
    public var guidPoolFilter: Guid = Guid(),
)

public data class CluspropBinary(
    public var base: CluspropValue = CluspropValue(),
    public var rgb: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CluspropBinary) return false
        if (this.base != other.base) return false
        if (!this.rgb.contentEquals(other.rgb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.base.hashCode()
        result = 31 * result + this.rgb.contentHashCode()
        return result
    }
}

public class CluspropBufferHelper internal constructor(
    pbCtorArg: MutPtr,
    pwCtorArg: MutPtr,
    pdwCtorArg: MutPtr,
    plCtorArg: MutPtr,
    pszCtorArg: Pwstr,
    pListCtorArg: MutPtr,
    pSyntaxCtorArg: MutPtr,
    pNameCtorArg: MutPtr,
    pValueCtorArg: MutPtr,
    pBinaryValueCtorArg: MutPtr,
    pWordValueCtorArg: MutPtr,
    pDwordValueCtorArg: MutPtr,
    pLongValueCtorArg: MutPtr,
    pULargeIntegerValueCtorArg: MutPtr,
    pLargeIntegerValueCtorArg: MutPtr,
    pStringValueCtorArg: MutPtr,
    pMultiSzValueCtorArg: MutPtr,
    pSecurityDescriptorCtorArg: MutPtr,
    pResourceClassValueCtorArg: MutPtr,
    pResourceClassInfoValueCtorArg: MutPtr,
    pDiskSignatureValueCtorArg: MutPtr,
    pScsiAddressValueCtorArg: MutPtr,
    pDiskNumberValueCtorArg: MutPtr,
    pPartitionInfoValueCtorArg: MutPtr,
    pRequiredDependencyValueCtorArg: MutPtr,
    pPartitionInfoValueExCtorArg: MutPtr,
    pPartitionInfoValueEx2CtorArg: MutPtr,
    pFileTimeValueCtorArg: MutPtr,
) {
    public var pb: MutPtr = pbCtorArg
        internal set

    public var pw: MutPtr = pwCtorArg
        internal set

    public var pdw: MutPtr = pdwCtorArg
        internal set

    public var pl: MutPtr = plCtorArg
        internal set

    public var psz: Pwstr = pszCtorArg
        internal set

    public var pList: MutPtr = pListCtorArg
        internal set

    public var pSyntax: MutPtr = pSyntaxCtorArg
        internal set

    public var pName: MutPtr = pNameCtorArg
        internal set

    public var pValue: MutPtr = pValueCtorArg
        internal set

    public var pBinaryValue: MutPtr = pBinaryValueCtorArg
        internal set

    public var pWordValue: MutPtr = pWordValueCtorArg
        internal set

    public var pDwordValue: MutPtr = pDwordValueCtorArg
        internal set

    public var pLongValue: MutPtr = pLongValueCtorArg
        internal set

    public var pULargeIntegerValue: MutPtr = pULargeIntegerValueCtorArg
        internal set

    public var pLargeIntegerValue: MutPtr = pLargeIntegerValueCtorArg
        internal set

    public var pStringValue: MutPtr = pStringValueCtorArg
        internal set

    public var pMultiSzValue: MutPtr = pMultiSzValueCtorArg
        internal set

    public var pSecurityDescriptor: MutPtr = pSecurityDescriptorCtorArg
        internal set

    public var pResourceClassValue: MutPtr = pResourceClassValueCtorArg
        internal set

    public var pResourceClassInfoValue: MutPtr = pResourceClassInfoValueCtorArg
        internal set

    public var pDiskSignatureValue: MutPtr = pDiskSignatureValueCtorArg
        internal set

    public var pScsiAddressValue: MutPtr = pScsiAddressValueCtorArg
        internal set

    public var pDiskNumberValue: MutPtr = pDiskNumberValueCtorArg
        internal set

    public var pPartitionInfoValue: MutPtr = pPartitionInfoValueCtorArg
        internal set

    public var pRequiredDependencyValue: MutPtr = pRequiredDependencyValueCtorArg
        internal set

    public var pPartitionInfoValueEx: MutPtr = pPartitionInfoValueExCtorArg
        internal set

    public var pPartitionInfoValueEx2: MutPtr = pPartitionInfoValueEx2CtorArg
        internal set

    public var pFileTimeValue: MutPtr = pFileTimeValueCtorArg
        internal set

    public constructor() : this(
        pbCtorArg = MutPtr(0L),
        pwCtorArg = MutPtr(0L),
        pdwCtorArg = MutPtr(0L),
        plCtorArg = MutPtr(0L),
        pszCtorArg = MutPtr(0L),
        pListCtorArg = MutPtr(0L),
        pSyntaxCtorArg = MutPtr(0L),
        pNameCtorArg = MutPtr(0L),
        pValueCtorArg = MutPtr(0L),
        pBinaryValueCtorArg = MutPtr(0L),
        pWordValueCtorArg = MutPtr(0L),
        pDwordValueCtorArg = MutPtr(0L),
        pLongValueCtorArg = MutPtr(0L),
        pULargeIntegerValueCtorArg = MutPtr(0L),
        pLargeIntegerValueCtorArg = MutPtr(0L),
        pStringValueCtorArg = MutPtr(0L),
        pMultiSzValueCtorArg = MutPtr(0L),
        pSecurityDescriptorCtorArg = MutPtr(0L),
        pResourceClassValueCtorArg = MutPtr(0L),
        pResourceClassInfoValueCtorArg = MutPtr(0L),
        pDiskSignatureValueCtorArg = MutPtr(0L),
        pScsiAddressValueCtorArg = MutPtr(0L),
        pDiskNumberValueCtorArg = MutPtr(0L),
        pPartitionInfoValueCtorArg = MutPtr(0L),
        pRequiredDependencyValueCtorArg = MutPtr(0L),
        pPartitionInfoValueExCtorArg = MutPtr(0L),
        pPartitionInfoValueEx2CtorArg = MutPtr(0L),
        pFileTimeValueCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            pb: MutPtr = MutPtr(0L),
            pw: MutPtr = MutPtr(0L),
            pdw: MutPtr = MutPtr(0L),
            pl: MutPtr = MutPtr(0L),
            psz: Pwstr = MutPtr(0L),
            pList: MutPtr = MutPtr(0L),
            pSyntax: MutPtr = MutPtr(0L),
            pName: MutPtr = MutPtr(0L),
            pValue: MutPtr = MutPtr(0L),
            pBinaryValue: MutPtr = MutPtr(0L),
            pWordValue: MutPtr = MutPtr(0L),
            pDwordValue: MutPtr = MutPtr(0L),
            pLongValue: MutPtr = MutPtr(0L),
            pULargeIntegerValue: MutPtr = MutPtr(0L),
            pLargeIntegerValue: MutPtr = MutPtr(0L),
            pStringValue: MutPtr = MutPtr(0L),
            pMultiSzValue: MutPtr = MutPtr(0L),
            pSecurityDescriptor: MutPtr = MutPtr(0L),
            pResourceClassValue: MutPtr = MutPtr(0L),
            pResourceClassInfoValue: MutPtr = MutPtr(0L),
            pDiskSignatureValue: MutPtr = MutPtr(0L),
            pScsiAddressValue: MutPtr = MutPtr(0L),
            pDiskNumberValue: MutPtr = MutPtr(0L),
            pPartitionInfoValue: MutPtr = MutPtr(0L),
            pRequiredDependencyValue: MutPtr = MutPtr(0L),
            pPartitionInfoValueEx: MutPtr = MutPtr(0L),
            pPartitionInfoValueEx2: MutPtr = MutPtr(0L),
            pFileTimeValue: MutPtr = MutPtr(0L),
        ): CluspropBufferHelper =
            CluspropBufferHelper(
                pbCtorArg = pb,
                pwCtorArg = pw,
                pdwCtorArg = pdw,
                plCtorArg = pl,
                pszCtorArg = psz,
                pListCtorArg = pList,
                pSyntaxCtorArg = pSyntax,
                pNameCtorArg = pName,
                pValueCtorArg = pValue,
                pBinaryValueCtorArg = pBinaryValue,
                pWordValueCtorArg = pWordValue,
                pDwordValueCtorArg = pDwordValue,
                pLongValueCtorArg = pLongValue,
                pULargeIntegerValueCtorArg = pULargeIntegerValue,
                pLargeIntegerValueCtorArg = pLargeIntegerValue,
                pStringValueCtorArg = pStringValue,
                pMultiSzValueCtorArg = pMultiSzValue,
                pSecurityDescriptorCtorArg = pSecurityDescriptor,
                pResourceClassValueCtorArg = pResourceClassValue,
                pResourceClassInfoValueCtorArg = pResourceClassInfoValue,
                pDiskSignatureValueCtorArg = pDiskSignatureValue,
                pScsiAddressValueCtorArg = pScsiAddressValue,
                pDiskNumberValueCtorArg = pDiskNumberValue,
                pPartitionInfoValueCtorArg = pPartitionInfoValue,
                pRequiredDependencyValueCtorArg = pRequiredDependencyValue,
                pPartitionInfoValueExCtorArg = pPartitionInfoValueEx,
                pPartitionInfoValueEx2CtorArg = pPartitionInfoValueEx2,
                pFileTimeValueCtorArg = pFileTimeValue,
            )
    }
}

public data class CluspropDword(
    public var base: CluspropValue = CluspropValue(),
    public var dw: UInt = 0u,
)

public data class CluspropFiletime(
    public var base: CluspropValue = CluspropValue(),
    public var ft: Filetime = Filetime(),
)

public data class CluspropFtsetInfo(
    public var base: CluspropValue = CluspropValue(),
    public var base2: ClusFtsetInfo = ClusFtsetInfo(),
)

public data class CluspropLargeInteger(
    public var base: CluspropValue = CluspropValue(),
    public var li: Long = 0L,
)

public data class CluspropList(
    public var nPropertyCount: UInt = 0u,
    public var propertyName: CluspropSz = CluspropSz(),
)

public data class CluspropLong(
    public var base: CluspropValue = CluspropValue(),
    public var l: Int = 0,
)

public data class CluspropPartitionInfo(
    public var base: CluspropValue = CluspropValue(),
    public var base2: ClusPartitionInfo = ClusPartitionInfo(),
)

public data class CluspropPartitionInfoEx(
    public var base: CluspropValue = CluspropValue(),
    public var base2: ClusPartitionInfoEx = ClusPartitionInfoEx(),
)

public data class CluspropPartitionInfoEx2(
    public var base: CluspropPartitionInfoEx = CluspropPartitionInfoEx(),
    public var base2: ClusPartitionInfoEx2 = ClusPartitionInfoEx2(),
)

public data class CluspropRequiredDependency(
    public var value: CluspropValue = CluspropValue(),
    public var resClass: CluspropResourceClass = CluspropResourceClass(),
    public var resTypeName: CluspropSz = CluspropSz(),
)

public data class CluspropResourceClass(
    public var base: CluspropValue = CluspropValue(),
    public var rc: ClusterResourceClass = 0,
)

public data class CluspropResourceClassInfo(
    public var base: CluspropValue = CluspropValue(),
    public var base2: ClusResourceClassInfo = ClusResourceClassInfo(),
)

public data class CluspropScsiAddress(
    public var base: CluspropValue = CluspropValue(),
    public var base2: ClusScsiAddress = ClusScsiAddress(),
)

public data class CluspropSecurityDescriptor(
    public var base: CluspropValue = CluspropValue(),
    public var anonymous: CluspropSecurityDescriptor0 = CluspropSecurityDescriptor0(),
)

public data class CluspropSecurityDescriptor0(
    public var sd: SecurityDescriptorRelative = SecurityDescriptorRelative(),
    public var rgbSecurityDescriptor: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CluspropSecurityDescriptor0) return false
        if (this.sd != other.sd) return false
        if (!this.rgbSecurityDescriptor.contentEquals(other.rgbSecurityDescriptor)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sd.hashCode()
        result = 31 * result + this.rgbSecurityDescriptor.contentHashCode()
        return result
    }
}

public data class CluspropSyntax(
    public var dw: UInt = 0u,
    public var anonymous: CluspropSyntax0 = CluspropSyntax0(),
)

public data class CluspropSyntax0(
    public var wFormat: UShort = 0u,
    public var wType: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CluspropSyntax0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CluspropSyntax0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CluspropSyntax0 =
                    CluspropSyntax0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: CluspropSyntax0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wType)
                }
            }
    }
}

public data class CluspropSz(
    public var base: CluspropValue = CluspropValue(),
    public var sz: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CluspropSz) return false
        if (this.base != other.base) return false
        if (!this.sz.contentEquals(other.sz)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.base.hashCode()
        result = 31 * result + this.sz.contentHashCode()
        return result
    }
}

public data class CluspropUlargeInteger(
    public var base: CluspropValue = CluspropValue(),
    public var li: ULong = 0uL,
)

public data class CluspropValue(
    public var syntax: CluspropSyntax = CluspropSyntax(),
    public var cbLength: UInt = 0u,
)

public data class CluspropWord(
    public var base: CluspropValue = CluspropValue(),
    public var w: UShort = 0u,
)

public data class Clusterversioninfo(
    public var dwVersionInfoSize: UInt = 0u,
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var buildNumber: UShort = 0u,
    public var szVendorId: UShortArray = UShortArray(64),
    public var szCSDVersion: UShortArray = UShortArray(64),
    public var dwClusterHighestVersion: UInt = 0u,
    public var dwClusterLowestVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Clusterversioninfo) return false
        if (this.dwVersionInfoSize != other.dwVersionInfoSize) return false
        if (this.majorVersion != other.majorVersion) return false
        if (this.minorVersion != other.minorVersion) return false
        if (this.buildNumber != other.buildNumber) return false
        if (!this.szVendorId.contentEquals(other.szVendorId)) return false
        if (!this.szCSDVersion.contentEquals(other.szCSDVersion)) return false
        if (this.dwClusterHighestVersion != other.dwClusterHighestVersion) return false
        if (this.dwClusterLowestVersion != other.dwClusterLowestVersion) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwReserved != other.dwReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersionInfoSize.hashCode()
        result = 31 * result + this.majorVersion.hashCode()
        result = 31 * result + this.minorVersion.hashCode()
        result = 31 * result + this.buildNumber.hashCode()
        result = 31 * result + this.szVendorId.contentHashCode()
        result = 31 * result + this.szCSDVersion.contentHashCode()
        result = 31 * result + this.dwClusterHighestVersion.hashCode()
        result = 31 * result + this.dwClusterLowestVersion.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Clusterversioninfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Clusterversioninfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 284L
                override fun readNative(addr: Long): Clusterversioninfo =
                    Clusterversioninfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 10L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 138L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 268L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 272L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 276L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 280L),
                    )
                override fun writeNative(addr: Long, value: Clusterversioninfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersionInfoSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.buildNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 10L, value.szVendorId.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 138L, value.szCSDVersion.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 268L, value.dwClusterHighestVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 272L, value.dwClusterLowestVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 276L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 280L, value.dwReserved)
                }
            }
    }
}

public data class ClusterversioninfoNt4(
    public var dwVersionInfoSize: UInt = 0u,
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var buildNumber: UShort = 0u,
    public var szVendorId: UShortArray = UShortArray(64),
    public var szCSDVersion: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterversioninfoNt4) return false
        if (this.dwVersionInfoSize != other.dwVersionInfoSize) return false
        if (this.majorVersion != other.majorVersion) return false
        if (this.minorVersion != other.minorVersion) return false
        if (this.buildNumber != other.buildNumber) return false
        if (!this.szVendorId.contentEquals(other.szVendorId)) return false
        if (!this.szCSDVersion.contentEquals(other.szCSDVersion)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersionInfoSize.hashCode()
        result = 31 * result + this.majorVersion.hashCode()
        result = 31 * result + this.minorVersion.hashCode()
        result = 31 * result + this.buildNumber.hashCode()
        result = 31 * result + this.szVendorId.contentHashCode()
        result = 31 * result + this.szCSDVersion.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterversioninfoNt4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterversioninfoNt4> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 268L
                override fun readNative(addr: Long): ClusterversioninfoNt4 =
                    ClusterversioninfoNt4(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 10L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 138L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ClusterversioninfoNt4) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersionInfoSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.buildNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 10L, value.szVendorId.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 138L, value.szCSDVersion.toList())
                }
            }
    }
}

public data class ClusterAvailabilitySetConfig(
    public var dwVersion: UInt = 0u,
    public var dwUpdateDomains: UInt = 0u,
    public var dwFaultDomains: UInt = 0u,
    public var bReserveSpareNode: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterAvailabilitySetConfig> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterAvailabilitySetConfig> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ClusterAvailabilitySetConfig =
                    ClusterAvailabilitySetConfig(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ClusterAvailabilitySetConfig) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwUpdateDomains)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFaultDomains)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.bReserveSpareNode)
                }
            }
    }
}

public class ClusterBatchCommand internal constructor(
    public var command: ClusterRegCommand,
    public var dwOptions: UInt,
    wzNameCtorArg: Pcwstr,
    lpDataCtorArg: ConstPtr,
    public var cbData: UInt,
) {
    public var wzName: Pcwstr = wzNameCtorArg
        internal set

    public var lpData: ConstPtr = lpDataCtorArg
        internal set

    public constructor() : this(
        command = 0,
        dwOptions = 0u,
        wzNameCtorArg = ConstPtr(0L),
        lpDataCtorArg = ConstPtr(0L),
        cbData = 0u,
    )

    public operator fun component1(): ClusterRegCommand = this.command

    public operator fun component2(): UInt = this.dwOptions

    public operator fun component3(): Pcwstr = this.wzName

    public operator fun component4(): ConstPtr = this.lpData

    public operator fun component5(): UInt = this.cbData

    public fun copy(command: ClusterRegCommand = this.command, dwOptions: UInt = this.dwOptions, wzName: Pcwstr = this.wzName, lpData: ConstPtr = this.lpData, cbData: UInt = this.cbData): ClusterBatchCommand = ClusterBatchCommand(command = command, dwOptions = dwOptions, wzNameCtorArg = wzName, lpDataCtorArg = lpData, cbData = cbData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterBatchCommand) return false
        if (this.command != other.command) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.wzName != other.wzName) return false
        if (this.lpData != other.lpData) return false
        if (this.cbData != other.cbData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.command.hashCode()
        result = 31 * result + this.dwOptions.hashCode()
        result = 31 * result + this.wzName.hashCode()
        result = 31 * result + this.lpData.hashCode()
        result = 31 * result + this.cbData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            command: ClusterRegCommand = 0,
            dwOptions: UInt = 0u,
            wzName: Pcwstr = ConstPtr(0L),
            lpData: ConstPtr = ConstPtr(0L),
            cbData: UInt = 0u,
        ): ClusterBatchCommand =
            ClusterBatchCommand(
                command = command,
                dwOptions = dwOptions,
                wzNameCtorArg = wzName,
                lpDataCtorArg = lpData,
                cbData = cbData,
            )
    }
}

public data class ClusterCreateGroupInfo(
    public var dwVersion: UInt = 0u,
    public var groupType: ClusgroupType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterCreateGroupInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterCreateGroupInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ClusterCreateGroupInfo =
                    ClusterCreateGroupInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ClusterCreateGroupInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.groupType)
                }
            }
    }
}

public class ClusterEnumItem internal constructor(
    public var dwVersion: UInt,
    public var dwType: UInt,
    public var cbId: UInt,
    lpszIdCtorArg: Pwstr,
    public var cbName: UInt,
    lpszNameCtorArg: Pwstr,
) {
    public var lpszId: Pwstr = lpszIdCtorArg
        internal set

    public var lpszName: Pwstr = lpszNameCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        dwType = 0u,
        cbId = 0u,
        lpszIdCtorArg = MutPtr(0L),
        cbName = 0u,
        lpszNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.dwType

    public operator fun component3(): UInt = this.cbId

    public operator fun component4(): Pwstr = this.lpszId

    public operator fun component5(): UInt = this.cbName

    public operator fun component6(): Pwstr = this.lpszName

    public fun copy(dwVersion: UInt = this.dwVersion, dwType: UInt = this.dwType, cbId: UInt = this.cbId, lpszId: Pwstr = this.lpszId, cbName: UInt = this.cbName, lpszName: Pwstr = this.lpszName): ClusterEnumItem = ClusterEnumItem(dwVersion = dwVersion, dwType = dwType, cbId = cbId, lpszIdCtorArg = lpszId, cbName = cbName, lpszNameCtorArg = lpszName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterEnumItem) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwType != other.dwType) return false
        if (this.cbId != other.cbId) return false
        if (this.lpszId != other.lpszId) return false
        if (this.cbName != other.cbName) return false
        if (this.lpszName != other.lpszName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.cbId.hashCode()
        result = 31 * result + this.lpszId.hashCode()
        result = 31 * result + this.cbName.hashCode()
        result = 31 * result + this.lpszName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            dwType: UInt = 0u,
            cbId: UInt = 0u,
            lpszId: Pwstr = MutPtr(0L),
            cbName: UInt = 0u,
            lpszName: Pwstr = MutPtr(0L),
        ): ClusterEnumItem =
            ClusterEnumItem(
                dwVersion = dwVersion,
                dwType = dwType,
                cbId = cbId,
                lpszIdCtorArg = lpszId,
                cbName = cbName,
                lpszNameCtorArg = lpszName,
            )
    }
}

public class ClusterGroupEnumItem internal constructor(
    public var dwVersion: UInt,
    public var cbId: UInt,
    lpszIdCtorArg: Pwstr,
    public var cbName: UInt,
    lpszNameCtorArg: Pwstr,
    public var state: ClusterGroupState,
    public var cbOwnerNode: UInt,
    lpszOwnerNodeCtorArg: Pwstr,
    public var dwFlags: UInt,
    public var cbProperties: UInt,
    pPropertiesCtorArg: MutPtr,
    public var cbRoProperties: UInt,
    pRoPropertiesCtorArg: MutPtr,
) {
    public var lpszId: Pwstr = lpszIdCtorArg
        internal set

    public var lpszName: Pwstr = lpszNameCtorArg
        internal set

    public var lpszOwnerNode: Pwstr = lpszOwnerNodeCtorArg
        internal set

    public var pProperties: MutPtr = pPropertiesCtorArg
        internal set

    public var pRoProperties: MutPtr = pRoPropertiesCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        cbId = 0u,
        lpszIdCtorArg = MutPtr(0L),
        cbName = 0u,
        lpszNameCtorArg = MutPtr(0L),
        state = 0,
        cbOwnerNode = 0u,
        lpszOwnerNodeCtorArg = MutPtr(0L),
        dwFlags = 0u,
        cbProperties = 0u,
        pPropertiesCtorArg = MutPtr(0L),
        cbRoProperties = 0u,
        pRoPropertiesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.cbId

    public operator fun component3(): Pwstr = this.lpszId

    public operator fun component4(): UInt = this.cbName

    public operator fun component5(): Pwstr = this.lpszName

    public operator fun component6(): ClusterGroupState = this.state

    public operator fun component7(): UInt = this.cbOwnerNode

    public operator fun component8(): Pwstr = this.lpszOwnerNode

    public operator fun component9(): UInt = this.dwFlags

    public operator fun component10(): UInt = this.cbProperties

    public operator fun component11(): MutPtr = this.pProperties

    public operator fun component12(): UInt = this.cbRoProperties

    public operator fun component13(): MutPtr = this.pRoProperties

    public fun copy(dwVersion: UInt = this.dwVersion, cbId: UInt = this.cbId, lpszId: Pwstr = this.lpszId, cbName: UInt = this.cbName, lpszName: Pwstr = this.lpszName, state: ClusterGroupState = this.state, cbOwnerNode: UInt = this.cbOwnerNode, lpszOwnerNode: Pwstr = this.lpszOwnerNode, dwFlags: UInt = this.dwFlags, cbProperties: UInt = this.cbProperties, pProperties: MutPtr = this.pProperties, cbRoProperties: UInt = this.cbRoProperties, pRoProperties: MutPtr = this.pRoProperties): ClusterGroupEnumItem = ClusterGroupEnumItem(dwVersion = dwVersion, cbId = cbId, lpszIdCtorArg = lpszId, cbName = cbName, lpszNameCtorArg = lpszName, state = state, cbOwnerNode = cbOwnerNode, lpszOwnerNodeCtorArg = lpszOwnerNode, dwFlags = dwFlags, cbProperties = cbProperties, pPropertiesCtorArg = pProperties, cbRoProperties = cbRoProperties, pRoPropertiesCtorArg = pRoProperties)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterGroupEnumItem) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.cbId != other.cbId) return false
        if (this.lpszId != other.lpszId) return false
        if (this.cbName != other.cbName) return false
        if (this.lpszName != other.lpszName) return false
        if (this.state != other.state) return false
        if (this.cbOwnerNode != other.cbOwnerNode) return false
        if (this.lpszOwnerNode != other.lpszOwnerNode) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.cbProperties != other.cbProperties) return false
        if (this.pProperties != other.pProperties) return false
        if (this.cbRoProperties != other.cbRoProperties) return false
        if (this.pRoProperties != other.pRoProperties) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.cbId.hashCode()
        result = 31 * result + this.lpszId.hashCode()
        result = 31 * result + this.cbName.hashCode()
        result = 31 * result + this.lpszName.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.cbOwnerNode.hashCode()
        result = 31 * result + this.lpszOwnerNode.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.cbProperties.hashCode()
        result = 31 * result + this.pProperties.hashCode()
        result = 31 * result + this.cbRoProperties.hashCode()
        result = 31 * result + this.pRoProperties.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            cbId: UInt = 0u,
            lpszId: Pwstr = MutPtr(0L),
            cbName: UInt = 0u,
            lpszName: Pwstr = MutPtr(0L),
            state: ClusterGroupState = 0,
            cbOwnerNode: UInt = 0u,
            lpszOwnerNode: Pwstr = MutPtr(0L),
            dwFlags: UInt = 0u,
            cbProperties: UInt = 0u,
            pProperties: MutPtr = MutPtr(0L),
            cbRoProperties: UInt = 0u,
            pRoProperties: MutPtr = MutPtr(0L),
        ): ClusterGroupEnumItem =
            ClusterGroupEnumItem(
                dwVersion = dwVersion,
                cbId = cbId,
                lpszIdCtorArg = lpszId,
                cbName = cbName,
                lpszNameCtorArg = lpszName,
                state = state,
                cbOwnerNode = cbOwnerNode,
                lpszOwnerNodeCtorArg = lpszOwnerNode,
                dwFlags = dwFlags,
                cbProperties = cbProperties,
                pPropertiesCtorArg = pProperties,
                cbRoProperties = cbRoProperties,
                pRoPropertiesCtorArg = pRoProperties,
            )
    }
}

public class ClusterHealthFault internal constructor(
    idCtorArg: Pwstr,
    public var errorType: UInt,
    public var errorCode: UInt,
    descriptionCtorArg: Pwstr,
    providerCtorArg: Pwstr,
    public var flags: UInt,
    public var reserved: UInt,
) {
    public var id: Pwstr = idCtorArg
        internal set

    public var description: Pwstr = descriptionCtorArg
        internal set

    public var provider: Pwstr = providerCtorArg
        internal set

    public constructor() : this(
        idCtorArg = MutPtr(0L),
        errorType = 0u,
        errorCode = 0u,
        descriptionCtorArg = MutPtr(0L),
        providerCtorArg = MutPtr(0L),
        flags = 0u,
        reserved = 0u,
    )

    public operator fun component1(): Pwstr = this.id

    public operator fun component2(): UInt = this.errorType

    public operator fun component3(): UInt = this.errorCode

    public operator fun component4(): Pwstr = this.description

    public operator fun component5(): Pwstr = this.provider

    public operator fun component6(): UInt = this.flags

    public operator fun component7(): UInt = this.reserved

    public fun copy(id: Pwstr = this.id, errorType: UInt = this.errorType, errorCode: UInt = this.errorCode, description: Pwstr = this.description, provider: Pwstr = this.provider, flags: UInt = this.flags, reserved: UInt = this.reserved): ClusterHealthFault = ClusterHealthFault(idCtorArg = id, errorType = errorType, errorCode = errorCode, descriptionCtorArg = description, providerCtorArg = provider, flags = flags, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterHealthFault) return false
        if (this.id != other.id) return false
        if (this.errorType != other.errorType) return false
        if (this.errorCode != other.errorCode) return false
        if (this.description != other.description) return false
        if (this.provider != other.provider) return false
        if (this.flags != other.flags) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.errorType.hashCode()
        result = 31 * result + this.errorCode.hashCode()
        result = 31 * result + this.description.hashCode()
        result = 31 * result + this.provider.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            id: Pwstr = MutPtr(0L),
            errorType: UInt = 0u,
            errorCode: UInt = 0u,
            description: Pwstr = MutPtr(0L),
            provider: Pwstr = MutPtr(0L),
            flags: UInt = 0u,
            reserved: UInt = 0u,
        ): ClusterHealthFault =
            ClusterHealthFault(
                idCtorArg = id,
                errorType = errorType,
                errorCode = errorCode,
                descriptionCtorArg = description,
                providerCtorArg = provider,
                flags = flags,
                reserved = reserved,
            )
    }
}

public class ClusterHealthFaultArray internal constructor(
    public var numFaults: UInt,
    faultsCtorArg: MutPtr,
) {
    public var faults: MutPtr = faultsCtorArg
        internal set

    public constructor() : this(
        numFaults = 0u,
        faultsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numFaults

    public operator fun component2(): MutPtr = this.faults

    public fun copy(numFaults: UInt = this.numFaults, faults: MutPtr = this.faults): ClusterHealthFaultArray = ClusterHealthFaultArray(numFaults = numFaults, faultsCtorArg = faults)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterHealthFaultArray) return false
        if (this.numFaults != other.numFaults) return false
        if (this.faults != other.faults) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numFaults.hashCode()
        result = 31 * result + this.faults.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterHealthFaultArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterHealthFaultArray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ClusterHealthFaultArray =
                    ClusterHealthFaultArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ClusterHealthFaultArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numFaults)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.faults)
                }
            }

        public operator fun invoke(
            numFaults: UInt = 0u,
            faults: MutPtr = MutPtr(0L),
        ): ClusterHealthFaultArray =
            ClusterHealthFaultArray(
                numFaults = numFaults,
                faultsCtorArg = faults,
            )
    }
}

public class ClusterIpEntry internal constructor(
    lpszIpAddressCtorArg: Pcwstr,
    public var dwPrefixLength: UInt,
) {
    public var lpszIpAddress: Pcwstr = lpszIpAddressCtorArg
        internal set

    public constructor() : this(
        lpszIpAddressCtorArg = ConstPtr(0L),
        dwPrefixLength = 0u,
    )

    public operator fun component1(): Pcwstr = this.lpszIpAddress

    public operator fun component2(): UInt = this.dwPrefixLength

    public fun copy(lpszIpAddress: Pcwstr = this.lpszIpAddress, dwPrefixLength: UInt = this.dwPrefixLength): ClusterIpEntry = ClusterIpEntry(lpszIpAddressCtorArg = lpszIpAddress, dwPrefixLength = dwPrefixLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterIpEntry) return false
        if (this.lpszIpAddress != other.lpszIpAddress) return false
        if (this.dwPrefixLength != other.dwPrefixLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpszIpAddress.hashCode()
        result = 31 * result + this.dwPrefixLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpszIpAddress: Pcwstr = ConstPtr(0L),
            dwPrefixLength: UInt = 0u,
        ): ClusterIpEntry =
            ClusterIpEntry(
                lpszIpAddressCtorArg = lpszIpAddress,
                dwPrefixLength = dwPrefixLength,
            )
    }
}

public data class ClusterMembershipInfo(
    public var hasQuorum: Bool = 0,
    public var upnodesSize: UInt = 0u,
    public var upnodes: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterMembershipInfo) return false
        if (this.hasQuorum != other.hasQuorum) return false
        if (this.upnodesSize != other.upnodesSize) return false
        if (!this.upnodes.contentEquals(other.upnodes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hasQuorum.hashCode()
        result = 31 * result + this.upnodesSize.hashCode()
        result = 31 * result + this.upnodes.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterMembershipInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterMembershipInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ClusterMembershipInfo =
                    ClusterMembershipInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ClusterMembershipInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.hasQuorum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.upnodesSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.upnodes.toList())
                }
            }
    }
}

public class ClusterReadBatchCommand internal constructor(
    public var command: ClusterRegCommand,
    public var dwOptions: UInt,
    wzSubkeyNameCtorArg: Pcwstr,
    wzValueNameCtorArg: Pcwstr,
    lpDataCtorArg: ConstPtr,
    public var cbData: UInt,
) {
    public var wzSubkeyName: Pcwstr = wzSubkeyNameCtorArg
        internal set

    public var wzValueName: Pcwstr = wzValueNameCtorArg
        internal set

    public var lpData: ConstPtr = lpDataCtorArg
        internal set

    public constructor() : this(
        command = 0,
        dwOptions = 0u,
        wzSubkeyNameCtorArg = ConstPtr(0L),
        wzValueNameCtorArg = ConstPtr(0L),
        lpDataCtorArg = ConstPtr(0L),
        cbData = 0u,
    )

    public operator fun component1(): ClusterRegCommand = this.command

    public operator fun component2(): UInt = this.dwOptions

    public operator fun component3(): Pcwstr = this.wzSubkeyName

    public operator fun component4(): Pcwstr = this.wzValueName

    public operator fun component5(): ConstPtr = this.lpData

    public operator fun component6(): UInt = this.cbData

    public fun copy(command: ClusterRegCommand = this.command, dwOptions: UInt = this.dwOptions, wzSubkeyName: Pcwstr = this.wzSubkeyName, wzValueName: Pcwstr = this.wzValueName, lpData: ConstPtr = this.lpData, cbData: UInt = this.cbData): ClusterReadBatchCommand = ClusterReadBatchCommand(command = command, dwOptions = dwOptions, wzSubkeyNameCtorArg = wzSubkeyName, wzValueNameCtorArg = wzValueName, lpDataCtorArg = lpData, cbData = cbData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterReadBatchCommand) return false
        if (this.command != other.command) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.wzSubkeyName != other.wzSubkeyName) return false
        if (this.wzValueName != other.wzValueName) return false
        if (this.lpData != other.lpData) return false
        if (this.cbData != other.cbData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.command.hashCode()
        result = 31 * result + this.dwOptions.hashCode()
        result = 31 * result + this.wzSubkeyName.hashCode()
        result = 31 * result + this.wzValueName.hashCode()
        result = 31 * result + this.lpData.hashCode()
        result = 31 * result + this.cbData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            command: ClusterRegCommand = 0,
            dwOptions: UInt = 0u,
            wzSubkeyName: Pcwstr = ConstPtr(0L),
            wzValueName: Pcwstr = ConstPtr(0L),
            lpData: ConstPtr = ConstPtr(0L),
            cbData: UInt = 0u,
        ): ClusterReadBatchCommand =
            ClusterReadBatchCommand(
                command = command,
                dwOptions = dwOptions,
                wzSubkeyNameCtorArg = wzSubkeyName,
                wzValueNameCtorArg = wzValueName,
                lpDataCtorArg = lpData,
                cbData = cbData,
            )
    }
}

public class ClusterResourceEnumItem internal constructor(
    public var dwVersion: UInt,
    public var cbId: UInt,
    lpszIdCtorArg: Pwstr,
    public var cbName: UInt,
    lpszNameCtorArg: Pwstr,
    public var cbOwnerGroupName: UInt,
    lpszOwnerGroupNameCtorArg: Pwstr,
    public var cbOwnerGroupId: UInt,
    lpszOwnerGroupIdCtorArg: Pwstr,
    public var cbProperties: UInt,
    pPropertiesCtorArg: MutPtr,
    public var cbRoProperties: UInt,
    pRoPropertiesCtorArg: MutPtr,
) {
    public var lpszId: Pwstr = lpszIdCtorArg
        internal set

    public var lpszName: Pwstr = lpszNameCtorArg
        internal set

    public var lpszOwnerGroupName: Pwstr = lpszOwnerGroupNameCtorArg
        internal set

    public var lpszOwnerGroupId: Pwstr = lpszOwnerGroupIdCtorArg
        internal set

    public var pProperties: MutPtr = pPropertiesCtorArg
        internal set

    public var pRoProperties: MutPtr = pRoPropertiesCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        cbId = 0u,
        lpszIdCtorArg = MutPtr(0L),
        cbName = 0u,
        lpszNameCtorArg = MutPtr(0L),
        cbOwnerGroupName = 0u,
        lpszOwnerGroupNameCtorArg = MutPtr(0L),
        cbOwnerGroupId = 0u,
        lpszOwnerGroupIdCtorArg = MutPtr(0L),
        cbProperties = 0u,
        pPropertiesCtorArg = MutPtr(0L),
        cbRoProperties = 0u,
        pRoPropertiesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.cbId

    public operator fun component3(): Pwstr = this.lpszId

    public operator fun component4(): UInt = this.cbName

    public operator fun component5(): Pwstr = this.lpszName

    public operator fun component6(): UInt = this.cbOwnerGroupName

    public operator fun component7(): Pwstr = this.lpszOwnerGroupName

    public operator fun component8(): UInt = this.cbOwnerGroupId

    public operator fun component9(): Pwstr = this.lpszOwnerGroupId

    public operator fun component10(): UInt = this.cbProperties

    public operator fun component11(): MutPtr = this.pProperties

    public operator fun component12(): UInt = this.cbRoProperties

    public operator fun component13(): MutPtr = this.pRoProperties

    public fun copy(dwVersion: UInt = this.dwVersion, cbId: UInt = this.cbId, lpszId: Pwstr = this.lpszId, cbName: UInt = this.cbName, lpszName: Pwstr = this.lpszName, cbOwnerGroupName: UInt = this.cbOwnerGroupName, lpszOwnerGroupName: Pwstr = this.lpszOwnerGroupName, cbOwnerGroupId: UInt = this.cbOwnerGroupId, lpszOwnerGroupId: Pwstr = this.lpszOwnerGroupId, cbProperties: UInt = this.cbProperties, pProperties: MutPtr = this.pProperties, cbRoProperties: UInt = this.cbRoProperties, pRoProperties: MutPtr = this.pRoProperties): ClusterResourceEnumItem = ClusterResourceEnumItem(dwVersion = dwVersion, cbId = cbId, lpszIdCtorArg = lpszId, cbName = cbName, lpszNameCtorArg = lpszName, cbOwnerGroupName = cbOwnerGroupName, lpszOwnerGroupNameCtorArg = lpszOwnerGroupName, cbOwnerGroupId = cbOwnerGroupId, lpszOwnerGroupIdCtorArg = lpszOwnerGroupId, cbProperties = cbProperties, pPropertiesCtorArg = pProperties, cbRoProperties = cbRoProperties, pRoPropertiesCtorArg = pRoProperties)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterResourceEnumItem) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.cbId != other.cbId) return false
        if (this.lpszId != other.lpszId) return false
        if (this.cbName != other.cbName) return false
        if (this.lpszName != other.lpszName) return false
        if (this.cbOwnerGroupName != other.cbOwnerGroupName) return false
        if (this.lpszOwnerGroupName != other.lpszOwnerGroupName) return false
        if (this.cbOwnerGroupId != other.cbOwnerGroupId) return false
        if (this.lpszOwnerGroupId != other.lpszOwnerGroupId) return false
        if (this.cbProperties != other.cbProperties) return false
        if (this.pProperties != other.pProperties) return false
        if (this.cbRoProperties != other.cbRoProperties) return false
        if (this.pRoProperties != other.pRoProperties) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.cbId.hashCode()
        result = 31 * result + this.lpszId.hashCode()
        result = 31 * result + this.cbName.hashCode()
        result = 31 * result + this.lpszName.hashCode()
        result = 31 * result + this.cbOwnerGroupName.hashCode()
        result = 31 * result + this.lpszOwnerGroupName.hashCode()
        result = 31 * result + this.cbOwnerGroupId.hashCode()
        result = 31 * result + this.lpszOwnerGroupId.hashCode()
        result = 31 * result + this.cbProperties.hashCode()
        result = 31 * result + this.pProperties.hashCode()
        result = 31 * result + this.cbRoProperties.hashCode()
        result = 31 * result + this.pRoProperties.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            cbId: UInt = 0u,
            lpszId: Pwstr = MutPtr(0L),
            cbName: UInt = 0u,
            lpszName: Pwstr = MutPtr(0L),
            cbOwnerGroupName: UInt = 0u,
            lpszOwnerGroupName: Pwstr = MutPtr(0L),
            cbOwnerGroupId: UInt = 0u,
            lpszOwnerGroupId: Pwstr = MutPtr(0L),
            cbProperties: UInt = 0u,
            pProperties: MutPtr = MutPtr(0L),
            cbRoProperties: UInt = 0u,
            pRoProperties: MutPtr = MutPtr(0L),
        ): ClusterResourceEnumItem =
            ClusterResourceEnumItem(
                dwVersion = dwVersion,
                cbId = cbId,
                lpszIdCtorArg = lpszId,
                cbName = cbName,
                lpszNameCtorArg = lpszName,
                cbOwnerGroupName = cbOwnerGroupName,
                lpszOwnerGroupNameCtorArg = lpszOwnerGroupName,
                cbOwnerGroupId = cbOwnerGroupId,
                lpszOwnerGroupIdCtorArg = lpszOwnerGroupId,
                cbProperties = cbProperties,
                pPropertiesCtorArg = pProperties,
                cbRoProperties = cbRoProperties,
                pRoPropertiesCtorArg = pRoProperties,
            )
    }
}

public data class ClusterSetPasswordStatus(
    public var nodeId: UInt = 0u,
    public var setAttempted: Boolean = false,
    public var returnStatus: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterSetPasswordStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterSetPasswordStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ClusterSetPasswordStatus =
                    ClusterSetPasswordStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ClusterSetPasswordStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nodeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.setAttempted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.returnStatus)
                }
            }
    }
}

public data class ClusterSharedVolumeRenameGuidInput(
    public var base: ClusterSharedVolumeRenameInputVolume = ClusterSharedVolumeRenameInputVolume(),
    public var base2: ClusterSharedVolumeRenameInputGuidName = ClusterSharedVolumeRenameInputGuidName(),
)

public data class ClusterSharedVolumeRenameInput(
    public var base: ClusterSharedVolumeRenameInputVolume = ClusterSharedVolumeRenameInputVolume(),
    public var base2: ClusterSharedVolumeRenameInputName = ClusterSharedVolumeRenameInputName(),
)

public data class ClusterSharedVolumeRenameInputGuidName(
    public var newVolumeName: UShortArray = UShortArray(260),
    public var newVolumeGuid: UShortArray = UShortArray(50),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterSharedVolumeRenameInputGuidName) return false
        if (!this.newVolumeName.contentEquals(other.newVolumeName)) return false
        if (!this.newVolumeGuid.contentEquals(other.newVolumeGuid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.newVolumeName.contentHashCode()
        result = 31 * result + this.newVolumeGuid.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterSharedVolumeRenameInputGuidName> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterSharedVolumeRenameInputGuidName> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 620L
                override fun readNative(addr: Long): ClusterSharedVolumeRenameInputGuidName =
                    ClusterSharedVolumeRenameInputGuidName(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (50).toInt())
                        ).readNative(addr + 520L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ClusterSharedVolumeRenameInputGuidName) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr, value.newVolumeName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (50).toInt())
                    ).writeNative(addr + 520L, value.newVolumeGuid.toList())
                }
            }
    }
}

public data class ClusterSharedVolumeRenameInputName(
    public var newVolumeName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterSharedVolumeRenameInputName) return false
        if (!this.newVolumeName.contentEquals(other.newVolumeName)) return false
        return true
    }

    override fun hashCode(): Int = this.newVolumeName.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterSharedVolumeRenameInputName> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterSharedVolumeRenameInputName> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 520L
                override fun readNative(addr: Long): ClusterSharedVolumeRenameInputName =
                    ClusterSharedVolumeRenameInputName(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ClusterSharedVolumeRenameInputName) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr, value.newVolumeName.toList())
                }
            }
    }
}

public data class ClusterSharedVolumeRenameInputVolume(
    public var inputType: ClusterSharedVolumeRenameInputType = 0,
    public var anonymous: ClusterSharedVolumeRenameInputVolume0 = ClusterSharedVolumeRenameInputVolume0(),
)

public data class ClusterSharedVolumeRenameInputVolume0(
    public var volumeOffset: ULong = 0uL,
    public var volumeId: UShortArray = UShortArray(260),
    public var volumeName: UShortArray = UShortArray(260),
    public var volumeGuid: UShortArray = UShortArray(50),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterSharedVolumeRenameInputVolume0) return false
        if (this.volumeOffset != other.volumeOffset) return false
        if (!this.volumeId.contentEquals(other.volumeId)) return false
        if (!this.volumeName.contentEquals(other.volumeName)) return false
        if (!this.volumeGuid.contentEquals(other.volumeGuid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.volumeOffset.hashCode()
        result = 31 * result + this.volumeId.contentHashCode()
        result = 31 * result + this.volumeName.contentHashCode()
        result = 31 * result + this.volumeGuid.contentHashCode()
        return result
    }
}

public data class ClusterSharedVolumeStateInfo(
    public var szVolumeName: UShortArray = UShortArray(260),
    public var szNodeName: UShortArray = UShortArray(260),
    public var volumeState: ClusterSharedVolumeState = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterSharedVolumeStateInfo) return false
        if (!this.szVolumeName.contentEquals(other.szVolumeName)) return false
        if (!this.szNodeName.contentEquals(other.szNodeName)) return false
        if (this.volumeState != other.volumeState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szVolumeName.contentHashCode()
        result = 31 * result + this.szNodeName.contentHashCode()
        result = 31 * result + this.volumeState.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterSharedVolumeStateInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterSharedVolumeStateInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1044L
                override fun readNative(addr: Long): ClusterSharedVolumeStateInfo =
                    ClusterSharedVolumeStateInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 520L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 1040L),
                    )
                override fun writeNative(addr: Long, value: ClusterSharedVolumeStateInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr, value.szVolumeName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 520L, value.szNodeName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 1040L, value.volumeState)
                }
            }
    }
}

public data class ClusterSharedVolumeStateInfoEx(
    public var szVolumeName: UShortArray = UShortArray(260),
    public var szNodeName: UShortArray = UShortArray(260),
    public var volumeState: ClusterSharedVolumeState = 0,
    public var szVolumeFriendlyName: UShortArray = UShortArray(260),
    public var redirectedIOReason: ULong = 0uL,
    public var volumeRedirectedIOReason: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterSharedVolumeStateInfoEx) return false
        if (!this.szVolumeName.contentEquals(other.szVolumeName)) return false
        if (!this.szNodeName.contentEquals(other.szNodeName)) return false
        if (this.volumeState != other.volumeState) return false
        if (!this.szVolumeFriendlyName.contentEquals(other.szVolumeFriendlyName)) return false
        if (this.redirectedIOReason != other.redirectedIOReason) return false
        if (this.volumeRedirectedIOReason != other.volumeRedirectedIOReason) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szVolumeName.contentHashCode()
        result = 31 * result + this.szNodeName.contentHashCode()
        result = 31 * result + this.volumeState.hashCode()
        result = 31 * result + this.szVolumeFriendlyName.contentHashCode()
        result = 31 * result + this.redirectedIOReason.hashCode()
        result = 31 * result + this.volumeRedirectedIOReason.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterSharedVolumeStateInfoEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterSharedVolumeStateInfoEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 1584L
                override fun readNative(addr: Long): ClusterSharedVolumeStateInfoEx =
                    ClusterSharedVolumeStateInfoEx(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 520L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 1040L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 1044L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1568L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1576L),
                    )
                override fun writeNative(addr: Long, value: ClusterSharedVolumeStateInfoEx) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr, value.szVolumeName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 520L, value.szNodeName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 1040L, value.volumeState)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 1044L, value.szVolumeFriendlyName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1568L, value.redirectedIOReason)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1576L, value.volumeRedirectedIOReason)
                }
            }
    }
}

public data class ClusterValidateCsvFilename(
    public var szFileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterValidateCsvFilename) return false
        if (!this.szFileName.contentEquals(other.szFileName)) return false
        return true
    }

    override fun hashCode(): Int = this.szFileName.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterValidateCsvFilename> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterValidateCsvFilename> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): ClusterValidateCsvFilename =
                    ClusterValidateCsvFilename(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ClusterValidateCsvFilename) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr, value.szFileName.toList())
                }
            }
    }
}

public data class ClusterValidateDirectory(
    public var szPath: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterValidateDirectory) return false
        if (!this.szPath.contentEquals(other.szPath)) return false
        return true
    }

    override fun hashCode(): Int = this.szPath.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterValidateDirectory> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterValidateDirectory> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): ClusterValidateDirectory =
                    ClusterValidateDirectory(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ClusterValidateDirectory) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr, value.szPath.toList())
                }
            }
    }
}

public data class ClusterValidateNetname(
    public var szNetworkName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterValidateNetname) return false
        if (!this.szNetworkName.contentEquals(other.szNetworkName)) return false
        return true
    }

    override fun hashCode(): Int = this.szNetworkName.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterValidateNetname> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterValidateNetname> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): ClusterValidateNetname =
                    ClusterValidateNetname(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ClusterValidateNetname) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr, value.szNetworkName.toList())
                }
            }
    }
}

public data class ClusterValidatePath(
    public var szPath: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterValidatePath) return false
        if (!this.szPath.contentEquals(other.szPath)) return false
        return true
    }

    override fun hashCode(): Int = this.szPath.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterValidatePath> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusterValidatePath> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): ClusterValidatePath =
                    ClusterValidatePath(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ClusterValidatePath) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr, value.szPath.toList())
                }
            }
    }
}

public data class ClusChkdskInfo(
    public var partitionNumber: UInt = 0u,
    public var chkdskState: UInt = 0u,
    public var fileIdCount: UInt = 0u,
    public var fileIdList: ULongArray = ULongArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusChkdskInfo) return false
        if (this.partitionNumber != other.partitionNumber) return false
        if (this.chkdskState != other.chkdskState) return false
        if (this.fileIdCount != other.fileIdCount) return false
        if (!this.fileIdList.contentEquals(other.fileIdList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.partitionNumber.hashCode()
        result = 31 * result + this.chkdskState.hashCode()
        result = 31 * result + this.fileIdCount.hashCode()
        result = 31 * result + this.fileIdList.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusChkdskInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusChkdskInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ClusChkdskInfo =
                    ClusChkdskInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (1).toInt())
                        ).readNative(addr + 16L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: ClusChkdskInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.partitionNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.chkdskState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fileIdCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (1).toInt())
                    ).writeNative(addr + 16L, value.fileIdList.toList())
                }
            }
    }
}

public data class ClusCreateInfrastructureFileserverInput(
    public var fileServerName: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusCreateInfrastructureFileserverInput) return false
        if (!this.fileServerName.contentEquals(other.fileServerName)) return false
        return true
    }

    override fun hashCode(): Int = this.fileServerName.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusCreateInfrastructureFileserverInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusCreateInfrastructureFileserverInput> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): ClusCreateInfrastructureFileserverInput =
                    ClusCreateInfrastructureFileserverInput(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ClusCreateInfrastructureFileserverInput) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr, value.fileServerName.toList())
                }
            }
    }
}

public data class ClusCreateInfrastructureFileserverOutput(
    public var fileServerName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusCreateInfrastructureFileserverOutput) return false
        if (!this.fileServerName.contentEquals(other.fileServerName)) return false
        return true
    }

    override fun hashCode(): Int = this.fileServerName.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusCreateInfrastructureFileserverOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusCreateInfrastructureFileserverOutput> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 520L
                override fun readNative(addr: Long): ClusCreateInfrastructureFileserverOutput =
                    ClusCreateInfrastructureFileserverOutput(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ClusCreateInfrastructureFileserverOutput) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr, value.fileServerName.toList())
                }
            }
    }
}

public data class ClusCsvMaintenanceModeInfo(
    public var inMaintenance: Bool = 0,
    public var volumeName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusCsvMaintenanceModeInfo) return false
        if (this.inMaintenance != other.inMaintenance) return false
        if (!this.volumeName.contentEquals(other.volumeName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inMaintenance.hashCode()
        result = 31 * result + this.volumeName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusCsvMaintenanceModeInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusCsvMaintenanceModeInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 524L
                override fun readNative(addr: Long): ClusCsvMaintenanceModeInfo =
                    ClusCsvMaintenanceModeInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ClusCsvMaintenanceModeInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.inMaintenance)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 4L, value.volumeName.toList())
                }
            }
    }
}

public data class ClusCsvVolumeInfo(
    public var volumeOffset: ULong = 0uL,
    public var partitionNumber: UInt = 0u,
    public var faultState: ClusterCsvVolumeFaultState = 0,
    public var backupState: ClusterSharedVolumeBackupState = 0,
    public var szVolumeFriendlyName: UShortArray = UShortArray(260),
    public var szVolumeName: UShortArray = UShortArray(50),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusCsvVolumeInfo) return false
        if (this.volumeOffset != other.volumeOffset) return false
        if (this.partitionNumber != other.partitionNumber) return false
        if (this.faultState != other.faultState) return false
        if (this.backupState != other.backupState) return false
        if (!this.szVolumeFriendlyName.contentEquals(other.szVolumeFriendlyName)) return false
        if (!this.szVolumeName.contentEquals(other.szVolumeName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.volumeOffset.hashCode()
        result = 31 * result + this.partitionNumber.hashCode()
        result = 31 * result + this.faultState.hashCode()
        result = 31 * result + this.backupState.hashCode()
        result = 31 * result + this.szVolumeFriendlyName.contentHashCode()
        result = 31 * result + this.szVolumeName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusCsvVolumeInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusCsvVolumeInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 640L
                override fun readNative(addr: Long): ClusCsvVolumeInfo =
                    ClusCsvVolumeInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 20L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (50).toInt())
                        ).readNative(addr + 540L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ClusCsvVolumeInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.volumeOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.partitionNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.faultState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.backupState)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 20L, value.szVolumeFriendlyName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (50).toInt())
                    ).writeNative(addr + 540L, value.szVolumeName.toList())
                }
            }
    }
}

public data class ClusCsvVolumeName(
    public var volumeOffset: Long = 0L,
    public var szVolumeName: UShortArray = UShortArray(260),
    public var szRootPath: UShortArray = UShortArray(263),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusCsvVolumeName) return false
        if (this.volumeOffset != other.volumeOffset) return false
        if (!this.szVolumeName.contentEquals(other.szVolumeName)) return false
        if (!this.szRootPath.contentEquals(other.szRootPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.volumeOffset.hashCode()
        result = 31 * result + this.szVolumeName.contentHashCode()
        result = 31 * result + this.szRootPath.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusCsvVolumeName> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusCsvVolumeName> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 1056L
                override fun readNative(addr: Long): ClusCsvVolumeName =
                    ClusCsvVolumeName(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (263).toInt())
                        ).readNative(addr + 528L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ClusCsvVolumeName) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.volumeOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 8L, value.szVolumeName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (263).toInt())
                    ).writeNative(addr + 528L, value.szRootPath.toList())
                }
            }
    }
}

public data class ClusDiskNumberInfo(
    public var diskNumber: UInt = 0u,
    public var bytesPerSector: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusDiskNumberInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusDiskNumberInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ClusDiskNumberInfo =
                    ClusDiskNumberInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ClusDiskNumberInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.diskNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bytesPerSector)
                }
            }
    }
}

public data class ClusDnnLeaderStatus(
    public var isOnline: Bool = 0,
    public var isFileServerPresent: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusDnnLeaderStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusDnnLeaderStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ClusDnnLeaderStatus =
                    ClusDnnLeaderStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ClusDnnLeaderStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.isOnline)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.isFileServerPresent)
                }
            }
    }
}

public data class ClusDnnSodafsCloneStatus(
    public var nodeId: UInt = 0u,
    public var status: ClusterResourceState = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusDnnSodafsCloneStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusDnnSodafsCloneStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ClusDnnSodafsCloneStatus =
                    ClusDnnSodafsCloneStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ClusDnnSodafsCloneStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nodeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.status)
                }
            }
    }
}

public data class ClusForceQuorumInfo(
    public var dwSize: UInt = 0u,
    public var dwNodeBitMask: UInt = 0u,
    public var dwMaxNumberofNodes: UInt = 0u,
    public var multiszNodeList: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusForceQuorumInfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwNodeBitMask != other.dwNodeBitMask) return false
        if (this.dwMaxNumberofNodes != other.dwMaxNumberofNodes) return false
        if (!this.multiszNodeList.contentEquals(other.multiszNodeList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwNodeBitMask.hashCode()
        result = 31 * result + this.dwMaxNumberofNodes.hashCode()
        result = 31 * result + this.multiszNodeList.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusForceQuorumInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusForceQuorumInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ClusForceQuorumInfo =
                    ClusForceQuorumInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 12L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ClusForceQuorumInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNodeBitMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwMaxNumberofNodes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 12L, value.multiszNodeList.toList())
                }
            }
    }
}

public data class ClusFtsetInfo(
    public var dwRootSignature: UInt = 0u,
    public var dwFtType: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusFtsetInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusFtsetInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ClusFtsetInfo =
                    ClusFtsetInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ClusFtsetInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwRootSignature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFtType)
                }
            }
    }
}

public data class ClusMaintenanceModeInfo(
    public var inMaintenance: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusMaintenanceModeInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusMaintenanceModeInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ClusMaintenanceModeInfo =
                    ClusMaintenanceModeInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ClusMaintenanceModeInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.inMaintenance)
                }
            }
    }
}

public data class ClusMaintenanceModeInfoex(
    public var inMaintenance: Bool = 0,
    public var maintainenceModeType: MaintenanceModeTypeEnum = 0,
    public var internalState: ClusterResourceState = 0,
    public var signature: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusMaintenanceModeInfoex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusMaintenanceModeInfoex> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ClusMaintenanceModeInfoex =
                    ClusMaintenanceModeInfoex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ClusMaintenanceModeInfoex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.inMaintenance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.maintainenceModeType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.internalState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.signature)
                }
            }
    }
}

public data class ClusNetnameIpInfoEntry(
    public var nodeId: UInt = 0u,
    public var addressSize: UInt = 0u,
    public var address: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusNetnameIpInfoEntry) return false
        if (this.nodeId != other.nodeId) return false
        if (this.addressSize != other.addressSize) return false
        if (!this.address.contentEquals(other.address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nodeId.hashCode()
        result = 31 * result + this.addressSize.hashCode()
        result = 31 * result + this.address.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusNetnameIpInfoEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusNetnameIpInfoEntry> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ClusNetnameIpInfoEntry =
                    ClusNetnameIpInfoEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ClusNetnameIpInfoEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nodeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.addressSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.address.toList())
                }
            }
    }
}

public data class ClusNetnameIpInfoForMultichannel(
    public var szName: UShortArray = UShortArray(64),
    public var numEntries: UInt = 0u,
    public var ipInfo: List<ClusNetnameIpInfoEntry> = List(1) { ClusNetnameIpInfoEntry() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusNetnameIpInfoForMultichannel) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (this.numEntries != other.numEntries) return false
        if (this.ipInfo != other.ipInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szName.contentHashCode()
        result = 31 * result + this.numEntries.hashCode()
        result = 31 * result + this.ipInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusNetnameIpInfoForMultichannel> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusNetnameIpInfoForMultichannel> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 144L
                override fun readNative(addr: Long): ClusNetnameIpInfoForMultichannel =
                    ClusNetnameIpInfoForMultichannel(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(ClusNetnameIpInfoEntry.typeLayout(), (1).toInt())
                        ).readNative(addr + 132L),
                    )
                override fun writeNative(addr: Long, value: ClusNetnameIpInfoForMultichannel) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr, value.szName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.numEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(ClusNetnameIpInfoEntry.typeLayout(), (1).toInt())
                    ).writeNative(addr + 132L, value.ipInfo)
                }
            }
    }
}

public data class ClusNetnamePwdInfo(
    public var flags: UInt = 0u,
    public var password: UShortArray = UShortArray(16),
    public var creatingDC: UShortArray = UShortArray(258),
    public var objectGuid: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusNetnamePwdInfo) return false
        if (this.flags != other.flags) return false
        if (!this.password.contentEquals(other.password)) return false
        if (!this.creatingDC.contentEquals(other.creatingDC)) return false
        if (!this.objectGuid.contentEquals(other.objectGuid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.password.contentHashCode()
        result = 31 * result + this.creatingDC.contentHashCode()
        result = 31 * result + this.objectGuid.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusNetnamePwdInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusNetnamePwdInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 680L
                override fun readNative(addr: Long): ClusNetnamePwdInfo =
                    ClusNetnamePwdInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (258).toInt())
                        ).readNative(addr + 36L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 552L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ClusNetnamePwdInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 4L, value.password.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (258).toInt())
                    ).writeNative(addr + 36L, value.creatingDC.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 552L, value.objectGuid.toList())
                }
            }
    }
}

public data class ClusNetnamePwdInfoex(
    public var flags: UInt = 0u,
    public var password: UShortArray = UShortArray(128),
    public var creatingDC: UShortArray = UShortArray(258),
    public var objectGuid: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusNetnamePwdInfoex) return false
        if (this.flags != other.flags) return false
        if (!this.password.contentEquals(other.password)) return false
        if (!this.creatingDC.contentEquals(other.creatingDC)) return false
        if (!this.objectGuid.contentEquals(other.objectGuid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.password.contentHashCode()
        result = 31 * result + this.creatingDC.contentHashCode()
        result = 31 * result + this.objectGuid.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusNetnamePwdInfoex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusNetnamePwdInfoex> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 904L
                override fun readNative(addr: Long): ClusNetnamePwdInfoex =
                    ClusNetnamePwdInfoex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (258).toInt())
                        ).readNative(addr + 260L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 776L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ClusNetnamePwdInfoex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 4L, value.password.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (258).toInt())
                    ).writeNative(addr + 260L, value.creatingDC.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 776L, value.objectGuid.toList())
                }
            }
    }
}

public data class ClusNetnameVsTokenInfo(
    public var processID: UInt = 0u,
    public var desiredAccess: UInt = 0u,
    public var inheritHandle: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusNetnameVsTokenInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusNetnameVsTokenInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ClusNetnameVsTokenInfo =
                    ClusNetnameVsTokenInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ClusNetnameVsTokenInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.processID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.desiredAccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.inheritHandle)
                }
            }
    }
}

public data class ClusPartitionInfo(
    public var dwFlags: UInt = 0u,
    public var szDeviceName: UShortArray = UShortArray(260),
    public var szVolumeLabel: UShortArray = UShortArray(260),
    public var dwSerialNumber: UInt = 0u,
    public var rgdwMaximumComponentLength: UInt = 0u,
    public var dwFileSystemFlags: UInt = 0u,
    public var szFileSystem: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusPartitionInfo) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (!this.szVolumeLabel.contentEquals(other.szVolumeLabel)) return false
        if (this.dwSerialNumber != other.dwSerialNumber) return false
        if (this.rgdwMaximumComponentLength != other.rgdwMaximumComponentLength) return false
        if (this.dwFileSystemFlags != other.dwFileSystemFlags) return false
        if (!this.szFileSystem.contentEquals(other.szFileSystem)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.szVolumeLabel.contentHashCode()
        result = 31 * result + this.dwSerialNumber.hashCode()
        result = 31 * result + this.rgdwMaximumComponentLength.hashCode()
        result = 31 * result + this.dwFileSystemFlags.hashCode()
        result = 31 * result + this.szFileSystem.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusPartitionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusPartitionInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1120L
                override fun readNative(addr: Long): ClusPartitionInfo =
                    ClusPartitionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 524L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1044L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1048L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1052L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 1056L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ClusPartitionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 4L, value.szDeviceName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 524L, value.szVolumeLabel.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1044L, value.dwSerialNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1048L, value.rgdwMaximumComponentLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1052L, value.dwFileSystemFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 1056L, value.szFileSystem.toList())
                }
            }
    }
}

public data class ClusPartitionInfoEx(
    public var dwFlags: UInt = 0u,
    public var szDeviceName: UShortArray = UShortArray(260),
    public var szVolumeLabel: UShortArray = UShortArray(260),
    public var dwSerialNumber: UInt = 0u,
    public var rgdwMaximumComponentLength: UInt = 0u,
    public var dwFileSystemFlags: UInt = 0u,
    public var szFileSystem: UShortArray = UShortArray(32),
    public var totalSizeInBytes: ULong = 0uL,
    public var freeSizeInBytes: ULong = 0uL,
    public var deviceNumber: UInt = 0u,
    public var partitionNumber: UInt = 0u,
    public var volumeGuid: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusPartitionInfoEx) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (!this.szVolumeLabel.contentEquals(other.szVolumeLabel)) return false
        if (this.dwSerialNumber != other.dwSerialNumber) return false
        if (this.rgdwMaximumComponentLength != other.rgdwMaximumComponentLength) return false
        if (this.dwFileSystemFlags != other.dwFileSystemFlags) return false
        if (!this.szFileSystem.contentEquals(other.szFileSystem)) return false
        if (this.totalSizeInBytes != other.totalSizeInBytes) return false
        if (this.freeSizeInBytes != other.freeSizeInBytes) return false
        if (this.deviceNumber != other.deviceNumber) return false
        if (this.partitionNumber != other.partitionNumber) return false
        if (this.volumeGuid != other.volumeGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.szVolumeLabel.contentHashCode()
        result = 31 * result + this.dwSerialNumber.hashCode()
        result = 31 * result + this.rgdwMaximumComponentLength.hashCode()
        result = 31 * result + this.dwFileSystemFlags.hashCode()
        result = 31 * result + this.szFileSystem.contentHashCode()
        result = 31 * result + this.totalSizeInBytes.hashCode()
        result = 31 * result + this.freeSizeInBytes.hashCode()
        result = 31 * result + this.deviceNumber.hashCode()
        result = 31 * result + this.partitionNumber.hashCode()
        result = 31 * result + this.volumeGuid.hashCode()
        return result
    }
}

public data class ClusPartitionInfoEx2(
    public var gptPartitionId: Guid = Guid(),
    public var szPartitionName: UShortArray = UShortArray(260),
    public var encryptionFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusPartitionInfoEx2) return false
        if (this.gptPartitionId != other.gptPartitionId) return false
        if (!this.szPartitionName.contentEquals(other.szPartitionName)) return false
        if (this.encryptionFlags != other.encryptionFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.gptPartitionId.hashCode()
        result = 31 * result + this.szPartitionName.contentHashCode()
        result = 31 * result + this.encryptionFlags.hashCode()
        return result
    }
}

public data class ClusProviderStateChangeInfo(
    public var dwSize: UInt = 0u,
    public var resourceState: ClusterResourceState = 0,
    public var szProviderId: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusProviderStateChangeInfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.resourceState != other.resourceState) return false
        if (!this.szProviderId.contentEquals(other.szProviderId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.resourceState.hashCode()
        result = 31 * result + this.szProviderId.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusProviderStateChangeInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusProviderStateChangeInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ClusProviderStateChangeInfo =
                    ClusProviderStateChangeInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ClusProviderStateChangeInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.resourceState)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 8L, value.szProviderId.toList())
                }
            }
    }
}

public data class ClusResourceClassInfo(
    public var anonymous: ClusResourceClassInfo0 = ClusResourceClassInfo0(),
)

public data class ClusResourceClassInfo0(
    public var anonymous: ClusResourceClassInfo00 = ClusResourceClassInfo00(),
    public var li: ULong = 0uL,
)

public data class ClusResourceClassInfo00(
    public var anonymous: ClusResourceClassInfo000 = ClusResourceClassInfo000(),
    public var subClass: UInt = 0u,
)

public data class ClusResourceClassInfo000(
    public var dw: UInt = 0u,
    public var rc: ClusterResourceClass = 0,
)

public data class ClusScsiAddress(
    public var anonymous: ClusScsiAddress0 = ClusScsiAddress0(),
)

public data class ClusScsiAddress0(
    public var anonymous: ClusScsiAddress00 = ClusScsiAddress00(),
    public var dw: UInt = 0u,
)

public data class ClusScsiAddress00(
    public var portNumber: UByte = 0u,
    public var pathId: UByte = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusScsiAddress00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusScsiAddress00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ClusScsiAddress00 =
                    ClusScsiAddress00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: ClusScsiAddress00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.portNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.pathId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.targetId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.lun)
                }
            }
    }
}

public data class ClusSetMaintenanceModeInput(
    public var inMaintenance: Bool = 0,
    public var extraParameterSize: UInt = 0u,
    public var extraParameter: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusSetMaintenanceModeInput) return false
        if (this.inMaintenance != other.inMaintenance) return false
        if (this.extraParameterSize != other.extraParameterSize) return false
        if (!this.extraParameter.contentEquals(other.extraParameter)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inMaintenance.hashCode()
        result = 31 * result + this.extraParameterSize.hashCode()
        result = 31 * result + this.extraParameter.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusSetMaintenanceModeInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusSetMaintenanceModeInput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ClusSetMaintenanceModeInput =
                    ClusSetMaintenanceModeInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ClusSetMaintenanceModeInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.inMaintenance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.extraParameterSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.extraParameter.toList())
                }
            }
    }
}

public data class ClusSharedVolumeBackupMode(
    public var backupState: ClusterSharedVolumeBackupState = 0,
    public var delayTimerInSecs: UInt = 0u,
    public var volumeName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusSharedVolumeBackupMode) return false
        if (this.backupState != other.backupState) return false
        if (this.delayTimerInSecs != other.delayTimerInSecs) return false
        if (!this.volumeName.contentEquals(other.volumeName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.backupState.hashCode()
        result = 31 * result + this.delayTimerInSecs.hashCode()
        result = 31 * result + this.volumeName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusSharedVolumeBackupMode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusSharedVolumeBackupMode> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 528L
                override fun readNative(addr: Long): ClusSharedVolumeBackupMode =
                    ClusSharedVolumeBackupMode(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: ClusSharedVolumeBackupMode) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.backupState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.delayTimerInSecs)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 8L, value.volumeName.toList())
                }
            }
    }
}

public data class ClusStartingParams(
    public var dwSize: UInt = 0u,
    public var bForm: Bool = 0,
    public var bFirst: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusStartingParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusStartingParams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ClusStartingParams =
                    ClusStartingParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ClusStartingParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.bForm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.bFirst)
                }
            }
    }
}

public data class ClusStorageGetAvailableDriveletters(
    public var availDrivelettersMask: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusStorageGetAvailableDriveletters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusStorageGetAvailableDriveletters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ClusStorageGetAvailableDriveletters =
                    ClusStorageGetAvailableDriveletters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ClusStorageGetAvailableDriveletters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.availDrivelettersMask)
                }
            }
    }
}

public data class ClusStorageRemapDriveletter(
    public var currentDriveLetterMask: UInt = 0u,
    public var targetDriveLetterMask: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusStorageRemapDriveletter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusStorageRemapDriveletter> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ClusStorageRemapDriveletter =
                    ClusStorageRemapDriveletter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ClusStorageRemapDriveletter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.currentDriveLetterMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.targetDriveLetterMask)
                }
            }
    }
}

public data class ClusStorageSetDriveletter(
    public var partitionNumber: UInt = 0u,
    public var driveLetterMask: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusStorageSetDriveletter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClusStorageSetDriveletter> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ClusStorageSetDriveletter =
                    ClusStorageSetDriveletter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ClusStorageSetDriveletter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.partitionNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.driveLetterMask)
                }
            }
    }
}

public class ClusWorker internal constructor(
    hThreadCtorArg: Handle,
    public var terminate: Bool,
) {
    public var hThread: Handle = hThreadCtorArg
        internal set

    public constructor() : this(
        hThreadCtorArg = MutPtr(0L),
        terminate = 0,
    )

    public operator fun component1(): Handle = this.hThread

    public operator fun component2(): Bool = this.terminate

    public fun copy(hThread: Handle = this.hThread, terminate: Bool = this.terminate): ClusWorker = ClusWorker(hThreadCtorArg = hThread, terminate = terminate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusWorker) return false
        if (this.hThread != other.hThread) return false
        if (this.terminate != other.terminate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hThread.hashCode()
        result = 31 * result + this.terminate.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hThread: Handle = MutPtr(0L),
            terminate: Bool = 0,
        ): ClusWorker =
            ClusWorker(
                hThreadCtorArg = hThread,
                terminate = terminate,
            )
    }
}

public class CreateClusterConfig internal constructor(
    public var dwVersion: UInt,
    lpszClusterNameCtorArg: Pcwstr,
    public var cNodes: UInt,
    ppszNodeNamesCtorArg: ConstPtr,
    public var cIpEntries: UInt,
    pIpEntriesCtorArg: MutPtr,
    public var fEmptyCluster: Boolean,
    public var managementPointType: ClusterMgmtPointType,
    public var managementPointResType: ClusterMgmtPointRestype,
) {
    public var lpszClusterName: Pcwstr = lpszClusterNameCtorArg
        internal set

    public var ppszNodeNames: ConstPtr = ppszNodeNamesCtorArg
        internal set

    public var pIpEntries: MutPtr = pIpEntriesCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        lpszClusterNameCtorArg = ConstPtr(0L),
        cNodes = 0u,
        ppszNodeNamesCtorArg = ConstPtr(0L),
        cIpEntries = 0u,
        pIpEntriesCtorArg = MutPtr(0L),
        fEmptyCluster = false,
        managementPointType = 0,
        managementPointResType = 0,
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): Pcwstr = this.lpszClusterName

    public operator fun component3(): UInt = this.cNodes

    public operator fun component4(): ConstPtr = this.ppszNodeNames

    public operator fun component5(): UInt = this.cIpEntries

    public operator fun component6(): MutPtr = this.pIpEntries

    public operator fun component7(): Boolean = this.fEmptyCluster

    public operator fun component8(): ClusterMgmtPointType = this.managementPointType

    public operator fun component9(): ClusterMgmtPointRestype = this.managementPointResType

    public fun copy(dwVersion: UInt = this.dwVersion, lpszClusterName: Pcwstr = this.lpszClusterName, cNodes: UInt = this.cNodes, ppszNodeNames: ConstPtr = this.ppszNodeNames, cIpEntries: UInt = this.cIpEntries, pIpEntries: MutPtr = this.pIpEntries, fEmptyCluster: Boolean = this.fEmptyCluster, managementPointType: ClusterMgmtPointType = this.managementPointType, managementPointResType: ClusterMgmtPointRestype = this.managementPointResType): CreateClusterConfig = CreateClusterConfig(dwVersion = dwVersion, lpszClusterNameCtorArg = lpszClusterName, cNodes = cNodes, ppszNodeNamesCtorArg = ppszNodeNames, cIpEntries = cIpEntries, pIpEntriesCtorArg = pIpEntries, fEmptyCluster = fEmptyCluster, managementPointType = managementPointType, managementPointResType = managementPointResType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CreateClusterConfig) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.lpszClusterName != other.lpszClusterName) return false
        if (this.cNodes != other.cNodes) return false
        if (this.ppszNodeNames != other.ppszNodeNames) return false
        if (this.cIpEntries != other.cIpEntries) return false
        if (this.pIpEntries != other.pIpEntries) return false
        if (this.fEmptyCluster != other.fEmptyCluster) return false
        if (this.managementPointType != other.managementPointType) return false
        if (this.managementPointResType != other.managementPointResType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.lpszClusterName.hashCode()
        result = 31 * result + this.cNodes.hashCode()
        result = 31 * result + this.ppszNodeNames.hashCode()
        result = 31 * result + this.cIpEntries.hashCode()
        result = 31 * result + this.pIpEntries.hashCode()
        result = 31 * result + this.fEmptyCluster.hashCode()
        result = 31 * result + this.managementPointType.hashCode()
        result = 31 * result + this.managementPointResType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            lpszClusterName: Pcwstr = ConstPtr(0L),
            cNodes: UInt = 0u,
            ppszNodeNames: ConstPtr = ConstPtr(0L),
            cIpEntries: UInt = 0u,
            pIpEntries: MutPtr = MutPtr(0L),
            fEmptyCluster: Boolean = false,
            managementPointType: ClusterMgmtPointType = 0,
            managementPointResType: ClusterMgmtPointRestype = 0,
        ): CreateClusterConfig =
            CreateClusterConfig(
                dwVersion = dwVersion,
                lpszClusterNameCtorArg = lpszClusterName,
                cNodes = cNodes,
                ppszNodeNamesCtorArg = ppszNodeNames,
                cIpEntries = cIpEntries,
                pIpEntriesCtorArg = pIpEntries,
                fEmptyCluster = fEmptyCluster,
                managementPointType = managementPointType,
                managementPointResType = managementPointResType,
            )
    }
}

public class CreateClusterNameAccount internal constructor(
    public var dwVersion: UInt,
    lpszClusterNameCtorArg: Pcwstr,
    public var dwFlags: UInt,
    pszUserNameCtorArg: Pcwstr,
    pszPasswordCtorArg: Pcwstr,
    pszDomainCtorArg: Pcwstr,
    public var managementPointType: ClusterMgmtPointType,
    public var managementPointResType: ClusterMgmtPointRestype,
    public var bUpgradeVCOs: Boolean,
) {
    public var lpszClusterName: Pcwstr = lpszClusterNameCtorArg
        internal set

    public var pszUserName: Pcwstr = pszUserNameCtorArg
        internal set

    public var pszPassword: Pcwstr = pszPasswordCtorArg
        internal set

    public var pszDomain: Pcwstr = pszDomainCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        lpszClusterNameCtorArg = ConstPtr(0L),
        dwFlags = 0u,
        pszUserNameCtorArg = ConstPtr(0L),
        pszPasswordCtorArg = ConstPtr(0L),
        pszDomainCtorArg = ConstPtr(0L),
        managementPointType = 0,
        managementPointResType = 0,
        bUpgradeVCOs = false,
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): Pcwstr = this.lpszClusterName

    public operator fun component3(): UInt = this.dwFlags

    public operator fun component4(): Pcwstr = this.pszUserName

    public operator fun component5(): Pcwstr = this.pszPassword

    public operator fun component6(): Pcwstr = this.pszDomain

    public operator fun component7(): ClusterMgmtPointType = this.managementPointType

    public operator fun component8(): ClusterMgmtPointRestype = this.managementPointResType

    public operator fun component9(): Boolean = this.bUpgradeVCOs

    public fun copy(dwVersion: UInt = this.dwVersion, lpszClusterName: Pcwstr = this.lpszClusterName, dwFlags: UInt = this.dwFlags, pszUserName: Pcwstr = this.pszUserName, pszPassword: Pcwstr = this.pszPassword, pszDomain: Pcwstr = this.pszDomain, managementPointType: ClusterMgmtPointType = this.managementPointType, managementPointResType: ClusterMgmtPointRestype = this.managementPointResType, bUpgradeVCOs: Boolean = this.bUpgradeVCOs): CreateClusterNameAccount = CreateClusterNameAccount(dwVersion = dwVersion, lpszClusterNameCtorArg = lpszClusterName, dwFlags = dwFlags, pszUserNameCtorArg = pszUserName, pszPasswordCtorArg = pszPassword, pszDomainCtorArg = pszDomain, managementPointType = managementPointType, managementPointResType = managementPointResType, bUpgradeVCOs = bUpgradeVCOs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CreateClusterNameAccount) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.lpszClusterName != other.lpszClusterName) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.pszUserName != other.pszUserName) return false
        if (this.pszPassword != other.pszPassword) return false
        if (this.pszDomain != other.pszDomain) return false
        if (this.managementPointType != other.managementPointType) return false
        if (this.managementPointResType != other.managementPointResType) return false
        if (this.bUpgradeVCOs != other.bUpgradeVCOs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.lpszClusterName.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pszUserName.hashCode()
        result = 31 * result + this.pszPassword.hashCode()
        result = 31 * result + this.pszDomain.hashCode()
        result = 31 * result + this.managementPointType.hashCode()
        result = 31 * result + this.managementPointResType.hashCode()
        result = 31 * result + this.bUpgradeVCOs.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            lpszClusterName: Pcwstr = ConstPtr(0L),
            dwFlags: UInt = 0u,
            pszUserName: Pcwstr = ConstPtr(0L),
            pszPassword: Pcwstr = ConstPtr(0L),
            pszDomain: Pcwstr = ConstPtr(0L),
            managementPointType: ClusterMgmtPointType = 0,
            managementPointResType: ClusterMgmtPointRestype = 0,
            bUpgradeVCOs: Boolean = false,
        ): CreateClusterNameAccount =
            CreateClusterNameAccount(
                dwVersion = dwVersion,
                lpszClusterNameCtorArg = lpszClusterName,
                dwFlags = dwFlags,
                pszUserNameCtorArg = pszUserName,
                pszPasswordCtorArg = pszPassword,
                pszDomainCtorArg = pszDomain,
                managementPointType = managementPointType,
                managementPointResType = managementPointResType,
                bUpgradeVCOs = bUpgradeVCOs,
            )
    }
}

public data class FileshareChange(
    public var change: FileshareChangeEnum = 0,
    public var shareName: UShortArray = UShortArray(84),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FileshareChange) return false
        if (this.change != other.change) return false
        if (!this.shareName.contentEquals(other.shareName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.change.hashCode()
        result = 31 * result + this.shareName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileshareChange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileshareChange> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 172L
                override fun readNative(addr: Long): FileshareChange =
                    FileshareChange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (84).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: FileshareChange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.change)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (84).toInt())
                    ).writeNative(addr + 4L, value.shareName.toList())
                }
            }
    }
}

public data class FileshareChangeList(
    public var numEntries: UInt = 0u,
    public var changeEntry: List<FileshareChange> = List(1) { FileshareChange() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileshareChangeList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FileshareChangeList> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 176L
                override fun readNative(addr: Long): FileshareChangeList =
                    FileshareChangeList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(FileshareChange.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FileshareChangeList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(FileshareChange.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.changeEntry)
                }
            }
    }
}

public data class GetOperationContextParams(
    public var size: UInt = 0u,
    public var version: UInt = 0u,
    public var type: ResdllContextOperationType = 0,
    public var priority: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetOperationContextParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetOperationContextParams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): GetOperationContextParams =
                    GetOperationContextParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: GetOperationContextParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.priority)
                }
            }
    }
}

public data class GroupFailureInfo(
    public var dwFailoverAttemptsRemaining: UInt = 0u,
    public var dwFailoverPeriodRemaining: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GroupFailureInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GroupFailureInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): GroupFailureInfo =
                    GroupFailureInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: GroupFailureInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFailoverAttemptsRemaining)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFailoverPeriodRemaining)
                }
            }
    }
}

public data class GroupFailureInfoBuffer(
    public var dwVersion: UInt = 0u,
    public var info: GroupFailureInfo = GroupFailureInfo(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GroupFailureInfoBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GroupFailureInfoBuffer> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): GroupFailureInfoBuffer =
                    GroupFailureInfoBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (GroupFailureInfo.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: GroupFailureInfoBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (GroupFailureInfo.typeLayout()).writeNative(addr + 4L, value.info)
                }
            }
    }
}

public class MonitorState internal constructor(
    public var lastUpdate: Long,
    public var state: ResourceMonitorState,
    activeResourceCtorArg: Handle,
    public var resmonStop: Bool,
) {
    public var activeResource: Handle = activeResourceCtorArg
        internal set

    public constructor() : this(
        lastUpdate = 0L,
        state = 0,
        activeResourceCtorArg = MutPtr(0L),
        resmonStop = 0,
    )

    public operator fun component1(): Long = this.lastUpdate

    public operator fun component2(): ResourceMonitorState = this.state

    public operator fun component3(): Handle = this.activeResource

    public operator fun component4(): Bool = this.resmonStop

    public fun copy(lastUpdate: Long = this.lastUpdate, state: ResourceMonitorState = this.state, activeResource: Handle = this.activeResource, resmonStop: Bool = this.resmonStop): MonitorState = MonitorState(lastUpdate = lastUpdate, state = state, activeResourceCtorArg = activeResource, resmonStop = resmonStop)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MonitorState) return false
        if (this.lastUpdate != other.lastUpdate) return false
        if (this.state != other.state) return false
        if (this.activeResource != other.activeResource) return false
        if (this.resmonStop != other.resmonStop) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lastUpdate.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.activeResource.hashCode()
        result = 31 * result + this.resmonStop.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lastUpdate: Long = 0L,
            state: ResourceMonitorState = 0,
            activeResource: Handle = MutPtr(0L),
            resmonStop: Bool = 0,
        ): MonitorState =
            MonitorState(
                lastUpdate = lastUpdate,
                state = state,
                activeResourceCtorArg = activeResource,
                resmonStop = resmonStop,
            )
    }
}

public data class NotifyFilterAndType(
    public var dwObjectType: UInt = 0u,
    public var filterFlags: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NotifyFilterAndType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NotifyFilterAndType> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NotifyFilterAndType =
                    NotifyFilterAndType(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: NotifyFilterAndType) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwObjectType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.filterFlags)
                }
            }
    }
}

public data class NodeUtilizationInfoElement(
    public var id: ULong = 0uL,
    public var availableMemory: ULong = 0uL,
    public var availableMemoryAfterReclamation: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NodeUtilizationInfoElement> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NodeUtilizationInfoElement> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): NodeUtilizationInfoElement =
                    NodeUtilizationInfoElement(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: NodeUtilizationInfoElement) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.availableMemory)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.availableMemoryAfterReclamation)
                }
            }
    }
}

public data class PostUpgradeVersionInfo(
    public var newMajorVersion: UInt = 0u,
    public var newUpgradeVersion: UInt = 0u,
    public var oldMajorVersion: UInt = 0u,
    public var oldUpgradeVersion: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PostUpgradeVersionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PostUpgradeVersionInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): PostUpgradeVersionInfo =
                    PostUpgradeVersionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: PostUpgradeVersionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.newMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.newUpgradeVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.oldMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.oldUpgradeVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.reserved)
                }
            }
    }
}

public data class PaxosTagCStruct(
    public var paddingPaxosTagVtable: ULong = 0uL,
    public var paddingNextEpochVtable: ULong = 0uL,
    public var paddingNextEpochDateTimeVtable: ULong = 0uL,
    public var nextEpochDateTimeTicks: ULong = 0uL,
    public var nextEpochValue: Int = 0,
    public var paddingBoundryNextEpoch: UInt = 0u,
    public var paddingEpochVtable: ULong = 0uL,
    public var paddingEpochDateTimeVtable: ULong = 0uL,
    public var epochDateTimeTicks: ULong = 0uL,
    public var epochValue: Int = 0,
    public var paddingBoundryEpoch: UInt = 0u,
    public var sequence: Int = 0,
    public var paddingBoundrySequence: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PaxosTagCStruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PaxosTagCStruct> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): PaxosTagCStruct =
                    PaxosTagCStruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                    )
                override fun writeNative(addr: Long, value: PaxosTagCStruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.paddingPaxosTagVtable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.paddingNextEpochVtable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.paddingNextEpochDateTimeVtable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.nextEpochDateTimeTicks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.nextEpochValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.paddingBoundryNextEpoch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.paddingEpochVtable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.paddingEpochDateTimeVtable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.epochDateTimeTicks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.epochValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.paddingBoundryEpoch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 72L, value.sequence)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.paddingBoundrySequence)
                }
            }
    }
}

public data class ResourceFailureInfo(
    public var dwRestartAttemptsRemaining: UInt = 0u,
    public var dwRestartPeriodRemaining: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResourceFailureInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResourceFailureInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ResourceFailureInfo =
                    ResourceFailureInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ResourceFailureInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwRestartAttemptsRemaining)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwRestartPeriodRemaining)
                }
            }
    }
}

public data class ResourceFailureInfoBuffer(
    public var dwVersion: UInt = 0u,
    public var info: ResourceFailureInfo = ResourceFailureInfo(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResourceFailureInfoBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResourceFailureInfoBuffer> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ResourceFailureInfoBuffer =
                    ResourceFailureInfoBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (ResourceFailureInfo.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ResourceFailureInfoBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (ResourceFailureInfo.typeLayout()).writeNative(addr + 4L, value.info)
                }
            }
    }
}

public class ResourceStatus internal constructor(
    public var resourceState: ClusterResourceState,
    public var checkPoint: UInt,
    public var waitHint: UInt,
    eventHandleCtorArg: Handle,
) {
    public var eventHandle: Handle = eventHandleCtorArg
        internal set

    public constructor() : this(
        resourceState = 0,
        checkPoint = 0u,
        waitHint = 0u,
        eventHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ClusterResourceState = this.resourceState

    public operator fun component2(): UInt = this.checkPoint

    public operator fun component3(): UInt = this.waitHint

    public operator fun component4(): Handle = this.eventHandle

    public fun copy(resourceState: ClusterResourceState = this.resourceState, checkPoint: UInt = this.checkPoint, waitHint: UInt = this.waitHint, eventHandle: Handle = this.eventHandle): ResourceStatus = ResourceStatus(resourceState = resourceState, checkPoint = checkPoint, waitHint = waitHint, eventHandleCtorArg = eventHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ResourceStatus) return false
        if (this.resourceState != other.resourceState) return false
        if (this.checkPoint != other.checkPoint) return false
        if (this.waitHint != other.waitHint) return false
        if (this.eventHandle != other.eventHandle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.resourceState.hashCode()
        result = 31 * result + this.checkPoint.hashCode()
        result = 31 * result + this.waitHint.hashCode()
        result = 31 * result + this.eventHandle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            resourceState: ClusterResourceState = 0,
            checkPoint: UInt = 0u,
            waitHint: UInt = 0u,
            eventHandle: Handle = MutPtr(0L),
        ): ResourceStatus =
            ResourceStatus(
                resourceState = resourceState,
                checkPoint = checkPoint,
                waitHint = waitHint,
                eventHandleCtorArg = eventHandle,
            )
    }
}

public class ResourceStatusEx internal constructor(
    public var resourceState: ClusterResourceState,
    public var checkPoint: UInt,
    eventHandleCtorArg: Handle,
    public var applicationSpecificErrorCode: UInt,
    public var flags: UInt,
    public var waitHint: UInt,
) {
    public var eventHandle: Handle = eventHandleCtorArg
        internal set

    public constructor() : this(
        resourceState = 0,
        checkPoint = 0u,
        eventHandleCtorArg = MutPtr(0L),
        applicationSpecificErrorCode = 0u,
        flags = 0u,
        waitHint = 0u,
    )

    public operator fun component1(): ClusterResourceState = this.resourceState

    public operator fun component2(): UInt = this.checkPoint

    public operator fun component3(): Handle = this.eventHandle

    public operator fun component4(): UInt = this.applicationSpecificErrorCode

    public operator fun component5(): UInt = this.flags

    public operator fun component6(): UInt = this.waitHint

    public fun copy(resourceState: ClusterResourceState = this.resourceState, checkPoint: UInt = this.checkPoint, eventHandle: Handle = this.eventHandle, applicationSpecificErrorCode: UInt = this.applicationSpecificErrorCode, flags: UInt = this.flags, waitHint: UInt = this.waitHint): ResourceStatusEx = ResourceStatusEx(resourceState = resourceState, checkPoint = checkPoint, eventHandleCtorArg = eventHandle, applicationSpecificErrorCode = applicationSpecificErrorCode, flags = flags, waitHint = waitHint)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ResourceStatusEx) return false
        if (this.resourceState != other.resourceState) return false
        if (this.checkPoint != other.checkPoint) return false
        if (this.eventHandle != other.eventHandle) return false
        if (this.applicationSpecificErrorCode != other.applicationSpecificErrorCode) return false
        if (this.flags != other.flags) return false
        if (this.waitHint != other.waitHint) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.resourceState.hashCode()
        result = 31 * result + this.checkPoint.hashCode()
        result = 31 * result + this.eventHandle.hashCode()
        result = 31 * result + this.applicationSpecificErrorCode.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.waitHint.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            resourceState: ClusterResourceState = 0,
            checkPoint: UInt = 0u,
            eventHandle: Handle = MutPtr(0L),
            applicationSpecificErrorCode: UInt = 0u,
            flags: UInt = 0u,
            waitHint: UInt = 0u,
        ): ResourceStatusEx =
            ResourceStatusEx(
                resourceState = resourceState,
                checkPoint = checkPoint,
                eventHandleCtorArg = eventHandle,
                applicationSpecificErrorCode = applicationSpecificErrorCode,
                flags = flags,
                waitHint = waitHint,
            )
    }
}

public data class ResourceTerminalFailureInfoBuffer(
    public var isTerminalFailure: Bool = 0,
    public var restartPeriodRemaining: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResourceTerminalFailureInfoBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResourceTerminalFailureInfoBuffer> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ResourceTerminalFailureInfoBuffer =
                    ResourceTerminalFailureInfoBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ResourceTerminalFailureInfoBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.isTerminalFailure)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.restartPeriodRemaining)
                }
            }
    }
}

public data class ResutilFiletimeData(
    public var default: Filetime = Filetime(),
    public var minimum: Filetime = Filetime(),
    public var maximum: Filetime = Filetime(),
)

public data class ResutilLargeintData(
    public var default: Long = 0L,
    public var minimum: Long = 0L,
    public var maximum: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResutilLargeintData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResutilLargeintData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ResutilLargeintData =
                    ResutilLargeintData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ResutilLargeintData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.default)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.minimum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.maximum)
                }
            }
    }
}

public class ResutilPropertyItem internal constructor(
    nameCtorArg: Pwstr,
    keyNameCtorArg: Pwstr,
    public var format: UInt,
    public var anonymous: ResutilPropertyItem0,
    public var minimum: UInt,
    public var maximum: UInt,
    public var flags: UInt,
    public var offset: UInt,
) {
    public var name: Pwstr = nameCtorArg
        internal set

    public var keyName: Pwstr = keyNameCtorArg
        internal set

    public constructor() : this(
        nameCtorArg = MutPtr(0L),
        keyNameCtorArg = MutPtr(0L),
        format = 0u,
        anonymous = ResutilPropertyItem0(),
        minimum = 0u,
        maximum = 0u,
        flags = 0u,
        offset = 0u,
    )

    public operator fun component1(): Pwstr = this.name

    public operator fun component2(): Pwstr = this.keyName

    public operator fun component3(): UInt = this.format

    public operator fun component4(): ResutilPropertyItem0 = this.anonymous

    public operator fun component5(): UInt = this.minimum

    public operator fun component6(): UInt = this.maximum

    public operator fun component7(): UInt = this.flags

    public operator fun component8(): UInt = this.offset

    public fun copy(name: Pwstr = this.name, keyName: Pwstr = this.keyName, format: UInt = this.format, anonymous: ResutilPropertyItem0 = this.anonymous, minimum: UInt = this.minimum, maximum: UInt = this.maximum, flags: UInt = this.flags, offset: UInt = this.offset): ResutilPropertyItem = ResutilPropertyItem(nameCtorArg = name, keyNameCtorArg = keyName, format = format, anonymous = anonymous, minimum = minimum, maximum = maximum, flags = flags, offset = offset)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ResutilPropertyItem) return false
        if (this.name != other.name) return false
        if (this.keyName != other.keyName) return false
        if (this.format != other.format) return false
        if (this.anonymous != other.anonymous) return false
        if (this.minimum != other.minimum) return false
        if (this.maximum != other.maximum) return false
        if (this.flags != other.flags) return false
        if (this.offset != other.offset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.keyName.hashCode()
        result = 31 * result + this.format.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.minimum.hashCode()
        result = 31 * result + this.maximum.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.offset.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            name: Pwstr = MutPtr(0L),
            keyName: Pwstr = MutPtr(0L),
            format: UInt = 0u,
            anonymous: ResutilPropertyItem0 = ResutilPropertyItem0(),
            minimum: UInt = 0u,
            maximum: UInt = 0u,
            flags: UInt = 0u,
            offset: UInt = 0u,
        ): ResutilPropertyItem =
            ResutilPropertyItem(
                nameCtorArg = name,
                keyNameCtorArg = keyName,
                format = format,
                anonymous = anonymous,
                minimum = minimum,
                maximum = maximum,
                flags = flags,
                offset = offset,
            )
    }
}

public class ResutilPropertyItem0 internal constructor(
    public var defaultPtr: Int,
    public var default: UInt,
    lpDefaultCtorArg: MutPtr,
    largeIntDataCtorArg: MutPtr,
    uLargeIntDataCtorArg: MutPtr,
    fileTimeDataCtorArg: MutPtr,
) {
    public var lpDefault: MutPtr = lpDefaultCtorArg
        internal set

    public var largeIntData: MutPtr = largeIntDataCtorArg
        internal set

    public var uLargeIntData: MutPtr = uLargeIntDataCtorArg
        internal set

    public var fileTimeData: MutPtr = fileTimeDataCtorArg
        internal set

    public constructor() : this(
        defaultPtr = 0,
        default = 0u,
        lpDefaultCtorArg = MutPtr(0L),
        largeIntDataCtorArg = MutPtr(0L),
        uLargeIntDataCtorArg = MutPtr(0L),
        fileTimeDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.defaultPtr

    public operator fun component2(): UInt = this.default

    public operator fun component3(): MutPtr = this.lpDefault

    public operator fun component4(): MutPtr = this.largeIntData

    public operator fun component5(): MutPtr = this.uLargeIntData

    public operator fun component6(): MutPtr = this.fileTimeData

    public fun copy(defaultPtr: Int = this.defaultPtr, default: UInt = this.default, lpDefault: MutPtr = this.lpDefault, largeIntData: MutPtr = this.largeIntData, uLargeIntData: MutPtr = this.uLargeIntData, fileTimeData: MutPtr = this.fileTimeData): ResutilPropertyItem0 = ResutilPropertyItem0(defaultPtr = defaultPtr, default = default, lpDefaultCtorArg = lpDefault, largeIntDataCtorArg = largeIntData, uLargeIntDataCtorArg = uLargeIntData, fileTimeDataCtorArg = fileTimeData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ResutilPropertyItem0) return false
        if (this.defaultPtr != other.defaultPtr) return false
        if (this.default != other.default) return false
        if (this.lpDefault != other.lpDefault) return false
        if (this.largeIntData != other.largeIntData) return false
        if (this.uLargeIntData != other.uLargeIntData) return false
        if (this.fileTimeData != other.fileTimeData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.defaultPtr.hashCode()
        result = 31 * result + this.default.hashCode()
        result = 31 * result + this.lpDefault.hashCode()
        result = 31 * result + this.largeIntData.hashCode()
        result = 31 * result + this.uLargeIntData.hashCode()
        result = 31 * result + this.fileTimeData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            defaultPtr: Int = 0,
            default: UInt = 0u,
            lpDefault: MutPtr = MutPtr(0L),
            largeIntData: MutPtr = MutPtr(0L),
            uLargeIntData: MutPtr = MutPtr(0L),
            fileTimeData: MutPtr = MutPtr(0L),
        ): ResutilPropertyItem0 =
            ResutilPropertyItem0(
                defaultPtr = defaultPtr,
                default = default,
                lpDefaultCtorArg = lpDefault,
                largeIntDataCtorArg = largeIntData,
                uLargeIntDataCtorArg = uLargeIntData,
                fileTimeDataCtorArg = fileTimeData,
            )
    }
}

public data class ResutilUlargeintData(
    public var default: ULong = 0uL,
    public var minimum: ULong = 0uL,
    public var maximum: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResutilUlargeintData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResutilUlargeintData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ResutilUlargeintData =
                    ResutilUlargeintData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ResutilUlargeintData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.default)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.minimum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.maximum)
                }
            }
    }
}

public data class ResourceUtilizationInfoElement(
    public var physicalNumaId: ULong = 0uL,
    public var currentMemory: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResourceUtilizationInfoElement> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResourceUtilizationInfoElement> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ResourceUtilizationInfoElement =
                    ResourceUtilizationInfoElement(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ResourceUtilizationInfoElement) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.physicalNumaId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.currentMemory)
                }
            }
    }
}

public data class SrResourceTypeAddReplicationGroup(
    public var replicationGroupName: UShortArray = UShortArray(260),
    public var description: UShortArray = UShortArray(260),
    public var logPath: UShortArray = UShortArray(260),
    public var maxLogSizeInBytes: ULong = 0uL,
    public var logType: UShort = 0u,
    public var replicationMode: UInt = 0u,
    public var minimumPartnersInSync: UInt = 0u,
    public var enableWriteConsistency: Boolean = false,
    public var enableEncryption: Boolean = false,
    public var enableCompression: Boolean = false,
    public var certificateThumbprint: UShortArray = UShortArray(260),
    public var volumeNameCount: UInt = 0u,
    public var volumeNames: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SrResourceTypeAddReplicationGroup) return false
        if (!this.replicationGroupName.contentEquals(other.replicationGroupName)) return false
        if (!this.description.contentEquals(other.description)) return false
        if (!this.logPath.contentEquals(other.logPath)) return false
        if (this.maxLogSizeInBytes != other.maxLogSizeInBytes) return false
        if (this.logType != other.logType) return false
        if (this.replicationMode != other.replicationMode) return false
        if (this.minimumPartnersInSync != other.minimumPartnersInSync) return false
        if (this.enableWriteConsistency != other.enableWriteConsistency) return false
        if (this.enableEncryption != other.enableEncryption) return false
        if (this.enableCompression != other.enableCompression) return false
        if (!this.certificateThumbprint.contentEquals(other.certificateThumbprint)) return false
        if (this.volumeNameCount != other.volumeNameCount) return false
        if (!this.volumeNames.contentEquals(other.volumeNames)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.replicationGroupName.contentHashCode()
        result = 31 * result + this.description.contentHashCode()
        result = 31 * result + this.logPath.contentHashCode()
        result = 31 * result + this.maxLogSizeInBytes.hashCode()
        result = 31 * result + this.logType.hashCode()
        result = 31 * result + this.replicationMode.hashCode()
        result = 31 * result + this.minimumPartnersInSync.hashCode()
        result = 31 * result + this.enableWriteConsistency.hashCode()
        result = 31 * result + this.enableEncryption.hashCode()
        result = 31 * result + this.enableCompression.hashCode()
        result = 31 * result + this.certificateThumbprint.contentHashCode()
        result = 31 * result + this.volumeNameCount.hashCode()
        result = 31 * result + this.volumeNames.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SrResourceTypeAddReplicationGroup> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SrResourceTypeAddReplicationGroup> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 2632L
                override fun readNative(addr: Long): SrResourceTypeAddReplicationGroup =
                    SrResourceTypeAddReplicationGroup(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 520L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 1040L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1560L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 1568L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1572L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1576L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1580L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1581L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1582L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 1584L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 2104L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 2108L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: SrResourceTypeAddReplicationGroup) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr, value.replicationGroupName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 520L, value.description.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 1040L, value.logPath.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1560L, value.maxLogSizeInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 1568L, value.logType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1572L, value.replicationMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1576L, value.minimumPartnersInSync)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1580L, value.enableWriteConsistency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1581L, value.enableEncryption)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1582L, value.enableCompression)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 1584L, value.certificateThumbprint.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 2104L, value.volumeNameCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 2108L, value.volumeNames.toList())
                }
            }
    }
}

public data class SrResourceTypeAddReplicationGroupResult(
    public var result: UInt = 0u,
    public var errorString: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SrResourceTypeAddReplicationGroupResult) return false
        if (this.result != other.result) return false
        if (!this.errorString.contentEquals(other.errorString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.result.hashCode()
        result = 31 * result + this.errorString.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SrResourceTypeAddReplicationGroupResult> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SrResourceTypeAddReplicationGroupResult> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 524L
                override fun readNative(addr: Long): SrResourceTypeAddReplicationGroupResult =
                    SrResourceTypeAddReplicationGroupResult(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: SrResourceTypeAddReplicationGroupResult) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.result)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 4L, value.errorString.toList())
                }
            }
    }
}

public data class SrResourceTypeDiskInfo(
    public var reason: SrDiskReplicationEligible = 0,
    public var diskGuid: Guid = Guid(),
)

public data class SrResourceTypeEligibleDisksResult(
    public var count: UShort = 0u,
    public var diskInfo: List<SrResourceTypeDiskInfo> = List(1) { SrResourceTypeDiskInfo() },
)

public data class SrResourceTypeQueryEligibleLogdisks(
    public var dataDiskGuid: Guid = Guid(),
    public var includeOfflineDisks: Boolean = false,
)

public data class SrResourceTypeQueryEligibleSourceDatadisks(
    public var dataDiskGuid: Guid = Guid(),
    public var includeAvailableStoargeDisks: Boolean = false,
)

public data class SrResourceTypeQueryEligibleTargetDatadisks(
    public var sourceDataDiskGuid: Guid = Guid(),
    public var targetReplicationGroupGuid: Guid = Guid(),
    public var skipConnectivityCheck: Boolean = false,
    public var includeOfflineDisks: Boolean = false,
)

public data class SrResourceTypeReplicatedDisk(
    public var type: SrReplicatedDiskType = 0,
    public var clusterDiskResourceGuid: Guid = Guid(),
    public var replicationGroupId: Guid = Guid(),
    public var replicationGroupName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SrResourceTypeReplicatedDisk) return false
        if (this.type != other.type) return false
        if (this.clusterDiskResourceGuid != other.clusterDiskResourceGuid) return false
        if (this.replicationGroupId != other.replicationGroupId) return false
        if (!this.replicationGroupName.contentEquals(other.replicationGroupName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.clusterDiskResourceGuid.hashCode()
        result = 31 * result + this.replicationGroupId.hashCode()
        result = 31 * result + this.replicationGroupName.contentHashCode()
        return result
    }
}

public data class SrResourceTypeReplicatedDisksResult(
    public var count: UShort = 0u,
    public var replicatedDisks: List<SrResourceTypeReplicatedDisk> = List(1) { SrResourceTypeReplicatedDisk() },
)

public data class SrResourceTypeReplicatedPartitionArray(
    public var count: UInt = 0u,
    public var partitionArray: List<SrResourceTypeReplicatedPartitionInfo> = List(1) { SrResourceTypeReplicatedPartitionInfo() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SrResourceTypeReplicatedPartitionArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SrResourceTypeReplicatedPartitionArray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): SrResourceTypeReplicatedPartitionArray =
                    SrResourceTypeReplicatedPartitionArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(SrResourceTypeReplicatedPartitionInfo.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SrResourceTypeReplicatedPartitionArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(SrResourceTypeReplicatedPartitionInfo.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.partitionArray)
                }
            }
    }
}

public data class SrResourceTypeReplicatedPartitionInfo(
    public var partitionOffset: ULong = 0uL,
    public var capabilities: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SrResourceTypeReplicatedPartitionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SrResourceTypeReplicatedPartitionInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SrResourceTypeReplicatedPartitionInfo =
                    SrResourceTypeReplicatedPartitionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SrResourceTypeReplicatedPartitionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.partitionOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.capabilities)
                }
            }
    }
}

public data class WitnessTagHelper(
    public var version: Int = 0,
    public var paxosToValidate: PaxosTagCStruct = PaxosTagCStruct(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WitnessTagHelper> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WitnessTagHelper> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): WitnessTagHelper =
                    WitnessTagHelper(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (PaxosTagCStruct.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WitnessTagHelper) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.version)
                    (PaxosTagCStruct.typeLayout()).writeNative(addr + 8L, value.paxosToValidate)
                }
            }
    }
}

public data class WitnessTagUpdateHelper(
    public var version: Int = 0,
    public var paxosToSet: PaxosTagCStruct = PaxosTagCStruct(),
    public var paxosToValidate: PaxosTagCStruct = PaxosTagCStruct(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WitnessTagUpdateHelper> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WitnessTagUpdateHelper> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 168L
                override fun readNative(addr: Long): WitnessTagUpdateHelper =
                    WitnessTagUpdateHelper(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (PaxosTagCStruct.typeLayout()).readNative(addr + 8L),
                        (PaxosTagCStruct.typeLayout()).readNative(addr + 88L),
                    )
                override fun writeNative(addr: Long, value: WitnessTagUpdateHelper) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.version)
                    (PaxosTagCStruct.typeLayout()).writeNative(addr + 8L, value.paxosToSet)
                    (PaxosTagCStruct.typeLayout()).writeNative(addr + 88L, value.paxosToValidate)
                }
            }
    }
}
