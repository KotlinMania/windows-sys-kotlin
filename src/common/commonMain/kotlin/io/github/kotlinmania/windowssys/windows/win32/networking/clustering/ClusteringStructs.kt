@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networking.clustering

import io.github.kotlinmania.windowssys.COpaquePointer
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

public data class ClusapiReasonHandler(public var lpParameter: COpaquePointer? = null, public var pfnHandler: PclusapiPfnReasonHandler = null)

public data class ClusctlGroupGetLastMoveTimeOutput(
    public var getTickCount64: ULong = 0uL,
    public var getSystemTime: Systemtime = Systemtime(),
    public var nodeId: UInt = 0u,
)

public data class ClusctlResourceStateChangeReasonStruct(
    public var dwSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var eReason: ClusterResourceStateChangeReason = 0,
)

public data class ClusctlResourceTypeStorageGetAvailableDisksEx2Input(public var dwFlags: UInt = 0u, public var guidPoolFilter: Guid = Guid())

public data class CluspropBinary(public var base: CluspropValue = CluspropValue(), public var rgb: UByteArray = UByteArray(1)) {
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

public class CluspropBufferHelper(
    public var pb: COpaquePointer? = null,
    public var pw: UShort? = null,
    public var pdw: UInt? = null,
    public var pl: Int? = null,
    public var psz: Pwstr = null,
    public var pList: CluspropList? = null,
    public var pSyntax: CluspropSyntax? = null,
    public var pName: CluspropSz? = null,
    public var pValue: CluspropValue? = null,
    public var pBinaryValue: CluspropBinary? = null,
    public var pWordValue: CluspropWord? = null,
    public var pDwordValue: CluspropDword? = null,
    public var pLongValue: CluspropLong? = null,
    public var pULargeIntegerValue: CluspropUlargeInteger? = null,
    public var pLargeIntegerValue: CluspropLargeInteger? = null,
    public var pStringValue: CluspropSz? = null,
    public var pMultiSzValue: CluspropSz? = null,
    public var pSecurityDescriptor: CluspropSecurityDescriptor? = null,
    public var pResourceClassValue: CluspropResourceClass? = null,
    public var pResourceClassInfoValue: CluspropResourceClassInfo? = null,
    public var pDiskSignatureValue: CluspropDword? = null,
    public var pScsiAddressValue: CluspropScsiAddress? = null,
    public var pDiskNumberValue: CluspropDword? = null,
    public var pPartitionInfoValue: CluspropPartitionInfo? = null,
    public var pRequiredDependencyValue: CluspropRequiredDependency? = null,
    public var pPartitionInfoValueEx: CluspropPartitionInfoEx? = null,
    public var pPartitionInfoValueEx2: CluspropPartitionInfoEx2? = null,
    public var pFileTimeValue: CluspropFiletime? = null,
)

public data class CluspropDword(public var base: CluspropValue = CluspropValue(), public var dw: UInt = 0u)

public data class CluspropFiletime(public var base: CluspropValue = CluspropValue(), public var ft: Filetime = Filetime())

public data class CluspropFtsetInfo(public var base: CluspropValue = CluspropValue(), public var base2: ClusFtsetInfo = ClusFtsetInfo())

public data class CluspropLargeInteger(public var base: CluspropValue = CluspropValue(), public var li: Long = 0L)

public data class CluspropList(public var nPropertyCount: UInt = 0u, public var propertyName: CluspropSz = CluspropSz())

public data class CluspropLong(public var base: CluspropValue = CluspropValue(), public var l: Int = 0)

public data class CluspropPartitionInfo(public var base: CluspropValue = CluspropValue(), public var base2: ClusPartitionInfo = ClusPartitionInfo())

public data class CluspropPartitionInfoEx(public var base: CluspropValue = CluspropValue(), public var base2: ClusPartitionInfoEx = ClusPartitionInfoEx())

public data class CluspropPartitionInfoEx2(public var base: CluspropPartitionInfoEx = CluspropPartitionInfoEx(), public var base2: ClusPartitionInfoEx2 = ClusPartitionInfoEx2())

public data class CluspropRequiredDependency(
    public var value: CluspropValue = CluspropValue(),
    public var resClass: CluspropResourceClass = CluspropResourceClass(),
    public var resTypeName: CluspropSz = CluspropSz(),
)

public data class CluspropResourceClass(public var base: CluspropValue = CluspropValue(), public var rc: ClusterResourceClass = 0)

public data class CluspropResourceClassInfo(public var base: CluspropValue = CluspropValue(), public var base2: ClusResourceClassInfo = ClusResourceClassInfo())

public data class CluspropScsiAddress(public var base: CluspropValue = CluspropValue(), public var base2: ClusScsiAddress = ClusScsiAddress())

public data class CluspropSecurityDescriptor(public var base: CluspropValue = CluspropValue(), public var anonymous: CluspropSecurityDescriptor0 = CluspropSecurityDescriptor0())

public data class CluspropSecurityDescriptor0(public var sd: SecurityDescriptorRelative = SecurityDescriptorRelative(), public var rgbSecurityDescriptor: UByteArray = UByteArray(1)) {
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

public data class CluspropSyntax(public var dw: UInt = 0u, public var anonymous: CluspropSyntax0 = CluspropSyntax0())

public data class CluspropSyntax0(public var wFormat: UShort = 0u, public var wType: UShort = 0u)

public data class CluspropSz(public var base: CluspropValue = CluspropValue(), public var sz: UShortArray = UShortArray(1)) {
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

public data class CluspropUlargeInteger(public var base: CluspropValue = CluspropValue(), public var li: ULong = 0uL)

public data class CluspropValue(public var syntax: CluspropSyntax = CluspropSyntax(), public var cbLength: UInt = 0u)

public data class CluspropWord(public var base: CluspropValue = CluspropValue(), public var w: UShort = 0u)

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
}

public data class ClusterAvailabilitySetConfig(
    public var dwVersion: UInt = 0u,
    public var dwUpdateDomains: UInt = 0u,
    public var dwFaultDomains: UInt = 0u,
    public var bReserveSpareNode: Bool = 0,
)

public data class ClusterBatchCommand(
    public var command: ClusterRegCommand = 0,
    public var dwOptions: UInt = 0u,
    public var wzName: Pcwstr = null,
    public var lpData: COpaquePointer? = null,
    public var cbData: UInt = 0u,
)

public data class ClusterCreateGroupInfo(public var dwVersion: UInt = 0u, public var groupType: ClusgroupType = 0)

public data class ClusterEnumItem(
    public var dwVersion: UInt = 0u,
    public var dwType: UInt = 0u,
    public var cbId: UInt = 0u,
    public var lpszId: Pwstr = null,
    public var cbName: UInt = 0u,
    public var lpszName: Pwstr = null,
)

public data class ClusterGroupEnumItem(
    public var dwVersion: UInt = 0u,
    public var cbId: UInt = 0u,
    public var lpszId: Pwstr = null,
    public var cbName: UInt = 0u,
    public var lpszName: Pwstr = null,
    public var state: ClusterGroupState = 0,
    public var cbOwnerNode: UInt = 0u,
    public var lpszOwnerNode: Pwstr = null,
    public var dwFlags: UInt = 0u,
    public var cbProperties: UInt = 0u,
    public var pProperties: COpaquePointer? = null,
    public var cbRoProperties: UInt = 0u,
    public var pRoProperties: COpaquePointer? = null,
)

public data class ClusterHealthFault(
    public var id: Pwstr = null,
    public var errorType: UInt = 0u,
    public var errorCode: UInt = 0u,
    public var description: Pwstr = null,
    public var provider: Pwstr = null,
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class ClusterHealthFaultArray(public var numFaults: UInt = 0u, public var faults: ClusterHealthFault? = null)

public data class ClusterIpEntry(public var lpszIpAddress: Pcwstr = null, public var dwPrefixLength: UInt = 0u)

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
}

public data class ClusterReadBatchCommand(
    public var command: ClusterRegCommand = 0,
    public var dwOptions: UInt = 0u,
    public var wzSubkeyName: Pcwstr = null,
    public var wzValueName: Pcwstr = null,
    public var lpData: COpaquePointer? = null,
    public var cbData: UInt = 0u,
)

public data class ClusterResourceEnumItem(
    public var dwVersion: UInt = 0u,
    public var cbId: UInt = 0u,
    public var lpszId: Pwstr = null,
    public var cbName: UInt = 0u,
    public var lpszName: Pwstr = null,
    public var cbOwnerGroupName: UInt = 0u,
    public var lpszOwnerGroupName: Pwstr = null,
    public var cbOwnerGroupId: UInt = 0u,
    public var lpszOwnerGroupId: Pwstr = null,
    public var cbProperties: UInt = 0u,
    public var pProperties: COpaquePointer? = null,
    public var cbRoProperties: UInt = 0u,
    public var pRoProperties: COpaquePointer? = null,
)

public data class ClusterSetPasswordStatus(
    public var nodeId: UInt = 0u,
    public var setAttempted: Boolean = false,
    public var returnStatus: UInt = 0u,
)

public data class ClusterSharedVolumeRenameGuidInput(public var base: ClusterSharedVolumeRenameInputVolume = ClusterSharedVolumeRenameInputVolume(), public var base2: ClusterSharedVolumeRenameInputGuidName = ClusterSharedVolumeRenameInputGuidName())

public data class ClusterSharedVolumeRenameInput(public var base: ClusterSharedVolumeRenameInputVolume = ClusterSharedVolumeRenameInputVolume(), public var base2: ClusterSharedVolumeRenameInputName = ClusterSharedVolumeRenameInputName())

public data class ClusterSharedVolumeRenameInputGuidName(public var newVolumeName: UShortArray = UShortArray(260), public var newVolumeGuid: UShortArray = UShortArray(50)) {
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
}

public data class ClusterSharedVolumeRenameInputName(public var newVolumeName: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterSharedVolumeRenameInputName) return false
        if (!this.newVolumeName.contentEquals(other.newVolumeName)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.newVolumeName.contentHashCode()
    }
}

public data class ClusterSharedVolumeRenameInputVolume(public var inputType: ClusterSharedVolumeRenameInputType = 0, public var anonymous: ClusterSharedVolumeRenameInputVolume0 = ClusterSharedVolumeRenameInputVolume0())

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
}

public data class ClusterValidateCsvFilename(public var szFileName: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterValidateCsvFilename) return false
        if (!this.szFileName.contentEquals(other.szFileName)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.szFileName.contentHashCode()
    }
}

public data class ClusterValidateDirectory(public var szPath: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterValidateDirectory) return false
        if (!this.szPath.contentEquals(other.szPath)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.szPath.contentHashCode()
    }
}

public data class ClusterValidateNetname(public var szNetworkName: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterValidateNetname) return false
        if (!this.szNetworkName.contentEquals(other.szNetworkName)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.szNetworkName.contentHashCode()
    }
}

public data class ClusterValidatePath(public var szPath: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusterValidatePath) return false
        if (!this.szPath.contentEquals(other.szPath)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.szPath.contentHashCode()
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
}

public data class ClusCreateInfrastructureFileserverInput(public var fileServerName: UShortArray = UShortArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusCreateInfrastructureFileserverInput) return false
        if (!this.fileServerName.contentEquals(other.fileServerName)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.fileServerName.contentHashCode()
    }
}

public data class ClusCreateInfrastructureFileserverOutput(public var fileServerName: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClusCreateInfrastructureFileserverOutput) return false
        if (!this.fileServerName.contentEquals(other.fileServerName)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.fileServerName.contentHashCode()
    }
}

public data class ClusCsvMaintenanceModeInfo(public var inMaintenance: Bool = 0, public var volumeName: UShortArray = UShortArray(260)) {
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
}

public data class ClusDiskNumberInfo(public var diskNumber: UInt = 0u, public var bytesPerSector: UInt = 0u)

public data class ClusDnnLeaderStatus(public var isOnline: Bool = 0, public var isFileServerPresent: Bool = 0)

public data class ClusDnnSodafsCloneStatus(public var nodeId: UInt = 0u, public var status: ClusterResourceState = 0)

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
}

public data class ClusFtsetInfo(public var dwRootSignature: UInt = 0u, public var dwFtType: UInt = 0u)

public data class ClusMaintenanceModeInfo(public var inMaintenance: Bool = 0)

public data class ClusMaintenanceModeInfoex(
    public var inMaintenance: Bool = 0,
    public var maintainenceModeType: MaintenanceModeTypeEnum = 0,
    public var internalState: ClusterResourceState = 0,
    public var signature: UInt = 0u,
)

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
}

public data class ClusNetnameVsTokenInfo(
    public var processID: UInt = 0u,
    public var desiredAccess: UInt = 0u,
    public var inheritHandle: Bool = 0,
)

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
}

public data class ClusResourceClassInfo(public var anonymous: ClusResourceClassInfo0 = ClusResourceClassInfo0())

public data class ClusResourceClassInfo0(public var anonymous: ClusResourceClassInfo00 = ClusResourceClassInfo00(), public var li: ULong = 0uL)

public data class ClusResourceClassInfo00(public var anonymous: ClusResourceClassInfo000 = ClusResourceClassInfo000(), public var subClass: UInt = 0u)

public data class ClusResourceClassInfo000(public var dw: UInt = 0u, public var rc: ClusterResourceClass = 0)

public data class ClusScsiAddress(public var anonymous: ClusScsiAddress0 = ClusScsiAddress0())

public data class ClusScsiAddress0(public var anonymous: ClusScsiAddress00 = ClusScsiAddress00(), public var dw: UInt = 0u)

public data class ClusScsiAddress00(
    public var portNumber: UByte = 0u,
    public var pathId: UByte = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
)

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
}

public data class ClusStartingParams(
    public var dwSize: UInt = 0u,
    public var bForm: Bool = 0,
    public var bFirst: Bool = 0,
)

public data class ClusStorageGetAvailableDriveletters(public var availDrivelettersMask: UInt = 0u)

public data class ClusStorageRemapDriveletter(public var currentDriveLetterMask: UInt = 0u, public var targetDriveLetterMask: UInt = 0u)

public data class ClusStorageSetDriveletter(public var partitionNumber: UInt = 0u, public var driveLetterMask: UInt = 0u)

public data class ClusWorker(public var hThread: Handle = null, public var terminate: Bool = 0)

public data class CreateClusterConfig(
    public var dwVersion: UInt = 0u,
    public var lpszClusterName: Pcwstr = null,
    public var cNodes: UInt = 0u,
    public var ppszNodeNames: Pcwstr? = null,
    public var cIpEntries: UInt = 0u,
    public var pIpEntries: ClusterIpEntry? = null,
    public var fEmptyCluster: Boolean = false,
    public var managementPointType: ClusterMgmtPointType = 0,
    public var managementPointResType: ClusterMgmtPointRestype = 0,
)

public data class CreateClusterNameAccount(
    public var dwVersion: UInt = 0u,
    public var lpszClusterName: Pcwstr = null,
    public var dwFlags: UInt = 0u,
    public var pszUserName: Pcwstr = null,
    public var pszPassword: Pcwstr = null,
    public var pszDomain: Pcwstr = null,
    public var managementPointType: ClusterMgmtPointType = 0,
    public var managementPointResType: ClusterMgmtPointRestype = 0,
    public var bUpgradeVCOs: Boolean = false,
)

public data class FileshareChange(public var change: FileshareChangeEnum = 0, public var shareName: UShortArray = UShortArray(84)) {
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
}

public data class FileshareChangeList(public var numEntries: UInt = 0u, public var changeEntry: List<FileshareChange> = List(1) { FileshareChange() })

public data class GetOperationContextParams(
    public var size: UInt = 0u,
    public var version: UInt = 0u,
    public var type: ResdllContextOperationType = 0,
    public var priority: UInt = 0u,
)

public data class GroupFailureInfo(public var dwFailoverAttemptsRemaining: UInt = 0u, public var dwFailoverPeriodRemaining: UInt = 0u)

public data class GroupFailureInfoBuffer(public var dwVersion: UInt = 0u, public var info: GroupFailureInfo = GroupFailureInfo())

public data class MonitorState(
    public var lastUpdate: Long = 0L,
    public var state: ResourceMonitorState = 0,
    public var activeResource: Handle = null,
    public var resmonStop: Bool = 0,
)

public data class NotifyFilterAndType(public var dwObjectType: UInt = 0u, public var filterFlags: Long = 0L)

public data class NodeUtilizationInfoElement(
    public var id: ULong = 0uL,
    public var availableMemory: ULong = 0uL,
    public var availableMemoryAfterReclamation: ULong = 0uL,
)

public data class PostUpgradeVersionInfo(
    public var newMajorVersion: UInt = 0u,
    public var newUpgradeVersion: UInt = 0u,
    public var oldMajorVersion: UInt = 0u,
    public var oldUpgradeVersion: UInt = 0u,
    public var reserved: UInt = 0u,
)

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
)

public data class ResourceFailureInfo(public var dwRestartAttemptsRemaining: UInt = 0u, public var dwRestartPeriodRemaining: UInt = 0u)

public data class ResourceFailureInfoBuffer(public var dwVersion: UInt = 0u, public var info: ResourceFailureInfo = ResourceFailureInfo())

public data class ResourceStatus(
    public var resourceState: ClusterResourceState = 0,
    public var checkPoint: UInt = 0u,
    public var waitHint: UInt = 0u,
    public var eventHandle: Handle = null,
)

public data class ResourceStatusEx(
    public var resourceState: ClusterResourceState = 0,
    public var checkPoint: UInt = 0u,
    public var eventHandle: Handle = null,
    public var applicationSpecificErrorCode: UInt = 0u,
    public var flags: UInt = 0u,
    public var waitHint: UInt = 0u,
)

public data class ResourceTerminalFailureInfoBuffer(public var isTerminalFailure: Bool = 0, public var restartPeriodRemaining: UInt = 0u)

public data class ResutilFiletimeData(
    public var default: Filetime = Filetime(),
    public var minimum: Filetime = Filetime(),
    public var maximum: Filetime = Filetime(),
)

public data class ResutilLargeintData(
    public var default: Long = 0L,
    public var minimum: Long = 0L,
    public var maximum: Long = 0L,
)

public data class ResutilPropertyItem(
    public var name: Pwstr = null,
    public var keyName: Pwstr = null,
    public var format: UInt = 0u,
    public var anonymous: ResutilPropertyItem0 = ResutilPropertyItem0(),
    public var minimum: UInt = 0u,
    public var maximum: UInt = 0u,
    public var flags: UInt = 0u,
    public var offset: UInt = 0u,
)

public data class ResutilPropertyItem0(
    public var defaultPtr: Int = 0,
    public var default: UInt = 0u,
    public var lpDefault: COpaquePointer? = null,
    public var largeIntData: ResutilLargeintData? = null,
    public var uLargeIntData: ResutilUlargeintData? = null,
    public var fileTimeData: ResutilFiletimeData? = null,
)

public data class ResutilUlargeintData(
    public var default: ULong = 0uL,
    public var minimum: ULong = 0uL,
    public var maximum: ULong = 0uL,
)

public data class ResourceUtilizationInfoElement(public var physicalNumaId: ULong = 0uL, public var currentMemory: ULong = 0uL)

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
}

public data class SrResourceTypeAddReplicationGroupResult(public var result: UInt = 0u, public var errorString: UShortArray = UShortArray(260)) {
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
}

public data class SrResourceTypeDiskInfo(public var reason: SrDiskReplicationEligible = 0, public var diskGuid: Guid = Guid())

public data class SrResourceTypeEligibleDisksResult(public var count: UShort = 0u, public var diskInfo: List<SrResourceTypeDiskInfo> = List(1) { SrResourceTypeDiskInfo() })

public data class SrResourceTypeQueryEligibleLogdisks(public var dataDiskGuid: Guid = Guid(), public var includeOfflineDisks: Boolean = false)

public data class SrResourceTypeQueryEligibleSourceDatadisks(public var dataDiskGuid: Guid = Guid(), public var includeAvailableStoargeDisks: Boolean = false)

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

public data class SrResourceTypeReplicatedDisksResult(public var count: UShort = 0u, public var replicatedDisks: List<SrResourceTypeReplicatedDisk> = List(1) { SrResourceTypeReplicatedDisk() })

public data class SrResourceTypeReplicatedPartitionArray(public var count: UInt = 0u, public var partitionArray: List<SrResourceTypeReplicatedPartitionInfo> = List(1) { SrResourceTypeReplicatedPartitionInfo() })

public data class SrResourceTypeReplicatedPartitionInfo(public var partitionOffset: ULong = 0uL, public var capabilities: UInt = 0u)

public data class WitnessTagHelper(public var version: Int = 0, public var paxosToValidate: PaxosTagCStruct = PaxosTagCStruct())

public data class WitnessTagUpdateHelper(
    public var version: Int = 0,
    public var paxosToSet: PaxosTagCStruct = PaxosTagCStruct(),
    public var paxosToValidate: PaxosTagCStruct = PaxosTagCStruct(),
)
