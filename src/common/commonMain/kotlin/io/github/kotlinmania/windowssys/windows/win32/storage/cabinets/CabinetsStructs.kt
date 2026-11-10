package io.github.kotlinmania.windowssys.windows.win32.storage.cabinets

import io.github.kotlinmania.windowssys.COpaquePointer
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

public data class Fdidecrypt(
    public var fdidt: Fdidecrypttype = 0,
    public var pvUser: COpaquePointer? = null,
    public var anonymous: Fdidecrypt0 = Fdidecrypt0(),
)

public data class Fdidecrypt0(
    public var cabinet: Fdidecrypt00 = Fdidecrypt00(),
    public var folder: Fdidecrypt01 = Fdidecrypt01(),
    public var decrypt: Fdidecrypt02 = Fdidecrypt02(),
)

public data class Fdidecrypt00(
    public var pHeaderReserve: COpaquePointer? = null,
    public var cbHeaderReserve: UShort = 0u,
    public var setID: UShort = 0u,
    public var iCabinet: Int = 0,
)

public data class Fdidecrypt02(
    public var pDataReserve: COpaquePointer? = null,
    public var cbDataReserve: UShort = 0u,
    public var pbData: COpaquePointer? = null,
    public var cbData: UShort = 0u,
    public var fSplit: Bool = 0,
    public var cbPartial: UShort = 0u,
)

public data class Fdidecrypt01(
    public var pFolderReserve: COpaquePointer? = null,
    public var cbFolderReserve: UShort = 0u,
    public var iFolder: UShort = 0u,
)

public data class Fdinotification(
    public var cb: Int = 0,
    public var psz1: Pstr = null,
    public var psz2: Pstr = null,
    public var psz3: Pstr = null,
    public var pv: COpaquePointer? = null,
    public var hf: Int = 0,
    public var date: UShort = 0u,
    public var time: UShort = 0u,
    public var attribs: UShort = 0u,
    public var setID: UShort = 0u,
    public var iCabinet: UShort = 0u,
    public var iFolder: UShort = 0u,
    public var fdie: Fdierror = 0,
)

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
}
