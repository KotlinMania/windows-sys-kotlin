@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networking.clustering

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME
import io.github.kotlinmania.windowssys.windows.win32.security.SECURITY_DESCRIPTOR_RELATIVE

public class CLRES_CALLBACK_FUNCTION_TABLE(
    public var LogEvent: PLOG_EVENT_ROUTINE = null,
    public var SetResourceStatusEx: PSET_RESOURCE_STATUS_ROUTINE_EX = null,
    public var SetResourceLockedMode: PSET_RESOURCE_LOCKED_MODE_ROUTINE = null,
    public var SignalFailure: PSIGNAL_FAILURE_ROUTINE = null,
    public var SetResourceInMemoryNodeLocalProperties: PSET_RESOURCE_INMEMORY_NODELOCAL_PROPERTIES_ROUTINE = null,
    public var EndControlCall: PEND_CONTROL_CALL = null,
    public var EndTypeControlCall: PEND_TYPE_CONTROL_CALL = null,
    public var ExtendControlCall: PEXTEND_RES_CONTROL_CALL = null,
    public var ExtendTypeControlCall: PEXTEND_RES_TYPE_CONTROL_CALL = null,
    public var RaiseResTypeNotification: PRAISE_RES_TYPE_NOTIFICATION = null,
    public var ChangeResourceProcessForDumps: PCHANGE_RESOURCE_PROCESS_FOR_DUMPS = null,
    public var ChangeResTypeProcessForDumps: PCHANGE_RES_TYPE_PROCESS_FOR_DUMPS = null,
    public var SetInternalState: PSET_INTERNAL_STATE = null,
    public var SetResourceLockedModeEx: PSET_RESOURCE_LOCKED_MODE_EX_ROUTINE = null,
    public var RequestDump: PREQUEST_DUMP_ROUTINE = null,
    public var SetResourceWprPolicy: PSET_RESOURCE_WPR_POLICY_ROUTINE = null,
    public var ArmWprWatchdogForCurrentResourceCall: PARM_WPR_WATCHDOG_FOR_CURRENT_RESOURCE_CALL_ROUTINE = null,
)

public data class CLRES_FUNCTION_TABLE(
    public var TableSize: UInt = 0u,
    public var Version: UInt = 0u,
    public var Anonymous: CLRES_FUNCTION_TABLE_0 = CLRES_FUNCTION_TABLE_0(),
)

public data class CLRES_FUNCTION_TABLE_0(
    public var V1Functions: CLRES_V1_FUNCTIONS = CLRES_V1_FUNCTIONS(),
    public var V2Functions: CLRES_V2_FUNCTIONS = CLRES_V2_FUNCTIONS(),
    public var V3Functions: CLRES_V3_FUNCTIONS = CLRES_V3_FUNCTIONS(),
    public var V4Functions: CLRES_V4_FUNCTIONS = CLRES_V4_FUNCTIONS(),
)

public data class CLRES_V1_FUNCTIONS(
    public var Open: POPEN_ROUTINE = null,
    public var Close: PCLOSE_ROUTINE = null,
    public var Online: PONLINE_ROUTINE = null,
    public var Offline: POFFLINE_ROUTINE = null,
    public var Terminate: PTERMINATE_ROUTINE = null,
    public var LooksAlive: PLOOKS_ALIVE_ROUTINE = null,
    public var IsAlive: PIS_ALIVE_ROUTINE = null,
    public var Arbitrate: PARBITRATE_ROUTINE = null,
    public var Release: PRELEASE_ROUTINE = null,
    public var ResourceControl: PRESOURCE_CONTROL_ROUTINE = null,
    public var ResourceTypeControl: PRESOURCE_TYPE_CONTROL_ROUTINE = null,
)

public data class CLRES_V2_FUNCTIONS(
    public var Open: POPEN_V2_ROUTINE = null,
    public var Close: PCLOSE_ROUTINE = null,
    public var Online: PONLINE_V2_ROUTINE = null,
    public var Offline: POFFLINE_V2_ROUTINE = null,
    public var Terminate: PTERMINATE_ROUTINE = null,
    public var LooksAlive: PLOOKS_ALIVE_ROUTINE = null,
    public var IsAlive: PIS_ALIVE_ROUTINE = null,
    public var Arbitrate: PARBITRATE_ROUTINE = null,
    public var Release: PRELEASE_ROUTINE = null,
    public var ResourceControl: PRESOURCE_CONTROL_ROUTINE = null,
    public var ResourceTypeControl: PRESOURCE_TYPE_CONTROL_ROUTINE = null,
    public var Cancel: PCANCEL_ROUTINE = null,
)

public data class CLRES_V3_FUNCTIONS(
    public var Open: POPEN_V2_ROUTINE = null,
    public var Close: PCLOSE_ROUTINE = null,
    public var Online: PONLINE_V2_ROUTINE = null,
    public var Offline: POFFLINE_V2_ROUTINE = null,
    public var Terminate: PTERMINATE_ROUTINE = null,
    public var LooksAlive: PLOOKS_ALIVE_ROUTINE = null,
    public var IsAlive: PIS_ALIVE_ROUTINE = null,
    public var Arbitrate: PARBITRATE_ROUTINE = null,
    public var Release: PRELEASE_ROUTINE = null,
    public var BeginResourceControl: PBEGIN_RESCALL_ROUTINE = null,
    public var BeginResourceTypeControl: PBEGIN_RESTYPECALL_ROUTINE = null,
    public var Cancel: PCANCEL_ROUTINE = null,
)

public data class CLRES_V4_FUNCTIONS(
    public var Open: POPEN_V2_ROUTINE = null,
    public var Close: PCLOSE_ROUTINE = null,
    public var Online: PONLINE_V2_ROUTINE = null,
    public var Offline: POFFLINE_V2_ROUTINE = null,
    public var Terminate: PTERMINATE_ROUTINE = null,
    public var LooksAlive: PLOOKS_ALIVE_ROUTINE = null,
    public var IsAlive: PIS_ALIVE_ROUTINE = null,
    public var Arbitrate: PARBITRATE_ROUTINE = null,
    public var Release: PRELEASE_ROUTINE = null,
    public var BeginResourceControl: PBEGIN_RESCALL_ROUTINE = null,
    public var BeginResourceTypeControl: PBEGIN_RESTYPECALL_ROUTINE = null,
    public var Cancel: PCANCEL_ROUTINE = null,
    public var BeginResourceControlAsUser: PBEGIN_RESCALL_AS_USER_ROUTINE = null,
    public var BeginResourceTypeControlAsUser: PBEGIN_RESTYPECALL_AS_USER_ROUTINE = null,
)

public data class CLUSAPI_REASON_HANDLER(public var lpParameter: Long = 0L, public var pfnHandler: PCLUSAPI_PFN_REASON_HANDLER = null)

public data class CLUSCTL_GROUP_GET_LAST_MOVE_TIME_OUTPUT(
    public var GetTickCount64: ULong = 0uL,
    public var GetSystemTime: SYSTEMTIME = SYSTEMTIME(),
    public var NodeId: UInt = 0u,
)

public data class CLUSCTL_RESOURCE_STATE_CHANGE_REASON_STRUCT(
    public var dwSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var eReason: CLUSTER_RESOURCE_STATE_CHANGE_REASON = 0,
)

public data class CLUSCTL_RESOURCE_TYPE_STORAGE_GET_AVAILABLE_DISKS_EX2_INPUT(public var dwFlags: UInt = 0u, public var guidPoolFilter: GUID = GUID())

public data class CLUSPROP_BINARY(public var Base: CLUSPROP_VALUE = CLUSPROP_VALUE(), public var rgb: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUSPROP_BINARY) return false
        if (this.Base != other.Base) return false
        if (!this.rgb.contentEquals(other.rgb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Base.hashCode()
        result = 31 * result + this.rgb.contentHashCode()
        return result
    }
}

public class CLUSPROP_BUFFER_HELPER(
    public var pb: Long = 0L,
    public var pw: Long = 0L,
    public var pdw: Long = 0L,
    public var pl: Long = 0L,
    public var psz: PWSTR = 0L,
    public var pList: Long = 0L,
    public var pSyntax: Long = 0L,
    public var pName: Long = 0L,
    public var pValue: Long = 0L,
    public var pBinaryValue: Long = 0L,
    public var pWordValue: Long = 0L,
    public var pDwordValue: Long = 0L,
    public var pLongValue: Long = 0L,
    public var pULargeIntegerValue: Long = 0L,
    public var pLargeIntegerValue: Long = 0L,
    public var pStringValue: Long = 0L,
    public var pMultiSzValue: Long = 0L,
    public var pSecurityDescriptor: Long = 0L,
    public var pResourceClassValue: Long = 0L,
    public var pResourceClassInfoValue: Long = 0L,
    public var pDiskSignatureValue: Long = 0L,
    public var pScsiAddressValue: Long = 0L,
    public var pDiskNumberValue: Long = 0L,
    public var pPartitionInfoValue: Long = 0L,
    public var pRequiredDependencyValue: Long = 0L,
    public var pPartitionInfoValueEx: Long = 0L,
    public var pPartitionInfoValueEx2: Long = 0L,
    public var pFileTimeValue: Long = 0L,
)

public data class CLUSPROP_DWORD(public var Base: CLUSPROP_VALUE = CLUSPROP_VALUE(), public var dw: UInt = 0u)

public data class CLUSPROP_FILETIME(public var Base: CLUSPROP_VALUE = CLUSPROP_VALUE(), public var ft: FILETIME = FILETIME())

public data class CLUSPROP_FTSET_INFO(public var Base: CLUSPROP_VALUE = CLUSPROP_VALUE(), public var Base2: CLUS_FTSET_INFO = CLUS_FTSET_INFO())

public data class CLUSPROP_LARGE_INTEGER(public var Base: CLUSPROP_VALUE = CLUSPROP_VALUE(), public var li: Long = 0L)

public data class CLUSPROP_LIST(public var nPropertyCount: UInt = 0u, public var PropertyName: CLUSPROP_SZ = CLUSPROP_SZ())

public data class CLUSPROP_LONG(public var Base: CLUSPROP_VALUE = CLUSPROP_VALUE(), public var l: Int = 0)

public data class CLUSPROP_PARTITION_INFO(public var Base: CLUSPROP_VALUE = CLUSPROP_VALUE(), public var Base2: CLUS_PARTITION_INFO = CLUS_PARTITION_INFO())

public data class CLUSPROP_PARTITION_INFO_EX(public var Base: CLUSPROP_VALUE = CLUSPROP_VALUE(), public var Base2: CLUS_PARTITION_INFO_EX = CLUS_PARTITION_INFO_EX())

public data class CLUSPROP_PARTITION_INFO_EX2(public var Base: CLUSPROP_PARTITION_INFO_EX = CLUSPROP_PARTITION_INFO_EX(), public var Base2: CLUS_PARTITION_INFO_EX2 = CLUS_PARTITION_INFO_EX2())

public data class CLUSPROP_REQUIRED_DEPENDENCY(
    public var Value: CLUSPROP_VALUE = CLUSPROP_VALUE(),
    public var ResClass: CLUSPROP_RESOURCE_CLASS = CLUSPROP_RESOURCE_CLASS(),
    public var ResTypeName: CLUSPROP_SZ = CLUSPROP_SZ(),
)

public data class CLUSPROP_RESOURCE_CLASS(public var Base: CLUSPROP_VALUE = CLUSPROP_VALUE(), public var rc: CLUSTER_RESOURCE_CLASS = 0)

public data class CLUSPROP_RESOURCE_CLASS_INFO(public var Base: CLUSPROP_VALUE = CLUSPROP_VALUE(), public var Base2: CLUS_RESOURCE_CLASS_INFO = CLUS_RESOURCE_CLASS_INFO())

public data class CLUSPROP_SCSI_ADDRESS(public var Base: CLUSPROP_VALUE = CLUSPROP_VALUE(), public var Base2: CLUS_SCSI_ADDRESS = CLUS_SCSI_ADDRESS())

public data class CLUSPROP_SECURITY_DESCRIPTOR(public var Base: CLUSPROP_VALUE = CLUSPROP_VALUE(), public var Anonymous: CLUSPROP_SECURITY_DESCRIPTOR_0 = CLUSPROP_SECURITY_DESCRIPTOR_0())

public data class CLUSPROP_SECURITY_DESCRIPTOR_0(public var sd: SECURITY_DESCRIPTOR_RELATIVE = SECURITY_DESCRIPTOR_RELATIVE(), public var rgbSecurityDescriptor: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUSPROP_SECURITY_DESCRIPTOR_0) return false
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

public data class CLUSPROP_SYNTAX(public var dw: UInt = 0u, public var Anonymous: CLUSPROP_SYNTAX_0 = CLUSPROP_SYNTAX_0())

public data class CLUSPROP_SYNTAX_0(public var wFormat: UShort = 0u, public var wType: UShort = 0u)

public data class CLUSPROP_SZ(public var Base: CLUSPROP_VALUE = CLUSPROP_VALUE(), public var sz: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUSPROP_SZ) return false
        if (this.Base != other.Base) return false
        if (!this.sz.contentEquals(other.sz)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Base.hashCode()
        result = 31 * result + this.sz.contentHashCode()
        return result
    }
}

public data class CLUSPROP_ULARGE_INTEGER(public var Base: CLUSPROP_VALUE = CLUSPROP_VALUE(), public var li: ULong = 0uL)

public data class CLUSPROP_VALUE(public var Syntax: CLUSPROP_SYNTAX = CLUSPROP_SYNTAX(), public var cbLength: UInt = 0u)

public data class CLUSPROP_WORD(public var Base: CLUSPROP_VALUE = CLUSPROP_VALUE(), public var w: UShort = 0u)

public data class CLUSTERVERSIONINFO(
    public var dwVersionInfoSize: UInt = 0u,
    public var MajorVersion: UShort = 0u,
    public var MinorVersion: UShort = 0u,
    public var BuildNumber: UShort = 0u,
    public var szVendorId: UShortArray = UShortArray(64),
    public var szCSDVersion: UShortArray = UShortArray(64),
    public var dwClusterHighestVersion: UInt = 0u,
    public var dwClusterLowestVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUSTERVERSIONINFO) return false
        if (this.dwVersionInfoSize != other.dwVersionInfoSize) return false
        if (this.MajorVersion != other.MajorVersion) return false
        if (this.MinorVersion != other.MinorVersion) return false
        if (this.BuildNumber != other.BuildNumber) return false
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
        result = 31 * result + this.MajorVersion.hashCode()
        result = 31 * result + this.MinorVersion.hashCode()
        result = 31 * result + this.BuildNumber.hashCode()
        result = 31 * result + this.szVendorId.contentHashCode()
        result = 31 * result + this.szCSDVersion.contentHashCode()
        result = 31 * result + this.dwClusterHighestVersion.hashCode()
        result = 31 * result + this.dwClusterLowestVersion.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        return result
    }
}

public data class CLUSTERVERSIONINFO_NT4(
    public var dwVersionInfoSize: UInt = 0u,
    public var MajorVersion: UShort = 0u,
    public var MinorVersion: UShort = 0u,
    public var BuildNumber: UShort = 0u,
    public var szVendorId: UShortArray = UShortArray(64),
    public var szCSDVersion: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUSTERVERSIONINFO_NT4) return false
        if (this.dwVersionInfoSize != other.dwVersionInfoSize) return false
        if (this.MajorVersion != other.MajorVersion) return false
        if (this.MinorVersion != other.MinorVersion) return false
        if (this.BuildNumber != other.BuildNumber) return false
        if (!this.szVendorId.contentEquals(other.szVendorId)) return false
        if (!this.szCSDVersion.contentEquals(other.szCSDVersion)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersionInfoSize.hashCode()
        result = 31 * result + this.MajorVersion.hashCode()
        result = 31 * result + this.MinorVersion.hashCode()
        result = 31 * result + this.BuildNumber.hashCode()
        result = 31 * result + this.szVendorId.contentHashCode()
        result = 31 * result + this.szCSDVersion.contentHashCode()
        return result
    }
}

public data class CLUSTER_AVAILABILITY_SET_CONFIG(
    public var dwVersion: UInt = 0u,
    public var dwUpdateDomains: UInt = 0u,
    public var dwFaultDomains: UInt = 0u,
    public var bReserveSpareNode: BOOL = 0,
)

public data class CLUSTER_BATCH_COMMAND(
    public var Command: CLUSTER_REG_COMMAND = 0,
    public var dwOptions: UInt = 0u,
    public var wzName: PCWSTR = 0L,
    public var lpData: Long = 0L,
    public var cbData: UInt = 0u,
)

public data class CLUSTER_CREATE_GROUP_INFO(public var dwVersion: UInt = 0u, public var groupType: CLUSGROUP_TYPE = 0)

public data class CLUSTER_ENUM_ITEM(
    public var dwVersion: UInt = 0u,
    public var dwType: UInt = 0u,
    public var cbId: UInt = 0u,
    public var lpszId: PWSTR = 0L,
    public var cbName: UInt = 0u,
    public var lpszName: PWSTR = 0L,
)

public data class CLUSTER_GROUP_ENUM_ITEM(
    public var dwVersion: UInt = 0u,
    public var cbId: UInt = 0u,
    public var lpszId: PWSTR = 0L,
    public var cbName: UInt = 0u,
    public var lpszName: PWSTR = 0L,
    public var state: CLUSTER_GROUP_STATE = 0,
    public var cbOwnerNode: UInt = 0u,
    public var lpszOwnerNode: PWSTR = 0L,
    public var dwFlags: UInt = 0u,
    public var cbProperties: UInt = 0u,
    public var pProperties: Long = 0L,
    public var cbRoProperties: UInt = 0u,
    public var pRoProperties: Long = 0L,
)

public data class CLUSTER_HEALTH_FAULT(
    public var Id: PWSTR = 0L,
    public var ErrorType: UInt = 0u,
    public var ErrorCode: UInt = 0u,
    public var Description: PWSTR = 0L,
    public var Provider: PWSTR = 0L,
    public var Flags: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class CLUSTER_HEALTH_FAULT_ARRAY(public var numFaults: UInt = 0u, public var faults: Long = 0L)

public data class CLUSTER_IP_ENTRY(public var lpszIpAddress: PCWSTR = 0L, public var dwPrefixLength: UInt = 0u)

public data class CLUSTER_MEMBERSHIP_INFO(
    public var HasQuorum: BOOL = 0,
    public var UpnodesSize: UInt = 0u,
    public var Upnodes: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUSTER_MEMBERSHIP_INFO) return false
        if (this.HasQuorum != other.HasQuorum) return false
        if (this.UpnodesSize != other.UpnodesSize) return false
        if (!this.Upnodes.contentEquals(other.Upnodes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.HasQuorum.hashCode()
        result = 31 * result + this.UpnodesSize.hashCode()
        result = 31 * result + this.Upnodes.contentHashCode()
        return result
    }
}

public data class CLUSTER_READ_BATCH_COMMAND(
    public var Command: CLUSTER_REG_COMMAND = 0,
    public var dwOptions: UInt = 0u,
    public var wzSubkeyName: PCWSTR = 0L,
    public var wzValueName: PCWSTR = 0L,
    public var lpData: Long = 0L,
    public var cbData: UInt = 0u,
)

public data class CLUSTER_RESOURCE_ENUM_ITEM(
    public var dwVersion: UInt = 0u,
    public var cbId: UInt = 0u,
    public var lpszId: PWSTR = 0L,
    public var cbName: UInt = 0u,
    public var lpszName: PWSTR = 0L,
    public var cbOwnerGroupName: UInt = 0u,
    public var lpszOwnerGroupName: PWSTR = 0L,
    public var cbOwnerGroupId: UInt = 0u,
    public var lpszOwnerGroupId: PWSTR = 0L,
    public var cbProperties: UInt = 0u,
    public var pProperties: Long = 0L,
    public var cbRoProperties: UInt = 0u,
    public var pRoProperties: Long = 0L,
)

public data class CLUSTER_SET_PASSWORD_STATUS(
    public var NodeId: UInt = 0u,
    public var SetAttempted: Boolean = false,
    public var ReturnStatus: UInt = 0u,
)

public data class CLUSTER_SHARED_VOLUME_RENAME_GUID_INPUT(public var Base: CLUSTER_SHARED_VOLUME_RENAME_INPUT_VOLUME = CLUSTER_SHARED_VOLUME_RENAME_INPUT_VOLUME(), public var Base2: CLUSTER_SHARED_VOLUME_RENAME_INPUT_GUID_NAME = CLUSTER_SHARED_VOLUME_RENAME_INPUT_GUID_NAME())

public data class CLUSTER_SHARED_VOLUME_RENAME_INPUT(public var Base: CLUSTER_SHARED_VOLUME_RENAME_INPUT_VOLUME = CLUSTER_SHARED_VOLUME_RENAME_INPUT_VOLUME(), public var Base2: CLUSTER_SHARED_VOLUME_RENAME_INPUT_NAME = CLUSTER_SHARED_VOLUME_RENAME_INPUT_NAME())

public data class CLUSTER_SHARED_VOLUME_RENAME_INPUT_GUID_NAME(public var NewVolumeName: UShortArray = UShortArray(260), public var NewVolumeGuid: UShortArray = UShortArray(50)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUSTER_SHARED_VOLUME_RENAME_INPUT_GUID_NAME) return false
        if (!this.NewVolumeName.contentEquals(other.NewVolumeName)) return false
        if (!this.NewVolumeGuid.contentEquals(other.NewVolumeGuid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NewVolumeName.contentHashCode()
        result = 31 * result + this.NewVolumeGuid.contentHashCode()
        return result
    }
}

public data class CLUSTER_SHARED_VOLUME_RENAME_INPUT_NAME(public var NewVolumeName: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUSTER_SHARED_VOLUME_RENAME_INPUT_NAME) return false
        if (!this.NewVolumeName.contentEquals(other.NewVolumeName)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.NewVolumeName.contentHashCode()
    }
}

public data class CLUSTER_SHARED_VOLUME_RENAME_INPUT_VOLUME(public var InputType: CLUSTER_SHARED_VOLUME_RENAME_INPUT_TYPE = 0, public var Anonymous: CLUSTER_SHARED_VOLUME_RENAME_INPUT_VOLUME_0 = CLUSTER_SHARED_VOLUME_RENAME_INPUT_VOLUME_0())

public data class CLUSTER_SHARED_VOLUME_RENAME_INPUT_VOLUME_0(
    public var VolumeOffset: ULong = 0uL,
    public var VolumeId: UShortArray = UShortArray(260),
    public var VolumeName: UShortArray = UShortArray(260),
    public var VolumeGuid: UShortArray = UShortArray(50),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUSTER_SHARED_VOLUME_RENAME_INPUT_VOLUME_0) return false
        if (this.VolumeOffset != other.VolumeOffset) return false
        if (!this.VolumeId.contentEquals(other.VolumeId)) return false
        if (!this.VolumeName.contentEquals(other.VolumeName)) return false
        if (!this.VolumeGuid.contentEquals(other.VolumeGuid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VolumeOffset.hashCode()
        result = 31 * result + this.VolumeId.contentHashCode()
        result = 31 * result + this.VolumeName.contentHashCode()
        result = 31 * result + this.VolumeGuid.contentHashCode()
        return result
    }
}

public data class CLUSTER_SHARED_VOLUME_STATE_INFO(
    public var szVolumeName: UShortArray = UShortArray(260),
    public var szNodeName: UShortArray = UShortArray(260),
    public var VolumeState: CLUSTER_SHARED_VOLUME_STATE = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUSTER_SHARED_VOLUME_STATE_INFO) return false
        if (!this.szVolumeName.contentEquals(other.szVolumeName)) return false
        if (!this.szNodeName.contentEquals(other.szNodeName)) return false
        if (this.VolumeState != other.VolumeState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szVolumeName.contentHashCode()
        result = 31 * result + this.szNodeName.contentHashCode()
        result = 31 * result + this.VolumeState.hashCode()
        return result
    }
}

public data class CLUSTER_SHARED_VOLUME_STATE_INFO_EX(
    public var szVolumeName: UShortArray = UShortArray(260),
    public var szNodeName: UShortArray = UShortArray(260),
    public var VolumeState: CLUSTER_SHARED_VOLUME_STATE = 0,
    public var szVolumeFriendlyName: UShortArray = UShortArray(260),
    public var RedirectedIOReason: ULong = 0uL,
    public var VolumeRedirectedIOReason: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUSTER_SHARED_VOLUME_STATE_INFO_EX) return false
        if (!this.szVolumeName.contentEquals(other.szVolumeName)) return false
        if (!this.szNodeName.contentEquals(other.szNodeName)) return false
        if (this.VolumeState != other.VolumeState) return false
        if (!this.szVolumeFriendlyName.contentEquals(other.szVolumeFriendlyName)) return false
        if (this.RedirectedIOReason != other.RedirectedIOReason) return false
        if (this.VolumeRedirectedIOReason != other.VolumeRedirectedIOReason) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szVolumeName.contentHashCode()
        result = 31 * result + this.szNodeName.contentHashCode()
        result = 31 * result + this.VolumeState.hashCode()
        result = 31 * result + this.szVolumeFriendlyName.contentHashCode()
        result = 31 * result + this.RedirectedIOReason.hashCode()
        result = 31 * result + this.VolumeRedirectedIOReason.hashCode()
        return result
    }
}

public data class CLUSTER_VALIDATE_CSV_FILENAME(public var szFileName: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUSTER_VALIDATE_CSV_FILENAME) return false
        if (!this.szFileName.contentEquals(other.szFileName)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.szFileName.contentHashCode()
    }
}

public data class CLUSTER_VALIDATE_DIRECTORY(public var szPath: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUSTER_VALIDATE_DIRECTORY) return false
        if (!this.szPath.contentEquals(other.szPath)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.szPath.contentHashCode()
    }
}

public data class CLUSTER_VALIDATE_NETNAME(public var szNetworkName: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUSTER_VALIDATE_NETNAME) return false
        if (!this.szNetworkName.contentEquals(other.szNetworkName)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.szNetworkName.contentHashCode()
    }
}

public data class CLUSTER_VALIDATE_PATH(public var szPath: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUSTER_VALIDATE_PATH) return false
        if (!this.szPath.contentEquals(other.szPath)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.szPath.contentHashCode()
    }
}

public data class CLUS_CHKDSK_INFO(
    public var PartitionNumber: UInt = 0u,
    public var ChkdskState: UInt = 0u,
    public var FileIdCount: UInt = 0u,
    public var FileIdList: ULongArray = ULongArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUS_CHKDSK_INFO) return false
        if (this.PartitionNumber != other.PartitionNumber) return false
        if (this.ChkdskState != other.ChkdskState) return false
        if (this.FileIdCount != other.FileIdCount) return false
        if (!this.FileIdList.contentEquals(other.FileIdList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PartitionNumber.hashCode()
        result = 31 * result + this.ChkdskState.hashCode()
        result = 31 * result + this.FileIdCount.hashCode()
        result = 31 * result + this.FileIdList.contentHashCode()
        return result
    }
}

public data class CLUS_CREATE_INFRASTRUCTURE_FILESERVER_INPUT(public var FileServerName: UShortArray = UShortArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUS_CREATE_INFRASTRUCTURE_FILESERVER_INPUT) return false
        if (!this.FileServerName.contentEquals(other.FileServerName)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.FileServerName.contentHashCode()
    }
}

public data class CLUS_CREATE_INFRASTRUCTURE_FILESERVER_OUTPUT(public var FileServerName: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUS_CREATE_INFRASTRUCTURE_FILESERVER_OUTPUT) return false
        if (!this.FileServerName.contentEquals(other.FileServerName)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.FileServerName.contentHashCode()
    }
}

public data class CLUS_CSV_MAINTENANCE_MODE_INFO(public var InMaintenance: BOOL = 0, public var VolumeName: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUS_CSV_MAINTENANCE_MODE_INFO) return false
        if (this.InMaintenance != other.InMaintenance) return false
        if (!this.VolumeName.contentEquals(other.VolumeName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.InMaintenance.hashCode()
        result = 31 * result + this.VolumeName.contentHashCode()
        return result
    }
}

public data class CLUS_CSV_VOLUME_INFO(
    public var VolumeOffset: ULong = 0uL,
    public var PartitionNumber: UInt = 0u,
    public var FaultState: CLUSTER_CSV_VOLUME_FAULT_STATE = 0,
    public var BackupState: CLUSTER_SHARED_VOLUME_BACKUP_STATE = 0,
    public var szVolumeFriendlyName: UShortArray = UShortArray(260),
    public var szVolumeName: UShortArray = UShortArray(50),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUS_CSV_VOLUME_INFO) return false
        if (this.VolumeOffset != other.VolumeOffset) return false
        if (this.PartitionNumber != other.PartitionNumber) return false
        if (this.FaultState != other.FaultState) return false
        if (this.BackupState != other.BackupState) return false
        if (!this.szVolumeFriendlyName.contentEquals(other.szVolumeFriendlyName)) return false
        if (!this.szVolumeName.contentEquals(other.szVolumeName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VolumeOffset.hashCode()
        result = 31 * result + this.PartitionNumber.hashCode()
        result = 31 * result + this.FaultState.hashCode()
        result = 31 * result + this.BackupState.hashCode()
        result = 31 * result + this.szVolumeFriendlyName.contentHashCode()
        result = 31 * result + this.szVolumeName.contentHashCode()
        return result
    }
}

public data class CLUS_CSV_VOLUME_NAME(
    public var VolumeOffset: Long = 0L,
    public var szVolumeName: UShortArray = UShortArray(260),
    public var szRootPath: UShortArray = UShortArray(263),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUS_CSV_VOLUME_NAME) return false
        if (this.VolumeOffset != other.VolumeOffset) return false
        if (!this.szVolumeName.contentEquals(other.szVolumeName)) return false
        if (!this.szRootPath.contentEquals(other.szRootPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VolumeOffset.hashCode()
        result = 31 * result + this.szVolumeName.contentHashCode()
        result = 31 * result + this.szRootPath.contentHashCode()
        return result
    }
}

public data class CLUS_DISK_NUMBER_INFO(public var DiskNumber: UInt = 0u, public var BytesPerSector: UInt = 0u)

public data class CLUS_DNN_LEADER_STATUS(public var IsOnline: BOOL = 0, public var IsFileServerPresent: BOOL = 0)

public data class CLUS_DNN_SODAFS_CLONE_STATUS(public var NodeId: UInt = 0u, public var Status: CLUSTER_RESOURCE_STATE = 0)

public data class CLUS_FORCE_QUORUM_INFO(
    public var dwSize: UInt = 0u,
    public var dwNodeBitMask: UInt = 0u,
    public var dwMaxNumberofNodes: UInt = 0u,
    public var multiszNodeList: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUS_FORCE_QUORUM_INFO) return false
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

public data class CLUS_FTSET_INFO(public var dwRootSignature: UInt = 0u, public var dwFtType: UInt = 0u)

public data class CLUS_MAINTENANCE_MODE_INFO(public var InMaintenance: BOOL = 0)

public data class CLUS_MAINTENANCE_MODE_INFOEX(
    public var InMaintenance: BOOL = 0,
    public var MaintainenceModeType: MAINTENANCE_MODE_TYPE_ENUM = 0,
    public var InternalState: CLUSTER_RESOURCE_STATE = 0,
    public var Signature: UInt = 0u,
)

public data class CLUS_NETNAME_IP_INFO_ENTRY(
    public var NodeId: UInt = 0u,
    public var AddressSize: UInt = 0u,
    public var Address: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUS_NETNAME_IP_INFO_ENTRY) return false
        if (this.NodeId != other.NodeId) return false
        if (this.AddressSize != other.AddressSize) return false
        if (!this.Address.contentEquals(other.Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NodeId.hashCode()
        result = 31 * result + this.AddressSize.hashCode()
        result = 31 * result + this.Address.contentHashCode()
        return result
    }
}

public data class CLUS_NETNAME_IP_INFO_FOR_MULTICHANNEL(
    public var szName: UShortArray = UShortArray(64),
    public var NumEntries: UInt = 0u,
    public var IpInfo: List<CLUS_NETNAME_IP_INFO_ENTRY> = List(1) { CLUS_NETNAME_IP_INFO_ENTRY() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUS_NETNAME_IP_INFO_FOR_MULTICHANNEL) return false
        if (!this.szName.contentEquals(other.szName)) return false
        if (this.NumEntries != other.NumEntries) return false
        if (this.IpInfo != other.IpInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szName.contentHashCode()
        result = 31 * result + this.NumEntries.hashCode()
        result = 31 * result + this.IpInfo.hashCode()
        return result
    }
}

public data class CLUS_NETNAME_PWD_INFO(
    public var Flags: UInt = 0u,
    public var Password: UShortArray = UShortArray(16),
    public var CreatingDC: UShortArray = UShortArray(258),
    public var ObjectGuid: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUS_NETNAME_PWD_INFO) return false
        if (this.Flags != other.Flags) return false
        if (!this.Password.contentEquals(other.Password)) return false
        if (!this.CreatingDC.contentEquals(other.CreatingDC)) return false
        if (!this.ObjectGuid.contentEquals(other.ObjectGuid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Flags.hashCode()
        result = 31 * result + this.Password.contentHashCode()
        result = 31 * result + this.CreatingDC.contentHashCode()
        result = 31 * result + this.ObjectGuid.contentHashCode()
        return result
    }
}

public data class CLUS_NETNAME_PWD_INFOEX(
    public var Flags: UInt = 0u,
    public var Password: UShortArray = UShortArray(128),
    public var CreatingDC: UShortArray = UShortArray(258),
    public var ObjectGuid: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUS_NETNAME_PWD_INFOEX) return false
        if (this.Flags != other.Flags) return false
        if (!this.Password.contentEquals(other.Password)) return false
        if (!this.CreatingDC.contentEquals(other.CreatingDC)) return false
        if (!this.ObjectGuid.contentEquals(other.ObjectGuid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Flags.hashCode()
        result = 31 * result + this.Password.contentHashCode()
        result = 31 * result + this.CreatingDC.contentHashCode()
        result = 31 * result + this.ObjectGuid.contentHashCode()
        return result
    }
}

public data class CLUS_NETNAME_VS_TOKEN_INFO(
    public var ProcessID: UInt = 0u,
    public var DesiredAccess: UInt = 0u,
    public var InheritHandle: BOOL = 0,
)

public data class CLUS_PARTITION_INFO(
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
        if (other !is CLUS_PARTITION_INFO) return false
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

public data class CLUS_PARTITION_INFO_EX(
    public var dwFlags: UInt = 0u,
    public var szDeviceName: UShortArray = UShortArray(260),
    public var szVolumeLabel: UShortArray = UShortArray(260),
    public var dwSerialNumber: UInt = 0u,
    public var rgdwMaximumComponentLength: UInt = 0u,
    public var dwFileSystemFlags: UInt = 0u,
    public var szFileSystem: UShortArray = UShortArray(32),
    public var TotalSizeInBytes: ULong = 0uL,
    public var FreeSizeInBytes: ULong = 0uL,
    public var DeviceNumber: UInt = 0u,
    public var PartitionNumber: UInt = 0u,
    public var VolumeGuid: GUID = GUID(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUS_PARTITION_INFO_EX) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (!this.szVolumeLabel.contentEquals(other.szVolumeLabel)) return false
        if (this.dwSerialNumber != other.dwSerialNumber) return false
        if (this.rgdwMaximumComponentLength != other.rgdwMaximumComponentLength) return false
        if (this.dwFileSystemFlags != other.dwFileSystemFlags) return false
        if (!this.szFileSystem.contentEquals(other.szFileSystem)) return false
        if (this.TotalSizeInBytes != other.TotalSizeInBytes) return false
        if (this.FreeSizeInBytes != other.FreeSizeInBytes) return false
        if (this.DeviceNumber != other.DeviceNumber) return false
        if (this.PartitionNumber != other.PartitionNumber) return false
        if (this.VolumeGuid != other.VolumeGuid) return false
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
        result = 31 * result + this.TotalSizeInBytes.hashCode()
        result = 31 * result + this.FreeSizeInBytes.hashCode()
        result = 31 * result + this.DeviceNumber.hashCode()
        result = 31 * result + this.PartitionNumber.hashCode()
        result = 31 * result + this.VolumeGuid.hashCode()
        return result
    }
}

public data class CLUS_PARTITION_INFO_EX2(
    public var GptPartitionId: GUID = GUID(),
    public var szPartitionName: UShortArray = UShortArray(260),
    public var EncryptionFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUS_PARTITION_INFO_EX2) return false
        if (this.GptPartitionId != other.GptPartitionId) return false
        if (!this.szPartitionName.contentEquals(other.szPartitionName)) return false
        if (this.EncryptionFlags != other.EncryptionFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.GptPartitionId.hashCode()
        result = 31 * result + this.szPartitionName.contentHashCode()
        result = 31 * result + this.EncryptionFlags.hashCode()
        return result
    }
}

public data class CLUS_PROVIDER_STATE_CHANGE_INFO(
    public var dwSize: UInt = 0u,
    public var resourceState: CLUSTER_RESOURCE_STATE = 0,
    public var szProviderId: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUS_PROVIDER_STATE_CHANGE_INFO) return false
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

public data class CLUS_RESOURCE_CLASS_INFO(public var Anonymous: CLUS_RESOURCE_CLASS_INFO_0 = CLUS_RESOURCE_CLASS_INFO_0())

public data class CLUS_RESOURCE_CLASS_INFO_0(public var Anonymous: CLUS_RESOURCE_CLASS_INFO_0_0 = CLUS_RESOURCE_CLASS_INFO_0_0(), public var li: ULong = 0uL)

public data class CLUS_RESOURCE_CLASS_INFO_0_0(public var Anonymous: CLUS_RESOURCE_CLASS_INFO_0_0_0 = CLUS_RESOURCE_CLASS_INFO_0_0_0(), public var SubClass: UInt = 0u)

public data class CLUS_RESOURCE_CLASS_INFO_0_0_0(public var dw: UInt = 0u, public var rc: CLUSTER_RESOURCE_CLASS = 0)

public data class CLUS_SCSI_ADDRESS(public var Anonymous: CLUS_SCSI_ADDRESS_0 = CLUS_SCSI_ADDRESS_0())

public data class CLUS_SCSI_ADDRESS_0(public var Anonymous: CLUS_SCSI_ADDRESS_0_0 = CLUS_SCSI_ADDRESS_0_0(), public var dw: UInt = 0u)

public data class CLUS_SCSI_ADDRESS_0_0(
    public var PortNumber: UByte = 0u,
    public var PathId: UByte = 0u,
    public var TargetId: UByte = 0u,
    public var Lun: UByte = 0u,
)

public data class CLUS_SET_MAINTENANCE_MODE_INPUT(
    public var InMaintenance: BOOL = 0,
    public var ExtraParameterSize: UInt = 0u,
    public var ExtraParameter: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUS_SET_MAINTENANCE_MODE_INPUT) return false
        if (this.InMaintenance != other.InMaintenance) return false
        if (this.ExtraParameterSize != other.ExtraParameterSize) return false
        if (!this.ExtraParameter.contentEquals(other.ExtraParameter)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.InMaintenance.hashCode()
        result = 31 * result + this.ExtraParameterSize.hashCode()
        result = 31 * result + this.ExtraParameter.contentHashCode()
        return result
    }
}

public data class CLUS_SHARED_VOLUME_BACKUP_MODE(
    public var BackupState: CLUSTER_SHARED_VOLUME_BACKUP_STATE = 0,
    public var DelayTimerInSecs: UInt = 0u,
    public var VolumeName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CLUS_SHARED_VOLUME_BACKUP_MODE) return false
        if (this.BackupState != other.BackupState) return false
        if (this.DelayTimerInSecs != other.DelayTimerInSecs) return false
        if (!this.VolumeName.contentEquals(other.VolumeName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.BackupState.hashCode()
        result = 31 * result + this.DelayTimerInSecs.hashCode()
        result = 31 * result + this.VolumeName.contentHashCode()
        return result
    }
}

public data class CLUS_STARTING_PARAMS(
    public var dwSize: UInt = 0u,
    public var bForm: BOOL = 0,
    public var bFirst: BOOL = 0,
)

public data class CLUS_STORAGE_GET_AVAILABLE_DRIVELETTERS(public var AvailDrivelettersMask: UInt = 0u)

public data class CLUS_STORAGE_REMAP_DRIVELETTER(public var CurrentDriveLetterMask: UInt = 0u, public var TargetDriveLetterMask: UInt = 0u)

public data class CLUS_STORAGE_SET_DRIVELETTER(public var PartitionNumber: UInt = 0u, public var DriveLetterMask: UInt = 0u)

public data class CLUS_WORKER(public var hThread: HANDLE = 0L, public var Terminate: BOOL = 0)

public data class CREATE_CLUSTER_CONFIG(
    public var dwVersion: UInt = 0u,
    public var lpszClusterName: PCWSTR = 0L,
    public var cNodes: UInt = 0u,
    public var ppszNodeNames: Long = 0L,
    public var cIpEntries: UInt = 0u,
    public var pIpEntries: Long = 0L,
    public var fEmptyCluster: Boolean = false,
    public var managementPointType: CLUSTER_MGMT_POINT_TYPE = 0,
    public var managementPointResType: CLUSTER_MGMT_POINT_RESTYPE = 0,
)

public data class CREATE_CLUSTER_NAME_ACCOUNT(
    public var dwVersion: UInt = 0u,
    public var lpszClusterName: PCWSTR = 0L,
    public var dwFlags: UInt = 0u,
    public var pszUserName: PCWSTR = 0L,
    public var pszPassword: PCWSTR = 0L,
    public var pszDomain: PCWSTR = 0L,
    public var managementPointType: CLUSTER_MGMT_POINT_TYPE = 0,
    public var managementPointResType: CLUSTER_MGMT_POINT_RESTYPE = 0,
    public var bUpgradeVCOs: Boolean = false,
)

public data class FILESHARE_CHANGE(public var Change: FILESHARE_CHANGE_ENUM = 0, public var ShareName: UShortArray = UShortArray(84)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FILESHARE_CHANGE) return false
        if (this.Change != other.Change) return false
        if (!this.ShareName.contentEquals(other.ShareName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Change.hashCode()
        result = 31 * result + this.ShareName.contentHashCode()
        return result
    }
}

public data class FILESHARE_CHANGE_LIST(public var NumEntries: UInt = 0u, public var ChangeEntry: List<FILESHARE_CHANGE> = List(1) { FILESHARE_CHANGE() })

public data class GET_OPERATION_CONTEXT_PARAMS(
    public var Size: UInt = 0u,
    public var Version: UInt = 0u,
    public var Type: RESDLL_CONTEXT_OPERATION_TYPE = 0,
    public var Priority: UInt = 0u,
)

public data class GROUP_FAILURE_INFO(public var dwFailoverAttemptsRemaining: UInt = 0u, public var dwFailoverPeriodRemaining: UInt = 0u)

public data class GROUP_FAILURE_INFO_BUFFER(public var dwVersion: UInt = 0u, public var Info: GROUP_FAILURE_INFO = GROUP_FAILURE_INFO())

public data class MONITOR_STATE(
    public var LastUpdate: Long = 0L,
    public var State: RESOURCE_MONITOR_STATE = 0,
    public var ActiveResource: HANDLE = 0L,
    public var ResmonStop: BOOL = 0,
)

public data class NOTIFY_FILTER_AND_TYPE(public var dwObjectType: UInt = 0u, public var FilterFlags: Long = 0L)

public data class NodeUtilizationInfoElement(
    public var Id: ULong = 0uL,
    public var AvailableMemory: ULong = 0uL,
    public var AvailableMemoryAfterReclamation: ULong = 0uL,
)

public data class POST_UPGRADE_VERSION_INFO(
    public var newMajorVersion: UInt = 0u,
    public var newUpgradeVersion: UInt = 0u,
    public var oldMajorVersion: UInt = 0u,
    public var oldUpgradeVersion: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class PaxosTagCStruct(
    public var __padding__PaxosTagVtable: ULong = 0uL,
    public var __padding__NextEpochVtable: ULong = 0uL,
    public var __padding__NextEpoch_DateTimeVtable: ULong = 0uL,
    public var NextEpoch_DateTime_ticks: ULong = 0uL,
    public var NextEpoch_Value: Int = 0,
    public var __padding__BoundryNextEpoch: UInt = 0u,
    public var __padding__EpochVtable: ULong = 0uL,
    public var __padding__Epoch_DateTimeVtable: ULong = 0uL,
    public var Epoch_DateTime_ticks: ULong = 0uL,
    public var Epoch_Value: Int = 0,
    public var __padding__BoundryEpoch: UInt = 0u,
    public var Sequence: Int = 0,
    public var __padding__BoundrySequence: UInt = 0u,
)

public data class RESOURCE_FAILURE_INFO(public var dwRestartAttemptsRemaining: UInt = 0u, public var dwRestartPeriodRemaining: UInt = 0u)

public data class RESOURCE_FAILURE_INFO_BUFFER(public var dwVersion: UInt = 0u, public var Info: RESOURCE_FAILURE_INFO = RESOURCE_FAILURE_INFO())

public data class RESOURCE_STATUS(
    public var ResourceState: CLUSTER_RESOURCE_STATE = 0,
    public var CheckPoint: UInt = 0u,
    public var WaitHint: UInt = 0u,
    public var EventHandle: HANDLE = 0L,
)

public data class RESOURCE_STATUS_EX(
    public var ResourceState: CLUSTER_RESOURCE_STATE = 0,
    public var CheckPoint: UInt = 0u,
    public var EventHandle: HANDLE = 0L,
    public var ApplicationSpecificErrorCode: UInt = 0u,
    public var Flags: UInt = 0u,
    public var WaitHint: UInt = 0u,
)

public data class RESOURCE_TERMINAL_FAILURE_INFO_BUFFER(public var isTerminalFailure: BOOL = 0, public var restartPeriodRemaining: UInt = 0u)

public data class RESUTIL_FILETIME_DATA(
    public var Default: FILETIME = FILETIME(),
    public var Minimum: FILETIME = FILETIME(),
    public var Maximum: FILETIME = FILETIME(),
)

public data class RESUTIL_LARGEINT_DATA(
    public var Default: Long = 0L,
    public var Minimum: Long = 0L,
    public var Maximum: Long = 0L,
)

public data class RESUTIL_PROPERTY_ITEM(
    public var Name: PWSTR = 0L,
    public var KeyName: PWSTR = 0L,
    public var Format: UInt = 0u,
    public var Anonymous: RESUTIL_PROPERTY_ITEM_0 = RESUTIL_PROPERTY_ITEM_0(),
    public var Minimum: UInt = 0u,
    public var Maximum: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Offset: UInt = 0u,
)

public data class RESUTIL_PROPERTY_ITEM_0(
    public var DefaultPtr: ULong = 0uL,
    public var Default: UInt = 0u,
    public var lpDefault: Long = 0L,
    public var LargeIntData: Long = 0L,
    public var ULargeIntData: Long = 0L,
    public var FileTimeData: Long = 0L,
)

public data class RESUTIL_ULARGEINT_DATA(
    public var Default: ULong = 0uL,
    public var Minimum: ULong = 0uL,
    public var Maximum: ULong = 0uL,
)

public data class ResourceUtilizationInfoElement(public var PhysicalNumaId: ULong = 0uL, public var CurrentMemory: ULong = 0uL)

public data class SR_RESOURCE_TYPE_ADD_REPLICATION_GROUP(
    public var ReplicationGroupName: UShortArray = UShortArray(260),
    public var Description: UShortArray = UShortArray(260),
    public var LogPath: UShortArray = UShortArray(260),
    public var MaxLogSizeInBytes: ULong = 0uL,
    public var LogType: UShort = 0u,
    public var ReplicationMode: UInt = 0u,
    public var MinimumPartnersInSync: UInt = 0u,
    public var EnableWriteConsistency: Boolean = false,
    public var EnableEncryption: Boolean = false,
    public var EnableCompression: Boolean = false,
    public var CertificateThumbprint: UShortArray = UShortArray(260),
    public var VolumeNameCount: UInt = 0u,
    public var VolumeNames: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SR_RESOURCE_TYPE_ADD_REPLICATION_GROUP) return false
        if (!this.ReplicationGroupName.contentEquals(other.ReplicationGroupName)) return false
        if (!this.Description.contentEquals(other.Description)) return false
        if (!this.LogPath.contentEquals(other.LogPath)) return false
        if (this.MaxLogSizeInBytes != other.MaxLogSizeInBytes) return false
        if (this.LogType != other.LogType) return false
        if (this.ReplicationMode != other.ReplicationMode) return false
        if (this.MinimumPartnersInSync != other.MinimumPartnersInSync) return false
        if (this.EnableWriteConsistency != other.EnableWriteConsistency) return false
        if (this.EnableEncryption != other.EnableEncryption) return false
        if (this.EnableCompression != other.EnableCompression) return false
        if (!this.CertificateThumbprint.contentEquals(other.CertificateThumbprint)) return false
        if (this.VolumeNameCount != other.VolumeNameCount) return false
        if (!this.VolumeNames.contentEquals(other.VolumeNames)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ReplicationGroupName.contentHashCode()
        result = 31 * result + this.Description.contentHashCode()
        result = 31 * result + this.LogPath.contentHashCode()
        result = 31 * result + this.MaxLogSizeInBytes.hashCode()
        result = 31 * result + this.LogType.hashCode()
        result = 31 * result + this.ReplicationMode.hashCode()
        result = 31 * result + this.MinimumPartnersInSync.hashCode()
        result = 31 * result + this.EnableWriteConsistency.hashCode()
        result = 31 * result + this.EnableEncryption.hashCode()
        result = 31 * result + this.EnableCompression.hashCode()
        result = 31 * result + this.CertificateThumbprint.contentHashCode()
        result = 31 * result + this.VolumeNameCount.hashCode()
        result = 31 * result + this.VolumeNames.contentHashCode()
        return result
    }
}

public data class SR_RESOURCE_TYPE_ADD_REPLICATION_GROUP_RESULT(public var Result: UInt = 0u, public var ErrorString: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SR_RESOURCE_TYPE_ADD_REPLICATION_GROUP_RESULT) return false
        if (this.Result != other.Result) return false
        if (!this.ErrorString.contentEquals(other.ErrorString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Result.hashCode()
        result = 31 * result + this.ErrorString.contentHashCode()
        return result
    }
}

public data class SR_RESOURCE_TYPE_DISK_INFO(public var Reason: SR_DISK_REPLICATION_ELIGIBLE = 0, public var DiskGuid: GUID = GUID())

public data class SR_RESOURCE_TYPE_ELIGIBLE_DISKS_RESULT(public var Count: UShort = 0u, public var DiskInfo: List<SR_RESOURCE_TYPE_DISK_INFO> = List(1) { SR_RESOURCE_TYPE_DISK_INFO() })

public data class SR_RESOURCE_TYPE_QUERY_ELIGIBLE_LOGDISKS(public var DataDiskGuid: GUID = GUID(), public var IncludeOfflineDisks: Boolean = false)

public data class SR_RESOURCE_TYPE_QUERY_ELIGIBLE_SOURCE_DATADISKS(public var DataDiskGuid: GUID = GUID(), public var IncludeAvailableStoargeDisks: Boolean = false)

public data class SR_RESOURCE_TYPE_QUERY_ELIGIBLE_TARGET_DATADISKS(
    public var SourceDataDiskGuid: GUID = GUID(),
    public var TargetReplicationGroupGuid: GUID = GUID(),
    public var SkipConnectivityCheck: Boolean = false,
    public var IncludeOfflineDisks: Boolean = false,
)

public data class SR_RESOURCE_TYPE_REPLICATED_DISK(
    public var Type: SR_REPLICATED_DISK_TYPE = 0,
    public var ClusterDiskResourceGuid: GUID = GUID(),
    public var ReplicationGroupId: GUID = GUID(),
    public var ReplicationGroupName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SR_RESOURCE_TYPE_REPLICATED_DISK) return false
        if (this.Type != other.Type) return false
        if (this.ClusterDiskResourceGuid != other.ClusterDiskResourceGuid) return false
        if (this.ReplicationGroupId != other.ReplicationGroupId) return false
        if (!this.ReplicationGroupName.contentEquals(other.ReplicationGroupName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Type.hashCode()
        result = 31 * result + this.ClusterDiskResourceGuid.hashCode()
        result = 31 * result + this.ReplicationGroupId.hashCode()
        result = 31 * result + this.ReplicationGroupName.contentHashCode()
        return result
    }
}

public data class SR_RESOURCE_TYPE_REPLICATED_DISKS_RESULT(public var Count: UShort = 0u, public var ReplicatedDisks: List<SR_RESOURCE_TYPE_REPLICATED_DISK> = List(1) { SR_RESOURCE_TYPE_REPLICATED_DISK() })

public data class SR_RESOURCE_TYPE_REPLICATED_PARTITION_ARRAY(public var Count: UInt = 0u, public var PartitionArray: List<SR_RESOURCE_TYPE_REPLICATED_PARTITION_INFO> = List(1) { SR_RESOURCE_TYPE_REPLICATED_PARTITION_INFO() })

public data class SR_RESOURCE_TYPE_REPLICATED_PARTITION_INFO(public var PartitionOffset: ULong = 0uL, public var Capabilities: UInt = 0u)

public data class WitnessTagHelper(public var Version: Int = 0, public var paxosToValidate: PaxosTagCStruct = PaxosTagCStruct())

public data class WitnessTagUpdateHelper(
    public var Version: Int = 0,
    public var paxosToSet: PaxosTagCStruct = PaxosTagCStruct(),
    public var paxosToValidate: PaxosTagCStruct = PaxosTagCStruct(),
)
