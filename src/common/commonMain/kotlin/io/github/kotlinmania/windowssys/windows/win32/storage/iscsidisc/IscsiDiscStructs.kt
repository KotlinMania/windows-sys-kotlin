@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class ATA_PASS_THROUGH_DIRECT(
    public var Length: UShort = 0u,
    public var AtaFlags: UShort = 0u,
    public var PathId: UByte = 0u,
    public var TargetId: UByte = 0u,
    public var Lun: UByte = 0u,
    public var ReservedAsUchar: UByte = 0u,
    public var DataTransferLength: UInt = 0u,
    public var TimeOutValue: UInt = 0u,
    public var ReservedAsUlong: UInt = 0u,
    public var DataBuffer: Long = 0L,
    public var PreviousTaskFile: UByteArray = UByteArray(8),
    public var CurrentTaskFile: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ATA_PASS_THROUGH_DIRECT) return false
        if (this.Length != other.Length) return false
        if (this.AtaFlags != other.AtaFlags) return false
        if (this.PathId != other.PathId) return false
        if (this.TargetId != other.TargetId) return false
        if (this.Lun != other.Lun) return false
        if (this.ReservedAsUchar != other.ReservedAsUchar) return false
        if (this.DataTransferLength != other.DataTransferLength) return false
        if (this.TimeOutValue != other.TimeOutValue) return false
        if (this.ReservedAsUlong != other.ReservedAsUlong) return false
        if (this.DataBuffer != other.DataBuffer) return false
        if (!this.PreviousTaskFile.contentEquals(other.PreviousTaskFile)) return false
        if (!this.CurrentTaskFile.contentEquals(other.CurrentTaskFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.AtaFlags.hashCode()
        result = 31 * result + this.PathId.hashCode()
        result = 31 * result + this.TargetId.hashCode()
        result = 31 * result + this.Lun.hashCode()
        result = 31 * result + this.ReservedAsUchar.hashCode()
        result = 31 * result + this.DataTransferLength.hashCode()
        result = 31 * result + this.TimeOutValue.hashCode()
        result = 31 * result + this.ReservedAsUlong.hashCode()
        result = 31 * result + this.DataBuffer.hashCode()
        result = 31 * result + this.PreviousTaskFile.contentHashCode()
        result = 31 * result + this.CurrentTaskFile.contentHashCode()
        return result
    }
}

public data class ATA_PASS_THROUGH_DIRECT32(
    public var Length: UShort = 0u,
    public var AtaFlags: UShort = 0u,
    public var PathId: UByte = 0u,
    public var TargetId: UByte = 0u,
    public var Lun: UByte = 0u,
    public var ReservedAsUchar: UByte = 0u,
    public var DataTransferLength: UInt = 0u,
    public var TimeOutValue: UInt = 0u,
    public var ReservedAsUlong: UInt = 0u,
    public var DataBuffer: Long = 0L,
    public var PreviousTaskFile: UByteArray = UByteArray(8),
    public var CurrentTaskFile: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ATA_PASS_THROUGH_DIRECT32) return false
        if (this.Length != other.Length) return false
        if (this.AtaFlags != other.AtaFlags) return false
        if (this.PathId != other.PathId) return false
        if (this.TargetId != other.TargetId) return false
        if (this.Lun != other.Lun) return false
        if (this.ReservedAsUchar != other.ReservedAsUchar) return false
        if (this.DataTransferLength != other.DataTransferLength) return false
        if (this.TimeOutValue != other.TimeOutValue) return false
        if (this.ReservedAsUlong != other.ReservedAsUlong) return false
        if (this.DataBuffer != other.DataBuffer) return false
        if (!this.PreviousTaskFile.contentEquals(other.PreviousTaskFile)) return false
        if (!this.CurrentTaskFile.contentEquals(other.CurrentTaskFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.AtaFlags.hashCode()
        result = 31 * result + this.PathId.hashCode()
        result = 31 * result + this.TargetId.hashCode()
        result = 31 * result + this.Lun.hashCode()
        result = 31 * result + this.ReservedAsUchar.hashCode()
        result = 31 * result + this.DataTransferLength.hashCode()
        result = 31 * result + this.TimeOutValue.hashCode()
        result = 31 * result + this.ReservedAsUlong.hashCode()
        result = 31 * result + this.DataBuffer.hashCode()
        result = 31 * result + this.PreviousTaskFile.contentHashCode()
        result = 31 * result + this.CurrentTaskFile.contentHashCode()
        return result
    }
}

public data class ATA_PASS_THROUGH_EX(
    public var Length: UShort = 0u,
    public var AtaFlags: UShort = 0u,
    public var PathId: UByte = 0u,
    public var TargetId: UByte = 0u,
    public var Lun: UByte = 0u,
    public var ReservedAsUchar: UByte = 0u,
    public var DataTransferLength: UInt = 0u,
    public var TimeOutValue: UInt = 0u,
    public var ReservedAsUlong: UInt = 0u,
    public var DataBufferOffset: ULong = 0uL,
    public var PreviousTaskFile: UByteArray = UByteArray(8),
    public var CurrentTaskFile: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ATA_PASS_THROUGH_EX) return false
        if (this.Length != other.Length) return false
        if (this.AtaFlags != other.AtaFlags) return false
        if (this.PathId != other.PathId) return false
        if (this.TargetId != other.TargetId) return false
        if (this.Lun != other.Lun) return false
        if (this.ReservedAsUchar != other.ReservedAsUchar) return false
        if (this.DataTransferLength != other.DataTransferLength) return false
        if (this.TimeOutValue != other.TimeOutValue) return false
        if (this.ReservedAsUlong != other.ReservedAsUlong) return false
        if (this.DataBufferOffset != other.DataBufferOffset) return false
        if (!this.PreviousTaskFile.contentEquals(other.PreviousTaskFile)) return false
        if (!this.CurrentTaskFile.contentEquals(other.CurrentTaskFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.AtaFlags.hashCode()
        result = 31 * result + this.PathId.hashCode()
        result = 31 * result + this.TargetId.hashCode()
        result = 31 * result + this.Lun.hashCode()
        result = 31 * result + this.ReservedAsUchar.hashCode()
        result = 31 * result + this.DataTransferLength.hashCode()
        result = 31 * result + this.TimeOutValue.hashCode()
        result = 31 * result + this.ReservedAsUlong.hashCode()
        result = 31 * result + this.DataBufferOffset.hashCode()
        result = 31 * result + this.PreviousTaskFile.contentHashCode()
        result = 31 * result + this.CurrentTaskFile.contentHashCode()
        return result
    }
}

public data class ATA_PASS_THROUGH_EX32(
    public var Length: UShort = 0u,
    public var AtaFlags: UShort = 0u,
    public var PathId: UByte = 0u,
    public var TargetId: UByte = 0u,
    public var Lun: UByte = 0u,
    public var ReservedAsUchar: UByte = 0u,
    public var DataTransferLength: UInt = 0u,
    public var TimeOutValue: UInt = 0u,
    public var ReservedAsUlong: UInt = 0u,
    public var DataBufferOffset: UInt = 0u,
    public var PreviousTaskFile: UByteArray = UByteArray(8),
    public var CurrentTaskFile: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ATA_PASS_THROUGH_EX32) return false
        if (this.Length != other.Length) return false
        if (this.AtaFlags != other.AtaFlags) return false
        if (this.PathId != other.PathId) return false
        if (this.TargetId != other.TargetId) return false
        if (this.Lun != other.Lun) return false
        if (this.ReservedAsUchar != other.ReservedAsUchar) return false
        if (this.DataTransferLength != other.DataTransferLength) return false
        if (this.TimeOutValue != other.TimeOutValue) return false
        if (this.ReservedAsUlong != other.ReservedAsUlong) return false
        if (this.DataBufferOffset != other.DataBufferOffset) return false
        if (!this.PreviousTaskFile.contentEquals(other.PreviousTaskFile)) return false
        if (!this.CurrentTaskFile.contentEquals(other.CurrentTaskFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.AtaFlags.hashCode()
        result = 31 * result + this.PathId.hashCode()
        result = 31 * result + this.TargetId.hashCode()
        result = 31 * result + this.Lun.hashCode()
        result = 31 * result + this.ReservedAsUchar.hashCode()
        result = 31 * result + this.DataTransferLength.hashCode()
        result = 31 * result + this.TimeOutValue.hashCode()
        result = 31 * result + this.ReservedAsUlong.hashCode()
        result = 31 * result + this.DataBufferOffset.hashCode()
        result = 31 * result + this.PreviousTaskFile.contentHashCode()
        result = 31 * result + this.CurrentTaskFile.contentHashCode()
        return result
    }
}

public data class DSM_NOTIFICATION_REQUEST_BLOCK(
    public var Size: UInt = 0u,
    public var Version: UInt = 0u,
    public var NotifyFlags: UInt = 0u,
    public var DataSetProfile: UInt = 0u,
    public var Reserved: UIntArray = UIntArray(3),
    public var DataSetRangesCount: UInt = 0u,
    public var DataSetRanges: List<MP_DEVICE_DATA_SET_RANGE> = List(1) { MP_DEVICE_DATA_SET_RANGE() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DSM_NOTIFICATION_REQUEST_BLOCK) return false
        if (this.Size != other.Size) return false
        if (this.Version != other.Version) return false
        if (this.NotifyFlags != other.NotifyFlags) return false
        if (this.DataSetProfile != other.DataSetProfile) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.DataSetRangesCount != other.DataSetRangesCount) return false
        if (this.DataSetRanges != other.DataSetRanges) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Size.hashCode()
        result = 31 * result + this.Version.hashCode()
        result = 31 * result + this.NotifyFlags.hashCode()
        result = 31 * result + this.DataSetProfile.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.DataSetRangesCount.hashCode()
        result = 31 * result + this.DataSetRanges.hashCode()
        return result
    }
}

public data class DUMP_DRIVER(
    public var DumpDriverList: Long = 0L,
    public var DriverName: UShortArray = UShortArray(15),
    public var BaseName: UShortArray = UShortArray(15),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DUMP_DRIVER) return false
        if (this.DumpDriverList != other.DumpDriverList) return false
        if (!this.DriverName.contentEquals(other.DriverName)) return false
        if (!this.BaseName.contentEquals(other.BaseName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DumpDriverList.hashCode()
        result = 31 * result + this.DriverName.contentHashCode()
        result = 31 * result + this.BaseName.contentHashCode()
        return result
    }
}

public data class DUMP_DRIVER_EX(
    public var DumpDriverList: Long = 0L,
    public var DriverName: UShortArray = UShortArray(15),
    public var BaseName: UShortArray = UShortArray(15),
    public var DriverFullPath: NTSCSI_UNICODE_STRING = NTSCSI_UNICODE_STRING(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DUMP_DRIVER_EX) return false
        if (this.DumpDriverList != other.DumpDriverList) return false
        if (!this.DriverName.contentEquals(other.DriverName)) return false
        if (!this.BaseName.contentEquals(other.BaseName)) return false
        if (this.DriverFullPath != other.DriverFullPath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DumpDriverList.hashCode()
        result = 31 * result + this.DriverName.contentHashCode()
        result = 31 * result + this.BaseName.contentHashCode()
        result = 31 * result + this.DriverFullPath.hashCode()
        return result
    }
}

public data class DUMP_POINTERS(
    public var AdapterObject: Long = 0L,
    public var MappedRegisterBase: Long = 0L,
    public var DumpData: Long = 0L,
    public var CommonBufferVa: Long = 0L,
    public var CommonBufferPa: Long = 0L,
    public var CommonBufferSize: UInt = 0u,
    public var AllocateCommonBuffers: Boolean = false,
    public var UseDiskDump: Boolean = false,
    public var Spare1: UByteArray = UByteArray(2),
    public var DeviceObject: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DUMP_POINTERS) return false
        if (this.AdapterObject != other.AdapterObject) return false
        if (this.MappedRegisterBase != other.MappedRegisterBase) return false
        if (this.DumpData != other.DumpData) return false
        if (this.CommonBufferVa != other.CommonBufferVa) return false
        if (this.CommonBufferPa != other.CommonBufferPa) return false
        if (this.CommonBufferSize != other.CommonBufferSize) return false
        if (this.AllocateCommonBuffers != other.AllocateCommonBuffers) return false
        if (this.UseDiskDump != other.UseDiskDump) return false
        if (!this.Spare1.contentEquals(other.Spare1)) return false
        if (this.DeviceObject != other.DeviceObject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AdapterObject.hashCode()
        result = 31 * result + this.MappedRegisterBase.hashCode()
        result = 31 * result + this.DumpData.hashCode()
        result = 31 * result + this.CommonBufferVa.hashCode()
        result = 31 * result + this.CommonBufferPa.hashCode()
        result = 31 * result + this.CommonBufferSize.hashCode()
        result = 31 * result + this.AllocateCommonBuffers.hashCode()
        result = 31 * result + this.UseDiskDump.hashCode()
        result = 31 * result + this.Spare1.contentHashCode()
        result = 31 * result + this.DeviceObject.hashCode()
        return result
    }
}

public data class DUMP_POINTERS_EX(
    public var Header: DUMP_POINTERS_VERSION = DUMP_POINTERS_VERSION(),
    public var DumpData: Long = 0L,
    public var CommonBufferVa: Long = 0L,
    public var CommonBufferSize: UInt = 0u,
    public var AllocateCommonBuffers: Boolean = false,
    public var DeviceObject: Long = 0L,
    public var DriverList: Long = 0L,
    public var dwPortFlags: UInt = 0u,
    public var MaxDeviceDumpSectionSize: UInt = 0u,
    public var MaxDeviceDumpLevel: UInt = 0u,
    public var MaxTransferSize: UInt = 0u,
    public var AdapterObject: Long = 0L,
    public var MappedRegisterBase: Long = 0L,
    public var DeviceReady: Long = 0L,
    public var DumpDevicePowerOn: PDUMP_DEVICE_POWERON_ROUTINE = null,
    public var DumpDevicePowerOnContext: Long = 0L,
)

public data class DUMP_POINTERS_VERSION(public var Version: UInt = 0u, public var Size: UInt = 0u)

public data class FIRMWARE_REQUEST_BLOCK(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Function: UInt = 0u,
    public var Flags: UInt = 0u,
    public var DataBufferOffset: UInt = 0u,
    public var DataBufferLength: UInt = 0u,
)

public data class HYBRID_DEMOTE_BY_SIZE(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var SourcePriority: UByte = 0u,
    public var TargetPriority: UByte = 0u,
    public var Reserved0: UShort = 0u,
    public var Reserved1: UInt = 0u,
    public var LbaCount: ULong = 0uL,
)

public data class HYBRID_DIRTY_THRESHOLDS(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var DirtyLowThreshold: UInt = 0u,
    public var DirtyHighThreshold: UInt = 0u,
)

public data class HYBRID_INFORMATION(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var HybridSupported: Boolean = false,
    public var Status: NVCACHE_STATUS = 0,
    public var CacheTypeEffective: NVCACHE_TYPE = 0,
    public var CacheTypeDefault: NVCACHE_TYPE = 0,
    public var FractionBase: UInt = 0u,
    public var CacheSize: ULong = 0uL,
    public var Attributes: HYBRID_INFORMATION_0 = HYBRID_INFORMATION_0(),
    public var Priorities: HYBRID_INFORMATION_1 = HYBRID_INFORMATION_1(),
)

public data class HYBRID_INFORMATION_0(public var _bitfield: UInt = 0u)

public data class HYBRID_INFORMATION_1(
    public var PriorityLevelCount: UByte = 0u,
    public var MaxPriorityBehavior: Boolean = false,
    public var OptimalWriteGranularity: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var DirtyThresholdLow: UInt = 0u,
    public var DirtyThresholdHigh: UInt = 0u,
    public var SupportedCommands: HYBRID_INFORMATION_1_0 = HYBRID_INFORMATION_1_0(),
    public var Priority: List<NVCACHE_PRIORITY_LEVEL_DESCRIPTOR> = List(1) { NVCACHE_PRIORITY_LEVEL_DESCRIPTOR() },
)

public data class HYBRID_INFORMATION_1_0(
    public var _bitfield: UInt = 0u,
    public var MaxEvictCommands: UInt = 0u,
    public var MaxLbaRangeCountForEvict: UInt = 0u,
    public var MaxLbaRangeCountForChangeLba: UInt = 0u,
)

public data class HYBRID_REQUEST_BLOCK(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Function: UInt = 0u,
    public var Flags: UInt = 0u,
    public var DataBufferOffset: UInt = 0u,
    public var DataBufferLength: UInt = 0u,
)

public data class IDE_IO_CONTROL(
    public var HeaderLength: UInt = 0u,
    public var Signature: UByteArray = UByteArray(8),
    public var Timeout: UInt = 0u,
    public var ControlCode: UInt = 0u,
    public var ReturnStatus: UInt = 0u,
    public var DataLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IDE_IO_CONTROL) return false
        if (this.HeaderLength != other.HeaderLength) return false
        if (!this.Signature.contentEquals(other.Signature)) return false
        if (this.Timeout != other.Timeout) return false
        if (this.ControlCode != other.ControlCode) return false
        if (this.ReturnStatus != other.ReturnStatus) return false
        if (this.DataLength != other.DataLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.HeaderLength.hashCode()
        result = 31 * result + this.Signature.contentHashCode()
        result = 31 * result + this.Timeout.hashCode()
        result = 31 * result + this.ControlCode.hashCode()
        result = 31 * result + this.ReturnStatus.hashCode()
        result = 31 * result + this.DataLength.hashCode()
        return result
    }
}

public data class IKE_AUTHENTICATION_INFORMATION(public var AuthMethod: IKE_AUTHENTICATION_METHOD = 0, public var Anonymous: IKE_AUTHENTICATION_INFORMATION_0 = IKE_AUTHENTICATION_INFORMATION_0())

public data class IKE_AUTHENTICATION_INFORMATION_0(public var PsKey: IKE_AUTHENTICATION_PRESHARED_KEY = IKE_AUTHENTICATION_PRESHARED_KEY())

public data class IKE_AUTHENTICATION_PRESHARED_KEY(
    public var SecurityFlags: ULong = 0uL,
    public var IdType: UByte = 0u,
    public var IdLengthInBytes: UInt = 0u,
    public var Id: Long = 0L,
    public var KeyLengthInBytes: UInt = 0u,
    public var Key: Long = 0L,
)

public data class IO_SCSI_CAPABILITIES(
    public var Length: UInt = 0u,
    public var MaximumTransferLength: UInt = 0u,
    public var MaximumPhysicalPages: UInt = 0u,
    public var SupportedAsynchronousEvents: UInt = 0u,
    public var AlignmentMask: UInt = 0u,
    public var TaggedQueuing: Boolean = false,
    public var AdapterScansDown: Boolean = false,
    public var AdapterUsesPio: Boolean = false,
)

public data class ISCSI_CONNECTION_INFOA(
    public var ConnectionId: ISCSI_UNIQUE_SESSION_ID = ISCSI_UNIQUE_SESSION_ID(),
    public var InitiatorAddress: PSTR = 0L,
    public var TargetAddress: PSTR = 0L,
    public var InitiatorSocket: UShort = 0u,
    public var TargetSocket: UShort = 0u,
    public var CID: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ISCSI_CONNECTION_INFOA) return false
        if (this.ConnectionId != other.ConnectionId) return false
        if (this.InitiatorAddress != other.InitiatorAddress) return false
        if (this.TargetAddress != other.TargetAddress) return false
        if (this.InitiatorSocket != other.InitiatorSocket) return false
        if (this.TargetSocket != other.TargetSocket) return false
        if (!this.CID.contentEquals(other.CID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ConnectionId.hashCode()
        result = 31 * result + this.InitiatorAddress.hashCode()
        result = 31 * result + this.TargetAddress.hashCode()
        result = 31 * result + this.InitiatorSocket.hashCode()
        result = 31 * result + this.TargetSocket.hashCode()
        result = 31 * result + this.CID.contentHashCode()
        return result
    }
}

public data class ISCSI_CONNECTION_INFOW(
    public var ConnectionId: ISCSI_UNIQUE_SESSION_ID = ISCSI_UNIQUE_SESSION_ID(),
    public var InitiatorAddress: PWSTR = 0L,
    public var TargetAddress: PWSTR = 0L,
    public var InitiatorSocket: UShort = 0u,
    public var TargetSocket: UShort = 0u,
    public var CID: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ISCSI_CONNECTION_INFOW) return false
        if (this.ConnectionId != other.ConnectionId) return false
        if (this.InitiatorAddress != other.InitiatorAddress) return false
        if (this.TargetAddress != other.TargetAddress) return false
        if (this.InitiatorSocket != other.InitiatorSocket) return false
        if (this.TargetSocket != other.TargetSocket) return false
        if (!this.CID.contentEquals(other.CID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ConnectionId.hashCode()
        result = 31 * result + this.InitiatorAddress.hashCode()
        result = 31 * result + this.TargetAddress.hashCode()
        result = 31 * result + this.InitiatorSocket.hashCode()
        result = 31 * result + this.TargetSocket.hashCode()
        result = 31 * result + this.CID.contentHashCode()
        return result
    }
}

public data class ISCSI_CONNECTION_INFO_EX(
    public var ConnectionId: ISCSI_UNIQUE_SESSION_ID = ISCSI_UNIQUE_SESSION_ID(),
    public var State: UByte = 0u,
    public var Protocol: UByte = 0u,
    public var HeaderDigest: UByte = 0u,
    public var DataDigest: UByte = 0u,
    public var MaxRecvDataSegmentLength: UInt = 0u,
    public var AuthType: ISCSI_AUTH_TYPES = 0,
    public var EstimatedThroughput: ULong = 0uL,
    public var MaxDatagramSize: UInt = 0u,
)

public data class ISCSI_DEVICE_ON_SESSIONA(
    public var InitiatorName: ByteArray = ByteArray(256),
    public var TargetName: ByteArray = ByteArray(224),
    public var ScsiAddress: SCSI_ADDRESS = SCSI_ADDRESS(),
    public var DeviceInterfaceType: GUID = GUID(),
    public var DeviceInterfaceName: ByteArray = ByteArray(260),
    public var LegacyName: ByteArray = ByteArray(260),
    public var StorageDeviceNumber: System.Ioctl.STORAGE_DEVICE_NUMBER = System.Ioctl.STORAGE_DEVICE_NUMBER(),
    public var DeviceInstance: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ISCSI_DEVICE_ON_SESSIONA) return false
        if (!this.InitiatorName.contentEquals(other.InitiatorName)) return false
        if (!this.TargetName.contentEquals(other.TargetName)) return false
        if (this.ScsiAddress != other.ScsiAddress) return false
        if (this.DeviceInterfaceType != other.DeviceInterfaceType) return false
        if (!this.DeviceInterfaceName.contentEquals(other.DeviceInterfaceName)) return false
        if (!this.LegacyName.contentEquals(other.LegacyName)) return false
        if (this.StorageDeviceNumber != other.StorageDeviceNumber) return false
        if (this.DeviceInstance != other.DeviceInstance) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.InitiatorName.contentHashCode()
        result = 31 * result + this.TargetName.contentHashCode()
        result = 31 * result + this.ScsiAddress.hashCode()
        result = 31 * result + this.DeviceInterfaceType.hashCode()
        result = 31 * result + this.DeviceInterfaceName.contentHashCode()
        result = 31 * result + this.LegacyName.contentHashCode()
        result = 31 * result + this.StorageDeviceNumber.hashCode()
        result = 31 * result + this.DeviceInstance.hashCode()
        return result
    }
}

public data class ISCSI_DEVICE_ON_SESSIONW(
    public var InitiatorName: UShortArray = UShortArray(256),
    public var TargetName: UShortArray = UShortArray(224),
    public var ScsiAddress: SCSI_ADDRESS = SCSI_ADDRESS(),
    public var DeviceInterfaceType: GUID = GUID(),
    public var DeviceInterfaceName: UShortArray = UShortArray(260),
    public var LegacyName: UShortArray = UShortArray(260),
    public var StorageDeviceNumber: System.Ioctl.STORAGE_DEVICE_NUMBER = System.Ioctl.STORAGE_DEVICE_NUMBER(),
    public var DeviceInstance: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ISCSI_DEVICE_ON_SESSIONW) return false
        if (!this.InitiatorName.contentEquals(other.InitiatorName)) return false
        if (!this.TargetName.contentEquals(other.TargetName)) return false
        if (this.ScsiAddress != other.ScsiAddress) return false
        if (this.DeviceInterfaceType != other.DeviceInterfaceType) return false
        if (!this.DeviceInterfaceName.contentEquals(other.DeviceInterfaceName)) return false
        if (!this.LegacyName.contentEquals(other.LegacyName)) return false
        if (this.StorageDeviceNumber != other.StorageDeviceNumber) return false
        if (this.DeviceInstance != other.DeviceInstance) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.InitiatorName.contentHashCode()
        result = 31 * result + this.TargetName.contentHashCode()
        result = 31 * result + this.ScsiAddress.hashCode()
        result = 31 * result + this.DeviceInterfaceType.hashCode()
        result = 31 * result + this.DeviceInterfaceName.contentHashCode()
        result = 31 * result + this.LegacyName.contentHashCode()
        result = 31 * result + this.StorageDeviceNumber.hashCode()
        result = 31 * result + this.DeviceInstance.hashCode()
        return result
    }
}

public data class ISCSI_LOGIN_OPTIONS(
    public var Version: UInt = 0u,
    public var InformationSpecified: UInt = 0u,
    public var LoginFlags: UInt = 0u,
    public var AuthType: ISCSI_AUTH_TYPES = 0,
    public var HeaderDigest: ISCSI_DIGEST_TYPES = 0,
    public var DataDigest: ISCSI_DIGEST_TYPES = 0,
    public var MaximumConnections: UInt = 0u,
    public var DefaultTime2Wait: UInt = 0u,
    public var DefaultTime2Retain: UInt = 0u,
    public var UsernameLength: UInt = 0u,
    public var PasswordLength: UInt = 0u,
    public var Username: Long = 0L,
    public var Password: Long = 0L,
)

public data class ISCSI_SESSION_INFOA(
    public var SessionId: ISCSI_UNIQUE_SESSION_ID = ISCSI_UNIQUE_SESSION_ID(),
    public var InitiatorName: PSTR = 0L,
    public var TargetNodeName: PSTR = 0L,
    public var TargetName: PSTR = 0L,
    public var ISID: UByteArray = UByteArray(6),
    public var TSID: UByteArray = UByteArray(2),
    public var ConnectionCount: UInt = 0u,
    public var Connections: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ISCSI_SESSION_INFOA) return false
        if (this.SessionId != other.SessionId) return false
        if (this.InitiatorName != other.InitiatorName) return false
        if (this.TargetNodeName != other.TargetNodeName) return false
        if (this.TargetName != other.TargetName) return false
        if (!this.ISID.contentEquals(other.ISID)) return false
        if (!this.TSID.contentEquals(other.TSID)) return false
        if (this.ConnectionCount != other.ConnectionCount) return false
        if (this.Connections != other.Connections) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SessionId.hashCode()
        result = 31 * result + this.InitiatorName.hashCode()
        result = 31 * result + this.TargetNodeName.hashCode()
        result = 31 * result + this.TargetName.hashCode()
        result = 31 * result + this.ISID.contentHashCode()
        result = 31 * result + this.TSID.contentHashCode()
        result = 31 * result + this.ConnectionCount.hashCode()
        result = 31 * result + this.Connections.hashCode()
        return result
    }
}

public data class ISCSI_SESSION_INFOW(
    public var SessionId: ISCSI_UNIQUE_SESSION_ID = ISCSI_UNIQUE_SESSION_ID(),
    public var InitiatorName: PWSTR = 0L,
    public var TargetNodeName: PWSTR = 0L,
    public var TargetName: PWSTR = 0L,
    public var ISID: UByteArray = UByteArray(6),
    public var TSID: UByteArray = UByteArray(2),
    public var ConnectionCount: UInt = 0u,
    public var Connections: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ISCSI_SESSION_INFOW) return false
        if (this.SessionId != other.SessionId) return false
        if (this.InitiatorName != other.InitiatorName) return false
        if (this.TargetNodeName != other.TargetNodeName) return false
        if (this.TargetName != other.TargetName) return false
        if (!this.ISID.contentEquals(other.ISID)) return false
        if (!this.TSID.contentEquals(other.TSID)) return false
        if (this.ConnectionCount != other.ConnectionCount) return false
        if (this.Connections != other.Connections) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SessionId.hashCode()
        result = 31 * result + this.InitiatorName.hashCode()
        result = 31 * result + this.TargetNodeName.hashCode()
        result = 31 * result + this.TargetName.hashCode()
        result = 31 * result + this.ISID.contentHashCode()
        result = 31 * result + this.TSID.contentHashCode()
        result = 31 * result + this.ConnectionCount.hashCode()
        result = 31 * result + this.Connections.hashCode()
        return result
    }
}

public data class ISCSI_SESSION_INFO_EX(
    public var SessionId: ISCSI_UNIQUE_SESSION_ID = ISCSI_UNIQUE_SESSION_ID(),
    public var InitialR2t: Boolean = false,
    public var ImmediateData: Boolean = false,
    public var Type: UByte = 0u,
    public var DataSequenceInOrder: Boolean = false,
    public var DataPduInOrder: Boolean = false,
    public var ErrorRecoveryLevel: UByte = 0u,
    public var MaxOutstandingR2t: UInt = 0u,
    public var FirstBurstLength: UInt = 0u,
    public var MaxBurstLength: UInt = 0u,
    public var MaximumConnections: UInt = 0u,
    public var ConnectionCount: UInt = 0u,
    public var Connections: Long = 0L,
)

public data class ISCSI_TARGET_MAPPINGA(
    public var InitiatorName: ByteArray = ByteArray(256),
    public var TargetName: ByteArray = ByteArray(224),
    public var OSDeviceName: ByteArray = ByteArray(260),
    public var SessionId: ISCSI_UNIQUE_SESSION_ID = ISCSI_UNIQUE_SESSION_ID(),
    public var OSBusNumber: UInt = 0u,
    public var OSTargetNumber: UInt = 0u,
    public var LUNCount: UInt = 0u,
    public var LUNList: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ISCSI_TARGET_MAPPINGA) return false
        if (!this.InitiatorName.contentEquals(other.InitiatorName)) return false
        if (!this.TargetName.contentEquals(other.TargetName)) return false
        if (!this.OSDeviceName.contentEquals(other.OSDeviceName)) return false
        if (this.SessionId != other.SessionId) return false
        if (this.OSBusNumber != other.OSBusNumber) return false
        if (this.OSTargetNumber != other.OSTargetNumber) return false
        if (this.LUNCount != other.LUNCount) return false
        if (this.LUNList != other.LUNList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.InitiatorName.contentHashCode()
        result = 31 * result + this.TargetName.contentHashCode()
        result = 31 * result + this.OSDeviceName.contentHashCode()
        result = 31 * result + this.SessionId.hashCode()
        result = 31 * result + this.OSBusNumber.hashCode()
        result = 31 * result + this.OSTargetNumber.hashCode()
        result = 31 * result + this.LUNCount.hashCode()
        result = 31 * result + this.LUNList.hashCode()
        return result
    }
}

public data class ISCSI_TARGET_MAPPINGW(
    public var InitiatorName: UShortArray = UShortArray(256),
    public var TargetName: UShortArray = UShortArray(224),
    public var OSDeviceName: UShortArray = UShortArray(260),
    public var SessionId: ISCSI_UNIQUE_SESSION_ID = ISCSI_UNIQUE_SESSION_ID(),
    public var OSBusNumber: UInt = 0u,
    public var OSTargetNumber: UInt = 0u,
    public var LUNCount: UInt = 0u,
    public var LUNList: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ISCSI_TARGET_MAPPINGW) return false
        if (!this.InitiatorName.contentEquals(other.InitiatorName)) return false
        if (!this.TargetName.contentEquals(other.TargetName)) return false
        if (!this.OSDeviceName.contentEquals(other.OSDeviceName)) return false
        if (this.SessionId != other.SessionId) return false
        if (this.OSBusNumber != other.OSBusNumber) return false
        if (this.OSTargetNumber != other.OSTargetNumber) return false
        if (this.LUNCount != other.LUNCount) return false
        if (this.LUNList != other.LUNList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.InitiatorName.contentHashCode()
        result = 31 * result + this.TargetName.contentHashCode()
        result = 31 * result + this.OSDeviceName.contentHashCode()
        result = 31 * result + this.SessionId.hashCode()
        result = 31 * result + this.OSBusNumber.hashCode()
        result = 31 * result + this.OSTargetNumber.hashCode()
        result = 31 * result + this.LUNCount.hashCode()
        result = 31 * result + this.LUNList.hashCode()
        return result
    }
}

public data class ISCSI_TARGET_PORTALA(
    public var SymbolicName: ByteArray = ByteArray(256),
    public var Address: ByteArray = ByteArray(256),
    public var Socket: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ISCSI_TARGET_PORTALA) return false
        if (!this.SymbolicName.contentEquals(other.SymbolicName)) return false
        if (!this.Address.contentEquals(other.Address)) return false
        if (this.Socket != other.Socket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SymbolicName.contentHashCode()
        result = 31 * result + this.Address.contentHashCode()
        result = 31 * result + this.Socket.hashCode()
        return result
    }
}

public data class ISCSI_TARGET_PORTALW(
    public var SymbolicName: UShortArray = UShortArray(256),
    public var Address: UShortArray = UShortArray(256),
    public var Socket: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ISCSI_TARGET_PORTALW) return false
        if (!this.SymbolicName.contentEquals(other.SymbolicName)) return false
        if (!this.Address.contentEquals(other.Address)) return false
        if (this.Socket != other.Socket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SymbolicName.contentHashCode()
        result = 31 * result + this.Address.contentHashCode()
        result = 31 * result + this.Socket.hashCode()
        return result
    }
}

public data class ISCSI_TARGET_PORTAL_GROUPA(public var Count: UInt = 0u, public var Portals: List<ISCSI_TARGET_PORTALA> = List(1) { ISCSI_TARGET_PORTALA() })

public data class ISCSI_TARGET_PORTAL_GROUPW(public var Count: UInt = 0u, public var Portals: List<ISCSI_TARGET_PORTALW> = List(1) { ISCSI_TARGET_PORTALW() })

public data class ISCSI_TARGET_PORTAL_INFOA(
    public var InitiatorName: ByteArray = ByteArray(256),
    public var InitiatorPortNumber: UInt = 0u,
    public var SymbolicName: ByteArray = ByteArray(256),
    public var Address: ByteArray = ByteArray(256),
    public var Socket: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ISCSI_TARGET_PORTAL_INFOA) return false
        if (!this.InitiatorName.contentEquals(other.InitiatorName)) return false
        if (this.InitiatorPortNumber != other.InitiatorPortNumber) return false
        if (!this.SymbolicName.contentEquals(other.SymbolicName)) return false
        if (!this.Address.contentEquals(other.Address)) return false
        if (this.Socket != other.Socket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.InitiatorName.contentHashCode()
        result = 31 * result + this.InitiatorPortNumber.hashCode()
        result = 31 * result + this.SymbolicName.contentHashCode()
        result = 31 * result + this.Address.contentHashCode()
        result = 31 * result + this.Socket.hashCode()
        return result
    }
}

public data class ISCSI_TARGET_PORTAL_INFOW(
    public var InitiatorName: UShortArray = UShortArray(256),
    public var InitiatorPortNumber: UInt = 0u,
    public var SymbolicName: UShortArray = UShortArray(256),
    public var Address: UShortArray = UShortArray(256),
    public var Socket: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ISCSI_TARGET_PORTAL_INFOW) return false
        if (!this.InitiatorName.contentEquals(other.InitiatorName)) return false
        if (this.InitiatorPortNumber != other.InitiatorPortNumber) return false
        if (!this.SymbolicName.contentEquals(other.SymbolicName)) return false
        if (!this.Address.contentEquals(other.Address)) return false
        if (this.Socket != other.Socket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.InitiatorName.contentHashCode()
        result = 31 * result + this.InitiatorPortNumber.hashCode()
        result = 31 * result + this.SymbolicName.contentHashCode()
        result = 31 * result + this.Address.contentHashCode()
        result = 31 * result + this.Socket.hashCode()
        return result
    }
}

public data class ISCSI_TARGET_PORTAL_INFO_EXA(
    public var InitiatorName: ByteArray = ByteArray(256),
    public var InitiatorPortNumber: UInt = 0u,
    public var SymbolicName: ByteArray = ByteArray(256),
    public var Address: ByteArray = ByteArray(256),
    public var Socket: UShort = 0u,
    public var SecurityFlags: ULong = 0uL,
    public var LoginOptions: ISCSI_LOGIN_OPTIONS = ISCSI_LOGIN_OPTIONS(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ISCSI_TARGET_PORTAL_INFO_EXA) return false
        if (!this.InitiatorName.contentEquals(other.InitiatorName)) return false
        if (this.InitiatorPortNumber != other.InitiatorPortNumber) return false
        if (!this.SymbolicName.contentEquals(other.SymbolicName)) return false
        if (!this.Address.contentEquals(other.Address)) return false
        if (this.Socket != other.Socket) return false
        if (this.SecurityFlags != other.SecurityFlags) return false
        if (this.LoginOptions != other.LoginOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.InitiatorName.contentHashCode()
        result = 31 * result + this.InitiatorPortNumber.hashCode()
        result = 31 * result + this.SymbolicName.contentHashCode()
        result = 31 * result + this.Address.contentHashCode()
        result = 31 * result + this.Socket.hashCode()
        result = 31 * result + this.SecurityFlags.hashCode()
        result = 31 * result + this.LoginOptions.hashCode()
        return result
    }
}

public data class ISCSI_TARGET_PORTAL_INFO_EXW(
    public var InitiatorName: UShortArray = UShortArray(256),
    public var InitiatorPortNumber: UInt = 0u,
    public var SymbolicName: UShortArray = UShortArray(256),
    public var Address: UShortArray = UShortArray(256),
    public var Socket: UShort = 0u,
    public var SecurityFlags: ULong = 0uL,
    public var LoginOptions: ISCSI_LOGIN_OPTIONS = ISCSI_LOGIN_OPTIONS(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ISCSI_TARGET_PORTAL_INFO_EXW) return false
        if (!this.InitiatorName.contentEquals(other.InitiatorName)) return false
        if (this.InitiatorPortNumber != other.InitiatorPortNumber) return false
        if (!this.SymbolicName.contentEquals(other.SymbolicName)) return false
        if (!this.Address.contentEquals(other.Address)) return false
        if (this.Socket != other.Socket) return false
        if (this.SecurityFlags != other.SecurityFlags) return false
        if (this.LoginOptions != other.LoginOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.InitiatorName.contentHashCode()
        result = 31 * result + this.InitiatorPortNumber.hashCode()
        result = 31 * result + this.SymbolicName.contentHashCode()
        result = 31 * result + this.Address.contentHashCode()
        result = 31 * result + this.Socket.hashCode()
        result = 31 * result + this.SecurityFlags.hashCode()
        result = 31 * result + this.LoginOptions.hashCode()
        return result
    }
}

public data class ISCSI_UNIQUE_SESSION_ID(public var AdapterUnique: ULong = 0uL, public var AdapterSpecific: ULong = 0uL)

public data class ISCSI_VERSION_INFO(
    public var MajorVersion: UInt = 0u,
    public var MinorVersion: UInt = 0u,
    public var BuildNumber: UInt = 0u,
)

public data class MPIO_PASS_THROUGH_PATH(
    public var PassThrough: SCSI_PASS_THROUGH = SCSI_PASS_THROUGH(),
    public var Version: UInt = 0u,
    public var Length: UShort = 0u,
    public var Flags: UByte = 0u,
    public var PortNumber: UByte = 0u,
    public var MpioPathId: ULong = 0uL,
)

public data class MPIO_PASS_THROUGH_PATH32(
    public var PassThrough: SCSI_PASS_THROUGH32 = SCSI_PASS_THROUGH32(),
    public var Version: UInt = 0u,
    public var Length: UShort = 0u,
    public var Flags: UByte = 0u,
    public var PortNumber: UByte = 0u,
    public var MpioPathId: ULong = 0uL,
)

public data class MPIO_PASS_THROUGH_PATH32_EX(
    public var PassThroughOffset: UInt = 0u,
    public var Version: UInt = 0u,
    public var Length: UShort = 0u,
    public var Flags: UByte = 0u,
    public var PortNumber: UByte = 0u,
    public var MpioPathId: ULong = 0uL,
)

public data class MPIO_PASS_THROUGH_PATH_DIRECT(
    public var PassThrough: SCSI_PASS_THROUGH_DIRECT = SCSI_PASS_THROUGH_DIRECT(),
    public var Version: UInt = 0u,
    public var Length: UShort = 0u,
    public var Flags: UByte = 0u,
    public var PortNumber: UByte = 0u,
    public var MpioPathId: ULong = 0uL,
)

public data class MPIO_PASS_THROUGH_PATH_DIRECT32(
    public var PassThrough: SCSI_PASS_THROUGH_DIRECT32 = SCSI_PASS_THROUGH_DIRECT32(),
    public var Version: UInt = 0u,
    public var Length: UShort = 0u,
    public var Flags: UByte = 0u,
    public var PortNumber: UByte = 0u,
    public var MpioPathId: ULong = 0uL,
)

public data class MPIO_PASS_THROUGH_PATH_DIRECT32_EX(
    public var PassThroughOffset: UInt = 0u,
    public var Version: UInt = 0u,
    public var Length: UShort = 0u,
    public var Flags: UByte = 0u,
    public var PortNumber: UByte = 0u,
    public var MpioPathId: ULong = 0uL,
)

public data class MPIO_PASS_THROUGH_PATH_DIRECT_EX(
    public var PassThroughOffset: UInt = 0u,
    public var Version: UInt = 0u,
    public var Length: UShort = 0u,
    public var Flags: UByte = 0u,
    public var PortNumber: UByte = 0u,
    public var MpioPathId: ULong = 0uL,
)

public data class MPIO_PASS_THROUGH_PATH_EX(
    public var PassThroughOffset: UInt = 0u,
    public var Version: UInt = 0u,
    public var Length: UShort = 0u,
    public var Flags: UByte = 0u,
    public var PortNumber: UByte = 0u,
    public var MpioPathId: ULong = 0uL,
)

public data class MP_DEVICE_DATA_SET_RANGE(public var StartingOffset: Long = 0L, public var LengthInBytes: ULong = 0uL)

public data class NTSCSI_UNICODE_STRING(
    public var Length: UShort = 0u,
    public var MaximumLength: UShort = 0u,
    public var Buffer: PWSTR = 0L,
)

public data class NVCACHE_HINT_PAYLOAD(
    public var Command: UByte = 0u,
    public var Feature7_0: UByte = 0u,
    public var Feature15_8: UByte = 0u,
    public var Count15_8: UByte = 0u,
    public var LBA7_0: UByte = 0u,
    public var LBA15_8: UByte = 0u,
    public var LBA23_16: UByte = 0u,
    public var LBA31_24: UByte = 0u,
    public var LBA39_32: UByte = 0u,
    public var LBA47_40: UByte = 0u,
    public var Auxiliary7_0: UByte = 0u,
    public var Auxiliary23_16: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVCACHE_HINT_PAYLOAD) return false
        if (this.Command != other.Command) return false
        if (this.Feature7_0 != other.Feature7_0) return false
        if (this.Feature15_8 != other.Feature15_8) return false
        if (this.Count15_8 != other.Count15_8) return false
        if (this.LBA7_0 != other.LBA7_0) return false
        if (this.LBA15_8 != other.LBA15_8) return false
        if (this.LBA23_16 != other.LBA23_16) return false
        if (this.LBA31_24 != other.LBA31_24) return false
        if (this.LBA39_32 != other.LBA39_32) return false
        if (this.LBA47_40 != other.LBA47_40) return false
        if (this.Auxiliary7_0 != other.Auxiliary7_0) return false
        if (this.Auxiliary23_16 != other.Auxiliary23_16) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Command.hashCode()
        result = 31 * result + this.Feature7_0.hashCode()
        result = 31 * result + this.Feature15_8.hashCode()
        result = 31 * result + this.Count15_8.hashCode()
        result = 31 * result + this.LBA7_0.hashCode()
        result = 31 * result + this.LBA15_8.hashCode()
        result = 31 * result + this.LBA23_16.hashCode()
        result = 31 * result + this.LBA31_24.hashCode()
        result = 31 * result + this.LBA39_32.hashCode()
        result = 31 * result + this.LBA47_40.hashCode()
        result = 31 * result + this.Auxiliary7_0.hashCode()
        result = 31 * result + this.Auxiliary23_16.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class NVCACHE_PRIORITY_LEVEL_DESCRIPTOR(
    public var PriorityLevel: UByte = 0u,
    public var Reserved0: UByteArray = UByteArray(3),
    public var ConsumedNVMSizeFraction: UInt = 0u,
    public var ConsumedMappingResourcesFraction: UInt = 0u,
    public var ConsumedNVMSizeForDirtyDataFraction: UInt = 0u,
    public var ConsumedMappingResourcesForDirtyDataFraction: UInt = 0u,
    public var Reserved1: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NVCACHE_PRIORITY_LEVEL_DESCRIPTOR) return false
        if (this.PriorityLevel != other.PriorityLevel) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        if (this.ConsumedNVMSizeFraction != other.ConsumedNVMSizeFraction) return false
        if (this.ConsumedMappingResourcesFraction != other.ConsumedMappingResourcesFraction) return false
        if (this.ConsumedNVMSizeForDirtyDataFraction != other.ConsumedNVMSizeForDirtyDataFraction) return false
        if (this.ConsumedMappingResourcesForDirtyDataFraction != other.ConsumedMappingResourcesForDirtyDataFraction) return false
        if (this.Reserved1 != other.Reserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PriorityLevel.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        result = 31 * result + this.ConsumedNVMSizeFraction.hashCode()
        result = 31 * result + this.ConsumedMappingResourcesFraction.hashCode()
        result = 31 * result + this.ConsumedNVMSizeForDirtyDataFraction.hashCode()
        result = 31 * result + this.ConsumedMappingResourcesForDirtyDataFraction.hashCode()
        result = 31 * result + this.Reserved1.hashCode()
        return result
    }
}

public data class NVCACHE_REQUEST_BLOCK(
    public var NRBSize: UInt = 0u,
    public var Function: UShort = 0u,
    public var NRBFlags: UInt = 0u,
    public var NRBStatus: UInt = 0u,
    public var Count: UInt = 0u,
    public var LBA: ULong = 0uL,
    public var DataBufSize: UInt = 0u,
    public var NVCacheStatus: UInt = 0u,
    public var NVCacheSubStatus: UInt = 0u,
)

public data class NV_FEATURE_PARAMETER(
    public var NVPowerModeEnabled: UShort = 0u,
    public var NVParameterReserv1: UShort = 0u,
    public var NVCmdEnabled: UShort = 0u,
    public var NVParameterReserv2: UShort = 0u,
    public var NVPowerModeVer: UShort = 0u,
    public var NVCmdVer: UShort = 0u,
    public var NVSize: UInt = 0u,
    public var NVReadSpeed: UShort = 0u,
    public var NVWrtSpeed: UShort = 0u,
    public var DeviceSpinUpTime: UInt = 0u,
)

public data class NV_SEP_CACHE_PARAMETER(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Flags: NV_SEP_CACHE_PARAMETER_0 = NV_SEP_CACHE_PARAMETER_0(),
    public var WriteCacheType: UByte = 0u,
    public var WriteCacheTypeEffective: UByte = 0u,
    public var ParameterReserve1: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NV_SEP_CACHE_PARAMETER) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.Flags != other.Flags) return false
        if (this.WriteCacheType != other.WriteCacheType) return false
        if (this.WriteCacheTypeEffective != other.WriteCacheTypeEffective) return false
        if (!this.ParameterReserve1.contentEquals(other.ParameterReserve1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.WriteCacheType.hashCode()
        result = 31 * result + this.WriteCacheTypeEffective.hashCode()
        result = 31 * result + this.ParameterReserve1.contentHashCode()
        return result
    }
}

public data class NV_SEP_CACHE_PARAMETER_0(public var CacheFlags: NV_SEP_CACHE_PARAMETER_0_0 = NV_SEP_CACHE_PARAMETER_0_0(), public var CacheFlagsSet: UByte = 0u)

public data class NV_SEP_CACHE_PARAMETER_0_0(public var _bitfield: UByte = 0u)

public data class PERSISTENT_ISCSI_LOGIN_INFOA(
    public var TargetName: ByteArray = ByteArray(224),
    public var IsInformationalSession: Boolean = false,
    public var InitiatorInstance: ByteArray = ByteArray(256),
    public var InitiatorPortNumber: UInt = 0u,
    public var TargetPortal: ISCSI_TARGET_PORTALA = ISCSI_TARGET_PORTALA(),
    public var SecurityFlags: ULong = 0uL,
    public var Mappings: Long = 0L,
    public var LoginOptions: ISCSI_LOGIN_OPTIONS = ISCSI_LOGIN_OPTIONS(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PERSISTENT_ISCSI_LOGIN_INFOA) return false
        if (!this.TargetName.contentEquals(other.TargetName)) return false
        if (this.IsInformationalSession != other.IsInformationalSession) return false
        if (!this.InitiatorInstance.contentEquals(other.InitiatorInstance)) return false
        if (this.InitiatorPortNumber != other.InitiatorPortNumber) return false
        if (this.TargetPortal != other.TargetPortal) return false
        if (this.SecurityFlags != other.SecurityFlags) return false
        if (this.Mappings != other.Mappings) return false
        if (this.LoginOptions != other.LoginOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.TargetName.contentHashCode()
        result = 31 * result + this.IsInformationalSession.hashCode()
        result = 31 * result + this.InitiatorInstance.contentHashCode()
        result = 31 * result + this.InitiatorPortNumber.hashCode()
        result = 31 * result + this.TargetPortal.hashCode()
        result = 31 * result + this.SecurityFlags.hashCode()
        result = 31 * result + this.Mappings.hashCode()
        result = 31 * result + this.LoginOptions.hashCode()
        return result
    }
}

public data class PERSISTENT_ISCSI_LOGIN_INFOW(
    public var TargetName: UShortArray = UShortArray(224),
    public var IsInformationalSession: Boolean = false,
    public var InitiatorInstance: UShortArray = UShortArray(256),
    public var InitiatorPortNumber: UInt = 0u,
    public var TargetPortal: ISCSI_TARGET_PORTALW = ISCSI_TARGET_PORTALW(),
    public var SecurityFlags: ULong = 0uL,
    public var Mappings: Long = 0L,
    public var LoginOptions: ISCSI_LOGIN_OPTIONS = ISCSI_LOGIN_OPTIONS(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PERSISTENT_ISCSI_LOGIN_INFOW) return false
        if (!this.TargetName.contentEquals(other.TargetName)) return false
        if (this.IsInformationalSession != other.IsInformationalSession) return false
        if (!this.InitiatorInstance.contentEquals(other.InitiatorInstance)) return false
        if (this.InitiatorPortNumber != other.InitiatorPortNumber) return false
        if (this.TargetPortal != other.TargetPortal) return false
        if (this.SecurityFlags != other.SecurityFlags) return false
        if (this.Mappings != other.Mappings) return false
        if (this.LoginOptions != other.LoginOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.TargetName.contentHashCode()
        result = 31 * result + this.IsInformationalSession.hashCode()
        result = 31 * result + this.InitiatorInstance.contentHashCode()
        result = 31 * result + this.InitiatorPortNumber.hashCode()
        result = 31 * result + this.TargetPortal.hashCode()
        result = 31 * result + this.SecurityFlags.hashCode()
        result = 31 * result + this.Mappings.hashCode()
        result = 31 * result + this.LoginOptions.hashCode()
        return result
    }
}

public data class SCSI_ADAPTER_BUS_INFO(public var NumberOfBuses: UByte = 0u, public var BusData: List<SCSI_BUS_DATA> = List(1) { SCSI_BUS_DATA() })

public data class SCSI_ADDRESS(
    public var Length: UInt = 0u,
    public var PortNumber: UByte = 0u,
    public var PathId: UByte = 0u,
    public var TargetId: UByte = 0u,
    public var Lun: UByte = 0u,
)

public data class SCSI_BUS_DATA(
    public var NumberOfLogicalUnits: UByte = 0u,
    public var InitiatorBusId: UByte = 0u,
    public var InquiryDataOffset: UInt = 0u,
)

public data class SCSI_INQUIRY_DATA(
    public var PathId: UByte = 0u,
    public var TargetId: UByte = 0u,
    public var Lun: UByte = 0u,
    public var DeviceClaimed: Boolean = false,
    public var InquiryDataLength: UInt = 0u,
    public var NextInquiryDataOffset: UInt = 0u,
    public var InquiryData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCSI_INQUIRY_DATA) return false
        if (this.PathId != other.PathId) return false
        if (this.TargetId != other.TargetId) return false
        if (this.Lun != other.Lun) return false
        if (this.DeviceClaimed != other.DeviceClaimed) return false
        if (this.InquiryDataLength != other.InquiryDataLength) return false
        if (this.NextInquiryDataOffset != other.NextInquiryDataOffset) return false
        if (!this.InquiryData.contentEquals(other.InquiryData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PathId.hashCode()
        result = 31 * result + this.TargetId.hashCode()
        result = 31 * result + this.Lun.hashCode()
        result = 31 * result + this.DeviceClaimed.hashCode()
        result = 31 * result + this.InquiryDataLength.hashCode()
        result = 31 * result + this.NextInquiryDataOffset.hashCode()
        result = 31 * result + this.InquiryData.contentHashCode()
        return result
    }
}

public data class SCSI_LUN_LIST(public var OSLUN: UInt = 0u, public var TargetLUN: ULong = 0uL)

public data class SCSI_PASS_THROUGH(
    public var Length: UShort = 0u,
    public var ScsiStatus: UByte = 0u,
    public var PathId: UByte = 0u,
    public var TargetId: UByte = 0u,
    public var Lun: UByte = 0u,
    public var CdbLength: UByte = 0u,
    public var SenseInfoLength: UByte = 0u,
    public var DataIn: UByte = 0u,
    public var DataTransferLength: UInt = 0u,
    public var TimeOutValue: UInt = 0u,
    public var DataBufferOffset: ULong = 0uL,
    public var SenseInfoOffset: UInt = 0u,
    public var Cdb: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCSI_PASS_THROUGH) return false
        if (this.Length != other.Length) return false
        if (this.ScsiStatus != other.ScsiStatus) return false
        if (this.PathId != other.PathId) return false
        if (this.TargetId != other.TargetId) return false
        if (this.Lun != other.Lun) return false
        if (this.CdbLength != other.CdbLength) return false
        if (this.SenseInfoLength != other.SenseInfoLength) return false
        if (this.DataIn != other.DataIn) return false
        if (this.DataTransferLength != other.DataTransferLength) return false
        if (this.TimeOutValue != other.TimeOutValue) return false
        if (this.DataBufferOffset != other.DataBufferOffset) return false
        if (this.SenseInfoOffset != other.SenseInfoOffset) return false
        if (!this.Cdb.contentEquals(other.Cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.ScsiStatus.hashCode()
        result = 31 * result + this.PathId.hashCode()
        result = 31 * result + this.TargetId.hashCode()
        result = 31 * result + this.Lun.hashCode()
        result = 31 * result + this.CdbLength.hashCode()
        result = 31 * result + this.SenseInfoLength.hashCode()
        result = 31 * result + this.DataIn.hashCode()
        result = 31 * result + this.DataTransferLength.hashCode()
        result = 31 * result + this.TimeOutValue.hashCode()
        result = 31 * result + this.DataBufferOffset.hashCode()
        result = 31 * result + this.SenseInfoOffset.hashCode()
        result = 31 * result + this.Cdb.contentHashCode()
        return result
    }
}

public data class SCSI_PASS_THROUGH32(
    public var Length: UShort = 0u,
    public var ScsiStatus: UByte = 0u,
    public var PathId: UByte = 0u,
    public var TargetId: UByte = 0u,
    public var Lun: UByte = 0u,
    public var CdbLength: UByte = 0u,
    public var SenseInfoLength: UByte = 0u,
    public var DataIn: UByte = 0u,
    public var DataTransferLength: UInt = 0u,
    public var TimeOutValue: UInt = 0u,
    public var DataBufferOffset: UInt = 0u,
    public var SenseInfoOffset: UInt = 0u,
    public var Cdb: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCSI_PASS_THROUGH32) return false
        if (this.Length != other.Length) return false
        if (this.ScsiStatus != other.ScsiStatus) return false
        if (this.PathId != other.PathId) return false
        if (this.TargetId != other.TargetId) return false
        if (this.Lun != other.Lun) return false
        if (this.CdbLength != other.CdbLength) return false
        if (this.SenseInfoLength != other.SenseInfoLength) return false
        if (this.DataIn != other.DataIn) return false
        if (this.DataTransferLength != other.DataTransferLength) return false
        if (this.TimeOutValue != other.TimeOutValue) return false
        if (this.DataBufferOffset != other.DataBufferOffset) return false
        if (this.SenseInfoOffset != other.SenseInfoOffset) return false
        if (!this.Cdb.contentEquals(other.Cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.ScsiStatus.hashCode()
        result = 31 * result + this.PathId.hashCode()
        result = 31 * result + this.TargetId.hashCode()
        result = 31 * result + this.Lun.hashCode()
        result = 31 * result + this.CdbLength.hashCode()
        result = 31 * result + this.SenseInfoLength.hashCode()
        result = 31 * result + this.DataIn.hashCode()
        result = 31 * result + this.DataTransferLength.hashCode()
        result = 31 * result + this.TimeOutValue.hashCode()
        result = 31 * result + this.DataBufferOffset.hashCode()
        result = 31 * result + this.SenseInfoOffset.hashCode()
        result = 31 * result + this.Cdb.contentHashCode()
        return result
    }
}

public data class SCSI_PASS_THROUGH32_EX(
    public var Version: UInt = 0u,
    public var Length: UInt = 0u,
    public var CdbLength: UInt = 0u,
    public var StorAddressLength: UInt = 0u,
    public var ScsiStatus: UByte = 0u,
    public var SenseInfoLength: UByte = 0u,
    public var DataDirection: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var TimeOutValue: UInt = 0u,
    public var StorAddressOffset: UInt = 0u,
    public var SenseInfoOffset: UInt = 0u,
    public var DataOutTransferLength: UInt = 0u,
    public var DataInTransferLength: UInt = 0u,
    public var DataOutBufferOffset: UInt = 0u,
    public var DataInBufferOffset: UInt = 0u,
    public var Cdb: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCSI_PASS_THROUGH32_EX) return false
        if (this.Version != other.Version) return false
        if (this.Length != other.Length) return false
        if (this.CdbLength != other.CdbLength) return false
        if (this.StorAddressLength != other.StorAddressLength) return false
        if (this.ScsiStatus != other.ScsiStatus) return false
        if (this.SenseInfoLength != other.SenseInfoLength) return false
        if (this.DataDirection != other.DataDirection) return false
        if (this.Reserved != other.Reserved) return false
        if (this.TimeOutValue != other.TimeOutValue) return false
        if (this.StorAddressOffset != other.StorAddressOffset) return false
        if (this.SenseInfoOffset != other.SenseInfoOffset) return false
        if (this.DataOutTransferLength != other.DataOutTransferLength) return false
        if (this.DataInTransferLength != other.DataInTransferLength) return false
        if (this.DataOutBufferOffset != other.DataOutBufferOffset) return false
        if (this.DataInBufferOffset != other.DataInBufferOffset) return false
        if (!this.Cdb.contentEquals(other.Cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.CdbLength.hashCode()
        result = 31 * result + this.StorAddressLength.hashCode()
        result = 31 * result + this.ScsiStatus.hashCode()
        result = 31 * result + this.SenseInfoLength.hashCode()
        result = 31 * result + this.DataDirection.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.TimeOutValue.hashCode()
        result = 31 * result + this.StorAddressOffset.hashCode()
        result = 31 * result + this.SenseInfoOffset.hashCode()
        result = 31 * result + this.DataOutTransferLength.hashCode()
        result = 31 * result + this.DataInTransferLength.hashCode()
        result = 31 * result + this.DataOutBufferOffset.hashCode()
        result = 31 * result + this.DataInBufferOffset.hashCode()
        result = 31 * result + this.Cdb.contentHashCode()
        return result
    }
}

public data class SCSI_PASS_THROUGH_DIRECT(
    public var Length: UShort = 0u,
    public var ScsiStatus: UByte = 0u,
    public var PathId: UByte = 0u,
    public var TargetId: UByte = 0u,
    public var Lun: UByte = 0u,
    public var CdbLength: UByte = 0u,
    public var SenseInfoLength: UByte = 0u,
    public var DataIn: UByte = 0u,
    public var DataTransferLength: UInt = 0u,
    public var TimeOutValue: UInt = 0u,
    public var DataBuffer: Long = 0L,
    public var SenseInfoOffset: UInt = 0u,
    public var Cdb: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCSI_PASS_THROUGH_DIRECT) return false
        if (this.Length != other.Length) return false
        if (this.ScsiStatus != other.ScsiStatus) return false
        if (this.PathId != other.PathId) return false
        if (this.TargetId != other.TargetId) return false
        if (this.Lun != other.Lun) return false
        if (this.CdbLength != other.CdbLength) return false
        if (this.SenseInfoLength != other.SenseInfoLength) return false
        if (this.DataIn != other.DataIn) return false
        if (this.DataTransferLength != other.DataTransferLength) return false
        if (this.TimeOutValue != other.TimeOutValue) return false
        if (this.DataBuffer != other.DataBuffer) return false
        if (this.SenseInfoOffset != other.SenseInfoOffset) return false
        if (!this.Cdb.contentEquals(other.Cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.ScsiStatus.hashCode()
        result = 31 * result + this.PathId.hashCode()
        result = 31 * result + this.TargetId.hashCode()
        result = 31 * result + this.Lun.hashCode()
        result = 31 * result + this.CdbLength.hashCode()
        result = 31 * result + this.SenseInfoLength.hashCode()
        result = 31 * result + this.DataIn.hashCode()
        result = 31 * result + this.DataTransferLength.hashCode()
        result = 31 * result + this.TimeOutValue.hashCode()
        result = 31 * result + this.DataBuffer.hashCode()
        result = 31 * result + this.SenseInfoOffset.hashCode()
        result = 31 * result + this.Cdb.contentHashCode()
        return result
    }
}

public data class SCSI_PASS_THROUGH_DIRECT32(
    public var Length: UShort = 0u,
    public var ScsiStatus: UByte = 0u,
    public var PathId: UByte = 0u,
    public var TargetId: UByte = 0u,
    public var Lun: UByte = 0u,
    public var CdbLength: UByte = 0u,
    public var SenseInfoLength: UByte = 0u,
    public var DataIn: UByte = 0u,
    public var DataTransferLength: UInt = 0u,
    public var TimeOutValue: UInt = 0u,
    public var DataBuffer: Long = 0L,
    public var SenseInfoOffset: UInt = 0u,
    public var Cdb: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCSI_PASS_THROUGH_DIRECT32) return false
        if (this.Length != other.Length) return false
        if (this.ScsiStatus != other.ScsiStatus) return false
        if (this.PathId != other.PathId) return false
        if (this.TargetId != other.TargetId) return false
        if (this.Lun != other.Lun) return false
        if (this.CdbLength != other.CdbLength) return false
        if (this.SenseInfoLength != other.SenseInfoLength) return false
        if (this.DataIn != other.DataIn) return false
        if (this.DataTransferLength != other.DataTransferLength) return false
        if (this.TimeOutValue != other.TimeOutValue) return false
        if (this.DataBuffer != other.DataBuffer) return false
        if (this.SenseInfoOffset != other.SenseInfoOffset) return false
        if (!this.Cdb.contentEquals(other.Cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.ScsiStatus.hashCode()
        result = 31 * result + this.PathId.hashCode()
        result = 31 * result + this.TargetId.hashCode()
        result = 31 * result + this.Lun.hashCode()
        result = 31 * result + this.CdbLength.hashCode()
        result = 31 * result + this.SenseInfoLength.hashCode()
        result = 31 * result + this.DataIn.hashCode()
        result = 31 * result + this.DataTransferLength.hashCode()
        result = 31 * result + this.TimeOutValue.hashCode()
        result = 31 * result + this.DataBuffer.hashCode()
        result = 31 * result + this.SenseInfoOffset.hashCode()
        result = 31 * result + this.Cdb.contentHashCode()
        return result
    }
}

public data class SCSI_PASS_THROUGH_DIRECT32_EX(
    public var Version: UInt = 0u,
    public var Length: UInt = 0u,
    public var CdbLength: UInt = 0u,
    public var StorAddressLength: UInt = 0u,
    public var ScsiStatus: UByte = 0u,
    public var SenseInfoLength: UByte = 0u,
    public var DataDirection: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var TimeOutValue: UInt = 0u,
    public var StorAddressOffset: UInt = 0u,
    public var SenseInfoOffset: UInt = 0u,
    public var DataOutTransferLength: UInt = 0u,
    public var DataInTransferLength: UInt = 0u,
    public var DataOutBuffer: Long = 0L,
    public var DataInBuffer: Long = 0L,
    public var Cdb: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCSI_PASS_THROUGH_DIRECT32_EX) return false
        if (this.Version != other.Version) return false
        if (this.Length != other.Length) return false
        if (this.CdbLength != other.CdbLength) return false
        if (this.StorAddressLength != other.StorAddressLength) return false
        if (this.ScsiStatus != other.ScsiStatus) return false
        if (this.SenseInfoLength != other.SenseInfoLength) return false
        if (this.DataDirection != other.DataDirection) return false
        if (this.Reserved != other.Reserved) return false
        if (this.TimeOutValue != other.TimeOutValue) return false
        if (this.StorAddressOffset != other.StorAddressOffset) return false
        if (this.SenseInfoOffset != other.SenseInfoOffset) return false
        if (this.DataOutTransferLength != other.DataOutTransferLength) return false
        if (this.DataInTransferLength != other.DataInTransferLength) return false
        if (this.DataOutBuffer != other.DataOutBuffer) return false
        if (this.DataInBuffer != other.DataInBuffer) return false
        if (!this.Cdb.contentEquals(other.Cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.CdbLength.hashCode()
        result = 31 * result + this.StorAddressLength.hashCode()
        result = 31 * result + this.ScsiStatus.hashCode()
        result = 31 * result + this.SenseInfoLength.hashCode()
        result = 31 * result + this.DataDirection.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.TimeOutValue.hashCode()
        result = 31 * result + this.StorAddressOffset.hashCode()
        result = 31 * result + this.SenseInfoOffset.hashCode()
        result = 31 * result + this.DataOutTransferLength.hashCode()
        result = 31 * result + this.DataInTransferLength.hashCode()
        result = 31 * result + this.DataOutBuffer.hashCode()
        result = 31 * result + this.DataInBuffer.hashCode()
        result = 31 * result + this.Cdb.contentHashCode()
        return result
    }
}

public data class SCSI_PASS_THROUGH_DIRECT_EX(
    public var Version: UInt = 0u,
    public var Length: UInt = 0u,
    public var CdbLength: UInt = 0u,
    public var StorAddressLength: UInt = 0u,
    public var ScsiStatus: UByte = 0u,
    public var SenseInfoLength: UByte = 0u,
    public var DataDirection: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var TimeOutValue: UInt = 0u,
    public var StorAddressOffset: UInt = 0u,
    public var SenseInfoOffset: UInt = 0u,
    public var DataOutTransferLength: UInt = 0u,
    public var DataInTransferLength: UInt = 0u,
    public var DataOutBuffer: Long = 0L,
    public var DataInBuffer: Long = 0L,
    public var Cdb: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCSI_PASS_THROUGH_DIRECT_EX) return false
        if (this.Version != other.Version) return false
        if (this.Length != other.Length) return false
        if (this.CdbLength != other.CdbLength) return false
        if (this.StorAddressLength != other.StorAddressLength) return false
        if (this.ScsiStatus != other.ScsiStatus) return false
        if (this.SenseInfoLength != other.SenseInfoLength) return false
        if (this.DataDirection != other.DataDirection) return false
        if (this.Reserved != other.Reserved) return false
        if (this.TimeOutValue != other.TimeOutValue) return false
        if (this.StorAddressOffset != other.StorAddressOffset) return false
        if (this.SenseInfoOffset != other.SenseInfoOffset) return false
        if (this.DataOutTransferLength != other.DataOutTransferLength) return false
        if (this.DataInTransferLength != other.DataInTransferLength) return false
        if (this.DataOutBuffer != other.DataOutBuffer) return false
        if (this.DataInBuffer != other.DataInBuffer) return false
        if (!this.Cdb.contentEquals(other.Cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.CdbLength.hashCode()
        result = 31 * result + this.StorAddressLength.hashCode()
        result = 31 * result + this.ScsiStatus.hashCode()
        result = 31 * result + this.SenseInfoLength.hashCode()
        result = 31 * result + this.DataDirection.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.TimeOutValue.hashCode()
        result = 31 * result + this.StorAddressOffset.hashCode()
        result = 31 * result + this.SenseInfoOffset.hashCode()
        result = 31 * result + this.DataOutTransferLength.hashCode()
        result = 31 * result + this.DataInTransferLength.hashCode()
        result = 31 * result + this.DataOutBuffer.hashCode()
        result = 31 * result + this.DataInBuffer.hashCode()
        result = 31 * result + this.Cdb.contentHashCode()
        return result
    }
}

public data class SCSI_PASS_THROUGH_EX(
    public var Version: UInt = 0u,
    public var Length: UInt = 0u,
    public var CdbLength: UInt = 0u,
    public var StorAddressLength: UInt = 0u,
    public var ScsiStatus: UByte = 0u,
    public var SenseInfoLength: UByte = 0u,
    public var DataDirection: UByte = 0u,
    public var Reserved: UByte = 0u,
    public var TimeOutValue: UInt = 0u,
    public var StorAddressOffset: UInt = 0u,
    public var SenseInfoOffset: UInt = 0u,
    public var DataOutTransferLength: UInt = 0u,
    public var DataInTransferLength: UInt = 0u,
    public var DataOutBufferOffset: ULong = 0uL,
    public var DataInBufferOffset: ULong = 0uL,
    public var Cdb: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCSI_PASS_THROUGH_EX) return false
        if (this.Version != other.Version) return false
        if (this.Length != other.Length) return false
        if (this.CdbLength != other.CdbLength) return false
        if (this.StorAddressLength != other.StorAddressLength) return false
        if (this.ScsiStatus != other.ScsiStatus) return false
        if (this.SenseInfoLength != other.SenseInfoLength) return false
        if (this.DataDirection != other.DataDirection) return false
        if (this.Reserved != other.Reserved) return false
        if (this.TimeOutValue != other.TimeOutValue) return false
        if (this.StorAddressOffset != other.StorAddressOffset) return false
        if (this.SenseInfoOffset != other.SenseInfoOffset) return false
        if (this.DataOutTransferLength != other.DataOutTransferLength) return false
        if (this.DataInTransferLength != other.DataInTransferLength) return false
        if (this.DataOutBufferOffset != other.DataOutBufferOffset) return false
        if (this.DataInBufferOffset != other.DataInBufferOffset) return false
        if (!this.Cdb.contentEquals(other.Cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.CdbLength.hashCode()
        result = 31 * result + this.StorAddressLength.hashCode()
        result = 31 * result + this.ScsiStatus.hashCode()
        result = 31 * result + this.SenseInfoLength.hashCode()
        result = 31 * result + this.DataDirection.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.TimeOutValue.hashCode()
        result = 31 * result + this.StorAddressOffset.hashCode()
        result = 31 * result + this.SenseInfoOffset.hashCode()
        result = 31 * result + this.DataOutTransferLength.hashCode()
        result = 31 * result + this.DataInTransferLength.hashCode()
        result = 31 * result + this.DataOutBufferOffset.hashCode()
        result = 31 * result + this.DataInBufferOffset.hashCode()
        result = 31 * result + this.Cdb.contentHashCode()
        return result
    }
}

public data class SRB_IO_CONTROL(
    public var HeaderLength: UInt = 0u,
    public var Signature: UByteArray = UByteArray(8),
    public var Timeout: UInt = 0u,
    public var ControlCode: UInt = 0u,
    public var ReturnCode: UInt = 0u,
    public var Length: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SRB_IO_CONTROL) return false
        if (this.HeaderLength != other.HeaderLength) return false
        if (!this.Signature.contentEquals(other.Signature)) return false
        if (this.Timeout != other.Timeout) return false
        if (this.ControlCode != other.ControlCode) return false
        if (this.ReturnCode != other.ReturnCode) return false
        if (this.Length != other.Length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.HeaderLength.hashCode()
        result = 31 * result + this.Signature.contentHashCode()
        result = 31 * result + this.Timeout.hashCode()
        result = 31 * result + this.ControlCode.hashCode()
        result = 31 * result + this.ReturnCode.hashCode()
        result = 31 * result + this.Length.hashCode()
        return result
    }
}

public data class STORAGE_DIAGNOSTIC_MP_REQUEST(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var TargetType: MP_STORAGE_DIAGNOSTIC_TARGET_TYPE = 0,
    public var Level: MP_STORAGE_DIAGNOSTIC_LEVEL = 0,
    public var ProviderId: GUID = GUID(),
    public var BufferSize: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var DataBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_DIAGNOSTIC_MP_REQUEST) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.TargetType != other.TargetType) return false
        if (this.Level != other.Level) return false
        if (this.ProviderId != other.ProviderId) return false
        if (this.BufferSize != other.BufferSize) return false
        if (this.Reserved != other.Reserved) return false
        if (!this.DataBuffer.contentEquals(other.DataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.TargetType.hashCode()
        result = 31 * result + this.Level.hashCode()
        result = 31 * result + this.ProviderId.hashCode()
        result = 31 * result + this.BufferSize.hashCode()
        result = 31 * result + this.Reserved.hashCode()
        result = 31 * result + this.DataBuffer.contentHashCode()
        return result
    }
}

public data class STORAGE_ENDURANCE_DATA_DESCRIPTOR(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var EnduranceInfo: STORAGE_ENDURANCE_INFO = STORAGE_ENDURANCE_INFO(),
)

public data class STORAGE_ENDURANCE_INFO(
    public var ValidFields: UInt = 0u,
    public var GroupId: UInt = 0u,
    public var Flags: STORAGE_ENDURANCE_INFO_0 = STORAGE_ENDURANCE_INFO_0(),
    public var LifePercentage: UInt = 0u,
    public var BytesReadCount: UByteArray = UByteArray(16),
    public var ByteWriteCount: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_ENDURANCE_INFO) return false
        if (this.ValidFields != other.ValidFields) return false
        if (this.GroupId != other.GroupId) return false
        if (this.Flags != other.Flags) return false
        if (this.LifePercentage != other.LifePercentage) return false
        if (!this.BytesReadCount.contentEquals(other.BytesReadCount)) return false
        if (!this.ByteWriteCount.contentEquals(other.ByteWriteCount)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ValidFields.hashCode()
        result = 31 * result + this.GroupId.hashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.LifePercentage.hashCode()
        result = 31 * result + this.BytesReadCount.contentHashCode()
        result = 31 * result + this.ByteWriteCount.contentHashCode()
        return result
    }
}

public data class STORAGE_ENDURANCE_INFO_0(public var _bitfield: UInt = 0u)

public data class STORAGE_FIRMWARE_ACTIVATE(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var SlotToActivate: UByte = 0u,
    public var Reserved0: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_FIRMWARE_ACTIVATE) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.SlotToActivate != other.SlotToActivate) return false
        if (!this.Reserved0.contentEquals(other.Reserved0)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.SlotToActivate.hashCode()
        result = 31 * result + this.Reserved0.contentHashCode()
        return result
    }
}

public data class STORAGE_FIRMWARE_DOWNLOAD(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Offset: ULong = 0uL,
    public var BufferSize: ULong = 0uL,
    public var ImageBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_FIRMWARE_DOWNLOAD) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.Offset != other.Offset) return false
        if (this.BufferSize != other.BufferSize) return false
        if (!this.ImageBuffer.contentEquals(other.ImageBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.Offset.hashCode()
        result = 31 * result + this.BufferSize.hashCode()
        result = 31 * result + this.ImageBuffer.contentHashCode()
        return result
    }
}

public data class STORAGE_FIRMWARE_DOWNLOAD_V2(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var Offset: ULong = 0uL,
    public var BufferSize: ULong = 0uL,
    public var Slot: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(3),
    public var ImageSize: UInt = 0u,
    public var ImageBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_FIRMWARE_DOWNLOAD_V2) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.Offset != other.Offset) return false
        if (this.BufferSize != other.BufferSize) return false
        if (this.Slot != other.Slot) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.ImageSize != other.ImageSize) return false
        if (!this.ImageBuffer.contentEquals(other.ImageBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.Offset.hashCode()
        result = 31 * result + this.BufferSize.hashCode()
        result = 31 * result + this.Slot.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.ImageSize.hashCode()
        result = 31 * result + this.ImageBuffer.contentHashCode()
        return result
    }
}

public data class STORAGE_FIRMWARE_INFO(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var UpgradeSupport: Boolean = false,
    public var SlotCount: UByte = 0u,
    public var ActiveSlot: UByte = 0u,
    public var PendingActivateSlot: UByte = 0u,
    public var Reserved: UInt = 0u,
    public var Slot: List<STORAGE_FIRMWARE_SLOT_INFO> = List(1) { STORAGE_FIRMWARE_SLOT_INFO() },
)

public data class STORAGE_FIRMWARE_INFO_V2(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var UpgradeSupport: Boolean = false,
    public var SlotCount: UByte = 0u,
    public var ActiveSlot: UByte = 0u,
    public var PendingActivateSlot: UByte = 0u,
    public var FirmwareShared: Boolean = false,
    public var Reserved: UByteArray = UByteArray(3),
    public var ImagePayloadAlignment: UInt = 0u,
    public var ImagePayloadMaxSize: UInt = 0u,
    public var Slot: List<STORAGE_FIRMWARE_SLOT_INFO_V2> = List(1) { STORAGE_FIRMWARE_SLOT_INFO_V2() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_FIRMWARE_INFO_V2) return false
        if (this.Version != other.Version) return false
        if (this.Size != other.Size) return false
        if (this.UpgradeSupport != other.UpgradeSupport) return false
        if (this.SlotCount != other.SlotCount) return false
        if (this.ActiveSlot != other.ActiveSlot) return false
        if (this.PendingActivateSlot != other.PendingActivateSlot) return false
        if (this.FirmwareShared != other.FirmwareShared) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.ImagePayloadAlignment != other.ImagePayloadAlignment) return false
        if (this.ImagePayloadMaxSize != other.ImagePayloadMaxSize) return false
        if (this.Slot != other.Slot) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Size.hashCode()
        result = 31 * result + this.UpgradeSupport.hashCode()
        result = 31 * result + this.SlotCount.hashCode()
        result = 31 * result + this.ActiveSlot.hashCode()
        result = 31 * result + this.PendingActivateSlot.hashCode()
        result = 31 * result + this.FirmwareShared.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.ImagePayloadAlignment.hashCode()
        result = 31 * result + this.ImagePayloadMaxSize.hashCode()
        result = 31 * result + this.Slot.hashCode()
        return result
    }
}

public data class STORAGE_FIRMWARE_SLOT_INFO(
    public var SlotNumber: UByte = 0u,
    public var ReadOnly: Boolean = false,
    public var Reserved: UByteArray = UByteArray(6),
    public var Revision: STORAGE_FIRMWARE_SLOT_INFO_0 = STORAGE_FIRMWARE_SLOT_INFO_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_FIRMWARE_SLOT_INFO) return false
        if (this.SlotNumber != other.SlotNumber) return false
        if (this.ReadOnly != other.ReadOnly) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.Revision != other.Revision) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SlotNumber.hashCode()
        result = 31 * result + this.ReadOnly.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Revision.hashCode()
        return result
    }
}

public data class STORAGE_FIRMWARE_SLOT_INFO_0(public var Info: UByteArray = UByteArray(8), public var AsUlonglong: ULong = 0uL) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_FIRMWARE_SLOT_INFO_0) return false
        if (!this.Info.contentEquals(other.Info)) return false
        if (this.AsUlonglong != other.AsUlonglong) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Info.contentHashCode()
        result = 31 * result + this.AsUlonglong.hashCode()
        return result
    }
}

public data class STORAGE_FIRMWARE_SLOT_INFO_V2(
    public var SlotNumber: UByte = 0u,
    public var ReadOnly: Boolean = false,
    public var Reserved: UByteArray = UByteArray(6),
    public var Revision: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STORAGE_FIRMWARE_SLOT_INFO_V2) return false
        if (this.SlotNumber != other.SlotNumber) return false
        if (this.ReadOnly != other.ReadOnly) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (!this.Revision.contentEquals(other.Revision)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SlotNumber.hashCode()
        result = 31 * result + this.ReadOnly.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Revision.contentHashCode()
        return result
    }
}
