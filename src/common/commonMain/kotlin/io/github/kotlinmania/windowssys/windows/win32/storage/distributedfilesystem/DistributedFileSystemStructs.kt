@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

public data class DfsGetPktEntryStateArg(
    public var dfsEntryPathLen: UShort = 0u,
    public var serverNameLen: UShort = 0u,
    public var shareNameLen: UShort = 0u,
    public var level: UInt = 0u,
    public var buffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DfsGetPktEntryStateArg) return false
        if (this.dfsEntryPathLen != other.dfsEntryPathLen) return false
        if (this.serverNameLen != other.serverNameLen) return false
        if (this.shareNameLen != other.shareNameLen) return false
        if (this.level != other.level) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dfsEntryPathLen.hashCode()
        result = 31 * result + this.serverNameLen.hashCode()
        result = 31 * result + this.shareNameLen.hashCode()
        result = 31 * result + this.level.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsGetPktEntryStateArg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsGetPktEntryStateArg> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DfsGetPktEntryStateArg =
                    DfsGetPktEntryStateArg(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 12L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: DfsGetPktEntryStateArg) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.dfsEntryPathLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.serverNameLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.shareNameLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.level)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 12L, value.buffer.toList())
                }
            }
    }
}

public class DfsInfo1 internal constructor(
    entryPathCtorArg: Pwstr,
) {
    public var entryPath: Pwstr = entryPathCtorArg
        internal set

    public constructor() : this(
        entryPathCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.entryPath

    public fun copy(entryPath: Pwstr = this.entryPath): DfsInfo1 = DfsInfo1(entryPathCtorArg = entryPath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DfsInfo1) return false
        if (this.entryPath != other.entryPath) return false
        return true
    }

    override fun hashCode(): Int = this.entryPath.hashCode()

    public companion object {
        public operator fun invoke(
            entryPath: Pwstr = MutPtr(0L),
        ): DfsInfo1 =
            DfsInfo1(
                entryPathCtorArg = entryPath,
            )
    }
}

public class DfsInfo100 internal constructor(
    commentCtorArg: Pwstr,
) {
    public var comment: Pwstr = commentCtorArg
        internal set

    public constructor() : this(
        commentCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.comment

    public fun copy(comment: Pwstr = this.comment): DfsInfo100 = DfsInfo100(commentCtorArg = comment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DfsInfo100) return false
        if (this.comment != other.comment) return false
        return true
    }

    override fun hashCode(): Int = this.comment.hashCode()

    public companion object {
        public operator fun invoke(
            comment: Pwstr = MutPtr(0L),
        ): DfsInfo100 =
            DfsInfo100(
                commentCtorArg = comment,
            )
    }
}

public data class DfsInfo101(
    public var state: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsInfo101> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsInfo101> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DfsInfo101 =
                    DfsInfo101(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DfsInfo101) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.state)
                }
            }
    }
}

public data class DfsInfo102(
    public var timeout: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsInfo102> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsInfo102> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DfsInfo102 =
                    DfsInfo102(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DfsInfo102) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.timeout)
                }
            }
    }
}

public data class DfsInfo103(
    public var propertyFlagMask: UInt = 0u,
    public var propertyFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsInfo103> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsInfo103> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DfsInfo103 =
                    DfsInfo103(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DfsInfo103) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.propertyFlagMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.propertyFlags)
                }
            }
    }
}

public data class DfsInfo104(
    public var targetPriority: DfsTargetPriority = DfsTargetPriority(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsInfo104> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsInfo104> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DfsInfo104 =
                    DfsInfo104(
                        (DfsTargetPriority.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DfsInfo104) {
                    (DfsTargetPriority.typeLayout()).writeNative(addr, value.targetPriority)
                }
            }
    }
}

public class DfsInfo105 internal constructor(
    commentCtorArg: Pwstr,
    public var state: UInt,
    public var timeout: UInt,
    public var propertyFlagMask: UInt,
    public var propertyFlags: UInt,
) {
    public var comment: Pwstr = commentCtorArg
        internal set

    public constructor() : this(
        commentCtorArg = MutPtr(0L),
        state = 0u,
        timeout = 0u,
        propertyFlagMask = 0u,
        propertyFlags = 0u,
    )

    public operator fun component1(): Pwstr = this.comment

    public operator fun component2(): UInt = this.state

    public operator fun component3(): UInt = this.timeout

    public operator fun component4(): UInt = this.propertyFlagMask

    public operator fun component5(): UInt = this.propertyFlags

    public fun copy(comment: Pwstr = this.comment, state: UInt = this.state, timeout: UInt = this.timeout, propertyFlagMask: UInt = this.propertyFlagMask, propertyFlags: UInt = this.propertyFlags): DfsInfo105 = DfsInfo105(commentCtorArg = comment, state = state, timeout = timeout, propertyFlagMask = propertyFlagMask, propertyFlags = propertyFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DfsInfo105) return false
        if (this.comment != other.comment) return false
        if (this.state != other.state) return false
        if (this.timeout != other.timeout) return false
        if (this.propertyFlagMask != other.propertyFlagMask) return false
        if (this.propertyFlags != other.propertyFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.comment.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.propertyFlagMask.hashCode()
        result = 31 * result + this.propertyFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            comment: Pwstr = MutPtr(0L),
            state: UInt = 0u,
            timeout: UInt = 0u,
            propertyFlagMask: UInt = 0u,
            propertyFlags: UInt = 0u,
        ): DfsInfo105 =
            DfsInfo105(
                commentCtorArg = comment,
                state = state,
                timeout = timeout,
                propertyFlagMask = propertyFlagMask,
                propertyFlags = propertyFlags,
            )
    }
}

public data class DfsInfo106(
    public var state: UInt = 0u,
    public var targetPriority: DfsTargetPriority = DfsTargetPriority(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsInfo106> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsInfo106> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): DfsInfo106 =
                    DfsInfo106(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (DfsTargetPriority.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DfsInfo106) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.state)
                    (DfsTargetPriority.typeLayout()).writeNative(addr + 4L, value.targetPriority)
                }
            }
    }
}

public class DfsInfo107 internal constructor(
    commentCtorArg: Pwstr,
    public var state: UInt,
    public var timeout: UInt,
    public var propertyFlagMask: UInt,
    public var propertyFlags: UInt,
    public var sdLengthReserved: UInt,
    pSecurityDescriptorCtorArg: PsecurityDescriptor,
) {
    public var comment: Pwstr = commentCtorArg
        internal set

    public var pSecurityDescriptor: PsecurityDescriptor = pSecurityDescriptorCtorArg
        internal set

    public constructor() : this(
        commentCtorArg = MutPtr(0L),
        state = 0u,
        timeout = 0u,
        propertyFlagMask = 0u,
        propertyFlags = 0u,
        sdLengthReserved = 0u,
        pSecurityDescriptorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.comment

    public operator fun component2(): UInt = this.state

    public operator fun component3(): UInt = this.timeout

    public operator fun component4(): UInt = this.propertyFlagMask

    public operator fun component5(): UInt = this.propertyFlags

    public operator fun component6(): UInt = this.sdLengthReserved

    public operator fun component7(): PsecurityDescriptor = this.pSecurityDescriptor

    public fun copy(comment: Pwstr = this.comment, state: UInt = this.state, timeout: UInt = this.timeout, propertyFlagMask: UInt = this.propertyFlagMask, propertyFlags: UInt = this.propertyFlags, sdLengthReserved: UInt = this.sdLengthReserved, pSecurityDescriptor: PsecurityDescriptor = this.pSecurityDescriptor): DfsInfo107 = DfsInfo107(commentCtorArg = comment, state = state, timeout = timeout, propertyFlagMask = propertyFlagMask, propertyFlags = propertyFlags, sdLengthReserved = sdLengthReserved, pSecurityDescriptorCtorArg = pSecurityDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DfsInfo107) return false
        if (this.comment != other.comment) return false
        if (this.state != other.state) return false
        if (this.timeout != other.timeout) return false
        if (this.propertyFlagMask != other.propertyFlagMask) return false
        if (this.propertyFlags != other.propertyFlags) return false
        if (this.sdLengthReserved != other.sdLengthReserved) return false
        if (this.pSecurityDescriptor != other.pSecurityDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.comment.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.propertyFlagMask.hashCode()
        result = 31 * result + this.propertyFlags.hashCode()
        result = 31 * result + this.sdLengthReserved.hashCode()
        result = 31 * result + this.pSecurityDescriptor.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            comment: Pwstr = MutPtr(0L),
            state: UInt = 0u,
            timeout: UInt = 0u,
            propertyFlagMask: UInt = 0u,
            propertyFlags: UInt = 0u,
            sdLengthReserved: UInt = 0u,
            pSecurityDescriptor: PsecurityDescriptor = MutPtr(0L),
        ): DfsInfo107 =
            DfsInfo107(
                commentCtorArg = comment,
                state = state,
                timeout = timeout,
                propertyFlagMask = propertyFlagMask,
                propertyFlags = propertyFlags,
                sdLengthReserved = sdLengthReserved,
                pSecurityDescriptorCtorArg = pSecurityDescriptor,
            )
    }
}

public class DfsInfo150 internal constructor(
    public var sdLengthReserved: UInt,
    pSecurityDescriptorCtorArg: PsecurityDescriptor,
) {
    public var pSecurityDescriptor: PsecurityDescriptor = pSecurityDescriptorCtorArg
        internal set

    public constructor() : this(
        sdLengthReserved = 0u,
        pSecurityDescriptorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.sdLengthReserved

    public operator fun component2(): PsecurityDescriptor = this.pSecurityDescriptor

    public fun copy(sdLengthReserved: UInt = this.sdLengthReserved, pSecurityDescriptor: PsecurityDescriptor = this.pSecurityDescriptor): DfsInfo150 = DfsInfo150(sdLengthReserved = sdLengthReserved, pSecurityDescriptorCtorArg = pSecurityDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DfsInfo150) return false
        if (this.sdLengthReserved != other.sdLengthReserved) return false
        if (this.pSecurityDescriptor != other.pSecurityDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sdLengthReserved.hashCode()
        result = 31 * result + this.pSecurityDescriptor.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sdLengthReserved: UInt = 0u,
            pSecurityDescriptor: PsecurityDescriptor = MutPtr(0L),
        ): DfsInfo150 =
            DfsInfo150(
                sdLengthReserved = sdLengthReserved,
                pSecurityDescriptorCtorArg = pSecurityDescriptor,
            )
    }
}

public data class DfsInfo132(
    public var entryPath: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsInfo132> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsInfo132> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DfsInfo132 =
                    DfsInfo132(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DfsInfo132) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.entryPath)
                }
            }
    }
}

public class DfsInfo2 internal constructor(
    entryPathCtorArg: Pwstr,
    commentCtorArg: Pwstr,
    public var state: UInt,
    public var numberOfStorages: UInt,
) {
    public var entryPath: Pwstr = entryPathCtorArg
        internal set

    public var comment: Pwstr = commentCtorArg
        internal set

    public constructor() : this(
        entryPathCtorArg = MutPtr(0L),
        commentCtorArg = MutPtr(0L),
        state = 0u,
        numberOfStorages = 0u,
    )

    public operator fun component1(): Pwstr = this.entryPath

    public operator fun component2(): Pwstr = this.comment

    public operator fun component3(): UInt = this.state

    public operator fun component4(): UInt = this.numberOfStorages

    public fun copy(entryPath: Pwstr = this.entryPath, comment: Pwstr = this.comment, state: UInt = this.state, numberOfStorages: UInt = this.numberOfStorages): DfsInfo2 = DfsInfo2(entryPathCtorArg = entryPath, commentCtorArg = comment, state = state, numberOfStorages = numberOfStorages)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DfsInfo2) return false
        if (this.entryPath != other.entryPath) return false
        if (this.comment != other.comment) return false
        if (this.state != other.state) return false
        if (this.numberOfStorages != other.numberOfStorages) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.entryPath.hashCode()
        result = 31 * result + this.comment.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.numberOfStorages.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            entryPath: Pwstr = MutPtr(0L),
            comment: Pwstr = MutPtr(0L),
            state: UInt = 0u,
            numberOfStorages: UInt = 0u,
        ): DfsInfo2 =
            DfsInfo2(
                entryPathCtorArg = entryPath,
                commentCtorArg = comment,
                state = state,
                numberOfStorages = numberOfStorages,
            )
    }
}

public class DfsInfo200 internal constructor(
    ftDfsNameCtorArg: Pwstr,
) {
    public var ftDfsName: Pwstr = ftDfsNameCtorArg
        internal set

    public constructor() : this(
        ftDfsNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.ftDfsName

    public fun copy(ftDfsName: Pwstr = this.ftDfsName): DfsInfo200 = DfsInfo200(ftDfsNameCtorArg = ftDfsName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DfsInfo200) return false
        if (this.ftDfsName != other.ftDfsName) return false
        return true
    }

    override fun hashCode(): Int = this.ftDfsName.hashCode()

    public companion object {
        public operator fun invoke(
            ftDfsName: Pwstr = MutPtr(0L),
        ): DfsInfo200 =
            DfsInfo200(
                ftDfsNameCtorArg = ftDfsName,
            )
    }
}

public data class DfsInfo232(
    public var entryPath: UInt = 0u,
    public var comment: UInt = 0u,
    public var state: UInt = 0u,
    public var numberOfStorages: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsInfo232> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsInfo232> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DfsInfo232 =
                    DfsInfo232(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: DfsInfo232) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.entryPath)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.comment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.state)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.numberOfStorages)
                }
            }
    }
}

public class DfsInfo3 internal constructor(
    entryPathCtorArg: Pwstr,
    commentCtorArg: Pwstr,
    public var state: UInt,
    public var numberOfStorages: UInt,
    storageCtorArg: MutPtr<DfsStorageInfo>,
) {
    public var entryPath: Pwstr = entryPathCtorArg
        internal set

    public var comment: Pwstr = commentCtorArg
        internal set

    public var storage: MutPtr<DfsStorageInfo> = storageCtorArg
        internal set

    public constructor() : this(
        entryPathCtorArg = MutPtr(0L),
        commentCtorArg = MutPtr(0L),
        state = 0u,
        numberOfStorages = 0u,
        storageCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.entryPath

    public operator fun component2(): Pwstr = this.comment

    public operator fun component3(): UInt = this.state

    public operator fun component4(): UInt = this.numberOfStorages

    public operator fun component5(): MutPtr<DfsStorageInfo> = this.storage

    public fun copy(entryPath: Pwstr = this.entryPath, comment: Pwstr = this.comment, state: UInt = this.state, numberOfStorages: UInt = this.numberOfStorages, storage: MutPtr<DfsStorageInfo> = this.storage): DfsInfo3 = DfsInfo3(entryPathCtorArg = entryPath, commentCtorArg = comment, state = state, numberOfStorages = numberOfStorages, storageCtorArg = storage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DfsInfo3) return false
        if (this.entryPath != other.entryPath) return false
        if (this.comment != other.comment) return false
        if (this.state != other.state) return false
        if (this.numberOfStorages != other.numberOfStorages) return false
        if (this.storage != other.storage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.entryPath.hashCode()
        result = 31 * result + this.comment.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.numberOfStorages.hashCode()
        result = 31 * result + this.storage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            entryPath: Pwstr = MutPtr(0L),
            comment: Pwstr = MutPtr(0L),
            state: UInt = 0u,
            numberOfStorages: UInt = 0u,
            storage: MutPtr<DfsStorageInfo> = MutPtr(0L),
        ): DfsInfo3 =
            DfsInfo3(
                entryPathCtorArg = entryPath,
                commentCtorArg = comment,
                state = state,
                numberOfStorages = numberOfStorages,
                storageCtorArg = storage,
            )
    }
}

public class DfsInfo300 internal constructor(
    public var flags: UInt,
    dfsNameCtorArg: Pwstr,
) {
    public var dfsName: Pwstr = dfsNameCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        dfsNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): Pwstr = this.dfsName

    public fun copy(flags: UInt = this.flags, dfsName: Pwstr = this.dfsName): DfsInfo300 = DfsInfo300(flags = flags, dfsNameCtorArg = dfsName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DfsInfo300) return false
        if (this.flags != other.flags) return false
        if (this.dfsName != other.dfsName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.dfsName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: UInt = 0u,
            dfsName: Pwstr = MutPtr(0L),
        ): DfsInfo300 =
            DfsInfo300(
                flags = flags,
                dfsNameCtorArg = dfsName,
            )
    }
}

public data class DfsInfo332(
    public var entryPath: UInt = 0u,
    public var comment: UInt = 0u,
    public var state: UInt = 0u,
    public var numberOfStorages: UInt = 0u,
    public var storage: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsInfo332> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsInfo332> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): DfsInfo332 =
                    DfsInfo332(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DfsInfo332) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.entryPath)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.comment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.state)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.numberOfStorages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.storage)
                }
            }
    }
}

public class DfsInfo4 internal constructor(
    entryPathCtorArg: Pwstr,
    commentCtorArg: Pwstr,
    public var state: UInt,
    public var timeout: UInt,
    public var guid: Guid,
    public var numberOfStorages: UInt,
    storageCtorArg: MutPtr<DfsStorageInfo>,
) {
    public var entryPath: Pwstr = entryPathCtorArg
        internal set

    public var comment: Pwstr = commentCtorArg
        internal set

    public var storage: MutPtr<DfsStorageInfo> = storageCtorArg
        internal set

    public constructor() : this(
        entryPathCtorArg = MutPtr(0L),
        commentCtorArg = MutPtr(0L),
        state = 0u,
        timeout = 0u,
        guid = Guid(),
        numberOfStorages = 0u,
        storageCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.entryPath

    public operator fun component2(): Pwstr = this.comment

    public operator fun component3(): UInt = this.state

    public operator fun component4(): UInt = this.timeout

    public operator fun component5(): Guid = this.guid

    public operator fun component6(): UInt = this.numberOfStorages

    public operator fun component7(): MutPtr<DfsStorageInfo> = this.storage

    public fun copy(entryPath: Pwstr = this.entryPath, comment: Pwstr = this.comment, state: UInt = this.state, timeout: UInt = this.timeout, guid: Guid = this.guid, numberOfStorages: UInt = this.numberOfStorages, storage: MutPtr<DfsStorageInfo> = this.storage): DfsInfo4 = DfsInfo4(entryPathCtorArg = entryPath, commentCtorArg = comment, state = state, timeout = timeout, guid = guid, numberOfStorages = numberOfStorages, storageCtorArg = storage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DfsInfo4) return false
        if (this.entryPath != other.entryPath) return false
        if (this.comment != other.comment) return false
        if (this.state != other.state) return false
        if (this.timeout != other.timeout) return false
        if (this.guid != other.guid) return false
        if (this.numberOfStorages != other.numberOfStorages) return false
        if (this.storage != other.storage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.entryPath.hashCode()
        result = 31 * result + this.comment.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.numberOfStorages.hashCode()
        result = 31 * result + this.storage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            entryPath: Pwstr = MutPtr(0L),
            comment: Pwstr = MutPtr(0L),
            state: UInt = 0u,
            timeout: UInt = 0u,
            guid: Guid = Guid(),
            numberOfStorages: UInt = 0u,
            storage: MutPtr<DfsStorageInfo> = MutPtr(0L),
        ): DfsInfo4 =
            DfsInfo4(
                entryPathCtorArg = entryPath,
                commentCtorArg = comment,
                state = state,
                timeout = timeout,
                guid = guid,
                numberOfStorages = numberOfStorages,
                storageCtorArg = storage,
            )
    }
}

public data class DfsInfo432(
    public var entryPath: UInt = 0u,
    public var comment: UInt = 0u,
    public var state: UInt = 0u,
    public var timeout: UInt = 0u,
    public var guid: Guid = Guid(),
    public var numberOfStorages: UInt = 0u,
    public var storage: UInt = 0u,
)

public class DfsInfo5 internal constructor(
    entryPathCtorArg: Pwstr,
    commentCtorArg: Pwstr,
    public var state: UInt,
    public var timeout: UInt,
    public var guid: Guid,
    public var propertyFlags: UInt,
    public var metadataSize: UInt,
    public var numberOfStorages: UInt,
) {
    public var entryPath: Pwstr = entryPathCtorArg
        internal set

    public var comment: Pwstr = commentCtorArg
        internal set

    public constructor() : this(
        entryPathCtorArg = MutPtr(0L),
        commentCtorArg = MutPtr(0L),
        state = 0u,
        timeout = 0u,
        guid = Guid(),
        propertyFlags = 0u,
        metadataSize = 0u,
        numberOfStorages = 0u,
    )

    public operator fun component1(): Pwstr = this.entryPath

    public operator fun component2(): Pwstr = this.comment

    public operator fun component3(): UInt = this.state

    public operator fun component4(): UInt = this.timeout

    public operator fun component5(): Guid = this.guid

    public operator fun component6(): UInt = this.propertyFlags

    public operator fun component7(): UInt = this.metadataSize

    public operator fun component8(): UInt = this.numberOfStorages

    public fun copy(entryPath: Pwstr = this.entryPath, comment: Pwstr = this.comment, state: UInt = this.state, timeout: UInt = this.timeout, guid: Guid = this.guid, propertyFlags: UInt = this.propertyFlags, metadataSize: UInt = this.metadataSize, numberOfStorages: UInt = this.numberOfStorages): DfsInfo5 = DfsInfo5(entryPathCtorArg = entryPath, commentCtorArg = comment, state = state, timeout = timeout, guid = guid, propertyFlags = propertyFlags, metadataSize = metadataSize, numberOfStorages = numberOfStorages)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DfsInfo5) return false
        if (this.entryPath != other.entryPath) return false
        if (this.comment != other.comment) return false
        if (this.state != other.state) return false
        if (this.timeout != other.timeout) return false
        if (this.guid != other.guid) return false
        if (this.propertyFlags != other.propertyFlags) return false
        if (this.metadataSize != other.metadataSize) return false
        if (this.numberOfStorages != other.numberOfStorages) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.entryPath.hashCode()
        result = 31 * result + this.comment.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.propertyFlags.hashCode()
        result = 31 * result + this.metadataSize.hashCode()
        result = 31 * result + this.numberOfStorages.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            entryPath: Pwstr = MutPtr(0L),
            comment: Pwstr = MutPtr(0L),
            state: UInt = 0u,
            timeout: UInt = 0u,
            guid: Guid = Guid(),
            propertyFlags: UInt = 0u,
            metadataSize: UInt = 0u,
            numberOfStorages: UInt = 0u,
        ): DfsInfo5 =
            DfsInfo5(
                entryPathCtorArg = entryPath,
                commentCtorArg = comment,
                state = state,
                timeout = timeout,
                guid = guid,
                propertyFlags = propertyFlags,
                metadataSize = metadataSize,
                numberOfStorages = numberOfStorages,
            )
    }
}

public data class DfsInfo50(
    public var namespaceMajorVersion: UInt = 0u,
    public var namespaceMinorVersion: UInt = 0u,
    public var namespaceCapabilities: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsInfo50> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsInfo50> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DfsInfo50 =
                    DfsInfo50(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DfsInfo50) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.namespaceMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.namespaceMinorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.namespaceCapabilities)
                }
            }
    }
}

public class DfsInfo6 internal constructor(
    entryPathCtorArg: Pwstr,
    commentCtorArg: Pwstr,
    public var state: UInt,
    public var timeout: UInt,
    public var guid: Guid,
    public var propertyFlags: UInt,
    public var metadataSize: UInt,
    public var numberOfStorages: UInt,
    storageCtorArg: MutPtr<DfsStorageInfo1>,
) {
    public var entryPath: Pwstr = entryPathCtorArg
        internal set

    public var comment: Pwstr = commentCtorArg
        internal set

    public var storage: MutPtr<DfsStorageInfo1> = storageCtorArg
        internal set

    public constructor() : this(
        entryPathCtorArg = MutPtr(0L),
        commentCtorArg = MutPtr(0L),
        state = 0u,
        timeout = 0u,
        guid = Guid(),
        propertyFlags = 0u,
        metadataSize = 0u,
        numberOfStorages = 0u,
        storageCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.entryPath

    public operator fun component2(): Pwstr = this.comment

    public operator fun component3(): UInt = this.state

    public operator fun component4(): UInt = this.timeout

    public operator fun component5(): Guid = this.guid

    public operator fun component6(): UInt = this.propertyFlags

    public operator fun component7(): UInt = this.metadataSize

    public operator fun component8(): UInt = this.numberOfStorages

    public operator fun component9(): MutPtr<DfsStorageInfo1> = this.storage

    public fun copy(entryPath: Pwstr = this.entryPath, comment: Pwstr = this.comment, state: UInt = this.state, timeout: UInt = this.timeout, guid: Guid = this.guid, propertyFlags: UInt = this.propertyFlags, metadataSize: UInt = this.metadataSize, numberOfStorages: UInt = this.numberOfStorages, storage: MutPtr<DfsStorageInfo1> = this.storage): DfsInfo6 = DfsInfo6(entryPathCtorArg = entryPath, commentCtorArg = comment, state = state, timeout = timeout, guid = guid, propertyFlags = propertyFlags, metadataSize = metadataSize, numberOfStorages = numberOfStorages, storageCtorArg = storage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DfsInfo6) return false
        if (this.entryPath != other.entryPath) return false
        if (this.comment != other.comment) return false
        if (this.state != other.state) return false
        if (this.timeout != other.timeout) return false
        if (this.guid != other.guid) return false
        if (this.propertyFlags != other.propertyFlags) return false
        if (this.metadataSize != other.metadataSize) return false
        if (this.numberOfStorages != other.numberOfStorages) return false
        if (this.storage != other.storage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.entryPath.hashCode()
        result = 31 * result + this.comment.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.propertyFlags.hashCode()
        result = 31 * result + this.metadataSize.hashCode()
        result = 31 * result + this.numberOfStorages.hashCode()
        result = 31 * result + this.storage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            entryPath: Pwstr = MutPtr(0L),
            comment: Pwstr = MutPtr(0L),
            state: UInt = 0u,
            timeout: UInt = 0u,
            guid: Guid = Guid(),
            propertyFlags: UInt = 0u,
            metadataSize: UInt = 0u,
            numberOfStorages: UInt = 0u,
            storage: MutPtr<DfsStorageInfo1> = MutPtr(0L),
        ): DfsInfo6 =
            DfsInfo6(
                entryPathCtorArg = entryPath,
                commentCtorArg = comment,
                state = state,
                timeout = timeout,
                guid = guid,
                propertyFlags = propertyFlags,
                metadataSize = metadataSize,
                numberOfStorages = numberOfStorages,
                storageCtorArg = storage,
            )
    }
}

public data class DfsInfo7(
    public var generationGuid: Guid = Guid(),
)

public class DfsInfo8 internal constructor(
    entryPathCtorArg: Pwstr,
    commentCtorArg: Pwstr,
    public var state: UInt,
    public var timeout: UInt,
    public var guid: Guid,
    public var propertyFlags: UInt,
    public var metadataSize: UInt,
    public var sdLengthReserved: UInt,
    pSecurityDescriptorCtorArg: PsecurityDescriptor,
    public var numberOfStorages: UInt,
) {
    public var entryPath: Pwstr = entryPathCtorArg
        internal set

    public var comment: Pwstr = commentCtorArg
        internal set

    public var pSecurityDescriptor: PsecurityDescriptor = pSecurityDescriptorCtorArg
        internal set

    public constructor() : this(
        entryPathCtorArg = MutPtr(0L),
        commentCtorArg = MutPtr(0L),
        state = 0u,
        timeout = 0u,
        guid = Guid(),
        propertyFlags = 0u,
        metadataSize = 0u,
        sdLengthReserved = 0u,
        pSecurityDescriptorCtorArg = MutPtr(0L),
        numberOfStorages = 0u,
    )

    public operator fun component1(): Pwstr = this.entryPath

    public operator fun component2(): Pwstr = this.comment

    public operator fun component3(): UInt = this.state

    public operator fun component4(): UInt = this.timeout

    public operator fun component5(): Guid = this.guid

    public operator fun component6(): UInt = this.propertyFlags

    public operator fun component7(): UInt = this.metadataSize

    public operator fun component8(): UInt = this.sdLengthReserved

    public operator fun component9(): PsecurityDescriptor = this.pSecurityDescriptor

    public operator fun component10(): UInt = this.numberOfStorages

    public fun copy(entryPath: Pwstr = this.entryPath, comment: Pwstr = this.comment, state: UInt = this.state, timeout: UInt = this.timeout, guid: Guid = this.guid, propertyFlags: UInt = this.propertyFlags, metadataSize: UInt = this.metadataSize, sdLengthReserved: UInt = this.sdLengthReserved, pSecurityDescriptor: PsecurityDescriptor = this.pSecurityDescriptor, numberOfStorages: UInt = this.numberOfStorages): DfsInfo8 = DfsInfo8(entryPathCtorArg = entryPath, commentCtorArg = comment, state = state, timeout = timeout, guid = guid, propertyFlags = propertyFlags, metadataSize = metadataSize, sdLengthReserved = sdLengthReserved, pSecurityDescriptorCtorArg = pSecurityDescriptor, numberOfStorages = numberOfStorages)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DfsInfo8) return false
        if (this.entryPath != other.entryPath) return false
        if (this.comment != other.comment) return false
        if (this.state != other.state) return false
        if (this.timeout != other.timeout) return false
        if (this.guid != other.guid) return false
        if (this.propertyFlags != other.propertyFlags) return false
        if (this.metadataSize != other.metadataSize) return false
        if (this.sdLengthReserved != other.sdLengthReserved) return false
        if (this.pSecurityDescriptor != other.pSecurityDescriptor) return false
        if (this.numberOfStorages != other.numberOfStorages) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.entryPath.hashCode()
        result = 31 * result + this.comment.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.propertyFlags.hashCode()
        result = 31 * result + this.metadataSize.hashCode()
        result = 31 * result + this.sdLengthReserved.hashCode()
        result = 31 * result + this.pSecurityDescriptor.hashCode()
        result = 31 * result + this.numberOfStorages.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            entryPath: Pwstr = MutPtr(0L),
            comment: Pwstr = MutPtr(0L),
            state: UInt = 0u,
            timeout: UInt = 0u,
            guid: Guid = Guid(),
            propertyFlags: UInt = 0u,
            metadataSize: UInt = 0u,
            sdLengthReserved: UInt = 0u,
            pSecurityDescriptor: PsecurityDescriptor = MutPtr(0L),
            numberOfStorages: UInt = 0u,
        ): DfsInfo8 =
            DfsInfo8(
                entryPathCtorArg = entryPath,
                commentCtorArg = comment,
                state = state,
                timeout = timeout,
                guid = guid,
                propertyFlags = propertyFlags,
                metadataSize = metadataSize,
                sdLengthReserved = sdLengthReserved,
                pSecurityDescriptorCtorArg = pSecurityDescriptor,
                numberOfStorages = numberOfStorages,
            )
    }
}

public class DfsInfo9 internal constructor(
    entryPathCtorArg: Pwstr,
    commentCtorArg: Pwstr,
    public var state: UInt,
    public var timeout: UInt,
    public var guid: Guid,
    public var propertyFlags: UInt,
    public var metadataSize: UInt,
    public var sdLengthReserved: UInt,
    pSecurityDescriptorCtorArg: PsecurityDescriptor,
    public var numberOfStorages: UInt,
    storageCtorArg: MutPtr<DfsStorageInfo1>,
) {
    public var entryPath: Pwstr = entryPathCtorArg
        internal set

    public var comment: Pwstr = commentCtorArg
        internal set

    public var pSecurityDescriptor: PsecurityDescriptor = pSecurityDescriptorCtorArg
        internal set

    public var storage: MutPtr<DfsStorageInfo1> = storageCtorArg
        internal set

    public constructor() : this(
        entryPathCtorArg = MutPtr(0L),
        commentCtorArg = MutPtr(0L),
        state = 0u,
        timeout = 0u,
        guid = Guid(),
        propertyFlags = 0u,
        metadataSize = 0u,
        sdLengthReserved = 0u,
        pSecurityDescriptorCtorArg = MutPtr(0L),
        numberOfStorages = 0u,
        storageCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.entryPath

    public operator fun component2(): Pwstr = this.comment

    public operator fun component3(): UInt = this.state

    public operator fun component4(): UInt = this.timeout

    public operator fun component5(): Guid = this.guid

    public operator fun component6(): UInt = this.propertyFlags

    public operator fun component7(): UInt = this.metadataSize

    public operator fun component8(): UInt = this.sdLengthReserved

    public operator fun component9(): PsecurityDescriptor = this.pSecurityDescriptor

    public operator fun component10(): UInt = this.numberOfStorages

    public operator fun component11(): MutPtr<DfsStorageInfo1> = this.storage

    public fun copy(entryPath: Pwstr = this.entryPath, comment: Pwstr = this.comment, state: UInt = this.state, timeout: UInt = this.timeout, guid: Guid = this.guid, propertyFlags: UInt = this.propertyFlags, metadataSize: UInt = this.metadataSize, sdLengthReserved: UInt = this.sdLengthReserved, pSecurityDescriptor: PsecurityDescriptor = this.pSecurityDescriptor, numberOfStorages: UInt = this.numberOfStorages, storage: MutPtr<DfsStorageInfo1> = this.storage): DfsInfo9 = DfsInfo9(entryPathCtorArg = entryPath, commentCtorArg = comment, state = state, timeout = timeout, guid = guid, propertyFlags = propertyFlags, metadataSize = metadataSize, sdLengthReserved = sdLengthReserved, pSecurityDescriptorCtorArg = pSecurityDescriptor, numberOfStorages = numberOfStorages, storageCtorArg = storage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DfsInfo9) return false
        if (this.entryPath != other.entryPath) return false
        if (this.comment != other.comment) return false
        if (this.state != other.state) return false
        if (this.timeout != other.timeout) return false
        if (this.guid != other.guid) return false
        if (this.propertyFlags != other.propertyFlags) return false
        if (this.metadataSize != other.metadataSize) return false
        if (this.sdLengthReserved != other.sdLengthReserved) return false
        if (this.pSecurityDescriptor != other.pSecurityDescriptor) return false
        if (this.numberOfStorages != other.numberOfStorages) return false
        if (this.storage != other.storage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.entryPath.hashCode()
        result = 31 * result + this.comment.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.propertyFlags.hashCode()
        result = 31 * result + this.metadataSize.hashCode()
        result = 31 * result + this.sdLengthReserved.hashCode()
        result = 31 * result + this.pSecurityDescriptor.hashCode()
        result = 31 * result + this.numberOfStorages.hashCode()
        result = 31 * result + this.storage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            entryPath: Pwstr = MutPtr(0L),
            comment: Pwstr = MutPtr(0L),
            state: UInt = 0u,
            timeout: UInt = 0u,
            guid: Guid = Guid(),
            propertyFlags: UInt = 0u,
            metadataSize: UInt = 0u,
            sdLengthReserved: UInt = 0u,
            pSecurityDescriptor: PsecurityDescriptor = MutPtr(0L),
            numberOfStorages: UInt = 0u,
            storage: MutPtr<DfsStorageInfo1> = MutPtr(0L),
        ): DfsInfo9 =
            DfsInfo9(
                entryPathCtorArg = entryPath,
                commentCtorArg = comment,
                state = state,
                timeout = timeout,
                guid = guid,
                propertyFlags = propertyFlags,
                metadataSize = metadataSize,
                sdLengthReserved = sdLengthReserved,
                pSecurityDescriptorCtorArg = pSecurityDescriptor,
                numberOfStorages = numberOfStorages,
                storageCtorArg = storage,
            )
    }
}

public data class DfsSitelistInfo(
    public var cSites: UInt = 0u,
    public var site: List<DfsSitenameInfo> = List(1) { DfsSitenameInfo() },
)

public class DfsSitenameInfo internal constructor(
    public var siteFlags: UInt,
    siteNameCtorArg: Pwstr,
) {
    public var siteName: Pwstr = siteNameCtorArg
        internal set

    public constructor() : this(
        siteFlags = 0u,
        siteNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.siteFlags

    public operator fun component2(): Pwstr = this.siteName

    public fun copy(siteFlags: UInt = this.siteFlags, siteName: Pwstr = this.siteName): DfsSitenameInfo = DfsSitenameInfo(siteFlags = siteFlags, siteNameCtorArg = siteName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DfsSitenameInfo) return false
        if (this.siteFlags != other.siteFlags) return false
        if (this.siteName != other.siteName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siteFlags.hashCode()
        result = 31 * result + this.siteName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            siteFlags: UInt = 0u,
            siteName: Pwstr = MutPtr(0L),
        ): DfsSitenameInfo =
            DfsSitenameInfo(
                siteFlags = siteFlags,
                siteNameCtorArg = siteName,
            )
    }
}

public class DfsStorageInfo internal constructor(
    public var state: UInt,
    serverNameCtorArg: Pwstr,
    shareNameCtorArg: Pwstr,
) {
    public var serverName: Pwstr = serverNameCtorArg
        internal set

    public var shareName: Pwstr = shareNameCtorArg
        internal set

    public constructor() : this(
        state = 0u,
        serverNameCtorArg = MutPtr(0L),
        shareNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.state

    public operator fun component2(): Pwstr = this.serverName

    public operator fun component3(): Pwstr = this.shareName

    public fun copy(state: UInt = this.state, serverName: Pwstr = this.serverName, shareName: Pwstr = this.shareName): DfsStorageInfo = DfsStorageInfo(state = state, serverNameCtorArg = serverName, shareNameCtorArg = shareName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DfsStorageInfo) return false
        if (this.state != other.state) return false
        if (this.serverName != other.serverName) return false
        if (this.shareName != other.shareName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.state.hashCode()
        result = 31 * result + this.serverName.hashCode()
        result = 31 * result + this.shareName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            state: UInt = 0u,
            serverName: Pwstr = MutPtr(0L),
            shareName: Pwstr = MutPtr(0L),
        ): DfsStorageInfo =
            DfsStorageInfo(
                state = state,
                serverNameCtorArg = serverName,
                shareNameCtorArg = shareName,
            )
    }
}

public data class DfsStorageInfo032(
    public var state: UInt = 0u,
    public var serverName: UInt = 0u,
    public var shareName: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsStorageInfo032> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsStorageInfo032> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): DfsStorageInfo032 =
                    DfsStorageInfo032(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DfsStorageInfo032) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.state)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.serverName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.shareName)
                }
            }
    }
}

public class DfsStorageInfo1 internal constructor(
    public var state: UInt,
    serverNameCtorArg: Pwstr,
    shareNameCtorArg: Pwstr,
    public var targetPriority: DfsTargetPriority,
) {
    public var serverName: Pwstr = serverNameCtorArg
        internal set

    public var shareName: Pwstr = shareNameCtorArg
        internal set

    public constructor() : this(
        state = 0u,
        serverNameCtorArg = MutPtr(0L),
        shareNameCtorArg = MutPtr(0L),
        targetPriority = DfsTargetPriority(),
    )

    public operator fun component1(): UInt = this.state

    public operator fun component2(): Pwstr = this.serverName

    public operator fun component3(): Pwstr = this.shareName

    public operator fun component4(): DfsTargetPriority = this.targetPriority

    public fun copy(state: UInt = this.state, serverName: Pwstr = this.serverName, shareName: Pwstr = this.shareName, targetPriority: DfsTargetPriority = this.targetPriority): DfsStorageInfo1 = DfsStorageInfo1(state = state, serverNameCtorArg = serverName, shareNameCtorArg = shareName, targetPriority = targetPriority)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DfsStorageInfo1) return false
        if (this.state != other.state) return false
        if (this.serverName != other.serverName) return false
        if (this.shareName != other.shareName) return false
        if (this.targetPriority != other.targetPriority) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.state.hashCode()
        result = 31 * result + this.serverName.hashCode()
        result = 31 * result + this.shareName.hashCode()
        result = 31 * result + this.targetPriority.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            state: UInt = 0u,
            serverName: Pwstr = MutPtr(0L),
            shareName: Pwstr = MutPtr(0L),
            targetPriority: DfsTargetPriority = DfsTargetPriority(),
        ): DfsStorageInfo1 =
            DfsStorageInfo1(
                state = state,
                serverNameCtorArg = serverName,
                shareNameCtorArg = shareName,
                targetPriority = targetPriority,
            )
    }
}

public data class DfsSupportedNamespaceVersionInfo(
    public var domainDfsMajorVersion: UInt = 0u,
    public var domainDfsMinorVersion: UInt = 0u,
    public var domainDfsCapabilities: ULong = 0uL,
    public var standaloneDfsMajorVersion: UInt = 0u,
    public var standaloneDfsMinorVersion: UInt = 0u,
    public var standaloneDfsCapabilities: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsSupportedNamespaceVersionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsSupportedNamespaceVersionInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DfsSupportedNamespaceVersionInfo =
                    DfsSupportedNamespaceVersionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: DfsSupportedNamespaceVersionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.domainDfsMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.domainDfsMinorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.domainDfsCapabilities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.standaloneDfsMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.standaloneDfsMinorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.standaloneDfsCapabilities)
                }
            }
    }
}

public data class DfsTargetPriority(
    public var targetPriorityClass: DfsTargetPriorityClass = 0,
    public var targetPriorityRank: UShort = 0u,
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsTargetPriority> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DfsTargetPriority> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DfsTargetPriority =
                    DfsTargetPriority(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: DfsTargetPriority) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.targetPriorityClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.targetPriorityRank)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.reserved)
                }
            }
    }
}
