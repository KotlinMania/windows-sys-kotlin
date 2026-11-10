@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr

public data class BerElement(
    public var opaque: Pstr = null,
)

public data class Ldap(
    public var ldSb: Ldap0 = Ldap0(),
    public var ldHost: Pstr = null,
    public var ldVersion: UInt = 0u,
    public var ldLberoptions: UByte = 0u,
    public var ldDeref: UInt = 0u,
    public var ldTimelimit: UInt = 0u,
    public var ldSizelimit: UInt = 0u,
    public var ldErrno: UInt = 0u,
    public var ldMatched: Pstr = null,
    public var ldError: Pstr = null,
    public var ldMsgid: UInt = 0u,
    public var reserved3: UByteArray = UByteArray(25),
    public var ldCldaptries: UInt = 0u,
    public var ldCldaptimeout: UInt = 0u,
    public var ldRefhoplimit: UInt = 0u,
    public var ldOptions: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ldap) return false
        if (this.ldSb != other.ldSb) return false
        if (this.ldHost != other.ldHost) return false
        if (this.ldVersion != other.ldVersion) return false
        if (this.ldLberoptions != other.ldLberoptions) return false
        if (this.ldDeref != other.ldDeref) return false
        if (this.ldTimelimit != other.ldTimelimit) return false
        if (this.ldSizelimit != other.ldSizelimit) return false
        if (this.ldErrno != other.ldErrno) return false
        if (this.ldMatched != other.ldMatched) return false
        if (this.ldError != other.ldError) return false
        if (this.ldMsgid != other.ldMsgid) return false
        if (!this.reserved3.contentEquals(other.reserved3)) return false
        if (this.ldCldaptries != other.ldCldaptries) return false
        if (this.ldCldaptimeout != other.ldCldaptimeout) return false
        if (this.ldRefhoplimit != other.ldRefhoplimit) return false
        if (this.ldOptions != other.ldOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ldSb.hashCode()
        result = 31 * result + this.ldHost.hashCode()
        result = 31 * result + this.ldVersion.hashCode()
        result = 31 * result + this.ldLberoptions.hashCode()
        result = 31 * result + this.ldDeref.hashCode()
        result = 31 * result + this.ldTimelimit.hashCode()
        result = 31 * result + this.ldSizelimit.hashCode()
        result = 31 * result + this.ldErrno.hashCode()
        result = 31 * result + this.ldMatched.hashCode()
        result = 31 * result + this.ldError.hashCode()
        result = 31 * result + this.ldMsgid.hashCode()
        result = 31 * result + this.reserved3.contentHashCode()
        result = 31 * result + this.ldCldaptries.hashCode()
        result = 31 * result + this.ldCldaptimeout.hashCode()
        result = 31 * result + this.ldRefhoplimit.hashCode()
        result = 31 * result + this.ldOptions.hashCode()
        return result
    }
}

public data class Ldap0(
    public var sbSd: Int = 0,
    public var reserved1: UByteArray = UByteArray(41),
    public var sbNaddr: Int = 0,
    public var reserved2: UByteArray = UByteArray(24),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ldap0) return false
        if (this.sbSd != other.sbSd) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.sbNaddr != other.sbNaddr) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sbSd.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.sbNaddr.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }
}

public data class LDAPAPIFeatureInfoA(
    public var ldapaifInfoVersion: Int = 0,
    public var ldapaifName: Pstr = null,
    public var ldapaifVersion: Int = 0,
)

public data class LDAPAPIFeatureInfoW(
    public var ldapaifInfoVersion: Int = 0,
    public var ldapaifName: Pwstr = null,
    public var ldapaifVersion: Int = 0,
)

public data class LDAPAPIInfoA(
    public var ldapaiInfoVersion: Int = 0,
    public var ldapaiApiVersion: Int = 0,
    public var ldapaiProtocolVersion: Int = 0,
    public var ldapaiExtensions: COpaquePointer? = null,
    public var ldapaiVendorName: Pstr = null,
    public var ldapaiVendorVersion: Int = 0,
)

public data class LDAPAPIInfoW(
    public var ldapaiInfoVersion: Int = 0,
    public var ldapaiApiVersion: Int = 0,
    public var ldapaiProtocolVersion: Int = 0,
    public var ldapaiExtensions: Pwstr? = null,
    public var ldapaiVendorName: Pwstr = null,
    public var ldapaiVendorVersion: Int = 0,
)

public data class LDAPControlA(
    public var ldctlOid: Pstr = null,
    public var ldctlValue: LdapBerval = LdapBerval(),
    public var ldctlIscritical: Boolean = false,
)

public data class LDAPControlW(
    public var ldctlOid: Pwstr = null,
    public var ldctlValue: LdapBerval = LdapBerval(),
    public var ldctlIscritical: Boolean = false,
)

public data class LDAPMessage(
    public var lmMsgid: UInt = 0u,
    public var lmMsgtype: UInt = 0u,
    public var lmBer: COpaquePointer? = null,
    public var lmChain: LDAPMessage? = null,
    public var lmNext: LDAPMessage? = null,
    public var lmTime: UInt = 0u,
    public var connection: Ldap? = null,
    public var request: COpaquePointer? = null,
    public var lmReturncode: UInt = 0u,
    public var lmReferral: UShort = 0u,
    public var lmChased: Boolean = false,
    public var lmEom: Boolean = false,
    public var connectionReferenced: Boolean = false,
)

public data class LDAPModA(
    public var modOp: UInt = 0u,
    public var modType: Pstr = null,
    public var modVals: LdapmodA0 = LdapmodA0(),
)

public data class LdapmodA0(
    public var modvStrvals: Pstr? = null,
    public var modvBvals: COpaquePointer? = null,
)

public data class LDAPModW(
    public var modOp: UInt = 0u,
    public var modType: Pwstr = null,
    public var modVals: LdapmodW0 = LdapmodW0(),
)

public data class LdapmodW0(
    public var modvStrvals: Pwstr? = null,
    public var modvBvals: COpaquePointer? = null,
)

public data class LDAPSortKeyA(
    public var skAttrtype: Pstr = null,
    public var skMatchruleoid: Pstr = null,
    public var skReverseorder: Boolean = false,
)

public data class LDAPSortKeyW(
    public var skAttrtype: Pwstr = null,
    public var skMatchruleoid: Pwstr = null,
    public var skReverseorder: Boolean = false,
)

public data class LDAPVLVInfo(
    public var ldvlvVersion: Int = 0,
    public var ldvlvBeforeCount: UInt = 0u,
    public var ldvlvAfterCount: UInt = 0u,
    public var ldvlvOffset: UInt = 0u,
    public var ldvlvCount: UInt = 0u,
    public var ldvlvAttrvalue: LdapBerval? = null,
    public var ldvlvContext: LdapBerval? = null,
    public var ldvlvExtradata: COpaquePointer? = null,
)

public data class LdapBerval(
    public var bvLen: UInt = 0u,
    public var bvVal: Pstr = null,
)

public data class LdapReferralCallback(
    public var sizeOfCallbacks: UInt = 0u,
    public var queryForConnection: Queryforconnection = null,
    public var notifyRoutine: Notifyofnewconnection = null,
    public var dereferenceRoutine: Dereferenceconnection = null,
)

public data class LdapTimeval(
    public var tvSec: Int = 0,
    public var tvUsec: Int = 0,
)

public data class LdapVersionInfo(
    public var lvSize: UInt = 0u,
    public var lvMajor: UInt = 0u,
    public var lvMinor: UInt = 0u,
)
