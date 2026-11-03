@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class BerElement(public var opaque: PSTR = 0L)

public data class LDAP(
    public var ld_sb: LDAP_0 = LDAP_0(),
    public var ld_host: PSTR = 0L,
    public var ld_version: UInt = 0u,
    public var ld_lberoptions: UByte = 0u,
    public var ld_deref: UInt = 0u,
    public var ld_timelimit: UInt = 0u,
    public var ld_sizelimit: UInt = 0u,
    public var ld_errno: UInt = 0u,
    public var ld_matched: PSTR = 0L,
    public var ld_error: PSTR = 0L,
    public var ld_msgid: UInt = 0u,
    public var Reserved3: UByteArray = UByteArray(25),
    public var ld_cldaptries: UInt = 0u,
    public var ld_cldaptimeout: UInt = 0u,
    public var ld_refhoplimit: UInt = 0u,
    public var ld_options: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LDAP) return false
        if (this.ld_sb != other.ld_sb) return false
        if (this.ld_host != other.ld_host) return false
        if (this.ld_version != other.ld_version) return false
        if (this.ld_lberoptions != other.ld_lberoptions) return false
        if (this.ld_deref != other.ld_deref) return false
        if (this.ld_timelimit != other.ld_timelimit) return false
        if (this.ld_sizelimit != other.ld_sizelimit) return false
        if (this.ld_errno != other.ld_errno) return false
        if (this.ld_matched != other.ld_matched) return false
        if (this.ld_error != other.ld_error) return false
        if (this.ld_msgid != other.ld_msgid) return false
        if (!this.Reserved3.contentEquals(other.Reserved3)) return false
        if (this.ld_cldaptries != other.ld_cldaptries) return false
        if (this.ld_cldaptimeout != other.ld_cldaptimeout) return false
        if (this.ld_refhoplimit != other.ld_refhoplimit) return false
        if (this.ld_options != other.ld_options) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ld_sb.hashCode()
        result = 31 * result + this.ld_host.hashCode()
        result = 31 * result + this.ld_version.hashCode()
        result = 31 * result + this.ld_lberoptions.hashCode()
        result = 31 * result + this.ld_deref.hashCode()
        result = 31 * result + this.ld_timelimit.hashCode()
        result = 31 * result + this.ld_sizelimit.hashCode()
        result = 31 * result + this.ld_errno.hashCode()
        result = 31 * result + this.ld_matched.hashCode()
        result = 31 * result + this.ld_error.hashCode()
        result = 31 * result + this.ld_msgid.hashCode()
        result = 31 * result + this.Reserved3.contentHashCode()
        result = 31 * result + this.ld_cldaptries.hashCode()
        result = 31 * result + this.ld_cldaptimeout.hashCode()
        result = 31 * result + this.ld_refhoplimit.hashCode()
        result = 31 * result + this.ld_options.hashCode()
        return result
    }
}

public data class LDAP_0(
    public var sb_sd: ULong = 0uL,
    public var Reserved1: UByteArray = UByteArray(41),
    public var sb_naddr: ULong = 0uL,
    public var Reserved2: UByteArray = UByteArray(24),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LDAP_0) return false
        if (this.sb_sd != other.sb_sd) return false
        if (!this.Reserved1.contentEquals(other.Reserved1)) return false
        if (this.sb_naddr != other.sb_naddr) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sb_sd.hashCode()
        result = 31 * result + this.Reserved1.contentHashCode()
        result = 31 * result + this.sb_naddr.hashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        return result
    }
}

public data class LDAPAPIFeatureInfoA(
    public var ldapaif_info_version: Int = 0,
    public var ldapaif_name: PSTR = 0L,
    public var ldapaif_version: Int = 0,
)

public data class LDAPAPIFeatureInfoW(
    public var ldapaif_info_version: Int = 0,
    public var ldapaif_name: PWSTR = 0L,
    public var ldapaif_version: Int = 0,
)

public data class LDAPAPIInfoA(
    public var ldapai_info_version: Int = 0,
    public var ldapai_api_version: Int = 0,
    public var ldapai_protocol_version: Int = 0,
    public var ldapai_extensions: Long = 0L,
    public var ldapai_vendor_name: PSTR = 0L,
    public var ldapai_vendor_version: Int = 0,
)

public data class LDAPAPIInfoW(
    public var ldapai_info_version: Int = 0,
    public var ldapai_api_version: Int = 0,
    public var ldapai_protocol_version: Int = 0,
    public var ldapai_extensions: Long = 0L,
    public var ldapai_vendor_name: PWSTR = 0L,
    public var ldapai_vendor_version: Int = 0,
)

public data class LDAPControlA(
    public var ldctl_oid: PSTR = 0L,
    public var ldctl_value: LDAP_BERVAL = LDAP_BERVAL(),
    public var ldctl_iscritical: Boolean = false,
)

public data class LDAPControlW(
    public var ldctl_oid: PWSTR = 0L,
    public var ldctl_value: LDAP_BERVAL = LDAP_BERVAL(),
    public var ldctl_iscritical: Boolean = false,
)

public data class LDAPMessage(
    public var lm_msgid: UInt = 0u,
    public var lm_msgtype: UInt = 0u,
    public var lm_ber: Long = 0L,
    public var lm_chain: Long = 0L,
    public var lm_next: Long = 0L,
    public var lm_time: UInt = 0u,
    public var Connection: Long = 0L,
    public var Request: Long = 0L,
    public var lm_returncode: UInt = 0u,
    public var lm_referral: UShort = 0u,
    public var lm_chased: Boolean = false,
    public var lm_eom: Boolean = false,
    public var ConnectionReferenced: Boolean = false,
)

public data class LDAPModA(
    public var mod_op: UInt = 0u,
    public var mod_type: PSTR = 0L,
    public var mod_vals: LDAPModA_0 = LDAPModA_0(),
)

public data class LDAPModA_0(public var modv_strvals: Long = 0L, public var modv_bvals: Long = 0L)

public data class LDAPModW(
    public var mod_op: UInt = 0u,
    public var mod_type: PWSTR = 0L,
    public var mod_vals: LDAPModW_0 = LDAPModW_0(),
)

public data class LDAPModW_0(public var modv_strvals: Long = 0L, public var modv_bvals: Long = 0L)

public data class LDAPSortKeyA(
    public var sk_attrtype: PSTR = 0L,
    public var sk_matchruleoid: PSTR = 0L,
    public var sk_reverseorder: Boolean = false,
)

public data class LDAPSortKeyW(
    public var sk_attrtype: PWSTR = 0L,
    public var sk_matchruleoid: PWSTR = 0L,
    public var sk_reverseorder: Boolean = false,
)

public data class LDAPVLVInfo(
    public var ldvlv_version: Int = 0,
    public var ldvlv_before_count: UInt = 0u,
    public var ldvlv_after_count: UInt = 0u,
    public var ldvlv_offset: UInt = 0u,
    public var ldvlv_count: UInt = 0u,
    public var ldvlv_attrvalue: Long = 0L,
    public var ldvlv_context: Long = 0L,
    public var ldvlv_extradata: Long = 0L,
)

public data class LDAP_BERVAL(public var bv_len: UInt = 0u, public var bv_val: PSTR = 0L)

public data class LDAP_REFERRAL_CALLBACK(
    public var SizeOfCallbacks: UInt = 0u,
    public var QueryForConnection: QUERYFORCONNECTION = null,
    public var NotifyRoutine: NOTIFYOFNEWCONNECTION = null,
    public var DereferenceRoutine: DEREFERENCECONNECTION = null,
)

public data class LDAP_TIMEVAL(public var tv_sec: Int = 0, public var tv_usec: Int = 0)

public data class LDAP_VERSION_INFO(
    public var lv_size: UInt = 0u,
    public var lv_major: UInt = 0u,
    public var lv_minor: UInt = 0u,
)
