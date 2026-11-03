package io.github.kotlinmania.windowssys.windows.win32.storage.indexserver

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PWSTR

public data class CI_STATE(
    public var cbStruct: UInt = 0u,
    public var cWordList: UInt = 0u,
    public var cPersistentIndex: UInt = 0u,
    public var cQueries: UInt = 0u,
    public var cDocuments: UInt = 0u,
    public var cFreshTest: UInt = 0u,
    public var dwMergeProgress: UInt = 0u,
    public var eState: UInt = 0u,
    public var cFilteredDocuments: UInt = 0u,
    public var cTotalDocuments: UInt = 0u,
    public var cPendingScans: UInt = 0u,
    public var dwIndexSize: UInt = 0u,
    public var cUniqueKeys: UInt = 0u,
    public var cSecQDocuments: UInt = 0u,
    public var dwPropCacheSize: UInt = 0u,
)

public data class DBID(
    public var uGuid: DBID_0 = DBID_0(),
    public var eKind: UInt = 0u,
    public var uName: DBID_1 = DBID_1(),
)

public data class DBID_0(public var guid: GUID = GUID(), public var pguid: Long = 0L)

public data class DBID_1(public var pwszName: PWSTR = 0L, public var ulPropid: UInt = 0u)

public data class FILTERREGION(
    public var idChunk: UInt = 0u,
    public var cwcStart: UInt = 0u,
    public var cwcExtent: UInt = 0u,
)

public data class FULLPROPSPEC(public var guidPropSet: GUID = GUID(), public var psProperty: System.Com.StructuredStorage.PROPSPEC = System.Com.StructuredStorage.PROPSPEC())

public data class STAT_CHUNK(
    public var idChunk: UInt = 0u,
    public var breakType: CHUNK_BREAKTYPE = 0,
    public var flags: CHUNKSTATE = 0,
    public var locale: UInt = 0u,
    public var attribute: FULLPROPSPEC = FULLPROPSPEC(),
    public var idChunkSource: UInt = 0u,
    public var cwcStartSource: UInt = 0u,
    public var cwcLenSource: UInt = 0u,
)
