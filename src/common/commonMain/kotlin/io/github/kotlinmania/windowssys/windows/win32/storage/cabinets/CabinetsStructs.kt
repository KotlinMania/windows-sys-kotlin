package io.github.kotlinmania.windowssys.windows.win32.storage.cabinets

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PSTR

public data class CCAB(
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
        if (other !is CCAB) return false
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
}

public data class ERF(
    public var erfOper: Int = 0,
    public var erfType: Int = 0,
    public var fError: BOOL = 0,
)

public data class FDICABINETINFO(
    public var cbCabinet: Int = 0,
    public var cFolders: UShort = 0u,
    public var cFiles: UShort = 0u,
    public var setID: UShort = 0u,
    public var iCabinet: UShort = 0u,
    public var fReserve: BOOL = 0,
    public var hasprev: BOOL = 0,
    public var hasnext: BOOL = 0,
)

public data class FDIDECRYPT(
    public var fdidt: FDIDECRYPTTYPE = 0,
    public var pvUser: Long = 0L,
    public var Anonymous: FDIDECRYPT_0 = FDIDECRYPT_0(),
)

public data class FDIDECRYPT_0(
    public var cabinet: FDIDECRYPT_0_0 = FDIDECRYPT_0_0(),
    public var folder: FDIDECRYPT_0_1 = FDIDECRYPT_0_1(),
    public var decrypt: FDIDECRYPT_0_2 = FDIDECRYPT_0_2(),
)

public data class FDIDECRYPT_0_0(
    public var pHeaderReserve: Long = 0L,
    public var cbHeaderReserve: UShort = 0u,
    public var setID: UShort = 0u,
    public var iCabinet: Int = 0,
)

public data class FDIDECRYPT_0_2(
    public var pDataReserve: Long = 0L,
    public var cbDataReserve: UShort = 0u,
    public var pbData: Long = 0L,
    public var cbData: UShort = 0u,
    public var fSplit: BOOL = 0,
    public var cbPartial: UShort = 0u,
)

public data class FDIDECRYPT_0_1(
    public var pFolderReserve: Long = 0L,
    public var cbFolderReserve: UShort = 0u,
    public var iFolder: UShort = 0u,
)

public data class FDINOTIFICATION(
    public var cb: Int = 0,
    public var psz1: PSTR = 0L,
    public var psz2: PSTR = 0L,
    public var psz3: PSTR = 0L,
    public var pv: Long = 0L,
    public var hf: Long = 0L,
    public var date: UShort = 0u,
    public var time: UShort = 0u,
    public var attribs: UShort = 0u,
    public var setID: UShort = 0u,
    public var iCabinet: UShort = 0u,
    public var iFolder: UShort = 0u,
    public var fdie: FDIERROR = 0,
)

public data class FDISPILLFILE(public var ach: ByteArray = ByteArray(2), public var cbFile: Int = 0) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FDISPILLFILE) return false
        if (!this.ach.contentEquals(other.ach)) return false
        if (this.cbFile != other.cbFile) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ach.contentHashCode()
        result = 31 * result + this.cbFile.hashCode()
        return result
    }
}
