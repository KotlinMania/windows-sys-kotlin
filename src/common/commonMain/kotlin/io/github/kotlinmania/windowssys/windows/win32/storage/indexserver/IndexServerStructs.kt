package io.github.kotlinmania.windowssys.windows.win32.storage.indexserver

import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.Propspec

public data class CiState(
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

public data class Dbid(
    public var uGuid: Dbid0 = Dbid0(),
    public var eKind: UInt = 0u,
    public var uName: Dbid1 = Dbid1(),
)

public data class Dbid0(public var guid: Guid = Guid(), public var pguid: Guid? = null)

public data class Dbid1(public var pwszName: Pwstr = null, public var ulPropid: UInt = 0u)

public data class Filterregion(
    public var idChunk: UInt = 0u,
    public var cwcStart: UInt = 0u,
    public var cwcExtent: UInt = 0u,
)

public data class Fullpropspec(public var guidPropSet: Guid = Guid(), public var psProperty: Propspec = Propspec())

public data class StatChunk(
    public var idChunk: UInt = 0u,
    public var breakType: ChunkBreaktype = 0,
    public var flags: Chunkstate = 0,
    public var locale: UInt = 0u,
    public var attribute: Fullpropspec = Fullpropspec(),
    public var idChunkSource: UInt = 0u,
    public var cwcStartSource: UInt = 0u,
    public var cwcLenSource: UInt = 0u,
)
