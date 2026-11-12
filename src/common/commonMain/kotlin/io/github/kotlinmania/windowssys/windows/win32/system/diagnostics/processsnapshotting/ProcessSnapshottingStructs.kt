@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.Context
import io.github.kotlinmania.windowssys.windows.win32.system.memory.MemoryBasicInformation

public class PssAllocator internal constructor(
    contextCtorArg: MutPtr<CVoid>,
    public var allocRoutine: Int,
    public var freeRoutine: Int,
) {
    public var context: MutPtr<CVoid> = contextCtorArg
        internal set

    public constructor() : this(
        contextCtorArg = MutPtr(0L),
        allocRoutine = 0,
        freeRoutine = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.context

    public operator fun component2(): Int = this.allocRoutine

    public operator fun component3(): Int = this.freeRoutine

    public fun copy(context: MutPtr<CVoid> = this.context, allocRoutine: Int = this.allocRoutine, freeRoutine: Int = this.freeRoutine): PssAllocator = PssAllocator(contextCtorArg = context, allocRoutine = allocRoutine, freeRoutine = freeRoutine)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PssAllocator) return false
        if (this.context != other.context) return false
        if (this.allocRoutine != other.allocRoutine) return false
        if (this.freeRoutine != other.freeRoutine) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.context.hashCode()
        result = 31 * result + this.allocRoutine.hashCode()
        result = 31 * result + this.freeRoutine.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssAllocator> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssAllocator> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): PssAllocator =
                    PssAllocator(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: PssAllocator) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.context)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.allocRoutine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.freeRoutine)
                }
            }

        public operator fun invoke(
            context: MutPtr<CVoid> = MutPtr(0L),
            allocRoutine: Int = 0,
            freeRoutine: Int = 0,
        ): PssAllocator =
            PssAllocator(
                contextCtorArg = context,
                allocRoutine = allocRoutine,
                freeRoutine = freeRoutine,
            )
    }
}

public data class PssAuxiliaryPagesInformation(
    public var auxPagesCaptured: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssAuxiliaryPagesInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssAuxiliaryPagesInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PssAuxiliaryPagesInformation =
                    PssAuxiliaryPagesInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PssAuxiliaryPagesInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.auxPagesCaptured)
                }
            }
    }
}

public class PssAuxiliaryPageEntry internal constructor(
    addressCtorArg: MutPtr<CVoid>,
    public var basicInformation: MemoryBasicInformation,
    public var captureTime: Filetime,
    pageContentsCtorArg: MutPtr<CVoid>,
    public var pageSize: UInt,
) {
    public var address: MutPtr<CVoid> = addressCtorArg
        internal set

    public var pageContents: MutPtr<CVoid> = pageContentsCtorArg
        internal set

    public constructor() : this(
        addressCtorArg = MutPtr(0L),
        basicInformation = MemoryBasicInformation(),
        captureTime = Filetime(),
        pageContentsCtorArg = MutPtr(0L),
        pageSize = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.address

    public operator fun component2(): MemoryBasicInformation = this.basicInformation

    public operator fun component3(): Filetime = this.captureTime

    public operator fun component4(): MutPtr<CVoid> = this.pageContents

    public operator fun component5(): UInt = this.pageSize

    public fun copy(address: MutPtr<CVoid> = this.address, basicInformation: MemoryBasicInformation = this.basicInformation, captureTime: Filetime = this.captureTime, pageContents: MutPtr<CVoid> = this.pageContents, pageSize: UInt = this.pageSize): PssAuxiliaryPageEntry = PssAuxiliaryPageEntry(addressCtorArg = address, basicInformation = basicInformation, captureTime = captureTime, pageContentsCtorArg = pageContents, pageSize = pageSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PssAuxiliaryPageEntry) return false
        if (this.address != other.address) return false
        if (this.basicInformation != other.basicInformation) return false
        if (this.captureTime != other.captureTime) return false
        if (this.pageContents != other.pageContents) return false
        if (this.pageSize != other.pageSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.address.hashCode()
        result = 31 * result + this.basicInformation.hashCode()
        result = 31 * result + this.captureTime.hashCode()
        result = 31 * result + this.pageContents.hashCode()
        result = 31 * result + this.pageSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            address: MutPtr<CVoid> = MutPtr(0L),
            basicInformation: MemoryBasicInformation = MemoryBasicInformation(),
            captureTime: Filetime = Filetime(),
            pageContents: MutPtr<CVoid> = MutPtr(0L),
            pageSize: UInt = 0u,
        ): PssAuxiliaryPageEntry =
            PssAuxiliaryPageEntry(
                addressCtorArg = address,
                basicInformation = basicInformation,
                captureTime = captureTime,
                pageContentsCtorArg = pageContents,
                pageSize = pageSize,
            )
    }
}

public class PssHandleEntry internal constructor(
    handleCtorArg: Handle,
    public var flags: PssHandleFlags,
    public var objectType: PssObjectType,
    public var captureTime: Filetime,
    public var attributes: UInt,
    public var grantedAccess: UInt,
    public var handleCount: UInt,
    public var pointerCount: UInt,
    public var pagedPoolCharge: UInt,
    public var nonPagedPoolCharge: UInt,
    public var creationTime: Filetime,
    public var typeNameLength: UShort,
    typeNameCtorArg: Pcwstr,
    public var objectNameLength: UShort,
    objectNameCtorArg: Pcwstr,
    public var typeSpecificInformation: PssHandleEntry0,
) {
    public var handle: Handle = handleCtorArg
        internal set

    public var typeName: Pcwstr = typeNameCtorArg
        internal set

    public var objectName: Pcwstr = objectNameCtorArg
        internal set

    public constructor() : this(
        handleCtorArg = MutPtr(0L),
        flags = 0,
        objectType = 0,
        captureTime = Filetime(),
        attributes = 0u,
        grantedAccess = 0u,
        handleCount = 0u,
        pointerCount = 0u,
        pagedPoolCharge = 0u,
        nonPagedPoolCharge = 0u,
        creationTime = Filetime(),
        typeNameLength = 0u,
        typeNameCtorArg = ConstPtr(0L),
        objectNameLength = 0u,
        objectNameCtorArg = ConstPtr(0L),
        typeSpecificInformation = PssHandleEntry0(),
    )

    public operator fun component1(): Handle = this.handle

    public operator fun component2(): PssHandleFlags = this.flags

    public operator fun component3(): PssObjectType = this.objectType

    public operator fun component4(): Filetime = this.captureTime

    public operator fun component5(): UInt = this.attributes

    public operator fun component6(): UInt = this.grantedAccess

    public operator fun component7(): UInt = this.handleCount

    public operator fun component8(): UInt = this.pointerCount

    public operator fun component9(): UInt = this.pagedPoolCharge

    public operator fun component10(): UInt = this.nonPagedPoolCharge

    public operator fun component11(): Filetime = this.creationTime

    public operator fun component12(): UShort = this.typeNameLength

    public operator fun component13(): Pcwstr = this.typeName

    public operator fun component14(): UShort = this.objectNameLength

    public operator fun component15(): Pcwstr = this.objectName

    public operator fun component16(): PssHandleEntry0 = this.typeSpecificInformation

    public fun copy(handle: Handle = this.handle, flags: PssHandleFlags = this.flags, objectType: PssObjectType = this.objectType, captureTime: Filetime = this.captureTime, attributes: UInt = this.attributes, grantedAccess: UInt = this.grantedAccess, handleCount: UInt = this.handleCount, pointerCount: UInt = this.pointerCount, pagedPoolCharge: UInt = this.pagedPoolCharge, nonPagedPoolCharge: UInt = this.nonPagedPoolCharge, creationTime: Filetime = this.creationTime, typeNameLength: UShort = this.typeNameLength, typeName: Pcwstr = this.typeName, objectNameLength: UShort = this.objectNameLength, objectName: Pcwstr = this.objectName, typeSpecificInformation: PssHandleEntry0 = this.typeSpecificInformation): PssHandleEntry = PssHandleEntry(handleCtorArg = handle, flags = flags, objectType = objectType, captureTime = captureTime, attributes = attributes, grantedAccess = grantedAccess, handleCount = handleCount, pointerCount = pointerCount, pagedPoolCharge = pagedPoolCharge, nonPagedPoolCharge = nonPagedPoolCharge, creationTime = creationTime, typeNameLength = typeNameLength, typeNameCtorArg = typeName, objectNameLength = objectNameLength, objectNameCtorArg = objectName, typeSpecificInformation = typeSpecificInformation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PssHandleEntry) return false
        if (this.handle != other.handle) return false
        if (this.flags != other.flags) return false
        if (this.objectType != other.objectType) return false
        if (this.captureTime != other.captureTime) return false
        if (this.attributes != other.attributes) return false
        if (this.grantedAccess != other.grantedAccess) return false
        if (this.handleCount != other.handleCount) return false
        if (this.pointerCount != other.pointerCount) return false
        if (this.pagedPoolCharge != other.pagedPoolCharge) return false
        if (this.nonPagedPoolCharge != other.nonPagedPoolCharge) return false
        if (this.creationTime != other.creationTime) return false
        if (this.typeNameLength != other.typeNameLength) return false
        if (this.typeName != other.typeName) return false
        if (this.objectNameLength != other.objectNameLength) return false
        if (this.objectName != other.objectName) return false
        if (this.typeSpecificInformation != other.typeSpecificInformation) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.handle.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.objectType.hashCode()
        result = 31 * result + this.captureTime.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.grantedAccess.hashCode()
        result = 31 * result + this.handleCount.hashCode()
        result = 31 * result + this.pointerCount.hashCode()
        result = 31 * result + this.pagedPoolCharge.hashCode()
        result = 31 * result + this.nonPagedPoolCharge.hashCode()
        result = 31 * result + this.creationTime.hashCode()
        result = 31 * result + this.typeNameLength.hashCode()
        result = 31 * result + this.typeName.hashCode()
        result = 31 * result + this.objectNameLength.hashCode()
        result = 31 * result + this.objectName.hashCode()
        result = 31 * result + this.typeSpecificInformation.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            handle: Handle = MutPtr(0L),
            flags: PssHandleFlags = 0,
            objectType: PssObjectType = 0,
            captureTime: Filetime = Filetime(),
            attributes: UInt = 0u,
            grantedAccess: UInt = 0u,
            handleCount: UInt = 0u,
            pointerCount: UInt = 0u,
            pagedPoolCharge: UInt = 0u,
            nonPagedPoolCharge: UInt = 0u,
            creationTime: Filetime = Filetime(),
            typeNameLength: UShort = 0u,
            typeName: Pcwstr = ConstPtr(0L),
            objectNameLength: UShort = 0u,
            objectName: Pcwstr = ConstPtr(0L),
            typeSpecificInformation: PssHandleEntry0 = PssHandleEntry0(),
        ): PssHandleEntry =
            PssHandleEntry(
                handleCtorArg = handle,
                flags = flags,
                objectType = objectType,
                captureTime = captureTime,
                attributes = attributes,
                grantedAccess = grantedAccess,
                handleCount = handleCount,
                pointerCount = pointerCount,
                pagedPoolCharge = pagedPoolCharge,
                nonPagedPoolCharge = nonPagedPoolCharge,
                creationTime = creationTime,
                typeNameLength = typeNameLength,
                typeNameCtorArg = typeName,
                objectNameLength = objectNameLength,
                objectNameCtorArg = objectName,
                typeSpecificInformation = typeSpecificInformation,
            )
    }
}

public data class PssHandleEntry0(
    public var process: PssHandleEntry00 = PssHandleEntry00(),
    public var thread: PssHandleEntry01 = PssHandleEntry01(),
    public var mutant: PssHandleEntry02 = PssHandleEntry02(),
    public var event: PssHandleEntry03 = PssHandleEntry03(),
    public var section: PssHandleEntry04 = PssHandleEntry04(),
    public var semaphore: PssHandleEntry05 = PssHandleEntry05(),
)

public data class PssHandleEntry03(
    public var manualReset: Bool = 0,
    public var signaled: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssHandleEntry03> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssHandleEntry03> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PssHandleEntry03 =
                    PssHandleEntry03(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PssHandleEntry03) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.manualReset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.signaled)
                }
            }
    }
}

public data class PssHandleEntry02(
    public var currentCount: Int = 0,
    public var abandoned: Bool = 0,
    public var ownerProcessId: UInt = 0u,
    public var ownerThreadId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssHandleEntry02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssHandleEntry02> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PssHandleEntry02 =
                    PssHandleEntry02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: PssHandleEntry02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.currentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.abandoned)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ownerProcessId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ownerThreadId)
                }
            }
    }
}

public class PssHandleEntry00 internal constructor(
    public var exitStatus: UInt,
    pebBaseAddressCtorArg: MutPtr<CVoid>,
    public var affinityMask: Int,
    public var basePriority: Int,
    public var processId: UInt,
    public var parentProcessId: UInt,
    public var flags: UInt,
) {
    public var pebBaseAddress: MutPtr<CVoid> = pebBaseAddressCtorArg
        internal set

    public constructor() : this(
        exitStatus = 0u,
        pebBaseAddressCtorArg = MutPtr(0L),
        affinityMask = 0,
        basePriority = 0,
        processId = 0u,
        parentProcessId = 0u,
        flags = 0u,
    )

    public operator fun component1(): UInt = this.exitStatus

    public operator fun component2(): MutPtr<CVoid> = this.pebBaseAddress

    public operator fun component3(): Int = this.affinityMask

    public operator fun component4(): Int = this.basePriority

    public operator fun component5(): UInt = this.processId

    public operator fun component6(): UInt = this.parentProcessId

    public operator fun component7(): UInt = this.flags

    public fun copy(exitStatus: UInt = this.exitStatus, pebBaseAddress: MutPtr<CVoid> = this.pebBaseAddress, affinityMask: Int = this.affinityMask, basePriority: Int = this.basePriority, processId: UInt = this.processId, parentProcessId: UInt = this.parentProcessId, flags: UInt = this.flags): PssHandleEntry00 = PssHandleEntry00(exitStatus = exitStatus, pebBaseAddressCtorArg = pebBaseAddress, affinityMask = affinityMask, basePriority = basePriority, processId = processId, parentProcessId = parentProcessId, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PssHandleEntry00) return false
        if (this.exitStatus != other.exitStatus) return false
        if (this.pebBaseAddress != other.pebBaseAddress) return false
        if (this.affinityMask != other.affinityMask) return false
        if (this.basePriority != other.basePriority) return false
        if (this.processId != other.processId) return false
        if (this.parentProcessId != other.parentProcessId) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.exitStatus.hashCode()
        result = 31 * result + this.pebBaseAddress.hashCode()
        result = 31 * result + this.affinityMask.hashCode()
        result = 31 * result + this.basePriority.hashCode()
        result = 31 * result + this.processId.hashCode()
        result = 31 * result + this.parentProcessId.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssHandleEntry00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssHandleEntry00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): PssHandleEntry00 =
                    PssHandleEntry00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: PssHandleEntry00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.exitStatus)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pebBaseAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.affinityMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.basePriority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.processId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.parentProcessId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.flags)
                }
            }

        public operator fun invoke(
            exitStatus: UInt = 0u,
            pebBaseAddress: MutPtr<CVoid> = MutPtr(0L),
            affinityMask: Int = 0,
            basePriority: Int = 0,
            processId: UInt = 0u,
            parentProcessId: UInt = 0u,
            flags: UInt = 0u,
        ): PssHandleEntry00 =
            PssHandleEntry00(
                exitStatus = exitStatus,
                pebBaseAddressCtorArg = pebBaseAddress,
                affinityMask = affinityMask,
                basePriority = basePriority,
                processId = processId,
                parentProcessId = parentProcessId,
                flags = flags,
            )
    }
}

public class PssHandleEntry04 internal constructor(
    baseAddressCtorArg: MutPtr<CVoid>,
    public var allocationAttributes: UInt,
    public var maximumSize: Long,
) {
    public var baseAddress: MutPtr<CVoid> = baseAddressCtorArg
        internal set

    public constructor() : this(
        baseAddressCtorArg = MutPtr(0L),
        allocationAttributes = 0u,
        maximumSize = 0L,
    )

    public operator fun component1(): MutPtr<CVoid> = this.baseAddress

    public operator fun component2(): UInt = this.allocationAttributes

    public operator fun component3(): Long = this.maximumSize

    public fun copy(baseAddress: MutPtr<CVoid> = this.baseAddress, allocationAttributes: UInt = this.allocationAttributes, maximumSize: Long = this.maximumSize): PssHandleEntry04 = PssHandleEntry04(baseAddressCtorArg = baseAddress, allocationAttributes = allocationAttributes, maximumSize = maximumSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PssHandleEntry04) return false
        if (this.baseAddress != other.baseAddress) return false
        if (this.allocationAttributes != other.allocationAttributes) return false
        if (this.maximumSize != other.maximumSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.baseAddress.hashCode()
        result = 31 * result + this.allocationAttributes.hashCode()
        result = 31 * result + this.maximumSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssHandleEntry04> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssHandleEntry04> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): PssHandleEntry04 =
                    PssHandleEntry04(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: PssHandleEntry04) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.baseAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.allocationAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.maximumSize)
                }
            }

        public operator fun invoke(
            baseAddress: MutPtr<CVoid> = MutPtr(0L),
            allocationAttributes: UInt = 0u,
            maximumSize: Long = 0L,
        ): PssHandleEntry04 =
            PssHandleEntry04(
                baseAddressCtorArg = baseAddress,
                allocationAttributes = allocationAttributes,
                maximumSize = maximumSize,
            )
    }
}

public data class PssHandleEntry05(
    public var currentCount: Int = 0,
    public var maximumCount: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssHandleEntry05> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssHandleEntry05> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PssHandleEntry05 =
                    PssHandleEntry05(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PssHandleEntry05) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.currentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.maximumCount)
                }
            }
    }
}

public class PssHandleEntry01 internal constructor(
    public var exitStatus: UInt,
    tebBaseAddressCtorArg: MutPtr<CVoid>,
    public var processId: UInt,
    public var threadId: UInt,
    public var affinityMask: Int,
    public var priority: Int,
    public var basePriority: Int,
    win32StartAddressCtorArg: MutPtr<CVoid>,
) {
    public var tebBaseAddress: MutPtr<CVoid> = tebBaseAddressCtorArg
        internal set

    public var win32StartAddress: MutPtr<CVoid> = win32StartAddressCtorArg
        internal set

    public constructor() : this(
        exitStatus = 0u,
        tebBaseAddressCtorArg = MutPtr(0L),
        processId = 0u,
        threadId = 0u,
        affinityMask = 0,
        priority = 0,
        basePriority = 0,
        win32StartAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.exitStatus

    public operator fun component2(): MutPtr<CVoid> = this.tebBaseAddress

    public operator fun component3(): UInt = this.processId

    public operator fun component4(): UInt = this.threadId

    public operator fun component5(): Int = this.affinityMask

    public operator fun component6(): Int = this.priority

    public operator fun component7(): Int = this.basePriority

    public operator fun component8(): MutPtr<CVoid> = this.win32StartAddress

    public fun copy(exitStatus: UInt = this.exitStatus, tebBaseAddress: MutPtr<CVoid> = this.tebBaseAddress, processId: UInt = this.processId, threadId: UInt = this.threadId, affinityMask: Int = this.affinityMask, priority: Int = this.priority, basePriority: Int = this.basePriority, win32StartAddress: MutPtr<CVoid> = this.win32StartAddress): PssHandleEntry01 = PssHandleEntry01(exitStatus = exitStatus, tebBaseAddressCtorArg = tebBaseAddress, processId = processId, threadId = threadId, affinityMask = affinityMask, priority = priority, basePriority = basePriority, win32StartAddressCtorArg = win32StartAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PssHandleEntry01) return false
        if (this.exitStatus != other.exitStatus) return false
        if (this.tebBaseAddress != other.tebBaseAddress) return false
        if (this.processId != other.processId) return false
        if (this.threadId != other.threadId) return false
        if (this.affinityMask != other.affinityMask) return false
        if (this.priority != other.priority) return false
        if (this.basePriority != other.basePriority) return false
        if (this.win32StartAddress != other.win32StartAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.exitStatus.hashCode()
        result = 31 * result + this.tebBaseAddress.hashCode()
        result = 31 * result + this.processId.hashCode()
        result = 31 * result + this.threadId.hashCode()
        result = 31 * result + this.affinityMask.hashCode()
        result = 31 * result + this.priority.hashCode()
        result = 31 * result + this.basePriority.hashCode()
        result = 31 * result + this.win32StartAddress.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssHandleEntry01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssHandleEntry01> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): PssHandleEntry01 =
                    PssHandleEntry01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: PssHandleEntry01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.exitStatus)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.tebBaseAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.processId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.threadId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.affinityMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.priority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.basePriority)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.win32StartAddress)
                }
            }

        public operator fun invoke(
            exitStatus: UInt = 0u,
            tebBaseAddress: MutPtr<CVoid> = MutPtr(0L),
            processId: UInt = 0u,
            threadId: UInt = 0u,
            affinityMask: Int = 0,
            priority: Int = 0,
            basePriority: Int = 0,
            win32StartAddress: MutPtr<CVoid> = MutPtr(0L),
        ): PssHandleEntry01 =
            PssHandleEntry01(
                exitStatus = exitStatus,
                tebBaseAddressCtorArg = tebBaseAddress,
                processId = processId,
                threadId = threadId,
                affinityMask = affinityMask,
                priority = priority,
                basePriority = basePriority,
                win32StartAddressCtorArg = win32StartAddress,
            )
    }
}

public data class PssHandleInformation(
    public var handlesCaptured: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssHandleInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssHandleInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PssHandleInformation =
                    PssHandleInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PssHandleInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.handlesCaptured)
                }
            }
    }
}

public class PssHandleTraceInformation internal constructor(
    sectionHandleCtorArg: Handle,
    public var size: UInt,
) {
    public var sectionHandle: Handle = sectionHandleCtorArg
        internal set

    public constructor() : this(
        sectionHandleCtorArg = MutPtr(0L),
        size = 0u,
    )

    public operator fun component1(): Handle = this.sectionHandle

    public operator fun component2(): UInt = this.size

    public fun copy(sectionHandle: Handle = this.sectionHandle, size: UInt = this.size): PssHandleTraceInformation = PssHandleTraceInformation(sectionHandleCtorArg = sectionHandle, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PssHandleTraceInformation) return false
        if (this.sectionHandle != other.sectionHandle) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sectionHandle.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sectionHandle: Handle = MutPtr(0L),
            size: UInt = 0u,
        ): PssHandleTraceInformation =
            PssHandleTraceInformation(
                sectionHandleCtorArg = sectionHandle,
                size = size,
            )
    }
}

public data class PssPerformanceCounters(
    public var totalCycleCount: ULong = 0uL,
    public var totalWallClockPeriod: ULong = 0uL,
    public var vaCloneCycleCount: ULong = 0uL,
    public var vaCloneWallClockPeriod: ULong = 0uL,
    public var vaSpaceCycleCount: ULong = 0uL,
    public var vaSpaceWallClockPeriod: ULong = 0uL,
    public var auxPagesCycleCount: ULong = 0uL,
    public var auxPagesWallClockPeriod: ULong = 0uL,
    public var handlesCycleCount: ULong = 0uL,
    public var handlesWallClockPeriod: ULong = 0uL,
    public var threadsCycleCount: ULong = 0uL,
    public var threadsWallClockPeriod: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssPerformanceCounters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssPerformanceCounters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): PssPerformanceCounters =
                    PssPerformanceCounters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                    )
                override fun writeNative(addr: Long, value: PssPerformanceCounters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.totalCycleCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.totalWallClockPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.vaCloneCycleCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.vaCloneWallClockPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.vaSpaceCycleCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.vaSpaceWallClockPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.auxPagesCycleCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.auxPagesWallClockPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.handlesCycleCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.handlesWallClockPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.threadsCycleCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.threadsWallClockPeriod)
                }
            }
    }
}

public class PssProcessInformation internal constructor(
    public var exitStatus: UInt,
    pebBaseAddressCtorArg: MutPtr<CVoid>,
    public var affinityMask: Int,
    public var basePriority: Int,
    public var processId: UInt,
    public var parentProcessId: UInt,
    public var flags: PssProcessFlags,
    public var createTime: Filetime,
    public var exitTime: Filetime,
    public var kernelTime: Filetime,
    public var userTime: Filetime,
    public var priorityClass: UInt,
    public var peakVirtualSize: Int,
    public var virtualSize: Int,
    public var pageFaultCount: UInt,
    public var peakWorkingSetSize: Int,
    public var workingSetSize: Int,
    public var quotaPeakPagedPoolUsage: Int,
    public var quotaPagedPoolUsage: Int,
    public var quotaPeakNonPagedPoolUsage: Int,
    public var quotaNonPagedPoolUsage: Int,
    public var pagefileUsage: Int,
    public var peakPagefileUsage: Int,
    public var privateUsage: Int,
    public var executeFlags: UInt,
    public var imageFileName: UShortArray,
) {
    public var pebBaseAddress: MutPtr<CVoid> = pebBaseAddressCtorArg
        internal set

    public constructor() : this(
        exitStatus = 0u,
        pebBaseAddressCtorArg = MutPtr(0L),
        affinityMask = 0,
        basePriority = 0,
        processId = 0u,
        parentProcessId = 0u,
        flags = 0,
        createTime = Filetime(),
        exitTime = Filetime(),
        kernelTime = Filetime(),
        userTime = Filetime(),
        priorityClass = 0u,
        peakVirtualSize = 0,
        virtualSize = 0,
        pageFaultCount = 0u,
        peakWorkingSetSize = 0,
        workingSetSize = 0,
        quotaPeakPagedPoolUsage = 0,
        quotaPagedPoolUsage = 0,
        quotaPeakNonPagedPoolUsage = 0,
        quotaNonPagedPoolUsage = 0,
        pagefileUsage = 0,
        peakPagefileUsage = 0,
        privateUsage = 0,
        executeFlags = 0u,
        imageFileName = UShortArray(260),
    )

    public companion object {
        public operator fun invoke(
            exitStatus: UInt = 0u,
            pebBaseAddress: MutPtr<CVoid> = MutPtr(0L),
            affinityMask: Int = 0,
            basePriority: Int = 0,
            processId: UInt = 0u,
            parentProcessId: UInt = 0u,
            flags: PssProcessFlags = 0,
            createTime: Filetime = Filetime(),
            exitTime: Filetime = Filetime(),
            kernelTime: Filetime = Filetime(),
            userTime: Filetime = Filetime(),
            priorityClass: UInt = 0u,
            peakVirtualSize: Int = 0,
            virtualSize: Int = 0,
            pageFaultCount: UInt = 0u,
            peakWorkingSetSize: Int = 0,
            workingSetSize: Int = 0,
            quotaPeakPagedPoolUsage: Int = 0,
            quotaPagedPoolUsage: Int = 0,
            quotaPeakNonPagedPoolUsage: Int = 0,
            quotaNonPagedPoolUsage: Int = 0,
            pagefileUsage: Int = 0,
            peakPagefileUsage: Int = 0,
            privateUsage: Int = 0,
            executeFlags: UInt = 0u,
            imageFileName: UShortArray = UShortArray(260),
        ): PssProcessInformation =
            PssProcessInformation(
                exitStatus = exitStatus,
                pebBaseAddressCtorArg = pebBaseAddress,
                affinityMask = affinityMask,
                basePriority = basePriority,
                processId = processId,
                parentProcessId = parentProcessId,
                flags = flags,
                createTime = createTime,
                exitTime = exitTime,
                kernelTime = kernelTime,
                userTime = userTime,
                priorityClass = priorityClass,
                peakVirtualSize = peakVirtualSize,
                virtualSize = virtualSize,
                pageFaultCount = pageFaultCount,
                peakWorkingSetSize = peakWorkingSetSize,
                workingSetSize = workingSetSize,
                quotaPeakPagedPoolUsage = quotaPeakPagedPoolUsage,
                quotaPagedPoolUsage = quotaPagedPoolUsage,
                quotaPeakNonPagedPoolUsage = quotaPeakNonPagedPoolUsage,
                quotaNonPagedPoolUsage = quotaNonPagedPoolUsage,
                pagefileUsage = pagefileUsage,
                peakPagefileUsage = peakPagefileUsage,
                privateUsage = privateUsage,
                executeFlags = executeFlags,
                imageFileName = imageFileName,
            )
    }
}

public class PssThreadEntry internal constructor(
    public var exitStatus: UInt,
    tebBaseAddressCtorArg: MutPtr<CVoid>,
    public var processId: UInt,
    public var threadId: UInt,
    public var affinityMask: Int,
    public var priority: Int,
    public var basePriority: Int,
    lastSyscallFirstArgumentCtorArg: MutPtr<CVoid>,
    public var lastSyscallNumber: UShort,
    public var createTime: Filetime,
    public var exitTime: Filetime,
    public var kernelTime: Filetime,
    public var userTime: Filetime,
    win32StartAddressCtorArg: MutPtr<CVoid>,
    public var captureTime: Filetime,
    public var flags: PssThreadFlags,
    public var suspendCount: UShort,
    public var sizeOfContextRecord: UShort,
    contextRecordCtorArg: MutPtr<Context>,
) {
    public var tebBaseAddress: MutPtr<CVoid> = tebBaseAddressCtorArg
        internal set

    public var lastSyscallFirstArgument: MutPtr<CVoid> = lastSyscallFirstArgumentCtorArg
        internal set

    public var win32StartAddress: MutPtr<CVoid> = win32StartAddressCtorArg
        internal set

    public var contextRecord: MutPtr<Context> = contextRecordCtorArg
        internal set

    public constructor() : this(
        exitStatus = 0u,
        tebBaseAddressCtorArg = MutPtr(0L),
        processId = 0u,
        threadId = 0u,
        affinityMask = 0,
        priority = 0,
        basePriority = 0,
        lastSyscallFirstArgumentCtorArg = MutPtr(0L),
        lastSyscallNumber = 0u,
        createTime = Filetime(),
        exitTime = Filetime(),
        kernelTime = Filetime(),
        userTime = Filetime(),
        win32StartAddressCtorArg = MutPtr(0L),
        captureTime = Filetime(),
        flags = 0,
        suspendCount = 0u,
        sizeOfContextRecord = 0u,
        contextRecordCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            exitStatus: UInt = 0u,
            tebBaseAddress: MutPtr<CVoid> = MutPtr(0L),
            processId: UInt = 0u,
            threadId: UInt = 0u,
            affinityMask: Int = 0,
            priority: Int = 0,
            basePriority: Int = 0,
            lastSyscallFirstArgument: MutPtr<CVoid> = MutPtr(0L),
            lastSyscallNumber: UShort = 0u,
            createTime: Filetime = Filetime(),
            exitTime: Filetime = Filetime(),
            kernelTime: Filetime = Filetime(),
            userTime: Filetime = Filetime(),
            win32StartAddress: MutPtr<CVoid> = MutPtr(0L),
            captureTime: Filetime = Filetime(),
            flags: PssThreadFlags = 0,
            suspendCount: UShort = 0u,
            sizeOfContextRecord: UShort = 0u,
            contextRecord: MutPtr<Context> = MutPtr(0L),
        ): PssThreadEntry =
            PssThreadEntry(
                exitStatus = exitStatus,
                tebBaseAddressCtorArg = tebBaseAddress,
                processId = processId,
                threadId = threadId,
                affinityMask = affinityMask,
                priority = priority,
                basePriority = basePriority,
                lastSyscallFirstArgumentCtorArg = lastSyscallFirstArgument,
                lastSyscallNumber = lastSyscallNumber,
                createTime = createTime,
                exitTime = exitTime,
                kernelTime = kernelTime,
                userTime = userTime,
                win32StartAddressCtorArg = win32StartAddress,
                captureTime = captureTime,
                flags = flags,
                suspendCount = suspendCount,
                sizeOfContextRecord = sizeOfContextRecord,
                contextRecordCtorArg = contextRecord,
            )
    }
}

public data class PssThreadInformation(
    public var threadsCaptured: UInt = 0u,
    public var contextLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssThreadInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssThreadInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PssThreadInformation =
                    PssThreadInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PssThreadInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.threadsCaptured)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.contextLength)
                }
            }
    }
}

public class PssVaCloneInformation internal constructor(
    vaCloneHandleCtorArg: Handle,
) {
    public var vaCloneHandle: Handle = vaCloneHandleCtorArg
        internal set

    public constructor() : this(
        vaCloneHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.vaCloneHandle

    public fun copy(vaCloneHandle: Handle = this.vaCloneHandle): PssVaCloneInformation = PssVaCloneInformation(vaCloneHandleCtorArg = vaCloneHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PssVaCloneInformation) return false
        if (this.vaCloneHandle != other.vaCloneHandle) return false
        return true
    }

    override fun hashCode(): Int = this.vaCloneHandle.hashCode()

    public companion object {
        public operator fun invoke(
            vaCloneHandle: Handle = MutPtr(0L),
        ): PssVaCloneInformation =
            PssVaCloneInformation(
                vaCloneHandleCtorArg = vaCloneHandle,
            )
    }
}

public class PssVaSpaceEntry internal constructor(
    baseAddressCtorArg: MutPtr<CVoid>,
    allocationBaseCtorArg: MutPtr<CVoid>,
    public var allocationProtect: UInt,
    public var regionSize: Int,
    public var state: UInt,
    public var protect: UInt,
    public var type: UInt,
    public var timeDateStamp: UInt,
    public var sizeOfImage: UInt,
    imageBaseCtorArg: MutPtr<CVoid>,
    public var checkSum: UInt,
    public var mappedFileNameLength: UShort,
    mappedFileNameCtorArg: Pcwstr,
) {
    public var baseAddress: MutPtr<CVoid> = baseAddressCtorArg
        internal set

    public var allocationBase: MutPtr<CVoid> = allocationBaseCtorArg
        internal set

    public var imageBase: MutPtr<CVoid> = imageBaseCtorArg
        internal set

    public var mappedFileName: Pcwstr = mappedFileNameCtorArg
        internal set

    public constructor() : this(
        baseAddressCtorArg = MutPtr(0L),
        allocationBaseCtorArg = MutPtr(0L),
        allocationProtect = 0u,
        regionSize = 0,
        state = 0u,
        protect = 0u,
        type = 0u,
        timeDateStamp = 0u,
        sizeOfImage = 0u,
        imageBaseCtorArg = MutPtr(0L),
        checkSum = 0u,
        mappedFileNameLength = 0u,
        mappedFileNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.baseAddress

    public operator fun component2(): MutPtr<CVoid> = this.allocationBase

    public operator fun component3(): UInt = this.allocationProtect

    public operator fun component4(): Int = this.regionSize

    public operator fun component5(): UInt = this.state

    public operator fun component6(): UInt = this.protect

    public operator fun component7(): UInt = this.type

    public operator fun component8(): UInt = this.timeDateStamp

    public operator fun component9(): UInt = this.sizeOfImage

    public operator fun component10(): MutPtr<CVoid> = this.imageBase

    public operator fun component11(): UInt = this.checkSum

    public operator fun component12(): UShort = this.mappedFileNameLength

    public operator fun component13(): Pcwstr = this.mappedFileName

    public fun copy(baseAddress: MutPtr<CVoid> = this.baseAddress, allocationBase: MutPtr<CVoid> = this.allocationBase, allocationProtect: UInt = this.allocationProtect, regionSize: Int = this.regionSize, state: UInt = this.state, protect: UInt = this.protect, type: UInt = this.type, timeDateStamp: UInt = this.timeDateStamp, sizeOfImage: UInt = this.sizeOfImage, imageBase: MutPtr<CVoid> = this.imageBase, checkSum: UInt = this.checkSum, mappedFileNameLength: UShort = this.mappedFileNameLength, mappedFileName: Pcwstr = this.mappedFileName): PssVaSpaceEntry = PssVaSpaceEntry(baseAddressCtorArg = baseAddress, allocationBaseCtorArg = allocationBase, allocationProtect = allocationProtect, regionSize = regionSize, state = state, protect = protect, type = type, timeDateStamp = timeDateStamp, sizeOfImage = sizeOfImage, imageBaseCtorArg = imageBase, checkSum = checkSum, mappedFileNameLength = mappedFileNameLength, mappedFileNameCtorArg = mappedFileName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PssVaSpaceEntry) return false
        if (this.baseAddress != other.baseAddress) return false
        if (this.allocationBase != other.allocationBase) return false
        if (this.allocationProtect != other.allocationProtect) return false
        if (this.regionSize != other.regionSize) return false
        if (this.state != other.state) return false
        if (this.protect != other.protect) return false
        if (this.type != other.type) return false
        if (this.timeDateStamp != other.timeDateStamp) return false
        if (this.sizeOfImage != other.sizeOfImage) return false
        if (this.imageBase != other.imageBase) return false
        if (this.checkSum != other.checkSum) return false
        if (this.mappedFileNameLength != other.mappedFileNameLength) return false
        if (this.mappedFileName != other.mappedFileName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.baseAddress.hashCode()
        result = 31 * result + this.allocationBase.hashCode()
        result = 31 * result + this.allocationProtect.hashCode()
        result = 31 * result + this.regionSize.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.protect.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.timeDateStamp.hashCode()
        result = 31 * result + this.sizeOfImage.hashCode()
        result = 31 * result + this.imageBase.hashCode()
        result = 31 * result + this.checkSum.hashCode()
        result = 31 * result + this.mappedFileNameLength.hashCode()
        result = 31 * result + this.mappedFileName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            baseAddress: MutPtr<CVoid> = MutPtr(0L),
            allocationBase: MutPtr<CVoid> = MutPtr(0L),
            allocationProtect: UInt = 0u,
            regionSize: Int = 0,
            state: UInt = 0u,
            protect: UInt = 0u,
            type: UInt = 0u,
            timeDateStamp: UInt = 0u,
            sizeOfImage: UInt = 0u,
            imageBase: MutPtr<CVoid> = MutPtr(0L),
            checkSum: UInt = 0u,
            mappedFileNameLength: UShort = 0u,
            mappedFileName: Pcwstr = ConstPtr(0L),
        ): PssVaSpaceEntry =
            PssVaSpaceEntry(
                baseAddressCtorArg = baseAddress,
                allocationBaseCtorArg = allocationBase,
                allocationProtect = allocationProtect,
                regionSize = regionSize,
                state = state,
                protect = protect,
                type = type,
                timeDateStamp = timeDateStamp,
                sizeOfImage = sizeOfImage,
                imageBaseCtorArg = imageBase,
                checkSum = checkSum,
                mappedFileNameLength = mappedFileNameLength,
                mappedFileNameCtorArg = mappedFileName,
            )
    }
}

public data class PssVaSpaceInformation(
    public var regionCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssVaSpaceInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PssVaSpaceInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PssVaSpaceInformation =
                    PssVaSpaceInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PssVaSpaceInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.regionCount)
                }
            }
    }
}
