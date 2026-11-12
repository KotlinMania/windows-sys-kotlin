@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr

public data class PrjCallbacks(
    public var startDirectoryEnumerationCallback: PrjStartDirectoryEnumerationCb = null,
    public var endDirectoryEnumerationCallback: PrjEndDirectoryEnumerationCb = null,
    public var getDirectoryEnumerationCallback: PrjGetDirectoryEnumerationCb = null,
    public var getPlaceholderInfoCallback: PrjGetPlaceholderInfoCb = null,
    public var getFileDataCallback: PrjGetFileDataCb = null,
    public var queryFileNameCallback: PrjQueryFileNameCb = null,
    public var notificationCallback: PrjNotificationCb = null,
    public var cancelCommandCallback: PrjCancelCommandCb = null,
)

public class PrjCallbackData internal constructor(
    public var size: UInt,
    public var flags: PrjCallbackDataFlags,
    namespaceVirtualizationContextCtorArg: PrjNamespaceVirtualizationContext,
    public var commandId: Int,
    public var fileId: Guid,
    public var dataStreamId: Guid,
    filePathNameCtorArg: Pcwstr,
    versionInfoCtorArg: MutPtr<PrjPlaceholderVersionInfo>,
    public var triggeringProcessId: UInt,
    triggeringProcessImageFileNameCtorArg: Pcwstr,
    instanceContextCtorArg: MutPtr<CVoid>,
) {
    public var namespaceVirtualizationContext: PrjNamespaceVirtualizationContext = namespaceVirtualizationContextCtorArg
        internal set

    public var filePathName: Pcwstr = filePathNameCtorArg
        internal set

    public var versionInfo: MutPtr<PrjPlaceholderVersionInfo> = versionInfoCtorArg
        internal set

    public var triggeringProcessImageFileName: Pcwstr = triggeringProcessImageFileNameCtorArg
        internal set

    public var instanceContext: MutPtr<CVoid> = instanceContextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        flags = 0,
        namespaceVirtualizationContextCtorArg = MutPtr(0L),
        commandId = 0,
        fileId = Guid(),
        dataStreamId = Guid(),
        filePathNameCtorArg = ConstPtr(0L),
        versionInfoCtorArg = MutPtr(0L),
        triggeringProcessId = 0u,
        triggeringProcessImageFileNameCtorArg = ConstPtr(0L),
        instanceContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): PrjCallbackDataFlags = this.flags

    public operator fun component3(): PrjNamespaceVirtualizationContext = this.namespaceVirtualizationContext

    public operator fun component4(): Int = this.commandId

    public operator fun component5(): Guid = this.fileId

    public operator fun component6(): Guid = this.dataStreamId

    public operator fun component7(): Pcwstr = this.filePathName

    public operator fun component8(): MutPtr<PrjPlaceholderVersionInfo> = this.versionInfo

    public operator fun component9(): UInt = this.triggeringProcessId

    public operator fun component10(): Pcwstr = this.triggeringProcessImageFileName

    public operator fun component11(): MutPtr<CVoid> = this.instanceContext

    public fun copy(size: UInt = this.size, flags: PrjCallbackDataFlags = this.flags, namespaceVirtualizationContext: PrjNamespaceVirtualizationContext = this.namespaceVirtualizationContext, commandId: Int = this.commandId, fileId: Guid = this.fileId, dataStreamId: Guid = this.dataStreamId, filePathName: Pcwstr = this.filePathName, versionInfo: MutPtr<PrjPlaceholderVersionInfo> = this.versionInfo, triggeringProcessId: UInt = this.triggeringProcessId, triggeringProcessImageFileName: Pcwstr = this.triggeringProcessImageFileName, instanceContext: MutPtr<CVoid> = this.instanceContext): PrjCallbackData = PrjCallbackData(size = size, flags = flags, namespaceVirtualizationContextCtorArg = namespaceVirtualizationContext, commandId = commandId, fileId = fileId, dataStreamId = dataStreamId, filePathNameCtorArg = filePathName, versionInfoCtorArg = versionInfo, triggeringProcessId = triggeringProcessId, triggeringProcessImageFileNameCtorArg = triggeringProcessImageFileName, instanceContextCtorArg = instanceContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrjCallbackData) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.namespaceVirtualizationContext != other.namespaceVirtualizationContext) return false
        if (this.commandId != other.commandId) return false
        if (this.fileId != other.fileId) return false
        if (this.dataStreamId != other.dataStreamId) return false
        if (this.filePathName != other.filePathName) return false
        if (this.versionInfo != other.versionInfo) return false
        if (this.triggeringProcessId != other.triggeringProcessId) return false
        if (this.triggeringProcessImageFileName != other.triggeringProcessImageFileName) return false
        if (this.instanceContext != other.instanceContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.namespaceVirtualizationContext.hashCode()
        result = 31 * result + this.commandId.hashCode()
        result = 31 * result + this.fileId.hashCode()
        result = 31 * result + this.dataStreamId.hashCode()
        result = 31 * result + this.filePathName.hashCode()
        result = 31 * result + this.versionInfo.hashCode()
        result = 31 * result + this.triggeringProcessId.hashCode()
        result = 31 * result + this.triggeringProcessImageFileName.hashCode()
        result = 31 * result + this.instanceContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UInt = 0u,
            flags: PrjCallbackDataFlags = 0,
            namespaceVirtualizationContext: PrjNamespaceVirtualizationContext = MutPtr(0L),
            commandId: Int = 0,
            fileId: Guid = Guid(),
            dataStreamId: Guid = Guid(),
            filePathName: Pcwstr = ConstPtr(0L),
            versionInfo: MutPtr<PrjPlaceholderVersionInfo> = MutPtr(0L),
            triggeringProcessId: UInt = 0u,
            triggeringProcessImageFileName: Pcwstr = ConstPtr(0L),
            instanceContext: MutPtr<CVoid> = MutPtr(0L),
        ): PrjCallbackData =
            PrjCallbackData(
                size = size,
                flags = flags,
                namespaceVirtualizationContextCtorArg = namespaceVirtualizationContext,
                commandId = commandId,
                fileId = fileId,
                dataStreamId = dataStreamId,
                filePathNameCtorArg = filePathName,
                versionInfoCtorArg = versionInfo,
                triggeringProcessId = triggeringProcessId,
                triggeringProcessImageFileNameCtorArg = triggeringProcessImageFileName,
                instanceContextCtorArg = instanceContext,
            )
    }
}

public data class PrjCompleteCommandExtendedParameters(
    public var commandType: PrjCompleteCommandType = 0,
    public var anonymous: PrjCompleteCommandExtendedParameters0 = PrjCompleteCommandExtendedParameters0(),
)

public data class PrjCompleteCommandExtendedParameters0(
    public var notification: PrjCompleteCommandExtendedParameters00 = PrjCompleteCommandExtendedParameters00(),
    public var enumeration: PrjCompleteCommandExtendedParameters01 = PrjCompleteCommandExtendedParameters01(),
)

public class PrjCompleteCommandExtendedParameters01 internal constructor(
    dirEntryBufferHandleCtorArg: PrjDirEntryBufferHandle,
) {
    public var dirEntryBufferHandle: PrjDirEntryBufferHandle = dirEntryBufferHandleCtorArg
        internal set

    public constructor() : this(
        dirEntryBufferHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): PrjDirEntryBufferHandle = this.dirEntryBufferHandle

    public fun copy(dirEntryBufferHandle: PrjDirEntryBufferHandle = this.dirEntryBufferHandle): PrjCompleteCommandExtendedParameters01 = PrjCompleteCommandExtendedParameters01(dirEntryBufferHandleCtorArg = dirEntryBufferHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrjCompleteCommandExtendedParameters01) return false
        if (this.dirEntryBufferHandle != other.dirEntryBufferHandle) return false
        return true
    }

    override fun hashCode(): Int = this.dirEntryBufferHandle.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjCompleteCommandExtendedParameters01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjCompleteCommandExtendedParameters01> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PrjCompleteCommandExtendedParameters01 =
                    PrjCompleteCommandExtendedParameters01(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PrjCompleteCommandExtendedParameters01) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.dirEntryBufferHandle)
                }
            }

        public operator fun invoke(
            dirEntryBufferHandle: PrjDirEntryBufferHandle = MutPtr(0L),
        ): PrjCompleteCommandExtendedParameters01 =
            PrjCompleteCommandExtendedParameters01(
                dirEntryBufferHandleCtorArg = dirEntryBufferHandle,
            )
    }
}

public data class PrjCompleteCommandExtendedParameters00(
    public var notificationMask: PrjNotifyTypes = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjCompleteCommandExtendedParameters00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjCompleteCommandExtendedParameters00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PrjCompleteCommandExtendedParameters00 =
                    PrjCompleteCommandExtendedParameters00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PrjCompleteCommandExtendedParameters00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.notificationMask)
                }
            }
    }
}

public data class PrjExtendedInfo(
    public var infoType: PrjExtInfoType = 0,
    public var nextInfoOffset: UInt = 0u,
    public var anonymous: PrjExtendedInfo0 = PrjExtendedInfo0(),
)

public data class PrjExtendedInfo0(
    public var symlink: PrjExtendedInfo00 = PrjExtendedInfo00(),
)

public class PrjExtendedInfo00 internal constructor(
    targetNameCtorArg: Pcwstr,
) {
    public var targetName: Pcwstr = targetNameCtorArg
        internal set

    public constructor() : this(
        targetNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.targetName

    public fun copy(targetName: Pcwstr = this.targetName): PrjExtendedInfo00 = PrjExtendedInfo00(targetNameCtorArg = targetName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrjExtendedInfo00) return false
        if (this.targetName != other.targetName) return false
        return true
    }

    override fun hashCode(): Int = this.targetName.hashCode()

    public companion object {
        public operator fun invoke(
            targetName: Pcwstr = ConstPtr(0L),
        ): PrjExtendedInfo00 =
            PrjExtendedInfo00(
                targetNameCtorArg = targetName,
            )
    }
}

public data class PrjFileBasicInfo(
    public var isDirectory: Boolean = false,
    public var fileSize: Long = 0L,
    public var creationTime: Long = 0L,
    public var lastAccessTime: Long = 0L,
    public var lastWriteTime: Long = 0L,
    public var changeTime: Long = 0L,
    public var fileAttributes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjFileBasicInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjFileBasicInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): PrjFileBasicInfo =
                    PrjFileBasicInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: PrjFileBasicInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.isDirectory)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.fileSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.creationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.lastAccessTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.lastWriteTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.changeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.fileAttributes)
                }
            }
    }
}

public class PrjNotificationMapping internal constructor(
    public var notificationBitMask: PrjNotifyTypes,
    notificationRootCtorArg: Pcwstr,
) {
    public var notificationRoot: Pcwstr = notificationRootCtorArg
        internal set

    public constructor() : this(
        notificationBitMask = 0u,
        notificationRootCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): PrjNotifyTypes = this.notificationBitMask

    public operator fun component2(): Pcwstr = this.notificationRoot

    public fun copy(notificationBitMask: PrjNotifyTypes = this.notificationBitMask, notificationRoot: Pcwstr = this.notificationRoot): PrjNotificationMapping = PrjNotificationMapping(notificationBitMask = notificationBitMask, notificationRootCtorArg = notificationRoot)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrjNotificationMapping) return false
        if (this.notificationBitMask != other.notificationBitMask) return false
        if (this.notificationRoot != other.notificationRoot) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.notificationBitMask.hashCode()
        result = 31 * result + this.notificationRoot.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            notificationBitMask: PrjNotifyTypes = 0u,
            notificationRoot: Pcwstr = ConstPtr(0L),
        ): PrjNotificationMapping =
            PrjNotificationMapping(
                notificationBitMask = notificationBitMask,
                notificationRootCtorArg = notificationRoot,
            )
    }
}

public data class PrjNotificationParameters(
    public var postCreate: PrjNotificationParameters0 = PrjNotificationParameters0(),
    public var fileRenamed: PrjNotificationParameters1 = PrjNotificationParameters1(),
    public var fileDeletedOnHandleClose: PrjNotificationParameters2 = PrjNotificationParameters2(),
)

public data class PrjNotificationParameters2(
    public var isFileModified: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjNotificationParameters2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjNotificationParameters2> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): PrjNotificationParameters2 =
                    PrjNotificationParameters2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PrjNotificationParameters2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.isFileModified)
                }
            }
    }
}

public data class PrjNotificationParameters1(
    public var notificationMask: PrjNotifyTypes = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjNotificationParameters1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjNotificationParameters1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PrjNotificationParameters1 =
                    PrjNotificationParameters1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PrjNotificationParameters1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.notificationMask)
                }
            }
    }
}

public data class PrjNotificationParameters0(
    public var notificationMask: PrjNotifyTypes = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjNotificationParameters0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjNotificationParameters0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PrjNotificationParameters0 =
                    PrjNotificationParameters0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PrjNotificationParameters0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.notificationMask)
                }
            }
    }
}

public data class PrjPlaceholderInfo(
    public var fileBasicInfo: PrjFileBasicInfo = PrjFileBasicInfo(),
    public var eaInformation: PrjPlaceholderInfo0 = PrjPlaceholderInfo0(),
    public var securityInformation: PrjPlaceholderInfo1 = PrjPlaceholderInfo1(),
    public var streamsInformation: PrjPlaceholderInfo2 = PrjPlaceholderInfo2(),
    public var versionInfo: PrjPlaceholderVersionInfo = PrjPlaceholderVersionInfo(),
    public var variableData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrjPlaceholderInfo) return false
        if (this.fileBasicInfo != other.fileBasicInfo) return false
        if (this.eaInformation != other.eaInformation) return false
        if (this.securityInformation != other.securityInformation) return false
        if (this.streamsInformation != other.streamsInformation) return false
        if (this.versionInfo != other.versionInfo) return false
        if (!this.variableData.contentEquals(other.variableData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileBasicInfo.hashCode()
        result = 31 * result + this.eaInformation.hashCode()
        result = 31 * result + this.securityInformation.hashCode()
        result = 31 * result + this.streamsInformation.hashCode()
        result = 31 * result + this.versionInfo.hashCode()
        result = 31 * result + this.variableData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjPlaceholderInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjPlaceholderInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 344L
                override fun readNative(addr: Long): PrjPlaceholderInfo =
                    PrjPlaceholderInfo(
                        (PrjFileBasicInfo.typeLayout()).readNative(addr),
                        (PrjPlaceholderInfo0.typeLayout()).readNative(addr + 56L),
                        (PrjPlaceholderInfo1.typeLayout()).readNative(addr + 64L),
                        (PrjPlaceholderInfo2.typeLayout()).readNative(addr + 72L),
                        (PrjPlaceholderVersionInfo.typeLayout()).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 336L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PrjPlaceholderInfo) {
                    (PrjFileBasicInfo.typeLayout()).writeNative(addr, value.fileBasicInfo)
                    (PrjPlaceholderInfo0.typeLayout()).writeNative(addr + 56L, value.eaInformation)
                    (PrjPlaceholderInfo1.typeLayout()).writeNative(addr + 64L, value.securityInformation)
                    (PrjPlaceholderInfo2.typeLayout()).writeNative(addr + 72L, value.streamsInformation)
                    (PrjPlaceholderVersionInfo.typeLayout()).writeNative(addr + 80L, value.versionInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 336L, value.variableData.toList())
                }
            }
    }
}

public data class PrjPlaceholderInfo0(
    public var eaBufferSize: UInt = 0u,
    public var offsetToFirstEa: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjPlaceholderInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjPlaceholderInfo0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PrjPlaceholderInfo0 =
                    PrjPlaceholderInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PrjPlaceholderInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.eaBufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.offsetToFirstEa)
                }
            }
    }
}

public data class PrjPlaceholderInfo1(
    public var securityBufferSize: UInt = 0u,
    public var offsetToSecurityDescriptor: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjPlaceholderInfo1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjPlaceholderInfo1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PrjPlaceholderInfo1 =
                    PrjPlaceholderInfo1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PrjPlaceholderInfo1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.securityBufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.offsetToSecurityDescriptor)
                }
            }
    }
}

public data class PrjPlaceholderInfo2(
    public var streamsInfoBufferSize: UInt = 0u,
    public var offsetToFirstStreamInfo: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjPlaceholderInfo2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjPlaceholderInfo2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PrjPlaceholderInfo2 =
                    PrjPlaceholderInfo2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PrjPlaceholderInfo2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.streamsInfoBufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.offsetToFirstStreamInfo)
                }
            }
    }
}

public data class PrjPlaceholderVersionInfo(
    public var providerID: UByteArray = UByteArray(128),
    public var contentID: UByteArray = UByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrjPlaceholderVersionInfo) return false
        if (!this.providerID.contentEquals(other.providerID)) return false
        if (!this.contentID.contentEquals(other.contentID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.providerID.contentHashCode()
        result = 31 * result + this.contentID.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjPlaceholderVersionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjPlaceholderVersionInfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 256L
                override fun readNative(addr: Long): PrjPlaceholderVersionInfo =
                    PrjPlaceholderVersionInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                        ).readNative(addr + 128L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PrjPlaceholderVersionInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                    ).writeNative(addr, value.providerID.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                    ).writeNative(addr + 128L, value.contentID.toList())
                }
            }
    }
}

public class PrjStartvirtualizingOptions internal constructor(
    public var flags: PrjStartvirtualizingFlags,
    public var poolThreadCount: UInt,
    public var concurrentThreadCount: UInt,
    notificationMappingsCtorArg: MutPtr<PrjNotificationMapping>,
    public var notificationMappingsCount: UInt,
) {
    public var notificationMappings: MutPtr<PrjNotificationMapping> = notificationMappingsCtorArg
        internal set

    public constructor() : this(
        flags = 0,
        poolThreadCount = 0u,
        concurrentThreadCount = 0u,
        notificationMappingsCtorArg = MutPtr(0L),
        notificationMappingsCount = 0u,
    )

    public operator fun component1(): PrjStartvirtualizingFlags = this.flags

    public operator fun component2(): UInt = this.poolThreadCount

    public operator fun component3(): UInt = this.concurrentThreadCount

    public operator fun component4(): MutPtr<PrjNotificationMapping> = this.notificationMappings

    public operator fun component5(): UInt = this.notificationMappingsCount

    public fun copy(flags: PrjStartvirtualizingFlags = this.flags, poolThreadCount: UInt = this.poolThreadCount, concurrentThreadCount: UInt = this.concurrentThreadCount, notificationMappings: MutPtr<PrjNotificationMapping> = this.notificationMappings, notificationMappingsCount: UInt = this.notificationMappingsCount): PrjStartvirtualizingOptions = PrjStartvirtualizingOptions(flags = flags, poolThreadCount = poolThreadCount, concurrentThreadCount = concurrentThreadCount, notificationMappingsCtorArg = notificationMappings, notificationMappingsCount = notificationMappingsCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PrjStartvirtualizingOptions) return false
        if (this.flags != other.flags) return false
        if (this.poolThreadCount != other.poolThreadCount) return false
        if (this.concurrentThreadCount != other.concurrentThreadCount) return false
        if (this.notificationMappings != other.notificationMappings) return false
        if (this.notificationMappingsCount != other.notificationMappingsCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.poolThreadCount.hashCode()
        result = 31 * result + this.concurrentThreadCount.hashCode()
        result = 31 * result + this.notificationMappings.hashCode()
        result = 31 * result + this.notificationMappingsCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjStartvirtualizingOptions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrjStartvirtualizingOptions> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): PrjStartvirtualizingOptions =
                    PrjStartvirtualizingOptions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PrjNotificationMapping>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: PrjStartvirtualizingOptions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.poolThreadCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.concurrentThreadCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PrjNotificationMapping>(64)
                    ).writeNative(addr + 16L, value.notificationMappings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.notificationMappingsCount)
                }
            }

        public operator fun invoke(
            flags: PrjStartvirtualizingFlags = 0,
            poolThreadCount: UInt = 0u,
            concurrentThreadCount: UInt = 0u,
            notificationMappings: MutPtr<PrjNotificationMapping> = MutPtr(0L),
            notificationMappingsCount: UInt = 0u,
        ): PrjStartvirtualizingOptions =
            PrjStartvirtualizingOptions(
                flags = flags,
                poolThreadCount = poolThreadCount,
                concurrentThreadCount = concurrentThreadCount,
                notificationMappingsCtorArg = notificationMappings,
                notificationMappingsCount = notificationMappingsCount,
            )
    }
}

public data class PrjVirtualizationInstanceInfo(
    public var instanceID: Guid = Guid(),
    public var writeAlignment: UInt = 0u,
)
