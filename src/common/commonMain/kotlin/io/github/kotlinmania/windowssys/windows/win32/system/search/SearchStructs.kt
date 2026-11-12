@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.search

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.VariantBool
import io.github.kotlinmania.windowssys.windows.win32.storage.indexserver.Dbid
import io.github.kotlinmania.windowssys.windows.win32.storage.indexserver.Fullpropspec
import io.github.kotlinmania.windowssys.windows.win32.system.com.Blob
import io.github.kotlinmania.windowssys.windows.win32.system.com.CY
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.Propvariant
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant

public class AuthenticationInfo internal constructor(
    public var dwSize: UInt,
    public var atAuthenticationType: AuthType,
    pcwszUserCtorArg: Pcwstr,
    pcwszPasswordCtorArg: Pcwstr,
) {
    public var pcwszUser: Pcwstr = pcwszUserCtorArg
        internal set

    public var pcwszPassword: Pcwstr = pcwszPasswordCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        atAuthenticationType = 0,
        pcwszUserCtorArg = ConstPtr(0L),
        pcwszPasswordCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): AuthType = this.atAuthenticationType

    public operator fun component3(): Pcwstr = this.pcwszUser

    public operator fun component4(): Pcwstr = this.pcwszPassword

    public fun copy(dwSize: UInt = this.dwSize, atAuthenticationType: AuthType = this.atAuthenticationType, pcwszUser: Pcwstr = this.pcwszUser, pcwszPassword: Pcwstr = this.pcwszPassword): AuthenticationInfo = AuthenticationInfo(dwSize = dwSize, atAuthenticationType = atAuthenticationType, pcwszUserCtorArg = pcwszUser, pcwszPasswordCtorArg = pcwszPassword)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AuthenticationInfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.atAuthenticationType != other.atAuthenticationType) return false
        if (this.pcwszUser != other.pcwszUser) return false
        if (this.pcwszPassword != other.pcwszPassword) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.atAuthenticationType.hashCode()
        result = 31 * result + this.pcwszUser.hashCode()
        result = 31 * result + this.pcwszPassword.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            atAuthenticationType: AuthType = 0,
            pcwszUser: Pcwstr = ConstPtr(0L),
            pcwszPassword: Pcwstr = ConstPtr(0L),
        ): AuthenticationInfo =
            AuthenticationInfo(
                dwSize = dwSize,
                atAuthenticationType = atAuthenticationType,
                pcwszUserCtorArg = pcwszUser,
                pcwszPasswordCtorArg = pcwszPassword,
            )
    }
}

public data class Bucketcategorize(
    public var cBuckets: UInt = 0u,
    public var distribution: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bucketcategorize> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bucketcategorize> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Bucketcategorize =
                    Bucketcategorize(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Bucketcategorize) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cBuckets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.distribution)
                }
            }
    }
}

public data class Categorization(
    public var ulCatType: UInt = 0u,
    public var anonymous: Categorization0 = Categorization0(),
    public var csColumns: Columnset = Columnset(),
)

public data class Categorization0(
    public var cClusters: UInt = 0u,
    public var bucket: Bucketcategorize = Bucketcategorize(),
    public var range: Rangecategorize = Rangecategorize(),
)

public class Categorizationset internal constructor(
    public var cCat: UInt,
    aCatCtorArg: MutPtr<Categorization>,
) {
    public var aCat: MutPtr<Categorization> = aCatCtorArg
        internal set

    public constructor() : this(
        cCat = 0u,
        aCatCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cCat

    public operator fun component2(): MutPtr<Categorization> = this.aCat

    public fun copy(cCat: UInt = this.cCat, aCat: MutPtr<Categorization> = this.aCat): Categorizationset = Categorizationset(cCat = cCat, aCatCtorArg = aCat)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Categorizationset) return false
        if (this.cCat != other.cCat) return false
        if (this.aCat != other.aCat) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cCat.hashCode()
        result = 31 * result + this.aCat.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Categorizationset> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Categorizationset> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Categorizationset =
                    Categorizationset(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Categorization>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Categorizationset) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cCat)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Categorization>(64)
                    ).writeNative(addr + 8L, value.aCat)
                }
            }

        public operator fun invoke(
            cCat: UInt = 0u,
            aCat: MutPtr<Categorization> = MutPtr(0L),
        ): Categorizationset =
            Categorizationset(
                cCat = cCat,
                aCatCtorArg = aCat,
            )
    }
}

public class Columnset internal constructor(
    public var cCol: UInt,
    aColCtorArg: MutPtr<Fullpropspec>,
) {
    public var aCol: MutPtr<Fullpropspec> = aColCtorArg
        internal set

    public constructor() : this(
        cCol = 0u,
        aColCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cCol

    public operator fun component2(): MutPtr<Fullpropspec> = this.aCol

    public fun copy(cCol: UInt = this.cCol, aCol: MutPtr<Fullpropspec> = this.aCol): Columnset = Columnset(cCol = cCol, aColCtorArg = aCol)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Columnset) return false
        if (this.cCol != other.cCol) return false
        if (this.aCol != other.aCol) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cCol.hashCode()
        result = 31 * result + this.aCol.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Columnset> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Columnset> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Columnset =
                    Columnset(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Fullpropspec>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Columnset) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cCol)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Fullpropspec>(64)
                    ).writeNative(addr + 8L, value.aCol)
                }
            }

        public operator fun invoke(
            cCol: UInt = 0u,
            aCol: MutPtr<Fullpropspec> = MutPtr(0L),
        ): Columnset =
            Columnset(
                cCol = cCol,
                aColCtorArg = aCol,
            )
    }
}

public class Contentrestriction internal constructor(
    public var prop: Fullpropspec,
    pwcsPhraseCtorArg: Pwstr,
    public var lcid: UInt,
    public var ulGenerateMethod: UInt,
) {
    public var pwcsPhrase: Pwstr = pwcsPhraseCtorArg
        internal set

    public constructor() : this(
        prop = Fullpropspec(),
        pwcsPhraseCtorArg = MutPtr(0L),
        lcid = 0u,
        ulGenerateMethod = 0u,
    )

    public operator fun component1(): Fullpropspec = this.prop

    public operator fun component2(): Pwstr = this.pwcsPhrase

    public operator fun component3(): UInt = this.lcid

    public operator fun component4(): UInt = this.ulGenerateMethod

    public fun copy(prop: Fullpropspec = this.prop, pwcsPhrase: Pwstr = this.pwcsPhrase, lcid: UInt = this.lcid, ulGenerateMethod: UInt = this.ulGenerateMethod): Contentrestriction = Contentrestriction(prop = prop, pwcsPhraseCtorArg = pwcsPhrase, lcid = lcid, ulGenerateMethod = ulGenerateMethod)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Contentrestriction) return false
        if (this.prop != other.prop) return false
        if (this.pwcsPhrase != other.pwcsPhrase) return false
        if (this.lcid != other.lcid) return false
        if (this.ulGenerateMethod != other.ulGenerateMethod) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.prop.hashCode()
        result = 31 * result + this.pwcsPhrase.hashCode()
        result = 31 * result + this.lcid.hashCode()
        result = 31 * result + this.ulGenerateMethod.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            prop: Fullpropspec = Fullpropspec(),
            pwcsPhrase: Pwstr = MutPtr(0L),
            lcid: UInt = 0u,
            ulGenerateMethod: UInt = 0u,
        ): Contentrestriction =
            Contentrestriction(
                prop = prop,
                pwcsPhraseCtorArg = pwcsPhrase,
                lcid = lcid,
                ulGenerateMethod = ulGenerateMethod,
            )
    }
}

public data class DateStruct(
    public var year: Short = 0,
    public var month: UShort = 0u,
    public var day: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DateStruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DateStruct> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): DateStruct =
                    DateStruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DateStruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.year)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.month)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.day)
                }
            }
    }
}

public class Dbbindext internal constructor(
    pExtensionCtorArg: MutPtr<UByte>,
    public var ulExtension: Int,
) {
    public var pExtension: MutPtr<UByte> = pExtensionCtorArg
        internal set

    public constructor() : this(
        pExtensionCtorArg = MutPtr(0L),
        ulExtension = 0,
    )

    public operator fun component1(): MutPtr<UByte> = this.pExtension

    public operator fun component2(): Int = this.ulExtension

    public fun copy(pExtension: MutPtr<UByte> = this.pExtension, ulExtension: Int = this.ulExtension): Dbbindext = Dbbindext(pExtensionCtorArg = pExtension, ulExtension = ulExtension)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dbbindext) return false
        if (this.pExtension != other.pExtension) return false
        if (this.ulExtension != other.ulExtension) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pExtension.hashCode()
        result = 31 * result + this.ulExtension.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbbindext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbbindext> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Dbbindext =
                    Dbbindext(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dbbindext) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr, value.pExtension)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.ulExtension)
                }
            }

        public operator fun invoke(
            pExtension: MutPtr<UByte> = MutPtr(0L),
            ulExtension: Int = 0,
        ): Dbbindext =
            Dbbindext(
                pExtensionCtorArg = pExtension,
                ulExtension = ulExtension,
            )
    }
}

public class Dbbinding internal constructor(
    public var iOrdinal: Int,
    public var obValue: Int,
    public var obLength: Int,
    public var obStatus: Int,
    pTypeInfoCtorArg: MutPtr<CVoid>,
    pObjectCtorArg: MutPtr<Dbobject>,
    pBindExtCtorArg: MutPtr<Dbbindext>,
    public var dwPart: UInt,
    public var dwMemOwner: UInt,
    public var eParamIO: UInt,
    public var cbMaxLen: Int,
    public var dwFlags: UInt,
    public var wType: UShort,
    public var bPrecision: UByte,
    public var bScale: UByte,
) {
    public var pTypeInfo: MutPtr<CVoid> = pTypeInfoCtorArg
        internal set

    public var pObject: MutPtr<Dbobject> = pObjectCtorArg
        internal set

    public var pBindExt: MutPtr<Dbbindext> = pBindExtCtorArg
        internal set

    public constructor() : this(
        iOrdinal = 0,
        obValue = 0,
        obLength = 0,
        obStatus = 0,
        pTypeInfoCtorArg = MutPtr(0L),
        pObjectCtorArg = MutPtr(0L),
        pBindExtCtorArg = MutPtr(0L),
        dwPart = 0u,
        dwMemOwner = 0u,
        eParamIO = 0u,
        cbMaxLen = 0,
        dwFlags = 0u,
        wType = 0u,
        bPrecision = 0u,
        bScale = 0u,
    )

    public operator fun component1(): Int = this.iOrdinal

    public operator fun component2(): Int = this.obValue

    public operator fun component3(): Int = this.obLength

    public operator fun component4(): Int = this.obStatus

    public operator fun component5(): MutPtr<CVoid> = this.pTypeInfo

    public operator fun component6(): MutPtr<Dbobject> = this.pObject

    public operator fun component7(): MutPtr<Dbbindext> = this.pBindExt

    public operator fun component8(): UInt = this.dwPart

    public operator fun component9(): UInt = this.dwMemOwner

    public operator fun component10(): UInt = this.eParamIO

    public operator fun component11(): Int = this.cbMaxLen

    public operator fun component12(): UInt = this.dwFlags

    public operator fun component13(): UShort = this.wType

    public operator fun component14(): UByte = this.bPrecision

    public operator fun component15(): UByte = this.bScale

    public fun copy(iOrdinal: Int = this.iOrdinal, obValue: Int = this.obValue, obLength: Int = this.obLength, obStatus: Int = this.obStatus, pTypeInfo: MutPtr<CVoid> = this.pTypeInfo, pObject: MutPtr<Dbobject> = this.pObject, pBindExt: MutPtr<Dbbindext> = this.pBindExt, dwPart: UInt = this.dwPart, dwMemOwner: UInt = this.dwMemOwner, eParamIO: UInt = this.eParamIO, cbMaxLen: Int = this.cbMaxLen, dwFlags: UInt = this.dwFlags, wType: UShort = this.wType, bPrecision: UByte = this.bPrecision, bScale: UByte = this.bScale): Dbbinding = Dbbinding(iOrdinal = iOrdinal, obValue = obValue, obLength = obLength, obStatus = obStatus, pTypeInfoCtorArg = pTypeInfo, pObjectCtorArg = pObject, pBindExtCtorArg = pBindExt, dwPart = dwPart, dwMemOwner = dwMemOwner, eParamIO = eParamIO, cbMaxLen = cbMaxLen, dwFlags = dwFlags, wType = wType, bPrecision = bPrecision, bScale = bScale)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dbbinding) return false
        if (this.iOrdinal != other.iOrdinal) return false
        if (this.obValue != other.obValue) return false
        if (this.obLength != other.obLength) return false
        if (this.obStatus != other.obStatus) return false
        if (this.pTypeInfo != other.pTypeInfo) return false
        if (this.pObject != other.pObject) return false
        if (this.pBindExt != other.pBindExt) return false
        if (this.dwPart != other.dwPart) return false
        if (this.dwMemOwner != other.dwMemOwner) return false
        if (this.eParamIO != other.eParamIO) return false
        if (this.cbMaxLen != other.cbMaxLen) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.wType != other.wType) return false
        if (this.bPrecision != other.bPrecision) return false
        if (this.bScale != other.bScale) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iOrdinal.hashCode()
        result = 31 * result + this.obValue.hashCode()
        result = 31 * result + this.obLength.hashCode()
        result = 31 * result + this.obStatus.hashCode()
        result = 31 * result + this.pTypeInfo.hashCode()
        result = 31 * result + this.pObject.hashCode()
        result = 31 * result + this.pBindExt.hashCode()
        result = 31 * result + this.dwPart.hashCode()
        result = 31 * result + this.dwMemOwner.hashCode()
        result = 31 * result + this.eParamIO.hashCode()
        result = 31 * result + this.cbMaxLen.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.wType.hashCode()
        result = 31 * result + this.bPrecision.hashCode()
        result = 31 * result + this.bScale.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbbinding> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbbinding> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): Dbbinding =
                    Dbbinding(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Dbobject>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Dbbindext>(64)
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 86L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 87L),
                    )
                override fun writeNative(addr: Long, value: Dbbinding) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.iOrdinal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.obValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.obLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.obStatus)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.pTypeInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Dbobject>(64)
                    ).writeNative(addr + 40L, value.pObject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Dbbindext>(64)
                    ).writeNative(addr + 48L, value.pBindExt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.dwPart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.dwMemOwner)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.eParamIO)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 72L, value.cbMaxLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 84L, value.wType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 86L, value.bPrecision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 87L, value.bScale)
                }
            }

        public operator fun invoke(
            iOrdinal: Int = 0,
            obValue: Int = 0,
            obLength: Int = 0,
            obStatus: Int = 0,
            pTypeInfo: MutPtr<CVoid> = MutPtr(0L),
            pObject: MutPtr<Dbobject> = MutPtr(0L),
            pBindExt: MutPtr<Dbbindext> = MutPtr(0L),
            dwPart: UInt = 0u,
            dwMemOwner: UInt = 0u,
            eParamIO: UInt = 0u,
            cbMaxLen: Int = 0,
            dwFlags: UInt = 0u,
            wType: UShort = 0u,
            bPrecision: UByte = 0u,
            bScale: UByte = 0u,
        ): Dbbinding =
            Dbbinding(
                iOrdinal = iOrdinal,
                obValue = obValue,
                obLength = obLength,
                obStatus = obStatus,
                pTypeInfoCtorArg = pTypeInfo,
                pObjectCtorArg = pObject,
                pBindExtCtorArg = pBindExt,
                dwPart = dwPart,
                dwMemOwner = dwMemOwner,
                eParamIO = eParamIO,
                cbMaxLen = cbMaxLen,
                dwFlags = dwFlags,
                wType = wType,
                bPrecision = bPrecision,
                bScale = bScale,
            )
    }
}

public class Dbcolumnaccess internal constructor(
    pDataCtorArg: MutPtr<CVoid>,
    public var columnid: Dbid,
    public var cbDataLen: Int,
    public var dwStatus: UInt,
    public var cbMaxLen: Int,
    public var dwReserved: Int,
    public var wType: UShort,
    public var bPrecision: UByte,
    public var bScale: UByte,
) {
    public var pData: MutPtr<CVoid> = pDataCtorArg
        internal set

    public constructor() : this(
        pDataCtorArg = MutPtr(0L),
        columnid = Dbid(),
        cbDataLen = 0,
        dwStatus = 0u,
        cbMaxLen = 0,
        dwReserved = 0,
        wType = 0u,
        bPrecision = 0u,
        bScale = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.pData

    public operator fun component2(): Dbid = this.columnid

    public operator fun component3(): Int = this.cbDataLen

    public operator fun component4(): UInt = this.dwStatus

    public operator fun component5(): Int = this.cbMaxLen

    public operator fun component6(): Int = this.dwReserved

    public operator fun component7(): UShort = this.wType

    public operator fun component8(): UByte = this.bPrecision

    public operator fun component9(): UByte = this.bScale

    public fun copy(pData: MutPtr<CVoid> = this.pData, columnid: Dbid = this.columnid, cbDataLen: Int = this.cbDataLen, dwStatus: UInt = this.dwStatus, cbMaxLen: Int = this.cbMaxLen, dwReserved: Int = this.dwReserved, wType: UShort = this.wType, bPrecision: UByte = this.bPrecision, bScale: UByte = this.bScale): Dbcolumnaccess = Dbcolumnaccess(pDataCtorArg = pData, columnid = columnid, cbDataLen = cbDataLen, dwStatus = dwStatus, cbMaxLen = cbMaxLen, dwReserved = dwReserved, wType = wType, bPrecision = bPrecision, bScale = bScale)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dbcolumnaccess) return false
        if (this.pData != other.pData) return false
        if (this.columnid != other.columnid) return false
        if (this.cbDataLen != other.cbDataLen) return false
        if (this.dwStatus != other.dwStatus) return false
        if (this.cbMaxLen != other.cbMaxLen) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.wType != other.wType) return false
        if (this.bPrecision != other.bPrecision) return false
        if (this.bScale != other.bScale) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pData.hashCode()
        result = 31 * result + this.columnid.hashCode()
        result = 31 * result + this.cbDataLen.hashCode()
        result = 31 * result + this.dwStatus.hashCode()
        result = 31 * result + this.cbMaxLen.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.wType.hashCode()
        result = 31 * result + this.bPrecision.hashCode()
        result = 31 * result + this.bScale.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pData: MutPtr<CVoid> = MutPtr(0L),
            columnid: Dbid = Dbid(),
            cbDataLen: Int = 0,
            dwStatus: UInt = 0u,
            cbMaxLen: Int = 0,
            dwReserved: Int = 0,
            wType: UShort = 0u,
            bPrecision: UByte = 0u,
            bScale: UByte = 0u,
        ): Dbcolumnaccess =
            Dbcolumnaccess(
                pDataCtorArg = pData,
                columnid = columnid,
                cbDataLen = cbDataLen,
                dwStatus = dwStatus,
                cbMaxLen = cbMaxLen,
                dwReserved = dwReserved,
                wType = wType,
                bPrecision = bPrecision,
                bScale = bScale,
            )
    }
}

public class Dbcolumndesc internal constructor(
    pwszTypeNameCtorArg: Pwstr,
    pTypeInfoCtorArg: MutPtr<CVoid>,
    rgPropertySetsCtorArg: MutPtr<Dbpropset>,
    pclsidCtorArg: MutPtr<Guid>,
    public var cPropertySets: UInt,
    public var ulColumnSize: Int,
    public var dbcid: Dbid,
    public var wType: UShort,
    public var bPrecision: UByte,
    public var bScale: UByte,
) {
    public var pwszTypeName: Pwstr = pwszTypeNameCtorArg
        internal set

    public var pTypeInfo: MutPtr<CVoid> = pTypeInfoCtorArg
        internal set

    public var rgPropertySets: MutPtr<Dbpropset> = rgPropertySetsCtorArg
        internal set

    public var pclsid: MutPtr<Guid> = pclsidCtorArg
        internal set

    public constructor() : this(
        pwszTypeNameCtorArg = MutPtr(0L),
        pTypeInfoCtorArg = MutPtr(0L),
        rgPropertySetsCtorArg = MutPtr(0L),
        pclsidCtorArg = MutPtr(0L),
        cPropertySets = 0u,
        ulColumnSize = 0,
        dbcid = Dbid(),
        wType = 0u,
        bPrecision = 0u,
        bScale = 0u,
    )

    public operator fun component1(): Pwstr = this.pwszTypeName

    public operator fun component2(): MutPtr<CVoid> = this.pTypeInfo

    public operator fun component3(): MutPtr<Dbpropset> = this.rgPropertySets

    public operator fun component4(): MutPtr<Guid> = this.pclsid

    public operator fun component5(): UInt = this.cPropertySets

    public operator fun component6(): Int = this.ulColumnSize

    public operator fun component7(): Dbid = this.dbcid

    public operator fun component8(): UShort = this.wType

    public operator fun component9(): UByte = this.bPrecision

    public operator fun component10(): UByte = this.bScale

    public fun copy(pwszTypeName: Pwstr = this.pwszTypeName, pTypeInfo: MutPtr<CVoid> = this.pTypeInfo, rgPropertySets: MutPtr<Dbpropset> = this.rgPropertySets, pclsid: MutPtr<Guid> = this.pclsid, cPropertySets: UInt = this.cPropertySets, ulColumnSize: Int = this.ulColumnSize, dbcid: Dbid = this.dbcid, wType: UShort = this.wType, bPrecision: UByte = this.bPrecision, bScale: UByte = this.bScale): Dbcolumndesc = Dbcolumndesc(pwszTypeNameCtorArg = pwszTypeName, pTypeInfoCtorArg = pTypeInfo, rgPropertySetsCtorArg = rgPropertySets, pclsidCtorArg = pclsid, cPropertySets = cPropertySets, ulColumnSize = ulColumnSize, dbcid = dbcid, wType = wType, bPrecision = bPrecision, bScale = bScale)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dbcolumndesc) return false
        if (this.pwszTypeName != other.pwszTypeName) return false
        if (this.pTypeInfo != other.pTypeInfo) return false
        if (this.rgPropertySets != other.rgPropertySets) return false
        if (this.pclsid != other.pclsid) return false
        if (this.cPropertySets != other.cPropertySets) return false
        if (this.ulColumnSize != other.ulColumnSize) return false
        if (this.dbcid != other.dbcid) return false
        if (this.wType != other.wType) return false
        if (this.bPrecision != other.bPrecision) return false
        if (this.bScale != other.bScale) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszTypeName.hashCode()
        result = 31 * result + this.pTypeInfo.hashCode()
        result = 31 * result + this.rgPropertySets.hashCode()
        result = 31 * result + this.pclsid.hashCode()
        result = 31 * result + this.cPropertySets.hashCode()
        result = 31 * result + this.ulColumnSize.hashCode()
        result = 31 * result + this.dbcid.hashCode()
        result = 31 * result + this.wType.hashCode()
        result = 31 * result + this.bPrecision.hashCode()
        result = 31 * result + this.bScale.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszTypeName: Pwstr = MutPtr(0L),
            pTypeInfo: MutPtr<CVoid> = MutPtr(0L),
            rgPropertySets: MutPtr<Dbpropset> = MutPtr(0L),
            pclsid: MutPtr<Guid> = MutPtr(0L),
            cPropertySets: UInt = 0u,
            ulColumnSize: Int = 0,
            dbcid: Dbid = Dbid(),
            wType: UShort = 0u,
            bPrecision: UByte = 0u,
            bScale: UByte = 0u,
        ): Dbcolumndesc =
            Dbcolumndesc(
                pwszTypeNameCtorArg = pwszTypeName,
                pTypeInfoCtorArg = pTypeInfo,
                rgPropertySetsCtorArg = rgPropertySets,
                pclsidCtorArg = pclsid,
                cPropertySets = cPropertySets,
                ulColumnSize = ulColumnSize,
                dbcid = dbcid,
                wType = wType,
                bPrecision = bPrecision,
                bScale = bScale,
            )
    }
}

public class Dbcolumninfo internal constructor(
    pwszNameCtorArg: Pwstr,
    pTypeInfoCtorArg: MutPtr<CVoid>,
    public var iOrdinal: Int,
    public var dwFlags: UInt,
    public var ulColumnSize: Int,
    public var wType: UShort,
    public var bPrecision: UByte,
    public var bScale: UByte,
    public var columnid: Dbid,
) {
    public var pwszName: Pwstr = pwszNameCtorArg
        internal set

    public var pTypeInfo: MutPtr<CVoid> = pTypeInfoCtorArg
        internal set

    public constructor() : this(
        pwszNameCtorArg = MutPtr(0L),
        pTypeInfoCtorArg = MutPtr(0L),
        iOrdinal = 0,
        dwFlags = 0u,
        ulColumnSize = 0,
        wType = 0u,
        bPrecision = 0u,
        bScale = 0u,
        columnid = Dbid(),
    )

    public operator fun component1(): Pwstr = this.pwszName

    public operator fun component2(): MutPtr<CVoid> = this.pTypeInfo

    public operator fun component3(): Int = this.iOrdinal

    public operator fun component4(): UInt = this.dwFlags

    public operator fun component5(): Int = this.ulColumnSize

    public operator fun component6(): UShort = this.wType

    public operator fun component7(): UByte = this.bPrecision

    public operator fun component8(): UByte = this.bScale

    public operator fun component9(): Dbid = this.columnid

    public fun copy(pwszName: Pwstr = this.pwszName, pTypeInfo: MutPtr<CVoid> = this.pTypeInfo, iOrdinal: Int = this.iOrdinal, dwFlags: UInt = this.dwFlags, ulColumnSize: Int = this.ulColumnSize, wType: UShort = this.wType, bPrecision: UByte = this.bPrecision, bScale: UByte = this.bScale, columnid: Dbid = this.columnid): Dbcolumninfo = Dbcolumninfo(pwszNameCtorArg = pwszName, pTypeInfoCtorArg = pTypeInfo, iOrdinal = iOrdinal, dwFlags = dwFlags, ulColumnSize = ulColumnSize, wType = wType, bPrecision = bPrecision, bScale = bScale, columnid = columnid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dbcolumninfo) return false
        if (this.pwszName != other.pwszName) return false
        if (this.pTypeInfo != other.pTypeInfo) return false
        if (this.iOrdinal != other.iOrdinal) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.ulColumnSize != other.ulColumnSize) return false
        if (this.wType != other.wType) return false
        if (this.bPrecision != other.bPrecision) return false
        if (this.bScale != other.bScale) return false
        if (this.columnid != other.columnid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszName.hashCode()
        result = 31 * result + this.pTypeInfo.hashCode()
        result = 31 * result + this.iOrdinal.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.ulColumnSize.hashCode()
        result = 31 * result + this.wType.hashCode()
        result = 31 * result + this.bPrecision.hashCode()
        result = 31 * result + this.bScale.hashCode()
        result = 31 * result + this.columnid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszName: Pwstr = MutPtr(0L),
            pTypeInfo: MutPtr<CVoid> = MutPtr(0L),
            iOrdinal: Int = 0,
            dwFlags: UInt = 0u,
            ulColumnSize: Int = 0,
            wType: UShort = 0u,
            bPrecision: UByte = 0u,
            bScale: UByte = 0u,
            columnid: Dbid = Dbid(),
        ): Dbcolumninfo =
            Dbcolumninfo(
                pwszNameCtorArg = pwszName,
                pTypeInfoCtorArg = pTypeInfo,
                iOrdinal = iOrdinal,
                dwFlags = dwFlags,
                ulColumnSize = ulColumnSize,
                wType = wType,
                bPrecision = bPrecision,
                bScale = bScale,
                columnid = columnid,
            )
    }
}

public class Dbconstraintdesc internal constructor(
    pConstraintIDCtorArg: MutPtr<Dbid>,
    public var constraintType: UInt,
    public var cColumns: Int,
    rgColumnListCtorArg: MutPtr<Dbid>,
    pReferencedTableIDCtorArg: MutPtr<Dbid>,
    public var cForeignKeyColumns: Int,
    rgForeignKeyColumnListCtorArg: MutPtr<Dbid>,
    pwszConstraintTextCtorArg: Pwstr,
    public var updateRule: UInt,
    public var deleteRule: UInt,
    public var matchType: UInt,
    public var deferrability: UInt,
    public var cReserved: Int,
    rgReservedCtorArg: MutPtr<Dbpropset>,
) {
    public var pConstraintID: MutPtr<Dbid> = pConstraintIDCtorArg
        internal set

    public var rgColumnList: MutPtr<Dbid> = rgColumnListCtorArg
        internal set

    public var pReferencedTableID: MutPtr<Dbid> = pReferencedTableIDCtorArg
        internal set

    public var rgForeignKeyColumnList: MutPtr<Dbid> = rgForeignKeyColumnListCtorArg
        internal set

    public var pwszConstraintText: Pwstr = pwszConstraintTextCtorArg
        internal set

    public var rgReserved: MutPtr<Dbpropset> = rgReservedCtorArg
        internal set

    public constructor() : this(
        pConstraintIDCtorArg = MutPtr(0L),
        constraintType = 0u,
        cColumns = 0,
        rgColumnListCtorArg = MutPtr(0L),
        pReferencedTableIDCtorArg = MutPtr(0L),
        cForeignKeyColumns = 0,
        rgForeignKeyColumnListCtorArg = MutPtr(0L),
        pwszConstraintTextCtorArg = MutPtr(0L),
        updateRule = 0u,
        deleteRule = 0u,
        matchType = 0u,
        deferrability = 0u,
        cReserved = 0,
        rgReservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Dbid> = this.pConstraintID

    public operator fun component2(): UInt = this.constraintType

    public operator fun component3(): Int = this.cColumns

    public operator fun component4(): MutPtr<Dbid> = this.rgColumnList

    public operator fun component5(): MutPtr<Dbid> = this.pReferencedTableID

    public operator fun component6(): Int = this.cForeignKeyColumns

    public operator fun component7(): MutPtr<Dbid> = this.rgForeignKeyColumnList

    public operator fun component8(): Pwstr = this.pwszConstraintText

    public operator fun component9(): UInt = this.updateRule

    public operator fun component10(): UInt = this.deleteRule

    public operator fun component11(): UInt = this.matchType

    public operator fun component12(): UInt = this.deferrability

    public operator fun component13(): Int = this.cReserved

    public operator fun component14(): MutPtr<Dbpropset> = this.rgReserved

    public fun copy(pConstraintID: MutPtr<Dbid> = this.pConstraintID, constraintType: UInt = this.constraintType, cColumns: Int = this.cColumns, rgColumnList: MutPtr<Dbid> = this.rgColumnList, pReferencedTableID: MutPtr<Dbid> = this.pReferencedTableID, cForeignKeyColumns: Int = this.cForeignKeyColumns, rgForeignKeyColumnList: MutPtr<Dbid> = this.rgForeignKeyColumnList, pwszConstraintText: Pwstr = this.pwszConstraintText, updateRule: UInt = this.updateRule, deleteRule: UInt = this.deleteRule, matchType: UInt = this.matchType, deferrability: UInt = this.deferrability, cReserved: Int = this.cReserved, rgReserved: MutPtr<Dbpropset> = this.rgReserved): Dbconstraintdesc = Dbconstraintdesc(pConstraintIDCtorArg = pConstraintID, constraintType = constraintType, cColumns = cColumns, rgColumnListCtorArg = rgColumnList, pReferencedTableIDCtorArg = pReferencedTableID, cForeignKeyColumns = cForeignKeyColumns, rgForeignKeyColumnListCtorArg = rgForeignKeyColumnList, pwszConstraintTextCtorArg = pwszConstraintText, updateRule = updateRule, deleteRule = deleteRule, matchType = matchType, deferrability = deferrability, cReserved = cReserved, rgReservedCtorArg = rgReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dbconstraintdesc) return false
        if (this.pConstraintID != other.pConstraintID) return false
        if (this.constraintType != other.constraintType) return false
        if (this.cColumns != other.cColumns) return false
        if (this.rgColumnList != other.rgColumnList) return false
        if (this.pReferencedTableID != other.pReferencedTableID) return false
        if (this.cForeignKeyColumns != other.cForeignKeyColumns) return false
        if (this.rgForeignKeyColumnList != other.rgForeignKeyColumnList) return false
        if (this.pwszConstraintText != other.pwszConstraintText) return false
        if (this.updateRule != other.updateRule) return false
        if (this.deleteRule != other.deleteRule) return false
        if (this.matchType != other.matchType) return false
        if (this.deferrability != other.deferrability) return false
        if (this.cReserved != other.cReserved) return false
        if (this.rgReserved != other.rgReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pConstraintID.hashCode()
        result = 31 * result + this.constraintType.hashCode()
        result = 31 * result + this.cColumns.hashCode()
        result = 31 * result + this.rgColumnList.hashCode()
        result = 31 * result + this.pReferencedTableID.hashCode()
        result = 31 * result + this.cForeignKeyColumns.hashCode()
        result = 31 * result + this.rgForeignKeyColumnList.hashCode()
        result = 31 * result + this.pwszConstraintText.hashCode()
        result = 31 * result + this.updateRule.hashCode()
        result = 31 * result + this.deleteRule.hashCode()
        result = 31 * result + this.matchType.hashCode()
        result = 31 * result + this.deferrability.hashCode()
        result = 31 * result + this.cReserved.hashCode()
        result = 31 * result + this.rgReserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pConstraintID: MutPtr<Dbid> = MutPtr(0L),
            constraintType: UInt = 0u,
            cColumns: Int = 0,
            rgColumnList: MutPtr<Dbid> = MutPtr(0L),
            pReferencedTableID: MutPtr<Dbid> = MutPtr(0L),
            cForeignKeyColumns: Int = 0,
            rgForeignKeyColumnList: MutPtr<Dbid> = MutPtr(0L),
            pwszConstraintText: Pwstr = MutPtr(0L),
            updateRule: UInt = 0u,
            deleteRule: UInt = 0u,
            matchType: UInt = 0u,
            deferrability: UInt = 0u,
            cReserved: Int = 0,
            rgReserved: MutPtr<Dbpropset> = MutPtr(0L),
        ): Dbconstraintdesc =
            Dbconstraintdesc(
                pConstraintIDCtorArg = pConstraintID,
                constraintType = constraintType,
                cColumns = cColumns,
                rgColumnListCtorArg = rgColumnList,
                pReferencedTableIDCtorArg = pReferencedTableID,
                cForeignKeyColumns = cForeignKeyColumns,
                rgForeignKeyColumnListCtorArg = rgForeignKeyColumnList,
                pwszConstraintTextCtorArg = pwszConstraintText,
                updateRule = updateRule,
                deleteRule = deleteRule,
                matchType = matchType,
                deferrability = deferrability,
                cReserved = cReserved,
                rgReservedCtorArg = rgReserved,
            )
    }
}

public data class Dbcost(
    public var eKind: UInt = 0u,
    public var dwUnits: UInt = 0u,
    public var lValue: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbcost> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbcost> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Dbcost =
                    Dbcost(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dbcost) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.eKind)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.lValue)
                }
            }
    }
}

public data class Dbdate(
    public var year: Short = 0,
    public var month: UShort = 0u,
    public var day: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbdate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbdate> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): Dbdate =
                    Dbdate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dbdate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.year)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.month)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.day)
                }
            }
    }
}

public data class Dbdatetim4(
    public var numdays: UShort = 0u,
    public var nummins: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbdatetim4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbdatetim4> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Dbdatetim4 =
                    Dbdatetim4(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Dbdatetim4) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.numdays)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.nummins)
                }
            }
    }
}

public data class Dbdatetime(
    public var dtdays: Int = 0,
    public var dttime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbdatetime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbdatetime> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Dbdatetime =
                    Dbdatetime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dbdatetime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.dtdays)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dttime)
                }
            }
    }
}

public data class Dbfailureinfo(
    public var hRow: Int = 0,
    public var iColumn: Int = 0,
    public var failure: Hresult = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbfailureinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbfailureinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Dbfailureinfo =
                    Dbfailureinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Dbfailureinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.hRow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.iColumn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.failure)
                }
            }
    }
}

public class Dbimplicitsession internal constructor(
    pUnkOuterCtorArg: MutPtr<CVoid>,
    piidCtorArg: MutPtr<Guid>,
    pSessionCtorArg: MutPtr<CVoid>,
) {
    public var pUnkOuter: MutPtr<CVoid> = pUnkOuterCtorArg
        internal set

    public var piid: MutPtr<Guid> = piidCtorArg
        internal set

    public var pSession: MutPtr<CVoid> = pSessionCtorArg
        internal set

    public constructor() : this(
        pUnkOuterCtorArg = MutPtr(0L),
        piidCtorArg = MutPtr(0L),
        pSessionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.pUnkOuter

    public operator fun component2(): MutPtr<Guid> = this.piid

    public operator fun component3(): MutPtr<CVoid> = this.pSession

    public fun copy(pUnkOuter: MutPtr<CVoid> = this.pUnkOuter, piid: MutPtr<Guid> = this.piid, pSession: MutPtr<CVoid> = this.pSession): Dbimplicitsession = Dbimplicitsession(pUnkOuterCtorArg = pUnkOuter, piidCtorArg = piid, pSessionCtorArg = pSession)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dbimplicitsession) return false
        if (this.pUnkOuter != other.pUnkOuter) return false
        if (this.piid != other.piid) return false
        if (this.pSession != other.pSession) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pUnkOuter.hashCode()
        result = 31 * result + this.piid.hashCode()
        result = 31 * result + this.pSession.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbimplicitsession> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbimplicitsession> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Dbimplicitsession =
                    Dbimplicitsession(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Guid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Dbimplicitsession) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.pUnkOuter)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Guid>(64)
                    ).writeNative(addr + 8L, value.piid)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.pSession)
                }
            }

        public operator fun invoke(
            pUnkOuter: MutPtr<CVoid> = MutPtr(0L),
            piid: MutPtr<Guid> = MutPtr(0L),
            pSession: MutPtr<CVoid> = MutPtr(0L),
        ): Dbimplicitsession =
            Dbimplicitsession(
                pUnkOuterCtorArg = pUnkOuter,
                piidCtorArg = piid,
                pSessionCtorArg = pSession,
            )
    }
}

public class Dbindexcolumndesc internal constructor(
    pColumnIDCtorArg: MutPtr<Dbid>,
    public var eIndexColOrder: UInt,
) {
    public var pColumnID: MutPtr<Dbid> = pColumnIDCtorArg
        internal set

    public constructor() : this(
        pColumnIDCtorArg = MutPtr(0L),
        eIndexColOrder = 0u,
    )

    public operator fun component1(): MutPtr<Dbid> = this.pColumnID

    public operator fun component2(): UInt = this.eIndexColOrder

    public fun copy(pColumnID: MutPtr<Dbid> = this.pColumnID, eIndexColOrder: UInt = this.eIndexColOrder): Dbindexcolumndesc = Dbindexcolumndesc(pColumnIDCtorArg = pColumnID, eIndexColOrder = eIndexColOrder)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dbindexcolumndesc) return false
        if (this.pColumnID != other.pColumnID) return false
        if (this.eIndexColOrder != other.eIndexColOrder) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pColumnID.hashCode()
        result = 31 * result + this.eIndexColOrder.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbindexcolumndesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbindexcolumndesc> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Dbindexcolumndesc =
                    Dbindexcolumndesc(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Dbid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dbindexcolumndesc) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Dbid>(64)
                    ).writeNative(addr, value.pColumnID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.eIndexColOrder)
                }
            }

        public operator fun invoke(
            pColumnID: MutPtr<Dbid> = MutPtr(0L),
            eIndexColOrder: UInt = 0u,
        ): Dbindexcolumndesc =
            Dbindexcolumndesc(
                pColumnIDCtorArg = pColumnID,
                eIndexColOrder = eIndexColOrder,
            )
    }
}

public class Dbliteralinfo internal constructor(
    pwszLiteralValueCtorArg: Pwstr,
    pwszInvalidCharsCtorArg: Pwstr,
    pwszInvalidStartingCharsCtorArg: Pwstr,
    public var lt: UInt,
    public var fSupported: Bool,
    public var cchMaxLen: UInt,
) {
    public var pwszLiteralValue: Pwstr = pwszLiteralValueCtorArg
        internal set

    public var pwszInvalidChars: Pwstr = pwszInvalidCharsCtorArg
        internal set

    public var pwszInvalidStartingChars: Pwstr = pwszInvalidStartingCharsCtorArg
        internal set

    public constructor() : this(
        pwszLiteralValueCtorArg = MutPtr(0L),
        pwszInvalidCharsCtorArg = MutPtr(0L),
        pwszInvalidStartingCharsCtorArg = MutPtr(0L),
        lt = 0u,
        fSupported = 0,
        cchMaxLen = 0u,
    )

    public operator fun component1(): Pwstr = this.pwszLiteralValue

    public operator fun component2(): Pwstr = this.pwszInvalidChars

    public operator fun component3(): Pwstr = this.pwszInvalidStartingChars

    public operator fun component4(): UInt = this.lt

    public operator fun component5(): Bool = this.fSupported

    public operator fun component6(): UInt = this.cchMaxLen

    public fun copy(pwszLiteralValue: Pwstr = this.pwszLiteralValue, pwszInvalidChars: Pwstr = this.pwszInvalidChars, pwszInvalidStartingChars: Pwstr = this.pwszInvalidStartingChars, lt: UInt = this.lt, fSupported: Bool = this.fSupported, cchMaxLen: UInt = this.cchMaxLen): Dbliteralinfo = Dbliteralinfo(pwszLiteralValueCtorArg = pwszLiteralValue, pwszInvalidCharsCtorArg = pwszInvalidChars, pwszInvalidStartingCharsCtorArg = pwszInvalidStartingChars, lt = lt, fSupported = fSupported, cchMaxLen = cchMaxLen)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dbliteralinfo) return false
        if (this.pwszLiteralValue != other.pwszLiteralValue) return false
        if (this.pwszInvalidChars != other.pwszInvalidChars) return false
        if (this.pwszInvalidStartingChars != other.pwszInvalidStartingChars) return false
        if (this.lt != other.lt) return false
        if (this.fSupported != other.fSupported) return false
        if (this.cchMaxLen != other.cchMaxLen) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszLiteralValue.hashCode()
        result = 31 * result + this.pwszInvalidChars.hashCode()
        result = 31 * result + this.pwszInvalidStartingChars.hashCode()
        result = 31 * result + this.lt.hashCode()
        result = 31 * result + this.fSupported.hashCode()
        result = 31 * result + this.cchMaxLen.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszLiteralValue: Pwstr = MutPtr(0L),
            pwszInvalidChars: Pwstr = MutPtr(0L),
            pwszInvalidStartingChars: Pwstr = MutPtr(0L),
            lt: UInt = 0u,
            fSupported: Bool = 0,
            cchMaxLen: UInt = 0u,
        ): Dbliteralinfo =
            Dbliteralinfo(
                pwszLiteralValueCtorArg = pwszLiteralValue,
                pwszInvalidCharsCtorArg = pwszInvalidChars,
                pwszInvalidStartingCharsCtorArg = pwszInvalidStartingChars,
                lt = lt,
                fSupported = fSupported,
                cchMaxLen = cchMaxLen,
            )
    }
}

public data class Dbmoney(
    public var mnyhigh: Int = 0,
    public var mnylow: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbmoney> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbmoney> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Dbmoney =
                    Dbmoney(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dbmoney) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.mnyhigh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mnylow)
                }
            }
    }
}

public data class Dbobject(
    public var dwFlags: UInt = 0u,
    public var iid: Guid = Guid(),
)

public class Dbparambindinfo internal constructor(
    pwszDataSourceTypeCtorArg: Pwstr,
    pwszNameCtorArg: Pwstr,
    public var ulParamSize: Int,
    public var dwFlags: UInt,
    public var bPrecision: UByte,
    public var bScale: UByte,
) {
    public var pwszDataSourceType: Pwstr = pwszDataSourceTypeCtorArg
        internal set

    public var pwszName: Pwstr = pwszNameCtorArg
        internal set

    public constructor() : this(
        pwszDataSourceTypeCtorArg = MutPtr(0L),
        pwszNameCtorArg = MutPtr(0L),
        ulParamSize = 0,
        dwFlags = 0u,
        bPrecision = 0u,
        bScale = 0u,
    )

    public operator fun component1(): Pwstr = this.pwszDataSourceType

    public operator fun component2(): Pwstr = this.pwszName

    public operator fun component3(): Int = this.ulParamSize

    public operator fun component4(): UInt = this.dwFlags

    public operator fun component5(): UByte = this.bPrecision

    public operator fun component6(): UByte = this.bScale

    public fun copy(pwszDataSourceType: Pwstr = this.pwszDataSourceType, pwszName: Pwstr = this.pwszName, ulParamSize: Int = this.ulParamSize, dwFlags: UInt = this.dwFlags, bPrecision: UByte = this.bPrecision, bScale: UByte = this.bScale): Dbparambindinfo = Dbparambindinfo(pwszDataSourceTypeCtorArg = pwszDataSourceType, pwszNameCtorArg = pwszName, ulParamSize = ulParamSize, dwFlags = dwFlags, bPrecision = bPrecision, bScale = bScale)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dbparambindinfo) return false
        if (this.pwszDataSourceType != other.pwszDataSourceType) return false
        if (this.pwszName != other.pwszName) return false
        if (this.ulParamSize != other.ulParamSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.bPrecision != other.bPrecision) return false
        if (this.bScale != other.bScale) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszDataSourceType.hashCode()
        result = 31 * result + this.pwszName.hashCode()
        result = 31 * result + this.ulParamSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.bPrecision.hashCode()
        result = 31 * result + this.bScale.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszDataSourceType: Pwstr = MutPtr(0L),
            pwszName: Pwstr = MutPtr(0L),
            ulParamSize: Int = 0,
            dwFlags: UInt = 0u,
            bPrecision: UByte = 0u,
            bScale: UByte = 0u,
        ): Dbparambindinfo =
            Dbparambindinfo(
                pwszDataSourceTypeCtorArg = pwszDataSourceType,
                pwszNameCtorArg = pwszName,
                ulParamSize = ulParamSize,
                dwFlags = dwFlags,
                bPrecision = bPrecision,
                bScale = bScale,
            )
    }
}

public class Dbparaminfo internal constructor(
    public var dwFlags: UInt,
    public var iOrdinal: Int,
    pwszNameCtorArg: Pwstr,
    pTypeInfoCtorArg: MutPtr<CVoid>,
    public var ulParamSize: Int,
    public var wType: UShort,
    public var bPrecision: UByte,
    public var bScale: UByte,
) {
    public var pwszName: Pwstr = pwszNameCtorArg
        internal set

    public var pTypeInfo: MutPtr<CVoid> = pTypeInfoCtorArg
        internal set

    public constructor() : this(
        dwFlags = 0u,
        iOrdinal = 0,
        pwszNameCtorArg = MutPtr(0L),
        pTypeInfoCtorArg = MutPtr(0L),
        ulParamSize = 0,
        wType = 0u,
        bPrecision = 0u,
        bScale = 0u,
    )

    public operator fun component1(): UInt = this.dwFlags

    public operator fun component2(): Int = this.iOrdinal

    public operator fun component3(): Pwstr = this.pwszName

    public operator fun component4(): MutPtr<CVoid> = this.pTypeInfo

    public operator fun component5(): Int = this.ulParamSize

    public operator fun component6(): UShort = this.wType

    public operator fun component7(): UByte = this.bPrecision

    public operator fun component8(): UByte = this.bScale

    public fun copy(dwFlags: UInt = this.dwFlags, iOrdinal: Int = this.iOrdinal, pwszName: Pwstr = this.pwszName, pTypeInfo: MutPtr<CVoid> = this.pTypeInfo, ulParamSize: Int = this.ulParamSize, wType: UShort = this.wType, bPrecision: UByte = this.bPrecision, bScale: UByte = this.bScale): Dbparaminfo = Dbparaminfo(dwFlags = dwFlags, iOrdinal = iOrdinal, pwszNameCtorArg = pwszName, pTypeInfoCtorArg = pTypeInfo, ulParamSize = ulParamSize, wType = wType, bPrecision = bPrecision, bScale = bScale)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dbparaminfo) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.iOrdinal != other.iOrdinal) return false
        if (this.pwszName != other.pwszName) return false
        if (this.pTypeInfo != other.pTypeInfo) return false
        if (this.ulParamSize != other.ulParamSize) return false
        if (this.wType != other.wType) return false
        if (this.bPrecision != other.bPrecision) return false
        if (this.bScale != other.bScale) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.iOrdinal.hashCode()
        result = 31 * result + this.pwszName.hashCode()
        result = 31 * result + this.pTypeInfo.hashCode()
        result = 31 * result + this.ulParamSize.hashCode()
        result = 31 * result + this.wType.hashCode()
        result = 31 * result + this.bPrecision.hashCode()
        result = 31 * result + this.bScale.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwFlags: UInt = 0u,
            iOrdinal: Int = 0,
            pwszName: Pwstr = MutPtr(0L),
            pTypeInfo: MutPtr<CVoid> = MutPtr(0L),
            ulParamSize: Int = 0,
            wType: UShort = 0u,
            bPrecision: UByte = 0u,
            bScale: UByte = 0u,
        ): Dbparaminfo =
            Dbparaminfo(
                dwFlags = dwFlags,
                iOrdinal = iOrdinal,
                pwszNameCtorArg = pwszName,
                pTypeInfoCtorArg = pTypeInfo,
                ulParamSize = ulParamSize,
                wType = wType,
                bPrecision = bPrecision,
                bScale = bScale,
            )
    }
}

public class Dbparams internal constructor(
    pDataCtorArg: MutPtr<CVoid>,
    public var cParamSets: Int,
    public var hAccessor: Haccessor,
) {
    public var pData: MutPtr<CVoid> = pDataCtorArg
        internal set

    public constructor() : this(
        pDataCtorArg = MutPtr(0L),
        cParamSets = 0,
        hAccessor = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.pData

    public operator fun component2(): Int = this.cParamSets

    public operator fun component3(): Haccessor = this.hAccessor

    public fun copy(pData: MutPtr<CVoid> = this.pData, cParamSets: Int = this.cParamSets, hAccessor: Haccessor = this.hAccessor): Dbparams = Dbparams(pDataCtorArg = pData, cParamSets = cParamSets, hAccessor = hAccessor)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dbparams) return false
        if (this.pData != other.pData) return false
        if (this.cParamSets != other.cParamSets) return false
        if (this.hAccessor != other.hAccessor) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pData.hashCode()
        result = 31 * result + this.cParamSets.hashCode()
        result = 31 * result + this.hAccessor.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbparams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbparams> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Dbparams =
                    Dbparams(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Dbparams) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.pData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.cParamSets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.hAccessor)
                }
            }

        public operator fun invoke(
            pData: MutPtr<CVoid> = MutPtr(0L),
            cParamSets: Int = 0,
            hAccessor: Haccessor = 0,
        ): Dbparams =
            Dbparams(
                pDataCtorArg = pData,
                cParamSets = cParamSets,
                hAccessor = hAccessor,
            )
    }
}

public data class Dbprop(
    public var dwPropertyID: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var dwStatus: UInt = 0u,
    public var colid: Dbid = Dbid(),
    public var vValue: Variant.Variant = Variant.Variant(),
)

public class Dbpropidset internal constructor(
    rgPropertyIDsCtorArg: MutPtr<UInt>,
    public var cPropertyIDs: UInt,
    public var guidPropertySet: Guid,
) {
    public var rgPropertyIDs: MutPtr<UInt> = rgPropertyIDsCtorArg
        internal set

    public constructor() : this(
        rgPropertyIDsCtorArg = MutPtr(0L),
        cPropertyIDs = 0u,
        guidPropertySet = Guid(),
    )

    public operator fun component1(): MutPtr<UInt> = this.rgPropertyIDs

    public operator fun component2(): UInt = this.cPropertyIDs

    public operator fun component3(): Guid = this.guidPropertySet

    public fun copy(rgPropertyIDs: MutPtr<UInt> = this.rgPropertyIDs, cPropertyIDs: UInt = this.cPropertyIDs, guidPropertySet: Guid = this.guidPropertySet): Dbpropidset = Dbpropidset(rgPropertyIDsCtorArg = rgPropertyIDs, cPropertyIDs = cPropertyIDs, guidPropertySet = guidPropertySet)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dbpropidset) return false
        if (this.rgPropertyIDs != other.rgPropertyIDs) return false
        if (this.cPropertyIDs != other.cPropertyIDs) return false
        if (this.guidPropertySet != other.guidPropertySet) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rgPropertyIDs.hashCode()
        result = 31 * result + this.cPropertyIDs.hashCode()
        result = 31 * result + this.guidPropertySet.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            rgPropertyIDs: MutPtr<UInt> = MutPtr(0L),
            cPropertyIDs: UInt = 0u,
            guidPropertySet: Guid = Guid(),
        ): Dbpropidset =
            Dbpropidset(
                rgPropertyIDsCtorArg = rgPropertyIDs,
                cPropertyIDs = cPropertyIDs,
                guidPropertySet = guidPropertySet,
            )
    }
}

public class Dbpropinfo internal constructor(
    pwszDescriptionCtorArg: Pwstr,
    public var dwPropertyID: UInt,
    public var dwFlags: UInt,
    public var vtType: Variant.Varenum,
    public var vValues: Variant.Variant,
) {
    public var pwszDescription: Pwstr = pwszDescriptionCtorArg
        internal set

    public constructor() : this(
        pwszDescriptionCtorArg = MutPtr(0L),
        dwPropertyID = 0u,
        dwFlags = 0u,
        vtType = 0u,
        vValues = Variant.Variant(),
    )

    public operator fun component1(): Pwstr = this.pwszDescription

    public operator fun component2(): UInt = this.dwPropertyID

    public operator fun component3(): UInt = this.dwFlags

    public operator fun component4(): Variant.Varenum = this.vtType

    public operator fun component5(): Variant.Variant = this.vValues

    public fun copy(pwszDescription: Pwstr = this.pwszDescription, dwPropertyID: UInt = this.dwPropertyID, dwFlags: UInt = this.dwFlags, vtType: Variant.Varenum = this.vtType, vValues: Variant.Variant = this.vValues): Dbpropinfo = Dbpropinfo(pwszDescriptionCtorArg = pwszDescription, dwPropertyID = dwPropertyID, dwFlags = dwFlags, vtType = vtType, vValues = vValues)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dbpropinfo) return false
        if (this.pwszDescription != other.pwszDescription) return false
        if (this.dwPropertyID != other.dwPropertyID) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.vtType != other.vtType) return false
        if (this.vValues != other.vValues) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszDescription.hashCode()
        result = 31 * result + this.dwPropertyID.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.vtType.hashCode()
        result = 31 * result + this.vValues.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszDescription: Pwstr = MutPtr(0L),
            dwPropertyID: UInt = 0u,
            dwFlags: UInt = 0u,
            vtType: Variant.Varenum = 0u,
            vValues: Variant.Variant = Variant.Variant(),
        ): Dbpropinfo =
            Dbpropinfo(
                pwszDescriptionCtorArg = pwszDescription,
                dwPropertyID = dwPropertyID,
                dwFlags = dwFlags,
                vtType = vtType,
                vValues = vValues,
            )
    }
}

public class Dbpropinfoset internal constructor(
    rgPropertyInfosCtorArg: MutPtr<Dbpropinfo>,
    public var cPropertyInfos: UInt,
    public var guidPropertySet: Guid,
) {
    public var rgPropertyInfos: MutPtr<Dbpropinfo> = rgPropertyInfosCtorArg
        internal set

    public constructor() : this(
        rgPropertyInfosCtorArg = MutPtr(0L),
        cPropertyInfos = 0u,
        guidPropertySet = Guid(),
    )

    public operator fun component1(): MutPtr<Dbpropinfo> = this.rgPropertyInfos

    public operator fun component2(): UInt = this.cPropertyInfos

    public operator fun component3(): Guid = this.guidPropertySet

    public fun copy(rgPropertyInfos: MutPtr<Dbpropinfo> = this.rgPropertyInfos, cPropertyInfos: UInt = this.cPropertyInfos, guidPropertySet: Guid = this.guidPropertySet): Dbpropinfoset = Dbpropinfoset(rgPropertyInfosCtorArg = rgPropertyInfos, cPropertyInfos = cPropertyInfos, guidPropertySet = guidPropertySet)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dbpropinfoset) return false
        if (this.rgPropertyInfos != other.rgPropertyInfos) return false
        if (this.cPropertyInfos != other.cPropertyInfos) return false
        if (this.guidPropertySet != other.guidPropertySet) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rgPropertyInfos.hashCode()
        result = 31 * result + this.cPropertyInfos.hashCode()
        result = 31 * result + this.guidPropertySet.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            rgPropertyInfos: MutPtr<Dbpropinfo> = MutPtr(0L),
            cPropertyInfos: UInt = 0u,
            guidPropertySet: Guid = Guid(),
        ): Dbpropinfoset =
            Dbpropinfoset(
                rgPropertyInfosCtorArg = rgPropertyInfos,
                cPropertyInfos = cPropertyInfos,
                guidPropertySet = guidPropertySet,
            )
    }
}

public class Dbpropset internal constructor(
    rgPropertiesCtorArg: MutPtr<Dbprop>,
    public var cProperties: UInt,
    public var guidPropertySet: Guid,
) {
    public var rgProperties: MutPtr<Dbprop> = rgPropertiesCtorArg
        internal set

    public constructor() : this(
        rgPropertiesCtorArg = MutPtr(0L),
        cProperties = 0u,
        guidPropertySet = Guid(),
    )

    public operator fun component1(): MutPtr<Dbprop> = this.rgProperties

    public operator fun component2(): UInt = this.cProperties

    public operator fun component3(): Guid = this.guidPropertySet

    public fun copy(rgProperties: MutPtr<Dbprop> = this.rgProperties, cProperties: UInt = this.cProperties, guidPropertySet: Guid = this.guidPropertySet): Dbpropset = Dbpropset(rgPropertiesCtorArg = rgProperties, cProperties = cProperties, guidPropertySet = guidPropertySet)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dbpropset) return false
        if (this.rgProperties != other.rgProperties) return false
        if (this.cProperties != other.cProperties) return false
        if (this.guidPropertySet != other.guidPropertySet) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rgProperties.hashCode()
        result = 31 * result + this.cProperties.hashCode()
        result = 31 * result + this.guidPropertySet.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            rgProperties: MutPtr<Dbprop> = MutPtr(0L),
            cProperties: UInt = 0u,
            guidPropertySet: Guid = Guid(),
        ): Dbpropset =
            Dbpropset(
                rgPropertiesCtorArg = rgProperties,
                cProperties = cProperties,
                guidPropertySet = guidPropertySet,
            )
    }
}

public data class Dbrowwatchchange(
    public var hRegion: Int = 0,
    public var eChangeKind: UInt = 0u,
    public var hRow: Int = 0,
    public var iRow: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbrowwatchchange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbrowwatchchange> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Dbrowwatchchange =
                    Dbrowwatchchange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Dbrowwatchchange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.hRegion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.eChangeKind)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.hRow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.iRow)
                }
            }
    }
}

public data class Dbtime(
    public var hour: UShort = 0u,
    public var minute: UShort = 0u,
    public var second: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbtime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbtime> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): Dbtime =
                    Dbtime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dbtime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.hour)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.minute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.second)
                }
            }
    }
}

public data class Dbtimestamp(
    public var year: Short = 0,
    public var month: UShort = 0u,
    public var day: UShort = 0u,
    public var hour: UShort = 0u,
    public var minute: UShort = 0u,
    public var second: UShort = 0u,
    public var fraction: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbtimestamp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbtimestamp> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Dbtimestamp =
                    Dbtimestamp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Dbtimestamp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.year)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.month)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.day)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.hour)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.minute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.second)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fraction)
                }
            }
    }
}

public data class Dbvarybin(
    public var len: Short = 0,
    public var array: UByteArray = UByteArray(8001),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dbvarybin) return false
        if (this.len != other.len) return false
        if (!this.array.contentEquals(other.array)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.len.hashCode()
        result = 31 * result + this.array.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbvarybin> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbvarybin> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8004L
                override fun readNative(addr: Long): Dbvarybin =
                    Dbvarybin(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8001).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Dbvarybin) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.len)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8001).toInt())
                    ).writeNative(addr + 2L, value.array.toList())
                }
            }
    }
}

public data class Dbvarychar(
    public var len: Short = 0,
    public var str: ByteArray = ByteArray(8001),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dbvarychar) return false
        if (this.len != other.len) return false
        if (!this.str.contentEquals(other.str)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.len.hashCode()
        result = 31 * result + this.str.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbvarychar> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbvarychar> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8004L
                override fun readNative(addr: Long): Dbvarychar =
                    Dbvarychar(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (8001).toInt())
                        ).readNative(addr + 2L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Dbvarychar) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.len)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (8001).toInt())
                    ).writeNative(addr + 2L, value.str.toList())
                }
            }
    }
}

public class Dbvector internal constructor(
    public var size: Int,
    ptrCtorArg: MutPtr<CVoid>,
) {
    public var ptr: MutPtr<CVoid> = ptrCtorArg
        internal set

    public constructor() : this(
        size = 0,
        ptrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.size

    public operator fun component2(): MutPtr<CVoid> = this.ptr

    public fun copy(size: Int = this.size, ptr: MutPtr<CVoid> = this.ptr): Dbvector = Dbvector(size = size, ptrCtorArg = ptr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dbvector) return false
        if (this.size != other.size) return false
        if (this.ptr != other.ptr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.ptr.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbvector> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dbvector> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Dbvector =
                    Dbvector(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dbvector) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.ptr)
                }
            }

        public operator fun invoke(
            size: Int = 0,
            ptr: MutPtr<CVoid> = MutPtr(0L),
        ): Dbvector =
            Dbvector(
                size = size,
                ptrCtorArg = ptr,
            )
    }
}

public data class DbNumeric(
    public var precision: UByte = 0u,
    public var scale: UByte = 0u,
    public var sign: UByte = 0u,
    public var value: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DbNumeric) return false
        if (this.precision != other.precision) return false
        if (this.scale != other.scale) return false
        if (this.sign != other.sign) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.precision.hashCode()
        result = 31 * result + this.scale.hashCode()
        result = 31 * result + this.sign.hashCode()
        result = 31 * result + this.value.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DbNumeric> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DbNumeric> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 19L
                override fun readNative(addr: Long): DbNumeric =
                    DbNumeric(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 3L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: DbNumeric) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.precision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.scale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.sign)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 3L, value.value.toList())
                }
            }
    }
}

public data class DbVarnumeric(
    public var precision: UByte = 0u,
    public var scale: Byte = 0,
    public var sign: UByte = 0u,
    public var value: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DbVarnumeric) return false
        if (this.precision != other.precision) return false
        if (this.scale != other.scale) return false
        if (this.sign != other.sign) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.precision.hashCode()
        result = 31 * result + this.scale.hashCode()
        result = 31 * result + this.sign.hashCode()
        result = 31 * result + this.value.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DbVarnumeric> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DbVarnumeric> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DbVarnumeric =
                    DbVarnumeric(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 3L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: DbVarnumeric) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.precision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 1L, value.scale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.sign)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 3L, value.value.toList())
                }
            }
    }
}

public data class Dcinfo(
    public var eInfoType: UInt = 0u,
    public var vData: Variant.Variant = Variant.Variant(),
)

public data class Errorinfo(
    public var hrError: Hresult = 0,
    public var dwMinor: UInt = 0u,
    public var clsid: Guid = Guid(),
    public var iid: Guid = Guid(),
    public var dispid: Int = 0,
)

public class FilteredDataSources internal constructor(
    pwcsExtensionCtorArg: Pcwstr,
    pwcsMimeCtorArg: Pcwstr,
    pClsidCtorArg: ConstPtr<Guid>,
    pwcsOverrideCtorArg: Pcwstr,
) {
    public var pwcsExtension: Pcwstr = pwcsExtensionCtorArg
        internal set

    public var pwcsMime: Pcwstr = pwcsMimeCtorArg
        internal set

    public var pClsid: ConstPtr<Guid> = pClsidCtorArg
        internal set

    public var pwcsOverride: Pcwstr = pwcsOverrideCtorArg
        internal set

    public constructor() : this(
        pwcsExtensionCtorArg = ConstPtr(0L),
        pwcsMimeCtorArg = ConstPtr(0L),
        pClsidCtorArg = ConstPtr(0L),
        pwcsOverrideCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.pwcsExtension

    public operator fun component2(): Pcwstr = this.pwcsMime

    public operator fun component3(): ConstPtr<Guid> = this.pClsid

    public operator fun component4(): Pcwstr = this.pwcsOverride

    public fun copy(pwcsExtension: Pcwstr = this.pwcsExtension, pwcsMime: Pcwstr = this.pwcsMime, pClsid: ConstPtr<Guid> = this.pClsid, pwcsOverride: Pcwstr = this.pwcsOverride): FilteredDataSources = FilteredDataSources(pwcsExtensionCtorArg = pwcsExtension, pwcsMimeCtorArg = pwcsMime, pClsidCtorArg = pClsid, pwcsOverrideCtorArg = pwcsOverride)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilteredDataSources) return false
        if (this.pwcsExtension != other.pwcsExtension) return false
        if (this.pwcsMime != other.pwcsMime) return false
        if (this.pClsid != other.pClsid) return false
        if (this.pwcsOverride != other.pwcsOverride) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwcsExtension.hashCode()
        result = 31 * result + this.pwcsMime.hashCode()
        result = 31 * result + this.pClsid.hashCode()
        result = 31 * result + this.pwcsOverride.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwcsExtension: Pcwstr = ConstPtr(0L),
            pwcsMime: Pcwstr = ConstPtr(0L),
            pClsid: ConstPtr<Guid> = ConstPtr(0L),
            pwcsOverride: Pcwstr = ConstPtr(0L),
        ): FilteredDataSources =
            FilteredDataSources(
                pwcsExtensionCtorArg = pwcsExtension,
                pwcsMimeCtorArg = pwcsMime,
                pClsidCtorArg = pClsid,
                pwcsOverrideCtorArg = pwcsOverride,
            )
    }
}

public data class Hitrange(
    public var iPosition: UInt = 0u,
    public var cLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Hitrange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Hitrange> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Hitrange =
                    Hitrange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Hitrange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.iPosition)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cLength)
                }
            }
    }
}

public data class IncrementalAccessInfo(
    public var dwSize: UInt = 0u,
    public var ftLastModifiedTime: Filetime = Filetime(),
)

public class Itemprop internal constructor(
    public var variantValue: Variant.Variant,
    pwszNameCtorArg: Pwstr,
) {
    public var pwszName: Pwstr = pwszNameCtorArg
        internal set

    public constructor() : this(
        variantValue = Variant.Variant(),
        pwszNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Variant.Variant = this.variantValue

    public operator fun component2(): Pwstr = this.pwszName

    public fun copy(variantValue: Variant.Variant = this.variantValue, pwszName: Pwstr = this.pwszName): Itemprop = Itemprop(variantValue = variantValue, pwszNameCtorArg = pwszName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Itemprop) return false
        if (this.variantValue != other.variantValue) return false
        if (this.pwszName != other.pwszName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.variantValue.hashCode()
        result = 31 * result + this.pwszName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            variantValue: Variant.Variant = Variant.Variant(),
            pwszName: Pwstr = MutPtr(0L),
        ): Itemprop =
            Itemprop(
                variantValue = variantValue,
                pwszNameCtorArg = pwszName,
            )
    }
}

public class ItemInfo internal constructor(
    public var dwSize: UInt,
    pcwszFromEMailCtorArg: Pcwstr,
    pcwszApplicationNameCtorArg: Pcwstr,
    pcwszCatalogNameCtorArg: Pcwstr,
    pcwszContentClassCtorArg: Pcwstr,
) {
    public var pcwszFromEMail: Pcwstr = pcwszFromEMailCtorArg
        internal set

    public var pcwszApplicationName: Pcwstr = pcwszApplicationNameCtorArg
        internal set

    public var pcwszCatalogName: Pcwstr = pcwszCatalogNameCtorArg
        internal set

    public var pcwszContentClass: Pcwstr = pcwszContentClassCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        pcwszFromEMailCtorArg = ConstPtr(0L),
        pcwszApplicationNameCtorArg = ConstPtr(0L),
        pcwszCatalogNameCtorArg = ConstPtr(0L),
        pcwszContentClassCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Pcwstr = this.pcwszFromEMail

    public operator fun component3(): Pcwstr = this.pcwszApplicationName

    public operator fun component4(): Pcwstr = this.pcwszCatalogName

    public operator fun component5(): Pcwstr = this.pcwszContentClass

    public fun copy(dwSize: UInt = this.dwSize, pcwszFromEMail: Pcwstr = this.pcwszFromEMail, pcwszApplicationName: Pcwstr = this.pcwszApplicationName, pcwszCatalogName: Pcwstr = this.pcwszCatalogName, pcwszContentClass: Pcwstr = this.pcwszContentClass): ItemInfo = ItemInfo(dwSize = dwSize, pcwszFromEMailCtorArg = pcwszFromEMail, pcwszApplicationNameCtorArg = pcwszApplicationName, pcwszCatalogNameCtorArg = pcwszCatalogName, pcwszContentClassCtorArg = pcwszContentClass)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ItemInfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.pcwszFromEMail != other.pcwszFromEMail) return false
        if (this.pcwszApplicationName != other.pcwszApplicationName) return false
        if (this.pcwszCatalogName != other.pcwszCatalogName) return false
        if (this.pcwszContentClass != other.pcwszContentClass) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.pcwszFromEMail.hashCode()
        result = 31 * result + this.pcwszApplicationName.hashCode()
        result = 31 * result + this.pcwszCatalogName.hashCode()
        result = 31 * result + this.pcwszContentClass.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            pcwszFromEMail: Pcwstr = ConstPtr(0L),
            pcwszApplicationName: Pcwstr = ConstPtr(0L),
            pcwszCatalogName: Pcwstr = ConstPtr(0L),
            pcwszContentClass: Pcwstr = ConstPtr(0L),
        ): ItemInfo =
            ItemInfo(
                dwSize = dwSize,
                pcwszFromEMailCtorArg = pcwszFromEMail,
                pcwszApplicationNameCtorArg = pcwszApplicationName,
                pcwszCatalogNameCtorArg = pcwszCatalogName,
                pcwszContentClassCtorArg = pcwszContentClass,
            )
    }
}

public data class Kaggetdiag(
    public var ulSize: UInt = 0u,
    public var vDiagInfo: Variant.Variant = Variant.Variant(),
    public var sDiagField: Short = 0,
)

public data class Kagreqdiag(
    public var ulDiagFlags: UInt = 0u,
    public var vt: Variant.Varenum = 0u,
    public var sDiagField: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kagreqdiag> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kagreqdiag> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Kagreqdiag =
                    Kagreqdiag(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Kagreqdiag) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulDiagFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.vt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.sDiagField)
                }
            }
    }
}

public class Mdaxisinfo internal constructor(
    public var cbSize: Int,
    public var iAxis: Int,
    public var cDimensions: Int,
    public var cCoordinates: Int,
    rgcColumnsCtorArg: MutPtr<Int>,
    rgpwszDimensionNamesCtorArg: MutPtr<Pwstr>,
) {
    public var rgcColumns: MutPtr<Int> = rgcColumnsCtorArg
        internal set

    public var rgpwszDimensionNames: MutPtr<Pwstr> = rgpwszDimensionNamesCtorArg
        internal set

    public constructor() : this(
        cbSize = 0,
        iAxis = 0,
        cDimensions = 0,
        cCoordinates = 0,
        rgcColumnsCtorArg = MutPtr(0L),
        rgpwszDimensionNamesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.cbSize

    public operator fun component2(): Int = this.iAxis

    public operator fun component3(): Int = this.cDimensions

    public operator fun component4(): Int = this.cCoordinates

    public operator fun component5(): MutPtr<Int> = this.rgcColumns

    public operator fun component6(): MutPtr<Pwstr> = this.rgpwszDimensionNames

    public fun copy(cbSize: Int = this.cbSize, iAxis: Int = this.iAxis, cDimensions: Int = this.cDimensions, cCoordinates: Int = this.cCoordinates, rgcColumns: MutPtr<Int> = this.rgcColumns, rgpwszDimensionNames: MutPtr<Pwstr> = this.rgpwszDimensionNames): Mdaxisinfo = Mdaxisinfo(cbSize = cbSize, iAxis = iAxis, cDimensions = cDimensions, cCoordinates = cCoordinates, rgcColumnsCtorArg = rgcColumns, rgpwszDimensionNamesCtorArg = rgpwszDimensionNames)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mdaxisinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.iAxis != other.iAxis) return false
        if (this.cDimensions != other.cDimensions) return false
        if (this.cCoordinates != other.cCoordinates) return false
        if (this.rgcColumns != other.rgcColumns) return false
        if (this.rgpwszDimensionNames != other.rgpwszDimensionNames) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.iAxis.hashCode()
        result = 31 * result + this.cDimensions.hashCode()
        result = 31 * result + this.cCoordinates.hashCode()
        result = 31 * result + this.rgcColumns.hashCode()
        result = 31 * result + this.rgpwszDimensionNames.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mdaxisinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mdaxisinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): Mdaxisinfo =
                    Mdaxisinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Int>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Pwstr>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: Mdaxisinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.iAxis)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.cDimensions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.cCoordinates)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Int>(64)
                    ).writeNative(addr + 32L, value.rgcColumns)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Pwstr>(64)
                    ).writeNative(addr + 40L, value.rgpwszDimensionNames)
                }
            }

        public operator fun invoke(
            cbSize: Int = 0,
            iAxis: Int = 0,
            cDimensions: Int = 0,
            cCoordinates: Int = 0,
            rgcColumns: MutPtr<Int> = MutPtr(0L),
            rgpwszDimensionNames: MutPtr<Pwstr> = MutPtr(0L),
        ): Mdaxisinfo =
            Mdaxisinfo(
                cbSize = cbSize,
                iAxis = iAxis,
                cDimensions = cDimensions,
                cCoordinates = cCoordinates,
                rgcColumnsCtorArg = rgcColumns,
                rgpwszDimensionNamesCtorArg = rgpwszDimensionNames,
            )
    }
}

public class Natlanguagerestriction internal constructor(
    public var prop: Fullpropspec,
    pwcsPhraseCtorArg: Pwstr,
    public var lcid: UInt,
) {
    public var pwcsPhrase: Pwstr = pwcsPhraseCtorArg
        internal set

    public constructor() : this(
        prop = Fullpropspec(),
        pwcsPhraseCtorArg = MutPtr(0L),
        lcid = 0u,
    )

    public operator fun component1(): Fullpropspec = this.prop

    public operator fun component2(): Pwstr = this.pwcsPhrase

    public operator fun component3(): UInt = this.lcid

    public fun copy(prop: Fullpropspec = this.prop, pwcsPhrase: Pwstr = this.pwcsPhrase, lcid: UInt = this.lcid): Natlanguagerestriction = Natlanguagerestriction(prop = prop, pwcsPhraseCtorArg = pwcsPhrase, lcid = lcid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Natlanguagerestriction) return false
        if (this.prop != other.prop) return false
        if (this.pwcsPhrase != other.pwcsPhrase) return false
        if (this.lcid != other.lcid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.prop.hashCode()
        result = 31 * result + this.pwcsPhrase.hashCode()
        result = 31 * result + this.lcid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            prop: Fullpropspec = Fullpropspec(),
            pwcsPhrase: Pwstr = MutPtr(0L),
            lcid: UInt = 0u,
        ): Natlanguagerestriction =
            Natlanguagerestriction(
                prop = prop,
                pwcsPhraseCtorArg = pwcsPhrase,
                lcid = lcid,
            )
    }
}

public class Noderestriction internal constructor(
    public var cRes: UInt,
    paResCtorArg: MutPtr<MutPtr<Restriction>>,
    public var reserved: UInt,
) {
    public var paRes: MutPtr<MutPtr<Restriction>> = paResCtorArg
        internal set

    public constructor() : this(
        cRes = 0u,
        paResCtorArg = MutPtr(0L),
        reserved = 0u,
    )

    public operator fun component1(): UInt = this.cRes

    public operator fun component2(): MutPtr<MutPtr<Restriction>> = this.paRes

    public operator fun component3(): UInt = this.reserved

    public fun copy(cRes: UInt = this.cRes, paRes: MutPtr<MutPtr<Restriction>> = this.paRes, reserved: UInt = this.reserved): Noderestriction = Noderestriction(cRes = cRes, paResCtorArg = paRes, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Noderestriction) return false
        if (this.cRes != other.cRes) return false
        if (this.paRes != other.paRes) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cRes.hashCode()
        result = 31 * result + this.paRes.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Noderestriction> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Noderestriction> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Noderestriction =
                    Noderestriction(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<Restriction>>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Noderestriction) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cRes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<Restriction>>(64)
                    ).writeNative(addr + 8L, value.paRes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.reserved)
                }
            }

        public operator fun invoke(
            cRes: UInt = 0u,
            paRes: MutPtr<MutPtr<Restriction>> = MutPtr(0L),
            reserved: UInt = 0u,
        ): Noderestriction =
            Noderestriction(
                cRes = cRes,
                paResCtorArg = paRes,
                reserved = reserved,
            )
    }
}

public class Notrestriction internal constructor(
    pResCtorArg: MutPtr<Restriction>,
) {
    public var pRes: MutPtr<Restriction> = pResCtorArg
        internal set

    public constructor() : this(
        pResCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Restriction> = this.pRes

    public fun copy(pRes: MutPtr<Restriction> = this.pRes): Notrestriction = Notrestriction(pResCtorArg = pRes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Notrestriction) return false
        if (this.pRes != other.pRes) return false
        return true
    }

    override fun hashCode(): Int = this.pRes.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Notrestriction> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Notrestriction> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Notrestriction =
                    Notrestriction(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Restriction>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Notrestriction) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Restriction>(64)
                    ).writeNative(addr, value.pRes)
                }
            }

        public operator fun invoke(
            pRes: MutPtr<Restriction> = MutPtr(0L),
        ): Notrestriction =
            Notrestriction(
                pResCtorArg = pRes,
            )
    }
}

public class OdbcVsArgs internal constructor(
    pguidEventCtorArg: ConstPtr<Guid>,
    public var dwFlags: UInt,
    public var anonymous1: OdbcVsArgs0,
    public var anonymous2: OdbcVsArgs1,
    public var retCode: Short,
) {
    public var pguidEvent: ConstPtr<Guid> = pguidEventCtorArg
        internal set

    public constructor() : this(
        pguidEventCtorArg = ConstPtr(0L),
        dwFlags = 0u,
        anonymous1 = OdbcVsArgs0(),
        anonymous2 = OdbcVsArgs1(),
        retCode = 0,
    )

    public operator fun component1(): ConstPtr<Guid> = this.pguidEvent

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): OdbcVsArgs0 = this.anonymous1

    public operator fun component4(): OdbcVsArgs1 = this.anonymous2

    public operator fun component5(): Short = this.retCode

    public fun copy(pguidEvent: ConstPtr<Guid> = this.pguidEvent, dwFlags: UInt = this.dwFlags, anonymous1: OdbcVsArgs0 = this.anonymous1, anonymous2: OdbcVsArgs1 = this.anonymous2, retCode: Short = this.retCode): OdbcVsArgs = OdbcVsArgs(pguidEventCtorArg = pguidEvent, dwFlags = dwFlags, anonymous1 = anonymous1, anonymous2 = anonymous2, retCode = retCode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OdbcVsArgs) return false
        if (this.pguidEvent != other.pguidEvent) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.retCode != other.retCode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pguidEvent.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.retCode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pguidEvent: ConstPtr<Guid> = ConstPtr(0L),
            dwFlags: UInt = 0u,
            anonymous1: OdbcVsArgs0 = OdbcVsArgs0(),
            anonymous2: OdbcVsArgs1 = OdbcVsArgs1(),
            retCode: Short = 0,
        ): OdbcVsArgs =
            OdbcVsArgs(
                pguidEventCtorArg = pguidEvent,
                dwFlags = dwFlags,
                anonymous1 = anonymous1,
                anonymous2 = anonymous2,
                retCode = retCode,
            )
    }
}

public class OdbcVsArgs0 internal constructor(
    wszArgCtorArg: Pwstr,
    szArgCtorArg: Pstr,
) {
    public var wszArg: Pwstr = wszArgCtorArg
        internal set

    public var szArg: Pstr = szArgCtorArg
        internal set

    public constructor() : this(
        wszArgCtorArg = MutPtr(0L),
        szArgCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.wszArg

    public operator fun component2(): Pstr = this.szArg

    public fun copy(wszArg: Pwstr = this.wszArg, szArg: Pstr = this.szArg): OdbcVsArgs0 = OdbcVsArgs0(wszArgCtorArg = wszArg, szArgCtorArg = szArg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OdbcVsArgs0) return false
        if (this.wszArg != other.wszArg) return false
        if (this.szArg != other.szArg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wszArg.hashCode()
        result = 31 * result + this.szArg.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wszArg: Pwstr = MutPtr(0L),
            szArg: Pstr = MutPtr(0L),
        ): OdbcVsArgs0 =
            OdbcVsArgs0(
                wszArgCtorArg = wszArg,
                szArgCtorArg = szArg,
            )
    }
}

public class OdbcVsArgs1 internal constructor(
    wszCorrelationCtorArg: Pwstr,
    szCorrelationCtorArg: Pstr,
) {
    public var wszCorrelation: Pwstr = wszCorrelationCtorArg
        internal set

    public var szCorrelation: Pstr = szCorrelationCtorArg
        internal set

    public constructor() : this(
        wszCorrelationCtorArg = MutPtr(0L),
        szCorrelationCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.wszCorrelation

    public operator fun component2(): Pstr = this.szCorrelation

    public fun copy(wszCorrelation: Pwstr = this.wszCorrelation, szCorrelation: Pstr = this.szCorrelation): OdbcVsArgs1 = OdbcVsArgs1(wszCorrelationCtorArg = wszCorrelation, szCorrelationCtorArg = szCorrelation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OdbcVsArgs1) return false
        if (this.wszCorrelation != other.wszCorrelation) return false
        if (this.szCorrelation != other.szCorrelation) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wszCorrelation.hashCode()
        result = 31 * result + this.szCorrelation.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wszCorrelation: Pwstr = MutPtr(0L),
            szCorrelation: Pstr = MutPtr(0L),
        ): OdbcVsArgs1 =
            OdbcVsArgs1(
                wszCorrelationCtorArg = wszCorrelation,
                szCorrelationCtorArg = szCorrelation,
            )
    }
}

public data class Propertyrestriction(
    public var rel: UInt = 0u,
    public var prop: Fullpropspec = Fullpropspec(),
    public var prval: Propvariant = Propvariant(),
)

public class ProxyInfo internal constructor(
    public var dwSize: UInt,
    pcwszUserAgentCtorArg: Pcwstr,
    public var paUseProxy: ProxyAccess,
    public var fLocalBypass: Bool,
    public var dwPortNumber: UInt,
    pcwszProxyNameCtorArg: Pcwstr,
    pcwszBypassListCtorArg: Pcwstr,
) {
    public var pcwszUserAgent: Pcwstr = pcwszUserAgentCtorArg
        internal set

    public var pcwszProxyName: Pcwstr = pcwszProxyNameCtorArg
        internal set

    public var pcwszBypassList: Pcwstr = pcwszBypassListCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        pcwszUserAgentCtorArg = ConstPtr(0L),
        paUseProxy = 0,
        fLocalBypass = 0,
        dwPortNumber = 0u,
        pcwszProxyNameCtorArg = ConstPtr(0L),
        pcwszBypassListCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Pcwstr = this.pcwszUserAgent

    public operator fun component3(): ProxyAccess = this.paUseProxy

    public operator fun component4(): Bool = this.fLocalBypass

    public operator fun component5(): UInt = this.dwPortNumber

    public operator fun component6(): Pcwstr = this.pcwszProxyName

    public operator fun component7(): Pcwstr = this.pcwszBypassList

    public fun copy(dwSize: UInt = this.dwSize, pcwszUserAgent: Pcwstr = this.pcwszUserAgent, paUseProxy: ProxyAccess = this.paUseProxy, fLocalBypass: Bool = this.fLocalBypass, dwPortNumber: UInt = this.dwPortNumber, pcwszProxyName: Pcwstr = this.pcwszProxyName, pcwszBypassList: Pcwstr = this.pcwszBypassList): ProxyInfo = ProxyInfo(dwSize = dwSize, pcwszUserAgentCtorArg = pcwszUserAgent, paUseProxy = paUseProxy, fLocalBypass = fLocalBypass, dwPortNumber = dwPortNumber, pcwszProxyNameCtorArg = pcwszProxyName, pcwszBypassListCtorArg = pcwszBypassList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProxyInfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.pcwszUserAgent != other.pcwszUserAgent) return false
        if (this.paUseProxy != other.paUseProxy) return false
        if (this.fLocalBypass != other.fLocalBypass) return false
        if (this.dwPortNumber != other.dwPortNumber) return false
        if (this.pcwszProxyName != other.pcwszProxyName) return false
        if (this.pcwszBypassList != other.pcwszBypassList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.pcwszUserAgent.hashCode()
        result = 31 * result + this.paUseProxy.hashCode()
        result = 31 * result + this.fLocalBypass.hashCode()
        result = 31 * result + this.dwPortNumber.hashCode()
        result = 31 * result + this.pcwszProxyName.hashCode()
        result = 31 * result + this.pcwszBypassList.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            pcwszUserAgent: Pcwstr = ConstPtr(0L),
            paUseProxy: ProxyAccess = 0,
            fLocalBypass: Bool = 0,
            dwPortNumber: UInt = 0u,
            pcwszProxyName: Pcwstr = ConstPtr(0L),
            pcwszBypassList: Pcwstr = ConstPtr(0L),
        ): ProxyInfo =
            ProxyInfo(
                dwSize = dwSize,
                pcwszUserAgentCtorArg = pcwszUserAgent,
                paUseProxy = paUseProxy,
                fLocalBypass = fLocalBypass,
                dwPortNumber = dwPortNumber,
                pcwszProxyNameCtorArg = pcwszProxyName,
                pcwszBypassListCtorArg = pcwszBypassList,
            )
    }
}

public class Rangecategorize internal constructor(
    public var cRange: UInt,
    aRangeBeginCtorArg: MutPtr<Propvariant>,
) {
    public var aRangeBegin: MutPtr<Propvariant> = aRangeBeginCtorArg
        internal set

    public constructor() : this(
        cRange = 0u,
        aRangeBeginCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cRange

    public operator fun component2(): MutPtr<Propvariant> = this.aRangeBegin

    public fun copy(cRange: UInt = this.cRange, aRangeBegin: MutPtr<Propvariant> = this.aRangeBegin): Rangecategorize = Rangecategorize(cRange = cRange, aRangeBeginCtorArg = aRangeBegin)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rangecategorize) return false
        if (this.cRange != other.cRange) return false
        if (this.aRangeBegin != other.aRangeBegin) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cRange.hashCode()
        result = 31 * result + this.aRangeBegin.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rangecategorize> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rangecategorize> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Rangecategorize =
                    Rangecategorize(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Propvariant>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Rangecategorize) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cRange)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Propvariant>(64)
                    ).writeNative(addr + 8L, value.aRangeBegin)
                }
            }

        public operator fun invoke(
            cRange: UInt = 0u,
            aRangeBegin: MutPtr<Propvariant> = MutPtr(0L),
        ): Rangecategorize =
            Rangecategorize(
                cRange = cRange,
                aRangeBeginCtorArg = aRangeBegin,
            )
    }
}

public data class Restriction(
    public var rt: UInt = 0u,
    public var weight: UInt = 0u,
    public var res: Restriction0 = Restriction0(),
)

public data class Restriction0(
    public var ar: Noderestriction = Noderestriction(),
    public var orRestriction: Noderestriction = Noderestriction(),
    public var pxr: Noderestriction = Noderestriction(),
    public var vr: Vectorrestriction = Vectorrestriction(),
    public var nr: Notrestriction = Notrestriction(),
    public var cr: Contentrestriction = Contentrestriction(),
    public var nlr: Natlanguagerestriction = Natlanguagerestriction(),
    public var pr: Propertyrestriction = Propertyrestriction(),
)

public class Rmtpack internal constructor(
    pISeqStreamCtorArg: MutPtr<CVoid>,
    public var cbData: UInt,
    public var cBSTR: UInt,
    rgBSTRCtorArg: MutPtr<Bstr>,
    public var cVARIANT: UInt,
    rgVARIANTCtorArg: MutPtr<Variant.Variant>,
    public var cIDISPATCH: UInt,
    rgIDISPATCHCtorArg: MutPtr<MutPtr<CVoid>>,
    public var cIUNKNOWN: UInt,
    rgIUNKNOWNCtorArg: MutPtr<MutPtr<CVoid>>,
    public var cPROPVARIANT: UInt,
    rgPROPVARIANTCtorArg: MutPtr<Propvariant>,
    public var cArray: UInt,
    rgArrayCtorArg: MutPtr<Variant.Variant>,
) {
    public var pISeqStream: MutPtr<CVoid> = pISeqStreamCtorArg
        internal set

    public var rgBSTR: MutPtr<Bstr> = rgBSTRCtorArg
        internal set

    public var rgVARIANT: MutPtr<Variant.Variant> = rgVARIANTCtorArg
        internal set

    public var rgIDISPATCH: MutPtr<MutPtr<CVoid>> = rgIDISPATCHCtorArg
        internal set

    public var rgIUNKNOWN: MutPtr<MutPtr<CVoid>> = rgIUNKNOWNCtorArg
        internal set

    public var rgPROPVARIANT: MutPtr<Propvariant> = rgPROPVARIANTCtorArg
        internal set

    public var rgArray: MutPtr<Variant.Variant> = rgArrayCtorArg
        internal set

    public constructor() : this(
        pISeqStreamCtorArg = MutPtr(0L),
        cbData = 0u,
        cBSTR = 0u,
        rgBSTRCtorArg = MutPtr(0L),
        cVARIANT = 0u,
        rgVARIANTCtorArg = MutPtr(0L),
        cIDISPATCH = 0u,
        rgIDISPATCHCtorArg = MutPtr(0L),
        cIUNKNOWN = 0u,
        rgIUNKNOWNCtorArg = MutPtr(0L),
        cPROPVARIANT = 0u,
        rgPROPVARIANTCtorArg = MutPtr(0L),
        cArray = 0u,
        rgArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.pISeqStream

    public operator fun component2(): UInt = this.cbData

    public operator fun component3(): UInt = this.cBSTR

    public operator fun component4(): MutPtr<Bstr> = this.rgBSTR

    public operator fun component5(): UInt = this.cVARIANT

    public operator fun component6(): MutPtr<Variant.Variant> = this.rgVARIANT

    public operator fun component7(): UInt = this.cIDISPATCH

    public operator fun component8(): MutPtr<MutPtr<CVoid>> = this.rgIDISPATCH

    public operator fun component9(): UInt = this.cIUNKNOWN

    public operator fun component10(): MutPtr<MutPtr<CVoid>> = this.rgIUNKNOWN

    public operator fun component11(): UInt = this.cPROPVARIANT

    public operator fun component12(): MutPtr<Propvariant> = this.rgPROPVARIANT

    public operator fun component13(): UInt = this.cArray

    public operator fun component14(): MutPtr<Variant.Variant> = this.rgArray

    public fun copy(pISeqStream: MutPtr<CVoid> = this.pISeqStream, cbData: UInt = this.cbData, cBSTR: UInt = this.cBSTR, rgBSTR: MutPtr<Bstr> = this.rgBSTR, cVARIANT: UInt = this.cVARIANT, rgVARIANT: MutPtr<Variant.Variant> = this.rgVARIANT, cIDISPATCH: UInt = this.cIDISPATCH, rgIDISPATCH: MutPtr<MutPtr<CVoid>> = this.rgIDISPATCH, cIUNKNOWN: UInt = this.cIUNKNOWN, rgIUNKNOWN: MutPtr<MutPtr<CVoid>> = this.rgIUNKNOWN, cPROPVARIANT: UInt = this.cPROPVARIANT, rgPROPVARIANT: MutPtr<Propvariant> = this.rgPROPVARIANT, cArray: UInt = this.cArray, rgArray: MutPtr<Variant.Variant> = this.rgArray): Rmtpack = Rmtpack(pISeqStreamCtorArg = pISeqStream, cbData = cbData, cBSTR = cBSTR, rgBSTRCtorArg = rgBSTR, cVARIANT = cVARIANT, rgVARIANTCtorArg = rgVARIANT, cIDISPATCH = cIDISPATCH, rgIDISPATCHCtorArg = rgIDISPATCH, cIUNKNOWN = cIUNKNOWN, rgIUNKNOWNCtorArg = rgIUNKNOWN, cPROPVARIANT = cPROPVARIANT, rgPROPVARIANTCtorArg = rgPROPVARIANT, cArray = cArray, rgArrayCtorArg = rgArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rmtpack) return false
        if (this.pISeqStream != other.pISeqStream) return false
        if (this.cbData != other.cbData) return false
        if (this.cBSTR != other.cBSTR) return false
        if (this.rgBSTR != other.rgBSTR) return false
        if (this.cVARIANT != other.cVARIANT) return false
        if (this.rgVARIANT != other.rgVARIANT) return false
        if (this.cIDISPATCH != other.cIDISPATCH) return false
        if (this.rgIDISPATCH != other.rgIDISPATCH) return false
        if (this.cIUNKNOWN != other.cIUNKNOWN) return false
        if (this.rgIUNKNOWN != other.rgIUNKNOWN) return false
        if (this.cPROPVARIANT != other.cPROPVARIANT) return false
        if (this.rgPROPVARIANT != other.rgPROPVARIANT) return false
        if (this.cArray != other.cArray) return false
        if (this.rgArray != other.rgArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pISeqStream.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.cBSTR.hashCode()
        result = 31 * result + this.rgBSTR.hashCode()
        result = 31 * result + this.cVARIANT.hashCode()
        result = 31 * result + this.rgVARIANT.hashCode()
        result = 31 * result + this.cIDISPATCH.hashCode()
        result = 31 * result + this.rgIDISPATCH.hashCode()
        result = 31 * result + this.cIUNKNOWN.hashCode()
        result = 31 * result + this.rgIUNKNOWN.hashCode()
        result = 31 * result + this.cPROPVARIANT.hashCode()
        result = 31 * result + this.rgPROPVARIANT.hashCode()
        result = 31 * result + this.cArray.hashCode()
        result = 31 * result + this.rgArray.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rmtpack> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rmtpack> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): Rmtpack =
                    Rmtpack(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Bstr>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Variant.Variant>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<CVoid>>(64)
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<CVoid>>(64)
                        ).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Propvariant>(64)
                        ).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Variant.Variant>(64)
                        ).readNative(addr + 96L),
                    )
                override fun writeNative(addr: Long, value: Rmtpack) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.pISeqStream)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cBSTR)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Bstr>(64)
                    ).writeNative(addr + 16L, value.rgBSTR)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cVARIANT)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Variant.Variant>(64)
                    ).writeNative(addr + 32L, value.rgVARIANT)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.cIDISPATCH)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<CVoid>>(64)
                    ).writeNative(addr + 48L, value.rgIDISPATCH)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.cIUNKNOWN)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<CVoid>>(64)
                    ).writeNative(addr + 64L, value.rgIUNKNOWN)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.cPROPVARIANT)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Propvariant>(64)
                    ).writeNative(addr + 80L, value.rgPROPVARIANT)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.cArray)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Variant.Variant>(64)
                    ).writeNative(addr + 96L, value.rgArray)
                }
            }

        public operator fun invoke(
            pISeqStream: MutPtr<CVoid> = MutPtr(0L),
            cbData: UInt = 0u,
            cBSTR: UInt = 0u,
            rgBSTR: MutPtr<Bstr> = MutPtr(0L),
            cVARIANT: UInt = 0u,
            rgVARIANT: MutPtr<Variant.Variant> = MutPtr(0L),
            cIDISPATCH: UInt = 0u,
            rgIDISPATCH: MutPtr<MutPtr<CVoid>> = MutPtr(0L),
            cIUNKNOWN: UInt = 0u,
            rgIUNKNOWN: MutPtr<MutPtr<CVoid>> = MutPtr(0L),
            cPROPVARIANT: UInt = 0u,
            rgPROPVARIANT: MutPtr<Propvariant> = MutPtr(0L),
            cArray: UInt = 0u,
            rgArray: MutPtr<Variant.Variant> = MutPtr(0L),
        ): Rmtpack =
            Rmtpack(
                pISeqStreamCtorArg = pISeqStream,
                cbData = cbData,
                cBSTR = cBSTR,
                rgBSTRCtorArg = rgBSTR,
                cVARIANT = cVARIANT,
                rgVARIANTCtorArg = rgVARIANT,
                cIDISPATCH = cIDISPATCH,
                rgIDISPATCHCtorArg = rgIDISPATCH,
                cIUNKNOWN = cIUNKNOWN,
                rgIUNKNOWNCtorArg = rgIUNKNOWN,
                cPROPVARIANT = cPROPVARIANT,
                rgPROPVARIANTCtorArg = rgPROPVARIANT,
                cArray = cArray,
                rgArrayCtorArg = rgArray,
            )
    }
}

public data class SearchColumnProperties(
    public var value: Propvariant = Propvariant(),
    public var lcid: UInt = 0u,
)

public class SearchItemChange internal constructor(
    public var change: SearchKindOfChange,
    public var priority: SearchNotificationPriority,
    pUserDataCtorArg: MutPtr<Blob>,
    lpwszURLCtorArg: Pwstr,
    lpwszOldURLCtorArg: Pwstr,
) {
    public var pUserData: MutPtr<Blob> = pUserDataCtorArg
        internal set

    public var lpwszURL: Pwstr = lpwszURLCtorArg
        internal set

    public var lpwszOldURL: Pwstr = lpwszOldURLCtorArg
        internal set

    public constructor() : this(
        change = 0,
        priority = 0,
        pUserDataCtorArg = MutPtr(0L),
        lpwszURLCtorArg = MutPtr(0L),
        lpwszOldURLCtorArg = MutPtr(0L),
    )

    public operator fun component1(): SearchKindOfChange = this.change

    public operator fun component2(): SearchNotificationPriority = this.priority

    public operator fun component3(): MutPtr<Blob> = this.pUserData

    public operator fun component4(): Pwstr = this.lpwszURL

    public operator fun component5(): Pwstr = this.lpwszOldURL

    public fun copy(change: SearchKindOfChange = this.change, priority: SearchNotificationPriority = this.priority, pUserData: MutPtr<Blob> = this.pUserData, lpwszURL: Pwstr = this.lpwszURL, lpwszOldURL: Pwstr = this.lpwszOldURL): SearchItemChange = SearchItemChange(change = change, priority = priority, pUserDataCtorArg = pUserData, lpwszURLCtorArg = lpwszURL, lpwszOldURLCtorArg = lpwszOldURL)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SearchItemChange) return false
        if (this.change != other.change) return false
        if (this.priority != other.priority) return false
        if (this.pUserData != other.pUserData) return false
        if (this.lpwszURL != other.lpwszURL) return false
        if (this.lpwszOldURL != other.lpwszOldURL) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.change.hashCode()
        result = 31 * result + this.priority.hashCode()
        result = 31 * result + this.pUserData.hashCode()
        result = 31 * result + this.lpwszURL.hashCode()
        result = 31 * result + this.lpwszOldURL.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            change: SearchKindOfChange = 0,
            priority: SearchNotificationPriority = 0,
            pUserData: MutPtr<Blob> = MutPtr(0L),
            lpwszURL: Pwstr = MutPtr(0L),
            lpwszOldURL: Pwstr = MutPtr(0L),
        ): SearchItemChange =
            SearchItemChange(
                change = change,
                priority = priority,
                pUserDataCtorArg = pUserData,
                lpwszURLCtorArg = lpwszURL,
                lpwszOldURLCtorArg = lpwszOldURL,
            )
    }
}

public data class SearchItemIndexingStatus(
    public var dwDocID: UInt = 0u,
    public var hrIndexingStatus: Hresult = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SearchItemIndexingStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SearchItemIndexingStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SearchItemIndexingStatus =
                    SearchItemIndexingStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SearchItemIndexingStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwDocID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.hrIndexingStatus)
                }
            }
    }
}

public class SearchItemPersistentChange internal constructor(
    public var change: SearchKindOfChange,
    urlCtorArg: Pwstr,
    oldURLCtorArg: Pwstr,
    public var priority: SearchNotificationPriority,
) {
    public var url: Pwstr = urlCtorArg
        internal set

    public var oldURL: Pwstr = oldURLCtorArg
        internal set

    public constructor() : this(
        change = 0,
        urlCtorArg = MutPtr(0L),
        oldURLCtorArg = MutPtr(0L),
        priority = 0,
    )

    public operator fun component1(): SearchKindOfChange = this.change

    public operator fun component2(): Pwstr = this.url

    public operator fun component3(): Pwstr = this.oldURL

    public operator fun component4(): SearchNotificationPriority = this.priority

    public fun copy(change: SearchKindOfChange = this.change, url: Pwstr = this.url, oldURL: Pwstr = this.oldURL, priority: SearchNotificationPriority = this.priority): SearchItemPersistentChange = SearchItemPersistentChange(change = change, urlCtorArg = url, oldURLCtorArg = oldURL, priority = priority)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SearchItemPersistentChange) return false
        if (this.change != other.change) return false
        if (this.url != other.url) return false
        if (this.oldURL != other.oldURL) return false
        if (this.priority != other.priority) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.change.hashCode()
        result = 31 * result + this.url.hashCode()
        result = 31 * result + this.oldURL.hashCode()
        result = 31 * result + this.priority.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            change: SearchKindOfChange = 0,
            url: Pwstr = MutPtr(0L),
            oldURL: Pwstr = MutPtr(0L),
            priority: SearchNotificationPriority = 0,
        ): SearchItemPersistentChange =
            SearchItemPersistentChange(
                change = change,
                urlCtorArg = url,
                oldURLCtorArg = oldURL,
                priority = priority,
            )
    }
}

public class SecObject internal constructor(
    public var cObjects: UInt,
    prgObjectsCtorArg: MutPtr<SecObjectElement>,
) {
    public var prgObjects: MutPtr<SecObjectElement> = prgObjectsCtorArg
        internal set

    public constructor() : this(
        cObjects = 0u,
        prgObjectsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cObjects

    public operator fun component2(): MutPtr<SecObjectElement> = this.prgObjects

    public fun copy(cObjects: UInt = this.cObjects, prgObjects: MutPtr<SecObjectElement> = this.prgObjects): SecObject = SecObject(cObjects = cObjects, prgObjectsCtorArg = prgObjects)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecObject) return false
        if (this.cObjects != other.cObjects) return false
        if (this.prgObjects != other.prgObjects) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cObjects.hashCode()
        result = 31 * result + this.prgObjects.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecObject> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecObject> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecObject =
                    SecObject(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SecObjectElement>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecObject) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cObjects)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SecObjectElement>(64)
                    ).writeNative(addr + 8L, value.prgObjects)
                }
            }

        public operator fun invoke(
            cObjects: UInt = 0u,
            prgObjects: MutPtr<SecObjectElement> = MutPtr(0L),
        ): SecObject =
            SecObject(
                cObjects = cObjects,
                prgObjectsCtorArg = prgObjects,
            )
    }
}

public data class SecObjectElement(
    public var guidObjectType: Guid = Guid(),
    public var objectID: Dbid = Dbid(),
)

public data class Sortkey(
    public var propColumn: Fullpropspec = Fullpropspec(),
    public var dwOrder: UInt = 0u,
    public var locale: UInt = 0u,
)

public class Sortset internal constructor(
    public var cCol: UInt,
    aColCtorArg: MutPtr<Sortkey>,
) {
    public var aCol: MutPtr<Sortkey> = aColCtorArg
        internal set

    public constructor() : this(
        cCol = 0u,
        aColCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cCol

    public operator fun component2(): MutPtr<Sortkey> = this.aCol

    public fun copy(cCol: UInt = this.cCol, aCol: MutPtr<Sortkey> = this.aCol): Sortset = Sortset(cCol = cCol, aColCtorArg = aCol)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sortset) return false
        if (this.cCol != other.cCol) return false
        if (this.aCol != other.aCol) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cCol.hashCode()
        result = 31 * result + this.aCol.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sortset> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sortset> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Sortset =
                    Sortset(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Sortkey>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Sortset) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cCol)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Sortkey>(64)
                    ).writeNative(addr + 8L, value.aCol)
                }
            }

        public operator fun invoke(
            cCol: UInt = 0u,
            aCol: MutPtr<Sortkey> = MutPtr(0L),
        ): Sortset =
            Sortset(
                cCol = cCol,
                aColCtorArg = aCol,
            )
    }
}

public class Sqlperf(
    public var timerResolution: UInt = 0u,
    public var sQLidu: UInt = 0u,
    public var sQLiduRows: UInt = 0u,
    public var sQLSelects: UInt = 0u,
    public var sQLSelectRows: UInt = 0u,
    public var transactions: UInt = 0u,
    public var sQLPrepares: UInt = 0u,
    public var execDirects: UInt = 0u,
    public var sQLExecutes: UInt = 0u,
    public var cursorOpens: UInt = 0u,
    public var cursorSize: UInt = 0u,
    public var cursorUsed: UInt = 0u,
    public var percentCursorUsed: Double = 0.0,
    public var avgFetchTime: Double = 0.0,
    public var avgCursorSize: Double = 0.0,
    public var avgCursorUsed: Double = 0.0,
    public var sQLFetchTime: UInt = 0u,
    public var sQLFetchCount: UInt = 0u,
    public var currentStmtCount: UInt = 0u,
    public var maxOpenStmt: UInt = 0u,
    public var sumOpenStmt: UInt = 0u,
    public var currentConnectionCount: UInt = 0u,
    public var maxConnectionsOpened: UInt = 0u,
    public var sumConnectionsOpened: UInt = 0u,
    public var sumConnectiontime: UInt = 0u,
    public var avgTimeOpened: Double = 0.0,
    public var serverRndTrips: UInt = 0u,
    public var buffersSent: UInt = 0u,
    public var buffersRec: UInt = 0u,
    public var bytesSent: UInt = 0u,
    public var bytesRec: UInt = 0u,
    public var msExecutionTime: UInt = 0u,
    public var msNetWorkServerTime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sqlperf> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sqlperf> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 160L
                override fun readNative(addr: Long): Sqlperf =
                    Sqlperf(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 148L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 152L),
                    )
                override fun writeNative(addr: Long, value: Sqlperf) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.timerResolution)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sQLidu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sQLiduRows)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.sQLSelects)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.sQLSelectRows)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.transactions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.sQLPrepares)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.execDirects)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.sQLExecutes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.cursorOpens)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.cursorSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.cursorUsed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr + 48L, value.percentCursorUsed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr + 56L, value.avgFetchTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr + 64L, value.avgCursorSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr + 72L, value.avgCursorUsed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.sQLFetchTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.sQLFetchCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.currentStmtCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.maxOpenStmt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.sumOpenStmt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.currentConnectionCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.maxConnectionsOpened)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.sumConnectionsOpened)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.sumConnectiontime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr + 120L, value.avgTimeOpened)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.serverRndTrips)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.buffersSent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.buffersRec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.bytesSent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 144L, value.bytesRec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 148L, value.msExecutionTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 152L, value.msNetWorkServerTime)
                }
            }
    }
}

public data class SqlDaySecondStruct(
    public var day: UInt = 0u,
    public var hour: UInt = 0u,
    public var minute: UInt = 0u,
    public var second: UInt = 0u,
    public var fraction: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SqlDaySecondStruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SqlDaySecondStruct> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): SqlDaySecondStruct =
                    SqlDaySecondStruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SqlDaySecondStruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.day)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hour)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.second)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fraction)
                }
            }
    }
}

public data class SqlIntervalStruct(
    public var intervalType: Sqlinterval = 0,
    public var intervalSign: Short = 0,
    public var intval: SqlIntervalStruct0 = SqlIntervalStruct0(),
)

public data class SqlIntervalStruct0(
    public var yearMonth: SqlYearMonthStruct = SqlYearMonthStruct(),
    public var daySecond: SqlDaySecondStruct = SqlDaySecondStruct(),
)

public data class SqlNumericStruct(
    public var precision: UByte = 0u,
    public var scale: Byte = 0,
    public var sign: UByte = 0u,
    public var value: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SqlNumericStruct) return false
        if (this.precision != other.precision) return false
        if (this.scale != other.scale) return false
        if (this.sign != other.sign) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.precision.hashCode()
        result = 31 * result + this.scale.hashCode()
        result = 31 * result + this.sign.hashCode()
        result = 31 * result + this.value.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SqlNumericStruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SqlNumericStruct> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 19L
                override fun readNative(addr: Long): SqlNumericStruct =
                    SqlNumericStruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 3L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SqlNumericStruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.precision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 1L, value.scale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.sign)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 3L, value.value.toList())
                }
            }
    }
}

public data class SqlYearMonthStruct(
    public var year: UInt = 0u,
    public var month: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SqlYearMonthStruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SqlYearMonthStruct> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SqlYearMonthStruct =
                    SqlYearMonthStruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SqlYearMonthStruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.year)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.month)
                }
            }
    }
}

public class Sserrorinfo internal constructor(
    pwszMessageCtorArg: Pwstr,
    pwszServerCtorArg: Pwstr,
    pwszProcedureCtorArg: Pwstr,
    public var lNative: Int,
    public var bState: UByte,
    public var bClass: UByte,
    public var wLineNumber: UShort,
) {
    public var pwszMessage: Pwstr = pwszMessageCtorArg
        internal set

    public var pwszServer: Pwstr = pwszServerCtorArg
        internal set

    public var pwszProcedure: Pwstr = pwszProcedureCtorArg
        internal set

    public constructor() : this(
        pwszMessageCtorArg = MutPtr(0L),
        pwszServerCtorArg = MutPtr(0L),
        pwszProcedureCtorArg = MutPtr(0L),
        lNative = 0,
        bState = 0u,
        bClass = 0u,
        wLineNumber = 0u,
    )

    public operator fun component1(): Pwstr = this.pwszMessage

    public operator fun component2(): Pwstr = this.pwszServer

    public operator fun component3(): Pwstr = this.pwszProcedure

    public operator fun component4(): Int = this.lNative

    public operator fun component5(): UByte = this.bState

    public operator fun component6(): UByte = this.bClass

    public operator fun component7(): UShort = this.wLineNumber

    public fun copy(pwszMessage: Pwstr = this.pwszMessage, pwszServer: Pwstr = this.pwszServer, pwszProcedure: Pwstr = this.pwszProcedure, lNative: Int = this.lNative, bState: UByte = this.bState, bClass: UByte = this.bClass, wLineNumber: UShort = this.wLineNumber): Sserrorinfo = Sserrorinfo(pwszMessageCtorArg = pwszMessage, pwszServerCtorArg = pwszServer, pwszProcedureCtorArg = pwszProcedure, lNative = lNative, bState = bState, bClass = bClass, wLineNumber = wLineNumber)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sserrorinfo) return false
        if (this.pwszMessage != other.pwszMessage) return false
        if (this.pwszServer != other.pwszServer) return false
        if (this.pwszProcedure != other.pwszProcedure) return false
        if (this.lNative != other.lNative) return false
        if (this.bState != other.bState) return false
        if (this.bClass != other.bClass) return false
        if (this.wLineNumber != other.wLineNumber) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszMessage.hashCode()
        result = 31 * result + this.pwszServer.hashCode()
        result = 31 * result + this.pwszProcedure.hashCode()
        result = 31 * result + this.lNative.hashCode()
        result = 31 * result + this.bState.hashCode()
        result = 31 * result + this.bClass.hashCode()
        result = 31 * result + this.wLineNumber.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszMessage: Pwstr = MutPtr(0L),
            pwszServer: Pwstr = MutPtr(0L),
            pwszProcedure: Pwstr = MutPtr(0L),
            lNative: Int = 0,
            bState: UByte = 0u,
            bClass: UByte = 0u,
            wLineNumber: UShort = 0u,
        ): Sserrorinfo =
            Sserrorinfo(
                pwszMessageCtorArg = pwszMessage,
                pwszServerCtorArg = pwszServer,
                pwszProcedureCtorArg = pwszProcedure,
                lNative = lNative,
                bState = bState,
                bClass = bClass,
                wLineNumber = wLineNumber,
            )
    }
}

public data class Ssvariant(
    public var vt: UShort = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var anonymous: Ssvariant0 = Ssvariant0(),
)

public data class Ssvariant0(
    public var bTinyIntVal: UByte = 0u,
    public var sShortIntVal: Short = 0,
    public var lIntVal: Int = 0,
    public var llBigIntVal: Long = 0L,
    public var fltRealVal: Float = 0.0f,
    public var dblFloatVal: Double = 0.0,
    public var cyMoneyVal: CY = CY(),
    public var nCharVal: Ssvariant00 = Ssvariant00(),
    public var charVal: Ssvariant01 = Ssvariant01(),
    public var fBitVal: VariantBool = 0,
    public var rgbGuidVal: UByteArray = UByteArray(16),
    public var numNumericVal: DbNumeric = DbNumeric(),
    public var binaryVal: Ssvariant02 = Ssvariant02(),
    public var tsDateTimeVal: Dbtimestamp = Dbtimestamp(),
    public var unknownType: Ssvariant03 = Ssvariant03(),
    public var bLOBType: Ssvariant04 = Ssvariant04(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ssvariant0) return false
        if (this.bTinyIntVal != other.bTinyIntVal) return false
        if (this.sShortIntVal != other.sShortIntVal) return false
        if (this.lIntVal != other.lIntVal) return false
        if (this.llBigIntVal != other.llBigIntVal) return false
        if (this.fltRealVal != other.fltRealVal) return false
        if (this.dblFloatVal != other.dblFloatVal) return false
        if (this.cyMoneyVal != other.cyMoneyVal) return false
        if (this.nCharVal != other.nCharVal) return false
        if (this.charVal != other.charVal) return false
        if (this.fBitVal != other.fBitVal) return false
        if (!this.rgbGuidVal.contentEquals(other.rgbGuidVal)) return false
        if (this.numNumericVal != other.numNumericVal) return false
        if (this.binaryVal != other.binaryVal) return false
        if (this.tsDateTimeVal != other.tsDateTimeVal) return false
        if (this.unknownType != other.unknownType) return false
        if (this.bLOBType != other.bLOBType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bTinyIntVal.hashCode()
        result = 31 * result + this.sShortIntVal.hashCode()
        result = 31 * result + this.lIntVal.hashCode()
        result = 31 * result + this.llBigIntVal.hashCode()
        result = 31 * result + this.fltRealVal.hashCode()
        result = 31 * result + this.dblFloatVal.hashCode()
        result = 31 * result + this.cyMoneyVal.hashCode()
        result = 31 * result + this.nCharVal.hashCode()
        result = 31 * result + this.charVal.hashCode()
        result = 31 * result + this.fBitVal.hashCode()
        result = 31 * result + this.rgbGuidVal.contentHashCode()
        result = 31 * result + this.numNumericVal.hashCode()
        result = 31 * result + this.binaryVal.hashCode()
        result = 31 * result + this.tsDateTimeVal.hashCode()
        result = 31 * result + this.unknownType.hashCode()
        result = 31 * result + this.bLOBType.hashCode()
        return result
    }
}

public class Ssvariant04 internal constructor(
    public var dbobj: Dbobject,
    pUnkCtorArg: MutPtr<CVoid>,
) {
    public var pUnk: MutPtr<CVoid> = pUnkCtorArg
        internal set

    public constructor() : this(
        dbobj = Dbobject(),
        pUnkCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Dbobject = this.dbobj

    public operator fun component2(): MutPtr<CVoid> = this.pUnk

    public fun copy(dbobj: Dbobject = this.dbobj, pUnk: MutPtr<CVoid> = this.pUnk): Ssvariant04 = Ssvariant04(dbobj = dbobj, pUnkCtorArg = pUnk)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ssvariant04) return false
        if (this.dbobj != other.dbobj) return false
        if (this.pUnk != other.pUnk) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dbobj.hashCode()
        result = 31 * result + this.pUnk.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dbobj: Dbobject = Dbobject(),
            pUnk: MutPtr<CVoid> = MutPtr(0L),
        ): Ssvariant04 =
            Ssvariant04(
                dbobj = dbobj,
                pUnkCtorArg = pUnk,
            )
    }
}

public class Ssvariant02 internal constructor(
    public var sActualLength: Short,
    public var sMaxLength: Short,
    prgbBinaryValCtorArg: MutPtr<UByte>,
    public var dwReserved: UInt,
) {
    public var prgbBinaryVal: MutPtr<UByte> = prgbBinaryValCtorArg
        internal set

    public constructor() : this(
        sActualLength = 0,
        sMaxLength = 0,
        prgbBinaryValCtorArg = MutPtr(0L),
        dwReserved = 0u,
    )

    public operator fun component1(): Short = this.sActualLength

    public operator fun component2(): Short = this.sMaxLength

    public operator fun component3(): MutPtr<UByte> = this.prgbBinaryVal

    public operator fun component4(): UInt = this.dwReserved

    public fun copy(sActualLength: Short = this.sActualLength, sMaxLength: Short = this.sMaxLength, prgbBinaryVal: MutPtr<UByte> = this.prgbBinaryVal, dwReserved: UInt = this.dwReserved): Ssvariant02 = Ssvariant02(sActualLength = sActualLength, sMaxLength = sMaxLength, prgbBinaryValCtorArg = prgbBinaryVal, dwReserved = dwReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ssvariant02) return false
        if (this.sActualLength != other.sActualLength) return false
        if (this.sMaxLength != other.sMaxLength) return false
        if (this.prgbBinaryVal != other.prgbBinaryVal) return false
        if (this.dwReserved != other.dwReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sActualLength.hashCode()
        result = 31 * result + this.sMaxLength.hashCode()
        result = 31 * result + this.prgbBinaryVal.hashCode()
        result = 31 * result + this.dwReserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ssvariant02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ssvariant02> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Ssvariant02 =
                    Ssvariant02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Ssvariant02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.sActualLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.sMaxLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.prgbBinaryVal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwReserved)
                }
            }

        public operator fun invoke(
            sActualLength: Short = 0,
            sMaxLength: Short = 0,
            prgbBinaryVal: MutPtr<UByte> = MutPtr(0L),
            dwReserved: UInt = 0u,
        ): Ssvariant02 =
            Ssvariant02(
                sActualLength = sActualLength,
                sMaxLength = sMaxLength,
                prgbBinaryValCtorArg = prgbBinaryVal,
                dwReserved = dwReserved,
            )
    }
}

public class Ssvariant01 internal constructor(
    public var sActualLength: Short,
    public var sMaxLength: Short,
    pchCharValCtorArg: Pstr,
    public var rgbReserved: UByteArray,
    public var dwReserved: UInt,
    pwchReservedCtorArg: Pwstr,
) {
    public var pchCharVal: Pstr = pchCharValCtorArg
        internal set

    public var pwchReserved: Pwstr = pwchReservedCtorArg
        internal set

    public constructor() : this(
        sActualLength = 0,
        sMaxLength = 0,
        pchCharValCtorArg = MutPtr(0L),
        rgbReserved = UByteArray(5),
        dwReserved = 0u,
        pwchReservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Short = this.sActualLength

    public operator fun component2(): Short = this.sMaxLength

    public operator fun component3(): Pstr = this.pchCharVal

    public operator fun component4(): UByteArray = this.rgbReserved

    public operator fun component5(): UInt = this.dwReserved

    public operator fun component6(): Pwstr = this.pwchReserved

    public fun copy(sActualLength: Short = this.sActualLength, sMaxLength: Short = this.sMaxLength, pchCharVal: Pstr = this.pchCharVal, rgbReserved: UByteArray = this.rgbReserved, dwReserved: UInt = this.dwReserved, pwchReserved: Pwstr = this.pwchReserved): Ssvariant01 = Ssvariant01(sActualLength = sActualLength, sMaxLength = sMaxLength, pchCharValCtorArg = pchCharVal, rgbReserved = rgbReserved, dwReserved = dwReserved, pwchReservedCtorArg = pwchReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ssvariant01) return false
        if (this.sActualLength != other.sActualLength) return false
        if (this.sMaxLength != other.sMaxLength) return false
        if (this.pchCharVal != other.pchCharVal) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.pwchReserved != other.pwchReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sActualLength.hashCode()
        result = 31 * result + this.sMaxLength.hashCode()
        result = 31 * result + this.pchCharVal.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.pwchReserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sActualLength: Short = 0,
            sMaxLength: Short = 0,
            pchCharVal: Pstr = MutPtr(0L),
            rgbReserved: UByteArray = UByteArray(5),
            dwReserved: UInt = 0u,
            pwchReserved: Pwstr = MutPtr(0L),
        ): Ssvariant01 =
            Ssvariant01(
                sActualLength = sActualLength,
                sMaxLength = sMaxLength,
                pchCharValCtorArg = pchCharVal,
                rgbReserved = rgbReserved,
                dwReserved = dwReserved,
                pwchReservedCtorArg = pwchReserved,
            )
    }
}

public class Ssvariant00 internal constructor(
    public var sActualLength: Short,
    public var sMaxLength: Short,
    pwchNCharValCtorArg: Pwstr,
    public var rgbReserved: UByteArray,
    public var dwReserved: UInt,
    pwchReservedCtorArg: Pwstr,
) {
    public var pwchNCharVal: Pwstr = pwchNCharValCtorArg
        internal set

    public var pwchReserved: Pwstr = pwchReservedCtorArg
        internal set

    public constructor() : this(
        sActualLength = 0,
        sMaxLength = 0,
        pwchNCharValCtorArg = MutPtr(0L),
        rgbReserved = UByteArray(5),
        dwReserved = 0u,
        pwchReservedCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Short = this.sActualLength

    public operator fun component2(): Short = this.sMaxLength

    public operator fun component3(): Pwstr = this.pwchNCharVal

    public operator fun component4(): UByteArray = this.rgbReserved

    public operator fun component5(): UInt = this.dwReserved

    public operator fun component6(): Pwstr = this.pwchReserved

    public fun copy(sActualLength: Short = this.sActualLength, sMaxLength: Short = this.sMaxLength, pwchNCharVal: Pwstr = this.pwchNCharVal, rgbReserved: UByteArray = this.rgbReserved, dwReserved: UInt = this.dwReserved, pwchReserved: Pwstr = this.pwchReserved): Ssvariant00 = Ssvariant00(sActualLength = sActualLength, sMaxLength = sMaxLength, pwchNCharValCtorArg = pwchNCharVal, rgbReserved = rgbReserved, dwReserved = dwReserved, pwchReservedCtorArg = pwchReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ssvariant00) return false
        if (this.sActualLength != other.sActualLength) return false
        if (this.sMaxLength != other.sMaxLength) return false
        if (this.pwchNCharVal != other.pwchNCharVal) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        if (this.dwReserved != other.dwReserved) return false
        if (this.pwchReserved != other.pwchReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sActualLength.hashCode()
        result = 31 * result + this.sMaxLength.hashCode()
        result = 31 * result + this.pwchNCharVal.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        result = 31 * result + this.dwReserved.hashCode()
        result = 31 * result + this.pwchReserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sActualLength: Short = 0,
            sMaxLength: Short = 0,
            pwchNCharVal: Pwstr = MutPtr(0L),
            rgbReserved: UByteArray = UByteArray(5),
            dwReserved: UInt = 0u,
            pwchReserved: Pwstr = MutPtr(0L),
        ): Ssvariant00 =
            Ssvariant00(
                sActualLength = sActualLength,
                sMaxLength = sMaxLength,
                pwchNCharValCtorArg = pwchNCharVal,
                rgbReserved = rgbReserved,
                dwReserved = dwReserved,
                pwchReservedCtorArg = pwchReserved,
            )
    }
}

public class Ssvariant03 internal constructor(
    public var dwActualLength: UInt,
    public var rgMetadata: UByteArray,
    pUnknownDataCtorArg: MutPtr<UByte>,
) {
    public var pUnknownData: MutPtr<UByte> = pUnknownDataCtorArg
        internal set

    public constructor() : this(
        dwActualLength = 0u,
        rgMetadata = UByteArray(16),
        pUnknownDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwActualLength

    public operator fun component2(): UByteArray = this.rgMetadata

    public operator fun component3(): MutPtr<UByte> = this.pUnknownData

    public fun copy(dwActualLength: UInt = this.dwActualLength, rgMetadata: UByteArray = this.rgMetadata, pUnknownData: MutPtr<UByte> = this.pUnknownData): Ssvariant03 = Ssvariant03(dwActualLength = dwActualLength, rgMetadata = rgMetadata, pUnknownDataCtorArg = pUnknownData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ssvariant03) return false
        if (this.dwActualLength != other.dwActualLength) return false
        if (!this.rgMetadata.contentEquals(other.rgMetadata)) return false
        if (this.pUnknownData != other.pUnknownData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwActualLength.hashCode()
        result = 31 * result + this.rgMetadata.contentHashCode()
        result = 31 * result + this.pUnknownData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ssvariant03> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ssvariant03> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Ssvariant03 =
                    Ssvariant03(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Ssvariant03) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwActualLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 4L, value.rgMetadata.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 24L, value.pUnknownData)
                }
            }

        public operator fun invoke(
            dwActualLength: UInt = 0u,
            rgMetadata: UByteArray = UByteArray(16),
            pUnknownData: MutPtr<UByte> = MutPtr(0L),
        ): Ssvariant03 =
            Ssvariant03(
                dwActualLength = dwActualLength,
                rgMetadata = rgMetadata,
                pUnknownDataCtorArg = pUnknownData,
            )
    }
}

public class Subscriptioninfo internal constructor(
    public var cbSize: UInt,
    public var fUpdateFlags: UInt,
    public var schedule: Subscriptionschedule,
    public var customGroupCookie: Guid,
    pTriggerCtorArg: MutPtr<CVoid>,
    public var dwRecurseLevels: UInt,
    public var fWebcrawlerFlags: UInt,
    public var bMailNotification: Bool,
    public var bGleam: Bool,
    public var bChangesOnly: Bool,
    public var bNeedPassword: Bool,
    public var fChannelFlags: UInt,
    bstrUserNameCtorArg: Bstr,
    bstrPasswordCtorArg: Bstr,
    bstrFriendlyNameCtorArg: Bstr,
    public var dwMaxSizeKB: UInt,
    public var subType: Subscriptiontype,
    public var fTaskFlags: UInt,
    public var dwReserved: UInt,
) {
    public var pTrigger: MutPtr<CVoid> = pTriggerCtorArg
        internal set

    public var bstrUserName: Bstr = bstrUserNameCtorArg
        internal set

    public var bstrPassword: Bstr = bstrPasswordCtorArg
        internal set

    public var bstrFriendlyName: Bstr = bstrFriendlyNameCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        fUpdateFlags = 0u,
        schedule = 0,
        customGroupCookie = Guid(),
        pTriggerCtorArg = MutPtr(0L),
        dwRecurseLevels = 0u,
        fWebcrawlerFlags = 0u,
        bMailNotification = 0,
        bGleam = 0,
        bChangesOnly = 0,
        bNeedPassword = 0,
        fChannelFlags = 0u,
        bstrUserNameCtorArg = ConstPtr(0L),
        bstrPasswordCtorArg = ConstPtr(0L),
        bstrFriendlyNameCtorArg = ConstPtr(0L),
        dwMaxSizeKB = 0u,
        subType = 0,
        fTaskFlags = 0u,
        dwReserved = 0u,
    )

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            fUpdateFlags: UInt = 0u,
            schedule: Subscriptionschedule = 0,
            customGroupCookie: Guid = Guid(),
            pTrigger: MutPtr<CVoid> = MutPtr(0L),
            dwRecurseLevels: UInt = 0u,
            fWebcrawlerFlags: UInt = 0u,
            bMailNotification: Bool = 0,
            bGleam: Bool = 0,
            bChangesOnly: Bool = 0,
            bNeedPassword: Bool = 0,
            fChannelFlags: UInt = 0u,
            bstrUserName: Bstr = ConstPtr(0L),
            bstrPassword: Bstr = ConstPtr(0L),
            bstrFriendlyName: Bstr = ConstPtr(0L),
            dwMaxSizeKB: UInt = 0u,
            subType: Subscriptiontype = 0,
            fTaskFlags: UInt = 0u,
            dwReserved: UInt = 0u,
        ): Subscriptioninfo =
            Subscriptioninfo(
                cbSize = cbSize,
                fUpdateFlags = fUpdateFlags,
                schedule = schedule,
                customGroupCookie = customGroupCookie,
                pTriggerCtorArg = pTrigger,
                dwRecurseLevels = dwRecurseLevels,
                fWebcrawlerFlags = fWebcrawlerFlags,
                bMailNotification = bMailNotification,
                bGleam = bGleam,
                bChangesOnly = bChangesOnly,
                bNeedPassword = bNeedPassword,
                fChannelFlags = fChannelFlags,
                bstrUserNameCtorArg = bstrUserName,
                bstrPasswordCtorArg = bstrPassword,
                bstrFriendlyNameCtorArg = bstrFriendlyName,
                dwMaxSizeKB = dwMaxSizeKB,
                subType = subType,
                fTaskFlags = fTaskFlags,
                dwReserved = dwReserved,
            )
    }
}

public data class Subscriptioniteminfo(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwPriority: UInt = 0u,
    public var scheduleGroup: Guid = Guid(),
    public var clsidAgent: Guid = Guid(),
)

public class TextSource internal constructor(
    public var pfnFillTextBuffer: Pfnfilltextbuffer,
    awcBufferCtorArg: Pcwstr,
    public var iEnd: UInt,
    public var iCur: UInt,
) {
    public var awcBuffer: Pcwstr = awcBufferCtorArg
        internal set

    public constructor() : this(
        pfnFillTextBuffer = null,
        awcBufferCtorArg = ConstPtr(0L),
        iEnd = 0u,
        iCur = 0u,
    )

    public operator fun component1(): Pfnfilltextbuffer = this.pfnFillTextBuffer

    public operator fun component2(): Pcwstr = this.awcBuffer

    public operator fun component3(): UInt = this.iEnd

    public operator fun component4(): UInt = this.iCur

    public fun copy(pfnFillTextBuffer: Pfnfilltextbuffer = this.pfnFillTextBuffer, awcBuffer: Pcwstr = this.awcBuffer, iEnd: UInt = this.iEnd, iCur: UInt = this.iCur): TextSource = TextSource(pfnFillTextBuffer = pfnFillTextBuffer, awcBufferCtorArg = awcBuffer, iEnd = iEnd, iCur = iCur)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TextSource) return false
        if (this.pfnFillTextBuffer != other.pfnFillTextBuffer) return false
        if (this.awcBuffer != other.awcBuffer) return false
        if (this.iEnd != other.iEnd) return false
        if (this.iCur != other.iCur) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pfnFillTextBuffer.hashCode()
        result = 31 * result + this.awcBuffer.hashCode()
        result = 31 * result + this.iEnd.hashCode()
        result = 31 * result + this.iCur.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pfnFillTextBuffer: Pfnfilltextbuffer = null,
            awcBuffer: Pcwstr = ConstPtr(0L),
            iEnd: UInt = 0u,
            iCur: UInt = 0u,
        ): TextSource =
            TextSource(
                pfnFillTextBuffer = pfnFillTextBuffer,
                awcBufferCtorArg = awcBuffer,
                iEnd = iEnd,
                iCur = iCur,
            )
    }
}

public data class TimeoutInfo(
    public var dwSize: UInt = 0u,
    public var dwConnectTimeout: UInt = 0u,
    public var dwDataTimeout: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TimeoutInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TimeoutInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): TimeoutInfo =
                    TimeoutInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TimeoutInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwConnectTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwDataTimeout)
                }
            }
    }
}

public data class TimestampStruct(
    public var year: Short = 0,
    public var month: UShort = 0u,
    public var day: UShort = 0u,
    public var hour: UShort = 0u,
    public var minute: UShort = 0u,
    public var second: UShort = 0u,
    public var fraction: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TimestampStruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TimestampStruct> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): TimestampStruct =
                    TimestampStruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: TimestampStruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.year)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.month)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.day)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.hour)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.minute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.second)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fraction)
                }
            }
    }
}

public data class TimeStruct(
    public var hour: UShort = 0u,
    public var minute: UShort = 0u,
    public var second: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TimeStruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TimeStruct> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): TimeStruct =
                    TimeStruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: TimeStruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.hour)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.minute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.second)
                }
            }
    }
}

public data class Vectorrestriction(
    public var node: Noderestriction = Noderestriction(),
    public var rankMethod: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Vectorrestriction> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Vectorrestriction> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Vectorrestriction =
                    Vectorrestriction(
                        (Noderestriction.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Vectorrestriction) {
                    (Noderestriction.typeLayout()).writeNative(addr, value.node)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.rankMethod)
                }
            }
    }
}
