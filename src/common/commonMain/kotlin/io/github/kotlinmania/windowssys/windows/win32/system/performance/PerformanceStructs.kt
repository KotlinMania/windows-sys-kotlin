@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.performance

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime

public data class PdhBrowseDlgConfigA(
    public var bitfield: UInt = 0u,
    public var hWndOwner: Hwnd = null,
    public var szDataSource: Pstr = null,
    public var szReturnPathBuffer: Pstr = null,
    public var cchReturnPathLength: UInt = 0u,
    public var pCallBack: CounterPathCallBack = null,
    public var dwCallBackArg: Int = 0,
    public var callBackStatus: Int = 0,
    public var dwDefaultDetailLevel: PerfDetail = 0u,
    public var szDialogBoxCaption: Pstr = null,
)

public data class PdhBrowseDlgConfigHa(
    public var bitfield: UInt = 0u,
    public var hWndOwner: Hwnd = null,
    public var hDataSource: PdhHlog = null,
    public var szReturnPathBuffer: Pstr = null,
    public var cchReturnPathLength: UInt = 0u,
    public var pCallBack: CounterPathCallBack = null,
    public var dwCallBackArg: Int = 0,
    public var callBackStatus: Int = 0,
    public var dwDefaultDetailLevel: PerfDetail = 0u,
    public var szDialogBoxCaption: Pstr = null,
)

public data class PdhBrowseDlgConfigHw(
    public var bitfield: UInt = 0u,
    public var hWndOwner: Hwnd = null,
    public var hDataSource: PdhHlog = null,
    public var szReturnPathBuffer: Pwstr = null,
    public var cchReturnPathLength: UInt = 0u,
    public var pCallBack: CounterPathCallBack = null,
    public var dwCallBackArg: Int = 0,
    public var callBackStatus: Int = 0,
    public var dwDefaultDetailLevel: PerfDetail = 0u,
    public var szDialogBoxCaption: Pwstr = null,
)

public data class PdhBrowseDlgConfigW(
    public var bitfield: UInt = 0u,
    public var hWndOwner: Hwnd = null,
    public var szDataSource: Pwstr = null,
    public var szReturnPathBuffer: Pwstr = null,
    public var cchReturnPathLength: UInt = 0u,
    public var pCallBack: CounterPathCallBack = null,
    public var dwCallBackArg: Int = 0,
    public var callBackStatus: Int = 0,
    public var dwDefaultDetailLevel: PerfDetail = 0u,
    public var szDialogBoxCaption: Pwstr = null,
)

public data class PdhCounterInfoA(
    public var dwLength: UInt = 0u,
    public var dwType: UInt = 0u,
    public var cVersion: UInt = 0u,
    public var cStatus: UInt = 0u,
    public var lScale: Int = 0,
    public var lDefaultScale: Int = 0,
    public var dwUserData: Int = 0,
    public var dwQueryUserData: Int = 0,
    public var szFullPath: Pstr = null,
    public var anonymous: PdhCounterInfoA0 = PdhCounterInfoA0(),
    public var szExplainText: Pstr = null,
    public var dataBuffer: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhCounterInfoA) return false
        if (this.dwLength != other.dwLength) return false
        if (this.dwType != other.dwType) return false
        if (this.cVersion != other.cVersion) return false
        if (this.cStatus != other.cStatus) return false
        if (this.lScale != other.lScale) return false
        if (this.lDefaultScale != other.lDefaultScale) return false
        if (this.dwUserData != other.dwUserData) return false
        if (this.dwQueryUserData != other.dwQueryUserData) return false
        if (this.szFullPath != other.szFullPath) return false
        if (this.anonymous != other.anonymous) return false
        if (this.szExplainText != other.szExplainText) return false
        if (!this.dataBuffer.contentEquals(other.dataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLength.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.cVersion.hashCode()
        result = 31 * result + this.cStatus.hashCode()
        result = 31 * result + this.lScale.hashCode()
        result = 31 * result + this.lDefaultScale.hashCode()
        result = 31 * result + this.dwUserData.hashCode()
        result = 31 * result + this.dwQueryUserData.hashCode()
        result = 31 * result + this.szFullPath.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.szExplainText.hashCode()
        result = 31 * result + this.dataBuffer.contentHashCode()
        return result
    }
}

public data class PdhCounterInfoA0(
    public var dataItemPath: PdhDataItemPathElementsA = PdhDataItemPathElementsA(),
    public var counterPath: PdhCounterPathElementsA = PdhCounterPathElementsA(),
    public var anonymous: PdhCounterInfoA00 = PdhCounterInfoA00(),
)

public data class PdhCounterInfoA00(
    public var szMachineName: Pstr = null,
    public var szObjectName: Pstr = null,
    public var szInstanceName: Pstr = null,
    public var szParentInstance: Pstr = null,
    public var dwInstanceIndex: UInt = 0u,
    public var szCounterName: Pstr = null,
)

public data class PdhCounterInfoW(
    public var dwLength: UInt = 0u,
    public var dwType: UInt = 0u,
    public var cVersion: UInt = 0u,
    public var cStatus: UInt = 0u,
    public var lScale: Int = 0,
    public var lDefaultScale: Int = 0,
    public var dwUserData: Int = 0,
    public var dwQueryUserData: Int = 0,
    public var szFullPath: Pwstr = null,
    public var anonymous: PdhCounterInfoW0 = PdhCounterInfoW0(),
    public var szExplainText: Pwstr = null,
    public var dataBuffer: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhCounterInfoW) return false
        if (this.dwLength != other.dwLength) return false
        if (this.dwType != other.dwType) return false
        if (this.cVersion != other.cVersion) return false
        if (this.cStatus != other.cStatus) return false
        if (this.lScale != other.lScale) return false
        if (this.lDefaultScale != other.lDefaultScale) return false
        if (this.dwUserData != other.dwUserData) return false
        if (this.dwQueryUserData != other.dwQueryUserData) return false
        if (this.szFullPath != other.szFullPath) return false
        if (this.anonymous != other.anonymous) return false
        if (this.szExplainText != other.szExplainText) return false
        if (!this.dataBuffer.contentEquals(other.dataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLength.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.cVersion.hashCode()
        result = 31 * result + this.cStatus.hashCode()
        result = 31 * result + this.lScale.hashCode()
        result = 31 * result + this.lDefaultScale.hashCode()
        result = 31 * result + this.dwUserData.hashCode()
        result = 31 * result + this.dwQueryUserData.hashCode()
        result = 31 * result + this.szFullPath.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.szExplainText.hashCode()
        result = 31 * result + this.dataBuffer.contentHashCode()
        return result
    }
}

public data class PdhCounterInfoW0(
    public var dataItemPath: PdhDataItemPathElementsW = PdhDataItemPathElementsW(),
    public var counterPath: PdhCounterPathElementsW = PdhCounterPathElementsW(),
    public var anonymous: PdhCounterInfoW00 = PdhCounterInfoW00(),
)

public data class PdhCounterInfoW00(
    public var szMachineName: Pwstr = null,
    public var szObjectName: Pwstr = null,
    public var szInstanceName: Pwstr = null,
    public var szParentInstance: Pwstr = null,
    public var dwInstanceIndex: UInt = 0u,
    public var szCounterName: Pwstr = null,
)

public data class PdhCounterPathElementsA(
    public var szMachineName: Pstr = null,
    public var szObjectName: Pstr = null,
    public var szInstanceName: Pstr = null,
    public var szParentInstance: Pstr = null,
    public var dwInstanceIndex: UInt = 0u,
    public var szCounterName: Pstr = null,
)

public data class PdhCounterPathElementsW(
    public var szMachineName: Pwstr = null,
    public var szObjectName: Pwstr = null,
    public var szInstanceName: Pwstr = null,
    public var szParentInstance: Pwstr = null,
    public var dwInstanceIndex: UInt = 0u,
    public var szCounterName: Pwstr = null,
)

public data class PdhDataItemPathElementsA(
    public var szMachineName: Pstr = null,
    public var objectGUID: Guid = Guid(),
    public var dwItemId: UInt = 0u,
    public var szInstanceName: Pstr = null,
)

public data class PdhDataItemPathElementsW(
    public var szMachineName: Pwstr = null,
    public var objectGUID: Guid = Guid(),
    public var dwItemId: UInt = 0u,
    public var szInstanceName: Pwstr = null,
)

public data class PdhFmtCountervalue(public var cStatus: UInt = 0u, public var anonymous: PdhFmtCountervalue0 = PdhFmtCountervalue0())

public data class PdhFmtCountervalue0(
    public var longValue: Int = 0,
    public var doubleValue: Double = 0.0,
    public var largeValue: Long = 0L,
    public var ansiStringValue: Pcstr = null,
    public var wideStringValue: Pcwstr = null,
)

public data class PdhFmtCountervalueItemA(public var szName: Pstr = null, public var fmtValue: PdhFmtCountervalue = PdhFmtCountervalue())

public data class PdhFmtCountervalueItemW(public var szName: Pwstr = null, public var fmtValue: PdhFmtCountervalue = PdhFmtCountervalue())

public data class PdhLogServiceQueryInfoA(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwLogQuota: UInt = 0u,
    public var szLogFileCaption: Pstr = null,
    public var szDefaultDir: Pstr = null,
    public var szBaseFileName: Pstr = null,
    public var dwFileType: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var anonymous: PdhLogServiceQueryInfoA0 = PdhLogServiceQueryInfoA0(),
)

public data class PdhLogServiceQueryInfoA0(public var anonymous1: PdhLogServiceQueryInfoA00 = PdhLogServiceQueryInfoA00(), public var anonymous2: PdhLogServiceQueryInfoA01 = PdhLogServiceQueryInfoA01())

public data class PdhLogServiceQueryInfoA00(
    public var pdlAutoNameInterval: UInt = 0u,
    public var pdlAutoNameUnits: UInt = 0u,
    public var pdlCommandFilename: Pstr = null,
    public var pdlCounterList: Pstr = null,
    public var pdlAutoNameFormat: UInt = 0u,
    public var pdlSampleInterval: UInt = 0u,
    public var pdlLogStartTime: Filetime = Filetime(),
    public var pdlLogEndTime: Filetime = Filetime(),
)

public data class PdhLogServiceQueryInfoA01(
    public var tlNumberOfBuffers: UInt = 0u,
    public var tlMinimumBuffers: UInt = 0u,
    public var tlMaximumBuffers: UInt = 0u,
    public var tlFreeBuffers: UInt = 0u,
    public var tlBufferSize: UInt = 0u,
    public var tlEventsLost: UInt = 0u,
    public var tlLoggerThreadId: UInt = 0u,
    public var tlBuffersWritten: UInt = 0u,
    public var tlLogHandle: UInt = 0u,
    public var tlLogFileName: Pstr = null,
)

public data class PdhLogServiceQueryInfoW(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwLogQuota: UInt = 0u,
    public var szLogFileCaption: Pwstr = null,
    public var szDefaultDir: Pwstr = null,
    public var szBaseFileName: Pwstr = null,
    public var dwFileType: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var anonymous: PdhLogServiceQueryInfoW0 = PdhLogServiceQueryInfoW0(),
)

public data class PdhLogServiceQueryInfoW0(public var anonymous1: PdhLogServiceQueryInfoW00 = PdhLogServiceQueryInfoW00(), public var anonymous2: PdhLogServiceQueryInfoW01 = PdhLogServiceQueryInfoW01())

public data class PdhLogServiceQueryInfoW00(
    public var pdlAutoNameInterval: UInt = 0u,
    public var pdlAutoNameUnits: UInt = 0u,
    public var pdlCommandFilename: Pwstr = null,
    public var pdlCounterList: Pwstr = null,
    public var pdlAutoNameFormat: UInt = 0u,
    public var pdlSampleInterval: UInt = 0u,
    public var pdlLogStartTime: Filetime = Filetime(),
    public var pdlLogEndTime: Filetime = Filetime(),
)

public data class PdhLogServiceQueryInfoW01(
    public var tlNumberOfBuffers: UInt = 0u,
    public var tlMinimumBuffers: UInt = 0u,
    public var tlMaximumBuffers: UInt = 0u,
    public var tlFreeBuffers: UInt = 0u,
    public var tlBufferSize: UInt = 0u,
    public var tlEventsLost: UInt = 0u,
    public var tlLoggerThreadId: UInt = 0u,
    public var tlBuffersWritten: UInt = 0u,
    public var tlLogHandle: UInt = 0u,
    public var tlLogFileName: Pwstr = null,
)

public data class PdhRawCounter(
    public var cStatus: UInt = 0u,
    public var timeStamp: Filetime = Filetime(),
    public var firstValue: Long = 0L,
    public var secondValue: Long = 0L,
    public var multiCount: UInt = 0u,
)

public data class PdhRawCounterItemA(public var szName: Pstr = null, public var rawValue: PdhRawCounter = PdhRawCounter())

public data class PdhRawCounterItemW(public var szName: Pwstr = null, public var rawValue: PdhRawCounter = PdhRawCounter())

public data class PdhRawLogRecord(
    public var dwStructureSize: UInt = 0u,
    public var dwRecordType: PdhLogType = 0u,
    public var dwItems: UInt = 0u,
    public var rawBytes: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PdhRawLogRecord) return false
        if (this.dwStructureSize != other.dwStructureSize) return false
        if (this.dwRecordType != other.dwRecordType) return false
        if (this.dwItems != other.dwItems) return false
        if (!this.rawBytes.contentEquals(other.rawBytes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStructureSize.hashCode()
        result = 31 * result + this.dwRecordType.hashCode()
        result = 31 * result + this.dwItems.hashCode()
        result = 31 * result + this.rawBytes.contentHashCode()
        return result
    }
}

public data class PdhStatistics(
    public var dwFormat: UInt = 0u,
    public var count: UInt = 0u,
    public var min: PdhFmtCountervalue = PdhFmtCountervalue(),
    public var max: PdhFmtCountervalue = PdhFmtCountervalue(),
    public var mean: PdhFmtCountervalue = PdhFmtCountervalue(),
)

public data class PdhTimeInfo(
    public var startTime: Long = 0L,
    public var endTime: Long = 0L,
    public var sampleCount: UInt = 0u,
)

public data class PerfCountersetInfo(
    public var counterSetGuid: Guid = Guid(),
    public var providerGuid: Guid = Guid(),
    public var numCounters: UInt = 0u,
    public var instanceType: UInt = 0u,
)

public data class PerfCountersetInstance(
    public var counterSetGuid: Guid = Guid(),
    public var dwSize: UInt = 0u,
    public var instanceId: UInt = 0u,
    public var instanceNameOffset: UInt = 0u,
    public var instanceNameSize: UInt = 0u,
)

public data class PerfCountersetRegInfo(
    public var counterSetGuid: Guid = Guid(),
    public var counterSetType: UInt = 0u,
    public var detailLevel: UInt = 0u,
    public var numCounters: UInt = 0u,
    public var instanceType: UInt = 0u,
)

public data class PerfCounterBlock(public var byteLength: UInt = 0u)

public data class PerfCounterData(public var dwDataSize: UInt = 0u, public var dwSize: UInt = 0u)

public data class PerfCounterDefinition(
    public var byteLength: UInt = 0u,
    public var counterNameTitleIndex: UInt = 0u,
    public var counterNameTitle: UInt = 0u,
    public var counterHelpTitleIndex: UInt = 0u,
    public var counterHelpTitle: UInt = 0u,
    public var defaultScale: Int = 0,
    public var detailLevel: UInt = 0u,
    public var counterType: UInt = 0u,
    public var counterSize: UInt = 0u,
    public var counterOffset: UInt = 0u,
)

public data class PerfCounterHeader(
    public var dwStatus: UInt = 0u,
    public var dwType: PerfCounterDataType = 0,
    public var dwSize: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class PerfCounterIdentifier(
    public var counterSetGuid: Guid = Guid(),
    public var status: UInt = 0u,
    public var size: UInt = 0u,
    public var counterId: UInt = 0u,
    public var instanceId: UInt = 0u,
    public var index: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class PerfCounterIdentity(
    public var counterSetGuid: Guid = Guid(),
    public var bufferSize: UInt = 0u,
    public var counterId: UInt = 0u,
    public var instanceId: UInt = 0u,
    public var machineOffset: UInt = 0u,
    public var nameOffset: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class PerfCounterInfo(
    public var counterId: UInt = 0u,
    public var type: UInt = 0u,
    public var attrib: ULong = 0uL,
    public var size: UInt = 0u,
    public var detailLevel: UInt = 0u,
    public var scale: Int = 0,
    public var offset: UInt = 0u,
)

public data class PerfCounterRegInfo(
    public var counterId: UInt = 0u,
    public var type: UInt = 0u,
    public var attrib: ULong = 0uL,
    public var detailLevel: UInt = 0u,
    public var defaultScale: Int = 0,
    public var baseCounterId: UInt = 0u,
    public var perfTimeId: UInt = 0u,
    public var perfFreqId: UInt = 0u,
    public var multiId: UInt = 0u,
    public var aggregateFunc: PerfCounterAggregateFunc = 0u,
    public var reserved: UInt = 0u,
)

public data class PerfDataBlock(
    public var signature: UShortArray = UShortArray(4),
    public var littleEndian: UInt = 0u,
    public var version: UInt = 0u,
    public var revision: UInt = 0u,
    public var totalByteLength: UInt = 0u,
    public var headerLength: UInt = 0u,
    public var numObjectTypes: UInt = 0u,
    public var defaultObject: Int = 0,
    public var systemTime: Systemtime = Systemtime(),
    public var perfTime: Long = 0L,
    public var perfFreq: Long = 0L,
    public var perfTime100nSec: Long = 0L,
    public var systemNameLength: UInt = 0u,
    public var systemNameOffset: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PerfDataBlock) return false
        if (!this.signature.contentEquals(other.signature)) return false
        if (this.littleEndian != other.littleEndian) return false
        if (this.version != other.version) return false
        if (this.revision != other.revision) return false
        if (this.totalByteLength != other.totalByteLength) return false
        if (this.headerLength != other.headerLength) return false
        if (this.numObjectTypes != other.numObjectTypes) return false
        if (this.defaultObject != other.defaultObject) return false
        if (this.systemTime != other.systemTime) return false
        if (this.perfTime != other.perfTime) return false
        if (this.perfFreq != other.perfFreq) return false
        if (this.perfTime100nSec != other.perfTime100nSec) return false
        if (this.systemNameLength != other.systemNameLength) return false
        if (this.systemNameOffset != other.systemNameOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.signature.contentHashCode()
        result = 31 * result + this.littleEndian.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.revision.hashCode()
        result = 31 * result + this.totalByteLength.hashCode()
        result = 31 * result + this.headerLength.hashCode()
        result = 31 * result + this.numObjectTypes.hashCode()
        result = 31 * result + this.defaultObject.hashCode()
        result = 31 * result + this.systemTime.hashCode()
        result = 31 * result + this.perfTime.hashCode()
        result = 31 * result + this.perfFreq.hashCode()
        result = 31 * result + this.perfTime100nSec.hashCode()
        result = 31 * result + this.systemNameLength.hashCode()
        result = 31 * result + this.systemNameOffset.hashCode()
        return result
    }
}

public data class PerfDataHeader(
    public var dwTotalSize: UInt = 0u,
    public var dwNumCounters: UInt = 0u,
    public var perfTimeStamp: Long = 0L,
    public var perfTime100NSec: Long = 0L,
    public var perfFreq: Long = 0L,
    public var systemTime: Systemtime = Systemtime(),
)

public data class PerfInstanceDefinition(
    public var byteLength: UInt = 0u,
    public var parentObjectTitleIndex: UInt = 0u,
    public var parentObjectInstance: UInt = 0u,
    public var uniqueID: Int = 0,
    public var nameOffset: UInt = 0u,
    public var nameLength: UInt = 0u,
)

public data class PerfInstanceHeader(public var size: UInt = 0u, public var instanceId: UInt = 0u)

public data class PerfMultiCounters(public var dwSize: UInt = 0u, public var dwCounters: UInt = 0u)

public data class PerfMultiInstances(public var dwTotalSize: UInt = 0u, public var dwInstances: UInt = 0u)

public data class PerfObjectType(
    public var totalByteLength: UInt = 0u,
    public var definitionLength: UInt = 0u,
    public var headerLength: UInt = 0u,
    public var objectNameTitleIndex: UInt = 0u,
    public var objectNameTitle: UInt = 0u,
    public var objectHelpTitleIndex: UInt = 0u,
    public var objectHelpTitle: UInt = 0u,
    public var detailLevel: UInt = 0u,
    public var numCounters: UInt = 0u,
    public var defaultCounter: Int = 0,
    public var numInstances: Int = 0,
    public var codePage: UInt = 0u,
    public var perfTime: Long = 0L,
    public var perfFreq: Long = 0L,
)

public data class PerfProviderContext(
    public var contextSize: UInt = 0u,
    public var reserved: UInt = 0u,
    public var controlCallback: Perflibrequest = null,
    public var memAllocRoutine: PerfMemAlloc = null,
    public var memFreeRoutine: PerfMemFree = null,
    public var pMemContext: COpaquePointer? = null,
)

public data class PerfStringBufferHeader(public var dwSize: UInt = 0u, public var dwCounters: UInt = 0u)

public data class PerfStringCounterHeader(public var dwCounterId: UInt = 0u, public var dwOffset: UInt = 0u)
