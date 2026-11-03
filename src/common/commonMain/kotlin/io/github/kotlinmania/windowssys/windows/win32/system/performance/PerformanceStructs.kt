@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.performance

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class PDH_BROWSE_DLG_CONFIG_A(
    public var _bitfield: UInt = 0u,
    public var hWndOwner: Foundation.HWND = Foundation.HWND(),
    public var szDataSource: PSTR = 0L,
    public var szReturnPathBuffer: PSTR = 0L,
    public var cchReturnPathLength: UInt = 0u,
    public var pCallBack: CounterPathCallBack = null,
    public var dwCallBackArg: ULong = 0uL,
    public var CallBackStatus: Int = 0,
    public var dwDefaultDetailLevel: PERF_DETAIL = 0u,
    public var szDialogBoxCaption: PSTR = 0L,
)

public data class PDH_BROWSE_DLG_CONFIG_HA(
    public var _bitfield: UInt = 0u,
    public var hWndOwner: Foundation.HWND = Foundation.HWND(),
    public var hDataSource: PDH_HLOG = 0L,
    public var szReturnPathBuffer: PSTR = 0L,
    public var cchReturnPathLength: UInt = 0u,
    public var pCallBack: CounterPathCallBack = null,
    public var dwCallBackArg: ULong = 0uL,
    public var CallBackStatus: Int = 0,
    public var dwDefaultDetailLevel: PERF_DETAIL = 0u,
    public var szDialogBoxCaption: PSTR = 0L,
)

public data class PDH_BROWSE_DLG_CONFIG_HW(
    public var _bitfield: UInt = 0u,
    public var hWndOwner: Foundation.HWND = Foundation.HWND(),
    public var hDataSource: PDH_HLOG = 0L,
    public var szReturnPathBuffer: PWSTR = 0L,
    public var cchReturnPathLength: UInt = 0u,
    public var pCallBack: CounterPathCallBack = null,
    public var dwCallBackArg: ULong = 0uL,
    public var CallBackStatus: Int = 0,
    public var dwDefaultDetailLevel: PERF_DETAIL = 0u,
    public var szDialogBoxCaption: PWSTR = 0L,
)

public data class PDH_BROWSE_DLG_CONFIG_W(
    public var _bitfield: UInt = 0u,
    public var hWndOwner: Foundation.HWND = Foundation.HWND(),
    public var szDataSource: PWSTR = 0L,
    public var szReturnPathBuffer: PWSTR = 0L,
    public var cchReturnPathLength: UInt = 0u,
    public var pCallBack: CounterPathCallBack = null,
    public var dwCallBackArg: ULong = 0uL,
    public var CallBackStatus: Int = 0,
    public var dwDefaultDetailLevel: PERF_DETAIL = 0u,
    public var szDialogBoxCaption: PWSTR = 0L,
)

public data class PDH_COUNTER_INFO_A(
    public var dwLength: UInt = 0u,
    public var dwType: UInt = 0u,
    public var CVersion: UInt = 0u,
    public var CStatus: UInt = 0u,
    public var lScale: Int = 0,
    public var lDefaultScale: Int = 0,
    public var dwUserData: ULong = 0uL,
    public var dwQueryUserData: ULong = 0uL,
    public var szFullPath: PSTR = 0L,
    public var Anonymous: PDH_COUNTER_INFO_A_0 = PDH_COUNTER_INFO_A_0(),
    public var szExplainText: PSTR = 0L,
    public var DataBuffer: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PDH_COUNTER_INFO_A) return false
        if (this.dwLength != other.dwLength) return false
        if (this.dwType != other.dwType) return false
        if (this.CVersion != other.CVersion) return false
        if (this.CStatus != other.CStatus) return false
        if (this.lScale != other.lScale) return false
        if (this.lDefaultScale != other.lDefaultScale) return false
        if (this.dwUserData != other.dwUserData) return false
        if (this.dwQueryUserData != other.dwQueryUserData) return false
        if (this.szFullPath != other.szFullPath) return false
        if (this.Anonymous != other.Anonymous) return false
        if (this.szExplainText != other.szExplainText) return false
        if (!this.DataBuffer.contentEquals(other.DataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLength.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.CVersion.hashCode()
        result = 31 * result + this.CStatus.hashCode()
        result = 31 * result + this.lScale.hashCode()
        result = 31 * result + this.lDefaultScale.hashCode()
        result = 31 * result + this.dwUserData.hashCode()
        result = 31 * result + this.dwQueryUserData.hashCode()
        result = 31 * result + this.szFullPath.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.szExplainText.hashCode()
        result = 31 * result + this.DataBuffer.contentHashCode()
        return result
    }
}

public data class PDH_COUNTER_INFO_A_0(
    public var DataItemPath: PDH_DATA_ITEM_PATH_ELEMENTS_A = PDH_DATA_ITEM_PATH_ELEMENTS_A(),
    public var CounterPath: PDH_COUNTER_PATH_ELEMENTS_A = PDH_COUNTER_PATH_ELEMENTS_A(),
    public var Anonymous: PDH_COUNTER_INFO_A_0_0 = PDH_COUNTER_INFO_A_0_0(),
)

public data class PDH_COUNTER_INFO_A_0_0(
    public var szMachineName: PSTR = 0L,
    public var szObjectName: PSTR = 0L,
    public var szInstanceName: PSTR = 0L,
    public var szParentInstance: PSTR = 0L,
    public var dwInstanceIndex: UInt = 0u,
    public var szCounterName: PSTR = 0L,
)

public data class PDH_COUNTER_INFO_W(
    public var dwLength: UInt = 0u,
    public var dwType: UInt = 0u,
    public var CVersion: UInt = 0u,
    public var CStatus: UInt = 0u,
    public var lScale: Int = 0,
    public var lDefaultScale: Int = 0,
    public var dwUserData: ULong = 0uL,
    public var dwQueryUserData: ULong = 0uL,
    public var szFullPath: PWSTR = 0L,
    public var Anonymous: PDH_COUNTER_INFO_W_0 = PDH_COUNTER_INFO_W_0(),
    public var szExplainText: PWSTR = 0L,
    public var DataBuffer: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PDH_COUNTER_INFO_W) return false
        if (this.dwLength != other.dwLength) return false
        if (this.dwType != other.dwType) return false
        if (this.CVersion != other.CVersion) return false
        if (this.CStatus != other.CStatus) return false
        if (this.lScale != other.lScale) return false
        if (this.lDefaultScale != other.lDefaultScale) return false
        if (this.dwUserData != other.dwUserData) return false
        if (this.dwQueryUserData != other.dwQueryUserData) return false
        if (this.szFullPath != other.szFullPath) return false
        if (this.Anonymous != other.Anonymous) return false
        if (this.szExplainText != other.szExplainText) return false
        if (!this.DataBuffer.contentEquals(other.DataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLength.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.CVersion.hashCode()
        result = 31 * result + this.CStatus.hashCode()
        result = 31 * result + this.lScale.hashCode()
        result = 31 * result + this.lDefaultScale.hashCode()
        result = 31 * result + this.dwUserData.hashCode()
        result = 31 * result + this.dwQueryUserData.hashCode()
        result = 31 * result + this.szFullPath.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.szExplainText.hashCode()
        result = 31 * result + this.DataBuffer.contentHashCode()
        return result
    }
}

public data class PDH_COUNTER_INFO_W_0(
    public var DataItemPath: PDH_DATA_ITEM_PATH_ELEMENTS_W = PDH_DATA_ITEM_PATH_ELEMENTS_W(),
    public var CounterPath: PDH_COUNTER_PATH_ELEMENTS_W = PDH_COUNTER_PATH_ELEMENTS_W(),
    public var Anonymous: PDH_COUNTER_INFO_W_0_0 = PDH_COUNTER_INFO_W_0_0(),
)

public data class PDH_COUNTER_INFO_W_0_0(
    public var szMachineName: PWSTR = 0L,
    public var szObjectName: PWSTR = 0L,
    public var szInstanceName: PWSTR = 0L,
    public var szParentInstance: PWSTR = 0L,
    public var dwInstanceIndex: UInt = 0u,
    public var szCounterName: PWSTR = 0L,
)

public data class PDH_COUNTER_PATH_ELEMENTS_A(
    public var szMachineName: PSTR = 0L,
    public var szObjectName: PSTR = 0L,
    public var szInstanceName: PSTR = 0L,
    public var szParentInstance: PSTR = 0L,
    public var dwInstanceIndex: UInt = 0u,
    public var szCounterName: PSTR = 0L,
)

public data class PDH_COUNTER_PATH_ELEMENTS_W(
    public var szMachineName: PWSTR = 0L,
    public var szObjectName: PWSTR = 0L,
    public var szInstanceName: PWSTR = 0L,
    public var szParentInstance: PWSTR = 0L,
    public var dwInstanceIndex: UInt = 0u,
    public var szCounterName: PWSTR = 0L,
)

public data class PDH_DATA_ITEM_PATH_ELEMENTS_A(
    public var szMachineName: PSTR = 0L,
    public var ObjectGUID: GUID = GUID(),
    public var dwItemId: UInt = 0u,
    public var szInstanceName: PSTR = 0L,
)

public data class PDH_DATA_ITEM_PATH_ELEMENTS_W(
    public var szMachineName: PWSTR = 0L,
    public var ObjectGUID: GUID = GUID(),
    public var dwItemId: UInt = 0u,
    public var szInstanceName: PWSTR = 0L,
)

public data class PDH_FMT_COUNTERVALUE(public var CStatus: UInt = 0u, public var Anonymous: PDH_FMT_COUNTERVALUE_0 = PDH_FMT_COUNTERVALUE_0())

public data class PDH_FMT_COUNTERVALUE_0(
    public var longValue: Int = 0,
    public var doubleValue: Double = 0.0,
    public var largeValue: Long = 0L,
    public var AnsiStringValue: PCSTR = 0L,
    public var WideStringValue: PCWSTR = 0L,
)

public data class PDH_FMT_COUNTERVALUE_ITEM_A(public var szName: PSTR = 0L, public var FmtValue: PDH_FMT_COUNTERVALUE = PDH_FMT_COUNTERVALUE())

public data class PDH_FMT_COUNTERVALUE_ITEM_W(public var szName: PWSTR = 0L, public var FmtValue: PDH_FMT_COUNTERVALUE = PDH_FMT_COUNTERVALUE())

public data class PDH_LOG_SERVICE_QUERY_INFO_A(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwLogQuota: UInt = 0u,
    public var szLogFileCaption: PSTR = 0L,
    public var szDefaultDir: PSTR = 0L,
    public var szBaseFileName: PSTR = 0L,
    public var dwFileType: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var Anonymous: PDH_LOG_SERVICE_QUERY_INFO_A_0 = PDH_LOG_SERVICE_QUERY_INFO_A_0(),
)

public data class PDH_LOG_SERVICE_QUERY_INFO_A_0(public var Anonymous1: PDH_LOG_SERVICE_QUERY_INFO_A_0_0 = PDH_LOG_SERVICE_QUERY_INFO_A_0_0(), public var Anonymous2: PDH_LOG_SERVICE_QUERY_INFO_A_0_1 = PDH_LOG_SERVICE_QUERY_INFO_A_0_1())

public data class PDH_LOG_SERVICE_QUERY_INFO_A_0_0(
    public var PdlAutoNameInterval: UInt = 0u,
    public var PdlAutoNameUnits: UInt = 0u,
    public var PdlCommandFilename: PSTR = 0L,
    public var PdlCounterList: PSTR = 0L,
    public var PdlAutoNameFormat: UInt = 0u,
    public var PdlSampleInterval: UInt = 0u,
    public var PdlLogStartTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var PdlLogEndTime: Foundation.FILETIME = Foundation.FILETIME(),
)

public data class PDH_LOG_SERVICE_QUERY_INFO_A_0_1(
    public var TlNumberOfBuffers: UInt = 0u,
    public var TlMinimumBuffers: UInt = 0u,
    public var TlMaximumBuffers: UInt = 0u,
    public var TlFreeBuffers: UInt = 0u,
    public var TlBufferSize: UInt = 0u,
    public var TlEventsLost: UInt = 0u,
    public var TlLoggerThreadId: UInt = 0u,
    public var TlBuffersWritten: UInt = 0u,
    public var TlLogHandle: UInt = 0u,
    public var TlLogFileName: PSTR = 0L,
)

public data class PDH_LOG_SERVICE_QUERY_INFO_W(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwLogQuota: UInt = 0u,
    public var szLogFileCaption: PWSTR = 0L,
    public var szDefaultDir: PWSTR = 0L,
    public var szBaseFileName: PWSTR = 0L,
    public var dwFileType: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var Anonymous: PDH_LOG_SERVICE_QUERY_INFO_W_0 = PDH_LOG_SERVICE_QUERY_INFO_W_0(),
)

public data class PDH_LOG_SERVICE_QUERY_INFO_W_0(public var Anonymous1: PDH_LOG_SERVICE_QUERY_INFO_W_0_0 = PDH_LOG_SERVICE_QUERY_INFO_W_0_0(), public var Anonymous2: PDH_LOG_SERVICE_QUERY_INFO_W_0_1 = PDH_LOG_SERVICE_QUERY_INFO_W_0_1())

public data class PDH_LOG_SERVICE_QUERY_INFO_W_0_0(
    public var PdlAutoNameInterval: UInt = 0u,
    public var PdlAutoNameUnits: UInt = 0u,
    public var PdlCommandFilename: PWSTR = 0L,
    public var PdlCounterList: PWSTR = 0L,
    public var PdlAutoNameFormat: UInt = 0u,
    public var PdlSampleInterval: UInt = 0u,
    public var PdlLogStartTime: Foundation.FILETIME = Foundation.FILETIME(),
    public var PdlLogEndTime: Foundation.FILETIME = Foundation.FILETIME(),
)

public data class PDH_LOG_SERVICE_QUERY_INFO_W_0_1(
    public var TlNumberOfBuffers: UInt = 0u,
    public var TlMinimumBuffers: UInt = 0u,
    public var TlMaximumBuffers: UInt = 0u,
    public var TlFreeBuffers: UInt = 0u,
    public var TlBufferSize: UInt = 0u,
    public var TlEventsLost: UInt = 0u,
    public var TlLoggerThreadId: UInt = 0u,
    public var TlBuffersWritten: UInt = 0u,
    public var TlLogHandle: UInt = 0u,
    public var TlLogFileName: PWSTR = 0L,
)

public data class PDH_RAW_COUNTER(
    public var CStatus: UInt = 0u,
    public var TimeStamp: Foundation.FILETIME = Foundation.FILETIME(),
    public var FirstValue: Long = 0L,
    public var SecondValue: Long = 0L,
    public var MultiCount: UInt = 0u,
)

public data class PDH_RAW_COUNTER_ITEM_A(public var szName: PSTR = 0L, public var RawValue: PDH_RAW_COUNTER = PDH_RAW_COUNTER())

public data class PDH_RAW_COUNTER_ITEM_W(public var szName: PWSTR = 0L, public var RawValue: PDH_RAW_COUNTER = PDH_RAW_COUNTER())

public data class PDH_RAW_LOG_RECORD(
    public var dwStructureSize: UInt = 0u,
    public var dwRecordType: PDH_LOG_TYPE = 0u,
    public var dwItems: UInt = 0u,
    public var RawBytes: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PDH_RAW_LOG_RECORD) return false
        if (this.dwStructureSize != other.dwStructureSize) return false
        if (this.dwRecordType != other.dwRecordType) return false
        if (this.dwItems != other.dwItems) return false
        if (!this.RawBytes.contentEquals(other.RawBytes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStructureSize.hashCode()
        result = 31 * result + this.dwRecordType.hashCode()
        result = 31 * result + this.dwItems.hashCode()
        result = 31 * result + this.RawBytes.contentHashCode()
        return result
    }
}

public data class PDH_STATISTICS(
    public var dwFormat: UInt = 0u,
    public var count: UInt = 0u,
    public var min: PDH_FMT_COUNTERVALUE = PDH_FMT_COUNTERVALUE(),
    public var max: PDH_FMT_COUNTERVALUE = PDH_FMT_COUNTERVALUE(),
    public var mean: PDH_FMT_COUNTERVALUE = PDH_FMT_COUNTERVALUE(),
)

public data class PDH_TIME_INFO(
    public var StartTime: Long = 0L,
    public var EndTime: Long = 0L,
    public var SampleCount: UInt = 0u,
)

public data class PERF_COUNTERSET_INFO(
    public var CounterSetGuid: GUID = GUID(),
    public var ProviderGuid: GUID = GUID(),
    public var NumCounters: UInt = 0u,
    public var InstanceType: UInt = 0u,
)

public data class PERF_COUNTERSET_INSTANCE(
    public var CounterSetGuid: GUID = GUID(),
    public var dwSize: UInt = 0u,
    public var InstanceId: UInt = 0u,
    public var InstanceNameOffset: UInt = 0u,
    public var InstanceNameSize: UInt = 0u,
)

public data class PERF_COUNTERSET_REG_INFO(
    public var CounterSetGuid: GUID = GUID(),
    public var CounterSetType: UInt = 0u,
    public var DetailLevel: UInt = 0u,
    public var NumCounters: UInt = 0u,
    public var InstanceType: UInt = 0u,
)

public data class PERF_COUNTER_BLOCK(public var ByteLength: UInt = 0u)

public data class PERF_COUNTER_DATA(public var dwDataSize: UInt = 0u, public var dwSize: UInt = 0u)

public data class PERF_COUNTER_DEFINITION(
    public var ByteLength: UInt = 0u,
    public var CounterNameTitleIndex: UInt = 0u,
    public var CounterNameTitle: UInt = 0u,
    public var CounterHelpTitleIndex: UInt = 0u,
    public var CounterHelpTitle: UInt = 0u,
    public var DefaultScale: Int = 0,
    public var DetailLevel: UInt = 0u,
    public var CounterType: UInt = 0u,
    public var CounterSize: UInt = 0u,
    public var CounterOffset: UInt = 0u,
)

public data class PERF_COUNTER_HEADER(
    public var dwStatus: UInt = 0u,
    public var dwType: PerfCounterDataType = 0,
    public var dwSize: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class PERF_COUNTER_IDENTIFIER(
    public var CounterSetGuid: GUID = GUID(),
    public var Status: UInt = 0u,
    public var Size: UInt = 0u,
    public var CounterId: UInt = 0u,
    public var InstanceId: UInt = 0u,
    public var Index: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class PERF_COUNTER_IDENTITY(
    public var CounterSetGuid: GUID = GUID(),
    public var BufferSize: UInt = 0u,
    public var CounterId: UInt = 0u,
    public var InstanceId: UInt = 0u,
    public var MachineOffset: UInt = 0u,
    public var NameOffset: UInt = 0u,
    public var Reserved: UInt = 0u,
)

public data class PERF_COUNTER_INFO(
    public var CounterId: UInt = 0u,
    public var Type: UInt = 0u,
    public var Attrib: ULong = 0uL,
    public var Size: UInt = 0u,
    public var DetailLevel: UInt = 0u,
    public var Scale: Int = 0,
    public var Offset: UInt = 0u,
)

public data class PERF_COUNTER_REG_INFO(
    public var CounterId: UInt = 0u,
    public var Type: UInt = 0u,
    public var Attrib: ULong = 0uL,
    public var DetailLevel: UInt = 0u,
    public var DefaultScale: Int = 0,
    public var BaseCounterId: UInt = 0u,
    public var PerfTimeId: UInt = 0u,
    public var PerfFreqId: UInt = 0u,
    public var MultiId: UInt = 0u,
    public var AggregateFunc: PERF_COUNTER_AGGREGATE_FUNC = 0u,
    public var Reserved: UInt = 0u,
)

public data class PERF_DATA_BLOCK(
    public var Signature: UShortArray = UShortArray(4),
    public var LittleEndian: UInt = 0u,
    public var Version: UInt = 0u,
    public var Revision: UInt = 0u,
    public var TotalByteLength: UInt = 0u,
    public var HeaderLength: UInt = 0u,
    public var NumObjectTypes: UInt = 0u,
    public var DefaultObject: Int = 0,
    public var SystemTime: Foundation.SYSTEMTIME = Foundation.SYSTEMTIME(),
    public var PerfTime: Long = 0L,
    public var PerfFreq: Long = 0L,
    public var PerfTime100nSec: Long = 0L,
    public var SystemNameLength: UInt = 0u,
    public var SystemNameOffset: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PERF_DATA_BLOCK) return false
        if (!this.Signature.contentEquals(other.Signature)) return false
        if (this.LittleEndian != other.LittleEndian) return false
        if (this.Version != other.Version) return false
        if (this.Revision != other.Revision) return false
        if (this.TotalByteLength != other.TotalByteLength) return false
        if (this.HeaderLength != other.HeaderLength) return false
        if (this.NumObjectTypes != other.NumObjectTypes) return false
        if (this.DefaultObject != other.DefaultObject) return false
        if (this.SystemTime != other.SystemTime) return false
        if (this.PerfTime != other.PerfTime) return false
        if (this.PerfFreq != other.PerfFreq) return false
        if (this.PerfTime100nSec != other.PerfTime100nSec) return false
        if (this.SystemNameLength != other.SystemNameLength) return false
        if (this.SystemNameOffset != other.SystemNameOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Signature.contentHashCode()
        result = 31 * result + this.LittleEndian.hashCode()
        result = 31 * result + this.Version.hashCode()
        result = 31 * result + this.Revision.hashCode()
        result = 31 * result + this.TotalByteLength.hashCode()
        result = 31 * result + this.HeaderLength.hashCode()
        result = 31 * result + this.NumObjectTypes.hashCode()
        result = 31 * result + this.DefaultObject.hashCode()
        result = 31 * result + this.SystemTime.hashCode()
        result = 31 * result + this.PerfTime.hashCode()
        result = 31 * result + this.PerfFreq.hashCode()
        result = 31 * result + this.PerfTime100nSec.hashCode()
        result = 31 * result + this.SystemNameLength.hashCode()
        result = 31 * result + this.SystemNameOffset.hashCode()
        return result
    }
}

public data class PERF_DATA_HEADER(
    public var dwTotalSize: UInt = 0u,
    public var dwNumCounters: UInt = 0u,
    public var PerfTimeStamp: Long = 0L,
    public var PerfTime100NSec: Long = 0L,
    public var PerfFreq: Long = 0L,
    public var SystemTime: Foundation.SYSTEMTIME = Foundation.SYSTEMTIME(),
)

public data class PERF_INSTANCE_DEFINITION(
    public var ByteLength: UInt = 0u,
    public var ParentObjectTitleIndex: UInt = 0u,
    public var ParentObjectInstance: UInt = 0u,
    public var UniqueID: Int = 0,
    public var NameOffset: UInt = 0u,
    public var NameLength: UInt = 0u,
)

public data class PERF_INSTANCE_HEADER(public var Size: UInt = 0u, public var InstanceId: UInt = 0u)

public data class PERF_MULTI_COUNTERS(public var dwSize: UInt = 0u, public var dwCounters: UInt = 0u)

public data class PERF_MULTI_INSTANCES(public var dwTotalSize: UInt = 0u, public var dwInstances: UInt = 0u)

public data class PERF_OBJECT_TYPE(
    public var TotalByteLength: UInt = 0u,
    public var DefinitionLength: UInt = 0u,
    public var HeaderLength: UInt = 0u,
    public var ObjectNameTitleIndex: UInt = 0u,
    public var ObjectNameTitle: UInt = 0u,
    public var ObjectHelpTitleIndex: UInt = 0u,
    public var ObjectHelpTitle: UInt = 0u,
    public var DetailLevel: UInt = 0u,
    public var NumCounters: UInt = 0u,
    public var DefaultCounter: Int = 0,
    public var NumInstances: Int = 0,
    public var CodePage: UInt = 0u,
    public var PerfTime: Long = 0L,
    public var PerfFreq: Long = 0L,
)

public data class PERF_PROVIDER_CONTEXT(
    public var ContextSize: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var ControlCallback: PERFLIBREQUEST = null,
    public var MemAllocRoutine: PERF_MEM_ALLOC = null,
    public var MemFreeRoutine: PERF_MEM_FREE = null,
    public var pMemContext: Long = 0L,
)

public data class PERF_STRING_BUFFER_HEADER(public var dwSize: UInt = 0u, public var dwCounters: UInt = 0u)

public data class PERF_STRING_COUNTER_HEADER(public var dwCounterId: UInt = 0u, public var dwOffset: UInt = 0u)
