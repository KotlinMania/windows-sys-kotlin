package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp

import io.github.kotlinmania.windowssys.core.BOOL

public data class AsnAny(public var asnType: UByte = 0u, public var asnValue: AsnAny_0 = AsnAny_0())

public data class AsnAny_0(
    public var number: Int = 0,
    public var unsigned32: UInt = 0u,
    public var counter64: ULong = 0uL,
    public var string: AsnOctetString = AsnOctetString(),
    public var bits: AsnOctetString = AsnOctetString(),
    public var obj: AsnObjectIdentifier = AsnObjectIdentifier(),
    public var sequence: AsnOctetString = AsnOctetString(),
    public var address: AsnOctetString = AsnOctetString(),
    public var counter: UInt = 0u,
    public var gauge: UInt = 0u,
    public var ticks: UInt = 0u,
    public var arbitrary: AsnOctetString = AsnOctetString(),
)

public data class AsnObjectIdentifier(public var idLength: UInt = 0u, public var ids: Long = 0L)

public data class AsnOctetString(
    public var stream: Long = 0L,
    public var length: UInt = 0u,
    public var dynamic: BOOL = 0,
)

public data class SnmpVarBind(public var name: AsnObjectIdentifier = AsnObjectIdentifier(), public var value: AsnAny = AsnAny())

public data class SnmpVarBindList(public var list: Long = 0L, public var len: UInt = 0u)

public data class smiCNTR64(public var hipart: UInt = 0u, public var lopart: UInt = 0u)

public data class smiOCTETS(public var len: UInt = 0u, public var ptr: Long = 0L)

public data class smiOID(public var len: UInt = 0u, public var ptr: Long = 0L)

public data class smiVALUE(public var syntax: UInt = 0u, public var value: smiVALUE_0 = smiVALUE_0())

public data class smiVALUE_0(
    public var sNumber: Int = 0,
    public var uNumber: UInt = 0u,
    public var hNumber: smiCNTR64 = smiCNTR64(),
    public var string: smiOCTETS = smiOCTETS(),
    public var oid: smiOID = smiOID(),
    public var empty: UByte = 0u,
)

public data class smiVENDORINFO(
    public var vendorName: ByteArray = ByteArray(64),
    public var vendorContact: ByteArray = ByteArray(64),
    public var vendorVersionId: ByteArray = ByteArray(32),
    public var vendorVersionDate: ByteArray = ByteArray(32),
    public var vendorEnterprise: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is smiVENDORINFO) return false
        if (!this.vendorName.contentEquals(other.vendorName)) return false
        if (!this.vendorContact.contentEquals(other.vendorContact)) return false
        if (!this.vendorVersionId.contentEquals(other.vendorVersionId)) return false
        if (!this.vendorVersionDate.contentEquals(other.vendorVersionDate)) return false
        if (this.vendorEnterprise != other.vendorEnterprise) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.vendorName.contentHashCode()
        result = 31 * result + this.vendorContact.contentHashCode()
        result = 31 * result + this.vendorVersionId.contentHashCode()
        result = 31 * result + this.vendorVersionDate.contentHashCode()
        result = 31 * result + this.vendorEnterprise.hashCode()
        return result
    }
}
