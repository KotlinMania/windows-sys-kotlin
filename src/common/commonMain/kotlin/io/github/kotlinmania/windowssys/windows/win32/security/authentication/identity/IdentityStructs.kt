@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.QuotaLimits
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityImpersonationLevel
import io.github.kotlinmania.windowssys.windows.win32.security.SidNameUse
import io.github.kotlinmania.windowssys.windows.win32.security.TokenDefaultDacl
import io.github.kotlinmania.windowssys.windows.win32.security.TokenDeviceClaims
import io.github.kotlinmania.windowssys.windows.win32.security.TokenGroups
import io.github.kotlinmania.windowssys.windows.win32.security.TokenOwner
import io.github.kotlinmania.windowssys.windows.win32.security.TokenPrimaryGroup
import io.github.kotlinmania.windowssys.windows.win32.security.TokenPrivileges
import io.github.kotlinmania.windowssys.windows.win32.security.TokenUser
import io.github.kotlinmania.windowssys.windows.win32.security.TokenUserClaims
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.Credentialw
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.SecHandle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.AlgId
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.Hcertstore
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry
import io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement.LmOwfPassword
import io.github.kotlinmania.windowssys.windows.win32.system.rpc.SecWinntAuthIdentityA
import io.github.kotlinmania.windowssys.windows.win32.system.rpc.SecWinntAuthIdentityW

public data class AuditPolicyInformation(
    public var auditSubCategoryGuid: Guid = Guid(),
    public var auditingInformation: UInt = 0u,
    public var auditCategoryGuid: Guid = Guid(),
)

public class CentralAccessPolicy internal constructor(
    capidCtorArg: Psid,
    public var name: LsaUnicodeString,
    public var description: LsaUnicodeString,
    public var changeId: LsaUnicodeString,
    public var flags: UInt,
    public var cAPECount: UInt,
    cAPEsCtorArg: MutPtr<MutPtr<CentralAccessPolicyEntry>>,
) {
    public var capid: Psid = capidCtorArg
        internal set

    public var cAPEs: MutPtr<MutPtr<CentralAccessPolicyEntry>> = cAPEsCtorArg
        internal set

    public constructor() : this(
        capidCtorArg = MutPtr(0L),
        name = LsaUnicodeString(),
        description = LsaUnicodeString(),
        changeId = LsaUnicodeString(),
        flags = 0u,
        cAPECount = 0u,
        cAPEsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Psid = this.capid

    public operator fun component2(): LsaUnicodeString = this.name

    public operator fun component3(): LsaUnicodeString = this.description

    public operator fun component4(): LsaUnicodeString = this.changeId

    public operator fun component5(): UInt = this.flags

    public operator fun component6(): UInt = this.cAPECount

    public operator fun component7(): MutPtr<MutPtr<CentralAccessPolicyEntry>> = this.cAPEs

    public fun copy(capid: Psid = this.capid, name: LsaUnicodeString = this.name, description: LsaUnicodeString = this.description, changeId: LsaUnicodeString = this.changeId, flags: UInt = this.flags, cAPECount: UInt = this.cAPECount, cAPEs: MutPtr<MutPtr<CentralAccessPolicyEntry>> = this.cAPEs): CentralAccessPolicy = CentralAccessPolicy(capidCtorArg = capid, name = name, description = description, changeId = changeId, flags = flags, cAPECount = cAPECount, cAPEsCtorArg = cAPEs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CentralAccessPolicy) return false
        if (this.capid != other.capid) return false
        if (this.name != other.name) return false
        if (this.description != other.description) return false
        if (this.changeId != other.changeId) return false
        if (this.flags != other.flags) return false
        if (this.cAPECount != other.cAPECount) return false
        if (this.cAPEs != other.cAPEs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.capid.hashCode()
        result = 31 * result + this.name.hashCode()
        result = 31 * result + this.description.hashCode()
        result = 31 * result + this.changeId.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.cAPECount.hashCode()
        result = 31 * result + this.cAPEs.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            capid: Psid = MutPtr(0L),
            name: LsaUnicodeString = LsaUnicodeString(),
            description: LsaUnicodeString = LsaUnicodeString(),
            changeId: LsaUnicodeString = LsaUnicodeString(),
            flags: UInt = 0u,
            cAPECount: UInt = 0u,
            cAPEs: MutPtr<MutPtr<CentralAccessPolicyEntry>> = MutPtr(0L),
        ): CentralAccessPolicy =
            CentralAccessPolicy(
                capidCtorArg = capid,
                name = name,
                description = description,
                changeId = changeId,
                flags = flags,
                cAPECount = cAPECount,
                cAPEsCtorArg = cAPEs,
            )
    }
}

public class CentralAccessPolicyEntry internal constructor(
    public var name: LsaUnicodeString,
    public var description: LsaUnicodeString,
    public var changeId: LsaUnicodeString,
    public var lengthAppliesTo: UInt,
    appliesToCtorArg: MutPtr<UByte>,
    public var lengthSD: UInt,
    sdCtorArg: PsecurityDescriptor,
    public var lengthStagedSD: UInt,
    stagedSDCtorArg: PsecurityDescriptor,
    public var flags: UInt,
) {
    public var appliesTo: MutPtr<UByte> = appliesToCtorArg
        internal set

    public var sd: PsecurityDescriptor = sdCtorArg
        internal set

    public var stagedSD: PsecurityDescriptor = stagedSDCtorArg
        internal set

    public constructor() : this(
        name = LsaUnicodeString(),
        description = LsaUnicodeString(),
        changeId = LsaUnicodeString(),
        lengthAppliesTo = 0u,
        appliesToCtorArg = MutPtr(0L),
        lengthSD = 0u,
        sdCtorArg = MutPtr(0L),
        lengthStagedSD = 0u,
        stagedSDCtorArg = MutPtr(0L),
        flags = 0u,
    )

    public operator fun component1(): LsaUnicodeString = this.name

    public operator fun component2(): LsaUnicodeString = this.description

    public operator fun component3(): LsaUnicodeString = this.changeId

    public operator fun component4(): UInt = this.lengthAppliesTo

    public operator fun component5(): MutPtr<UByte> = this.appliesTo

    public operator fun component6(): UInt = this.lengthSD

    public operator fun component7(): PsecurityDescriptor = this.sd

    public operator fun component8(): UInt = this.lengthStagedSD

    public operator fun component9(): PsecurityDescriptor = this.stagedSD

    public operator fun component10(): UInt = this.flags

    public fun copy(name: LsaUnicodeString = this.name, description: LsaUnicodeString = this.description, changeId: LsaUnicodeString = this.changeId, lengthAppliesTo: UInt = this.lengthAppliesTo, appliesTo: MutPtr<UByte> = this.appliesTo, lengthSD: UInt = this.lengthSD, sd: PsecurityDescriptor = this.sd, lengthStagedSD: UInt = this.lengthStagedSD, stagedSD: PsecurityDescriptor = this.stagedSD, flags: UInt = this.flags): CentralAccessPolicyEntry = CentralAccessPolicyEntry(name = name, description = description, changeId = changeId, lengthAppliesTo = lengthAppliesTo, appliesToCtorArg = appliesTo, lengthSD = lengthSD, sdCtorArg = sd, lengthStagedSD = lengthStagedSD, stagedSDCtorArg = stagedSD, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CentralAccessPolicyEntry) return false
        if (this.name != other.name) return false
        if (this.description != other.description) return false
        if (this.changeId != other.changeId) return false
        if (this.lengthAppliesTo != other.lengthAppliesTo) return false
        if (this.appliesTo != other.appliesTo) return false
        if (this.lengthSD != other.lengthSD) return false
        if (this.sd != other.sd) return false
        if (this.lengthStagedSD != other.lengthStagedSD) return false
        if (this.stagedSD != other.stagedSD) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.description.hashCode()
        result = 31 * result + this.changeId.hashCode()
        result = 31 * result + this.lengthAppliesTo.hashCode()
        result = 31 * result + this.appliesTo.hashCode()
        result = 31 * result + this.lengthSD.hashCode()
        result = 31 * result + this.sd.hashCode()
        result = 31 * result + this.lengthStagedSD.hashCode()
        result = 31 * result + this.stagedSD.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            name: LsaUnicodeString = LsaUnicodeString(),
            description: LsaUnicodeString = LsaUnicodeString(),
            changeId: LsaUnicodeString = LsaUnicodeString(),
            lengthAppliesTo: UInt = 0u,
            appliesTo: MutPtr<UByte> = MutPtr(0L),
            lengthSD: UInt = 0u,
            sd: PsecurityDescriptor = MutPtr(0L),
            lengthStagedSD: UInt = 0u,
            stagedSD: PsecurityDescriptor = MutPtr(0L),
            flags: UInt = 0u,
        ): CentralAccessPolicyEntry =
            CentralAccessPolicyEntry(
                name = name,
                description = description,
                changeId = changeId,
                lengthAppliesTo = lengthAppliesTo,
                appliesToCtorArg = appliesTo,
                lengthSD = lengthSD,
                sdCtorArg = sd,
                lengthStagedSD = lengthStagedSD,
                stagedSDCtorArg = stagedSD,
                flags = flags,
            )
    }
}

public data class ClearBlock(
    public var data: ByteArray = ByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClearBlock) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int = this.data.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClearBlock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClearBlock> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): ClearBlock =
                    ClearBlock(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (8).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ClearBlock) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (8).toInt())
                    ).writeNative(addr, value.data)
                }
            }
    }
}

public class CryptoSettings internal constructor(
    public var eAlgorithmUsage: ETlsAlgorithmUsage,
    public var strCngAlgId: LsaUnicodeString,
    public var cChainingModes: UInt,
    rgstrChainingModesCtorArg: MutPtr<LsaUnicodeString>,
    public var dwMinBitLength: UInt,
    public var dwMaxBitLength: UInt,
) {
    public var rgstrChainingModes: MutPtr<LsaUnicodeString> = rgstrChainingModesCtorArg
        internal set

    public constructor() : this(
        eAlgorithmUsage = 0,
        strCngAlgId = LsaUnicodeString(),
        cChainingModes = 0u,
        rgstrChainingModesCtorArg = MutPtr(0L),
        dwMinBitLength = 0u,
        dwMaxBitLength = 0u,
    )

    public operator fun component1(): ETlsAlgorithmUsage = this.eAlgorithmUsage

    public operator fun component2(): LsaUnicodeString = this.strCngAlgId

    public operator fun component3(): UInt = this.cChainingModes

    public operator fun component4(): MutPtr<LsaUnicodeString> = this.rgstrChainingModes

    public operator fun component5(): UInt = this.dwMinBitLength

    public operator fun component6(): UInt = this.dwMaxBitLength

    public fun copy(eAlgorithmUsage: ETlsAlgorithmUsage = this.eAlgorithmUsage, strCngAlgId: LsaUnicodeString = this.strCngAlgId, cChainingModes: UInt = this.cChainingModes, rgstrChainingModes: MutPtr<LsaUnicodeString> = this.rgstrChainingModes, dwMinBitLength: UInt = this.dwMinBitLength, dwMaxBitLength: UInt = this.dwMaxBitLength): CryptoSettings = CryptoSettings(eAlgorithmUsage = eAlgorithmUsage, strCngAlgId = strCngAlgId, cChainingModes = cChainingModes, rgstrChainingModesCtorArg = rgstrChainingModes, dwMinBitLength = dwMinBitLength, dwMaxBitLength = dwMaxBitLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CryptoSettings) return false
        if (this.eAlgorithmUsage != other.eAlgorithmUsage) return false
        if (this.strCngAlgId != other.strCngAlgId) return false
        if (this.cChainingModes != other.cChainingModes) return false
        if (this.rgstrChainingModes != other.rgstrChainingModes) return false
        if (this.dwMinBitLength != other.dwMinBitLength) return false
        if (this.dwMaxBitLength != other.dwMaxBitLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eAlgorithmUsage.hashCode()
        result = 31 * result + this.strCngAlgId.hashCode()
        result = 31 * result + this.cChainingModes.hashCode()
        result = 31 * result + this.rgstrChainingModes.hashCode()
        result = 31 * result + this.dwMinBitLength.hashCode()
        result = 31 * result + this.dwMaxBitLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            eAlgorithmUsage: ETlsAlgorithmUsage = 0,
            strCngAlgId: LsaUnicodeString = LsaUnicodeString(),
            cChainingModes: UInt = 0u,
            rgstrChainingModes: MutPtr<LsaUnicodeString> = MutPtr(0L),
            dwMinBitLength: UInt = 0u,
            dwMaxBitLength: UInt = 0u,
        ): CryptoSettings =
            CryptoSettings(
                eAlgorithmUsage = eAlgorithmUsage,
                strCngAlgId = strCngAlgId,
                cChainingModes = cChainingModes,
                rgstrChainingModesCtorArg = rgstrChainingModes,
                dwMinBitLength = dwMinBitLength,
                dwMaxBitLength = dwMaxBitLength,
            )
    }
}

public data class DomainPasswordInformation(
    public var minPasswordLength: UShort = 0u,
    public var passwordHistoryLength: UShort = 0u,
    public var passwordProperties: DomainPasswordProperties = 0u,
    public var maxPasswordAge: Long = 0L,
    public var minPasswordAge: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DomainPasswordInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DomainPasswordInformation> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DomainPasswordInformation =
                    DomainPasswordInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DomainPasswordInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.minPasswordLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.passwordHistoryLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.passwordProperties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.maxPasswordAge)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.minPasswordAge)
                }
            }
    }
}

public data class EncryptedCredentialw(
    public var cred: Credentialw = Credentialw(),
    public var clearCredentialBlobSize: UInt = 0u,
)

public data class KdcProxyCacheEntryData(
    public var sinceLastUsed: ULong = 0uL,
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var proxyServerName: LsaUnicodeString = LsaUnicodeString(),
    public var proxyServerVdir: LsaUnicodeString = LsaUnicodeString(),
    public var proxyServerPort: UShort = 0u,
    public var logonId: Luid = Luid(),
    public var credUserName: LsaUnicodeString = LsaUnicodeString(),
    public var credDomainName: LsaUnicodeString = LsaUnicodeString(),
    public var globalCache: Boolean = false,
)

public data class KerbAddBindingCacheEntryExRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var realmName: LsaUnicodeString = LsaUnicodeString(),
    public var kdcAddress: LsaUnicodeString = LsaUnicodeString(),
    public var addressType: KerbAddressType = 0u,
    public var dcFlags: UInt = 0u,
)

public data class KerbAddBindingCacheEntryRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var realmName: LsaUnicodeString = LsaUnicodeString(),
    public var kdcAddress: LsaUnicodeString = LsaUnicodeString(),
    public var addressType: KerbAddressType = 0u,
)

public data class KerbAddCredentialsRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var userName: LsaUnicodeString = LsaUnicodeString(),
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var password: LsaUnicodeString = LsaUnicodeString(),
    public var logonId: Luid = Luid(),
    public var flags: KerbRequestFlags = 0u,
)

public data class KerbAddCredentialsRequestEx(
    public var credentials: KerbAddCredentialsRequest = KerbAddCredentialsRequest(),
    public var principalNameCount: UInt = 0u,
    public var principalNames: List<LsaUnicodeString> = List(1) { LsaUnicodeString() },
)

public class KerbAuthData internal constructor(
    public var type: UInt,
    public var length: UInt,
    dataCtorArg: MutPtr<UByte>,
) {
    public var data: MutPtr<UByte> = dataCtorArg
        internal set

    public constructor() : this(
        type = 0u,
        length = 0u,
        dataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.type

    public operator fun component2(): UInt = this.length

    public operator fun component3(): MutPtr<UByte> = this.data

    public fun copy(type: UInt = this.type, length: UInt = this.length, data: MutPtr<UByte> = this.data): KerbAuthData = KerbAuthData(type = type, length = length, dataCtorArg = data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KerbAuthData) return false
        if (this.type != other.type) return false
        if (this.length != other.length) return false
        if (this.data != other.data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.data.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbAuthData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbAuthData> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): KerbAuthData =
                    KerbAuthData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KerbAuthData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.data)
                }
            }

        public operator fun invoke(
            type: UInt = 0u,
            length: UInt = 0u,
            data: MutPtr<UByte> = MutPtr(0L),
        ): KerbAuthData =
            KerbAuthData(
                type = type,
                length = length,
                dataCtorArg = data,
            )
    }
}

public data class KerbBindingCacheEntryData(
    public var discoveryTime: ULong = 0uL,
    public var realmName: LsaUnicodeString = LsaUnicodeString(),
    public var kdcAddress: LsaUnicodeString = LsaUnicodeString(),
    public var addressType: KerbAddressType = 0u,
    public var flags: UInt = 0u,
    public var dcFlags: UInt = 0u,
    public var cacheFlags: UInt = 0u,
    public var kdcName: LsaUnicodeString = LsaUnicodeString(),
)

public data class KerbCertificateHashinfo(
    public var storeNameLength: UShort = 0u,
    public var hashLength: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbCertificateHashinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbCertificateHashinfo> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): KerbCertificateHashinfo =
                    KerbCertificateHashinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: KerbCertificateHashinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.storeNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.hashLength)
                }
            }
    }
}

public data class KerbCertificateInfo(
    public var certInfoSize: UInt = 0u,
    public var infoType: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbCertificateInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbCertificateInfo> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): KerbCertificateInfo =
                    KerbCertificateInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KerbCertificateInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.certInfoSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.infoType)
                }
            }
    }
}

public class KerbCertificateLogon internal constructor(
    public var messageType: KerbLogonSubmitType,
    public var domainName: LsaUnicodeString,
    public var userName: LsaUnicodeString,
    public var pin: LsaUnicodeString,
    public var flags: UInt,
    public var cspDataLength: UInt,
    cspDataCtorArg: MutPtr<UByte>,
) {
    public var cspData: MutPtr<UByte> = cspDataCtorArg
        internal set

    public constructor() : this(
        messageType = 0,
        domainName = LsaUnicodeString(),
        userName = LsaUnicodeString(),
        pin = LsaUnicodeString(),
        flags = 0u,
        cspDataLength = 0u,
        cspDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): KerbLogonSubmitType = this.messageType

    public operator fun component2(): LsaUnicodeString = this.domainName

    public operator fun component3(): LsaUnicodeString = this.userName

    public operator fun component4(): LsaUnicodeString = this.pin

    public operator fun component5(): UInt = this.flags

    public operator fun component6(): UInt = this.cspDataLength

    public operator fun component7(): MutPtr<UByte> = this.cspData

    public fun copy(messageType: KerbLogonSubmitType = this.messageType, domainName: LsaUnicodeString = this.domainName, userName: LsaUnicodeString = this.userName, pin: LsaUnicodeString = this.pin, flags: UInt = this.flags, cspDataLength: UInt = this.cspDataLength, cspData: MutPtr<UByte> = this.cspData): KerbCertificateLogon = KerbCertificateLogon(messageType = messageType, domainName = domainName, userName = userName, pin = pin, flags = flags, cspDataLength = cspDataLength, cspDataCtorArg = cspData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KerbCertificateLogon) return false
        if (this.messageType != other.messageType) return false
        if (this.domainName != other.domainName) return false
        if (this.userName != other.userName) return false
        if (this.pin != other.pin) return false
        if (this.flags != other.flags) return false
        if (this.cspDataLength != other.cspDataLength) return false
        if (this.cspData != other.cspData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.domainName.hashCode()
        result = 31 * result + this.userName.hashCode()
        result = 31 * result + this.pin.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.cspDataLength.hashCode()
        result = 31 * result + this.cspData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            messageType: KerbLogonSubmitType = 0,
            domainName: LsaUnicodeString = LsaUnicodeString(),
            userName: LsaUnicodeString = LsaUnicodeString(),
            pin: LsaUnicodeString = LsaUnicodeString(),
            flags: UInt = 0u,
            cspDataLength: UInt = 0u,
            cspData: MutPtr<UByte> = MutPtr(0L),
        ): KerbCertificateLogon =
            KerbCertificateLogon(
                messageType = messageType,
                domainName = domainName,
                userName = userName,
                pin = pin,
                flags = flags,
                cspDataLength = cspDataLength,
                cspDataCtorArg = cspData,
            )
    }
}

public class KerbCertificateS4uLogon internal constructor(
    public var messageType: KerbLogonSubmitType,
    public var flags: UInt,
    public var userPrincipalName: LsaUnicodeString,
    public var domainName: LsaUnicodeString,
    public var certificateLength: UInt,
    certificateCtorArg: MutPtr<UByte>,
) {
    public var certificate: MutPtr<UByte> = certificateCtorArg
        internal set

    public constructor() : this(
        messageType = 0,
        flags = 0u,
        userPrincipalName = LsaUnicodeString(),
        domainName = LsaUnicodeString(),
        certificateLength = 0u,
        certificateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): KerbLogonSubmitType = this.messageType

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): LsaUnicodeString = this.userPrincipalName

    public operator fun component4(): LsaUnicodeString = this.domainName

    public operator fun component5(): UInt = this.certificateLength

    public operator fun component6(): MutPtr<UByte> = this.certificate

    public fun copy(messageType: KerbLogonSubmitType = this.messageType, flags: UInt = this.flags, userPrincipalName: LsaUnicodeString = this.userPrincipalName, domainName: LsaUnicodeString = this.domainName, certificateLength: UInt = this.certificateLength, certificate: MutPtr<UByte> = this.certificate): KerbCertificateS4uLogon = KerbCertificateS4uLogon(messageType = messageType, flags = flags, userPrincipalName = userPrincipalName, domainName = domainName, certificateLength = certificateLength, certificateCtorArg = certificate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KerbCertificateS4uLogon) return false
        if (this.messageType != other.messageType) return false
        if (this.flags != other.flags) return false
        if (this.userPrincipalName != other.userPrincipalName) return false
        if (this.domainName != other.domainName) return false
        if (this.certificateLength != other.certificateLength) return false
        if (this.certificate != other.certificate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.userPrincipalName.hashCode()
        result = 31 * result + this.domainName.hashCode()
        result = 31 * result + this.certificateLength.hashCode()
        result = 31 * result + this.certificate.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            messageType: KerbLogonSubmitType = 0,
            flags: UInt = 0u,
            userPrincipalName: LsaUnicodeString = LsaUnicodeString(),
            domainName: LsaUnicodeString = LsaUnicodeString(),
            certificateLength: UInt = 0u,
            certificate: MutPtr<UByte> = MutPtr(0L),
        ): KerbCertificateS4uLogon =
            KerbCertificateS4uLogon(
                messageType = messageType,
                flags = flags,
                userPrincipalName = userPrincipalName,
                domainName = domainName,
                certificateLength = certificateLength,
                certificateCtorArg = certificate,
            )
    }
}

public data class KerbCertificateUnlockLogon(
    public var logon: KerbCertificateLogon = KerbCertificateLogon(),
    public var logonId: Luid = Luid(),
)

public data class KerbChangepasswordRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var accountName: LsaUnicodeString = LsaUnicodeString(),
    public var oldPassword: LsaUnicodeString = LsaUnicodeString(),
    public var newPassword: LsaUnicodeString = LsaUnicodeString(),
    public var impersonating: Boolean = false,
)

public data class KerbCleanupMachinePkinitCredsRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var logonId: Luid = Luid(),
)

public data class KerbCloudKerberosDebugData(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbCloudKerberosDebugData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbCloudKerberosDebugData> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): KerbCloudKerberosDebugData =
                    KerbCloudKerberosDebugData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KerbCloudKerberosDebugData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class KerbCloudKerberosDebugDataV0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbCloudKerberosDebugDataV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbCloudKerberosDebugDataV0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): KerbCloudKerberosDebugDataV0 =
                    KerbCloudKerberosDebugDataV0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KerbCloudKerberosDebugDataV0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class KerbCloudKerberosDebugRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var logonId: Luid = Luid(),
)

public data class KerbCloudKerberosDebugResponse(
    public var messageType: KerbProtocolMessageType = 0,
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var data: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KerbCloudKerberosDebugResponse) return false
        if (this.messageType != other.messageType) return false
        if (this.version != other.version) return false
        if (this.length != other.length) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbCloudKerberosDebugResponse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbCloudKerberosDebugResponse> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): KerbCloudKerberosDebugResponse =
                    KerbCloudKerberosDebugResponse(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: KerbCloudKerberosDebugResponse) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.messageType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 12L, value.data)
                }
            }
    }
}

public class KerbCryptoKey internal constructor(
    public var keyType: KerbCryptoKeyType,
    public var length: UInt,
    valueCtorArg: MutPtr<UByte>,
) {
    public var value: MutPtr<UByte> = valueCtorArg
        internal set

    public constructor() : this(
        keyType = 0,
        length = 0u,
        valueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): KerbCryptoKeyType = this.keyType

    public operator fun component2(): UInt = this.length

    public operator fun component3(): MutPtr<UByte> = this.value

    public fun copy(keyType: KerbCryptoKeyType = this.keyType, length: UInt = this.length, value: MutPtr<UByte> = this.value): KerbCryptoKey = KerbCryptoKey(keyType = keyType, length = length, valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KerbCryptoKey) return false
        if (this.keyType != other.keyType) return false
        if (this.length != other.length) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyType.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbCryptoKey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbCryptoKey> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): KerbCryptoKey =
                    KerbCryptoKey(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KerbCryptoKey) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.keyType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.value)
                }
            }

        public operator fun invoke(
            keyType: KerbCryptoKeyType = 0,
            length: UInt = 0u,
            value: MutPtr<UByte> = MutPtr(0L),
        ): KerbCryptoKey =
            KerbCryptoKey(
                keyType = keyType,
                length = length,
                valueCtorArg = value,
            )
    }
}

public data class KerbCryptoKey32(
    public var keyType: Int = 0,
    public var length: UInt = 0u,
    public var offset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbCryptoKey32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbCryptoKey32> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): KerbCryptoKey32 =
                    KerbCryptoKey32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KerbCryptoKey32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.keyType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.offset)
                }
            }
    }
}

public class KerbDecryptRequest internal constructor(
    public var messageType: KerbProtocolMessageType,
    public var logonId: Luid,
    public var flags: UInt,
    public var cryptoType: Int,
    public var keyUsage: Int,
    public var key: KerbCryptoKey,
    public var encryptedDataSize: UInt,
    public var initialVectorSize: UInt,
    initialVectorCtorArg: MutPtr<UByte>,
    encryptedDataCtorArg: MutPtr<UByte>,
) {
    public var initialVector: MutPtr<UByte> = initialVectorCtorArg
        internal set

    public var encryptedData: MutPtr<UByte> = encryptedDataCtorArg
        internal set

    public constructor() : this(
        messageType = 0,
        logonId = Luid(),
        flags = 0u,
        cryptoType = 0,
        keyUsage = 0,
        key = KerbCryptoKey(),
        encryptedDataSize = 0u,
        initialVectorSize = 0u,
        initialVectorCtorArg = MutPtr(0L),
        encryptedDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): KerbProtocolMessageType = this.messageType

    public operator fun component2(): Luid = this.logonId

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): Int = this.cryptoType

    public operator fun component5(): Int = this.keyUsage

    public operator fun component6(): KerbCryptoKey = this.key

    public operator fun component7(): UInt = this.encryptedDataSize

    public operator fun component8(): UInt = this.initialVectorSize

    public operator fun component9(): MutPtr<UByte> = this.initialVector

    public operator fun component10(): MutPtr<UByte> = this.encryptedData

    public fun copy(messageType: KerbProtocolMessageType = this.messageType, logonId: Luid = this.logonId, flags: UInt = this.flags, cryptoType: Int = this.cryptoType, keyUsage: Int = this.keyUsage, key: KerbCryptoKey = this.key, encryptedDataSize: UInt = this.encryptedDataSize, initialVectorSize: UInt = this.initialVectorSize, initialVector: MutPtr<UByte> = this.initialVector, encryptedData: MutPtr<UByte> = this.encryptedData): KerbDecryptRequest = KerbDecryptRequest(messageType = messageType, logonId = logonId, flags = flags, cryptoType = cryptoType, keyUsage = keyUsage, key = key, encryptedDataSize = encryptedDataSize, initialVectorSize = initialVectorSize, initialVectorCtorArg = initialVector, encryptedDataCtorArg = encryptedData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KerbDecryptRequest) return false
        if (this.messageType != other.messageType) return false
        if (this.logonId != other.logonId) return false
        if (this.flags != other.flags) return false
        if (this.cryptoType != other.cryptoType) return false
        if (this.keyUsage != other.keyUsage) return false
        if (this.key != other.key) return false
        if (this.encryptedDataSize != other.encryptedDataSize) return false
        if (this.initialVectorSize != other.initialVectorSize) return false
        if (this.initialVector != other.initialVector) return false
        if (this.encryptedData != other.encryptedData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.logonId.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.cryptoType.hashCode()
        result = 31 * result + this.keyUsage.hashCode()
        result = 31 * result + this.key.hashCode()
        result = 31 * result + this.encryptedDataSize.hashCode()
        result = 31 * result + this.initialVectorSize.hashCode()
        result = 31 * result + this.initialVector.hashCode()
        result = 31 * result + this.encryptedData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            messageType: KerbProtocolMessageType = 0,
            logonId: Luid = Luid(),
            flags: UInt = 0u,
            cryptoType: Int = 0,
            keyUsage: Int = 0,
            key: KerbCryptoKey = KerbCryptoKey(),
            encryptedDataSize: UInt = 0u,
            initialVectorSize: UInt = 0u,
            initialVector: MutPtr<UByte> = MutPtr(0L),
            encryptedData: MutPtr<UByte> = MutPtr(0L),
        ): KerbDecryptRequest =
            KerbDecryptRequest(
                messageType = messageType,
                logonId = logonId,
                flags = flags,
                cryptoType = cryptoType,
                keyUsage = keyUsage,
                key = key,
                encryptedDataSize = encryptedDataSize,
                initialVectorSize = initialVectorSize,
                initialVectorCtorArg = initialVector,
                encryptedDataCtorArg = encryptedData,
            )
    }
}

public data class KerbDecryptResponse(
    public var decryptedData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KerbDecryptResponse) return false
        if (!this.decryptedData.contentEquals(other.decryptedData)) return false
        return true
    }

    override fun hashCode(): Int = this.decryptedData.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbDecryptResponse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbDecryptResponse> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): KerbDecryptResponse =
                    KerbDecryptResponse(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KerbDecryptResponse) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr, value.decryptedData)
                }
            }
    }
}

public data class KerbExternalName(
    public var nameType: Short = 0,
    public var nameCount: UShort = 0u,
    public var names: List<LsaUnicodeString> = List(1) { LsaUnicodeString() },
)

public class KerbExternalTicket internal constructor(
    serviceNameCtorArg: MutPtr<KerbExternalName>,
    targetNameCtorArg: MutPtr<KerbExternalName>,
    clientNameCtorArg: MutPtr<KerbExternalName>,
    public var domainName: LsaUnicodeString,
    public var targetDomainName: LsaUnicodeString,
    public var altTargetDomainName: LsaUnicodeString,
    public var sessionKey: KerbCryptoKey,
    public var ticketFlags: KerbTicketFlags,
    public var flags: UInt,
    public var keyExpirationTime: Long,
    public var startTime: Long,
    public var endTime: Long,
    public var renewUntil: Long,
    public var timeSkew: Long,
    public var encodedTicketSize: UInt,
    encodedTicketCtorArg: MutPtr<UByte>,
) {
    public var serviceName: MutPtr<KerbExternalName> = serviceNameCtorArg
        internal set

    public var targetName: MutPtr<KerbExternalName> = targetNameCtorArg
        internal set

    public var clientName: MutPtr<KerbExternalName> = clientNameCtorArg
        internal set

    public var encodedTicket: MutPtr<UByte> = encodedTicketCtorArg
        internal set

    public constructor() : this(
        serviceNameCtorArg = MutPtr(0L),
        targetNameCtorArg = MutPtr(0L),
        clientNameCtorArg = MutPtr(0L),
        domainName = LsaUnicodeString(),
        targetDomainName = LsaUnicodeString(),
        altTargetDomainName = LsaUnicodeString(),
        sessionKey = KerbCryptoKey(),
        ticketFlags = 0u,
        flags = 0u,
        keyExpirationTime = 0L,
        startTime = 0L,
        endTime = 0L,
        renewUntil = 0L,
        timeSkew = 0L,
        encodedTicketSize = 0u,
        encodedTicketCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<KerbExternalName> = this.serviceName

    public operator fun component2(): MutPtr<KerbExternalName> = this.targetName

    public operator fun component3(): MutPtr<KerbExternalName> = this.clientName

    public operator fun component4(): LsaUnicodeString = this.domainName

    public operator fun component5(): LsaUnicodeString = this.targetDomainName

    public operator fun component6(): LsaUnicodeString = this.altTargetDomainName

    public operator fun component7(): KerbCryptoKey = this.sessionKey

    public operator fun component8(): KerbTicketFlags = this.ticketFlags

    public operator fun component9(): UInt = this.flags

    public operator fun component10(): Long = this.keyExpirationTime

    public operator fun component11(): Long = this.startTime

    public operator fun component12(): Long = this.endTime

    public operator fun component13(): Long = this.renewUntil

    public operator fun component14(): Long = this.timeSkew

    public operator fun component15(): UInt = this.encodedTicketSize

    public operator fun component16(): MutPtr<UByte> = this.encodedTicket

    public fun copy(serviceName: MutPtr<KerbExternalName> = this.serviceName, targetName: MutPtr<KerbExternalName> = this.targetName, clientName: MutPtr<KerbExternalName> = this.clientName, domainName: LsaUnicodeString = this.domainName, targetDomainName: LsaUnicodeString = this.targetDomainName, altTargetDomainName: LsaUnicodeString = this.altTargetDomainName, sessionKey: KerbCryptoKey = this.sessionKey, ticketFlags: KerbTicketFlags = this.ticketFlags, flags: UInt = this.flags, keyExpirationTime: Long = this.keyExpirationTime, startTime: Long = this.startTime, endTime: Long = this.endTime, renewUntil: Long = this.renewUntil, timeSkew: Long = this.timeSkew, encodedTicketSize: UInt = this.encodedTicketSize, encodedTicket: MutPtr<UByte> = this.encodedTicket): KerbExternalTicket = KerbExternalTicket(serviceNameCtorArg = serviceName, targetNameCtorArg = targetName, clientNameCtorArg = clientName, domainName = domainName, targetDomainName = targetDomainName, altTargetDomainName = altTargetDomainName, sessionKey = sessionKey, ticketFlags = ticketFlags, flags = flags, keyExpirationTime = keyExpirationTime, startTime = startTime, endTime = endTime, renewUntil = renewUntil, timeSkew = timeSkew, encodedTicketSize = encodedTicketSize, encodedTicketCtorArg = encodedTicket)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KerbExternalTicket) return false
        if (this.serviceName != other.serviceName) return false
        if (this.targetName != other.targetName) return false
        if (this.clientName != other.clientName) return false
        if (this.domainName != other.domainName) return false
        if (this.targetDomainName != other.targetDomainName) return false
        if (this.altTargetDomainName != other.altTargetDomainName) return false
        if (this.sessionKey != other.sessionKey) return false
        if (this.ticketFlags != other.ticketFlags) return false
        if (this.flags != other.flags) return false
        if (this.keyExpirationTime != other.keyExpirationTime) return false
        if (this.startTime != other.startTime) return false
        if (this.endTime != other.endTime) return false
        if (this.renewUntil != other.renewUntil) return false
        if (this.timeSkew != other.timeSkew) return false
        if (this.encodedTicketSize != other.encodedTicketSize) return false
        if (this.encodedTicket != other.encodedTicket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.serviceName.hashCode()
        result = 31 * result + this.targetName.hashCode()
        result = 31 * result + this.clientName.hashCode()
        result = 31 * result + this.domainName.hashCode()
        result = 31 * result + this.targetDomainName.hashCode()
        result = 31 * result + this.altTargetDomainName.hashCode()
        result = 31 * result + this.sessionKey.hashCode()
        result = 31 * result + this.ticketFlags.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.keyExpirationTime.hashCode()
        result = 31 * result + this.startTime.hashCode()
        result = 31 * result + this.endTime.hashCode()
        result = 31 * result + this.renewUntil.hashCode()
        result = 31 * result + this.timeSkew.hashCode()
        result = 31 * result + this.encodedTicketSize.hashCode()
        result = 31 * result + this.encodedTicket.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            serviceName: MutPtr<KerbExternalName> = MutPtr(0L),
            targetName: MutPtr<KerbExternalName> = MutPtr(0L),
            clientName: MutPtr<KerbExternalName> = MutPtr(0L),
            domainName: LsaUnicodeString = LsaUnicodeString(),
            targetDomainName: LsaUnicodeString = LsaUnicodeString(),
            altTargetDomainName: LsaUnicodeString = LsaUnicodeString(),
            sessionKey: KerbCryptoKey = KerbCryptoKey(),
            ticketFlags: KerbTicketFlags = 0u,
            flags: UInt = 0u,
            keyExpirationTime: Long = 0L,
            startTime: Long = 0L,
            endTime: Long = 0L,
            renewUntil: Long = 0L,
            timeSkew: Long = 0L,
            encodedTicketSize: UInt = 0u,
            encodedTicket: MutPtr<UByte> = MutPtr(0L),
        ): KerbExternalTicket =
            KerbExternalTicket(
                serviceNameCtorArg = serviceName,
                targetNameCtorArg = targetName,
                clientNameCtorArg = clientName,
                domainName = domainName,
                targetDomainName = targetDomainName,
                altTargetDomainName = altTargetDomainName,
                sessionKey = sessionKey,
                ticketFlags = ticketFlags,
                flags = flags,
                keyExpirationTime = keyExpirationTime,
                startTime = startTime,
                endTime = endTime,
                renewUntil = renewUntil,
                timeSkew = timeSkew,
                encodedTicketSize = encodedTicketSize,
                encodedTicketCtorArg = encodedTicket,
            )
    }
}

public data class KerbInteractiveLogon(
    public var messageType: KerbLogonSubmitType = 0,
    public var logonDomainName: LsaUnicodeString = LsaUnicodeString(),
    public var userName: LsaUnicodeString = LsaUnicodeString(),
    public var password: LsaUnicodeString = LsaUnicodeString(),
)

public data class KerbInteractiveProfile(
    public var messageType: KerbProfileBufferType = 0,
    public var logonCount: UShort = 0u,
    public var badPasswordCount: UShort = 0u,
    public var logonTime: Long = 0L,
    public var logoffTime: Long = 0L,
    public var kickOffTime: Long = 0L,
    public var passwordLastSet: Long = 0L,
    public var passwordCanChange: Long = 0L,
    public var passwordMustChange: Long = 0L,
    public var logonScript: LsaUnicodeString = LsaUnicodeString(),
    public var homeDirectory: LsaUnicodeString = LsaUnicodeString(),
    public var fullName: LsaUnicodeString = LsaUnicodeString(),
    public var profilePath: LsaUnicodeString = LsaUnicodeString(),
    public var homeDirectoryDrive: LsaUnicodeString = LsaUnicodeString(),
    public var logonServer: LsaUnicodeString = LsaUnicodeString(),
    public var userFlags: UInt = 0u,
)

public data class KerbInteractiveUnlockLogon(
    public var logon: KerbInteractiveLogon = KerbInteractiveLogon(),
    public var logonId: Luid = Luid(),
)

public class KerbNetAddress internal constructor(
    public var family: UInt,
    public var length: UInt,
    addressCtorArg: Pstr,
) {
    public var address: Pstr = addressCtorArg
        internal set

    public constructor() : this(
        family = 0u,
        length = 0u,
        addressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.family

    public operator fun component2(): UInt = this.length

    public operator fun component3(): Pstr = this.address

    public fun copy(family: UInt = this.family, length: UInt = this.length, address: Pstr = this.address): KerbNetAddress = KerbNetAddress(family = family, length = length, addressCtorArg = address)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KerbNetAddress) return false
        if (this.family != other.family) return false
        if (this.length != other.length) return false
        if (this.address != other.address) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.family.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.address.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            family: UInt = 0u,
            length: UInt = 0u,
            address: Pstr = MutPtr(0L),
        ): KerbNetAddress =
            KerbNetAddress(
                family = family,
                length = length,
                addressCtorArg = address,
            )
    }
}

public data class KerbNetAddresses(
    public var number: UInt = 0u,
    public var addresses: List<KerbNetAddress> = List(1) { KerbNetAddress() },
)

public data class KerbPurgeBindingCacheRequest(
    public var messageType: KerbProtocolMessageType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbPurgeBindingCacheRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbPurgeBindingCacheRequest> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): KerbPurgeBindingCacheRequest =
                    KerbPurgeBindingCacheRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KerbPurgeBindingCacheRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.messageType)
                }
            }
    }
}

public data class KerbPurgeKdcProxyCacheRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var flags: UInt = 0u,
    public var logonId: Luid = Luid(),
)

public data class KerbPurgeKdcProxyCacheResponse(
    public var messageType: KerbProtocolMessageType = 0,
    public var countOfPurged: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbPurgeKdcProxyCacheResponse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbPurgeKdcProxyCacheResponse> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): KerbPurgeKdcProxyCacheResponse =
                    KerbPurgeKdcProxyCacheResponse(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KerbPurgeKdcProxyCacheResponse) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.messageType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.countOfPurged)
                }
            }
    }
}

public data class KerbPurgeTktCacheExRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var logonId: Luid = Luid(),
    public var flags: UInt = 0u,
    public var ticketTemplate: KerbTicketCacheInfoEx = KerbTicketCacheInfoEx(),
)

public data class KerbPurgeTktCacheRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var logonId: Luid = Luid(),
    public var serverName: LsaUnicodeString = LsaUnicodeString(),
    public var realmName: LsaUnicodeString = LsaUnicodeString(),
)

public data class KerbQueryBindingCacheRequest(
    public var messageType: KerbProtocolMessageType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbQueryBindingCacheRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbQueryBindingCacheRequest> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): KerbQueryBindingCacheRequest =
                    KerbQueryBindingCacheRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KerbQueryBindingCacheRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.messageType)
                }
            }
    }
}

public class KerbQueryBindingCacheResponse internal constructor(
    public var messageType: KerbProtocolMessageType,
    public var countOfEntries: UInt,
    entriesCtorArg: MutPtr<KerbBindingCacheEntryData>,
) {
    public var entries: MutPtr<KerbBindingCacheEntryData> = entriesCtorArg
        internal set

    public constructor() : this(
        messageType = 0,
        countOfEntries = 0u,
        entriesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): KerbProtocolMessageType = this.messageType

    public operator fun component2(): UInt = this.countOfEntries

    public operator fun component3(): MutPtr<KerbBindingCacheEntryData> = this.entries

    public fun copy(messageType: KerbProtocolMessageType = this.messageType, countOfEntries: UInt = this.countOfEntries, entries: MutPtr<KerbBindingCacheEntryData> = this.entries): KerbQueryBindingCacheResponse = KerbQueryBindingCacheResponse(messageType = messageType, countOfEntries = countOfEntries, entriesCtorArg = entries)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KerbQueryBindingCacheResponse) return false
        if (this.messageType != other.messageType) return false
        if (this.countOfEntries != other.countOfEntries) return false
        if (this.entries != other.entries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.countOfEntries.hashCode()
        result = 31 * result + this.entries.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbQueryBindingCacheResponse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbQueryBindingCacheResponse> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): KerbQueryBindingCacheResponse =
                    KerbQueryBindingCacheResponse(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<KerbBindingCacheEntryData>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KerbQueryBindingCacheResponse) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.messageType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.countOfEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<KerbBindingCacheEntryData>(64)
                    ).writeNative(addr + 8L, value.entries)
                }
            }

        public operator fun invoke(
            messageType: KerbProtocolMessageType = 0,
            countOfEntries: UInt = 0u,
            entries: MutPtr<KerbBindingCacheEntryData> = MutPtr(0L),
        ): KerbQueryBindingCacheResponse =
            KerbQueryBindingCacheResponse(
                messageType = messageType,
                countOfEntries = countOfEntries,
                entriesCtorArg = entries,
            )
    }
}

public data class KerbQueryDomainExtendedPoliciesRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var flags: UInt = 0u,
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
)

public data class KerbQueryDomainExtendedPoliciesResponse(
    public var messageType: KerbProtocolMessageType = 0,
    public var flags: UInt = 0u,
    public var extendedPolicies: UInt = 0u,
    public var dsFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbQueryDomainExtendedPoliciesResponse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbQueryDomainExtendedPoliciesResponse> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): KerbQueryDomainExtendedPoliciesResponse =
                    KerbQueryDomainExtendedPoliciesResponse(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: KerbQueryDomainExtendedPoliciesResponse) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.messageType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.extendedPolicies)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dsFlags)
                }
            }
    }
}

public data class KerbQueryKdcProxyCacheRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var flags: UInt = 0u,
    public var logonId: Luid = Luid(),
)

public class KerbQueryKdcProxyCacheResponse internal constructor(
    public var messageType: KerbProtocolMessageType,
    public var countOfEntries: UInt,
    entriesCtorArg: MutPtr<KdcProxyCacheEntryData>,
) {
    public var entries: MutPtr<KdcProxyCacheEntryData> = entriesCtorArg
        internal set

    public constructor() : this(
        messageType = 0,
        countOfEntries = 0u,
        entriesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): KerbProtocolMessageType = this.messageType

    public operator fun component2(): UInt = this.countOfEntries

    public operator fun component3(): MutPtr<KdcProxyCacheEntryData> = this.entries

    public fun copy(messageType: KerbProtocolMessageType = this.messageType, countOfEntries: UInt = this.countOfEntries, entries: MutPtr<KdcProxyCacheEntryData> = this.entries): KerbQueryKdcProxyCacheResponse = KerbQueryKdcProxyCacheResponse(messageType = messageType, countOfEntries = countOfEntries, entriesCtorArg = entries)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KerbQueryKdcProxyCacheResponse) return false
        if (this.messageType != other.messageType) return false
        if (this.countOfEntries != other.countOfEntries) return false
        if (this.entries != other.entries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.countOfEntries.hashCode()
        result = 31 * result + this.entries.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbQueryKdcProxyCacheResponse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbQueryKdcProxyCacheResponse> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): KerbQueryKdcProxyCacheResponse =
                    KerbQueryKdcProxyCacheResponse(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<KdcProxyCacheEntryData>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KerbQueryKdcProxyCacheResponse) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.messageType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.countOfEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<KdcProxyCacheEntryData>(64)
                    ).writeNative(addr + 8L, value.entries)
                }
            }

        public operator fun invoke(
            messageType: KerbProtocolMessageType = 0,
            countOfEntries: UInt = 0u,
            entries: MutPtr<KdcProxyCacheEntryData> = MutPtr(0L),
        ): KerbQueryKdcProxyCacheResponse =
            KerbQueryKdcProxyCacheResponse(
                messageType = messageType,
                countOfEntries = countOfEntries,
                entriesCtorArg = entries,
            )
    }
}

public data class KerbQueryS4u2proxyCacheRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var flags: UInt = 0u,
    public var logonId: Luid = Luid(),
)

public class KerbQueryS4u2proxyCacheResponse internal constructor(
    public var messageType: KerbProtocolMessageType,
    public var countOfCreds: UInt,
    credsCtorArg: MutPtr<KerbS4u2proxyCred>,
) {
    public var creds: MutPtr<KerbS4u2proxyCred> = credsCtorArg
        internal set

    public constructor() : this(
        messageType = 0,
        countOfCreds = 0u,
        credsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): KerbProtocolMessageType = this.messageType

    public operator fun component2(): UInt = this.countOfCreds

    public operator fun component3(): MutPtr<KerbS4u2proxyCred> = this.creds

    public fun copy(messageType: KerbProtocolMessageType = this.messageType, countOfCreds: UInt = this.countOfCreds, creds: MutPtr<KerbS4u2proxyCred> = this.creds): KerbQueryS4u2proxyCacheResponse = KerbQueryS4u2proxyCacheResponse(messageType = messageType, countOfCreds = countOfCreds, credsCtorArg = creds)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KerbQueryS4u2proxyCacheResponse) return false
        if (this.messageType != other.messageType) return false
        if (this.countOfCreds != other.countOfCreds) return false
        if (this.creds != other.creds) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.countOfCreds.hashCode()
        result = 31 * result + this.creds.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbQueryS4u2proxyCacheResponse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbQueryS4u2proxyCacheResponse> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): KerbQueryS4u2proxyCacheResponse =
                    KerbQueryS4u2proxyCacheResponse(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<KerbS4u2proxyCred>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KerbQueryS4u2proxyCacheResponse) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.messageType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.countOfCreds)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<KerbS4u2proxyCred>(64)
                    ).writeNative(addr + 8L, value.creds)
                }
            }

        public operator fun invoke(
            messageType: KerbProtocolMessageType = 0,
            countOfCreds: UInt = 0u,
            creds: MutPtr<KerbS4u2proxyCred> = MutPtr(0L),
        ): KerbQueryS4u2proxyCacheResponse =
            KerbQueryS4u2proxyCacheResponse(
                messageType = messageType,
                countOfCreds = countOfCreds,
                credsCtorArg = creds,
            )
    }
}

public data class KerbQueryTktCacheEx2Response(
    public var messageType: KerbProtocolMessageType = 0,
    public var countOfTickets: UInt = 0u,
    public var tickets: List<KerbTicketCacheInfoEx2> = List(1) { KerbTicketCacheInfoEx2() },
)

public data class KerbQueryTktCacheEx3Response(
    public var messageType: KerbProtocolMessageType = 0,
    public var countOfTickets: UInt = 0u,
    public var tickets: List<KerbTicketCacheInfoEx3> = List(1) { KerbTicketCacheInfoEx3() },
)

public data class KerbQueryTktCacheExResponse(
    public var messageType: KerbProtocolMessageType = 0,
    public var countOfTickets: UInt = 0u,
    public var tickets: List<KerbTicketCacheInfoEx> = List(1) { KerbTicketCacheInfoEx() },
)

public data class KerbQueryTktCacheRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var logonId: Luid = Luid(),
)

public data class KerbQueryTktCacheResponse(
    public var messageType: KerbProtocolMessageType = 0,
    public var countOfTickets: UInt = 0u,
    public var tickets: List<KerbTicketCacheInfo> = List(1) { KerbTicketCacheInfo() },
)

public data class KerbRefreshPolicyRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbRefreshPolicyRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbRefreshPolicyRequest> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): KerbRefreshPolicyRequest =
                    KerbRefreshPolicyRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KerbRefreshPolicyRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.messageType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

public data class KerbRefreshPolicyResponse(
    public var messageType: KerbProtocolMessageType = 0,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbRefreshPolicyResponse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbRefreshPolicyResponse> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): KerbRefreshPolicyResponse =
                    KerbRefreshPolicyResponse(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KerbRefreshPolicyResponse) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.messageType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

public data class KerbRefreshSccredRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var credentialBlob: LsaUnicodeString = LsaUnicodeString(),
    public var logonId: Luid = Luid(),
    public var flags: UInt = 0u,
)

public data class KerbRetrieveKeyTabRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var flags: UInt = 0u,
    public var userName: LsaUnicodeString = LsaUnicodeString(),
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var password: LsaUnicodeString = LsaUnicodeString(),
)

public class KerbRetrieveKeyTabResponse internal constructor(
    public var messageType: KerbProtocolMessageType,
    public var keyTabLength: UInt,
    keyTabCtorArg: MutPtr<UByte>,
) {
    public var keyTab: MutPtr<UByte> = keyTabCtorArg
        internal set

    public constructor() : this(
        messageType = 0,
        keyTabLength = 0u,
        keyTabCtorArg = MutPtr(0L),
    )

    public operator fun component1(): KerbProtocolMessageType = this.messageType

    public operator fun component2(): UInt = this.keyTabLength

    public operator fun component3(): MutPtr<UByte> = this.keyTab

    public fun copy(messageType: KerbProtocolMessageType = this.messageType, keyTabLength: UInt = this.keyTabLength, keyTab: MutPtr<UByte> = this.keyTab): KerbRetrieveKeyTabResponse = KerbRetrieveKeyTabResponse(messageType = messageType, keyTabLength = keyTabLength, keyTabCtorArg = keyTab)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KerbRetrieveKeyTabResponse) return false
        if (this.messageType != other.messageType) return false
        if (this.keyTabLength != other.keyTabLength) return false
        if (this.keyTab != other.keyTab) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.keyTabLength.hashCode()
        result = 31 * result + this.keyTab.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbRetrieveKeyTabResponse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbRetrieveKeyTabResponse> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): KerbRetrieveKeyTabResponse =
                    KerbRetrieveKeyTabResponse(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KerbRetrieveKeyTabResponse) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.messageType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.keyTabLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.keyTab)
                }
            }

        public operator fun invoke(
            messageType: KerbProtocolMessageType = 0,
            keyTabLength: UInt = 0u,
            keyTab: MutPtr<UByte> = MutPtr(0L),
        ): KerbRetrieveKeyTabResponse =
            KerbRetrieveKeyTabResponse(
                messageType = messageType,
                keyTabLength = keyTabLength,
                keyTabCtorArg = keyTab,
            )
    }
}

public data class KerbRetrieveTktRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var logonId: Luid = Luid(),
    public var targetName: LsaUnicodeString = LsaUnicodeString(),
    public var ticketFlags: UInt = 0u,
    public var cacheOptions: UInt = 0u,
    public var encryptionType: KerbCryptoKeyType = 0,
    public var credentialsHandle: SecHandle = SecHandle(),
)

public data class KerbRetrieveTktResponse(
    public var ticket: KerbExternalTicket = KerbExternalTicket(),
)

public data class KerbS4u2proxyCacheEntryInfo(
    public var serverName: LsaUnicodeString = LsaUnicodeString(),
    public var flags: UInt = 0u,
    public var lastStatus: Ntstatus = 0,
    public var expiry: Long = 0L,
)

public class KerbS4u2proxyCred internal constructor(
    public var userName: LsaUnicodeString,
    public var domainName: LsaUnicodeString,
    public var flags: UInt,
    public var lastStatus: Ntstatus,
    public var expiry: Long,
    public var countOfEntries: UInt,
    entriesCtorArg: MutPtr<KerbS4u2proxyCacheEntryInfo>,
) {
    public var entries: MutPtr<KerbS4u2proxyCacheEntryInfo> = entriesCtorArg
        internal set

    public constructor() : this(
        userName = LsaUnicodeString(),
        domainName = LsaUnicodeString(),
        flags = 0u,
        lastStatus = 0,
        expiry = 0L,
        countOfEntries = 0u,
        entriesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): LsaUnicodeString = this.userName

    public operator fun component2(): LsaUnicodeString = this.domainName

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): Ntstatus = this.lastStatus

    public operator fun component5(): Long = this.expiry

    public operator fun component6(): UInt = this.countOfEntries

    public operator fun component7(): MutPtr<KerbS4u2proxyCacheEntryInfo> = this.entries

    public fun copy(userName: LsaUnicodeString = this.userName, domainName: LsaUnicodeString = this.domainName, flags: UInt = this.flags, lastStatus: Ntstatus = this.lastStatus, expiry: Long = this.expiry, countOfEntries: UInt = this.countOfEntries, entries: MutPtr<KerbS4u2proxyCacheEntryInfo> = this.entries): KerbS4u2proxyCred = KerbS4u2proxyCred(userName = userName, domainName = domainName, flags = flags, lastStatus = lastStatus, expiry = expiry, countOfEntries = countOfEntries, entriesCtorArg = entries)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KerbS4u2proxyCred) return false
        if (this.userName != other.userName) return false
        if (this.domainName != other.domainName) return false
        if (this.flags != other.flags) return false
        if (this.lastStatus != other.lastStatus) return false
        if (this.expiry != other.expiry) return false
        if (this.countOfEntries != other.countOfEntries) return false
        if (this.entries != other.entries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.userName.hashCode()
        result = 31 * result + this.domainName.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.lastStatus.hashCode()
        result = 31 * result + this.expiry.hashCode()
        result = 31 * result + this.countOfEntries.hashCode()
        result = 31 * result + this.entries.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            userName: LsaUnicodeString = LsaUnicodeString(),
            domainName: LsaUnicodeString = LsaUnicodeString(),
            flags: UInt = 0u,
            lastStatus: Ntstatus = 0,
            expiry: Long = 0L,
            countOfEntries: UInt = 0u,
            entries: MutPtr<KerbS4u2proxyCacheEntryInfo> = MutPtr(0L),
        ): KerbS4u2proxyCred =
            KerbS4u2proxyCred(
                userName = userName,
                domainName = domainName,
                flags = flags,
                lastStatus = lastStatus,
                expiry = expiry,
                countOfEntries = countOfEntries,
                entriesCtorArg = entries,
            )
    }
}

public data class KerbS4uLogon(
    public var messageType: KerbLogonSubmitType = 0,
    public var flags: UInt = 0u,
    public var clientUpn: LsaUnicodeString = LsaUnicodeString(),
    public var clientRealm: LsaUnicodeString = LsaUnicodeString(),
)

public data class KerbSetpasswordExRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var logonId: Luid = Luid(),
    public var credentialsHandle: SecHandle = SecHandle(),
    public var flags: UInt = 0u,
    public var accountRealm: LsaUnicodeString = LsaUnicodeString(),
    public var accountName: LsaUnicodeString = LsaUnicodeString(),
    public var password: LsaUnicodeString = LsaUnicodeString(),
    public var clientRealm: LsaUnicodeString = LsaUnicodeString(),
    public var clientName: LsaUnicodeString = LsaUnicodeString(),
    public var impersonating: Boolean = false,
    public var kdcAddress: LsaUnicodeString = LsaUnicodeString(),
    public var kdcAddressType: UInt = 0u,
)

public data class KerbSetpasswordRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var logonId: Luid = Luid(),
    public var credentialsHandle: SecHandle = SecHandle(),
    public var flags: UInt = 0u,
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var accountName: LsaUnicodeString = LsaUnicodeString(),
    public var password: LsaUnicodeString = LsaUnicodeString(),
)

public class KerbSmartCardLogon internal constructor(
    public var messageType: KerbLogonSubmitType,
    public var pin: LsaUnicodeString,
    public var cspDataLength: UInt,
    cspDataCtorArg: MutPtr<UByte>,
) {
    public var cspData: MutPtr<UByte> = cspDataCtorArg
        internal set

    public constructor() : this(
        messageType = 0,
        pin = LsaUnicodeString(),
        cspDataLength = 0u,
        cspDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): KerbLogonSubmitType = this.messageType

    public operator fun component2(): LsaUnicodeString = this.pin

    public operator fun component3(): UInt = this.cspDataLength

    public operator fun component4(): MutPtr<UByte> = this.cspData

    public fun copy(messageType: KerbLogonSubmitType = this.messageType, pin: LsaUnicodeString = this.pin, cspDataLength: UInt = this.cspDataLength, cspData: MutPtr<UByte> = this.cspData): KerbSmartCardLogon = KerbSmartCardLogon(messageType = messageType, pin = pin, cspDataLength = cspDataLength, cspDataCtorArg = cspData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KerbSmartCardLogon) return false
        if (this.messageType != other.messageType) return false
        if (this.pin != other.pin) return false
        if (this.cspDataLength != other.cspDataLength) return false
        if (this.cspData != other.cspData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.pin.hashCode()
        result = 31 * result + this.cspDataLength.hashCode()
        result = 31 * result + this.cspData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            messageType: KerbLogonSubmitType = 0,
            pin: LsaUnicodeString = LsaUnicodeString(),
            cspDataLength: UInt = 0u,
            cspData: MutPtr<UByte> = MutPtr(0L),
        ): KerbSmartCardLogon =
            KerbSmartCardLogon(
                messageType = messageType,
                pin = pin,
                cspDataLength = cspDataLength,
                cspDataCtorArg = cspData,
            )
    }
}

public class KerbSmartCardProfile internal constructor(
    public var profile: KerbInteractiveProfile,
    public var certificateSize: UInt,
    certificateDataCtorArg: MutPtr<UByte>,
) {
    public var certificateData: MutPtr<UByte> = certificateDataCtorArg
        internal set

    public constructor() : this(
        profile = KerbInteractiveProfile(),
        certificateSize = 0u,
        certificateDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): KerbInteractiveProfile = this.profile

    public operator fun component2(): UInt = this.certificateSize

    public operator fun component3(): MutPtr<UByte> = this.certificateData

    public fun copy(profile: KerbInteractiveProfile = this.profile, certificateSize: UInt = this.certificateSize, certificateData: MutPtr<UByte> = this.certificateData): KerbSmartCardProfile = KerbSmartCardProfile(profile = profile, certificateSize = certificateSize, certificateDataCtorArg = certificateData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KerbSmartCardProfile) return false
        if (this.profile != other.profile) return false
        if (this.certificateSize != other.certificateSize) return false
        if (this.certificateData != other.certificateData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.profile.hashCode()
        result = 31 * result + this.certificateSize.hashCode()
        result = 31 * result + this.certificateData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            profile: KerbInteractiveProfile = KerbInteractiveProfile(),
            certificateSize: UInt = 0u,
            certificateData: MutPtr<UByte> = MutPtr(0L),
        ): KerbSmartCardProfile =
            KerbSmartCardProfile(
                profile = profile,
                certificateSize = certificateSize,
                certificateDataCtorArg = certificateData,
            )
    }
}

public data class KerbSmartCardUnlockLogon(
    public var logon: KerbSmartCardLogon = KerbSmartCardLogon(),
    public var logonId: Luid = Luid(),
)

public data class KerbSubmitTktRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var logonId: Luid = Luid(),
    public var flags: UInt = 0u,
    public var key: KerbCryptoKey32 = KerbCryptoKey32(),
    public var kerbCredSize: UInt = 0u,
    public var kerbCredOffset: UInt = 0u,
)

public data class KerbTicketCacheInfo(
    public var serverName: LsaUnicodeString = LsaUnicodeString(),
    public var realmName: LsaUnicodeString = LsaUnicodeString(),
    public var startTime: Long = 0L,
    public var endTime: Long = 0L,
    public var renewTime: Long = 0L,
    public var encryptionType: Int = 0,
    public var ticketFlags: KerbTicketFlags = 0u,
)

public data class KerbTicketCacheInfoEx(
    public var clientName: LsaUnicodeString = LsaUnicodeString(),
    public var clientRealm: LsaUnicodeString = LsaUnicodeString(),
    public var serverName: LsaUnicodeString = LsaUnicodeString(),
    public var serverRealm: LsaUnicodeString = LsaUnicodeString(),
    public var startTime: Long = 0L,
    public var endTime: Long = 0L,
    public var renewTime: Long = 0L,
    public var encryptionType: Int = 0,
    public var ticketFlags: UInt = 0u,
)

public data class KerbTicketCacheInfoEx2(
    public var clientName: LsaUnicodeString = LsaUnicodeString(),
    public var clientRealm: LsaUnicodeString = LsaUnicodeString(),
    public var serverName: LsaUnicodeString = LsaUnicodeString(),
    public var serverRealm: LsaUnicodeString = LsaUnicodeString(),
    public var startTime: Long = 0L,
    public var endTime: Long = 0L,
    public var renewTime: Long = 0L,
    public var encryptionType: Int = 0,
    public var ticketFlags: UInt = 0u,
    public var sessionKeyType: UInt = 0u,
    public var branchId: UInt = 0u,
)

public data class KerbTicketCacheInfoEx3(
    public var clientName: LsaUnicodeString = LsaUnicodeString(),
    public var clientRealm: LsaUnicodeString = LsaUnicodeString(),
    public var serverName: LsaUnicodeString = LsaUnicodeString(),
    public var serverRealm: LsaUnicodeString = LsaUnicodeString(),
    public var startTime: Long = 0L,
    public var endTime: Long = 0L,
    public var renewTime: Long = 0L,
    public var encryptionType: Int = 0,
    public var ticketFlags: UInt = 0u,
    public var sessionKeyType: UInt = 0u,
    public var branchId: UInt = 0u,
    public var cacheFlags: UInt = 0u,
    public var kdcCalled: LsaUnicodeString = LsaUnicodeString(),
)

public class KerbTicketLogon internal constructor(
    public var messageType: KerbLogonSubmitType,
    public var flags: UInt,
    public var serviceTicketLength: UInt,
    public var ticketGrantingTicketLength: UInt,
    serviceTicketCtorArg: MutPtr<UByte>,
    ticketGrantingTicketCtorArg: MutPtr<UByte>,
) {
    public var serviceTicket: MutPtr<UByte> = serviceTicketCtorArg
        internal set

    public var ticketGrantingTicket: MutPtr<UByte> = ticketGrantingTicketCtorArg
        internal set

    public constructor() : this(
        messageType = 0,
        flags = 0u,
        serviceTicketLength = 0u,
        ticketGrantingTicketLength = 0u,
        serviceTicketCtorArg = MutPtr(0L),
        ticketGrantingTicketCtorArg = MutPtr(0L),
    )

    public operator fun component1(): KerbLogonSubmitType = this.messageType

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): UInt = this.serviceTicketLength

    public operator fun component4(): UInt = this.ticketGrantingTicketLength

    public operator fun component5(): MutPtr<UByte> = this.serviceTicket

    public operator fun component6(): MutPtr<UByte> = this.ticketGrantingTicket

    public fun copy(messageType: KerbLogonSubmitType = this.messageType, flags: UInt = this.flags, serviceTicketLength: UInt = this.serviceTicketLength, ticketGrantingTicketLength: UInt = this.ticketGrantingTicketLength, serviceTicket: MutPtr<UByte> = this.serviceTicket, ticketGrantingTicket: MutPtr<UByte> = this.ticketGrantingTicket): KerbTicketLogon = KerbTicketLogon(messageType = messageType, flags = flags, serviceTicketLength = serviceTicketLength, ticketGrantingTicketLength = ticketGrantingTicketLength, serviceTicketCtorArg = serviceTicket, ticketGrantingTicketCtorArg = ticketGrantingTicket)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KerbTicketLogon) return false
        if (this.messageType != other.messageType) return false
        if (this.flags != other.flags) return false
        if (this.serviceTicketLength != other.serviceTicketLength) return false
        if (this.ticketGrantingTicketLength != other.ticketGrantingTicketLength) return false
        if (this.serviceTicket != other.serviceTicket) return false
        if (this.ticketGrantingTicket != other.ticketGrantingTicket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.serviceTicketLength.hashCode()
        result = 31 * result + this.ticketGrantingTicketLength.hashCode()
        result = 31 * result + this.serviceTicket.hashCode()
        result = 31 * result + this.ticketGrantingTicket.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbTicketLogon> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KerbTicketLogon> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): KerbTicketLogon =
                    KerbTicketLogon(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: KerbTicketLogon) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.messageType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.serviceTicketLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ticketGrantingTicketLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 16L, value.serviceTicket)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 24L, value.ticketGrantingTicket)
                }
            }

        public operator fun invoke(
            messageType: KerbLogonSubmitType = 0,
            flags: UInt = 0u,
            serviceTicketLength: UInt = 0u,
            ticketGrantingTicketLength: UInt = 0u,
            serviceTicket: MutPtr<UByte> = MutPtr(0L),
            ticketGrantingTicket: MutPtr<UByte> = MutPtr(0L),
        ): KerbTicketLogon =
            KerbTicketLogon(
                messageType = messageType,
                flags = flags,
                serviceTicketLength = serviceTicketLength,
                ticketGrantingTicketLength = ticketGrantingTicketLength,
                serviceTicketCtorArg = serviceTicket,
                ticketGrantingTicketCtorArg = ticketGrantingTicket,
            )
    }
}

public data class KerbTicketProfile(
    public var profile: KerbInteractiveProfile = KerbInteractiveProfile(),
    public var sessionKey: KerbCryptoKey = KerbCryptoKey(),
)

public data class KerbTicketUnlockLogon(
    public var logon: KerbTicketLogon = KerbTicketLogon(),
    public var logonId: Luid = Luid(),
)

public data class KerbTransferCredRequest(
    public var messageType: KerbProtocolMessageType = 0,
    public var originLogonId: Luid = Luid(),
    public var destinationLogonId: Luid = Luid(),
    public var flags: UInt = 0u,
)

public class KsecListEntry internal constructor(
    public var list: ListEntry,
    public var refCount: Int,
    public var signature: UInt,
    owningListCtorArg: MutPtr<CVoid>,
    reservedCtorArg: MutPtr<CVoid>,
) {
    public var owningList: MutPtr<CVoid> = owningListCtorArg
        internal set

    public var reserved: MutPtr<CVoid> = reservedCtorArg
        internal set

    public constructor() : this(
        list = ListEntry(),
        refCount = 0,
        signature = 0u,
        owningListCtorArg = MutPtr(0L),
        reservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ListEntry = this.list

    public operator fun component2(): Int = this.refCount

    public operator fun component3(): UInt = this.signature

    public operator fun component4(): MutPtr<CVoid> = this.owningList

    public operator fun component5(): MutPtr<CVoid> = this.reserved

    public fun copy(list: ListEntry = this.list, refCount: Int = this.refCount, signature: UInt = this.signature, owningList: MutPtr<CVoid> = this.owningList, reserved: MutPtr<CVoid> = this.reserved): KsecListEntry = KsecListEntry(list = list, refCount = refCount, signature = signature, owningListCtorArg = owningList, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KsecListEntry) return false
        if (this.list != other.list) return false
        if (this.refCount != other.refCount) return false
        if (this.signature != other.signature) return false
        if (this.owningList != other.owningList) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.list.hashCode()
        result = 31 * result + this.refCount.hashCode()
        result = 31 * result + this.signature.hashCode()
        result = 31 * result + this.owningList.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            list: ListEntry = ListEntry(),
            refCount: Int = 0,
            signature: UInt = 0u,
            owningList: MutPtr<CVoid> = MutPtr(0L),
            reserved: MutPtr<CVoid> = MutPtr(0L),
        ): KsecListEntry =
            KsecListEntry(
                list = list,
                refCount = refCount,
                signature = signature,
                owningListCtorArg = owningList,
                reservedCtorArg = reserved,
            )
    }
}

public class LogonHours internal constructor(
    public var unitsPerWeek: UShort,
    logonHoursCtorArg: MutPtr<UByte>,
) {
    public var logonHours: MutPtr<UByte> = logonHoursCtorArg
        internal set

    public constructor() : this(
        unitsPerWeek = 0u,
        logonHoursCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.unitsPerWeek

    public operator fun component2(): MutPtr<UByte> = this.logonHours

    public fun copy(unitsPerWeek: UShort = this.unitsPerWeek, logonHours: MutPtr<UByte> = this.logonHours): LogonHours = LogonHours(unitsPerWeek = unitsPerWeek, logonHoursCtorArg = logonHours)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LogonHours) return false
        if (this.unitsPerWeek != other.unitsPerWeek) return false
        if (this.logonHours != other.logonHours) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.unitsPerWeek.hashCode()
        result = 31 * result + this.logonHours.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LogonHours> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LogonHours> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): LogonHours =
                    LogonHours(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: LogonHours) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.unitsPerWeek)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.logonHours)
                }
            }

        public operator fun invoke(
            unitsPerWeek: UShort = 0u,
            logonHours: MutPtr<UByte> = MutPtr(0L),
        ): LogonHours =
            LogonHours(
                unitsPerWeek = unitsPerWeek,
                logonHoursCtorArg = logonHours,
            )
    }
}

public class LsaAuthInformation internal constructor(
    public var lastUpdateTime: Long,
    public var authType: LsaAuthInformationAuthType,
    public var authInfoLength: UInt,
    authInfoCtorArg: MutPtr<UByte>,
) {
    public var authInfo: MutPtr<UByte> = authInfoCtorArg
        internal set

    public constructor() : this(
        lastUpdateTime = 0L,
        authType = 0u,
        authInfoLength = 0u,
        authInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Long = this.lastUpdateTime

    public operator fun component2(): LsaAuthInformationAuthType = this.authType

    public operator fun component3(): UInt = this.authInfoLength

    public operator fun component4(): MutPtr<UByte> = this.authInfo

    public fun copy(lastUpdateTime: Long = this.lastUpdateTime, authType: LsaAuthInformationAuthType = this.authType, authInfoLength: UInt = this.authInfoLength, authInfo: MutPtr<UByte> = this.authInfo): LsaAuthInformation = LsaAuthInformation(lastUpdateTime = lastUpdateTime, authType = authType, authInfoLength = authInfoLength, authInfoCtorArg = authInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LsaAuthInformation) return false
        if (this.lastUpdateTime != other.lastUpdateTime) return false
        if (this.authType != other.authType) return false
        if (this.authInfoLength != other.authInfoLength) return false
        if (this.authInfo != other.authInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lastUpdateTime.hashCode()
        result = 31 * result + this.authType.hashCode()
        result = 31 * result + this.authInfoLength.hashCode()
        result = 31 * result + this.authInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LsaAuthInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LsaAuthInformation> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): LsaAuthInformation =
                    LsaAuthInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: LsaAuthInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.lastUpdateTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.authType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.authInfoLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 16L, value.authInfo)
                }
            }

        public operator fun invoke(
            lastUpdateTime: Long = 0L,
            authType: LsaAuthInformationAuthType = 0u,
            authInfoLength: UInt = 0u,
            authInfo: MutPtr<UByte> = MutPtr(0L),
        ): LsaAuthInformation =
            LsaAuthInformation(
                lastUpdateTime = lastUpdateTime,
                authType = authType,
                authInfoLength = authInfoLength,
                authInfoCtorArg = authInfo,
            )
    }
}

public data class LsaDispatchTable(
    public var createLogonSession: PlsaCreateLogonSession = null,
    public var deleteLogonSession: PlsaDeleteLogonSession = null,
    public var addCredential: PlsaAddCredential = null,
    public var getCredentials: PlsaGetCredentials = null,
    public var deleteCredential: PlsaDeleteCredential = null,
    public var allocateLsaHeap: PlsaAllocateLsaHeap = null,
    public var freeLsaHeap: PlsaFreeLsaHeap = null,
    public var allocateClientBuffer: PlsaAllocateClientBuffer = null,
    public var freeClientBuffer: PlsaFreeClientBuffer = null,
    public var copyToClientBuffer: PlsaCopyToClientBuffer = null,
    public var copyFromClientBuffer: PlsaCopyFromClientBuffer = null,
)

public class LsaEnumerationInformation internal constructor(
    sidCtorArg: Psid,
) {
    public var sid: Psid = sidCtorArg
        internal set

    public constructor() : this(
        sidCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Psid = this.sid

    public fun copy(sid: Psid = this.sid): LsaEnumerationInformation = LsaEnumerationInformation(sidCtorArg = sid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LsaEnumerationInformation) return false
        if (this.sid != other.sid) return false
        return true
    }

    override fun hashCode(): Int = this.sid.hashCode()

    public companion object {
        public operator fun invoke(
            sid: Psid = MutPtr(0L),
        ): LsaEnumerationInformation =
            LsaEnumerationInformation(
                sidCtorArg = sid,
            )
    }
}

public class LsaForestTrustBinaryData internal constructor(
    public var length: UInt,
    bufferCtorArg: MutPtr<UByte>,
) {
    public var buffer: MutPtr<UByte> = bufferCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        bufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): MutPtr<UByte> = this.buffer

    public fun copy(length: UInt = this.length, buffer: MutPtr<UByte> = this.buffer): LsaForestTrustBinaryData = LsaForestTrustBinaryData(length = length, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LsaForestTrustBinaryData) return false
        if (this.length != other.length) return false
        if (this.buffer != other.buffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.buffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LsaForestTrustBinaryData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LsaForestTrustBinaryData> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): LsaForestTrustBinaryData =
                    LsaForestTrustBinaryData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: LsaForestTrustBinaryData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.buffer)
                }
            }

        public operator fun invoke(
            length: UInt = 0u,
            buffer: MutPtr<UByte> = MutPtr(0L),
        ): LsaForestTrustBinaryData =
            LsaForestTrustBinaryData(
                length = length,
                bufferCtorArg = buffer,
            )
    }
}

public class LsaForestTrustCollisionInformation internal constructor(
    public var recordCount: UInt,
    entriesCtorArg: MutPtr<MutPtr<LsaForestTrustCollisionRecord>>,
) {
    public var entries: MutPtr<MutPtr<LsaForestTrustCollisionRecord>> = entriesCtorArg
        internal set

    public constructor() : this(
        recordCount = 0u,
        entriesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.recordCount

    public operator fun component2(): MutPtr<MutPtr<LsaForestTrustCollisionRecord>> = this.entries

    public fun copy(recordCount: UInt = this.recordCount, entries: MutPtr<MutPtr<LsaForestTrustCollisionRecord>> = this.entries): LsaForestTrustCollisionInformation = LsaForestTrustCollisionInformation(recordCount = recordCount, entriesCtorArg = entries)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LsaForestTrustCollisionInformation) return false
        if (this.recordCount != other.recordCount) return false
        if (this.entries != other.entries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.recordCount.hashCode()
        result = 31 * result + this.entries.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LsaForestTrustCollisionInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LsaForestTrustCollisionInformation> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): LsaForestTrustCollisionInformation =
                    LsaForestTrustCollisionInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<LsaForestTrustCollisionRecord>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: LsaForestTrustCollisionInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.recordCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<LsaForestTrustCollisionRecord>>(64)
                    ).writeNative(addr + 8L, value.entries)
                }
            }

        public operator fun invoke(
            recordCount: UInt = 0u,
            entries: MutPtr<MutPtr<LsaForestTrustCollisionRecord>> = MutPtr(0L),
        ): LsaForestTrustCollisionInformation =
            LsaForestTrustCollisionInformation(
                recordCount = recordCount,
                entriesCtorArg = entries,
            )
    }
}

public data class LsaForestTrustCollisionRecord(
    public var index: UInt = 0u,
    public var type: LsaForestTrustCollisionRecordType = 0,
    public var flags: UInt = 0u,
    public var name: LsaUnicodeString = LsaUnicodeString(),
)

public class LsaForestTrustDomainInfo internal constructor(
    sidCtorArg: Psid,
    public var dnsName: LsaUnicodeString,
    public var netbiosName: LsaUnicodeString,
) {
    public var sid: Psid = sidCtorArg
        internal set

    public constructor() : this(
        sidCtorArg = MutPtr(0L),
        dnsName = LsaUnicodeString(),
        netbiosName = LsaUnicodeString(),
    )

    public operator fun component1(): Psid = this.sid

    public operator fun component2(): LsaUnicodeString = this.dnsName

    public operator fun component3(): LsaUnicodeString = this.netbiosName

    public fun copy(sid: Psid = this.sid, dnsName: LsaUnicodeString = this.dnsName, netbiosName: LsaUnicodeString = this.netbiosName): LsaForestTrustDomainInfo = LsaForestTrustDomainInfo(sidCtorArg = sid, dnsName = dnsName, netbiosName = netbiosName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LsaForestTrustDomainInfo) return false
        if (this.sid != other.sid) return false
        if (this.dnsName != other.dnsName) return false
        if (this.netbiosName != other.netbiosName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sid.hashCode()
        result = 31 * result + this.dnsName.hashCode()
        result = 31 * result + this.netbiosName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sid: Psid = MutPtr(0L),
            dnsName: LsaUnicodeString = LsaUnicodeString(),
            netbiosName: LsaUnicodeString = LsaUnicodeString(),
        ): LsaForestTrustDomainInfo =
            LsaForestTrustDomainInfo(
                sidCtorArg = sid,
                dnsName = dnsName,
                netbiosName = netbiosName,
            )
    }
}

public class LsaForestTrustInformation internal constructor(
    public var recordCount: UInt,
    entriesCtorArg: MutPtr<MutPtr<LsaForestTrustRecord>>,
) {
    public var entries: MutPtr<MutPtr<LsaForestTrustRecord>> = entriesCtorArg
        internal set

    public constructor() : this(
        recordCount = 0u,
        entriesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.recordCount

    public operator fun component2(): MutPtr<MutPtr<LsaForestTrustRecord>> = this.entries

    public fun copy(recordCount: UInt = this.recordCount, entries: MutPtr<MutPtr<LsaForestTrustRecord>> = this.entries): LsaForestTrustInformation = LsaForestTrustInformation(recordCount = recordCount, entriesCtorArg = entries)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LsaForestTrustInformation) return false
        if (this.recordCount != other.recordCount) return false
        if (this.entries != other.entries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.recordCount.hashCode()
        result = 31 * result + this.entries.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LsaForestTrustInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LsaForestTrustInformation> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): LsaForestTrustInformation =
                    LsaForestTrustInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<LsaForestTrustRecord>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: LsaForestTrustInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.recordCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<LsaForestTrustRecord>>(64)
                    ).writeNative(addr + 8L, value.entries)
                }
            }

        public operator fun invoke(
            recordCount: UInt = 0u,
            entries: MutPtr<MutPtr<LsaForestTrustRecord>> = MutPtr(0L),
        ): LsaForestTrustInformation =
            LsaForestTrustInformation(
                recordCount = recordCount,
                entriesCtorArg = entries,
            )
    }
}

public class LsaForestTrustInformation2 internal constructor(
    public var recordCount: UInt,
    entriesCtorArg: MutPtr<MutPtr<LsaForestTrustRecord2>>,
) {
    public var entries: MutPtr<MutPtr<LsaForestTrustRecord2>> = entriesCtorArg
        internal set

    public constructor() : this(
        recordCount = 0u,
        entriesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.recordCount

    public operator fun component2(): MutPtr<MutPtr<LsaForestTrustRecord2>> = this.entries

    public fun copy(recordCount: UInt = this.recordCount, entries: MutPtr<MutPtr<LsaForestTrustRecord2>> = this.entries): LsaForestTrustInformation2 = LsaForestTrustInformation2(recordCount = recordCount, entriesCtorArg = entries)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LsaForestTrustInformation2) return false
        if (this.recordCount != other.recordCount) return false
        if (this.entries != other.entries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.recordCount.hashCode()
        result = 31 * result + this.entries.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LsaForestTrustInformation2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LsaForestTrustInformation2> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): LsaForestTrustInformation2 =
                    LsaForestTrustInformation2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<LsaForestTrustRecord2>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: LsaForestTrustInformation2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.recordCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<LsaForestTrustRecord2>>(64)
                    ).writeNative(addr + 8L, value.entries)
                }
            }

        public operator fun invoke(
            recordCount: UInt = 0u,
            entries: MutPtr<MutPtr<LsaForestTrustRecord2>> = MutPtr(0L),
        ): LsaForestTrustInformation2 =
            LsaForestTrustInformation2(
                recordCount = recordCount,
                entriesCtorArg = entries,
            )
    }
}

public data class LsaForestTrustRecord(
    public var flags: UInt = 0u,
    public var forestTrustType: LsaForestTrustRecordType = 0,
    public var time: Long = 0L,
    public var forestTrustData: LsaForestTrustRecord0 = LsaForestTrustRecord0(),
)

public data class LsaForestTrustRecord0(
    public var topLevelName: LsaUnicodeString = LsaUnicodeString(),
    public var domainInfo: LsaForestTrustDomainInfo = LsaForestTrustDomainInfo(),
    public var data: LsaForestTrustBinaryData = LsaForestTrustBinaryData(),
)

public data class LsaForestTrustRecord2(
    public var flags: UInt = 0u,
    public var forestTrustType: LsaForestTrustRecordType = 0,
    public var time: Long = 0L,
    public var forestTrustData: LsaForestTrustRecord20 = LsaForestTrustRecord20(),
)

public data class LsaForestTrustRecord20(
    public var topLevelName: LsaUnicodeString = LsaUnicodeString(),
    public var domainInfo: LsaForestTrustDomainInfo = LsaForestTrustDomainInfo(),
    public var binaryData: LsaForestTrustBinaryData = LsaForestTrustBinaryData(),
    public var scannerInfo: LsaForestTrustScannerInfo = LsaForestTrustScannerInfo(),
)

public class LsaForestTrustScannerInfo internal constructor(
    domainSidCtorArg: Psid,
    public var dnsName: LsaUnicodeString,
    public var netbiosName: LsaUnicodeString,
) {
    public var domainSid: Psid = domainSidCtorArg
        internal set

    public constructor() : this(
        domainSidCtorArg = MutPtr(0L),
        dnsName = LsaUnicodeString(),
        netbiosName = LsaUnicodeString(),
    )

    public operator fun component1(): Psid = this.domainSid

    public operator fun component2(): LsaUnicodeString = this.dnsName

    public operator fun component3(): LsaUnicodeString = this.netbiosName

    public fun copy(domainSid: Psid = this.domainSid, dnsName: LsaUnicodeString = this.dnsName, netbiosName: LsaUnicodeString = this.netbiosName): LsaForestTrustScannerInfo = LsaForestTrustScannerInfo(domainSidCtorArg = domainSid, dnsName = dnsName, netbiosName = netbiosName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LsaForestTrustScannerInfo) return false
        if (this.domainSid != other.domainSid) return false
        if (this.dnsName != other.dnsName) return false
        if (this.netbiosName != other.netbiosName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.domainSid.hashCode()
        result = 31 * result + this.dnsName.hashCode()
        result = 31 * result + this.netbiosName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            domainSid: Psid = MutPtr(0L),
            dnsName: LsaUnicodeString = LsaUnicodeString(),
            netbiosName: LsaUnicodeString = LsaUnicodeString(),
        ): LsaForestTrustScannerInfo =
            LsaForestTrustScannerInfo(
                domainSidCtorArg = domainSid,
                dnsName = dnsName,
                netbiosName = netbiosName,
            )
    }
}

public data class LsaLastInterLogonInfo(
    public var lastSuccessfulLogon: Long = 0L,
    public var lastFailedLogon: Long = 0L,
    public var failedAttemptCountSinceLastSuccessfulLogon: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LsaLastInterLogonInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LsaLastInterLogonInfo> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): LsaLastInterLogonInfo =
                    LsaLastInterLogonInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: LsaLastInterLogonInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.lastSuccessfulLogon)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lastFailedLogon)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.failedAttemptCountSinceLastSuccessfulLogon)
                }
            }
    }
}

public class LsaObjectAttributes internal constructor(
    public var length: UInt,
    rootDirectoryCtorArg: Handle,
    objectNameCtorArg: MutPtr<LsaUnicodeString>,
    public var attributes: UInt,
    securityDescriptorCtorArg: MutPtr<CVoid>,
    securityQualityOfServiceCtorArg: MutPtr<CVoid>,
) {
    public var rootDirectory: Handle = rootDirectoryCtorArg
        internal set

    public var objectName: MutPtr<LsaUnicodeString> = objectNameCtorArg
        internal set

    public var securityDescriptor: MutPtr<CVoid> = securityDescriptorCtorArg
        internal set

    public var securityQualityOfService: MutPtr<CVoid> = securityQualityOfServiceCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        rootDirectoryCtorArg = MutPtr(0L),
        objectNameCtorArg = MutPtr(0L),
        attributes = 0u,
        securityDescriptorCtorArg = MutPtr(0L),
        securityQualityOfServiceCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): Handle = this.rootDirectory

    public operator fun component3(): MutPtr<LsaUnicodeString> = this.objectName

    public operator fun component4(): UInt = this.attributes

    public operator fun component5(): MutPtr<CVoid> = this.securityDescriptor

    public operator fun component6(): MutPtr<CVoid> = this.securityQualityOfService

    public fun copy(length: UInt = this.length, rootDirectory: Handle = this.rootDirectory, objectName: MutPtr<LsaUnicodeString> = this.objectName, attributes: UInt = this.attributes, securityDescriptor: MutPtr<CVoid> = this.securityDescriptor, securityQualityOfService: MutPtr<CVoid> = this.securityQualityOfService): LsaObjectAttributes = LsaObjectAttributes(length = length, rootDirectoryCtorArg = rootDirectory, objectNameCtorArg = objectName, attributes = attributes, securityDescriptorCtorArg = securityDescriptor, securityQualityOfServiceCtorArg = securityQualityOfService)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LsaObjectAttributes) return false
        if (this.length != other.length) return false
        if (this.rootDirectory != other.rootDirectory) return false
        if (this.objectName != other.objectName) return false
        if (this.attributes != other.attributes) return false
        if (this.securityDescriptor != other.securityDescriptor) return false
        if (this.securityQualityOfService != other.securityQualityOfService) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.rootDirectory.hashCode()
        result = 31 * result + this.objectName.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.securityDescriptor.hashCode()
        result = 31 * result + this.securityQualityOfService.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UInt = 0u,
            rootDirectory: Handle = MutPtr(0L),
            objectName: MutPtr<LsaUnicodeString> = MutPtr(0L),
            attributes: UInt = 0u,
            securityDescriptor: MutPtr<CVoid> = MutPtr(0L),
            securityQualityOfService: MutPtr<CVoid> = MutPtr(0L),
        ): LsaObjectAttributes =
            LsaObjectAttributes(
                length = length,
                rootDirectoryCtorArg = rootDirectory,
                objectNameCtorArg = objectName,
                attributes = attributes,
                securityDescriptorCtorArg = securityDescriptor,
                securityQualityOfServiceCtorArg = securityQualityOfService,
            )
    }
}

public class LsaReferencedDomainList internal constructor(
    public var entries: UInt,
    domainsCtorArg: MutPtr<LsaTrustInformation>,
) {
    public var domains: MutPtr<LsaTrustInformation> = domainsCtorArg
        internal set

    public constructor() : this(
        entries = 0u,
        domainsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.entries

    public operator fun component2(): MutPtr<LsaTrustInformation> = this.domains

    public fun copy(entries: UInt = this.entries, domains: MutPtr<LsaTrustInformation> = this.domains): LsaReferencedDomainList = LsaReferencedDomainList(entries = entries, domainsCtorArg = domains)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LsaReferencedDomainList) return false
        if (this.entries != other.entries) return false
        if (this.domains != other.domains) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.entries.hashCode()
        result = 31 * result + this.domains.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LsaReferencedDomainList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LsaReferencedDomainList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): LsaReferencedDomainList =
                    LsaReferencedDomainList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<LsaTrustInformation>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: LsaReferencedDomainList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.entries)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<LsaTrustInformation>(64)
                    ).writeNative(addr + 8L, value.domains)
                }
            }

        public operator fun invoke(
            entries: UInt = 0u,
            domains: MutPtr<LsaTrustInformation> = MutPtr(0L),
        ): LsaReferencedDomainList =
            LsaReferencedDomainList(
                entries = entries,
                domainsCtorArg = domains,
            )
    }
}

public class LsaSecpkgFunctionTable(
    public var createLogonSession: PlsaCreateLogonSession = null,
    public var deleteLogonSession: PlsaDeleteLogonSession = null,
    public var addCredential: PlsaAddCredential = null,
    public var getCredentials: PlsaGetCredentials = null,
    public var deleteCredential: PlsaDeleteCredential = null,
    public var allocateLsaHeap: PlsaAllocateLsaHeap = null,
    public var freeLsaHeap: PlsaFreeLsaHeap = null,
    public var allocateClientBuffer: PlsaAllocateClientBuffer = null,
    public var freeClientBuffer: PlsaFreeClientBuffer = null,
    public var copyToClientBuffer: PlsaCopyToClientBuffer = null,
    public var copyFromClientBuffer: PlsaCopyFromClientBuffer = null,
    public var impersonateClient: PlsaImpersonateClient = null,
    public var unloadPackage: PlsaUnloadPackage = null,
    public var duplicateHandle: PlsaDuplicateHandle = null,
    public var saveSupplementalCredentials: PlsaSaveSupplementalCredentials = null,
    public var createThread: PlsaCreateThread = null,
    public var getClientInfo: PlsaGetClientInfo = null,
    public var registerNotification: PlsaRegisterNotification = null,
    public var cancelNotification: PlsaCancelNotification = null,
    public var mapBuffer: PlsaMapBuffer = null,
    public var createToken: PlsaCreateToken = null,
    public var auditLogon: PlsaAuditLogon = null,
    public var callPackage: PlsaCallPackage = null,
    public var freeReturnBuffer: PlsaFreeLsaHeap = null,
    public var getCallInfo: PlsaGetCallInfo = null,
    public var callPackageEx: PlsaCallPackageex = null,
    public var createSharedMemory: PlsaCreateSharedMemory = null,
    public var allocateSharedMemory: PlsaAllocateSharedMemory = null,
    public var freeSharedMemory: PlsaFreeSharedMemory = null,
    public var deleteSharedMemory: PlsaDeleteSharedMemory = null,
    public var openSamUser: PlsaOpenSamUser = null,
    public var getUserCredentials: PlsaGetUserCredentials = null,
    public var getUserAuthData: PlsaGetUserAuthData = null,
    public var closeSamUser: PlsaCloseSamUser = null,
    public var convertAuthDataToToken: PlsaConvertAuthDataToToken = null,
    public var clientCallback: PlsaClientCallback = null,
    public var updateCredentials: PlsaUpdatePrimaryCredentials = null,
    public var getAuthDataForUser: PlsaGetAuthDataForUser = null,
    public var crackSingleName: PlsaCrackSingleName = null,
    public var auditAccountLogon: PlsaAuditAccountLogon = null,
    public var callPackagePassthrough: PlsaCallPackagePassthrough = null,
    public var crediRead: CredReadFn = null,
    public var crediReadDomainCredentials: CredReadDomainCredentialsFn = null,
    public var crediFreeCredentials: CredFreeCredentialsFn = null,
    public var lsaProtectMemory: PlsaProtectMemory = null,
    public var lsaUnprotectMemory: PlsaProtectMemory = null,
    public var openTokenByLogonId: PlsaOpenTokenByLogonId = null,
    public var expandAuthDataForDomain: PlsaExpandAuthDataForDomain = null,
    public var allocatePrivateHeap: PlsaAllocatePrivateHeap = null,
    public var freePrivateHeap: PlsaFreePrivateHeap = null,
    public var createTokenEx: PlsaCreateTokenEx = null,
    public var crediWrite: CredWriteFn = null,
    public var crediUnmarshalandDecodeString: CrediUnmarshalandDecodeStringFn = null,
    public var dummyFunction6: PlsaProtectMemory = null,
    public var getExtendedCallFlags: PlsaGetExtendedCallFlags = null,
    public var duplicateTokenHandle: PlsaDuplicateHandle = null,
    public var getServiceAccountPassword: PlsaGetServiceAccountPassword = null,
    public var dummyFunction7: PlsaProtectMemory = null,
    public var auditLogonEx: PlsaAuditLogonEx = null,
    public var checkProtectedUserByToken: PlsaCheckProtectedUserByToken = null,
    public var queryClientRequest: PlsaQueryClientRequest = null,
    public var getAppModeInfo: PlsaGetAppModeInfo = null,
    public var setAppModeInfo: PlsaSetAppModeInfo = null,
    public var getClientInfoEx: PlsaGetClientInfoEx = null,
)

public class LsaString internal constructor(
    public var length: UShort,
    public var maximumLength: UShort,
    bufferCtorArg: Pstr,
) {
    public var buffer: Pstr = bufferCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        maximumLength = 0u,
        bufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.length

    public operator fun component2(): UShort = this.maximumLength

    public operator fun component3(): Pstr = this.buffer

    public fun copy(length: UShort = this.length, maximumLength: UShort = this.maximumLength, buffer: Pstr = this.buffer): LsaString = LsaString(length = length, maximumLength = maximumLength, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LsaString) return false
        if (this.length != other.length) return false
        if (this.maximumLength != other.maximumLength) return false
        if (this.buffer != other.buffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.maximumLength.hashCode()
        result = 31 * result + this.buffer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UShort = 0u,
            maximumLength: UShort = 0u,
            buffer: Pstr = MutPtr(0L),
        ): LsaString =
            LsaString(
                length = length,
                maximumLength = maximumLength,
                bufferCtorArg = buffer,
            )
    }
}

public class LsaTokenInformationNull internal constructor(
    public var expirationTime: Long,
    groupsCtorArg: MutPtr<TokenGroups>,
) {
    public var groups: MutPtr<TokenGroups> = groupsCtorArg
        internal set

    public constructor() : this(
        expirationTime = 0L,
        groupsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Long = this.expirationTime

    public operator fun component2(): MutPtr<TokenGroups> = this.groups

    public fun copy(expirationTime: Long = this.expirationTime, groups: MutPtr<TokenGroups> = this.groups): LsaTokenInformationNull = LsaTokenInformationNull(expirationTime = expirationTime, groupsCtorArg = groups)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LsaTokenInformationNull) return false
        if (this.expirationTime != other.expirationTime) return false
        if (this.groups != other.groups) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.expirationTime.hashCode()
        result = 31 * result + this.groups.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LsaTokenInformationNull> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LsaTokenInformationNull> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): LsaTokenInformationNull =
                    LsaTokenInformationNull(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<TokenGroups>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: LsaTokenInformationNull) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.expirationTime)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<TokenGroups>(64)
                    ).writeNative(addr + 8L, value.groups)
                }
            }

        public operator fun invoke(
            expirationTime: Long = 0L,
            groups: MutPtr<TokenGroups> = MutPtr(0L),
        ): LsaTokenInformationNull =
            LsaTokenInformationNull(
                expirationTime = expirationTime,
                groupsCtorArg = groups,
            )
    }
}

public class LsaTokenInformationV1 internal constructor(
    public var expirationTime: Long,
    public var user: TokenUser,
    groupsCtorArg: MutPtr<TokenGroups>,
    public var primaryGroup: TokenPrimaryGroup,
    privilegesCtorArg: MutPtr<TokenPrivileges>,
    public var owner: TokenOwner,
    public var defaultDacl: TokenDefaultDacl,
) {
    public var groups: MutPtr<TokenGroups> = groupsCtorArg
        internal set

    public var privileges: MutPtr<TokenPrivileges> = privilegesCtorArg
        internal set

    public constructor() : this(
        expirationTime = 0L,
        user = TokenUser(),
        groupsCtorArg = MutPtr(0L),
        primaryGroup = TokenPrimaryGroup(),
        privilegesCtorArg = MutPtr(0L),
        owner = TokenOwner(),
        defaultDacl = TokenDefaultDacl(),
    )

    public operator fun component1(): Long = this.expirationTime

    public operator fun component2(): TokenUser = this.user

    public operator fun component3(): MutPtr<TokenGroups> = this.groups

    public operator fun component4(): TokenPrimaryGroup = this.primaryGroup

    public operator fun component5(): MutPtr<TokenPrivileges> = this.privileges

    public operator fun component6(): TokenOwner = this.owner

    public operator fun component7(): TokenDefaultDacl = this.defaultDacl

    public fun copy(expirationTime: Long = this.expirationTime, user: TokenUser = this.user, groups: MutPtr<TokenGroups> = this.groups, primaryGroup: TokenPrimaryGroup = this.primaryGroup, privileges: MutPtr<TokenPrivileges> = this.privileges, owner: TokenOwner = this.owner, defaultDacl: TokenDefaultDacl = this.defaultDacl): LsaTokenInformationV1 = LsaTokenInformationV1(expirationTime = expirationTime, user = user, groupsCtorArg = groups, primaryGroup = primaryGroup, privilegesCtorArg = privileges, owner = owner, defaultDacl = defaultDacl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LsaTokenInformationV1) return false
        if (this.expirationTime != other.expirationTime) return false
        if (this.user != other.user) return false
        if (this.groups != other.groups) return false
        if (this.primaryGroup != other.primaryGroup) return false
        if (this.privileges != other.privileges) return false
        if (this.owner != other.owner) return false
        if (this.defaultDacl != other.defaultDacl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.expirationTime.hashCode()
        result = 31 * result + this.user.hashCode()
        result = 31 * result + this.groups.hashCode()
        result = 31 * result + this.primaryGroup.hashCode()
        result = 31 * result + this.privileges.hashCode()
        result = 31 * result + this.owner.hashCode()
        result = 31 * result + this.defaultDacl.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            expirationTime: Long = 0L,
            user: TokenUser = TokenUser(),
            groups: MutPtr<TokenGroups> = MutPtr(0L),
            primaryGroup: TokenPrimaryGroup = TokenPrimaryGroup(),
            privileges: MutPtr<TokenPrivileges> = MutPtr(0L),
            owner: TokenOwner = TokenOwner(),
            defaultDacl: TokenDefaultDacl = TokenDefaultDacl(),
        ): LsaTokenInformationV1 =
            LsaTokenInformationV1(
                expirationTime = expirationTime,
                user = user,
                groupsCtorArg = groups,
                primaryGroup = primaryGroup,
                privilegesCtorArg = privileges,
                owner = owner,
                defaultDacl = defaultDacl,
            )
    }
}

public class LsaTokenInformationV3 internal constructor(
    public var expirationTime: Long,
    public var user: TokenUser,
    groupsCtorArg: MutPtr<TokenGroups>,
    public var primaryGroup: TokenPrimaryGroup,
    privilegesCtorArg: MutPtr<TokenPrivileges>,
    public var owner: TokenOwner,
    public var defaultDacl: TokenDefaultDacl,
    public var userClaims: TokenUserClaims,
    public var deviceClaims: TokenDeviceClaims,
    deviceGroupsCtorArg: MutPtr<TokenGroups>,
) {
    public var groups: MutPtr<TokenGroups> = groupsCtorArg
        internal set

    public var privileges: MutPtr<TokenPrivileges> = privilegesCtorArg
        internal set

    public var deviceGroups: MutPtr<TokenGroups> = deviceGroupsCtorArg
        internal set

    public constructor() : this(
        expirationTime = 0L,
        user = TokenUser(),
        groupsCtorArg = MutPtr(0L),
        primaryGroup = TokenPrimaryGroup(),
        privilegesCtorArg = MutPtr(0L),
        owner = TokenOwner(),
        defaultDacl = TokenDefaultDacl(),
        userClaims = TokenUserClaims(),
        deviceClaims = TokenDeviceClaims(),
        deviceGroupsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Long = this.expirationTime

    public operator fun component2(): TokenUser = this.user

    public operator fun component3(): MutPtr<TokenGroups> = this.groups

    public operator fun component4(): TokenPrimaryGroup = this.primaryGroup

    public operator fun component5(): MutPtr<TokenPrivileges> = this.privileges

    public operator fun component6(): TokenOwner = this.owner

    public operator fun component7(): TokenDefaultDacl = this.defaultDacl

    public operator fun component8(): TokenUserClaims = this.userClaims

    public operator fun component9(): TokenDeviceClaims = this.deviceClaims

    public operator fun component10(): MutPtr<TokenGroups> = this.deviceGroups

    public fun copy(expirationTime: Long = this.expirationTime, user: TokenUser = this.user, groups: MutPtr<TokenGroups> = this.groups, primaryGroup: TokenPrimaryGroup = this.primaryGroup, privileges: MutPtr<TokenPrivileges> = this.privileges, owner: TokenOwner = this.owner, defaultDacl: TokenDefaultDacl = this.defaultDacl, userClaims: TokenUserClaims = this.userClaims, deviceClaims: TokenDeviceClaims = this.deviceClaims, deviceGroups: MutPtr<TokenGroups> = this.deviceGroups): LsaTokenInformationV3 = LsaTokenInformationV3(expirationTime = expirationTime, user = user, groupsCtorArg = groups, primaryGroup = primaryGroup, privilegesCtorArg = privileges, owner = owner, defaultDacl = defaultDacl, userClaims = userClaims, deviceClaims = deviceClaims, deviceGroupsCtorArg = deviceGroups)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LsaTokenInformationV3) return false
        if (this.expirationTime != other.expirationTime) return false
        if (this.user != other.user) return false
        if (this.groups != other.groups) return false
        if (this.primaryGroup != other.primaryGroup) return false
        if (this.privileges != other.privileges) return false
        if (this.owner != other.owner) return false
        if (this.defaultDacl != other.defaultDacl) return false
        if (this.userClaims != other.userClaims) return false
        if (this.deviceClaims != other.deviceClaims) return false
        if (this.deviceGroups != other.deviceGroups) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.expirationTime.hashCode()
        result = 31 * result + this.user.hashCode()
        result = 31 * result + this.groups.hashCode()
        result = 31 * result + this.primaryGroup.hashCode()
        result = 31 * result + this.privileges.hashCode()
        result = 31 * result + this.owner.hashCode()
        result = 31 * result + this.defaultDacl.hashCode()
        result = 31 * result + this.userClaims.hashCode()
        result = 31 * result + this.deviceClaims.hashCode()
        result = 31 * result + this.deviceGroups.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            expirationTime: Long = 0L,
            user: TokenUser = TokenUser(),
            groups: MutPtr<TokenGroups> = MutPtr(0L),
            primaryGroup: TokenPrimaryGroup = TokenPrimaryGroup(),
            privileges: MutPtr<TokenPrivileges> = MutPtr(0L),
            owner: TokenOwner = TokenOwner(),
            defaultDacl: TokenDefaultDacl = TokenDefaultDacl(),
            userClaims: TokenUserClaims = TokenUserClaims(),
            deviceClaims: TokenDeviceClaims = TokenDeviceClaims(),
            deviceGroups: MutPtr<TokenGroups> = MutPtr(0L),
        ): LsaTokenInformationV3 =
            LsaTokenInformationV3(
                expirationTime = expirationTime,
                user = user,
                groupsCtorArg = groups,
                primaryGroup = primaryGroup,
                privilegesCtorArg = privileges,
                owner = owner,
                defaultDacl = defaultDacl,
                userClaims = userClaims,
                deviceClaims = deviceClaims,
                deviceGroupsCtorArg = deviceGroups,
            )
    }
}

public data class LsaTranslatedName(
    public var use: SidNameUse = 0,
    public var name: LsaUnicodeString = LsaUnicodeString(),
    public var domainIndex: Int = 0,
)

public data class LsaTranslatedSid(
    public var use: SidNameUse = 0,
    public var relativeId: UInt = 0u,
    public var domainIndex: Int = 0,
)

public class LsaTranslatedSid2 internal constructor(
    public var use: SidNameUse,
    sidCtorArg: Psid,
    public var domainIndex: Int,
    public var flags: UInt,
) {
    public var sid: Psid = sidCtorArg
        internal set

    public constructor() : this(
        use = 0,
        sidCtorArg = MutPtr(0L),
        domainIndex = 0,
        flags = 0u,
    )

    public operator fun component1(): SidNameUse = this.use

    public operator fun component2(): Psid = this.sid

    public operator fun component3(): Int = this.domainIndex

    public operator fun component4(): UInt = this.flags

    public fun copy(use: SidNameUse = this.use, sid: Psid = this.sid, domainIndex: Int = this.domainIndex, flags: UInt = this.flags): LsaTranslatedSid2 = LsaTranslatedSid2(use = use, sidCtorArg = sid, domainIndex = domainIndex, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LsaTranslatedSid2) return false
        if (this.use != other.use) return false
        if (this.sid != other.sid) return false
        if (this.domainIndex != other.domainIndex) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.use.hashCode()
        result = 31 * result + this.sid.hashCode()
        result = 31 * result + this.domainIndex.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            use: SidNameUse = 0,
            sid: Psid = MutPtr(0L),
            domainIndex: Int = 0,
            flags: UInt = 0u,
        ): LsaTranslatedSid2 =
            LsaTranslatedSid2(
                use = use,
                sidCtorArg = sid,
                domainIndex = domainIndex,
                flags = flags,
            )
    }
}

public class LsaTrustInformation internal constructor(
    public var name: LsaUnicodeString,
    sidCtorArg: Psid,
) {
    public var sid: Psid = sidCtorArg
        internal set

    public constructor() : this(
        name = LsaUnicodeString(),
        sidCtorArg = MutPtr(0L),
    )

    public operator fun component1(): LsaUnicodeString = this.name

    public operator fun component2(): Psid = this.sid

    public fun copy(name: LsaUnicodeString = this.name, sid: Psid = this.sid): LsaTrustInformation = LsaTrustInformation(name = name, sidCtorArg = sid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LsaTrustInformation) return false
        if (this.name != other.name) return false
        if (this.sid != other.sid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.sid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            name: LsaUnicodeString = LsaUnicodeString(),
            sid: Psid = MutPtr(0L),
        ): LsaTrustInformation =
            LsaTrustInformation(
                name = name,
                sidCtorArg = sid,
            )
    }
}

public class LsaUnicodeString internal constructor(
    public var length: UShort,
    public var maximumLength: UShort,
    bufferCtorArg: Pwstr,
) {
    public var buffer: Pwstr = bufferCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        maximumLength = 0u,
        bufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.length

    public operator fun component2(): UShort = this.maximumLength

    public operator fun component3(): Pwstr = this.buffer

    public fun copy(length: UShort = this.length, maximumLength: UShort = this.maximumLength, buffer: Pwstr = this.buffer): LsaUnicodeString = LsaUnicodeString(length = length, maximumLength = maximumLength, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LsaUnicodeString) return false
        if (this.length != other.length) return false
        if (this.maximumLength != other.maximumLength) return false
        if (this.buffer != other.buffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.maximumLength.hashCode()
        result = 31 * result + this.buffer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UShort = 0u,
            maximumLength: UShort = 0u,
            buffer: Pwstr = MutPtr(0L),
        ): LsaUnicodeString =
            LsaUnicodeString(
                length = length,
                maximumLength = maximumLength,
                bufferCtorArg = buffer,
            )
    }
}

public data class Msv10AvPair(
    public var avId: UShort = 0u,
    public var avLen: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10AvPair> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10AvPair> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Msv10AvPair =
                    Msv10AvPair(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Msv10AvPair) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.avId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.avLen)
                }
            }
    }
}

public data class Msv10ChangepasswordRequest(
    public var messageType: Msv10ProtocolMessageType = 0,
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var accountName: LsaUnicodeString = LsaUnicodeString(),
    public var oldPassword: LsaUnicodeString = LsaUnicodeString(),
    public var newPassword: LsaUnicodeString = LsaUnicodeString(),
    public var impersonating: Boolean = false,
)

public data class Msv10ChangepasswordResponse(
    public var messageType: Msv10ProtocolMessageType = 0,
    public var passwordInfoValid: Boolean = false,
    public var domainPasswordInfo: DomainPasswordInformation = DomainPasswordInformation(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10ChangepasswordResponse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10ChangepasswordResponse> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Msv10ChangepasswordResponse =
                    Msv10ChangepasswordResponse(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                        (DomainPasswordInformation.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Msv10ChangepasswordResponse) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.messageType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.passwordInfoValid)
                    (DomainPasswordInformation.typeLayout()).writeNative(addr + 8L, value.domainPasswordInfo)
                }
            }
    }
}

public data class Msv10CredentialKey(
    public var data: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10CredentialKey) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int = this.data.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10CredentialKey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10CredentialKey> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Msv10CredentialKey =
                    Msv10CredentialKey(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Msv10CredentialKey) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr, value.data)
                }
            }
    }
}

public data class Msv10InteractiveLogon(
    public var messageType: Msv10LogonSubmitType = 0,
    public var logonDomainName: LsaUnicodeString = LsaUnicodeString(),
    public var userName: LsaUnicodeString = LsaUnicodeString(),
    public var password: LsaUnicodeString = LsaUnicodeString(),
)

public data class Msv10InteractiveProfile(
    public var messageType: Msv10ProfileBufferType = 0,
    public var logonCount: UShort = 0u,
    public var badPasswordCount: UShort = 0u,
    public var logonTime: Long = 0L,
    public var logoffTime: Long = 0L,
    public var kickOffTime: Long = 0L,
    public var passwordLastSet: Long = 0L,
    public var passwordCanChange: Long = 0L,
    public var passwordMustChange: Long = 0L,
    public var logonScript: LsaUnicodeString = LsaUnicodeString(),
    public var homeDirectory: LsaUnicodeString = LsaUnicodeString(),
    public var fullName: LsaUnicodeString = LsaUnicodeString(),
    public var profilePath: LsaUnicodeString = LsaUnicodeString(),
    public var homeDirectoryDrive: LsaUnicodeString = LsaUnicodeString(),
    public var logonServer: LsaUnicodeString = LsaUnicodeString(),
    public var userFlags: UInt = 0u,
)

public data class Msv10IumSupplementalCredential(
    public var version: UInt = 0u,
    public var encryptedCredsSize: UInt = 0u,
    public var encryptedCreds: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10IumSupplementalCredential) return false
        if (this.version != other.version) return false
        if (this.encryptedCredsSize != other.encryptedCredsSize) return false
        if (!this.encryptedCreds.contentEquals(other.encryptedCreds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.encryptedCredsSize.hashCode()
        result = 31 * result + this.encryptedCreds.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10IumSupplementalCredential> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10IumSupplementalCredential> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Msv10IumSupplementalCredential =
                    Msv10IumSupplementalCredential(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Msv10IumSupplementalCredential) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.encryptedCredsSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.encryptedCreds)
                }
            }
    }
}

public data class Msv10Lm20Logon(
    public var messageType: Msv10LogonSubmitType = 0,
    public var logonDomainName: LsaUnicodeString = LsaUnicodeString(),
    public var userName: LsaUnicodeString = LsaUnicodeString(),
    public var workstation: LsaUnicodeString = LsaUnicodeString(),
    public var challengeToClient: UByteArray = UByteArray(8),
    public var caseSensitiveChallengeResponse: LsaString = LsaString(),
    public var caseInsensitiveChallengeResponse: LsaString = LsaString(),
    public var parameterControl: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10Lm20Logon) return false
        if (this.messageType != other.messageType) return false
        if (this.logonDomainName != other.logonDomainName) return false
        if (this.userName != other.userName) return false
        if (this.workstation != other.workstation) return false
        if (!this.challengeToClient.contentEquals(other.challengeToClient)) return false
        if (this.caseSensitiveChallengeResponse != other.caseSensitiveChallengeResponse) return false
        if (this.caseInsensitiveChallengeResponse != other.caseInsensitiveChallengeResponse) return false
        if (this.parameterControl != other.parameterControl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.logonDomainName.hashCode()
        result = 31 * result + this.userName.hashCode()
        result = 31 * result + this.workstation.hashCode()
        result = 31 * result + this.challengeToClient.contentHashCode()
        result = 31 * result + this.caseSensitiveChallengeResponse.hashCode()
        result = 31 * result + this.caseInsensitiveChallengeResponse.hashCode()
        result = 31 * result + this.parameterControl.hashCode()
        return result
    }
}

public data class Msv10Lm20LogonProfile(
    public var messageType: Msv10ProfileBufferType = 0,
    public var kickOffTime: Long = 0L,
    public var logoffTime: Long = 0L,
    public var userFlags: MsvSubAuthenticationFilter = 0u,
    public var userSessionKey: UByteArray = UByteArray(16),
    public var logonDomainName: LsaUnicodeString = LsaUnicodeString(),
    public var lanmanSessionKey: UByteArray = UByteArray(8),
    public var logonServer: LsaUnicodeString = LsaUnicodeString(),
    public var userParameters: LsaUnicodeString = LsaUnicodeString(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10Lm20LogonProfile) return false
        if (this.messageType != other.messageType) return false
        if (this.kickOffTime != other.kickOffTime) return false
        if (this.logoffTime != other.logoffTime) return false
        if (this.userFlags != other.userFlags) return false
        if (!this.userSessionKey.contentEquals(other.userSessionKey)) return false
        if (this.logonDomainName != other.logonDomainName) return false
        if (!this.lanmanSessionKey.contentEquals(other.lanmanSessionKey)) return false
        if (this.logonServer != other.logonServer) return false
        if (this.userParameters != other.userParameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.kickOffTime.hashCode()
        result = 31 * result + this.logoffTime.hashCode()
        result = 31 * result + this.userFlags.hashCode()
        result = 31 * result + this.userSessionKey.contentHashCode()
        result = 31 * result + this.logonDomainName.hashCode()
        result = 31 * result + this.lanmanSessionKey.contentHashCode()
        result = 31 * result + this.logonServer.hashCode()
        result = 31 * result + this.userParameters.hashCode()
        return result
    }
}

public data class Msv10Ntlm3Response(
    public var response: UByteArray = UByteArray(16),
    public var respType: UByte = 0u,
    public var hiRespType: UByte = 0u,
    public var flags: UShort = 0u,
    public var msgWord: UInt = 0u,
    public var timeStamp: ULong = 0uL,
    public var challengeFromClient: UByteArray = UByteArray(8),
    public var avPairsOff: UInt = 0u,
    public var buffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10Ntlm3Response) return false
        if (!this.response.contentEquals(other.response)) return false
        if (this.respType != other.respType) return false
        if (this.hiRespType != other.hiRespType) return false
        if (this.flags != other.flags) return false
        if (this.msgWord != other.msgWord) return false
        if (this.timeStamp != other.timeStamp) return false
        if (!this.challengeFromClient.contentEquals(other.challengeFromClient)) return false
        if (this.avPairsOff != other.avPairsOff) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.response.contentHashCode()
        result = 31 * result + this.respType.hashCode()
        result = 31 * result + this.hiRespType.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.msgWord.hashCode()
        result = 31 * result + this.timeStamp.hashCode()
        result = 31 * result + this.challengeFromClient.contentHashCode()
        result = 31 * result + this.avPairsOff.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10Ntlm3Response> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10Ntlm3Response> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Msv10Ntlm3Response =
                    Msv10Ntlm3Response(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: Msv10Ntlm3Response) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.response)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.respType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.hiRespType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.msgWord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.timeStamp)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 32L, value.challengeFromClient)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.avPairsOff)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 44L, value.buffer)
                }
            }
    }
}

public class Msv10PassthroughRequest internal constructor(
    public var messageType: Msv10ProtocolMessageType,
    public var domainName: LsaUnicodeString,
    public var packageName: LsaUnicodeString,
    public var dataLength: UInt,
    logonDataCtorArg: MutPtr<UByte>,
    public var pad: UInt,
) {
    public var logonData: MutPtr<UByte> = logonDataCtorArg
        internal set

    public constructor() : this(
        messageType = 0,
        domainName = LsaUnicodeString(),
        packageName = LsaUnicodeString(),
        dataLength = 0u,
        logonDataCtorArg = MutPtr(0L),
        pad = 0u,
    )

    public operator fun component1(): Msv10ProtocolMessageType = this.messageType

    public operator fun component2(): LsaUnicodeString = this.domainName

    public operator fun component3(): LsaUnicodeString = this.packageName

    public operator fun component4(): UInt = this.dataLength

    public operator fun component5(): MutPtr<UByte> = this.logonData

    public operator fun component6(): UInt = this.pad

    public fun copy(messageType: Msv10ProtocolMessageType = this.messageType, domainName: LsaUnicodeString = this.domainName, packageName: LsaUnicodeString = this.packageName, dataLength: UInt = this.dataLength, logonData: MutPtr<UByte> = this.logonData, pad: UInt = this.pad): Msv10PassthroughRequest = Msv10PassthroughRequest(messageType = messageType, domainName = domainName, packageName = packageName, dataLength = dataLength, logonDataCtorArg = logonData, pad = pad)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10PassthroughRequest) return false
        if (this.messageType != other.messageType) return false
        if (this.domainName != other.domainName) return false
        if (this.packageName != other.packageName) return false
        if (this.dataLength != other.dataLength) return false
        if (this.logonData != other.logonData) return false
        if (this.pad != other.pad) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.domainName.hashCode()
        result = 31 * result + this.packageName.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.logonData.hashCode()
        result = 31 * result + this.pad.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            messageType: Msv10ProtocolMessageType = 0,
            domainName: LsaUnicodeString = LsaUnicodeString(),
            packageName: LsaUnicodeString = LsaUnicodeString(),
            dataLength: UInt = 0u,
            logonData: MutPtr<UByte> = MutPtr(0L),
            pad: UInt = 0u,
        ): Msv10PassthroughRequest =
            Msv10PassthroughRequest(
                messageType = messageType,
                domainName = domainName,
                packageName = packageName,
                dataLength = dataLength,
                logonDataCtorArg = logonData,
                pad = pad,
            )
    }
}

public class Msv10PassthroughResponse internal constructor(
    public var messageType: Msv10ProtocolMessageType,
    public var pad: UInt,
    public var dataLength: UInt,
    validationDataCtorArg: MutPtr<UByte>,
) {
    public var validationData: MutPtr<UByte> = validationDataCtorArg
        internal set

    public constructor() : this(
        messageType = 0,
        pad = 0u,
        dataLength = 0u,
        validationDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Msv10ProtocolMessageType = this.messageType

    public operator fun component2(): UInt = this.pad

    public operator fun component3(): UInt = this.dataLength

    public operator fun component4(): MutPtr<UByte> = this.validationData

    public fun copy(messageType: Msv10ProtocolMessageType = this.messageType, pad: UInt = this.pad, dataLength: UInt = this.dataLength, validationData: MutPtr<UByte> = this.validationData): Msv10PassthroughResponse = Msv10PassthroughResponse(messageType = messageType, pad = pad, dataLength = dataLength, validationDataCtorArg = validationData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10PassthroughResponse) return false
        if (this.messageType != other.messageType) return false
        if (this.pad != other.pad) return false
        if (this.dataLength != other.dataLength) return false
        if (this.validationData != other.validationData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.pad.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.validationData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10PassthroughResponse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10PassthroughResponse> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Msv10PassthroughResponse =
                    Msv10PassthroughResponse(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Msv10PassthroughResponse) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.messageType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dataLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 16L, value.validationData)
                }
            }

        public operator fun invoke(
            messageType: Msv10ProtocolMessageType = 0,
            pad: UInt = 0u,
            dataLength: UInt = 0u,
            validationData: MutPtr<UByte> = MutPtr(0L),
        ): Msv10PassthroughResponse =
            Msv10PassthroughResponse(
                messageType = messageType,
                pad = pad,
                dataLength = dataLength,
                validationDataCtorArg = validationData,
            )
    }
}

public data class Msv10RemoteSupplementalCredential(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var credentialKey: Msv10CredentialKey = Msv10CredentialKey(),
    public var credentialKeyType: Msv10CredentialKeyType = 0,
    public var encryptedCredsSize: UInt = 0u,
    public var encryptedCreds: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10RemoteSupplementalCredential) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (this.credentialKey != other.credentialKey) return false
        if (this.credentialKeyType != other.credentialKeyType) return false
        if (this.encryptedCredsSize != other.encryptedCredsSize) return false
        if (!this.encryptedCreds.contentEquals(other.encryptedCreds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.credentialKey.hashCode()
        result = 31 * result + this.credentialKeyType.hashCode()
        result = 31 * result + this.encryptedCredsSize.hashCode()
        result = 31 * result + this.encryptedCreds.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10RemoteSupplementalCredential> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10RemoteSupplementalCredential> {
                override val sizeBytes: Long = 37L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Msv10RemoteSupplementalCredential =
                    Msv10RemoteSupplementalCredential(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (Msv10CredentialKey.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: Msv10RemoteSupplementalCredential) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (Msv10CredentialKey.typeLayout()).writeNative(addr + 8L, value.credentialKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.credentialKeyType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.encryptedCredsSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 36L, value.encryptedCreds)
                }
            }
    }
}

public data class Msv10S4uLogon(
    public var messageType: Msv10LogonSubmitType = 0,
    public var flags: UInt = 0u,
    public var userPrincipalName: LsaUnicodeString = LsaUnicodeString(),
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
)

public data class Msv10SubauthLogon(
    public var messageType: Msv10LogonSubmitType = 0,
    public var logonDomainName: LsaUnicodeString = LsaUnicodeString(),
    public var userName: LsaUnicodeString = LsaUnicodeString(),
    public var workstation: LsaUnicodeString = LsaUnicodeString(),
    public var challengeToClient: UByteArray = UByteArray(8),
    public var authenticationInfo1: LsaString = LsaString(),
    public var authenticationInfo2: LsaString = LsaString(),
    public var parameterControl: MsvSubauthLogonParameterControl = 0u,
    public var subAuthPackageId: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10SubauthLogon) return false
        if (this.messageType != other.messageType) return false
        if (this.logonDomainName != other.logonDomainName) return false
        if (this.userName != other.userName) return false
        if (this.workstation != other.workstation) return false
        if (!this.challengeToClient.contentEquals(other.challengeToClient)) return false
        if (this.authenticationInfo1 != other.authenticationInfo1) return false
        if (this.authenticationInfo2 != other.authenticationInfo2) return false
        if (this.parameterControl != other.parameterControl) return false
        if (this.subAuthPackageId != other.subAuthPackageId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.logonDomainName.hashCode()
        result = 31 * result + this.userName.hashCode()
        result = 31 * result + this.workstation.hashCode()
        result = 31 * result + this.challengeToClient.contentHashCode()
        result = 31 * result + this.authenticationInfo1.hashCode()
        result = 31 * result + this.authenticationInfo2.hashCode()
        result = 31 * result + this.parameterControl.hashCode()
        result = 31 * result + this.subAuthPackageId.hashCode()
        return result
    }
}

public class Msv10SubauthRequest internal constructor(
    public var messageType: Msv10ProtocolMessageType,
    public var subAuthPackageId: UInt,
    public var subAuthInfoLength: UInt,
    subAuthSubmitBufferCtorArg: MutPtr<UByte>,
) {
    public var subAuthSubmitBuffer: MutPtr<UByte> = subAuthSubmitBufferCtorArg
        internal set

    public constructor() : this(
        messageType = 0,
        subAuthPackageId = 0u,
        subAuthInfoLength = 0u,
        subAuthSubmitBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Msv10ProtocolMessageType = this.messageType

    public operator fun component2(): UInt = this.subAuthPackageId

    public operator fun component3(): UInt = this.subAuthInfoLength

    public operator fun component4(): MutPtr<UByte> = this.subAuthSubmitBuffer

    public fun copy(messageType: Msv10ProtocolMessageType = this.messageType, subAuthPackageId: UInt = this.subAuthPackageId, subAuthInfoLength: UInt = this.subAuthInfoLength, subAuthSubmitBuffer: MutPtr<UByte> = this.subAuthSubmitBuffer): Msv10SubauthRequest = Msv10SubauthRequest(messageType = messageType, subAuthPackageId = subAuthPackageId, subAuthInfoLength = subAuthInfoLength, subAuthSubmitBufferCtorArg = subAuthSubmitBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10SubauthRequest) return false
        if (this.messageType != other.messageType) return false
        if (this.subAuthPackageId != other.subAuthPackageId) return false
        if (this.subAuthInfoLength != other.subAuthInfoLength) return false
        if (this.subAuthSubmitBuffer != other.subAuthSubmitBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.subAuthPackageId.hashCode()
        result = 31 * result + this.subAuthInfoLength.hashCode()
        result = 31 * result + this.subAuthSubmitBuffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10SubauthRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10SubauthRequest> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Msv10SubauthRequest =
                    Msv10SubauthRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Msv10SubauthRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.messageType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.subAuthPackageId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.subAuthInfoLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 16L, value.subAuthSubmitBuffer)
                }
            }

        public operator fun invoke(
            messageType: Msv10ProtocolMessageType = 0,
            subAuthPackageId: UInt = 0u,
            subAuthInfoLength: UInt = 0u,
            subAuthSubmitBuffer: MutPtr<UByte> = MutPtr(0L),
        ): Msv10SubauthRequest =
            Msv10SubauthRequest(
                messageType = messageType,
                subAuthPackageId = subAuthPackageId,
                subAuthInfoLength = subAuthInfoLength,
                subAuthSubmitBufferCtorArg = subAuthSubmitBuffer,
            )
    }
}

public class Msv10SubauthResponse internal constructor(
    public var messageType: Msv10ProtocolMessageType,
    public var subAuthInfoLength: UInt,
    subAuthReturnBufferCtorArg: MutPtr<UByte>,
) {
    public var subAuthReturnBuffer: MutPtr<UByte> = subAuthReturnBufferCtorArg
        internal set

    public constructor() : this(
        messageType = 0,
        subAuthInfoLength = 0u,
        subAuthReturnBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Msv10ProtocolMessageType = this.messageType

    public operator fun component2(): UInt = this.subAuthInfoLength

    public operator fun component3(): MutPtr<UByte> = this.subAuthReturnBuffer

    public fun copy(messageType: Msv10ProtocolMessageType = this.messageType, subAuthInfoLength: UInt = this.subAuthInfoLength, subAuthReturnBuffer: MutPtr<UByte> = this.subAuthReturnBuffer): Msv10SubauthResponse = Msv10SubauthResponse(messageType = messageType, subAuthInfoLength = subAuthInfoLength, subAuthReturnBufferCtorArg = subAuthReturnBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10SubauthResponse) return false
        if (this.messageType != other.messageType) return false
        if (this.subAuthInfoLength != other.subAuthInfoLength) return false
        if (this.subAuthReturnBuffer != other.subAuthReturnBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.subAuthInfoLength.hashCode()
        result = 31 * result + this.subAuthReturnBuffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10SubauthResponse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10SubauthResponse> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Msv10SubauthResponse =
                    Msv10SubauthResponse(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Msv10SubauthResponse) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.messageType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.subAuthInfoLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.subAuthReturnBuffer)
                }
            }

        public operator fun invoke(
            messageType: Msv10ProtocolMessageType = 0,
            subAuthInfoLength: UInt = 0u,
            subAuthReturnBuffer: MutPtr<UByte> = MutPtr(0L),
        ): Msv10SubauthResponse =
            Msv10SubauthResponse(
                messageType = messageType,
                subAuthInfoLength = subAuthInfoLength,
                subAuthReturnBufferCtorArg = subAuthReturnBuffer,
            )
    }
}

public data class Msv10SupplementalCredential(
    public var version: UInt = 0u,
    public var flags: MsvSupplementalCredentialFlags = 0u,
    public var lmPassword: UByteArray = UByteArray(16),
    public var ntPassword: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10SupplementalCredential) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (!this.lmPassword.contentEquals(other.lmPassword)) return false
        if (!this.ntPassword.contentEquals(other.ntPassword)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.lmPassword.contentHashCode()
        result = 31 * result + this.ntPassword.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10SupplementalCredential> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10SupplementalCredential> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Msv10SupplementalCredential =
                    Msv10SupplementalCredential(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Msv10SupplementalCredential) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 8L, value.lmPassword)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 24L, value.ntPassword)
                }
            }
    }
}

public data class Msv10SupplementalCredentialV2(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var ntPassword: UByteArray = UByteArray(16),
    public var credentialKey: Msv10CredentialKey = Msv10CredentialKey(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10SupplementalCredentialV2) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (!this.ntPassword.contentEquals(other.ntPassword)) return false
        if (this.credentialKey != other.credentialKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.ntPassword.contentHashCode()
        result = 31 * result + this.credentialKey.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10SupplementalCredentialV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10SupplementalCredentialV2> {
                override val sizeBytes: Long = 44L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Msv10SupplementalCredentialV2 =
                    Msv10SupplementalCredentialV2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 8L),
                        (Msv10CredentialKey.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Msv10SupplementalCredentialV2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 8L, value.ntPassword)
                    (Msv10CredentialKey.typeLayout()).writeNative(addr + 24L, value.credentialKey)
                }
            }
    }
}

public data class Msv10SupplementalCredentialV3(
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var credentialKeyType: Msv10CredentialKeyType = 0,
    public var ntPassword: UByteArray = UByteArray(16),
    public var credentialKey: Msv10CredentialKey = Msv10CredentialKey(),
    public var shaPassword: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msv10SupplementalCredentialV3) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        if (this.credentialKeyType != other.credentialKeyType) return false
        if (!this.ntPassword.contentEquals(other.ntPassword)) return false
        if (this.credentialKey != other.credentialKey) return false
        if (!this.shaPassword.contentEquals(other.shaPassword)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.credentialKeyType.hashCode()
        result = 31 * result + this.ntPassword.contentHashCode()
        result = 31 * result + this.credentialKey.hashCode()
        result = 31 * result + this.shaPassword.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10SupplementalCredentialV3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msv10SupplementalCredentialV3> {
                override val sizeBytes: Long = 68L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Msv10SupplementalCredentialV3 =
                    Msv10SupplementalCredentialV3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 12L),
                        (Msv10CredentialKey.typeLayout()).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Msv10SupplementalCredentialV3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.credentialKeyType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 12L, value.ntPassword)
                    (Msv10CredentialKey.typeLayout()).writeNative(addr + 28L, value.credentialKey)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 48L, value.shaPassword)
                }
            }
    }
}

public data class Msv10ValidationInfo(
    public var logoffTime: Long = 0L,
    public var kickoffTime: Long = 0L,
    public var logonServer: LsaUnicodeString = LsaUnicodeString(),
    public var logonDomainName: LsaUnicodeString = LsaUnicodeString(),
    public var sessionKey: UserSessionKey = UserSessionKey(),
    public var authoritative: Boolean = false,
    public var userFlags: UInt = 0u,
    public var whichFields: UInt = 0u,
    public var userId: UInt = 0u,
)

public data class NegotiateCallerNameRequest(
    public var messageType: UInt = 0u,
    public var logonId: Luid = Luid(),
)

public class NegotiateCallerNameResponse internal constructor(
    public var messageType: UInt,
    callerNameCtorArg: Pwstr,
) {
    public var callerName: Pwstr = callerNameCtorArg
        internal set

    public constructor() : this(
        messageType = 0u,
        callerNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.messageType

    public operator fun component2(): Pwstr = this.callerName

    public fun copy(messageType: UInt = this.messageType, callerName: Pwstr = this.callerName): NegotiateCallerNameResponse = NegotiateCallerNameResponse(messageType = messageType, callerNameCtorArg = callerName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NegotiateCallerNameResponse) return false
        if (this.messageType != other.messageType) return false
        if (this.callerName != other.callerName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.callerName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            messageType: UInt = 0u,
            callerName: Pwstr = MutPtr(0L),
        ): NegotiateCallerNameResponse =
            NegotiateCallerNameResponse(
                messageType = messageType,
                callerNameCtorArg = callerName,
            )
    }
}

public class NegotiatePackagePrefix internal constructor(
    public var packageId: Int,
    packageDataACtorArg: MutPtr<CVoid>,
    packageDataWCtorArg: MutPtr<CVoid>,
    public var prefixLen: Int,
    public var prefix: UByteArray,
) {
    public var packageDataA: MutPtr<CVoid> = packageDataACtorArg
        internal set

    public var packageDataW: MutPtr<CVoid> = packageDataWCtorArg
        internal set

    public constructor() : this(
        packageId = 0,
        packageDataACtorArg = MutPtr(0L),
        packageDataWCtorArg = MutPtr(0L),
        prefixLen = 0,
        prefix = UByteArray(32),
    )

    public operator fun component1(): Int = this.packageId

    public operator fun component2(): MutPtr<CVoid> = this.packageDataA

    public operator fun component3(): MutPtr<CVoid> = this.packageDataW

    public operator fun component4(): Int = this.prefixLen

    public operator fun component5(): UByteArray = this.prefix

    public fun copy(packageId: Int = this.packageId, packageDataA: MutPtr<CVoid> = this.packageDataA, packageDataW: MutPtr<CVoid> = this.packageDataW, prefixLen: Int = this.prefixLen, prefix: UByteArray = this.prefix): NegotiatePackagePrefix = NegotiatePackagePrefix(packageId = packageId, packageDataACtorArg = packageDataA, packageDataWCtorArg = packageDataW, prefixLen = prefixLen, prefix = prefix)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NegotiatePackagePrefix) return false
        if (this.packageId != other.packageId) return false
        if (this.packageDataA != other.packageDataA) return false
        if (this.packageDataW != other.packageDataW) return false
        if (this.prefixLen != other.prefixLen) return false
        if (!this.prefix.contentEquals(other.prefix)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.packageId.hashCode()
        result = 31 * result + this.packageDataA.hashCode()
        result = 31 * result + this.packageDataW.hashCode()
        result = 31 * result + this.prefixLen.hashCode()
        result = 31 * result + this.prefix.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NegotiatePackagePrefix> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NegotiatePackagePrefix> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): NegotiatePackagePrefix =
                    NegotiatePackagePrefix(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: NegotiatePackagePrefix) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.packageId)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.packageDataA)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.packageDataW)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.prefixLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 32L, value.prefix)
                }
            }

        public operator fun invoke(
            packageId: Int = 0,
            packageDataA: MutPtr<CVoid> = MutPtr(0L),
            packageDataW: MutPtr<CVoid> = MutPtr(0L),
            prefixLen: Int = 0,
            prefix: UByteArray = UByteArray(32),
        ): NegotiatePackagePrefix =
            NegotiatePackagePrefix(
                packageId = packageId,
                packageDataACtorArg = packageDataA,
                packageDataWCtorArg = packageDataW,
                prefixLen = prefixLen,
                prefix = prefix,
            )
    }
}

public data class NegotiatePackagePrefixes(
    public var messageType: UInt = 0u,
    public var prefixCount: UInt = 0u,
    public var offset: UInt = 0u,
    public var pad: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NegotiatePackagePrefixes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NegotiatePackagePrefixes> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): NegotiatePackagePrefixes =
                    NegotiatePackagePrefixes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NegotiatePackagePrefixes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.messageType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.prefixCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.pad)
                }
            }
    }
}

public class NetlogonGenericInfo internal constructor(
    public var identity: NetlogonLogonIdentityInfo,
    public var packageName: LsaUnicodeString,
    public var dataLength: UInt,
    logonDataCtorArg: MutPtr<UByte>,
) {
    public var logonData: MutPtr<UByte> = logonDataCtorArg
        internal set

    public constructor() : this(
        identity = NetlogonLogonIdentityInfo(),
        packageName = LsaUnicodeString(),
        dataLength = 0u,
        logonDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): NetlogonLogonIdentityInfo = this.identity

    public operator fun component2(): LsaUnicodeString = this.packageName

    public operator fun component3(): UInt = this.dataLength

    public operator fun component4(): MutPtr<UByte> = this.logonData

    public fun copy(identity: NetlogonLogonIdentityInfo = this.identity, packageName: LsaUnicodeString = this.packageName, dataLength: UInt = this.dataLength, logonData: MutPtr<UByte> = this.logonData): NetlogonGenericInfo = NetlogonGenericInfo(identity = identity, packageName = packageName, dataLength = dataLength, logonDataCtorArg = logonData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NetlogonGenericInfo) return false
        if (this.identity != other.identity) return false
        if (this.packageName != other.packageName) return false
        if (this.dataLength != other.dataLength) return false
        if (this.logonData != other.logonData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.identity.hashCode()
        result = 31 * result + this.packageName.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.logonData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            identity: NetlogonLogonIdentityInfo = NetlogonLogonIdentityInfo(),
            packageName: LsaUnicodeString = LsaUnicodeString(),
            dataLength: UInt = 0u,
            logonData: MutPtr<UByte> = MutPtr(0L),
        ): NetlogonGenericInfo =
            NetlogonGenericInfo(
                identity = identity,
                packageName = packageName,
                dataLength = dataLength,
                logonDataCtorArg = logonData,
            )
    }
}

public data class NetlogonInteractiveInfo(
    public var identity: NetlogonLogonIdentityInfo = NetlogonLogonIdentityInfo(),
    public var lmOwfPassword: LmOwfPassword = LmOwfPassword(),
    public var ntOwfPassword: LmOwfPassword = LmOwfPassword(),
)

public data class NetlogonLogonIdentityInfo(
    public var logonDomainName: LsaUnicodeString = LsaUnicodeString(),
    public var parameterControl: UInt = 0u,
    public var logonId: Long = 0L,
    public var userName: LsaUnicodeString = LsaUnicodeString(),
    public var workstation: LsaUnicodeString = LsaUnicodeString(),
)

public data class NetlogonNetworkInfo(
    public var identity: NetlogonLogonIdentityInfo = NetlogonLogonIdentityInfo(),
    public var lmChallenge: ClearBlock = ClearBlock(),
    public var ntChallengeResponse: LsaString = LsaString(),
    public var lmChallengeResponse: LsaString = LsaString(),
)

public data class NetlogonServiceInfo(
    public var identity: NetlogonLogonIdentityInfo = NetlogonLogonIdentityInfo(),
    public var lmOwfPassword: LmOwfPassword = LmOwfPassword(),
    public var ntOwfPassword: LmOwfPassword = LmOwfPassword(),
)

public class Pku2uCertificateS4uLogon internal constructor(
    public var messageType: Pku2uLogonSubmitType,
    public var flags: UInt,
    public var userPrincipalName: LsaUnicodeString,
    public var domainName: LsaUnicodeString,
    public var certificateLength: UInt,
    certificateCtorArg: MutPtr<UByte>,
) {
    public var certificate: MutPtr<UByte> = certificateCtorArg
        internal set

    public constructor() : this(
        messageType = 0,
        flags = 0u,
        userPrincipalName = LsaUnicodeString(),
        domainName = LsaUnicodeString(),
        certificateLength = 0u,
        certificateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pku2uLogonSubmitType = this.messageType

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): LsaUnicodeString = this.userPrincipalName

    public operator fun component4(): LsaUnicodeString = this.domainName

    public operator fun component5(): UInt = this.certificateLength

    public operator fun component6(): MutPtr<UByte> = this.certificate

    public fun copy(messageType: Pku2uLogonSubmitType = this.messageType, flags: UInt = this.flags, userPrincipalName: LsaUnicodeString = this.userPrincipalName, domainName: LsaUnicodeString = this.domainName, certificateLength: UInt = this.certificateLength, certificate: MutPtr<UByte> = this.certificate): Pku2uCertificateS4uLogon = Pku2uCertificateS4uLogon(messageType = messageType, flags = flags, userPrincipalName = userPrincipalName, domainName = domainName, certificateLength = certificateLength, certificateCtorArg = certificate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pku2uCertificateS4uLogon) return false
        if (this.messageType != other.messageType) return false
        if (this.flags != other.flags) return false
        if (this.userPrincipalName != other.userPrincipalName) return false
        if (this.domainName != other.domainName) return false
        if (this.certificateLength != other.certificateLength) return false
        if (this.certificate != other.certificate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.userPrincipalName.hashCode()
        result = 31 * result + this.domainName.hashCode()
        result = 31 * result + this.certificateLength.hashCode()
        result = 31 * result + this.certificate.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            messageType: Pku2uLogonSubmitType = 0,
            flags: UInt = 0u,
            userPrincipalName: LsaUnicodeString = LsaUnicodeString(),
            domainName: LsaUnicodeString = LsaUnicodeString(),
            certificateLength: UInt = 0u,
            certificate: MutPtr<UByte> = MutPtr(0L),
        ): Pku2uCertificateS4uLogon =
            Pku2uCertificateS4uLogon(
                messageType = messageType,
                flags = flags,
                userPrincipalName = userPrincipalName,
                domainName = domainName,
                certificateLength = certificateLength,
                certificateCtorArg = certificate,
            )
    }
}

public data class Pku2uCertBlob(
    public var certOffset: UInt = 0u,
    public var certLength: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pku2uCertBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pku2uCertBlob> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Pku2uCertBlob =
                    Pku2uCertBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Pku2uCertBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.certOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.certLength)
                }
            }
    }
}

public data class Pku2uCreduiContext(
    public var version: ULong = 0uL,
    public var cbHeaderLength: UShort = 0u,
    public var cbStructureLength: UInt = 0u,
    public var certArrayCount: UShort = 0u,
    public var certArrayOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pku2uCreduiContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pku2uCreduiContext> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Pku2uCreduiContext =
                    Pku2uCreduiContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Pku2uCreduiContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.cbHeaderLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbStructureLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.certArrayCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.certArrayOffset)
                }
            }
    }
}

public class PolicyAccountDomainInfo internal constructor(
    public var domainName: LsaUnicodeString,
    domainSidCtorArg: Psid,
) {
    public var domainSid: Psid = domainSidCtorArg
        internal set

    public constructor() : this(
        domainName = LsaUnicodeString(),
        domainSidCtorArg = MutPtr(0L),
    )

    public operator fun component1(): LsaUnicodeString = this.domainName

    public operator fun component2(): Psid = this.domainSid

    public fun copy(domainName: LsaUnicodeString = this.domainName, domainSid: Psid = this.domainSid): PolicyAccountDomainInfo = PolicyAccountDomainInfo(domainName = domainName, domainSidCtorArg = domainSid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PolicyAccountDomainInfo) return false
        if (this.domainName != other.domainName) return false
        if (this.domainSid != other.domainSid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.domainName.hashCode()
        result = 31 * result + this.domainSid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            domainName: LsaUnicodeString = LsaUnicodeString(),
            domainSid: Psid = MutPtr(0L),
        ): PolicyAccountDomainInfo =
            PolicyAccountDomainInfo(
                domainName = domainName,
                domainSidCtorArg = domainSid,
            )
    }
}

public class PolicyAuditCategoriesInfo internal constructor(
    public var maximumCategoryCount: UInt,
    subCategoriesInfoCtorArg: MutPtr<PolicyAuditSubcategoriesInfo>,
) {
    public var subCategoriesInfo: MutPtr<PolicyAuditSubcategoriesInfo> = subCategoriesInfoCtorArg
        internal set

    public constructor() : this(
        maximumCategoryCount = 0u,
        subCategoriesInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.maximumCategoryCount

    public operator fun component2(): MutPtr<PolicyAuditSubcategoriesInfo> = this.subCategoriesInfo

    public fun copy(maximumCategoryCount: UInt = this.maximumCategoryCount, subCategoriesInfo: MutPtr<PolicyAuditSubcategoriesInfo> = this.subCategoriesInfo): PolicyAuditCategoriesInfo = PolicyAuditCategoriesInfo(maximumCategoryCount = maximumCategoryCount, subCategoriesInfoCtorArg = subCategoriesInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PolicyAuditCategoriesInfo) return false
        if (this.maximumCategoryCount != other.maximumCategoryCount) return false
        if (this.subCategoriesInfo != other.subCategoriesInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maximumCategoryCount.hashCode()
        result = 31 * result + this.subCategoriesInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyAuditCategoriesInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyAuditCategoriesInfo> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PolicyAuditCategoriesInfo =
                    PolicyAuditCategoriesInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PolicyAuditSubcategoriesInfo>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PolicyAuditCategoriesInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.maximumCategoryCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PolicyAuditSubcategoriesInfo>(64)
                    ).writeNative(addr + 8L, value.subCategoriesInfo)
                }
            }

        public operator fun invoke(
            maximumCategoryCount: UInt = 0u,
            subCategoriesInfo: MutPtr<PolicyAuditSubcategoriesInfo> = MutPtr(0L),
        ): PolicyAuditCategoriesInfo =
            PolicyAuditCategoriesInfo(
                maximumCategoryCount = maximumCategoryCount,
                subCategoriesInfoCtorArg = subCategoriesInfo,
            )
    }
}

public class PolicyAuditEventsInfo internal constructor(
    public var auditingMode: Boolean,
    eventAuditingOptionsCtorArg: MutPtr<UInt>,
    public var maximumAuditEventCount: UInt,
) {
    public var eventAuditingOptions: MutPtr<UInt> = eventAuditingOptionsCtorArg
        internal set

    public constructor() : this(
        auditingMode = false,
        eventAuditingOptionsCtorArg = MutPtr(0L),
        maximumAuditEventCount = 0u,
    )

    public operator fun component1(): Boolean = this.auditingMode

    public operator fun component2(): MutPtr<UInt> = this.eventAuditingOptions

    public operator fun component3(): UInt = this.maximumAuditEventCount

    public fun copy(auditingMode: Boolean = this.auditingMode, eventAuditingOptions: MutPtr<UInt> = this.eventAuditingOptions, maximumAuditEventCount: UInt = this.maximumAuditEventCount): PolicyAuditEventsInfo = PolicyAuditEventsInfo(auditingMode = auditingMode, eventAuditingOptionsCtorArg = eventAuditingOptions, maximumAuditEventCount = maximumAuditEventCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PolicyAuditEventsInfo) return false
        if (this.auditingMode != other.auditingMode) return false
        if (this.eventAuditingOptions != other.eventAuditingOptions) return false
        if (this.maximumAuditEventCount != other.maximumAuditEventCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.auditingMode.hashCode()
        result = 31 * result + this.eventAuditingOptions.hashCode()
        result = 31 * result + this.maximumAuditEventCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyAuditEventsInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyAuditEventsInfo> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PolicyAuditEventsInfo =
                    PolicyAuditEventsInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: PolicyAuditEventsInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.auditingMode)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 8L, value.eventAuditingOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.maximumAuditEventCount)
                }
            }

        public operator fun invoke(
            auditingMode: Boolean = false,
            eventAuditingOptions: MutPtr<UInt> = MutPtr(0L),
            maximumAuditEventCount: UInt = 0u,
        ): PolicyAuditEventsInfo =
            PolicyAuditEventsInfo(
                auditingMode = auditingMode,
                eventAuditingOptionsCtorArg = eventAuditingOptions,
                maximumAuditEventCount = maximumAuditEventCount,
            )
    }
}

public data class PolicyAuditFullQueryInfo(
    public var shutDownOnFull: Boolean = false,
    public var logIsFull: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyAuditFullQueryInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyAuditFullQueryInfo> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): PolicyAuditFullQueryInfo =
                    PolicyAuditFullQueryInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: PolicyAuditFullQueryInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.shutDownOnFull)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.logIsFull)
                }
            }
    }
}

public data class PolicyAuditFullSetInfo(
    public var shutDownOnFull: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyAuditFullSetInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyAuditFullSetInfo> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): PolicyAuditFullSetInfo =
                    PolicyAuditFullSetInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PolicyAuditFullSetInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.shutDownOnFull)
                }
            }
    }
}

public data class PolicyAuditLogInfo(
    public var auditLogPercentFull: UInt = 0u,
    public var maximumLogSize: UInt = 0u,
    public var auditRetentionPeriod: Long = 0L,
    public var auditLogFullShutdownInProgress: Boolean = false,
    public var timeToShutdown: Long = 0L,
    public var nextAuditRecordId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyAuditLogInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyAuditLogInfo> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PolicyAuditLogInfo =
                    PolicyAuditLogInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: PolicyAuditLogInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.auditLogPercentFull)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maximumLogSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.auditRetentionPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 16L, value.auditLogFullShutdownInProgress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.timeToShutdown)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.nextAuditRecordId)
                }
            }
    }
}

public class PolicyAuditSidArray internal constructor(
    public var usersCount: UInt,
    userSidArrayCtorArg: MutPtr<Psid>,
) {
    public var userSidArray: MutPtr<Psid> = userSidArrayCtorArg
        internal set

    public constructor() : this(
        usersCount = 0u,
        userSidArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.usersCount

    public operator fun component2(): MutPtr<Psid> = this.userSidArray

    public fun copy(usersCount: UInt = this.usersCount, userSidArray: MutPtr<Psid> = this.userSidArray): PolicyAuditSidArray = PolicyAuditSidArray(usersCount = usersCount, userSidArrayCtorArg = userSidArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PolicyAuditSidArray) return false
        if (this.usersCount != other.usersCount) return false
        if (this.userSidArray != other.userSidArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usersCount.hashCode()
        result = 31 * result + this.userSidArray.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyAuditSidArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyAuditSidArray> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PolicyAuditSidArray =
                    PolicyAuditSidArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Psid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PolicyAuditSidArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.usersCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Psid>(64)
                    ).writeNative(addr + 8L, value.userSidArray)
                }
            }

        public operator fun invoke(
            usersCount: UInt = 0u,
            userSidArray: MutPtr<Psid> = MutPtr(0L),
        ): PolicyAuditSidArray =
            PolicyAuditSidArray(
                usersCount = usersCount,
                userSidArrayCtorArg = userSidArray,
            )
    }
}

public class PolicyAuditSubcategoriesInfo internal constructor(
    public var maximumSubCategoryCount: UInt,
    eventAuditingOptionsCtorArg: MutPtr<UInt>,
) {
    public var eventAuditingOptions: MutPtr<UInt> = eventAuditingOptionsCtorArg
        internal set

    public constructor() : this(
        maximumSubCategoryCount = 0u,
        eventAuditingOptionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.maximumSubCategoryCount

    public operator fun component2(): MutPtr<UInt> = this.eventAuditingOptions

    public fun copy(maximumSubCategoryCount: UInt = this.maximumSubCategoryCount, eventAuditingOptions: MutPtr<UInt> = this.eventAuditingOptions): PolicyAuditSubcategoriesInfo = PolicyAuditSubcategoriesInfo(maximumSubCategoryCount = maximumSubCategoryCount, eventAuditingOptionsCtorArg = eventAuditingOptions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PolicyAuditSubcategoriesInfo) return false
        if (this.maximumSubCategoryCount != other.maximumSubCategoryCount) return false
        if (this.eventAuditingOptions != other.eventAuditingOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maximumSubCategoryCount.hashCode()
        result = 31 * result + this.eventAuditingOptions.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyAuditSubcategoriesInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyAuditSubcategoriesInfo> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PolicyAuditSubcategoriesInfo =
                    PolicyAuditSubcategoriesInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PolicyAuditSubcategoriesInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.maximumSubCategoryCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 8L, value.eventAuditingOptions)
                }
            }

        public operator fun invoke(
            maximumSubCategoryCount: UInt = 0u,
            eventAuditingOptions: MutPtr<UInt> = MutPtr(0L),
        ): PolicyAuditSubcategoriesInfo =
            PolicyAuditSubcategoriesInfo(
                maximumSubCategoryCount = maximumSubCategoryCount,
                eventAuditingOptionsCtorArg = eventAuditingOptions,
            )
    }
}

public data class PolicyDefaultQuotaInfo(
    public var quotaLimits: QuotaLimits = QuotaLimits(),
)

public class PolicyDnsDomainInfo internal constructor(
    public var name: LsaUnicodeString,
    public var dnsDomainName: LsaUnicodeString,
    public var dnsForestName: LsaUnicodeString,
    public var domainGuid: Guid,
    sidCtorArg: Psid,
) {
    public var sid: Psid = sidCtorArg
        internal set

    public constructor() : this(
        name = LsaUnicodeString(),
        dnsDomainName = LsaUnicodeString(),
        dnsForestName = LsaUnicodeString(),
        domainGuid = Guid(),
        sidCtorArg = MutPtr(0L),
    )

    public operator fun component1(): LsaUnicodeString = this.name

    public operator fun component2(): LsaUnicodeString = this.dnsDomainName

    public operator fun component3(): LsaUnicodeString = this.dnsForestName

    public operator fun component4(): Guid = this.domainGuid

    public operator fun component5(): Psid = this.sid

    public fun copy(name: LsaUnicodeString = this.name, dnsDomainName: LsaUnicodeString = this.dnsDomainName, dnsForestName: LsaUnicodeString = this.dnsForestName, domainGuid: Guid = this.domainGuid, sid: Psid = this.sid): PolicyDnsDomainInfo = PolicyDnsDomainInfo(name = name, dnsDomainName = dnsDomainName, dnsForestName = dnsForestName, domainGuid = domainGuid, sidCtorArg = sid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PolicyDnsDomainInfo) return false
        if (this.name != other.name) return false
        if (this.dnsDomainName != other.dnsDomainName) return false
        if (this.dnsForestName != other.dnsForestName) return false
        if (this.domainGuid != other.domainGuid) return false
        if (this.sid != other.sid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.dnsDomainName.hashCode()
        result = 31 * result + this.dnsForestName.hashCode()
        result = 31 * result + this.domainGuid.hashCode()
        result = 31 * result + this.sid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            name: LsaUnicodeString = LsaUnicodeString(),
            dnsDomainName: LsaUnicodeString = LsaUnicodeString(),
            dnsForestName: LsaUnicodeString = LsaUnicodeString(),
            domainGuid: Guid = Guid(),
            sid: Psid = MutPtr(0L),
        ): PolicyDnsDomainInfo =
            PolicyDnsDomainInfo(
                name = name,
                dnsDomainName = dnsDomainName,
                dnsForestName = dnsForestName,
                domainGuid = domainGuid,
                sidCtorArg = sid,
            )
    }
}

public class PolicyDomainEfsInfo internal constructor(
    public var infoLength: UInt,
    efsBlobCtorArg: MutPtr<UByte>,
) {
    public var efsBlob: MutPtr<UByte> = efsBlobCtorArg
        internal set

    public constructor() : this(
        infoLength = 0u,
        efsBlobCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.infoLength

    public operator fun component2(): MutPtr<UByte> = this.efsBlob

    public fun copy(infoLength: UInt = this.infoLength, efsBlob: MutPtr<UByte> = this.efsBlob): PolicyDomainEfsInfo = PolicyDomainEfsInfo(infoLength = infoLength, efsBlobCtorArg = efsBlob)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PolicyDomainEfsInfo) return false
        if (this.infoLength != other.infoLength) return false
        if (this.efsBlob != other.efsBlob) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.infoLength.hashCode()
        result = 31 * result + this.efsBlob.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyDomainEfsInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyDomainEfsInfo> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PolicyDomainEfsInfo =
                    PolicyDomainEfsInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PolicyDomainEfsInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.infoLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.efsBlob)
                }
            }

        public operator fun invoke(
            infoLength: UInt = 0u,
            efsBlob: MutPtr<UByte> = MutPtr(0L),
        ): PolicyDomainEfsInfo =
            PolicyDomainEfsInfo(
                infoLength = infoLength,
                efsBlobCtorArg = efsBlob,
            )
    }
}

public data class PolicyDomainKerberosTicketInfo(
    public var authenticationOptions: UInt = 0u,
    public var maxServiceTicketAge: Long = 0L,
    public var maxTicketAge: Long = 0L,
    public var maxRenewAge: Long = 0L,
    public var maxClockSkew: Long = 0L,
    public var reserved: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyDomainKerberosTicketInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyDomainKerberosTicketInfo> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PolicyDomainKerberosTicketInfo =
                    PolicyDomainKerberosTicketInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: PolicyDomainKerberosTicketInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.authenticationOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.maxServiceTicketAge)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.maxTicketAge)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.maxRenewAge)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.maxClockSkew)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.reserved)
                }
            }
    }
}

public data class PolicyLsaServerRoleInfo(
    public var lsaServerRole: PolicyLsaServerRole = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyLsaServerRoleInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyLsaServerRoleInfo> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): PolicyLsaServerRoleInfo =
                    PolicyLsaServerRoleInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PolicyLsaServerRoleInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lsaServerRole)
                }
            }
    }
}

public class PolicyMachineAcctInfo internal constructor(
    public var rid: UInt,
    sidCtorArg: Psid,
) {
    public var sid: Psid = sidCtorArg
        internal set

    public constructor() : this(
        rid = 0u,
        sidCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.rid

    public operator fun component2(): Psid = this.sid

    public fun copy(rid: UInt = this.rid, sid: Psid = this.sid): PolicyMachineAcctInfo = PolicyMachineAcctInfo(rid = rid, sidCtorArg = sid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PolicyMachineAcctInfo) return false
        if (this.rid != other.rid) return false
        if (this.sid != other.sid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rid.hashCode()
        result = 31 * result + this.sid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            rid: UInt = 0u,
            sid: Psid = MutPtr(0L),
        ): PolicyMachineAcctInfo =
            PolicyMachineAcctInfo(
                rid = rid,
                sidCtorArg = sid,
            )
    }
}

public class PolicyMachineAcctInfo2 internal constructor(
    public var rid: UInt,
    sidCtorArg: Psid,
    public var objectGuid: Guid,
) {
    public var sid: Psid = sidCtorArg
        internal set

    public constructor() : this(
        rid = 0u,
        sidCtorArg = MutPtr(0L),
        objectGuid = Guid(),
    )

    public operator fun component1(): UInt = this.rid

    public operator fun component2(): Psid = this.sid

    public operator fun component3(): Guid = this.objectGuid

    public fun copy(rid: UInt = this.rid, sid: Psid = this.sid, objectGuid: Guid = this.objectGuid): PolicyMachineAcctInfo2 = PolicyMachineAcctInfo2(rid = rid, sidCtorArg = sid, objectGuid = objectGuid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PolicyMachineAcctInfo2) return false
        if (this.rid != other.rid) return false
        if (this.sid != other.sid) return false
        if (this.objectGuid != other.objectGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rid.hashCode()
        result = 31 * result + this.sid.hashCode()
        result = 31 * result + this.objectGuid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            rid: UInt = 0u,
            sid: Psid = MutPtr(0L),
            objectGuid: Guid = Guid(),
        ): PolicyMachineAcctInfo2 =
            PolicyMachineAcctInfo2(
                rid = rid,
                sidCtorArg = sid,
                objectGuid = objectGuid,
            )
    }
}

public data class PolicyModificationInfo(
    public var modifiedId: Long = 0L,
    public var databaseCreationTime: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyModificationInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PolicyModificationInfo> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PolicyModificationInfo =
                    PolicyModificationInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PolicyModificationInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.modifiedId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.databaseCreationTime)
                }
            }
    }
}

public data class PolicyPdAccountInfo(
    public var name: LsaUnicodeString = LsaUnicodeString(),
)

public class PolicyPrimaryDomainInfo internal constructor(
    public var name: LsaUnicodeString,
    sidCtorArg: Psid,
) {
    public var sid: Psid = sidCtorArg
        internal set

    public constructor() : this(
        name = LsaUnicodeString(),
        sidCtorArg = MutPtr(0L),
    )

    public operator fun component1(): LsaUnicodeString = this.name

    public operator fun component2(): Psid = this.sid

    public fun copy(name: LsaUnicodeString = this.name, sid: Psid = this.sid): PolicyPrimaryDomainInfo = PolicyPrimaryDomainInfo(name = name, sidCtorArg = sid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PolicyPrimaryDomainInfo) return false
        if (this.name != other.name) return false
        if (this.sid != other.sid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.sid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            name: LsaUnicodeString = LsaUnicodeString(),
            sid: Psid = MutPtr(0L),
        ): PolicyPrimaryDomainInfo =
            PolicyPrimaryDomainInfo(
                name = name,
                sidCtorArg = sid,
            )
    }
}

public data class PolicyReplicaSourceInfo(
    public var replicaSource: LsaUnicodeString = LsaUnicodeString(),
    public var replicaAccountName: LsaUnicodeString = LsaUnicodeString(),
)

public data class PctPublicKey(
    public var type: UInt = 0u,
    public var cbKey: UInt = 0u,
    public var pKey: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PctPublicKey) return false
        if (this.type != other.type) return false
        if (this.cbKey != other.cbKey) return false
        if (!this.pKey.contentEquals(other.pKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.cbKey.hashCode()
        result = 31 * result + this.pKey.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PctPublicKey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PctPublicKey> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): PctPublicKey =
                    PctPublicKey(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PctPublicKey) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbKey)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.pKey)
                }
            }
    }
}

public class SamRegisterMappingElement internal constructor(
    originalCtorArg: Pstr,
    mappedCtorArg: Pstr,
    public var continuable: Boolean,
) {
    public var original: Pstr = originalCtorArg
        internal set

    public var mapped: Pstr = mappedCtorArg
        internal set

    public constructor() : this(
        originalCtorArg = MutPtr(0L),
        mappedCtorArg = MutPtr(0L),
        continuable = false,
    )

    public operator fun component1(): Pstr = this.original

    public operator fun component2(): Pstr = this.mapped

    public operator fun component3(): Boolean = this.continuable

    public fun copy(original: Pstr = this.original, mapped: Pstr = this.mapped, continuable: Boolean = this.continuable): SamRegisterMappingElement = SamRegisterMappingElement(originalCtorArg = original, mappedCtorArg = mapped, continuable = continuable)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SamRegisterMappingElement) return false
        if (this.original != other.original) return false
        if (this.mapped != other.mapped) return false
        if (this.continuable != other.continuable) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.original.hashCode()
        result = 31 * result + this.mapped.hashCode()
        result = 31 * result + this.continuable.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            original: Pstr = MutPtr(0L),
            mapped: Pstr = MutPtr(0L),
            continuable: Boolean = false,
        ): SamRegisterMappingElement =
            SamRegisterMappingElement(
                originalCtorArg = original,
                mappedCtorArg = mapped,
                continuable = continuable,
            )
    }
}

public class SamRegisterMappingList internal constructor(
    public var count: UInt,
    elementsCtorArg: MutPtr<SamRegisterMappingElement>,
) {
    public var elements: MutPtr<SamRegisterMappingElement> = elementsCtorArg
        internal set

    public constructor() : this(
        count = 0u,
        elementsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.count

    public operator fun component2(): MutPtr<SamRegisterMappingElement> = this.elements

    public fun copy(count: UInt = this.count, elements: MutPtr<SamRegisterMappingElement> = this.elements): SamRegisterMappingList = SamRegisterMappingList(count = count, elementsCtorArg = elements)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SamRegisterMappingList) return false
        if (this.count != other.count) return false
        if (this.elements != other.elements) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.elements.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SamRegisterMappingList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SamRegisterMappingList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SamRegisterMappingList =
                    SamRegisterMappingList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SamRegisterMappingElement>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SamRegisterMappingList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SamRegisterMappingElement>(64)
                    ).writeNative(addr + 8L, value.elements)
                }
            }

        public operator fun invoke(
            count: UInt = 0u,
            elements: MutPtr<SamRegisterMappingElement> = MutPtr(0L),
        ): SamRegisterMappingList =
            SamRegisterMappingList(
                count = count,
                elementsCtorArg = elements,
            )
    }
}

public class SamRegisterMappingTable internal constructor(
    public var count: UInt,
    listsCtorArg: MutPtr<SamRegisterMappingList>,
) {
    public var lists: MutPtr<SamRegisterMappingList> = listsCtorArg
        internal set

    public constructor() : this(
        count = 0u,
        listsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.count

    public operator fun component2(): MutPtr<SamRegisterMappingList> = this.lists

    public fun copy(count: UInt = this.count, lists: MutPtr<SamRegisterMappingList> = this.lists): SamRegisterMappingTable = SamRegisterMappingTable(count = count, listsCtorArg = lists)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SamRegisterMappingTable) return false
        if (this.count != other.count) return false
        if (this.lists != other.lists) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.lists.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SamRegisterMappingTable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SamRegisterMappingTable> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SamRegisterMappingTable =
                    SamRegisterMappingTable(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SamRegisterMappingList>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SamRegisterMappingTable) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SamRegisterMappingList>(64)
                    ).writeNative(addr + 8L, value.lists)
                }
            }

        public operator fun invoke(
            count: UInt = 0u,
            lists: MutPtr<SamRegisterMappingList> = MutPtr(0L),
        ): SamRegisterMappingTable =
            SamRegisterMappingTable(
                count = count,
                listsCtorArg = lists,
            )
    }
}

public data class SchannelAlertToken(
    public var dwTokenType: UInt = 0u,
    public var dwAlertType: SchannelAlertTokenAlertType = 0u,
    public var dwAlertNumber: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchannelAlertToken> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchannelAlertToken> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SchannelAlertToken =
                    SchannelAlertToken(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SchannelAlertToken) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTokenType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwAlertType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwAlertNumber)
                }
            }
    }
}

public data class SchannelCertHash(
    public var dwLength: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hProv: Int = 0,
    public var shaHash: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SchannelCertHash) return false
        if (this.dwLength != other.dwLength) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hProv != other.hProv) return false
        if (!this.shaHash.contentEquals(other.shaHash)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLength.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hProv.hashCode()
        result = 31 * result + this.shaHash.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchannelCertHash> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchannelCertHash> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SchannelCertHash =
                    SchannelCertHash(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SchannelCertHash) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.hProv)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 16L, value.shaHash)
                }
            }
    }
}

public data class SchannelCertHashStore(
    public var dwLength: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hProv: Int = 0,
    public var shaHash: UByteArray = UByteArray(20),
    public var pwszStoreName: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SchannelCertHashStore) return false
        if (this.dwLength != other.dwLength) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hProv != other.hProv) return false
        if (!this.shaHash.contentEquals(other.shaHash)) return false
        if (!this.pwszStoreName.contentEquals(other.pwszStoreName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwLength.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hProv.hashCode()
        result = 31 * result + this.shaHash.contentHashCode()
        result = 31 * result + this.pwszStoreName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchannelCertHashStore> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchannelCertHashStore> {
                override val sizeBytes: Long = 296L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SchannelCertHashStore =
                    SchannelCertHashStore(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: SchannelCertHashStore) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.hProv)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 16L, value.shaHash)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 36L, value.pwszStoreName)
                }
            }
    }
}

public data class SchannelClientSignature(
    public var cbLength: UInt = 0u,
    public var aiHash: AlgId = 0u,
    public var cbHash: UInt = 0u,
    public var hashValue: UByteArray = UByteArray(36),
    public var certThumbprint: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SchannelClientSignature) return false
        if (this.cbLength != other.cbLength) return false
        if (this.aiHash != other.aiHash) return false
        if (this.cbHash != other.cbHash) return false
        if (!this.hashValue.contentEquals(other.hashValue)) return false
        if (!this.certThumbprint.contentEquals(other.certThumbprint)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbLength.hashCode()
        result = 31 * result + this.aiHash.hashCode()
        result = 31 * result + this.cbHash.hashCode()
        result = 31 * result + this.hashValue.contentHashCode()
        result = 31 * result + this.certThumbprint.contentHashCode()
        return result
    }
}

public class SchannelCred internal constructor(
    public var dwVersion: UInt,
    public var cCreds: UInt,
    paCredCtorArg: MutPtr<MutPtr<CertContext>>,
    hRootStoreCtorArg: Hcertstore,
    public var cMappers: UInt,
    aphMappersCtorArg: MutPtr<MutPtr<Hmapper>>,
    public var cSupportedAlgs: UInt,
    palgSupportedAlgsCtorArg: MutPtr<AlgId>,
    public var grbitEnabledProtocols: UInt,
    public var dwMinimumCipherStrength: UInt,
    public var dwMaximumCipherStrength: UInt,
    public var dwSessionLifespan: UInt,
    public var dwFlags: SchannelCredFlags,
    public var dwCredFormat: UInt,
) {
    public var paCred: MutPtr<MutPtr<CertContext>> = paCredCtorArg
        internal set

    public var hRootStore: Hcertstore = hRootStoreCtorArg
        internal set

    public var aphMappers: MutPtr<MutPtr<Hmapper>> = aphMappersCtorArg
        internal set

    public var palgSupportedAlgs: MutPtr<AlgId> = palgSupportedAlgsCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        cCreds = 0u,
        paCredCtorArg = MutPtr(0L),
        hRootStoreCtorArg = MutPtr(0L),
        cMappers = 0u,
        aphMappersCtorArg = MutPtr(0L),
        cSupportedAlgs = 0u,
        palgSupportedAlgsCtorArg = MutPtr(0L),
        grbitEnabledProtocols = 0u,
        dwMinimumCipherStrength = 0u,
        dwMaximumCipherStrength = 0u,
        dwSessionLifespan = 0u,
        dwFlags = 0u,
        dwCredFormat = 0u,
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.cCreds

    public operator fun component3(): MutPtr<MutPtr<CertContext>> = this.paCred

    public operator fun component4(): Hcertstore = this.hRootStore

    public operator fun component5(): UInt = this.cMappers

    public operator fun component6(): MutPtr<MutPtr<Hmapper>> = this.aphMappers

    public operator fun component7(): UInt = this.cSupportedAlgs

    public operator fun component8(): MutPtr<AlgId> = this.palgSupportedAlgs

    public operator fun component9(): UInt = this.grbitEnabledProtocols

    public operator fun component10(): UInt = this.dwMinimumCipherStrength

    public operator fun component11(): UInt = this.dwMaximumCipherStrength

    public operator fun component12(): UInt = this.dwSessionLifespan

    public operator fun component13(): SchannelCredFlags = this.dwFlags

    public operator fun component14(): UInt = this.dwCredFormat

    public fun copy(dwVersion: UInt = this.dwVersion, cCreds: UInt = this.cCreds, paCred: MutPtr<MutPtr<CertContext>> = this.paCred, hRootStore: Hcertstore = this.hRootStore, cMappers: UInt = this.cMappers, aphMappers: MutPtr<MutPtr<Hmapper>> = this.aphMappers, cSupportedAlgs: UInt = this.cSupportedAlgs, palgSupportedAlgs: MutPtr<AlgId> = this.palgSupportedAlgs, grbitEnabledProtocols: UInt = this.grbitEnabledProtocols, dwMinimumCipherStrength: UInt = this.dwMinimumCipherStrength, dwMaximumCipherStrength: UInt = this.dwMaximumCipherStrength, dwSessionLifespan: UInt = this.dwSessionLifespan, dwFlags: SchannelCredFlags = this.dwFlags, dwCredFormat: UInt = this.dwCredFormat): SchannelCred = SchannelCred(dwVersion = dwVersion, cCreds = cCreds, paCredCtorArg = paCred, hRootStoreCtorArg = hRootStore, cMappers = cMappers, aphMappersCtorArg = aphMappers, cSupportedAlgs = cSupportedAlgs, palgSupportedAlgsCtorArg = palgSupportedAlgs, grbitEnabledProtocols = grbitEnabledProtocols, dwMinimumCipherStrength = dwMinimumCipherStrength, dwMaximumCipherStrength = dwMaximumCipherStrength, dwSessionLifespan = dwSessionLifespan, dwFlags = dwFlags, dwCredFormat = dwCredFormat)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SchannelCred) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.cCreds != other.cCreds) return false
        if (this.paCred != other.paCred) return false
        if (this.hRootStore != other.hRootStore) return false
        if (this.cMappers != other.cMappers) return false
        if (this.aphMappers != other.aphMappers) return false
        if (this.cSupportedAlgs != other.cSupportedAlgs) return false
        if (this.palgSupportedAlgs != other.palgSupportedAlgs) return false
        if (this.grbitEnabledProtocols != other.grbitEnabledProtocols) return false
        if (this.dwMinimumCipherStrength != other.dwMinimumCipherStrength) return false
        if (this.dwMaximumCipherStrength != other.dwMaximumCipherStrength) return false
        if (this.dwSessionLifespan != other.dwSessionLifespan) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwCredFormat != other.dwCredFormat) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.cCreds.hashCode()
        result = 31 * result + this.paCred.hashCode()
        result = 31 * result + this.hRootStore.hashCode()
        result = 31 * result + this.cMappers.hashCode()
        result = 31 * result + this.aphMappers.hashCode()
        result = 31 * result + this.cSupportedAlgs.hashCode()
        result = 31 * result + this.palgSupportedAlgs.hashCode()
        result = 31 * result + this.grbitEnabledProtocols.hashCode()
        result = 31 * result + this.dwMinimumCipherStrength.hashCode()
        result = 31 * result + this.dwMaximumCipherStrength.hashCode()
        result = 31 * result + this.dwSessionLifespan.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwCredFormat.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            cCreds: UInt = 0u,
            paCred: MutPtr<MutPtr<CertContext>> = MutPtr(0L),
            hRootStore: Hcertstore = MutPtr(0L),
            cMappers: UInt = 0u,
            aphMappers: MutPtr<MutPtr<Hmapper>> = MutPtr(0L),
            cSupportedAlgs: UInt = 0u,
            palgSupportedAlgs: MutPtr<AlgId> = MutPtr(0L),
            grbitEnabledProtocols: UInt = 0u,
            dwMinimumCipherStrength: UInt = 0u,
            dwMaximumCipherStrength: UInt = 0u,
            dwSessionLifespan: UInt = 0u,
            dwFlags: SchannelCredFlags = 0u,
            dwCredFormat: UInt = 0u,
        ): SchannelCred =
            SchannelCred(
                dwVersion = dwVersion,
                cCreds = cCreds,
                paCredCtorArg = paCred,
                hRootStoreCtorArg = hRootStore,
                cMappers = cMappers,
                aphMappersCtorArg = aphMappers,
                cSupportedAlgs = cSupportedAlgs,
                palgSupportedAlgsCtorArg = palgSupportedAlgs,
                grbitEnabledProtocols = grbitEnabledProtocols,
                dwMinimumCipherStrength = dwMinimumCipherStrength,
                dwMaximumCipherStrength = dwMaximumCipherStrength,
                dwSessionLifespan = dwSessionLifespan,
                dwFlags = dwFlags,
                dwCredFormat = dwCredFormat,
            )
    }
}

public data class SchannelSessionToken(
    public var dwTokenType: UInt = 0u,
    public var dwFlags: SchannelSessionTokenFlags = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchannelSessionToken> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchannelSessionToken> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SchannelSessionToken =
                    SchannelSessionToken(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SchannelSessionToken) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwTokenType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                }
            }
    }
}

public class SchCred internal constructor(
    public var dwVersion: UInt,
    public var cCreds: UInt,
    paSecretCtorArg: MutPtr<MutPtr<CVoid>>,
    paPublicCtorArg: MutPtr<MutPtr<CVoid>>,
    public var cMappers: UInt,
    aphMappersCtorArg: MutPtr<MutPtr<Hmapper>>,
) {
    public var paSecret: MutPtr<MutPtr<CVoid>> = paSecretCtorArg
        internal set

    public var paPublic: MutPtr<MutPtr<CVoid>> = paPublicCtorArg
        internal set

    public var aphMappers: MutPtr<MutPtr<Hmapper>> = aphMappersCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        cCreds = 0u,
        paSecretCtorArg = MutPtr(0L),
        paPublicCtorArg = MutPtr(0L),
        cMappers = 0u,
        aphMappersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.cCreds

    public operator fun component3(): MutPtr<MutPtr<CVoid>> = this.paSecret

    public operator fun component4(): MutPtr<MutPtr<CVoid>> = this.paPublic

    public operator fun component5(): UInt = this.cMappers

    public operator fun component6(): MutPtr<MutPtr<Hmapper>> = this.aphMappers

    public fun copy(dwVersion: UInt = this.dwVersion, cCreds: UInt = this.cCreds, paSecret: MutPtr<MutPtr<CVoid>> = this.paSecret, paPublic: MutPtr<MutPtr<CVoid>> = this.paPublic, cMappers: UInt = this.cMappers, aphMappers: MutPtr<MutPtr<Hmapper>> = this.aphMappers): SchCred = SchCred(dwVersion = dwVersion, cCreds = cCreds, paSecretCtorArg = paSecret, paPublicCtorArg = paPublic, cMappers = cMappers, aphMappersCtorArg = aphMappers)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SchCred) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.cCreds != other.cCreds) return false
        if (this.paSecret != other.paSecret) return false
        if (this.paPublic != other.paPublic) return false
        if (this.cMappers != other.cMappers) return false
        if (this.aphMappers != other.aphMappers) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.cCreds.hashCode()
        result = 31 * result + this.paSecret.hashCode()
        result = 31 * result + this.paPublic.hashCode()
        result = 31 * result + this.cMappers.hashCode()
        result = 31 * result + this.aphMappers.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchCred> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchCred> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SchCred =
                    SchCred(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<CVoid>>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<CVoid>>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<Hmapper>>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: SchCred) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cCreds)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<CVoid>>(64)
                    ).writeNative(addr + 8L, value.paSecret)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<CVoid>>(64)
                    ).writeNative(addr + 16L, value.paPublic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cMappers)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<Hmapper>>(64)
                    ).writeNative(addr + 32L, value.aphMappers)
                }
            }

        public operator fun invoke(
            dwVersion: UInt = 0u,
            cCreds: UInt = 0u,
            paSecret: MutPtr<MutPtr<CVoid>> = MutPtr(0L),
            paPublic: MutPtr<MutPtr<CVoid>> = MutPtr(0L),
            cMappers: UInt = 0u,
            aphMappers: MutPtr<MutPtr<Hmapper>> = MutPtr(0L),
        ): SchCred =
            SchCred(
                dwVersion = dwVersion,
                cCreds = cCreds,
                paSecretCtorArg = paSecret,
                paPublicCtorArg = paPublic,
                cMappers = cMappers,
                aphMappersCtorArg = aphMappers,
            )
    }
}

public class SchCredentials internal constructor(
    public var dwVersion: UInt,
    public var dwCredFormat: UInt,
    public var cCreds: UInt,
    paCredCtorArg: MutPtr<MutPtr<CertContext>>,
    hRootStoreCtorArg: Hcertstore,
    public var cMappers: UInt,
    aphMappersCtorArg: MutPtr<MutPtr<Hmapper>>,
    public var dwSessionLifespan: UInt,
    public var dwFlags: UInt,
    public var cTlsParameters: UInt,
    pTlsParametersCtorArg: MutPtr<TlsParameters>,
) {
    public var paCred: MutPtr<MutPtr<CertContext>> = paCredCtorArg
        internal set

    public var hRootStore: Hcertstore = hRootStoreCtorArg
        internal set

    public var aphMappers: MutPtr<MutPtr<Hmapper>> = aphMappersCtorArg
        internal set

    public var pTlsParameters: MutPtr<TlsParameters> = pTlsParametersCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        dwCredFormat = 0u,
        cCreds = 0u,
        paCredCtorArg = MutPtr(0L),
        hRootStoreCtorArg = MutPtr(0L),
        cMappers = 0u,
        aphMappersCtorArg = MutPtr(0L),
        dwSessionLifespan = 0u,
        dwFlags = 0u,
        cTlsParameters = 0u,
        pTlsParametersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.dwCredFormat

    public operator fun component3(): UInt = this.cCreds

    public operator fun component4(): MutPtr<MutPtr<CertContext>> = this.paCred

    public operator fun component5(): Hcertstore = this.hRootStore

    public operator fun component6(): UInt = this.cMappers

    public operator fun component7(): MutPtr<MutPtr<Hmapper>> = this.aphMappers

    public operator fun component8(): UInt = this.dwSessionLifespan

    public operator fun component9(): UInt = this.dwFlags

    public operator fun component10(): UInt = this.cTlsParameters

    public operator fun component11(): MutPtr<TlsParameters> = this.pTlsParameters

    public fun copy(dwVersion: UInt = this.dwVersion, dwCredFormat: UInt = this.dwCredFormat, cCreds: UInt = this.cCreds, paCred: MutPtr<MutPtr<CertContext>> = this.paCred, hRootStore: Hcertstore = this.hRootStore, cMappers: UInt = this.cMappers, aphMappers: MutPtr<MutPtr<Hmapper>> = this.aphMappers, dwSessionLifespan: UInt = this.dwSessionLifespan, dwFlags: UInt = this.dwFlags, cTlsParameters: UInt = this.cTlsParameters, pTlsParameters: MutPtr<TlsParameters> = this.pTlsParameters): SchCredentials = SchCredentials(dwVersion = dwVersion, dwCredFormat = dwCredFormat, cCreds = cCreds, paCredCtorArg = paCred, hRootStoreCtorArg = hRootStore, cMappers = cMappers, aphMappersCtorArg = aphMappers, dwSessionLifespan = dwSessionLifespan, dwFlags = dwFlags, cTlsParameters = cTlsParameters, pTlsParametersCtorArg = pTlsParameters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SchCredentials) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwCredFormat != other.dwCredFormat) return false
        if (this.cCreds != other.cCreds) return false
        if (this.paCred != other.paCred) return false
        if (this.hRootStore != other.hRootStore) return false
        if (this.cMappers != other.cMappers) return false
        if (this.aphMappers != other.aphMappers) return false
        if (this.dwSessionLifespan != other.dwSessionLifespan) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.cTlsParameters != other.cTlsParameters) return false
        if (this.pTlsParameters != other.pTlsParameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwCredFormat.hashCode()
        result = 31 * result + this.cCreds.hashCode()
        result = 31 * result + this.paCred.hashCode()
        result = 31 * result + this.hRootStore.hashCode()
        result = 31 * result + this.cMappers.hashCode()
        result = 31 * result + this.aphMappers.hashCode()
        result = 31 * result + this.dwSessionLifespan.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.cTlsParameters.hashCode()
        result = 31 * result + this.pTlsParameters.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            dwCredFormat: UInt = 0u,
            cCreds: UInt = 0u,
            paCred: MutPtr<MutPtr<CertContext>> = MutPtr(0L),
            hRootStore: Hcertstore = MutPtr(0L),
            cMappers: UInt = 0u,
            aphMappers: MutPtr<MutPtr<Hmapper>> = MutPtr(0L),
            dwSessionLifespan: UInt = 0u,
            dwFlags: UInt = 0u,
            cTlsParameters: UInt = 0u,
            pTlsParameters: MutPtr<TlsParameters> = MutPtr(0L),
        ): SchCredentials =
            SchCredentials(
                dwVersion = dwVersion,
                dwCredFormat = dwCredFormat,
                cCreds = cCreds,
                paCredCtorArg = paCred,
                hRootStoreCtorArg = hRootStore,
                cMappers = cMappers,
                aphMappersCtorArg = aphMappers,
                dwSessionLifespan = dwSessionLifespan,
                dwFlags = dwFlags,
                cTlsParameters = cTlsParameters,
                pTlsParametersCtorArg = pTlsParameters,
            )
    }
}

public class SchCredPublicCertchain internal constructor(
    public var dwType: UInt,
    public var cbCertChain: UInt,
    pCertChainCtorArg: MutPtr<UByte>,
) {
    public var pCertChain: MutPtr<UByte> = pCertChainCtorArg
        internal set

    public constructor() : this(
        dwType = 0u,
        cbCertChain = 0u,
        pCertChainCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwType

    public operator fun component2(): UInt = this.cbCertChain

    public operator fun component3(): MutPtr<UByte> = this.pCertChain

    public fun copy(dwType: UInt = this.dwType, cbCertChain: UInt = this.cbCertChain, pCertChain: MutPtr<UByte> = this.pCertChain): SchCredPublicCertchain = SchCredPublicCertchain(dwType = dwType, cbCertChain = cbCertChain, pCertChainCtorArg = pCertChain)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SchCredPublicCertchain) return false
        if (this.dwType != other.dwType) return false
        if (this.cbCertChain != other.cbCertChain) return false
        if (this.pCertChain != other.pCertChain) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwType.hashCode()
        result = 31 * result + this.cbCertChain.hashCode()
        result = 31 * result + this.pCertChain.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchCredPublicCertchain> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchCredPublicCertchain> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SchCredPublicCertchain =
                    SchCredPublicCertchain(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SchCredPublicCertchain) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbCertChain)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pCertChain)
                }
            }

        public operator fun invoke(
            dwType: UInt = 0u,
            cbCertChain: UInt = 0u,
            pCertChain: MutPtr<UByte> = MutPtr(0L),
        ): SchCredPublicCertchain =
            SchCredPublicCertchain(
                dwType = dwType,
                cbCertChain = cbCertChain,
                pCertChainCtorArg = pCertChain,
            )
    }
}

public data class SchCredSecretCapi(
    public var dwType: UInt = 0u,
    public var hProv: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchCredSecretCapi> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchCredSecretCapi> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SchCredSecretCapi =
                    SchCredSecretCapi(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SchCredSecretCapi) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.hProv)
                }
            }
    }
}

public class SchCredSecretPrivkey internal constructor(
    public var dwType: UInt,
    pPrivateKeyCtorArg: MutPtr<UByte>,
    public var cbPrivateKey: UInt,
    pszPasswordCtorArg: Pstr,
) {
    public var pPrivateKey: MutPtr<UByte> = pPrivateKeyCtorArg
        internal set

    public var pszPassword: Pstr = pszPasswordCtorArg
        internal set

    public constructor() : this(
        dwType = 0u,
        pPrivateKeyCtorArg = MutPtr(0L),
        cbPrivateKey = 0u,
        pszPasswordCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwType

    public operator fun component2(): MutPtr<UByte> = this.pPrivateKey

    public operator fun component3(): UInt = this.cbPrivateKey

    public operator fun component4(): Pstr = this.pszPassword

    public fun copy(dwType: UInt = this.dwType, pPrivateKey: MutPtr<UByte> = this.pPrivateKey, cbPrivateKey: UInt = this.cbPrivateKey, pszPassword: Pstr = this.pszPassword): SchCredSecretPrivkey = SchCredSecretPrivkey(dwType = dwType, pPrivateKeyCtorArg = pPrivateKey, cbPrivateKey = cbPrivateKey, pszPasswordCtorArg = pszPassword)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SchCredSecretPrivkey) return false
        if (this.dwType != other.dwType) return false
        if (this.pPrivateKey != other.pPrivateKey) return false
        if (this.cbPrivateKey != other.cbPrivateKey) return false
        if (this.pszPassword != other.pszPassword) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwType.hashCode()
        result = 31 * result + this.pPrivateKey.hashCode()
        result = 31 * result + this.cbPrivateKey.hashCode()
        result = 31 * result + this.pszPassword.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwType: UInt = 0u,
            pPrivateKey: MutPtr<UByte> = MutPtr(0L),
            cbPrivateKey: UInt = 0u,
            pszPassword: Pstr = MutPtr(0L),
        ): SchCredSecretPrivkey =
            SchCredSecretPrivkey(
                dwType = dwType,
                pPrivateKeyCtorArg = pPrivateKey,
                cbPrivateKey = cbPrivateKey,
                pszPasswordCtorArg = pszPassword,
            )
    }
}

public class SchExtensionData internal constructor(
    public var extensionType: UShort,
    pExtDataCtorArg: ConstPtr<UByte>,
    public var cbExtData: UInt,
) {
    public var pExtData: ConstPtr<UByte> = pExtDataCtorArg
        internal set

    public constructor() : this(
        extensionType = 0u,
        pExtDataCtorArg = ConstPtr(0L),
        cbExtData = 0u,
    )

    public operator fun component1(): UShort = this.extensionType

    public operator fun component2(): ConstPtr<UByte> = this.pExtData

    public operator fun component3(): UInt = this.cbExtData

    public fun copy(extensionType: UShort = this.extensionType, pExtData: ConstPtr<UByte> = this.pExtData, cbExtData: UInt = this.cbExtData): SchExtensionData = SchExtensionData(extensionType = extensionType, pExtDataCtorArg = pExtData, cbExtData = cbExtData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SchExtensionData) return false
        if (this.extensionType != other.extensionType) return false
        if (this.pExtData != other.pExtData) return false
        if (this.cbExtData != other.cbExtData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.extensionType.hashCode()
        result = 31 * result + this.pExtData.hashCode()
        result = 31 * result + this.cbExtData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchExtensionData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchExtensionData> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SchExtensionData =
                    SchExtensionData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SchExtensionData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.extensionType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pExtData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbExtData)
                }
            }

        public operator fun invoke(
            extensionType: UShort = 0u,
            pExtData: ConstPtr<UByte> = ConstPtr(0L),
            cbExtData: UInt = 0u,
        ): SchExtensionData =
            SchExtensionData(
                extensionType = extensionType,
                pExtDataCtorArg = pExtData,
                cbExtData = cbExtData,
            )
    }
}

public data class SecpkgAppModeInfo(
    public var userFunction: UInt = 0u,
    public var argument1: Int = 0,
    public var argument2: Int = 0,
    public var userData: SecBuffer = SecBuffer(),
    public var returnToLsa: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgAppModeInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgAppModeInfo> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SecpkgAppModeInfo =
                    SecpkgAppModeInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (SecBuffer.typeLayout()).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: SecpkgAppModeInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.userFunction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.argument1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.argument2)
                    (SecBuffer.typeLayout()).writeNative(addr + 24L, value.userData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 40L, value.returnToLsa)
                }
            }
    }
}

public data class SecpkgByteVector(
    public var byteArrayOffset: UInt = 0u,
    public var byteArrayLength: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgByteVector> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgByteVector> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SecpkgByteVector =
                    SecpkgByteVector(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SecpkgByteVector) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.byteArrayOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.byteArrayLength)
                }
            }
    }
}

public class SecpkgCallInfo internal constructor(
    public var processId: UInt,
    public var threadId: UInt,
    public var attributes: UInt,
    public var callCount: UInt,
    mechOidCtorArg: MutPtr<CVoid>,
) {
    public var mechOid: MutPtr<CVoid> = mechOidCtorArg
        internal set

    public constructor() : this(
        processId = 0u,
        threadId = 0u,
        attributes = 0u,
        callCount = 0u,
        mechOidCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.processId

    public operator fun component2(): UInt = this.threadId

    public operator fun component3(): UInt = this.attributes

    public operator fun component4(): UInt = this.callCount

    public operator fun component5(): MutPtr<CVoid> = this.mechOid

    public fun copy(processId: UInt = this.processId, threadId: UInt = this.threadId, attributes: UInt = this.attributes, callCount: UInt = this.callCount, mechOid: MutPtr<CVoid> = this.mechOid): SecpkgCallInfo = SecpkgCallInfo(processId = processId, threadId = threadId, attributes = attributes, callCount = callCount, mechOidCtorArg = mechOid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecpkgCallInfo) return false
        if (this.processId != other.processId) return false
        if (this.threadId != other.threadId) return false
        if (this.attributes != other.attributes) return false
        if (this.callCount != other.callCount) return false
        if (this.mechOid != other.mechOid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.processId.hashCode()
        result = 31 * result + this.threadId.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.callCount.hashCode()
        result = 31 * result + this.mechOid.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgCallInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgCallInfo> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SecpkgCallInfo =
                    SecpkgCallInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SecpkgCallInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.processId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.threadId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.attributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.callCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.mechOid)
                }
            }

        public operator fun invoke(
            processId: UInt = 0u,
            threadId: UInt = 0u,
            attributes: UInt = 0u,
            callCount: UInt = 0u,
            mechOid: MutPtr<CVoid> = MutPtr(0L),
        ): SecpkgCallInfo =
            SecpkgCallInfo(
                processId = processId,
                threadId = threadId,
                attributes = attributes,
                callCount = callCount,
                mechOidCtorArg = mechOid,
            )
    }
}

public data class SecpkgCallPackagePinDcRequest(
    public var messageType: UInt = 0u,
    public var flags: UInt = 0u,
    public var domainName: LsaUnicodeString = LsaUnicodeString(),
    public var dcName: LsaUnicodeString = LsaUnicodeString(),
    public var dcFlags: UInt = 0u,
)

public data class SecpkgCallPackageTransferCredRequest(
    public var messageType: UInt = 0u,
    public var originLogonId: Luid = Luid(),
    public var destinationLogonId: Luid = Luid(),
    public var flags: UInt = 0u,
)

public data class SecpkgCallPackageUnpinAllDcsRequest(
    public var messageType: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgCallPackageUnpinAllDcsRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgCallPackageUnpinAllDcsRequest> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SecpkgCallPackageUnpinAllDcsRequest =
                    SecpkgCallPackageUnpinAllDcsRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SecpkgCallPackageUnpinAllDcsRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.messageType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

public class SecpkgClientInfo internal constructor(
    public var logonId: Luid,
    public var processID: UInt,
    public var threadID: UInt,
    public var hasTcbPrivilege: Boolean,
    public var impersonating: Boolean,
    public var restricted: Boolean,
    public var clientFlags: UByte,
    public var impersonationLevel: SecurityImpersonationLevel,
    clientTokenCtorArg: Handle,
) {
    public var clientToken: Handle = clientTokenCtorArg
        internal set

    public constructor() : this(
        logonId = Luid(),
        processID = 0u,
        threadID = 0u,
        hasTcbPrivilege = false,
        impersonating = false,
        restricted = false,
        clientFlags = 0u,
        impersonationLevel = 0,
        clientTokenCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Luid = this.logonId

    public operator fun component2(): UInt = this.processID

    public operator fun component3(): UInt = this.threadID

    public operator fun component4(): Boolean = this.hasTcbPrivilege

    public operator fun component5(): Boolean = this.impersonating

    public operator fun component6(): Boolean = this.restricted

    public operator fun component7(): UByte = this.clientFlags

    public operator fun component8(): SecurityImpersonationLevel = this.impersonationLevel

    public operator fun component9(): Handle = this.clientToken

    public fun copy(logonId: Luid = this.logonId, processID: UInt = this.processID, threadID: UInt = this.threadID, hasTcbPrivilege: Boolean = this.hasTcbPrivilege, impersonating: Boolean = this.impersonating, restricted: Boolean = this.restricted, clientFlags: UByte = this.clientFlags, impersonationLevel: SecurityImpersonationLevel = this.impersonationLevel, clientToken: Handle = this.clientToken): SecpkgClientInfo = SecpkgClientInfo(logonId = logonId, processID = processID, threadID = threadID, hasTcbPrivilege = hasTcbPrivilege, impersonating = impersonating, restricted = restricted, clientFlags = clientFlags, impersonationLevel = impersonationLevel, clientTokenCtorArg = clientToken)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecpkgClientInfo) return false
        if (this.logonId != other.logonId) return false
        if (this.processID != other.processID) return false
        if (this.threadID != other.threadID) return false
        if (this.hasTcbPrivilege != other.hasTcbPrivilege) return false
        if (this.impersonating != other.impersonating) return false
        if (this.restricted != other.restricted) return false
        if (this.clientFlags != other.clientFlags) return false
        if (this.impersonationLevel != other.impersonationLevel) return false
        if (this.clientToken != other.clientToken) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.logonId.hashCode()
        result = 31 * result + this.processID.hashCode()
        result = 31 * result + this.threadID.hashCode()
        result = 31 * result + this.hasTcbPrivilege.hashCode()
        result = 31 * result + this.impersonating.hashCode()
        result = 31 * result + this.restricted.hashCode()
        result = 31 * result + this.clientFlags.hashCode()
        result = 31 * result + this.impersonationLevel.hashCode()
        result = 31 * result + this.clientToken.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            logonId: Luid = Luid(),
            processID: UInt = 0u,
            threadID: UInt = 0u,
            hasTcbPrivilege: Boolean = false,
            impersonating: Boolean = false,
            restricted: Boolean = false,
            clientFlags: UByte = 0u,
            impersonationLevel: SecurityImpersonationLevel = 0,
            clientToken: Handle = MutPtr(0L),
        ): SecpkgClientInfo =
            SecpkgClientInfo(
                logonId = logonId,
                processID = processID,
                threadID = threadID,
                hasTcbPrivilege = hasTcbPrivilege,
                impersonating = impersonating,
                restricted = restricted,
                clientFlags = clientFlags,
                impersonationLevel = impersonationLevel,
                clientTokenCtorArg = clientToken,
            )
    }
}

public class SecpkgClientInfoEx internal constructor(
    public var logonId: Luid,
    public var processID: UInt,
    public var threadID: UInt,
    public var hasTcbPrivilege: Boolean,
    public var impersonating: Boolean,
    public var restricted: Boolean,
    public var clientFlags: UByte,
    public var impersonationLevel: SecurityImpersonationLevel,
    clientTokenCtorArg: Handle,
    public var identificationLogonId: Luid,
    identificationTokenCtorArg: Handle,
) {
    public var clientToken: Handle = clientTokenCtorArg
        internal set

    public var identificationToken: Handle = identificationTokenCtorArg
        internal set

    public constructor() : this(
        logonId = Luid(),
        processID = 0u,
        threadID = 0u,
        hasTcbPrivilege = false,
        impersonating = false,
        restricted = false,
        clientFlags = 0u,
        impersonationLevel = 0,
        clientTokenCtorArg = MutPtr(0L),
        identificationLogonId = Luid(),
        identificationTokenCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Luid = this.logonId

    public operator fun component2(): UInt = this.processID

    public operator fun component3(): UInt = this.threadID

    public operator fun component4(): Boolean = this.hasTcbPrivilege

    public operator fun component5(): Boolean = this.impersonating

    public operator fun component6(): Boolean = this.restricted

    public operator fun component7(): UByte = this.clientFlags

    public operator fun component8(): SecurityImpersonationLevel = this.impersonationLevel

    public operator fun component9(): Handle = this.clientToken

    public operator fun component10(): Luid = this.identificationLogonId

    public operator fun component11(): Handle = this.identificationToken

    public fun copy(logonId: Luid = this.logonId, processID: UInt = this.processID, threadID: UInt = this.threadID, hasTcbPrivilege: Boolean = this.hasTcbPrivilege, impersonating: Boolean = this.impersonating, restricted: Boolean = this.restricted, clientFlags: UByte = this.clientFlags, impersonationLevel: SecurityImpersonationLevel = this.impersonationLevel, clientToken: Handle = this.clientToken, identificationLogonId: Luid = this.identificationLogonId, identificationToken: Handle = this.identificationToken): SecpkgClientInfoEx = SecpkgClientInfoEx(logonId = logonId, processID = processID, threadID = threadID, hasTcbPrivilege = hasTcbPrivilege, impersonating = impersonating, restricted = restricted, clientFlags = clientFlags, impersonationLevel = impersonationLevel, clientTokenCtorArg = clientToken, identificationLogonId = identificationLogonId, identificationTokenCtorArg = identificationToken)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecpkgClientInfoEx) return false
        if (this.logonId != other.logonId) return false
        if (this.processID != other.processID) return false
        if (this.threadID != other.threadID) return false
        if (this.hasTcbPrivilege != other.hasTcbPrivilege) return false
        if (this.impersonating != other.impersonating) return false
        if (this.restricted != other.restricted) return false
        if (this.clientFlags != other.clientFlags) return false
        if (this.impersonationLevel != other.impersonationLevel) return false
        if (this.clientToken != other.clientToken) return false
        if (this.identificationLogonId != other.identificationLogonId) return false
        if (this.identificationToken != other.identificationToken) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.logonId.hashCode()
        result = 31 * result + this.processID.hashCode()
        result = 31 * result + this.threadID.hashCode()
        result = 31 * result + this.hasTcbPrivilege.hashCode()
        result = 31 * result + this.impersonating.hashCode()
        result = 31 * result + this.restricted.hashCode()
        result = 31 * result + this.clientFlags.hashCode()
        result = 31 * result + this.impersonationLevel.hashCode()
        result = 31 * result + this.clientToken.hashCode()
        result = 31 * result + this.identificationLogonId.hashCode()
        result = 31 * result + this.identificationToken.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            logonId: Luid = Luid(),
            processID: UInt = 0u,
            threadID: UInt = 0u,
            hasTcbPrivilege: Boolean = false,
            impersonating: Boolean = false,
            restricted: Boolean = false,
            clientFlags: UByte = 0u,
            impersonationLevel: SecurityImpersonationLevel = 0,
            clientToken: Handle = MutPtr(0L),
            identificationLogonId: Luid = Luid(),
            identificationToken: Handle = MutPtr(0L),
        ): SecpkgClientInfoEx =
            SecpkgClientInfoEx(
                logonId = logonId,
                processID = processID,
                threadID = threadID,
                hasTcbPrivilege = hasTcbPrivilege,
                impersonating = impersonating,
                restricted = restricted,
                clientFlags = clientFlags,
                impersonationLevel = impersonationLevel,
                clientTokenCtorArg = clientToken,
                identificationLogonId = identificationLogonId,
                identificationTokenCtorArg = identificationToken,
            )
    }
}

public data class SecpkgContextThunks(
    public var infoLevelCount: UInt = 0u,
    public var levels: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecpkgContextThunks) return false
        if (this.infoLevelCount != other.infoLevelCount) return false
        if (!this.levels.contentEquals(other.levels)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.infoLevelCount.hashCode()
        result = 31 * result + this.levels.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgContextThunks> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgContextThunks> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SecpkgContextThunks =
                    SecpkgContextThunks(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SecpkgContextThunks) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.infoLevelCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 4L, value.levels)
                }
            }
    }
}

public class SecpkgCredential internal constructor(
    public var version: ULong,
    public var cbHeaderLength: UShort,
    public var cbStructureLength: UInt,
    public var clientProcess: UInt,
    public var clientThread: UInt,
    public var logonId: Luid,
    clientTokenCtorArg: Handle,
    public var sessionId: UInt,
    public var modifiedId: Luid,
    public var fCredentials: UInt,
    public var flags: UInt,
    public var principalName: SecpkgByteVector,
    public var packageList: SecpkgByteVector,
    public var marshaledSuppliedCreds: SecpkgByteVector,
) {
    public var clientToken: Handle = clientTokenCtorArg
        internal set

    public constructor() : this(
        version = 0uL,
        cbHeaderLength = 0u,
        cbStructureLength = 0u,
        clientProcess = 0u,
        clientThread = 0u,
        logonId = Luid(),
        clientTokenCtorArg = MutPtr(0L),
        sessionId = 0u,
        modifiedId = Luid(),
        fCredentials = 0u,
        flags = 0u,
        principalName = SecpkgByteVector(),
        packageList = SecpkgByteVector(),
        marshaledSuppliedCreds = SecpkgByteVector(),
    )

    public operator fun component1(): ULong = this.version

    public operator fun component2(): UShort = this.cbHeaderLength

    public operator fun component3(): UInt = this.cbStructureLength

    public operator fun component4(): UInt = this.clientProcess

    public operator fun component5(): UInt = this.clientThread

    public operator fun component6(): Luid = this.logonId

    public operator fun component7(): Handle = this.clientToken

    public operator fun component8(): UInt = this.sessionId

    public operator fun component9(): Luid = this.modifiedId

    public operator fun component10(): UInt = this.fCredentials

    public operator fun component11(): UInt = this.flags

    public operator fun component12(): SecpkgByteVector = this.principalName

    public operator fun component13(): SecpkgByteVector = this.packageList

    public operator fun component14(): SecpkgByteVector = this.marshaledSuppliedCreds

    public fun copy(version: ULong = this.version, cbHeaderLength: UShort = this.cbHeaderLength, cbStructureLength: UInt = this.cbStructureLength, clientProcess: UInt = this.clientProcess, clientThread: UInt = this.clientThread, logonId: Luid = this.logonId, clientToken: Handle = this.clientToken, sessionId: UInt = this.sessionId, modifiedId: Luid = this.modifiedId, fCredentials: UInt = this.fCredentials, flags: UInt = this.flags, principalName: SecpkgByteVector = this.principalName, packageList: SecpkgByteVector = this.packageList, marshaledSuppliedCreds: SecpkgByteVector = this.marshaledSuppliedCreds): SecpkgCredential = SecpkgCredential(version = version, cbHeaderLength = cbHeaderLength, cbStructureLength = cbStructureLength, clientProcess = clientProcess, clientThread = clientThread, logonId = logonId, clientTokenCtorArg = clientToken, sessionId = sessionId, modifiedId = modifiedId, fCredentials = fCredentials, flags = flags, principalName = principalName, packageList = packageList, marshaledSuppliedCreds = marshaledSuppliedCreds)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecpkgCredential) return false
        if (this.version != other.version) return false
        if (this.cbHeaderLength != other.cbHeaderLength) return false
        if (this.cbStructureLength != other.cbStructureLength) return false
        if (this.clientProcess != other.clientProcess) return false
        if (this.clientThread != other.clientThread) return false
        if (this.logonId != other.logonId) return false
        if (this.clientToken != other.clientToken) return false
        if (this.sessionId != other.sessionId) return false
        if (this.modifiedId != other.modifiedId) return false
        if (this.fCredentials != other.fCredentials) return false
        if (this.flags != other.flags) return false
        if (this.principalName != other.principalName) return false
        if (this.packageList != other.packageList) return false
        if (this.marshaledSuppliedCreds != other.marshaledSuppliedCreds) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.cbHeaderLength.hashCode()
        result = 31 * result + this.cbStructureLength.hashCode()
        result = 31 * result + this.clientProcess.hashCode()
        result = 31 * result + this.clientThread.hashCode()
        result = 31 * result + this.logonId.hashCode()
        result = 31 * result + this.clientToken.hashCode()
        result = 31 * result + this.sessionId.hashCode()
        result = 31 * result + this.modifiedId.hashCode()
        result = 31 * result + this.fCredentials.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.principalName.hashCode()
        result = 31 * result + this.packageList.hashCode()
        result = 31 * result + this.marshaledSuppliedCreds.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: ULong = 0uL,
            cbHeaderLength: UShort = 0u,
            cbStructureLength: UInt = 0u,
            clientProcess: UInt = 0u,
            clientThread: UInt = 0u,
            logonId: Luid = Luid(),
            clientToken: Handle = MutPtr(0L),
            sessionId: UInt = 0u,
            modifiedId: Luid = Luid(),
            fCredentials: UInt = 0u,
            flags: UInt = 0u,
            principalName: SecpkgByteVector = SecpkgByteVector(),
            packageList: SecpkgByteVector = SecpkgByteVector(),
            marshaledSuppliedCreds: SecpkgByteVector = SecpkgByteVector(),
        ): SecpkgCredential =
            SecpkgCredential(
                version = version,
                cbHeaderLength = cbHeaderLength,
                cbStructureLength = cbStructureLength,
                clientProcess = clientProcess,
                clientThread = clientThread,
                logonId = logonId,
                clientTokenCtorArg = clientToken,
                sessionId = sessionId,
                modifiedId = modifiedId,
                fCredentials = fCredentials,
                flags = flags,
                principalName = principalName,
                packageList = packageList,
                marshaledSuppliedCreds = marshaledSuppliedCreds,
            )
    }
}

public data class SecpkgDllFunctions(
    public var allocateHeap: PlsaAllocateLsaHeap = null,
    public var freeHeap: PlsaFreeLsaHeap = null,
    public var registerCallback: PlsaRegisterCallback = null,
    public var locatePackageById: PlsaLocatePkgById = null,
)

public class SecpkgEventNotify internal constructor(
    public var eventClass: UInt,
    public var reserved: UInt,
    public var eventDataSize: UInt,
    eventDataCtorArg: MutPtr<CVoid>,
    packageParameterCtorArg: MutPtr<CVoid>,
) {
    public var eventData: MutPtr<CVoid> = eventDataCtorArg
        internal set

    public var packageParameter: MutPtr<CVoid> = packageParameterCtorArg
        internal set

    public constructor() : this(
        eventClass = 0u,
        reserved = 0u,
        eventDataSize = 0u,
        eventDataCtorArg = MutPtr(0L),
        packageParameterCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.eventClass

    public operator fun component2(): UInt = this.reserved

    public operator fun component3(): UInt = this.eventDataSize

    public operator fun component4(): MutPtr<CVoid> = this.eventData

    public operator fun component5(): MutPtr<CVoid> = this.packageParameter

    public fun copy(eventClass: UInt = this.eventClass, reserved: UInt = this.reserved, eventDataSize: UInt = this.eventDataSize, eventData: MutPtr<CVoid> = this.eventData, packageParameter: MutPtr<CVoid> = this.packageParameter): SecpkgEventNotify = SecpkgEventNotify(eventClass = eventClass, reserved = reserved, eventDataSize = eventDataSize, eventDataCtorArg = eventData, packageParameterCtorArg = packageParameter)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecpkgEventNotify) return false
        if (this.eventClass != other.eventClass) return false
        if (this.reserved != other.reserved) return false
        if (this.eventDataSize != other.eventDataSize) return false
        if (this.eventData != other.eventData) return false
        if (this.packageParameter != other.packageParameter) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eventClass.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.eventDataSize.hashCode()
        result = 31 * result + this.eventData.hashCode()
        result = 31 * result + this.packageParameter.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgEventNotify> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgEventNotify> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SecpkgEventNotify =
                    SecpkgEventNotify(
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
                override fun writeNative(addr: Long, value: SecpkgEventNotify) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.eventClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.eventDataSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.eventData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.packageParameter)
                }
            }

        public operator fun invoke(
            eventClass: UInt = 0u,
            reserved: UInt = 0u,
            eventDataSize: UInt = 0u,
            eventData: MutPtr<CVoid> = MutPtr(0L),
            packageParameter: MutPtr<CVoid> = MutPtr(0L),
        ): SecpkgEventNotify =
            SecpkgEventNotify(
                eventClass = eventClass,
                reserved = reserved,
                eventDataSize = eventDataSize,
                eventDataCtorArg = eventData,
                packageParameterCtorArg = packageParameter,
            )
    }
}

public data class SecpkgEventPackageChange(
    public var changeType: SecpkgPackageChangeType = 0u,
    public var packageId: Int = 0,
    public var packageName: SecurityString = SecurityString(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgEventPackageChange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgEventPackageChange> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SecpkgEventPackageChange =
                    SecpkgEventPackageChange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (SecurityString.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SecpkgEventPackageChange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.changeType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.packageId)
                    (SecurityString.typeLayout()).writeNative(addr + 16L, value.packageName)
                }
            }
    }
}

public data class SecpkgEventRoleChange(
    public var previousRole: UInt = 0u,
    public var newRole: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgEventRoleChange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgEventRoleChange> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SecpkgEventRoleChange =
                    SecpkgEventRoleChange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SecpkgEventRoleChange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.previousRole)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.newRole)
                }
            }
    }
}

public data class SecpkgExtendedInformation(
    public var cls: SecpkgExtendedInformationClass = 0,
    public var info: SecpkgExtendedInformation0 = SecpkgExtendedInformation0(),
)

public data class SecpkgExtendedInformation0(
    public var gssInfo: SecpkgGssInfo = SecpkgGssInfo(),
    public var contextThunks: SecpkgContextThunks = SecpkgContextThunks(),
    public var mutualAuthLevel: SecpkgMutualAuthLevel = SecpkgMutualAuthLevel(),
    public var wowClientDll: SecpkgWowClientDll = SecpkgWowClientDll(),
    public var extraOids: SecpkgExtraOids = SecpkgExtraOids(),
    public var nego2Info: SecpkgNego2Info = SecpkgNego2Info(),
)

public data class SecpkgExtraOids(
    public var oidCount: UInt = 0u,
    public var oids: List<SecpkgSerializedOid> = List(1) { SecpkgSerializedOid() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgExtraOids> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgExtraOids> {
                override val sizeBytes: Long = 44L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SecpkgExtraOids =
                    SecpkgExtraOids(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(SecpkgSerializedOid.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SecpkgExtraOids) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.oidCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(SecpkgSerializedOid.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.oids)
                }
            }
    }
}

public class SecpkgFunctionTable(
    public var initializePackage: PlsaApInitializePackage = null,
    public var logonUserA: PlsaApLogonUser = null,
    public var callPackage: PlsaApCallPackage = null,
    public var logonTerminated: PlsaApLogonTerminated = null,
    public var callPackageUntrusted: PlsaApCallPackage = null,
    public var callPackagePassthrough: PlsaApCallPackagePassthrough = null,
    public var logonUserExA: PlsaApLogonUserEx = null,
    public var logonUserEx2: PlsaApLogonUserEx2 = null,
    public var initialize: SpInitializeFn = null,
    public var shutdown: SpShutdownFn = null,
    public var getInfo: SpGetInfoFn = null,
    public var acceptCredentials: SpAcceptCredentialsFn = null,
    public var acquireCredentialsHandleA: SpAcquireCredentialsHandleFn = null,
    public var queryCredentialsAttributesA: SpQueryCredentialsAttributesFn = null,
    public var freeCredentialsHandle: SpFreeCredentialsHandleFn = null,
    public var saveCredentials: SpSaveCredentialsFn = null,
    public var getCredentials: SpGetCredentialsFn = null,
    public var deleteCredentials: SpDeleteCredentialsFn = null,
    public var initLsaModeContext: SpInitLsaModeContextFn = null,
    public var acceptLsaModeContext: SpAcceptLsaModeContextFn = null,
    public var deleteContext: SpDeleteContextFn = null,
    public var applyControlToken: SpApplyControlTokenFn = null,
    public var getUserInfo: SpGetUserInfoFn = null,
    public var getExtendedInformation: SpGetExtendedInformationFn = null,
    public var queryContextAttributesA: SpQueryContextAttributesFn = null,
    public var addCredentialsA: SpAddCredentialsFn = null,
    public var setExtendedInformation: SpSetExtendedInformationFn = null,
    public var setContextAttributesA: SpSetContextAttributesFn = null,
    public var setCredentialsAttributesA: SpSetCredentialsAttributesFn = null,
    public var changeAccountPasswordA: SpChangeAccountPasswordFn = null,
    public var queryMetaData: SpQueryMetaDataFn = null,
    public var exchangeMetaData: SpExchangeMetaDataFn = null,
    public var getCredUIContext: SpGetCredUIContextFn = null,
    public var updateCredentials: SpUpdateCredentialsFn = null,
    public var validateTargetInfo: SpValidateTargetInfoFn = null,
    public var postLogonUser: LsaApPostLogonUser = null,
    public var getRemoteCredGuardLogonBuffer: SpGetRemoteCredGuardLogonBufferFn = null,
    public var getRemoteCredGuardSupplementalCreds: SpGetRemoteCredGuardSupplementalCredsFn = null,
    public var getTbalSupplementalCreds: SpGetTbalSupplementalCredsFn = null,
    public var logonUserEx3: PlsaApLogonUserEx3 = null,
    public var preLogonUserSurrogate: PlsaApPreLogonUserSurrogate = null,
    public var postLogonUserSurrogate: PlsaApPostLogonUserSurrogate = null,
    public var extractTargetInfo: SpExtractTargetInfoFn = null,
)

public data class SecpkgGssInfo(
    public var encodedIdLength: UInt = 0u,
    public var encodedId: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecpkgGssInfo) return false
        if (this.encodedIdLength != other.encodedIdLength) return false
        if (!this.encodedId.contentEquals(other.encodedId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.encodedIdLength.hashCode()
        result = 31 * result + this.encodedId.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgGssInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgGssInfo> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SecpkgGssInfo =
                    SecpkgGssInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SecpkgGssInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.encodedIdLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 4L, value.encodedId)
                }
            }
    }
}

public data class SecpkgKernelFunctions(
    public var allocateHeap: PlsaAllocateLsaHeap = null,
    public var freeHeap: PlsaFreeLsaHeap = null,
    public var createContextList: PksecCreateContextList = null,
    public var insertListEntry: PksecInsertListEntry = null,
    public var referenceListEntry: PksecReferenceListEntry = null,
    public var dereferenceListEntry: PksecDereferenceListEntry = null,
    public var serializeWinntAuthData: PksecSerializeWinntAuthData = null,
    public var serializeSchannelAuthData: PksecSerializeSchannelAuthData = null,
    public var locatePackageById: PksecLocatePkgById = null,
)

public data class SecpkgKernelFunctionTable(
    public var initialize: KspInitPackageFn = null,
    public var deleteContext: KspDeleteContextFn = null,
    public var initContext: KspInitContextFn = null,
    public var mapHandle: KspMapHandleFn = null,
    public var sign: KspMakeSignatureFn = null,
    public var verify: KspVerifySignatureFn = null,
    public var seal: KspSealMessageFn = null,
    public var unseal: KspUnsealMessageFn = null,
    public var getToken: KspGetTokenFn = null,
    public var queryAttributes: KspQueryAttributesFn = null,
    public var completeToken: KspCompleteTokenFn = null,
    public var exportContext: SpExportSecurityContextFn = null,
    public var importContext: SpImportSecurityContextFn = null,
    public var setPackagePagingMode: KspSetPagingModeFn = null,
    public var serializeAuthData: KspSerializeAuthDataFn = null,
)

public data class SecpkgMutualAuthLevel(
    public var mutualAuthLevel: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgMutualAuthLevel> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgMutualAuthLevel> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SecpkgMutualAuthLevel =
                    SecpkgMutualAuthLevel(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecpkgMutualAuthLevel) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mutualAuthLevel)
                }
            }
    }
}

public data class SecpkgNego2Info(
    public var authScheme: UByteArray = UByteArray(16),
    public var packageFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecpkgNego2Info) return false
        if (!this.authScheme.contentEquals(other.authScheme)) return false
        if (this.packageFlags != other.packageFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.authScheme.contentHashCode()
        result = 31 * result + this.packageFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgNego2Info> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgNego2Info> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SecpkgNego2Info =
                    SecpkgNego2Info(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SecpkgNego2Info) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.authScheme)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.packageFlags)
                }
            }
    }
}

public class SecpkgNtlmTargetinfo internal constructor(
    public var flags: UInt,
    msvAvNbComputerNameCtorArg: Pwstr,
    msvAvNbDomainNameCtorArg: Pwstr,
    msvAvDnsComputerNameCtorArg: Pwstr,
    msvAvDnsDomainNameCtorArg: Pwstr,
    msvAvDnsTreeNameCtorArg: Pwstr,
    public var msvAvFlags: UInt,
    public var msvAvTimestamp: Filetime,
    msvAvTargetNameCtorArg: Pwstr,
) {
    public var msvAvNbComputerName: Pwstr = msvAvNbComputerNameCtorArg
        internal set

    public var msvAvNbDomainName: Pwstr = msvAvNbDomainNameCtorArg
        internal set

    public var msvAvDnsComputerName: Pwstr = msvAvDnsComputerNameCtorArg
        internal set

    public var msvAvDnsDomainName: Pwstr = msvAvDnsDomainNameCtorArg
        internal set

    public var msvAvDnsTreeName: Pwstr = msvAvDnsTreeNameCtorArg
        internal set

    public var msvAvTargetName: Pwstr = msvAvTargetNameCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        msvAvNbComputerNameCtorArg = MutPtr(0L),
        msvAvNbDomainNameCtorArg = MutPtr(0L),
        msvAvDnsComputerNameCtorArg = MutPtr(0L),
        msvAvDnsDomainNameCtorArg = MutPtr(0L),
        msvAvDnsTreeNameCtorArg = MutPtr(0L),
        msvAvFlags = 0u,
        msvAvTimestamp = Filetime(),
        msvAvTargetNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): Pwstr = this.msvAvNbComputerName

    public operator fun component3(): Pwstr = this.msvAvNbDomainName

    public operator fun component4(): Pwstr = this.msvAvDnsComputerName

    public operator fun component5(): Pwstr = this.msvAvDnsDomainName

    public operator fun component6(): Pwstr = this.msvAvDnsTreeName

    public operator fun component7(): UInt = this.msvAvFlags

    public operator fun component8(): Filetime = this.msvAvTimestamp

    public operator fun component9(): Pwstr = this.msvAvTargetName

    public fun copy(flags: UInt = this.flags, msvAvNbComputerName: Pwstr = this.msvAvNbComputerName, msvAvNbDomainName: Pwstr = this.msvAvNbDomainName, msvAvDnsComputerName: Pwstr = this.msvAvDnsComputerName, msvAvDnsDomainName: Pwstr = this.msvAvDnsDomainName, msvAvDnsTreeName: Pwstr = this.msvAvDnsTreeName, msvAvFlags: UInt = this.msvAvFlags, msvAvTimestamp: Filetime = this.msvAvTimestamp, msvAvTargetName: Pwstr = this.msvAvTargetName): SecpkgNtlmTargetinfo = SecpkgNtlmTargetinfo(flags = flags, msvAvNbComputerNameCtorArg = msvAvNbComputerName, msvAvNbDomainNameCtorArg = msvAvNbDomainName, msvAvDnsComputerNameCtorArg = msvAvDnsComputerName, msvAvDnsDomainNameCtorArg = msvAvDnsDomainName, msvAvDnsTreeNameCtorArg = msvAvDnsTreeName, msvAvFlags = msvAvFlags, msvAvTimestamp = msvAvTimestamp, msvAvTargetNameCtorArg = msvAvTargetName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecpkgNtlmTargetinfo) return false
        if (this.flags != other.flags) return false
        if (this.msvAvNbComputerName != other.msvAvNbComputerName) return false
        if (this.msvAvNbDomainName != other.msvAvNbDomainName) return false
        if (this.msvAvDnsComputerName != other.msvAvDnsComputerName) return false
        if (this.msvAvDnsDomainName != other.msvAvDnsDomainName) return false
        if (this.msvAvDnsTreeName != other.msvAvDnsTreeName) return false
        if (this.msvAvFlags != other.msvAvFlags) return false
        if (this.msvAvTimestamp != other.msvAvTimestamp) return false
        if (this.msvAvTargetName != other.msvAvTargetName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.msvAvNbComputerName.hashCode()
        result = 31 * result + this.msvAvNbDomainName.hashCode()
        result = 31 * result + this.msvAvDnsComputerName.hashCode()
        result = 31 * result + this.msvAvDnsDomainName.hashCode()
        result = 31 * result + this.msvAvDnsTreeName.hashCode()
        result = 31 * result + this.msvAvFlags.hashCode()
        result = 31 * result + this.msvAvTimestamp.hashCode()
        result = 31 * result + this.msvAvTargetName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: UInt = 0u,
            msvAvNbComputerName: Pwstr = MutPtr(0L),
            msvAvNbDomainName: Pwstr = MutPtr(0L),
            msvAvDnsComputerName: Pwstr = MutPtr(0L),
            msvAvDnsDomainName: Pwstr = MutPtr(0L),
            msvAvDnsTreeName: Pwstr = MutPtr(0L),
            msvAvFlags: UInt = 0u,
            msvAvTimestamp: Filetime = Filetime(),
            msvAvTargetName: Pwstr = MutPtr(0L),
        ): SecpkgNtlmTargetinfo =
            SecpkgNtlmTargetinfo(
                flags = flags,
                msvAvNbComputerNameCtorArg = msvAvNbComputerName,
                msvAvNbDomainNameCtorArg = msvAvNbDomainName,
                msvAvDnsComputerNameCtorArg = msvAvDnsComputerName,
                msvAvDnsDomainNameCtorArg = msvAvDnsDomainName,
                msvAvDnsTreeNameCtorArg = msvAvDnsTreeName,
                msvAvFlags = msvAvFlags,
                msvAvTimestamp = msvAvTimestamp,
                msvAvTargetNameCtorArg = msvAvTargetName,
            )
    }
}

public class SecpkgParameters internal constructor(
    public var version: UInt,
    public var machineState: UInt,
    public var setupMode: UInt,
    domainSidCtorArg: Psid,
    public var domainName: LsaUnicodeString,
    public var dnsDomainName: LsaUnicodeString,
    public var domainGuid: Guid,
) {
    public var domainSid: Psid = domainSidCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        machineState = 0u,
        setupMode = 0u,
        domainSidCtorArg = MutPtr(0L),
        domainName = LsaUnicodeString(),
        dnsDomainName = LsaUnicodeString(),
        domainGuid = Guid(),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UInt = this.machineState

    public operator fun component3(): UInt = this.setupMode

    public operator fun component4(): Psid = this.domainSid

    public operator fun component5(): LsaUnicodeString = this.domainName

    public operator fun component6(): LsaUnicodeString = this.dnsDomainName

    public operator fun component7(): Guid = this.domainGuid

    public fun copy(version: UInt = this.version, machineState: UInt = this.machineState, setupMode: UInt = this.setupMode, domainSid: Psid = this.domainSid, domainName: LsaUnicodeString = this.domainName, dnsDomainName: LsaUnicodeString = this.dnsDomainName, domainGuid: Guid = this.domainGuid): SecpkgParameters = SecpkgParameters(version = version, machineState = machineState, setupMode = setupMode, domainSidCtorArg = domainSid, domainName = domainName, dnsDomainName = dnsDomainName, domainGuid = domainGuid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecpkgParameters) return false
        if (this.version != other.version) return false
        if (this.machineState != other.machineState) return false
        if (this.setupMode != other.setupMode) return false
        if (this.domainSid != other.domainSid) return false
        if (this.domainName != other.domainName) return false
        if (this.dnsDomainName != other.dnsDomainName) return false
        if (this.domainGuid != other.domainGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.machineState.hashCode()
        result = 31 * result + this.setupMode.hashCode()
        result = 31 * result + this.domainSid.hashCode()
        result = 31 * result + this.domainName.hashCode()
        result = 31 * result + this.dnsDomainName.hashCode()
        result = 31 * result + this.domainGuid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            machineState: UInt = 0u,
            setupMode: UInt = 0u,
            domainSid: Psid = MutPtr(0L),
            domainName: LsaUnicodeString = LsaUnicodeString(),
            dnsDomainName: LsaUnicodeString = LsaUnicodeString(),
            domainGuid: Guid = Guid(),
        ): SecpkgParameters =
            SecpkgParameters(
                version = version,
                machineState = machineState,
                setupMode = setupMode,
                domainSidCtorArg = domainSid,
                domainName = domainName,
                dnsDomainName = dnsDomainName,
                domainGuid = domainGuid,
            )
    }
}

public data class SecpkgPostLogonUserInfo(
    public var flags: UInt = 0u,
    public var logonId: Luid = Luid(),
    public var linkedLogonId: Luid = Luid(),
)

public class SecpkgPrimaryCred internal constructor(
    public var logonId: Luid,
    public var downlevelName: LsaUnicodeString,
    public var domainName: LsaUnicodeString,
    public var password: LsaUnicodeString,
    public var oldPassword: LsaUnicodeString,
    userSidCtorArg: Psid,
    public var flags: UInt,
    public var dnsDomainName: LsaUnicodeString,
    public var upn: LsaUnicodeString,
    public var logonServer: LsaUnicodeString,
    public var spare1: LsaUnicodeString,
    public var spare2: LsaUnicodeString,
    public var spare3: LsaUnicodeString,
    public var spare4: LsaUnicodeString,
) {
    public var userSid: Psid = userSidCtorArg
        internal set

    public constructor() : this(
        logonId = Luid(),
        downlevelName = LsaUnicodeString(),
        domainName = LsaUnicodeString(),
        password = LsaUnicodeString(),
        oldPassword = LsaUnicodeString(),
        userSidCtorArg = MutPtr(0L),
        flags = 0u,
        dnsDomainName = LsaUnicodeString(),
        upn = LsaUnicodeString(),
        logonServer = LsaUnicodeString(),
        spare1 = LsaUnicodeString(),
        spare2 = LsaUnicodeString(),
        spare3 = LsaUnicodeString(),
        spare4 = LsaUnicodeString(),
    )

    public operator fun component1(): Luid = this.logonId

    public operator fun component2(): LsaUnicodeString = this.downlevelName

    public operator fun component3(): LsaUnicodeString = this.domainName

    public operator fun component4(): LsaUnicodeString = this.password

    public operator fun component5(): LsaUnicodeString = this.oldPassword

    public operator fun component6(): Psid = this.userSid

    public operator fun component7(): UInt = this.flags

    public operator fun component8(): LsaUnicodeString = this.dnsDomainName

    public operator fun component9(): LsaUnicodeString = this.upn

    public operator fun component10(): LsaUnicodeString = this.logonServer

    public operator fun component11(): LsaUnicodeString = this.spare1

    public operator fun component12(): LsaUnicodeString = this.spare2

    public operator fun component13(): LsaUnicodeString = this.spare3

    public operator fun component14(): LsaUnicodeString = this.spare4

    public fun copy(logonId: Luid = this.logonId, downlevelName: LsaUnicodeString = this.downlevelName, domainName: LsaUnicodeString = this.domainName, password: LsaUnicodeString = this.password, oldPassword: LsaUnicodeString = this.oldPassword, userSid: Psid = this.userSid, flags: UInt = this.flags, dnsDomainName: LsaUnicodeString = this.dnsDomainName, upn: LsaUnicodeString = this.upn, logonServer: LsaUnicodeString = this.logonServer, spare1: LsaUnicodeString = this.spare1, spare2: LsaUnicodeString = this.spare2, spare3: LsaUnicodeString = this.spare3, spare4: LsaUnicodeString = this.spare4): SecpkgPrimaryCred = SecpkgPrimaryCred(logonId = logonId, downlevelName = downlevelName, domainName = domainName, password = password, oldPassword = oldPassword, userSidCtorArg = userSid, flags = flags, dnsDomainName = dnsDomainName, upn = upn, logonServer = logonServer, spare1 = spare1, spare2 = spare2, spare3 = spare3, spare4 = spare4)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecpkgPrimaryCred) return false
        if (this.logonId != other.logonId) return false
        if (this.downlevelName != other.downlevelName) return false
        if (this.domainName != other.domainName) return false
        if (this.password != other.password) return false
        if (this.oldPassword != other.oldPassword) return false
        if (this.userSid != other.userSid) return false
        if (this.flags != other.flags) return false
        if (this.dnsDomainName != other.dnsDomainName) return false
        if (this.upn != other.upn) return false
        if (this.logonServer != other.logonServer) return false
        if (this.spare1 != other.spare1) return false
        if (this.spare2 != other.spare2) return false
        if (this.spare3 != other.spare3) return false
        if (this.spare4 != other.spare4) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.logonId.hashCode()
        result = 31 * result + this.downlevelName.hashCode()
        result = 31 * result + this.domainName.hashCode()
        result = 31 * result + this.password.hashCode()
        result = 31 * result + this.oldPassword.hashCode()
        result = 31 * result + this.userSid.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.dnsDomainName.hashCode()
        result = 31 * result + this.upn.hashCode()
        result = 31 * result + this.logonServer.hashCode()
        result = 31 * result + this.spare1.hashCode()
        result = 31 * result + this.spare2.hashCode()
        result = 31 * result + this.spare3.hashCode()
        result = 31 * result + this.spare4.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            logonId: Luid = Luid(),
            downlevelName: LsaUnicodeString = LsaUnicodeString(),
            domainName: LsaUnicodeString = LsaUnicodeString(),
            password: LsaUnicodeString = LsaUnicodeString(),
            oldPassword: LsaUnicodeString = LsaUnicodeString(),
            userSid: Psid = MutPtr(0L),
            flags: UInt = 0u,
            dnsDomainName: LsaUnicodeString = LsaUnicodeString(),
            upn: LsaUnicodeString = LsaUnicodeString(),
            logonServer: LsaUnicodeString = LsaUnicodeString(),
            spare1: LsaUnicodeString = LsaUnicodeString(),
            spare2: LsaUnicodeString = LsaUnicodeString(),
            spare3: LsaUnicodeString = LsaUnicodeString(),
            spare4: LsaUnicodeString = LsaUnicodeString(),
        ): SecpkgPrimaryCred =
            SecpkgPrimaryCred(
                logonId = logonId,
                downlevelName = downlevelName,
                domainName = domainName,
                password = password,
                oldPassword = oldPassword,
                userSidCtorArg = userSid,
                flags = flags,
                dnsDomainName = dnsDomainName,
                upn = upn,
                logonServer = logonServer,
                spare1 = spare1,
                spare2 = spare2,
                spare3 = spare3,
                spare4 = spare4,
            )
    }
}

public class SecpkgPrimaryCredEx internal constructor(
    public var logonId: Luid,
    public var downlevelName: LsaUnicodeString,
    public var domainName: LsaUnicodeString,
    public var password: LsaUnicodeString,
    public var oldPassword: LsaUnicodeString,
    userSidCtorArg: Psid,
    public var flags: UInt,
    public var dnsDomainName: LsaUnicodeString,
    public var upn: LsaUnicodeString,
    public var logonServer: LsaUnicodeString,
    public var spare1: LsaUnicodeString,
    public var spare2: LsaUnicodeString,
    public var spare3: LsaUnicodeString,
    public var spare4: LsaUnicodeString,
    public var packageId: Int,
    public var prevLogonId: Luid,
    public var flagsEx: UInt,
) {
    public var userSid: Psid = userSidCtorArg
        internal set

    public constructor() : this(
        logonId = Luid(),
        downlevelName = LsaUnicodeString(),
        domainName = LsaUnicodeString(),
        password = LsaUnicodeString(),
        oldPassword = LsaUnicodeString(),
        userSidCtorArg = MutPtr(0L),
        flags = 0u,
        dnsDomainName = LsaUnicodeString(),
        upn = LsaUnicodeString(),
        logonServer = LsaUnicodeString(),
        spare1 = LsaUnicodeString(),
        spare2 = LsaUnicodeString(),
        spare3 = LsaUnicodeString(),
        spare4 = LsaUnicodeString(),
        packageId = 0,
        prevLogonId = Luid(),
        flagsEx = 0u,
    )

    public companion object {
        public operator fun invoke(
            logonId: Luid = Luid(),
            downlevelName: LsaUnicodeString = LsaUnicodeString(),
            domainName: LsaUnicodeString = LsaUnicodeString(),
            password: LsaUnicodeString = LsaUnicodeString(),
            oldPassword: LsaUnicodeString = LsaUnicodeString(),
            userSid: Psid = MutPtr(0L),
            flags: UInt = 0u,
            dnsDomainName: LsaUnicodeString = LsaUnicodeString(),
            upn: LsaUnicodeString = LsaUnicodeString(),
            logonServer: LsaUnicodeString = LsaUnicodeString(),
            spare1: LsaUnicodeString = LsaUnicodeString(),
            spare2: LsaUnicodeString = LsaUnicodeString(),
            spare3: LsaUnicodeString = LsaUnicodeString(),
            spare4: LsaUnicodeString = LsaUnicodeString(),
            packageId: Int = 0,
            prevLogonId: Luid = Luid(),
            flagsEx: UInt = 0u,
        ): SecpkgPrimaryCredEx =
            SecpkgPrimaryCredEx(
                logonId = logonId,
                downlevelName = downlevelName,
                domainName = domainName,
                password = password,
                oldPassword = oldPassword,
                userSidCtorArg = userSid,
                flags = flags,
                dnsDomainName = dnsDomainName,
                upn = upn,
                logonServer = logonServer,
                spare1 = spare1,
                spare2 = spare2,
                spare3 = spare3,
                spare4 = spare4,
                packageId = packageId,
                prevLogonId = prevLogonId,
                flagsEx = flagsEx,
            )
    }
}

public class SecpkgRedirectedLogonBuffer internal constructor(
    public var redirectedLogonGuid: Guid,
    redirectedLogonHandleCtorArg: Handle,
    public var init: PlsaRedirectedLogonInit,
    public var callback: PlsaRedirectedLogonCallback,
    public var cleanupCallback: PlsaRedirectedLogonCleanupCallback,
    public var getLogonCreds: PlsaRedirectedLogonGetLogonCreds,
    public var getSupplementalCreds: PlsaRedirectedLogonGetSuppCreds,
    public var getRedirectedLogonSid: PlsaRedirectedLogonGetSid,
) {
    public var redirectedLogonHandle: Handle = redirectedLogonHandleCtorArg
        internal set

    public constructor() : this(
        redirectedLogonGuid = Guid(),
        redirectedLogonHandleCtorArg = MutPtr(0L),
        init = null,
        callback = null,
        cleanupCallback = null,
        getLogonCreds = null,
        getSupplementalCreds = null,
        getRedirectedLogonSid = null,
    )

    public operator fun component1(): Guid = this.redirectedLogonGuid

    public operator fun component2(): Handle = this.redirectedLogonHandle

    public operator fun component3(): PlsaRedirectedLogonInit = this.init

    public operator fun component4(): PlsaRedirectedLogonCallback = this.callback

    public operator fun component5(): PlsaRedirectedLogonCleanupCallback = this.cleanupCallback

    public operator fun component6(): PlsaRedirectedLogonGetLogonCreds = this.getLogonCreds

    public operator fun component7(): PlsaRedirectedLogonGetSuppCreds = this.getSupplementalCreds

    public operator fun component8(): PlsaRedirectedLogonGetSid = this.getRedirectedLogonSid

    public fun copy(redirectedLogonGuid: Guid = this.redirectedLogonGuid, redirectedLogonHandle: Handle = this.redirectedLogonHandle, init: PlsaRedirectedLogonInit = this.init, callback: PlsaRedirectedLogonCallback = this.callback, cleanupCallback: PlsaRedirectedLogonCleanupCallback = this.cleanupCallback, getLogonCreds: PlsaRedirectedLogonGetLogonCreds = this.getLogonCreds, getSupplementalCreds: PlsaRedirectedLogonGetSuppCreds = this.getSupplementalCreds, getRedirectedLogonSid: PlsaRedirectedLogonGetSid = this.getRedirectedLogonSid): SecpkgRedirectedLogonBuffer = SecpkgRedirectedLogonBuffer(redirectedLogonGuid = redirectedLogonGuid, redirectedLogonHandleCtorArg = redirectedLogonHandle, init = init, callback = callback, cleanupCallback = cleanupCallback, getLogonCreds = getLogonCreds, getSupplementalCreds = getSupplementalCreds, getRedirectedLogonSid = getRedirectedLogonSid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecpkgRedirectedLogonBuffer) return false
        if (this.redirectedLogonGuid != other.redirectedLogonGuid) return false
        if (this.redirectedLogonHandle != other.redirectedLogonHandle) return false
        if (this.init != other.init) return false
        if (this.callback != other.callback) return false
        if (this.cleanupCallback != other.cleanupCallback) return false
        if (this.getLogonCreds != other.getLogonCreds) return false
        if (this.getSupplementalCreds != other.getSupplementalCreds) return false
        if (this.getRedirectedLogonSid != other.getRedirectedLogonSid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.redirectedLogonGuid.hashCode()
        result = 31 * result + this.redirectedLogonHandle.hashCode()
        result = 31 * result + this.init.hashCode()
        result = 31 * result + this.callback.hashCode()
        result = 31 * result + this.cleanupCallback.hashCode()
        result = 31 * result + this.getLogonCreds.hashCode()
        result = 31 * result + this.getSupplementalCreds.hashCode()
        result = 31 * result + this.getRedirectedLogonSid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            redirectedLogonGuid: Guid = Guid(),
            redirectedLogonHandle: Handle = MutPtr(0L),
            init: PlsaRedirectedLogonInit = null,
            callback: PlsaRedirectedLogonCallback = null,
            cleanupCallback: PlsaRedirectedLogonCleanupCallback = null,
            getLogonCreds: PlsaRedirectedLogonGetLogonCreds = null,
            getSupplementalCreds: PlsaRedirectedLogonGetSuppCreds = null,
            getRedirectedLogonSid: PlsaRedirectedLogonGetSid = null,
        ): SecpkgRedirectedLogonBuffer =
            SecpkgRedirectedLogonBuffer(
                redirectedLogonGuid = redirectedLogonGuid,
                redirectedLogonHandleCtorArg = redirectedLogonHandle,
                init = init,
                callback = callback,
                cleanupCallback = cleanupCallback,
                getLogonCreds = getLogonCreds,
                getSupplementalCreds = getSupplementalCreds,
                getRedirectedLogonSid = getRedirectedLogonSid,
            )
    }
}

public data class SecpkgSerializedOid(
    public var oidLength: UInt = 0u,
    public var oidAttributes: UInt = 0u,
    public var oidValue: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecpkgSerializedOid) return false
        if (this.oidLength != other.oidLength) return false
        if (this.oidAttributes != other.oidAttributes) return false
        if (!this.oidValue.contentEquals(other.oidValue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.oidLength.hashCode()
        result = 31 * result + this.oidAttributes.hashCode()
        result = 31 * result + this.oidValue.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgSerializedOid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgSerializedOid> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SecpkgSerializedOid =
                    SecpkgSerializedOid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecpkgSerializedOid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.oidLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.oidAttributes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 8L, value.oidValue)
                }
            }
    }
}

public data class SecpkgShortVector(
    public var shortArrayOffset: UInt = 0u,
    public var shortArrayCount: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgShortVector> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgShortVector> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SecpkgShortVector =
                    SecpkgShortVector(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SecpkgShortVector) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.shortArrayOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.shortArrayCount)
                }
            }
    }
}

public class SecpkgSupplementalCred internal constructor(
    public var packageName: LsaUnicodeString,
    public var credentialSize: UInt,
    credentialsCtorArg: MutPtr<UByte>,
) {
    public var credentials: MutPtr<UByte> = credentialsCtorArg
        internal set

    public constructor() : this(
        packageName = LsaUnicodeString(),
        credentialSize = 0u,
        credentialsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): LsaUnicodeString = this.packageName

    public operator fun component2(): UInt = this.credentialSize

    public operator fun component3(): MutPtr<UByte> = this.credentials

    public fun copy(packageName: LsaUnicodeString = this.packageName, credentialSize: UInt = this.credentialSize, credentials: MutPtr<UByte> = this.credentials): SecpkgSupplementalCred = SecpkgSupplementalCred(packageName = packageName, credentialSize = credentialSize, credentialsCtorArg = credentials)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecpkgSupplementalCred) return false
        if (this.packageName != other.packageName) return false
        if (this.credentialSize != other.credentialSize) return false
        if (this.credentials != other.credentials) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.packageName.hashCode()
        result = 31 * result + this.credentialSize.hashCode()
        result = 31 * result + this.credentials.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            packageName: LsaUnicodeString = LsaUnicodeString(),
            credentialSize: UInt = 0u,
            credentials: MutPtr<UByte> = MutPtr(0L),
        ): SecpkgSupplementalCred =
            SecpkgSupplementalCred(
                packageName = packageName,
                credentialSize = credentialSize,
                credentialsCtorArg = credentials,
            )
    }
}

public data class SecpkgSupplementalCredArray(
    public var credentialCount: UInt = 0u,
    public var credentials: List<SecpkgSupplementalCred> = List(1) { SecpkgSupplementalCred() },
)

public data class SecpkgSuppliedCredential(
    public var cbHeaderLength: UShort = 0u,
    public var cbStructureLength: UShort = 0u,
    public var userName: SecpkgShortVector = SecpkgShortVector(),
    public var domainName: SecpkgShortVector = SecpkgShortVector(),
    public var packedCredentials: SecpkgByteVector = SecpkgByteVector(),
    public var credFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgSuppliedCredential> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgSuppliedCredential> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SecpkgSuppliedCredential =
                    SecpkgSuppliedCredential(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (SecpkgShortVector.typeLayout()).readNative(addr + 4L),
                        (SecpkgShortVector.typeLayout()).readNative(addr + 12L),
                        (SecpkgByteVector.typeLayout()).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: SecpkgSuppliedCredential) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cbHeaderLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.cbStructureLength)
                    (SecpkgShortVector.typeLayout()).writeNative(addr + 4L, value.userName)
                    (SecpkgShortVector.typeLayout()).writeNative(addr + 12L, value.domainName)
                    (SecpkgByteVector.typeLayout()).writeNative(addr + 20L, value.packedCredentials)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.credFlags)
                }
            }
    }
}

public class SecpkgSurrogateLogon internal constructor(
    public var version: UInt,
    public var surrogateLogonID: Luid,
    public var entryCount: UInt,
    entriesCtorArg: MutPtr<SecpkgSurrogateLogonEntry>,
) {
    public var entries: MutPtr<SecpkgSurrogateLogonEntry> = entriesCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        surrogateLogonID = Luid(),
        entryCount = 0u,
        entriesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): Luid = this.surrogateLogonID

    public operator fun component3(): UInt = this.entryCount

    public operator fun component4(): MutPtr<SecpkgSurrogateLogonEntry> = this.entries

    public fun copy(version: UInt = this.version, surrogateLogonID: Luid = this.surrogateLogonID, entryCount: UInt = this.entryCount, entries: MutPtr<SecpkgSurrogateLogonEntry> = this.entries): SecpkgSurrogateLogon = SecpkgSurrogateLogon(version = version, surrogateLogonID = surrogateLogonID, entryCount = entryCount, entriesCtorArg = entries)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecpkgSurrogateLogon) return false
        if (this.version != other.version) return false
        if (this.surrogateLogonID != other.surrogateLogonID) return false
        if (this.entryCount != other.entryCount) return false
        if (this.entries != other.entries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.surrogateLogonID.hashCode()
        result = 31 * result + this.entryCount.hashCode()
        result = 31 * result + this.entries.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            surrogateLogonID: Luid = Luid(),
            entryCount: UInt = 0u,
            entries: MutPtr<SecpkgSurrogateLogonEntry> = MutPtr(0L),
        ): SecpkgSurrogateLogon =
            SecpkgSurrogateLogon(
                version = version,
                surrogateLogonID = surrogateLogonID,
                entryCount = entryCount,
                entriesCtorArg = entries,
            )
    }
}

public class SecpkgSurrogateLogonEntry internal constructor(
    public var type: Guid,
    dataCtorArg: MutPtr<CVoid>,
) {
    public var data: MutPtr<CVoid> = dataCtorArg
        internal set

    public constructor() : this(
        type = Guid(),
        dataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.type

    public operator fun component2(): MutPtr<CVoid> = this.data

    public fun copy(type: Guid = this.type, data: MutPtr<CVoid> = this.data): SecpkgSurrogateLogonEntry = SecpkgSurrogateLogonEntry(type = type, dataCtorArg = data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecpkgSurrogateLogonEntry) return false
        if (this.type != other.type) return false
        if (this.data != other.data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.data.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            type: Guid = Guid(),
            data: MutPtr<CVoid> = MutPtr(0L),
        ): SecpkgSurrogateLogonEntry =
            SecpkgSurrogateLogonEntry(
                type = type,
                dataCtorArg = data,
            )
    }
}

public class SecpkgTargetinfo internal constructor(
    domainSidCtorArg: Psid,
    computerNameCtorArg: Pcwstr,
) {
    public var domainSid: Psid = domainSidCtorArg
        internal set

    public var computerName: Pcwstr = computerNameCtorArg
        internal set

    public constructor() : this(
        domainSidCtorArg = MutPtr(0L),
        computerNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Psid = this.domainSid

    public operator fun component2(): Pcwstr = this.computerName

    public fun copy(domainSid: Psid = this.domainSid, computerName: Pcwstr = this.computerName): SecpkgTargetinfo = SecpkgTargetinfo(domainSidCtorArg = domainSid, computerNameCtorArg = computerName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecpkgTargetinfo) return false
        if (this.domainSid != other.domainSid) return false
        if (this.computerName != other.computerName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.domainSid.hashCode()
        result = 31 * result + this.computerName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            domainSid: Psid = MutPtr(0L),
            computerName: Pcwstr = ConstPtr(0L),
        ): SecpkgTargetinfo =
            SecpkgTargetinfo(
                domainSidCtorArg = domainSid,
                computerNameCtorArg = computerName,
            )
    }
}

public data class SecpkgUserFunctionTable(
    public var instanceInit: SpInstanceInitFn = null,
    public var initUserModeContext: SpInitUserModeContextFn = null,
    public var makeSignature: SpMakeSignatureFn = null,
    public var verifySignature: SpVerifySignatureFn = null,
    public var sealMessage: SpSealMessageFn = null,
    public var unsealMessage: SpUnsealMessageFn = null,
    public var getContextToken: SpGetContextTokenFn = null,
    public var queryContextAttributesA: SpQueryContextAttributesFn = null,
    public var completeAuthToken: SpCompleteAuthTokenFn = null,
    public var deleteUserModeContext: SpDeleteContextFn = null,
    public var formatCredentials: SpFormatCredentialsFn = null,
    public var marshallSupplementalCreds: SpMarshallSupplementalCredsFn = null,
    public var exportContext: SpExportSecurityContextFn = null,
    public var importContext: SpImportSecurityContextFn = null,
    public var marshalAttributeData: SpMarshalAttributeDataFn = null,
)

public data class SecpkgWowClientDll(
    public var wowClientDllPath: SecurityString = SecurityString(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgWowClientDll> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecpkgWowClientDll> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SecpkgWowClientDll =
                    SecpkgWowClientDll(
                        (SecurityString.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecpkgWowClientDll) {
                    (SecurityString.typeLayout()).writeNative(addr, value.wowClientDllPath)
                }
            }
    }
}

public class SecurityLogonSessionData internal constructor(
    public var size: UInt,
    public var logonId: Luid,
    public var userName: LsaUnicodeString,
    public var logonDomain: LsaUnicodeString,
    public var authenticationPackage: LsaUnicodeString,
    public var logonType: UInt,
    public var session: UInt,
    sidCtorArg: Psid,
    public var logonTime: Long,
    public var logonServer: LsaUnicodeString,
    public var dnsDomainName: LsaUnicodeString,
    public var upn: LsaUnicodeString,
    public var userFlags: UInt,
    public var lastLogonInfo: LsaLastInterLogonInfo,
    public var logonScript: LsaUnicodeString,
    public var profilePath: LsaUnicodeString,
    public var homeDirectory: LsaUnicodeString,
    public var homeDirectoryDrive: LsaUnicodeString,
    public var logoffTime: Long,
    public var kickOffTime: Long,
    public var passwordLastSet: Long,
    public var passwordCanChange: Long,
    public var passwordMustChange: Long,
) {
    public var sid: Psid = sidCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        logonId = Luid(),
        userName = LsaUnicodeString(),
        logonDomain = LsaUnicodeString(),
        authenticationPackage = LsaUnicodeString(),
        logonType = 0u,
        session = 0u,
        sidCtorArg = MutPtr(0L),
        logonTime = 0L,
        logonServer = LsaUnicodeString(),
        dnsDomainName = LsaUnicodeString(),
        upn = LsaUnicodeString(),
        userFlags = 0u,
        lastLogonInfo = LsaLastInterLogonInfo(),
        logonScript = LsaUnicodeString(),
        profilePath = LsaUnicodeString(),
        homeDirectory = LsaUnicodeString(),
        homeDirectoryDrive = LsaUnicodeString(),
        logoffTime = 0L,
        kickOffTime = 0L,
        passwordLastSet = 0L,
        passwordCanChange = 0L,
        passwordMustChange = 0L,
    )

    public companion object {
        public operator fun invoke(
            size: UInt = 0u,
            logonId: Luid = Luid(),
            userName: LsaUnicodeString = LsaUnicodeString(),
            logonDomain: LsaUnicodeString = LsaUnicodeString(),
            authenticationPackage: LsaUnicodeString = LsaUnicodeString(),
            logonType: UInt = 0u,
            session: UInt = 0u,
            sid: Psid = MutPtr(0L),
            logonTime: Long = 0L,
            logonServer: LsaUnicodeString = LsaUnicodeString(),
            dnsDomainName: LsaUnicodeString = LsaUnicodeString(),
            upn: LsaUnicodeString = LsaUnicodeString(),
            userFlags: UInt = 0u,
            lastLogonInfo: LsaLastInterLogonInfo = LsaLastInterLogonInfo(),
            logonScript: LsaUnicodeString = LsaUnicodeString(),
            profilePath: LsaUnicodeString = LsaUnicodeString(),
            homeDirectory: LsaUnicodeString = LsaUnicodeString(),
            homeDirectoryDrive: LsaUnicodeString = LsaUnicodeString(),
            logoffTime: Long = 0L,
            kickOffTime: Long = 0L,
            passwordLastSet: Long = 0L,
            passwordCanChange: Long = 0L,
            passwordMustChange: Long = 0L,
        ): SecurityLogonSessionData =
            SecurityLogonSessionData(
                size = size,
                logonId = logonId,
                userName = userName,
                logonDomain = logonDomain,
                authenticationPackage = authenticationPackage,
                logonType = logonType,
                session = session,
                sidCtorArg = sid,
                logonTime = logonTime,
                logonServer = logonServer,
                dnsDomainName = dnsDomainName,
                upn = upn,
                userFlags = userFlags,
                lastLogonInfo = lastLogonInfo,
                logonScript = logonScript,
                profilePath = profilePath,
                homeDirectory = homeDirectory,
                homeDirectoryDrive = homeDirectoryDrive,
                logoffTime = logoffTime,
                kickOffTime = kickOffTime,
                passwordLastSet = passwordLastSet,
                passwordCanChange = passwordCanChange,
                passwordMustChange = passwordMustChange,
            )
    }
}

public data class SecurityLogonType(
    public var value: Int = 0,
) {
    public var field0: Int
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecurityLogonType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecurityLogonType> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SecurityLogonType =
                    SecurityLogonType(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecurityLogonType) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.value)
                }
            }

        public val UNDEFINED_LOGON_TYPE: SecurityLogonType = SecurityLogonType(0)

        public val INTERACTIVE: SecurityLogonType = SecurityLogonType(2)

        public val NETWORK: SecurityLogonType = SecurityLogonType(3)

        public val BATCH: SecurityLogonType = SecurityLogonType(4)

        public val SERVICE: SecurityLogonType = SecurityLogonType(5)

        public val PROXY: SecurityLogonType = SecurityLogonType(6)

        public val UNLOCK: SecurityLogonType = SecurityLogonType(7)

        public val NETWORK_CLEARTEXT: SecurityLogonType = SecurityLogonType(8)

        public val NEW_CREDENTIALS: SecurityLogonType = SecurityLogonType(9)

        public val REMOTE_INTERACTIVE: SecurityLogonType = SecurityLogonType(10)

        public val CACHED_INTERACTIVE: SecurityLogonType = SecurityLogonType(11)

        public val CACHED_REMOTE_INTERACTIVE: SecurityLogonType = SecurityLogonType(12)

        public val CACHED_UNLOCK: SecurityLogonType = SecurityLogonType(13)
    }
}

public class SecurityPackageOptions internal constructor(
    public var size: UInt,
    public var type: SecurityPackageOptionsType,
    public var flags: UInt,
    public var signatureSize: UInt,
    signatureCtorArg: MutPtr<CVoid>,
) {
    public var signature: MutPtr<CVoid> = signatureCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        type = 0u,
        flags = 0u,
        signatureSize = 0u,
        signatureCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): SecurityPackageOptionsType = this.type

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): UInt = this.signatureSize

    public operator fun component5(): MutPtr<CVoid> = this.signature

    public fun copy(size: UInt = this.size, type: SecurityPackageOptionsType = this.type, flags: UInt = this.flags, signatureSize: UInt = this.signatureSize, signature: MutPtr<CVoid> = this.signature): SecurityPackageOptions = SecurityPackageOptions(size = size, type = type, flags = flags, signatureSize = signatureSize, signatureCtorArg = signature)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecurityPackageOptions) return false
        if (this.size != other.size) return false
        if (this.type != other.type) return false
        if (this.flags != other.flags) return false
        if (this.signatureSize != other.signatureSize) return false
        if (this.signature != other.signature) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.signatureSize.hashCode()
        result = 31 * result + this.signature.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecurityPackageOptions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecurityPackageOptions> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SecurityPackageOptions =
                    SecurityPackageOptions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SecurityPackageOptions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.signatureSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.signature)
                }
            }

        public operator fun invoke(
            size: UInt = 0u,
            type: SecurityPackageOptionsType = 0u,
            flags: UInt = 0u,
            signatureSize: UInt = 0u,
            signature: MutPtr<CVoid> = MutPtr(0L),
        ): SecurityPackageOptions =
            SecurityPackageOptions(
                size = size,
                type = type,
                flags = flags,
                signatureSize = signatureSize,
                signatureCtorArg = signature,
            )
    }
}

public class SecurityString internal constructor(
    public var length: UShort,
    public var maximumLength: UShort,
    bufferCtorArg: MutPtr<UShort>,
) {
    public var buffer: MutPtr<UShort> = bufferCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        maximumLength = 0u,
        bufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.length

    public operator fun component2(): UShort = this.maximumLength

    public operator fun component3(): MutPtr<UShort> = this.buffer

    public fun copy(length: UShort = this.length, maximumLength: UShort = this.maximumLength, buffer: MutPtr<UShort> = this.buffer): SecurityString = SecurityString(length = length, maximumLength = maximumLength, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecurityString) return false
        if (this.length != other.length) return false
        if (this.maximumLength != other.maximumLength) return false
        if (this.buffer != other.buffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.maximumLength.hashCode()
        result = 31 * result + this.buffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecurityString> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecurityString> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SecurityString =
                    SecurityString(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecurityString) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.maximumLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 8L, value.buffer)
                }
            }

        public operator fun invoke(
            length: UShort = 0u,
            maximumLength: UShort = 0u,
            buffer: MutPtr<UShort> = MutPtr(0L),
        ): SecurityString =
            SecurityString(
                length = length,
                maximumLength = maximumLength,
                bufferCtorArg = buffer,
            )
    }
}

public class SecurityUserData internal constructor(
    public var userName: SecurityString,
    public var logonDomainName: SecurityString,
    public var logonServer: SecurityString,
    pSidCtorArg: Psid,
) {
    public var pSid: Psid = pSidCtorArg
        internal set

    public constructor() : this(
        userName = SecurityString(),
        logonDomainName = SecurityString(),
        logonServer = SecurityString(),
        pSidCtorArg = MutPtr(0L),
    )

    public operator fun component1(): SecurityString = this.userName

    public operator fun component2(): SecurityString = this.logonDomainName

    public operator fun component3(): SecurityString = this.logonServer

    public operator fun component4(): Psid = this.pSid

    public fun copy(userName: SecurityString = this.userName, logonDomainName: SecurityString = this.logonDomainName, logonServer: SecurityString = this.logonServer, pSid: Psid = this.pSid): SecurityUserData = SecurityUserData(userName = userName, logonDomainName = logonDomainName, logonServer = logonServer, pSidCtorArg = pSid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecurityUserData) return false
        if (this.userName != other.userName) return false
        if (this.logonDomainName != other.logonDomainName) return false
        if (this.logonServer != other.logonServer) return false
        if (this.pSid != other.pSid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.userName.hashCode()
        result = 31 * result + this.logonDomainName.hashCode()
        result = 31 * result + this.logonServer.hashCode()
        result = 31 * result + this.pSid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            userName: SecurityString = SecurityString(),
            logonDomainName: SecurityString = SecurityString(),
            logonServer: SecurityString = SecurityString(),
            pSid: Psid = MutPtr(0L),
        ): SecurityUserData =
            SecurityUserData(
                userName = userName,
                logonDomainName = logonDomainName,
                logonServer = logonServer,
                pSidCtorArg = pSid,
            )
    }
}

public data class SecApplicationProtocols(
    public var protocolListsSize: UInt = 0u,
    public var protocolLists: List<SecApplicationProtocolList> = List(1) { SecApplicationProtocolList() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecApplicationProtocols> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecApplicationProtocols> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SecApplicationProtocols =
                    SecApplicationProtocols(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(SecApplicationProtocolList.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SecApplicationProtocols) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.protocolListsSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(SecApplicationProtocolList.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.protocolLists)
                }
            }
    }
}

public data class SecApplicationProtocolList(
    public var protoNegoExt: SecApplicationProtocolNegotiationExt = 0,
    public var protocolListSize: UShort = 0u,
    public var protocolList: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecApplicationProtocolList) return false
        if (this.protoNegoExt != other.protoNegoExt) return false
        if (this.protocolListSize != other.protocolListSize) return false
        if (!this.protocolList.contentEquals(other.protocolList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.protoNegoExt.hashCode()
        result = 31 * result + this.protocolListSize.hashCode()
        result = 31 * result + this.protocolList.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecApplicationProtocolList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecApplicationProtocolList> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SecApplicationProtocolList =
                    SecApplicationProtocolList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: SecApplicationProtocolList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.protoNegoExt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.protocolListSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 6L, value.protocolList)
                }
            }
    }
}

public data class SecCertificateRequestContext(
    public var cbCertificateRequestContext: UByte = 0u,
    public var rgCertificateRequestContext: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecCertificateRequestContext) return false
        if (this.cbCertificateRequestContext != other.cbCertificateRequestContext) return false
        if (!this.rgCertificateRequestContext.contentEquals(other.rgCertificateRequestContext)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbCertificateRequestContext.hashCode()
        result = 31 * result + this.rgCertificateRequestContext.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecCertificateRequestContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecCertificateRequestContext> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SecCertificateRequestContext =
                    SecCertificateRequestContext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: SecCertificateRequestContext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.cbCertificateRequestContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 1L, value.rgCertificateRequestContext)
                }
            }
    }
}

public data class SecChannelBindings(
    public var dwInitiatorAddrType: UInt = 0u,
    public var cbInitiatorLength: UInt = 0u,
    public var dwInitiatorOffset: UInt = 0u,
    public var dwAcceptorAddrType: UInt = 0u,
    public var cbAcceptorLength: UInt = 0u,
    public var dwAcceptorOffset: UInt = 0u,
    public var cbApplicationDataLength: UInt = 0u,
    public var dwApplicationDataOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecChannelBindings> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecChannelBindings> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SecChannelBindings =
                    SecChannelBindings(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: SecChannelBindings) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwInitiatorAddrType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbInitiatorLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwInitiatorOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwAcceptorAddrType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbAcceptorLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwAcceptorOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cbApplicationDataLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwApplicationDataOffset)
                }
            }
    }
}

public data class SecChannelBindingsEx(
    public var magicNumber: UInt = 0u,
    public var flags: UInt = 0u,
    public var cbHeaderLength: UInt = 0u,
    public var cbStructureLength: UInt = 0u,
    public var dwInitiatorAddrType: UInt = 0u,
    public var cbInitiatorLength: UInt = 0u,
    public var dwInitiatorOffset: UInt = 0u,
    public var dwAcceptorAddrType: UInt = 0u,
    public var cbAcceptorLength: UInt = 0u,
    public var dwAcceptorOffset: UInt = 0u,
    public var cbApplicationDataLength: UInt = 0u,
    public var dwApplicationDataOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecChannelBindingsEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecChannelBindingsEx> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SecChannelBindingsEx =
                    SecChannelBindingsEx(
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
                    )
                override fun writeNative(addr: Long, value: SecChannelBindingsEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.magicNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbHeaderLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbStructureLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwInitiatorAddrType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cbInitiatorLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwInitiatorOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwAcceptorAddrType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cbAcceptorLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwAcceptorOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.cbApplicationDataLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwApplicationDataOffset)
                }
            }
    }
}

public data class SecChannelBindingsResult(
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecChannelBindingsResult> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecChannelBindingsResult> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SecChannelBindingsResult =
                    SecChannelBindingsResult(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecChannelBindingsResult) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                }
            }
    }
}

public data class SecDtlsMtu(
    public var pathMTU: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecDtlsMtu> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecDtlsMtu> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): SecDtlsMtu =
                    SecDtlsMtu(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SecDtlsMtu) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.pathMTU)
                }
            }
    }
}

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

public data class SecPresharedkeyIdentity(
    public var keyIdentitySize: UShort = 0u,
    public var keyIdentity: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPresharedkeyIdentity) return false
        if (this.keyIdentitySize != other.keyIdentitySize) return false
        if (!this.keyIdentity.contentEquals(other.keyIdentity)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyIdentitySize.hashCode()
        result = 31 * result + this.keyIdentity.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPresharedkeyIdentity> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPresharedkeyIdentity> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): SecPresharedkeyIdentity =
                    SecPresharedkeyIdentity(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: SecPresharedkeyIdentity) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.keyIdentitySize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 2L, value.keyIdentity)
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

public data class SecSrtpProtectionProfiles(
    public var profilesSize: UShort = 0u,
    public var profilesList: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecSrtpProtectionProfiles) return false
        if (this.profilesSize != other.profilesSize) return false
        if (!this.profilesList.contentEquals(other.profilesList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.profilesSize.hashCode()
        result = 31 * result + this.profilesList.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecSrtpProtectionProfiles> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecSrtpProtectionProfiles> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): SecSrtpProtectionProfiles =
                    SecSrtpProtectionProfiles(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: SecSrtpProtectionProfiles) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.profilesSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 2L, value.profilesList)
                }
            }
    }
}

public data class SecTokenBinding(
    public var majorVersion: UByte = 0u,
    public var minorVersion: UByte = 0u,
    public var keyParametersSize: UShort = 0u,
    public var keyParameters: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecTokenBinding) return false
        if (this.majorVersion != other.majorVersion) return false
        if (this.minorVersion != other.minorVersion) return false
        if (this.keyParametersSize != other.keyParametersSize) return false
        if (!this.keyParameters.contentEquals(other.keyParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.majorVersion.hashCode()
        result = 31 * result + this.minorVersion.hashCode()
        result = 31 * result + this.keyParametersSize.hashCode()
        result = 31 * result + this.keyParameters.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecTokenBinding> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecTokenBinding> {
                override val sizeBytes: Long = 6L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): SecTokenBinding =
                    SecTokenBinding(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SecTokenBinding) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.keyParametersSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.keyParameters)
                }
            }
    }
}

public data class SecTrafficSecrets(
    public var symmetricAlgId: UShortArray = UShortArray(64),
    public var chainingMode: UShortArray = UShortArray(64),
    public var hashAlgId: UShortArray = UShortArray(64),
    public var keySize: UShort = 0u,
    public var ivSize: UShort = 0u,
    public var msgSequenceStart: UShort = 0u,
    public var msgSequenceEnd: UShort = 0u,
    public var trafficSecretType: SecTrafficSecretType = 0,
    public var trafficSecretSize: UShort = 0u,
    public var trafficSecret: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecTrafficSecrets) return false
        if (!this.symmetricAlgId.contentEquals(other.symmetricAlgId)) return false
        if (!this.chainingMode.contentEquals(other.chainingMode)) return false
        if (!this.hashAlgId.contentEquals(other.hashAlgId)) return false
        if (this.keySize != other.keySize) return false
        if (this.ivSize != other.ivSize) return false
        if (this.msgSequenceStart != other.msgSequenceStart) return false
        if (this.msgSequenceEnd != other.msgSequenceEnd) return false
        if (this.trafficSecretType != other.trafficSecretType) return false
        if (this.trafficSecretSize != other.trafficSecretSize) return false
        if (!this.trafficSecret.contentEquals(other.trafficSecret)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.symmetricAlgId.contentHashCode()
        result = 31 * result + this.chainingMode.contentHashCode()
        result = 31 * result + this.hashAlgId.contentHashCode()
        result = 31 * result + this.keySize.hashCode()
        result = 31 * result + this.ivSize.hashCode()
        result = 31 * result + this.msgSequenceStart.hashCode()
        result = 31 * result + this.msgSequenceEnd.hashCode()
        result = 31 * result + this.trafficSecretType.hashCode()
        result = 31 * result + this.trafficSecretSize.hashCode()
        result = 31 * result + this.trafficSecret.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecTrafficSecrets> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecTrafficSecrets> {
                override val sizeBytes: Long = 400L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SecTrafficSecrets =
                    SecTrafficSecrets(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 128L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 256L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 384L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 386L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 388L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 390L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 392L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 396L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 398L),
                    )
                override fun writeNative(addr: Long, value: SecTrafficSecrets) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr, value.symmetricAlgId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 128L, value.chainingMode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 256L, value.hashAlgId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 384L, value.keySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 386L, value.ivSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 388L, value.msgSequenceStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 390L, value.msgSequenceEnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 392L, value.trafficSecretType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 396L, value.trafficSecretSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 398L, value.trafficSecret)
                }
            }
    }
}

public data class SecWinntAuthIdentity32(
    public var user: UInt = 0u,
    public var userLength: UInt = 0u,
    public var domain: UInt = 0u,
    public var domainLength: UInt = 0u,
    public var password: UInt = 0u,
    public var passwordLength: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecWinntAuthIdentity32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecWinntAuthIdentity32> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SecWinntAuthIdentity32 =
                    SecWinntAuthIdentity32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SecWinntAuthIdentity32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.user)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.userLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.domain)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.domainLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.password)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.passwordLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.flags)
                }
            }
    }
}

public data class SecWinntAuthIdentityEx2(
    public var version: UInt = 0u,
    public var cbHeaderLength: UShort = 0u,
    public var cbStructureLength: UInt = 0u,
    public var userOffset: UInt = 0u,
    public var userLength: UShort = 0u,
    public var domainOffset: UInt = 0u,
    public var domainLength: UShort = 0u,
    public var packedCredentialsOffset: UInt = 0u,
    public var packedCredentialsLength: UShort = 0u,
    public var flags: UInt = 0u,
    public var packageListOffset: UInt = 0u,
    public var packageListLength: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecWinntAuthIdentityEx2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecWinntAuthIdentityEx2> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SecWinntAuthIdentityEx2 =
                    SecWinntAuthIdentityEx2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: SecWinntAuthIdentityEx2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.cbHeaderLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbStructureLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.userOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.userLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.domainOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.domainLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.packedCredentialsOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 32L, value.packedCredentialsLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.packageListOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 44L, value.packageListLength)
                }
            }
    }
}

public data class SecWinntAuthIdentityEx32(
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var user: UInt = 0u,
    public var userLength: UInt = 0u,
    public var domain: UInt = 0u,
    public var domainLength: UInt = 0u,
    public var password: UInt = 0u,
    public var passwordLength: UInt = 0u,
    public var flags: UInt = 0u,
    public var packageList: UInt = 0u,
    public var packageListLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecWinntAuthIdentityEx32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecWinntAuthIdentityEx32> {
                override val sizeBytes: Long = 44L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SecWinntAuthIdentityEx32 =
                    SecWinntAuthIdentityEx32(
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
                    )
                override fun writeNative(addr: Long, value: SecWinntAuthIdentityEx32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.user)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.userLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.domain)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.domainLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.password)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.passwordLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.packageList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.packageListLength)
                }
            }
    }
}

public class SecWinntAuthIdentityExa internal constructor(
    public var version: UInt,
    public var length: UInt,
    userCtorArg: MutPtr<UByte>,
    public var userLength: UInt,
    domainCtorArg: MutPtr<UByte>,
    public var domainLength: UInt,
    passwordCtorArg: MutPtr<UByte>,
    public var passwordLength: UInt,
    public var flags: UInt,
    packageListCtorArg: MutPtr<UByte>,
    public var packageListLength: UInt,
) {
    public var user: MutPtr<UByte> = userCtorArg
        internal set

    public var domain: MutPtr<UByte> = domainCtorArg
        internal set

    public var password: MutPtr<UByte> = passwordCtorArg
        internal set

    public var packageList: MutPtr<UByte> = packageListCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        length = 0u,
        userCtorArg = MutPtr(0L),
        userLength = 0u,
        domainCtorArg = MutPtr(0L),
        domainLength = 0u,
        passwordCtorArg = MutPtr(0L),
        passwordLength = 0u,
        flags = 0u,
        packageListCtorArg = MutPtr(0L),
        packageListLength = 0u,
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UInt = this.length

    public operator fun component3(): MutPtr<UByte> = this.user

    public operator fun component4(): UInt = this.userLength

    public operator fun component5(): MutPtr<UByte> = this.domain

    public operator fun component6(): UInt = this.domainLength

    public operator fun component7(): MutPtr<UByte> = this.password

    public operator fun component8(): UInt = this.passwordLength

    public operator fun component9(): UInt = this.flags

    public operator fun component10(): MutPtr<UByte> = this.packageList

    public operator fun component11(): UInt = this.packageListLength

    public fun copy(version: UInt = this.version, length: UInt = this.length, user: MutPtr<UByte> = this.user, userLength: UInt = this.userLength, domain: MutPtr<UByte> = this.domain, domainLength: UInt = this.domainLength, password: MutPtr<UByte> = this.password, passwordLength: UInt = this.passwordLength, flags: UInt = this.flags, packageList: MutPtr<UByte> = this.packageList, packageListLength: UInt = this.packageListLength): SecWinntAuthIdentityExa = SecWinntAuthIdentityExa(version = version, length = length, userCtorArg = user, userLength = userLength, domainCtorArg = domain, domainLength = domainLength, passwordCtorArg = password, passwordLength = passwordLength, flags = flags, packageListCtorArg = packageList, packageListLength = packageListLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecWinntAuthIdentityExa) return false
        if (this.version != other.version) return false
        if (this.length != other.length) return false
        if (this.user != other.user) return false
        if (this.userLength != other.userLength) return false
        if (this.domain != other.domain) return false
        if (this.domainLength != other.domainLength) return false
        if (this.password != other.password) return false
        if (this.passwordLength != other.passwordLength) return false
        if (this.flags != other.flags) return false
        if (this.packageList != other.packageList) return false
        if (this.packageListLength != other.packageListLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.user.hashCode()
        result = 31 * result + this.userLength.hashCode()
        result = 31 * result + this.domain.hashCode()
        result = 31 * result + this.domainLength.hashCode()
        result = 31 * result + this.password.hashCode()
        result = 31 * result + this.passwordLength.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.packageList.hashCode()
        result = 31 * result + this.packageListLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecWinntAuthIdentityExa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecWinntAuthIdentityExa> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SecWinntAuthIdentityExa =
                    SecWinntAuthIdentityExa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: SecWinntAuthIdentityExa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.user)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.userLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 24L, value.domain)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.domainLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 40L, value.password)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.passwordLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 56L, value.packageList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.packageListLength)
                }
            }

        public operator fun invoke(
            version: UInt = 0u,
            length: UInt = 0u,
            user: MutPtr<UByte> = MutPtr(0L),
            userLength: UInt = 0u,
            domain: MutPtr<UByte> = MutPtr(0L),
            domainLength: UInt = 0u,
            password: MutPtr<UByte> = MutPtr(0L),
            passwordLength: UInt = 0u,
            flags: UInt = 0u,
            packageList: MutPtr<UByte> = MutPtr(0L),
            packageListLength: UInt = 0u,
        ): SecWinntAuthIdentityExa =
            SecWinntAuthIdentityExa(
                version = version,
                length = length,
                userCtorArg = user,
                userLength = userLength,
                domainCtorArg = domain,
                domainLength = domainLength,
                passwordCtorArg = password,
                passwordLength = passwordLength,
                flags = flags,
                packageListCtorArg = packageList,
                packageListLength = packageListLength,
            )
    }
}

public class SecWinntAuthIdentityExw internal constructor(
    public var version: UInt,
    public var length: UInt,
    userCtorArg: MutPtr<UShort>,
    public var userLength: UInt,
    domainCtorArg: MutPtr<UShort>,
    public var domainLength: UInt,
    passwordCtorArg: MutPtr<UShort>,
    public var passwordLength: UInt,
    public var flags: UInt,
    packageListCtorArg: MutPtr<UShort>,
    public var packageListLength: UInt,
) {
    public var user: MutPtr<UShort> = userCtorArg
        internal set

    public var domain: MutPtr<UShort> = domainCtorArg
        internal set

    public var password: MutPtr<UShort> = passwordCtorArg
        internal set

    public var packageList: MutPtr<UShort> = packageListCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        length = 0u,
        userCtorArg = MutPtr(0L),
        userLength = 0u,
        domainCtorArg = MutPtr(0L),
        domainLength = 0u,
        passwordCtorArg = MutPtr(0L),
        passwordLength = 0u,
        flags = 0u,
        packageListCtorArg = MutPtr(0L),
        packageListLength = 0u,
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UInt = this.length

    public operator fun component3(): MutPtr<UShort> = this.user

    public operator fun component4(): UInt = this.userLength

    public operator fun component5(): MutPtr<UShort> = this.domain

    public operator fun component6(): UInt = this.domainLength

    public operator fun component7(): MutPtr<UShort> = this.password

    public operator fun component8(): UInt = this.passwordLength

    public operator fun component9(): UInt = this.flags

    public operator fun component10(): MutPtr<UShort> = this.packageList

    public operator fun component11(): UInt = this.packageListLength

    public fun copy(version: UInt = this.version, length: UInt = this.length, user: MutPtr<UShort> = this.user, userLength: UInt = this.userLength, domain: MutPtr<UShort> = this.domain, domainLength: UInt = this.domainLength, password: MutPtr<UShort> = this.password, passwordLength: UInt = this.passwordLength, flags: UInt = this.flags, packageList: MutPtr<UShort> = this.packageList, packageListLength: UInt = this.packageListLength): SecWinntAuthIdentityExw = SecWinntAuthIdentityExw(version = version, length = length, userCtorArg = user, userLength = userLength, domainCtorArg = domain, domainLength = domainLength, passwordCtorArg = password, passwordLength = passwordLength, flags = flags, packageListCtorArg = packageList, packageListLength = packageListLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecWinntAuthIdentityExw) return false
        if (this.version != other.version) return false
        if (this.length != other.length) return false
        if (this.user != other.user) return false
        if (this.userLength != other.userLength) return false
        if (this.domain != other.domain) return false
        if (this.domainLength != other.domainLength) return false
        if (this.password != other.password) return false
        if (this.passwordLength != other.passwordLength) return false
        if (this.flags != other.flags) return false
        if (this.packageList != other.packageList) return false
        if (this.packageListLength != other.packageListLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.user.hashCode()
        result = 31 * result + this.userLength.hashCode()
        result = 31 * result + this.domain.hashCode()
        result = 31 * result + this.domainLength.hashCode()
        result = 31 * result + this.password.hashCode()
        result = 31 * result + this.passwordLength.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.packageList.hashCode()
        result = 31 * result + this.packageListLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecWinntAuthIdentityExw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecWinntAuthIdentityExw> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SecWinntAuthIdentityExw =
                    SecWinntAuthIdentityExw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: SecWinntAuthIdentityExw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 8L, value.user)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.userLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 24L, value.domain)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.domainLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 40L, value.password)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.passwordLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 56L, value.packageList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.packageListLength)
                }
            }

        public operator fun invoke(
            version: UInt = 0u,
            length: UInt = 0u,
            user: MutPtr<UShort> = MutPtr(0L),
            userLength: UInt = 0u,
            domain: MutPtr<UShort> = MutPtr(0L),
            domainLength: UInt = 0u,
            password: MutPtr<UShort> = MutPtr(0L),
            passwordLength: UInt = 0u,
            flags: UInt = 0u,
            packageList: MutPtr<UShort> = MutPtr(0L),
            packageListLength: UInt = 0u,
        ): SecWinntAuthIdentityExw =
            SecWinntAuthIdentityExw(
                version = version,
                length = length,
                userCtorArg = user,
                userLength = userLength,
                domainCtorArg = domain,
                domainLength = domainLength,
                passwordCtorArg = password,
                passwordLength = passwordLength,
                flags = flags,
                packageListCtorArg = packageList,
                packageListLength = packageListLength,
            )
    }
}

public data class SecWinntAuthIdentityInfo(
    public var authIdExw: SecWinntAuthIdentityExw = SecWinntAuthIdentityExw(),
    public var authIdExa: SecWinntAuthIdentityExa = SecWinntAuthIdentityExa(),
    public var authIdA: SecWinntAuthIdentityA = SecWinntAuthIdentityA(),
    public var authIdW: SecWinntAuthIdentityW = SecWinntAuthIdentityW(),
    public var authIdEx2: SecWinntAuthIdentityEx2 = SecWinntAuthIdentityEx2(),
)

public data class SendGenericTlsExtension(
    public var extensionType: UShort = 0u,
    public var handshakeType: UShort = 0u,
    public var flags: UInt = 0u,
    public var bufferSize: UShort = 0u,
    public var buffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SendGenericTlsExtension) return false
        if (this.extensionType != other.extensionType) return false
        if (this.handshakeType != other.handshakeType) return false
        if (this.flags != other.flags) return false
        if (this.bufferSize != other.bufferSize) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.extensionType.hashCode()
        result = 31 * result + this.handshakeType.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SendGenericTlsExtension> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SendGenericTlsExtension> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SendGenericTlsExtension =
                    SendGenericTlsExtension(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: SendGenericTlsExtension) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.extensionType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.handshakeType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.bufferSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 10L, value.buffer)
                }
            }
    }
}

public class SeAdtAccessReason internal constructor(
    public var accessMask: UInt,
    public var accessReasons: UIntArray,
    public var objectTypeIndex: UInt,
    public var accessGranted: UInt,
    securityDescriptorCtorArg: PsecurityDescriptor,
) {
    public var securityDescriptor: PsecurityDescriptor = securityDescriptorCtorArg
        internal set

    public constructor() : this(
        accessMask = 0u,
        accessReasons = UIntArray(32),
        objectTypeIndex = 0u,
        accessGranted = 0u,
        securityDescriptorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.accessMask

    public operator fun component2(): UIntArray = this.accessReasons

    public operator fun component3(): UInt = this.objectTypeIndex

    public operator fun component4(): UInt = this.accessGranted

    public operator fun component5(): PsecurityDescriptor = this.securityDescriptor

    public fun copy(accessMask: UInt = this.accessMask, accessReasons: UIntArray = this.accessReasons, objectTypeIndex: UInt = this.objectTypeIndex, accessGranted: UInt = this.accessGranted, securityDescriptor: PsecurityDescriptor = this.securityDescriptor): SeAdtAccessReason = SeAdtAccessReason(accessMask = accessMask, accessReasons = accessReasons, objectTypeIndex = objectTypeIndex, accessGranted = accessGranted, securityDescriptorCtorArg = securityDescriptor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SeAdtAccessReason) return false
        if (this.accessMask != other.accessMask) return false
        if (!this.accessReasons.contentEquals(other.accessReasons)) return false
        if (this.objectTypeIndex != other.objectTypeIndex) return false
        if (this.accessGranted != other.accessGranted) return false
        if (this.securityDescriptor != other.securityDescriptor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.accessMask.hashCode()
        result = 31 * result + this.accessReasons.contentHashCode()
        result = 31 * result + this.objectTypeIndex.hashCode()
        result = 31 * result + this.accessGranted.hashCode()
        result = 31 * result + this.securityDescriptor.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            accessMask: UInt = 0u,
            accessReasons: UIntArray = UIntArray(32),
            objectTypeIndex: UInt = 0u,
            accessGranted: UInt = 0u,
            securityDescriptor: PsecurityDescriptor = MutPtr(0L),
        ): SeAdtAccessReason =
            SeAdtAccessReason(
                accessMask = accessMask,
                accessReasons = accessReasons,
                objectTypeIndex = objectTypeIndex,
                accessGranted = accessGranted,
                securityDescriptorCtorArg = securityDescriptor,
            )
    }
}

public class SeAdtClaims internal constructor(
    public var length: UInt,
    claimsCtorArg: MutPtr<CVoid>,
) {
    public var claims: MutPtr<CVoid> = claimsCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        claimsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): MutPtr<CVoid> = this.claims

    public fun copy(length: UInt = this.length, claims: MutPtr<CVoid> = this.claims): SeAdtClaims = SeAdtClaims(length = length, claimsCtorArg = claims)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SeAdtClaims) return false
        if (this.length != other.length) return false
        if (this.claims != other.claims) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.claims.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeAdtClaims> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeAdtClaims> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SeAdtClaims =
                    SeAdtClaims(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SeAdtClaims) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.claims)
                }
            }

        public operator fun invoke(
            length: UInt = 0u,
            claims: MutPtr<CVoid> = MutPtr(0L),
        ): SeAdtClaims =
            SeAdtClaims(
                length = length,
                claimsCtorArg = claims,
            )
    }
}

public data class SeAdtObjectType(
    public var objectType: Guid = Guid(),
    public var flags: UShort = 0u,
    public var level: UShort = 0u,
    public var accessMask: UInt = 0u,
)

public data class SeAdtParameterArray(
    public var categoryId: UInt = 0u,
    public var auditId: UInt = 0u,
    public var parameterCount: UInt = 0u,
    public var length: UInt = 0u,
    public var flatSubCategoryId: UShort = 0u,
    public var type: UShort = 0u,
    public var flags: UInt = 0u,
    public var parameters: List<SeAdtParameterArrayEntry> = List(32) { SeAdtParameterArrayEntry() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeAdtParameterArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeAdtParameterArray> {
                override val sizeBytes: Long = 1048L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SeAdtParameterArray =
                    SeAdtParameterArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(SeAdtParameterArrayEntry.typeLayout(), (32).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SeAdtParameterArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.categoryId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.auditId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.parameterCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.flatSubCategoryId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(SeAdtParameterArrayEntry.typeLayout(), (32).toInt())
                    ).writeNative(addr + 24L, value.parameters)
                }
            }
    }
}

public class SeAdtParameterArrayEntry internal constructor(
    public var type: SeAdtParameterType,
    public var length: UInt,
    public var data: IntArray,
    addressCtorArg: MutPtr<CVoid>,
) {
    public var address: MutPtr<CVoid> = addressCtorArg
        internal set

    public constructor() : this(
        type = 0,
        length = 0u,
        data = IntArray(2),
        addressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): SeAdtParameterType = this.type

    public operator fun component2(): UInt = this.length

    public operator fun component3(): IntArray = this.data

    public operator fun component4(): MutPtr<CVoid> = this.address

    public fun copy(type: SeAdtParameterType = this.type, length: UInt = this.length, data: IntArray = this.data, address: MutPtr<CVoid> = this.address): SeAdtParameterArrayEntry = SeAdtParameterArrayEntry(type = type, length = length, data = data, addressCtorArg = address)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SeAdtParameterArrayEntry) return false
        if (this.type != other.type) return false
        if (this.length != other.length) return false
        if (!this.data.contentEquals(other.data)) return false
        if (this.address != other.address) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.data.contentHashCode()
        result = 31 * result + this.address.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeAdtParameterArrayEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeAdtParameterArrayEntry> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SeAdtParameterArrayEntry =
                    SeAdtParameterArrayEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (2).toInt())
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SeAdtParameterArrayEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (2).toInt())
                    ).writeNative(addr + 8L, value.data)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.address)
                }
            }

        public operator fun invoke(
            type: SeAdtParameterType = 0,
            length: UInt = 0u,
            data: IntArray = IntArray(2),
            address: MutPtr<CVoid> = MutPtr(0L),
        ): SeAdtParameterArrayEntry =
            SeAdtParameterArrayEntry(
                type = type,
                length = length,
                data = data,
                addressCtorArg = address,
            )
    }
}

public data class SeAdtParameterArrayEx(
    public var categoryId: UInt = 0u,
    public var auditId: UInt = 0u,
    public var version: UInt = 0u,
    public var parameterCount: UInt = 0u,
    public var length: UInt = 0u,
    public var flatSubCategoryId: UShort = 0u,
    public var type: UShort = 0u,
    public var flags: UInt = 0u,
    public var parameters: List<SeAdtParameterArrayEntry> = List(32) { SeAdtParameterArrayEntry() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeAdtParameterArrayEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SeAdtParameterArrayEx> {
                override val sizeBytes: Long = 1056L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SeAdtParameterArrayEx =
                    SeAdtParameterArrayEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(SeAdtParameterArrayEntry.typeLayout(), (32).toInt())
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: SeAdtParameterArrayEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.categoryId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.auditId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.parameterCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.flatSubCategoryId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(SeAdtParameterArrayEntry.typeLayout(), (32).toInt())
                    ).writeNative(addr + 32L, value.parameters)
                }
            }
    }
}

public data class SlActivationInfoHeader(
    public var cbSize: UInt = 0u,
    public var type: SlActivationType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SlActivationInfoHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SlActivationInfoHeader> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SlActivationInfoHeader =
                    SlActivationInfoHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SlActivationInfoHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.type)
                }
            }
    }
}

public class SlAdActivationInfo internal constructor(
    public var header: SlActivationInfoHeader,
    pwszProductKeyCtorArg: Pcwstr,
    pwszActivationObjectNameCtorArg: Pcwstr,
) {
    public var pwszProductKey: Pcwstr = pwszProductKeyCtorArg
        internal set

    public var pwszActivationObjectName: Pcwstr = pwszActivationObjectNameCtorArg
        internal set

    public constructor() : this(
        header = SlActivationInfoHeader(),
        pwszProductKeyCtorArg = ConstPtr(0L),
        pwszActivationObjectNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): SlActivationInfoHeader = this.header

    public operator fun component2(): Pcwstr = this.pwszProductKey

    public operator fun component3(): Pcwstr = this.pwszActivationObjectName

    public fun copy(header: SlActivationInfoHeader = this.header, pwszProductKey: Pcwstr = this.pwszProductKey, pwszActivationObjectName: Pcwstr = this.pwszActivationObjectName): SlAdActivationInfo = SlAdActivationInfo(header = header, pwszProductKeyCtorArg = pwszProductKey, pwszActivationObjectNameCtorArg = pwszActivationObjectName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SlAdActivationInfo) return false
        if (this.header != other.header) return false
        if (this.pwszProductKey != other.pwszProductKey) return false
        if (this.pwszActivationObjectName != other.pwszActivationObjectName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.pwszProductKey.hashCode()
        result = 31 * result + this.pwszActivationObjectName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            header: SlActivationInfoHeader = SlActivationInfoHeader(),
            pwszProductKey: Pcwstr = ConstPtr(0L),
            pwszActivationObjectName: Pcwstr = ConstPtr(0L),
        ): SlAdActivationInfo =
            SlAdActivationInfo(
                header = header,
                pwszProductKeyCtorArg = pwszProductKey,
                pwszActivationObjectNameCtorArg = pwszActivationObjectName,
            )
    }
}

public data class SlLicensingStatus(
    public var skuId: Guid = Guid(),
    public var eStatus: Sllicensingstatus = 0,
    public var dwGraceTime: UInt = 0u,
    public var dwTotalGraceDays: UInt = 0u,
    public var hrReason: Hresult = 0,
    public var qwValidityExpiration: ULong = 0uL,
)
