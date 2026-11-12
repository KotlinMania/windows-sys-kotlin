@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptIntegerBlob
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip.SipIndirectData

public data class CatalogInfo(
    public var cbStruct: UInt = 0u,
    public var wszCatalogFile: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CatalogInfo) return false
        if (this.cbStruct != other.cbStruct) return false
        if (!this.wszCatalogFile.contentEquals(other.wszCatalogFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.wszCatalogFile.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CatalogInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CatalogInfo> {
                override val sizeBytes: Long = 524L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): CatalogInfo =
                    CatalogInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CatalogInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 4L, value.wszCatalogFile)
                }
            }
    }
}

public class Cryptcatattribute internal constructor(
    public var cbStruct: UInt,
    pwszReferenceTagCtorArg: Pwstr,
    public var dwAttrTypeAndAction: CryptcatattributeFlags,
    public var cbValue: UInt,
    pbValueCtorArg: MutPtr<UByte>,
    public var dwReserved: UInt,
) {
    public var pwszReferenceTag: Pwstr = pwszReferenceTagCtorArg
        internal set

    public var pbValue: MutPtr<UByte> = pbValueCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        pwszReferenceTagCtorArg = MutPtr(0L),
        dwAttrTypeAndAction = 0u,
        cbValue = 0u,
        pbValueCtorArg = MutPtr(0L),
        dwReserved = 0u,
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Pwstr = this.pwszReferenceTag

    public operator fun component3(): CryptcatattributeFlags = this.dwAttrTypeAndAction

    public operator fun component4(): UInt = this.cbValue

    public operator fun component5(): MutPtr<UByte> = this.pbValue

    public operator fun component6(): UInt = this.dwReserved

    public fun copy(cbStruct: UInt = this.cbStruct, pwszReferenceTag: Pwstr = this.pwszReferenceTag, dwAttrTypeAndAction: CryptcatattributeFlags = this.dwAttrTypeAndAction, cbValue: UInt = this.cbValue, pbValue: MutPtr<UByte> = this.pbValue, dwReserved: UInt = this.dwReserved): Cryptcatattribute = Cryptcatattribute(cbStruct = cbStruct, pwszReferenceTagCtorArg = pwszReferenceTag, dwAttrTypeAndAction = dwAttrTypeAndAction, cbValue = cbValue, pbValueCtorArg = pbValue, dwReserved = dwReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cryptcatattribute) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.pwszReferenceTag != other.pwszReferenceTag) return false
        if (this.dwAttrTypeAndAction != other.dwAttrTypeAndAction) return false
        if (this.cbValue != other.cbValue) return false
        if (this.pbValue != other.pbValue) return false
        if (this.dwReserved != other.dwReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.pwszReferenceTag.hashCode()
        result = 31 * result + this.dwAttrTypeAndAction.hashCode()
        result = 31 * result + this.cbValue.hashCode()
        result = 31 * result + this.pbValue.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            pwszReferenceTag: Pwstr = MutPtr(0L),
            dwAttrTypeAndAction: CryptcatattributeFlags = 0u,
            cbValue: UInt = 0u,
            pbValue: MutPtr<UByte> = MutPtr(0L),
            dwReserved: UInt = 0u,
        ): Cryptcatattribute =
            Cryptcatattribute(
                cbStruct = cbStruct,
                pwszReferenceTagCtorArg = pwszReferenceTag,
                dwAttrTypeAndAction = dwAttrTypeAndAction,
                cbValue = cbValue,
                pbValueCtorArg = pbValue,
                dwReserved = dwReserved,
            )
    }
}

public class Cryptcatcdf internal constructor(
    public var cbStruct: UInt,
    hFileCtorArg: Handle,
    public var dwCurFilePos: UInt,
    public var dwLastMemberOffset: UInt,
    public var fEOF: Bool,
    pwszResultDirCtorArg: Pwstr,
    hCATStoreCtorArg: Handle,
) {
    public var hFile: Handle = hFileCtorArg
        internal set

    public var pwszResultDir: Pwstr = pwszResultDirCtorArg
        internal set

    public var hCATStore: Handle = hCATStoreCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        hFileCtorArg = MutPtr(0L),
        dwCurFilePos = 0u,
        dwLastMemberOffset = 0u,
        fEOF = 0,
        pwszResultDirCtorArg = MutPtr(0L),
        hCATStoreCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Handle = this.hFile

    public operator fun component3(): UInt = this.dwCurFilePos

    public operator fun component4(): UInt = this.dwLastMemberOffset

    public operator fun component5(): Bool = this.fEOF

    public operator fun component6(): Pwstr = this.pwszResultDir

    public operator fun component7(): Handle = this.hCATStore

    public fun copy(cbStruct: UInt = this.cbStruct, hFile: Handle = this.hFile, dwCurFilePos: UInt = this.dwCurFilePos, dwLastMemberOffset: UInt = this.dwLastMemberOffset, fEOF: Bool = this.fEOF, pwszResultDir: Pwstr = this.pwszResultDir, hCATStore: Handle = this.hCATStore): Cryptcatcdf = Cryptcatcdf(cbStruct = cbStruct, hFileCtorArg = hFile, dwCurFilePos = dwCurFilePos, dwLastMemberOffset = dwLastMemberOffset, fEOF = fEOF, pwszResultDirCtorArg = pwszResultDir, hCATStoreCtorArg = hCATStore)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cryptcatcdf) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.hFile != other.hFile) return false
        if (this.dwCurFilePos != other.dwCurFilePos) return false
        if (this.dwLastMemberOffset != other.dwLastMemberOffset) return false
        if (this.fEOF != other.fEOF) return false
        if (this.pwszResultDir != other.pwszResultDir) return false
        if (this.hCATStore != other.hCATStore) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.hFile.hashCode()
        result = 31 * result + this.dwCurFilePos.hashCode()
        result = 31 * result + this.dwLastMemberOffset.hashCode()
        result = 31 * result + this.fEOF.hashCode()
        result = 31 * result + this.pwszResultDir.hashCode()
        result = 31 * result + this.hCATStore.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            hFile: Handle = MutPtr(0L),
            dwCurFilePos: UInt = 0u,
            dwLastMemberOffset: UInt = 0u,
            fEOF: Bool = 0,
            pwszResultDir: Pwstr = MutPtr(0L),
            hCATStore: Handle = MutPtr(0L),
        ): Cryptcatcdf =
            Cryptcatcdf(
                cbStruct = cbStruct,
                hFileCtorArg = hFile,
                dwCurFilePos = dwCurFilePos,
                dwLastMemberOffset = dwLastMemberOffset,
                fEOF = fEOF,
                pwszResultDirCtorArg = pwszResultDir,
                hCATStoreCtorArg = hCATStore,
            )
    }
}

public class Cryptcatmember internal constructor(
    public var cbStruct: UInt,
    pwszReferenceTagCtorArg: Pwstr,
    pwszFileNameCtorArg: Pwstr,
    public var gSubjectType: Guid,
    public var fdwMemberFlags: UInt,
    pIndirectDataCtorArg: MutPtr<SipIndirectData>,
    public var dwCertVersion: UInt,
    public var dwReserved: UInt,
    hReservedCtorArg: Handle,
    public var sEncodedIndirectData: CryptIntegerBlob,
    public var sEncodedMemberInfo: CryptIntegerBlob,
) {
    public var pwszReferenceTag: Pwstr = pwszReferenceTagCtorArg
        internal set

    public var pwszFileName: Pwstr = pwszFileNameCtorArg
        internal set

    public var pIndirectData: MutPtr<SipIndirectData> = pIndirectDataCtorArg
        internal set

    public var hReserved: Handle = hReservedCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        pwszReferenceTagCtorArg = MutPtr(0L),
        pwszFileNameCtorArg = MutPtr(0L),
        gSubjectType = Guid(),
        fdwMemberFlags = 0u,
        pIndirectDataCtorArg = MutPtr(0L),
        dwCertVersion = 0u,
        dwReserved = 0u,
        hReservedCtorArg = MutPtr(0L),
        sEncodedIndirectData = CryptIntegerBlob(),
        sEncodedMemberInfo = CryptIntegerBlob(),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): Pwstr = this.pwszReferenceTag

    public operator fun component3(): Pwstr = this.pwszFileName

    public operator fun component4(): Guid = this.gSubjectType

    public operator fun component5(): UInt = this.fdwMemberFlags

    public operator fun component6(): MutPtr<SipIndirectData> = this.pIndirectData

    public operator fun component7(): UInt = this.dwCertVersion

    public operator fun component8(): UInt = this.dwReserved

    public operator fun component9(): Handle = this.hReserved

    public operator fun component10(): CryptIntegerBlob = this.sEncodedIndirectData

    public operator fun component11(): CryptIntegerBlob = this.sEncodedMemberInfo

    public fun copy(cbStruct: UInt = this.cbStruct, pwszReferenceTag: Pwstr = this.pwszReferenceTag, pwszFileName: Pwstr = this.pwszFileName, gSubjectType: Guid = this.gSubjectType, fdwMemberFlags: UInt = this.fdwMemberFlags, pIndirectData: MutPtr<SipIndirectData> = this.pIndirectData, dwCertVersion: UInt = this.dwCertVersion, dwReserved: UInt = this.dwReserved, hReserved: Handle = this.hReserved, sEncodedIndirectData: CryptIntegerBlob = this.sEncodedIndirectData, sEncodedMemberInfo: CryptIntegerBlob = this.sEncodedMemberInfo): Cryptcatmember = Cryptcatmember(cbStruct = cbStruct, pwszReferenceTagCtorArg = pwszReferenceTag, pwszFileNameCtorArg = pwszFileName, gSubjectType = gSubjectType, fdwMemberFlags = fdwMemberFlags, pIndirectDataCtorArg = pIndirectData, dwCertVersion = dwCertVersion, dwReserved = dwReserved, hReservedCtorArg = hReserved, sEncodedIndirectData = sEncodedIndirectData, sEncodedMemberInfo = sEncodedMemberInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cryptcatmember) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.pwszReferenceTag != other.pwszReferenceTag) return false
        if (this.pwszFileName != other.pwszFileName) return false
        if (this.gSubjectType != other.gSubjectType) return false
        if (this.fdwMemberFlags != other.fdwMemberFlags) return false
        if (this.pIndirectData != other.pIndirectData) return false
        if (this.dwCertVersion != other.dwCertVersion) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.hReserved != other.hReserved) return false
        if (this.sEncodedIndirectData != other.sEncodedIndirectData) return false
        if (this.sEncodedMemberInfo != other.sEncodedMemberInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.pwszReferenceTag.hashCode()
        result = 31 * result + this.pwszFileName.hashCode()
        result = 31 * result + this.gSubjectType.hashCode()
        result = 31 * result + this.fdwMemberFlags.hashCode()
        result = 31 * result + this.pIndirectData.hashCode()
        result = 31 * result + this.dwCertVersion.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.hReserved.hashCode()
        result = 31 * result + this.sEncodedIndirectData.hashCode()
        result = 31 * result + this.sEncodedMemberInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            pwszReferenceTag: Pwstr = MutPtr(0L),
            pwszFileName: Pwstr = MutPtr(0L),
            gSubjectType: Guid = Guid(),
            fdwMemberFlags: UInt = 0u,
            pIndirectData: MutPtr<SipIndirectData> = MutPtr(0L),
            dwCertVersion: UInt = 0u,
            dwReserved: UInt = 0u,
            hReserved: Handle = MutPtr(0L),
            sEncodedIndirectData: CryptIntegerBlob = CryptIntegerBlob(),
            sEncodedMemberInfo: CryptIntegerBlob = CryptIntegerBlob(),
        ): Cryptcatmember =
            Cryptcatmember(
                cbStruct = cbStruct,
                pwszReferenceTagCtorArg = pwszReferenceTag,
                pwszFileNameCtorArg = pwszFileName,
                gSubjectType = gSubjectType,
                fdwMemberFlags = fdwMemberFlags,
                pIndirectDataCtorArg = pIndirectData,
                dwCertVersion = dwCertVersion,
                dwReserved = dwReserved,
                hReservedCtorArg = hReserved,
                sEncodedIndirectData = sEncodedIndirectData,
                sEncodedMemberInfo = sEncodedMemberInfo,
            )
    }
}

public class Cryptcatstore internal constructor(
    public var cbStruct: UInt,
    public var dwPublicVersion: UInt,
    pwszP7FileCtorArg: Pwstr,
    public var hProv: Int,
    public var dwEncodingType: UInt,
    public var fdwStoreFlags: CryptcatOpenFlags,
    hReservedCtorArg: Handle,
    hAttrsCtorArg: Handle,
    hCryptMsgCtorArg: MutPtr<CVoid>,
    hSortedCtorArg: Handle,
) {
    public var pwszP7File: Pwstr = pwszP7FileCtorArg
        internal set

    public var hReserved: Handle = hReservedCtorArg
        internal set

    public var hAttrs: Handle = hAttrsCtorArg
        internal set

    public var hCryptMsg: MutPtr<CVoid> = hCryptMsgCtorArg
        internal set

    public var hSorted: Handle = hSortedCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        dwPublicVersion = 0u,
        pwszP7FileCtorArg = MutPtr(0L),
        hProv = 0,
        dwEncodingType = 0u,
        fdwStoreFlags = 0u,
        hReservedCtorArg = MutPtr(0L),
        hAttrsCtorArg = MutPtr(0L),
        hCryptMsgCtorArg = MutPtr(0L),
        hSortedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.dwPublicVersion

    public operator fun component3(): Pwstr = this.pwszP7File

    public operator fun component4(): Int = this.hProv

    public operator fun component5(): UInt = this.dwEncodingType

    public operator fun component6(): CryptcatOpenFlags = this.fdwStoreFlags

    public operator fun component7(): Handle = this.hReserved

    public operator fun component8(): Handle = this.hAttrs

    public operator fun component9(): MutPtr<CVoid> = this.hCryptMsg

    public operator fun component10(): Handle = this.hSorted

    public fun copy(cbStruct: UInt = this.cbStruct, dwPublicVersion: UInt = this.dwPublicVersion, pwszP7File: Pwstr = this.pwszP7File, hProv: Int = this.hProv, dwEncodingType: UInt = this.dwEncodingType, fdwStoreFlags: CryptcatOpenFlags = this.fdwStoreFlags, hReserved: Handle = this.hReserved, hAttrs: Handle = this.hAttrs, hCryptMsg: MutPtr<CVoid> = this.hCryptMsg, hSorted: Handle = this.hSorted): Cryptcatstore = Cryptcatstore(cbStruct = cbStruct, dwPublicVersion = dwPublicVersion, pwszP7FileCtorArg = pwszP7File, hProv = hProv, dwEncodingType = dwEncodingType, fdwStoreFlags = fdwStoreFlags, hReservedCtorArg = hReserved, hAttrsCtorArg = hAttrs, hCryptMsgCtorArg = hCryptMsg, hSortedCtorArg = hSorted)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cryptcatstore) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.dwPublicVersion != other.dwPublicVersion) return false
        if (this.pwszP7File != other.pwszP7File) return false
        if (this.hProv != other.hProv) return false
        if (this.dwEncodingType != other.dwEncodingType) return false
        if (this.fdwStoreFlags != other.fdwStoreFlags) return false
        if (this.hReserved != other.hReserved) return false
        if (this.hAttrs != other.hAttrs) return false
        if (this.hCryptMsg != other.hCryptMsg) return false
        if (this.hSorted != other.hSorted) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.dwPublicVersion.hashCode()
        result = 31 * result + this.pwszP7File.hashCode()
        result = 31 * result + this.hProv.hashCode()
        result = 31 * result + this.dwEncodingType.hashCode()
        result = 31 * result + this.fdwStoreFlags.hashCode()
        result = 31 * result + this.hReserved.hashCode()
        result = 31 * result + this.hAttrs.hashCode()
        result = 31 * result + this.hCryptMsg.hashCode()
        result = 31 * result + this.hSorted.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            dwPublicVersion: UInt = 0u,
            pwszP7File: Pwstr = MutPtr(0L),
            hProv: Int = 0,
            dwEncodingType: UInt = 0u,
            fdwStoreFlags: CryptcatOpenFlags = 0u,
            hReserved: Handle = MutPtr(0L),
            hAttrs: Handle = MutPtr(0L),
            hCryptMsg: MutPtr<CVoid> = MutPtr(0L),
            hSorted: Handle = MutPtr(0L),
        ): Cryptcatstore =
            Cryptcatstore(
                cbStruct = cbStruct,
                dwPublicVersion = dwPublicVersion,
                pwszP7FileCtorArg = pwszP7File,
                hProv = hProv,
                dwEncodingType = dwEncodingType,
                fdwStoreFlags = fdwStoreFlags,
                hReservedCtorArg = hReserved,
                hAttrsCtorArg = hAttrs,
                hCryptMsgCtorArg = hCryptMsg,
                hSortedCtorArg = hSorted,
            )
    }
}

public class MsAddinfoCatalogmember internal constructor(
    public var cbStruct: UInt,
    pStoreCtorArg: MutPtr<Cryptcatstore>,
    pMemberCtorArg: MutPtr<Cryptcatmember>,
) {
    public var pStore: MutPtr<Cryptcatstore> = pStoreCtorArg
        internal set

    public var pMember: MutPtr<Cryptcatmember> = pMemberCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        pStoreCtorArg = MutPtr(0L),
        pMemberCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): MutPtr<Cryptcatstore> = this.pStore

    public operator fun component3(): MutPtr<Cryptcatmember> = this.pMember

    public fun copy(cbStruct: UInt = this.cbStruct, pStore: MutPtr<Cryptcatstore> = this.pStore, pMember: MutPtr<Cryptcatmember> = this.pMember): MsAddinfoCatalogmember = MsAddinfoCatalogmember(cbStruct = cbStruct, pStoreCtorArg = pStore, pMemberCtorArg = pMember)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MsAddinfoCatalogmember) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.pStore != other.pStore) return false
        if (this.pMember != other.pMember) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.pStore.hashCode()
        result = 31 * result + this.pMember.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MsAddinfoCatalogmember> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MsAddinfoCatalogmember> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): MsAddinfoCatalogmember =
                    MsAddinfoCatalogmember(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Cryptcatstore>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Cryptcatmember>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MsAddinfoCatalogmember) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Cryptcatstore>(64)
                    ).writeNative(addr + 8L, value.pStore)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Cryptcatmember>(64)
                    ).writeNative(addr + 16L, value.pMember)
                }
            }

        public operator fun invoke(
            cbStruct: UInt = 0u,
            pStore: MutPtr<Cryptcatstore> = MutPtr(0L),
            pMember: MutPtr<Cryptcatmember> = MutPtr(0L),
        ): MsAddinfoCatalogmember =
            MsAddinfoCatalogmember(
                cbStruct = cbStruct,
                pStoreCtorArg = pStore,
                pMemberCtorArg = pMember,
            )
    }
}
