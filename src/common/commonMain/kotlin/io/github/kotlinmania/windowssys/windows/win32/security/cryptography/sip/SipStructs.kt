package io.github.kotlinmania.windowssys.windows.win32.security.cryptography.sip

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptAlgorithmIdentifier
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptAttributeTypeValue
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptIntegerBlob
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.catalog.MsAddinfoCatalogmember

public class MsAddinfoBlob internal constructor(
    public var cbStruct: UInt,
    public var cbMemObject: UInt,
    pbMemObjectCtorArg: MutPtr<UByte>,
    public var cbMemSignedMsg: UInt,
    pbMemSignedMsgCtorArg: MutPtr<UByte>,
) {
    public var pbMemObject: MutPtr<UByte> = pbMemObjectCtorArg
        internal set

    public var pbMemSignedMsg: MutPtr<UByte> = pbMemSignedMsgCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        cbMemObject = 0u,
        pbMemObjectCtorArg = MutPtr(0L),
        cbMemSignedMsg = 0u,
        pbMemSignedMsgCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): UInt = this.cbMemObject

    public operator fun component3(): MutPtr<UByte> = this.pbMemObject

    public operator fun component4(): UInt = this.cbMemSignedMsg

    public operator fun component5(): MutPtr<UByte> = this.pbMemSignedMsg

    public fun copy(cbStruct: UInt = this.cbStruct, cbMemObject: UInt = this.cbMemObject, pbMemObject: MutPtr<UByte> = this.pbMemObject, cbMemSignedMsg: UInt = this.cbMemSignedMsg, pbMemSignedMsg: MutPtr<UByte> = this.pbMemSignedMsg): MsAddinfoBlob = MsAddinfoBlob(cbStruct = cbStruct, cbMemObject = cbMemObject, pbMemObjectCtorArg = pbMemObject, cbMemSignedMsg = cbMemSignedMsg, pbMemSignedMsgCtorArg = pbMemSignedMsg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MsAddinfoBlob) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.cbMemObject != other.cbMemObject) return false
        if (this.pbMemObject != other.pbMemObject) return false
        if (this.cbMemSignedMsg != other.cbMemSignedMsg) return false
        if (this.pbMemSignedMsg != other.pbMemSignedMsg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.cbMemObject.hashCode()
        result = 31 * result + this.pbMemObject.hashCode()
        result = 31 * result + this.cbMemSignedMsg.hashCode()
        result = 31 * result + this.pbMemSignedMsg.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MsAddinfoBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MsAddinfoBlob> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MsAddinfoBlob =
                    MsAddinfoBlob(
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
                    )
                override fun writeNative(addr: Long, value: MsAddinfoBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbMemObject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pbMemObject)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbMemSignedMsg)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 24L, value.pbMemSignedMsg)
                }
            }

        public operator fun invoke(
            cbStruct: UInt = 0u,
            cbMemObject: UInt = 0u,
            pbMemObject: MutPtr<UByte> = MutPtr(0L),
            cbMemSignedMsg: UInt = 0u,
            pbMemSignedMsg: MutPtr<UByte> = MutPtr(0L),
        ): MsAddinfoBlob =
            MsAddinfoBlob(
                cbStruct = cbStruct,
                cbMemObject = cbMemObject,
                pbMemObjectCtorArg = pbMemObject,
                cbMemSignedMsg = cbMemSignedMsg,
                pbMemSignedMsgCtorArg = pbMemSignedMsg,
            )
    }
}

public class MsAddinfoFlat internal constructor(
    public var cbStruct: UInt,
    pIndirectDataCtorArg: MutPtr<SipIndirectData>,
) {
    public var pIndirectData: MutPtr<SipIndirectData> = pIndirectDataCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        pIndirectDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): MutPtr<SipIndirectData> = this.pIndirectData

    public fun copy(cbStruct: UInt = this.cbStruct, pIndirectData: MutPtr<SipIndirectData> = this.pIndirectData): MsAddinfoFlat = MsAddinfoFlat(cbStruct = cbStruct, pIndirectDataCtorArg = pIndirectData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MsAddinfoFlat) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.pIndirectData != other.pIndirectData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.pIndirectData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MsAddinfoFlat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MsAddinfoFlat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MsAddinfoFlat =
                    MsAddinfoFlat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SipIndirectData>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MsAddinfoFlat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbStruct)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SipIndirectData>(64)
                    ).writeNative(addr + 8L, value.pIndirectData)
                }
            }

        public operator fun invoke(
            cbStruct: UInt = 0u,
            pIndirectData: MutPtr<SipIndirectData> = MutPtr(0L),
        ): MsAddinfoFlat =
            MsAddinfoFlat(
                cbStruct = cbStruct,
                pIndirectDataCtorArg = pIndirectData,
            )
    }
}

public class SipAddNewprovider internal constructor(
    public var cbStruct: UInt,
    pgSubjectCtorArg: MutPtr<Guid>,
    pwszDLLFileNameCtorArg: Pwstr,
    pwszMagicNumberCtorArg: Pwstr,
    pwszIsFunctionNameCtorArg: Pwstr,
    pwszGetFuncNameCtorArg: Pwstr,
    pwszPutFuncNameCtorArg: Pwstr,
    pwszCreateFuncNameCtorArg: Pwstr,
    pwszVerifyFuncNameCtorArg: Pwstr,
    pwszRemoveFuncNameCtorArg: Pwstr,
    pwszIsFunctionNameFmt2CtorArg: Pwstr,
    pwszGetCapFuncNameCtorArg: Pwstr,
) {
    public var pgSubject: MutPtr<Guid> = pgSubjectCtorArg
        internal set

    public var pwszDLLFileName: Pwstr = pwszDLLFileNameCtorArg
        internal set

    public var pwszMagicNumber: Pwstr = pwszMagicNumberCtorArg
        internal set

    public var pwszIsFunctionName: Pwstr = pwszIsFunctionNameCtorArg
        internal set

    public var pwszGetFuncName: Pwstr = pwszGetFuncNameCtorArg
        internal set

    public var pwszPutFuncName: Pwstr = pwszPutFuncNameCtorArg
        internal set

    public var pwszCreateFuncName: Pwstr = pwszCreateFuncNameCtorArg
        internal set

    public var pwszVerifyFuncName: Pwstr = pwszVerifyFuncNameCtorArg
        internal set

    public var pwszRemoveFuncName: Pwstr = pwszRemoveFuncNameCtorArg
        internal set

    public var pwszIsFunctionNameFmt2: Pwstr = pwszIsFunctionNameFmt2CtorArg
        internal set

    public var pwszGetCapFuncName: Pwstr = pwszGetCapFuncNameCtorArg
        internal set

    public constructor() : this(
        cbStruct = 0u,
        pgSubjectCtorArg = MutPtr(0L),
        pwszDLLFileNameCtorArg = MutPtr(0L),
        pwszMagicNumberCtorArg = MutPtr(0L),
        pwszIsFunctionNameCtorArg = MutPtr(0L),
        pwszGetFuncNameCtorArg = MutPtr(0L),
        pwszPutFuncNameCtorArg = MutPtr(0L),
        pwszCreateFuncNameCtorArg = MutPtr(0L),
        pwszVerifyFuncNameCtorArg = MutPtr(0L),
        pwszRemoveFuncNameCtorArg = MutPtr(0L),
        pwszIsFunctionNameFmt2CtorArg = MutPtr(0L),
        pwszGetCapFuncNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbStruct

    public operator fun component2(): MutPtr<Guid> = this.pgSubject

    public operator fun component3(): Pwstr = this.pwszDLLFileName

    public operator fun component4(): Pwstr = this.pwszMagicNumber

    public operator fun component5(): Pwstr = this.pwszIsFunctionName

    public operator fun component6(): Pwstr = this.pwszGetFuncName

    public operator fun component7(): Pwstr = this.pwszPutFuncName

    public operator fun component8(): Pwstr = this.pwszCreateFuncName

    public operator fun component9(): Pwstr = this.pwszVerifyFuncName

    public operator fun component10(): Pwstr = this.pwszRemoveFuncName

    public operator fun component11(): Pwstr = this.pwszIsFunctionNameFmt2

    public operator fun component12(): Pwstr = this.pwszGetCapFuncName

    public fun copy(cbStruct: UInt = this.cbStruct, pgSubject: MutPtr<Guid> = this.pgSubject, pwszDLLFileName: Pwstr = this.pwszDLLFileName, pwszMagicNumber: Pwstr = this.pwszMagicNumber, pwszIsFunctionName: Pwstr = this.pwszIsFunctionName, pwszGetFuncName: Pwstr = this.pwszGetFuncName, pwszPutFuncName: Pwstr = this.pwszPutFuncName, pwszCreateFuncName: Pwstr = this.pwszCreateFuncName, pwszVerifyFuncName: Pwstr = this.pwszVerifyFuncName, pwszRemoveFuncName: Pwstr = this.pwszRemoveFuncName, pwszIsFunctionNameFmt2: Pwstr = this.pwszIsFunctionNameFmt2, pwszGetCapFuncName: Pwstr = this.pwszGetCapFuncName): SipAddNewprovider = SipAddNewprovider(cbStruct = cbStruct, pgSubjectCtorArg = pgSubject, pwszDLLFileNameCtorArg = pwszDLLFileName, pwszMagicNumberCtorArg = pwszMagicNumber, pwszIsFunctionNameCtorArg = pwszIsFunctionName, pwszGetFuncNameCtorArg = pwszGetFuncName, pwszPutFuncNameCtorArg = pwszPutFuncName, pwszCreateFuncNameCtorArg = pwszCreateFuncName, pwszVerifyFuncNameCtorArg = pwszVerifyFuncName, pwszRemoveFuncNameCtorArg = pwszRemoveFuncName, pwszIsFunctionNameFmt2CtorArg = pwszIsFunctionNameFmt2, pwszGetCapFuncNameCtorArg = pwszGetCapFuncName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SipAddNewprovider) return false
        if (this.cbStruct != other.cbStruct) return false
        if (this.pgSubject != other.pgSubject) return false
        if (this.pwszDLLFileName != other.pwszDLLFileName) return false
        if (this.pwszMagicNumber != other.pwszMagicNumber) return false
        if (this.pwszIsFunctionName != other.pwszIsFunctionName) return false
        if (this.pwszGetFuncName != other.pwszGetFuncName) return false
        if (this.pwszPutFuncName != other.pwszPutFuncName) return false
        if (this.pwszCreateFuncName != other.pwszCreateFuncName) return false
        if (this.pwszVerifyFuncName != other.pwszVerifyFuncName) return false
        if (this.pwszRemoveFuncName != other.pwszRemoveFuncName) return false
        if (this.pwszIsFunctionNameFmt2 != other.pwszIsFunctionNameFmt2) return false
        if (this.pwszGetCapFuncName != other.pwszGetCapFuncName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbStruct.hashCode()
        result = 31 * result + this.pgSubject.hashCode()
        result = 31 * result + this.pwszDLLFileName.hashCode()
        result = 31 * result + this.pwszMagicNumber.hashCode()
        result = 31 * result + this.pwszIsFunctionName.hashCode()
        result = 31 * result + this.pwszGetFuncName.hashCode()
        result = 31 * result + this.pwszPutFuncName.hashCode()
        result = 31 * result + this.pwszCreateFuncName.hashCode()
        result = 31 * result + this.pwszVerifyFuncName.hashCode()
        result = 31 * result + this.pwszRemoveFuncName.hashCode()
        result = 31 * result + this.pwszIsFunctionNameFmt2.hashCode()
        result = 31 * result + this.pwszGetCapFuncName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbStruct: UInt = 0u,
            pgSubject: MutPtr<Guid> = MutPtr(0L),
            pwszDLLFileName: Pwstr = MutPtr(0L),
            pwszMagicNumber: Pwstr = MutPtr(0L),
            pwszIsFunctionName: Pwstr = MutPtr(0L),
            pwszGetFuncName: Pwstr = MutPtr(0L),
            pwszPutFuncName: Pwstr = MutPtr(0L),
            pwszCreateFuncName: Pwstr = MutPtr(0L),
            pwszVerifyFuncName: Pwstr = MutPtr(0L),
            pwszRemoveFuncName: Pwstr = MutPtr(0L),
            pwszIsFunctionNameFmt2: Pwstr = MutPtr(0L),
            pwszGetCapFuncName: Pwstr = MutPtr(0L),
        ): SipAddNewprovider =
            SipAddNewprovider(
                cbStruct = cbStruct,
                pgSubjectCtorArg = pgSubject,
                pwszDLLFileNameCtorArg = pwszDLLFileName,
                pwszMagicNumberCtorArg = pwszMagicNumber,
                pwszIsFunctionNameCtorArg = pwszIsFunctionName,
                pwszGetFuncNameCtorArg = pwszGetFuncName,
                pwszPutFuncNameCtorArg = pwszPutFuncName,
                pwszCreateFuncNameCtorArg = pwszCreateFuncName,
                pwszVerifyFuncNameCtorArg = pwszVerifyFuncName,
                pwszRemoveFuncNameCtorArg = pwszRemoveFuncName,
                pwszIsFunctionNameFmt2CtorArg = pwszIsFunctionNameFmt2,
                pwszGetCapFuncNameCtorArg = pwszGetCapFuncName,
            )
    }
}

public data class SipCapSetV2(
    public var cbSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var isMultiSign: Bool = 0,
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SipCapSetV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SipCapSetV2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SipCapSetV2 =
                    SipCapSetV2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SipCapSetV2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.isMultiSign)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwReserved)
                }
            }
    }
}

public data class SipCapSetV3(
    public var cbSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var isMultiSign: Bool = 0,
    public var anonymous: SipCapSetV30 = SipCapSetV30(),
)

public data class SipCapSetV30(
    public var dwFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public class SipDispatchInfo internal constructor(
    public var cbSize: UInt,
    hSIPCtorArg: Handle,
    public var pfGet: PCryptSipgetSignedDataMsg,
    public var pfPut: PCryptSipputSignedDataMsg,
    public var pfCreate: PCryptSipcreateIndirectData,
    public var pfVerify: PCryptSipverifyIndirectData,
    public var pfRemove: PCryptSipremoveSignedDataMsg,
) {
    public var hSIP: Handle = hSIPCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hSIPCtorArg = MutPtr(0L),
        pfGet = null,
        pfPut = null,
        pfCreate = null,
        pfVerify = null,
        pfRemove = null,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Handle = this.hSIP

    public operator fun component3(): PCryptSipgetSignedDataMsg = this.pfGet

    public operator fun component4(): PCryptSipputSignedDataMsg = this.pfPut

    public operator fun component5(): PCryptSipcreateIndirectData = this.pfCreate

    public operator fun component6(): PCryptSipverifyIndirectData = this.pfVerify

    public operator fun component7(): PCryptSipremoveSignedDataMsg = this.pfRemove

    public fun copy(cbSize: UInt = this.cbSize, hSIP: Handle = this.hSIP, pfGet: PCryptSipgetSignedDataMsg = this.pfGet, pfPut: PCryptSipputSignedDataMsg = this.pfPut, pfCreate: PCryptSipcreateIndirectData = this.pfCreate, pfVerify: PCryptSipverifyIndirectData = this.pfVerify, pfRemove: PCryptSipremoveSignedDataMsg = this.pfRemove): SipDispatchInfo = SipDispatchInfo(cbSize = cbSize, hSIPCtorArg = hSIP, pfGet = pfGet, pfPut = pfPut, pfCreate = pfCreate, pfVerify = pfVerify, pfRemove = pfRemove)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SipDispatchInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hSIP != other.hSIP) return false
        if (this.pfGet != other.pfGet) return false
        if (this.pfPut != other.pfPut) return false
        if (this.pfCreate != other.pfCreate) return false
        if (this.pfVerify != other.pfVerify) return false
        if (this.pfRemove != other.pfRemove) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hSIP.hashCode()
        result = 31 * result + this.pfGet.hashCode()
        result = 31 * result + this.pfPut.hashCode()
        result = 31 * result + this.pfCreate.hashCode()
        result = 31 * result + this.pfVerify.hashCode()
        result = 31 * result + this.pfRemove.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hSIP: Handle = MutPtr(0L),
            pfGet: PCryptSipgetSignedDataMsg = null,
            pfPut: PCryptSipputSignedDataMsg = null,
            pfCreate: PCryptSipcreateIndirectData = null,
            pfVerify: PCryptSipverifyIndirectData = null,
            pfRemove: PCryptSipremoveSignedDataMsg = null,
        ): SipDispatchInfo =
            SipDispatchInfo(
                cbSize = cbSize,
                hSIPCtorArg = hSIP,
                pfGet = pfGet,
                pfPut = pfPut,
                pfCreate = pfCreate,
                pfVerify = pfVerify,
                pfRemove = pfRemove,
            )
    }
}

public data class SipIndirectData(
    public var data: CryptAttributeTypeValue = CryptAttributeTypeValue(),
    public var digestAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
    public var digest: CryptIntegerBlob = CryptIntegerBlob(),
)

public class SipSubjectinfo internal constructor(
    public var cbSize: UInt,
    pgSubjectTypeCtorArg: MutPtr<Guid>,
    hFileCtorArg: Handle,
    pwsFileNameCtorArg: Pcwstr,
    pwsDisplayNameCtorArg: Pcwstr,
    public var dwReserved1: UInt,
    public var dwIntVersion: UInt,
    public var hProv: Int,
    public var digestAlgorithm: CryptAlgorithmIdentifier,
    public var dwFlags: UInt,
    public var dwEncodingType: UInt,
    public var dwReserved2: UInt,
    public var fdwCAPISettings: UInt,
    public var fdwSecuritySettings: UInt,
    public var dwIndex: UInt,
    public var dwUnionChoice: UInt,
    public var anonymous: SipSubjectinfo0,
    pClientDataCtorArg: MutPtr<CVoid>,
) {
    public var pgSubjectType: MutPtr<Guid> = pgSubjectTypeCtorArg
        internal set

    public var hFile: Handle = hFileCtorArg
        internal set

    public var pwsFileName: Pcwstr = pwsFileNameCtorArg
        internal set

    public var pwsDisplayName: Pcwstr = pwsDisplayNameCtorArg
        internal set

    public var pClientData: MutPtr<CVoid> = pClientDataCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        pgSubjectTypeCtorArg = MutPtr(0L),
        hFileCtorArg = MutPtr(0L),
        pwsFileNameCtorArg = ConstPtr(0L),
        pwsDisplayNameCtorArg = ConstPtr(0L),
        dwReserved1 = 0u,
        dwIntVersion = 0u,
        hProv = 0,
        digestAlgorithm = CryptAlgorithmIdentifier(),
        dwFlags = 0u,
        dwEncodingType = 0u,
        dwReserved2 = 0u,
        fdwCAPISettings = 0u,
        fdwSecuritySettings = 0u,
        dwIndex = 0u,
        dwUnionChoice = 0u,
        anonymous = SipSubjectinfo0(),
        pClientDataCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            pgSubjectType: MutPtr<Guid> = MutPtr(0L),
            hFile: Handle = MutPtr(0L),
            pwsFileName: Pcwstr = ConstPtr(0L),
            pwsDisplayName: Pcwstr = ConstPtr(0L),
            dwReserved1: UInt = 0u,
            dwIntVersion: UInt = 0u,
            hProv: Int = 0,
            digestAlgorithm: CryptAlgorithmIdentifier = CryptAlgorithmIdentifier(),
            dwFlags: UInt = 0u,
            dwEncodingType: UInt = 0u,
            dwReserved2: UInt = 0u,
            fdwCAPISettings: UInt = 0u,
            fdwSecuritySettings: UInt = 0u,
            dwIndex: UInt = 0u,
            dwUnionChoice: UInt = 0u,
            anonymous: SipSubjectinfo0 = SipSubjectinfo0(),
            pClientData: MutPtr<CVoid> = MutPtr(0L),
        ): SipSubjectinfo =
            SipSubjectinfo(
                cbSize = cbSize,
                pgSubjectTypeCtorArg = pgSubjectType,
                hFileCtorArg = hFile,
                pwsFileNameCtorArg = pwsFileName,
                pwsDisplayNameCtorArg = pwsDisplayName,
                dwReserved1 = dwReserved1,
                dwIntVersion = dwIntVersion,
                hProv = hProv,
                digestAlgorithm = digestAlgorithm,
                dwFlags = dwFlags,
                dwEncodingType = dwEncodingType,
                dwReserved2 = dwReserved2,
                fdwCAPISettings = fdwCAPISettings,
                fdwSecuritySettings = fdwSecuritySettings,
                dwIndex = dwIndex,
                dwUnionChoice = dwUnionChoice,
                anonymous = anonymous,
                pClientDataCtorArg = pClientData,
            )
    }
}

public class SipSubjectinfo0 internal constructor(
    psFlatCtorArg: MutPtr<MsAddinfoFlat>,
    psCatMemberCtorArg: MutPtr<MsAddinfoCatalogmember>,
    psBlobCtorArg: MutPtr<MsAddinfoBlob>,
) {
    public var psFlat: MutPtr<MsAddinfoFlat> = psFlatCtorArg
        internal set

    public var psCatMember: MutPtr<MsAddinfoCatalogmember> = psCatMemberCtorArg
        internal set

    public var psBlob: MutPtr<MsAddinfoBlob> = psBlobCtorArg
        internal set

    public constructor() : this(
        psFlatCtorArg = MutPtr(0L),
        psCatMemberCtorArg = MutPtr(0L),
        psBlobCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<MsAddinfoFlat> = this.psFlat

    public operator fun component2(): MutPtr<MsAddinfoCatalogmember> = this.psCatMember

    public operator fun component3(): MutPtr<MsAddinfoBlob> = this.psBlob

    public fun copy(psFlat: MutPtr<MsAddinfoFlat> = this.psFlat, psCatMember: MutPtr<MsAddinfoCatalogmember> = this.psCatMember, psBlob: MutPtr<MsAddinfoBlob> = this.psBlob): SipSubjectinfo0 = SipSubjectinfo0(psFlatCtorArg = psFlat, psCatMemberCtorArg = psCatMember, psBlobCtorArg = psBlob)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SipSubjectinfo0) return false
        if (this.psFlat != other.psFlat) return false
        if (this.psCatMember != other.psCatMember) return false
        if (this.psBlob != other.psBlob) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.psFlat.hashCode()
        result = 31 * result + this.psCatMember.hashCode()
        result = 31 * result + this.psBlob.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            psFlat: MutPtr<MsAddinfoFlat> = MutPtr(0L),
            psCatMember: MutPtr<MsAddinfoCatalogmember> = MutPtr(0L),
            psBlob: MutPtr<MsAddinfoBlob> = MutPtr(0L),
        ): SipSubjectinfo0 =
            SipSubjectinfo0(
                psFlatCtorArg = psFlat,
                psCatMemberCtorArg = psCatMember,
                psBlobCtorArg = psBlob,
            )
    }
}
