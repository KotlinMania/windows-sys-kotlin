package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.snmp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

public data class AsnAny(
    public var asnType: UByte = 0u,
    public var asnValue: AsnAny0 = AsnAny0(),
)

public data class AsnAny0(
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

public data class AsnObjectIdentifier(
    public var idLength: UInt = 0u,
    public var ids: UInt? = null,
)

public data class AsnOctetString(
    public var stream: COpaquePointer? = null,
    public var length: UInt = 0u,
    public var dynamic: Bool = 0,
)

public data class SnmpVarBind(
    public var name: AsnObjectIdentifier = AsnObjectIdentifier(),
    public var value: AsnAny = AsnAny(),
)

public data class SnmpVarBindList(
    public var list: SnmpVarBind? = null,
    public var len: UInt = 0u,
)

public data class SmiCntr64(
    public var hipart: UInt = 0u,
    public var lopart: UInt = 0u,
)

public data class SmiOctets(
    public var len: UInt = 0u,
    public var ptr: COpaquePointer? = null,
)

public data class SmiOid(
    public var len: UInt = 0u,
    public var ptr: UInt? = null,
)

public data class SmiValue(
    public var syntax: UInt = 0u,
    public var value: SmiValue0 = SmiValue0(),
)

public data class SmiValue0(
    public var sNumber: Int = 0,
    public var uNumber: UInt = 0u,
    public var hNumber: SmiCntr64 = SmiCntr64(),
    public var string: SmiOctets = SmiOctets(),
    public var oid: SmiOid = SmiOid(),
    public var empty: UByte = 0u,
)

public data class SmiVendorinfo(
    public var vendorName: ByteArray = ByteArray(64),
    public var vendorContact: ByteArray = ByteArray(64),
    public var vendorVersionId: ByteArray = ByteArray(32),
    public var vendorVersionDate: ByteArray = ByteArray(32),
    public var vendorEnterprise: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SmiVendorinfo) return false
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
