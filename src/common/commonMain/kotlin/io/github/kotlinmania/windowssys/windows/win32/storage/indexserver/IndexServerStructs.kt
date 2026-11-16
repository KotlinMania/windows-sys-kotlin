package io.github.kotlinmania.windowssys.windows.win32.storage.indexserver

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CiState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CiState> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 60L
                override fun readNative(addr: Long): CiState =
                    CiState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: CiState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cWordList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cPersistentIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cQueries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cDocuments)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cFreshTest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwMergeProgress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.eState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cFilteredDocuments)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.cTotalDocuments)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.cPendingScans)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwIndexSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.cUniqueKeys)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.cSecQDocuments)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.dwPropCacheSize)
                }
            }
    }
}

public data class Dbid(
    public var uGuid: Dbid0 = Dbid0(),
    public var eKind: UInt = 0u,
    public var uName: Dbid1 = Dbid1(),
)

public class Dbid0 internal constructor(
    public var guid: Guid,
    pguidCtorArg: MutPtr,
) {
    public var pguid: MutPtr = pguidCtorArg
        internal set

    public constructor() : this(
        guid = Guid(),
        pguidCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.guid

    public operator fun component2(): MutPtr = this.pguid

    public fun copy(guid: Guid = this.guid, pguid: MutPtr = this.pguid): Dbid0 = Dbid0(guid = guid, pguidCtorArg = pguid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dbid0) return false
        if (this.guid != other.guid) return false
        if (this.pguid != other.pguid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guid.hashCode()
        result = 31 * result + this.pguid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            guid: Guid = Guid(),
            pguid: MutPtr = MutPtr(0L),
        ): Dbid0 =
            Dbid0(
                guid = guid,
                pguidCtorArg = pguid,
            )
    }
}

public class Dbid1 internal constructor(
    pwszNameCtorArg: Pwstr,
    public var ulPropid: UInt,
) {
    public var pwszName: Pwstr = pwszNameCtorArg
        internal set

    public constructor() : this(
        pwszNameCtorArg = MutPtr(0L),
        ulPropid = 0u,
    )

    public operator fun component1(): Pwstr = this.pwszName

    public operator fun component2(): UInt = this.ulPropid

    public fun copy(pwszName: Pwstr = this.pwszName, ulPropid: UInt = this.ulPropid): Dbid1 = Dbid1(pwszNameCtorArg = pwszName, ulPropid = ulPropid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dbid1) return false
        if (this.pwszName != other.pwszName) return false
        if (this.ulPropid != other.ulPropid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszName.hashCode()
        result = 31 * result + this.ulPropid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszName: Pwstr = MutPtr(0L),
            ulPropid: UInt = 0u,
        ): Dbid1 =
            Dbid1(
                pwszNameCtorArg = pwszName,
                ulPropid = ulPropid,
            )
    }
}

public data class Filterregion(
    public var idChunk: UInt = 0u,
    public var cwcStart: UInt = 0u,
    public var cwcExtent: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Filterregion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Filterregion> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Filterregion =
                    Filterregion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Filterregion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.idChunk)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cwcStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cwcExtent)
                }
            }
    }
}

public data class Fullpropspec(
    public var guidPropSet: Guid = Guid(),
    public var psProperty: Propspec = Propspec(),
)

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
