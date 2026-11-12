@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.wdk.foundation.FastMutex
import io.github.kotlinmania.windowssys.windows.wdk.foundation.RtlSplayLinks
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SockaddrStorage
import io.github.kotlinmania.windowssys.windows.win32.security.AuditEventType
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry

public data class SecFlags(
    public var flags: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecFlags> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SecFlags =
                    SecFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.flags)
                }
            }
    }
}

public class SecNegotiationInfo internal constructor(
    public var size: UInt,
    public var nameLength: UInt,
    nameCtorArg: MutPtr<UShort>,
    reservedCtorArg: MutPtr<CVoid>,
) {
    public var name: MutPtr<UShort> = nameCtorArg
        internal set

    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        nameLength = 0u,
        nameCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): UInt = this.nameLength

    public operator fun component3(): MutPtr<UShort> = this.name

    public operator fun component4(): MutPtr<CVoid> = this.reserved

    public fun copy(size: UInt = this.size, nameLength: UInt = this.nameLength, name: MutPtr<UShort> = this.name, reserved: MutPtr<CVoid> = this.reserved): SecNegotiationInfo = SecNegotiationInfo(size = size, nameLength = nameLength, nameCtorArg = name, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecNegotiationInfo) return false
        if (this.size != other.size) return false
        if (this.nameLength != other.nameLength) return false
        if (this.name != other.name) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.nameLength.hashCode()
        result = 31 * result + this.name.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecNegotiationInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecNegotiationInfo> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SecNegotiationInfo =
                    SecNegotiationInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SecNegotiationInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 8L, value.name)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.reserved)
                }
            }

        public operator fun invoke(
            size: UInt = 0u,
            nameLength: UInt = 0u,
            name: MutPtr<UShort> = MutPtr(0L),
            reserved: MutPtr<CVoid> = MutPtr(0L),
        ): SecNegotiationInfo =
            SecNegotiationInfo(
                size = size,
                nameLength = nameLength,
                nameCtorArg = name,
                reservedCtorArg = reserved,
            )
    }
}

public data class SecPresharedkey(
    public var keySize: UShort = 0u,
    public var key: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPresharedkey) return false
        if (this.keySize != other.keySize) return false
        if (!this.key.contentEquals(other.key)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keySize.hashCode()
        result = 31 * result + this.key.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPresharedkey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPresharedkey> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): SecPresharedkey =
                    SecPresharedkey(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: SecPresharedkey) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.keySize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 2L, value.key)
                }
            }
    }
}

public data class SecSrtpMasterKeyIdentifier(
    public var masterKeyIdentifierSize: UByte = 0u,
    public var masterKeyIdentifier: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecSrtpMasterKeyIdentifier) return false
        if (this.masterKeyIdentifierSize != other.masterKeyIdentifierSize) return false
        if (!this.masterKeyIdentifier.contentEquals(other.masterKeyIdentifier)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.masterKeyIdentifierSize.hashCode()
        result = 31 * result + this.masterKeyIdentifier.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecSrtpMasterKeyIdentifier> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecSrtpMasterKeyIdentifier> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SecSrtpMasterKeyIdentifier =
                    SecSrtpMasterKeyIdentifier(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: SecSrtpMasterKeyIdentifier) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.masterKeyIdentifierSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 1L, value.masterKeyIdentifier)
                }
            }
    }
}

public data class SetCachedRunsStateInputBuffer(
    public var enable: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SetCachedRunsStateInputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SetCachedRunsStateInputBuffer> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SetCachedRunsStateInputBuffer =
                    SetCachedRunsStateInputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SetCachedRunsStateInputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.enable)
                }
            }
    }
}

public class SeAuditInfo internal constructor(
    public var size: UInt,
    public var auditType: AuditEventType,
    public var auditOperation: SeAuditOperation,
    public var auditFlags: UInt,
    public var subsystemName: UnicodeString,
    public var objectTypeName: UnicodeString,
    public var objectName: UnicodeString,
    handleIdCtorArg: MutPtr<CVoid>,
    transactionIdCtorArg: MutPtr<Guid>,
    operationIdCtorArg: MutPtr<Luid>,
    public var objectCreation: Boolean,
    public var generateOnClose: Boolean,
) {
    public var handleId: MutPtr<CVoid> = handleIdCtorArg
        internal set

    public var transactionId: MutPtr<Guid> = transactionIdCtorArg
        internal set

    public var operationId: MutPtr<Luid> = operationIdCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        auditType = 0,
        auditOperation = 0,
        auditFlags = 0u,
        subsystemName = UnicodeString(),
        objectTypeName = UnicodeString(),
        objectName = UnicodeString(),
        handleIdCtorArg = MutPtr(0L),
        transactionIdCtorArg = MutPtr(0L),
        operationIdCtorArg = MutPtr(0L),
        objectCreation = false,
        generateOnClose = false,
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): AuditEventType = this.auditType

    public operator fun component3(): SeAuditOperation = this.auditOperation

    public operator fun component4(): UInt = this.auditFlags

    public operator fun component5(): UnicodeString = this.subsystemName

    public operator fun component6(): UnicodeString = this.objectTypeName

    public operator fun component7(): UnicodeString = this.objectName

    public operator fun component8(): MutPtr<CVoid> = this.handleId

    public operator fun component9(): MutPtr<Guid> = this.transactionId

    public operator fun component10(): MutPtr<Luid> = this.operationId

    public operator fun component11(): Boolean = this.objectCreation

    public operator fun component12(): Boolean = this.generateOnClose

    public fun copy(size: UInt = this.size, auditType: AuditEventType = this.auditType, auditOperation: SeAuditOperation = this.auditOperation, auditFlags: UInt = this.auditFlags, subsystemName: UnicodeString = this.subsystemName, objectTypeName: UnicodeString = this.objectTypeName, objectName: UnicodeString = this.objectName, handleId: MutPtr<CVoid> = this.handleId, transactionId: MutPtr<Guid> = this.transactionId, operationId: MutPtr<Luid> = this.operationId, objectCreation: Boolean = this.objectCreation, generateOnClose: Boolean = this.generateOnClose): SeAuditInfo = SeAuditInfo(size = size, auditType = auditType, auditOperation = auditOperation, auditFlags = auditFlags, subsystemName = subsystemName, objectTypeName = objectTypeName, objectName = objectName, handleIdCtorArg = handleId, transactionIdCtorArg = transactionId, operationIdCtorArg = operationId, objectCreation = objectCreation, generateOnClose = generateOnClose)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SeAuditInfo) return false
        if (this.size != other.size) return false
        if (this.auditType != other.auditType) return false
        if (this.auditOperation != other.auditOperation) return false
        if (this.auditFlags != other.auditFlags) return false
        if (this.subsystemName != other.subsystemName) return false
        if (this.objectTypeName != other.objectTypeName) return false
        if (this.objectName != other.objectName) return false
        if (this.handleId != other.handleId) return false
        if (this.transactionId != other.transactionId) return false
        if (this.operationId != other.operationId) return false
        if (this.objectCreation != other.objectCreation) return false
        if (this.generateOnClose != other.generateOnClose) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.auditType.hashCode()
        result = 31 * result + this.auditOperation.hashCode()
        result = 31 * result + this.auditFlags.hashCode()
        result = 31 * result + this.subsystemName.hashCode()
        result = 31 * result + this.objectTypeName.hashCode()
        result = 31 * result + this.objectName.hashCode()
        result = 31 * result + this.handleId.hashCode()
        result = 31 * result + this.transactionId.hashCode()
        result = 31 * result + this.operationId.hashCode()
        result = 31 * result + this.objectCreation.hashCode()
        result = 31 * result + this.generateOnClose.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UInt = 0u,
            auditType: AuditEventType = 0,
            auditOperation: SeAuditOperation = 0,
            auditFlags: UInt = 0u,
            subsystemName: UnicodeString = UnicodeString(),
            objectTypeName: UnicodeString = UnicodeString(),
            objectName: UnicodeString = UnicodeString(),
            handleId: MutPtr<CVoid> = MutPtr(0L),
            transactionId: MutPtr<Guid> = MutPtr(0L),
            operationId: MutPtr<Luid> = MutPtr(0L),
            objectCreation: Boolean = false,
            generateOnClose: Boolean = false,
        ): SeAuditInfo =
            SeAuditInfo(
                size = size,
                auditType = auditType,
                auditOperation = auditOperation,
                auditFlags = auditFlags,
                subsystemName = subsystemName,
                objectTypeName = objectTypeName,
                objectName = objectName,
                handleIdCtorArg = handleId,
                transactionIdCtorArg = transactionId,
                operationIdCtorArg = operationId,
                objectCreation = objectCreation,
                generateOnClose = generateOnClose,
            )
    }
}

public class SeExports {
    public var seCreateTokenPrivilege: Luid = Luid()

    public var seAssignPrimaryTokenPrivilege: Luid = Luid()

    public var seLockMemoryPrivilege: Luid = Luid()

    public var seIncreaseQuotaPrivilege: Luid = Luid()

    public var seUnsolicitedInputPrivilege: Luid = Luid()

    public var seTcbPrivilege: Luid = Luid()

    public var seSecurityPrivilege: Luid = Luid()

    public var seTakeOwnershipPrivilege: Luid = Luid()

    public var seLoadDriverPrivilege: Luid = Luid()

    public var seCreatePagefilePrivilege: Luid = Luid()

    public var seIncreaseBasePriorityPrivilege: Luid = Luid()

    public var seSystemProfilePrivilege: Luid = Luid()

    public var seSystemtimePrivilege: Luid = Luid()

    public var seProfileSingleProcessPrivilege: Luid = Luid()

    public var seCreatePermanentPrivilege: Luid = Luid()

    public var seBackupPrivilege: Luid = Luid()

    public var seRestorePrivilege: Luid = Luid()

    public var seShutdownPrivilege: Luid = Luid()

    public var seDebugPrivilege: Luid = Luid()

    public var seAuditPrivilege: Luid = Luid()

    public var seSystemEnvironmentPrivilege: Luid = Luid()

    public var seChangeNotifyPrivilege: Luid = Luid()

    public var seRemoteShutdownPrivilege: Luid = Luid()

    public var seNullSid: Psid = MutPtr(0L)
        internal set

    public var seWorldSid: Psid = MutPtr(0L)
        internal set

    public var seLocalSid: Psid = MutPtr(0L)
        internal set

    public var seCreatorOwnerSid: Psid = MutPtr(0L)
        internal set

    public var seCreatorGroupSid: Psid = MutPtr(0L)
        internal set

    public var seNtAuthoritySid: Psid = MutPtr(0L)
        internal set

    public var seDialupSid: Psid = MutPtr(0L)
        internal set

    public var seNetworkSid: Psid = MutPtr(0L)
        internal set

    public var seBatchSid: Psid = MutPtr(0L)
        internal set

    public var seInteractiveSid: Psid = MutPtr(0L)
        internal set

    public var seLocalSystemSid: Psid = MutPtr(0L)
        internal set

    public var seAliasAdminsSid: Psid = MutPtr(0L)
        internal set

    public var seAliasUsersSid: Psid = MutPtr(0L)
        internal set

    public var seAliasGuestsSid: Psid = MutPtr(0L)
        internal set

    public var seAliasPowerUsersSid: Psid = MutPtr(0L)
        internal set

    public var seAliasAccountOpsSid: Psid = MutPtr(0L)
        internal set

    public var seAliasSystemOpsSid: Psid = MutPtr(0L)
        internal set

    public var seAliasPrintOpsSid: Psid = MutPtr(0L)
        internal set

    public var seAliasBackupOpsSid: Psid = MutPtr(0L)
        internal set

    public var seAuthenticatedUsersSid: Psid = MutPtr(0L)
        internal set

    public var seRestrictedSid: Psid = MutPtr(0L)
        internal set

    public var seAnonymousLogonSid: Psid = MutPtr(0L)
        internal set

    public var seUndockPrivilege: Luid = Luid()

    public var seSyncAgentPrivilege: Luid = Luid()

    public var seEnableDelegationPrivilege: Luid = Luid()

    public var seLocalServiceSid: Psid = MutPtr(0L)
        internal set

    public var seNetworkServiceSid: Psid = MutPtr(0L)
        internal set

    public var seManageVolumePrivilege: Luid = Luid()

    public var seImpersonatePrivilege: Luid = Luid()

    public var seCreateGlobalPrivilege: Luid = Luid()

    public var seTrustedCredManAccessPrivilege: Luid = Luid()

    public var seRelabelPrivilege: Luid = Luid()

    public var seIncreaseWorkingSetPrivilege: Luid = Luid()

    public var seTimeZonePrivilege: Luid = Luid()

    public var seCreateSymbolicLinkPrivilege: Luid = Luid()

    public var seIUserSid: Psid = MutPtr(0L)
        internal set

    public var seUntrustedMandatorySid: Psid = MutPtr(0L)
        internal set

    public var seLowMandatorySid: Psid = MutPtr(0L)
        internal set

    public var seMediumMandatorySid: Psid = MutPtr(0L)
        internal set

    public var seHighMandatorySid: Psid = MutPtr(0L)
        internal set

    public var seSystemMandatorySid: Psid = MutPtr(0L)
        internal set

    public var seOwnerRightsSid: Psid = MutPtr(0L)
        internal set

    public var seAllAppPackagesSid: Psid = MutPtr(0L)
        internal set

    public var seUserModeDriversSid: Psid = MutPtr(0L)
        internal set

    public var seProcTrustWinTcbSid: Psid = MutPtr(0L)
        internal set

    public var seTrustedInstallerSid: Psid = MutPtr(0L)
        internal set

    public var seDelegateSessionUserImpersonatePrivilege: Luid = Luid()

    public var seAppSiloSid: Psid = MutPtr(0L)
        internal set

    public var seAppSiloVolumeRootMinimalCapabilitySid: Psid = MutPtr(0L)
        internal set

    public var seAppSiloProfilesRootMinimalCapabilitySid: Psid = MutPtr(0L)
        internal set
}

public class SrvOpenEcpContext internal constructor(
    shareNameCtorArg: MutPtr<UnicodeString>,
    socketAddressCtorArg: MutPtr<SockaddrStorage>,
    public var oplockBlockState: Boolean,
    public var oplockAppState: Boolean,
    public var oplockFinalState: Boolean,
    public var version: UShort,
    public var instanceType: SrvInstanceType,
) {
    public var shareName: MutPtr<UnicodeString> = shareNameCtorArg
        internal set

    public var socketAddress: MutPtr<SockaddrStorage> = socketAddressCtorArg
        internal set

    public constructor() : this(
        shareNameCtorArg = MutPtr(0L),
        socketAddressCtorArg = MutPtr(0L),
        oplockBlockState = false,
        oplockAppState = false,
        oplockFinalState = false,
        version = 0u,
        instanceType = 0,
    )

    public operator fun component1(): MutPtr<UnicodeString> = this.shareName

    public operator fun component2(): MutPtr<SockaddrStorage> = this.socketAddress

    public operator fun component3(): Boolean = this.oplockBlockState

    public operator fun component4(): Boolean = this.oplockAppState

    public operator fun component5(): Boolean = this.oplockFinalState

    public operator fun component6(): UShort = this.version

    public operator fun component7(): SrvInstanceType = this.instanceType

    public fun copy(shareName: MutPtr<UnicodeString> = this.shareName, socketAddress: MutPtr<SockaddrStorage> = this.socketAddress, oplockBlockState: Boolean = this.oplockBlockState, oplockAppState: Boolean = this.oplockAppState, oplockFinalState: Boolean = this.oplockFinalState, version: UShort = this.version, instanceType: SrvInstanceType = this.instanceType): SrvOpenEcpContext = SrvOpenEcpContext(shareNameCtorArg = shareName, socketAddressCtorArg = socketAddress, oplockBlockState = oplockBlockState, oplockAppState = oplockAppState, oplockFinalState = oplockFinalState, version = version, instanceType = instanceType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SrvOpenEcpContext) return false
        if (this.shareName != other.shareName) return false
        if (this.socketAddress != other.socketAddress) return false
        if (this.oplockBlockState != other.oplockBlockState) return false
        if (this.oplockAppState != other.oplockAppState) return false
        if (this.oplockFinalState != other.oplockFinalState) return false
        if (this.version != other.version) return false
        if (this.instanceType != other.instanceType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.shareName.hashCode()
        result = 31 * result + this.socketAddress.hashCode()
        result = 31 * result + this.oplockBlockState.hashCode()
        result = 31 * result + this.oplockAppState.hashCode()
        result = 31 * result + this.oplockFinalState.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.instanceType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SrvOpenEcpContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SrvOpenEcpContext> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SrvOpenEcpContext =
                    SrvOpenEcpContext(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UnicodeString>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SockaddrStorage>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 17L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SrvOpenEcpContext) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UnicodeString>(64)
                    ).writeNative(addr, value.shareName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SockaddrStorage>(64)
                    ).writeNative(addr + 8L, value.socketAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 16L, value.oplockBlockState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 17L, value.oplockAppState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 18L, value.oplockFinalState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.instanceType)
                }
            }

        public operator fun invoke(
            shareName: MutPtr<UnicodeString> = MutPtr(0L),
            socketAddress: MutPtr<SockaddrStorage> = MutPtr(0L),
            oplockBlockState: Boolean = false,
            oplockAppState: Boolean = false,
            oplockFinalState: Boolean = false,
            version: UShort = 0u,
            instanceType: SrvInstanceType = 0,
        ): SrvOpenEcpContext =
            SrvOpenEcpContext(
                shareNameCtorArg = shareName,
                socketAddressCtorArg = socketAddress,
                oplockBlockState = oplockBlockState,
                oplockAppState = oplockAppState,
                oplockFinalState = oplockFinalState,
                version = version,
                instanceType = instanceType,
            )
    }
}

public data class SystemProcessTrustLabelAce(
    public var header: AceHeader = AceHeader(),
    public var mask: UInt = 0u,
    public var sidStart: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemProcessTrustLabelAce> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemProcessTrustLabelAce> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SystemProcessTrustLabelAce =
                    SystemProcessTrustLabelAce(
                        (AceHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SystemProcessTrustLabelAce) {
                    (AceHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sidStart)
                }
            }
    }
}

public class SecBuffer internal constructor(
    public var cbBuffer: UInt,
    public var bufferType: UInt,
    pvBufferCtorArg: MutPtr<CVoid>,
) {
    public var pvBuffer: MutPtr<CVoid> = pvBufferCtorArg
        internal set

    public constructor() : this(
        cbBuffer = 0u,
        bufferType = 0u,
        pvBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbBuffer

    public operator fun component2(): UInt = this.bufferType

    public operator fun component3(): MutPtr<CVoid> = this.pvBuffer

    public fun copy(cbBuffer: UInt = this.cbBuffer, bufferType: UInt = this.bufferType, pvBuffer: MutPtr<CVoid> = this.pvBuffer): SecBuffer = SecBuffer(cbBuffer = cbBuffer, bufferType = bufferType, pvBufferCtorArg = pvBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecBuffer) return false
        if (this.cbBuffer != other.cbBuffer) return false
        if (this.bufferType != other.bufferType) return false
        if (this.pvBuffer != other.pvBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbBuffer.hashCode()
        result = 31 * result + this.bufferType.hashCode()
        result = 31 * result + this.pvBuffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecBuffer> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SecBuffer =
                    SecBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bufferType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pvBuffer)
                }
            }

        public operator fun invoke(
            cbBuffer: UInt = 0u,
            bufferType: UInt = 0u,
            pvBuffer: MutPtr<CVoid> = MutPtr(0L),
        ): SecBuffer =
            SecBuffer(
                cbBuffer = cbBuffer,
                bufferType = bufferType,
                pvBufferCtorArg = pvBuffer,
            )
    }
}

public class SecBufferDesc internal constructor(
    public var ulVersion: UInt,
    public var cBuffers: UInt,
    pBuffersCtorArg: MutPtr<SecBuffer>,
) {
    public var pBuffers: MutPtr<SecBuffer> = pBuffersCtorArg
        internal set

    public constructor() : this(
        ulVersion = 0u,
        cBuffers = 0u,
        pBuffersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.ulVersion

    public operator fun component2(): UInt = this.cBuffers

    public operator fun component3(): MutPtr<SecBuffer> = this.pBuffers

    public fun copy(ulVersion: UInt = this.ulVersion, cBuffers: UInt = this.cBuffers, pBuffers: MutPtr<SecBuffer> = this.pBuffers): SecBufferDesc = SecBufferDesc(ulVersion = ulVersion, cBuffers = cBuffers, pBuffersCtorArg = pBuffers)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecBufferDesc) return false
        if (this.ulVersion != other.ulVersion) return false
        if (this.cBuffers != other.cBuffers) return false
        if (this.pBuffers != other.pBuffers) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulVersion.hashCode()
        result = 31 * result + this.cBuffers.hashCode()
        result = 31 * result + this.pBuffers.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecBufferDesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecBufferDesc> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SecBufferDesc =
                    SecBufferDesc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SecBuffer>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecBufferDesc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cBuffers)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SecBuffer>(64)
                    ).writeNative(addr + 8L, value.pBuffers)
                }
            }

        public operator fun invoke(
            ulVersion: UInt = 0u,
            cBuffers: UInt = 0u,
            pBuffers: MutPtr<SecBuffer> = MutPtr(0L),
        ): SecBufferDesc =
            SecBufferDesc(
                ulVersion = ulVersion,
                cBuffers = cBuffers,
                pBuffersCtorArg = pBuffers,
            )
    }
}

public data class SecHandle(
    public var dwLower: Int = 0,
    public var dwUpper: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecHandle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecHandle> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SecHandle =
                    SecHandle(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecHandle) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwLower)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.dwUpper)
                }
            }
    }
}

public class Tunnel internal constructor(
    public var mutex: FastMutex,
    cacheCtorArg: MutPtr<RtlSplayLinks>,
    public var timerQueue: ListEntry,
    public var numEntries: UShort,
) {
    public var cache: MutPtr<RtlSplayLinks> = cacheCtorArg
        internal set

    public constructor() : this(
        mutex = FastMutex(),
        cacheCtorArg = MutPtr(0L),
        timerQueue = ListEntry(),
        numEntries = 0u,
    )

    public operator fun component1(): FastMutex = this.mutex

    public operator fun component2(): MutPtr<RtlSplayLinks> = this.cache

    public operator fun component3(): ListEntry = this.timerQueue

    public operator fun component4(): UShort = this.numEntries

    public fun copy(mutex: FastMutex = this.mutex, cache: MutPtr<RtlSplayLinks> = this.cache, timerQueue: ListEntry = this.timerQueue, numEntries: UShort = this.numEntries): Tunnel = Tunnel(mutex = mutex, cacheCtorArg = cache, timerQueue = timerQueue, numEntries = numEntries)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tunnel) return false
        if (this.mutex != other.mutex) return false
        if (this.cache != other.cache) return false
        if (this.timerQueue != other.timerQueue) return false
        if (this.numEntries != other.numEntries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mutex.hashCode()
        result = 31 * result + this.cache.hashCode()
        result = 31 * result + this.timerQueue.hashCode()
        result = 31 * result + this.numEntries.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mutex: FastMutex = FastMutex(),
            cache: MutPtr<RtlSplayLinks> = MutPtr(0L),
            timerQueue: ListEntry = ListEntry(),
            numEntries: UShort = 0u,
        ): Tunnel =
            Tunnel(
                mutex = mutex,
                cacheCtorArg = cache,
                timerQueue = timerQueue,
                numEntries = numEntries,
            )
    }
}

public class UnicodePrefixTable internal constructor(
    public var nodeTypeCode: Short,
    public var nameLength: Short,
    nextPrefixTreeCtorArg: MutPtr<UnicodePrefixTableEntry>,
    lastNextEntryCtorArg: MutPtr<UnicodePrefixTableEntry>,
) {
    public var nextPrefixTree: MutPtr<UnicodePrefixTableEntry> = nextPrefixTreeCtorArg
        internal set

    public var lastNextEntry: MutPtr<UnicodePrefixTableEntry> = lastNextEntryCtorArg
        internal set

    public constructor() : this(
        nodeTypeCode = 0,
        nameLength = 0,
        nextPrefixTreeCtorArg = MutPtr(0L),
        lastNextEntryCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Short = this.nodeTypeCode

    public operator fun component2(): Short = this.nameLength

    public operator fun component3(): MutPtr<UnicodePrefixTableEntry> = this.nextPrefixTree

    public operator fun component4(): MutPtr<UnicodePrefixTableEntry> = this.lastNextEntry

    public fun copy(nodeTypeCode: Short = this.nodeTypeCode, nameLength: Short = this.nameLength, nextPrefixTree: MutPtr<UnicodePrefixTableEntry> = this.nextPrefixTree, lastNextEntry: MutPtr<UnicodePrefixTableEntry> = this.lastNextEntry): UnicodePrefixTable = UnicodePrefixTable(nodeTypeCode = nodeTypeCode, nameLength = nameLength, nextPrefixTreeCtorArg = nextPrefixTree, lastNextEntryCtorArg = lastNextEntry)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UnicodePrefixTable) return false
        if (this.nodeTypeCode != other.nodeTypeCode) return false
        if (this.nameLength != other.nameLength) return false
        if (this.nextPrefixTree != other.nextPrefixTree) return false
        if (this.lastNextEntry != other.lastNextEntry) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nodeTypeCode.hashCode()
        result = 31 * result + this.nameLength.hashCode()
        result = 31 * result + this.nextPrefixTree.hashCode()
        result = 31 * result + this.lastNextEntry.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UnicodePrefixTable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UnicodePrefixTable> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): UnicodePrefixTable =
                    UnicodePrefixTable(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UnicodePrefixTableEntry>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UnicodePrefixTableEntry>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UnicodePrefixTable) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.nodeTypeCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.nameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UnicodePrefixTableEntry>(64)
                    ).writeNative(addr + 8L, value.nextPrefixTree)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UnicodePrefixTableEntry>(64)
                    ).writeNative(addr + 16L, value.lastNextEntry)
                }
            }

        public operator fun invoke(
            nodeTypeCode: Short = 0,
            nameLength: Short = 0,
            nextPrefixTree: MutPtr<UnicodePrefixTableEntry> = MutPtr(0L),
            lastNextEntry: MutPtr<UnicodePrefixTableEntry> = MutPtr(0L),
        ): UnicodePrefixTable =
            UnicodePrefixTable(
                nodeTypeCode = nodeTypeCode,
                nameLength = nameLength,
                nextPrefixTreeCtorArg = nextPrefixTree,
                lastNextEntryCtorArg = lastNextEntry,
            )
    }
}

public class UnicodePrefixTableEntry internal constructor(
    public var nodeTypeCode: Short,
    public var nameLength: Short,
    nextPrefixTreeCtorArg: MutPtr<UnicodePrefixTableEntry>,
    caseMatchCtorArg: MutPtr<UnicodePrefixTableEntry>,
    public var links: RtlSplayLinks,
    prefixCtorArg: MutPtr<UnicodeString>,
) {
    public var nextPrefixTree: MutPtr<UnicodePrefixTableEntry> = nextPrefixTreeCtorArg
        internal set

    public var caseMatch: MutPtr<UnicodePrefixTableEntry> = caseMatchCtorArg
        internal set

    public var prefix: MutPtr<UnicodeString> = prefixCtorArg
        internal set

    public constructor() : this(
        nodeTypeCode = 0,
        nameLength = 0,
        nextPrefixTreeCtorArg = MutPtr(0L),
        caseMatchCtorArg = MutPtr(0L),
        links = RtlSplayLinks(),
        prefixCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Short = this.nodeTypeCode

    public operator fun component2(): Short = this.nameLength

    public operator fun component3(): MutPtr<UnicodePrefixTableEntry> = this.nextPrefixTree

    public operator fun component4(): MutPtr<UnicodePrefixTableEntry> = this.caseMatch

    public operator fun component5(): RtlSplayLinks = this.links

    public operator fun component6(): MutPtr<UnicodeString> = this.prefix

    public fun copy(nodeTypeCode: Short = this.nodeTypeCode, nameLength: Short = this.nameLength, nextPrefixTree: MutPtr<UnicodePrefixTableEntry> = this.nextPrefixTree, caseMatch: MutPtr<UnicodePrefixTableEntry> = this.caseMatch, links: RtlSplayLinks = this.links, prefix: MutPtr<UnicodeString> = this.prefix): UnicodePrefixTableEntry = UnicodePrefixTableEntry(nodeTypeCode = nodeTypeCode, nameLength = nameLength, nextPrefixTreeCtorArg = nextPrefixTree, caseMatchCtorArg = caseMatch, links = links, prefixCtorArg = prefix)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UnicodePrefixTableEntry) return false
        if (this.nodeTypeCode != other.nodeTypeCode) return false
        if (this.nameLength != other.nameLength) return false
        if (this.nextPrefixTree != other.nextPrefixTree) return false
        if (this.caseMatch != other.caseMatch) return false
        if (this.links != other.links) return false
        if (this.prefix != other.prefix) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nodeTypeCode.hashCode()
        result = 31 * result + this.nameLength.hashCode()
        result = 31 * result + this.nextPrefixTree.hashCode()
        result = 31 * result + this.caseMatch.hashCode()
        result = 31 * result + this.links.hashCode()
        result = 31 * result + this.prefix.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nodeTypeCode: Short = 0,
            nameLength: Short = 0,
            nextPrefixTree: MutPtr<UnicodePrefixTableEntry> = MutPtr(0L),
            caseMatch: MutPtr<UnicodePrefixTableEntry> = MutPtr(0L),
            links: RtlSplayLinks = RtlSplayLinks(),
            prefix: MutPtr<UnicodeString> = MutPtr(0L),
        ): UnicodePrefixTableEntry =
            UnicodePrefixTableEntry(
                nodeTypeCode = nodeTypeCode,
                nameLength = nameLength,
                nextPrefixTreeCtorArg = nextPrefixTree,
                caseMatchCtorArg = caseMatch,
                links = links,
                prefixCtorArg = prefix,
            )
    }
}

public data class UsnJournalData(
    public var usnJournalID: ULong = 0uL,
    public var firstUsn: Long = 0L,
    public var nextUsn: Long = 0L,
    public var lowestValidUsn: Long = 0L,
    public var maxUsn: Long = 0L,
    public var maximumSize: ULong = 0uL,
    public var allocationDelta: ULong = 0uL,
    public var minSupportedMajorVersion: UShort = 0u,
    public var maxSupportedMajorVersion: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsnJournalData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsnJournalData> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): UsnJournalData =
                    UsnJournalData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 58L),
                    )
                override fun writeNative(addr: Long, value: UsnJournalData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.usnJournalID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.firstUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.nextUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.lowestValidUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.maxUsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.maximumSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.allocationDelta)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 56L, value.minSupportedMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 58L, value.maxSupportedMajorVersion)
                }
            }
    }
}

public data class UsnRecord(
    public var recordLength: UInt = 0u,
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
    public var fileReferenceNumber: ULong = 0uL,
    public var parentFileReferenceNumber: ULong = 0uL,
    public var usn: Long = 0L,
    public var timeStamp: Long = 0L,
    public var reason: UInt = 0u,
    public var sourceInfo: UInt = 0u,
    public var securityId: UInt = 0u,
    public var fileAttributes: UInt = 0u,
    public var fileNameLength: UShort = 0u,
    public var fileNameOffset: UShort = 0u,
    public var fileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsnRecord) return false
        if (this.recordLength != other.recordLength) return false
        if (this.majorVersion != other.majorVersion) return false
        if (this.minorVersion != other.minorVersion) return false
        if (this.fileReferenceNumber != other.fileReferenceNumber) return false
        if (this.parentFileReferenceNumber != other.parentFileReferenceNumber) return false
        if (this.usn != other.usn) return false
        if (this.timeStamp != other.timeStamp) return false
        if (this.reason != other.reason) return false
        if (this.sourceInfo != other.sourceInfo) return false
        if (this.securityId != other.securityId) return false
        if (this.fileAttributes != other.fileAttributes) return false
        if (this.fileNameLength != other.fileNameLength) return false
        if (this.fileNameOffset != other.fileNameOffset) return false
        if (!this.fileName.contentEquals(other.fileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.recordLength.hashCode()
        result = 31 * result + this.majorVersion.hashCode()
        result = 31 * result + this.minorVersion.hashCode()
        result = 31 * result + this.fileReferenceNumber.hashCode()
        result = 31 * result + this.parentFileReferenceNumber.hashCode()
        result = 31 * result + this.usn.hashCode()
        result = 31 * result + this.timeStamp.hashCode()
        result = 31 * result + this.reason.hashCode()
        result = 31 * result + this.sourceInfo.hashCode()
        result = 31 * result + this.securityId.hashCode()
        result = 31 * result + this.fileAttributes.hashCode()
        result = 31 * result + this.fileNameLength.hashCode()
        result = 31 * result + this.fileNameOffset.hashCode()
        result = 31 * result + this.fileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsnRecord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UsnRecord> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): UsnRecord =
                    UsnRecord(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 58L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 60L),
                    )
                override fun writeNative(addr: Long, value: UsnRecord) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.recordLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.fileReferenceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.parentFileReferenceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.usn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.timeStamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.reason)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.sourceInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.securityId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.fileAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 56L, value.fileNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 58L, value.fileNameOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 60L, value.fileName)
                }
            }
    }
}

public data class VcnRangeInputBuffer(
    public var startingVcn: Long = 0L,
    public var clusterCount: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VcnRangeInputBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VcnRangeInputBuffer> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): VcnRangeInputBuffer =
                    VcnRangeInputBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: VcnRangeInputBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.startingVcn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.clusterCount)
                }
            }
    }
}

public class VolumeRefsInfoBuffer {
    public var cacheSizeInBytes: Long = 0L

    public var allocatedCacheInBytes: Long = 0L

    public var populatedCacheInBytes: Long = 0L

    public var inErrorCacheInBytes: Long = 0L

    public var memoryUsedForCacheMetadata: Long = 0L

    public var cacheLineSize: UInt = 0u

    public var cacheTransactionsOutstanding: Int = 0

    public var cacheLinesFree: Int = 0

    public var cacheLinesInError: Int = 0

    public var cacheHitsInBytes: Long = 0L

    public var cacheMissesInBytes: Long = 0L

    public var cachePopulationUpdatesInBytes: Long = 0L

    public var cacheWriteThroughUpdatesInBytes: Long = 0L

    public var cacheInvalidationsInBytes: Long = 0L

    public var cacheOverReadsInBytes: Long = 0L

    public var metadataWrittenBytes: Long = 0L

    public var cacheHitCounter: Int = 0

    public var cacheMissCounter: Int = 0

    public var cacheLineAllocationCounter: Int = 0

    public var cacheInvalidationsCounter: Int = 0

    public var cachePopulationUpdatesCounter: Int = 0

    public var cacheWriteThroughUpdatesCounter: Int = 0

    public var maxCacheTransactionsOutstanding: Int = 0

    public var dataWritesReallocationCount: Int = 0

    public var dataInPlaceWriteCount: Int = 0

    public var metadataAllocationsFastTierCount: Int = 0

    public var metadataAllocationsSlowTierCount: Int = 0

    public var dataAllocationsFastTierCount: Int = 0

    public var dataAllocationsSlowTierCount: Int = 0

    public var destagesSlowTierToFastTier: Int = 0

    public var destagesFastTierToSlowTier: Int = 0

    public var slowTierDataFillRatio: Int = 0

    public var fastTierDataFillRatio: Int = 0

    public var slowTierMetadataFillRatio: Int = 0

    public var fastTierMetadataFillRatio: Int = 0

    public var slowToFastDestageReadLatency: Int = 0

    public var slowToFastDestageReadLatencyBase: Int = 0

    public var slowToFastDestageWriteLatency: Int = 0

    public var slowToFastDestageWriteLatencyBase: Int = 0

    public var fastToSlowDestageReadLatency: Int = 0

    public var fastToSlowDestageReadLatencyBase: Int = 0

    public var fastToSlowDestageWriteLatency: Int = 0

    public var fastToSlowDestageWriteLatencyBase: Int = 0

    public var slowTierContainerFillRatio: Int = 0

    public var slowTierContainerFillRatioBase: Int = 0

    public var fastTierContainerFillRatio: Int = 0

    public var fastTierContainerFillRatioBase: Int = 0

    public var treeUpdateLatency: Int = 0

    public var treeUpdateLatencyBase: Int = 0

    public var checkpointLatency: Int = 0

    public var checkpointLatencyBase: Int = 0

    public var treeUpdateCount: Int = 0

    public var checkpointCount: Int = 0

    public var logWriteCount: Int = 0

    public var logFillRatio: Int = 0

    public var readCacheInvalidationsForOverwrite: Int = 0

    public var readCacheInvalidationsForReuse: Int = 0

    public var readCacheInvalidationsGeneral: Int = 0

    public var readCacheChecksOnMount: Int = 0

    public var readCacheIssuesOnMount: Int = 0

    public var trimLatency: Int = 0

    public var trimLatencyBase: Int = 0

    public var dataCompactionCount: Int = 0

    public var compactionReadLatency: Int = 0

    public var compactionReadLatencyBase: Int = 0

    public var compactionWriteLatency: Int = 0

    public var compactionWriteLatencyBase: Int = 0

    public var dataInPlaceWriteClusterCount: Long = 0L

    public var compactionFailedDueToIneligibleContainer: Int = 0

    public var compactionFailedDueToMaxFragmentation: Int = 0

    public var compactedContainerFillRatio: Int = 0

    public var compactedContainerFillRatioBase: Int = 0

    public var containerMoveRetryCount: Int = 0

    public var containerMoveFailedDueToIneligibleContainer: Int = 0

    public var compactionFailureCount: Int = 0

    public var containerMoveFailureCount: Int = 0

    public var numberOfDirtyMetadataPages: Long = 0L

    public var numberOfDirtyTableListEntries: Int = 0

    public var numberOfDeleteQueueEntries: Int = 0

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeRefsInfoBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolumeRefsInfoBuffer> {
                override val sizeBytes: Long = 376L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): VolumeRefsInfoBuffer =
                    VolumeRefsInfoBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 116L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 148L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 156L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 164L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 172L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 180L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 188L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 196L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 200L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 204L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 208L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 212L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 216L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 220L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 224L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 228L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 232L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 236L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 240L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 244L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 248L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 252L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 256L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 260L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 264L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 268L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 272L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 276L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 280L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 284L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 288L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 292L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 296L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 300L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 304L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 308L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 312L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 320L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 328L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 332L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 336L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 340L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 344L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 348L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 352L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 356L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 360L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 368L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 372L),
                    )
                override fun writeNative(addr: Long, value: VolumeRefsInfoBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.cacheSizeInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.allocatedCacheInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.populatedCacheInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.inErrorCacheInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.memoryUsedForCacheMetadata)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.cacheLineSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.cacheTransactionsOutstanding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.cacheLinesFree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.cacheLinesInError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.cacheHitsInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.cacheMissesInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 72L, value.cachePopulationUpdatesInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 80L, value.cacheWriteThroughUpdatesInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 88L, value.cacheInvalidationsInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 96L, value.cacheOverReadsInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 104L, value.metadataWrittenBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 112L, value.cacheHitCounter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 116L, value.cacheMissCounter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 120L, value.cacheLineAllocationCounter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 124L, value.cacheInvalidationsCounter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 128L, value.cachePopulationUpdatesCounter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 132L, value.cacheWriteThroughUpdatesCounter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 136L, value.maxCacheTransactionsOutstanding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 140L, value.dataWritesReallocationCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 144L, value.dataInPlaceWriteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 148L, value.metadataAllocationsFastTierCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 152L, value.metadataAllocationsSlowTierCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 156L, value.dataAllocationsFastTierCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 160L, value.dataAllocationsSlowTierCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 164L, value.destagesSlowTierToFastTier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 168L, value.destagesFastTierToSlowTier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 172L, value.slowTierDataFillRatio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 176L, value.fastTierDataFillRatio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 180L, value.slowTierMetadataFillRatio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 184L, value.fastTierMetadataFillRatio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 188L, value.slowToFastDestageReadLatency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 192L, value.slowToFastDestageReadLatencyBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 196L, value.slowToFastDestageWriteLatency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 200L, value.slowToFastDestageWriteLatencyBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 204L, value.fastToSlowDestageReadLatency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 208L, value.fastToSlowDestageReadLatencyBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 212L, value.fastToSlowDestageWriteLatency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 216L, value.fastToSlowDestageWriteLatencyBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 220L, value.slowTierContainerFillRatio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 224L, value.slowTierContainerFillRatioBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 228L, value.fastTierContainerFillRatio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 232L, value.fastTierContainerFillRatioBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 236L, value.treeUpdateLatency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 240L, value.treeUpdateLatencyBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 244L, value.checkpointLatency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 248L, value.checkpointLatencyBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 252L, value.treeUpdateCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 256L, value.checkpointCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 260L, value.logWriteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 264L, value.logFillRatio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 268L, value.readCacheInvalidationsForOverwrite)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 272L, value.readCacheInvalidationsForReuse)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 276L, value.readCacheInvalidationsGeneral)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 280L, value.readCacheChecksOnMount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 284L, value.readCacheIssuesOnMount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 288L, value.trimLatency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 292L, value.trimLatencyBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 296L, value.dataCompactionCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 300L, value.compactionReadLatency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 304L, value.compactionReadLatencyBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 308L, value.compactionWriteLatency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 312L, value.compactionWriteLatencyBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 320L, value.dataInPlaceWriteClusterCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 328L, value.compactionFailedDueToIneligibleContainer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 332L, value.compactionFailedDueToMaxFragmentation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 336L, value.compactedContainerFillRatio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 340L, value.compactedContainerFillRatioBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 344L, value.containerMoveRetryCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 348L, value.containerMoveFailedDueToIneligibleContainer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 352L, value.compactionFailureCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 356L, value.containerMoveFailureCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 360L, value.numberOfDirtyMetadataPages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 368L, value.numberOfDirtyTableListEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 372L, value.numberOfDeleteQueueEntries)
                }
            }
    }
}
