package io.github.kotlinmania.windowssys.windows.win32.storage.cabinets

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pstr

public data class Ccab(
    public var cb: UInt = 0u,
    public var cbFolderThresh: UInt = 0u,
    public var cbReserveCFHeader: UInt = 0u,
    public var cbReserveCFFolder: UInt = 0u,
    public var cbReserveCFData: UInt = 0u,
    public var iCab: Int = 0,
    public var iDisk: Int = 0,
    public var fFailOnIncompressible: Int = 0,
    public var setID: UShort = 0u,
    public var szDisk: ByteArray = ByteArray(256),
    public var szCab: ByteArray = ByteArray(256),
    public var szCabPath: ByteArray = ByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ccab) return false
        if (this.cb != other.cb) return false
        if (this.cbFolderThresh != other.cbFolderThresh) return false
        if (this.cbReserveCFHeader != other.cbReserveCFHeader) return false
        if (this.cbReserveCFFolder != other.cbReserveCFFolder) return false
        if (this.cbReserveCFData != other.cbReserveCFData) return false
        if (this.iCab != other.iCab) return false
        if (this.iDisk != other.iDisk) return false
        if (this.fFailOnIncompressible != other.fFailOnIncompressible) return false
        if (this.setID != other.setID) return false
        if (!this.szDisk.contentEquals(other.szDisk)) return false
        if (!this.szCab.contentEquals(other.szCab)) return false
        if (!this.szCabPath.contentEquals(other.szCabPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.cbFolderThresh.hashCode()
        result = 31 * result + this.cbReserveCFHeader.hashCode()
        result = 31 * result + this.cbReserveCFFolder.hashCode()
        result = 31 * result + this.cbReserveCFData.hashCode()
        result = 31 * result + this.iCab.hashCode()
        result = 31 * result + this.iDisk.hashCode()
        result = 31 * result + this.fFailOnIncompressible.hashCode()
        result = 31 * result + this.setID.hashCode()
        result = 31 * result + this.szDisk.contentHashCode()
        result = 31 * result + this.szCab.contentHashCode()
        result = 31 * result + this.szCabPath.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ccab> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ccab> {
                override val sizeBytes: Long = 804L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ccab =
                    Ccab(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr + 34L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr + 290L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr + 546L),
                    )
                override fun writeNative(addr: Long, value: Ccab) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cb)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbFolderThresh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbReserveCFHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbReserveCFFolder)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbReserveCFData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.iCab)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.iDisk)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.fFailOnIncompressible)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 32L, value.setID)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr + 34L, value.szDisk)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr + 290L, value.szCab)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr + 546L, value.szCabPath)
                }
            }
    }
}

public data class Erf(
    public var erfOper: Int = 0,
    public var erfType: Int = 0,
    public var fError: Bool = 0,
)

public data class Fdicabinetinfo(
    public var cbCabinet: Int = 0,
    public var cFolders: UShort = 0u,
    public var cFiles: UShort = 0u,
    public var setID: UShort = 0u,
    public var iCabinet: UShort = 0u,
    public var fReserve: Bool = 0,
    public var hasprev: Bool = 0,
    public var hasnext: Bool = 0,
)

public class Fdidecrypt internal constructor(
    public var fdidt: Fdidecrypttype,
    pvUserCtorArg: MutPtr<CVoid>,
    public var anonymous: Fdidecrypt0,
) {
    public var pvUser: MutPtr<CVoid> = pvUserCtorArg
        internal set

    public constructor() : this(
        fdidt = 0,
        pvUserCtorArg = MutPtr(0L),
        anonymous = Fdidecrypt0(),
    )

    public operator fun component1(): Fdidecrypttype = this.fdidt

    public operator fun component2(): MutPtr<CVoid> = this.pvUser

    public operator fun component3(): Fdidecrypt0 = this.anonymous

    public fun copy(fdidt: Fdidecrypttype = this.fdidt, pvUser: MutPtr<CVoid> = this.pvUser, anonymous: Fdidecrypt0 = this.anonymous): Fdidecrypt = Fdidecrypt(fdidt = fdidt, pvUserCtorArg = pvUser, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Fdidecrypt) return false
        if (this.fdidt != other.fdidt) return false
        if (this.pvUser != other.pvUser) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fdidt.hashCode()
        result = 31 * result + this.pvUser.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fdidt: Fdidecrypttype = 0,
            pvUser: MutPtr<CVoid> = MutPtr(0L),
            anonymous: Fdidecrypt0 = Fdidecrypt0(),
        ): Fdidecrypt =
            Fdidecrypt(
                fdidt = fdidt,
                pvUserCtorArg = pvUser,
                anonymous = anonymous,
            )
    }
}

public data class Fdidecrypt0(
    public var cabinet: Fdidecrypt00 = Fdidecrypt00(),
    public var folder: Fdidecrypt01 = Fdidecrypt01(),
    public var decrypt: Fdidecrypt02 = Fdidecrypt02(),
)

public class Fdidecrypt00 internal constructor(
    pHeaderReserveCtorArg: MutPtr<CVoid>,
    public var cbHeaderReserve: UShort,
    public var setID: UShort,
    public var iCabinet: Int,
) {
    public var pHeaderReserve: MutPtr<CVoid> = pHeaderReserveCtorArg
        internal set

    public constructor() : this(
        pHeaderReserveCtorArg = MutPtr(0L),
        cbHeaderReserve = 0u,
        setID = 0u,
        iCabinet = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.pHeaderReserve

    public operator fun component2(): UShort = this.cbHeaderReserve

    public operator fun component3(): UShort = this.setID

    public operator fun component4(): Int = this.iCabinet

    public fun copy(pHeaderReserve: MutPtr<CVoid> = this.pHeaderReserve, cbHeaderReserve: UShort = this.cbHeaderReserve, setID: UShort = this.setID, iCabinet: Int = this.iCabinet): Fdidecrypt00 = Fdidecrypt00(pHeaderReserveCtorArg = pHeaderReserve, cbHeaderReserve = cbHeaderReserve, setID = setID, iCabinet = iCabinet)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Fdidecrypt00) return false
        if (this.pHeaderReserve != other.pHeaderReserve) return false
        if (this.cbHeaderReserve != other.cbHeaderReserve) return false
        if (this.setID != other.setID) return false
        if (this.iCabinet != other.iCabinet) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pHeaderReserve.hashCode()
        result = 31 * result + this.cbHeaderReserve.hashCode()
        result = 31 * result + this.setID.hashCode()
        result = 31 * result + this.iCabinet.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fdidecrypt00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fdidecrypt00> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Fdidecrypt00 =
                    Fdidecrypt00(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Fdidecrypt00) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.pHeaderReserve)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.cbHeaderReserve)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.setID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.iCabinet)
                }
            }

        public operator fun invoke(
            pHeaderReserve: MutPtr<CVoid> = MutPtr(0L),
            cbHeaderReserve: UShort = 0u,
            setID: UShort = 0u,
            iCabinet: Int = 0,
        ): Fdidecrypt00 =
            Fdidecrypt00(
                pHeaderReserveCtorArg = pHeaderReserve,
                cbHeaderReserve = cbHeaderReserve,
                setID = setID,
                iCabinet = iCabinet,
            )
    }
}

public class Fdidecrypt02 internal constructor(
    pDataReserveCtorArg: MutPtr<CVoid>,
    public var cbDataReserve: UShort,
    pbDataCtorArg: MutPtr<CVoid>,
    public var cbData: UShort,
    public var fSplit: Bool,
    public var cbPartial: UShort,
) {
    public var pDataReserve: MutPtr<CVoid> = pDataReserveCtorArg
        internal set

    public var pbData: MutPtr<CVoid> = pbDataCtorArg
        internal set

    public constructor() : this(
        pDataReserveCtorArg = MutPtr(0L),
        cbDataReserve = 0u,
        pbDataCtorArg = MutPtr(0L),
        cbData = 0u,
        fSplit = 0,
        cbPartial = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.pDataReserve

    public operator fun component2(): UShort = this.cbDataReserve

    public operator fun component3(): MutPtr<CVoid> = this.pbData

    public operator fun component4(): UShort = this.cbData

    public operator fun component5(): Bool = this.fSplit

    public operator fun component6(): UShort = this.cbPartial

    public fun copy(pDataReserve: MutPtr<CVoid> = this.pDataReserve, cbDataReserve: UShort = this.cbDataReserve, pbData: MutPtr<CVoid> = this.pbData, cbData: UShort = this.cbData, fSplit: Bool = this.fSplit, cbPartial: UShort = this.cbPartial): Fdidecrypt02 = Fdidecrypt02(pDataReserveCtorArg = pDataReserve, cbDataReserve = cbDataReserve, pbDataCtorArg = pbData, cbData = cbData, fSplit = fSplit, cbPartial = cbPartial)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Fdidecrypt02) return false
        if (this.pDataReserve != other.pDataReserve) return false
        if (this.cbDataReserve != other.cbDataReserve) return false
        if (this.pbData != other.pbData) return false
        if (this.cbData != other.cbData) return false
        if (this.fSplit != other.fSplit) return false
        if (this.cbPartial != other.cbPartial) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pDataReserve.hashCode()
        result = 31 * result + this.cbDataReserve.hashCode()
        result = 31 * result + this.pbData.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.fSplit.hashCode()
        result = 31 * result + this.cbPartial.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pDataReserve: MutPtr<CVoid> = MutPtr(0L),
            cbDataReserve: UShort = 0u,
            pbData: MutPtr<CVoid> = MutPtr(0L),
            cbData: UShort = 0u,
            fSplit: Bool = 0,
            cbPartial: UShort = 0u,
        ): Fdidecrypt02 =
            Fdidecrypt02(
                pDataReserveCtorArg = pDataReserve,
                cbDataReserve = cbDataReserve,
                pbDataCtorArg = pbData,
                cbData = cbData,
                fSplit = fSplit,
                cbPartial = cbPartial,
            )
    }
}

public class Fdidecrypt01 internal constructor(
    pFolderReserveCtorArg: MutPtr<CVoid>,
    public var cbFolderReserve: UShort,
    public var iFolder: UShort,
) {
    public var pFolderReserve: MutPtr<CVoid> = pFolderReserveCtorArg
        internal set

    public constructor() : this(
        pFolderReserveCtorArg = MutPtr(0L),
        cbFolderReserve = 0u,
        iFolder = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.pFolderReserve

    public operator fun component2(): UShort = this.cbFolderReserve

    public operator fun component3(): UShort = this.iFolder

    public fun copy(pFolderReserve: MutPtr<CVoid> = this.pFolderReserve, cbFolderReserve: UShort = this.cbFolderReserve, iFolder: UShort = this.iFolder): Fdidecrypt01 = Fdidecrypt01(pFolderReserveCtorArg = pFolderReserve, cbFolderReserve = cbFolderReserve, iFolder = iFolder)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Fdidecrypt01) return false
        if (this.pFolderReserve != other.pFolderReserve) return false
        if (this.cbFolderReserve != other.cbFolderReserve) return false
        if (this.iFolder != other.iFolder) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pFolderReserve.hashCode()
        result = 31 * result + this.cbFolderReserve.hashCode()
        result = 31 * result + this.iFolder.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fdidecrypt01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fdidecrypt01> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Fdidecrypt01 =
                    Fdidecrypt01(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: Fdidecrypt01) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.pFolderReserve)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.cbFolderReserve)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.iFolder)
                }
            }

        public operator fun invoke(
            pFolderReserve: MutPtr<CVoid> = MutPtr(0L),
            cbFolderReserve: UShort = 0u,
            iFolder: UShort = 0u,
        ): Fdidecrypt01 =
            Fdidecrypt01(
                pFolderReserveCtorArg = pFolderReserve,
                cbFolderReserve = cbFolderReserve,
                iFolder = iFolder,
            )
    }
}

public class Fdinotification internal constructor(
    public var cb: Int,
    psz1CtorArg: Pstr,
    psz2CtorArg: Pstr,
    psz3CtorArg: Pstr,
    pvCtorArg: MutPtr<CVoid>,
    public var hf: Int,
    public var date: UShort,
    public var time: UShort,
    public var attribs: UShort,
    public var setID: UShort,
    public var iCabinet: UShort,
    public var iFolder: UShort,
    public var fdie: Fdierror,
) {
    public var psz1: Pstr = psz1CtorArg
        internal set

    public var psz2: Pstr = psz2CtorArg
        internal set

    public var psz3: Pstr = psz3CtorArg
        internal set

    public var pv: MutPtr<CVoid> = pvCtorArg
        internal set

    public constructor() : this(
        cb = 0,
        psz1CtorArg = MutPtr(0L),
        psz2CtorArg = MutPtr(0L),
        psz3CtorArg = MutPtr(0L),
        pvCtorArg = MutPtr(0L),
        hf = 0,
        date = 0u,
        time = 0u,
        attribs = 0u,
        setID = 0u,
        iCabinet = 0u,
        iFolder = 0u,
        fdie = 0,
    )

    public operator fun component1(): Int = this.cb

    public operator fun component2(): Pstr = this.psz1

    public operator fun component3(): Pstr = this.psz2

    public operator fun component4(): Pstr = this.psz3

    public operator fun component5(): MutPtr<CVoid> = this.pv

    public operator fun component6(): Int = this.hf

    public operator fun component7(): UShort = this.date

    public operator fun component8(): UShort = this.time

    public operator fun component9(): UShort = this.attribs

    public operator fun component10(): UShort = this.setID

    public operator fun component11(): UShort = this.iCabinet

    public operator fun component12(): UShort = this.iFolder

    public operator fun component13(): Fdierror = this.fdie

    public fun copy(cb: Int = this.cb, psz1: Pstr = this.psz1, psz2: Pstr = this.psz2, psz3: Pstr = this.psz3, pv: MutPtr<CVoid> = this.pv, hf: Int = this.hf, date: UShort = this.date, time: UShort = this.time, attribs: UShort = this.attribs, setID: UShort = this.setID, iCabinet: UShort = this.iCabinet, iFolder: UShort = this.iFolder, fdie: Fdierror = this.fdie): Fdinotification = Fdinotification(cb = cb, psz1CtorArg = psz1, psz2CtorArg = psz2, psz3CtorArg = psz3, pvCtorArg = pv, hf = hf, date = date, time = time, attribs = attribs, setID = setID, iCabinet = iCabinet, iFolder = iFolder, fdie = fdie)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Fdinotification) return false
        if (this.cb != other.cb) return false
        if (this.psz1 != other.psz1) return false
        if (this.psz2 != other.psz2) return false
        if (this.psz3 != other.psz3) return false
        if (this.pv != other.pv) return false
        if (this.hf != other.hf) return false
        if (this.date != other.date) return false
        if (this.time != other.time) return false
        if (this.attribs != other.attribs) return false
        if (this.setID != other.setID) return false
        if (this.iCabinet != other.iCabinet) return false
        if (this.iFolder != other.iFolder) return false
        if (this.fdie != other.fdie) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.psz1.hashCode()
        result = 31 * result + this.psz2.hashCode()
        result = 31 * result + this.psz3.hashCode()
        result = 31 * result + this.pv.hashCode()
        result = 31 * result + this.hf.hashCode()
        result = 31 * result + this.date.hashCode()
        result = 31 * result + this.time.hashCode()
        result = 31 * result + this.attribs.hashCode()
        result = 31 * result + this.setID.hashCode()
        result = 31 * result + this.iCabinet.hashCode()
        result = 31 * result + this.iFolder.hashCode()
        result = 31 * result + this.fdie.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cb: Int = 0,
            psz1: Pstr = MutPtr(0L),
            psz2: Pstr = MutPtr(0L),
            psz3: Pstr = MutPtr(0L),
            pv: MutPtr<CVoid> = MutPtr(0L),
            hf: Int = 0,
            date: UShort = 0u,
            time: UShort = 0u,
            attribs: UShort = 0u,
            setID: UShort = 0u,
            iCabinet: UShort = 0u,
            iFolder: UShort = 0u,
            fdie: Fdierror = 0,
        ): Fdinotification =
            Fdinotification(
                cb = cb,
                psz1CtorArg = psz1,
                psz2CtorArg = psz2,
                psz3CtorArg = psz3,
                pvCtorArg = pv,
                hf = hf,
                date = date,
                time = time,
                attribs = attribs,
                setID = setID,
                iCabinet = iCabinet,
                iFolder = iFolder,
                fdie = fdie,
            )
    }
}

public data class Fdispillfile(
    public var ach: ByteArray = ByteArray(2),
    public var cbFile: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Fdispillfile) return false
        if (!this.ach.contentEquals(other.ach)) return false
        if (this.cbFile != other.cbFile) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ach.contentHashCode()
        result = 31 * result + this.cbFile.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fdispillfile> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fdispillfile> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Fdispillfile =
                    Fdispillfile(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (2).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Fdispillfile) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (2).toInt())
                    ).writeNative(addr, value.ach)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.cbFile)
                }
            }
    }
}
