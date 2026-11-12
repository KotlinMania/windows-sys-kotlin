@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DeviceObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Eresource
import io.github.kotlinmania.windowssys.windows.wdk.foundation.FileObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IoSecurityContext
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Irp
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Ktransaction
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Mdl
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Peprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pethread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Vpb
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileGetQuotaInformation
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileNetworkOpenInformation
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FsFilterSectionSyncOutput
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FsFilterSectionSyncType
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FsInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.BusQueryIdType
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.CmResourceList
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.DeviceCapabilities
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.DeviceRelationType
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.DeviceTextType
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.DeviceUsageNotificationType
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.DirectoryNotifyInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.Interface
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.IoCsq
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.IoResourceRequirementsList
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.system.io.IoStatusBlock
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry

public class FltCallbackData internal constructor(
    public var flags: UInt,
    public var thread: Pethread,
    iopbCtorArg: ConstPtr<FltIoParameterBlock>,
    public var ioStatus: IoStatusBlock,
    tagDataCtorArg: MutPtr<FltTagDataBuffer>,
    public var anonymous: FltCallbackData0,
    public var requestorMode: Byte,
) {
    public var iopb: ConstPtr<FltIoParameterBlock> = iopbCtorArg
        internal set

    public var tagData: MutPtr<FltTagDataBuffer> = tagDataCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        thread = 0L,
        iopbCtorArg = ConstPtr(0L),
        ioStatus = IoStatusBlock(),
        tagDataCtorArg = MutPtr(0L),
        anonymous = FltCallbackData0(),
        requestorMode = 0,
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): Pethread = this.thread

    public operator fun component3(): ConstPtr<FltIoParameterBlock> = this.iopb

    public operator fun component4(): IoStatusBlock = this.ioStatus

    public operator fun component5(): MutPtr<FltTagDataBuffer> = this.tagData

    public operator fun component6(): FltCallbackData0 = this.anonymous

    public operator fun component7(): Byte = this.requestorMode

    public fun copy(flags: UInt = this.flags, thread: Pethread = this.thread, iopb: ConstPtr<FltIoParameterBlock> = this.iopb, ioStatus: IoStatusBlock = this.ioStatus, tagData: MutPtr<FltTagDataBuffer> = this.tagData, anonymous: FltCallbackData0 = this.anonymous, requestorMode: Byte = this.requestorMode): FltCallbackData = FltCallbackData(flags = flags, thread = thread, iopbCtorArg = iopb, ioStatus = ioStatus, tagDataCtorArg = tagData, anonymous = anonymous, requestorMode = requestorMode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltCallbackData) return false
        if (this.flags != other.flags) return false
        if (this.thread != other.thread) return false
        if (this.iopb != other.iopb) return false
        if (this.ioStatus != other.ioStatus) return false
        if (this.tagData != other.tagData) return false
        if (this.anonymous != other.anonymous) return false
        if (this.requestorMode != other.requestorMode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.thread.hashCode()
        result = 31 * result + this.iopb.hashCode()
        result = 31 * result + this.ioStatus.hashCode()
        result = 31 * result + this.tagData.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.requestorMode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: UInt = 0u,
            thread: Pethread = 0L,
            iopb: ConstPtr<FltIoParameterBlock> = ConstPtr(0L),
            ioStatus: IoStatusBlock = IoStatusBlock(),
            tagData: MutPtr<FltTagDataBuffer> = MutPtr(0L),
            anonymous: FltCallbackData0 = FltCallbackData0(),
            requestorMode: Byte = 0,
        ): FltCallbackData =
            FltCallbackData(
                flags = flags,
                thread = thread,
                iopbCtorArg = iopb,
                ioStatus = ioStatus,
                tagDataCtorArg = tagData,
                anonymous = anonymous,
                requestorMode = requestorMode,
            )
    }
}

public class FltCallbackData0 internal constructor(
    public var anonymous: FltCallbackData00,
    filterContextCtorArg: List<MutPtr<CVoid>>,
) {
    public var filterContext: List<MutPtr<CVoid>> = filterContextCtorArg
        internal set

    public constructor() : this(
        anonymous = FltCallbackData00(),
        filterContextCtorArg = List(4) { MutPtr(0L) },
    )

    public operator fun component1(): FltCallbackData00 = this.anonymous

    public operator fun component2(): List<MutPtr<CVoid>> = this.filterContext

    public fun copy(anonymous: FltCallbackData00 = this.anonymous, filterContext: List<MutPtr<CVoid>> = this.filterContext): FltCallbackData0 = FltCallbackData0(anonymous = anonymous, filterContextCtorArg = filterContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltCallbackData0) return false
        if (this.anonymous != other.anonymous) return false
        if (this.filterContext != other.filterContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.filterContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: FltCallbackData00 = FltCallbackData00(),
            filterContext: List<MutPtr<CVoid>> = List(4) { MutPtr(0L) },
        ): FltCallbackData0 =
            FltCallbackData0(
                anonymous = anonymous,
                filterContextCtorArg = filterContext,
            )
    }
}

public class FltCallbackData00 internal constructor(
    public var queueLinks: ListEntry,
    queueContextCtorArg: List<MutPtr<CVoid>>,
) {
    public var queueContext: List<MutPtr<CVoid>> = queueContextCtorArg
        internal set

    public constructor() : this(
        queueLinks = ListEntry(),
        queueContextCtorArg = List(2) { MutPtr(0L) },
    )

    public operator fun component1(): ListEntry = this.queueLinks

    public operator fun component2(): List<MutPtr<CVoid>> = this.queueContext

    public fun copy(queueLinks: ListEntry = this.queueLinks, queueContext: List<MutPtr<CVoid>> = this.queueContext): FltCallbackData00 = FltCallbackData00(queueLinks = queueLinks, queueContextCtorArg = queueContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltCallbackData00) return false
        if (this.queueLinks != other.queueLinks) return false
        if (this.queueContext != other.queueContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.queueLinks.hashCode()
        result = 31 * result + this.queueContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            queueLinks: ListEntry = ListEntry(),
            queueContext: List<MutPtr<CVoid>> = List(2) { MutPtr(0L) },
        ): FltCallbackData00 =
            FltCallbackData00(
                queueLinks = queueLinks,
                queueContextCtorArg = queueContext,
            )
    }
}

public data class FltCallbackDataQueue(
    public var csq: IoCsq = IoCsq(),
    public var flags: FltCallbackDataQueueFlags = 0,
    public var instance: PfltInstance = 0L,
    public var insertIo: PfltCallbackDataQueueInsertIo = null,
    public var removeIo: PfltCallbackDataQueueRemoveIo = null,
    public var peekNextIo: PfltCallbackDataQueuePeekNextIo = null,
    public var acquire: PfltCallbackDataQueueAcquire = null,
    public var release: PfltCallbackDataQueueRelease = null,
    public var completeCanceledIo: PfltCallbackDataQueueCompleteCanceledIo = null,
)

public class FltContextRegistration internal constructor(
    public var contextType: UShort,
    public var flags: UShort,
    public var contextCleanupCallback: PfltContextCleanupCallback,
    public var size: Int,
    public var poolTag: UInt,
    public var contextAllocateCallback: PfltContextAllocateCallback,
    public var contextFreeCallback: PfltContextFreeCallback,
    reserved1CtorArg: MutPtr<CVoid>,
) {
    public var reserved1: MutPtr<CVoid> = reserved1CtorArg
        internal set

    public constructor() : this(
        contextType = 0u,
        flags = 0u,
        contextCleanupCallback = null,
        size = 0,
        poolTag = 0u,
        contextAllocateCallback = null,
        contextFreeCallback = null,
        reserved1CtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.contextType

    public operator fun component2(): UShort = this.flags

    public operator fun component3(): PfltContextCleanupCallback = this.contextCleanupCallback

    public operator fun component4(): Int = this.size

    public operator fun component5(): UInt = this.poolTag

    public operator fun component6(): PfltContextAllocateCallback = this.contextAllocateCallback

    public operator fun component7(): PfltContextFreeCallback = this.contextFreeCallback

    public operator fun component8(): MutPtr<CVoid> = this.reserved1

    public fun copy(contextType: UShort = this.contextType, flags: UShort = this.flags, contextCleanupCallback: PfltContextCleanupCallback = this.contextCleanupCallback, size: Int = this.size, poolTag: UInt = this.poolTag, contextAllocateCallback: PfltContextAllocateCallback = this.contextAllocateCallback, contextFreeCallback: PfltContextFreeCallback = this.contextFreeCallback, reserved1: MutPtr<CVoid> = this.reserved1): FltContextRegistration = FltContextRegistration(contextType = contextType, flags = flags, contextCleanupCallback = contextCleanupCallback, size = size, poolTag = poolTag, contextAllocateCallback = contextAllocateCallback, contextFreeCallback = contextFreeCallback, reserved1CtorArg = reserved1)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltContextRegistration) return false
        if (this.contextType != other.contextType) return false
        if (this.flags != other.flags) return false
        if (this.contextCleanupCallback != other.contextCleanupCallback) return false
        if (this.size != other.size) return false
        if (this.poolTag != other.poolTag) return false
        if (this.contextAllocateCallback != other.contextAllocateCallback) return false
        if (this.contextFreeCallback != other.contextFreeCallback) return false
        if (this.reserved1 != other.reserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.contextType.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.contextCleanupCallback.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.poolTag.hashCode()
        result = 31 * result + this.contextAllocateCallback.hashCode()
        result = 31 * result + this.contextFreeCallback.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            contextType: UShort = 0u,
            flags: UShort = 0u,
            contextCleanupCallback: PfltContextCleanupCallback = null,
            size: Int = 0,
            poolTag: UInt = 0u,
            contextAllocateCallback: PfltContextAllocateCallback = null,
            contextFreeCallback: PfltContextFreeCallback = null,
            reserved1: MutPtr<CVoid> = MutPtr(0L),
        ): FltContextRegistration =
            FltContextRegistration(
                contextType = contextType,
                flags = flags,
                contextCleanupCallback = contextCleanupCallback,
                size = size,
                poolTag = poolTag,
                contextAllocateCallback = contextAllocateCallback,
                contextFreeCallback = contextFreeCallback,
                reserved1CtorArg = reserved1,
            )
    }
}

public class FltCreatefileTargetEcpContext internal constructor(
    public var instance: PfltInstance,
    public var volume: PfltVolume,
    fileNameInformationCtorArg: MutPtr<FltFileNameInformation>,
    public var flags: UShort,
) {
    public var fileNameInformation: MutPtr<FltFileNameInformation> = fileNameInformationCtorArg
        internal set

    public constructor() : this(
        instance = 0L,
        volume = 0L,
        fileNameInformationCtorArg = MutPtr(0L),
        flags = 0u,
    )

    public operator fun component1(): PfltInstance = this.instance

    public operator fun component2(): PfltVolume = this.volume

    public operator fun component3(): MutPtr<FltFileNameInformation> = this.fileNameInformation

    public operator fun component4(): UShort = this.flags

    public fun copy(instance: PfltInstance = this.instance, volume: PfltVolume = this.volume, fileNameInformation: MutPtr<FltFileNameInformation> = this.fileNameInformation, flags: UShort = this.flags): FltCreatefileTargetEcpContext = FltCreatefileTargetEcpContext(instance = instance, volume = volume, fileNameInformationCtorArg = fileNameInformation, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltCreatefileTargetEcpContext) return false
        if (this.instance != other.instance) return false
        if (this.volume != other.volume) return false
        if (this.fileNameInformation != other.fileNameInformation) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.instance.hashCode()
        result = 31 * result + this.volume.hashCode()
        result = 31 * result + this.fileNameInformation.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltCreatefileTargetEcpContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltCreatefileTargetEcpContext> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltCreatefileTargetEcpContext =
                    FltCreatefileTargetEcpContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<FltFileNameInformation>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: FltCreatefileTargetEcpContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.instance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.volume)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<FltFileNameInformation>(64)
                    ).writeNative(addr + 16L, value.fileNameInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.flags)
                }
            }

        public operator fun invoke(
            instance: PfltInstance = 0L,
            volume: PfltVolume = 0L,
            fileNameInformation: MutPtr<FltFileNameInformation> = MutPtr(0L),
            flags: UShort = 0u,
        ): FltCreatefileTargetEcpContext =
            FltCreatefileTargetEcpContext(
                instance = instance,
                volume = volume,
                fileNameInformationCtorArg = fileNameInformation,
                flags = flags,
            )
    }
}

public data class FltFileNameInformation(
    public var size: UShort = 0u,
    public var namesParsed: UShort = 0u,
    public var format: UInt = 0u,
    public var name: UnicodeString = UnicodeString(),
    public var volume: UnicodeString = UnicodeString(),
    public var share: UnicodeString = UnicodeString(),
    public var extension: UnicodeString = UnicodeString(),
    public var stream: UnicodeString = UnicodeString(),
    public var finalComponent: UnicodeString = UnicodeString(),
    public var parentDir: UnicodeString = UnicodeString(),
)

public class FltIoParameterBlock internal constructor(
    public var irpFlags: UInt,
    public var majorFunction: UByte,
    public var minorFunction: UByte,
    public var operationFlags: UByte,
    public var reserved: UByte,
    targetFileObjectCtorArg: MutPtr<FileObject>,
    public var targetInstance: PfltInstance,
    public var parameters: FltParameters,
) {
    public var targetFileObject: MutPtr<FileObject> = targetFileObjectCtorArg
        internal set

    public constructor() : this(
        irpFlags = 0u,
        majorFunction = 0u,
        minorFunction = 0u,
        operationFlags = 0u,
        reserved = 0u,
        targetFileObjectCtorArg = MutPtr(0L),
        targetInstance = 0L,
        parameters = FltParameters(),
    )

    public operator fun component1(): UInt = this.irpFlags

    public operator fun component2(): UByte = this.majorFunction

    public operator fun component3(): UByte = this.minorFunction

    public operator fun component4(): UByte = this.operationFlags

    public operator fun component5(): UByte = this.reserved

    public operator fun component6(): MutPtr<FileObject> = this.targetFileObject

    public operator fun component7(): PfltInstance = this.targetInstance

    public operator fun component8(): FltParameters = this.parameters

    public fun copy(irpFlags: UInt = this.irpFlags, majorFunction: UByte = this.majorFunction, minorFunction: UByte = this.minorFunction, operationFlags: UByte = this.operationFlags, reserved: UByte = this.reserved, targetFileObject: MutPtr<FileObject> = this.targetFileObject, targetInstance: PfltInstance = this.targetInstance, parameters: FltParameters = this.parameters): FltIoParameterBlock = FltIoParameterBlock(irpFlags = irpFlags, majorFunction = majorFunction, minorFunction = minorFunction, operationFlags = operationFlags, reserved = reserved, targetFileObjectCtorArg = targetFileObject, targetInstance = targetInstance, parameters = parameters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltIoParameterBlock) return false
        if (this.irpFlags != other.irpFlags) return false
        if (this.majorFunction != other.majorFunction) return false
        if (this.minorFunction != other.minorFunction) return false
        if (this.operationFlags != other.operationFlags) return false
        if (this.reserved != other.reserved) return false
        if (this.targetFileObject != other.targetFileObject) return false
        if (this.targetInstance != other.targetInstance) return false
        if (this.parameters != other.parameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.irpFlags.hashCode()
        result = 31 * result + this.majorFunction.hashCode()
        result = 31 * result + this.minorFunction.hashCode()
        result = 31 * result + this.operationFlags.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.targetFileObject.hashCode()
        result = 31 * result + this.targetInstance.hashCode()
        result = 31 * result + this.parameters.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            irpFlags: UInt = 0u,
            majorFunction: UByte = 0u,
            minorFunction: UByte = 0u,
            operationFlags: UByte = 0u,
            reserved: UByte = 0u,
            targetFileObject: MutPtr<FileObject> = MutPtr(0L),
            targetInstance: PfltInstance = 0L,
            parameters: FltParameters = FltParameters(),
        ): FltIoParameterBlock =
            FltIoParameterBlock(
                irpFlags = irpFlags,
                majorFunction = majorFunction,
                minorFunction = minorFunction,
                operationFlags = operationFlags,
                reserved = reserved,
                targetFileObjectCtorArg = targetFileObject,
                targetInstance = targetInstance,
                parameters = parameters,
            )
    }
}

public data class FltNameControl(
    public var name: UnicodeString = UnicodeString(),
)

public class FltOperationRegistration internal constructor(
    public var majorFunction: UByte,
    public var flags: UInt,
    public var preOperation: PfltPreOperationCallback,
    public var postOperation: PfltPostOperationCallback,
    reserved1CtorArg: MutPtr<CVoid>,
) {
    public var reserved1: MutPtr<CVoid> = reserved1CtorArg
        internal set

    public constructor() : this(
        majorFunction = 0u,
        flags = 0u,
        preOperation = null,
        postOperation = null,
        reserved1CtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.majorFunction

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): PfltPreOperationCallback = this.preOperation

    public operator fun component4(): PfltPostOperationCallback = this.postOperation

    public operator fun component5(): MutPtr<CVoid> = this.reserved1

    public fun copy(majorFunction: UByte = this.majorFunction, flags: UInt = this.flags, preOperation: PfltPreOperationCallback = this.preOperation, postOperation: PfltPostOperationCallback = this.postOperation, reserved1: MutPtr<CVoid> = this.reserved1): FltOperationRegistration = FltOperationRegistration(majorFunction = majorFunction, flags = flags, preOperation = preOperation, postOperation = postOperation, reserved1CtorArg = reserved1)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltOperationRegistration) return false
        if (this.majorFunction != other.majorFunction) return false
        if (this.flags != other.flags) return false
        if (this.preOperation != other.preOperation) return false
        if (this.postOperation != other.postOperation) return false
        if (this.reserved1 != other.reserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.majorFunction.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.preOperation.hashCode()
        result = 31 * result + this.postOperation.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            majorFunction: UByte = 0u,
            flags: UInt = 0u,
            preOperation: PfltPreOperationCallback = null,
            postOperation: PfltPostOperationCallback = null,
            reserved1: MutPtr<CVoid> = MutPtr(0L),
        ): FltOperationRegistration =
            FltOperationRegistration(
                majorFunction = majorFunction,
                flags = flags,
                preOperation = preOperation,
                postOperation = postOperation,
                reserved1CtorArg = reserved1,
            )
    }
}

public class FltParameters(
    public var create: FltParameters0 = FltParameters0(),
    public var createPipe: FltParameters1 = FltParameters1(),
    public var createMailslot: FltParameters2 = FltParameters2(),
    public var read: FltParameters3 = FltParameters3(),
    public var write: FltParameters4 = FltParameters4(),
    public var queryFileInformation: FltParameters5 = FltParameters5(),
    public var setFileInformation: FltParameters6 = FltParameters6(),
    public var queryEa: FltParameters7 = FltParameters7(),
    public var setEa: FltParameters8 = FltParameters8(),
    public var queryVolumeInformation: FltParameters9 = FltParameters9(),
    public var setVolumeInformation: FltParameters10 = FltParameters10(),
    public var directoryControl: FltParameters11 = FltParameters11(),
    public var fileSystemControl: FltParameters12 = FltParameters12(),
    public var deviceIoControl: FltParameters13 = FltParameters13(),
    public var lockControl: FltParameters14 = FltParameters14(),
    public var querySecurity: FltParameters15 = FltParameters15(),
    public var setSecurity: FltParameters16 = FltParameters16(),
    public var wmi: FltParameters17 = FltParameters17(),
    public var queryQuota: FltParameters18 = FltParameters18(),
    public var setQuota: FltParameters19 = FltParameters19(),
    public var pnp: FltParameters20 = FltParameters20(),
    public var acquireForSectionSynchronization: FltParameters21 = FltParameters21(),
    public var acquireForModifiedPageWriter: FltParameters22 = FltParameters22(),
    public var releaseForModifiedPageWriter: FltParameters23 = FltParameters23(),
    public var queryOpen: FltParameters24 = FltParameters24(),
    public var fastIoCheckIfPossible: FltParameters25 = FltParameters25(),
    public var networkQueryOpen: FltParameters26 = FltParameters26(),
    public var mdlRead: FltParameters27 = FltParameters27(),
    public var mdlReadComplete: FltParameters28 = FltParameters28(),
    public var prepareMdlWrite: FltParameters29 = FltParameters29(),
    public var mdlWriteComplete: FltParameters30 = FltParameters30(),
    public var mountVolume: FltParameters31 = FltParameters31(),
    public var others: FltParameters32 = FltParameters32(),
)

public class FltParameters22 internal constructor(
    endingOffsetCtorArg: MutPtr<Long>,
    resourceToReleaseCtorArg: MutPtr<MutPtr<Eresource>>,
) {
    public var endingOffset: MutPtr<Long> = endingOffsetCtorArg
        internal set

    public var resourceToRelease: MutPtr<MutPtr<Eresource>> = resourceToReleaseCtorArg
        internal set

    public constructor() : this(
        endingOffsetCtorArg = MutPtr(0L),
        resourceToReleaseCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Long> = this.endingOffset

    public operator fun component2(): MutPtr<MutPtr<Eresource>> = this.resourceToRelease

    public fun copy(endingOffset: MutPtr<Long> = this.endingOffset, resourceToRelease: MutPtr<MutPtr<Eresource>> = this.resourceToRelease): FltParameters22 = FltParameters22(endingOffsetCtorArg = endingOffset, resourceToReleaseCtorArg = resourceToRelease)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters22) return false
        if (this.endingOffset != other.endingOffset) return false
        if (this.resourceToRelease != other.resourceToRelease) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.endingOffset.hashCode()
        result = 31 * result + this.resourceToRelease.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters22> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters22> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters22 =
                    FltParameters22(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Long>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<Eresource>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FltParameters22) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Long>(64)
                    ).writeNative(addr, value.endingOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<Eresource>>(64)
                    ).writeNative(addr + 8L, value.resourceToRelease)
                }
            }

        public operator fun invoke(
            endingOffset: MutPtr<Long> = MutPtr(0L),
            resourceToRelease: MutPtr<MutPtr<Eresource>> = MutPtr(0L),
        ): FltParameters22 =
            FltParameters22(
                endingOffsetCtorArg = endingOffset,
                resourceToReleaseCtorArg = resourceToRelease,
            )
    }
}

public class FltParameters21 internal constructor(
    public var syncType: FsFilterSectionSyncType,
    public var pageProtection: UInt,
    outputInformationCtorArg: MutPtr<FsFilterSectionSyncOutput>,
    public var flags: UInt,
    public var allocationAttributes: UInt,
) {
    public var outputInformation: MutPtr<FsFilterSectionSyncOutput> = outputInformationCtorArg
        internal set

    public constructor() : this(
        syncType = 0,
        pageProtection = 0u,
        outputInformationCtorArg = MutPtr(0L),
        flags = 0u,
        allocationAttributes = 0u,
    )

    public operator fun component1(): FsFilterSectionSyncType = this.syncType

    public operator fun component2(): UInt = this.pageProtection

    public operator fun component3(): MutPtr<FsFilterSectionSyncOutput> = this.outputInformation

    public operator fun component4(): UInt = this.flags

    public operator fun component5(): UInt = this.allocationAttributes

    public fun copy(syncType: FsFilterSectionSyncType = this.syncType, pageProtection: UInt = this.pageProtection, outputInformation: MutPtr<FsFilterSectionSyncOutput> = this.outputInformation, flags: UInt = this.flags, allocationAttributes: UInt = this.allocationAttributes): FltParameters21 = FltParameters21(syncType = syncType, pageProtection = pageProtection, outputInformationCtorArg = outputInformation, flags = flags, allocationAttributes = allocationAttributes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters21) return false
        if (this.syncType != other.syncType) return false
        if (this.pageProtection != other.pageProtection) return false
        if (this.outputInformation != other.outputInformation) return false
        if (this.flags != other.flags) return false
        if (this.allocationAttributes != other.allocationAttributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.syncType.hashCode()
        result = 31 * result + this.pageProtection.hashCode()
        result = 31 * result + this.outputInformation.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.allocationAttributes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            syncType: FsFilterSectionSyncType = 0,
            pageProtection: UInt = 0u,
            outputInformation: MutPtr<FsFilterSectionSyncOutput> = MutPtr(0L),
            flags: UInt = 0u,
            allocationAttributes: UInt = 0u,
        ): FltParameters21 =
            FltParameters21(
                syncType = syncType,
                pageProtection = pageProtection,
                outputInformationCtorArg = outputInformation,
                flags = flags,
                allocationAttributes = allocationAttributes,
            )
    }
}

public class FltParameters2 internal constructor(
    securityContextCtorArg: MutPtr<IoSecurityContext>,
    public var options: UInt,
    public var reserved: UShort,
    public var shareAccess: UShort,
    parametersCtorArg: MutPtr<CVoid>,
) {
    public var securityContext: MutPtr<IoSecurityContext> = securityContextCtorArg
        internal set

    public var parameters: MutPtr<CVoid> = parametersCtorArg
        internal set

    public constructor() : this(
        securityContextCtorArg = MutPtr(0L),
        options = 0u,
        reserved = 0u,
        shareAccess = 0u,
        parametersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<IoSecurityContext> = this.securityContext

    public operator fun component2(): UInt = this.options

    public operator fun component3(): UShort = this.reserved

    public operator fun component4(): UShort = this.shareAccess

    public operator fun component5(): MutPtr<CVoid> = this.parameters

    public fun copy(securityContext: MutPtr<IoSecurityContext> = this.securityContext, options: UInt = this.options, reserved: UShort = this.reserved, shareAccess: UShort = this.shareAccess, parameters: MutPtr<CVoid> = this.parameters): FltParameters2 = FltParameters2(securityContextCtorArg = securityContext, options = options, reserved = reserved, shareAccess = shareAccess, parametersCtorArg = parameters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters2) return false
        if (this.securityContext != other.securityContext) return false
        if (this.options != other.options) return false
        if (this.reserved != other.reserved) return false
        if (this.shareAccess != other.shareAccess) return false
        if (this.parameters != other.parameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityContext.hashCode()
        result = 31 * result + this.options.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.shareAccess.hashCode()
        result = 31 * result + this.parameters.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters2> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters2 =
                    FltParameters2(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IoSecurityContext>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: FltParameters2) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IoSecurityContext>(64)
                    ).writeNative(addr, value.securityContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.options)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.shareAccess)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.parameters)
                }
            }

        public operator fun invoke(
            securityContext: MutPtr<IoSecurityContext> = MutPtr(0L),
            options: UInt = 0u,
            reserved: UShort = 0u,
            shareAccess: UShort = 0u,
            parameters: MutPtr<CVoid> = MutPtr(0L),
        ): FltParameters2 =
            FltParameters2(
                securityContextCtorArg = securityContext,
                options = options,
                reserved = reserved,
                shareAccess = shareAccess,
                parametersCtorArg = parameters,
            )
    }
}

public class FltParameters1 internal constructor(
    securityContextCtorArg: MutPtr<IoSecurityContext>,
    public var options: UInt,
    public var reserved: UShort,
    public var shareAccess: UShort,
    parametersCtorArg: MutPtr<CVoid>,
) {
    public var securityContext: MutPtr<IoSecurityContext> = securityContextCtorArg
        internal set

    public var parameters: MutPtr<CVoid> = parametersCtorArg
        internal set

    public constructor() : this(
        securityContextCtorArg = MutPtr(0L),
        options = 0u,
        reserved = 0u,
        shareAccess = 0u,
        parametersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<IoSecurityContext> = this.securityContext

    public operator fun component2(): UInt = this.options

    public operator fun component3(): UShort = this.reserved

    public operator fun component4(): UShort = this.shareAccess

    public operator fun component5(): MutPtr<CVoid> = this.parameters

    public fun copy(securityContext: MutPtr<IoSecurityContext> = this.securityContext, options: UInt = this.options, reserved: UShort = this.reserved, shareAccess: UShort = this.shareAccess, parameters: MutPtr<CVoid> = this.parameters): FltParameters1 = FltParameters1(securityContextCtorArg = securityContext, options = options, reserved = reserved, shareAccess = shareAccess, parametersCtorArg = parameters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters1) return false
        if (this.securityContext != other.securityContext) return false
        if (this.options != other.options) return false
        if (this.reserved != other.reserved) return false
        if (this.shareAccess != other.shareAccess) return false
        if (this.parameters != other.parameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityContext.hashCode()
        result = 31 * result + this.options.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.shareAccess.hashCode()
        result = 31 * result + this.parameters.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters1> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters1 =
                    FltParameters1(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IoSecurityContext>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: FltParameters1) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IoSecurityContext>(64)
                    ).writeNative(addr, value.securityContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.options)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.shareAccess)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.parameters)
                }
            }

        public operator fun invoke(
            securityContext: MutPtr<IoSecurityContext> = MutPtr(0L),
            options: UInt = 0u,
            reserved: UShort = 0u,
            shareAccess: UShort = 0u,
            parameters: MutPtr<CVoid> = MutPtr(0L),
        ): FltParameters1 =
            FltParameters1(
                securityContextCtorArg = securityContext,
                options = options,
                reserved = reserved,
                shareAccess = shareAccess,
                parametersCtorArg = parameters,
            )
    }
}

public class FltParameters0 internal constructor(
    securityContextCtorArg: MutPtr<IoSecurityContext>,
    public var options: UInt,
    public var fileAttributes: UShort,
    public var shareAccess: UShort,
    public var eaLength: UInt,
    eaBufferCtorArg: MutPtr<CVoid>,
    public var allocationSize: Long,
) {
    public var securityContext: MutPtr<IoSecurityContext> = securityContextCtorArg
        internal set

    public var eaBuffer: MutPtr<CVoid> = eaBufferCtorArg
        internal set

    public constructor() : this(
        securityContextCtorArg = MutPtr(0L),
        options = 0u,
        fileAttributes = 0u,
        shareAccess = 0u,
        eaLength = 0u,
        eaBufferCtorArg = MutPtr(0L),
        allocationSize = 0L,
    )

    public operator fun component1(): MutPtr<IoSecurityContext> = this.securityContext

    public operator fun component2(): UInt = this.options

    public operator fun component3(): UShort = this.fileAttributes

    public operator fun component4(): UShort = this.shareAccess

    public operator fun component5(): UInt = this.eaLength

    public operator fun component6(): MutPtr<CVoid> = this.eaBuffer

    public operator fun component7(): Long = this.allocationSize

    public fun copy(securityContext: MutPtr<IoSecurityContext> = this.securityContext, options: UInt = this.options, fileAttributes: UShort = this.fileAttributes, shareAccess: UShort = this.shareAccess, eaLength: UInt = this.eaLength, eaBuffer: MutPtr<CVoid> = this.eaBuffer, allocationSize: Long = this.allocationSize): FltParameters0 = FltParameters0(securityContextCtorArg = securityContext, options = options, fileAttributes = fileAttributes, shareAccess = shareAccess, eaLength = eaLength, eaBufferCtorArg = eaBuffer, allocationSize = allocationSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters0) return false
        if (this.securityContext != other.securityContext) return false
        if (this.options != other.options) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.shareAccess != other.shareAccess) return false
        if (this.eaLength != other.eaLength) return false
        if (this.eaBuffer != other.eaBuffer) return false
        if (this.allocationSize != other.allocationSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityContext.hashCode()
        result = 31 * result + this.options.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.shareAccess.hashCode()
        result = 31 * result + this.eaLength.hashCode()
        result = 31 * result + this.eaBuffer.hashCode()
        result = 31 * result + this.allocationSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters0> {
                override val sizeBytes: Long = 36L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FltParameters0 =
                    FltParameters0(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IoSecurityContext>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: FltParameters0) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IoSecurityContext>(64)
                    ).writeNative(addr, value.securityContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.options)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.fileAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.shareAccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.eaLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 20L, value.eaBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 28L, value.allocationSize)
                }
            }

        public operator fun invoke(
            securityContext: MutPtr<IoSecurityContext> = MutPtr(0L),
            options: UInt = 0u,
            fileAttributes: UShort = 0u,
            shareAccess: UShort = 0u,
            eaLength: UInt = 0u,
            eaBuffer: MutPtr<CVoid> = MutPtr(0L),
            allocationSize: Long = 0L,
        ): FltParameters0 =
            FltParameters0(
                securityContextCtorArg = securityContext,
                options = options,
                fileAttributes = fileAttributes,
                shareAccess = shareAccess,
                eaLength = eaLength,
                eaBufferCtorArg = eaBuffer,
                allocationSize = allocationSize,
            )
    }
}

public data class FltParameters13(
    public var common: FltParameters130 = FltParameters130(),
    public var neither: FltParameters131 = FltParameters131(),
    public var buffered: FltParameters132 = FltParameters132(),
    public var direct: FltParameters133 = FltParameters133(),
    public var fastIo: FltParameters134 = FltParameters134(),
)

public class FltParameters132 internal constructor(
    public var outputBufferLength: UInt,
    public var inputBufferLength: UInt,
    public var ioControlCode: UInt,
    systemBufferCtorArg: MutPtr<CVoid>,
) {
    public var systemBuffer: MutPtr<CVoid> = systemBufferCtorArg
        internal set

    public constructor() : this(
        outputBufferLength = 0u,
        inputBufferLength = 0u,
        ioControlCode = 0u,
        systemBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.outputBufferLength

    public operator fun component2(): UInt = this.inputBufferLength

    public operator fun component3(): UInt = this.ioControlCode

    public operator fun component4(): MutPtr<CVoid> = this.systemBuffer

    public fun copy(outputBufferLength: UInt = this.outputBufferLength, inputBufferLength: UInt = this.inputBufferLength, ioControlCode: UInt = this.ioControlCode, systemBuffer: MutPtr<CVoid> = this.systemBuffer): FltParameters132 = FltParameters132(outputBufferLength = outputBufferLength, inputBufferLength = inputBufferLength, ioControlCode = ioControlCode, systemBufferCtorArg = systemBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters132) return false
        if (this.outputBufferLength != other.outputBufferLength) return false
        if (this.inputBufferLength != other.inputBufferLength) return false
        if (this.ioControlCode != other.ioControlCode) return false
        if (this.systemBuffer != other.systemBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.outputBufferLength.hashCode()
        result = 31 * result + this.inputBufferLength.hashCode()
        result = 31 * result + this.ioControlCode.hashCode()
        result = 31 * result + this.systemBuffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters132> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters132> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters132 =
                    FltParameters132(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: FltParameters132) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.outputBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.inputBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ioControlCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.systemBuffer)
                }
            }

        public operator fun invoke(
            outputBufferLength: UInt = 0u,
            inputBufferLength: UInt = 0u,
            ioControlCode: UInt = 0u,
            systemBuffer: MutPtr<CVoid> = MutPtr(0L),
        ): FltParameters132 =
            FltParameters132(
                outputBufferLength = outputBufferLength,
                inputBufferLength = inputBufferLength,
                ioControlCode = ioControlCode,
                systemBufferCtorArg = systemBuffer,
            )
    }
}

public data class FltParameters130(
    public var outputBufferLength: UInt = 0u,
    public var inputBufferLength: UInt = 0u,
    public var ioControlCode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters130> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters130> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FltParameters130 =
                    FltParameters130(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FltParameters130) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.outputBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.inputBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ioControlCode)
                }
            }
    }
}

public class FltParameters133 internal constructor(
    public var outputBufferLength: UInt,
    public var inputBufferLength: UInt,
    public var ioControlCode: UInt,
    inputSystemBufferCtorArg: MutPtr<CVoid>,
    outputBufferCtorArg: MutPtr<CVoid>,
    outputMdlAddressCtorArg: MutPtr<Mdl>,
) {
    public var inputSystemBuffer: MutPtr<CVoid> = inputSystemBufferCtorArg
        internal set

    public var outputBuffer: MutPtr<CVoid> = outputBufferCtorArg
        internal set

    public var outputMdlAddress: MutPtr<Mdl> = outputMdlAddressCtorArg
        internal set

    public constructor() : this(
        outputBufferLength = 0u,
        inputBufferLength = 0u,
        ioControlCode = 0u,
        inputSystemBufferCtorArg = MutPtr(0L),
        outputBufferCtorArg = MutPtr(0L),
        outputMdlAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.outputBufferLength

    public operator fun component2(): UInt = this.inputBufferLength

    public operator fun component3(): UInt = this.ioControlCode

    public operator fun component4(): MutPtr<CVoid> = this.inputSystemBuffer

    public operator fun component5(): MutPtr<CVoid> = this.outputBuffer

    public operator fun component6(): MutPtr<Mdl> = this.outputMdlAddress

    public fun copy(outputBufferLength: UInt = this.outputBufferLength, inputBufferLength: UInt = this.inputBufferLength, ioControlCode: UInt = this.ioControlCode, inputSystemBuffer: MutPtr<CVoid> = this.inputSystemBuffer, outputBuffer: MutPtr<CVoid> = this.outputBuffer, outputMdlAddress: MutPtr<Mdl> = this.outputMdlAddress): FltParameters133 = FltParameters133(outputBufferLength = outputBufferLength, inputBufferLength = inputBufferLength, ioControlCode = ioControlCode, inputSystemBufferCtorArg = inputSystemBuffer, outputBufferCtorArg = outputBuffer, outputMdlAddressCtorArg = outputMdlAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters133) return false
        if (this.outputBufferLength != other.outputBufferLength) return false
        if (this.inputBufferLength != other.inputBufferLength) return false
        if (this.ioControlCode != other.ioControlCode) return false
        if (this.inputSystemBuffer != other.inputSystemBuffer) return false
        if (this.outputBuffer != other.outputBuffer) return false
        if (this.outputMdlAddress != other.outputMdlAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.outputBufferLength.hashCode()
        result = 31 * result + this.inputBufferLength.hashCode()
        result = 31 * result + this.ioControlCode.hashCode()
        result = 31 * result + this.inputSystemBuffer.hashCode()
        result = 31 * result + this.outputBuffer.hashCode()
        result = 31 * result + this.outputMdlAddress.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters133> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters133> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters133 =
                    FltParameters133(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Mdl>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: FltParameters133) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.outputBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.inputBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ioControlCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.inputSystemBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.outputBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Mdl>(64)
                    ).writeNative(addr + 32L, value.outputMdlAddress)
                }
            }

        public operator fun invoke(
            outputBufferLength: UInt = 0u,
            inputBufferLength: UInt = 0u,
            ioControlCode: UInt = 0u,
            inputSystemBuffer: MutPtr<CVoid> = MutPtr(0L),
            outputBuffer: MutPtr<CVoid> = MutPtr(0L),
            outputMdlAddress: MutPtr<Mdl> = MutPtr(0L),
        ): FltParameters133 =
            FltParameters133(
                outputBufferLength = outputBufferLength,
                inputBufferLength = inputBufferLength,
                ioControlCode = ioControlCode,
                inputSystemBufferCtorArg = inputSystemBuffer,
                outputBufferCtorArg = outputBuffer,
                outputMdlAddressCtorArg = outputMdlAddress,
            )
    }
}

public class FltParameters134 internal constructor(
    public var outputBufferLength: UInt,
    public var inputBufferLength: UInt,
    public var ioControlCode: UInt,
    inputBufferCtorArg: MutPtr<CVoid>,
    outputBufferCtorArg: MutPtr<CVoid>,
) {
    public var inputBuffer: MutPtr<CVoid> = inputBufferCtorArg
        internal set

    public var outputBuffer: MutPtr<CVoid> = outputBufferCtorArg
        internal set

    public constructor() : this(
        outputBufferLength = 0u,
        inputBufferLength = 0u,
        ioControlCode = 0u,
        inputBufferCtorArg = MutPtr(0L),
        outputBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.outputBufferLength

    public operator fun component2(): UInt = this.inputBufferLength

    public operator fun component3(): UInt = this.ioControlCode

    public operator fun component4(): MutPtr<CVoid> = this.inputBuffer

    public operator fun component5(): MutPtr<CVoid> = this.outputBuffer

    public fun copy(outputBufferLength: UInt = this.outputBufferLength, inputBufferLength: UInt = this.inputBufferLength, ioControlCode: UInt = this.ioControlCode, inputBuffer: MutPtr<CVoid> = this.inputBuffer, outputBuffer: MutPtr<CVoid> = this.outputBuffer): FltParameters134 = FltParameters134(outputBufferLength = outputBufferLength, inputBufferLength = inputBufferLength, ioControlCode = ioControlCode, inputBufferCtorArg = inputBuffer, outputBufferCtorArg = outputBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters134) return false
        if (this.outputBufferLength != other.outputBufferLength) return false
        if (this.inputBufferLength != other.inputBufferLength) return false
        if (this.ioControlCode != other.ioControlCode) return false
        if (this.inputBuffer != other.inputBuffer) return false
        if (this.outputBuffer != other.outputBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.outputBufferLength.hashCode()
        result = 31 * result + this.inputBufferLength.hashCode()
        result = 31 * result + this.ioControlCode.hashCode()
        result = 31 * result + this.inputBuffer.hashCode()
        result = 31 * result + this.outputBuffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters134> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters134> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters134 =
                    FltParameters134(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: FltParameters134) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.outputBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.inputBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ioControlCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.inputBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.outputBuffer)
                }
            }

        public operator fun invoke(
            outputBufferLength: UInt = 0u,
            inputBufferLength: UInt = 0u,
            ioControlCode: UInt = 0u,
            inputBuffer: MutPtr<CVoid> = MutPtr(0L),
            outputBuffer: MutPtr<CVoid> = MutPtr(0L),
        ): FltParameters134 =
            FltParameters134(
                outputBufferLength = outputBufferLength,
                inputBufferLength = inputBufferLength,
                ioControlCode = ioControlCode,
                inputBufferCtorArg = inputBuffer,
                outputBufferCtorArg = outputBuffer,
            )
    }
}

public class FltParameters131 internal constructor(
    public var outputBufferLength: UInt,
    public var inputBufferLength: UInt,
    public var ioControlCode: UInt,
    inputBufferCtorArg: MutPtr<CVoid>,
    outputBufferCtorArg: MutPtr<CVoid>,
    outputMdlAddressCtorArg: MutPtr<Mdl>,
) {
    public var inputBuffer: MutPtr<CVoid> = inputBufferCtorArg
        internal set

    public var outputBuffer: MutPtr<CVoid> = outputBufferCtorArg
        internal set

    public var outputMdlAddress: MutPtr<Mdl> = outputMdlAddressCtorArg
        internal set

    public constructor() : this(
        outputBufferLength = 0u,
        inputBufferLength = 0u,
        ioControlCode = 0u,
        inputBufferCtorArg = MutPtr(0L),
        outputBufferCtorArg = MutPtr(0L),
        outputMdlAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.outputBufferLength

    public operator fun component2(): UInt = this.inputBufferLength

    public operator fun component3(): UInt = this.ioControlCode

    public operator fun component4(): MutPtr<CVoid> = this.inputBuffer

    public operator fun component5(): MutPtr<CVoid> = this.outputBuffer

    public operator fun component6(): MutPtr<Mdl> = this.outputMdlAddress

    public fun copy(outputBufferLength: UInt = this.outputBufferLength, inputBufferLength: UInt = this.inputBufferLength, ioControlCode: UInt = this.ioControlCode, inputBuffer: MutPtr<CVoid> = this.inputBuffer, outputBuffer: MutPtr<CVoid> = this.outputBuffer, outputMdlAddress: MutPtr<Mdl> = this.outputMdlAddress): FltParameters131 = FltParameters131(outputBufferLength = outputBufferLength, inputBufferLength = inputBufferLength, ioControlCode = ioControlCode, inputBufferCtorArg = inputBuffer, outputBufferCtorArg = outputBuffer, outputMdlAddressCtorArg = outputMdlAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters131) return false
        if (this.outputBufferLength != other.outputBufferLength) return false
        if (this.inputBufferLength != other.inputBufferLength) return false
        if (this.ioControlCode != other.ioControlCode) return false
        if (this.inputBuffer != other.inputBuffer) return false
        if (this.outputBuffer != other.outputBuffer) return false
        if (this.outputMdlAddress != other.outputMdlAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.outputBufferLength.hashCode()
        result = 31 * result + this.inputBufferLength.hashCode()
        result = 31 * result + this.ioControlCode.hashCode()
        result = 31 * result + this.inputBuffer.hashCode()
        result = 31 * result + this.outputBuffer.hashCode()
        result = 31 * result + this.outputMdlAddress.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters131> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters131> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters131 =
                    FltParameters131(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Mdl>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: FltParameters131) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.outputBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.inputBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ioControlCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.inputBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.outputBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Mdl>(64)
                    ).writeNative(addr + 32L, value.outputMdlAddress)
                }
            }

        public operator fun invoke(
            outputBufferLength: UInt = 0u,
            inputBufferLength: UInt = 0u,
            ioControlCode: UInt = 0u,
            inputBuffer: MutPtr<CVoid> = MutPtr(0L),
            outputBuffer: MutPtr<CVoid> = MutPtr(0L),
            outputMdlAddress: MutPtr<Mdl> = MutPtr(0L),
        ): FltParameters131 =
            FltParameters131(
                outputBufferLength = outputBufferLength,
                inputBufferLength = inputBufferLength,
                ioControlCode = ioControlCode,
                inputBufferCtorArg = inputBuffer,
                outputBufferCtorArg = outputBuffer,
                outputMdlAddressCtorArg = outputMdlAddress,
            )
    }
}

public data class FltParameters11(
    public var queryDirectory: FltParameters110 = FltParameters110(),
    public var notifyDirectory: FltParameters111 = FltParameters111(),
    public var notifyDirectoryEx: FltParameters112 = FltParameters112(),
)

public class FltParameters112 internal constructor(
    public var length: UInt,
    public var completionFilter: UInt,
    public var directoryNotifyInformationClass: DirectoryNotifyInformationClass,
    public var spare2: UInt,
    directoryBufferCtorArg: MutPtr<CVoid>,
    mdlAddressCtorArg: MutPtr<Mdl>,
) {
    public var directoryBuffer: MutPtr<CVoid> = directoryBufferCtorArg
        internal set

    public var mdlAddress: MutPtr<Mdl> = mdlAddressCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        completionFilter = 0u,
        directoryNotifyInformationClass = 0,
        spare2 = 0u,
        directoryBufferCtorArg = MutPtr(0L),
        mdlAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): UInt = this.completionFilter

    public operator fun component3(): DirectoryNotifyInformationClass = this.directoryNotifyInformationClass

    public operator fun component4(): UInt = this.spare2

    public operator fun component5(): MutPtr<CVoid> = this.directoryBuffer

    public operator fun component6(): MutPtr<Mdl> = this.mdlAddress

    public fun copy(length: UInt = this.length, completionFilter: UInt = this.completionFilter, directoryNotifyInformationClass: DirectoryNotifyInformationClass = this.directoryNotifyInformationClass, spare2: UInt = this.spare2, directoryBuffer: MutPtr<CVoid> = this.directoryBuffer, mdlAddress: MutPtr<Mdl> = this.mdlAddress): FltParameters112 = FltParameters112(length = length, completionFilter = completionFilter, directoryNotifyInformationClass = directoryNotifyInformationClass, spare2 = spare2, directoryBufferCtorArg = directoryBuffer, mdlAddressCtorArg = mdlAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters112) return false
        if (this.length != other.length) return false
        if (this.completionFilter != other.completionFilter) return false
        if (this.directoryNotifyInformationClass != other.directoryNotifyInformationClass) return false
        if (this.spare2 != other.spare2) return false
        if (this.directoryBuffer != other.directoryBuffer) return false
        if (this.mdlAddress != other.mdlAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.completionFilter.hashCode()
        result = 31 * result + this.directoryNotifyInformationClass.hashCode()
        result = 31 * result + this.spare2.hashCode()
        result = 31 * result + this.directoryBuffer.hashCode()
        result = 31 * result + this.mdlAddress.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UInt = 0u,
            completionFilter: UInt = 0u,
            directoryNotifyInformationClass: DirectoryNotifyInformationClass = 0,
            spare2: UInt = 0u,
            directoryBuffer: MutPtr<CVoid> = MutPtr(0L),
            mdlAddress: MutPtr<Mdl> = MutPtr(0L),
        ): FltParameters112 =
            FltParameters112(
                length = length,
                completionFilter = completionFilter,
                directoryNotifyInformationClass = directoryNotifyInformationClass,
                spare2 = spare2,
                directoryBufferCtorArg = directoryBuffer,
                mdlAddressCtorArg = mdlAddress,
            )
    }
}

public class FltParameters111 internal constructor(
    public var length: UInt,
    public var completionFilter: UInt,
    public var spare1: UInt,
    public var spare2: UInt,
    directoryBufferCtorArg: MutPtr<CVoid>,
    mdlAddressCtorArg: MutPtr<Mdl>,
) {
    public var directoryBuffer: MutPtr<CVoid> = directoryBufferCtorArg
        internal set

    public var mdlAddress: MutPtr<Mdl> = mdlAddressCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        completionFilter = 0u,
        spare1 = 0u,
        spare2 = 0u,
        directoryBufferCtorArg = MutPtr(0L),
        mdlAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): UInt = this.completionFilter

    public operator fun component3(): UInt = this.spare1

    public operator fun component4(): UInt = this.spare2

    public operator fun component5(): MutPtr<CVoid> = this.directoryBuffer

    public operator fun component6(): MutPtr<Mdl> = this.mdlAddress

    public fun copy(length: UInt = this.length, completionFilter: UInt = this.completionFilter, spare1: UInt = this.spare1, spare2: UInt = this.spare2, directoryBuffer: MutPtr<CVoid> = this.directoryBuffer, mdlAddress: MutPtr<Mdl> = this.mdlAddress): FltParameters111 = FltParameters111(length = length, completionFilter = completionFilter, spare1 = spare1, spare2 = spare2, directoryBufferCtorArg = directoryBuffer, mdlAddressCtorArg = mdlAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters111) return false
        if (this.length != other.length) return false
        if (this.completionFilter != other.completionFilter) return false
        if (this.spare1 != other.spare1) return false
        if (this.spare2 != other.spare2) return false
        if (this.directoryBuffer != other.directoryBuffer) return false
        if (this.mdlAddress != other.mdlAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.completionFilter.hashCode()
        result = 31 * result + this.spare1.hashCode()
        result = 31 * result + this.spare2.hashCode()
        result = 31 * result + this.directoryBuffer.hashCode()
        result = 31 * result + this.mdlAddress.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters111> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters111> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters111 =
                    FltParameters111(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Mdl>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: FltParameters111) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.completionFilter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.spare1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.spare2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.directoryBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Mdl>(64)
                    ).writeNative(addr + 24L, value.mdlAddress)
                }
            }

        public operator fun invoke(
            length: UInt = 0u,
            completionFilter: UInt = 0u,
            spare1: UInt = 0u,
            spare2: UInt = 0u,
            directoryBuffer: MutPtr<CVoid> = MutPtr(0L),
            mdlAddress: MutPtr<Mdl> = MutPtr(0L),
        ): FltParameters111 =
            FltParameters111(
                length = length,
                completionFilter = completionFilter,
                spare1 = spare1,
                spare2 = spare2,
                directoryBufferCtorArg = directoryBuffer,
                mdlAddressCtorArg = mdlAddress,
            )
    }
}

public class FltParameters110 internal constructor(
    public var length: UInt,
    fileNameCtorArg: MutPtr<UnicodeString>,
    public var fileInformationClass: FileInformationClass,
    public var fileIndex: UInt,
    directoryBufferCtorArg: MutPtr<CVoid>,
    mdlAddressCtorArg: MutPtr<Mdl>,
) {
    public var fileName: MutPtr<UnicodeString> = fileNameCtorArg
        internal set

    public var directoryBuffer: MutPtr<CVoid> = directoryBufferCtorArg
        internal set

    public var mdlAddress: MutPtr<Mdl> = mdlAddressCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        fileNameCtorArg = MutPtr(0L),
        fileInformationClass = 0,
        fileIndex = 0u,
        directoryBufferCtorArg = MutPtr(0L),
        mdlAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): MutPtr<UnicodeString> = this.fileName

    public operator fun component3(): FileInformationClass = this.fileInformationClass

    public operator fun component4(): UInt = this.fileIndex

    public operator fun component5(): MutPtr<CVoid> = this.directoryBuffer

    public operator fun component6(): MutPtr<Mdl> = this.mdlAddress

    public fun copy(length: UInt = this.length, fileName: MutPtr<UnicodeString> = this.fileName, fileInformationClass: FileInformationClass = this.fileInformationClass, fileIndex: UInt = this.fileIndex, directoryBuffer: MutPtr<CVoid> = this.directoryBuffer, mdlAddress: MutPtr<Mdl> = this.mdlAddress): FltParameters110 = FltParameters110(length = length, fileNameCtorArg = fileName, fileInformationClass = fileInformationClass, fileIndex = fileIndex, directoryBufferCtorArg = directoryBuffer, mdlAddressCtorArg = mdlAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters110) return false
        if (this.length != other.length) return false
        if (this.fileName != other.fileName) return false
        if (this.fileInformationClass != other.fileInformationClass) return false
        if (this.fileIndex != other.fileIndex) return false
        if (this.directoryBuffer != other.directoryBuffer) return false
        if (this.mdlAddress != other.mdlAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.fileName.hashCode()
        result = 31 * result + this.fileInformationClass.hashCode()
        result = 31 * result + this.fileIndex.hashCode()
        result = 31 * result + this.directoryBuffer.hashCode()
        result = 31 * result + this.mdlAddress.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UInt = 0u,
            fileName: MutPtr<UnicodeString> = MutPtr(0L),
            fileInformationClass: FileInformationClass = 0,
            fileIndex: UInt = 0u,
            directoryBuffer: MutPtr<CVoid> = MutPtr(0L),
            mdlAddress: MutPtr<Mdl> = MutPtr(0L),
        ): FltParameters110 =
            FltParameters110(
                length = length,
                fileNameCtorArg = fileName,
                fileInformationClass = fileInformationClass,
                fileIndex = fileIndex,
                directoryBufferCtorArg = directoryBuffer,
                mdlAddressCtorArg = mdlAddress,
            )
    }
}

public data class FltParameters25(
    public var fileOffset: Long = 0L,
    public var length: UInt = 0u,
    public var lockKey: UInt = 0u,
    public var checkForReadOperation: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters25> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters25> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FltParameters25 =
                    FltParameters25(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: FltParameters25) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.fileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.lockKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 16L, value.checkForReadOperation)
                }
            }
    }
}

public data class FltParameters12(
    public var verifyVolume: FltParameters120 = FltParameters120(),
    public var common: FltParameters121 = FltParameters121(),
    public var neither: FltParameters122 = FltParameters122(),
    public var buffered: FltParameters123 = FltParameters123(),
    public var direct: FltParameters124 = FltParameters124(),
)

public class FltParameters123 internal constructor(
    public var outputBufferLength: UInt,
    public var inputBufferLength: UInt,
    public var fsControlCode: UInt,
    systemBufferCtorArg: MutPtr<CVoid>,
) {
    public var systemBuffer: MutPtr<CVoid> = systemBufferCtorArg
        internal set

    public constructor() : this(
        outputBufferLength = 0u,
        inputBufferLength = 0u,
        fsControlCode = 0u,
        systemBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.outputBufferLength

    public operator fun component2(): UInt = this.inputBufferLength

    public operator fun component3(): UInt = this.fsControlCode

    public operator fun component4(): MutPtr<CVoid> = this.systemBuffer

    public fun copy(outputBufferLength: UInt = this.outputBufferLength, inputBufferLength: UInt = this.inputBufferLength, fsControlCode: UInt = this.fsControlCode, systemBuffer: MutPtr<CVoid> = this.systemBuffer): FltParameters123 = FltParameters123(outputBufferLength = outputBufferLength, inputBufferLength = inputBufferLength, fsControlCode = fsControlCode, systemBufferCtorArg = systemBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters123) return false
        if (this.outputBufferLength != other.outputBufferLength) return false
        if (this.inputBufferLength != other.inputBufferLength) return false
        if (this.fsControlCode != other.fsControlCode) return false
        if (this.systemBuffer != other.systemBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.outputBufferLength.hashCode()
        result = 31 * result + this.inputBufferLength.hashCode()
        result = 31 * result + this.fsControlCode.hashCode()
        result = 31 * result + this.systemBuffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters123> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters123> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters123 =
                    FltParameters123(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: FltParameters123) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.outputBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.inputBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fsControlCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.systemBuffer)
                }
            }

        public operator fun invoke(
            outputBufferLength: UInt = 0u,
            inputBufferLength: UInt = 0u,
            fsControlCode: UInt = 0u,
            systemBuffer: MutPtr<CVoid> = MutPtr(0L),
        ): FltParameters123 =
            FltParameters123(
                outputBufferLength = outputBufferLength,
                inputBufferLength = inputBufferLength,
                fsControlCode = fsControlCode,
                systemBufferCtorArg = systemBuffer,
            )
    }
}

public data class FltParameters121(
    public var outputBufferLength: UInt = 0u,
    public var inputBufferLength: UInt = 0u,
    public var fsControlCode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters121> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters121> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FltParameters121 =
                    FltParameters121(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FltParameters121) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.outputBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.inputBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fsControlCode)
                }
            }
    }
}

public class FltParameters124 internal constructor(
    public var outputBufferLength: UInt,
    public var inputBufferLength: UInt,
    public var fsControlCode: UInt,
    inputSystemBufferCtorArg: MutPtr<CVoid>,
    outputBufferCtorArg: MutPtr<CVoid>,
    outputMdlAddressCtorArg: MutPtr<Mdl>,
) {
    public var inputSystemBuffer: MutPtr<CVoid> = inputSystemBufferCtorArg
        internal set

    public var outputBuffer: MutPtr<CVoid> = outputBufferCtorArg
        internal set

    public var outputMdlAddress: MutPtr<Mdl> = outputMdlAddressCtorArg
        internal set

    public constructor() : this(
        outputBufferLength = 0u,
        inputBufferLength = 0u,
        fsControlCode = 0u,
        inputSystemBufferCtorArg = MutPtr(0L),
        outputBufferCtorArg = MutPtr(0L),
        outputMdlAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.outputBufferLength

    public operator fun component2(): UInt = this.inputBufferLength

    public operator fun component3(): UInt = this.fsControlCode

    public operator fun component4(): MutPtr<CVoid> = this.inputSystemBuffer

    public operator fun component5(): MutPtr<CVoid> = this.outputBuffer

    public operator fun component6(): MutPtr<Mdl> = this.outputMdlAddress

    public fun copy(outputBufferLength: UInt = this.outputBufferLength, inputBufferLength: UInt = this.inputBufferLength, fsControlCode: UInt = this.fsControlCode, inputSystemBuffer: MutPtr<CVoid> = this.inputSystemBuffer, outputBuffer: MutPtr<CVoid> = this.outputBuffer, outputMdlAddress: MutPtr<Mdl> = this.outputMdlAddress): FltParameters124 = FltParameters124(outputBufferLength = outputBufferLength, inputBufferLength = inputBufferLength, fsControlCode = fsControlCode, inputSystemBufferCtorArg = inputSystemBuffer, outputBufferCtorArg = outputBuffer, outputMdlAddressCtorArg = outputMdlAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters124) return false
        if (this.outputBufferLength != other.outputBufferLength) return false
        if (this.inputBufferLength != other.inputBufferLength) return false
        if (this.fsControlCode != other.fsControlCode) return false
        if (this.inputSystemBuffer != other.inputSystemBuffer) return false
        if (this.outputBuffer != other.outputBuffer) return false
        if (this.outputMdlAddress != other.outputMdlAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.outputBufferLength.hashCode()
        result = 31 * result + this.inputBufferLength.hashCode()
        result = 31 * result + this.fsControlCode.hashCode()
        result = 31 * result + this.inputSystemBuffer.hashCode()
        result = 31 * result + this.outputBuffer.hashCode()
        result = 31 * result + this.outputMdlAddress.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters124> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters124> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters124 =
                    FltParameters124(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Mdl>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: FltParameters124) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.outputBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.inputBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fsControlCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.inputSystemBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.outputBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Mdl>(64)
                    ).writeNative(addr + 32L, value.outputMdlAddress)
                }
            }

        public operator fun invoke(
            outputBufferLength: UInt = 0u,
            inputBufferLength: UInt = 0u,
            fsControlCode: UInt = 0u,
            inputSystemBuffer: MutPtr<CVoid> = MutPtr(0L),
            outputBuffer: MutPtr<CVoid> = MutPtr(0L),
            outputMdlAddress: MutPtr<Mdl> = MutPtr(0L),
        ): FltParameters124 =
            FltParameters124(
                outputBufferLength = outputBufferLength,
                inputBufferLength = inputBufferLength,
                fsControlCode = fsControlCode,
                inputSystemBufferCtorArg = inputSystemBuffer,
                outputBufferCtorArg = outputBuffer,
                outputMdlAddressCtorArg = outputMdlAddress,
            )
    }
}

public class FltParameters122 internal constructor(
    public var outputBufferLength: UInt,
    public var inputBufferLength: UInt,
    public var fsControlCode: UInt,
    inputBufferCtorArg: MutPtr<CVoid>,
    outputBufferCtorArg: MutPtr<CVoid>,
    outputMdlAddressCtorArg: MutPtr<Mdl>,
) {
    public var inputBuffer: MutPtr<CVoid> = inputBufferCtorArg
        internal set

    public var outputBuffer: MutPtr<CVoid> = outputBufferCtorArg
        internal set

    public var outputMdlAddress: MutPtr<Mdl> = outputMdlAddressCtorArg
        internal set

    public constructor() : this(
        outputBufferLength = 0u,
        inputBufferLength = 0u,
        fsControlCode = 0u,
        inputBufferCtorArg = MutPtr(0L),
        outputBufferCtorArg = MutPtr(0L),
        outputMdlAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.outputBufferLength

    public operator fun component2(): UInt = this.inputBufferLength

    public operator fun component3(): UInt = this.fsControlCode

    public operator fun component4(): MutPtr<CVoid> = this.inputBuffer

    public operator fun component5(): MutPtr<CVoid> = this.outputBuffer

    public operator fun component6(): MutPtr<Mdl> = this.outputMdlAddress

    public fun copy(outputBufferLength: UInt = this.outputBufferLength, inputBufferLength: UInt = this.inputBufferLength, fsControlCode: UInt = this.fsControlCode, inputBuffer: MutPtr<CVoid> = this.inputBuffer, outputBuffer: MutPtr<CVoid> = this.outputBuffer, outputMdlAddress: MutPtr<Mdl> = this.outputMdlAddress): FltParameters122 = FltParameters122(outputBufferLength = outputBufferLength, inputBufferLength = inputBufferLength, fsControlCode = fsControlCode, inputBufferCtorArg = inputBuffer, outputBufferCtorArg = outputBuffer, outputMdlAddressCtorArg = outputMdlAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters122) return false
        if (this.outputBufferLength != other.outputBufferLength) return false
        if (this.inputBufferLength != other.inputBufferLength) return false
        if (this.fsControlCode != other.fsControlCode) return false
        if (this.inputBuffer != other.inputBuffer) return false
        if (this.outputBuffer != other.outputBuffer) return false
        if (this.outputMdlAddress != other.outputMdlAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.outputBufferLength.hashCode()
        result = 31 * result + this.inputBufferLength.hashCode()
        result = 31 * result + this.fsControlCode.hashCode()
        result = 31 * result + this.inputBuffer.hashCode()
        result = 31 * result + this.outputBuffer.hashCode()
        result = 31 * result + this.outputMdlAddress.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters122> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters122> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters122 =
                    FltParameters122(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Mdl>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: FltParameters122) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.outputBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.inputBufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fsControlCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.inputBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.outputBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Mdl>(64)
                    ).writeNative(addr + 32L, value.outputMdlAddress)
                }
            }

        public operator fun invoke(
            outputBufferLength: UInt = 0u,
            inputBufferLength: UInt = 0u,
            fsControlCode: UInt = 0u,
            inputBuffer: MutPtr<CVoid> = MutPtr(0L),
            outputBuffer: MutPtr<CVoid> = MutPtr(0L),
            outputMdlAddress: MutPtr<Mdl> = MutPtr(0L),
        ): FltParameters122 =
            FltParameters122(
                outputBufferLength = outputBufferLength,
                inputBufferLength = inputBufferLength,
                fsControlCode = fsControlCode,
                inputBufferCtorArg = inputBuffer,
                outputBufferCtorArg = outputBuffer,
                outputMdlAddressCtorArg = outputMdlAddress,
            )
    }
}

public class FltParameters120 internal constructor(
    vpbCtorArg: MutPtr<Vpb>,
    deviceObjectCtorArg: MutPtr<DeviceObject>,
) {
    public var vpb: MutPtr<Vpb> = vpbCtorArg
        internal set

    public var deviceObject: MutPtr<DeviceObject> = deviceObjectCtorArg
        internal set

    public constructor() : this(
        vpbCtorArg = MutPtr(0L),
        deviceObjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Vpb> = this.vpb

    public operator fun component2(): MutPtr<DeviceObject> = this.deviceObject

    public fun copy(vpb: MutPtr<Vpb> = this.vpb, deviceObject: MutPtr<DeviceObject> = this.deviceObject): FltParameters120 = FltParameters120(vpbCtorArg = vpb, deviceObjectCtorArg = deviceObject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters120) return false
        if (this.vpb != other.vpb) return false
        if (this.deviceObject != other.deviceObject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.vpb.hashCode()
        result = 31 * result + this.deviceObject.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters120> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters120> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters120 =
                    FltParameters120(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Vpb>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DeviceObject>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FltParameters120) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Vpb>(64)
                    ).writeNative(addr, value.vpb)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DeviceObject>(64)
                    ).writeNative(addr + 8L, value.deviceObject)
                }
            }

        public operator fun invoke(
            vpb: MutPtr<Vpb> = MutPtr(0L),
            deviceObject: MutPtr<DeviceObject> = MutPtr(0L),
        ): FltParameters120 =
            FltParameters120(
                vpbCtorArg = vpb,
                deviceObjectCtorArg = deviceObject,
            )
    }
}

public class FltParameters14 internal constructor(
    lengthCtorArg: MutPtr<Long>,
    public var key: UInt,
    public var byteOffset: Long,
    public var processId: Peprocess,
    public var failImmediately: Boolean,
    public var exclusiveLock: Boolean,
) {
    public var length: MutPtr<Long> = lengthCtorArg
        internal set

    public constructor() : this(
        lengthCtorArg = MutPtr(0L),
        key = 0u,
        byteOffset = 0L,
        processId = 0L,
        failImmediately = false,
        exclusiveLock = false,
    )

    public operator fun component1(): MutPtr<Long> = this.length

    public operator fun component2(): UInt = this.key

    public operator fun component3(): Long = this.byteOffset

    public operator fun component4(): Peprocess = this.processId

    public operator fun component5(): Boolean = this.failImmediately

    public operator fun component6(): Boolean = this.exclusiveLock

    public fun copy(length: MutPtr<Long> = this.length, key: UInt = this.key, byteOffset: Long = this.byteOffset, processId: Peprocess = this.processId, failImmediately: Boolean = this.failImmediately, exclusiveLock: Boolean = this.exclusiveLock): FltParameters14 = FltParameters14(lengthCtorArg = length, key = key, byteOffset = byteOffset, processId = processId, failImmediately = failImmediately, exclusiveLock = exclusiveLock)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters14) return false
        if (this.length != other.length) return false
        if (this.key != other.key) return false
        if (this.byteOffset != other.byteOffset) return false
        if (this.processId != other.processId) return false
        if (this.failImmediately != other.failImmediately) return false
        if (this.exclusiveLock != other.exclusiveLock) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.key.hashCode()
        result = 31 * result + this.byteOffset.hashCode()
        result = 31 * result + this.processId.hashCode()
        result = 31 * result + this.failImmediately.hashCode()
        result = 31 * result + this.exclusiveLock.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: MutPtr<Long> = MutPtr(0L),
            key: UInt = 0u,
            byteOffset: Long = 0L,
            processId: Peprocess = 0L,
            failImmediately: Boolean = false,
            exclusiveLock: Boolean = false,
        ): FltParameters14 =
            FltParameters14(
                lengthCtorArg = length,
                key = key,
                byteOffset = byteOffset,
                processId = processId,
                failImmediately = failImmediately,
                exclusiveLock = exclusiveLock,
            )
    }
}

public class FltParameters28 internal constructor(
    mdlChainCtorArg: MutPtr<Mdl>,
) {
    public var mdlChain: MutPtr<Mdl> = mdlChainCtorArg
        internal set

    public constructor() : this(
        mdlChainCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Mdl> = this.mdlChain

    public fun copy(mdlChain: MutPtr<Mdl> = this.mdlChain): FltParameters28 = FltParameters28(mdlChainCtorArg = mdlChain)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters28) return false
        if (this.mdlChain != other.mdlChain) return false
        return true
    }

    override fun hashCode(): Int = this.mdlChain.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters28> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters28> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters28 =
                    FltParameters28(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Mdl>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FltParameters28) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Mdl>(64)
                    ).writeNative(addr, value.mdlChain)
                }
            }

        public operator fun invoke(
            mdlChain: MutPtr<Mdl> = MutPtr(0L),
        ): FltParameters28 =
            FltParameters28(
                mdlChainCtorArg = mdlChain,
            )
    }
}

public class FltParameters27 internal constructor(
    public var fileOffset: Long,
    public var length: UInt,
    public var key: UInt,
    mdlChainCtorArg: MutPtr<MutPtr<Mdl>>,
) {
    public var mdlChain: MutPtr<MutPtr<Mdl>> = mdlChainCtorArg
        internal set

    public constructor() : this(
        fileOffset = 0L,
        length = 0u,
        key = 0u,
        mdlChainCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Long = this.fileOffset

    public operator fun component2(): UInt = this.length

    public operator fun component3(): UInt = this.key

    public operator fun component4(): MutPtr<MutPtr<Mdl>> = this.mdlChain

    public fun copy(fileOffset: Long = this.fileOffset, length: UInt = this.length, key: UInt = this.key, mdlChain: MutPtr<MutPtr<Mdl>> = this.mdlChain): FltParameters27 = FltParameters27(fileOffset = fileOffset, length = length, key = key, mdlChainCtorArg = mdlChain)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters27) return false
        if (this.fileOffset != other.fileOffset) return false
        if (this.length != other.length) return false
        if (this.key != other.key) return false
        if (this.mdlChain != other.mdlChain) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileOffset.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.key.hashCode()
        result = 31 * result + this.mdlChain.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters27> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters27> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FltParameters27 =
                    FltParameters27(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<Mdl>>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: FltParameters27) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.fileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.key)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<Mdl>>(64)
                    ).writeNative(addr + 16L, value.mdlChain)
                }
            }

        public operator fun invoke(
            fileOffset: Long = 0L,
            length: UInt = 0u,
            key: UInt = 0u,
            mdlChain: MutPtr<MutPtr<Mdl>> = MutPtr(0L),
        ): FltParameters27 =
            FltParameters27(
                fileOffset = fileOffset,
                length = length,
                key = key,
                mdlChainCtorArg = mdlChain,
            )
    }
}

public class FltParameters30 internal constructor(
    public var fileOffset: Long,
    mdlChainCtorArg: MutPtr<Mdl>,
) {
    public var mdlChain: MutPtr<Mdl> = mdlChainCtorArg
        internal set

    public constructor() : this(
        fileOffset = 0L,
        mdlChainCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Long = this.fileOffset

    public operator fun component2(): MutPtr<Mdl> = this.mdlChain

    public fun copy(fileOffset: Long = this.fileOffset, mdlChain: MutPtr<Mdl> = this.mdlChain): FltParameters30 = FltParameters30(fileOffset = fileOffset, mdlChainCtorArg = mdlChain)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters30) return false
        if (this.fileOffset != other.fileOffset) return false
        if (this.mdlChain != other.mdlChain) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileOffset.hashCode()
        result = 31 * result + this.mdlChain.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters30> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters30> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FltParameters30 =
                    FltParameters30(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Mdl>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FltParameters30) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.fileOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Mdl>(64)
                    ).writeNative(addr + 8L, value.mdlChain)
                }
            }

        public operator fun invoke(
            fileOffset: Long = 0L,
            mdlChain: MutPtr<Mdl> = MutPtr(0L),
        ): FltParameters30 =
            FltParameters30(
                fileOffset = fileOffset,
                mdlChainCtorArg = mdlChain,
            )
    }
}

public data class FltParameters31(
    public var deviceType: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters31> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters31> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FltParameters31 =
                    FltParameters31(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FltParameters31) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.deviceType)
                }
            }
    }
}

public class FltParameters26 internal constructor(
    irpCtorArg: MutPtr<Irp>,
    networkInformationCtorArg: MutPtr<FileNetworkOpenInformation>,
) {
    public var irp: MutPtr<Irp> = irpCtorArg
        internal set

    public var networkInformation: MutPtr<FileNetworkOpenInformation> = networkInformationCtorArg
        internal set

    public constructor() : this(
        irpCtorArg = MutPtr(0L),
        networkInformationCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Irp> = this.irp

    public operator fun component2(): MutPtr<FileNetworkOpenInformation> = this.networkInformation

    public fun copy(irp: MutPtr<Irp> = this.irp, networkInformation: MutPtr<FileNetworkOpenInformation> = this.networkInformation): FltParameters26 = FltParameters26(irpCtorArg = irp, networkInformationCtorArg = networkInformation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters26) return false
        if (this.irp != other.irp) return false
        if (this.networkInformation != other.networkInformation) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.irp.hashCode()
        result = 31 * result + this.networkInformation.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters26> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters26> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters26 =
                    FltParameters26(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Irp>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<FileNetworkOpenInformation>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FltParameters26) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Irp>(64)
                    ).writeNative(addr, value.irp)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<FileNetworkOpenInformation>(64)
                    ).writeNative(addr + 8L, value.networkInformation)
                }
            }

        public operator fun invoke(
            irp: MutPtr<Irp> = MutPtr(0L),
            networkInformation: MutPtr<FileNetworkOpenInformation> = MutPtr(0L),
        ): FltParameters26 =
            FltParameters26(
                irpCtorArg = irp,
                networkInformationCtorArg = networkInformation,
            )
    }
}

public class FltParameters32 internal constructor(
    argument1CtorArg: MutPtr<CVoid>,
    argument2CtorArg: MutPtr<CVoid>,
    argument3CtorArg: MutPtr<CVoid>,
    argument4CtorArg: MutPtr<CVoid>,
    argument5CtorArg: MutPtr<CVoid>,
    public var argument6: Long,
) {
    public var argument1: MutPtr<CVoid> = argument1CtorArg
        internal set

    public var argument2: MutPtr<CVoid> = argument2CtorArg
        internal set

    public var argument3: MutPtr<CVoid> = argument3CtorArg
        internal set

    public var argument4: MutPtr<CVoid> = argument4CtorArg
        internal set

    public var argument5: MutPtr<CVoid> = argument5CtorArg
        internal set

    public constructor() : this(
        argument1CtorArg = MutPtr(0L),
        argument2CtorArg = MutPtr(0L),
        argument3CtorArg = MutPtr(0L),
        argument4CtorArg = MutPtr(0L),
        argument5CtorArg = MutPtr(0L),
        argument6 = 0L,
    )

    public operator fun component1(): MutPtr<CVoid> = this.argument1

    public operator fun component2(): MutPtr<CVoid> = this.argument2

    public operator fun component3(): MutPtr<CVoid> = this.argument3

    public operator fun component4(): MutPtr<CVoid> = this.argument4

    public operator fun component5(): MutPtr<CVoid> = this.argument5

    public operator fun component6(): Long = this.argument6

    public fun copy(argument1: MutPtr<CVoid> = this.argument1, argument2: MutPtr<CVoid> = this.argument2, argument3: MutPtr<CVoid> = this.argument3, argument4: MutPtr<CVoid> = this.argument4, argument5: MutPtr<CVoid> = this.argument5, argument6: Long = this.argument6): FltParameters32 = FltParameters32(argument1CtorArg = argument1, argument2CtorArg = argument2, argument3CtorArg = argument3, argument4CtorArg = argument4, argument5CtorArg = argument5, argument6 = argument6)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters32) return false
        if (this.argument1 != other.argument1) return false
        if (this.argument2 != other.argument2) return false
        if (this.argument3 != other.argument3) return false
        if (this.argument4 != other.argument4) return false
        if (this.argument5 != other.argument5) return false
        if (this.argument6 != other.argument6) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.argument1.hashCode()
        result = 31 * result + this.argument2.hashCode()
        result = 31 * result + this.argument3.hashCode()
        result = 31 * result + this.argument4.hashCode()
        result = 31 * result + this.argument5.hashCode()
        result = 31 * result + this.argument6.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters32> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FltParameters32 =
                    FltParameters32(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: FltParameters32) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.argument1)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.argument2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.argument3)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.argument4)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.argument5)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.argument6)
                }
            }

        public operator fun invoke(
            argument1: MutPtr<CVoid> = MutPtr(0L),
            argument2: MutPtr<CVoid> = MutPtr(0L),
            argument3: MutPtr<CVoid> = MutPtr(0L),
            argument4: MutPtr<CVoid> = MutPtr(0L),
            argument5: MutPtr<CVoid> = MutPtr(0L),
            argument6: Long = 0L,
        ): FltParameters32 =
            FltParameters32(
                argument1CtorArg = argument1,
                argument2CtorArg = argument2,
                argument3CtorArg = argument3,
                argument4CtorArg = argument4,
                argument5CtorArg = argument5,
                argument6 = argument6,
            )
    }
}

public data class FltParameters20(
    public var startDevice: FltParameters200 = FltParameters200(),
    public var queryDeviceRelations: FltParameters201 = FltParameters201(),
    public var queryInterface: FltParameters202 = FltParameters202(),
    public var deviceCapabilities: FltParameters203 = FltParameters203(),
    public var filterResourceRequirements: FltParameters204 = FltParameters204(),
    public var readWriteConfig: FltParameters205 = FltParameters205(),
    public var setLock: FltParameters206 = FltParameters206(),
    public var queryId: FltParameters207 = FltParameters207(),
    public var queryDeviceText: FltParameters208 = FltParameters208(),
    public var usageNotification: FltParameters209 = FltParameters209(),
)

public class FltParameters203 internal constructor(
    capabilitiesCtorArg: MutPtr<DeviceCapabilities>,
) {
    public var capabilities: MutPtr<DeviceCapabilities> = capabilitiesCtorArg
        internal set

    public constructor() : this(
        capabilitiesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<DeviceCapabilities> = this.capabilities

    public fun copy(capabilities: MutPtr<DeviceCapabilities> = this.capabilities): FltParameters203 = FltParameters203(capabilitiesCtorArg = capabilities)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters203) return false
        if (this.capabilities != other.capabilities) return false
        return true
    }

    override fun hashCode(): Int = this.capabilities.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters203> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters203> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters203 =
                    FltParameters203(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<DeviceCapabilities>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FltParameters203) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<DeviceCapabilities>(64)
                    ).writeNative(addr, value.capabilities)
                }
            }

        public operator fun invoke(
            capabilities: MutPtr<DeviceCapabilities> = MutPtr(0L),
        ): FltParameters203 =
            FltParameters203(
                capabilitiesCtorArg = capabilities,
            )
    }
}

public class FltParameters204 internal constructor(
    ioResourceRequirementListCtorArg: MutPtr<IoResourceRequirementsList>,
) {
    public var ioResourceRequirementList: MutPtr<IoResourceRequirementsList> = ioResourceRequirementListCtorArg
        internal set

    public constructor() : this(
        ioResourceRequirementListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<IoResourceRequirementsList> = this.ioResourceRequirementList

    public fun copy(ioResourceRequirementList: MutPtr<IoResourceRequirementsList> = this.ioResourceRequirementList): FltParameters204 = FltParameters204(ioResourceRequirementListCtorArg = ioResourceRequirementList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters204) return false
        if (this.ioResourceRequirementList != other.ioResourceRequirementList) return false
        return true
    }

    override fun hashCode(): Int = this.ioResourceRequirementList.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters204> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters204> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters204 =
                    FltParameters204(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IoResourceRequirementsList>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FltParameters204) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IoResourceRequirementsList>(64)
                    ).writeNative(addr, value.ioResourceRequirementList)
                }
            }

        public operator fun invoke(
            ioResourceRequirementList: MutPtr<IoResourceRequirementsList> = MutPtr(0L),
        ): FltParameters204 =
            FltParameters204(
                ioResourceRequirementListCtorArg = ioResourceRequirementList,
            )
    }
}

public data class FltParameters201(
    public var type: DeviceRelationType = 0,
)

public data class FltParameters208(
    public var deviceTextType: DeviceTextType = 0,
    public var localeId: UInt = 0u,
)

public data class FltParameters207(
    public var idType: BusQueryIdType = 0,
)

public class FltParameters202 internal constructor(
    interfaceTypeCtorArg: ConstPtr<Guid>,
    public var size: UShort,
    public var version: UShort,
    ifaceCtorArg: MutPtr<Interface>,
    interfaceSpecificDataCtorArg: MutPtr<CVoid>,
) {
    public var interfaceType: ConstPtr<Guid> = interfaceTypeCtorArg
        internal set

    public var iface: MutPtr<Interface> = ifaceCtorArg
        internal set

    public var interfaceSpecificData: MutPtr<CVoid> = interfaceSpecificDataCtorArg
        internal set

    public constructor() : this(
        interfaceTypeCtorArg = ConstPtr(0L),
        size = 0u,
        version = 0u,
        ifaceCtorArg = MutPtr(0L),
        interfaceSpecificDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ConstPtr<Guid> = this.interfaceType

    public operator fun component2(): UShort = this.size

    public operator fun component3(): UShort = this.version

    public operator fun component4(): MutPtr<Interface> = this.iface

    public operator fun component5(): MutPtr<CVoid> = this.interfaceSpecificData

    public fun copy(interfaceType: ConstPtr<Guid> = this.interfaceType, size: UShort = this.size, version: UShort = this.version, iface: MutPtr<Interface> = this.iface, interfaceSpecificData: MutPtr<CVoid> = this.interfaceSpecificData): FltParameters202 = FltParameters202(interfaceTypeCtorArg = interfaceType, size = size, version = version, ifaceCtorArg = iface, interfaceSpecificDataCtorArg = interfaceSpecificData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters202) return false
        if (this.interfaceType != other.interfaceType) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.iface != other.iface) return false
        if (this.interfaceSpecificData != other.interfaceSpecificData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.interfaceType.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.iface.hashCode()
        result = 31 * result + this.interfaceSpecificData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters202> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters202> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters202 =
                    FltParameters202(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<Guid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Interface>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: FltParameters202) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<Guid>(64)
                    ).writeNative(addr, value.interfaceType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.version)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Interface>(64)
                    ).writeNative(addr + 16L, value.iface)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.interfaceSpecificData)
                }
            }

        public operator fun invoke(
            interfaceType: ConstPtr<Guid> = ConstPtr(0L),
            size: UShort = 0u,
            version: UShort = 0u,
            iface: MutPtr<Interface> = MutPtr(0L),
            interfaceSpecificData: MutPtr<CVoid> = MutPtr(0L),
        ): FltParameters202 =
            FltParameters202(
                interfaceTypeCtorArg = interfaceType,
                size = size,
                version = version,
                ifaceCtorArg = iface,
                interfaceSpecificDataCtorArg = interfaceSpecificData,
            )
    }
}

public class FltParameters205 internal constructor(
    public var whichSpace: UInt,
    bufferCtorArg: MutPtr<CVoid>,
    public var offset: UInt,
    public var length: UInt,
) {
    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public constructor() : this(
        whichSpace = 0u,
        bufferCtorArg = MutPtr(0L),
        offset = 0u,
        length = 0u,
    )

    public operator fun component1(): UInt = this.whichSpace

    public operator fun component2(): MutPtr<CVoid> = this.buffer

    public operator fun component3(): UInt = this.offset

    public operator fun component4(): UInt = this.length

    public fun copy(whichSpace: UInt = this.whichSpace, buffer: MutPtr<CVoid> = this.buffer, offset: UInt = this.offset, length: UInt = this.length): FltParameters205 = FltParameters205(whichSpace = whichSpace, bufferCtorArg = buffer, offset = offset, length = length)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters205) return false
        if (this.whichSpace != other.whichSpace) return false
        if (this.buffer != other.buffer) return false
        if (this.offset != other.offset) return false
        if (this.length != other.length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.whichSpace.hashCode()
        result = 31 * result + this.buffer.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.length.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters205> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters205> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters205 =
                    FltParameters205(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: FltParameters205) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.whichSpace)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.buffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.length)
                }
            }

        public operator fun invoke(
            whichSpace: UInt = 0u,
            buffer: MutPtr<CVoid> = MutPtr(0L),
            offset: UInt = 0u,
            length: UInt = 0u,
        ): FltParameters205 =
            FltParameters205(
                whichSpace = whichSpace,
                bufferCtorArg = buffer,
                offset = offset,
                length = length,
            )
    }
}

public data class FltParameters206(
    public var lock: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters206> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters206> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): FltParameters206 =
                    FltParameters206(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FltParameters206) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.lock)
                }
            }
    }
}

public class FltParameters200 internal constructor(
    allocatedResourcesCtorArg: MutPtr<CmResourceList>,
    allocatedResourcesTranslatedCtorArg: MutPtr<CmResourceList>,
) {
    public var allocatedResources: MutPtr<CmResourceList> = allocatedResourcesCtorArg
        internal set

    public var allocatedResourcesTranslated: MutPtr<CmResourceList> = allocatedResourcesTranslatedCtorArg
        internal set

    public constructor() : this(
        allocatedResourcesCtorArg = MutPtr(0L),
        allocatedResourcesTranslatedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CmResourceList> = this.allocatedResources

    public operator fun component2(): MutPtr<CmResourceList> = this.allocatedResourcesTranslated

    public fun copy(allocatedResources: MutPtr<CmResourceList> = this.allocatedResources, allocatedResourcesTranslated: MutPtr<CmResourceList> = this.allocatedResourcesTranslated): FltParameters200 = FltParameters200(allocatedResourcesCtorArg = allocatedResources, allocatedResourcesTranslatedCtorArg = allocatedResourcesTranslated)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters200) return false
        if (this.allocatedResources != other.allocatedResources) return false
        if (this.allocatedResourcesTranslated != other.allocatedResourcesTranslated) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.allocatedResources.hashCode()
        result = 31 * result + this.allocatedResourcesTranslated.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters200> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters200> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters200 =
                    FltParameters200(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CmResourceList>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CmResourceList>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FltParameters200) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CmResourceList>(64)
                    ).writeNative(addr, value.allocatedResources)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CmResourceList>(64)
                    ).writeNative(addr + 8L, value.allocatedResourcesTranslated)
                }
            }

        public operator fun invoke(
            allocatedResources: MutPtr<CmResourceList> = MutPtr(0L),
            allocatedResourcesTranslated: MutPtr<CmResourceList> = MutPtr(0L),
        ): FltParameters200 =
            FltParameters200(
                allocatedResourcesCtorArg = allocatedResources,
                allocatedResourcesTranslatedCtorArg = allocatedResourcesTranslated,
            )
    }
}

public data class FltParameters209(
    public var inPath: Boolean = false,
    public var reserved: BooleanArray = BooleanArray(3),
    public var type: DeviceUsageNotificationType = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters209) return false
        if (this.inPath != other.inPath) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.type != other.type) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inPath.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.type.hashCode()
        return result
    }
}

public class FltParameters29 internal constructor(
    public var fileOffset: Long,
    public var length: UInt,
    public var key: UInt,
    mdlChainCtorArg: MutPtr<MutPtr<Mdl>>,
) {
    public var mdlChain: MutPtr<MutPtr<Mdl>> = mdlChainCtorArg
        internal set

    public constructor() : this(
        fileOffset = 0L,
        length = 0u,
        key = 0u,
        mdlChainCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Long = this.fileOffset

    public operator fun component2(): UInt = this.length

    public operator fun component3(): UInt = this.key

    public operator fun component4(): MutPtr<MutPtr<Mdl>> = this.mdlChain

    public fun copy(fileOffset: Long = this.fileOffset, length: UInt = this.length, key: UInt = this.key, mdlChain: MutPtr<MutPtr<Mdl>> = this.mdlChain): FltParameters29 = FltParameters29(fileOffset = fileOffset, length = length, key = key, mdlChainCtorArg = mdlChain)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters29) return false
        if (this.fileOffset != other.fileOffset) return false
        if (this.length != other.length) return false
        if (this.key != other.key) return false
        if (this.mdlChain != other.mdlChain) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileOffset.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.key.hashCode()
        result = 31 * result + this.mdlChain.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters29> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters29> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FltParameters29 =
                    FltParameters29(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<Mdl>>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: FltParameters29) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.fileOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.key)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<Mdl>>(64)
                    ).writeNative(addr + 16L, value.mdlChain)
                }
            }

        public operator fun invoke(
            fileOffset: Long = 0L,
            length: UInt = 0u,
            key: UInt = 0u,
            mdlChain: MutPtr<MutPtr<Mdl>> = MutPtr(0L),
        ): FltParameters29 =
            FltParameters29(
                fileOffset = fileOffset,
                length = length,
                key = key,
                mdlChainCtorArg = mdlChain,
            )
    }
}

public class FltParameters7 internal constructor(
    public var length: UInt,
    eaListCtorArg: MutPtr<CVoid>,
    public var eaListLength: UInt,
    public var eaIndex: UInt,
    eaBufferCtorArg: MutPtr<CVoid>,
    mdlAddressCtorArg: MutPtr<Mdl>,
) {
    public var eaList: MutPtr<CVoid> = eaListCtorArg
        internal set

    public var eaBuffer: MutPtr<CVoid> = eaBufferCtorArg
        internal set

    public var mdlAddress: MutPtr<Mdl> = mdlAddressCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        eaListCtorArg = MutPtr(0L),
        eaListLength = 0u,
        eaIndex = 0u,
        eaBufferCtorArg = MutPtr(0L),
        mdlAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): MutPtr<CVoid> = this.eaList

    public operator fun component3(): UInt = this.eaListLength

    public operator fun component4(): UInt = this.eaIndex

    public operator fun component5(): MutPtr<CVoid> = this.eaBuffer

    public operator fun component6(): MutPtr<Mdl> = this.mdlAddress

    public fun copy(length: UInt = this.length, eaList: MutPtr<CVoid> = this.eaList, eaListLength: UInt = this.eaListLength, eaIndex: UInt = this.eaIndex, eaBuffer: MutPtr<CVoid> = this.eaBuffer, mdlAddress: MutPtr<Mdl> = this.mdlAddress): FltParameters7 = FltParameters7(length = length, eaListCtorArg = eaList, eaListLength = eaListLength, eaIndex = eaIndex, eaBufferCtorArg = eaBuffer, mdlAddressCtorArg = mdlAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters7) return false
        if (this.length != other.length) return false
        if (this.eaList != other.eaList) return false
        if (this.eaListLength != other.eaListLength) return false
        if (this.eaIndex != other.eaIndex) return false
        if (this.eaBuffer != other.eaBuffer) return false
        if (this.mdlAddress != other.mdlAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.eaList.hashCode()
        result = 31 * result + this.eaListLength.hashCode()
        result = 31 * result + this.eaIndex.hashCode()
        result = 31 * result + this.eaBuffer.hashCode()
        result = 31 * result + this.mdlAddress.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters7> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters7> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters7 =
                    FltParameters7(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Mdl>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: FltParameters7) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.eaList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.eaListLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.eaIndex)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.eaBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Mdl>(64)
                    ).writeNative(addr + 32L, value.mdlAddress)
                }
            }

        public operator fun invoke(
            length: UInt = 0u,
            eaList: MutPtr<CVoid> = MutPtr(0L),
            eaListLength: UInt = 0u,
            eaIndex: UInt = 0u,
            eaBuffer: MutPtr<CVoid> = MutPtr(0L),
            mdlAddress: MutPtr<Mdl> = MutPtr(0L),
        ): FltParameters7 =
            FltParameters7(
                length = length,
                eaListCtorArg = eaList,
                eaListLength = eaListLength,
                eaIndex = eaIndex,
                eaBufferCtorArg = eaBuffer,
                mdlAddressCtorArg = mdlAddress,
            )
    }
}

public class FltParameters5 internal constructor(
    public var length: UInt,
    public var fileInformationClass: FileInformationClass,
    infoBufferCtorArg: MutPtr<CVoid>,
) {
    public var infoBuffer: MutPtr<CVoid> = infoBufferCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        fileInformationClass = 0,
        infoBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): FileInformationClass = this.fileInformationClass

    public operator fun component3(): MutPtr<CVoid> = this.infoBuffer

    public fun copy(length: UInt = this.length, fileInformationClass: FileInformationClass = this.fileInformationClass, infoBuffer: MutPtr<CVoid> = this.infoBuffer): FltParameters5 = FltParameters5(length = length, fileInformationClass = fileInformationClass, infoBufferCtorArg = infoBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters5) return false
        if (this.length != other.length) return false
        if (this.fileInformationClass != other.fileInformationClass) return false
        if (this.infoBuffer != other.infoBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.fileInformationClass.hashCode()
        result = 31 * result + this.infoBuffer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UInt = 0u,
            fileInformationClass: FileInformationClass = 0,
            infoBuffer: MutPtr<CVoid> = MutPtr(0L),
        ): FltParameters5 =
            FltParameters5(
                length = length,
                fileInformationClass = fileInformationClass,
                infoBufferCtorArg = infoBuffer,
            )
    }
}

public class FltParameters24 internal constructor(
    irpCtorArg: MutPtr<Irp>,
    fileInformationCtorArg: MutPtr<CVoid>,
    lengthCtorArg: MutPtr<UInt>,
    public var fileInformationClass: FileInformationClass,
) {
    public var irp: MutPtr<Irp> = irpCtorArg
        internal set

    public var fileInformation: MutPtr<CVoid> = fileInformationCtorArg
        internal set

    public var length: MutPtr<UInt> = lengthCtorArg
        internal set

    public constructor() : this(
        irpCtorArg = MutPtr(0L),
        fileInformationCtorArg = MutPtr(0L),
        lengthCtorArg = MutPtr(0L),
        fileInformationClass = 0,
    )

    public operator fun component1(): MutPtr<Irp> = this.irp

    public operator fun component2(): MutPtr<CVoid> = this.fileInformation

    public operator fun component3(): MutPtr<UInt> = this.length

    public operator fun component4(): FileInformationClass = this.fileInformationClass

    public fun copy(irp: MutPtr<Irp> = this.irp, fileInformation: MutPtr<CVoid> = this.fileInformation, length: MutPtr<UInt> = this.length, fileInformationClass: FileInformationClass = this.fileInformationClass): FltParameters24 = FltParameters24(irpCtorArg = irp, fileInformationCtorArg = fileInformation, lengthCtorArg = length, fileInformationClass = fileInformationClass)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters24) return false
        if (this.irp != other.irp) return false
        if (this.fileInformation != other.fileInformation) return false
        if (this.length != other.length) return false
        if (this.fileInformationClass != other.fileInformationClass) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.irp.hashCode()
        result = 31 * result + this.fileInformation.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.fileInformationClass.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            irp: MutPtr<Irp> = MutPtr(0L),
            fileInformation: MutPtr<CVoid> = MutPtr(0L),
            length: MutPtr<UInt> = MutPtr(0L),
            fileInformationClass: FileInformationClass = 0,
        ): FltParameters24 =
            FltParameters24(
                irpCtorArg = irp,
                fileInformationCtorArg = fileInformation,
                lengthCtorArg = length,
                fileInformationClass = fileInformationClass,
            )
    }
}

public class FltParameters18 internal constructor(
    public var length: UInt,
    startSidCtorArg: Psid,
    sidListCtorArg: MutPtr<FileGetQuotaInformation>,
    public var sidListLength: UInt,
    quotaBufferCtorArg: MutPtr<CVoid>,
    mdlAddressCtorArg: MutPtr<Mdl>,
) {
    public var startSid: Psid = startSidCtorArg
        internal set

    public var sidList: MutPtr<FileGetQuotaInformation> = sidListCtorArg
        internal set

    public var quotaBuffer: MutPtr<CVoid> = quotaBufferCtorArg
        internal set

    public var mdlAddress: MutPtr<Mdl> = mdlAddressCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        startSidCtorArg = MutPtr(0L),
        sidListCtorArg = MutPtr(0L),
        sidListLength = 0u,
        quotaBufferCtorArg = MutPtr(0L),
        mdlAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): Psid = this.startSid

    public operator fun component3(): MutPtr<FileGetQuotaInformation> = this.sidList

    public operator fun component4(): UInt = this.sidListLength

    public operator fun component5(): MutPtr<CVoid> = this.quotaBuffer

    public operator fun component6(): MutPtr<Mdl> = this.mdlAddress

    public fun copy(length: UInt = this.length, startSid: Psid = this.startSid, sidList: MutPtr<FileGetQuotaInformation> = this.sidList, sidListLength: UInt = this.sidListLength, quotaBuffer: MutPtr<CVoid> = this.quotaBuffer, mdlAddress: MutPtr<Mdl> = this.mdlAddress): FltParameters18 = FltParameters18(length = length, startSidCtorArg = startSid, sidListCtorArg = sidList, sidListLength = sidListLength, quotaBufferCtorArg = quotaBuffer, mdlAddressCtorArg = mdlAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters18) return false
        if (this.length != other.length) return false
        if (this.startSid != other.startSid) return false
        if (this.sidList != other.sidList) return false
        if (this.sidListLength != other.sidListLength) return false
        if (this.quotaBuffer != other.quotaBuffer) return false
        if (this.mdlAddress != other.mdlAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.startSid.hashCode()
        result = 31 * result + this.sidList.hashCode()
        result = 31 * result + this.sidListLength.hashCode()
        result = 31 * result + this.quotaBuffer.hashCode()
        result = 31 * result + this.mdlAddress.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UInt = 0u,
            startSid: Psid = MutPtr(0L),
            sidList: MutPtr<FileGetQuotaInformation> = MutPtr(0L),
            sidListLength: UInt = 0u,
            quotaBuffer: MutPtr<CVoid> = MutPtr(0L),
            mdlAddress: MutPtr<Mdl> = MutPtr(0L),
        ): FltParameters18 =
            FltParameters18(
                length = length,
                startSidCtorArg = startSid,
                sidListCtorArg = sidList,
                sidListLength = sidListLength,
                quotaBufferCtorArg = quotaBuffer,
                mdlAddressCtorArg = mdlAddress,
            )
    }
}

public class FltParameters15 internal constructor(
    public var securityInformation: UInt,
    public var length: UInt,
    securityBufferCtorArg: MutPtr<CVoid>,
    mdlAddressCtorArg: MutPtr<Mdl>,
) {
    public var securityBuffer: MutPtr<CVoid> = securityBufferCtorArg
        internal set

    public var mdlAddress: MutPtr<Mdl> = mdlAddressCtorArg
        internal set

    public constructor() : this(
        securityInformation = 0u,
        length = 0u,
        securityBufferCtorArg = MutPtr(0L),
        mdlAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.securityInformation

    public operator fun component2(): UInt = this.length

    public operator fun component3(): MutPtr<CVoid> = this.securityBuffer

    public operator fun component4(): MutPtr<Mdl> = this.mdlAddress

    public fun copy(securityInformation: UInt = this.securityInformation, length: UInt = this.length, securityBuffer: MutPtr<CVoid> = this.securityBuffer, mdlAddress: MutPtr<Mdl> = this.mdlAddress): FltParameters15 = FltParameters15(securityInformation = securityInformation, length = length, securityBufferCtorArg = securityBuffer, mdlAddressCtorArg = mdlAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters15) return false
        if (this.securityInformation != other.securityInformation) return false
        if (this.length != other.length) return false
        if (this.securityBuffer != other.securityBuffer) return false
        if (this.mdlAddress != other.mdlAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityInformation.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.securityBuffer.hashCode()
        result = 31 * result + this.mdlAddress.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters15> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters15> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters15 =
                    FltParameters15(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Mdl>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: FltParameters15) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.securityInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.securityBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Mdl>(64)
                    ).writeNative(addr + 16L, value.mdlAddress)
                }
            }

        public operator fun invoke(
            securityInformation: UInt = 0u,
            length: UInt = 0u,
            securityBuffer: MutPtr<CVoid> = MutPtr(0L),
            mdlAddress: MutPtr<Mdl> = MutPtr(0L),
        ): FltParameters15 =
            FltParameters15(
                securityInformation = securityInformation,
                length = length,
                securityBufferCtorArg = securityBuffer,
                mdlAddressCtorArg = mdlAddress,
            )
    }
}

public class FltParameters9 internal constructor(
    public var length: UInt,
    public var fsInformationClass: FsInformationClass,
    volumeBufferCtorArg: MutPtr<CVoid>,
) {
    public var volumeBuffer: MutPtr<CVoid> = volumeBufferCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        fsInformationClass = 0,
        volumeBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): FsInformationClass = this.fsInformationClass

    public operator fun component3(): MutPtr<CVoid> = this.volumeBuffer

    public fun copy(length: UInt = this.length, fsInformationClass: FsInformationClass = this.fsInformationClass, volumeBuffer: MutPtr<CVoid> = this.volumeBuffer): FltParameters9 = FltParameters9(length = length, fsInformationClass = fsInformationClass, volumeBufferCtorArg = volumeBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters9) return false
        if (this.length != other.length) return false
        if (this.fsInformationClass != other.fsInformationClass) return false
        if (this.volumeBuffer != other.volumeBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.fsInformationClass.hashCode()
        result = 31 * result + this.volumeBuffer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UInt = 0u,
            fsInformationClass: FsInformationClass = 0,
            volumeBuffer: MutPtr<CVoid> = MutPtr(0L),
        ): FltParameters9 =
            FltParameters9(
                length = length,
                fsInformationClass = fsInformationClass,
                volumeBufferCtorArg = volumeBuffer,
            )
    }
}

public class FltParameters3 internal constructor(
    public var length: UInt,
    public var key: UInt,
    public var byteOffset: Long,
    readBufferCtorArg: MutPtr<CVoid>,
    mdlAddressCtorArg: MutPtr<Mdl>,
) {
    public var readBuffer: MutPtr<CVoid> = readBufferCtorArg
        internal set

    public var mdlAddress: MutPtr<Mdl> = mdlAddressCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        key = 0u,
        byteOffset = 0L,
        readBufferCtorArg = MutPtr(0L),
        mdlAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): UInt = this.key

    public operator fun component3(): Long = this.byteOffset

    public operator fun component4(): MutPtr<CVoid> = this.readBuffer

    public operator fun component5(): MutPtr<Mdl> = this.mdlAddress

    public fun copy(length: UInt = this.length, key: UInt = this.key, byteOffset: Long = this.byteOffset, readBuffer: MutPtr<CVoid> = this.readBuffer, mdlAddress: MutPtr<Mdl> = this.mdlAddress): FltParameters3 = FltParameters3(length = length, key = key, byteOffset = byteOffset, readBufferCtorArg = readBuffer, mdlAddressCtorArg = mdlAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters3) return false
        if (this.length != other.length) return false
        if (this.key != other.key) return false
        if (this.byteOffset != other.byteOffset) return false
        if (this.readBuffer != other.readBuffer) return false
        if (this.mdlAddress != other.mdlAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.key.hashCode()
        result = 31 * result + this.byteOffset.hashCode()
        result = 31 * result + this.readBuffer.hashCode()
        result = 31 * result + this.mdlAddress.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters3> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FltParameters3 =
                    FltParameters3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Mdl>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: FltParameters3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.key)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.byteOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.readBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Mdl>(64)
                    ).writeNative(addr + 24L, value.mdlAddress)
                }
            }

        public operator fun invoke(
            length: UInt = 0u,
            key: UInt = 0u,
            byteOffset: Long = 0L,
            readBuffer: MutPtr<CVoid> = MutPtr(0L),
            mdlAddress: MutPtr<Mdl> = MutPtr(0L),
        ): FltParameters3 =
            FltParameters3(
                length = length,
                key = key,
                byteOffset = byteOffset,
                readBufferCtorArg = readBuffer,
                mdlAddressCtorArg = mdlAddress,
            )
    }
}

public class FltParameters23 internal constructor(
    resourceToReleaseCtorArg: MutPtr<Eresource>,
) {
    public var resourceToRelease: MutPtr<Eresource> = resourceToReleaseCtorArg
        internal set

    public constructor() : this(
        resourceToReleaseCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Eresource> = this.resourceToRelease

    public fun copy(resourceToRelease: MutPtr<Eresource> = this.resourceToRelease): FltParameters23 = FltParameters23(resourceToReleaseCtorArg = resourceToRelease)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters23) return false
        if (this.resourceToRelease != other.resourceToRelease) return false
        return true
    }

    override fun hashCode(): Int = this.resourceToRelease.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters23> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters23> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters23 =
                    FltParameters23(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Eresource>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FltParameters23) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Eresource>(64)
                    ).writeNative(addr, value.resourceToRelease)
                }
            }

        public operator fun invoke(
            resourceToRelease: MutPtr<Eresource> = MutPtr(0L),
        ): FltParameters23 =
            FltParameters23(
                resourceToReleaseCtorArg = resourceToRelease,
            )
    }
}

public class FltParameters8 internal constructor(
    public var length: UInt,
    eaBufferCtorArg: MutPtr<CVoid>,
    mdlAddressCtorArg: MutPtr<Mdl>,
) {
    public var eaBuffer: MutPtr<CVoid> = eaBufferCtorArg
        internal set

    public var mdlAddress: MutPtr<Mdl> = mdlAddressCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        eaBufferCtorArg = MutPtr(0L),
        mdlAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): MutPtr<CVoid> = this.eaBuffer

    public operator fun component3(): MutPtr<Mdl> = this.mdlAddress

    public fun copy(length: UInt = this.length, eaBuffer: MutPtr<CVoid> = this.eaBuffer, mdlAddress: MutPtr<Mdl> = this.mdlAddress): FltParameters8 = FltParameters8(length = length, eaBufferCtorArg = eaBuffer, mdlAddressCtorArg = mdlAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters8) return false
        if (this.length != other.length) return false
        if (this.eaBuffer != other.eaBuffer) return false
        if (this.mdlAddress != other.mdlAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.eaBuffer.hashCode()
        result = 31 * result + this.mdlAddress.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters8> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters8> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters8 =
                    FltParameters8(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Mdl>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: FltParameters8) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.eaBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Mdl>(64)
                    ).writeNative(addr + 16L, value.mdlAddress)
                }
            }

        public operator fun invoke(
            length: UInt = 0u,
            eaBuffer: MutPtr<CVoid> = MutPtr(0L),
            mdlAddress: MutPtr<Mdl> = MutPtr(0L),
        ): FltParameters8 =
            FltParameters8(
                length = length,
                eaBufferCtorArg = eaBuffer,
                mdlAddressCtorArg = mdlAddress,
            )
    }
}

public class FltParameters6 internal constructor(
    public var length: UInt,
    public var fileInformationClass: FileInformationClass,
    parentOfTargetCtorArg: MutPtr<FileObject>,
    public var anonymous: FltParameters60,
    infoBufferCtorArg: MutPtr<CVoid>,
) {
    public var parentOfTarget: MutPtr<FileObject> = parentOfTargetCtorArg
        internal set

    public var infoBuffer: MutPtr<CVoid> = infoBufferCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        fileInformationClass = 0,
        parentOfTargetCtorArg = MutPtr(0L),
        anonymous = FltParameters60(),
        infoBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): FileInformationClass = this.fileInformationClass

    public operator fun component3(): MutPtr<FileObject> = this.parentOfTarget

    public operator fun component4(): FltParameters60 = this.anonymous

    public operator fun component5(): MutPtr<CVoid> = this.infoBuffer

    public fun copy(length: UInt = this.length, fileInformationClass: FileInformationClass = this.fileInformationClass, parentOfTarget: MutPtr<FileObject> = this.parentOfTarget, anonymous: FltParameters60 = this.anonymous, infoBuffer: MutPtr<CVoid> = this.infoBuffer): FltParameters6 = FltParameters6(length = length, fileInformationClass = fileInformationClass, parentOfTargetCtorArg = parentOfTarget, anonymous = anonymous, infoBufferCtorArg = infoBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters6) return false
        if (this.length != other.length) return false
        if (this.fileInformationClass != other.fileInformationClass) return false
        if (this.parentOfTarget != other.parentOfTarget) return false
        if (this.anonymous != other.anonymous) return false
        if (this.infoBuffer != other.infoBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.fileInformationClass.hashCode()
        result = 31 * result + this.parentOfTarget.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.infoBuffer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UInt = 0u,
            fileInformationClass: FileInformationClass = 0,
            parentOfTarget: MutPtr<FileObject> = MutPtr(0L),
            anonymous: FltParameters60 = FltParameters60(),
            infoBuffer: MutPtr<CVoid> = MutPtr(0L),
        ): FltParameters6 =
            FltParameters6(
                length = length,
                fileInformationClass = fileInformationClass,
                parentOfTargetCtorArg = parentOfTarget,
                anonymous = anonymous,
                infoBufferCtorArg = infoBuffer,
            )
    }
}

public class FltParameters60 internal constructor(
    public var anonymous: FltParameters600,
    public var clusterCount: UInt,
    deleteHandleCtorArg: Handle,
) {
    public var deleteHandle: Handle = deleteHandleCtorArg
        internal set

    public constructor() : this(
        anonymous = FltParameters600(),
        clusterCount = 0u,
        deleteHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): FltParameters600 = this.anonymous

    public operator fun component2(): UInt = this.clusterCount

    public operator fun component3(): Handle = this.deleteHandle

    public fun copy(anonymous: FltParameters600 = this.anonymous, clusterCount: UInt = this.clusterCount, deleteHandle: Handle = this.deleteHandle): FltParameters60 = FltParameters60(anonymous = anonymous, clusterCount = clusterCount, deleteHandleCtorArg = deleteHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters60) return false
        if (this.anonymous != other.anonymous) return false
        if (this.clusterCount != other.clusterCount) return false
        if (this.deleteHandle != other.deleteHandle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.clusterCount.hashCode()
        result = 31 * result + this.deleteHandle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: FltParameters600 = FltParameters600(),
            clusterCount: UInt = 0u,
            deleteHandle: Handle = MutPtr(0L),
        ): FltParameters60 =
            FltParameters60(
                anonymous = anonymous,
                clusterCount = clusterCount,
                deleteHandleCtorArg = deleteHandle,
            )
    }
}

public data class FltParameters600(
    public var replaceIfExists: Boolean = false,
    public var advanceOnly: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters600> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters600> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): FltParameters600 =
                    FltParameters600(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: FltParameters600) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.replaceIfExists)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.advanceOnly)
                }
            }
    }
}

public class FltParameters19 internal constructor(
    public var length: UInt,
    quotaBufferCtorArg: MutPtr<CVoid>,
    mdlAddressCtorArg: MutPtr<Mdl>,
) {
    public var quotaBuffer: MutPtr<CVoid> = quotaBufferCtorArg
        internal set

    public var mdlAddress: MutPtr<Mdl> = mdlAddressCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        quotaBufferCtorArg = MutPtr(0L),
        mdlAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): MutPtr<CVoid> = this.quotaBuffer

    public operator fun component3(): MutPtr<Mdl> = this.mdlAddress

    public fun copy(length: UInt = this.length, quotaBuffer: MutPtr<CVoid> = this.quotaBuffer, mdlAddress: MutPtr<Mdl> = this.mdlAddress): FltParameters19 = FltParameters19(length = length, quotaBufferCtorArg = quotaBuffer, mdlAddressCtorArg = mdlAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters19) return false
        if (this.length != other.length) return false
        if (this.quotaBuffer != other.quotaBuffer) return false
        if (this.mdlAddress != other.mdlAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.quotaBuffer.hashCode()
        result = 31 * result + this.mdlAddress.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters19> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters19> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters19 =
                    FltParameters19(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Mdl>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: FltParameters19) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.quotaBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Mdl>(64)
                    ).writeNative(addr + 16L, value.mdlAddress)
                }
            }

        public operator fun invoke(
            length: UInt = 0u,
            quotaBuffer: MutPtr<CVoid> = MutPtr(0L),
            mdlAddress: MutPtr<Mdl> = MutPtr(0L),
        ): FltParameters19 =
            FltParameters19(
                length = length,
                quotaBufferCtorArg = quotaBuffer,
                mdlAddressCtorArg = mdlAddress,
            )
    }
}

public class FltParameters16 internal constructor(
    public var securityInformation: UInt,
    securityDescriptorCtorArg: PsecurityDescriptor,
) {
    public var securityDescriptor: PsecurityDescriptor = securityDescriptorCtorArg
        internal set

    public constructor() : this(
        securityInformation = 0u,
        securityDescriptorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.securityInformation

    public operator fun component2(): PsecurityDescriptor = this.securityDescriptor

    public fun copy(securityInformation: UInt = this.securityInformation, securityDescriptor: PsecurityDescriptor = this.securityDescriptor): FltParameters16 = FltParameters16(securityInformation = securityInformation, securityDescriptorCtorArg = securityDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters16) return false
        if (this.securityInformation != other.securityInformation) return false
        if (this.securityDescriptor != other.securityDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityInformation.hashCode()
        result = 31 * result + this.securityDescriptor.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            securityInformation: UInt = 0u,
            securityDescriptor: PsecurityDescriptor = MutPtr(0L),
        ): FltParameters16 =
            FltParameters16(
                securityInformation = securityInformation,
                securityDescriptorCtorArg = securityDescriptor,
            )
    }
}

public class FltParameters10 internal constructor(
    public var length: UInt,
    public var fsInformationClass: FsInformationClass,
    volumeBufferCtorArg: MutPtr<CVoid>,
) {
    public var volumeBuffer: MutPtr<CVoid> = volumeBufferCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        fsInformationClass = 0,
        volumeBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): FsInformationClass = this.fsInformationClass

    public operator fun component3(): MutPtr<CVoid> = this.volumeBuffer

    public fun copy(length: UInt = this.length, fsInformationClass: FsInformationClass = this.fsInformationClass, volumeBuffer: MutPtr<CVoid> = this.volumeBuffer): FltParameters10 = FltParameters10(length = length, fsInformationClass = fsInformationClass, volumeBufferCtorArg = volumeBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters10) return false
        if (this.length != other.length) return false
        if (this.fsInformationClass != other.fsInformationClass) return false
        if (this.volumeBuffer != other.volumeBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.fsInformationClass.hashCode()
        result = 31 * result + this.volumeBuffer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UInt = 0u,
            fsInformationClass: FsInformationClass = 0,
            volumeBuffer: MutPtr<CVoid> = MutPtr(0L),
        ): FltParameters10 =
            FltParameters10(
                length = length,
                fsInformationClass = fsInformationClass,
                volumeBufferCtorArg = volumeBuffer,
            )
    }
}

public class FltParameters17 internal constructor(
    public var providerId: Int,
    dataPathCtorArg: MutPtr<CVoid>,
    public var bufferSize: UInt,
    bufferCtorArg: MutPtr<CVoid>,
) {
    public var dataPath: MutPtr<CVoid> = dataPathCtorArg
        internal set

    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public constructor() : this(
        providerId = 0,
        dataPathCtorArg = MutPtr(0L),
        bufferSize = 0u,
        bufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.providerId

    public operator fun component2(): MutPtr<CVoid> = this.dataPath

    public operator fun component3(): UInt = this.bufferSize

    public operator fun component4(): MutPtr<CVoid> = this.buffer

    public fun copy(providerId: Int = this.providerId, dataPath: MutPtr<CVoid> = this.dataPath, bufferSize: UInt = this.bufferSize, buffer: MutPtr<CVoid> = this.buffer): FltParameters17 = FltParameters17(providerId = providerId, dataPathCtorArg = dataPath, bufferSize = bufferSize, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters17) return false
        if (this.providerId != other.providerId) return false
        if (this.dataPath != other.dataPath) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.buffer != other.buffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.providerId.hashCode()
        result = 31 * result + this.dataPath.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.buffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters17> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters17> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltParameters17 =
                    FltParameters17(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: FltParameters17) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.providerId)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.dataPath)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.bufferSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.buffer)
                }
            }

        public operator fun invoke(
            providerId: Int = 0,
            dataPath: MutPtr<CVoid> = MutPtr(0L),
            bufferSize: UInt = 0u,
            buffer: MutPtr<CVoid> = MutPtr(0L),
        ): FltParameters17 =
            FltParameters17(
                providerId = providerId,
                dataPathCtorArg = dataPath,
                bufferSize = bufferSize,
                bufferCtorArg = buffer,
            )
    }
}

public class FltParameters4 internal constructor(
    public var length: UInt,
    public var key: UInt,
    public var byteOffset: Long,
    writeBufferCtorArg: MutPtr<CVoid>,
    mdlAddressCtorArg: MutPtr<Mdl>,
) {
    public var writeBuffer: MutPtr<CVoid> = writeBufferCtorArg
        internal set

    public var mdlAddress: MutPtr<Mdl> = mdlAddressCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        key = 0u,
        byteOffset = 0L,
        writeBufferCtorArg = MutPtr(0L),
        mdlAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): UInt = this.key

    public operator fun component3(): Long = this.byteOffset

    public operator fun component4(): MutPtr<CVoid> = this.writeBuffer

    public operator fun component5(): MutPtr<Mdl> = this.mdlAddress

    public fun copy(length: UInt = this.length, key: UInt = this.key, byteOffset: Long = this.byteOffset, writeBuffer: MutPtr<CVoid> = this.writeBuffer, mdlAddress: MutPtr<Mdl> = this.mdlAddress): FltParameters4 = FltParameters4(length = length, key = key, byteOffset = byteOffset, writeBufferCtorArg = writeBuffer, mdlAddressCtorArg = mdlAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltParameters4) return false
        if (this.length != other.length) return false
        if (this.key != other.key) return false
        if (this.byteOffset != other.byteOffset) return false
        if (this.writeBuffer != other.writeBuffer) return false
        if (this.mdlAddress != other.mdlAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.key.hashCode()
        result = 31 * result + this.byteOffset.hashCode()
        result = 31 * result + this.writeBuffer.hashCode()
        result = 31 * result + this.mdlAddress.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltParameters4> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FltParameters4 =
                    FltParameters4(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Mdl>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: FltParameters4) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.key)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.byteOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.writeBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Mdl>(64)
                    ).writeNative(addr + 24L, value.mdlAddress)
                }
            }

        public operator fun invoke(
            length: UInt = 0u,
            key: UInt = 0u,
            byteOffset: Long = 0L,
            writeBuffer: MutPtr<CVoid> = MutPtr(0L),
            mdlAddress: MutPtr<Mdl> = MutPtr(0L),
        ): FltParameters4 =
            FltParameters4(
                length = length,
                key = key,
                byteOffset = byteOffset,
                writeBufferCtorArg = writeBuffer,
                mdlAddressCtorArg = mdlAddress,
            )
    }
}

public class FltRegistration internal constructor(
    public var size: UShort,
    public var version: UShort,
    public var flags: UInt,
    contextRegistrationCtorArg: ConstPtr<FltContextRegistration>,
    operationRegistrationCtorArg: ConstPtr<FltOperationRegistration>,
    public var filterUnloadCallback: PfltFilterUnloadCallback,
    public var instanceSetupCallback: PfltInstanceSetupCallback,
    public var instanceQueryTeardownCallback: PfltInstanceQueryTeardownCallback,
    public var instanceTeardownStartCallback: PfltInstanceTeardownCallback,
    public var instanceTeardownCompleteCallback: PfltInstanceTeardownCallback,
    public var generateFileNameCallback: PfltGenerateFileName,
    public var normalizeNameComponentCallback: PfltNormalizeNameComponent,
    public var normalizeContextCleanupCallback: PfltNormalizeContextCleanup,
    public var transactionNotificationCallback: PfltTransactionNotificationCallback,
    public var normalizeNameComponentExCallback: PfltNormalizeNameComponentEx,
    public var sectionNotificationCallback: PfltSectionConflictNotificationCallback,
) {
    public var contextRegistration: ConstPtr<FltContextRegistration> = contextRegistrationCtorArg
        internal set

    public var operationRegistration: ConstPtr<FltOperationRegistration> = operationRegistrationCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        flags = 0u,
        contextRegistrationCtorArg = ConstPtr(0L),
        operationRegistrationCtorArg = ConstPtr(0L),
        filterUnloadCallback = null,
        instanceSetupCallback = null,
        instanceQueryTeardownCallback = null,
        instanceTeardownStartCallback = null,
        instanceTeardownCompleteCallback = null,
        generateFileNameCallback = null,
        normalizeNameComponentCallback = null,
        normalizeContextCleanupCallback = null,
        transactionNotificationCallback = null,
        normalizeNameComponentExCallback = null,
        sectionNotificationCallback = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): ConstPtr<FltContextRegistration> = this.contextRegistration

    public operator fun component5(): ConstPtr<FltOperationRegistration> = this.operationRegistration

    public operator fun component6(): PfltFilterUnloadCallback = this.filterUnloadCallback

    public operator fun component7(): PfltInstanceSetupCallback = this.instanceSetupCallback

    public operator fun component8(): PfltInstanceQueryTeardownCallback = this.instanceQueryTeardownCallback

    public operator fun component9(): PfltInstanceTeardownCallback = this.instanceTeardownStartCallback

    public operator fun component10(): PfltInstanceTeardownCallback = this.instanceTeardownCompleteCallback

    public operator fun component11(): PfltGenerateFileName = this.generateFileNameCallback

    public operator fun component12(): PfltNormalizeNameComponent = this.normalizeNameComponentCallback

    public operator fun component13(): PfltNormalizeContextCleanup = this.normalizeContextCleanupCallback

    public operator fun component14(): PfltTransactionNotificationCallback = this.transactionNotificationCallback

    public operator fun component15(): PfltNormalizeNameComponentEx = this.normalizeNameComponentExCallback

    public operator fun component16(): PfltSectionConflictNotificationCallback = this.sectionNotificationCallback

    public fun copy(size: UShort = this.size, version: UShort = this.version, flags: UInt = this.flags, contextRegistration: ConstPtr<FltContextRegistration> = this.contextRegistration, operationRegistration: ConstPtr<FltOperationRegistration> = this.operationRegistration, filterUnloadCallback: PfltFilterUnloadCallback = this.filterUnloadCallback, instanceSetupCallback: PfltInstanceSetupCallback = this.instanceSetupCallback, instanceQueryTeardownCallback: PfltInstanceQueryTeardownCallback = this.instanceQueryTeardownCallback, instanceTeardownStartCallback: PfltInstanceTeardownCallback = this.instanceTeardownStartCallback, instanceTeardownCompleteCallback: PfltInstanceTeardownCallback = this.instanceTeardownCompleteCallback, generateFileNameCallback: PfltGenerateFileName = this.generateFileNameCallback, normalizeNameComponentCallback: PfltNormalizeNameComponent = this.normalizeNameComponentCallback, normalizeContextCleanupCallback: PfltNormalizeContextCleanup = this.normalizeContextCleanupCallback, transactionNotificationCallback: PfltTransactionNotificationCallback = this.transactionNotificationCallback, normalizeNameComponentExCallback: PfltNormalizeNameComponentEx = this.normalizeNameComponentExCallback, sectionNotificationCallback: PfltSectionConflictNotificationCallback = this.sectionNotificationCallback): FltRegistration = FltRegistration(size = size, version = version, flags = flags, contextRegistrationCtorArg = contextRegistration, operationRegistrationCtorArg = operationRegistration, filterUnloadCallback = filterUnloadCallback, instanceSetupCallback = instanceSetupCallback, instanceQueryTeardownCallback = instanceQueryTeardownCallback, instanceTeardownStartCallback = instanceTeardownStartCallback, instanceTeardownCompleteCallback = instanceTeardownCompleteCallback, generateFileNameCallback = generateFileNameCallback, normalizeNameComponentCallback = normalizeNameComponentCallback, normalizeContextCleanupCallback = normalizeContextCleanupCallback, transactionNotificationCallback = transactionNotificationCallback, normalizeNameComponentExCallback = normalizeNameComponentExCallback, sectionNotificationCallback = sectionNotificationCallback)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltRegistration) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (this.contextRegistration != other.contextRegistration) return false
        if (this.operationRegistration != other.operationRegistration) return false
        if (this.filterUnloadCallback != other.filterUnloadCallback) return false
        if (this.instanceSetupCallback != other.instanceSetupCallback) return false
        if (this.instanceQueryTeardownCallback != other.instanceQueryTeardownCallback) return false
        if (this.instanceTeardownStartCallback != other.instanceTeardownStartCallback) return false
        if (this.instanceTeardownCompleteCallback != other.instanceTeardownCompleteCallback) return false
        if (this.generateFileNameCallback != other.generateFileNameCallback) return false
        if (this.normalizeNameComponentCallback != other.normalizeNameComponentCallback) return false
        if (this.normalizeContextCleanupCallback != other.normalizeContextCleanupCallback) return false
        if (this.transactionNotificationCallback != other.transactionNotificationCallback) return false
        if (this.normalizeNameComponentExCallback != other.normalizeNameComponentExCallback) return false
        if (this.sectionNotificationCallback != other.sectionNotificationCallback) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.contextRegistration.hashCode()
        result = 31 * result + this.operationRegistration.hashCode()
        result = 31 * result + this.filterUnloadCallback.hashCode()
        result = 31 * result + this.instanceSetupCallback.hashCode()
        result = 31 * result + this.instanceQueryTeardownCallback.hashCode()
        result = 31 * result + this.instanceTeardownStartCallback.hashCode()
        result = 31 * result + this.instanceTeardownCompleteCallback.hashCode()
        result = 31 * result + this.generateFileNameCallback.hashCode()
        result = 31 * result + this.normalizeNameComponentCallback.hashCode()
        result = 31 * result + this.normalizeContextCleanupCallback.hashCode()
        result = 31 * result + this.transactionNotificationCallback.hashCode()
        result = 31 * result + this.normalizeNameComponentExCallback.hashCode()
        result = 31 * result + this.sectionNotificationCallback.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            flags: UInt = 0u,
            contextRegistration: ConstPtr<FltContextRegistration> = ConstPtr(0L),
            operationRegistration: ConstPtr<FltOperationRegistration> = ConstPtr(0L),
            filterUnloadCallback: PfltFilterUnloadCallback = null,
            instanceSetupCallback: PfltInstanceSetupCallback = null,
            instanceQueryTeardownCallback: PfltInstanceQueryTeardownCallback = null,
            instanceTeardownStartCallback: PfltInstanceTeardownCallback = null,
            instanceTeardownCompleteCallback: PfltInstanceTeardownCallback = null,
            generateFileNameCallback: PfltGenerateFileName = null,
            normalizeNameComponentCallback: PfltNormalizeNameComponent = null,
            normalizeContextCleanupCallback: PfltNormalizeContextCleanup = null,
            transactionNotificationCallback: PfltTransactionNotificationCallback = null,
            normalizeNameComponentExCallback: PfltNormalizeNameComponentEx = null,
            sectionNotificationCallback: PfltSectionConflictNotificationCallback = null,
        ): FltRegistration =
            FltRegistration(
                size = size,
                version = version,
                flags = flags,
                contextRegistrationCtorArg = contextRegistration,
                operationRegistrationCtorArg = operationRegistration,
                filterUnloadCallback = filterUnloadCallback,
                instanceSetupCallback = instanceSetupCallback,
                instanceQueryTeardownCallback = instanceQueryTeardownCallback,
                instanceTeardownStartCallback = instanceTeardownStartCallback,
                instanceTeardownCompleteCallback = instanceTeardownCompleteCallback,
                generateFileNameCallback = generateFileNameCallback,
                normalizeNameComponentCallback = normalizeNameComponentCallback,
                normalizeContextCleanupCallback = normalizeContextCleanupCallback,
                transactionNotificationCallback = transactionNotificationCallback,
                normalizeNameComponentExCallback = normalizeNameComponentExCallback,
                sectionNotificationCallback = sectionNotificationCallback,
            )
    }
}

public class FltRelatedContexts internal constructor(
    volumeContextCtorArg: PfltContext,
    instanceContextCtorArg: PfltContext,
    fileContextCtorArg: PfltContext,
    streamContextCtorArg: PfltContext,
    streamHandleContextCtorArg: PfltContext,
    transactionContextCtorArg: PfltContext,
) {
    public var volumeContext: PfltContext = volumeContextCtorArg
        internal set

    public var instanceContext: PfltContext = instanceContextCtorArg
        internal set

    public var fileContext: PfltContext = fileContextCtorArg
        internal set

    public var streamContext: PfltContext = streamContextCtorArg
        internal set

    public var streamHandleContext: PfltContext = streamHandleContextCtorArg
        internal set

    public var transactionContext: PfltContext = transactionContextCtorArg
        internal set

    public constructor() : this(
        volumeContextCtorArg = MutPtr(0L),
        instanceContextCtorArg = MutPtr(0L),
        fileContextCtorArg = MutPtr(0L),
        streamContextCtorArg = MutPtr(0L),
        streamHandleContextCtorArg = MutPtr(0L),
        transactionContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): PfltContext = this.volumeContext

    public operator fun component2(): PfltContext = this.instanceContext

    public operator fun component3(): PfltContext = this.fileContext

    public operator fun component4(): PfltContext = this.streamContext

    public operator fun component5(): PfltContext = this.streamHandleContext

    public operator fun component6(): PfltContext = this.transactionContext

    public fun copy(volumeContext: PfltContext = this.volumeContext, instanceContext: PfltContext = this.instanceContext, fileContext: PfltContext = this.fileContext, streamContext: PfltContext = this.streamContext, streamHandleContext: PfltContext = this.streamHandleContext, transactionContext: PfltContext = this.transactionContext): FltRelatedContexts = FltRelatedContexts(volumeContextCtorArg = volumeContext, instanceContextCtorArg = instanceContext, fileContextCtorArg = fileContext, streamContextCtorArg = streamContext, streamHandleContextCtorArg = streamHandleContext, transactionContextCtorArg = transactionContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltRelatedContexts) return false
        if (this.volumeContext != other.volumeContext) return false
        if (this.instanceContext != other.instanceContext) return false
        if (this.fileContext != other.fileContext) return false
        if (this.streamContext != other.streamContext) return false
        if (this.streamHandleContext != other.streamHandleContext) return false
        if (this.transactionContext != other.transactionContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.volumeContext.hashCode()
        result = 31 * result + this.instanceContext.hashCode()
        result = 31 * result + this.fileContext.hashCode()
        result = 31 * result + this.streamContext.hashCode()
        result = 31 * result + this.streamHandleContext.hashCode()
        result = 31 * result + this.transactionContext.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltRelatedContexts> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltRelatedContexts> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltRelatedContexts =
                    FltRelatedContexts(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: FltRelatedContexts) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.volumeContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.instanceContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.fileContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.streamContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.streamHandleContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.transactionContext)
                }
            }

        public operator fun invoke(
            volumeContext: PfltContext = MutPtr(0L),
            instanceContext: PfltContext = MutPtr(0L),
            fileContext: PfltContext = MutPtr(0L),
            streamContext: PfltContext = MutPtr(0L),
            streamHandleContext: PfltContext = MutPtr(0L),
            transactionContext: PfltContext = MutPtr(0L),
        ): FltRelatedContexts =
            FltRelatedContexts(
                volumeContextCtorArg = volumeContext,
                instanceContextCtorArg = instanceContext,
                fileContextCtorArg = fileContext,
                streamContextCtorArg = streamContext,
                streamHandleContextCtorArg = streamHandleContext,
                transactionContextCtorArg = transactionContext,
            )
    }
}

public class FltRelatedContextsEx internal constructor(
    volumeContextCtorArg: PfltContext,
    instanceContextCtorArg: PfltContext,
    fileContextCtorArg: PfltContext,
    streamContextCtorArg: PfltContext,
    streamHandleContextCtorArg: PfltContext,
    transactionContextCtorArg: PfltContext,
    sectionContextCtorArg: PfltContext,
) {
    public var volumeContext: PfltContext = volumeContextCtorArg
        internal set

    public var instanceContext: PfltContext = instanceContextCtorArg
        internal set

    public var fileContext: PfltContext = fileContextCtorArg
        internal set

    public var streamContext: PfltContext = streamContextCtorArg
        internal set

    public var streamHandleContext: PfltContext = streamHandleContextCtorArg
        internal set

    public var transactionContext: PfltContext = transactionContextCtorArg
        internal set

    public var sectionContext: PfltContext = sectionContextCtorArg
        internal set

    public constructor() : this(
        volumeContextCtorArg = MutPtr(0L),
        instanceContextCtorArg = MutPtr(0L),
        fileContextCtorArg = MutPtr(0L),
        streamContextCtorArg = MutPtr(0L),
        streamHandleContextCtorArg = MutPtr(0L),
        transactionContextCtorArg = MutPtr(0L),
        sectionContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): PfltContext = this.volumeContext

    public operator fun component2(): PfltContext = this.instanceContext

    public operator fun component3(): PfltContext = this.fileContext

    public operator fun component4(): PfltContext = this.streamContext

    public operator fun component5(): PfltContext = this.streamHandleContext

    public operator fun component6(): PfltContext = this.transactionContext

    public operator fun component7(): PfltContext = this.sectionContext

    public fun copy(volumeContext: PfltContext = this.volumeContext, instanceContext: PfltContext = this.instanceContext, fileContext: PfltContext = this.fileContext, streamContext: PfltContext = this.streamContext, streamHandleContext: PfltContext = this.streamHandleContext, transactionContext: PfltContext = this.transactionContext, sectionContext: PfltContext = this.sectionContext): FltRelatedContextsEx = FltRelatedContextsEx(volumeContextCtorArg = volumeContext, instanceContextCtorArg = instanceContext, fileContextCtorArg = fileContext, streamContextCtorArg = streamContext, streamHandleContextCtorArg = streamHandleContext, transactionContextCtorArg = transactionContext, sectionContextCtorArg = sectionContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltRelatedContextsEx) return false
        if (this.volumeContext != other.volumeContext) return false
        if (this.instanceContext != other.instanceContext) return false
        if (this.fileContext != other.fileContext) return false
        if (this.streamContext != other.streamContext) return false
        if (this.streamHandleContext != other.streamHandleContext) return false
        if (this.transactionContext != other.transactionContext) return false
        if (this.sectionContext != other.sectionContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.volumeContext.hashCode()
        result = 31 * result + this.instanceContext.hashCode()
        result = 31 * result + this.fileContext.hashCode()
        result = 31 * result + this.streamContext.hashCode()
        result = 31 * result + this.streamHandleContext.hashCode()
        result = 31 * result + this.transactionContext.hashCode()
        result = 31 * result + this.sectionContext.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltRelatedContextsEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltRelatedContextsEx> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltRelatedContextsEx =
                    FltRelatedContextsEx(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: FltRelatedContextsEx) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.volumeContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.instanceContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.fileContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.streamContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.streamHandleContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.transactionContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 48L, value.sectionContext)
                }
            }

        public operator fun invoke(
            volumeContext: PfltContext = MutPtr(0L),
            instanceContext: PfltContext = MutPtr(0L),
            fileContext: PfltContext = MutPtr(0L),
            streamContext: PfltContext = MutPtr(0L),
            streamHandleContext: PfltContext = MutPtr(0L),
            transactionContext: PfltContext = MutPtr(0L),
            sectionContext: PfltContext = MutPtr(0L),
        ): FltRelatedContextsEx =
            FltRelatedContextsEx(
                volumeContextCtorArg = volumeContext,
                instanceContextCtorArg = instanceContext,
                fileContextCtorArg = fileContext,
                streamContextCtorArg = streamContext,
                streamHandleContextCtorArg = streamHandleContext,
                transactionContextCtorArg = transactionContext,
                sectionContextCtorArg = sectionContext,
            )
    }
}

public class FltRelatedObjects internal constructor(
    public var size: UShort,
    public var transactionContext: UShort,
    public var filter: PfltFilter,
    public var volume: PfltVolume,
    public var instance: PfltInstance,
    fileObjectCtorArg: ConstPtr<FileObject>,
    transactionCtorArg: ConstPtr<Ktransaction>,
) {
    public var fileObject: ConstPtr<FileObject> = fileObjectCtorArg
        internal set

    public var transaction: ConstPtr<Ktransaction> = transactionCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        transactionContext = 0u,
        filter = 0L,
        volume = 0L,
        instance = 0L,
        fileObjectCtorArg = ConstPtr(0L),
        transactionCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.transactionContext

    public operator fun component3(): PfltFilter = this.filter

    public operator fun component4(): PfltVolume = this.volume

    public operator fun component5(): PfltInstance = this.instance

    public operator fun component6(): ConstPtr<FileObject> = this.fileObject

    public operator fun component7(): ConstPtr<Ktransaction> = this.transaction

    public fun copy(size: UShort = this.size, transactionContext: UShort = this.transactionContext, filter: PfltFilter = this.filter, volume: PfltVolume = this.volume, instance: PfltInstance = this.instance, fileObject: ConstPtr<FileObject> = this.fileObject, transaction: ConstPtr<Ktransaction> = this.transaction): FltRelatedObjects = FltRelatedObjects(size = size, transactionContext = transactionContext, filter = filter, volume = volume, instance = instance, fileObjectCtorArg = fileObject, transactionCtorArg = transaction)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltRelatedObjects) return false
        if (this.size != other.size) return false
        if (this.transactionContext != other.transactionContext) return false
        if (this.filter != other.filter) return false
        if (this.volume != other.volume) return false
        if (this.instance != other.instance) return false
        if (this.fileObject != other.fileObject) return false
        if (this.transaction != other.transaction) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.transactionContext.hashCode()
        result = 31 * result + this.filter.hashCode()
        result = 31 * result + this.volume.hashCode()
        result = 31 * result + this.instance.hashCode()
        result = 31 * result + this.fileObject.hashCode()
        result = 31 * result + this.transaction.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltRelatedObjects> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltRelatedObjects> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FltRelatedObjects =
                    FltRelatedObjects(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<FileObject>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<Ktransaction>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: FltRelatedObjects) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.transactionContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.filter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.volume)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.instance)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<FileObject>(64)
                    ).writeNative(addr + 32L, value.fileObject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<Ktransaction>(64)
                    ).writeNative(addr + 40L, value.transaction)
                }
            }

        public operator fun invoke(
            size: UShort = 0u,
            transactionContext: UShort = 0u,
            filter: PfltFilter = 0L,
            volume: PfltVolume = 0L,
            instance: PfltInstance = 0L,
            fileObject: ConstPtr<FileObject> = ConstPtr(0L),
            transaction: ConstPtr<Ktransaction> = ConstPtr(0L),
        ): FltRelatedObjects =
            FltRelatedObjects(
                size = size,
                transactionContext = transactionContext,
                filter = filter,
                volume = volume,
                instance = instance,
                fileObjectCtorArg = fileObject,
                transactionCtorArg = transaction,
            )
    }
}

public data class FltTagDataBuffer(
    public var fileTag: UInt = 0u,
    public var tagDataLength: UShort = 0u,
    public var unparsedNameLength: UShort = 0u,
    public var anonymous: FltTagDataBuffer0 = FltTagDataBuffer0(),
)

public data class FltTagDataBuffer0(
    public var symbolicLinkReparseBuffer: FltTagDataBuffer00 = FltTagDataBuffer00(),
    public var mountPointReparseBuffer: FltTagDataBuffer01 = FltTagDataBuffer01(),
    public var genericReparseBuffer: FltTagDataBuffer02 = FltTagDataBuffer02(),
    public var genericGUIDReparseBuffer: FltTagDataBuffer03 = FltTagDataBuffer03(),
)

public data class FltTagDataBuffer03(
    public var tagGuid: Guid = Guid(),
    public var dataBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltTagDataBuffer03) return false
        if (this.tagGuid != other.tagGuid) return false
        if (!this.dataBuffer.contentEquals(other.dataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tagGuid.hashCode()
        result = 31 * result + this.dataBuffer.contentHashCode()
        return result
    }
}

public data class FltTagDataBuffer02(
    public var dataBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltTagDataBuffer02) return false
        if (!this.dataBuffer.contentEquals(other.dataBuffer)) return false
        return true
    }

    override fun hashCode(): Int = this.dataBuffer.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltTagDataBuffer02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltTagDataBuffer02> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): FltTagDataBuffer02 =
                    FltTagDataBuffer02(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FltTagDataBuffer02) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr, value.dataBuffer)
                }
            }
    }
}

public data class FltTagDataBuffer01(
    public var substituteNameOffset: UShort = 0u,
    public var substituteNameLength: UShort = 0u,
    public var printNameOffset: UShort = 0u,
    public var printNameLength: UShort = 0u,
    public var pathBuffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltTagDataBuffer01) return false
        if (this.substituteNameOffset != other.substituteNameOffset) return false
        if (this.substituteNameLength != other.substituteNameLength) return false
        if (this.printNameOffset != other.printNameOffset) return false
        if (this.printNameLength != other.printNameLength) return false
        if (!this.pathBuffer.contentEquals(other.pathBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.substituteNameOffset.hashCode()
        result = 31 * result + this.substituteNameLength.hashCode()
        result = 31 * result + this.printNameOffset.hashCode()
        result = 31 * result + this.printNameLength.hashCode()
        result = 31 * result + this.pathBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltTagDataBuffer01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltTagDataBuffer01> {
                override val sizeBytes: Long = 10L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): FltTagDataBuffer01 =
                    FltTagDataBuffer01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FltTagDataBuffer01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.substituteNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.substituteNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.printNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.printNameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 8L, value.pathBuffer)
                }
            }
    }
}

public data class FltTagDataBuffer00(
    public var substituteNameOffset: UShort = 0u,
    public var substituteNameLength: UShort = 0u,
    public var printNameOffset: UShort = 0u,
    public var printNameLength: UShort = 0u,
    public var flags: UInt = 0u,
    public var pathBuffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FltTagDataBuffer00) return false
        if (this.substituteNameOffset != other.substituteNameOffset) return false
        if (this.substituteNameLength != other.substituteNameLength) return false
        if (this.printNameOffset != other.printNameOffset) return false
        if (this.printNameLength != other.printNameLength) return false
        if (this.flags != other.flags) return false
        if (!this.pathBuffer.contentEquals(other.pathBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.substituteNameOffset.hashCode()
        result = 31 * result + this.substituteNameLength.hashCode()
        result = 31 * result + this.printNameOffset.hashCode()
        result = 31 * result + this.printNameLength.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.pathBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltTagDataBuffer00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FltTagDataBuffer00> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FltTagDataBuffer00 =
                    FltTagDataBuffer00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: FltTagDataBuffer00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.substituteNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.substituteNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.printNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.printNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 12L, value.pathBuffer)
                }
            }
    }
}

public data class FltVolumeProperties(
    public var deviceType: UInt = 0u,
    public var deviceCharacteristics: UInt = 0u,
    public var deviceObjectFlags: UInt = 0u,
    public var alignmentRequirement: UInt = 0u,
    public var sectorSize: UShort = 0u,
    public var flags: UShort = 0u,
    public var fileSystemDriverName: UnicodeString = UnicodeString(),
    public var fileSystemDeviceName: UnicodeString = UnicodeString(),
    public var realDeviceName: UnicodeString = UnicodeString(),
)
